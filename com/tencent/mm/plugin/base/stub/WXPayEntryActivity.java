package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayReq.Options;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.plugin.wallet_index.ui.e;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXPayEntryActivity extends AutoLoginActivity
{
  private String fOs = null;
  private long jEg = 0L;

  private static void a(Context paramContext, f paramf, String paramString)
  {
    AppMethodBeat.i(18223);
    Signature[] arrayOfSignature = p.bx(paramContext, paramString);
    Object localObject = "";
    paramContext = (Context)localObject;
    if (arrayOfSignature != null)
    {
      paramContext = (Context)localObject;
      if (arrayOfSignature.length > 0)
      {
        int i = arrayOfSignature.length;
        for (int j = 0; ; j++)
        {
          paramContext = (Context)localObject;
          if (j >= i)
            break;
          paramContext = arrayOfSignature[j];
          localObject = (String)localObject + q.aiQ(com.tencent.mm.a.g.x(paramContext.toByteArray())) + "|";
        }
      }
    }
    localObject = paramContext;
    if (paramContext.length() > 1)
      localObject = paramContext.substring(0, paramContext.length() - 1);
    paramContext = new JSONObject();
    try
    {
      paramContext.put("raw_package_name", bo.bc(paramString, ""));
      paramContext.put("package_name", bo.bc(paramf.field_packageName, ""));
      paramContext.put("raw_signature", localObject);
      paramContext.put("signature", bo.bc(paramf.field_signature, ""));
      paramContext.put("scene", 5);
      paramString = new hc();
      paramString.cBN.appId = paramf.field_appId;
      paramString.cBN.opType = 3;
      paramString.cBN.cvq = paramContext.toString();
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      AppMethodBeat.o(18223);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.i("MicroMsg.WXPayEntryActivity", "doIfAppInValid, jsonException = " + paramString.getMessage());
    }
  }

  private void rN(int paramInt)
  {
    AppMethodBeat.i(18224);
    PayReq localPayReq = new PayReq();
    localPayReq.fromBundle(w.aM(getIntent()));
    PayReq.Options localOptions = new PayReq.Options();
    localOptions.fromBundle(w.aM(getIntent()));
    PayResp localPayResp = new PayResp();
    localPayResp.prepayId = localPayReq.prepayId;
    localPayResp.extData = localPayReq.extData;
    localPayResp.errCode = paramInt;
    e.a(this, w.n(getIntent(), "_mmessage_appPackage"), localPayResp, localOptions);
    AppMethodBeat.o(18224);
  }

  public final boolean O(Intent paramIntent)
  {
    return true;
  }

  public final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(18222);
    if (paramIntent == null)
    {
      finish();
      AppMethodBeat.o(18222);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WXPayEntryActivity", "postLogin, delegate intent to OrderHandlerUI, resultCode = ".concat(String.valueOf(parama)));
      label86: boolean bool2;
      switch (WXPayEntryActivity.1.jDI[parama.ordinal()])
      {
      default:
        ab.e("MicroMsg.WXPayEntryActivity", "postLogin, unknown login result = ".concat(String.valueOf(parama)));
        this.fOs = w.n(paramIntent, "_mmessage_appPackage");
        ab.i("MicroMsg.WXPayEntryActivity", "postLogin, getCallingPackage success, value = " + this.fOs);
        if ((getIntent() == null) || (w.aM(getIntent()) == null))
        {
          bool2 = false;
          label140: if (!bool2)
            ab.e("MicroMsg.WXPayEntryActivity", "postLogin, checkApp fail");
        }
        break;
      case 1:
      case 2:
      case 3:
      }
      try
      {
        paramIntent.putExtra("key_scene", 0);
        parama = w.aM(paramIntent);
        parama.putLong("wallet_pay_key_check_time", this.jEg);
        h.a(this, parama, bool2, "");
        finish();
        AppMethodBeat.o(18222);
        continue;
        ab.i("MicroMsg.WXPayEntryActivity", "coreaccount st %s", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.a.QT()) });
        if (!com.tencent.mm.kernel.a.QT())
          break label86;
        finish();
        AppMethodBeat.o(18222);
        continue;
        rN(-2);
        ab.e("MicroMsg.WXPayEntryActivity", "postLogin fail, loginResult = ".concat(String.valueOf(parama)));
        finish();
        AppMethodBeat.o(18222);
        continue;
        rN(-1);
        ab.e("MicroMsg.WXPayEntryActivity", "postLogin fail, loginResult = ".concat(String.valueOf(parama)));
        finish();
        AppMethodBeat.o(18222);
        continue;
        parama = new PayReq();
        parama.fromBundle(w.aM(getIntent()));
        parama = parama.appId;
        ab.d("MicroMsg.WXPayEntryActivity", "postLogin, appId = ".concat(String.valueOf(parama)));
        if ((parama == null) || (parama.length() == 0))
        {
          ab.e("MicroMsg.WXPayEntryActivity", "checkApp fail, appId is null");
          bool2 = false;
          break label140;
        }
        f localf = com.tencent.mm.pluginsdk.model.app.g.bT(parama, true);
        if (localf == null)
        {
          ab.w("MicroMsg.WXPayEntryActivity", "checkApp fail, not reg");
          localf = new f();
          localf.field_appId = parama;
          localf.field_appName = "";
          localf.field_packageName = this.fOs;
          localf.field_status = 0;
          String str = p.bw(this, this.fOs);
          if (str != null)
            localf.field_signature = str;
          bool2 = bool1;
          if (!am.bYJ().n(localf))
            break label140;
          bool2 = bool1;
          if (!bo.isNullOrNil(localf.field_openId))
            break label140;
          ab.d("MicroMsg.WXPayEntryActivity", "checkApp, trigger getAppSetting, appId = ".concat(String.valueOf(parama)));
          am.bYL().wy(parama);
          bool2 = bool1;
          break label140;
        }
        if (localf.field_status == 3)
        {
          ab.e("MicroMsg.WXPayEntryActivity", "checkApp fail, app is in blacklist");
          bool2 = false;
          break label140;
        }
        bool2 = bool1;
        if (p.a(this, localf, this.fOs, true))
          break label140;
        a(this, localf, this.fOs);
        ab.e("MicroMsg.WXPayEntryActivity", "checkApp fail, app invalid");
        bool2 = false;
      }
      catch (Exception parama)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.IntentUtil", parama, "", new Object[0]);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18221);
    this.jEg = System.currentTimeMillis();
    w.b(getIntent(), "key_auto_login_wizard_exit", true);
    super.onCreate(paramBundle);
    AppMethodBeat.o(18221);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXPayEntryActivity
 * JD-Core Version:    0.6.2
 */