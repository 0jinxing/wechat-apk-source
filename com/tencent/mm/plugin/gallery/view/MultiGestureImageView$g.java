package com.tencent.mm.plugin.gallery.view;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$g extends MultiGestureImageView.a
{
  MultiTouchImageView mSF;
  float[] v;

  public MultiGestureImageView$g(MultiGestureImageView paramMultiGestureImageView, MultiTouchImageView paramMultiTouchImageView)
  {
    super(paramMultiGestureImageView);
    AppMethodBeat.i(21628);
    this.v = new float[9];
    this.mSF = paramMultiTouchImageView;
    AppMethodBeat.o(21628);
  }

  public final void play()
  {
    AppMethodBeat.i(21629);
    MultiGestureImageView.h(this.mSE).getHandler().post(new MultiGestureImageView.g.1(this));
    AppMethodBeat.o(21629);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.g
 * JD-Core Version:    0.6.2
 */