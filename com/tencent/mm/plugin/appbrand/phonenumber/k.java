package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberExplainDialog;", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;", "appId", "", "pageUrl", "context", "Landroid/content/Context;", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "getAppId", "()Ljava/lang/String;", "backIv", "Landroid/widget/ImageView;", "contentTv", "Landroid/widget/TextView;", "getContext", "()Landroid/content/Context;", "mDialogContainer", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/IRuntimeDialogContainer;", "getPageUrl", "rootView", "Landroid/view/View;", "titleTv", "cancel", "", "content", "dismiss", "getContentView", "getPosition", "", "isCancelable", "", "isCanceledOnTouchOutside", "onCancel", "onDismiss", "onScreenOrientationChanged", "rotation", "onShow", "dialogHelper", "tryshow", "height", "plugin-appbrand-integration_release"})
public final class k
  implements com.tencent.mm.plugin.appbrand.widget.b.j
{
  private final String appId;
  final Context context;
  final TextView gKl;
  private final TextView gne;
  private final String hzj;
  com.tencent.mm.plugin.appbrand.widget.b.k iyk;
  final ImageView iyl;
  final View iym;

  public k(String paramString1, String paramString2, Context paramContext)
  {
    AppMethodBeat.i(134845);
    this.appId = paramString1;
    this.hzj = paramString2;
    this.context = paramContext;
    paramString1 = View.inflate(this.context, 2130968701, null);
    a.f.b.j.o(paramString1, "View.inflate(context, R.…ber_explain_dialog, null)");
    this.iym = paramString1;
    paramString1 = this.iym.findViewById(2131821252);
    a.f.b.j.o(paramString1, "rootView.findViewById(R.…mber_explain_dialog_back)");
    this.iyl = ((ImageView)paramString1);
    paramString1 = this.iym.findViewById(2131821253);
    a.f.b.j.o(paramString1, "rootView.findViewById(R.…ber_explain_dialog_title)");
    this.gne = ((TextView)paramString1);
    paramString1 = this.iym.findViewById(2131821254);
    a.f.b.j.o(paramString1, "rootView.findViewById(R.…r_explain_dialog_content)");
    this.gKl = ((TextView)paramString1);
    AppMethodBeat.o(134845);
  }

  public final void a(com.tencent.mm.plugin.appbrand.widget.b.k paramk)
  {
  }

  public final boolean aKP()
  {
    return true;
  }

  public final void cancel()
  {
  }

  public final void dismiss()
  {
  }

  public final View getContentView()
  {
    return this.iym;
  }

  public final int getPosition()
  {
    return 2;
  }

  public final boolean isCancelable()
  {
    return true;
  }

  public final void onCancel()
  {
  }

  public final void pF(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.k
 * JD-Core Version:    0.6.2
 */