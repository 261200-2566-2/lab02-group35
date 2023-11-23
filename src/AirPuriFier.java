//  ข้อ1
// what should be instance variables?
// 1.name 2.power 3.fanspeed 4.SerialNumber
// what should be instance methods?
//  1.setname and Serialnumber 2. set mode 3.turn on 4.turn-off
// what should be class variables?
// 1.total 
// what should be class methods?
// 1.mostpopularmodel 
// ข้อ2
// input = turn on-off setfanspeed
// output = show that turn on turn off fanspeed,show total airpurifier


public class AirPuriFier {
    boolean Power;
    String name;
    String SerialNumber ;
    int FanSpeed ;

    static int total = 0;
    static AirPuriFier mostPopularModel;
    public AirPuriFier() {
        name = "SCK" ;
        Power = false;
        SerialNumber = "9164";
        FanSpeed = 0;
        total++;
    }

    public void Turnon(){
        Power = true ;
        FanSpeed = 1;
        System.out.println("air is on");
    }
    public void Turnoff(){
        Power = false ;
        FanSpeed = 0;
        System.out.println("air is off");
    }
    void setfanspeed(int speed){
        if(Power && speed >= 0 && speed <=3){
            FanSpeed = speed;
            System.out.println("fan speed set to "+speed);
        }else if(speed > 3){
            System.out.println("Too fast Dont't Do that");
        }else{
            System.out.println("invalid assign for fan speed");
        }
    }
    static AirPuriFier getMostPopularModel() {
        return mostPopularModel;
    }


    AirPuriFier(String name,String SerialNumber){
        this.name = name ;
        this.SerialNumber = SerialNumber ;
        Power = false;
        FanSpeed = 0;
        total++;
    }



    public static void main(String[] args) {
        AirPuriFier air1 = new AirPuriFier() ;
        AirPuriFier air2 = new AirPuriFier() ;
        air1.Turnon();
        air1.setfanspeed(5);
        air2.Turnoff();
        System.out.println("total airpurifier = "+total);

    }

}