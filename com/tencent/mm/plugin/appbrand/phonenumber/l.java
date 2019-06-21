package com.tencent.mm.plugin.appbrand.phonenumber;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.Collection;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog;", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;", "context", "Landroid/content/Context;", "appId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "buttonGroup", "Landroid/view/View;", "getContext", "()Landroid/content/Context;", "denyTv", "Landroid/widget/TextView;", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "explainIv", "Landroid/widget/ImageView;", "functionTv", "iconIv", "iconUrl", "itemAdapter", "Lcom/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter;", "listRv", "Landroid/support/v7/widget/RecyclerView;", "loadingV", "Landroid/widget/ProgressBar;", "name", "nameTv", "okTv", "onPhoneItemSelect", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$OnPhoneItemSelect;", "getOnPhoneItemSelect", "()Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$OnPhoneItemSelect;", "setOnPhoneItemSelect", "(Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$OnPhoneItemSelect;)V", "phoneItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Lkotlin/collections/ArrayList;", "rootView", "cancel", "", "denyListener", "Landroid/view/View$OnClickListener;", "dismiss", "explainListener", "functionListener", "getContentView", "getDialogHeight", "", "getPosition", "icon", "isCancelable", "", "isCanceledOnTouchOutside", "onCancel", "onDismiss", "onScreenOrientationChanged", "rotation", "onShow", "dialogHelper", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/IRuntimeDialogContainer;", "updateDialog", "updateDialogInner", "Companion", "OnPhoneItemSelect", "plugin-appbrand-integration_release"})
public final class l
  implements com.tencent.mm.plugin.appbrand.widget.b.j
{
  public static final l.a iyy;
  private final String appId;
  DialogInterface.OnDismissListener cMR;
  private final Context context;
  private final TextView gtb;
  private String iconUrl;
  private ArrayList<PhoneItem> ixy;
  final View iym;
  private final ImageView iyo;
  private final RecyclerView iyp;
  private final ProgressBar iyq;
  final TextView iyr;
  private final TextView iys;
  final TextView iyt;
  final ImageView iyu;
  private i iyv;
  private View iyw;
  l.b iyx;
  private String name;

  static
  {
    AppMethodBeat.i(134857);
    iyy = new l.a((byte)0);
    AppMethodBeat.o(134857);
  }

  public l(Context paramContext, String paramString)
  {
    AppMethodBeat.i(134856);
    this.context = paramContext;
    this.appId = paramString;
    paramContext = View.inflate(this.context, 2130968702, null);
    a.f.b.j.o(paramContext, "View.inflate(context, R.…ber_manager_dialog, null)");
    this.iym = paramContext;
    this.name = "";
    this.iconUrl = "";
    this.ixy = new ArrayList();
    paramContext = this.iym.findViewById(2131821255);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…mber_manager_dialog_icon)");
    this.iyo = ((ImageView)paramContext);
    paramContext = this.iym.findViewById(2131821256);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…mber_manager_dialog_name)");
    this.gtb = ((TextView)paramContext);
    paramContext = this.iym.findViewById(2131821263);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…_manager_dialog_function)");
    this.iyr = ((TextView)paramContext);
    paramContext = this.iym.findViewById(2131821266);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…number_manager_dialog_ok)");
    this.iys = ((TextView)paramContext);
    paramContext = this.iym.findViewById(2131821265);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…er_manager_dialog_cancel)");
    this.iyt = ((TextView)paramContext);
    paramContext = this.iym.findViewById(2131821258);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…r_manager_dialog_explain)");
    this.iyu = ((ImageView)paramContext);
    paramContext = this.iym.findViewById(2131821019);
    a.f.b.j.o(paramContext, "rootView.findViewById<View>(R.id.content)");
    paramContext.setVisibility(0);
    paramContext = this.iym.findViewById(2131821264);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.id.button_group)");
    this.iyw = paramContext;
    paramContext = this.iym.findViewById(2131821262);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…r_manager_dialog_loading)");
    this.iyq = ((ProgressBar)paramContext);
    paramContext = this.iym.findViewById(2131821261);
    a.f.b.j.o(paramContext, "rootView.findViewById(R.…ager_dialog_recyclerview)");
    this.iyp = ((RecyclerView)paramContext);
    this.iyp.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    this.iyv = new i(this.appId, this.context, this.ixy);
    this.iyp.setAdapter((RecyclerView.a)this.iyv);
    this.iys.setOnClickListener((View.OnClickListener)new l.1(this));
    AppMethodBeat.o(134856);
  }

  private final void aKR()
  {
    AppMethodBeat.i(134853);
    b.abR().a(this.iyo, this.iconUrl, null, (b.f)f.fqH);
    this.gtb.setText((CharSequence)this.name);
    if (this.ixy.size() == 0)
    {
      this.iyq.setVisibility(0);
      this.iyp.setVisibility(8);
      this.iyr.setVisibility(8);
      AppMethodBeat.o(134853);
    }
    while (true)
    {
      return;
      if (this.ixy.size() == 1)
      {
        this.iyq.setVisibility(8);
        this.iyp.setVisibility(0);
        this.iyr.setVisibility(0);
        this.iyp.getAdapter().notifyDataSetChanged();
        this.iyr.setText((CharSequence)this.context.getString(2131297149));
        AppMethodBeat.o(134853);
      }
      else
      {
        this.iyq.setVisibility(8);
        this.iyp.setVisibility(0);
        this.iyr.setVisibility(0);
        this.iyp.getAdapter().notifyDataSetChanged();
        this.iyr.setText((CharSequence)this.context.getString(2131297147));
        AppMethodBeat.o(134853);
      }
    }
  }

  public final l Dt(String paramString)
  {
    AppMethodBeat.i(134849);
    a.f.b.j.p(paramString, "iconUrl");
    this.iconUrl = paramString;
    AppMethodBeat.o(134849);
    return this;
  }

  public final l Du(String paramString)
  {
    AppMethodBeat.i(134850);
    a.f.b.j.p(paramString, "name");
    this.name = paramString;
    AppMethodBeat.o(134850);
    return this;
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(134854);
    aKR();
    AppMethodBeat.o(134854);
  }

  public final boolean aKP()
  {
    return false;
  }

  public final void aKQ()
  {
    AppMethodBeat.i(134852);
    Looper localLooper = Looper.getMainLooper();
    a.f.b.j.o(localLooper, "Looper.getMainLooper()");
    if (a.f.b.j.j(localLooper.getThread(), Thread.currentThread()))
    {
      aKR();
      AppMethodBeat.o(134852);
    }
    while (true)
    {
      return;
      al.d((Runnable)new l.c(this));
      AppMethodBeat.o(134852);
    }
  }

  public final void cancel()
  {
  }

  public final void dismiss()
  {
    AppMethodBeat.i(134848);
    DialogInterface.OnDismissListener localOnDismissListener = this.cMR;
    if (localOnDismissListener != null)
    {
      localOnDismissListener.onDismiss(null);
      AppMethodBeat.o(134848);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134848);
    }
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

  public final l p(ArrayList<PhoneItem> paramArrayList)
  {
    AppMethodBeat.i(134851);
    a.f.b.j.p(paramArrayList, "phoneItems");
    this.ixy.clear();
    this.ixy.addAll((Collection)paramArrayList);
    AppMethodBeat.o(134851);
    return this;
  }

  public final void pF(int paramInt)
  {
    AppMethodBeat.i(134855);
    com.tencent.mm.plugin.appbrand.widget.b.l.a locala = com.tencent.mm.plugin.appbrand.widget.b.l.jcT;
    com.tencent.mm.plugin.appbrand.widget.b.l.a.a(this.context, this.iym, this.iyw, paramInt);
    AppMethodBeat.o(134855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.l
 * JD-Core Version:    0.6.2
 */