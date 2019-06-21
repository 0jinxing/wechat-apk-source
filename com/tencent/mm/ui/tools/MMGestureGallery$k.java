package com.tencent.mm.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMGestureGallery$k extends MMGestureGallery.a
{
  float[] v;

  public MMGestureGallery$k(MMGestureGallery paramMMGestureGallery)
  {
    super(paramMMGestureGallery);
    AppMethodBeat.i(107675);
    this.v = new float[9];
    AppMethodBeat.o(107675);
  }

  public final void play()
  {
    AppMethodBeat.i(107676);
    MMGestureGallery.c(this.zFK).post(new MMGestureGallery.k.1(this));
    AppMethodBeat.o(107676);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.k
 * JD-Core Version:    0.6.2
 */