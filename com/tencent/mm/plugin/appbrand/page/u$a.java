package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

final class u$a extends RelativeLayout
  implements ar
{
  public u$a(u paramu, Context paramContext)
  {
    super(paramContext);
  }

  public final boolean g(Canvas paramCanvas)
  {
    AppMethodBeat.i(87195);
    boolean bool = this.ita.g(paramCanvas);
    AppMethodBeat.o(87195);
    return bool;
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(87194);
    super.onDetachedFromWindow();
    if (u.f(this.ita) != null)
    {
      Object localObject = u.f(this.ita);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      localMotionEvent.setSource(4098);
      Iterator localIterator = ((ac)localObject).iut.iterator();
      while (localIterator.hasNext())
      {
        localObject = (View)((ac.b)localIterator.next()).iuM.get();
        if (localObject != null)
          ((View)localObject).dispatchTouchEvent(localMotionEvent);
      }
      localMotionEvent.recycle();
    }
    AppMethodBeat.o(87194);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.a
 * JD-Core Version:    0.6.2
 */