package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileInputUI$13
  implements Runnable
{
  MobileInputUI$13(MobileInputUI paramMobileInputUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125173);
    MobileInputUI.g(this.gDZ).smoothScrollBy(0, this.val$height);
    AppMethodBeat.o(125173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.13
 * JD-Core Version:    0.6.2
 */