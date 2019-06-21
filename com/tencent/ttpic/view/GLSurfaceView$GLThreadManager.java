package com.tencent.ttpic.view;

import com.tencent.matrix.trace.core.AppMethodBeat;

class GLSurfaceView$GLThreadManager
{
  private static String TAG = "GLThreadManager";

  public void releaseEglContextLocked(GLSurfaceView.GLThread paramGLThread)
  {
    AppMethodBeat.i(84465);
    notifyAll();
    AppMethodBeat.o(84465);
  }

  public void threadExiting(GLSurfaceView.GLThread paramGLThread)
  {
    try
    {
      AppMethodBeat.i(84464);
      GLSurfaceView.GLThread.access$1102(paramGLThread, true);
      notifyAll();
      AppMethodBeat.o(84464);
      return;
    }
    finally
    {
      paramGLThread = finally;
    }
    throw paramGLThread;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.view.GLSurfaceView.GLThreadManager
 * JD-Core Version:    0.6.2
 */