package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import java.util.List;

final class SeeRoomManagerUI$b$2
  implements View.OnClickListener
{
  SeeRoomManagerUI$b$2(SeeRoomManagerUI.b paramb, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104288);
    paramView = (SeeRoomManagerUI.a)this.elO.dataList.get(this.sN);
    if (paramView.type == 1)
    {
      paramView = ((SeeRoomManagerUI.a)this.elO.dataList.get(this.sN)).ehM;
      SeeRoomManagerUI.a(this.elO.elM, paramView.field_username, SeeRoomManagerUI.b.a(this.elO, paramView), paramView.field_nickname);
      AppMethodBeat.o(104288);
    }
    while (true)
    {
      return;
      if (paramView.type == 2)
      {
        paramView = new Intent(this.elO.elM, SelectAddRoomManagerUI.class);
        paramView.putExtra("RoomInfo_Id", SeeRoomManagerUI.c(this.elO.elM));
        this.elO.elM.startActivityForResult(paramView, 0);
        AppMethodBeat.o(104288);
      }
      else
      {
        if (paramView.type == 3)
        {
          paramView = new Intent(this.elO.elM, SelectDelRoomManagerUI.class);
          paramView.putExtra("RoomInfo_Id", SeeRoomManagerUI.c(this.elO.elM));
          paramView.putExtra("RoomManagers", SeeRoomManagerUI.e(this.elO.elM));
          this.elO.elM.startActivityForResult(paramView, 1);
        }
        AppMethodBeat.o(104288);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomManagerUI.b.2
 * JD-Core Version:    0.6.2
 */