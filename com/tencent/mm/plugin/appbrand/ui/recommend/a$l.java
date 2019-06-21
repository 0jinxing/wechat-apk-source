package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.protocal.protobuf.bqd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$1"})
final class a$l
  implements View.OnClickListener
{
  a$l(a.c paramc, a parama, bqd parambqd, WxaAttributes paramWxaAttributes, int paramInt, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135162);
    paramView = this.iPE;
    Object localObject = this.iPR.apJ;
    j.o(localObject, "baseViewHolder.itemView");
    localObject = ((View)localObject).getContext();
    j.o(localObject, "baseViewHolder.itemView.context");
    paramView.a((Context)localObject, this.iPT, this.iPS, this.iPU, true);
    AppMethodBeat.o(135162);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a.l
 * JD-Core Version:    0.6.2
 */