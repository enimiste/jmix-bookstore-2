package io.jmix.bookstore.multitenancy.test_environment;

import io.jmix.bookstore.entity.User;
import io.jmix.bookstore.multitenancy.TestEnvironmentTenant;
import io.jmix.bookstore.security.FullAccessRole;
import io.jmix.bookstore.test_data.TestDataCreation;
import io.jmix.bookstore.test_data.data_provider.RandomValues;
import io.jmix.core.DataManager;
import io.jmix.core.TimeSource;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.security.role.assignment.RoleAssignmentRoleType;
import io.jmix.securitydata.entity.RoleAssignmentEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("bookstore_TenantCreation")
public class TenantCreation {

    protected final PasswordEncoder passwordEncoder;
    private final DataManager dataManager;
    private final SystemAuthenticator systemAuthenticator;
    private final TestDataCreation testDataCreation;
    private final TimeSource timeSource;

    public TenantCreation(DataManager dataManager, PasswordEncoder passwordEncoder, SystemAuthenticator systemAuthenticator, TestDataCreation testDataCreation, TimeSource timeSource) {
        this.dataManager = dataManager;
        this.passwordEncoder = passwordEncoder;
        this.systemAuthenticator = systemAuthenticator;
        this.testDataCreation = testDataCreation;
        this.timeSource = timeSource;
    }

    public void createTenant(String tenantId, String adminUsername) {

        TestEnvironmentTenant tenant = dataManager.create(TestEnvironmentTenant.class);
        tenant.setTenantId(tenantId);
        tenant.setName(tenantId);

        tenant.setLastLogin(timeSource.now().toOffsetDateTime());
        tenant.setTestdataInitialised(false);

        User tenantAdmin = dataManager.create(User.class);

        tenantAdmin.setUsername(adminUsername);
        tenantAdmin.setPassword(passwordEncoder.encode("admin"));
        tenantAdmin.setFirstName("Mike");
        tenantAdmin.setLastName("Holloway");
        tenantAdmin.setTenant(tenantId);

        RoleAssignmentEntity tenantAdminRole = toRoleAssignment(tenantAdmin, FullAccessRole.CODE, RoleAssignmentRoleType.RESOURCE);

        dataManager.save(tenant, tenantAdmin, tenantAdminRole);

        systemAuthenticator.runWithUser(tenantAdmin.getUsername(), () -> testDataCreation.initialiseTenantWithData(tenantId));
    }


    private RoleAssignmentEntity toRoleAssignment(User user, String roleCode, String roleType) {
        RoleAssignmentEntity userRole = dataManager.create(RoleAssignmentEntity.class);
        userRole.setUsername(user.getUsername());
        userRole.setRoleType(roleType);
        userRole.setRoleCode(roleCode);
        return userRole;
    }

