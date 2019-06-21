package com.tencent.mm.splash;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;

final class j
  implements Handler.Callback
{
  public static int xHf = 100;
  public static int xHg = 113;
  public static int xHh = 114;
  public static int xHi = 115;
  public static int xHj = 116;
  public static int xHk = 121;
  public static int xHl = 122;
  public static int xHm = 126;
  public static int xHn = 145;
  private static boolean xHo = false;
  private static Runnable xHp;
  private static boolean xHr = false;
  private Context mContext;
  Handler.Callback oUK;
  private boolean xHq = false;

  public j(Context paramContext, Handler.Callback paramCallback)
  {
    this.mContext = paramContext;
    this.oUK = paramCallback;
  }

  public static void av(Runnable paramRunnable)
  {
    xHo = true;
    xHp = paramRunnable;
  }

  public static boolean dro()
  {
    return xHr;
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(114884);
    boolean bool;
    if (this.xHq)
    {
      h.g("WxSplash.SplashHackHandlerCallback", "found a infinite call loop", new Object[0]);
      AppMethodBeat.o(114884);
      bool = true;
    }
    while (true)
    {
      return bool;
      xHr = false;
      h.g("WxSplash.SplashHackHandlerCallback", "before handleMessage %s, splash %s, pending early %s", new Object[] { Integer.valueOf(paramMessage.what), Boolean.valueOf(h.dra()), Boolean.valueOf(h.drb()) });
      if ((xHo) && (paramMessage.what == 987654321))
      {
        if (xHp != null)
        {
          h.g("WxSplash.SplashHackHandlerCallback", "verify hack received.", new Object[0]);
          xHp.run();
        }
        AppMethodBeat.o(114884);
        bool = true;
      }
      else
      {
        Object localObject;
        if ((h.dra()) && (!h.drb()))
        {
          h.g("WxSplash.SplashHackHandlerCallback", "handleMessage %s, splash %s", new Object[] { Integer.valueOf(paramMessage.what), Boolean.valueOf(h.dra()) });
          if ((paramMessage.what == xHg) || (paramMessage.what == xHh) || (paramMessage.what == xHi) || (paramMessage.what == xHj) || (paramMessage.what == xHk) || (paramMessage.what == xHl) || (paramMessage.what == xHn))
          {
            localObject = Message.obtain();
            ((Message)localObject).copyFrom(paramMessage);
            h.xGD.add(localObject);
            if (h.xGI != null)
              h.xGI.BO();
            AppMethodBeat.o(114884);
            bool = true;
          }
        }
        else
        {
          if ((paramMessage.what == xHm) || ((Build.VERSION.SDK_INT == 28) && (paramMessage.what == 160)))
          {
            if (h.xGJ.size() > 0)
              xHr = true;
            h.g("WxSplash.SplashHackHandlerCallback", "received a RELAUNCH_ACTIVITY message, with %s splash activity", new Object[] { Integer.valueOf(h.xGJ.size()) });
            localObject = paramMessage.obj;
            if (!d.iX(25));
          }
          try
          {
            if (l.xHA == null)
            {
              Field localField = Class.forName("android.app.ActivityThread$ActivityClientRecord").getDeclaredField("mPreserveWindow");
              localField.setAccessible(true);
              l.xHA = localField;
            }
            h.g("WxSplash.SplashHackHandlerCallback", "preserveWindow is %s, will set false", new Object[] { Boolean.valueOf(((Boolean)l.xHA.get(localObject)).booleanValue()) });
            l.xHA.set(localObject, Boolean.FALSE);
            if (this.oUK != null)
            {
              this.xHq = true;
              bool = this.oUK.handleMessage(paramMessage);
              this.xHq = false;
              AppMethodBeat.o(114884);
            }
          }
          catch (Exception localException)
          {
            while (true)
              h.a(localException, "");
            AppMethodBeat.o(114884);
            bool = false;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.j
 * JD-Core Version:    0.6.2
 */