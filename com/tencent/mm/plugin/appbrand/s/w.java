package com.tencent.mm.plugin.appbrand.s;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Method;

public final class w
{
  private static float density;
  private static final Method iRT;

  static
  {
    Object localObject = null;
    AppMethodBeat.i(87438);
    if (Build.VERSION.SDK_INT < 24);
    while (true)
    {
      iRT = localObject;
      density = -1.0F;
      AppMethodBeat.o(87438);
      return;
      try
      {
        Method localMethod = Activity.class.getMethod("isInMultiWindowMode", new Class[0]);
        localObject = localMethod;
      }
      catch (Exception localException)
      {
      }
    }
  }

  public static int bx(String paramString, int paramInt)
  {
    AppMethodBeat.i(87431);
    paramInt = (int)z(paramString, paramInt);
    AppMethodBeat.o(87431);
    return paramInt;
  }

  public static boolean ct(View paramView)
  {
    AppMethodBeat.i(87433);
    boolean bool;
    if (Build.VERSION.SDK_INT < 24)
    {
      AppMethodBeat.o(87433);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramView == null)
      {
        AppMethodBeat.o(87433);
        bool = false;
      }
      else
      {
        Context localContext = paramView.getContext();
        paramView = localContext;
        if ((localContext instanceof ContextWrapper))
        {
          paramView = localContext;
          if (!(localContext instanceof Activity))
            paramView = ((ContextWrapper)localContext).getBaseContext();
        }
        if (((paramView instanceof Activity)) && (u((Activity)paramView)))
        {
          bool = true;
          AppMethodBeat.o(87433);
        }
        else
        {
          AppMethodBeat.o(87433);
          bool = false;
        }
      }
    }
  }

  public static int[] d(h paramh)
  {
    AppMethodBeat.i(87437);
    Object localObject = paramh.getRuntime().gNE;
    if (((ViewGroup)localObject).isLaidOut())
    {
      paramh = new int[2];
      paramh[0] = ((ViewGroup)localObject).getMeasuredWidth();
      paramh[1] = ((ViewGroup)localObject).getMeasuredHeight();
      AppMethodBeat.o(87437);
    }
    while (true)
    {
      return paramh;
      localObject = paramh.getContext().getResources().getDisplayMetrics();
      paramh = new int[2];
      paramh[0] = ((DisplayMetrics)localObject).widthPixels;
      paramh[1] = ((DisplayMetrics)localObject).heightPixels;
      AppMethodBeat.o(87437);
    }
  }

  public static int[] db(Context paramContext)
  {
    AppMethodBeat.i(87435);
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i = paramContext.getWidth();
    int j = paramContext.getHeight();
    AppMethodBeat.o(87435);
    return new int[] { i, j };
  }

  public static int[] h(q paramq)
  {
    AppMethodBeat.i(87436);
    Object localObject = paramq.getCurrentPageView();
    if (localObject == null)
    {
      localObject = null;
      if ((localObject == null) || (!((View)localObject).isLaidOut()))
        break label67;
      ab.i("UIUtil", "Method: normal");
      paramq = new int[2];
      paramq[0] = ((View)localObject).getWidth();
      paramq[1] = ((View)localObject).getHeight();
      AppMethodBeat.o(87436);
    }
    while (true)
    {
      return paramq;
      localObject = ((u)localObject).aBk();
      break;
      label67: if ((paramq.getContext() instanceof Activity))
      {
        ab.i("UIUtil", "Method: DecorView");
        localObject = ((Activity)paramq.getContext()).getWindow().getDecorView();
        Rect localRect = new Rect();
        ((View)localObject).getWindowVisibleDisplayFrame(localRect);
        localObject = new int[2];
        localObject[0] = (localRect.right - localRect.left);
        localObject[1] = (localRect.bottom - localRect.top - a.fromDPToPix(paramq.getContext(), 48));
        AppMethodBeat.o(87436);
        paramq = (q)localObject;
      }
      else
      {
        ab.i("UIUtil", "Method: Screen");
        localObject = new int[2];
        localObject[0] = paramq.getContext().getResources().getDisplayMetrics().widthPixels;
        localObject[1] = paramq.getContext().getResources().getDisplayMetrics().heightPixels;
        AppMethodBeat.o(87436);
        paramq = (q)localObject;
      }
    }
  }

  private static boolean u(Activity paramActivity)
  {
    AppMethodBeat.i(87434);
    try
    {
      Method localMethod = iRT;
      boolean bool;
      if (localMethod != null)
      {
        localMethod.setAccessible(true);
        bool = ((Boolean)localMethod.invoke(paramActivity, new Object[0])).booleanValue();
        AppMethodBeat.o(87434);
      }
      while (true)
      {
        return bool;
        ab.d("UIUtil", "isInMultiWindowMode method null");
        AppMethodBeat.o(87434);
        bool = false;
      }
    }
    catch (Exception paramActivity)
    {
      while (true)
        ab.d("UIUtil", "isInMultiWindowMode, exp %s", new Object[] { paramActivity });
    }
  }

  private static long z(String paramString, long paramLong)
  {
    AppMethodBeat.i(87432);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(87432);
    while (true)
    {
      return paramLong;
      Object localObject = paramString;
      if (paramString.startsWith("#"))
      {
        localObject = paramString;
        if (paramString.length() == 4)
        {
          localObject = new StringBuilder(paramString);
          ((StringBuilder)localObject).insert(2, paramString.charAt(1));
          ((StringBuilder)localObject).insert(4, paramString.charAt(2));
          ((StringBuilder)localObject).insert(6, paramString.charAt(3));
          localObject = ((StringBuilder)localObject).toString();
        }
      }
      try
      {
        int i = Color.parseColor((String)localObject);
        paramLong = 0xFFFFFFFF & i;
        AppMethodBeat.o(87432);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(87432);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.w
 * JD-Core Version:    0.6.2
 */