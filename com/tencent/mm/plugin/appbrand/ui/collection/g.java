package com.tencent.mm.plugin.appbrand.ui.collection;

import a.l;
import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionItemViewLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "plugin-appbrand-integration_release"})
final class g extends FrameLayout
{
  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(135102);
    AppMethodBeat.o(135102);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135101);
    super.onMeasure(paramInt1, paramInt2);
    if (getMeasuredHeight() < getMeasuredWidth())
      setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    AppMethodBeat.o(135101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.g
 * JD-Core Version:    0.6.2
 */