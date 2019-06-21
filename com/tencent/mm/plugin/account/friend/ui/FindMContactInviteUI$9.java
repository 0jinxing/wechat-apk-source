package com.tencent.mm.plugin.account.friend.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.ui.applet.b;

final class FindMContactInviteUI$9
  implements View.OnTouchListener
{
  FindMContactInviteUI$9(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(108546);
    if (FindMContactInviteUI.b(this.gxd) != null)
    {
      paramView = FindMContactInviteUI.b(this.gxd);
      if (paramView.gvm != null)
        paramView.gvm.onTouchEvent(paramMotionEvent);
    }
    AppMethodBeat.o(108546);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI.9
 * JD-Core Version:    0.6.2
 */