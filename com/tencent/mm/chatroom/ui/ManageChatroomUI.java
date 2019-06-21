package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.ui.preference.RoomManagerPreference;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.d.q;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bbp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class ManageChatroomUI extends MMPreference
{
  private f ehK;
  private SharedPreferences ehZ = null;
  CheckBoxPreference ejB;
  RoomManagerPreference ejC;
  private String ejD;
  private String ejE;

  public final int JC()
  {
    return 2131165249;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    int i = 2;
    int j = 1;
    AppMethodBeat.i(104115);
    paramf = paramPreference.mKey;
    ab.d("MicroMsg.ManageChatroomUI", "[onPreferenceTreeClick] key:%s", new Object[] { paramf });
    if (paramf.equals("room_transfer_room_ower"))
    {
      ab.i("MicroMsg.ManageChatroomUI", "[selectNewRoomOwner] roomId:%s", new Object[] { this.ejD });
      paramPreference = bo.c(n.my(this.ejD), ",");
      paramf = new Intent();
      paramf.putExtra("Block_list", r.Yz());
      paramf.putExtra("Chatroom_member_list", paramPreference);
      paramf.putExtra("from_scene", 2);
      paramf.putExtra("RoomInfo_Id", this.ejD);
      paramf.putExtra("is_show_owner", false);
      paramf.putExtra("title", getString(2131302628));
      paramf.setClass(this, TransferRoomOwnerUI.class);
      startActivity(paramf);
    }
    do
    {
      AppMethodBeat.o(104115);
      return false;
      if (paramf.equals("allow_by_identity"))
      {
        boolean bool = this.ejB.isChecked();
        h.pYm.a(219L, 22L, 1L, true);
        ab.i("MicroMsg.ManageChatroomUI", "[selectAllowByIdentity] roomId:%s isOpen:%s", new Object[] { this.ejD, Boolean.valueOf(bool) });
        if (t.mP(this.ejD))
        {
          paramPreference = ((j)g.K(j.class)).XL();
          paramf = bo.nullAsNil(this.ejD);
          if (bool == true);
          while (true)
          {
            paramPreference.c(new q(paramf, j));
            this.ejB.yDf = false;
            break;
            j = 0;
          }
        }
        paramf = new bbp();
        paramf.vEf = bo.nullAsNil(this.ejD);
        if (bool == true);
        for (j = i; ; j = 0)
        {
          paramf.pXD = j;
          paramf = new j.a(66, paramf);
          ((j)g.K(j.class)).XL().c(paramf);
          break;
        }
      }
    }
    while (!paramf.equals("room_manager"));
    ab.i("MicroMsg.ManageChatroomUI", "[selectRoomManager] roomId:%s", new Object[] { this.ejD });
    paramf = ((c)g.K(c.class)).XV().oa(this.ejD);
    paramPreference = new Intent();
    if (paramf.aoo(r.Yz()))
      paramPreference.setClass(this, SeeRoomOwnerManagerUI.class);
    while (true)
    {
      paramPreference.putExtra("RoomInfo_Id", this.ejD);
      startActivity(paramPreference);
      break;
      paramPreference.setClass(this, SeeRoomManagerUI.class);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104116);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(104116);
      while (true)
      {
        return;
        if (paramIntent == null)
        {
          AppMethodBeat.o(104116);
        }
        else
        {
          paramInt1 = paramIntent.getIntExtra("into_room_type", -1);
          ab.i("MicroMsg.ManageChatroomUI", "[openVerify] roomId:%s, type:%s", new Object[] { this.ejD, Integer.valueOf(paramInt1) });
          paramIntent = new bbp();
          paramIntent.vEf = bo.nullAsNil(this.ejD);
          paramIntent.pXD = paramInt1;
          paramIntent = new j.a(66, paramIntent);
          ((j)g.K(j.class)).XL().c(paramIntent);
          AppMethodBeat.o(104116);
        }
      }
      ab.i("MicroMsg.ManageChatroomUI", "[onActivityResult] requestCode:%s", new Object[] { Integer.valueOf(2) });
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104112);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.ManageChatroomUI", "[onCreate]");
    this.ejD = getIntent().getStringExtra("RoomInfo_Id");
    this.ejE = getIntent().getStringExtra("room_owner_name");
    AppMethodBeat.o(104112);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104114);
    super.onDestroy();
    AppMethodBeat.o(104114);
  }

  public void onResume()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(104113);
    Object localObject1 = ((c)g.K(c.class)).XV().oa(this.ejD);
    Object localObject2;
    if ((localObject1 != null) && (this.ehZ == null))
    {
      this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
      localObject2 = this.ehZ.edit();
      if (((u)localObject1).drV() == 2)
      {
        bool3 = true;
        ((SharedPreferences.Editor)localObject2).putBoolean("allow_by_identity", bool3).commit();
      }
    }
    else
    {
      super.onResume();
      this.ehK = this.yCw;
      if (this.ehK != null)
      {
        setMMTitle(2131301398);
        this.ejB = ((CheckBoxPreference)this.ehK.aqO("allow_by_identity"));
        this.ejC = ((RoomManagerPreference)this.ehK.aqO("room_manager"));
        localObject2 = this.ehK;
        if (((c)g.K(c.class)).HH(this.ejD))
          break label404;
        bool3 = true;
        label206: ((f)localObject2).ce("room_manager", bool3);
        this.ehK.ce("select_enable_qrcode", true);
        this.ehK.ce("select_into_room_type", true);
        if (!r.Yz().equals(this.ejE))
          this.ehK.ce("room_transfer_room_ower", true);
        localObject2 = ((c)g.K(c.class)).XV().oa(this.ejD);
        if (localObject2 != null)
        {
          if (!t.mP(this.ejD))
            break label422;
          if (((u)localObject2).drV() != 1)
            break label410;
          bool3 = true;
          label319: ab.i("MicroMsg.ManageChatroomUI", "isChecked = %s", new Object[] { Boolean.valueOf(bool3) });
          localObject1 = this.ejB;
          if (((u)localObject2).drV() != 1)
            break label416;
        }
      }
    }
    label404: label410: label416: for (boolean bool3 = bool2; ; bool3 = false)
    {
      ((CheckBoxPreference)localObject1).uOT = bool3;
      this.ejB.yDf = false;
      setBackBtn(new ManageChatroomUI.1(this));
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(104113);
      return;
      bool3 = false;
      break;
      bool3 = false;
      break label206;
      bool3 = false;
      break label319;
    }
    label422: localObject1 = this.ejB;
    if (((u)localObject2).drV() == 2);
    for (bool3 = bool1; ; bool3 = false)
    {
      ((CheckBoxPreference)localObject1).uOT = bool3;
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ManageChatroomUI
 * JD-Core Version:    0.6.2
 */