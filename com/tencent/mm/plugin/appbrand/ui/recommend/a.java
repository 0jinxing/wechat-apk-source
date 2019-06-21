package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f;
import a.f.b.j;
import a.f.b.t;
import a.i.k;
import a.l;
import a.y;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.a.c;
import com.tencent.mm.plugin.appbrand.appusage.a.d;
import com.tencent.mm.plugin.appbrand.appusage.a.d.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI;
import com.tencent.mm.protocal.protobuf.bqd;
import java.text.DecimalFormat;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$BaseRecommendViewHolder;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "df", "Ljava/text/DecimalFormat;", "getDf", "()Ljava/text/DecimalFormat;", "setDf", "(Ljava/text/DecimalFormat;)V", "isEmptyList", "", "()Z", "onBindView", "Lkotlin/Function2;", "Lcom/tencent/mm/protocal/protobuf/RecommendCard;", "", "", "getOnBindView", "()Lkotlin/jvm/functions/Function2;", "setOnBindView", "(Lkotlin/jvm/functions/Function2;)V", "onClickContent", "getOnClickContent", "setOnClickContent", "onClickFooter", "getOnClickFooter", "setOnClickFooter", "wxaList", "Ljava/util/LinkedList;", "getWxaList", "()Ljava/util/LinkedList;", "wxaList$delegate", "Lkotlin/Lazy;", "appendData", "data", "getData", "position", "getItemCount", "getItemId", "", "getItemViewType", "getRecommendStatObj", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandRecommendStatObj;", "attr", "Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes;", "itemData", "pos", "jumpProfile", "context", "Landroid/content/Context;", "fromFooter", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAppNameViewMargin", "view", "Landroid/view/View;", "alignTop", "setData", "AppRecommendViewHolder", "AudioRecommendViewHolder", "BaseRecommendViewHolder", "BigVideoRecommendViewHolder", "Companion", "GoodsAppRecommendViewHolder", "ImageTextRecommendViewHolder", "VideoRecommendViewHolder", "WithContentDescViewHolder", "WithFooterViewHolder", "plugin-appbrand-integration_release"})
public final class a extends RecyclerView.a<a.c>
{
  public static final a.e iPB;
  final Activity activity;
  private DecimalFormat df;
  a.f.a.m<? super bqd, ? super Integer, y> iPA;
  private final f iPx;
  a.f.a.m<? super bqd, ? super Integer, y> iPy;
  a.f.a.m<? super bqd, ? super Integer, y> iPz;

  static
  {
    AppMethodBeat.i(135172);
    eQB = new k[] { (k)a.f.b.v.a(new t(a.f.b.v.aN(a.class), "wxaList", "getWxaList()Ljava/util/LinkedList;")) };
    iPB = new a.e((byte)0);
    AppMethodBeat.o(135172);
  }

  public a(Activity paramActivity)
  {
    AppMethodBeat.i(135181);
    this.activity = paramActivity;
    this.iPx = a.g.g((a.f.a.a)a.r.iPX);
    this.iPy = ((a.f.a.m)a.k.iPQ);
    this.iPz = ((a.f.a.m)a.q.iPW);
    this.iPA = ((a.f.a.m)a.p.iPV);
    this.df = new DecimalFormat("0.00");
    AppMethodBeat.o(135181);
  }

  public static AppBrandRecommendStatObj a(WxaAttributes paramWxaAttributes, bqd parambqd, int paramInt)
  {
    AppMethodBeat.i(135179);
    j.p(parambqd, "itemData");
    AppBrandRecommendStatObj localAppBrandRecommendStatObj = new AppBrandRecommendStatObj();
    localAppBrandRecommendStatObj.username = parambqd.wSq;
    localAppBrandRecommendStatObj.izZ = parambqd.izZ;
    localAppBrandRecommendStatObj.iAa = parambqd.iAa;
    if (paramWxaAttributes != null)
      localAppBrandRecommendStatObj.csB = paramWxaAttributes.field_appId;
    localAppBrandRecommendStatObj.iAb = parambqd.iAb;
    localAppBrandRecommendStatObj.iAc = parambqd.iAc;
    localAppBrandRecommendStatObj.iAd = parambqd.iAd;
    localAppBrandRecommendStatObj.iAe = parambqd.iAe;
    localAppBrandRecommendStatObj.position = (paramInt + 1);
    localAppBrandRecommendStatObj.cGm = c.getLongitude();
    localAppBrandRecommendStatObj.cEB = c.getLongitude();
    localAppBrandRecommendStatObj.hbj = d.hbu.aya().hbj;
    AppMethodBeat.o(135179);
    return localAppBrandRecommendStatObj;
  }

