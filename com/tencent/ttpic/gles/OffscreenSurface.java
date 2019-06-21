package com.tencent.ttpic.gles;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class OffscreenSurface extends EglSurfaceBase
{
  public OffscreenSurface(EglCore paramEglCore, int paramInt1, int paramInt2)
  {
    super(paramEglCore);
    AppMethodBeat.i(50019);
    createOffscreenSurface(paramInt1, paramInt2);
    AppMethodBeat.o(50019);
  }

  public void release()
  {
    AppMethodBeat.i(50020);
    releaseEglSurface();
    AppMethodBeat.o(50020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.gles.OffscreenSurface
 * JD-Core Version:    0.6.2
 */