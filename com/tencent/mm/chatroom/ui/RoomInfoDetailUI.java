package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.bt.a;
import com.tencent.mm.chatroom.e.b;
import com.tencent.mm.chatroom.ui.preference.SignaturePreference;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.protocal.protobuf.bbr;
import com.tencent.mm.protocal.protobuf.bbs;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.q;

@Deprecated
public class RoomInfoDetailUI extends MMPreference
  implements k.a
{
  private boolean cEH;
  private f ehK;
  private ad ehM;
  private CheckBoxPreference ehT;
  private String ehq;
  private boolean eig = false;
  private String eis;
  private int ekw;
  private SignaturePreference ekx;
  private CheckBoxPreference eky;
  private CheckBoxPreference ekz;
  private boolean isDeleteCancel = false;

  private String JD()
  {
    AppMethodBeat.i(104199);
    Object localObject = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
    if (localObject == null)
    {
      localObject = "";
      AppMethodBeat.o(104199);
    }
    while (true)
    {
      return localObject;
      localObject = ((u)localObject).field_selfDisplayName;
      AppMethodBeat.o(104199);
    }
  }

  private void JL()
  {
    boolean bool = true;
    AppMethodBeat.i(104201);
    if (!this.cEH)
    {
      AppMethodBeat.o(104201);
      return;
    }
    Object localObject = getSharedPreferences(this.eis, 0);
    if (this.ekw == 0)
    {
      setTitleMuteIconVisibility(0);
      if (this.ehT != null)
      {
        this.ehT.uOT = true;
        ((SharedPreferences)localObject).edit().putBoolean("room_msg_notify", true).commit();
      }
      if (this.ekz != null)
        this.ekz.uOT = Kc();
      label95: localObject = this.ehK;
      if (this.ekw != 1)
        break label177;
    }
    while (true)
    {
      ((f)localObject).ce("room_show_msg_count", bool);
      AppMethodBeat.o(104201);
      break;
      if (this.ekw != 1)
        break label95;
      setTitleMuteIconVisibility(8);
      if (this.ehT == null)
        break label95;
      this.ehT.uOT = false;
      ((SharedPreferences)localObject).edit().putBoolean("room_msg_notify", false).commit();
      break label95;
      label177: bool = false;
    }
  }

  private void Kb()
  {
    AppMethodBeat.i(104195);
    this.ekx = ((SignaturePreference)this.ehK.aqO("room_name"));
    this.ehT = ((CheckBoxPreference)this.ehK.aqO("room_msg_notify"));
    this.ekz = ((CheckBoxPreference)this.ehK.aqO("room_show_msg_count"));
    this.eky = ((CheckBoxPreference)this.ehK.aqO("room_msg_show_username"));
    this.ekz.yDf = false;
    AppMethodBeat.o(104195);
  }

  private boolean Kc()
  {
    AppMethodBeat.i(104198);
    boolean bool;
    if ((((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq).field_chatroomdataflag & 0x2) == 0)
    {
      bool = true;
      AppMethodBeat.o(104198);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104198);
    }
  }

  private void Kd()
  {
    AppMethodBeat.i(104200);
    if ((this.ehM != null) && (this.ekx != null))
    {
      Object localObject1 = JD();
      Object localObject2 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
        localObject2 = r.YB();
      if (!bo.isNullOrNil((String)localObject2))
      {
        SignaturePreference localSignaturePreference = this.ekx;
        localObject1 = localObject2;
        if (((String)localObject2).length() <= 0)
          localObject1 = getString(2131303260);
        localSignaturePreference.setSummary(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject1));
        AppMethodBeat.o(104200);
      }
    }
    while (true)
    {
      return;
      this.ekx.setSummary("");
      AppMethodBeat.o(104200);
    }
  }

  public final int JC()
  {
    return 2131165262;
  }

  public final void a(String paramString, m paramm)
  {
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(104196);
    paramPreference = paramPreference.mKey;
    ab.d("MicroMsg.RoomInfoDetailUI", "click key : %s", new Object[] { paramPreference });
    Object localObject;
    if (paramPreference.equals("room_name"))
    {
      paramf = new Intent();
      paramf.setClass(this, e.g.class);
      paramf.putExtra("Contact_mode_name_type", 4);
      localObject = r.Yz();
      paramf.putExtra("Contact_Nick", JD());
      paramf.putExtra("Contact_User", (String)localObject);
      paramf.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
      paramf.putExtra("MMActivity.OverrideExitAnimation", 2131034227);
      this.mController.ylL.startActivityForResult(paramf, 2);
    }
    int i;
    if (paramPreference.equals("room_msg_show_username"))
    {
      paramf = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
      if (!paramf.drX())
      {
        bool2 = true;
        paramf.pq(bool2);
        this.eig = true;
      }
    }
    else
    {
      if (paramPreference.equals("room_msg_notify"))
      {
        if (this.ekw != 0)
          break label818;
        i = 1;
        label194: this.ekw = i;
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL().c(new b(this.ehq, this.ekw));
        this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
        this.ehM.hE(this.ekw);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(this.ehq, this.ehM);
        JL();
        this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
        this.ehK.notifyDataSetChanged();
      }
      if (paramPreference.equals("room_set_chatting_background"))
      {
        paramf = new Intent();
        paramf.putExtra("isApplyToAll", false);
        paramf.putExtra("username", this.ehM.field_username);
        d.b(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", paramf, 1);
      }
      if (paramPreference.equals("room_clear_chatting_history"))
      {
        if (!this.cEH)
          break label824;
        paramf = getString(2131299939);
        label419: String str = getString(2131302520);
        localObject = new RoomInfoDetailUI.2(this);
        h.a(this, paramf, new String[] { str }, null, (h.c)localObject);
      }
      if (paramPreference.equals("room_placed_to_the_top"))
      {
        paramf = getSharedPreferences(this.eis, 0);
        if (this.ehM != null)
        {
          if (!((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aph(this.ehM.field_username))
            break label849;
          t.x(this.ehM.field_username, true);
          label523: paramf.edit().putBoolean("room_placed_to_the_top", ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aph(this.ehM.field_username)).commit();
        }
      }
      if ("room_show_msg_count".equals(paramPreference))
      {
        boolean bool3 = Kc();
        ab.d("MicroMsg.RoomInfoDetailUI", "old value undeliver[%B], now set show msg count[%B]", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool3) });
        if (bool3)
          break label863;
        bool2 = true;
        label620: paramf = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
        if (!bool2)
          break label869;
        paramf.ji(0);
        label653: ab.d("MicroMsg.RoomInfoDetailUI", "update show msg count[%B]", new Object[] { Boolean.valueOf(bool2) });
        ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().c(paramf, new String[0]);
        paramf = r.Yz();
        paramPreference = new bbs();
        paramPreference.vEf = this.ehq;
        paramPreference.jBB = paramf;
        paramPreference.wGd = 2;
        if (!bool2)
          break label877;
        i = 2;
        label735: paramPreference.pXD = i;
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL().c(new j.a(49, paramPreference));
        if (this.ekz != null)
        {
          paramf = this.ekz;
          if (bool3)
            break label883;
        }
      }
    }
    label818: label824: label849: label863: label869: label877: label883: for (boolean bool2 = bool1; ; bool2 = false)
    {
      paramf.uOT = bool2;
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(104196);
      return false;
      bool2 = false;
      break;
      i = 0;
      break label194;
      paramf = getString(2131299938, new Object[] { this.ehM.Oj() });
      break label419;
      t.w(this.ehM.field_username, true);
      break label523;
      bool2 = false;
      break label620;
      paramf.ji(2);
      break label653;
      i = 1;
      break label735;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(104194);
    setMMTitle(2131302656);
    this.ehK = this.yCw;
    this.eis = (getPackageName() + "_preferences");
    this.cEH = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.ehq = getIntent().getStringExtra("RoomInfo_Id");
    if (this.ehq == null)
      this.ehq = getIntent().getStringExtra("Single_Chat_Talker");
    this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ehq);
    if (this.cEH)
    {
      this.ekw = this.ehM.dua;
      Kb();
    }
    while (true)
    {
      setBackBtn(new RoomInfoDetailUI.1(this));
      AppMethodBeat.o(104194);
      return;
      this.ekw = 1;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104202);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(104202);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    String str1;
    do
    {
      do
      {
        AppMethodBeat.o(104202);
        break;
      }
      while (paramInt2 != -1);
      setResult(-1);
      finish();
      AppMethodBeat.o(104202);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(104202);
        break;
      }
      str1 = bo.bc(paramIntent.getStringExtra("Contact_Nick"), "");
    }
    while (bo.isNullOrNil(str1));
    String str2 = r.Yz();
    paramIntent = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
    if (paramIntent == null)
      paramIntent = new u();
    while (true)
    {
      paramIntent.field_chatroomname = this.ehq;
      paramIntent.field_selfDisplayName = str1;
      ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().c(paramIntent, new String[0]);
      paramIntent = new bbr();
      paramIntent.vEf = this.ehq;
      paramIntent.jBB = str2;
      paramIntent.vXl = bo.nullAsNil(str1);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL().c(new j.a(48, paramIntent));
      Kd();
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104192);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(104192);
  }

  public void onPause()
  {
    AppMethodBeat.i(104197);
    super.onPause();
    Object localObject;
    if (this.eig)
    {
      localObject = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(this.ehq);
      ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
      String str = r.Yz();
      boolean bool = ((u)localObject).drX();
      localObject = new bbs();
      ((bbs)localObject).vEf = this.ehq;
      ((bbs)localObject).jBB = str;
      ((bbs)localObject).wGd = 1;
      if (!bool)
        break label148;
    }
    label148: for (int i = 1; ; i = 0)
    {
      ((bbs)localObject).pXD = i;
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL().c(new j.a(49, (a)localObject));
      AppMethodBeat.o(104197);
      return;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(104193);
    super.onResume();
    JL();
    Kd();
    SharedPreferences localSharedPreferences;
    if ((this.ehM != null) && (this.eky != null))
    {
      u localu = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().ob(this.ehq);
      localSharedPreferences = getSharedPreferences(this.eis, 0);
      if (!localu.drX())
        break label116;
      this.eky.uOT = true;
      localSharedPreferences.edit().putBoolean("room_msg_show_username", true).commit();
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(104193);
      return;
      label116: this.eky.uOT = false;
      localSharedPreferences.edit().putBoolean("room_msg_show_username", false).commit();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomInfoDetailUI
 * JD-Core Version:    0.6.2
 */