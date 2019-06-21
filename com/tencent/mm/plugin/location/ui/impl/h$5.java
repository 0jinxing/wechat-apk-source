package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$5
  implements View.OnClickListener
{
  h$5(h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113698);
    this.nRb.bKl();
    this.nRb.aqX();
    this.nRb.activity.finish();
    AppMethodBeat.o(113698);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.5
 * JD-Core Version:    0.6.2
 */