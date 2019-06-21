package com.tencent.mm.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareImageRedirectUI$1
  implements View.OnTouchListener
{
  ShareImageRedirectUI$1(ShareImageRedirectUI paramShareImageRedirectUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(34928);
    Toast.makeText(this.zHp, 2131303507, 1).show();
    this.zHp.finish();
    AppMethodBeat.o(34928);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImageRedirectUI.1
 * JD-Core Version:    0.6.2
 */