    public String generateRandomTenantId() {
        List<String> verbs = List.of(
                "adorable",
                "adventurous",
                "aggressive",
                "agreeable",
                "alert",
                "alive",
                "amused",
                "angry",
                "annoyed",
                "annoying",
                "anxious",
                "arrogant",
                "ashamed",
                "attractive",
                "average",
                "awful",
                "bad",
                "beautiful",
                "better",
                "bewildered",
                "black",
                "bloody",
                "blue",
                "blue-eyed",
                "blushing",
                "bored",
                "brainy",
                "brave",
                "breakable",
                "bright",
                "busy",
                "calm",
                "careful",
                "cautious",
                "charming",
                "cheerful",
                "clean",
                "clear",
                "clever",
                "cloudy",
                "clumsy",
                "colorful",
                "combative",
                "comfortable",
                "concerned",
                "condemned",
                "confused",
                "cooperative",
                "courageous",
                "crazy",
                "creepy",
                "crowded",
                "cruel",
                "curious",
                "cute",
                "dangerous",
                "dark",
                "dead",
                "defeated",
                "defiant",
                "delightful",
                "depressed",
                "determined",
                "different",
                "difficult",
                "disgusted",
                "distinct",
                "disturbed",
                "dizzy",
                "doubtful",
                "drab",
                "dull",
                "eager",
                "easy",
                "elated",
                "elegant",
                "embarrassed",
                "enchanting",
                "encouraging",
                "energetic",
                "enthusiastic",
                "envious",
                "evil",
                "excited",
                "expensive",
                "exuberant",
                "fair",
                "faithful",
                "famous",
                "fancy",
                "fantastic",
                "fierce",
                "filthy",
                "fine",
                "foolish",
                "fragile",
                "frail",
                "frantic",
                "friendly",
                "frightened",
                "funny",
                "gentle",
                "gifted",
                "glamorous",
                "gleaming",
                "glorious",
                "good",
                "gorgeous",
                "graceful",
                "grieving",
                "grotesque",
                "grumpy",
                "handsome",
                "happy",
                "healthy",
                "helpful",
                "helpless",
                "hilarious",
                "homeless",
                "homely",
                "horrible",
                "hungry",
                "hurt",
                "ill",
                "important",
                "impossible",
                "inexpensive",
                "innocent",
                "inquisitive",
                "itchy",
                "jealous",
                "jittery",
                "jolly",
                "joyous",
                "kind",
                "lazy",
                "light",
                "lively",
                "lonely",
                "long",
                "lovely",
                "lucky",
                "magnificent",
                "misty",
                "modern",
                "motionless",
                "muddy",
                "mushy",
                "mysterious",
                "nasty",
                "naughty",
                "nervous",
                "nice",
                "nutty",
                "obedient",
                "obnoxious",
                "odd",
                "old-fashioned",
                "open",
                "outrageous",
                "outstanding",
                "panicky",
                "perfect",
                "plain",
                "pleasant",
                "poised",
                "poor",
                "powerful",
                "precious",
                "prickly",
                "proud",
                "putrid",
                "puzzled",
                "quaint",
                "real",
                "relieved",
                "repulsive",
                "rich",
                "scary",
                "selfish",
                "shiny",
                "shy",
                "silly",
                "sleepy",
                "smiling",
                "smoggy",
                "sore",
                "sparkling",
                "splendid",
                "spotless",
                "stormy",
                "strange",
                "stupid",
                "successful",
                "super",
                "talented",
                "tame",
                "tasty",
                "tender",
                "tense",
                "terrible",
                "thankful",
                "thoughtful",
                "thoughtless",
                "tired",
                "tough",
                "troubled",
                "ugliest",
                "ugly",
                "uninterested",
                "unsightly",
                "unusual",
                "upset",
                "uptight",
                "vast",
                "victorious",
                "vivacious",
                "wandering",
                "weary",
                "wicked",
                "wide-eyed",
                "wild",
                "witty",
                "worried",
                "worrisome",
                "wrong",
                "zany",
                "zealous"
        );

        List<String> animals = List.of(
                "dog",
                "puppy",
                "turtle",
                "rabbit",
                "parrot",
                "cat",
                "kitten",
                "goldfish",
                "mouse",
                "tropical-fish",
                "hamster",
                "cow",
                "rabbit",
                "ducks",
                "shrimp",
                "pig",
                "goat",
                "crab",
                "deer",
                "bee",
                "sheep",
                "fish",
                "turkey",
                "dove",
                "chicken",
                "horse",
                "crow",
                "peacock",
                "dove",
                "sparrow",
                "goose",
                "stork",
                "pigeon",
                "turkey",
                "hawk",
                "bald-eagle",
                "raven",
                "parrot",
                "flamingo",
                "seagull",
                "ostrich",
                "swallow",
                "black-bird",
                "penguin",
                "robin",
                "swan",
                "owl",
                "woodpecker",
                "squirrel",
                "dog",
                "chimpanzee",
                "ox",
                "lion",
                "panda",
                "walrus",
                "otter",
                "mouse",
                "kangaroo",
                "goat",
                "horse",
                "monkey",
                "cow",
                "koala",
                "mole",
                "elephant",
                "leopard",
                "hippopotamus",
                "giraffe",
                "fox",
                "coyote",
                "hedgehong",
                "sheep",
                "deer",
                "giraffe",
                "woodpecker",
                "camel",
                "starfish",
                "koala",
                "alligator",
                "owl",
                "tiger",
                "bear",
                "blue-whale",
                "coyote",
                "chimpanzee",
                "raccoon",
                "lion",
                "arctic-wolf",
                "crocodile",
                "dolphin",
                "elephant",
                "squirrel",
                "snake",
                "kangaroo",
                "hippopotamus",
                "elk",
                "fox",
                "gorilla",
                "bat",
                "hare",
                "toad",
                "frog",
                "deer",
                "rat",
                "badger",
                "lizard",
                "mole",
                "hedgehog",
                "otter",
                "reindeer",
                "crab",
                "fish",
                "seal",
                "octopus",
                "shark",
                "seahorse",
                "walrus",
                "starfish",
                "whale",
                "penguin",
                "jellyfish",
                "squid",
                "lobster",
                "pelican",
                "clams",
                "seagull",
                "dolphin",
                "shells",
                "sea-urchin",
                "cormorant",
                "otter",
                "pelican",
                "sea-anemone",
                "sea-turtle",
                "sea-lion",
                "coral",
                "moth",
                "bee",
                "butterfly",
                "spider",
                "ant",
                "dragonfly",
                "fly",
                "mosquito",
                "grasshopper",
                "beetle",
                "cockroach",
                "centipede",
                "worm",
                "louse"
        );
        return "%s-%s".formatted(
                RandomValues.randomOfList(verbs),
                RandomValues.randomOfList(animals)
        );
    }

}