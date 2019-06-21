package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.f.a.d.b;
import org.json.JSONObject;

public class FacebookLoginUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private static final String[] gAu = { "public_profile" };
  private String cOG;
  private com.tencent.mm.ui.f.a.d gAT;
  private String gAW;
  private com.tencent.mm.sdk.b.c gAY;
  private DialogInterface.OnCancelListener gAs;
  private com.tencent.mm.ui.f.a.c gBj;
  private com.tencent.mm.ui.base.p gBk;
  private com.tencent.mm.modelsimple.q gBl;
  private ba gBm;
  private b gBn;
  boolean gBo;
  private String gsF;

  public FacebookLoginUI()
  {
    AppMethodBeat.i(124849);
    this.gAW = "";
    this.cOG = "";
    this.gBm = new ba();
    this.gAY = new FacebookLoginUI.1(this);
    this.gBo = true;
    AppMethodBeat.o(124849);
  }

  private void aqO()
  {
    AppMethodBeat.i(124856);
    getString(2131297061);
    this.gBk = com.tencent.mm.ui.base.h.b(this, getString(2131301031), true, null);
    this.gBk.setOnCancelListener(this.gAs);
    ab.i("MicroMsg.FacebookLoginUI", "dkwt Ready to Facebook auth user[%s] token[%d][%s]", new Object[] { "facebook@wechat_auth", Integer.valueOf(this.gAW.length()), this.gAW.substring(0, 4) });
    this.gBl = new com.tencent.mm.modelsimple.q("facebook@wechat_auth", this.gAW, 0, "", "", "", 0, "", true, false);
    g.Rg().a(this.gBl, 0);
    AppMethodBeat.o(124856);
  }

  private void aqP()
  {
    AppMethodBeat.i(124857);
    if (com.tencent.mm.pluginsdk.model.app.q.u(this, "com.facebook.katana"))
    {
      if (this.gAT == null)
      {
        this.gAT = new com.tencent.mm.ui.f.a.d(getString(2131305891));
        this.gAT.dJd();
      }
      if (!this.gAT.dJc())
      {
        this.gAT.logout();
        this.gAT.a(this, new d.b()
        {
          public final void onCancel()
          {
            AppMethodBeat.i(124834);
            ab.i("MicroMsg.FacebookLoginUI", "facebook-android login cancel!");
            AppMethodBeat.o(124834);
          }

          public final void onError(String paramAnonymousString)
          {
            AppMethodBeat.i(124835);
            ab.i("MicroMsg.FacebookLoginUI", "facebook-android login error! %s", new Object[] { paramAnonymousString });
            com.tencent.mm.ui.base.h.b(FacebookLoginUI.this, FacebookLoginUI.this.getString(2131299530), "", true);
            AppMethodBeat.o(124835);
          }

          public final void onSuccess()
          {
            AppMethodBeat.i(124833);
            ab.i("MicroMsg.FacebookLoginUI", "facebook-android login success!");
            FacebookLoginUI.a(FacebookLoginUI.this, FacebookLoginUI.a(FacebookLoginUI.this).zxJ.getToken());
            FacebookLoginUI.b(FacebookLoginUI.this);
            AppMethodBeat.o(124833);
          }
        }
        , gAu);
      }
    }
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(582L, 5L, 1L, false);
      AppMethodBeat.o(124857);
      return;
      aqO();
      continue;
      try
      {
        if (this.gBj != null)
          this.gBj.ie(this);
        StringBuilder localStringBuilder = new StringBuilder();
        g.RN();
        localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L14,");
        g.RN();
        com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("L14") + ",1");
        this.gBj = new com.tencent.mm.ui.f.a.c(getString(2131305891));
        this.gBj.a(this, gAu, new FacebookLoginUI.a(this, (byte)0));
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FacebookLoginUI", localException, "", new Object[0]);
      }
    }
  }

  private void aqQ()
  {
    AppMethodBeat.i(124859);
    String str = getString(2131298802, new Object[] { "0x" + Integer.toHexString(com.tencent.mm.protocal.d.vxo), aa.dor() });
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", str);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    com.tencent.mm.plugin.account.a.a.gkE.i(localIntent, this);
    AppMethodBeat.o(124859);
  }

  private void goBack()
  {
    AppMethodBeat.i(124855);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    finish();
    AppMethodBeat.o(124855);
  }

  public final int JC()
  {
    return 2131165238;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(124862);
    paramf = paramPreference.mKey;
    if (paramf == null)
    {
      ab.e("MicroMsg.FacebookLoginUI", "onPreferenceTreeClick, key is null");
      AppMethodBeat.o(124862);
    }
    while (true)
    {
      return bool;
      if (paramf.equals("facebook_auth_bind_btn"))
      {
        aqP();
        AppMethodBeat.o(124862);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(124862);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(124860);
    this.gBj = new com.tencent.mm.ui.f.a.c(getString(2131305891));
    this.gAs = new FacebookLoginUI.2(this);
    aqP();
    setBackBtn(new FacebookLoginUI.3(this));
    AppMethodBeat.o(124860);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(124861);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      ab.i("MicroMsg.FacebookLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 != -1) || (paramInt1 != 1024) || (paramIntent == null))
        break label171;
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      int j = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bo.isNullOrNil(str);
      if (!bo.isNullOrNil(str))
        break label161;
      label100: ab.i("MicroMsg.FacebookLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
      if (j != -217)
        break label171;
      aqP();
      AppMethodBeat.o(124861);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label161: i = str.length();
      break label100;
      label171: if (this.gBj != null)
        this.gBj.h(paramInt1, paramInt2, paramIntent);
      if (this.gAT != null)
        this.gAT.h(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(124861);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124850);
    super.onCreate(paramBundle);
    setMMTitle(2131301003);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    g.Rg().a(701, this);
    g.Rg().a(252, this);
    AppMethodBeat.o(124850);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(124851);
    super.onDestroy();
    g.Rg().b(701, this);
    g.Rg().b(252, this);
    AppMethodBeat.o(124851);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(124854);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(124854);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(124854);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(124853);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L100_200_FB,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("L100_200_FB") + ",2");
    AppMethodBeat.o(124853);
  }

  public void onResume()
  {
    AppMethodBeat.i(124852);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",L100_200_FB,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("L100_200_FB") + ",1");
    com.tencent.mm.plugin.b.a.wz("L100_200_FB");
    AppMethodBeat.o(124852);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(124858);
    ab.i("MicroMsg.FacebookLoginUI", "dkwt onSceneEnd: hash:%d type:%d [%d,%d,%s]", new Object[] { Integer.valueOf(paramm.hashCode()), Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.gBk != null)
    {
      this.gBk.dismiss();
      this.gBk = null;
    }
    if (!bo.cv(this))
      AppMethodBeat.o(124858);
    while (true)
    {
      return;
      if (!(paramm instanceof com.tencent.mm.modelsimple.q))
      {
        AppMethodBeat.o(124858);
      }
      else
      {
        this.cOG = ((com.tencent.mm.modelsimple.q)paramm).ajm();
        int i = 0;
        int j;
        if (paramm.getType() != 252)
        {
          j = i;
          if (paramm.getType() != 701);
        }
        else
        {
          j = i;
          if (paramInt1 == 4)
            if (paramInt2 != -16)
            {
              j = i;
              if (paramInt2 != -17);
            }
            else
            {
              j = 1;
              g.Rg().a(new bk(new FacebookLoginUI.9(this)), 0);
            }
        }
        if ((j != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
        {
          com.tencent.mm.kernel.a.unhold();
          l.apX();
          this.gBm.daR = 1L;
          this.gBm.cVS = 12L;
          this.gBm.ajK();
          z.vx(r.Yz());
          w.cm(this);
          z.showAddrBookUploadConfirm(this, new FacebookLoginUI.10(this), false, 2);
          AppMethodBeat.o(124858);
        }
        else if (paramInt2 == -106)
        {
          z.f(this, paramString, 0);
          AppMethodBeat.o(124858);
        }
        else if (paramInt2 == -217)
        {
          z.a(this, e.a((com.tencent.mm.modelsimple.q)paramm), paramInt2);
          AppMethodBeat.o(124858);
        }
        else if ((paramInt2 == -6) || (paramInt2 == -311) || (paramInt2 == -310))
        {
          if (this.gBn == null)
            this.gBn = new b()
            {
              public final com.tencent.mm.ai.m a(com.tencent.mm.ai.m paramAnonymousm, String paramAnonymousString)
              {
                AppMethodBeat.i(124844);
                paramAnonymousm = new com.tencent.mm.modelsimple.q("facebook@wechat_auth", FacebookLoginUI.g(FacebookLoginUI.this), ((com.tencent.mm.modelsimple.q)paramAnonymousm).getSecCodeType(), paramAnonymousString, ((com.tencent.mm.modelsimple.q)paramAnonymousm).ajn(), ((com.tencent.mm.modelsimple.q)paramAnonymousm).ajp(), 0, "", true, false);
                AppMethodBeat.o(124844);
                return paramAnonymousm;
              }
            };
          b localb = this.gBn;
          paramString = ((com.tencent.mm.modelsimple.q)paramm).ajo();
          localb.gAi = paramm;
          if (localb.gue == null)
          {
            localb.gue = SecurityImage.a.a(this, 0, paramString, "", "", new b.1(localb, this), null, new b.2(localb), localb);
            AppMethodBeat.o(124858);
          }
          else
          {
            localb.gue.b(0, paramString, "", "");
            AppMethodBeat.o(124858);
          }
        }
        else
        {
          if (paramInt1 == 4);
          switch (paramInt2)
          {
          default:
            if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
              j = 1;
            break;
          case -1:
          case -4:
          case -3:
          case -9:
          case -72:
          case -75:
          case -107:
          case -30:
          }
          while (true)
          {
            if (j == 0)
              break label757;
            AppMethodBeat.o(124858);
            break;
            if (g.Rg().acS() == 5)
            {
              com.tencent.mm.ui.base.h.g(this, 2131301656, 2131301655);
              j = 1;
            }
            else
            {
              com.tencent.mm.ui.base.h.g(this, 2131299241, 2131301017);
              j = 1;
              continue;
              com.tencent.mm.ui.base.h.g(this, 2131301016, 2131301017);
              j = 1;
              continue;
              com.tencent.mm.ui.base.h.g(this.mController.ylL, 2131302315, 2131297061);
              j = 1;
              continue;
              z.cu(this.mController.ylL);
              j = 1;
              continue;
              com.tencent.mm.ui.base.h.d(this, getString(2131299553), "", getString(2131302336), getString(2131301045), new FacebookLoginUI.7(this), new FacebookLoginUI.8(this));
              j = 1;
              continue;
              if (com.tencent.mm.protocal.d.vxr)
                aqQ();
              j = 1;
              continue;
              j = 0;
            }
          }
          label757: if ((paramm.getType() == 252) || (paramm.getType() == 701))
          {
            paramString = com.tencent.mm.h.a.jY(paramString);
            if ((paramString != null) && (paramString.a(this, null, null)))
              AppMethodBeat.o(124858);
          }
          else
          {
            Toast.makeText(this, getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
            AppMethodBeat.o(124858);
          }
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookLoginUI
 * JD-Core Version:    0.6.2
 */