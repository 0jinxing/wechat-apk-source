package com.tencent.mm.ui.widget.snackbar;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;

final class SnackContainer$3
  implements View.OnTouchListener
{
  SnackContainer$3(SnackContainer paramSnackContainer, SnackContainer.a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112994);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(112994);
      return true;
      this.zTZ.removeCallbacks(SnackContainer.c(this.zTZ));
      SnackContainer.d(this.zUa);
      this.zTZ.startAnimation(SnackContainer.a(this.zTZ));
      if (!SnackContainer.b(this.zTZ).isEmpty())
        SnackContainer.b(this.zTZ).clear();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.SnackContainer.3
 * JD-Core Version:    0.6.2
 */