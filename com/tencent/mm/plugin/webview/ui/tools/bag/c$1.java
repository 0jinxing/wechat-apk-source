package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements g.a
{
  c$1(c paramc)
  {
  }

  public final boolean ba(boolean paramBoolean)
  {
    AppMethodBeat.i(8152);
    if (paramBoolean)
    {
      this.uyu.uys.bh(1.0F);
      this.uyu.uys.d(this.uyu.uyt, 21);
      paramBoolean = true;
      AppMethodBeat.o(8152);
    }
    while (true)
    {
      return paramBoolean;
      this.uyu.uys.bh(0.0F);
      paramBoolean = false;
      AppMethodBeat.o(8152);
    }
  }

  public final void bg(float paramFloat)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(8150);
    f localf = this.uyu.uys;
    if (paramFloat < 0.15F)
      paramFloat = 0.0F;
    while (true)
    {
      localf.bh(paramFloat);
      AppMethodBeat.o(8150);
      return;
      float f2 = 2.0F * paramFloat;
      paramFloat = f1;
      if (f2 <= 1.0F)
        paramFloat = f2;
    }
  }

  public final void l(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(8151);
    this.uyu.uyt = paramMotionEvent.getRawX();
    AppMethodBeat.o(8151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.c.1
 * JD-Core Version:    0.6.2
 */