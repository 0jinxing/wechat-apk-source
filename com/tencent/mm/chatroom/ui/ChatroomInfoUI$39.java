package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.f;

final class ChatroomInfoUI$39
  implements ap.a
{
  int ayk = 0;

  ChatroomInfoUI$39(ChatroomInfoUI paramChatroomInfoUI, String paramString)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(104008);
    if (ChatroomInfoUI.f(this.eiz) == null)
      AppMethodBeat.o(104008);
    while (true)
    {
      return bool;
      if (this.ayk <= 50)
        break;
      AppMethodBeat.o(104008);
    }
    int i = ChatroomInfoUI.f(this.eiz).aqQ(this.val$key);
    View localView = this.eiz.nDp.getChildAt(i - this.eiz.nDp.getFirstVisiblePosition());
    if (localView != null);
    for (int j = localView.getHeight(); ; j = 0)
    {
      if (j == 0)
      {
        this.ayk += 1;
        AppMethodBeat.o(104008);
        bool = true;
        break;
      }
      ab.d("MicroMsg.ChatroomInfoUI", "show cover view get y[%f] height [%d] index[%d] [%d %d]", new Object[] { Float.valueOf(localView.getY()), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(this.eiz.nDp.getFirstVisiblePosition()), Integer.valueOf(this.eiz.nDp.getLastVisiblePosition()) });
      int k = (int)localView.getY();
      int m = j;
      i = k;
      if (k < 0)
      {
        m = j + k;
        i = 0;
      }
      ChatroomInfoUI.a(this.eiz, i, m);
      AppMethodBeat.o(104008);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.39
 * JD-Core Version:    0.6.2
 */