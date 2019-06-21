package com.tencent.youtu.ytagreflectlivecheck.worker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;

class TimerWorker$1 extends TimerTask
{
  TimerWorker$1(TimerWorker paramTimerWorker)
  {
  }

  public void run()
  {
    AppMethodBeat.i(123201);
    TimerWorker.access$000(this.this$0);
    AppMethodBeat.o(123201);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker.1
 * JD-Core Version:    0.6.2
 */