package com.tencent.mm.plugin.normsg.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.b;
import java.util.Map;
import java.util.WeakHashMap;

public final class c
{
  private static final Map<View, Class<? extends b>> oUX;
  private static final Map<View, Boolean> oUY;

  static
  {
    AppMethodBeat.i(10435);
    oUX = new WeakHashMap();
    oUY = new WeakHashMap();
    AppMethodBeat.o(10435);
  }

  public static void a(View paramView, Class<? extends b> paramClass)
  {
    AppMethodBeat.i(10434);
    if (paramView == null)
    {
      paramView = new IllegalArgumentException("target is null.");
      AppMethodBeat.o(10434);
      throw paramView;
    }
    if (paramClass == null)
    {
      paramView = new IllegalArgumentException("reportEventClass is null.");
      AppMethodBeat.o(10434);
      throw paramView;
    }
    Object localObject1 = h.b(paramView, "getListenerInfo", null, new Object[0]);
    if (localObject1 != null)
    {
      ??? = (View.OnTouchListener)h.f(localObject1, "mOnTouchListener");
      localObject1 = (View.OnClickListener)h.f(localObject1, "mOnClickListener");
    }
    while (true)
    {
      if (??? == null)
        paramView.setOnTouchListener(new c.b(null));
      while (true)
      {
        if (localObject1 == null)
          paramView.setOnClickListener(new c.a(null));
        synchronized (oUX)
        {
          do
          {
            oUX.put(paramView, paramClass);
            AppMethodBeat.o(10434);
            return;
            if ((??? instanceof c.b))
              break;
            paramView.setOnTouchListener(new c.b((View.OnTouchListener)???));
            break;
          }
          while ((localObject1 instanceof c.a));
          paramView.setOnClickListener(new c.a((View.OnClickListener)localObject1));
        }
      }
      localObject1 = null;
      ??? = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.c
 * JD-Core Version:    0.6.2
 */