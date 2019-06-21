package com.tencent.mm.compatible.e;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class i
  implements d.a
{
  public static d.a.a a(int paramInt, Looper paramLooper)
  {
    StringBuilder localStringBuilder = null;
    AppMethodBeat.i(92931);
    d.a.a locala = new d.a.a();
    locala.erH = null;
    try
    {
      locala.erH = u.b(paramInt, paramLooper);
      if (locala.erH == null)
      {
        AppMethodBeat.o(92931);
        paramLooper = localStringBuilder;
        return paramLooper;
      }
    }
    catch (Exception paramLooper)
    {
      while (true)
      {
        AppMethodBeat.o(92931);
        paramLooper = localStringBuilder;
      }
      locala.rotate = 0;
      ab.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.hasVRInfo " + q.etc.erb);
      ab.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRFaceRotate " + q.etc.erc);
      ab.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRFaceDisplayOrientation " + q.etc.erd);
      ab.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRBackRotate " + q.etc.ere);
      ab.d("CameraUtilImplConfig", "DeviceInfo.mCameraInfo.mVRBackDisplayOrientation " + q.etc.erf);
      if (getNumberOfCameras() <= 1);
    }
    while (true)
    {
      try
      {
        paramLooper = new android/hardware/Camera$CameraInfo;
        paramLooper.<init>();
        Camera.getCameraInfo(paramInt, paramLooper);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("info.facing ");
        ab.d("CameraUtilImplConfig", paramLooper.facing);
        if (paramLooper.facing == 1)
        {
          if ((q.etc.erb) && (q.etc.erc != -1))
            locala.rotate = q.etc.erc;
          if ((q.etc.erb) && (q.etc.erd != -1))
            locala.erH.setDisplayOrientation(q.etc.erd);
          AppMethodBeat.o(92931);
          paramLooper = locala;
          break;
        }
        if ((q.etc.erb) && (q.etc.ere != -1))
          locala.rotate = q.etc.ere;
        if ((!q.etc.erb) || (q.etc.erf == -1))
          continue;
        locala.erH.setDisplayOrientation(q.etc.erf);
        continue;
      }
      catch (Exception paramLooper)
      {
        ab.printErrStackTrace("CameraUtilImplConfig", paramLooper, "", new Object[0]);
        continue;
      }
      if ((q.etc.erb) && (q.etc.ere != -1))
        locala.rotate = q.etc.ere;
      if ((q.etc.erb) && (q.etc.erf != -1))
        locala.erH.setDisplayOrientation(q.etc.erf);
    }
  }

  public static int getNumberOfCameras()
  {
    AppMethodBeat.i(92930);
    int i;
    if ((q.etc.erh) && (q.etc.erg != -1))
    {
      i = q.etc.erg;
      ab.d("CameraUtilImplConfig", "mVRCameraNum ".concat(String.valueOf(i)));
      AppMethodBeat.o(92930);
    }
    while (true)
    {
      return i;
      i = d.getNumberOfCameras();
      ab.d("CameraUtilImplConfig", "getNumberOfCameras ".concat(String.valueOf(i)));
      if (i > 1)
      {
        AppMethodBeat.o(92930);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(92930);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.i
 * JD-Core Version:    0.6.2
 */