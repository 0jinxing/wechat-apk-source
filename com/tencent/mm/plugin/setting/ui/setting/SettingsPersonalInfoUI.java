package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ta;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.plugin.setting.ui.widget.HeadImgNewPreference;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.io.File;

public class SettingsPersonalInfoUI extends MMPreference
  implements com.tencent.mm.ai.f, n.b
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private boolean gqB;
  private com.tencent.mm.plugin.setting.model.g qog;

  private void ciI()
  {
    AppMethodBeat.i(127375);
    Preference localPreference = this.ehK.aqO("settings_username");
    String str1 = r.YA();
    String str2 = r.Yz();
    if (bo.isNullOrNil(str1))
      if (ad.aoA(str2))
      {
        localPreference.setSummary(getString(2131303190));
        if (ad.aoB(r.Yz()))
          break label89;
        localPreference.NW(8);
        AppMethodBeat.o(127375);
      }
    while (true)
    {
      return;
      localPreference.setSummary(str2);
      break;
      localPreference.setSummary(str1);
      localPreference.NW(8);
      label89: AppMethodBeat.o(127375);
    }
  }

  private void ciY()
  {
    AppMethodBeat.i(127376);
    HeadImgNewPreference localHeadImgNewPreference = (HeadImgNewPreference)this.ehK.aqO("settings_change_avatar");
    localHeadImgNewPreference.WB(r.Yz());
    localHeadImgNewPreference.qqV = new SettingsPersonalInfoUI.2(this);
    AppMethodBeat.o(127376);
  }

  public final int JC()
  {
    return 2131165289;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(127378);
    int i = bo.g(paramObject, 0);
    ab.d("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    if ((paramn != com.tencent.mm.kernel.g.RP().Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(127378);
    }
    while (true)
    {
      return;
      ciI();
      AppMethodBeat.o(127378);
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = true;
    AppMethodBeat.i(127374);
    paramf = paramPreference.mKey;
    ab.d("MicroMsg.SettingsPersonalInfoUI", "key = ".concat(String.valueOf(paramf)));
    if (paramf.equals("settings_change_avatar"))
    {
      bool = com.tencent.mm.plugin.account.a.a.gkF.o(this);
      AppMethodBeat.o(127374);
    }
    while (true)
    {
      return bool;
      if (paramf.equals("settings_username"))
      {
        if ((bo.isNullOrNil(r.YA())) && (ad.aoB(r.Yz())))
          aA(SettingsAliasUI.class);
        AppMethodBeat.o(127374);
      }
      else if (paramf.equals("settings_name"))
      {
        paramf = new Intent();
        paramf.setClass(this, SettingsModifyNameUI.class);
        startActivity(paramf);
        AppMethodBeat.o(127374);
      }
      else
      {
        if (paramf.equals("settings_qrcode"))
        {
          h.pYm.e(11264, new Object[] { Integer.valueOf(2) });
          this.mController.ylL.startActivity(new Intent(this, SelfQRCodeUI.class));
        }
        label216: 
        do
        {
          while (true)
          {
            AppMethodBeat.o(127374);
            bool = false;
            break;
            if (!paramf.equals("settings_more_info"))
              break label216;
            startActivity(new Intent(this, SettingsPersonalMoreUI.class));
          }
          if (paramf.equals("settings_address"))
          {
            paramf = new Intent();
            paramf.putExtra("launch_from_webview", false);
            com.tencent.mm.bp.d.c(this.mController.ylL, "address", ".ui.WalletSelectAddrUI", paramf);
            AppMethodBeat.o(127374);
            break;
          }
        }
        while (!paramf.equals("settings_invoice"));
        h.pYm.e(14199, new Object[] { Integer.valueOf(1) });
        paramf = new Intent();
        paramf.putExtra("launch_from_webview", false);
        com.tencent.mm.bp.d.c(this.mController.ylL, "address", ".ui.InvoiceListUI", paramf);
        AppMethodBeat.o(127374);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127372);
    setMMTitle(2131303196);
    com.tencent.mm.kernel.g.RP().Ry().a(this);
    this.ehK = this.yCw;
    setBackBtn(new SettingsPersonalInfoUI.1(this));
    AppMethodBeat.o(127372);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127377);
    ab.i("MicroMsg.SettingsPersonalInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 3) || (paramInt1 == 2) || (paramInt1 == 4))
        new ak(Looper.getMainLooper()).post(new SettingsPersonalInfoUI.3(this));
      AppMethodBeat.o(127377);
    }
    while (true)
    {
      return;
      Object localObject;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(127377);
        break;
      case 3:
        paramIntent = com.tencent.mm.pluginsdk.ui.tools.n.h(getApplicationContext(), paramIntent, c.XW());
        if (paramIntent == null)
        {
          AppMethodBeat.o(127377);
        }
        else
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 1);
          ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
          ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
          b.gkE.a(this, (Intent)localObject, 4);
          AppMethodBeat.o(127377);
        }
        break;
      case 2:
        if (paramIntent == null)
        {
          AppMethodBeat.o(127377);
        }
        else
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 1);
          ((Intent)localObject).putExtra("CropImage_Filter", true);
          o.acd();
          ((Intent)localObject).putExtra("CropImage_OutputPath", com.tencent.mm.ah.d.D(r.Yz() + ".crop", true));
          ((Intent)localObject).putExtra("CropImage_ImgPath", null);
          b.gkE.a(this, paramIntent, (Intent)localObject, c.XW(), 4, null);
          AppMethodBeat.o(127377);
        }
        break;
      case 4:
        new ak(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(127368);
            ta localta = new ta();
            localta.cPk.cPm = true;
            com.tencent.mm.sdk.b.a.xxA.m(localta);
            AppMethodBeat.o(127368);
          }
        });
        if (paramIntent == null)
        {
          AppMethodBeat.o(127377);
        }
        else
        {
          paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
          localObject = r.Yz();
          o.acd();
          localObject = com.tencent.mm.ah.d.qg((String)localObject);
          if (paramIntent == null)
          {
            ab.e("MicroMsg.SettingsPersonalInfoUI", "crop picture failed");
            AppMethodBeat.o(127377);
          }
          else
          {
            ab.i("MicroMsg.SettingsPersonalInfoUI", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", new Object[] { paramIntent, Long.valueOf(new File(paramIntent).length()) });
            new com.tencent.mm.ah.m(this.mController.ylL, paramIntent).w(new SettingsPersonalInfoUI.5(this, (Bitmap)localObject));
            AppMethodBeat.o(127377);
          }
        }
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127370);
    super.onCreate(paramBundle);
    initView();
    if (getIntent().getBooleanExtra("intent_set_avatar", false))
    {
      this.gqB = getIntent().getBooleanExtra("KEnterFromBanner", false);
      com.tencent.mm.plugin.account.a.a.gkF.o(this);
    }
    com.tencent.mm.kernel.g.Rg().a(1191, this);
    AppMethodBeat.o(127370);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127371);
    ab.d("MicroMsg.SettingsPersonalInfoUI", "SettingsPersonalInfoUI.onDestroy()");
    if (com.tencent.mm.kernel.g.RK())
      com.tencent.mm.kernel.g.RP().Ry().b(this);
    if (this.qog != null)
      com.tencent.mm.kernel.g.Rg().c(this.qog);
    com.tencent.mm.kernel.g.Rg().b(1191, this);
    super.onDestroy();
    AppMethodBeat.o(127371);
  }

  public void onResume()
  {
    AppMethodBeat.i(127373);
    ciI();
    ciY();
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(4, null);
    if ((str != null) && (str.length() > 0))
      this.ehK.aqO("settings_name").setSummary(j.b(this, str));
    boolean bool = bo.gT(this);
    this.ehK.ce("settings_address", bool);
    if (!bo.e(Boolean.valueOf(com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xQQ, false))))
    {
      this.ehK.ce("settings_invoice", true);
      this.qog = new com.tencent.mm.plugin.setting.model.g();
      com.tencent.mm.kernel.g.Rg().a(this.qog, 0);
    }
    while (true)
    {
      super.onResume();
      AppMethodBeat.o(127373);
      return;
      this.ehK.ce("settings_invoice", false);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(127379);
    if (!bo.e(Boolean.valueOf(com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xQQ, false))))
    {
      this.ehK.ce("settings_invoice", true);
      AppMethodBeat.o(127379);
    }
    while (true)
    {
      return;
      this.ehK.ce("settings_invoice", false);
      AppMethodBeat.o(127379);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI
 * JD-Core Version:    0.6.2
 */