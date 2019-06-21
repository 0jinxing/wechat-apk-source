package com.tencent.mm.compatible.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class f
  implements d.a
{
  @TargetApi(8)
  public static d.a.a a(int paramInt, Looper paramLooper)
  {
    Object localObject = null;
    AppMethodBeat.i(92928);
    d.a.a locala = new d.a.a();
    try
    {
      locala.erH = u.c(paramLooper);
      locala.rotate = 90;
      if (locala.erH == null)
      {
        AppMethodBeat.o(92928);
        paramLooper = localObject;
        return paramLooper;
      }
    }
    catch (Exception paramLooper)
    {
      while (true)
      {
        AppMethodBeat.o(92928);
        paramLooper = localObject;
      }
      paramLooper = new Camera.CameraInfo();
      Camera.getCameraInfo(paramInt, paramLooper);
      switch (((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay().getRotation())
      {
      default:
        paramInt = 0;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    label122: if (paramLooper.facing == 1);
    for (int i = (360 - (paramLooper.orientation + paramInt) % 360) % 360; ; i = (paramLooper.orientation - paramInt + 360) % 360)
    {
      ab.d("MicroMsg.CameraUtil.CameraUtilImpl22", "CameraUtilImpl22, open camera, info.orientation: %d, degrees: %d, result:%d", new Object[] { Integer.valueOf(paramLooper.orientation), Integer.valueOf(paramInt), Integer.valueOf(i) });
      locala.erH.setDisplayOrientation(i);
      AppMethodBeat.o(92928);
      paramLooper = locala;
      break;
      paramInt = 0;
      break label122;
      paramInt = 90;
      break label122;
      paramInt = 180;
      break label122;
      paramInt = 270;
      break label122;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.f
 * JD-Core Version:    0.6.2
 */