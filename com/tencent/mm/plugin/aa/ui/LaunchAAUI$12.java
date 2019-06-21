package com.tencent.mm.plugin.aa.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LaunchAAUI$12
  implements View.OnTouchListener
{
  LaunchAAUI$12(LaunchAAUI paramLaunchAAUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(40834);
    this.gpj.aoB();
    this.gpj.aqX();
    AppMethodBeat.o(40834);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.12
 * JD-Core Version:    0.6.2
 */