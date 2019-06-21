package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;

final class DelChatroomMemberUI$a$1
  implements View.OnClickListener
{
  DelChatroomMemberUI$a$1(DelChatroomMemberUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104089);
    int i = ((Integer)paramView.getTag()).intValue();
    ad localad = (ad)this.ejl.getItem(i);
    paramView = this.ejl.ejg.getString(2131302528, new Object[] { this.ejl.c(localad) });
    h.a(this.ejl.ejg, paramView, null, this.ejl.ejg.getString(2131302536), this.ejl.ejg.getString(2131296868), true, new DelChatroomMemberUI.a.1.1(this, localad), new DelChatroomMemberUI.a.1.2(this));
    AppMethodBeat.o(104089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.DelChatroomMemberUI.a.1
 * JD-Core Version:    0.6.2
 */