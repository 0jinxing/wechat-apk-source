package com.tencent.mm.plugin.facedetect.model;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class n
{
  private Context context;
  public t erH;
  private boolean isFrontCamera = true;
  public boolean lUE = false;
  public Point lUF = null;
  public Point lUG = null;
  private Point lUH = null;
  private boolean lUI;
  public int lUJ;
  private boolean lUK = false;
  public boolean lUL = false;
  public Point lUM = null;

  public n(Context paramContext)
  {
    this.context = paramContext;
  }

  private static Point a(Camera.Parameters paramParameters, Point paramPoint)
  {
    AppMethodBeat.i(257);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new n.a((byte)0));
    Point localPoint = null;
    float f1 = paramPoint.x / paramPoint.y;
    ab.d("MicroMsg.FaceScanCamera", "screen.x: %d, screen.y: %d, ratio: %f", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f1) });
    long l = bo.gO(ah.getContext());
    ab.d("MicroMsg.FaceScanCamera", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(l) });
    int i = paramPoint.x;
    i = paramPoint.y;
    float f2 = (1.0F / 1.0F);
    localObject = ((List)localObject).iterator();
    int j;
    label235: float f3;
    while (((Iterator)localObject).hasNext())
    {
      Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
      j = localSize.width;
      i = localSize.height;
      ab.i("MicroMsg.FaceScanCamera", "realWidth: %d, realHeight: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      int k = j * i;
      if ((k >= 150400) && (k <= 983040))
      {
        if (j > i)
        {
          m = 1;
          if (m == 0)
            break label341;
          k = i;
          if (m == 0)
            break label348;
        }
        label341: label348: for (int m = j; ; m = i)
        {
          ab.d("MicroMsg.FaceScanCamera", "maybeFlippedWidth: %d, maybeFlippedHeight: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
          if ((k != paramPoint.x) || (m != paramPoint.y) || (!f(k, m, l)))
            break label355;
          paramPoint = new Point(j, i);
          ab.i("MicroMsg.FaceScanCamera", "Found preview size exactly matching screen size: ".concat(String.valueOf(paramPoint)));
          AppMethodBeat.o(257);
          return paramPoint;
          m = 0;
          break;
          k = j;
          break label235;
        }
        label355: f3 = Math.abs(k / m - f1);
        if ((f3 >= f2) || (!f(j, i, l)))
          break label532;
        localPoint = new Point(j, i);
        f2 = f3;
      }
    }
    label520: label532: 
    while (true)
    {
      ab.i("MicroMsg.FaceScanCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", new Object[] { Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(j), Integer.valueOf(i) });
      break;
      paramPoint = localPoint;
      if (localPoint == null)
      {
        paramParameters = paramParameters.getPreviewSize();
        if (paramParameters == null)
          break label520;
        paramPoint = new Point(paramParameters.width, paramParameters.height);
        ab.i("MicroMsg.FaceScanCamera", "No suitable preview sizes, using default: ".concat(String.valueOf(paramPoint)));
      }
      while (true)
      {
        ab.i("MicroMsg.FaceScanCamera", "Found best approximate preview size: ".concat(String.valueOf(paramPoint)));
        AppMethodBeat.o(257);
        break;
        ab.e("MicroMsg.FaceScanCamera", "hy: can not find default size!!");
        paramPoint = localPoint;
      }
    }
  }

  private static boolean f(int paramInt1, int paramInt2, long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(258);
    double d = paramInt1 * paramInt2 * 3.0D / 2.0D / 1024.0D / 1024.0D;
    ab.d("MicroMsg.FaceScanCamera", "dataSizeInMB: %f, availableMemInMb: %d", new Object[] { Double.valueOf(d), Long.valueOf(paramLong) });
    if (paramLong / d >= 5.0D)
      AppMethodBeat.o(258);
    while (true)
    {
      return bool;
      AppMethodBeat.o(258);
      bool = false;
    }
  }

  public final void f(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(253);
    if (this.lUE)
    {
      ab.w("MicroMsg.FaceScanCamera", "in open(), previewing");
      release();
    }
    this.isFrontCamera = true;
    int i = Camera.getNumberOfCameras();
    int j = 0;
    Object localObject;
    if (j < i)
    {
      localObject = new Camera.CameraInfo();
      Camera.getCameraInfo(j, (Camera.CameraInfo)localObject);
      if ((((Camera.CameraInfo)localObject).facing == 1) && (this.isFrontCamera))
        ab.d("MicroMsg.FaceScanCamera", "hy: front Camera found");
    }
    while (true)
    {
      long l = bo.yz();
      localObject = d.a(this.context, j, null);
      if (localObject == null)
      {
        ab.e("MicroMsg.FaceScanCamera", "in open(), openCameraRes == null");
        paramSurfaceTexture = new IOException();
        AppMethodBeat.o(253);
        throw paramSurfaceTexture;
        if ((((Camera.CameraInfo)localObject).facing == 0) && (!this.isFrontCamera))
        {
          ab.d("MicroMsg.FaceScanCamera", "hy: front Camera found");
          continue;
        }
        j++;
        break;
      }
      this.lUL = true;
      ab.d("MicroMsg.FaceScanCamera", "openCamera done, cameraId=[%s] costTime=[%s]", new Object[] { Integer.valueOf(j), Long.valueOf(bo.az(l)) });
      this.lUJ = ((d.a.a)localObject).rotate;
      if (((d.a.a)localObject).rotate % 180 != 0);
      for (boolean bool = true; ; bool = false)
      {
        this.lUI = bool;
        this.erH = ((d.a.a)localObject).erH;
        if (this.erH != null)
          break;
        ab.e("MicroMsg.FaceScanCamera", "in open(), camera == null, bNeedRotate=[%s]", new Object[] { Boolean.valueOf(this.lUI) });
        paramSurfaceTexture = new IOException();
        AppMethodBeat.o(253);
        throw paramSurfaceTexture;
      }
      this.erH.setPreviewTexture(paramSurfaceTexture);
      Camera.Parameters localParameters = this.erH.getParameters();
      Point localPoint1 = this.lUG;
      Point localPoint2 = this.lUH;
      localObject = localParameters.get("preview-size-values");
      if (localObject == null)
        localObject = localParameters.get("preview-size-value");
      while (true)
      {
        paramSurfaceTexture = null;
        if (localObject != null)
        {
          ab.d("MicroMsg.FaceScanCamera", "preview-size-values parameter: ".concat(String.valueOf(localObject)));
          paramSurfaceTexture = a(localParameters, localPoint1);
        }
        localObject = paramSurfaceTexture;
        if (paramSurfaceTexture == null)
          localObject = new Point(localPoint2.x >> 3 << 3, localPoint2.y >> 3 << 3);
        this.lUF = ((Point)localObject);
        this.lUM = new Point(this.lUF);
        ab.d("MicroMsg.FaceScanCamera", "getCameraResolution: " + this.lUG + " camera:" + this.lUF + "bestVideoEncodeSize: " + this.lUM);
        localParameters.setPreviewSize(this.lUF.x, this.lUF.y);
        localParameters.setZoom(0);
        localParameters.setSceneMode("auto");
        try
        {
          if ((localParameters.getSupportedFocusModes() != null) && (localParameters.getSupportedFocusModes().contains("auto")))
          {
            ab.i("MicroMsg.FaceScanCamera", "set FocusMode to FOCUS_MODE_AUTO");
            localParameters.setFocusMode("auto");
          }
          while (true)
          {
            localObject = localParameters.getSupportedPreviewFormats();
            paramSurfaceTexture = ((List)localObject).iterator();
            j = 0;
            if (!paramSurfaceTexture.hasNext())
              break label762;
            i = ((Integer)paramSurfaceTexture.next()).intValue();
            ab.d("MicroMsg.FaceScanCamera", "supportedPreviewFormat: ".concat(String.valueOf(i)));
            if (i != 17)
              break;
            i = 1;
            label605: if (i == 0)
              break label694;
            localParameters.setPreviewFormat(17);
            label616: if (this.lUI)
              localParameters.setRotation(this.lUJ);
            this.erH.setParameters(localParameters);
            AppMethodBeat.o(253);
            return;
            ab.i("MicroMsg.FaceScanCamera", "camera not support FOCUS_MODE_AUTO");
          }
        }
        catch (Exception paramSurfaceTexture)
        {
          while (true)
            ab.e("MicroMsg.FaceScanCamera", "set focus mode error: %s", new Object[] { paramSurfaceTexture.getMessage() });
          if (i == 842094169)
            j = 1;
          while (true)
          {
            break;
            label694: if (j != 0)
            {
              ab.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
              localParameters.setPreviewFormat(842094169);
              break label616;
            }
            ab.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", new Object[] { ((List)localObject).get(0) });
            localParameters.setPreviewFormat(((Integer)((List)localObject).get(0)).intValue());
            break label616;
            label762: i = 0;
            break label605;
          }
        }
      }
      j = -1;
    }
  }

  public final int getPreviewHeight()
  {
    AppMethodBeat.i(256);
    ab.v("MicroMsg.FaceScanCamera", "hy: preview height: %d", new Object[] { Integer.valueOf(this.lUF.y) });
    int i = this.lUF.y;
    AppMethodBeat.o(256);
    return i;
  }

  public final int getPreviewWidth()
  {
    AppMethodBeat.i(255);
    ab.v("MicroMsg.FaceScanCamera", "hy: preview width: %d", new Object[] { Integer.valueOf(this.lUF.x) });
    int i = this.lUF.x;
    AppMethodBeat.o(255);
    return i;
  }

  public final void release()
  {
    AppMethodBeat.i(254);
    ab.d("MicroMsg.FaceScanCamera", "release(), previewing = [%s]", new Object[] { Boolean.valueOf(this.lUE) });
    if (this.erH != null)
    {
      long l = bo.yz();
      if (this.lUE)
      {
        this.erH.setPreviewCallback(null);
        this.erH.stopPreview();
        this.lUE = false;
        ab.d("MicroMsg.FaceScanCamera", "stopPreview costTime=[%s]", new Object[] { Long.valueOf(bo.az(l)) });
      }
      l = bo.yz();
      this.erH.release();
      this.erH = null;
      this.lUL = false;
      ab.d("MicroMsg.FaceScanCamera", "camera.release() costTime=[%s]", new Object[] { Long.valueOf(bo.az(l)) });
    }
    this.lUK = false;
    AppMethodBeat.o(254);
  }

  public final void setPreviewCallback(Camera.PreviewCallback paramPreviewCallback)
  {
    AppMethodBeat.i(259);
    if (this.erH == null)
    {
      ab.w("MicroMsg.FaceScanCamera", "hy: camera is null. setPreviewCallback failed");
      AppMethodBeat.o(259);
    }
    while (true)
    {
      return;
      try
      {
        int i = getPreviewWidth() * getPreviewHeight() * ImageFormat.getBitsPerPixel(this.erH.getParameters().getPreviewFormat()) / 8;
        Object localObject = c.lTA.g(Integer.valueOf(i));
        this.erH.addCallbackBuffer((byte[])localObject);
        t localt = this.erH;
        localObject = new com/tencent/mm/plugin/facedetect/model/n$1;
        ((n.1)localObject).<init>(this, paramPreviewCallback);
        localt.setPreviewCallbackWithBuffer((Camera.PreviewCallback)localObject);
        AppMethodBeat.o(259);
      }
      catch (Exception paramPreviewCallback)
      {
        ab.printErrStackTrace("MicroMsg.FaceScanCamera", paramPreviewCallback, "setPreviewCallback error: %s", new Object[] { paramPreviewCallback.getMessage() });
        AppMethodBeat.o(259);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.n
 * JD-Core Version:    0.6.2
 */