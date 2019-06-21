package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Ljava/lang/Thread;", "it", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread"})
final class p$a
  implements ThreadFactory
{
  p$a(AtomicInteger paramAtomicInteger)
  {
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(118523);
    paramRunnable = new Thread(paramRunnable, "CommonPool-worker-" + this.BPF.incrementAndGet());
    paramRunnable.setDaemon(true);
    AppMethodBeat.o(118523);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.p.a
 * JD-Core Version:    0.6.2
 */