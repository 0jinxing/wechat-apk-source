package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.bb;
import com.tencent.mm.g.a.bb.a;
import com.tencent.mm.g.a.os;
import com.tencent.mm.g.a.os.b;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.x.c;

public class SettingsAccountInfoUI extends MMPreference
  implements n.b
{
  private f ehK;
  private EditText qmA;
  private boolean qmB;
  private SparseIntArray qmC;
  private View qmy;
  private TextView qmz;

  public SettingsAccountInfoUI()
  {
    AppMethodBeat.i(127143);
    this.qmC = new SparseIntArray();
    this.qmC.put(0, 2131303067);
    this.qmC.put(-82, 2131303005);
    this.qmC.put(-83, 2131303002);
    this.qmC.put(-84, 2131303003);
    this.qmC.put(-85, 2131302996);
    this.qmC.put(-86, 2131303007);
    AppMethodBeat.o(127143);
  }

  private void ciI()
  {
    AppMethodBeat.i(127150);
    Preference localPreference = this.ehK.aqO("settings_username");
    String str = r.YA();
    if (bo.isNullOrNil(str))
    {
      str = r.Yz();
      if (ad.aoA(str))
      {
        localPreference.setSummary(getString(2131303190));
        if (!ad.aoB(r.Yz()))
          localPreference.NW(8);
        AppMethodBeat.o(127150);
      }
    }
    while (true)
    {
      return;
      localPreference.setSummary(str);
      break;
      localPreference.setSummary(str);
      localPreference.NW(8);
      AppMethodBeat.o(127150);
    }
  }

  private void ciJ()
  {
    AppMethodBeat.i(127151);
    if (this.ehK.aqO("settings_manage_login_device") == null)
    {
      ab.e("MicroMsg.SettingsAccountInfoUI", "safedevicesate preference is null");
      AppMethodBeat.o(127151);
    }
    while (true)
    {
      return;
      this.ehK.ce("settings_manage_login_device", false);
      AppMethodBeat.o(127151);
    }
  }

  private void ciK()
  {
    AppMethodBeat.i(127152);
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.ehK.aqO("settings_mobile");
    if (localIconSwitchKeyValuePreference == null)
    {
      ab.e("MicroMsg.SettingsAccountInfoUI", "updateMobile Preference null");
      AppMethodBeat.o(127152);
    }
    while (true)
    {
      return;
      String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, null);
      ab.d("MicroMsg.SettingsAccountInfoUI", "mobile :".concat(String.valueOf(str)));
      if ((str == null) || (str.length() <= 0))
      {
        localIconSwitchKeyValuePreference.setSummary(getString(2131303052));
        localIconSwitchKeyValuePreference.NS(0);
        AppMethodBeat.o(127152);
      }
      else
      {
        localIconSwitchKeyValuePreference.setSummary(str);
        localIconSwitchKeyValuePreference.NS(1);
        AppMethodBeat.o(127152);
      }
    }
  }

  private void ciL()
  {
    boolean bool = true;
    AppMethodBeat.i(127153);
    Object localObject = new bb();
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    if ((((bb)localObject).cuk.cul) && (((bb)localObject).cuk.cum) && (((bb)localObject).cuk.cun));
    for (int i = 1; ; i = 0)
    {
      ab.i("MicroMsg.SettingsAccountInfoUI", "check is support soter, isSupportSoter: %b, isSupportFP: %b, isSystemHasFPEnrolled: %b", new Object[] { Boolean.valueOf(((bb)localObject).cuk.cul), Boolean.valueOf(((bb)localObject).cuk.cum), Boolean.valueOf(((bb)localObject).cuk.cun) });
      localObject = this.ehK;
      if (i == 0);
      while (true)
      {
        ((f)localObject).ce("settings_fingerprint_title", bool);
        AppMethodBeat.o(127153);
        return;
        bool = false;
      }
    }
  }

  public final int JC()
  {
    return 2131165278;
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(127149);
    ciI();
    ciK();
    ciJ();
    ciL();
    AppMethodBeat.o(127149);
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(127148);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.SettingsAccountInfoUI", paramf + " item has been clicked!");
    r.Yz();
    if (bo.isNullOrNil(paramf))
    {
      AppMethodBeat.o(127148);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramf.equals("settings_username")) && (bo.isNullOrNil(r.YA())) && (ad.aoB(r.Yz())))
        aA(SettingsAliasUI.class);
      if (!paramf.equals("settings_mobile"))
        break;
      paramf = new Intent(this, BindMContactIntroUI.class);
      paramf.putExtra("key_upload_scene", 4);
      MMWizardActivity.J(this, paramf);
      AppMethodBeat.o(127148);
    }
    if (paramf.equals("settings_about_vuser_about"))
    {
      paramf = String.format("https://weixin.qq.com/cgi-bin/readtemplate?check=false&t=weixin_faq_verifyaccount&platform=android&lang=%s", new Object[] { aa.dor() });
      bo.M(this.mController.ylL, paramf);
    }
    while (true)
    {
      AppMethodBeat.o(127148);
      bool = false;
      break;
      if (paramf.equals("settings_independent_password"))
      {
        paramf = new Intent();
        paramf.putExtra("kintent_hint", getString(2131303155));
        a(RegByMobileSetPwdUI.class, paramf);
      }
      else if (paramf.equals("settings_manage_login_device"))
      {
        d.H(this, "account", ".security.ui.MySafeDeviceListUI");
      }
      else if (paramf.equals("settings_security_center"))
      {
        paramf = getString(2131305634);
        paramPreference = paramf + aa.dor();
        AppCompatActivity localAppCompatActivity = this.mController.ylL;
        paramf = new Intent();
        paramf.putExtra("rawUrl", paramPreference);
        paramf.putExtra("showShare", true);
        paramf.putExtra("show_bottom", false);
        paramf.putExtra("needRedirect", false);
        paramf.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
        paramf.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
        d.b(localAppCompatActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramf);
      }
      else if (paramf.equals("settings_voiceprint_title"))
      {
        if ((bo.getInt(com.tencent.mm.m.g.Nu().getValue("VoiceprintEntry"), 0) == 1) && ((com.tencent.mm.kernel.g.RP().Ry().getInt(40, 0) & 0x20000) == 0))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJJ, Boolean.FALSE);
          ((IconPreference)this.ehK.aqO("settings_voiceprint_title")).NL(8);
          this.ehK.notifyDataSetChanged();
          ab.i("MicroMsg.SettingsAccountInfoUI", "unset setting account info new show");
        }
        d.H(this.mController.ylL, "voiceprint", "com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI");
      }
      else if (paramf.equals("settings_facedect_title"))
      {
        paramf = new os();
        paramf.cLf.context = this;
        com.tencent.mm.sdk.b.a.xxA.m(paramf);
        bool = paramf.cLg.cKV;
        ab.i("MicroMsg.SettingsAccountInfoUI", "hy: is start to face settings succ: %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          t.makeText(this.mController.ylL, getString(2131299511), 0).show();
      }
      else if (paramf.equals("settings_trust_friend"))
      {
        aA(SettingsTrustFriendUI.class);
      }
      else if (paramf.equals("settings_more_safe"))
      {
        c.PK().c(ac.a.xUP, ac.a.xUQ);
        aA(SettingsMoreSafeUI.class);
      }
    }
  }

  public final boolean aqT()
  {
    return true;
  }

  public final void initView()
  {
    AppMethodBeat.i(127146);
    setMMTitle(2131303027);
    this.ehK = this.yCw;
    this.qmy = View.inflate(this, 2130970617, null);
    this.qmz = ((TextView)this.qmy.findViewById(2131827352));
    this.qmz.setText(getString(2131303108));
    this.qmA = ((EditText)this.qmy.findViewById(2131827353));
    this.qmA.setInputType(129);
    if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("VoiceprintEntry"), 0) != 1)
      this.ehK.ce("settings_voiceprint_title", true);
    while (true)
    {
      setBackBtn(new SettingsAccountInfoUI.1(this));
      AppMethodBeat.o(127146);
      while (true)
      {
        return;
        if (com.tencent.mm.kernel.g.RK())
          break;
        ab.e("MicroMsg.SettingsAccountInfoUI", "update voiceprint dot, account not ready!");
        AppMethodBeat.o(127146);
      }
      IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_voiceprint_title");
      if ((((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJJ, Boolean.TRUE)).booleanValue()) && ((com.tencent.mm.kernel.g.RP().Ry().getInt(40, 0) & 0x20000) == 0))
      {
        localIconPreference.ey(getString(2131296988), 2130839673);
        localIconPreference.NL(0);
        ab.i("MicroMsg.SettingsAccountInfoUI", "show voiceprint dot");
        this.ehK.notifyDataSetChanged();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127144);
    super.onCreate(paramBundle);
    initView();
    com.tencent.mm.kernel.g.RP().Ry().a(this);
    AppMethodBeat.o(127144);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127145);
    super.onDestroy();
    com.tencent.mm.kernel.g.RP().Ry().b(this);
    AppMethodBeat.o(127145);
  }

  public void onResume()
  {
    AppMethodBeat.i(127147);
    ciI();
    ciK();
    this.qmB = false;
    Object localObject = (IconPreference)this.ehK.aqO("settings_more_safe");
    SelfVuserPreference localSelfVuserPreference;
    Preference localPreference;
    if (c.PK().b(ac.a.xUP, ac.a.xUQ))
    {
      ((IconPreference)localObject).NN(0);
      ciJ();
      ciL();
      this.ehK.ce("settings_facedect_title", true);
      localObject = (PluginTextPreference)this.ehK.aqO("settings_about_vusertitle");
      localSelfVuserPreference = (SelfVuserPreference)this.ehK.aqO("settings_about_vuserinfo");
      localPreference = this.ehK.aqO("settings_about_vuser_about");
      int i = bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(66049, null));
      if (i == 0)
        break label242;
      ((PluginTextPreference)localObject).visibility = 8;
      ((PluginTextPreference)localObject).NV(2131298745);
      if (ao.a.flw == null)
        break label237;
      localObject = BackwardSupportUtil.b.i(ao.a.flw.ky(i), 2.0F);
      label181: localSelfVuserPreference.drawable = new BitmapDrawable(getResources(), (Bitmap)localObject);
      localSelfVuserPreference.text = ((String)com.tencent.mm.kernel.g.RP().Ry().get(66050, null));
    }
    while (true)
    {
      super.onResume();
      AppMethodBeat.o(127147);
      return;
      ((IconPreference)localObject).NN(8);
      break;
      label237: localObject = null;
      break label181;
      label242: this.ehK.d((Preference)localObject);
      this.ehK.d(localSelfVuserPreference);
      this.ehK.d(localPreference);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI
 * JD-Core Version:    0.6.2
 */