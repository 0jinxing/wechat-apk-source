package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$BaseRecommendViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;Landroid/view/View;)V", "content", "Landroid/view/ViewGroup;", "getContent", "()Landroid/view/ViewGroup;", "contentIcon", "Landroid/widget/ImageView;", "getContentIcon", "()Landroid/widget/ImageView;", "recommendReasonTv", "Landroid/widget/TextView;", "getRecommendReasonTv", "()Landroid/widget/TextView;", "plugin-appbrand-integration_release"})
public class a$c extends RecyclerView.v
{
  final ImageView iPG;
  final TextView iPH;
  final ViewGroup iPI;

  public a$c(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(135153);
    paramView = localObject.findViewById(2131821338);
    j.o(paramView, "itemView.findViewById(R.…d_recommend_content_icon)");
    this.iPG = ((ImageView)paramView);
    paramView = localObject.findViewById(2131821348);
    j.o(paramView, "itemView.findViewById(R.…p_brand_recommend_reason)");
    this.iPH = ((TextView)paramView);
    paramView = localObject.findViewById(2131821336);
    j.o(paramView, "itemView.findViewById(R.…_brand_recommend_content)");
    this.iPI = ((ViewGroup)paramView);
    AppMethodBeat.o(135153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a.c
 * JD-Core Version:    0.6.2
 */