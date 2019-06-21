package com.tencent.mm.ui.widget.snackbar;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements View.OnTouchListener
{
  a$2(a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112975);
    if ((b.aFF()) && (this.zTR.zTN.isShowing()))
    {
      b.rf(false);
      this.zTR.mHandler.postDelayed(new a.2.1(this), 100L);
    }
    AppMethodBeat.o(112975);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.a.2
 * JD-Core Version:    0.6.2
 */