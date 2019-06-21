package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.view.animation.TranslateAnimation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class c$a extends TranslateAnimation
{
  private List<View> nQd;

  public c$a(c paramc, float paramFloat)
  {
    super(0.0F, 0.0F, 0.0F, paramFloat);
    AppMethodBeat.i(113614);
    this.nQd = new ArrayList();
    AppMethodBeat.o(113614);
  }

  public final a bKw()
  {
    AppMethodBeat.i(113615);
    setFillEnabled(true);
    setFillAfter(true);
    AppMethodBeat.o(113615);
    return this;
  }

  public final void bKx()
  {
    AppMethodBeat.i(113617);
    for (int i = 0; i < this.nQd.size(); i++)
      ((View)this.nQd.get(i)).startAnimation(this);
    AppMethodBeat.o(113617);
  }

  public final a dm(View paramView)
  {
    AppMethodBeat.i(113616);
    this.nQd.add(paramView);
    AppMethodBeat.o(113616);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.a
 * JD-Core Version:    0.6.2
 */