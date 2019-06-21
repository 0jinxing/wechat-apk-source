package com.google.b.e;

import com.google.b.b.b;
import com.google.b.e.a.d;
import com.google.b.e.a.e;
import com.google.b.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.charset.Charset;
import java.util.Map;

public final class a
  implements g
{
  private static b a(byte[][] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(57236);
    b localb = new b(paramArrayOfByte[0].length + paramInt * 2, paramArrayOfByte.length + paramInt * 2);
    localb.clear();
    int i = localb.height - paramInt - 1;
    int j = 0;
    while (j < paramArrayOfByte.length)
    {
      for (int k = 0; k < paramArrayOfByte[0].length; k++)
        if (paramArrayOfByte[j][k] == 1)
          localb.set(k + paramInt, i);
      j++;
      i--;
    }
    AppMethodBeat.o(57236);
    return localb;
  }

  private static byte[][] a(byte[][] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0].length;
    int j = paramArrayOfByte.length;
    byte[][] arrayOfByte = new byte[i][j];
    for (i = 0; i < paramArrayOfByte.length; i++)
    {
      int k = paramArrayOfByte.length;
      for (j = 0; j < paramArrayOfByte[0].length; j++)
        arrayOfByte[j][(k - i - 1)] = ((byte)paramArrayOfByte[i][j]);
    }
    return arrayOfByte;
  }

  public final b a(String paramString, com.google.b.a parama, int paramInt1, int paramInt2, Map<com.google.b.c, ?> paramMap)
  {
    AppMethodBeat.i(57235);
    if (parama != com.google.b.a.bxL)
    {
      paramString = new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(parama)));
      AppMethodBeat.o(57235);
      throw paramString;
    }
    parama = new e();
    int i = 2;
    int j;
    int m;
    if (paramMap != null)
    {
      if (paramMap.containsKey(com.google.b.c.bxZ))
        parama.byk = Boolean.valueOf(paramMap.get(com.google.b.c.bxZ).toString()).booleanValue();
      if (paramMap.containsKey(com.google.b.c.bya))
        parama.bAX = com.google.b.e.a.c.valueOf(paramMap.get(com.google.b.c.bya).toString());
      if (paramMap.containsKey(com.google.b.c.byb))
      {
        d locald = (d)paramMap.get(com.google.b.c.byb);
        j = locald.bAT;
        i = locald.bAS;
        int k = locald.maxRows;
        m = locald.bAU;
        parama.bAT = j;
        parama.bAS = i;
        parama.maxRows = k;
        parama.bAU = m;
      }
      if (paramMap.containsKey(com.google.b.c.bxY))
      {
        j = Integer.parseInt(paramMap.get(com.google.b.c.bxY).toString());
        if (paramMap.containsKey(com.google.b.c.bxT))
        {
          i = Integer.parseInt(paramMap.get(com.google.b.c.bxT).toString());
          label263: if (paramMap.containsKey(com.google.b.c.bxU))
            parama.bAY = Charset.forName(paramMap.get(com.google.b.c.bxU).toString());
        }
      }
    }
    while (true)
    {
      parama.m(paramString, i);
      paramString = parama.bAW.bG(1, 4);
      if (paramInt2 > paramInt1)
      {
        i = 1;
        if (paramString[0].length >= paramString.length)
          break label420;
        m = 1;
        label334: if ((i ^ m) == 0)
          break label447;
        paramString = a(paramString);
      }
      label420: label441: label447: for (i = 1; ; i = 0)
      {
        paramInt1 /= paramString[0].length;
        paramInt2 /= paramString.length;
        if (paramInt1 >= paramInt2)
          paramInt1 = paramInt2;
        while (true)
        {
          if (paramInt1 > 1)
          {
            paramString = parama.bAW.bG(paramInt1, paramInt1 << 2);
            if (i == 0)
              break label441;
            paramString = a(paramString);
          }
          while (true)
          {
            paramString = a(paramString, j);
            AppMethodBeat.o(57235);
            while (true)
            {
              return paramString;
              i = 0;
              break;
              m = 0;
              break label334;
              paramString = a(paramString, j);
              AppMethodBeat.o(57235);
            }
          }
        }
      }
      i = 2;
      break label263;
      j = 30;
      break;
      j = 30;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.b.e.a
 * JD-Core Version:    0.6.2
 */