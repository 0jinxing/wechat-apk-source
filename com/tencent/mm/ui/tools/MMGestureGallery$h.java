package com.tencent.mm.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMGestureGallery$h extends MMGestureGallery.a
{
  float[] v;

  public MMGestureGallery$h(MMGestureGallery paramMMGestureGallery)
  {
    super(paramMMGestureGallery);
    AppMethodBeat.i(107666);
    this.v = new float[9];
    AppMethodBeat.o(107666);
  }

  public final void play()
  {
    AppMethodBeat.i(107667);
    MMGestureGallery.c(this.zFK).post(new MMGestureGallery.h.1(this));
    AppMethodBeat.o(107667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.h
 * JD-Core Version:    0.6.2
 */