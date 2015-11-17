/**
 * Checks if the language accepted by a given automaton is non-empty on Rincewind Level.
 *
 * @author Robin Machiels
 * @author Reinaert Van de Cruys
 */
public class Level1 extends Level {
    /**
     * Entry point of the program.
     *
     * @param args the arguments, of which the first one must be the filename of the '.aut' file representing the
     *             automaton to check, any other arguments are ignored
     */
    public static void main(String[] args) {
        new Level1().run(args);
    }

    @Override
    protected final Automaton applyConstraints(Automaton aut) {
        return aut
                .intersection(constraintFindAtLeastTwoTreasures())
                .intersection(constraintFindKeyBeforePassingThroughGates())
                .intersection(constraintJumpInRiverWhenPassingDragonWithoutSword());
    }
}
