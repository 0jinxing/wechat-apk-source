package com.tencent.mm.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMGestureGallery$i extends MMGestureGallery.a
{
  float[] v;

  public MMGestureGallery$i(MMGestureGallery paramMMGestureGallery)
  {
    super(paramMMGestureGallery);
    AppMethodBeat.i(107669);
    this.v = new float[9];
    AppMethodBeat.o(107669);
  }

  public final void play()
  {
    AppMethodBeat.i(107670);
    MMGestureGallery.c(this.zFK).post(new MMGestureGallery.i.1(this));
    AppMethodBeat.o(107670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.i
 * JD-Core Version:    0.6.2
 */