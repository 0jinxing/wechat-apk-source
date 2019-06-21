package kotlinx.coroutines.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "RETIRING", "TERMINATED", "kotlinx-coroutines-core"})
public enum a$c
{
  static
  {
    AppMethodBeat.i(118336);
    c localc1 = new c("CPU_ACQUIRED", 0);
    BSw = localc1;
    c localc2 = new c("BLOCKING", 1);
    BSx = localc2;
    c localc3 = new c("PARKING", 2);
    BSy = localc3;
    c localc4 = new c("RETIRING", 3);
    BSz = localc4;
    c localc5 = new c("TERMINATED", 4);
    BSA = localc5;
    BSB = new c[] { localc1, localc2, localc3, localc4, localc5 };
    AppMethodBeat.o(118336);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.a.c
 * JD-Core Version:    0.6.2
 */