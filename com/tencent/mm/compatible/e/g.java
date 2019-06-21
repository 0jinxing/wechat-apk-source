package com.tencent.mm.compatible.e;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class g
  implements d.a
{
  public static d.a.a a(Context paramContext, int paramInt, Looper paramLooper)
  {
    Object localObject = null;
    AppMethodBeat.i(92929);
    d.a.a locala = new d.a.a();
    locala.erH = null;
    long l;
    try
    {
      l = bo.yz();
      ab.i("MicroMsg.CameraUtil", "ashu::begin to try Call Camera.open cameraID %d", new Object[] { Integer.valueOf(paramInt) });
      locala.erH = u.b(paramInt, paramLooper);
      ab.i("MicroMsg.CameraUtil", "ashu::Call Camera.open back, use %dms", new Object[] { Long.valueOf(bo.az(l)) });
      if (locala.erH == null)
      {
        ab.e("MicroMsg.CameraUtil", "open camera error, not exception, but camera null");
        AppMethodBeat.o(92929);
        paramContext = localObject;
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.CameraUtil", "open camera error %s", new Object[] { paramContext.getMessage() });
        ab.printErrStackTrace("MicroMsg.CameraUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(92929);
        paramContext = localObject;
      }
      paramLooper = new Camera.CameraInfo();
      l = bo.yz();
      ab.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.getCameraInfo cameraID %d", new Object[] { Integer.valueOf(paramInt) });
      Camera.getCameraInfo(paramInt, paramLooper);
      ab.i("MicroMsg.CameraUtil", "ashu::Call Camera.getCameraInfo back, use %dms", new Object[] { Long.valueOf(bo.az(l)) });
      switch (((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getRotation())
      {
      default:
        paramInt = 0;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    label250: if (paramLooper.facing == 1);
    for (paramInt = (360 - paramLooper.orientation % 360) % 360; ; paramInt = (paramLooper.orientation - paramInt + 360) % 360)
    {
      l = bo.yz();
      ab.i("MicroMsg.CameraUtil", "ashu::begin to Call Camera.setDisplayOrientation %d", new Object[] { Integer.valueOf(paramInt) });
      locala.erH.setDisplayOrientation(paramInt);
      ab.i("MicroMsg.CameraUtil", "ashu::Call Camera.setDisplayOrientation back, use %dms", new Object[] { Long.valueOf(bo.az(l)) });
      locala.rotate = paramLooper.orientation;
      AppMethodBeat.o(92929);
      paramContext = locala;
      break;
      paramInt = 0;
      break label250;
      paramInt = 90;
      break label250;
      paramInt = 180;
      break label250;
      paramInt = 270;
      break label250;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.g
 * JD-Core Version:    0.6.2
 */