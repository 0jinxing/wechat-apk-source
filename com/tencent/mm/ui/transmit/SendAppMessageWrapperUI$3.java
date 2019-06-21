package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class SendAppMessageWrapperUI$3
  implements q.a
{
  SendAppMessageWrapperUI$3(SendAppMessageWrapperUI paramSendAppMessageWrapperUI, WXMediaMessage paramWXMediaMessage)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(35215);
    if (paramBoolean)
    {
      SendAppMessageWrapperUI.a(this.zKA, this.cgo, paramString, paramInt);
      AppMethodBeat.o(35215);
    }
    while (true)
    {
      return;
      SendAppMessageWrapperUI.d(this.zKA);
      AppMethodBeat.o(35215);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.3
 * JD-Core Version:    0.6.2
 */