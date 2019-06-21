package com.tencent.mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ae;
import java.lang.reflect.Method;

public final class a
{
  public static final boolean jdd;
  public final Activity activity;
  public boolean jde = false;
  public int jdf = 0;

  static
  {
    if (Build.VERSION.SDK_INT < 20);
    for (boolean bool = true; ; bool = false)
    {
      jdd = bool;
      return;
    }
  }

  public a(Activity paramActivity)
  {
    this.activity = paramActivity;
  }

  private boolean aQj()
  {
    AppMethodBeat.i(123570);
    boolean bool;
    if ((this.activity.getWindow() != null) && ((this.activity.getWindow().getAttributes().flags & 0x400) > 0))
    {
      bool = true;
      AppMethodBeat.o(123570);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123570);
    }
  }

  public static boolean dp(Context paramContext)
  {
    AppMethodBeat.i(123571);
    paramContext = paramContext.getResources();
    int i = paramContext.getIdentifier("config_showNavigationBar", "bool", "android");
    if (i > 0);
    for (boolean bool1 = paramContext.getBoolean(i); ; bool1 = false)
      try
      {
        paramContext = Class.forName("android.os.SystemProperties");
        paramContext = (String)paramContext.getMethod("get", new Class[] { String.class }).invoke(paramContext, new Object[] { "qemu.hw.mainkeys" });
        boolean bool2 = "1".equals(paramContext);
        if (bool2);
        for (bool1 = false; ; bool1 = true)
        {
          label82: AppMethodBeat.o(123571);
          return bool1;
          bool2 = "0".equals(paramContext);
          if (!bool2)
            break;
        }
      }
      catch (Exception paramContext)
      {
        break label82;
      }
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(123569);
    Point localPoint = new Point();
    this.activity.getWindowManager().getDefaultDisplay().getSize(localPoint);
    int i = ae.hA(this.activity);
    int j = localPoint.y;
    if (aQj())
      i = 0;
    i = j - i;
    ab.i("MicroMsg.AppBrandFixInputIssuesActivityHelper", "fixLayoutHeightBelow20 forceHeight %d", new Object[] { Integer.valueOf(i) });
    paramn.setForceHeight(i);
    AppMethodBeat.o(123569);
  }

  public final void aQi()
  {
    AppMethodBeat.i(123568);
    if ((!this.jde) || (this.activity.isFinishing()))
      AppMethodBeat.o(123568);
    while (true)
    {
      return;
      if (jdd)
      {
        n localn = n.v(this.activity);
        if (localn == null)
        {
          ab.w("MicroMsg.AppBrandFixInputIssuesActivityHelper", "fixLayoutHeightIfNeed get null rootLayout");
          AppMethodBeat.o(123568);
        }
        else
        {
          a(localn);
        }
      }
      else
      {
        AppMethodBeat.o(123568);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.a
 * JD-Core Version:    0.6.2
 */