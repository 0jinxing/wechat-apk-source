package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"getDefaultAppCardBg", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter;", "getDefaultCardContentImgBg", "plugin-appbrand-integration_release"})
public final class b
{
  public static final Drawable a(a parama)
  {
    AppMethodBeat.i(135182);
    j.p(parama, "receiver$0");
    parama = parama.activity.getResources().getDrawable(2130837761);
    AppMethodBeat.o(135182);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.b
 * JD-Core Version:    0.6.2
 */