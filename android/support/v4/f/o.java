package android.support.v4.f;

import java.io.PrintWriter;

public final class o
{
  private static char[] LA = new char[24];
  private static final Object Lz = new Object();

  private static int a(char[] paramArrayOfChar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean)
  {
    int i;
    int j;
    if (!paramBoolean)
    {
      i = paramInt2;
      if (paramInt1 <= 0);
    }
    else
    {
      if (paramInt1 <= 99)
        break label124;
      j = paramInt1 / 100;
      paramArrayOfChar[paramInt2] = ((char)(char)(j + 48));
      i = paramInt2 + 1;
      paramInt1 -= j * 100;
    }
    while (true)
    {
      int k;
      if (paramInt1 <= 9)
      {
        k = i;
        j = paramInt1;
        if (paramInt2 == i);
      }
      else
      {
        paramInt2 = paramInt1 / 10;
        paramArrayOfChar[i] = ((char)(char)(paramInt2 + 48));
        k = i + 1;
        j = paramInt1 - paramInt2 * 10;
      }
      paramArrayOfChar[k] = ((char)(char)(j + 48));
      paramInt1 = k + 1;
      paramArrayOfChar[paramInt1] = ((char)paramChar);
      i = paramInt1 + 1;
      return i;
      label124: i = paramInt2;
    }
  }

  public static void a(long paramLong1, long paramLong2, PrintWriter paramPrintWriter)
  {
    if (paramLong1 == 0L)
      paramPrintWriter.print("--");
    while (true)
    {
      return;
      a(paramLong1 - paramLong2, paramPrintWriter);
    }
  }

  private static void a(long paramLong, PrintWriter paramPrintWriter)
  {
    boolean bool1 = true;
    int i = 1;
    while (true)
    {
      synchronized (Lz)
      {
        if (LA.length < 0)
          LA = new char[0];
        Object localObject2 = LA;
        if (paramLong == 0L)
        {
          localObject2[0] = ((char)48);
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(LA, 0, i);
          paramPrintWriter.print((String)localObject2);
          return;
        }
        if (paramLong > 0L)
        {
          j = 43;
          int k = (int)(paramLong % 1000L);
          i = (int)Math.floor(paramLong / 1000L);
          if (i <= 86400)
            break label337;
          m = i / 86400;
          i -= m * 86400;
          if (i <= 3600)
            break label331;
          n = i / 3600;
          i -= n * 3600;
          if (i <= 60)
            break label325;
          i1 = i / 60;
          i -= i1 * 60;
          localObject2[0] = ((char)j);
          j = a((char[])localObject2, m, 'd', 1, false);
          if (j == 1)
            continue;
          bool2 = true;
          j = a((char[])localObject2, n, 'h', j, bool2);
          if (j == 1)
            continue;
          bool2 = true;
          j = a((char[])localObject2, i1, 'm', j, bool2);
          if (j == 1)
            continue;
          bool2 = bool1;
          i = a((char[])localObject2, k, 'm', a((char[])localObject2, i, 's', j, bool2), true);
          localObject2[i] = ((char)115);
          i++;
          continue;
        }
        paramLong = -paramLong;
        int j = 45;
        continue;
        boolean bool2 = false;
        continue;
        bool2 = false;
        continue;
        bool2 = false;
      }
      label325: int i1 = 0;
      continue;
      label331: int n = 0;
      continue;
      label337: int m = 0;
    }
  }

  public static void b(long paramLong, PrintWriter paramPrintWriter)
  {
    a(paramLong, paramPrintWriter);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.f.o
 * JD-Core Version:    0.6.2
 */