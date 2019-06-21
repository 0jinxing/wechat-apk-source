package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a$1 extends View
{
  e$a$1(e.a parama, Context paramContext)
  {
    super(paramContext);
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123947);
    this.jiT.mInLayout = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.jiT.mInLayout = false;
    AppMethodBeat.o(123947);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123948);
    if (this.jiT.jeI > 0)
      paramInt2 = View.MeasureSpec.makeMeasureSpec(this.jiT.jeI, 1073741824);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(123948);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.e.a.1
 * JD-Core Version:    0.6.2
 */