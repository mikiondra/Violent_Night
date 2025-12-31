public class Help implements Command{


    @Override
    public String execute() {
        return "walk,end,help,tip,pick,drop,use,talk,explore";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