  private static void a(Context paramContext, View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(135177);
    j.p(paramContext, "context");
    j.p(paramView, "view");
    Object localObject;
    if ((paramView instanceof TextView))
    {
      localObject = paramView.getLayoutParams();
      if (localObject == null)
      {
        paramContext = new a.v("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        AppMethodBeat.o(135177);
        throw paramContext;
      }
      localObject = (ConstraintLayout.LayoutParams)localObject;
      if (localObject != null)
        if (!paramBoolean)
          break label97;
    }
    label97: for (((ConstraintLayout.LayoutParams)localObject).topMargin = paramContext.getResources().getDimensionPixelOffset(2131428067); ; ((ConstraintLayout.LayoutParams)localObject).topMargin = paramContext.getResources().getDimensionPixelOffset(2131428066))
    {
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      AppMethodBeat.o(135177);
      return;
    }
  }

  public final void a(Context paramContext, WxaAttributes paramWxaAttributes, bqd parambqd, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(138703);
    j.p(paramContext, "context");
    j.p(parambqd, "itemData");
    String str = parambqd.izZ;
    if (!TextUtils.isEmpty((CharSequence)parambqd.iAa))
      str = parambqd.izZ + ":" + parambqd.iAa.toString();
    WxaExposedParams.a locala = new WxaExposedParams.a();
    if (paramWxaAttributes != null)
    {
      locala.zC(paramWxaAttributes.field_appId);
      locala.zE(paramWxaAttributes.field_nickname);
    }
    locala.zD(parambqd.wSq);
    locala.zF(parambqd.wSx);
    locala.nF(12);
    AppBrandRecommendStatObj localAppBrandRecommendStatObj = a(paramWxaAttributes, parambqd, paramInt);
    paramWxaAttributes = new Bundle();
    paramWxaAttributes.putParcelable("key_recommend_stat_obj", (Parcelable)localAppBrandRecommendStatObj);
    AppBrandProfileUI.a(paramContext, parambqd.wSq, 7, str, locala.ayP(), paramWxaAttributes, null);
    if (paramBoolean)
    {
      this.iPz.m(parambqd, Integer.valueOf(paramInt));
      AppMethodBeat.o(138703);
    }
    while (true)
    {
      return;
      this.iPA.m(parambqd, Integer.valueOf(paramInt));
      AppMethodBeat.o(138703);
    }
  }

  final LinkedList<bqd> aND()
  {
    AppMethodBeat.i(135173);
    LinkedList localLinkedList = (LinkedList)this.iPx.getValue();
    AppMethodBeat.o(135173);
    return localLinkedList;
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(135180);
    int i = aND().size();
    AppMethodBeat.o(135180);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(135175);
    paramInt = ((bqd)aND().get(paramInt)).iAd;
    AppMethodBeat.o(135175);
    return paramInt;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$VideoRecommendViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$WithContentDescViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;Landroid/view/View;)V", "videoIcon", "Landroid/widget/ImageView;", "getVideoIcon", "()Landroid/widget/ImageView;", "plugin-appbrand-integration_release"})
  public final class h extends a.i
  {
    final ImageView iPM;

    public h()
    {
      super(localObject);
      AppMethodBeat.i(135157);
      this$1 = localObject.findViewById(2131821341);
      j.o(a.this, "itemView.findViewById(R.…rand_recommend_play_icon)");
      this.iPM = ((ImageView)a.this);
      AppMethodBeat.o(135157);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$5"})
  static final class n
    implements View.OnClickListener
  {
    n(a.c paramc, a parama, bqd parambqd, WxaAttributes paramWxaAttributes, int paramInt, Context paramContext)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(135164);
      if (this.iPS.iAd == 4)
      {
        paramView = this.iPE;
        localObject1 = this.iPR.apJ;
        j.o(localObject1, "baseViewHolder.itemView");
        localObject1 = ((View)localObject1).getContext();
        j.o(localObject1, "baseViewHolder.itemView.context");
        paramView.a((Context)localObject1, this.iPT, this.iPS, this.iPU, false);
        AppMethodBeat.o(135164);
        return;
      }
      Object localObject1 = this.iPS.iAb;
      paramView = (View)localObject1;
      Object localObject2;
      if (this.iPS.iAc != null)
      {
        localObject2 = this.iPS.iAc;
        j.o(localObject2, "itemData.page_param");
        paramView = (View)localObject1;
        if (!a.k.m.ar((CharSequence)localObject2))
          paramView = (String)localObject1 + "?" + this.iPS.iAc;
      }
      localObject1 = new AppBrandStatObject();
      ((AppBrandStatObject)localObject1).scene = 1118;
      ((AppBrandStatObject)localObject1).cOq = 14;
      if (!TextUtils.isEmpty((CharSequence)this.iPS.iAa))
        ((AppBrandStatObject)localObject1).cst = (this.iPS.izZ + ":" + this.iPS.iAa.toString());
      for (((AppBrandStatObject)localObject1).cOr = (this.iPS.izZ + ":" + this.iPS.iAa.toString()); ; ((AppBrandStatObject)localObject1).cOr = this.iPS.izZ)
      {
        ((AppBrandStatObject)localObject1).iAp = a.a(this.iPT, this.iPS, this.iPU);
        if (this.iPT != null)
        {
          localObject2 = this.iPT;
          if (localObject2 != null)
          {
            localObject2 = ((WxaAttributes)localObject2).ayL();
            if (localObject2 != null)
            {
              int i = ((WxaAttributes.e)localObject2).axy;
              ((e)com.tencent.mm.kernel.g.K(e.class)).a(this.fbw, this.iPS.wSq, this.iPT.field_appId, 0, i, paramView, (AppBrandStatObject)localObject1);
            }
          }
        }
        this.iPE.iPA.m(this.iPS, Integer.valueOf(this.iPU));
        AppMethodBeat.o(135164);
        break;
        ((AppBrandStatObject)localObject1).cst = this.iPS.izZ;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a
 * JD-Core Version:    0.6.2
 */