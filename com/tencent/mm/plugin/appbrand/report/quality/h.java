package com.tencent.mm.plugin.appbrand.report.quality;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.performance.e;

public enum h
{
  e ivH;

  static
  {
    AppMethodBeat.i(132698);
    iCR = new h("INST");
    iCS = new h[] { iCR };
    AppMethodBeat.o(132698);
  }

  private h()
  {
    AppMethodBeat.i(132697);
    this.ivH = new e(Process.myPid());
    this.ivH.aKs();
    AppMethodBeat.o(132697);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.h
 * JD-Core Version:    0.6.2
 */