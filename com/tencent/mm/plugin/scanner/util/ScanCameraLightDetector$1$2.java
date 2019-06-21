package com.tencent.mm.plugin.scanner.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.pq;
import com.tencent.mm.sdk.b.a;

final class ScanCameraLightDetector$1$2
  implements Runnable
{
  ScanCameraLightDetector$1$2(ScanCameraLightDetector.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81445);
    pq localpq = new pq();
    localpq.cLQ.cLR = false;
    a.xxA.m(localpq);
    AppMethodBeat.o(81445);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.1.2
 * JD-Core Version:    0.6.2
 */