package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandCombinationLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getChildDrawingOrder", "", "childCount", "i", "init", "", "plugin-appbrand-integration_release"})
public final class AppBrandCombinationLayout extends FrameLayout
{
  public AppBrandCombinationLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(135139);
    setChildrenDrawingOrderEnabled(true);
    AppMethodBeat.o(135139);
  }

  protected final int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0);
    for (paramInt1 = 1; ; paramInt1 = 0)
      return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandCombinationLayout
 * JD-Core Version:    0.6.2
 */