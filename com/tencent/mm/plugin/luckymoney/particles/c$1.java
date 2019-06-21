package com.tencent.mm.plugin.luckymoney.particles;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements View.OnAttachStateChangeListener
{
  c$1(c paramc)
  {
  }

  public final void onViewAttachedToWindow(View paramView)
  {
  }

  public final void onViewDetachedFromWindow(View paramView)
  {
    AppMethodBeat.i(42436);
    this.oan.bLM();
    AppMethodBeat.o(42436);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.c.1
 * JD-Core Version:    0.6.2
 */