package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$WithFooterViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$BaseRecommendViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;Landroid/view/View;)V", "footer", "Landroid/view/ViewGroup;", "getFooter", "()Landroid/view/ViewGroup;", "footerAppName", "Landroid/widget/TextView;", "getFooterAppName", "()Landroid/widget/TextView;", "footerIcon", "Landroid/widget/ImageView;", "getFooterIcon", "()Landroid/widget/ImageView;", "plugin-appbrand-integration_release"})
public class a$j extends a.c
{
  final ImageView iPN;
  final TextView iPO;
  final ViewGroup iPP;

  public a$j(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(135159);
    paramView = localObject.findViewById(2131821343);
    j.o(paramView, "itemView.findViewById(R.…nd_recommend_footer_icon)");
    this.iPN = ((ImageView)paramView);
    paramView = localObject.findViewById(2131821337);
    j.o(paramView, "itemView.findViewById(R.…ecommend_footer_app_name)");
    this.iPO = ((TextView)paramView);
    paramView = localObject.findViewById(2131821342);
    j.o(paramView, "itemView.findViewById(R.…p_brand_recommend_footer)");
    this.iPP = ((ViewGroup)paramView);
    AppMethodBeat.o(135159);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a.j
 * JD-Core Version:    0.6.2
 */