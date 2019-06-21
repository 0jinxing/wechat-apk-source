package com.tencent.ttpic.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.gles.GLSegSharedData;
import com.tencent.ttpic.gles.SegmentDataPipe;

class FaceGestureDetGLThread$7
  implements Runnable
{
  FaceGestureDetGLThread$7(FaceGestureDetGLThread paramFaceGestureDetGLThread)
  {
  }

  public void run()
  {
    AppMethodBeat.i(83751);
    if (FaceGestureDetGLThread.access$800(this.this$0) == null)
      AppMethodBeat.o(83751);
    while (true)
    {
      return;
      SegmentDataPipe localSegmentDataPipe = FaceGestureDetGLThread.access$300(this.this$0).getFreeTexturePileMakeBusy();
      if (localSegmentDataPipe == null)
      {
        AppMethodBeat.o(83751);
      }
      else
      {
        localSegmentDataPipe.mTimestamp = System.currentTimeMillis();
        localSegmentDataPipe.makeDataReady();
        FaceGestureDetGLThread.access$300(this.this$0).makeBrotherTextureFree(localSegmentDataPipe);
        FaceGestureDetGLThread.access$800(this.this$0).onDataReady(localSegmentDataPipe);
        AppMethodBeat.o(83751);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.FaceGestureDetGLThread.7
 * JD-Core Version:    0.6.2
 */