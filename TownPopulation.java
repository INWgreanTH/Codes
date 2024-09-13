public class TownPopulation implements TownCal {

    @Override
    public double getArea(int Population) {
        int male = (10000);
        int female = (12000);
        int child = (5000);
        int a = (male + female + child);
        System.out.print(a);
        return Population;
    }


    @Override
    public double getArea(double TownArea) {
        int south_to_north = (300); // mile
        int west_to_east = (250);//mile
        int b = (south_to_north * west_to_east);
        System.out.println(b);
        return TownArea;
    }


    @Override
    public void setname(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setname'");
    }

}
