package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class TransferRoomOwnerUI extends SelectMemberUI
  implements f
{
  private com.tencent.mm.ui.base.p ejZ;
  private boolean eog;

  protected final void Kq()
  {
    AppMethodBeat.i(104464);
    super.Kq();
    this.eog = getIntent().getBooleanExtra("quit_room", false);
    AppMethodBeat.o(104464);
  }

  protected final void a(View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(104467);
    super.a(paramView, paramInt, paramLong);
    paramView = this.emB.iH(paramInt);
    if ((paramView == null) || (paramView.ehM == null))
    {
      ab.e("MicroMsg.TransferRoomOwnerUI", "null == item || null == item.contact");
      AppMethodBeat.o(104467);
      return;
    }
    Object localObject1 = paramView.ehM;
    String str = ((ap)localObject1).field_username;
    if (!bo.isNullOrNil(((ap)localObject1).field_conRemark))
    {
      paramView = ((ap)localObject1).field_conRemark;
      label75: if (!bo.isNullOrNil(paramView))
        break label287;
    }
    label287: for (Object localObject2 = ((ad)localObject1).Oi(); ; localObject2 = paramView)
    {
      paramView = (View)localObject2;
      if (!com.tencent.mm.n.a.jh(((ap)localObject1).field_type))
      {
        bv localbv = ((j)g.K(j.class)).XN().RB(((ap)localObject1).field_username);
        paramView = (View)localObject2;
        if (localbv != null)
        {
          paramView = (View)localObject2;
          if (!bo.isNullOrNil(localbv.field_conRemark))
            paramView = localbv.field_conRemark;
        }
      }
      localObject1 = com.tencent.mm.openim.room.a.a.A((ad)localObject1);
      localObject2 = paramView;
      if (!TextUtils.isEmpty((CharSequence)localObject1))
        localObject2 = paramView + localObject1;
      if (!this.eog);
      for (paramView = getString(2131302639, new Object[] { localObject2 }); ; paramView = getString(2131302604, new Object[] { localObject2 }))
      {
        h.a(this, paramView, "", new TransferRoomOwnerUI.1(this, str), new TransferRoomOwnerUI.2(this));
        AppMethodBeat.o(104467);
        break;
        paramView = a(this.eih, ((ap)localObject1).field_username);
        break label75;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104463);
    super.onCreate(paramBundle);
    if (com.tencent.mm.model.t.mP(this.ejD))
    {
      g.RO().eJo.a(811, this);
      AppMethodBeat.o(104463);
    }
    while (true)
    {
      return;
      g.RO().eJo.a(990, this);
      AppMethodBeat.o(104463);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104465);
    super.onDestroy();
    if ((this.ejZ != null) && (this.ejZ.isShowing()))
      this.ejZ.dismiss();
    if (com.tencent.mm.model.t.mP(this.ejD))
    {
      g.RO().eJo.b(811, this);
      AppMethodBeat.o(104465);
    }
    while (true)
    {
      return;
      g.RO().eJo.b(990, this);
      AppMethodBeat.o(104465);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(104466);
    if ((this.ejZ != null) && (this.ejZ.isShowing()))
      this.ejZ.dismiss();
    if ((paramm.getType() == 990) || (paramm.getType() == 811))
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (com.tencent.mm.model.t.mP(this.ejD))
        {
          ab.i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", new Object[] { ((com.tencent.mm.openim.b.p)paramm).username });
          com.tencent.mm.ui.base.t.makeText(this, 2131302637, 1).show();
          paramString = new Intent(this.mController.ylL, ChatroomInfoUI.class);
          paramString.putExtra("RoomInfo_Id", this.ejD);
          paramString.putExtra("Chat_User", this.ejD);
          paramString.putExtra("Is_Chatroom", true);
          paramString.setFlags(67108864);
          this.mController.ylL.startActivity(paramString);
          finish();
          AppMethodBeat.o(104466);
        }
    while (true)
    {
      return;
      ab.i("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer successfully],owner_username:%s", new Object[] { ((com.tencent.mm.chatroom.c.p)paramm).username });
      break;
      com.tencent.mm.ui.base.t.makeText(this, 2131302636, 1).show();
      ab.w("MicroMsg.TransferRoomOwnerUI", "dz[onSceneEnd transfer failed: %d %d %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(104466);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.TransferRoomOwnerUI
 * JD-Core Version:    0.6.2
 */