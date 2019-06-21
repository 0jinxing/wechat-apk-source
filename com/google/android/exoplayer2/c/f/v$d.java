package com.google.android.exoplayer2.c.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v$d
{
  private String bbx;
  private final String bdL;
  private final int bdM;
  private final int bdN;
  private int bdO;

  public v$d(int paramInt1, int paramInt2)
  {
    this(-2147483648, paramInt1, paramInt2);
  }

  public v$d(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(95179);
    if (paramInt1 != -2147483648);
    for (String str = paramInt1 + "/"; ; str = "")
    {
      this.bdL = str;
      this.bdM = paramInt2;
      this.bdN = paramInt3;
      this.bdO = -2147483648;
      AppMethodBeat.o(95179);
      return;
    }
  }

  private void rC()
  {
    AppMethodBeat.i(95183);
    if (this.bdO == -2147483648)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("generateNewId() must be called before retrieving ids.");
      AppMethodBeat.o(95183);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(95183);
  }

  public final int rA()
  {
    AppMethodBeat.i(95181);
    rC();
    int i = this.bdO;
    AppMethodBeat.o(95181);
    return i;
  }

  public final String rB()
  {
    AppMethodBeat.i(95182);
    rC();
    String str = this.bbx;
    AppMethodBeat.o(95182);
    return str;
  }

  public final void rz()
  {
    AppMethodBeat.i(95180);
    if (this.bdO == -2147483648);
    for (int i = this.bdM; ; i = this.bdO + this.bdN)
    {
      this.bdO = i;
      this.bbx = (this.bdL + this.bdO);
      AppMethodBeat.o(95180);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.v.d
 * JD-Core Version:    0.6.2
 */