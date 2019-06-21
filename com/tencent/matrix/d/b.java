package com.tencent.matrix.d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

public class b
{
  private static volatile HandlerThread caN;
  private static volatile Handler caO;
  private static volatile Handler caP = new Handler(Looper.getMainLooper());
  private static HashSet<HandlerThread> caQ = new HashSet();

  public static HandlerThread cj(String paramString)
  {
    Object localObject = caQ.iterator();
    while (((Iterator)localObject).hasNext())
      if (!((HandlerThread)((Iterator)localObject).next()).isAlive())
      {
        ((Iterator)localObject).remove();
        c.w("Matrix.HandlerThread", "warning: remove dead handler thread with name %s", new Object[] { paramString });
      }
    localObject = new HandlerThread(paramString);
    ((HandlerThread)localObject).start();
    caQ.add(localObject);
    c.w("Matrix.HandlerThread", "warning: create new handler thread with name %s, alive thread size:%d", new Object[] { paramString, Integer.valueOf(caQ.size()) });
    return localObject;
  }

  public static Handler zK()
  {
    return caP;
  }

  public static HandlerThread zL()
  {
    try
    {
      if (caN == null)
      {
        localObject1 = new android/os/HandlerThread;
        ((HandlerThread)localObject1).<init>("default_matrix_thread");
        caN = (HandlerThread)localObject1;
        ((HandlerThread)localObject1).start();
        localObject1 = new android/os/Handler;
        ((Handler)localObject1).<init>(caN.getLooper());
        caO = (Handler)localObject1;
        c.w("Matrix.HandlerThread", "create default handler thread, we should use these thread normal", new Object[0]);
      }
      Object localObject1 = caN;
      return localObject1;
    }
    finally
    {
    }
  }

  public static Handler zM()
  {
    return caO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.d.b
 * JD-Core Version:    0.6.2
 */