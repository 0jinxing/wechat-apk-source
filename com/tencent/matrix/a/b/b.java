package com.tencent.matrix.a.b;

import android.app.AlarmManager.OnAlarmListener;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import com.tencent.matrix.d.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class b
{
  private static boolean bVc;
  private static com.tencent.matrix.a.c.b.b bVd = new com.tencent.matrix.a.c.b.b()
  {
    public final void b(Method paramAnonymousMethod, Object[] paramAnonymousArrayOfObject)
    {
      c.v("Matrix.AlarmManagerServiceHooker", "onServiceMethodInvoke: method name %s", new Object[] { paramAnonymousMethod.getName() });
      b.a(paramAnonymousMethod, paramAnonymousArrayOfObject);
    }
  };
  private static com.tencent.matrix.a.c.b bVe = new com.tencent.matrix.a.c.b("alarm", "android.app.IAlarmManager", bVd);
  private static List<c> bVf = new ArrayList();
  private static Class bVg;
  private static Field bVh;

  static
  {
    try
    {
      Object localObject = Class.forName("android.app.AlarmManager$ListenerWrapper");
      bVg = (Class)localObject;
      localObject = ((Class)localObject).getDeclaredField("mListener");
      bVh = (Field)localObject;
      ((Field)localObject).setAccessible(true);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        c.w("Matrix.AlarmManagerServiceHooker", "static init exp:%s", new Object[] { localClassNotFoundException });
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
        c.w("Matrix.AlarmManagerServiceHooker", "static init exp:%s", new Object[] { localNoSuchFieldException });
    }
  }

  public static void a(c paramc)
  {
    try
    {
      boolean bool = bVf.contains(paramc);
      if (bool);
      while (true)
      {
        return;
        bVf.add(paramc);
        if ((!bVc) && (!bVf.isEmpty()))
        {
          c.i("Matrix.AlarmManagerServiceHooker", "checkHook hookRet:%b", new Object[] { Boolean.valueOf(bVe.doHook()) });
          bVc = true;
        }
      }
    }
    finally
    {
    }
    throw paramc;
  }

  public static void b(c paramc)
  {
    try
    {
      bVf.remove(paramc);
      if ((bVc) && (bVf.isEmpty()))
      {
        c.i("Matrix.AlarmManagerServiceHooker", "checkUnHook unHookRet:%b", new Object[] { Boolean.valueOf(bVe.doUnHook()) });
        bVc = false;
      }
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }

  static final class a
  {
    AlarmManager.OnAlarmListener bUQ;
    PendingIntent bUY;
  }

  static final class b
  {
    static b.a e(Object[] paramArrayOfObject)
    {
      if (paramArrayOfObject.length != 2)
      {
        c.w("Matrix.AlarmManagerServiceHooker", "createCancelArgs2 args length invalid : %d", new Object[] { Integer.valueOf(paramArrayOfObject.length) });
        paramArrayOfObject = null;
      }
      while (true)
      {
        return paramArrayOfObject;
        b.a locala = new b.a((byte)0);
        if ((paramArrayOfObject[0] != null) && (!(paramArrayOfObject[0] instanceof PendingIntent)))
        {
          c.w("Matrix.AlarmManagerServiceHooker", "createCancelArgs2 args idx 0 not PendingIntent, %s", new Object[] { paramArrayOfObject[0] });
          paramArrayOfObject = null;
        }
        else
        {
          locala.bUY = ((PendingIntent)paramArrayOfObject[0]);
          if ((b.yS() == null) || (b.yT() == null))
          {
            c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs sListenerWrapperCls sListenerField null", new Object[0]);
            paramArrayOfObject = null;
          }
          else if ((paramArrayOfObject[1] != null) && (!b.yS().isInstance(paramArrayOfObject[1])))
          {
            c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 1 not ListenerWrapper, %s", new Object[] { paramArrayOfObject[1] });
            paramArrayOfObject = null;
          }
          else
          {
            if (paramArrayOfObject[1] != null);
            try
            {
              locala.bUQ = ((AlarmManager.OnAlarmListener)b.yT().get(paramArrayOfObject[1]));
              paramArrayOfObject = locala;
            }
            catch (IllegalAccessException paramArrayOfObject)
            {
              c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 1 init exp:%s", new Object[] { paramArrayOfObject.getLocalizedMessage() });
              paramArrayOfObject = null;
            }
          }
        }
      }
    }
  }

  public static abstract interface c
  {
    public abstract void a(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, PendingIntent paramPendingIntent, AlarmManager.OnAlarmListener paramOnAlarmListener);

    public abstract void a(PendingIntent paramPendingIntent, AlarmManager.OnAlarmListener paramOnAlarmListener);
  }

  static final class d
  {
    long bUN;
    long bUO;
    AlarmManager.OnAlarmListener bUQ;
    PendingIntent bUY;
    long bVi;
    int flags;
    int type;
  }

  static final class e
  {
    static b.d f(Object[] paramArrayOfObject)
    {
      if (paramArrayOfObject.length != 11)
      {
        c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args length invalid : %d", new Object[] { Integer.valueOf(paramArrayOfObject.length) });
        paramArrayOfObject = null;
      }
      while (true)
      {
        return paramArrayOfObject;
        b.d locald = new b.d((byte)0);
        if (!(paramArrayOfObject[1] instanceof Integer))
        {
          c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 1 not Integer, %s", new Object[] { paramArrayOfObject[1] });
          paramArrayOfObject = null;
        }
        else
        {
          locald.type = ((Integer)paramArrayOfObject[1]).intValue();
          if (!(paramArrayOfObject[2] instanceof Long))
          {
            c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 2 not Long, %s", new Object[] { paramArrayOfObject[2] });
            paramArrayOfObject = null;
          }
          else
          {
            locald.bUN = ((Long)paramArrayOfObject[2]).longValue();
            if (!(paramArrayOfObject[3] instanceof Long))
            {
              c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 3 not Long, %s", new Object[] { paramArrayOfObject[3] });
              paramArrayOfObject = null;
            }
            else
            {
              locald.bVi = ((Long)paramArrayOfObject[3]).longValue();
              if (!(paramArrayOfObject[4] instanceof Long))
              {
                c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 4 not Long, %s", new Object[] { paramArrayOfObject[4] });
                paramArrayOfObject = null;
              }
              else
              {
                locald.bUO = ((Long)paramArrayOfObject[4]).longValue();
                if (!(paramArrayOfObject[5] instanceof Integer))
                {
                  c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 5 not Integer, %s", new Object[] { paramArrayOfObject[5] });
                  paramArrayOfObject = null;
                }
                else
                {
                  locald.flags = ((Integer)paramArrayOfObject[5]).intValue();
                  if ((paramArrayOfObject[6] != null) && (!(paramArrayOfObject[6] instanceof PendingIntent)))
                  {
                    c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 6 not PendingIntent, %s", new Object[] { paramArrayOfObject[6] });
                    paramArrayOfObject = null;
                  }
                  else
                  {
                    locald.bUY = ((PendingIntent)paramArrayOfObject[6]);
                    if ((b.yS() == null) || (b.yT() == null))
                    {
                      c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs sListenerWrapperCls sListenerField null", new Object[0]);
                      paramArrayOfObject = null;
                    }
                    else if (Build.VERSION.SDK_INT >= 24)
                    {
                      if ((paramArrayOfObject[7] != null) && (!b.yS().isInstance(paramArrayOfObject[7])))
                      {
                        c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 7 not ListenerWrapper, %s", new Object[] { paramArrayOfObject[7] });
                        paramArrayOfObject = null;
                      }
                      else if (paramArrayOfObject[7] == null);
                    }
                    else
                    {
                      try
                      {
                        locald.bUQ = ((AlarmManager.OnAlarmListener)b.yT().get(paramArrayOfObject[7]));
                        paramArrayOfObject = locald;
                      }
                      catch (IllegalAccessException paramArrayOfObject)
                      {
                        c.w("Matrix.AlarmManagerServiceHooker", "createSetArgs args idx 7 init exp:%s", new Object[] { paramArrayOfObject.getLocalizedMessage() });
                        paramArrayOfObject = null;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.b.b
 * JD-Core Version:    0.6.2
 */