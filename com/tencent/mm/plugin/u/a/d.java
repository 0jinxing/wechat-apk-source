package com.tencent.mm.plugin.u.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public int cvn;
  public int cvo;
  public String pAE;
  public byte[] rawData;
  public String result;

  public d()
  {
    AppMethodBeat.i(80770);
    this.result = "";
    this.rawData = new byte[0];
    this.pAE = "";
    this.cvn = 0;
    this.cvo = 0;
    AppMethodBeat.o(80770);
  }

  public final String toString()
  {
    AppMethodBeat.i(80771);
    String str = String.format("result: %s, codeType: %s, codeTypeName %s, codeVersion: %s", new Object[] { this.result, Integer.valueOf(this.cvn), this.pAE, Integer.valueOf(this.cvo) });
    AppMethodBeat.o(80771);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.d
 * JD-Core Version:    0.6.2
 */