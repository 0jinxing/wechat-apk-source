package com.tencent.mm.pluginsdk.ui.chat;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.b;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class ChatFooter$11
  implements ChatFooterPanel.a
{
  ChatFooter$11(ChatFooter paramChatFooter)
  {
  }

  public final void aRg()
  {
    AppMethodBeat.i(27797);
    ChatFooter.A(this.vnX);
    ChatFooter.B(this.vnX).setVisibility(0);
    ChatFooter.s(this.vnX).setVisibility(8);
    ChatFooter.a(this.vnX, true);
    ChatFooter.C(this.vnX);
    ChatFooter.a(this.vnX).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
    ChatFooter.a(this.vnX).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    this.vnX.vnk.cTw -= 1L;
    AppMethodBeat.o(27797);
  }

  public final void aYY()
  {
    AppMethodBeat.i(27795);
    ChatFooter.A(this.vnX);
    ChatFooter.B(this.vnX).setVisibility(0);
    ChatFooter.s(this.vnX).setVisibility(8);
    ChatFooter.a(this.vnX, true);
    ChatFooter.C(this.vnX);
    if (ChatFooter.h(this.vnX) != null)
      ChatFooter.h(this.vnX).performClick();
    AppMethodBeat.o(27795);
  }

  public final void append(String paramString)
  {
    AppMethodBeat.i(27798);
    ChatFooter.A(this.vnX);
    ChatFooter.B(this.vnX).setVisibility(0);
    ChatFooter.s(this.vnX).setVisibility(8);
    ChatFooter.a(this.vnX, true);
    ChatFooter.C(this.vnX);
    try
    {
      ChatFooter.a(this.vnX).asB(paramString);
      this.vnX.vnk.cTw += 1L;
      AppMethodBeat.o(27798);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ChatFooter", paramString, "", new Object[0]);
    }
  }

  public final void fC(boolean paramBoolean)
  {
    AppMethodBeat.i(27796);
    if (ChatFooter.m(this.vnX).getVisibility() == 0)
    {
      ChatFooter.A(this.vnX);
      ChatFooter.B(this.vnX).setVisibility(0);
      ChatFooter.s(this.vnX).setVisibility(8);
      ChatFooter.C(this.vnX);
      if (ChatFooter.a(this.vnX) != null)
        this.vnX.setToSendTextColor(paramBoolean);
    }
    AppMethodBeat.o(27796);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.11
 * JD-Core Version:    0.6.2
 */