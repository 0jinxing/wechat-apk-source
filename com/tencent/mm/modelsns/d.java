package com.tencent.mm.modelsns;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  StringBuffer fQt;
  StringBuffer fQu;
  private int index;

  public d()
  {
    AppMethodBeat.i(78618);
    this.fQt = new StringBuffer();
    this.fQu = new StringBuffer();
    this.index = 0;
    AppMethodBeat.o(78618);
  }

  public final String Fk()
  {
    AppMethodBeat.i(78622);
    this.index = 0;
    this.fQt.append("--end--\n\n");
    String str = this.fQt.toString();
    AppMethodBeat.o(78622);
    return str;
  }

  public final void k(String paramString, Object paramObject)
  {
    AppMethodBeat.i(78619);
    this.fQt.append(this.index + " " + paramString + "->" + paramObject + "\n");
    this.fQu.append(paramObject);
    this.index += 1;
    AppMethodBeat.o(78619);
  }

  public final void l(String paramString, Object paramObject)
  {
    AppMethodBeat.i(78620);
    this.fQt.append(paramString + "->" + paramObject + "\n");
    this.fQu.append(paramObject);
    AppMethodBeat.o(78620);
  }

  public final String toString()
  {
    AppMethodBeat.i(78621);
    String str = this.fQu.toString();
    AppMethodBeat.o(78621);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsns.d
 * JD-Core Version:    0.6.2
 */