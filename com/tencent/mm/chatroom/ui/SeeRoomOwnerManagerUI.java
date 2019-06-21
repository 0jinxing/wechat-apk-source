package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.NormalIconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.t;
import java.util.Iterator;
import java.util.List;

public class SeeRoomOwnerManagerUI extends MMPreference
{
  private u eih;
  private String ejD;

  public final int JC()
  {
    return 2131165267;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(104369);
    Object localObject1;
    Object localObject2;
    if ((paramPreference instanceof NormalIconPreference))
    {
      paramf = paramPreference.getExtras().getString("username");
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramf);
      paramPreference = ((ap)localObject1).field_username;
      paramf = ((ad)localObject1).Oj();
      localObject1 = ((ap)localObject1).field_nickname;
      if (!bo.isNullOrNil(paramf))
        break label359;
      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XN().RB(paramPreference);
      if ((localObject2 == null) || (bo.isNullOrNil(((bv)localObject2).field_encryptUsername)))
        break label359;
      paramf = ((bv)localObject2).field_conRemark;
    }
    label359: 
    while (true)
    {
      if (!bo.isNullOrNil(paramPreference))
      {
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Contact_User", paramPreference);
        ((Intent)localObject2).putExtra("Contact_RemarkName", paramf);
        if (this.eih != null)
          ((Intent)localObject2).putExtra("Contact_RoomNickname", this.eih.mJ(paramPreference));
        ((Intent)localObject2).putExtra("Contact_Nick", (String)localObject1);
        ((Intent)localObject2).putExtra("Contact_RoomMember", true);
        ((Intent)localObject2).putExtra("room_name", this.ejD);
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramPreference);
        if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ > 0) && (com.tencent.mm.n.a.jh(((ap)localObject1).field_type)))
        {
          paramf = new qh();
          paramf.cMw.intent = ((Intent)localObject2);
          paramf.cMw.username = paramPreference;
          com.tencent.mm.sdk.b.a.xxA.m(paramf);
        }
        if ((localObject1 != null) && (((ad)localObject1).dsf()))
          h.pYm.X(10298, ((ap)localObject1).field_username + ",14");
        ((Intent)localObject2).putExtra("Contact_Scene", 96);
        ((Intent)localObject2).putExtra("Is_RoomOwner", true);
        ((Intent)localObject2).putExtra("Contact_ChatRoomId", this.ejD);
        d.b(this, "profile", ".ui.ContactInfoUI", (Intent)localObject2);
      }
      AppMethodBeat.o(104369);
      return false;
    }
  }

  public void onCreate(final Bundle paramBundle)
  {
    AppMethodBeat.i(104368);
    super.onCreate(paramBundle);
    setMMTitle(2131302561);
    setBackBtn(new t()
    {
      public final void Kp()
      {
        AppMethodBeat.i(104365);
        SeeRoomOwnerManagerUI.this.finish();
        AppMethodBeat.o(104365);
      }
    });
    this.ejD = getIntent().getStringExtra("RoomInfo_Id");
    this.eih = ((c)g.K(c.class)).XV().oa(bo.nullAsNil(this.ejD));
    Object localObject;
    String str;
    if (this.eih != null)
    {
      paramBundle = new PreferenceTitleCategory(this.mController.ylL);
      paramBundle.setTitle(2131302651);
      this.yCw.b(paramBundle);
      ab.i("MicroMsg.SeeRoomOwnerManagerUI", "[onCreate] owner:%s", new Object[] { this.eih.field_roomowner });
      paramBundle = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.eih.field_roomowner);
      localObject = new NormalIconPreference(this.mController.ylL)
      {
        public final void onBindView(View paramAnonymousView)
        {
          AppMethodBeat.i(104366);
          super.onBindView(paramAnonymousView);
          a.b.a(this.yBV, paramBundle.field_username, 0.15F, false);
          this.yBV.setVisibility(0);
          AppMethodBeat.o(104366);
        }
      };
      ((NormalIconPreference)localObject).setKey(paramBundle.field_username);
      ((NormalIconPreference)localObject).getExtras().putString("username", paramBundle.field_username);
      ((NormalIconPreference)localObject).setTitle(com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, paramBundle.Oj()));
      this.yCw.b((Preference)localObject);
      PreferenceTitleCategory localPreferenceTitleCategory = new PreferenceTitleCategory(this.mController.ylL);
      localPreferenceTitleCategory.setTitle(2131302566);
      paramBundle = this.eih.afg().iterator();
      int i = 0;
      while (paramBundle.hasNext())
      {
        str = (String)paramBundle.next();
        if (this.eih.aoo(str))
        {
          ab.i("MicroMsg.SeeRoomOwnerManagerUI", "[resetData] Room Manager:%s", new Object[] { str });
          if (i != 0)
            break label438;
          this.yCw.b(localPreferenceTitleCategory);
          i = 1;
        }
      }
    }
    label438: 
    while (true)
    {
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
      SeeRoomOwnerManagerUI.3 local3 = new SeeRoomOwnerManagerUI.3(this, this.mController.ylL, (ad)localObject);
      local3.setKey(str);
      local3.getExtras().putString("username", ((ap)localObject).field_username);
      local3.setTitle(com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, ((ad)localObject).Oj()));
      this.yCw.b(local3);
      break;
      this.yCw.notifyDataSetChanged();
      AppMethodBeat.o(104368);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI
 * JD-Core Version:    0.6.2
 */