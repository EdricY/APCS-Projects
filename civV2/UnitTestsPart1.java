
/**
 * Unit tests for the Civilization V project
 * 
 * @author Derek Miller 
 * @version 11/30/2014
 */
public class UnitTestsPart1
{
    // All tests assume Tile constructor takes food, production, gold in that order
    public static boolean phillyTest()
    {
        int pop = 12;
        Tile city = new Tile(true, 2, 2, 0);
        Tile[][] hexes =    {{new Tile(true,2,0,0), new Tile(false,0,2,0), new Tile(false,5,0,0), new Tile(false,0,4,0),null,null},
                            {new Tile(false,2,0,0),new Tile(true,4,1,0),new Tile(true,1,3,2),new Tile(true,4,0,2),new Tile(false,3,2,0),null},
                            {new Tile(true,5,0,0),new Tile(true,4,0,0),new Tile(true,4,0,0),new Tile(true,0,4,2),new Tile(true,4,0,2),new Tile(false,1,1,0)},
                            {new Tile(false,1,1,0),new Tile(true,0,4,0),new Tile(true,4,0,0),new Tile(true,4,0,2),new Tile(true,4,1,2),new Tile(true,3,0,5)}, /** Center row with city removed **/
                            {new Tile(false,2,0,0),new Tile(true,3,2,0),new Tile(true,4,1,0),new Tile(true,1,3,0),new Tile(true,4,0,2),new Tile(true,0,3,2)},
                            {new Tile(false,2,0,0),new Tile(true,4,0,0),new Tile(true,1,1,0),new Tile(true,4,0,0),new Tile(true,1,1,0),null},
                            {new Tile(false,2,0,0),new Tile(false,2,0,0),new Tile(true,2,0,0),new Tile(true,0,5,0),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,false,false,false},
                                    {true,false,false,true,false,false},
                                    {false,true,false,false,true,true}, /** Center row with city removed **/
                                    {false,true,true,true,false,true},
                                    {false,false,false,false,false,false},
                                    {false,false,false,true,false,false}};

        Settlement philly = new Settlement(pop,city,hexes,workedTiles);
        return philly.getFood() == 27 && philly.getProduction() == 29 && philly.getGold() == 13;
    }
    
 
    public static boolean berlinTest()
    {
        int pop = 14;
        Tile city = new Tile(true, 5, 4, 5);
        Tile[][] hexes = {{new Tile(true, 1, 0, 1), new Tile(true, 1, 3, 0), new Tile(true, 4, 0, 0), new Tile(false, 0, 4, 0), null, null},
                            {new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 0),new Tile(true, 4, 0, 1),new Tile(true, 3, 0, 4),new Tile(false, 2, 0, 0),null},
                            {new Tile(true, 0, 4, 4),new Tile(true, 3, 2, 1),new Tile(true, 1, 3, 1),new Tile(true, 2, 4, 3),new Tile(true, 4, 0, 1),new Tile(false, 4, 0, 0)},
                            {new Tile(true,1,1,0),new Tile(true,1,3,0),new Tile(true,0,4,0),new Tile(true,1,1,2),new Tile(true,3,1,0),new Tile(true,4,1,0)}, /** Center row with city removed **/
                            {new Tile(true,1,0,1),new Tile(true,4,0,0),new Tile(true,1,0,1),new Tile(true,1,3,0),new Tile(true,0,4,0),new Tile(true,4,0,0)},
                            {new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),new Tile(true,3,1,0),null},
                            {new Tile(true,1,0,1),new Tile(false,1,0,1),new Tile(true,1,0,1),new Tile(true,1,0,1),null,null}};
        boolean[][] workedTiles = {{false,false,false,false,false,false},
                                    {false,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {false,true,true,false,false,true}, /** Center row with city removed **/
                                    {false,true,false,true,true,false},
                                    {false,false,false,false,false,false},
                                    {false,false,false,true,false,false}};
        
        Settlement berlin = new Settlement(pop,city,hexes,workedTiles);
        return berlin.getFood() == 37 && berlin.getProduction() == 32 && berlin.getGold() == 21;
    }
    
    public static boolean delhiTest()
    {
        int pop = 45;
        Tile city = new Tile(true, 5, 4, 5);
        Tile[][] hexes = {{new Tile(true, 2, 0, 2), new Tile(true, 3, 2, 2), new Tile(true, 2, 0, 0), new Tile(true, 4, 0, 0), null, null},
                            {new Tile(true, 2, 0, 2),new Tile(true, 1, 1, 5),new Tile(true, 2, 4, 3),new Tile(true, 2, 3, 5),new Tile(true, 2, 0, 0),null},
                            {new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 2),new Tile(true, 1, 2, 5),new Tile(true, 2, 5, 4),new Tile(true, 4, 1, 2),new Tile(true, 0, 4, 0)},
                            {new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,1,4,2),new Tile(true,2,1,2),new Tile(true,0,2,0)}, /** Center row with city removed **/
                            {new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,2,0,2),new Tile(true,1,3,0),new Tile(true,1,3,0),new Tile(true,4,0,0)},
                            {new Tile(true,1,3,0),new Tile(true,0,5,0),new Tile(true,1,3,0),new Tile(true,2,5,0),new Tile(true,4,0,0),null},
                            {new Tile(true,1,3,0),new Tile(true,1,3,0),new Tile(true,2,0,0),new Tile(true,0,4,0),null,null}};
        boolean[][] workedTiles = {{true,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,true}, /** Center row with city removed **/
                                    {true,true,true,true,true,true},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,false,false}};

        Settlement delhi = new Settlement(pop,city,hexes,workedTiles);
        return delhi.getFood() == 69 && delhi.getProduction() == 65 && delhi.getGold() == 55;
    }
    
    //test based on image found here: http://i.stack.imgur.com/6PNJA.jpg
    public static boolean bielefeldTest()
    {
        int pop = 25;
        Tile city = new Tile(true, 5, 9, 2);
        Tile[][] hexes = {{new Tile(true, 2, 0, 2), new Tile(true, 2, 0, 2), new Tile(true, 2, 0, 2), new Tile(true, 2, 0, 0), null, null},
                            {new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 2),new Tile(true, 2, 0, 0),null},
                            {new Tile(true, 2, 0, 0),new Tile(true, 0, 5, 0),new Tile(true, 2, 0, 2),new Tile(true, 5, 2, 4),new Tile(true, 2, 0, 0),new Tile(true, 2, 0, 0)},
                            {new Tile(true,2,0,0),new Tile(true,0,5,0),new Tile(true,2,0,0),new Tile(true,1,0,4),new Tile(true,2,0,0),new Tile(true,2,0,2)}, /** Center row with city removed **/
                            {new Tile(false,2,0,2),new Tile(true,0,4,0),new Tile(true,2,0,0),new Tile(true,2,0,0),new Tile(true,2,0,0),new Tile(true,0,4,0)},
                            {new Tile(false,1,3,0),new Tile(false,0,5,0),new Tile(false,1,3,0),new Tile(true,0,4,0),new Tile(true,2,0,2),null},
                            {new Tile(false,1,3,0),new Tile(false,1,3,0),new Tile(false,2,0,0),new Tile(false,0,4,0),null,null}};
        boolean[][] workedTiles = {{true,true,true,false,false},
                                    {true,true,true,true,false,false},
                                    {true,true,true,true,true,false},
                                    {true,true,true,true,true,true}, /** Center row with city removed **/
                                    {false,true,true,true,true,true},
                                    {false,false,false,true,true,false},
                                    {false,false,false,false,false,false}};

        Settlement bielefeld = new Settlement(pop,city,hexes,workedTiles);
        return bielefeld.getFood() == 47 && bielefeld.getProduction() == 33 && bielefeld.getGold() == 26;
    }
}
