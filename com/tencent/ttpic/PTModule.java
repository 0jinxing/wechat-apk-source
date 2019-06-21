package com.tencent.ttpic;

import android.opengl.EGLContext;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.ApiHelper;
import com.tencent.ttpic.thread.SegmentGLThread;

public enum PTModule
{
  private SegmentGLThread mSegGLThread;

  static
  {
    AppMethodBeat.i(81592);
    INSTANCE = new PTModule("INSTANCE", 0);
    $VALUES = new PTModule[] { INSTANCE };
    AppMethodBeat.o(81592);
  }

  public static PTModule getInstance()
  {
    return INSTANCE;
  }

  public final void destroy()
  {
    AppMethodBeat.i(81591);
    if (this.mSegGLThread != null)
    {
      this.mSegGLThread.destroy();
      this.mSegGLThread = null;
    }
    AppMethodBeat.o(81591);
  }

  public final void init(EGLContext paramEGLContext)
  {
    AppMethodBeat.i(81590);
    if ((ApiHelper.hasJellyBeanMR1()) && (this.mSegGLThread == null))
      this.mSegGLThread = new SegmentGLThread(paramEGLContext);
    AppMethodBeat.o(81590);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTModule
 * JD-Core Version:    0.6.2
 */