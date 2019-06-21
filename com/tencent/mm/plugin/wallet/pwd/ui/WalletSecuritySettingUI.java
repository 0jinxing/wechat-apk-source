package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.o;
import com.tencent.mm.at.p.a;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.pwd.a.k;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class WalletSecuritySettingUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private int emC;
  private Map<String, p.a> tqO;
  private boolean tsF;
  private WalletSecuritySettingHeaderPref tsG;
  private IconPreference tsH;
  private IconPreference tsI;
  private IconPreference tsJ;
  private IconPreference tsK;
  private IconPreference tsL;
  private Preference tsM;
  private b tsN;
  private WalletSecuritySettingUI.g tsO;
  private f tsP;
  private WalletSecuritySettingUI.c tsQ;
  private WalletSecuritySettingUI.a tsR;
  private ProgressDialog tsS;

  public WalletSecuritySettingUI()
  {
    AppMethodBeat.i(46404);
    this.tsF = true;
    this.emC = 0;
    this.tqO = new HashMap();
    AppMethodBeat.o(46404);
  }

  private void a(String paramString, final IconPreference paramIconPreference)
  {
    AppMethodBeat.i(46420);
    if (paramIconPreference == null)
      AppMethodBeat.o(46420);
    while (true)
    {
      return;
      o.ahk();
      Bitmap localBitmap = com.tencent.mm.at.c.kR(paramString);
      if (localBitmap != null)
      {
        paramIconPreference.drawable = new BitmapDrawable(this.mController.ylL.getResources(), localBitmap);
        AppMethodBeat.o(46420);
      }
      else
      {
        if (!bo.isNullOrNil(paramString))
        {
          paramIconPreference = new p.a()
          {
            public final void i(String paramAnonymousString, Bitmap paramAnonymousBitmap)
            {
              AppMethodBeat.i(46399);
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletSecuritySettingUI", "alvinluo icon url: %s", new Object[] { paramAnonymousString });
              paramIconPreference.drawable = new BitmapDrawable(WalletSecuritySettingUI.this.mController.ylL.getResources(), paramAnonymousBitmap);
              WalletSecuritySettingUI.b(WalletSecuritySettingUI.this).remove(paramAnonymousString);
              AppMethodBeat.o(46399);
            }
          };
          this.tqO.put(paramString, paramIconPreference);
          o.aho().a(paramString, paramIconPreference);
        }
        AppMethodBeat.o(46420);
      }
    }
  }

  private void an(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46418);
    if (paramJSONObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WalletSecuritySettingUI", "alvinluo security info json is null");
      onError(getString(2131305318));
      AppMethodBeat.o(46418);
    }
    while (true)
    {
      return;
      try
      {
        this.ehK = this.yCw;
        Object localObject1 = paramJSONObject.getString("more_security_title");
        this.tsM = this.ehK.aqO("wallet_security_more_title");
        this.tsM.setTitle((CharSequence)localObject1);
        Object localObject2;
        if (paramJSONObject.has("basic_security_item"))
        {
          localObject1 = paramJSONObject.getJSONObject("basic_security_item");
          localObject2 = new com/tencent/mm/plugin/wallet/pwd/ui/WalletSecuritySettingUI$b;
          ((b)localObject2).<init>(this, (byte)0);
          this.tsN = ((b)localObject2);
          this.tsN.title = ((JSONObject)localObject1).optString("title");
          this.tsN.desc = ((JSONObject)localObject1).optString("desc");
          this.tsN.oRi = ((JSONObject)localObject1).optString("logo_url");
        }
        if (paramJSONObject.has("wallet_lock_info"))
        {
          localObject2 = paramJSONObject.getJSONObject("wallet_lock_info");
          localObject1 = new com/tencent/mm/plugin/wallet/pwd/ui/WalletSecuritySettingUI$g;
          ((WalletSecuritySettingUI.g)localObject1).<init>(this, (byte)0);
          this.tsO = ((WalletSecuritySettingUI.g)localObject1);
          this.tsO.title = ((JSONObject)localObject2).optString("wallet_lock_title");
          this.tsO.desc = ((JSONObject)localObject2).optString("wallet_lock_desc");
          this.tsO.oRi = ((JSONObject)localObject2).getString("wallet_lock_logo_url");
          this.tsO.status = ((JSONObject)localObject2).optInt("wallet_lock_status");
          this.tsO.ttl = ((JSONObject)localObject2).optString("wallet_lock_status_name");
          this.tsO.ttm = ((JSONObject)localObject2).optBoolean("is_open_touch_pay", false);
        }
        if (paramJSONObject.has("property_security_info"))
        {
          localObject1 = paramJSONObject.getJSONObject("property_security_info");
          localObject2 = new com/tencent/mm/plugin/wallet/pwd/ui/WalletSecuritySettingUI$f;
          ((f)localObject2).<init>(this, (byte)0);
          this.tsP = ((f)localObject2);
          this.tsP.title = ((JSONObject)localObject1).optString("title", "");
          this.tsP.desc = ((JSONObject)localObject1).optString("desc", "");
          this.tsP.oRi = ((JSONObject)localObject1).optString("logo_url", "");
          this.tsP.status = ((JSONObject)localObject1).optInt("status", 0);
          this.tsP.ttj = ((JSONObject)localObject1).optString("status_name");
          this.tsP.jumpType = ((JSONObject)localObject1).optInt("jump_type");
          this.tsP.tsX = ((JSONObject)localObject1).optString("jump_h5_url");
          this.tsP.ttk = ((JSONObject)localObject1).optString("tinyapp_username");
          this.tsP.tsY = ((JSONObject)localObject1).optString("tinyapp_path");
        }
        if (paramJSONObject.has("safe_manager_info"))
        {
          localObject1 = paramJSONObject.getJSONObject("safe_manager_info");
          localObject2 = new com/tencent/mm/plugin/wallet/pwd/ui/WalletSecuritySettingUI$c;
          ((WalletSecuritySettingUI.c)localObject2).<init>(this, this);
          this.tsQ = ((WalletSecuritySettingUI.c)localObject2);
          this.tsQ.title = ((JSONObject)localObject1).optString("title", "");
          this.tsQ.desc = ((JSONObject)localObject1).optString("desc", "");
          this.tsQ.oRi = ((JSONObject)localObject1).optString("logo_url", "");
          this.tsQ.ttb = ((JSONObject)localObject1).optString("installed_status_name");
          this.tsQ.tta = ((JSONObject)localObject1).optString("uninstall_status_name");
          this.tsQ.ttc = ((JSONObject)localObject1).optString("protected_mode_name");
          this.tsQ.tsX = ((JSONObject)localObject1).optString("jump_h5_url");
        }
        if (paramJSONObject.has("balance_privacy_info"))
        {
          localObject1 = paramJSONObject.getJSONObject("balance_privacy_info");
          localObject2 = new com/tencent/mm/plugin/wallet/pwd/ui/WalletSecuritySettingUI$a;
          ((WalletSecuritySettingUI.a)localObject2).<init>(this, (byte)0);
          this.tsR = ((WalletSecuritySettingUI.a)localObject2);
          this.tsR.cIY = ((JSONObject)localObject1).optString("icon", "");
          this.tsR.title = ((JSONObject)localObject1).optString("title", "");
          this.tsR.desc = ((JSONObject)localObject1).optString("desc", "");
          this.tsR.switchState = ((JSONObject)localObject1).optInt("switch_state");
          this.tsR.tsW = ((JSONObject)localObject1).optString("switch_state_info");
        }
        com.tencent.mm.wallet_core.c.ab.dNZ().aT(paramJSONObject);
        g.RQ();
        g.RP().Ry().set(ac.a.xTo, paramJSONObject.toString());
        cOJ();
        cOL();
        cOM();
        cON();
        cOO();
        cOK();
        this.ehK.notifyDataSetChanged();
        dismissDialog();
        AppMethodBeat.o(46418);
      }
      catch (Exception paramJSONObject)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", paramJSONObject, "", new Object[0]);
          onError(getString(2131305318));
        }
      }
    }
  }

  private void cOJ()
  {
    AppMethodBeat.i(46409);
    this.tsG = ((WalletSecuritySettingHeaderPref)this.ehK.aqO("wallet_security_basic_info"));
    if (this.tsN != null)
    {
      WalletSecuritySettingHeaderPref localWalletSecuritySettingHeaderPref = this.tsG;
      String str1 = this.tsN.title;
      String str2 = this.tsN.desc;
      Object localObject = this.tsN.tsZ;
      localWalletSecuritySettingHeaderPref.lYc = str1;
      localWalletSecuritySettingHeaderPref.tsB = str2;
      localWalletSecuritySettingHeaderPref.tsC = ((String)localObject);
      localWalletSecuritySettingHeaderPref.cu();
      if (bo.isNullOrNil(this.tsN.tsZ))
      {
        localObject = this.tsG;
        if (((WalletSecuritySettingHeaderPref)localObject).tsA != null)
          ((WalletSecuritySettingHeaderPref)localObject).tsA.setVisibility(8);
      }
    }
    AppMethodBeat.o(46409);
  }

  private void cOK()
  {
    AppMethodBeat.i(46410);
    if (this.tsR == null)
    {
      this.ehK.ce("balance_privacy_info", true);
      AppMethodBeat.o(46410);
    }
    while (true)
    {
      return;
      this.ehK.ce("balance_privacy_info", false);
      this.tsL = ((IconPreference)this.ehK.aqO("balance_privacy_info"));
      a(this.tsR.cIY, this.tsL);
      this.tsL.setTitle(this.tsR.title);
      this.tsL.setSummary(this.tsR.tsW);
      this.tsL.setDesc(this.tsR.desc);
      this.tsL.dAy();
      AppMethodBeat.o(46410);
    }
  }

  private void cOL()
  {
    AppMethodBeat.i(46411);
    if (this.tsO == null)
    {
      this.ehK.ce("wallet_security_wallet_lock", true);
      AppMethodBeat.o(46411);
    }
    while (true)
    {
      return;
      this.ehK.ce("wallet_security_wallet_lock", false);
      this.tsJ = ((IconPreference)this.ehK.aqO("wallet_security_wallet_lock"));
      a(this.tsO.oRi, this.tsJ);
      this.tsJ.setTitle(this.tsO.title);
      this.tsJ.setSummary(this.tsO.ttl);
      this.tsJ.setDesc(this.tsO.desc);
      this.tsJ.dAy();
      AppMethodBeat.o(46411);
    }
  }

  private void cOM()
  {
    AppMethodBeat.i(46412);
    this.ehK.ce("wallet_security_digital_certificate", false);
    this.tsH = ((IconPreference)this.ehK.aqO("wallet_security_digital_certificate"));
    com.tencent.mm.wallet_core.c.ab.dNZ();
    g.RQ();
    if (((Integer)g.RP().Ry().get(ac.a.xOR, Integer.valueOf(0))).intValue() > 0);
    for (int i = 1; i == 0; i = 0)
    {
      this.ehK.ce("wallet_security_digital_certificate", true);
      AppMethodBeat.o(46412);
      return;
    }
    if (com.tencent.mm.wallet_core.c.ab.dNZ().dOa())
      if (this.tsH != null)
        this.tsH.setSummary(2131305328);
    while (true)
    {
      a(com.tencent.mm.wallet_core.c.ab.dNZ().Age, this.tsH);
      this.tsH.setTitle(com.tencent.mm.wallet_core.c.ab.dNZ().Agc);
      this.tsH.setSummary(com.tencent.mm.wallet_core.c.ab.dNZ().Agd);
      this.tsH.setDesc(com.tencent.mm.wallet_core.c.ab.dNZ().Agb);
      this.tsH.dAy();
      AppMethodBeat.o(46412);
      break;
      if (this.tsH != null)
        this.tsH.setSummary(2131305330);
    }
  }

  private void cON()
  {
    AppMethodBeat.i(46413);
    this.ehK.ce("wallet_security_pay_guard", false);
    this.tsI = ((IconPreference)this.ehK.aqO("wallet_security_pay_guard"));
    if (this.tsI != null)
      this.tsI.setSummary(2131305330);
    if (this.tsQ == null)
    {
      this.ehK.ce("wallet_security_pay_guard", true);
      AppMethodBeat.o(46413);
      return;
    }
    a(this.tsQ.oRi, this.tsI);
    this.tsI.setTitle(this.tsQ.title);
    IconPreference localIconPreference = this.tsI;
    Object localObject = this.tsQ;
    if (((WalletSecuritySettingUI.c)localObject).status == 0)
      localObject = ((WalletSecuritySettingUI.c)localObject).tta;
    while (true)
    {
      localIconPreference.setSummary((CharSequence)localObject);
      this.tsI.setDesc(this.tsQ.desc);
      this.tsI.dAy();
      AppMethodBeat.o(46413);
      break;
      if (((WalletSecuritySettingUI.c)localObject).status == 1)
        localObject = ((WalletSecuritySettingUI.c)localObject).ttb;
      else
        localObject = ((WalletSecuritySettingUI.c)localObject).ttc;
    }
  }

  private void cOO()
  {
    AppMethodBeat.i(46414);
    this.ehK = this.yCw;
    this.ehK.ce("wallet_security_safety_insurance", false);
    this.tsK = ((IconPreference)this.ehK.aqO("wallet_security_safety_insurance"));
    if (this.tsK != null)
      this.tsK.setSummary(2131305331);
    if (this.tsP == null)
    {
      this.ehK.ce("wallet_security_safety_insurance", true);
      AppMethodBeat.o(46414);
    }
    while (true)
    {
      return;
      a(this.tsP.oRi, this.tsK);
      this.tsK.setTitle(this.tsP.title);
      this.tsK.setSummary(this.tsP.ttj);
      this.tsK.setDesc(this.tsP.desc);
      this.tsK.dAy();
      AppMethodBeat.o(46414);
    }
  }

  private void dismissDialog()
  {
    AppMethodBeat.i(46419);
    if ((this.tsS != null) && (this.tsS.isShowing()))
      this.tsS.dismiss();
    AppMethodBeat.o(46419);
  }

  private void onError(String paramString)
  {
    AppMethodBeat.i(46417);
    if ((this.tsS != null) && (this.tsS.isShowing()))
      this.tsS.dismiss();
    h.a(this, paramString, "", false, new WalletSecuritySettingUI.6(this));
    AppMethodBeat.o(46417);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(46415);
    if ("wallet_security_digital_certificate".equals(paramPreference.mKey))
    {
      paramf = new bj();
      paramf.cVT = 12L;
      paramf.dcm = 1L;
      paramf.ajK();
      com.tencent.mm.bp.d.b(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new Intent());
      AppMethodBeat.o(46415);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ("wallet_security_pay_guard".equals(paramPreference.mKey))
      {
        if (this.tsQ == null)
        {
          AppMethodBeat.o(46415);
          bool = true;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletSecuritySettingUI", "jump url %s ", new Object[] { this.tsQ.getUrl() });
          com.tencent.mm.wallet_core.ui.e.bV(this, this.tsQ.getUrl());
          AppMethodBeat.o(46415);
          bool = true;
        }
      }
      else if ("wallet_security_wallet_lock".equals(paramPreference.mKey))
      {
        paramf = new Intent();
        ((com.tencent.mm.plugin.walletlock.a.b)g.K(com.tencent.mm.plugin.walletlock.a.b.class)).b(this, paramf);
        AppMethodBeat.o(46415);
        bool = true;
      }
      else if ("wallet_security_safety_insurance".equals(paramPreference.mKey))
      {
        if (this.tsP == null)
        {
          AppMethodBeat.o(46415);
          bool = true;
        }
        else
        {
          paramf = new bj();
          paramf.cVT = 15L;
          paramf.dcm = 1L;
          paramf.ajK();
          if (this.tsP.jumpType == 2)
          {
            paramf = new se();
            paramf.cOf.axy = 0;
            paramf.cOf.userName = this.tsP.ttk;
            paramf.cOf.cOh = this.tsP.tsY;
            a.xxA.m(paramf);
          }
          while (true)
          {
            AppMethodBeat.o(46415);
            bool = true;
            break;
            paramf = new Intent();
            paramf.putExtra("rawUrl", this.tsP.tsX);
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletSecuritySettingUI", "raw url: %s", new Object[] { paramf.getStringExtra("rawUrl") });
            com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
          }
        }
      }
      else if ("balance_privacy_info".equals(paramPreference.mKey))
      {
        if (this.tsR == null)
        {
          AppMethodBeat.o(46415);
          bool = true;
        }
        else
        {
          com.tencent.mm.bp.d.H(this, "wallet", ".pwd.ui.WalletBalancePrivacyUI");
        }
      }
      else
      {
        AppMethodBeat.o(46415);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(46406);
    super.initView();
    this.ehK = this.yCw;
    if (this.ehK != null)
      this.ehK.addPreferencesFromResource(2131165316);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xTo, "");
    if (!bo.isNullOrNil(str));
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        an(localJSONObject);
        AppMethodBeat.o(46406);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", localException, "", new Object[0]);
      }
      AppMethodBeat.o(46406);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46405);
    super.onCreate(paramBundle);
    this.emC = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
    paramBundle = new bj();
    paramBundle.cVT = 11L;
    paramBundle.dcm = 1L;
    paramBundle.dcn = this.emC;
    paramBundle.ajK();
    initView();
    setBackBtn(new WalletSecuritySettingUI.1(this));
    if (com.tencent.mm.compatible.util.d.iW(23))
    {
      getWindow().setStatusBarColor(getResources().getColor(2131690691));
      dxW();
    }
    AppMethodBeat.o(46405);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46421);
    Iterator localIterator = this.tqO.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      o.aho().b((String)localEntry.getKey(), (p.a)localEntry.getValue());
    }
    this.tqO.clear();
    super.onDestroy();
    AppMethodBeat.o(46421);
  }

  public void onPause()
  {
    AppMethodBeat.i(46408);
    super.onPause();
    g.RQ();
    g.RO().eJo.b(385, this);
    AppMethodBeat.o(46408);
  }

  public void onResume()
  {
    AppMethodBeat.i(46407);
    super.onResume();
    this.tsG = ((WalletSecuritySettingHeaderPref)this.ehK.aqO("wallet_security_basic_info"));
    Object localObject2;
    if (this.tsG != null)
    {
      localObject1 = this.tsG;
      localObject2 = new WalletSecuritySettingUI.2(this);
      if (((WalletSecuritySettingHeaderPref)localObject1).tsA != null)
        break label297;
      bool = true;
      com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo details == null: %b", new Object[] { Boolean.valueOf(bool) });
      ((WalletSecuritySettingHeaderPref)localObject1).tsD = ((View.OnClickListener)localObject2);
      if (((WalletSecuritySettingHeaderPref)localObject1).tsA != null)
        ((WalletSecuritySettingHeaderPref)localObject1).tsA.setOnClickListener((View.OnClickListener)localObject2);
      localObject1 = this.tsG;
      localObject2 = new WalletSecuritySettingUI.3(this);
      if (((WalletSecuritySettingHeaderPref)localObject1).rnN != null)
        break label302;
      bool = true;
      label122: com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo closeBtn == null: %b", new Object[] { Boolean.valueOf(bool) });
      ((WalletSecuritySettingHeaderPref)localObject1).tsE = ((View.OnClickListener)localObject2);
      if (((WalletSecuritySettingHeaderPref)localObject1).rnN != null)
        ((WalletSecuritySettingHeaderPref)localObject1).rnN.setOnClickListener((View.OnClickListener)localObject2);
    }
    g.RQ();
    g.RO().eJo.a(385, this);
    if (this.tsF)
    {
      this.tsS = h.b(this, getString(2131297086), false, null);
      this.tsF = false;
    }
    boolean bool = ((l)g.K(l.class)).bxe();
    Object localObject1 = ah.doB();
    if (localObject1 != null)
    {
      localObject2 = ((SharedPreferences)localObject1).getString("cpu_id", null);
      localObject1 = ((SharedPreferences)localObject1).getString("uid", null);
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletSecuritySettingUI", "alvinluo getSecurityInfo isOpenTouchPay: %b", new Object[] { Boolean.valueOf(bool) });
      g.Rg().a(new k(bool, (String)localObject2, (String)localObject1), 0);
      AppMethodBeat.o(46407);
      return;
      label297: bool = false;
      break;
      label302: bool = false;
      break label122;
      localObject1 = null;
      localObject2 = null;
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46416);
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.WalletSecuritySettingUI", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof k))
    {
      paramString = ((k)paramm).tqH;
      com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.WalletSecuritySettingUI", "alvinluo json: %s", new Object[] { paramString });
      an(paramString);
      if ((paramString != null) && (!((Boolean)g.RP().Ry().get(ac.a.xMM, Boolean.FALSE)).booleanValue()))
      {
        paramm = paramString.optJSONObject("dialog_info");
        if (paramm != null)
          break label352;
        paramString = null;
      }
    }
    while (true)
    {
      if (paramString != null)
      {
        c.a locala = new c.a(this);
        paramm = LayoutInflater.from(this).inflate(2130971175, null, false);
        CdnImageView localCdnImageView = (CdnImageView)paramm.findViewById(2131829070);
        TextView localTextView = (TextView)paramm.findViewById(2131829071);
        localCdnImageView.eb(paramString.pia, 2130840738);
        localTextView.setText(paramString.cEh);
        locala.rd(true);
        locala.rc(false);
        locala.fn(paramm);
        locala.asD(paramString.title);
        if ((paramString.tti != null) && (!bo.isNullOrNil(paramString.tti.kdE)))
        {
          locala.asJ(paramString.tti.kdE);
          locala.a(true, new WalletSecuritySettingUI.4(this, paramString));
        }
        if ((paramString.tth != null) && (!bo.isNullOrNil(paramString.tth.kdE)))
        {
          locala.asK(paramString.tth.kdE);
          locala.b(new WalletSecuritySettingUI.5(this, paramString));
        }
        locala.aMb().show();
        g.RP().Ry().set(ac.a.xMM, Boolean.TRUE);
      }
      AppMethodBeat.o(46416);
      return;
      label352: paramString = new e();
      paramString.title = paramm.optString("title");
      paramString.cEh = paramm.optString("wording");
      paramString.pia = paramm.optString("logo");
      paramString.tth = d.ao(paramm.optJSONObject("left_btn"));
      paramString.tti = d.ao(paramm.optJSONObject("right_btn"));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class b
  {
    String desc;
    int jumpType;
    String oRi;
    String title;
    String tsX;
    String tsY;
    String tsZ;

    private b()
    {
    }
  }

  static final class d
  {
    String kdE;
    int ttd;
    String tte;
    String ttf;
    String ttg;

    public static d ao(JSONObject paramJSONObject)
    {
      AppMethodBeat.i(46403);
      if (paramJSONObject == null)
      {
        paramJSONObject = null;
        AppMethodBeat.o(46403);
      }
      while (true)
      {
        return paramJSONObject;
        d locald = new d();
        locald.kdE = paramJSONObject.optString("button_wording");
        locald.ttd = paramJSONObject.optInt("jump_type");
        locald.tte = paramJSONObject.optString("jump_h5_url");
        locald.ttf = paramJSONObject.optString("tinyapp_name");
        locald.ttg = paramJSONObject.optString("tinyapp_path");
        AppMethodBeat.o(46403);
        paramJSONObject = locald;
      }
    }
  }

  static final class e
  {
    String cEh;
    String pia;
    String title;
    WalletSecuritySettingUI.d tth;
    WalletSecuritySettingUI.d tti;
  }

  final class f
  {
    String desc;
    int jumpType;
    String oRi;
    int status;
    String title;
    String tsX;
    String tsY;
    String ttj;
    String ttk;

    private f()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI
 * JD-Core Version:    0.6.2
 */