public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;
    private int seats;
    private double desireability;

    public CombinedTable(SingleTable t1, SingleTable t2){
        table1 = t1;
        table2 = t2;
        canSeat(0);
        getDesirability();
    }

    public boolean canSeat(int num){
        seats = (table1.getNumSeats() + table2.getNumSeats()) - 2;
        if (num > seats){
            return false;
        }else {
            return true;
        }
    }

    public double getDesirability(){
        if (table1.getHeight() == table2.getHeight()){
            desireability = (table1.getViewQuality() + table2.getViewQuality()) / 2;
        }else {
            desireability = ((table1.getViewQuality() + table2.getViewQuality()) / 2) - 10;
        }
        return desireability;
    }
}
