package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class c extends FrameLayout
{
  public final Set<Runnable> iTV;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(87440);
    this.iTV = new HashSet();
    setWillNotDraw(false);
    AppMethodBeat.o(87440);
  }

  protected final void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(87441);
    if (willNotDraw())
      AppMethodBeat.o(87441);
    while (true)
    {
      return;
      super.dispatchDraw(paramCanvas);
      AppMethodBeat.o(87441);
    }
  }

  protected final void onAnimationEnd()
  {
    AppMethodBeat.i(87442);
    super.onAnimationEnd();
    Iterator localIterator = this.iTV.iterator();
    while (localIterator.hasNext())
      ((Runnable)localIterator.next()).run();
    this.iTV.clear();
    AppMethodBeat.o(87442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.c
 * JD-Core Version:    0.6.2
 */