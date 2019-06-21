package com.tencent.mm.sdk.g;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  public long iBv;
  public String name;
  public long startTime;
  public a xDX;
  public long xDY;

  public e(String paramString)
  {
    this.name = paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(52590);
    String str = this.name + " " + this.xDX + " " + this.xDY + " " + this.startTime + " " + this.iBv;
    AppMethodBeat.o(52590);
    return str;
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(52589);
      xDZ = new a("WAITING", 0);
      xEa = new a("RUNNING", 1);
      xEb = new a("FINISH", 2);
      xEc = new a[] { xDZ, xEa, xEb };
      AppMethodBeat.o(52589);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.e
 * JD-Core Version:    0.6.2
 */