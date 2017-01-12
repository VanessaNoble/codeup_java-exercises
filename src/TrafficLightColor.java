/**
 * Created by vanessamnoble on 1/12/17.
 */


public class TrafficLightColor {


       enum Names{

        Red("stop light") { public String action() {
                return "You should stop";}
            },
        Yellow("Warning Light") { public String action() {
            return "You should stop";}
            },
        Green("Go");

        private String light;

        Names (String light) {
            this.light = light;
            }
        public String getLight() {
            return this.light;
            }
        public String action() {
            return "Happy Driving!";
            }
        }

    public static void main(String[] args) {
        for (Names n : Names.values()){
            System.out.println(n);
            System.out.println("is a:" + n.getLight());
            System.out.println(n.action());
        }
    }
}







