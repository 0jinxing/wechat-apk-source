package com.tencent.mm.plugin.appbrand.widget.b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.modelappbrand.a.f;
import java.util.ArrayList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog;", "Landroid/app/Dialog;", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;", "context", "Landroid/content/Context;", "listener", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$Listener;", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$Listener;)V", "value", "", "appBrandName", "getAppBrandName", "()Ljava/lang/String;", "setAppBrandName", "(Ljava/lang/String;)V", "applyWording", "getApplyWording", "setApplyWording", "buttonGroup", "Landroid/view/View;", "funcTv", "Landroid/widget/TextView;", "Landroid/graphics/Bitmap;", "icon", "getIcon", "()Landroid/graphics/Bitmap;", "setIcon", "(Landroid/graphics/Bitmap;)V", "iconUrl", "getIconUrl", "setIconUrl", "loadingView", "mAdapter", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$ItemAdapter;", "mApplyWordingTv", "mBtnAccept", "Landroid/widget/Button;", "mBtnReject", "mDialogContainer", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/IRuntimeDialogContainer;", "mExplainIv", "Landroid/widget/ImageView;", "mIconIv", "mListener", "mNameTv", "mOnDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "mOnShowListener", "Landroid/content/DialogInterface$OnShowListener;", "mRequestDescTv", "mRootView", "mScope", "mSelectListLayout", "Landroid/widget/LinearLayout;", "mSimpleDetailDescTv", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "requestDesc", "getRequestDesc", "setRequestDesc", "simpleDetailDesc", "getSimpleDetailDesc", "setSimpleDetailDesc", "dismiss", "", "getContentView", "getPosition", "", "getScope", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "check", "", "isCancelable", "isCanceledOnTouchOutside", "onCancel", "onDismiss", "onScreenOrientationChanged", "rotation", "onShow", "dialogHelper", "setNegativeButtonText", "cancelWording", "setPositiveButtonText", "allowWording", "setScope", "scope", "setSelectListItem", "items", "", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$Item;", "Companion", "Item", "ItemAdapter", "Listener", "luggage-wechat-full-sdk_release"})
public final class h extends Dialog
  implements j
{
  public static final h.a jcD;
  private DialogInterface.OnDismissListener Uf;
  private String hCq;
  public RecyclerView iJP;
  private ImageView iUn;
  private String iconUrl;
  private k iyk;
  private View iyw;
  private String jcA;
  private String jcB;
  private String jcC;
  private View jcl;
  private TextView jcm;
  private Button jcn;
  private Button jco;
  private TextView jcp;
  public TextView jcq;
  private ImageView jcr;
  private TextView jcs;
  public LinearLayout jct;
  public TextView jcu;
  public View jcv;
  private DialogInterface.OnShowListener jcw;
  private d jcx;
  public h.c jcy;
  private String jcz;

  static
  {
    AppMethodBeat.i(102505);
    jcD = new h.a((byte)0);
    AppMethodBeat.o(102505);
  }

  public h(Context paramContext, d paramd)
  {
    super(paramContext);
    AppMethodBeat.i(102504);
    paramContext = View.inflate(paramContext, 2130968702, null);
    a.f.b.j.o(paramContext, "View.inflate(context, R.…ber_manager_dialog, null)");
    this.jcl = paramContext;
    this.jcx = paramd;
    this.hCq = "";
    paramContext = this.jcl.findViewById(2131821255);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…mber_manager_dialog_icon)");
    this.iUn = ((ImageView)paramContext);
    paramContext = this.jcl.findViewById(2131821256);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…mber_manager_dialog_name)");
    this.jcm = ((TextView)paramContext);
    paramContext = this.jcl.findViewById(2131821265);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…er_manager_dialog_cancel)");
    this.jco = ((Button)paramContext);
    paramContext = this.jcl.findViewById(2131821266);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…number_manager_dialog_ok)");
    this.jcn = ((Button)paramContext);
    paramContext = this.jcl.findViewById(2131821259);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R.id.request_desc)");
    this.jcp = ((TextView)paramContext);
    paramContext = this.jcl.findViewById(2131821260);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R.id.simple_detail_desc)");
    this.jcq = ((TextView)paramContext);
    paramContext = this.jcl.findViewById(2131821019);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R.id.content)");
    this.jct = ((LinearLayout)paramContext);
    paramContext = this.jcl.findViewById(2131821258);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…r_manager_dialog_explain)");
    this.jcr = ((ImageView)paramContext);
    paramContext = this.jcl.findViewById(2131821257);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R.id.action)");
    this.jcs = ((TextView)paramContext);
    paramContext = this.jcl.findViewById(2131821261);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…ager_dialog_recyclerview)");
    this.iJP = ((RecyclerView)paramContext);
    this.iJP.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    paramContext = this.jcl.findViewById(2131821262);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…r_manager_dialog_loading)");
    this.jcv = paramContext;
    paramContext = this.jcl.findViewById(2131821264);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R.id.button_group)");
    this.iyw = paramContext;
    paramContext = this.jcl.findViewById(2131821263);
    a.f.b.j.o(paramContext, "mRootView.findViewById(R…_manager_dialog_function)");
    this.jcu = ((TextView)paramContext);
    this.jcn.setOnClickListener((View.OnClickListener)new h.1(this));
    this.jco.setOnClickListener((View.OnClickListener)new h.2(this));
    this.iJP.setItemAnimator(null);
    AppMethodBeat.o(102504);
  }

  public final void EA(String paramString)
  {
    AppMethodBeat.i(102493);
    this.jcA = paramString;
    this.jcp.setText((CharSequence)paramString);
    AppMethodBeat.o(102493);
  }

  public final void EB(String paramString)
  {
    AppMethodBeat.i(102494);
    this.jcB = paramString;
    if (paramString != null)
    {
      this.jcq.setVisibility(0);
      this.jcq.setText((CharSequence)paramString);
    }
    AppMethodBeat.o(102494);
  }

  public final void EC(String paramString)
  {
    AppMethodBeat.i(102495);
    this.jcC = paramString;
    this.jcs.setText((CharSequence)paramString);
    AppMethodBeat.o(102495);
  }

  public final void ED(String paramString)
  {
    AppMethodBeat.i(102501);
    if (paramString != null)
    {
      this.jco.setText((CharSequence)paramString);
      AppMethodBeat.o(102501);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102501);
    }
  }

  public final void EE(String paramString)
  {
    AppMethodBeat.i(102502);
    if (paramString != null)
    {
      this.jcn.setText((CharSequence)paramString);
      AppMethodBeat.o(102502);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102502);
    }
  }

  public final void EF(String paramString)
  {
    AppMethodBeat.i(102503);
    a.f.b.j.p(paramString, "scope");
    this.hCq = paramString;
    AppMethodBeat.o(102503);
  }

  public final void Ez(String paramString)
  {
    AppMethodBeat.i(102492);
    this.jcz = paramString;
    TextView localTextView = this.jcm;
    if (paramString != null);
    for (paramString = (CharSequence)paramString; ; paramString = (CharSequence)"")
    {
      localTextView.setText(paramString);
      AppMethodBeat.o(102492);
      return;
    }
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(102497);
    Object localObject1 = this.jcw;
    if (localObject1 != null)
      ((DialogInterface.OnShowListener)localObject1).onShow((DialogInterface)this);
    this.iyk = paramk;
    localObject1 = getContext().getSystemService("window");
    paramk = (k)localObject1;
    if (!(localObject1 instanceof WindowManager))
      paramk = null;
    Object localObject2 = (WindowManager)paramk;
    if (localObject2 != null)
    {
      paramk = l.jcT;
      paramk = getContext();
      a.f.b.j.o(paramk, "context");
      View localView = this.jcl;
      localObject1 = this.iyw;
      localObject2 = ((WindowManager)localObject2).getDefaultDisplay();
      a.f.b.j.o(localObject2, "it.defaultDisplay");
      l.a.a(paramk, localView, (View)localObject1, ((Display)localObject2).getRotation());
      AppMethodBeat.o(102497);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102497);
    }
  }

  public final boolean aKP()
  {
    return false;
  }

  public final void dismiss()
  {
    AppMethodBeat.i(102499);
    super.dismiss();
    DialogInterface.OnDismissListener localOnDismissListener = this.Uf;
    if (localOnDismissListener != null)
    {
      localOnDismissListener.onDismiss((DialogInterface)this);
      AppMethodBeat.o(102499);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102499);
    }
  }

  public final View getContentView()
  {
    return this.jcl;
  }

  public final int getPosition()
  {
    return 2;
  }

  public final boolean isCancelable()
  {
    return true;
  }

  public final void jl(String paramString)
  {
    AppMethodBeat.i(102496);
    this.iconUrl = paramString;
    b.abR().a(this.iUn, this.iconUrl, 2130839503, (b.f)f.fqH);
    AppMethodBeat.o(102496);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(102500);
    this.jcx.a(3, new ArrayList());
    AppMethodBeat.o(102500);
  }

  public final void pF(int paramInt)
  {
    AppMethodBeat.i(102498);
    Object localObject = l.jcT;
    localObject = getContext();
    a.f.b.j.o(localObject, "context");
    l.a.a((Context)localObject, this.jcl, this.iyw, paramInt);
    AppMethodBeat.o(102498);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$Listener;", "", "onMsg", "", "resultCode", "", "resultData", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "luggage-wechat-full-sdk_release"})
  public static abstract interface d
  {
    public abstract void a(int paramInt, ArrayList<String> paramArrayList);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.h
 * JD-Core Version:    0.6.2
 */