package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k$a
{
  public String jvN = "";
  public String jvO = "";
  public String jvP = "";
  public String jvQ = "";

  public k$a()
  {
  }

  public k$a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.jvN = paramString1;
    this.jvO = paramString2;
    this.jvP = paramString3;
    this.jvQ = paramString4;
  }

  public final String toString()
  {
    AppMethodBeat.i(17472);
    String str = this.jvN + " " + this.jvO + " " + this.jvP + " " + this.jvQ;
    AppMethodBeat.o(17472);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.k.a
 * JD-Core Version:    0.6.2
 */