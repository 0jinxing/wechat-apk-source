package com.tencent.mm.plugin.normsg.b;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class c$b
  implements View.OnTouchListener
{
  private final View.OnTouchListener oVa;

  c$b(View.OnTouchListener paramOnTouchListener)
  {
    this.oVa = paramOnTouchListener;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(10433);
    while (true)
    {
      synchronized (c.aEd())
      {
        if (!c.aEd().containsKey(paramView))
        {
          if (this.oVa == null)
            break label107;
          bool = this.oVa.onTouch(paramView, paramMotionEvent);
          AppMethodBeat.o(10433);
          return bool;
        }
      }
      synchronized (c.aje())
      {
        c.aje().put(paramView, Boolean.TRUE);
        continue;
        paramView = finally;
        AppMethodBeat.o(10433);
        throw paramView;
      }
      label107: boolean bool = false;
      AppMethodBeat.o(10433);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.c.b
 * JD-Core Version:    0.6.2
 */