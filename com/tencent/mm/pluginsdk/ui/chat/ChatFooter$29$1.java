package com.tencent.mm.pluginsdk.ui.chat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;

final class ChatFooter$29$1
  implements DialogInterface.OnClickListener
{
  ChatFooter$29$1(ChatFooter.29 param29, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(27819);
    boolean bool = r.g(this.voa, ChatFooter.c(this.vob.vnX).getTalkerUserName(), true);
    paramDialogInterface = this.vob.vnX;
    if (bool);
    while (true)
    {
      ChatFooter.a(paramDialogInterface, paramInt, this.voa);
      AppMethodBeat.o(27819);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooter.29.1
 * JD-Core Version:    0.6.2
 */