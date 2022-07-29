package com.bridgelabz;

public interface Tic_Tac_Toe_Interface
{
    public char[] createBoard();
    public void makeChoice();
    public boolean validateMove(int location);
    public void makeUserMove();
    public void makeComputerMove();
    public boolean allEqual(int a, int b, int c);
    public int computerWinMove();
    public boolean checkToBlock(char a, char b);
    public int getCorner();
    public int getCenter();
    public void checkGameStatus(String key);




}
