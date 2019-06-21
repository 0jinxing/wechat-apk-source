package com.tencent.soter.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a
{
  public int AvR = 0;
  private String AvS = "";
  public boolean AvT = false;
  private boolean AvU = false;
  public a AvV = null;

  public final a co(String paramString, boolean paramBoolean)
  {
    this.AvS = paramString;
    this.AvU = paramBoolean;
    this.AvR |= 2;
    return this;
  }

  public final b dRj()
  {
    AppMethodBeat.i(10474);
    b localb = new b(this.AvR, this.AvS, this.AvT, this.AvU, this.AvV, (byte)0);
    AppMethodBeat.o(10474);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.e.b.a
 * JD-Core Version:    0.6.2
 */