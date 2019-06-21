package com.tencent.mm.compatible.e;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  public static int Lr()
  {
    int i = 0;
    AppMethodBeat.i(92923);
    if (q.etn.esf == 1)
    {
      AppMethodBeat.o(92923);
      return i;
    }
    int j = Camera.getNumberOfCameras();
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    i = 0;
    label38: if (i < j)
    {
      Camera.getCameraInfo(i, localCameraInfo);
      if (localCameraInfo.facing == 0)
        ab.d("MicroMsg.CameraUtil", "tigercam get bid %d", new Object[] { Integer.valueOf(i) });
    }
    while (true)
    {
      ab.d("MicroMsg.CameraUtil", "tigercam getBackCameraId %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(92923);
      break;
      i++;
      break label38;
      i = 0;
    }
  }

  public static int Ls()
  {
    AppMethodBeat.i(92924);
    int i = Camera.getNumberOfCameras();
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int j = 0;
    if (j < i)
    {
      Camera.getCameraInfo(j, localCameraInfo);
      if (localCameraInfo.facing == 1)
        ab.d("MicroMsg.CameraUtil", "tigercam get fid %d", new Object[] { Integer.valueOf(j) });
    }
    while (true)
    {
      ab.d("MicroMsg.CameraUtil", "tigercam getBackCameraId %d", new Object[] { Integer.valueOf(j) });
      AppMethodBeat.o(92924);
      return j;
      j++;
      break;
      j = 0;
    }
  }

  public static boolean Lt()
  {
    boolean bool = true;
    AppMethodBeat.i(92925);
    if (q.etc.erj == 1)
      AppMethodBeat.o(92925);
    while (true)
    {
      return bool;
      if ((Build.VERSION.SDK_INT == 10) && (Build.MODEL.equals("GT-S5360")))
      {
        AppMethodBeat.o(92925);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(92925);
      }
    }
  }

  public static d.a.a a(Context paramContext, int paramInt, Looper paramLooper)
  {
    AppMethodBeat.i(92926);
    if (q.etc.erj == 1)
    {
      ab.d("MicroMsg.CameraUtil", "openCamera(), CameraUtilImpl20, cameraId = ".concat(String.valueOf(paramInt)));
      new e();
      paramContext = e.b(paramLooper);
      AppMethodBeat.o(92926);
    }
    while (true)
    {
      return paramContext;
      if (q.etc.erb)
      {
        ab.d("MicroMsg.CameraUtil", "openCamera(), CameraUtilImplConfig, cameraId = ".concat(String.valueOf(paramInt)));
        new i();
        paramContext = i.a(paramInt, paramLooper);
        AppMethodBeat.o(92926);
      }
      else if (Build.MODEL.equals("M9"))
      {
        new j();
        paramContext = j.b(paramLooper);
        AppMethodBeat.o(92926);
      }
      else if (getNumberOfCameras() > 1)
      {
        ab.d("MicroMsg.CameraUtil", "openCamera(), CameraUtilImpl23, cameraId = ".concat(String.valueOf(paramInt)));
        new g();
        paramContext = g.a(paramContext, paramInt, paramLooper);
        AppMethodBeat.o(92926);
      }
      else
      {
        new f();
        paramContext = f.a(paramInt, paramLooper);
        AppMethodBeat.o(92926);
      }
    }
  }

  public static int getNumberOfCameras()
  {
    AppMethodBeat.i(92922);
    int i;
    if ((q.etc.erb) && (q.etc.erh))
    {
      new i();
      i = i.getNumberOfCameras();
      AppMethodBeat.o(92922);
    }
    while (true)
    {
      return i;
      new g();
      i = Camera.getNumberOfCameras();
      AppMethodBeat.o(92922);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.d
 * JD-Core Version:    0.6.2
 */