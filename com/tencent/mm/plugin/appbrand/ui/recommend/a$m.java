package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.a.m;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.protocal.protobuf.bqd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$4"})
final class a$m
  implements View.OnClickListener
{
  a$m(a parama, bqd parambqd, WxaAttributes paramWxaAttributes, int paramInt, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135163);
    paramView = new Intent((Context)this.iPE.activity, AppBrandRecommendVideoUI.class);
    paramView.putExtra("1", this.iPS.wSr);
    this.iPE.activity.startActivity(paramView);
    this.iPE.iPA.m(this.iPS, Integer.valueOf(this.iPU));
    AppMethodBeat.o(135163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.a.m
 * JD-Core Version:    0.6.2
 */