package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsTimeLineUI$36
  implements View.OnTouchListener
{
  SnsTimeLineUI$36(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(39509);
    if (paramMotionEvent.getAction() == 1)
    {
      this.rzs.crO();
      if ((SnsTimeLineUI.j(this.rzs).nDp != null) && (SnsTimeLineUI.j(this.rzs).nDp.getFirstVisiblePosition() == 0))
        ab.d("MicroMsg.SnsTimeLineUI", "refreshIv onTouch set refreshIv visible");
      SnsTimeLineUI.h(this.rzs).cut();
    }
    if (paramMotionEvent.getAction() == 0)
    {
      if (SnsTimeLineUI.j(this.rzs).nDp != null)
        SnsTimeLineUI.j(this.rzs).nDp.getFirstVisiblePosition();
      SnsTimeLineUI.g(this.rzs).crD();
      SnsTimeLineUI.g(this.rzs).rhr.cuL();
    }
    AppMethodBeat.o(39509);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.36
 * JD-Core Version:    0.6.2
 */