package app;

import static spark.Spark.*;

public class Main{
    public static void main(String[] args) {
        get("/:rank", (req, res) -> {
            String ret = "";
            int rank = Integer.parseInt(req.params(":rank"));
            int medal = rank/10;
            int stars = rank % 10;
            switch(medal) {
                case 1 : ret = "Herald";
                break;
                case 2 : ret = "Guardian";
                break;
                case 3 : ret = "Crusader";
                break;
                case 4 : ret = "Archon";
                break;
                case 5 : ret = "Legend";
                break;
                case 6 : ret = "Ancient";
                break;
                case 7 : ret = "Divine";
                break;
                default : ret = "Uncalibrated";
            }
            if (ret.equals("Uncalibrated")) {
                return ret;
            }else {
                return ret + " " + stars; 
            }
        });
    }
}