package com.tencent.mm.media.widget.a;

import a.l;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.mmsight.model.b;
import com.tencent.mm.plugin.mmsight.model.p;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "data", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/hardware/Camera;", "onPreviewFrame", "com/tencent/mm/media/widget/camera/CommonCamera1$setPreviewCallbackImpl$1$1"})
final class d$a
  implements Camera.PreviewCallback
{
  d$a(d paramd)
  {
  }

  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(13195);
    int i;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length == 0)
      {
        i = 1;
        if (i == 0)
          break label45;
      }
    }
    else
    {
      ab.e(this.fbo.TAG, "onPreviewFrame, frame data is null!!");
      AppMethodBeat.o(13195);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label45: if (this.fbo.faZ.size() > 0)
        break label95;
      paramCamera = this.fbo.erH;
      if (paramCamera != null)
      {
        paramCamera.addCallbackBuffer(paramArrayOfByte);
        AppMethodBeat.o(13195);
      }
      else
      {
        AppMethodBeat.o(13195);
      }
    }
    label95: paramCamera = paramArrayOfByte;
    Object localObject;
    long l1;
    if (!d.a(this.fbo))
    {
      paramCamera = paramArrayOfByte;
      if (this.fbo.faZ.size() > 0)
      {
        paramCamera = paramArrayOfByte;
        if (this.fbo.fbc != null)
        {
          paramCamera = this.fbo.fbc;
          if ((paramCamera != null) && (paramCamera.x == this.fbo.fav.lZe))
          {
            paramCamera = this.fbo.fbc;
            if ((paramCamera != null) && (paramCamera.y == this.fbo.fav.lZf))
              break label584;
          }
          paramCamera = com.tencent.mm.plugin.mmsight.model.a.j.owk;
          i = this.fbo.fav.lZe;
          localObject = this.fbo.fbc;
          if (localObject == null)
            a.f.b.j.dWJ();
          paramCamera = paramCamera.g(Integer.valueOf(i * ((Point)localObject).y * 3 / 2));
          d.b(this.fbo).jl(1L);
          l1 = bo.yz();
          i = this.fbo.fav.lZe;
          int j = this.fbo.fav.lZf;
          localObject = this.fbo.fbc;
          if (localObject == null)
            a.f.b.j.dWJ();
          SightVideoJNI.cropCameraData(paramArrayOfByte, paramCamera, i, j, ((Point)localObject).y);
          localObject = this.fbo.fbc;
          if (localObject == null)
            a.f.b.j.dWJ();
          if (((Point)localObject).x >= this.fbo.fav.lZe)
            break label654;
          localObject = com.tencent.mm.plugin.mmsight.model.a.j.owk;
          Point localPoint = this.fbo.fbc;
          if (localPoint == null)
            a.f.b.j.dWJ();
          i = localPoint.x;
          localPoint = this.fbo.fbc;
          if (localPoint == null)
            a.f.b.j.dWJ();
          localObject = ((com.tencent.mm.plugin.mmsight.model.a.j)localObject).g(Integer.valueOf(i * localPoint.y * 3 / 2));
          j = this.fbo.fav.lZe;
          localPoint = this.fbo.fbc;
          if (localPoint == null)
            a.f.b.j.dWJ();
          i = localPoint.x;
          localPoint = this.fbo.fbc;
          if (localPoint == null)
            a.f.b.j.dWJ();
          SightVideoJNI.cropCameraDataLongEdge(paramCamera, (byte[])localObject, j, i, localPoint.y);
          com.tencent.mm.plugin.mmsight.model.a.j.owk.g(paramCamera);
          paramCamera = (Camera)localObject;
        }
      }
    }
    label645: label654: 
    while (true)
    {
      long l2 = bo.az(l1);
      d.c(this.fbo).jl(l2);
      localObject = this.fbo;
      a.f.b.j.o(paramCamera, "curFrameData");
      boolean bool = d.a((d)localObject, paramCamera);
      l2 = bo.az(l1);
      paramCamera = paramArrayOfByte;
      if (bool)
      {
        d.d(this.fbo).jl(l2);
        paramCamera = paramArrayOfByte;
      }
      while (true)
      {
        paramArrayOfByte = this.fbo.erH;
        if (paramArrayOfByte == null)
          break label645;
        paramArrayOfByte.addCallbackBuffer(paramCamera);
        AppMethodBeat.o(13195);
        break;
        label584: l2 = bo.yz();
        bool = d.a(this.fbo, paramArrayOfByte);
        l2 = bo.az(l2);
        if (bool)
          d.d(this.fbo).jl(l2);
        paramCamera = paramArrayOfByte;
        if (bool)
          paramCamera = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(paramArrayOfByte.length));
      }
      AppMethodBeat.o(13195);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.d.a
 * JD-Core Version:    0.6.2
 */