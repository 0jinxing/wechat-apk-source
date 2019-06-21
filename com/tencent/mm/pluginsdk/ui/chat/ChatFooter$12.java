package com.tencent.mm.pluginsdk.ui.chat;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.widget.MMEditText;

final class ChatFooter$12 extends ak
{
  ChatFooter$12(ChatFooter paramChatFooter)
  {
  }

  @SuppressLint({"NewApi"})
  @TargetApi(11)
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(27799);
    switch (paramMessage.what)
    {
    default:
    case 1002:
    }
    do
    {
      AppMethodBeat.o(27799);
      return;
    }
    while ((ChatFooter.a(this.vnX) == null) || (paramMessage.obj == null));
    boolean bool = ((Boolean)paramMessage.obj).booleanValue();
    if (bool)
      ChatFooter.a(this.vnX).setAlpha(1.0F);
    while (true)
    {
      ChatFooter.a(this.vnX, bool);
      break;
      ChatFooter.a(this.vnX).setAlpha(0.5F);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.12
 * JD-Core Version:    0.6.2
 */