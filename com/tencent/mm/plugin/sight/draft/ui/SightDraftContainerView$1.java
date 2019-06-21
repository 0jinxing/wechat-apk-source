package com.tencent.mm.plugin.sight.draft.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightDraftContainerView$1
  implements View.OnTouchListener
{
  SightDraftContainerView$1(SightDraftContainerView paramSightDraftContainerView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(25015);
    paramView = this.qzT;
    if (paramView.qzS != null)
    {
      paramView = paramView.qzS;
      paramView.a(null);
      paramView.qzv.clw();
    }
    AppMethodBeat.o(25015);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.SightDraftContainerView.1
 * JD-Core Version:    0.6.2
 */