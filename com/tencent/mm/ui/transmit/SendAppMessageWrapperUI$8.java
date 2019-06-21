package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.j.a;
import com.tencent.mm.ui.base.p;

final class SendAppMessageWrapperUI$8
  implements j.a
{
  SendAppMessageWrapperUI$8(SendAppMessageWrapperUI paramSendAppMessageWrapperUI)
  {
  }

  public final void dhi()
  {
    AppMethodBeat.i(35220);
    if (SendAppMessageWrapperUI.h(this.zKA) != null)
    {
      SendAppMessageWrapperUI.h(this.zKA).dismiss();
      SendAppMessageWrapperUI.i(this.zKA);
    }
    AppMethodBeat.o(35220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.8
 * JD-Core Version:    0.6.2
 */