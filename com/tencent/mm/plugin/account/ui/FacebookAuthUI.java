package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.az.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.v;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.f.a.d;
import com.tencent.mm.ui.f.a.d.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FacebookAuthUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private static final String[] gAu = { "public_profile" };
  private com.tencent.mm.ui.base.preference.f ehK;
  private d gAT;
  private boolean gAU;
  private boolean gAV;
  private String gAW;
  private final Map<String, Preference> gAX;
  private com.tencent.mm.sdk.b.c gAY;
  private ProgressDialog gAr;
  private DialogInterface.OnCancelListener gAs;
  private v gAt;
  private com.tencent.mm.ui.f.a.c gyN;

  public FacebookAuthUI()
  {
    AppMethodBeat.i(124787);
    this.gAU = false;
    this.gAV = false;
    this.gAW = "";
    this.gAX = new HashMap();
    this.gAY = new FacebookAuthUI.1(this);
    AppMethodBeat.o(124787);
  }

  private void aqL()
  {
    AppMethodBeat.i(124793);
    this.gAr = ProgressDialog.show(this, getString(2131297061), getString(2131299528), true);
    this.gAr.setOnCancelListener(this.gAs);
    this.gAt = new v(1, this.gAW);
    g.Rg().a(this.gAt, 0);
    dp(true);
    com.tencent.mm.plugin.report.service.h.pYm.a(582L, 1L, 1L, false);
    AppMethodBeat.o(124793);
  }

  private void aqM()
  {
    AppMethodBeat.i(124794);
    this.ehK.removeAll();
    boolean bool;
    Preference localPreference;
    int i;
    if (this.gAU)
    {
      bool = false;
      if (this.gAX.containsKey("facebook_auth_tip"))
      {
        localPreference = (Preference)this.gAX.get("facebook_auth_tip");
        if (!bool)
          break label169;
        i = 2131299537;
        label59: localPreference.setTitle(i);
        this.ehK.b(localPreference);
      }
      if (this.gAX.containsKey("facebook_auth_cat"))
      {
        localPreference = (Preference)this.gAX.get("facebook_auth_cat");
        this.ehK.b(localPreference);
      }
      if (bool)
        break label175;
      if (!this.gAX.containsKey("facebook_auth_bind_btn"))
        break label330;
      localPreference = (Preference)this.gAX.get("facebook_auth_bind_btn");
      this.ehK.b(localPreference);
      AppMethodBeat.o(124794);
    }
    while (true)
    {
      return;
      bool = r.Za();
      break;
      label169: i = 2131299527;
      break label59;
      label175: if (this.gAX.containsKey("facebook_auth_account"))
      {
        localPreference = (Preference)this.gAX.get("facebook_auth_account");
        localPreference.setTitle(getString(2131299529) + g.RP().Ry().get(65826, null));
        this.ehK.b(localPreference);
      }
      if (this.gAX.containsKey("facebook_auth_cat2"))
      {
        localPreference = (Preference)this.gAX.get("facebook_auth_cat2");
        this.ehK.b(localPreference);
      }
      if (this.gAX.containsKey("facebook_auth_unbind_btn"))
      {
        localPreference = (Preference)this.gAX.get("facebook_auth_unbind_btn");
        this.ehK.b(localPreference);
      }
      label330: AppMethodBeat.o(124794);
    }
  }

  private static void dp(boolean paramBoolean)
  {
    AppMethodBeat.i(124796);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean);
    for (String str = "0"; ; str = "1")
    {
      localArrayList.add(new h.a(32, str));
      ((j)g.K(j.class)).XL().c(new com.tencent.mm.az.h(localArrayList));
      AppMethodBeat.o(124796);
      return;
    }
  }

  public final int JC()
  {
    return 2131165237;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(124792);
    paramf = paramPreference.mKey;
    if (paramf == null)
    {
      ab.e("MicroMsg.FacebookAuthUI", "onPreferenceTreeClick, key is null");
      AppMethodBeat.o(124792);
    }
    while (true)
    {
      return bool;
      if (paramf.equals("facebook_auth_bind_btn"))
      {
        if (com.tencent.mm.pluginsdk.model.app.q.u(this, "com.facebook.katana"))
        {
          if (this.gAT == null)
          {
            this.gAT = new d(getString(2131305891));
            this.gAT.dJd();
          }
          if (!this.gAT.dJc())
          {
            this.gAT.logout();
            this.gAT.a(this, new d.b()
            {
              public final void onCancel()
              {
                AppMethodBeat.i(124780);
                ab.i("MicroMsg.FacebookAuthUI", "facebook-android login cancel!");
                AppMethodBeat.o(124780);
              }

              public final void onError(String paramAnonymousString)
              {
                AppMethodBeat.i(124781);
                ab.i("MicroMsg.FacebookAuthUI", "facebook-android login error! %s", new Object[] { paramAnonymousString });
                com.tencent.mm.ui.base.h.b(FacebookAuthUI.this, FacebookAuthUI.this.getString(2131299530), "", true);
                AppMethodBeat.o(124781);
              }

              public final void onSuccess()
              {
                AppMethodBeat.i(124779);
                ab.i("MicroMsg.FacebookAuthUI", "facebook-android login success!");
                FacebookAuthUI.a(FacebookAuthUI.this, FacebookAuthUI.c(FacebookAuthUI.this).zxJ.getToken());
                FacebookAuthUI.d(FacebookAuthUI.this);
                AppMethodBeat.o(124779);
              }
            }
            , gAu);
          }
        }
        while (true)
        {
          AppMethodBeat.o(124792);
          break;
          aqL();
          continue;
          try
          {
            this.gyN.ie(this);
            this.gyN = new com.tencent.mm.ui.f.a.c(getString(2131305891));
            this.gyN.a(this, gAu, new FacebookAuthUI.a(this, (byte)0));
          }
          catch (Exception paramf)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.FacebookAuthUI", paramf, "", new Object[0]);
          }
        }
      }
      if (paramf.equals("facebook_auth_unbind_btn"))
      {
        com.tencent.mm.ui.base.h.a(this, 2131299535, 2131297061, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(124782);
            String str = FacebookAuthUI.this.getString(2131297061);
            paramAnonymousDialogInterface = FacebookAuthUI.this.getString(2131299538);
            FacebookAuthUI.a(FacebookAuthUI.this, ProgressDialog.show(FacebookAuthUI.this, str, paramAnonymousDialogInterface, true));
            FacebookAuthUI.f(FacebookAuthUI.this).setOnCancelListener(FacebookAuthUI.e(FacebookAuthUI.this));
            paramAnonymousDialogInterface = new y(y.gvX);
            g.Rg().a(paramAnonymousDialogInterface, 0);
            AppMethodBeat.o(124782);
          }
        }
        , new FacebookAuthUI.8(this));
        AppMethodBeat.o(124792);
      }
      else
      {
        AppMethodBeat.o(124792);
        bool = false;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(124791);
    this.gAU = getIntent().getBooleanExtra("is_force_unbind", false);
    this.gAs = new FacebookAuthUI.4(this);
    setMMTitle(2131297514);
    this.ehK.addPreferencesFromResource(2131165237);
    Preference localPreference = this.ehK.aqO("facebook_auth_tip");
    if (localPreference != null)
      this.gAX.put("facebook_auth_tip", localPreference);
    localPreference = this.ehK.aqO("facebook_auth_cat");
    if (localPreference != null)
      this.gAX.put("facebook_auth_cat", localPreference);
    localPreference = this.ehK.aqO("facebook_auth_bind_btn");
    if (localPreference != null)
      this.gAX.put("facebook_auth_bind_btn", localPreference);
    localPreference = this.ehK.aqO("facebook_auth_account");
    if (localPreference != null)
      this.gAX.put("facebook_auth_account", localPreference);
    localPreference = this.ehK.aqO("facebook_auth_cat2");
    if (localPreference != null)
      this.gAX.put("facebook_auth_cat2", localPreference);
    localPreference = this.ehK.aqO("facebook_auth_unbind_btn");
    if (localPreference != null)
      this.gAX.put("facebook_auth_unbind_btn", localPreference);
    setBackBtn(new FacebookAuthUI.5(this));
    AppMethodBeat.o(124791);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(124795);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      ab.i("MicroMsg.FacebookAuthUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 != -1) || (paramInt1 != 1024) || (paramIntent == null))
        break label173;
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      int j = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bo.isNullOrNil(str);
      if (!bo.isNullOrNil(str))
        break label163;
      label101: ab.i("MicroMsg.FacebookAuthUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
      if (j != -217)
        break label173;
      aqL();
      AppMethodBeat.o(124795);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label163: i = str.length();
      break label101;
      label173: if (this.gyN != null)
        this.gyN.h(paramInt1, paramInt2, paramIntent);
      if (this.gAT != null)
        this.gAT.h(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(124795);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124788);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    initView();
    AppMethodBeat.o(124788);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(124798);
    if (paramInt == 4)
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("bind_facebook_succ", this.gAV);
      setResult(-1, localIntent);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(124798);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(124790);
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.gAY);
    g.Rg().b(183, this);
    g.Rg().b(254, this);
    AppMethodBeat.o(124790);
  }

  public void onResume()
  {
    AppMethodBeat.i(124789);
    com.tencent.mm.sdk.b.a.xxA.c(this.gAY);
    super.onResume();
    g.Rg().a(183, this);
    g.Rg().a(254, this);
    aqM();
    AppMethodBeat.o(124789);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(124797);
    if (paramm.getType() == 254)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gAt = new v(0, "");
        g.Rg().a(this.gAt, 0);
        AppMethodBeat.o(124797);
      }
    int i;
    while (true)
    {
      return;
      if (this.gAr != null)
        this.gAr.dismiss();
      if (paramInt2 == -82)
      {
        com.tencent.mm.ui.base.h.a(this, 2131303005, 2131297061, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
        AppMethodBeat.o(124797);
      }
      else if (paramInt2 == -83)
      {
        com.tencent.mm.ui.base.h.a(this, 2131303002, 2131297061, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
        AppMethodBeat.o(124797);
      }
      else if (paramInt2 == -84)
      {
        com.tencent.mm.ui.base.h.a(this, 2131303003, 2131297061, new FacebookAuthUI.11(this));
        AppMethodBeat.o(124797);
      }
      else if (paramInt2 == -85)
      {
        com.tencent.mm.ui.base.h.a(this, 2131303001, 2131297061, new FacebookAuthUI.2(this));
        AppMethodBeat.o(124797);
      }
      else if (paramInt2 == -86)
      {
        com.tencent.mm.ui.base.h.a(this, 2131303007, 2131297061, new FacebookAuthUI.3(this));
        AppMethodBeat.o(124797);
      }
      else if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.z.f(this, paramString, 0);
        AppMethodBeat.o(124797);
      }
      else if (paramInt2 == -217)
      {
        com.tencent.mm.platformtools.z.a(this, com.tencent.mm.platformtools.e.a((com.tencent.mm.modelsimple.q)paramm), paramInt2);
        AppMethodBeat.o(124797);
      }
      else
      {
        paramString = com.tencent.mm.h.a.jY(paramString);
        if (paramString != null)
        {
          paramString.a(this, null, null);
          AppMethodBeat.o(124797);
        }
        else
        {
          AppMethodBeat.o(124797);
          continue;
          if (paramm.getType() != 183)
            break label604;
          if (this.gAr != null)
            this.gAr.dismiss();
          i = ((v)paramm).opType;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            if (i == 0);
            for (paramInt1 = 2131298523; ; paramInt1 = 2131298518)
            {
              Toast.makeText(this, paramInt1, 1).show();
              this.gAU = false;
              aqM();
              if (i == 1)
              {
                ((j)g.K(j.class)).XR().aoX("facebookapp");
                ((j)g.K(j.class)).bOr().Rh("facebookapp");
                this.gAV = true;
              }
              AppMethodBeat.o(124797);
              break;
            }
          }
          if ((paramInt1 == 4) && (paramInt2 == -67))
          {
            Toast.makeText(this, 2131299531, 1).show();
            AppMethodBeat.o(124797);
          }
          else
          {
            if ((paramInt1 == 4) && (paramInt2 == -5))
            {
              if (i == 1);
              for (paramInt1 = 2131299525; ; paramInt1 = 2131299534)
              {
                Toast.makeText(this, paramInt1, 1).show();
                AppMethodBeat.o(124797);
                break;
              }
            }
            if (paramInt2 == -106)
            {
              com.tencent.mm.platformtools.z.f(this, paramString, 0);
              AppMethodBeat.o(124797);
            }
            else
            {
              paramString = com.tencent.mm.h.a.jY(paramString);
              if (paramString == null)
                break;
              paramString.a(this, null, null);
              AppMethodBeat.o(124797);
            }
          }
        }
      }
    }
    if (i == 0);
    for (paramInt1 = 2131298522; ; paramInt1 = 2131298517)
    {
      Toast.makeText(this, paramInt1, 1).show();
      label604: AppMethodBeat.o(124797);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookAuthUI
 * JD-Core Version:    0.6.2
 */