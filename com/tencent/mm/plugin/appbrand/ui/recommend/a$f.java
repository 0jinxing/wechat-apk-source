package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$GoodsAppRecommendViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$WithFooterViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;Landroid/view/View;)V", "discountPrice", "Landroid/widget/TextView;", "getDiscountPrice", "()Landroid/widget/TextView;", "goodsName", "getGoodsName", "originPrice", "getOriginPrice", "plugin-appbrand-integration_release"})
public final class a$f extends a.j
{
  final TextView iPJ;
  final TextView iPK;
  final TextView iPL;

  public a$f(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(135155);
    paramView = localObject.findViewById(2131821345);
    j.o(paramView, "itemView.findViewById(R.…and_recommend_goods_name)");
    this.iPJ = ((TextView)paramView);
    paramView = localObject.findViewById(2131821346);
    j.o(paramView, "itemView.findViewById(R.…recommend_discount_price)");
    this.iPK = ((TextView)paramView);
    paramView = localObject.findViewById(2131821347);
    j.o(paramView, "itemView.findViewById(R.…d_recommend_origin_price)");
    this.iPL = ((TextView)paramView);
    AppMethodBeat.o(135155);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a.f
 * JD-Core Version:    0.6.2
 */