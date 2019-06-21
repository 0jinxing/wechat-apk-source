package com.davemorrissey.labs.subscaleview.view;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SubsamplingScaleImageView$4 extends GestureDetector.SimpleOnGestureListener
{
  SubsamplingScaleImageView$4(SubsamplingScaleImageView paramSubsamplingScaleImageView)
  {
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(115644);
    this.aKO.performClick();
    AppMethodBeat.o(115644);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.4
 * JD-Core Version:    0.6.2
 */