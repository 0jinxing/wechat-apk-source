package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.contact.y;
import com.tencent.mm.ui.widget.MMEditText;

final class SeeRoomMemberUI$13
  implements AdapterView.OnItemClickListener
{
  SeeRoomMemberUI$13(SeeRoomMemberUI paramSeeRoomMemberUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(104319);
    paramAdapterView = SeeRoomMemberUI.c(this.elX).iG(paramInt);
    if (paramAdapterView.type == 2)
    {
      ab.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Add member");
      h.pYm.a(219L, 6L, 1L, true);
      SeeRoomMemberUI.d(this.elX);
      AppMethodBeat.o(104319);
    }
    ad localad;
    while (true)
    {
      return;
      if (paramAdapterView.type == 3)
      {
        ab.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Delete member");
        SeeRoomMemberUI.e(this.elX);
        AppMethodBeat.o(104319);
      }
      else
      {
        if (paramAdapterView.type != 1)
          break label234;
        localad = SeeRoomMemberUI.c(this.elX).iG(paramInt).ehM;
        if (localad != null)
          break;
        ab.e("MicroMsg.SeeRoomMemberUI", "cont is null");
        AppMethodBeat.o(104319);
      }
    }
    SeeRoomMemberUI.a(this.elX, localad.field_username);
    paramView = localad.field_nickname;
    paramAdapterView = SeeRoomMemberUI.a(SeeRoomMemberUI.f(this.elX), SeeRoomMemberUI.g(this.elX));
    if (bo.isNullOrNil(paramAdapterView))
      SeeRoomMemberUI.b(this.elX, localad.Oj());
    while (true)
    {
      y.q(SeeRoomMemberUI.h(this.elX).getText().toString(), 1, 6, paramInt + 1);
      SeeRoomMemberUI.a(this.elX, SeeRoomMemberUI.g(this.elX), SeeRoomMemberUI.i(this.elX), paramView);
      label234: AppMethodBeat.o(104319);
      break;
      SeeRoomMemberUI.b(this.elX, paramAdapterView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.13
 * JD-Core Version:    0.6.2
 */