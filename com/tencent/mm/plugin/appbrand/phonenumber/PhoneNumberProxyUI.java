package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.t;
import a.g;
import a.i.k;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a.a.a.a.a.a.a.a;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.plugin.appbrand.widget.b.e;
import com.tencent.mm.plugin.appbrand.widget.b.e.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$DismissAnimationEndListener;", "()V", "apiName", "", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "appIcon", "getAppIcon", "setAppIcon", "appId", "getAppId", "setAppId", "appName", "getAppName", "setAppName", "authDesc", "getAuthDesc", "setAuthDesc", "desc", "getDesc", "setDesc", "extDesc", "getExtDesc", "setExtDesc", "isFirstOpen", "", "()Z", "setFirstOpen", "(Z)V", "mDialogContainer", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout;", "getMDialogContainer", "()Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout;", "mDialogContainer$delegate", "Lkotlin/Lazy;", "pagePath", "getPagePath", "setPagePath", "phoneItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Lkotlin/collections/ArrayList;", "getPhoneItems", "()Ljava/util/ArrayList;", "setPhoneItems", "(Ljava/util/ArrayList;)V", "phoneNumberManageDialog", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog;", "getPhoneNumberManageDialog", "()Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog;", "setPhoneNumberManageDialog", "(Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog;)V", "report", "Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "getReport", "()Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "setReport", "(Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;)V", "withCredentials", "getWithCredentials", "setWithCredentials", "doBindPhoneNumber", "", "finishWithFail", "errMsg", "finishWithSuccess", "encryptedData", "iv", "getLayoutId", "", "getPhoneItemsFromServer", "isFirst", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEnd", "onResume", "tryToBindWechatPhoneNumber", "Companion", "plugin-appbrand-integration_release"})
@com.tencent.mm.ui.base.a(7)
public final class PhoneNumberProxyUI extends MMActivity
  implements e.a
{
  public static final PhoneNumberProxyUI.a iyP;
  String appId;
  private String appName;
  String csu;
  String desc;
  private String hac;
  be ixV;
  ArrayList<PhoneItem> ixy;
  String iyA;
  private String iyJ;
  private boolean iyK;
  l iyL;
  String iyM;
  private final a.f iyN;
  private boolean iyO;

  static
  {
    AppMethodBeat.i(134881);
    eQB = new k[] { (k)a.f.b.v.a(new t(a.f.b.v.aN(PhoneNumberProxyUI.class), "mDialogContainer", "getMDialogContainer()Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout;")) };
    iyP = new PhoneNumberProxyUI.a((byte)0);
    AppMethodBeat.o(134881);
  }

  public PhoneNumberProxyUI()
  {
    AppMethodBeat.i(134890);
    this.appId = "";
    this.appName = "";
    this.csu = "";
    this.iyJ = "";
    this.hac = "";
    this.ixy = new ArrayList();
    this.iyN = g.g((a.f.a.a)new PhoneNumberProxyUI.e(this));
    this.iyO = true;
    AppMethodBeat.o(134890);
  }

  private final e aKS()
  {
    AppMethodBeat.i(134882);
    e locale = (e)this.iyN.getValue();
    AppMethodBeat.o(134882);
    return locale;
  }

  private final void aKT()
  {
    AppMethodBeat.i(134885);
    be localbe = this.ixV;
    if (localbe != null)
    {
      localObject = this.ixV;
      if (localObject == null)
        break label130;
    }
    label130: for (Object localObject = Long.valueOf(((be)localObject).Gx()); ; localObject = null)
    {
      if (localObject == null)
        a.f.b.j.dWJ();
      localbe.cN(((Long)localObject).longValue() + 1L);
      localObject = h.b((Context)this, getString(2131297145), true, (DialogInterface.OnCancelListener)new PhoneNumberProxyUI.d(this));
      d.i("MicroMsg.PhoneNumberProxyUI", "getPhoneItemsFromServer()");
      new c(this.appId, this.iyJ, this.iyK).acy().h((com.tencent.mm.vending.c.a)new PhoneNumberProxyUI.c(this, (p)localObject));
      AppMethodBeat.o(134885);
      return;
    }
  }

  public final void CV()
  {
    AppMethodBeat.i(134889);
    if (aKS().size() == 0)
      finish();
    AppMethodBeat.o(134889);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(134888);
    if (!aKS().wY())
      super.onBackPressed();
    AppMethodBeat.o(134888);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(134883);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    ae.a(getWindow());
    addContentView((View)aKS(), new ViewGroup.LayoutParams(-1, -1));
    paramBundle = getIntent().getStringExtra("appId");
    a.f.b.j.o(paramBundle, "intent.getStringExtra(APP_ID)");
    this.appId = paramBundle;
    paramBundle = getIntent().getStringExtra("apiName");
    a.f.b.j.o(paramBundle, "intent.getStringExtra(API_NAME)");
    this.iyJ = paramBundle;
    paramBundle = getIntent().getStringExtra("pagePath");
    a.f.b.j.o(paramBundle, "intent.getStringExtra(PAGE_PATH)");
    this.csu = paramBundle;
    this.iyK = getIntent().getBooleanExtra("withCredentials", false);
    paramBundle = getIntent().getStringExtra("appName");
    a.f.b.j.o(paramBundle, "intent.getStringExtra(APP_NAME)");
    this.appName = paramBundle;
    paramBundle = getIntent().getStringExtra("appIcon");
    a.f.b.j.o(paramBundle, "intent.getStringExtra(APP_ICON)");
    this.hac = paramBundle;
    d.i("MicroMsg.PhoneNumberProxyUI", "onCreate() appId:%s apiName:%s withCredentials:%b", new Object[] { this.appId, this.iyJ, Boolean.valueOf(this.iyK) });
    b.a.a.a.a.a.a.a.a.BTg.Az(this.appId);
    this.ixV = b.a.a.a.a.a.a.a.a.BTg.awB(this.appId);
    this.iyL = new l((Context)this, this.appId);
    paramBundle = this.iyL;
    if (paramBundle != null)
      paramBundle.Du(this.appName);
    paramBundle = this.iyL;
    if (paramBundle != null)
      paramBundle.Dt(this.hac);
    paramBundle = this.iyL;
    if (paramBundle != null)
      paramBundle.iyx = ((l.b)new PhoneNumberProxyUI.f(this));
    Object localObject = this.iyL;
    if (localObject != null)
    {
      paramBundle = (View.OnClickListener)new PhoneNumberProxyUI.g(this);
      a.f.b.j.p(paramBundle, "denyListener");
      localObject = ((l)localObject).iyt;
      if (localObject != null)
        ((TextView)localObject).setOnClickListener(paramBundle);
    }
    paramBundle = this.iyL;
    if (paramBundle != null)
      paramBundle.cMR = ((DialogInterface.OnDismissListener)new PhoneNumberProxyUI.h(this));
    localObject = this.iyL;
    if (localObject != null)
    {
      paramBundle = (View.OnClickListener)new PhoneNumberProxyUI.i(this);
      a.f.b.j.p(paramBundle, "explainListener");
      ((l)localObject).iyu.setOnClickListener(paramBundle);
      if (((l)localObject).iyu.getVisibility() != 0)
        ((l)localObject).iyu.setVisibility(0);
    }
    paramBundle = this.iyL;
    if (paramBundle != null)
    {
      localObject = (View.OnClickListener)new PhoneNumberProxyUI.j(this);
      a.f.b.j.p(localObject, "functionListener");
      paramBundle.iyr.setOnClickListener((View.OnClickListener)localObject);
    }
    aKS().a((e.a)this);
    AppMethodBeat.o(134883);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(134887);
    super.onDestroy();
    aKS().b((e.a)this);
    b.a.a.a.a.a.a.a.a.BTg.awC(this.appId);
    AppMethodBeat.o(134887);
  }

  public final void onResume()
  {
    AppMethodBeat.i(134884);
    super.onResume();
    if (this.iyO)
    {
      this.iyO = false;
      aKT();
      AppMethodBeat.o(134884);
    }
    while (true)
    {
      return;
      Object localObject = j.ixQ.aKN();
      if (localObject == null)
      {
        localObject = new a.v("null cannot be cast to non-null type kotlin.collections.ArrayList<com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem> /* = java.util.ArrayList<com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem> */");
        AppMethodBeat.o(134884);
        throw ((Throwable)localObject);
      }
      this.ixy = ((ArrayList)localObject);
      localObject = this.iyL;
      if (localObject != null)
        ((l)localObject).p(this.ixy);
      localObject = this.iyL;
      if (localObject != null)
      {
        ((l)localObject).aKQ();
        AppMethodBeat.o(134884);
      }
      else
      {
        AppMethodBeat.o(134884);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI
 * JD-Core Version:    0.6.2
 */