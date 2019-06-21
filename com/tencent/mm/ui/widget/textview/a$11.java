package com.tencent.mm.ui.widget.textview;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

final class a$11
  implements View.OnTouchListener
{
  a$11(a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(138210);
    ai.d("SelectableTextHelper", "interceptor onTouch.", new Object[0]);
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if ((paramMotionEvent.getAction() == 0) && ((i < 0) || (i >= this.zWL.zWi.getWidth()) || (j < 0) || (j >= this.zWL.zWi.getHeight())))
    {
      ai.d("SelectableTextHelper", "interceptor onTouch, down, outside.", new Object[0]);
      this.zWL.zWm.postDelayed(this.zWL.zWI, 100L);
      AppMethodBeat.o(138210);
    }
    while (true)
    {
      return bool;
      if (paramMotionEvent.getAction() == 4)
      {
        ai.d("SelectableTextHelper", "interceptor onTouch, outside.", new Object[0]);
        this.zWL.zWm.postDelayed(this.zWL.zWI, 100L);
        AppMethodBeat.o(138210);
      }
      else
      {
        AppMethodBeat.o(138210);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.11
 * JD-Core Version:    0.6.2
 */