package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.c;

public class ac extends a
  implements v
{
  private c hAA;

  public ac()
  {
    AppMethodBeat.i(31607);
    this.hAA = new ac.1(this);
    AppMethodBeat.o(31607);
  }

  private void dDi()
  {
    AppMethodBeat.i(31608);
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    AppMethodBeat.o(31608);
  }

  public final void dDh()
  {
    AppMethodBeat.i(31611);
    super.dDh();
    dDi();
    AppMethodBeat.o(31611);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31610);
    dDi();
    AppMethodBeat.o(31610);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31609);
    com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
    AppMethodBeat.o(31609);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ac
 * JD-Core Version:    0.6.2
 */