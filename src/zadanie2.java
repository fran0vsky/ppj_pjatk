
public class zadanie2 {
    public static void main(String[] args) {
        String obi = "Hello there";
        String grievous = "";
        switch (obi) {
            case "Hello there":
                grievous += "General";
            case "obi":
                grievous += " Kenobi";
            case "Wan":
                grievous += " You";
            case "General":
                grievous += " are";
            case "Sith":
                grievous += " a";
            case "meme":
                grievous += " bold";
            default :
                grievous += " one";
        }
        System.out.println(grievous);

    }

}
