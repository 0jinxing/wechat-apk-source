package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p;

final class RoomInfoDetailUI$2
  implements h.c
{
  RoomInfoDetailUI$2(RoomInfoDetailUI paramRoomInfoDetailUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(104189);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(104189);
      label29: return;
    case 0:
    }
    RoomInfoDetailUI.a(this.ekA, false);
    Object localObject = this.ekA;
    this.ekA.getString(2131297061);
    p localp = h.b((Context)localObject, this.ekA.getString(2131297086), true, new RoomInfoDetailUI.2.1(this));
    if (!RoomInfoDetailUI.a(this.ekA));
    for (localObject = e.akq(RoomInfoDetailUI.b(this.ekA).field_username); ; localObject = null)
    {
      if (!bo.isNullOrNil((String)localObject))
      {
        localp.dismiss();
        h.a(this.ekA, false, this.ekA.getString(2131304750, new Object[] { localObject }), null, this.ekA.getString(2131300420), this.ekA.getString(2131298334), new RoomInfoDetailUI.2.2(this), new RoomInfoDetailUI.2.3(this, localp), -1, 2131689665);
        AppMethodBeat.o(104189);
        break label29;
      }
      RoomInfoDetailUI.a(this.ekA, localp);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomInfoDetailUI.2
 * JD-Core Version:    0.6.2
 */