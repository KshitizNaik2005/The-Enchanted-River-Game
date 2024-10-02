import java.util.Scanner;

public class TheEnchantedRiver {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println("Welcome to 'The Enchanted River' Adventure Game!");
        System.out.println("In a small village by the foothills of the Western Ghats, there lies an ancient river, the Saraswati, which is believed to be enchanted. The river is said to grant visions of the future to those who approach it with a pure heart. One evening, you notice an unusual glow coming from the riverbank. Something calls you towards the water.");
        firstChoice();
    }

    private static void firstChoice() {
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Approach the River Alone");
        System.out.println("2. Gather Your Friends and Investigate");
        System.out.println("3. Ignore the Glow and Visit the Village Temple");

        int choice = getUserChoice(3);

        switch (choice) {
            case 1:
                approachRiver();
                break;
            case 2:
                gatherFriends();
                break;
            case 3:
                visitTemple();
                break;
        }
    }

    private static void approachRiver() {
        System.out.println("\nYou approach the glowing river alone.");
        System.out.println("You decide to approach the glowing river alone. The air around you seems to hum with energy, and the surface of the river ripples as if inviting you to interact with it. You see a figure emerge from the water—a water nymph, the guardian of the river. She tells you that the river has secrets that could change your fate. Do you:\n" + //
                        "\n" + //
                        "");
        System.out.println("What do you want to do?");
        System.out.println("1. Accept the Vision of Your Future");
        System.out.println("2. Refuse the Vision and Ask for a Blessing");
        System.out.println("3. Remain Silent and Observe");

        int choice = getUserChoice(3);

        switch (choice) {
            case 1:
                acceptVision();
                break;
            case 2:
                askForBlessing();
                break;
            case 3:
                observeNymph();
                break;
        }
    }

    private static void gatherFriends() {
        System.out.println("\nYYou decide it’s best not to go alone, so you gather your friends from the village to investigate the glowing river. Together, you approach the riverbank, feeling a sense of unity and courage. As you arrive, the river seems to part, revealing a hidden path leading deep into the forest..");
        System.out.println("An elderly sage appears. What do you want to do?");
        System.out.println("1. Ask the Sage About the Garden");
        System.out.println("2. Ask for a Way Back to the Village");
        System.out.println("3. Explore the Garden Without Asking");

        int choice = getUserChoice(3);

        switch (choice) {
            case 1:
                askSageAboutGarden();
                break;
            case 2:
                askForWayBack();
                break;
            case 3:
                exploreGarden();
                break;
        }
    }

    private static void visitTemple() {
        System.out.println("\nYou decide to ignore the glow and instead head to the village temple to seek divine guidance. You tell the temple priest about the strange glow, and he listens carefully. He suggests performing a ritual to communicate with the river spirit");
        System.out.println("You perform a ritual with the priest, and the river spirit appears.");
        System.out.println("What do you want to do?");
        System.out.println("1. Ask How to Protect the Village");
        System.out.println("2. Offer to Serve the Spirit");
        System.out.println("3. Refuse to Interfere");

        int choice = getUserChoice(3);

        switch (choice) {
            case 1:
                askHowToProtect();
                break;
            case 2:
                offerToServe();
                break;
            case 3:
                refuseToInterfere();
                break;
        }
    }

    private static void acceptVision() {
        System.out.println("\nThe nymph shows you a vision of your future where you are a respected leader in your village, but it comes with a warning—your success will come only if you can overcome a difficult challenge that lies ahead.");
        System.out.println("Do you accept the challenge to find an ancient artifact?");
        System.out.println("1. Yes, I accept the challenge.");
        System.out.println("2. No, I am not ready.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            System.out.println(" You are given a mysterious map to follow. You embark on a journey to find an ancient artifact that will protect your village. Along the way, you face tests of bravery and wisdom. You must pass through a cave filled with illusions, cross a raging river using only the power of your mind, and speak with a tiger spirit who guards the artifact. Once you prove your worth, the artifact is yours, and you return home to the admiration of your people.");
        } else {
            System.out.println("You decline the challenge, feeling unprepared. The nymph nods in understanding and tells you that your path will still lead you to greatness, but it will take longer, and you must learn patience and resilience. Days later, the village faces a crisis, and although it takes time, you rise to the occasion, proving your strength and winning the trust of the villagers through acts of selfless service.");
        }
        endGame();
    }

    private static void askForBlessing() {
        System.out.println("\nYou ask the nymph for a blessing for your village.");
        System.out.println("You tell the nymph that you do not wish to see your future, but instead ask for a blessing for the village. The nymph agrees and grants a blessing of prosperity, ensuring a good harvest and peace for the coming year. The villagers are grateful, and you are praised for your wisdom. Later, you learn that the prosperity came at a cost—you have been chosen as the village’s next spiritual leader, and must now live up to that responsibility.");
        endGame();
    }

    private static void observeNymph() {
        System.out.println("\nInstead of speaking, you choose to silently observe the nymph. She senses your curiosity and begins to sing a haunting melody. The melody enchants you, and you find yourself transported into an underwater world where the river spirits dwell. You are given a choice:");
        System.out.println("Do you wish to learn their secrets or return to your world?");
        System.out.println("1. Stay and learn their secrets.");
        System.out.println("2. Return immediately.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            System.out.println("The spirits teach you ancient knowledge—how to heal with water, how to understand the river’s flow, and how to listen to nature’s whispers. You stay for what feels like years, but when you return to the surface, only a day has passed. You now carry the wisdom of the water spirits and use it to help your village.");
        } else {
            System.out.println("You choose to return to your world, but the memory of the spirits’ realm stays with you. You feel an urge to protect the river at all costs, and you soon discover that a factory upstream is polluting it. You gather the villagers to protest and succeed in preserving the purity of the Saraswati.");
        }
        endGame();
    }

    private static void askSageAboutGarden() {
        System.out.println("\nYou ask the sage about the garden, and he tells you that it is a sacred place where only the pure of heart may enter. He offers to teach you and your friends the secrets of the healing herbs");
        System.out.println("You all decide to stay and learn, eventually becoming healers for your village. Later, you must decide whether to share the secret knowledge with other villages or keep it within your own.");
        endGame();
    }

    private static void askForWayBack() {
        System.out.println("\nYou feel uncertain and ask the sage how to return to the village. The sage hands you a small vial of glowing water and tells you that it will guide you back safely. ");
        System.out.println(" You return to the village with the vial, which later becomes a powerful remedy, saving many lives during a sickness. However, you also feel a duty to guard the vial against those who might misuse it.");
        endGame();
    }

    private static void exploreGarden() {
        System.out.println("\nInstead of speaking to the sage, you and your friends decide to explore the garden on your own. As you touch the flowers, you feel a rush of energy. However, the sage warns you that the power you have taken is both a gift and a burden.");
        System.out.println(" You gain abilities, but you must now use them only for good, lest the power consume you.");
        endGame();
    }

    private static void askHowToProtect() {
        System.out.println("\nYou ask the spirit how to protect the village, and she gives you a sacred conch shell. She tells you that blowing the conch at dawn will ward off the danger.");
        System.out.println("You follow her instructions, and the village is saved from a terrible storm. You are hailed as a hero, but the conch has otherworldly power, and you must now decide how to guard it.");
        endGame();
    }

    private static void offerToServe() {
        System.out.println("\nYou offer your service to the spirit, and she accepts. She tasks you with watching over the river and keeping it clean.");
        System.out.println(" In return, she blesses you with the ability to communicate with animals, who now help you in your daily life. However, when you learn of an impending drought, you must decide whether to use the animals to help the village or let nature take its course.");
        endGame();
    }

    private static void refuseToInterfere() {
        System.out.println("\nYou tell the spirit that you do not wish to interfere with her work, believing that the divine knows best. The spirit respects your decision but warns that you must always respect the river. The following year, the river floods, and you help the villagers build barriers to protect their homes, learning the importance of respecting nature. Later, the villagers face another crisis, and you must decide whether to intervene this time or trust the spirit again.");
        endGame();
    }

    private static int getUserChoice(int numChoices) {
        int choice = -1;
        while (choice < 1 || choice > numChoices) {
            System.out.print("Enter your choice (1-" + numChoices + "): ");
            choice = scanner.nextInt();
        }
        return choice;
    }

    private static void endGame() {
        System.out.println("\nThank you for playing!");
        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("yes")) {
            startGame();
        } else {
            System.out.println("Goodbye!");
            scanner.close();
            System.exit(0);
        }
    }
}

