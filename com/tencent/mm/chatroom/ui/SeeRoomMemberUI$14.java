package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.h;

final class SeeRoomMemberUI$14
  implements AdapterView.OnItemLongClickListener
{
  SeeRoomMemberUI$14(SeeRoomMemberUI paramSeeRoomMemberUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(104321);
    if (SeeRoomMemberUI.j(this.elX))
    {
      paramAdapterView = SeeRoomMemberUI.c(this.elX).iG(paramInt).ehM;
      if (paramAdapterView == null)
        AppMethodBeat.o(104321);
      while (true)
      {
        return true;
        paramAdapterView = paramAdapterView.field_username;
        if (!SeeRoomMemberUI.f(this.elX).field_roomowner.equals(paramAdapterView))
          break;
        AppMethodBeat.o(104321);
      }
      h.a(this.elX, this.elX.getString(2131302526), "", new SeeRoomMemberUI.14.1(this, paramInt), new SeeRoomMemberUI.14.2(this));
    }
    while (true)
    {
      AppMethodBeat.o(104321);
      break;
      ab.i("MicroMsg.SeeRoomMemberUI", "U are not a roomowner");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.14
 * JD-Core Version:    0.6.2
 */