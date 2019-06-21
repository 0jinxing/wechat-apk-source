package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class ChatroomContactUI$8
  implements MMSlideDelView.c
{
  ChatroomContactUI$8(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(33580);
    int i = ChatroomContactUI.b(this.zls).getPositionForView(paramView);
    AppMethodBeat.o(33580);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI.8
 * JD-Core Version:    0.6.2
 */