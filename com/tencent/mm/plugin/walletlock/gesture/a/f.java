package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  private static f[][] tVC;
  public int tVA = 0;
  public int tVB = 0;

  static
  {
    AppMethodBeat.i(51583);
    tVC = new f[3][3];
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        tVC[i][j] = new f(i, j);
    AppMethodBeat.o(51583);
  }

  private f(int paramInt1, int paramInt2)
  {
    this.tVA = paramInt1;
    this.tVB = paramInt2;
  }

  public static f gk(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(51581);
      if ((paramInt1 < 0) || (paramInt1 > 2))
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("row id should be in range [0..2]");
        AppMethodBeat.o(51581);
        throw localIllegalArgumentException;
      }
    }
    finally
    {
    }
    if ((paramInt2 < 0) || (paramInt2 > 2))
    {
      localObject2 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject2).<init>("col id should be in range [0..2]");
      AppMethodBeat.o(51581);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = tVC[paramInt1][paramInt2];
    AppMethodBeat.o(51581);
    return localObject2;
  }

  public final String toString()
  {
    AppMethodBeat.i(51582);
    String str = String.format("{row: %d, col: %d}", new Object[] { Integer.valueOf(this.tVA), Integer.valueOf(this.tVB) });
    AppMethodBeat.o(51582);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.a.f
 * JD-Core Version:    0.6.2
 */