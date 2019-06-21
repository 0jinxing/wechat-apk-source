package com.tencent.mm.plugin.account.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements View.OnTouchListener
{
  a$1(a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(124712);
    if (paramMotionEvent.getAction() == 0)
    {
      ((TextView)paramView.findViewById(2131821097)).setTextColor(-10395295);
      AppMethodBeat.o(124712);
    }
    while (true)
    {
      return false;
      if (paramMotionEvent.getAction() == 1)
      {
        ((TextView)paramView.findViewById(2131821097)).setTextColor(-1);
        AppMethodBeat.o(124712);
      }
      else
      {
        AppMethodBeat.o(124712);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.a.1
 * JD-Core Version:    0.6.2
 */