package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.c.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;

public final class j
{
  public static h tbr;
  public static int tbs = -1;
  public static int tbt = -1;
  public static int tbu = 0;
  public static int tbv = 0;
  public static int tbw = 0;
  public static boolean tbx = true;

  public static boolean cLO()
  {
    if ((q.etc.eqT) && (q.etc.eqS == 8));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  private static boolean cLP()
  {
    boolean bool = false;
    AppMethodBeat.i(5112);
    try
    {
      if (Class.forName("android.hardware.Camera").getDeclaredMethod("getNumberOfCameras", null) == null)
        ab.d("GetfcMethod", "GetfcMethod is null");
      while (true)
      {
        AppMethodBeat.o(5112);
        return bool;
        bool = true;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.CameraUtil", "find getNumberOfCameras failed: " + localException.getMessage());
    }
  }

  private static void cLQ()
  {
    AppMethodBeat.i(5114);
    tbr.eqQ = Camera.getNumberOfCameras();
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int i = 0;
    String str;
    try
    {
      if (i < tbr.eqQ)
      {
        Camera.getCameraInfo(i, localCameraInfo);
        if (localCameraInfo.facing == 1)
        {
          tbs = i;
          tbr.tam = localCameraInfo.orientation;
          tbr.tak = true;
        }
        while (true)
        {
          i++;
          break;
          if (localCameraInfo.facing == 0)
          {
            tbt = i;
            tbr.tan = localCameraInfo.orientation;
            tbr.tal = true;
          }
        }
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.CameraUtil", "get camera info error: %s", new Object[] { localException.getMessage() });
      str = System.getProperty("ro.media.enc.camera.platform", null);
      if (str != null)
        break label203;
    }
    boolean bool = false;
    if ((tbr.tam == 270) || ((bool) && (tbr.tam == 0)))
    {
      tbu = 1;
      label167: if ((tbr.tan != 270) && ((!bool) || (tbr.tan != 0)))
        break label220;
      tbv = 1;
      AppMethodBeat.o(5114);
    }
    while (true)
    {
      return;
      label203: bool = str.equalsIgnoreCase("Mediatek");
      break;
      tbu = 0;
      break label167;
      label220: tbv = 0;
      AppMethodBeat.o(5114);
    }
  }

  public static void fi(Context paramContext)
  {
    AppMethodBeat.i(5113);
    if (tbr != null)
      AppMethodBeat.o(5113);
    while (true)
    {
      return;
      tbr = new h("*");
      boolean bool = cLP();
      tbx = bool;
      if ((!bool) || (q.etc.eqR))
        break;
      cLQ();
      if (q.etc.aTf)
        tbw = q.etc.eqW;
      ab.i("MicroMsg.CameraUtil", "gCameraNum:" + tbr.eqQ + "\ngIsHasFrontCamera:" + tbr.tak + "\ngIsHasBackCamera:" + tbr.tal + "\ngFrontCameraId:" + tbs + "\ngBackCameraId:" + tbt + "\ngBackOrientation:" + tbr.tan + "\ngFrontOrientation:" + tbr.tam + "\ngBestFps:" + tbr.taj + "\ngFacePreviewSize:" + tbr.tao + "\ngNonFacePreviewSize:" + tbr.tap + "\ngFaceCameraIsRotate180:" + tbu + "\ngMainCameraIsRotate180:" + tbv + "\ngCameraFormat:" + tbw + "\ngFaceNotRotate:SDK:" + Build.VERSION.SDK_INT + "\n");
      AppMethodBeat.o(5113);
    }
    if ((tbx) && (q.etc.eqR))
      cLQ();
    if (q.etc.eqR)
      tbr.eqQ = q.etc.eqQ;
    if (q.etc.era)
    {
      if (q.etc.eqZ.erD != 0)
        tbr.tal = true;
    }
    else
      label344: if (q.etc.eqY)
        if (q.etc.eqX.erD == 0)
          break label720;
    label720: for (tbr.tak = true; ; tbr.tak = false)
    {
      if ((q.etc.eqY) && (q.etc.eqX.erE >= 0))
      {
        tbr.tam = q.etc.eqX.erE;
        tbu = tbr.tam;
      }
      if ((q.etc.era) && (q.etc.eqZ.erE >= 0))
      {
        tbr.tan = q.etc.eqZ.erE;
        tbv = tbr.tan;
      }
      if (q.etc.eqY)
      {
        if (tbr.tao == null)
          tbr.tao = new Point(0, 0);
        tbr.tao = new Point(q.etc.eqX.width, q.etc.eqX.height);
      }
      if (q.etc.era)
      {
        if (tbr.tap == null)
          tbr.tap = new Point(0, 0);
        tbr.tap = new Point(q.etc.eqZ.width, q.etc.eqZ.height);
      }
      if ((q.etc.era) && (q.etc.eqZ.fps != 0))
        tbr.taj = q.etc.eqZ.fps;
      if ((q.etc.eqY) && (q.etc.eqX.fps != 0))
        tbr.taj = q.etc.eqX.fps;
      paramContext = paramContext.getPackageManager();
      if ((q.etc.eqR) || (paramContext.hasSystemFeature("android.hardware.camera")))
        break;
      tbr.eqQ = 0;
      tbr.tak = false;
      tbr.tal = false;
      break;
      tbr.tal = false;
      break label344;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.j
 * JD-Core Version:    0.6.2
 */