package com.tencent.ttpic.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.youtu.bodydetector.BodyDetectResult;
import java.util.List;

class FaceGestureDetGLThread$2
  implements FaceGestureDetGLThread.OnBodyDetListener
{
  FaceGestureDetGLThread$2(FaceGestureDetGLThread paramFaceGestureDetGLThread)
  {
  }

  public void onBodyDataReady(List<BodyDetectResult> paramList)
  {
    AppMethodBeat.i(83746);
    FaceGestureDetGLThread.access$700(this.this$0, paramList);
    AppMethodBeat.o(83746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.FaceGestureDetGLThread.2
 * JD-Core Version:    0.6.2
 */