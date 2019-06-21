package com.tencent.matrix.resource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.resource.e.e;
import java.lang.reflect.Field;

public class b extends com.tencent.matrix.b.b
{
  public final com.tencent.matrix.resource.b.a bWQ;
  private com.tencent.matrix.resource.e.b bWR = null;

  public b(com.tencent.matrix.resource.b.a parama)
  {
    this.bWQ = parama;
  }

  public static void a(Application paramApplication)
  {
    paramApplication.registerActivityLifecycleCallbacks(new com.tencent.matrix.resource.e.a()
    {
      public final void onActivityDestroyed(Activity paramAnonymousActivity)
      {
        long l = System.currentTimeMillis();
        InputMethodManager localInputMethodManager;
        int i;
        if (paramAnonymousActivity != null)
        {
          localInputMethodManager = (InputMethodManager)paramAnonymousActivity.getSystemService("input_method");
          if (localInputMethodManager != null)
            i = 0;
        }
        while (true)
        {
          Object localObject1;
          if (i < 3)
            localObject1 = new String[] { "mCurRootView", "mServedView", "mNextServedView" }[i];
          try
          {
            localObject1 = localInputMethodManager.getClass().getDeclaredField((String)localObject1);
            if (!((Field)localObject1).isAccessible())
              ((Field)localObject1).setAccessible(true);
            Object localObject2 = ((Field)localObject1).get(localInputMethodManager);
            if ((localObject2 instanceof View))
            {
              localObject2 = (View)localObject2;
              if (((View)localObject2).getContext() == paramAnonymousActivity)
                ((Field)localObject1).set(localInputMethodManager, null);
            }
            else
            {
              i++;
              continue;
            }
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("fixInputMethodManagerLeak break, context is not suitable, get_context=");
            com.tencent.matrix.d.c.i("Matrix.ActivityLeakFixer", ((View)localObject2).getContext() + " dest_context=" + paramAnonymousActivity, new Object[0]);
            com.tencent.matrix.d.c.i("Matrix.ActivityLeakFixer", "fixInputMethodManagerLeak done, cost: %s ms.", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            l = System.currentTimeMillis();
            if ((paramAnonymousActivity != null) && (paramAnonymousActivity.getWindow() != null) && (paramAnonymousActivity.getWindow().peekDecorView() != null))
              paramAnonymousActivity = paramAnonymousActivity.getWindow().peekDecorView().getRootView();
          }
          catch (Throwable localThrowable)
          {
            while (true)
            {
              try
              {
                a.cc(paramAnonymousActivity);
                if ((paramAnonymousActivity instanceof ViewGroup))
                  ((ViewGroup)paramAnonymousActivity).removeAllViews();
                com.tencent.matrix.d.c.i("Matrix.ActivityLeakFixer", "unbindDrawables done, cost: %s ms.", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
                return;
                localThrowable = localThrowable;
                com.tencent.matrix.d.c.e("Matrix.ActivityLeakFixer", "failed to fix InputMethodManagerLeak, %s", new Object[] { localThrowable.toString() });
              }
              catch (Throwable paramAnonymousActivity)
              {
                com.tencent.matrix.d.c.w("Matrix.ActivityLeakFixer", "caught unexpected exception when unbind drawables.", new Object[] { paramAnonymousActivity });
                continue;
              }
              com.tencent.matrix.d.c.i("Matrix.ActivityLeakFixer", "unbindDrawables, ui or ui's window is null, skip rest works.", new Object[0]);
            }
          }
        }
      }
    });
  }

  public void destroy()
  {
    super.destroy();
    if (!isSupported())
      com.tencent.matrix.d.c.e("Matrix.ResourcePlugin", "ResourcePlugin destroy, ResourcePlugin is not supported, just return", new Object[0]);
    while (true)
    {
      return;
      this.bWR.bXS.zu();
      com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "watcher is destroyed.", new Object[0]);
    }
  }

  public String getTag()
  {
    return "memory";
  }

  public void init(Application paramApplication, com.tencent.matrix.b.c paramc)
  {
    super.init(paramApplication, paramc);
    if (Build.VERSION.SDK_INT < 14)
    {
      com.tencent.matrix.d.c.e("Matrix.ResourcePlugin", "API is low Build.VERSION_CODES.ICE_CREAM_SANDWICH(14), ResourcePlugin is not supported", new Object[0]);
      unSupportPlugin();
    }
    while (true)
    {
      return;
      this.bWR = new com.tencent.matrix.resource.e.b(paramApplication, this);
    }
  }

  public void start()
  {
    super.start();
    if (!isSupported())
      com.tencent.matrix.d.c.e("Matrix.ResourcePlugin", "ResourcePlugin start, ResourcePlugin is not supported, just return", new Object[0]);
    while (true)
    {
      return;
      com.tencent.matrix.resource.e.b localb = this.bWR;
      localb.zp();
      Application localApplication = localb.bXR.getApplication();
      if (localApplication != null)
      {
        localApplication.registerActivityLifecycleCallbacks(localb.bXZ);
        localb.bXS.a(localb.bYa, 0);
        com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "watcher is started.", new Object[0]);
      }
    }
  }

  public void stop()
  {
    super.stop();
    if (!isSupported())
      com.tencent.matrix.d.c.e("Matrix.ResourcePlugin", "ResourcePlugin stop, ResourcePlugin is not supported, just return", new Object[0]);
    while (true)
    {
      return;
      this.bWR.zp();
      com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "watcher is stopped.", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.b
 * JD-Core Version:    0.6.2
 */