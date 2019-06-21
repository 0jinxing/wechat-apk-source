package com.tencent.mm.plugin.webview.stub;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.c;
import com.tencent.mm.g.a.qr;
import com.tencent.mm.g.a.ty;
import com.tencent.mm.g.a.ty.a;
import com.tencent.mm.g.a.ty.b;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsimple.v;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.webview.model.at;
import com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.d.b;

@com.tencent.mm.ui.base.a(7)
@d.b
public class WebViewStubProxyUI extends MMActivity
{
  private DialogInterface.OnDismissListener cMR;
  private ap che;
  private int mqx;
  private e umI;
  public boolean uqh;
  private boolean uqi;
  private int uqj;
  private final e uqk;
  private ap uql;

  public WebViewStubProxyUI()
  {
    AppMethodBeat.i(7098);
    this.uqh = false;
    this.umI = null;
    this.uqi = false;
    this.uqk = new WebViewStubProxyUI.5(this);
    this.cMR = new WebViewStubProxyUI.6(this);
    this.mqx = 0;
    this.che = new ap(new WebViewStubProxyUI.7(this), true);
    this.uql = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(7097);
        if (!WebViewStubProxyUI.this.isFinishing())
          WebViewStubProxyUI.this.finish();
        AppMethodBeat.o(7097);
        return false;
      }
    }
    , true);
    AppMethodBeat.o(7098);
  }

  public final int getForceOrientation()
  {
    AppMethodBeat.i(7100);
    int i = getIntent().getIntExtra("screen_orientation", -1);
    AppMethodBeat.o(7100);
    return i;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  @TargetApi(21)
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7099);
    super.onCreate(paramBundle);
    if (d.iW(21))
      getWindow().setStatusBarColor(0);
    paramBundle = (WebViewStubCallbackWrapper)getIntent().getParcelableExtra("webview_stub_callbacker_key");
    if (paramBundle != null)
      this.umI = paramBundle.uuT;
    paramBundle = getIntent();
    int i = paramBundle.getIntExtra("proxyui_action_code_key", 0);
    this.uqj = paramBundle.getIntExtra("webview_binder_id", 0);
    ab.i("MicroMsg.WebViewStubProxyUI", "onCreate, actionCode = %d, binderID = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.uqj) });
    if ("startMonitoringBeacons".equals(paramBundle.getStringExtra("proxyui_function_key")))
      this.uqh = true;
    switch (i)
    {
    case 7:
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 8:
    case 9:
    case 10:
    }
    while (true)
    {
      AppMethodBeat.o(7099);
      Object localObject1;
      while (true)
      {
        return;
        if (!this.uqi)
          this.che.ae(100L, 100L);
        if (!this.uqh)
          break;
        this.uql.ae(5000L, 5000L);
        AppMethodBeat.o(7099);
        continue;
        localObject1 = new ty();
        ((ty)localObject1).callback = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(7068);
            if (!this.uqm.cQd.cQe)
            {
              WebViewStubProxyUI.this.finish();
              AppMethodBeat.o(7068);
            }
            while (true)
            {
              return;
              if (WebViewStubProxyUI.a(WebViewStubProxyUI.this) != null);
              try
              {
                WebViewStubProxyUI.a(WebViewStubProxyUI.this).c(1001, null);
                WebViewStubProxyUI.this.finish();
                e.a locala = com.tencent.mm.pluginsdk.f.e.vdx;
                if (locala != null)
                  locala.bd(WebViewStubProxyUI.this);
                AppMethodBeat.o(7068);
              }
              catch (RemoteException localRemoteException)
              {
                while (true)
                  ab.w("MicroMsg.WebViewStubProxyUI", "dealUpdate fail, ex = " + localRemoteException.getMessage());
              }
            }
          }
        };
        ((ty)localObject1).cQc.context = this;
        ((ty)localObject1).cQc.type = paramBundle.getIntExtra("update_type_key", 0);
        if (((ty)localObject1).cQc.type <= 0)
        {
          ab.e("MicroMsg.WebViewStubProxyUI", "doUpdate fail, invalid type = " + ((ty)localObject1).cQc.type);
          finish();
          AppMethodBeat.o(7099);
        }
        else
        {
          com.tencent.mm.sdk.b.a.xxA.a((b)localObject1, Looper.myLooper());
          AppMethodBeat.o(7099);
          continue;
          paramBundle = ((j)com.tencent.mm.kernel.g.K(j.class)).XU().RA("@t.qq.com");
          if (!r.Ze())
            paramBundle = com.tencent.mm.ui.base.h.a(this, 2131298583, 2131297061, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                AppMethodBeat.i(7069);
                com.tencent.mm.plugin.webview.a.a.gkE.g(new Intent(), WebViewStubProxyUI.this);
                AppMethodBeat.o(7069);
              }
            }
            , null);
          while (true)
          {
            if (paramBundle != null)
              break label534;
            finish();
            AppMethodBeat.o(7099);
            break;
            if ((paramBundle == null) || (bo.isNullOrNil(paramBundle.name)))
            {
              paramBundle = com.tencent.mm.ui.base.h.g(this, 2131303319, 2131297061);
            }
            else
            {
              paramBundle = bo.nullAsNil(getIntent().getStringExtra("shortUrl"));
              paramBundle = new v(getIntent().getIntExtra("type", 0), paramBundle);
              com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
              try
              {
                this.umI.IZ(0);
                paramBundle = null;
              }
              catch (Exception paramBundle)
              {
                ab.w("MicroMsg.WebViewStubProxyUI", "setTitlePbVisibility, ex = " + paramBundle.getMessage());
                paramBundle = null;
              }
            }
          }
          label534: paramBundle.setOnDismissListener(this.cMR);
          AppMethodBeat.o(7099);
          continue;
          this.che.ae(100L, 100L);
          AppMethodBeat.o(7099);
          continue;
          ((q)com.tencent.mm.kernel.g.K(q.class)).a(this, paramBundle.getStringExtra("proxyui_handle_event_url"), this.cMR);
          AppMethodBeat.o(7099);
          continue;
          i = getIntent().getIntExtra("proxyui_expired_errtype", 0);
          int j = getIntent().getIntExtra("proxyui_expired_errcode", 0);
          if ((i == 0) && (j == 0))
          {
            ab.e("MicroMsg.WebViewStubProxyUI", "PROXY_AC_VALUE_ACCOUNT_EXPIRED, errType & errCode should not both be 0");
            AppMethodBeat.o(7099);
          }
          else
          {
            paramBundle = new c();
            paramBundle.crO.crP = this;
            paramBundle.crO.errType = i;
            paramBundle.crO.errCode = j;
            com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
            AppMethodBeat.o(7099);
            continue;
            paramBundle = getIntent().getStringExtra("proxyui_phone");
            if (bo.isNullOrNil(paramBundle))
            {
              ab.e("MicroMsg.WebViewStubProxyUI", "show phone span dialog, phone is empty");
              finish();
              AppMethodBeat.o(7099);
            }
            else
            {
              localObject2 = new Bundle();
              ((Bundle)localObject2).putInt("fromScene", 3);
              localObject1 = new qr();
              ((qr)localObject1).cMP.context = this;
              ((qr)localObject1).cMP.cMQ = paramBundle;
              ((qr)localObject1).cMP.cMR = this.cMR;
              ((qr)localObject1).cMP.cMS = ((Bundle)localObject2);
              com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
              AppMethodBeat.o(7099);
              continue;
              paramBundle = (Intent)getIntent().getExtras().getParcelable("proxyui_next_intent_key");
              paramBundle.setFlags(603979776);
              localObject1 = new Intent();
              ((Intent)localObject1).setClass(this, SimpleLoginUI.class);
              MMWizardActivity.b(this, (Intent)localObject1, paramBundle);
              finish();
              AppMethodBeat.o(7099);
            }
          }
        }
      }
      Object localObject2 = getIntent().getStringExtra("KAppId");
      paramBundle = getIntent().getStringExtra("shortcut_user_name");
      if ((!bo.isNullOrNil((String)localObject2)) && (!bo.isNullOrNil(paramBundle)))
      {
        getString(2131297061);
        localObject1 = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new WebViewStubProxyUI.3(this));
        ((com.tencent.mm.ui.base.p)localObject1).show();
        at.a(ah.getContext(), paramBundle, (String)localObject2, new WebViewStubProxyUI.4(this, (com.tencent.mm.ui.base.p)localObject1));
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7101);
    super.onDestroy();
    if (!this.uqh)
      this.umI = null;
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(this.uqj);
    if (localg.ehJ != null)
    {
      localg.ehJ.dismiss();
      localg.ehJ = null;
    }
    ab.i("MicroMsg.WebViewStubProxyUI", "onDestroy proxyui");
    AppMethodBeat.o(7101);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(7102);
    switch (paramInt)
    {
    default:
    case 72:
    case 113:
    case 115:
    case 116:
    case 117:
    case 118:
    case 119:
    case 120:
    }
    while (true)
    {
      AppMethodBeat.o(7102);
      while (true)
      {
        return;
        if (paramArrayOfInt[0] != 0)
          break;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(this.uqj).c(paramInt, -1, null);
        AppMethodBeat.o(7102);
      }
      com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(this.uqj).c(paramInt, 0, null);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI
 * JD-Core Version:    0.6.2
 */