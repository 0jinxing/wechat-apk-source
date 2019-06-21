package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public int Afo;
  public String aIm;
  public int errCode;
  public int errType;

  public d()
  {
    this.Afo = 0;
    this.errType = 0;
    this.errCode = 0;
    this.aIm = "";
    this.Afo = 0;
  }

  public d(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(49037);
    this.Afo = 0;
    f(paramInt1, paramInt2, paramString, 0);
    AppMethodBeat.o(49037);
  }

  public final void f(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.errType = paramInt1;
    this.errCode = paramInt2;
    this.aIm = paramString;
    this.Afo = paramInt3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.d
 * JD-Core Version:    0.6.2
 */