package com.tencent.ttpic.util.youtu.bodydetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class BodyDetector$1
  implements Runnable
{
  BodyDetector$1(BodyDetector paramBodyDetector, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(84418);
    Object localObject1 = new float[59];
    float[] arrayOfFloat1 = new float[59];
    float[] arrayOfFloat2 = new float[59];
    this.this$0.nativeDetectBody(this.val$image, this.val$width, this.val$height, (float[])localObject1, arrayOfFloat1, arrayOfFloat2, BodyDetector.access$000(this.this$0), BodyDetector.access$100(this.this$0), BodyDetector.access$200(this.this$0), 59, 17, 2);
    synchronized (BodyDetector.access$300(this.this$0))
    {
      System.arraycopy(localObject1, 0, BodyDetector.access$400(this.this$0), 0, 59);
      System.arraycopy(arrayOfFloat1, 0, BodyDetector.access$500(this.this$0), 0, 59);
      System.arraycopy(arrayOfFloat2, 0, BodyDetector.access$600(this.this$0), 0, 59);
      localObject1 = this.this$0;
      if (((BodyDetector.access$600(this.this$0)[15] > 0.2D) && (BodyDetector.access$600(this.this$0)[20] > 0.2D)) || ((BodyDetector.access$600(this.this$0)[43] > 0.2D) && (BodyDetector.access$600(this.this$0)[31] > 0.2D)))
      {
        bool = true;
        ((BodyDetector)localObject1).bodyDetected = bool;
        AppMethodBeat.o(84418);
        return;
      }
      boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.bodydetector.BodyDetector.1
 * JD-Core Version:    0.6.2
 */