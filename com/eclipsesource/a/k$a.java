package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;

final class k$a extends i
{
  private final char[] aLL;
  private int aLM;

  private k$a(Writer paramWriter, char[] paramArrayOfChar)
  {
    super(paramWriter);
    this.aLL = paramArrayOfChar;
  }

  private boolean py()
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(70604);
    if (this.aLL == null)
      AppMethodBeat.o(70604);
    while (true)
    {
      return bool;
      this.writer.write(10);
      while (i < this.aLM)
      {
        this.writer.write(this.aLL);
        i++;
      }
      bool = true;
      AppMethodBeat.o(70604);
    }
  }

  protected final void pr()
  {
    AppMethodBeat.i(70597);
    this.aLM += 1;
    this.writer.write(91);
    py();
    AppMethodBeat.o(70597);
  }

  protected final void ps()
  {
    AppMethodBeat.i(70598);
    this.aLM -= 1;
    py();
    this.writer.write(93);
    AppMethodBeat.o(70598);
  }

  protected final void pt()
  {
    AppMethodBeat.i(70599);
    this.writer.write(44);
    if (!py())
      this.writer.write(32);
    AppMethodBeat.o(70599);
  }

  protected final void pu()
  {
    AppMethodBeat.i(70600);
    this.aLM += 1;
    this.writer.write(123);
    py();
    AppMethodBeat.o(70600);
  }

  protected final void pv()
  {
    AppMethodBeat.i(70601);
    this.aLM -= 1;
    py();
    this.writer.write(125);
    AppMethodBeat.o(70601);
  }

  protected final void pw()
  {
    AppMethodBeat.i(70602);
    this.writer.write(58);
    this.writer.write(32);
    AppMethodBeat.o(70602);
  }

  protected final void px()
  {
    AppMethodBeat.i(70603);
    this.writer.write(44);
    if (!py())
      this.writer.write(32);
    AppMethodBeat.o(70603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.k.a
 * JD-Core Version:    0.6.2
 */