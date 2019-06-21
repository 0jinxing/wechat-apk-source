package com.tencent.ttpic.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.fabby.FabbyManager;

class SegmentGLThread$6
  implements Runnable
{
  SegmentGLThread$6(SegmentGLThread paramSegmentGLThread)
  {
  }

  public void run()
  {
    AppMethodBeat.i(83778);
    FabbyManager.getInstance().clearSegmentBuffer();
    AppMethodBeat.o(83778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.SegmentGLThread.6
 * JD-Core Version:    0.6.2
 */