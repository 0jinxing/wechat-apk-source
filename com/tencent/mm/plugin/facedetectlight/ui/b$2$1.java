package com.tencent.mm.plugin.facedetectlight.ui;

import android.hardware.Camera;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.d;
import com.tencent.mm.plugin.facedetectaction.b.a.b;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytfacetrace.YTFaceTraceInterface;

final class b$2$1
  implements Runnable
{
  b$2$1(b.2 param2, byte[] paramArrayOfByte, Camera paramCamera)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(759);
    Object localObject1;
    Object localObject2;
    if (this.mdK.mdJ.mdx)
      if (b.e(this.mdK.mdJ) == 1)
      {
        c.a.btY();
        localObject1 = this.val$data;
        localObject2 = this.val$camera;
        if (YTFaceTraceInterface.isTracing())
          YTFaceTraceInterface.onPreviewFrame((byte[])localObject1, (Camera)localObject2);
        if (YTAGReflectLiveCheckInterface.getProcessState() == 2)
          YTAGReflectLiveCheckInterface.onPreviewFrame((byte[])localObject1, (Camera)localObject2);
        d.bsq().aS((byte[])localObject1);
        AppMethodBeat.o(759);
      }
    while (true)
    {
      return;
      a.b.btO();
      localObject2 = this.val$data;
      localObject1 = this.val$camera;
      if (YTFaceTraceInterface.isTracing())
      {
        YTFaceTraceInterface.onPreviewFrame((byte[])localObject2, (Camera)localObject1);
        AppMethodBeat.o(759);
      }
      else
      {
        if (YTAGReflectLiveCheckInterface.getProcessState() == 2)
          YTAGReflectLiveCheckInterface.onPreviewFrame((byte[])localObject2, (Camera)localObject1);
        AppMethodBeat.o(759);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b.2.1
 * JD-Core Version:    0.6.2
 */