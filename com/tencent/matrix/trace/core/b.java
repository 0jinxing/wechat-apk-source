package com.tencent.matrix.trace.core;

import android.view.Choreographer;
import com.tencent.matrix.trace.a.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;

public final class b
  implements Runnable
{
  private static final b bYY = new b();
  public a bYH;
  private volatile boolean bYT = false;
  private long[] bYU = new long[4];
  private HashSet<com.tencent.matrix.trace.e.c> bYV = new HashSet();
  private volatile long bYW = 0L;
  private boolean bYX = false;
  public Object bYZ;
  public Object[] bZa;
  public Method bZb;
  public Method bZc;
  public Method bZd;
  public long bZe = 16666666L;
  private int[] bZf = new int[3];
  private boolean[] bZg = new boolean[3];
  private long[] bZh = new long[3];
  public boolean bZi = false;
  public Choreographer bsZ;

  private void b(int paramInt, Runnable paramRunnable)
  {
    Method localMethod = null;
    try
    {
      if (this.bZg[paramInt] != 0)
        com.tencent.matrix.d.c.w("Matrix.UIThreadMonitor", "[addFrameCallback] this type %s callback has exist!", new Object[] { Integer.valueOf(paramInt) });
      while (true)
      {
        label31: return;
        if ((this.bYT) || (paramInt != 0))
          break;
        com.tencent.matrix.d.c.w("Matrix.UIThreadMonitor", "[addFrameCallback] UIThreadMonitor is not alive!", new Object[0]);
      }
    }
    finally
    {
    }
    while (true)
    {
      try
      {
        while (true)
        {
          Object localObject = this.bYZ;
          switch (paramInt)
          {
          default:
            if (localMethod != null);
            try
            {
              localMethod.invoke(this.bZa[paramInt], new Object[] { Long.valueOf(-1L), paramRunnable, null });
              this.bZg[paramInt] = true;
              break label31;
            }
            finally
            {
            }
          case 0:
          case 1:
          case 2:
          }
        }
      }
      catch (Exception paramRunnable)
      {
        com.tencent.matrix.d.c.e("Matrix.UIThreadMonitor", paramRunnable.toString(), new Object[0]);
      }
      break;
      localMethod = this.bZc;
      continue;
      localMethod = this.bZd;
      continue;
      localMethod = this.bZb;
    }
  }

  public static Method d(Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    try
    {
      paramObject = paramObject.getClass().getDeclaredMethod(paramString, paramArrayOfClass);
      paramObject.setAccessible(true);
      return paramObject;
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        com.tencent.matrix.d.c.e("Matrix.UIThreadMonitor", paramObject.toString(), new Object[0]);
        paramObject = null;
      }
    }
  }

  private void fX(int paramInt)
  {
    this.bZf[paramInt] = 1;
    this.bZh[paramInt] = System.nanoTime();
  }

  private void fY(int paramInt)
  {
    this.bZf[paramInt] = 2;
    this.bZh[paramInt] = (System.nanoTime() - this.bZh[paramInt]);
    synchronized (this.bZg)
    {
      this.bZg[paramInt] = false;
      return;
    }
  }

  public static <T> T reflectObject(Object paramObject, String paramString)
  {
    try
    {
      paramString = paramObject.getClass().getDeclaredField(paramString);
      paramString.setAccessible(true);
      paramObject = paramString.get(paramObject);
      return paramObject;
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        com.tencent.matrix.d.c.e("Matrix.UIThreadMonitor", paramObject.toString(), new Object[0]);
        paramObject = null;
      }
    }
  }

  public static b zx()
  {
    return bYY;
  }

  public final void a(com.tencent.matrix.trace.e.c paramc)
  {
    if (!this.bYT)
      onStart();
    synchronized (this.bYV)
    {
      this.bYV.add(paramc);
      return;
    }
  }

  public final void b(com.tencent.matrix.trace.e.c paramc)
  {
    synchronized (this.bYV)
    {
      this.bYV.remove(paramc);
      if (this.bYV.isEmpty())
        onStop();
      return;
    }
  }

  public final void onStart()
  {
    try
    {
      if (!this.bZi)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("never init!");
        throw localRuntimeException;
      }
    }
    finally
    {
    }
    if (!this.bYT)
    {
      com.tencent.matrix.d.c.i("Matrix.UIThreadMonitor", "[onStart] %s", new Object[] { com.tencent.matrix.trace.g.b.getStack() });
      this.bYT = true;
      b(0, this);
    }
  }

  public final void onStop()
  {
    try
    {
      if (!this.bZi)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("UIThreadMonitor is never init!");
        throw localRuntimeException;
      }
    }
    finally
    {
    }
    if (this.bYT)
    {
      this.bYT = false;
      com.tencent.matrix.d.c.i("Matrix.UIThreadMonitor", "[onStop] %s", new Object[] { com.tencent.matrix.trace.g.b.getStack() });
    }
  }

  public final long p(int paramInt, long paramLong)
  {
    if (paramLong != this.bYW)
      paramLong = -1L;
    while (true)
    {
      return paramLong;
      if (this.bZf[paramInt] == 2)
        paramLong = this.bZh[paramInt];
      else
        paramLong = 0L;
    }
  }

  public final void run()
  {
    long l1 = System.nanoTime();
    try
    {
      long l2 = this.bYW;
      this.bYX = true;
      fX(0);
      Object localObject1 = new com/tencent/matrix/trace/core/b$3;
      ((3)localObject1).<init>(this);
      b(1, (Runnable)localObject1);
      localObject1 = new com/tencent/matrix/trace/core/b$4;
      ((4)localObject1).<init>(this);
      b(2, (Runnable)localObject1);
      return;
    }
    finally
    {
      if (this.bYH.bYE)
        com.tencent.matrix.d.c.d("Matrix.UIThreadMonitor", "[UIThreadMonitor#run] inner cost:%sns", new Object[] { Long.valueOf(System.nanoTime() - l1) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.core.b
 * JD-Core Version:    0.6.2
 */