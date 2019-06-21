package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.protocal.protobuf.bqd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick", "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$6"})
final class a$o
  implements View.OnLongClickListener
{
  a$o(a parama, bqd parambqd, WxaAttributes paramWxaAttributes, int paramInt, Context paramContext)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(135165);
    com.tencent.mm.pluginsdk.f.a.b((CharSequence)"", (CharSequence)(this.iPS.izZ.toString() + "," + this.iPS.wSw + "," + this.iPS.wSq));
    AppMethodBeat.o(135165);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a.o
 * JD-Core Version:    0.6.2
 */