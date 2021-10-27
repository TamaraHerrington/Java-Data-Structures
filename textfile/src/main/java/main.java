public class main {
    //imported from AMIGOSCODE github
    public class FlightFileDataAccessService implements FlightDAO {
        @Override
        public int saveFlight(Flight flight) {
            try {
                File file = new File("src/flights.txt");

                if (!file.exists()) {


                    System.out.println(file.createNewFile());


                } else {
                    System.out.println("File already exists");
                }

                FileWriter fileWriter = new FileWriter(file, true);

                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(flight.getFlightNumber());

                printWriter.flush();
                printWriter.close();
                return 1;

            } catch (IOException e) {
                return 0;
            }

        }
}

