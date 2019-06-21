package com.tencent.mm.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.i;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.cb;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.contact.s;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@i
public class SingleChatInfoUI extends MMPreference
  implements com.tencent.mm.bg.a
{
  private static boolean isDeleteCancel = false;
  private f ehK;
  private ad ehM;
  private ContactListExpandPreference ehS;
  private CheckBoxPreference ehT;
  private CheckBoxPreference ehV;
  private SharedPreferences ehZ;
  private boolean eif;
  private int eii;
  private boolean eik;
  private com.tencent.mm.pluginsdk.ui.d ein;
  boolean eio;
  private String eis;
  private ak handler;
  private String talker;
  private CheckBoxPreference yqk;
  private k.a yql;

  public SingleChatInfoUI()
  {
    AppMethodBeat.i(29880);
    this.handler = new ak(Looper.getMainLooper());
    this.ehZ = null;
    this.eii = -1;
    this.eik = false;
    this.ein = new com.tencent.mm.pluginsdk.ui.d(new SingleChatInfoUI.1(this));
    this.yql = new SingleChatInfoUI.3(this);
    this.eio = false;
    this.eis = "";
    AppMethodBeat.o(29880);
  }

  private void JL()
  {
    AppMethodBeat.i(29890);
    if (this.ehZ == null)
      this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.eif = this.ehM.DX();
    if (this.eif)
    {
      setTitleMuteIconVisibility(0);
      if (this.ehT != null)
        this.ehZ.edit().putBoolean("room_notify_new_msg", true).commit();
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(29890);
      return;
      setTitleMuteIconVisibility(8);
      if (this.ehT != null)
        this.ehZ.edit().putBoolean("room_notify_new_msg", false).commit();
    }
  }

  private void b(ProgressDialog paramProgressDialog)
  {
    AppMethodBeat.i(29889);
    bf.a(this.ehM.field_username, new SingleChatInfoUI.9(this, paramProgressDialog));
    this.handler.post(new SingleChatInfoUI.2(this));
    AppMethodBeat.o(29889);
  }

  private void dzc()
  {
    int i = 0;
    AppMethodBeat.i(29887);
    this.yqk = ((CheckBoxPreference)this.ehK.aqO("force_notify"));
    if ((ad.aox(this.ehM.field_username)) || (r.mG(this.ehM.field_username)))
    {
      this.ehK.ce("force_notify", true);
      AppMethodBeat.o(29887);
      return;
    }
    long l = ((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).Mo(this.ehM.field_username);
    boolean bool = ((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).Mp(this.ehM.field_username);
    this.yqk.uOT = bool;
    this.yqk.qg(bool);
    if (this.yqk.isChecked())
    {
      this.yqk.setSummary(getResources().getString(2131300025, new Object[] { new SimpleDateFormat("HH:mm").format(new Date(l)) }));
      if (this.ehZ == null)
        this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
      this.ehZ.edit().putBoolean("force_notify", this.yqk.isChecked()).commit();
      if (!this.yqk.isChecked())
        break label333;
    }
    label333: for (int j = i; ; j = 8)
    {
      Nd(j);
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(29887);
      break;
      this.yqk.setSummary(null);
      if (this.ehM.DX());
      for (j = 0; ; j = 8)
      {
        setTitleMuteIconVisibility(j);
        break;
      }
    }
  }

  public final int JC()
  {
    return 2131165264;
  }

  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(29892);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, this.nDp, paramSharedPreferences);
    AppMethodBeat.o(29892);
    return paramSharedPreferences;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(29888);
    paramf = paramPreference.mKey;
    if (paramf.equals("room_notify_new_msg"))
      if (!this.eif)
      {
        this.eif = bool;
        if (!this.eif)
          break label156;
        t.o(this.ehM);
        label48: this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.talker);
        if (this.ehZ == null)
          this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.ehZ.edit().putBoolean("room_notify_new_msg", this.eif).commit();
        JL();
      }
    while (true)
    {
      AppMethodBeat.o(29888);
      return false;
      bool = false;
      break;
      label156: t.p(this.ehM);
      break label48;
      if (paramf.equals("room_placed_to_the_top"))
      {
        paramf = getSharedPreferences(this.eis, 0);
        if (this.ehM != null)
        {
          aw.ZK();
          if (c.XR().aph(this.ehM.field_username))
            t.x(this.ehM.field_username, true);
          while (true)
          {
            paramf = paramf.edit();
            aw.ZK();
            paramf.putBoolean("room_placed_to_the_top", c.XR().aph(this.ehM.field_username)).commit();
            break;
            t.w(this.ehM.field_username, true);
          }
        }
      }
      else if (paramf.equals("force_notify"))
      {
        if (!this.yqk.isChecked())
        {
          ((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).am(this.ehM.field_username, 3);
          this.yqk.setSummary(null);
        }
        else
        {
          ((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).Mn(this.ehM.field_username);
          long l = ((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).Mo(this.ehM.field_username);
          this.yqk.setSummary(getResources().getString(2131300025, new Object[] { new SimpleDateFormat("HH:mm").format(new Date(l)) }));
        }
      }
      else if (paramf.equals("room_set_chatting_background"))
      {
        paramf = new Intent();
        paramf.putExtra("isApplyToAll", false);
        paramf.putExtra("username", this.ehM.field_username);
        com.tencent.mm.bp.d.b(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", paramf, 2);
      }
      else if (paramf.equals("room_search_chatting_content"))
      {
        paramf = new Intent();
        paramf.putExtra("detail_username", this.talker);
        com.tencent.mm.plugin.fts.a.d.c(this, ".ui.FTSChattingConvUI", paramf);
        com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      }
      else if (paramf.equals("room_clear_chatting_history"))
      {
        paramf = getString(2131299938, new Object[] { this.ehM.Oj() });
        com.tencent.mm.ui.base.h.a(this.mController.ylL, paramf, "", getString(2131296871), getString(2131296868), new SingleChatInfoUI.10(this), null, 2131689665);
      }
      else if (paramf.equals("room_expose"))
      {
        paramf = new Intent();
        paramf.putExtra("k_username", this.talker);
        paramf.putExtra("showShare", false);
        paramf.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(39) }));
        com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
      }
      else if (paramf.equals("chat_app_brand"))
      {
        paramf = new Intent();
        paramf.putExtra("Chat_User", this.talker);
        com.tencent.mm.bp.d.f(this, ".ui.chatting.gallery.AppBrandHistoryListUI", paramf);
        com.tencent.mm.plugin.report.service.h.pYm.a(219L, 25L, 1L, true);
      }
    }
  }

  protected final void initView()
  {
    AppMethodBeat.i(29886);
    if (this.ehM == null)
    {
      ab.e("MicroMsg.SingleChatInfoUI", "[initView] contact is null!");
      finish();
    }
    this.ehK = this.yCw;
    setMMTitle(getString(2131302657));
    this.ehS = ((ContactListExpandPreference)this.ehK.aqO("roominfo_contact_anchor"));
    this.ehS.a(this.ehK, this.ehS.mKey);
    this.ehS.oD(true).oE(false);
    if ((this.ehM != null) && (this.ehM.field_deleteFlag == 1))
      this.ehS.oD(false);
    if ((!s.dIh()) && (this.ehM != null) && (ad.aox(this.ehM.field_username)))
      this.ehS.oD(false);
    this.ehT = ((CheckBoxPreference)this.ehK.aqO("room_notify_new_msg"));
    this.ehV = ((CheckBoxPreference)this.ehK.aqO("room_placed_to_the_top"));
    Object localObject = this.ehK;
    boolean bool;
    if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
    {
      bool = true;
      ((f)localObject).ce("force_notify", bool);
      if (this.ehZ == null)
        this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
      if (this.ehM == null)
        break label478;
      localObject = this.ehZ.edit();
      aw.ZK();
      ((SharedPreferences.Editor)localObject).putBoolean("room_placed_to_the_top", c.XR().aph(this.ehM.field_username)).commit();
      this.eif = this.ehM.DX();
      this.ehZ.edit().putBoolean("room_notify_new_msg", this.eif).commit();
    }
    while (true)
    {
      aw.ZK();
      this.eii = c.XO().Rq(this.talker);
      this.ehK.notifyDataSetChanged();
      if (this.ehS != null)
      {
        localObject = new LinkedList();
        ((List)localObject).add(this.talker);
        this.ehS.u(this.talker, (List)localObject);
        this.nDp.setOnScrollListener(this.ein);
        this.ehS.a(this.ein);
        this.ehS.a(new SingleChatInfoUI.5(this));
      }
      setBackBtn(new SingleChatInfoUI.6(this));
      AppMethodBeat.o(29886);
      return;
      bool = false;
      break;
      label478: this.ehZ.edit().putBoolean("room_notify_new_msg", false).commit();
      this.eif = false;
    }
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(29891);
    if ((paramString1.equals(this.talker)) && (this.ehS != null))
      this.ehS.notifyChanged();
    AppMethodBeat.o(29891);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(29885);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(29885);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(29885);
        break;
      case 2:
        if (paramInt2 == -1)
        {
          finish();
          AppMethodBeat.o(29885);
        }
        else
        {
          AppMethodBeat.o(29885);
        }
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29881);
    super.onCreate(paramBundle);
    ((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).bxV().c(this.yql);
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.a(this);
    this.talker = getIntent().getStringExtra("Single_Chat_Talker");
    this.eik = getIntent().getBooleanExtra("fromChatting", false);
    this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.talker);
    if (this.ehM == null)
    {
      ab.e("MicroMsg.SingleChatInfoUI", "contact is null! talker:%s", new Object[] { this.talker });
      finish();
      AppMethodBeat.o(29881);
    }
    while (true)
    {
      return;
      this.eis = (getPackageName() + "_preferences");
      initView();
      ((com.tencent.mm.plugin.forcenotify.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.a.class)).e(this.ehM.field_username, 3, cb.aaE() / 1000L);
      AppMethodBeat.o(29881);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(29884);
    ((com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).bxV().d(this.yql);
    com.tencent.mm.ui.g.a.dismiss();
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.b(this);
    super.onDestroy();
    AppMethodBeat.o(29884);
  }

  public void onPause()
  {
    AppMethodBeat.i(29883);
    super.onPause();
    AppMethodBeat.o(29883);
  }

  public void onResume()
  {
    AppMethodBeat.i(29882);
    JL();
    Object localObject;
    if (this.ehS != null)
    {
      localObject = new LinkedList();
      ((List)localObject).add(this.talker);
      this.ehS.u(this.talker, (List)localObject);
    }
    dzc();
    this.ehK.notifyDataSetChanged();
    super.onResume();
    if (!this.eio)
    {
      localObject = getIntent().getStringExtra("need_matte_high_light_item");
      if (!ah.isNullOrNil((String)localObject))
      {
        int i = this.ehK.aqQ((String)localObject);
        setSelection(i - 3);
        new ak().postDelayed(new SingleChatInfoUI.4(this, i), 10L);
      }
      this.eio = true;
    }
    AppMethodBeat.o(29882);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class a
    implements DialogInterface.OnCancelListener
  {
    public final void onCancel(DialogInterface paramDialogInterface)
    {
      AppMethodBeat.i(29879);
      SingleChatInfoUI.pZ(true);
      AppMethodBeat.o(29879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI
 * JD-Core Version:    0.6.2
 */