package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import a.v;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.vending.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog;", "", "context", "Landroid/content/Context;", "appId", "", "report", "Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "ext_desc", "phoneItem", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "onVerifyCallback", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$OnVerifyCallback;", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$OnVerifyCallback;)V", "INTERVAL_UPDATE_TIME", "", "MAX_WAIT_TIME", "getAppId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "getExt_desc", "mobileTV", "Landroid/widget/TextView;", "getOnVerifyCallback", "()Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$OnVerifyCallback;", "getPhoneItem", "()Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "getReport", "()Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "setReport", "(Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;)V", "sendCodeTV", "smsEditView", "Lcom/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView;", "verifyCodeView", "Landroid/view/View;", "verifyTime", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$VertifyTimer;", "doFailCallback", "", "errMsg", "doSendVerifyCode", "isFirst", "", "doSuccessCallback", "encryptedData", "iv", "doVerifyCode", "code", "handleCheckVerifyCodeStatus", "status", "handleSendVerifyCodeStatus", "hideVKB", "showErrorTips", "showVKB", "showVerifyMobileDialog", "startSmsListener", "stopSmsListener", "tryShow", "updateSendText", "Companion", "OnVerifyCallback", "VertifyTimer", "plugin-appbrand-integration_release"})
public final class m
{
  public static final m.a izc;
  private final String appId;
  final Context context;
  private TextView gsq;
  be ixV;
  private View iyT;
  private EditVerifyCodeView iyU;
  private TextView iyV;
  private m.c iyW;
  private final int iyX;
  private final int iyY;
  private final String iyZ;
  final PhoneItem iza;
  private final m.b izb;

  static
  {
    AppMethodBeat.i(134924);
    izc = new m.a((byte)0);
    AppMethodBeat.o(134924);
  }

  public m(Context paramContext, String paramString1, be parambe, String paramString2, PhoneItem paramPhoneItem, m.b paramb)
  {
    AppMethodBeat.i(134923);
    this.context = paramContext;
    this.appId = paramString1;
    this.ixV = parambe;
    this.iyZ = paramString2;
    this.iza = paramPhoneItem;
    this.izb = paramb;
    this.iyX = 60000;
    this.iyY = 1000;
    paramContext = this.context.getSystemService("layout_inflater");
    if (paramContext == null)
    {
      paramContext = new v("null cannot be cast to non-null type android.view.LayoutInflater");
      AppMethodBeat.o(134923);
      throw paramContext;
    }
    this.iyT = ((LayoutInflater)paramContext).inflate(2130968742, null);
    paramContext = this.iyT;
    if (paramContext != null)
    {
      paramContext = (EditVerifyCodeView)paramContext.findViewById(2131821400);
      this.iyU = paramContext;
      paramContext = this.iyT;
      if (paramContext == null)
        break label209;
      paramContext = (TextView)paramContext.findViewById(2131821399);
      label169: this.gsq = paramContext;
      paramContext = this.iyT;
      if (paramContext == null)
        break label214;
    }
    label209: label214: for (paramContext = (TextView)paramContext.findViewById(2131821401); ; paramContext = null)
    {
      this.iyV = paramContext;
      AppMethodBeat.o(134923);
      return;
      paramContext = null;
      break;
      paramContext = null;
      break label169;
    }
  }

  private final void Dv(String paramString)
  {
    AppMethodBeat.i(134922);
    aKV();
    h.a(this.context, paramString, "", false, (DialogInterface.OnClickListener)new m.j(this));
    AppMethodBeat.o(134922);
  }

  private final void aKU()
  {
    AppMethodBeat.i(134918);
    String str = this.context.getString(2131296646);
    Object localObject1 = this.context.getString(2131296648);
    Object localObject2 = new SpannableStringBuilder();
    ((SpannableStringBuilder)localObject2).append((CharSequence)str);
    ((SpannableStringBuilder)localObject2).append((CharSequence)localObject1);
    int i = str.length();
    int j = ((String)localObject1).length();
    ((SpannableStringBuilder)localObject2).setSpan(new m.o(this), i, i + j, 17);
    ((SpannableStringBuilder)localObject2).setSpan(new ForegroundColorSpan(this.context.getResources().getColor(2131690208)), i, j + i, 17);
    localObject1 = this.iyV;
    if (localObject1 != null)
      ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject2 = this.iyV;
    if (localObject2 != null)
    {
      ((TextView)localObject2).setMovementMethod(LinkMovementMethod.getInstance());
      AppMethodBeat.o(134918);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134918);
    }
  }

  private final void aKV()
  {
    AppMethodBeat.i(134919);
    ab.i("MicroMsg.PhoneNumberVerifyCodeDialog", "stopSmsListener");
    m.c localc = this.iyW;
    if (localc != null)
    {
      localc.cancel();
      AppMethodBeat.o(134919);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134919);
    }
  }

  final void ez(boolean paramBoolean)
  {
    AppMethodBeat.i(134920);
    ab.i("MicroMsg.PhoneNumberVerifyCodeDialog", "doSendVerifyCode");
    Object localObject = this.context;
    this.context.getString(2131297061);
    localObject = h.b((Context)localObject, this.context.getString(2131297151), true, null);
    if (this.iza.ixM)
    {
      new e(this.appId, this.iza.cFl).acy().h((a)new m.d(this, (p)localObject, paramBoolean));
      AppMethodBeat.o(134920);
    }
    while (true)
    {
      return;
      new d(this.appId, this.iza.cFl).acy().h((a)new m.e(this, (p)localObject, paramBoolean));
      AppMethodBeat.o(134920);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.m
 * JD-Core Version:    0.6.2
 */