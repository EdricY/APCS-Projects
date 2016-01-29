
/**
 * Write a description of class HailstoneSequence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HailstoneSequence
{
    int max, length;
    public HailstoneSequence()
    {
        int max = 0;
        int length = 0;
    }
    
    public int hailstone(int n)
    {
        length++;
        System.out.print(n + " ");
        if (n == 1)
        {
            System.out.println();
            System.out.println("max: " + max);
            System.out.println("length: " + length);
            return n;
        }
        if (n%2 == 0)
        {
            return hailstone(n/2);
        }
        else
        {
            if (3*n+1 > max)
                max = 3*n+1;
            return hailstone(3*n+1);
        }
    }
    public void calculate1000()
    {
        int[] top5max = new int[5];
        int[] top5maxSeeds = new int[5];
        int[] top5length = new int[5];
        int[] top5lengthSeeds = new int[5];
        for(int n = 1; n <= 1000; n++)
        {
            max = 0;
            length = 0;
            hailstone(n);
            find5max(top5max, max, top5maxSeeds, n);
            find5max(top5length, length, top5lengthSeeds, n);
        }
        System.out.println();
        System.out.println();
        System.out.print("top 5 maxes: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(top5max[i] + " at seed " + top5maxSeeds[i] + ". ");
        }
        System.out.println();
        System.out.print("top 5 lengths: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(top5length[i] + " at seed " + top5lengthSeeds[i] + ". ");
        }
    }
    public void find5max(int[] a, int m, int[] b, int n)
    {
      for(int i = 0; i < 5; i++)
      {
          if (m > a[i])
          {
              for (int j = 4; j > i; j--)
              {
                a[j] = a[j-1];
                b[j] = b[j-1];
              }
              a[i] = m;
              b[i] = n;
              break;
          }
      }
    }
}
