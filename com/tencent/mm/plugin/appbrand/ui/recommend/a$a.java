package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$AppRecommendViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$BaseRecommendViewHolder;", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;Landroid/view/View;)V", "appName", "Landroid/widget/TextView;", "getAppName", "()Landroid/widget/TextView;", "contentDesc", "getContentDesc", "plugin-appbrand-integration_release"})
public final class a$a extends a.c
{
  final TextView iPC;
  final TextView iPD;

  public a$a(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(135151);
    paramView = localObject.findViewById(2131821339);
    j.o(paramView, "itemView.findViewById(R.…d_recommend_content_desc)");
    this.iPC = ((TextView)paramView);
    paramView = localObject.findViewById(2131821337);
    j.o(paramView, "itemView.findViewById(R.…ecommend_footer_app_name)");
    this.iPD = ((TextView)paramView);
    AppMethodBeat.o(135151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a.a
 * JD-Core Version:    0.6.2
 */