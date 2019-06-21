package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.voicesearch.b;
import com.tencent.mm.ui.widget.b.a;

final class ChatroomContactUI$12
  implements AdapterView.OnItemLongClickListener
{
  ChatroomContactUI$12(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33584);
    ab.d("MicroMsg.ChatroomContactUI", "onItemLongClick, targetview is SearchBar::ListView, pos = ".concat(String.valueOf(paramInt)));
    if (paramInt < ChatroomContactUI.b(this.zls).getHeaderViewsCount())
    {
      ab.w("MicroMsg.ChatroomContactUI", "on item long click, but match header view");
      AppMethodBeat.o(33584);
    }
    while (true)
    {
      return true;
      if ((ChatroomContactUI.d(this.zls) != null) && (ChatroomContactUI.d(this.zls).zLy))
      {
        AppMethodBeat.o(33584);
      }
      else
      {
        paramAdapterView = ((ad)ChatroomContactUI.f(this.zls).getItem(paramInt - ChatroomContactUI.b(this.zls).getHeaderViewsCount())).field_username;
        if ((t.ny(paramAdapterView)) || (t.nz(paramAdapterView)))
        {
          AppMethodBeat.o(33584);
        }
        else
        {
          ChatroomContactUI.c(this.zls, paramAdapterView);
          ChatroomContactUI.j(this.zls).a(paramView, paramInt, paramLong, this.zls, ChatroomContactUI.g(this.zls), ChatroomContactUI.h(this.zls), ChatroomContactUI.i(this.zls));
          AppMethodBeat.o(33584);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI.12
 * JD-Core Version:    0.6.2
 */