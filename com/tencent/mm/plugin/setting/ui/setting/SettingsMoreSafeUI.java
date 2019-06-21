package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.kernel.l;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.account.ui.FacebookAuthUI;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import com.tencent.mm.x.c;
import junit.framework.Assert;

public class SettingsMoreSafeUI extends MMPreference
  implements com.tencent.mm.ai.f, n.b
{
  private ProgressDialog ehJ;
  private com.tencent.mm.ui.base.preference.f ehK;
  private SparseIntArray qmC;
  private String qnZ;
  private String qoa;

  public SettingsMoreSafeUI()
  {
    AppMethodBeat.i(127327);
    this.qnZ = null;
    this.qmC = new SparseIntArray();
    this.qmC.put(0, 2131303067);
    this.qmC.put(-82, 2131303005);
    this.qmC.put(-83, 2131303002);
    this.qmC.put(-84, 2131303003);
    this.qmC.put(-85, 2131302996);
    this.qmC.put(-86, 2131303007);
    AppMethodBeat.o(127327);
  }

  private void ciT()
  {
    AppMethodBeat.i(127334);
    Preference localPreference = this.ehK.aqO("settings_email_addr");
    Assert.assertNotNull(localPreference);
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(5, null);
    Integer localInteger = (Integer)com.tencent.mm.kernel.g.RP().Ry().get(7, null);
    if ((localInteger != null) && ((localInteger.intValue() & 0x2) != 0))
    {
      localPreference.setSummary(2131303075);
      AppMethodBeat.o(127334);
    }
    while (true)
    {
      return;
      if (str != null)
      {
        localPreference.setSummary(2131303074);
        AppMethodBeat.o(127334);
      }
      else
      {
        localPreference.setSummary(2131302995);
        AppMethodBeat.o(127334);
      }
    }
  }

  private void ciU()
  {
    AppMethodBeat.i(127336);
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.ehK.aqO("settings_phone_security");
    if (localIconSwitchKeyValuePreference == null)
    {
      ab.e("MicroMsg.SettingsMoreSafeUI", "phone_security preference is null");
      AppMethodBeat.o(127336);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.sdk.platformtools.g.dnY())
      {
        this.ehK.ce("settings_phone_security", true);
        AppMethodBeat.o(127336);
      }
      else if (c.PK().a(ac.a.xUP))
      {
        localIconSwitchKeyValuePreference.NN(0);
        AppMethodBeat.o(127336);
      }
      else
      {
        localIconSwitchKeyValuePreference.NN(8);
        AppMethodBeat.o(127336);
      }
    }
  }

  private void ciV()
  {
    AppMethodBeat.i(127337);
    Preference localPreference = this.ehK.aqO("settings_facebook");
    if (localPreference == null)
    {
      ab.e("MicroMsg.SettingsMoreSafeUI", "updateFacebook Preference null");
      AppMethodBeat.o(127337);
    }
    while (true)
    {
      return;
      if (!r.YX())
      {
        this.ehK.d(localPreference);
        AppMethodBeat.o(127337);
      }
      else if (!r.Za())
      {
        localPreference.setSummary(getString(2131303052));
        AppMethodBeat.o(127337);
      }
      else
      {
        localPreference.setSummary((String)com.tencent.mm.kernel.g.RP().Ry().get(65826, null));
        AppMethodBeat.o(127337);
      }
    }
  }

  private void ciW()
  {
    AppMethodBeat.i(127338);
    Preference localPreference = this.ehK.aqO("settings_bind_qq");
    if (localPreference == null)
    {
      ab.e("MicroMsg.SettingsMoreSafeUI", "updateUin Preference null");
      AppMethodBeat.o(127338);
    }
    while (true)
    {
      return;
      int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(9, Integer.valueOf(0))).intValue();
      if (i == 0)
      {
        ab.i("MicroMsg.SettingsMoreSafeUI", "updateUin 0 Preference");
        if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("BindQQSwitch"), 1) != 1)
        {
          this.ehK.ce("settings_uin", true);
          AppMethodBeat.o(127338);
        }
        else
        {
          localPreference.setSummary(2131303052);
          AppMethodBeat.o(127338);
        }
      }
      else
      {
        localPreference.setSummary(new com.tencent.mm.a.p(i));
        AppMethodBeat.o(127338);
      }
    }
  }

  public final int JC()
  {
    return 2131165283;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(127335);
    ciW();
    ciT();
    ciV();
    ciU();
    AppMethodBeat.o(127335);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(127333);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.SettingsMoreSafeUI", paramf + " item has been clicked!");
    if (bo.isNullOrNil(paramf))
    {
      AppMethodBeat.o(127333);
      return bool;
    }
    if (paramf.equals("settings_facebook"))
      aA(FacebookAuthUI.class);
    while (true)
    {
      AppMethodBeat.o(127333);
      break;
      int j;
      if (paramf.equals("settings_email_addr"))
      {
        paramf = (Integer)com.tencent.mm.kernel.g.RP().Ry().get(7, null);
        j = i;
        if (paramf != null)
        {
          j = i;
          if ((paramf.intValue() & 0x2) != 0)
            j = 1;
        }
        paramf = (String)com.tencent.mm.kernel.g.RP().Ry().get(5, null);
        if ((j != 0) || (!bo.isNullOrNil(paramf)))
          startActivity(new Intent(this.mController.ylL, SettingsModifyEmailAddrUI.class));
        while (true)
        {
          AppMethodBeat.o(127333);
          bool = true;
          break;
          if (this.ehJ != null)
          {
            ab.w("MicroMsg.SettingsMoreSafeUI", "do get email input, but tips dialog has not dismissed");
            this.ehJ.dismiss();
            this.ehJ = null;
          }
          paramf = bo.bc(w.ct(this.mController.ylL), "");
          com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131303145), paramf, getString(2131303146), 50, new SettingsMoreSafeUI.2(this));
        }
      }
      if (paramf.equals("settings_bind_qq"))
      {
        b.gkE.g(new Intent(), this);
        AppMethodBeat.o(127333);
        bool = true;
        break;
      }
      if (paramf.equals("settings_phone_security"))
      {
        Intent localIntent = new Intent();
        if (c.PK().a(ac.a.xUP))
        {
          j = 1;
          label336: c.PK().b(ac.a.xUP, false);
          ((IconPreference)paramPreference).NN(8);
          i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUR, Integer.valueOf(0))).intValue();
          com.tencent.mm.plugin.report.service.h.pYm.e(10939, new Object[] { Integer.valueOf(i) });
          if (!bo.bH(this, "com.tencent.server.back.BackEngine"))
            break label499;
        }
        label499: for (paramf = getString(2131305946, new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(j) }); ; paramf = getString(2131305946, new Object[] { Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j) }))
        {
          localIntent.putExtra("rawUrl", paramf);
          localIntent.putExtra("show_bottom", false);
          localIntent.putExtra("showShare", false);
          d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
          break;
          j = 0;
          break label336;
        }
      }
      if (paramf.equals("settings_delete_account"))
      {
        paramf = new Intent();
        if (!bo.isNullOrNil(this.qnZ))
        {
          paramf.putExtra("rawUrl", this.qnZ + "&lang=" + aa.gw(this.mController.ylL));
          paramf.putExtra("showShare", true);
          paramf.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
          d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramf, 2);
        }
      }
      else if (paramf.equals("settings_dump_personal_data"))
      {
        paramf = new Intent();
        if (!bo.isNullOrNil(this.qoa))
        {
          paramf.putExtra("rawUrl", this.qoa);
          paramf.putExtra("showShare", false);
          paramf.putExtra("needRedirect", false);
          paramf.putExtra("neverGetA8Key", false);
          paramf.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
          d.b(this.mController.ylL, "webview", ".ui.tools.WebViewUI", paramf);
        }
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(127330);
    setMMTitle(2131303159);
    this.ehK = this.yCw;
    if (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(9, Integer.valueOf(0))).intValue() == 0)
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("BindQQSwitch"), 1) != 1)
      {
        this.ehK.ce("settings_uin", true);
        ab.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch off");
      }
    while (true)
    {
      this.qnZ = com.tencent.mm.m.g.Nu().getValue("CloseAcctUrl");
      setBackBtn(new SettingsMoreSafeUI.1(this));
      AppMethodBeat.o(127330);
      return;
      ab.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch bindqq");
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127340);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 2)
      switch (paramInt2)
      {
      default:
      case -1:
      }
    while (true)
    {
      AppMethodBeat.o(127340);
      return;
      if ((com.tencent.mm.kernel.g.Rg() != null) && (com.tencent.mm.kernel.g.Rg().ftA != null))
        com.tencent.mm.kernel.g.Rg().ftA.cG(false);
      paramIntent = new gj();
      com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
      b.gkF.BY();
      com.tencent.mm.kernel.g.RP().Ry().b(this);
      paramIntent = new jl();
      paramIntent.cEK.status = 0;
      paramIntent.cEK.boZ = 3;
      com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
      paramIntent = new com.tencent.mm.g.a.z();
      paramIntent.csU.csV = true;
      com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
      aj.amB("show_whatsnew");
      l.m(this, true);
      paramIntent = new Intent();
      paramIntent.addFlags(67108864);
      paramIntent.putExtra("Intro_Switch", true);
      b.gkE.p(paramIntent, this.mController.ylL);
      w.I(this, null);
      finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127328);
    super.onCreate(paramBundle);
    initView();
    com.tencent.mm.kernel.g.Rg().a(256, this);
    AppMethodBeat.o(127328);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127329);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(256, this);
    AppMethodBeat.o(127329);
  }

  public void onPause()
  {
    AppMethodBeat.i(127332);
    super.onPause();
    AppMethodBeat.o(127332);
  }

  public void onResume()
  {
    AppMethodBeat.i(127331);
    ciW();
    ciT();
    ciV();
    Object localObject = com.tencent.mm.m.g.Nu().getValue("ShowExportUserDataEntry");
    if (!bo.isNullOrNil((String)localObject))
      this.qoa = ((String)localObject);
    while (true)
    {
      ciU();
      localObject = this.ehK.aqO("settings_about_domainmail");
      this.ehK.d((Preference)localObject);
      if (bo.isNullOrNil(this.qnZ))
      {
        localObject = this.ehK.aqO("settings_delete_account");
        this.ehK.d((Preference)localObject);
      }
      super.onResume();
      AppMethodBeat.o(127331);
      return;
      this.qoa = "";
      this.ehK.ce("settings_dump_personal_data", true);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(127339);
    ab.d("MicroMsg.SettingsMoreSafeUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramm.getType());
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (paramm.getType() == 256)
      if (((paramInt1 != 0) || (paramInt2 != 0)) && (b.gkF.a(this, paramInt1, paramInt2, paramString)))
        AppMethodBeat.o(127339);
    while (true)
    {
      return;
      int i = this.qmC.get(paramInt2);
      paramm = getString(2131303066, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = paramm;
      if (i != 0);
      try
      {
        paramString = getString(i);
        com.tencent.mm.ui.base.h.bQ(this.mController.ylL, paramString);
        AppMethodBeat.o(127339);
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.SettingsMoreSafeUI", "try get string by id %d, fail:%s", new Object[] { Integer.valueOf(i), paramString.getMessage() });
          ab.printErrStackTrace("MicroMsg.SettingsMoreSafeUI", paramString, "", new Object[0]);
          paramString = paramm;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI
 * JD-Core Version:    0.6.2
 */