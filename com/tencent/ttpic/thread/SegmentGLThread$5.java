package com.tencent.ttpic.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.fabby.FabbyManager;

class SegmentGLThread$5
  implements Runnable
{
  SegmentGLThread$5(SegmentGLThread paramSegmentGLThread)
  {
  }

  public void run()
  {
    AppMethodBeat.i(83777);
    FabbyManager.getInstance().compileKernel();
    AppMethodBeat.o(83777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.SegmentGLThread.5
 * JD-Core Version:    0.6.2
 */