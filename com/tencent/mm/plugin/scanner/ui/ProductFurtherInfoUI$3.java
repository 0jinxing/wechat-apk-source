package com.tencent.mm.plugin.scanner.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ProductFurtherInfoUI$3
  implements View.OnTouchListener
{
  ProductFurtherInfoUI$3(ProductFurtherInfoUI paramProductFurtherInfoUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(81046);
    if ((paramView != null) && (paramView.getParent() != null))
      paramView.getParent().requestDisallowInterceptTouchEvent(true);
    AppMethodBeat.o(81046);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.3
 * JD-Core Version:    0.6.2
 */