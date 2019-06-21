package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class y
{
  public static boolean C(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121685);
    boolean bool;
    if (D(paramArrayOfByte, paramInt1, paramInt2) == 0)
    {
      bool = true;
      AppMethodBeat.o(121685);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121685);
    }
  }

  public static int D(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121686);
    while ((paramInt1 < paramInt2) && (paramArrayOfByte[paramInt1] >= 0))
      paramInt1++;
    if (paramInt1 >= paramInt2)
    {
      paramInt1 = 0;
      AppMethodBeat.o(121686);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = E(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(121686);
    }
  }

  private static int E(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121687);
    while (true)
    {
      if (paramInt1 >= paramInt2)
      {
        paramInt1 = 0;
        AppMethodBeat.o(121687);
      }
      int i;
      while (true)
      {
        return paramInt1;
        i = paramInt1 + 1;
        paramInt1 = paramArrayOfByte[paramInt1];
        if (paramInt1 >= 0)
          break label260;
        if (paramInt1 < -32)
        {
          if (i >= paramInt2)
          {
            AppMethodBeat.o(121687);
          }
          else
          {
            if (paramInt1 >= -62)
            {
              paramInt1 = i + 1;
              if (paramArrayOfByte[i] <= -65)
                break;
            }
            AppMethodBeat.o(121687);
            paramInt1 = -1;
          }
        }
        else
        {
          int j;
          if (paramInt1 < -16)
          {
            if (i >= paramInt2 - 1)
            {
              paramInt1 = F(paramArrayOfByte, i, paramInt2);
              AppMethodBeat.o(121687);
            }
            else
            {
              j = i + 1;
              i = paramArrayOfByte[i];
              if ((i <= -65) && ((paramInt1 != -32) || (i >= -96)) && ((paramInt1 != -19) || (i < -96)))
              {
                paramInt1 = j + 1;
                if (paramArrayOfByte[j] <= -65)
                  break;
              }
              AppMethodBeat.o(121687);
              paramInt1 = -1;
            }
          }
          else if (i >= paramInt2 - 2)
          {
            paramInt1 = F(paramArrayOfByte, i, paramInt2);
            AppMethodBeat.o(121687);
          }
          else
          {
            j = i + 1;
            i = paramArrayOfByte[i];
            if ((i <= -65) && ((paramInt1 << 28) + (i + 112) >> 30 == 0))
            {
              i = j + 1;
              if (paramArrayOfByte[j] <= -65)
              {
                paramInt1 = i + 1;
                if (paramArrayOfByte[i] <= -65)
                  break;
              }
            }
            AppMethodBeat.o(121687);
            paramInt1 = -1;
          }
        }
      }
      continue;
      label260: paramInt1 = i;
    }
  }

  private static int F(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121688);
    int i = paramArrayOfByte[(paramInt1 - 1)];
    switch (paramInt2 - paramInt1)
    {
    default:
      paramArrayOfByte = new AssertionError();
      AppMethodBeat.o(121688);
      throw paramArrayOfByte;
    case 0:
      paramInt1 = UH(i);
      AppMethodBeat.o(121688);
    case 1:
    case 2:
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = iq(i, paramArrayOfByte[paramInt1]);
      AppMethodBeat.o(121688);
      continue;
      paramInt1 = aT(i, paramArrayOfByte[paramInt1], paramArrayOfByte[(paramInt1 + 1)]);
      AppMethodBeat.o(121688);
    }
  }

  private static int UH(int paramInt)
  {
    int i = paramInt;
    if (paramInt > -12)
      i = -1;
    return i;
  }

  static int aT(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 > -12) || (paramInt2 > -65) || (paramInt3 > -65));
    for (paramInt1 = -1; ; paramInt1 = paramInt2 << 8 ^ paramInt1 ^ paramInt3 << 16)
      return paramInt1;
  }

  static int iq(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > -12) || (paramInt2 > -65));
    for (paramInt1 = -1; ; paramInt1 = paramInt2 << 8 ^ paramInt1)
      return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.y
 * JD-Core Version:    0.6.2
 */