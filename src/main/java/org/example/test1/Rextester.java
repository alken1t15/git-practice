package org.example.test1;

class Rextester
{
    private static final Rextester inst = new Rextester();
    private static int b = 3;
    private static final int c = 5;

    private static int a = 7;
    private int x;
    public Rextester() {
        x = a + b + c;
    }
    public static void main(String args[])
    {
        System.out.println(Rextester.inst.x);
    }
}