package com.tencent.mm.plugin.gallery.view;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$h extends MultiGestureImageView.a
{
  MultiTouchImageView mSF;
  float[] v;

  public MultiGestureImageView$h(MultiGestureImageView paramMultiGestureImageView, MultiTouchImageView paramMultiTouchImageView)
  {
    super(paramMultiGestureImageView);
    AppMethodBeat.i(21631);
    this.v = new float[9];
    this.mSF = paramMultiTouchImageView;
    AppMethodBeat.o(21631);
  }

  public final void play()
  {
    AppMethodBeat.i(21632);
    MultiGestureImageView.h(this.mSE).getHandler().post(new MultiGestureImageView.h.1(this));
    AppMethodBeat.o(21632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.h
 * JD-Core Version:    0.6.2
 */