package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$12
  implements View.OnClickListener
{
  c$12(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113607);
    c.a(this.nQa, c.access$1600(), c.o(this.nQa).llU, false);
    this.nQa.aqX();
    this.nQa.activity.finish();
    AppMethodBeat.o(113607);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.12
 * JD-Core Version:    0.6.2
 */