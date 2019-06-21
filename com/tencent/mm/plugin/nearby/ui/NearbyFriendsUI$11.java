package com.tencent.mm.plugin.nearby.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.applet.b;

final class NearbyFriendsUI$11
  implements View.OnTouchListener
{
  NearbyFriendsUI$11(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(55452);
    if (NearbyFriendsUI.t(this.oQs) != null)
    {
      paramView = NearbyFriendsUI.t(this.oQs);
      if (paramView.gvm != null)
        paramView.gvm.onTouchEvent(paramMotionEvent);
    }
    AppMethodBeat.o(55452);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.11
 * JD-Core Version:    0.6.2
 */