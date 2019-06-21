package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class SimpleLoginUI$18
  implements ResizeLayout.a
{
  SimpleLoginUI$18(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final void aqZ()
  {
    AppMethodBeat.i(125615);
    SimpleLoginUI.e(this.gIp).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(125614);
        SimpleLoginUI.e(SimpleLoginUI.18.this.gIp).fullScroll(130);
        AppMethodBeat.o(125614);
      }
    });
    AppMethodBeat.o(125615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.18
 * JD-Core Version:    0.6.2
 */