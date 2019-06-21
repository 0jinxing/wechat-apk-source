package com.tencent.mm.plugin.gallery.view;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$e extends MultiGestureImageView.a
{
  MultiTouchImageView mSF;
  float[] v;

  public MultiGestureImageView$e(MultiGestureImageView paramMultiGestureImageView, MultiTouchImageView paramMultiTouchImageView)
  {
    super(paramMultiGestureImageView);
    AppMethodBeat.i(21622);
    this.v = new float[9];
    this.mSF = paramMultiTouchImageView;
    AppMethodBeat.o(21622);
  }

  public final void play()
  {
    AppMethodBeat.i(21623);
    MultiGestureImageView.h(this.mSE).getHandler().post(new MultiGestureImageView.e.1(this));
    AppMethodBeat.o(21623);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.e
 * JD-Core Version:    0.6.2
 */