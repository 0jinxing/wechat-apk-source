package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.m;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"CLOSED_EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED_EMPTY$annotations", "()V", "DISPOSED_TASK", "MAX_MS", "", "MS_TO_NS", "SCHEDULE_COMPLETED", "", "SCHEDULE_DISPOSED", "SCHEDULE_OK", "delayNanosToMillis", "timeNanos", "delayToNanos", "timeMillis", "Queue", "T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "kotlinx-coroutines-core"})
public final class au
{
  private static final m BQq;
  private static final m BQr;

  static
  {
    AppMethodBeat.i(118373);
    BQq = new m("REMOVED_TASK");
    BQr = new m("CLOSED_EMPTY");
    AppMethodBeat.o(118373);
  }

  public static final long nY(long paramLong)
  {
    paramLong = 0L;
    if (1000L <= 0L);
    while (true)
    {
      return paramLong;
      if (1000L >= 9223372036854L)
        paramLong = 9223372036854775807L;
      else
        paramLong = 1000000000L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.au
 * JD-Core Version:    0.6.2
 */