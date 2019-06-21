package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.facedetect.model.c;
import com.tencent.mm.plugin.facedetect.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class b$4
  implements Runnable
{
  b$4(b paramb, SurfaceTexture paramSurfaceTexture)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(763);
    try
    {
      b.a(this.mdJ, this.mdM);
      b localb = this.mdJ;
      Camera.PreviewCallback localPreviewCallback = b.v(this.mdJ);
      if (localb.mdw == null)
      {
        ab.w("MicroMsg.FaceReflectCam", "hy: camera is null. setPreviewCallback failed");
        AppMethodBeat.o(763);
      }
      while (true)
      {
        return;
        int i = localb.mDesiredPreviewWidth * localb.mDesiredPreviewHeight * ImageFormat.getBitsPerPixel(localb.mdw.getParameters().getPreviewFormat()) / 8;
        for (int j = 0; j < 5; j++)
        {
          localObject = c.lTA.g(Integer.valueOf(i));
          localb.mdw.addCallbackBuffer((byte[])localObject);
        }
        t localt = localb.mdw;
        Object localObject = new com/tencent/mm/plugin/facedetectlight/ui/b$9;
        ((b.9)localObject).<init>(localb, localPreviewCallback);
        localt.setPreviewCallbackWithBuffer((Camera.PreviewCallback)localObject);
        d.bsq().a(localb.mao);
        AppMethodBeat.o(763);
      }
    }
    catch (Exception localException)
    {
      while (true)
        if (b.e(this.mdJ) == 1)
        {
          b.g(this.mdJ).u(90016, "preview error", ah.getContext().getString(2131303873));
          AppMethodBeat.o(763);
        }
        else
        {
          ab.i("MicroMsg.FaceReflectCam", "preview error");
          AppMethodBeat.o(763);
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b.4
 * JD-Core Version:    0.6.2
 */