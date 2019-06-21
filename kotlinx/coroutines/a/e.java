package kotlinx.coroutines.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"REMOVE_FUTURE_ON_CANCEL", "Ljava/lang/reflect/Method;", "identitySet", "", "E", "expectedSize", "", "removeFutureOnCancel", "", "executor", "Ljava/util/concurrent/Executor;", "subscriberList", "", "Lkotlinx/coroutines/internal/SubscribersList;", "withLock", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ReentrantLock", "kotlinx-coroutines-core"})
public final class e
{
  private static final Method BRk;

  static
  {
    AppMethodBeat.i(118434);
    try
    {
      Method localMethod = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[] { Boolean.TYPE });
      BRk = localMethod;
      AppMethodBeat.o(118434);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        Object localObject = null;
    }
  }

  public static final <E> Set<E> UZ(int paramInt)
  {
    AppMethodBeat.i(118433);
    Set localSet = Collections.newSetFromMap((Map)new IdentityHashMap(paramInt));
    j.o(localSet, "Collections.newSetFromMa…ityHashMap(expectedSize))");
    AppMethodBeat.o(118433);
    return localSet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.e
 * JD-Core Version:    0.6.2
 */