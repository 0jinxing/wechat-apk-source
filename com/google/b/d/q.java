package com.google.b.d;

import com.google.b.d;

public abstract class q extends n
{
  static final int[] bAA;
  static final int[] bAC = { 1, 1, 1 };
  static final int[] bAD = { 1, 1, 1, 1, 1 };
  static final int[][] bAE;
  static final int[][] bAF;

  static
  {
    bAA = new int[] { 1, 1, 1, 1, 1, 1 };
    int[] arrayOfInt1 = { 1, 2, 3, 1 };
    int[] arrayOfInt2 = { 1, 1, 1, 4 };
    bAE = new int[][] { { 3, 2, 1, 1 }, { 2, 2, 2, 1 }, { 2, 1, 2, 2 }, { 1, 4, 1, 1 }, { 1, 1, 3, 2 }, arrayOfInt1, arrayOfInt2, { 1, 3, 1, 2 }, { 1, 2, 1, 3 }, { 3, 1, 1, 2 } };
    bAF = new int[20][];
    System.arraycopy(bAE, 0, bAF, 0, 10);
    for (int i = 10; i < 20; i++)
    {
      arrayOfInt2 = bAE[(i - 10)];
      arrayOfInt1 = new int[arrayOfInt2.length];
      for (int j = 0; j < arrayOfInt2.length; j++)
        arrayOfInt1[j] = arrayOfInt2[(arrayOfInt2.length - j - 1)];
      bAF[i] = arrayOfInt1;
    }
  }

  static boolean r(CharSequence paramCharSequence)
  {
    boolean bool = false;
    int i = paramCharSequence.length();
    if (i == 0);
    while (true)
    {
      return bool;
      int j = i - 2;
      int k = 0;
      while (j >= 0)
      {
        int m = paramCharSequence.charAt(j) - '0';
        if ((m < 0) || (m > 9))
          throw d.vs();
        k += m;
        j -= 2;
      }
      j = k * 3;
      for (k = i - 1; k >= 0; k -= 2)
      {
        i = paramCharSequence.charAt(k) - '0';
        if ((i < 0) || (i > 9))
          throw d.vs();
        j += i;
      }
      if (j % 10 == 0)
        bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.b.d.q
 * JD-Core Version:    0.6.2
 */