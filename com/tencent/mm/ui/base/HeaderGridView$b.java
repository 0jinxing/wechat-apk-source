package com.tencent.mm.ui.base;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HeaderGridView$b extends FrameLayout
{
  public HeaderGridView$b(HeaderGridView paramHeaderGridView, Context paramContext)
  {
    super(paramContext);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106287);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.ysz.getMeasuredWidth() - this.ysz.getPaddingLeft() - this.ysz.getPaddingRight(), 1073741824), paramInt2);
    AppMethodBeat.o(106287);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HeaderGridView.b
 * JD-Core Version:    0.6.2
 */