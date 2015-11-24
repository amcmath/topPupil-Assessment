public class Pupil
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String surname;
    private int mark;

    /**
     * Constructor for objects of class Pupil
     */
    public Pupil()
    {
        // initialise instance variables
        firstName = "";
        surname = "";
        mark = 0;
    }

    public void readPupilDetails(String dataItems)
    {

        String[] rowItems = dataItems.split(",");

        firstName = rowItems[0];
        surname = rowItems[1];
        mark = Integer.parseInt(rowItems[2]);
    }
    
    public String writeDetails()
    {
        String pupilData = "";
        pupilData = pupilData.concat(firstName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(surname);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(Integer.toString(mark));
        return pupilData;
    }
}