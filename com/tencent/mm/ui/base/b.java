package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class b
{
  public static void K(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(106256);
    if ((paramIntent == null) || (paramContext == null) || (!(paramContext instanceof Activity)))
      AppMethodBeat.o(106256);
    while (true)
    {
      return;
      if (paramIntent.getBooleanExtra("animation_pop_in", false))
        ((Activity)paramContext).overridePendingTransition(2131034216, 2131034130);
      AppMethodBeat.o(106256);
    }
  }

  @TargetApi(16)
  public static void a(Activity paramActivity, a parama)
  {
    AppMethodBeat.i(106253);
    if (d.fP(16))
    {
      ab.w("MicroMsg.ActivityUtil", "convertActivityToTranslucent::Android Version Error %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      AppMethodBeat.o(106253);
      return;
    }
    label277: label282: 
    while (true)
    {
      try
      {
        Object localObject1 = Activity.class.getDeclaredClasses();
        int i = localObject1.length;
        int j = 0;
        localObject2 = null;
        if (j < i)
        {
          localWeakReference = localObject1[j];
          if (!localWeakReference.getSimpleName().contains("TranslucentConversionListener"))
            break label282;
          localObject2 = localWeakReference;
          j++;
          continue;
        }
        if (parama == null)
          break label277;
        localObject1 = new com/tencent/mm/ui/base/b$b;
        ((b)localObject1).<init>((byte)0);
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(parama);
        ((b)localObject1).ysj = localWeakReference;
        parama = Proxy.newProxyInstance(((Class)localObject2).getClassLoader(), new Class[] { localObject2 }, (InvocationHandler)localObject1);
        if (!d.fP(21))
          break label221;
        localObject2 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[] { localObject2 });
        ((Method)localObject2).setAccessible(true);
        ((Method)localObject2).invoke(paramActivity, new Object[] { parama });
        AppMethodBeat.o(106253);
      }
      catch (Throwable paramActivity)
      {
        ab.printErrStackTrace("MicroMsg.ActivityUtil", paramActivity, "call convertActivityToTranslucent Fail: %s", new Object[] { paramActivity.getMessage() });
        AppMethodBeat.o(106253);
      }
      break;
      label221: Object localObject2 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[] { localObject2, ActivityOptions.class });
      ((Method)localObject2).setAccessible(true);
      ((Method)localObject2).invoke(paramActivity, new Object[] { parama, null });
      AppMethodBeat.o(106253);
      break;
      parama = null;
    }
  }

  public static int aB(Class<?> paramClass)
  {
    AppMethodBeat.i(106246);
    a locala = (a)paramClass.getAnnotation(a.class);
    int i;
    if (locala != null)
    {
      i = locala.value();
      AppMethodBeat.o(106246);
    }
    while (true)
    {
      return i;
      i = aC(paramClass);
      AppMethodBeat.o(106246);
    }
  }

  private static int aC(Class<?> paramClass)
  {
    AppMethodBeat.i(106247);
    paramClass = paramClass.getSuperclass();
    int i;
    if (paramClass != null)
    {
      i = aB(paramClass);
      AppMethodBeat.o(106247);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(106247);
    }
  }

  public static boolean aD(Class<?> paramClass)
  {
    AppMethodBeat.i(106249);
    boolean bool;
    if ((aB(paramClass) & 0x1) == 0)
    {
      bool = true;
      AppMethodBeat.o(106249);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106249);
    }
  }

  public static boolean aE(Class<?> paramClass)
  {
    AppMethodBeat.i(106250);
    boolean bool;
    if ((aB(paramClass) & 0x2) == 0)
    {
      bool = true;
      AppMethodBeat.o(106250);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106250);
    }
  }

  public static int aqL(String paramString)
  {
    AppMethodBeat.i(106245);
    paramString = aqM(paramString);
    int i;
    if (paramString != null)
    {
      i = aB(paramString);
      AppMethodBeat.o(106245);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(106245);
    }
  }

  private static Class<?> aqM(String paramString)
  {
    AppMethodBeat.i(106248);
    try
    {
      Class localClass = Class.forName(paramString);
      paramString = localClass;
      AppMethodBeat.o(106248);
      return paramString;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ActivityUtil", localClassNotFoundException, "", new Object[0]);
        ab.e("MicroMsg.ActivityUtil", "Class %s not found in dex", new Object[] { paramString });
        paramString = null;
        AppMethodBeat.o(106248);
      }
    }
  }

  public static boolean aqN(String paramString)
  {
    AppMethodBeat.i(106251);
    boolean bool;
    if ((aqL(paramString) & 0x4) != 0)
    {
      bool = true;
      AppMethodBeat.o(106251);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106251);
    }
  }

  public static void au(Activity paramActivity)
  {
    AppMethodBeat.i(106252);
    try
    {
      Method localMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(paramActivity, new Object[0]);
      AppMethodBeat.o(106252);
      return;
    }
    catch (Throwable paramActivity)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ActivityUtil", paramActivity, "call convertActivityFromTranslucent Fail: %s", new Object[] { paramActivity.getMessage() });
        AppMethodBeat.o(106252);
      }
    }
  }

  public static String d(ComponentName paramComponentName)
  {
    AppMethodBeat.i(106244);
    if (paramComponentName.getClassName().startsWith(paramComponentName.getPackageName()))
    {
      paramComponentName = paramComponentName.getClassName();
      AppMethodBeat.o(106244);
    }
    while (true)
    {
      return paramComponentName;
      paramComponentName = paramComponentName.getPackageName() + paramComponentName.getClassName();
      AppMethodBeat.o(106244);
    }
  }

  public static void hK(Context paramContext)
  {
    AppMethodBeat.i(106254);
    if ((paramContext == null) || (!(paramContext instanceof Activity)))
      AppMethodBeat.o(106254);
    while (true)
    {
      return;
      ((Activity)paramContext).overridePendingTransition(2131034216, 2131034130);
      AppMethodBeat.o(106254);
    }
  }

  public static void hL(Context paramContext)
  {
    AppMethodBeat.i(106255);
    if ((paramContext == null) || (!(paramContext instanceof Activity)))
      AppMethodBeat.o(106255);
    while (true)
    {
      return;
      ((Activity)paramContext).overridePendingTransition(2131034216, 2131034221);
      AppMethodBeat.o(106255);
    }
  }

  public static void hM(Context paramContext)
  {
    AppMethodBeat.i(106257);
    if ((paramContext == null) || (!(paramContext instanceof Activity)))
      AppMethodBeat.o(106257);
    while (true)
    {
      return;
      ((Activity)paramContext).overridePendingTransition(2131034130, 2131034221);
      AppMethodBeat.o(106257);
    }
  }

  public static void hN(Context paramContext)
  {
    AppMethodBeat.i(106258);
    if ((paramContext == null) || (!(paramContext instanceof Activity)))
      AppMethodBeat.o(106258);
    while (true)
    {
      return;
      ((Activity)paramContext).overridePendingTransition(2131034130, 2131034130);
      AppMethodBeat.o(106258);
    }
  }

  public static abstract interface a
  {
    public abstract void iH(boolean paramBoolean);
  }

  static final class b
    implements InvocationHandler
  {
    WeakReference<b.a> ysj;

    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      boolean bool1 = false;
      AppMethodBeat.i(106243);
      if (this.ysj == null)
      {
        ab.i("MicroMsg.ActivityUtil", "swipe invoke fail, callbackRef NULL!");
        AppMethodBeat.o(106243);
      }
      while (true)
      {
        return null;
        paramObject = (b.a)this.ysj.get();
        if (paramObject == null)
        {
          ab.i("MicroMsg.ActivityUtil", "swipe invoke fail, callback NULL!");
          AppMethodBeat.o(106243);
        }
        else
        {
          boolean bool2 = bool1;
          if (paramArrayOfObject != null)
          {
            bool2 = bool1;
            if (paramArrayOfObject.length > 0)
            {
              bool2 = bool1;
              if ((paramArrayOfObject[0] instanceof Boolean))
                bool2 = ((Boolean)paramArrayOfObject[0]).booleanValue();
            }
          }
          paramObject.iH(bool2);
          AppMethodBeat.o(106243);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.b
 * JD-Core Version:    0.6.2
 */