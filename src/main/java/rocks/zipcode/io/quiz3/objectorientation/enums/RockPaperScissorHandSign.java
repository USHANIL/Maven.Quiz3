package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    PAPER,
    ROCK,
    SCISSOR;


    public RockPaperScissorHandSign getWinner() {
       if (this.equals(RockPaperScissorHandSign.valueOf("ROCK")))
            return RockPaperScissorHandSign.valueOf("PAPER");
        else if (this.equals(RockPaperScissorHandSign.valueOf("PAPER")))
            return RockPaperScissorHandSign.valueOf("SCISSOR");
        else //if scissor */
            return RockPaperScissorHandSign.valueOf("ROCK");
    }

    public RockPaperScissorHandSign getLoser() {

        if (this.equals(RockPaperScissorHandSign.valueOf("ROCK")))
            return RockPaperScissorHandSign.valueOf("SCISSOR");
        else if (this.equals(RockPaperScissorHandSign.valueOf("PAPER")))
            return RockPaperScissorHandSign.valueOf("ROCK");
        else //if scissor   */
            return RockPaperScissorHandSign.valueOf("PAPER");
    }


}
