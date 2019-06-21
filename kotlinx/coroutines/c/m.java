package kotlinx.coroutines.c;

import a.h.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"BLOCKING_DEFAULT_PARALLELISM", "", "CORE_POOL_SIZE", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "QUEUE_SIZE_OFFLOAD_THRESHOLD", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/TimeSource;", "kotlinx-coroutines-core"})
public final class m
{
  public static final long BSS;
  public static final int BST;
  public static final int BSU;
  public static final int BSV;
  public static final long BSW;
  public static n BSX;
  public static final int CORE_POOL_SIZE;

  static
  {
    AppMethodBeat.i(118302);
    BSS = kotlinx.coroutines.a.n.aU("kotlinx.coroutines.scheduler.resolution.ns", 100000L);
    BST = kotlinx.coroutines.a.n.e("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4);
    BSU = kotlinx.coroutines.a.n.e("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
    CORE_POOL_SIZE = kotlinx.coroutines.a.n.e("kotlinx.coroutines.scheduler.core.pool.size", e.im(kotlinx.coroutines.a.n.elQ(), 2), 1, 0, 8);
    BSV = kotlinx.coroutines.a.n.e("kotlinx.coroutines.scheduler.max.pool.size", e.aQ(kotlinx.coroutines.a.n.elQ() * 128, CORE_POOL_SIZE, 2097150), 0, 2097150, 4);
    BSW = TimeUnit.SECONDS.toNanos(kotlinx.coroutines.a.n.aU("kotlinx.coroutines.scheduler.keep.alive.sec", 5L));
    BSX = (n)g.BSK;
    AppMethodBeat.o(118302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.m
 * JD-Core Version:    0.6.2
 */