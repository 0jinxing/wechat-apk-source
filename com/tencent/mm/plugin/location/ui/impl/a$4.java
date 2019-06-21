package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$4
  implements View.OnClickListener
{
  a$4(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113592);
    this.nOW.bKl();
    this.nOW.aqX();
    this.nOW.activity.finish();
    AppMethodBeat.o(113592);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.a.4
 * JD-Core Version:    0.6.2
 */