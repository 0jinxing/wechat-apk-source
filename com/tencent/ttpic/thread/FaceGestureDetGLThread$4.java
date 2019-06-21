package com.tencent.ttpic.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.youtu.GestureDetector;
import com.tencent.ttpic.util.youtu.VideoPreviewFaceOutlineDetector;
import com.tencent.ttpic.util.youtu.bodydetector.BodyDetector;

class FaceGestureDetGLThread$4
  implements Runnable
{
  FaceGestureDetGLThread$4(FaceGestureDetGLThread paramFaceGestureDetGLThread)
  {
  }

  public void run()
  {
    AppMethodBeat.i(83748);
    BodyDetector.getInstance().destroy();
    GestureDetector.getInstance().destroy();
    FaceGestureDetGLThread.access$500(this.this$0).clear();
    FaceGestureDetGLThread.access$500(this.this$0).destroy();
    AppMethodBeat.o(83748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.FaceGestureDetGLThread.4
 * JD-Core Version:    0.6.2
 */