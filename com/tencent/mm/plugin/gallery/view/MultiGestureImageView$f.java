package com.tencent.mm.plugin.gallery.view;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$f extends MultiGestureImageView.a
{
  MultiTouchImageView mSF;
  float[] v;

  public MultiGestureImageView$f(MultiGestureImageView paramMultiGestureImageView, MultiTouchImageView paramMultiTouchImageView)
  {
    super(paramMultiGestureImageView);
    AppMethodBeat.i(21625);
    this.v = new float[9];
    this.mSF = paramMultiTouchImageView;
    AppMethodBeat.o(21625);
  }

  public final void play()
  {
    AppMethodBeat.i(21626);
    MultiGestureImageView.h(this.mSE).getHandler().post(new MultiGestureImageView.f.1(this));
    AppMethodBeat.o(21626);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.f
 * JD-Core Version:    0.6.2
 */