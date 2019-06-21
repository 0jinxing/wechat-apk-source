package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  private static final List<WeakReference<ControlBoardPanel>> jpT;
  private static final ControlBoardPanel.a jpU;

  static
  {
    AppMethodBeat.i(11157);
    jpT = new LinkedList();
    jpU = new e.1();
    AppMethodBeat.o(11157);
  }

  public static void dr(Context paramContext)
  {
    AppMethodBeat.i(11155);
    int i;
    Object localObject;
    if (paramContext != null)
    {
      i = 0;
      if (i < jpT.size())
      {
        localObject = (WeakReference)jpT.get(i);
        if (localObject != null)
        {
          localObject = (ControlBoardPanel)((WeakReference)localObject).get();
          if ((localObject != null) && (paramContext == ((ControlBoardPanel)localObject).getContext()))
          {
            label61: if (localObject != null)
              break label243;
            paramContext = new ControlBoardPanel(paramContext);
            jpT.add(new WeakReference(paramContext));
          }
        }
      }
    }
    while (true)
    {
      localObject = jpU;
      if (!paramContext.jqd)
      {
        paramContext.jqd = true;
        Activity localActivity = (Activity)paramContext.getContext();
        paramContext.jqc = new WindowManager.LayoutParams(-2, -2, 1003, 520, -3);
        paramContext.jqc.y = a.q(localActivity);
        paramContext.jqc.token = localActivity.getWindow().getDecorView().getWindowToken();
        paramContext.jqc.gravity = 51;
        paramContext.jqc.softInputMode = 16;
        paramContext.jqb.addView(paramContext, paramContext.jqc);
        paramContext.reset();
        paramContext.jpU = ((ControlBoardPanel.a)localObject);
        if (paramContext.jpU != null)
          paramContext.jpU.a(paramContext, true);
      }
      AppMethodBeat.o(11155);
      return;
      i++;
      break;
      localObject = null;
      break label61;
      label243: paramContext = (Context)localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.e
 * JD-Core Version:    0.6.2
 */