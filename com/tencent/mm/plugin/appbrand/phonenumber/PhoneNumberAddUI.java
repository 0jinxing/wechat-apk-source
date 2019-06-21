package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import b.a.a.a.a.a.a.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.widget.MMSwitchBtn;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "finishBtn", "Landroid/widget/Button;", "getFinishBtn", "()Landroid/widget/Button;", "setFinishBtn", "(Landroid/widget/Button;)V", "formInputView", "Lcom/tencent/mm/ui/base/MMFormVerifyCodeInputView;", "getFormInputView", "()Lcom/tencent/mm/ui/base/MMFormVerifyCodeInputView;", "setFormInputView", "(Lcom/tencent/mm/ui/base/MMFormVerifyCodeInputView;)V", "formVerifyCodeInputView", "Lcom/tencent/mm/ui/base/MMFormInputView;", "getFormVerifyCodeInputView", "()Lcom/tencent/mm/ui/base/MMFormInputView;", "setFormVerifyCodeInputView", "(Lcom/tencent/mm/ui/base/MMFormInputView;)V", "mobile", "getMobile", "setMobile", "report", "Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "getReport", "()Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "setReport", "(Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;)V", "switchBtn", "Lcom/tencent/mm/ui/widget/MMSwitchBtn;", "getSwitchBtn", "()Lcom/tencent/mm/ui/widget/MMSwitchBtn;", "setSwitchBtn", "(Lcom/tencent/mm/ui/widget/MMSwitchBtn;)V", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "sendSms", "showErrorTips", "errMsg", "verifyCode", "Companion", "plugin-appbrand-integration_release"})
@com.tencent.mm.ui.base.a(3)
public final class PhoneNumberAddUI extends MMActivity
{
  public static final a ixW;
  String appId = "";
  String cFl = "";
  MMFormVerifyCodeInputView ixR;
  MMFormInputView ixS;
  MMSwitchBtn ixT;
  Button ixU;
  be ixV;

  static
  {
    AppMethodBeat.i(134840);
    ixW = new a((byte)0);
    AppMethodBeat.o(134840);
  }

  public final int getLayoutId()
  {
    return 2130968700;
  }

  public final void iN(String paramString)
  {
    AppMethodBeat.i(134836);
    j.p(paramString, "<set-?>");
    this.cFl = paramString;
    AppMethodBeat.o(134836);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(134837);
    super.onCreate(paramBundle);
    xE(-1);
    getContentView().setBackgroundColor(dyd());
    paramBundle = getIntent().getStringExtra("APPID");
    j.o(paramBundle, "intent.getStringExtra(APPID)");
    this.appId = paramBundle;
    ab.i("MicroMsg.PhoneNumberAddUI", "onCreate() appId:%s", new Object[] { this.appId });
    this.ixV = b.a.a.a.a.a.a.a.a.BTg.awB(this.appId);
    this.ixT = ((MMSwitchBtn)findViewById(2131821250));
    this.ixU = ((Button)findViewById(2131821251));
    this.ixR = ((MMFormVerifyCodeInputView)findViewById(2131821248));
    paramBundle = this.ixR;
    if (paramBundle != null)
      paramBundle.setInputType(3);
    paramBundle = this.ixR;
    if (paramBundle != null)
      paramBundle.setSendSmsBtnClickListener((View.OnClickListener)new PhoneNumberAddUI.b(this));
    paramBundle = this.ixR;
    if (paramBundle != null)
      paramBundle.addTextChangedListener((TextWatcher)new PhoneNumberAddUI.c(this));
    this.ixS = ((MMFormInputView)findViewById(2131821249));
    paramBundle = this.ixS;
    if (paramBundle != null)
      paramBundle.setInputType(3);
    paramBundle = this.ixS;
    if (paramBundle != null)
      paramBundle.addTextChangedListener((TextWatcher)new PhoneNumberAddUI.d(this));
    paramBundle = this.ixU;
    if (paramBundle != null)
    {
      paramBundle.setOnClickListener((View.OnClickListener)new PhoneNumberAddUI.e(this));
      AppMethodBeat.o(134837);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134837);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(134839);
    super.onDestroy();
    MMFormVerifyCodeInputView localMMFormVerifyCodeInputView = this.ixR;
    if (localMMFormVerifyCodeInputView != null)
    {
      localMMFormVerifyCodeInputView.reset();
      AppMethodBeat.o(134839);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134839);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(134838);
    super.onResume();
    setMMTitle(2131297131);
    dyb();
    setBackBtn((MenuItem.OnMenuItemClickListener)new PhoneNumberAddUI.f(this));
    AppMethodBeat.o(134838);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddUI$Companion;", "", "()V", "APPID", "", "TAG", "addPhoneNumber", "", "context", "Landroid/content/Context;", "appId", "plugin-appbrand-integration_release"})
  public static final class a
  {
    public static void X(Context paramContext, String paramString)
    {
      AppMethodBeat.i(134814);
      j.p(paramContext, "context");
      j.p(paramString, "appId");
      Intent localIntent = new Intent(paramContext, PhoneNumberAddUI.class);
      localIntent.putExtra("APPID", paramString);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(134814);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Lcom/tencent/mm/modelbase/Cgi$CgiBack;", "Lcom/tencent/mm/protocal/protobuf/CheckVerifyCodeResp;", "kotlin.jvm.PlatformType", "call"})
  static final class j<_Ret, _Var>
    implements com.tencent.mm.vending.c.a<_Ret, _Var>
  {
    j(PhoneNumberAddUI paramPhoneNumberAddUI)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI
 * JD-Core Version:    0.6.2
 */