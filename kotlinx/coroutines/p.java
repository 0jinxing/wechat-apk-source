package kotlinx.coroutines;

import a.f.b.j;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CommonPool;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "DEFAULT_PARALLELISM_PROPERTY_NAME", "", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "parallelism", "", "getParallelism", "()I", "pool", "requestedParallelism", "usePrivatePool", "", "Try", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createPlainPool", "Ljava/util/concurrent/ExecutorService;", "createPool", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getOrCreatePoolSync", "isGoodCommonPool", "fjpClass", "Ljava/lang/Class;", "isGoodCommonPool$kotlinx_coroutines_core", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "", "shutdown$kotlinx_coroutines_core", "toString", "usePrivatePool$kotlinx_coroutines_core", "kotlinx-coroutines-core"})
public final class p extends av
{
  private static final int BPB;
  private static boolean BPC;
  private static volatile Executor BPD;
  public static final p BPE = new p();

  static
  {
    AppMethodBeat.i(118569);
    try
    {
      String str = System.getProperty("kotlinx.coroutines.default.parallelism");
      if (str == null)
      {
        i = -1;
        BPB = i;
        AppMethodBeat.o(118569);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject = null;
        continue;
        Integer localInteger = m.awy((String)localObject);
        if ((localInteger == null) || (localInteger.intValue() <= 0))
        {
          localObject = (Throwable)new IllegalStateException("Expected positive number in kotlinx.coroutines.default.parallelism, but has ".concat(String.valueOf(localObject)).toString());
          AppMethodBeat.o(118569);
          throw ((Throwable)localObject);
        }
        int i = localInteger.intValue();
      }
    }
  }

  private static boolean a(Class<?> paramClass, ExecutorService paramExecutorService)
  {
    AppMethodBeat.i(118564);
    j.p(paramClass, "fjpClass");
    j.p(paramExecutorService, "executor");
    paramExecutorService.submit((Runnable)p.b.BPG);
    try
    {
      paramExecutorService = paramClass.getMethod("getPoolSize", new Class[0]).invoke(paramExecutorService, new Object[0]);
      paramClass = paramExecutorService;
      if (!(paramExecutorService instanceof Integer))
        paramClass = null;
      paramClass = (Integer)paramClass;
      if (paramClass != null)
      {
        if (paramClass.intValue() <= 0)
          break label101;
        bool = true;
        AppMethodBeat.o(118564);
        return bool;
      }
    }
    catch (Throwable paramClass)
    {
      while (true)
      {
        paramClass = null;
        continue;
        AppMethodBeat.o(118564);
        boolean bool = false;
        continue;
        label101: AppMethodBeat.o(118564);
        bool = false;
      }
    }
  }

  private static ExecutorService ekW()
  {
    AppMethodBeat.i(118563);
    ExecutorService localExecutorService1;
    if (System.getSecurityManager() != null)
    {
      localExecutorService1 = ekX();
      AppMethodBeat.o(118563);
    }
    while (true)
    {
      return localExecutorService1;
      try
      {
        localObject3 = Class.forName("java.util.concurrent.ForkJoinPool");
        if (localObject3 == null)
        {
          localExecutorService1 = ekX();
          AppMethodBeat.o(118563);
        }
      }
      catch (Throwable localThrowable1)
      {
        Object localObject3;
        while (true)
          localObject3 = null;
        Object localObject2;
        if ((!BPC) && (BPB < 0))
          try
          {
            Object localObject1 = ((Class)localObject3).getMethod("commonPool", new Class[0]);
            if (localObject1 != null);
            for (localObject1 = ((Method)localObject1).invoke(null, new Object[0]); ; localObject1 = null)
            {
              Object localObject4 = localObject1;
              if (!(localObject1 instanceof ExecutorService))
                localObject4 = null;
              localObject1 = (ExecutorService)localObject4;
              if (localObject1 == null)
                break label143;
              if (!a((Class)localObject3, (ExecutorService)localObject1))
                break label138;
              if (localObject1 == null)
                break label143;
              AppMethodBeat.o(118563);
              break;
            }
          }
          catch (Throwable localThrowable2)
          {
            while (true)
            {
              localObject2 = null;
              continue;
              label138: localObject2 = null;
            }
          }
        else
          try
          {
            label143: localObject3 = ((Class)localObject3).getConstructor(new Class[] { Integer.TYPE }).newInstance(new Object[] { Integer.valueOf(getParallelism()) });
            localObject2 = localObject3;
            if (!(localObject3 instanceof ExecutorService))
              localObject2 = null;
            localObject2 = (ExecutorService)localObject2;
            if (localObject2 != null)
              AppMethodBeat.o(118563);
          }
          catch (Throwable localThrowable3)
          {
            while (true)
              localExecutorService2 = null;
            ExecutorService localExecutorService2 = ekX();
            AppMethodBeat.o(118563);
          }
      }
    }
  }

  private static ExecutorService ekX()
  {
    AppMethodBeat.i(118565);
    Object localObject = new AtomicInteger();
    localObject = Executors.newFixedThreadPool(getParallelism(), (ThreadFactory)new p.a((AtomicInteger)localObject));
    j.o(localObject, "Executors.newFixedThread…Daemon = true }\n        }");
    AppMethodBeat.o(118565);
    return localObject;
  }

  private final Executor ekY()
  {
    try
    {
      AppMethodBeat.i(118566);
      Executor localExecutor = BPD;
      Object localObject1 = localExecutor;
      if (localExecutor == null)
      {
        localObject1 = ekW();
        BPD = (Executor)localObject1;
        localObject1 = (Executor)localObject1;
      }
      AppMethodBeat.o(118566);
      return localObject1;
    }
    finally
    {
    }
  }

  private static int getParallelism()
  {
    AppMethodBeat.i(118562);
    Integer localInteger = Integer.valueOf(BPB);
    int i;
    if (((Number)localInteger).intValue() > 0)
    {
      i = 1;
      if (i == 0)
        break label49;
      label28: if (localInteger == null)
        break label54;
      i = localInteger.intValue();
      AppMethodBeat.o(118562);
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      label49: localInteger = null;
      break label28;
      label54: i = a.h.e.im(Runtime.getRuntime().availableProcessors() - 1, 1);
      AppMethodBeat.o(118562);
    }
  }

  public final void a(a.c.e parame, Runnable paramRunnable)
  {
    AppMethodBeat.i(118567);
    j.p(parame, "context");
    j.p(paramRunnable, "block");
    try
    {
      Executor localExecutor = BPD;
      parame = localExecutor;
      if (localExecutor == null)
        parame = ekY();
      parame.execute(bs.elC().aD(paramRunnable));
      AppMethodBeat.o(118567);
      return;
    }
    catch (RejectedExecutionException parame)
    {
      while (true)
      {
        bs.elC();
        ag.BPW.aE(paramRunnable);
        AppMethodBeat.o(118567);
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(118568);
    Throwable localThrowable = (Throwable)new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    AppMethodBeat.o(118568);
    throw localThrowable;
  }

  public final String toString()
  {
    return "CommonPool";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.p
 * JD-Core Version:    0.6.2
 */