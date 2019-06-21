package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMViewPager$f extends MMViewPager.a
{
  float[] v;

  public MMViewPager$f(MMViewPager paramMMViewPager)
  {
    super(paramMMViewPager);
    AppMethodBeat.i(106906);
    this.v = new float[9];
    AppMethodBeat.o(106906);
  }

  public final void play()
  {
    AppMethodBeat.i(106907);
    MMViewPager.c(this.yyC).post(new MMViewPager.f.1(this));
    AppMethodBeat.o(106907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.f
 * JD-Core Version:    0.6.2
 */