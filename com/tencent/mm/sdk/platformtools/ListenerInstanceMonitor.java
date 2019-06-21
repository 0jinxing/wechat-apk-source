package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import android.os.Debug;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class ListenerInstanceMonitor
{
  private static final Map<Object, Set<a>> xyA;
  private static final byte[] xyB;
  private static Field xyC;
  private static HandlerThread xyD;
  private static ak xyE;
  private static volatile boolean xyF;
  private static final String xyG;
  private static final Runnable xyH;

  static
  {
    AppMethodBeat.i(115218);
    xyA = new WeakHashMap();
    xyB = new byte[0];
    xyC = null;
    xyD = null;
    xyE = null;
    xyF = false;
    xyG = Activity.class.getName();
    xyH = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(115204);
        synchronized (ListenerInstanceMonitor.doj())
        {
          if (!ListenerInstanceMonitor.xyF)
          {
            AppMethodBeat.o(115204);
            return;
          }
          synchronized (ListenerInstanceMonitor.dok())
          {
            if (ListenerInstanceMonitor.xyA.isEmpty())
              ab.d("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: no listener or cb was added, skip rest logic.");
          }
        }
        while (true)
        {
          synchronized (ListenerInstanceMonitor.doj())
          {
            if (ListenerInstanceMonitor.xyF)
              ListenerInstanceMonitor.bZr().postDelayed(this, 10000L);
            AppMethodBeat.o(115204);
            break;
            localObject3 = finally;
            AppMethodBeat.o(115204);
            throw localObject3;
            if (Debug.isDebuggerConnected())
            {
              ab.w("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: found debugger connected, disable monitor works in case of misreport.");
              continue;
              localObject4 = finally;
              AppMethodBeat.o(115204);
              throw localObject4;
            }
            ab.d("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: triggering gc...");
          }
          try
          {
            Runtime.getRuntime().gc();
            Thread.sleep(100L);
            Runtime.getRuntime().runFinalization();
            label149: label308: label348: Object localObject7;
            while (true)
            {
              Iterator localIterator2;
              ListenerInstanceMonitor.a locala;
              Object localObject8;
              synchronized (ListenerInstanceMonitor.dok())
              {
                Iterator localIterator1 = ListenerInstanceMonitor.xyA.entrySet().iterator();
                if (!localIterator1.hasNext())
                  break;
                localIterator2 = ((Set)((Map.Entry)localIterator1.next()).getValue()).iterator();
                if (!localIterator2.hasNext())
                  continue;
                locala = (ListenerInstanceMonitor.a)localIterator2.next();
                Object localObject5 = locala.xyI.get();
                localObject8 = (Activity)locala.xyJ.get();
                if (localObject8 == null)
                {
                  ab.i("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: Ok, ui [%s] was recycled.", new Object[] { locala.xyK.getName() });
                  localIterator2.remove();
                }
              }
              boolean bool = ((Activity)localObject8).isDestroyed();
              int i;
              int j;
              if (!bool)
              {
                i = 0;
                if ((i == 0) || (localObject6 != null))
                  break label508;
                if (locala.xyN <= 3)
                  break label661;
                localIterator2.remove();
                if ((!bp.dpL()) && (!bp.dnM()))
                  break label516;
                j = 1;
                localObject8 = new com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor$ListenerLeakedException;
                if (locala.xyJ.get() != null)
                  break label556;
                if (locala.xyL == null)
                  break label522;
                localObject7 = new java/lang/StringBuilder;
                ((StringBuilder)localObject7).<init>("ui of class [");
                localObject7 = locala.xyK.getName() + "] held by\n [" + locala.dom() + "] is recycled";
              }
              while (true)
              {
                ((ListenerInstanceMonitor.ListenerLeakedException)localObject8).<init>((String)localObject7, locala.xyM);
                if (j == 0)
                  break label645;
                AppMethodBeat.o(115204);
                throw ((Throwable)localObject8);
                localObject8 = Looper.getMainLooper().getThread().getStackTrace();
                int k = localObject8.length;
                for (j = 0; ; j++)
                {
                  i = bool;
                  if (j >= k)
                    break label308;
                  Object localObject9 = localObject8[j];
                  if ((ListenerInstanceMonitor.xyG.equals(localObject9.getClassName())) && ("performDestroy".equals(localObject9.getMethodName())))
                  {
                    i = 0;
                    break label308;
                    label508: break;
                  }
                }
                label516: j = 0;
                break label348;
                label522: localObject7 = new java/lang/StringBuilder;
                ((StringBuilder)localObject7).<init>("ui of class [");
                localObject7 = locala.xyK.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is recycled";
                continue;
                label556: if (locala.xyL != null)
                {
                  localObject7 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject7).<init>("ui of class [");
                  localObject7 = locala.xyK.getName() + "] held by\n [" + locala.dom() + "] is leaked.\n Perhaps you should remove the holder from any 'Manager' class when the leaked ui was destroyed.";
                }
                else
                {
                  localObject7 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject7).<init>("ui of class [");
                  localObject7 = locala.xyK.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is leaked.\n Perhaps you should remove any instance of this class from any 'Manager'";
                }
              }
              label645: ab.printErrStackTrace("MicroMsg.ListenerInstanceMonitor", (Throwable)localObject8, "", new Object[0]);
              continue;
              label661: locala.xyN += 1;
              ab.w("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: ui [%s] was recycled, but its instance is still exists in %s time(s) check.", new Object[] { locala.xyK.getName(), Integer.valueOf(locala.xyN) });
            }
            continue;
            localObject2 = finally;
            AppMethodBeat.o(115204);
            throw localObject2;
          }
          catch (Throwable localThrowable)
          {
            break label149;
          }
        }
      }
    };
    if ((bp.dpL()) || (bp.dnM()))
      if (!ah.bqo());
    while (true)
    {
      try
      {
        Field localField = View.class.getDeclaredField("mContext");
        xyC = localField;
        localField.setAccessible(true);
        doi();
        AppMethodBeat.o(115218);
        return;
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.ListenerInstanceMonitor", localThrowable, "init failed, keep disabled.", new Object[0]);
        AppMethodBeat.o(115218);
        continue;
      }
      ab.w("MicroMsg.ListenerInstanceMonitor", "Not mm process, keep disabled.");
      AppMethodBeat.o(115218);
      continue;
      ab.w("MicroMsg.ListenerInstanceMonitor", "Not debug, assist or monkey env, keep disabled.");
      AppMethodBeat.o(115218);
    }
  }

  private static void a(Object paramObject, Activity paramActivity, Field paramField, Throwable paramThrowable)
  {
    AppMethodBeat.i(115216);
    Object localObject1 = null;
    Object localObject2;
    int i;
    int j;
    if (paramObject.getClass().isAnnotationPresent(h.class))
    {
      localObject2 = (h)paramObject.getClass().getAnnotation(h.class);
      if (localObject2 == null)
        break label204;
      localObject1 = paramActivity.getClass();
      localObject2 = ((h)localObject2).doa();
      if ((localObject2 != null) && (localObject2.length > 0))
      {
        i = localObject2.length;
        for (j = 0; j < i; j++)
          if (localObject1.equals(localObject2[j]))
            break label198;
      }
    }
    else
    {
      ??? = paramObject.getClass().getDeclaredMethods();
      i = ???.length;
      for (j = 0; ; j++)
      {
        localObject2 = localObject1;
        if (j >= i)
          break;
        localObject2 = ???[j];
        if (((Method)localObject2).isAnnotationPresent(h.class))
        {
          localObject2 = (h)((Method)localObject2).getAnnotation(h.class);
          break;
        }
      }
      j = 0;
      if (j == 0)
        break label204;
      ab.w("MicroMsg.ListenerInstanceMonitor", "Activity %s held by %s is ignored !!", new Object[] { paramActivity, paramObject });
      AppMethodBeat.o(115216);
    }
    while (true)
    {
      return;
      label198: j = 1;
      break;
      synchronized (xyB)
      {
        label204: localObject1 = (Set)xyA.get(paramObject);
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = new java/util/HashSet;
          ((HashSet)localObject2).<init>();
          xyA.put(paramObject, localObject2);
        }
        paramObject = new com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor$a;
        paramObject.<init>(paramActivity, paramField, paramThrowable);
        ((Set)localObject2).add(paramObject);
        AppMethodBeat.o(115216);
      }
    }
  }

  private static void a(Object paramObject, Field paramField, Throwable paramThrowable)
  {
    AppMethodBeat.i(115214);
    Object localObject;
    if (paramField == null)
      if ((paramObject instanceof Activity))
      {
        localObject = (Activity)paramObject;
        a(paramObject, (Activity)localObject, paramField, paramThrowable);
        AppMethodBeat.o(115214);
      }
    while (true)
      while (true)
      {
        return;
        AppMethodBeat.o(115214);
        continue;
        if (!paramField.isAccessible())
          paramField.setAccessible(true);
        try
        {
          Activity localActivity = (Activity)paramField.get(paramObject);
          localObject = localActivity;
          if (localActivity != null)
            break;
          AppMethodBeat.o(115214);
        }
        catch (Throwable paramObject)
        {
          AppMethodBeat.o(115214);
        }
      }
  }

  private static void b(Object paramObject, Field paramField, Throwable paramThrowable)
  {
    AppMethodBeat.i(115215);
    Object localObject;
    if (paramField == null)
      if ((paramObject instanceof View))
        localObject = (View)paramObject;
    try
    {
      localObject = xyC.get(localObject);
      if ((localObject instanceof Activity))
        a(paramObject, (Activity)localObject, paramField, paramThrowable);
      AppMethodBeat.o(115215);
      while (true)
        while (true)
        {
          return;
          AppMethodBeat.o(115215);
          continue;
          if (xyC == null)
          {
            AppMethodBeat.o(115215);
          }
          else
          {
            if (!paramField.isAccessible())
              paramField.setAccessible(true);
            try
            {
              View localView = (View)paramField.get(paramObject);
              localObject = localView;
              if (localView != null)
                break;
              AppMethodBeat.o(115215);
            }
            catch (Throwable paramObject)
            {
              AppMethodBeat.o(115215);
            }
          }
        }
    }
    catch (Throwable paramObject)
    {
      while (true)
        AppMethodBeat.o(115215);
    }
  }

  public static void cA(Object paramObject)
  {
    AppMethodBeat.i(115213);
    if (paramObject == null)
      AppMethodBeat.o(115213);
    while (true)
    {
      return;
      Throwable localThrowable = new Throwable();
      Class localClass1 = paramObject.getClass();
      if (!Object.class.equals(localClass1))
      {
        if (Activity.class.isAssignableFrom(localClass1))
          a(paramObject, null, localThrowable);
        while (true)
        {
          localClass1 = localClass1.getSuperclass();
          break;
          if (!View.class.isAssignableFrom(localClass1))
            break label78;
          b(paramObject, null, localThrowable);
        }
        label78: Field[] arrayOfField = localClass1.getDeclaredFields();
        int i = arrayOfField.length;
        int j = 0;
        label90: Field localField;
        Class localClass2;
        if (j < i)
        {
          localField = arrayOfField[j];
          localClass2 = localField.getType();
          if (!Activity.class.isAssignableFrom(localClass2))
            break label133;
          a(paramObject, localField, localThrowable);
        }
        while (true)
        {
          j++;
          break label90;
          break;
          label133: if (View.class.isAssignableFrom(localClass2))
            b(paramObject, localField, localThrowable);
        }
      }
      AppMethodBeat.o(115213);
    }
  }

  public static void cB(Object paramObject)
  {
    AppMethodBeat.i(115217);
    if (paramObject == null)
      AppMethodBeat.o(115217);
    while (true)
    {
      return;
      synchronized (xyB)
      {
        xyA.remove(paramObject);
        AppMethodBeat.o(115217);
      }
    }
  }

  private static void doi()
  {
    AppMethodBeat.i(115212);
    synchronized (xyH)
    {
      if (!xyF)
      {
        Object localObject1 = d.anM("ListenerInstanceMonitor");
        xyD = (HandlerThread)localObject1;
        ((HandlerThread)localObject1).start();
        localObject1 = new com/tencent/mm/sdk/platformtools/ak;
        ((ak)localObject1).<init>(xyD.getLooper());
        xyE = (ak)localObject1;
        ((ak)localObject1).postDelayed(xyH, 10000L);
        xyF = true;
      }
      AppMethodBeat.o(115212);
      return;
    }
  }

  static final class ListenerLeakedException extends RuntimeException
  {
    ListenerLeakedException(String paramString, Throwable paramThrowable)
    {
      super();
      AppMethodBeat.i(115211);
      setStackTrace(paramThrowable.getStackTrace());
      AppMethodBeat.o(115211);
    }

    public final Throwable fillInStackTrace()
    {
      return this;
    }
  }

  static final class a
  {
    final WeakReference<Object> xyI;
    WeakReference<Activity> xyJ;
    Class<?> xyK;
    Field xyL;
    Throwable xyM;
    int xyN;

    a(Activity paramActivity, Field paramField, Throwable paramThrowable)
    {
      AppMethodBeat.i(115205);
      this.xyI = new WeakReference(new Object());
      this.xyJ = new WeakReference(paramActivity);
      this.xyK = paramActivity.getClass();
      this.xyL = paramField;
      this.xyM = paramThrowable;
      this.xyN = 0;
      AppMethodBeat.o(115205);
    }

    // ERROR //
    private String dol()
    {
      // Byte code:
      //   0: ldc 61
      //   2: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: new 63	java/io/StringWriter
      //   8: dup
      //   9: invokespecial 64	java/io/StringWriter:<init>	()V
      //   12: astore_1
      //   13: new 66	java/io/PrintWriter
      //   16: astore_2
      //   17: aload_2
      //   18: aload_1
      //   19: invokespecial 69	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
      //   22: aload_0
      //   23: getfield 52	com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor$a:xyM	Ljava/lang/Throwable;
      //   26: aload_2
      //   27: invokevirtual 75	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
      //   30: aload_2
      //   31: invokestatic 81	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
      //   34: aload_1
      //   35: invokevirtual 84	java/io/StringWriter:toString	()Ljava/lang/String;
      //   38: astore_1
      //   39: ldc 61
      //   41: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   44: aload_1
      //   45: areturn
      //   46: astore_1
      //   47: aconst_null
      //   48: astore_2
      //   49: aload_2
      //   50: invokestatic 81	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
      //   53: ldc 61
      //   55: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   58: aload_1
      //   59: athrow
      //   60: astore_1
      //   61: goto -12 -> 49
      //
      // Exception table:
      //   from	to	target	type
      //   13	22	46	finally
      //   22	30	60	finally
    }

    final String dom()
    {
      AppMethodBeat.i(115208);
      Object localObject;
      if (this.xyL == null)
      {
        localObject = "#null#";
        AppMethodBeat.o(115208);
      }
      while (true)
      {
        return localObject;
        localObject = this.xyL.getDeclaringClass();
        if (((Class)localObject).isAnonymousClass())
          break;
        localObject = "field " + this.xyL.getName() + " defined in " + ((Class)localObject).getName();
        AppMethodBeat.o(115208);
      }
      Type localType = ((Class)localObject).getGenericSuperclass();
      if (Object.class.equals(localType))
        localObject = localObject.getGenericInterfaces()[0];
      while (true)
      {
        localObject = "field " + this.xyL.getName() + " define in anonymous class of " + localObject.toString().replace('<', '#').replace('>', '#');
        AppMethodBeat.o(115208);
        break;
        if (localType != null)
          localObject = localType;
      }
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool1 = true;
      boolean bool2 = false;
      AppMethodBeat.i(115210);
      boolean bool3;
      if ((paramObject == null) || (!(paramObject instanceof a)))
      {
        AppMethodBeat.o(115210);
        bool3 = bool2;
        return bool3;
      }
      paramObject = (a)paramObject;
      Object localObject1 = this.xyJ.get();
      Object localObject2 = paramObject.xyJ.get();
      if ((localObject1 == null) && (localObject2 == null))
        bool3 = true;
      while (true)
      {
        if (bool3)
          break label111;
        AppMethodBeat.o(115210);
        bool3 = bool2;
        break;
        if ((localObject1 != null) && (localObject2 != null))
          bool3 = localObject1.equals(localObject2);
        else
          bool3 = false;
      }
      label111: localObject1 = this.xyL;
      localObject2 = paramObject.xyL;
      if ((localObject1 == null) && (localObject2 == null))
        bool3 = true;
      while (true)
      {
        if (bool3)
          break label180;
        AppMethodBeat.o(115210);
        bool3 = bool2;
        break;
        if ((localObject1 != null) && (localObject2 != null))
          bool3 = ((Field)localObject1).equals(localObject2);
        else
          bool3 = false;
      }
      label180: localObject1 = this.xyM;
      paramObject = paramObject.xyM;
      if ((localObject1 == null) && (paramObject == null))
        bool3 = bool1;
      while (true)
      {
        AppMethodBeat.o(115210);
        break;
        if ((localObject1 != null) && (paramObject != null))
          bool3 = localObject1.equals(paramObject);
        else
          bool3 = false;
      }
    }

    public final int hashCode()
    {
      int i = 0;
      AppMethodBeat.i(115209);
      Object localObject = this.xyJ.get();
      int j;
      if (localObject != null)
      {
        j = localObject.hashCode();
        if (this.xyL == null)
          break label72;
      }
      label72: for (int k = this.xyL.hashCode(); ; k = 0)
      {
        if (this.xyM != null)
          i = this.xyM.hashCode();
        AppMethodBeat.o(115209);
        return j + k + i;
        j = 0;
        break;
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(115206);
      String str = dom() + "@" + dol().replace('\n', '|');
      AppMethodBeat.o(115206);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor
 * JD-Core Version:    0.6.2
 */