package com.tencent.mm.pluginsdk.ui.chat;

import android.os.Message;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class ChatFooter$27 extends ak
{
  ChatFooter$27(ChatFooter paramChatFooter)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27818);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 4097:
    }
    while (true)
    {
      AppMethodBeat.o(27818);
      int i;
      while (true)
      {
        return;
        ChatFooter.f(this.vnX, true);
        paramMessage = ChatFooter.m(this.vnX).getLayoutParams();
        i = ChatFooter.m(this.vnX).getBottom() - ChatFooter.m(this.vnX).getTop();
        if (this.vnX.dky())
        {
          if (ChatFooter.n(this.vnX) != null)
            ChatFooter.n(this.vnX).setVisibility(8);
          this.vnX.setAppPanelVisible(8);
          ChatFooter.m(this.vnX).setVisibility(4);
        }
        if (i > 3)
          break;
        ChatFooter.f(this.vnX, false);
        ChatFooter.m(this.vnX).setVisibility(8);
        ChatFooter.c(this.vnX, this.vnX.getKeyBordHeightPX());
        AppMethodBeat.o(27818);
      }
      paramMessage.height = Math.max(i - 60, 1);
      ab.e("MicroMsg.ChatFooter", "mBottomPanelAnim:bottomPanel height:" + paramMessage.height);
      ChatFooter.m(this.vnX).setLayoutParams(paramMessage);
      ChatFooter.M(this.vnX);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.27
 * JD-Core Version:    0.6.2
 */