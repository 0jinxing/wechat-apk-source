package com.tencent.mm.media.widget.a;

import a.l;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.g;
import com.tencent.mm.plugin.mmsight.model.g.b;
import com.tencent.mm.plugin.mmsight.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camera/CommonCamera1;", "Lcom/tencent/mm/media/widget/camera/BaseCommonCamera;", "context", "Landroid/content/Context;", "useBack", "", "(Landroid/content/Context;Z)V", "DEFAULT_UPPER_BOUND", "", "SMALL_ZOOM_STEP_NUM", "getSMALL_ZOOM_STEP_NUM", "()I", "SMALL_ZOOM_STEP_UPPER_BOUND", "getSMALL_ZOOM_STEP_UPPER_BOUND", "camera", "Lcom/tencent/mm/compatible/deviceinfo/MCamera;", "getCamera", "()Lcom/tencent/mm/compatible/deviceinfo/MCamera;", "setCamera", "(Lcom/tencent/mm/compatible/deviceinfo/MCamera;)V", "cameraCallback", "Lcom/tencent/mm/plugin/mmsight/model/CounterUtil;", "cameraCropCallback", "cameraPreviewCallback", "cropSize", "Landroid/graphics/Point;", "getCropSize", "()Landroid/graphics/Point;", "setCropSize", "(Landroid/graphics/Point;)V", "currentFrameData", "", "finishCallbackTimeCallback", "frameDataCallbackList", "", "Lcom/tencent/mm/plugin/mmsight/model/MMSightCameraFrameDataCallback;", "getFrameDataCallbackList", "()Ljava/util/List;", "setFrameDataCallbackList", "(Ljava/util/List;)V", "isCameraOpen", "isZooming", "()Z", "setZooming", "(Z)V", "lock", "Ljava/lang/Object;", "openCameraRes", "Lcom/tencent/mm/compatible/deviceinfo/CameraUtil$IImpl$OpenCameraRes;", "getOpenCameraRes", "()Lcom/tencent/mm/compatible/deviceinfo/CameraUtil$IImpl$OpenCameraRes;", "setOpenCameraRes", "(Lcom/tencent/mm/compatible/deviceinfo/CameraUtil$IImpl$OpenCameraRes;)V", "prevcameraCallback", "scrollSmallZoomStep", "getScrollSmallZoomStep", "setScrollSmallZoomStep", "(I)V", "sightHandler", "Lcom/tencent/mm/media/widget/camera/CameraHandler;", "getSightHandler", "()Lcom/tencent/mm/media/widget/camera/CameraHandler;", "smallZoomStep", "getSmallZoomStep", "setSmallZoomStep", "takePictureLock", "addFrameDataCallback", "", "callback", "calcScrollZoomStep", "recordButtonTopLocation", "stepInterval", "dispatchCameraFrame", "frame", "doStartPreview", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "surface", "Landroid/view/SurfaceHolder;", "generateCameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "getOrientation", "getPreviewHeight", "getPreviewWidth", "initCamera", "postFocusOnTouch", "x", "", "y", "surfaceWidth", "surfaceHeight", "delay", "", "release", "removeFocusOnTouch", "removeFrameDataCallback", "safeResetZoom", "safeSetFocusMode", "safeSetMetering", "safeSetPreviewFormat", "safeSetPreviewFrameRate", "useFixMode", "safeSetPreviewSize", "resolutionLimit", "safeSetStabilization", "selectNoCropPreviewSize", "setPreviewCallbackImpl", "setSafeConfig", "startPreview", "useCpuCrop", "startPreviewWithCPU", "startPreviewWithGPU", "triggerCameraZoom", "zoom", "isScrollZoom", "factor", "trySetPreviewFpsRangeParameters", "p", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "trySetPreviewFrameRateParameters", "plugin-mediaeditor_release"})
public final class d extends a
{
  private boolean aJI;
  t erH;
  private final int faX;
  private final int faY;
  List<com.tencent.mm.plugin.mmsight.model.f> faZ;
  private final c fba;
  private d.a.a fbb;
  Point fbc;
  private int fbd;
  private int fbe;
  private final com.tencent.mm.plugin.mmsight.model.b fbf;
  private final com.tencent.mm.plugin.mmsight.model.b fbg;
  private final com.tencent.mm.plugin.mmsight.model.b fbh;
  private final com.tencent.mm.plugin.mmsight.model.b fbi;
  private final com.tencent.mm.plugin.mmsight.model.b fbj;
  private volatile boolean fbk;
  private volatile byte[] fbl;
  private boolean fbm;
  private final int fbn;
  private final Object lock;

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(13222);
    this.faX = 20;
    this.faY = 5;
    this.faZ = ((List)new ArrayList());
    paramContext = Looper.getMainLooper();
    a.f.b.j.o(paramContext, "Looper.getMainLooper()");
    this.fba = new c(paramContext);
    this.fbd = -1;
    this.fbe = -1;
    this.fbf = new com.tencent.mm.plugin.mmsight.model.b("prevcameraCallback");
    this.fbg = new com.tencent.mm.plugin.mmsight.model.b("cameraCallback");
    this.fbh = new com.tencent.mm.plugin.mmsight.model.b("cameraPreviewCallback");
    this.fbi = new com.tencent.mm.plugin.mmsight.model.b("cameraCropCallback");
    this.fbj = new com.tencent.mm.plugin.mmsight.model.b("finishCallbackTimeCallback");
    this.fbn = 2100;
    this.lock = new Object();
    AppMethodBeat.o(13222);
  }

  private final boolean N(byte[] paramArrayOfByte)
  {
    boolean bool1 = false;
    AppMethodBeat.i(13220);
    bo.yz();
    synchronized (this.lock)
    {
      if (this.faZ != null)
      {
        int i = this.faZ.size();
        if (i != 0);
      }
      else
      {
        AppMethodBeat.o(13220);
        return bool1;
      }
      Iterator localIterator = this.faZ.iterator();
      bool1 = false;
      while (localIterator.hasNext())
      {
        boolean bool2 = ((com.tencent.mm.plugin.mmsight.model.f)localIterator.next()).O(paramArrayOfByte);
        bool1 |= bool2;
      }
      AppMethodBeat.o(13220);
    }
  }

  private final void Wo()
  {
    AppMethodBeat.i(13204);
    Integer localInteger = Integer.valueOf(0);
    Object localObject = com.tencent.mm.plugin.mmsight.model.a.k.bPR();
    a.f.b.j.o(localObject, "MMSightController.getInstance()");
    if (((com.tencent.mm.plugin.mmsight.model.a.k)localObject).bPS() != null)
    {
      localObject = com.tencent.mm.plugin.mmsight.model.a.k.bPR();
      a.f.b.j.o(localObject, "MMSightController.getInstance()");
      localInteger = Integer.valueOf(((com.tencent.mm.plugin.mmsight.model.a.k)localObject).bPS().osS);
    }
    String str = this.TAG;
    boolean bool1;
    label83: boolean bool2;
    label96: boolean bool3;
    label109: boolean bool4;
    if (q.etc.ern == 1)
    {
      localObject = "Range";
      if (q.etc.ero != 1)
        break label371;
      bool1 = true;
      if (q.etc.erp != 1)
        break label377;
      bool2 = true;
      if (q.etc.erq != 1)
        break label383;
      bool3 = true;
      if (q.etc.err != 1)
        break label389;
      bool4 = true;
      label122: ab.i(str, "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", new Object[] { localInteger, localObject, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
      if ((q.etc.ern != 1) || ((localInteger.intValue() != 0) && (localInteger.intValue() != 1)))
        break label395;
      a(this.erH, false);
    }
    while (true)
    {
      if ((q.etc.ero == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 2)))
        b(this.erH);
      if ((q.etj.etH != -1) && (q.etj.etH == 1) && (com.tencent.mm.compatible.util.d.iX(14)))
        c(this.erH);
      if ((q.etc.erq == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 4)))
        a(this.erH);
      if ((q.etc.err == 1) && (localInteger.intValue() != 0))
        localInteger.intValue();
      Wr();
      AppMethodBeat.o(13204);
      return;
      if (q.etc.erm == 1)
      {
        localObject = "Fix";
        break;
      }
      localObject = "Error";
      break;
      label371: bool1 = false;
      break label83;
      label377: bool2 = false;
      break label96;
      label383: bool3 = false;
      break label109;
      label389: bool4 = false;
      break label122;
      label395: if ((q.etc.erm == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 5)))
        a(this.erH, true);
    }
  }

  private void Wr()
  {
    AppMethodBeat.i(13214);
    try
    {
      Object localObject = this.erH;
      if (localObject != null)
      {
        localObject = ((t)localObject).getParameters();
        if ((localObject != null) && (((Camera.Parameters)localObject).isZoomSupported() == true))
          ((Camera.Parameters)localObject).setZoom(0);
        t localt = this.erH;
        if (localt == null)
          break label63;
        localt.setParameters((Camera.Parameters)localObject);
        AppMethodBeat.o(13214);
      }
      while (true)
      {
        return;
        localObject = null;
        break;
        label63: AppMethodBeat.o(13214);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e(this.TAG, "safeResetZoom error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(13214);
      }
    }
  }

  private final void Ws()
  {
    AppMethodBeat.i(13217);
    if (this.erH == null)
      AppMethodBeat.o(13217);
    while (true)
    {
      return;
      try
      {
        if (this.erH == null)
          break label247;
        Object localObject1 = this.erH;
        if (localObject1 != null)
        {
          localObject1 = ((t)localObject1).getParameters();
          if (localObject1 != null)
            break label85;
        }
        AppMethodBeat.o(13217);
      }
      catch (Exception localException)
      {
        ab.e(this.TAG, "setPreviewCallbackImpl error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(13217);
      }
      continue;
      label85: int i = this.fav.lZe;
      int j = this.fav.lZf;
      j = ImageFormat.getBitsPerPixel(localException.getPreviewFormat()) * (i * j) / 8;
      ab.i(this.TAG, "setPreviewCallbackImpl  size: ".concat(String.valueOf(j)));
      Object localObject2;
      for (i = 0; i < 5; i++)
      {
        localObject2 = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(j));
        localt = this.erH;
        if (localt != null)
          localt.addCallbackBuffer((byte[])localObject2);
      }
      this.fbf.reset();
      this.fbg.reset();
      this.fbh.reset();
      this.fbi.reset();
      this.fbj.reset();
      t localt = this.erH;
      if (localt != null)
      {
        localObject2 = new com/tencent/mm/media/widget/a/d$a;
        ((d.a)localObject2).<init>(this);
        localt.setPreviewCallbackWithBuffer((Camera.PreviewCallback)localObject2);
        AppMethodBeat.o(13217);
      }
      else
      {
        label247: AppMethodBeat.o(13217);
      }
    }
  }

  private final void a(SurfaceTexture paramSurfaceTexture, SurfaceHolder paramSurfaceHolder, int paramInt)
  {
    AppMethodBeat.i(13201);
    long l = bo.yz();
    ab.i(this.TAG, "start startPreviewWithCPU,Looper.myLooper(): " + Looper.myLooper() + ",surfaceTexture:" + paramSurfaceTexture + ", surface:" + paramSurfaceHolder);
    if (Wh())
    {
      ab.i(this.TAG, "startPreviewWithCPU, camera previewing");
      AppMethodBeat.o(13201);
    }
    while (true)
    {
      return;
      try
      {
        kk(paramInt);
        Wo();
        Ws();
        if (a(paramSurfaceTexture, paramSurfaceHolder))
          a(a.a.faA);
        ab.i(this.TAG, "start preview end, use %dms %s", new Object[] { Long.valueOf(bo.az(l)), Looper.myLooper() });
        AppMethodBeat.o(13201);
      }
      catch (Exception paramSurfaceTexture)
      {
        while (true)
        {
          ab.e(this.TAG, "start preview FAILED, %s, %s", new Object[] { Looper.myLooper(), paramSurfaceTexture.getMessage() });
          paramSurfaceTexture = com.tencent.mm.media.i.c.faj;
          com.tencent.mm.media.i.c.Vm();
        }
      }
    }
  }

  private final boolean a(SurfaceTexture paramSurfaceTexture, SurfaceHolder paramSurfaceHolder)
  {
    boolean bool = false;
    AppMethodBeat.i(13203);
    t localt = this.erH;
    if (localt != null)
      if ((paramSurfaceTexture != null) || (paramSurfaceHolder != null))
        if (paramSurfaceTexture != null)
        {
          localt.setPreviewTexture(paramSurfaceTexture);
          localt.startPreview();
          ab.i(this.TAG, "doStartPreview finish");
          paramSurfaceTexture = com.tencent.mm.media.i.c.faj;
          com.tencent.mm.media.i.c.Vl();
          bool = true;
          AppMethodBeat.o(13203);
        }
    while (true)
    {
      return bool;
      localt.setPreviewDisplay(paramSurfaceHolder);
      break;
      ab.i(this.TAG, "doStartPreview error, surfaceTexture and surface is null");
      paramSurfaceTexture = com.tencent.mm.media.i.c.faj;
      com.tencent.mm.media.i.c.Vm();
      AppMethodBeat.o(13203);
      continue;
      AppMethodBeat.o(13203);
    }
  }

  private boolean a(t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(13213);
    if (paramt == null)
    {
      AppMethodBeat.o(13213);
      return bool;
    }
    while (true)
    {
      Camera.Parameters localParameters;
      List localList;
      try
      {
        localParameters = paramt.getParameters();
        a.f.b.j.o(localParameters, "p");
        localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("continuous-picture")))
        {
          ab.i(this.TAG, "support continuous picture");
          localParameters.setFocusMode("continuous-picture");
          paramt.setParameters(localParameters);
          AppMethodBeat.o(13213);
          bool = true;
          break;
        }
        if ((localList == null) || (!localList.contains("continuous-video")))
          break label164;
        ab.i(this.TAG, "support continuous video");
        localParameters.setFocusMode("continuous-video");
        continue;
      }
      catch (Exception paramt)
      {
        ab.i(this.TAG, "setFocusMode Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
        AppMethodBeat.o(13213);
      }
      break;
      label164: if ((localList != null) && (localList.contains("auto")))
      {
        ab.i(this.TAG, "support auto focus");
        localParameters.setFocusMode("auto");
      }
      else
      {
        ab.i(this.TAG, "not support continuous video or auto focus");
      }
    }
  }

  private final boolean a(t paramt, boolean paramBoolean)
  {
    AppMethodBeat.i(13212);
    if (paramt == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(13212);
      return paramBoolean;
    }
    Camera.Parameters localParameters;
    label159: label306: List localList;
    label277: 
    do
    {
      while (true)
      {
        Object localObject;
        try
        {
          localParameters = paramt.getParameters();
          if (!paramBoolean)
            break label277;
          if (q.etc.eri > 0)
          {
            ab.i(this.fao, "set frame rate > 0, do not try set preview frame rate");
            a.f.b.j.o(localParameters, "p");
            localObject = localParameters.getSupportedPreviewFrameRates();
            ab.i(this.fao, "use fix mode %B, supported preview frame rates %s", new Object[] { Boolean.valueOf(paramBoolean), localObject });
            paramt.setParameters(localParameters);
            paramBoolean = true;
            AppMethodBeat.o(13212);
            break;
          }
          if (localParameters != null)
            break label159;
          ab.e(this.TAG, "trySetPreviewFrameRateParameters error, p is null!");
          continue;
        }
        catch (Exception paramt)
        {
          ab.i(this.fao, "setPreviewFrameRate Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
          paramBoolean = false;
          AppMethodBeat.o(13212);
        }
        break;
        try
        {
          localObject = localParameters.getSupportedPreviewFrameRates();
          if ((localObject == null) || (((List)localObject).size() <= 0))
            continue;
          localObject = Collections.max((Collection)localObject);
          a.f.b.j.o(localObject, "Collections.max(fr)");
          i = Math.min(30, ((Number)localObject).intValue());
          localParameters.setPreviewFrameRate(i);
          ab.i(this.fao, "set preview frame rate %d", new Object[] { Integer.valueOf(i) });
        }
        catch (Exception localException1)
        {
          ab.i(this.fao, "trySetPreviewFrameRateParameters Exception, %s, %s", new Object[] { Looper.myLooper(), localException1.getMessage() });
        }
        continue;
        a.f.b.j.o(localParameters, "p");
        if (q.etc.eri <= 0)
          break label306;
        ab.i(this.fao, "set frame rate > 0, do not try set preview fps range");
      }
      localList = localParameters.getSupportedPreviewFpsRange();
    }
    while ((localList == null) || (localList.size() == 0));
    int j = -2147483648;
    int k = -2147483648;
    int i = 0;
    int m = localList.size();
    int n = 0;
    label352: int[] arrayOfInt;
    if (n < m)
    {
      arrayOfInt = (int[])localList.get(n);
      if ((arrayOfInt != null) && (arrayOfInt.length > 1));
    }
    while (true)
    {
      int i3;
      int i4;
      while (true)
      {
        n++;
        break label352;
        int i1 = arrayOfInt[0];
        int i2 = arrayOfInt[1];
        ab.i(this.TAG, "dkfps %d:[%d %d]", new Object[] { Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2) });
        if ((i1 < 0) || (i2 >= i1))
        {
          i3 = k;
          i4 = j;
          if (i2 >= k)
          {
            i3 = k;
            i4 = j;
            if (i == 0)
            {
              i3 = i2;
              i4 = i1;
            }
          }
          if (i2 < 30000)
            break label642;
          i = 1;
          k = i3;
          j = i4;
          continue;
          ab.i(this.fao, "dkfps get fit  [%d %d], max target fps %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(30) });
          if ((j == 2147483647) || (k == 2147483647))
            break;
          try
          {
            localParameters.setPreviewFpsRange(j, k);
            ab.i(this.fao, "set fps range %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
          }
          catch (Exception localException2)
          {
            ab.i(this.fao, "trySetPreviewFpsRangeParameters Exception, %s, %s", new Object[] { Looper.myLooper(), localException2.getMessage() });
          }
        }
      }
      break;
      label642: k = i3;
      j = i4;
    }
  }

  private final void b(SurfaceTexture paramSurfaceTexture, SurfaceHolder paramSurfaceHolder, int paramInt)
  {
    AppMethodBeat.i(13202);
    long l = bo.yz();
    ab.i(this.TAG, "start startPreviewWithGPU,Looper.myLooper(): " + Looper.myLooper() + "  ,surfaceTexture:" + paramSurfaceTexture + ", surface:" + paramSurfaceHolder);
    if (Wh())
    {
      ab.i(this.TAG, "startPreviewWithGPU, camera previewing");
      AppMethodBeat.o(13202);
    }
    while (true)
    {
      return;
      try
      {
        kl(paramInt);
        Wo();
        if (a(paramSurfaceTexture, paramSurfaceHolder))
          a(a.a.faA);
        ab.i(this.TAG, "start preview end, use %dms %s", new Object[] { Long.valueOf(bo.az(l)), Looper.myLooper() });
        AppMethodBeat.o(13202);
      }
      catch (Exception paramSurfaceTexture)
      {
        while (true)
        {
          ab.e(this.TAG, "start preview FAILED, %s, %s", new Object[] { Looper.myLooper(), paramSurfaceTexture.getMessage() });
          paramSurfaceTexture = com.tencent.mm.media.i.c.faj;
          com.tencent.mm.media.i.c.Vm();
        }
      }
    }
  }

  private boolean b(t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(13215);
    if (paramt == null)
      AppMethodBeat.o(13215);
    while (true)
    {
      return bool;
      try
      {
        ab.i(this.TAG, "safeSetPreviewFormat");
        Camera.Parameters localParameters = paramt.getParameters();
        a.f.b.j.o(localParameters, "p");
        List localList = localParameters.getSupportedPreviewFormats();
        if ((localList == null) || (!localList.contains(Integer.valueOf(17))))
          ab.e(this.TAG, "not support YCbCr_420_SP");
        localParameters.setPreviewFormat(17);
        paramt.setParameters(localParameters);
        AppMethodBeat.o(13215);
        bool = true;
      }
      catch (Exception paramt)
      {
        ab.i(this.TAG, "setPreviewFormat Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
        AppMethodBeat.o(13215);
      }
    }
  }

  @TargetApi(14)
  private boolean c(t paramt)
  {
    AppMethodBeat.i(13216);
    boolean bool;
    if (paramt == null)
    {
      AppMethodBeat.o(13216);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        ab.i(this.TAG, "safeSetMetering");
        Camera.Parameters localParameters = paramt.getParameters();
        a.f.b.j.o(localParameters, "params");
        if (localParameters.getMaxNumMeteringAreas() > 0)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          Rect localRect = new android/graphics/Rect;
          localRect.<init>(-1000, -1000, 1000, 1000);
          Camera.Area localArea = new android/hardware/Camera$Area;
          localArea.<init>(localRect, 600);
          localArrayList.add(localArea);
          localParameters.setMeteringAreas((List)localArrayList);
        }
        paramt.setParameters(localParameters);
        AppMethodBeat.o(13216);
        bool = true;
      }
      catch (Exception paramt)
      {
        ab.i(this.TAG, "safeSetMetering Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
        AppMethodBeat.o(13216);
        bool = false;
      }
    }
  }

  private final int getPreviewHeight()
  {
    int i = 0;
    AppMethodBeat.i(13210);
    if (this.erH == null)
      AppMethodBeat.o(13210);
    while (true)
    {
      return i;
      if (this.fbb != null)
        try
        {
          if ((this.fau) && (this.fbc != null))
          {
            Point localPoint = this.fbc;
            if (localPoint == null)
              a.f.b.j.dWJ();
            j = localPoint.y;
            AppMethodBeat.o(13210);
            i = j;
            continue;
          }
          int j = this.fav.lZf;
          AppMethodBeat.o(13210);
          i = j;
        }
        catch (Exception localException)
        {
          ab.e(this.TAG, "getPreviewHeight: %s", new Object[] { localException.getMessage() });
        }
      else
        AppMethodBeat.o(13210);
    }
  }

  private final int getPreviewWidth()
  {
    int i = 0;
    AppMethodBeat.i(13211);
    if (this.erH == null)
      AppMethodBeat.o(13211);
    while (true)
    {
      return i;
      if (this.fbb != null)
        try
        {
          if ((this.fau) && (this.fbc != null))
          {
            Point localPoint = this.fbc;
            if (localPoint == null)
              a.f.b.j.dWJ();
            j = localPoint.x;
            AppMethodBeat.o(13211);
            i = j;
            continue;
          }
          int j = this.fav.lZe;
          AppMethodBeat.o(13211);
          i = j;
        }
        catch (Exception localException)
        {
          ab.e(this.TAG, "getPreviewWidth: %s", new Object[] { localException.getMessage() });
        }
      else
        AppMethodBeat.o(13211);
    }
  }

  private final boolean kk(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(13218);
    if ((this.erH == null) || (this.fbb == null))
    {
      ab.d(this.TAG, "maybe sth. is wrong ,camera is null");
      AppMethodBeat.o(13218);
      bool2 = bool1;
      return bool2;
    }
    Object localObject1 = this.fbb;
    if ((localObject1 == null) || (((d.a.a)localObject1).rotate != 90))
    {
      localObject1 = this.fbb;
      if ((localObject1 == null) || (((d.a.a)localObject1).rotate != 270))
        break label167;
    }
    Camera.Parameters localParameters;
    label167: for (boolean bool2 = true; ; bool2 = false)
    {
      try
      {
        localObject1 = this.erH;
        if (localObject1 != null)
        {
          localParameters = ((t)localObject1).getParameters();
          if (localParameters != null)
            break label172;
        }
        AppMethodBeat.o(13218);
        bool2 = bool1;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "setPreviewSize Exception, %s, %s", new Object[] { Looper.myLooper(), localException.getMessage() });
        AppMethodBeat.o(13218);
        bool2 = bool1;
      }
      break;
    }
    label172: Point localPoint = com.tencent.mm.plugin.mmsight.d.eu(this.context);
    Object localObject2 = g.b(localParameters, localPoint, paramInt, bool2);
    if (((g.b)localObject2).oum == null)
    {
      ab.e(this.TAG, "fuck, preview size still null!!");
      localObject2 = new android/graphics/Point;
      ((Point)localObject2).<init>(Math.min(localPoint.x, localPoint.y), Math.max(localPoint.x, localPoint.y));
      localObject2 = g.c(localParameters, (Point)localObject2, this.fbn, bool2);
    }
    while (true)
    {
      if (((g.b)localObject2).oum == null)
      {
        ab.i(this.TAG, "checkMore start %s", new Object[] { ((g.b)localObject2).toString() });
        ((g.b)localObject2).oum = ((g.b)localObject2).oup;
        ((g.b)localObject2).oun = ((g.b)localObject2).ouq;
        ((g.b)localObject2).ouo = ((g.b)localObject2).our;
      }
      localPoint = ((g.b)localObject2).oum;
      if (localPoint == null)
      {
        com.tencent.mm.plugin.mmsight.model.k.bPD();
        AppMethodBeat.o(13218);
        bool2 = bool1;
        break;
      }
      this.fav.lZe = localPoint.x;
      this.fav.lZf = localPoint.y;
      this.fbc = localPoint;
      if (((g.b)localObject2).oun != null)
        this.fbc = ((g.b)localObject2).oun;
      String str = this.TAG;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("final set camera preview size: ");
      ab.i(str, localPoint + ", cropSize: " + this.fbc);
      localParameters.setPreviewSize(localPoint.x, localPoint.y);
      localObject2 = this.erH;
      if (localObject2 != null)
        ((t)localObject2).setParameters(localParameters);
      AppMethodBeat.o(13218);
      bool2 = true;
      break;
    }
  }

  private final boolean kl(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(13219);
    boolean bool2;
    if ((this.erH == null) || (this.fbb == null))
    {
      ab.d(this.TAG, "maybe sth. is wrong ,camera is null");
      AppMethodBeat.o(13219);
      bool2 = bool1;
      return bool2;
    }
    Object localObject1 = this.fbb;
    if (localObject1 != null)
      if ((((d.a.a)localObject1).rotate == 90) || (((d.a.a)localObject1).rotate == 270))
        bool2 = true;
    label314: label320: label449: 
    while (true)
    {
      try
      {
        localObject1 = this.erH;
        if (localObject1 == null)
          break label314;
        localObject1 = ((t)localObject1).getParameters();
        localObject2 = com.tencent.mm.plugin.mmsight.d.eu(this.context);
        localObject3 = g.d((Camera.Parameters)localObject1, (Point)localObject2, paramInt, bool2);
        if (((g.b)localObject3).oum != null)
          break label449;
        ab.e(this.TAG, "fuck, preview size still null!!");
        localObject3 = new android/graphics/Point;
        ((Point)localObject3).<init>(Math.min(((Point)localObject2).x, ((Point)localObject2).y), Math.max(((Point)localObject2).x, ((Point)localObject2).y));
        localObject3 = g.c((Camera.Parameters)localObject1, (Point)localObject3, this.fbn, bool2);
        if (((g.b)localObject3).oum == null)
        {
          ab.i(this.TAG, "checkMore start %s", new Object[] { ((g.b)localObject3).toString() });
          ((g.b)localObject3).oum = ((g.b)localObject3).oup;
          ((g.b)localObject3).oun = ((g.b)localObject3).ouq;
          ((g.b)localObject3).ouo = ((g.b)localObject3).our;
        }
        localObject3 = ((g.b)localObject3).oum;
        if (localObject3 != null)
          break label320;
        com.tencent.mm.plugin.mmsight.model.k.bPD();
        AppMethodBeat.o(13219);
        bool2 = bool1;
      }
      catch (Exception localException)
      {
        ab.i(this.TAG, "setPreviewSize Exception, %s, %s", new Object[] { Looper.myLooper(), localException.getMessage() });
        AppMethodBeat.o(13219);
        bool2 = bool1;
      }
      break;
      bool2 = false;
      continue;
      Camera.Parameters localParameters = null;
      continue;
      this.fav.lZe = ((Point)localObject3).x;
      this.fav.lZf = ((Point)localObject3).y;
      this.fbc = null;
      String str = this.TAG;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("final set camera preview size: ");
      ab.i(str, localObject3 + ", cropSize: " + this.fbc);
      if (localParameters != null)
        localParameters.setPreviewSize(this.fav.lZe, this.fav.lZf);
      Object localObject3 = this.erH;
      if (localObject3 != null)
        ((t)localObject3).setParameters(localParameters);
      AppMethodBeat.o(13219);
      bool2 = true;
      break;
    }
  }

  public final void Wp()
  {
    AppMethodBeat.i(13206);
    if (!Wh())
      AppMethodBeat.o(13206);
    while (true)
    {
      return;
      c localc = this.fba;
      c.a locala = c.faV;
      localc.removeMessages(c.Wn());
      AppMethodBeat.o(13206);
    }
  }

  public final b Wq()
  {
    Object localObject = null;
    boolean bool = true;
    AppMethodBeat.i(13209);
    ab.c(this.TAG, "generateCameraConfig", new Object[0]);
    if (this.erH == null)
    {
      ab.i(this.TAG, "generateCameraConfig, camera is null!!");
      AppMethodBeat.o(13209);
    }
    while (true)
    {
      return localObject;
      if (Wh())
        break;
      ab.i(this.TAG, "generateCameraConfig, camera not previewing");
      AppMethodBeat.o(13209);
    }
    b.ke(getPreviewWidth());
    b.kd(getPreviewHeight());
    localObject = this.fbb;
    int i;
    if (localObject != null)
      if ((((d.a.a)localObject).rotate == 90) || (((d.a.a)localObject).rotate == 270))
      {
        i = 1;
        label119: b.kg(this.fav.lZe);
        b.kh(this.fav.lZf);
        if (i != 0)
        {
          i = b.Wj();
          b.kg(b.Wk());
          b.kh(i);
        }
        if ((this.fbb == null) || (!Wh()))
          break label236;
        localObject = this.fbb;
        if (localObject == null)
          break label231;
        i = ((d.a.a)localObject).rotate;
        label185: b.kf(i);
        if (this.fas)
          break label241;
      }
    while (true)
    {
      b.setFrontCamera(bool);
      b.cu(this.fau);
      localObject = this.faw;
      AppMethodBeat.o(13209);
      break;
      i = 0;
      break label119;
      i = 0;
      break label119;
      label231: i = 0;
      break label185;
      label236: i = -1;
      break label185;
      label241: bool = false;
    }
  }

  public final void a(SurfaceTexture paramSurfaceTexture, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(13199);
    super.a(paramSurfaceTexture, paramBoolean, paramInt);
    if (paramBoolean)
    {
      a(paramSurfaceTexture, null, paramInt);
      AppMethodBeat.o(13199);
    }
    while (true)
    {
      return;
      b(paramSurfaceTexture, null, paramInt);
      AppMethodBeat.o(13199);
    }
  }

  public final void a(SurfaceHolder paramSurfaceHolder, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(13200);
    super.a(paramSurfaceHolder, paramBoolean, paramInt);
    if (paramBoolean)
    {
      a(null, paramSurfaceHolder, paramInt);
      AppMethodBeat.o(13200);
    }
    while (true)
    {
      return;
      b(null, paramSurfaceHolder, paramInt);
      AppMethodBeat.o(13200);
    }
  }

  public final void a(com.tencent.mm.plugin.mmsight.model.f paramf)
  {
    AppMethodBeat.i(13197);
    ab.c(this.TAG, "addFrameDataCallback ".concat(String.valueOf(paramf)), new Object[0]);
    if (paramf == null)
      AppMethodBeat.o(13197);
    while (true)
    {
      return;
      synchronized (this.lock)
      {
        this.faZ.add(paramf);
        AppMethodBeat.o(13197);
      }
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(13208);
    if ((this.erH != null) && (Wh()));
    label516: 
    while (true)
    {
      try
      {
        ab.d(this.TAG, "triggerSmallZoom, zoom: %s", new Object[] { Boolean.valueOf(paramBoolean1) });
        if (this.aJI)
        {
          ab.d(this.TAG, "triggerSmallZoom, zooming, ignore");
          return;
        }
        Object localObject1 = this.erH;
        int i;
        int j;
        int m;
        if (localObject1 != null)
        {
          localObject1 = ((t)localObject1).getParameters();
          if ((localObject1 == null) || (((Camera.Parameters)localObject1).isZoomSupported() != true))
            continue;
          this.aJI = true;
          i = ((Camera.Parameters)localObject1).getZoom();
          j = ((Camera.Parameters)localObject1).getMaxZoom();
          if (paramBoolean2)
            continue;
          if (this.fbe <= 0)
          {
            this.fbe = Math.round(j / this.faX);
            if (this.fbe > this.faY)
              this.fbe = this.faY;
          }
          k = this.fbe;
          ab.d(this.TAG, "triggerSmallZoom, currentZoom: %s, maxZoom: %s, smallZoomStep: %s, scrollSmallZoomStep: %s, factor: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.fbe), Integer.valueOf(this.fbd), Integer.valueOf(paramInt) });
          m = k;
          if (paramInt > 0)
            m = k * paramInt;
          if (!paramBoolean1)
            continue;
          if (i < j)
            continue;
          this.aJI = false;
          AppMethodBeat.o(13208);
          continue;
        }
        localObject1 = null;
        continue;
        if (this.fbd <= 0)
        {
          ab.e(this.TAG, "scroll zoom error, scrollSmallZoomStep: %s", new Object[] { Integer.valueOf(this.fbd) });
          this.aJI = false;
          AppMethodBeat.o(13208);
          continue;
        }
        int k = this.fbd;
        continue;
        paramInt = m + i;
        if (paramInt < j)
          break label516;
        paramInt = j;
        ab.d(this.TAG, "triggerSmallZoom, nextZoom: %s, smoothZoomSupported: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(((Camera.Parameters)localObject1).isSmoothZoomSupported()) });
        ((Camera.Parameters)localObject1).setZoom(paramInt);
        t localt = this.erH;
        if (localt != null)
          localt.setParameters((Camera.Parameters)localObject1);
        this.aJI = false;
        AppMethodBeat.o(13208);
        continue;
        if (i == 0)
        {
          this.aJI = false;
          AppMethodBeat.o(13208);
          continue;
        }
        k = i - m;
        paramInt = k;
        if (k > 0)
          continue;
        paramInt = 0;
        continue;
      }
      catch (Exception localException)
      {
        ab.e(this.TAG, "triggerSmallZoom error: %s", new Object[] { localException.getMessage() });
        this.aJI = false;
        AppMethodBeat.o(13208);
        continue;
      }
      finally
      {
        this.aJI = false;
        AppMethodBeat.o(13208);
      }
      AppMethodBeat.o(13208);
    }
  }

  public final void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13205);
    if (!Wh())
      AppMethodBeat.o(13205);
    while (true)
    {
      return;
      if (com.tencent.mm.compatible.util.d.fP(14))
      {
        AppMethodBeat.o(13205);
      }
      else
      {
        c localc1 = this.fba;
        c.a locala = c.faV;
        localc1.removeMessages(c.Wn());
        this.fba.faK = paramFloat1;
        this.fba.faL = paramFloat2;
        this.fba.faM = paramInt1;
        this.fba.faN = paramInt2;
        c localc2 = this.fba;
        localc1 = this.fba;
        locala = c.faV;
        localc2.sendMessageDelayed(localc1.obtainMessage(c.Wn(), this.erH), 400L);
        AppMethodBeat.o(13205);
      }
    }
  }

  public final void b(com.tencent.mm.plugin.mmsight.model.f paramf)
  {
    AppMethodBeat.i(13198);
    ab.c(this.TAG, "removeFrameDataCallback ".concat(String.valueOf(paramf)), new Object[0]);
    if (paramf == null)
      AppMethodBeat.o(13198);
    while (true)
    {
      return;
      synchronized (this.lock)
      {
        this.faZ.remove(paramf);
        AppMethodBeat.o(13198);
      }
    }
  }

  public final void kj(int paramInt)
  {
    AppMethodBeat.i(13207);
    if (this.fbd > 0)
      AppMethodBeat.o(13207);
    while (true)
    {
      return;
      Object localObject = ae.hy(ah.getContext());
      int i = ((Point)localObject).y;
      ab.i(this.TAG, "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", new Object[] { Integer.valueOf(paramInt), localObject });
      if (i / 2 >= paramInt)
        AppMethodBeat.o(13207);
      else
        try
        {
          if (this.erH != null)
          {
            localObject = this.erH;
            if (localObject != null)
            {
              localObject = ((t)localObject).getParameters();
              label94: if (localObject == null)
                break label179;
            }
            label179: for (i = ((Camera.Parameters)localObject).getMaxZoom(); ; i = 0)
            {
              double d = i / (paramInt / 3.0D / 10.0D);
              if (d > 0.0D)
                this.fbd = ((int)d + 1);
              ab.i(this.TAG, "scrollSmallZoomStep: %s, maxZoom: %s", new Object[] { Integer.valueOf(this.fbd), Integer.valueOf(i) });
              AppMethodBeat.o(13207);
              break;
              localObject = null;
              break label94;
            }
          }
        }
        catch (Exception localException)
        {
          ab.e(this.TAG, "calcScrollZoomStep error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(13207);
        }
    }
  }

  public final boolean o(Context paramContext, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(13196);
    a.f.b.j.p(paramContext, "context");
    try
    {
      if (this.fbm)
      {
        ab.i(this.TAG, "initCamera, already open");
        AppMethodBeat.o(13196);
        paramBoolean = bool;
      }
      while (true)
      {
        return paramBoolean;
        Object localObject = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.Vk();
        super.o(paramContext, paramBoolean);
        release();
        if (paramBoolean);
        for (int i = com.tencent.mm.compatible.e.d.Lr(); ; i = com.tencent.mm.compatible.e.d.Ls())
        {
          ab.c(this.TAG, "use camera id %d, DeviceInfo id %d", new Object[] { Integer.valueOf(i), Integer.valueOf(q.etc.ert) });
          localObject = new com/tencent/mm/media/widget/a/f;
          ((f)localObject).<init>();
          this.fbb = ((f)localObject).a(paramContext, i, Looper.getMainLooper());
          ab.i(this.TAG, "open camera end, %s", new Object[] { Looper.myLooper() });
          if (this.fbb != null)
            break label198;
          ab.i(this.TAG, "open camera FAILED, %s", new Object[] { Looper.myLooper() });
          Wf();
          AppMethodBeat.o(13196);
          paramBoolean = false;
          break;
        }
        label198: paramContext = this.fbb;
        if (paramContext != null)
        {
          paramContext = paramContext.erH;
          label212: this.erH = paramContext;
          this.fba.faJ = false;
          localObject = this.fav;
          paramContext = this.fbb;
          if (paramContext == null)
            break label290;
        }
        label290: for (i = paramContext.rotate; ; i = 0)
        {
          ((p)localObject).rotate = i;
          if (this.erH != null)
            break label296;
          ab.e(this.TAG, "start camera FAILED!");
          Wf();
          AppMethodBeat.o(13196);
          paramBoolean = false;
          break;
          paramContext = null;
          break label212;
        }
        label296: this.fbm = true;
        AppMethodBeat.o(13196);
        paramBoolean = bool;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)paramContext, "init camera failed!", new Object[0]);
        paramContext = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.Vm();
        AppMethodBeat.o(13196);
        paramBoolean = false;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(13221);
    super.release();
    try
    {
      ab.i(this.TAG, this.fbf.getValue());
      ab.i(this.TAG, this.fbg.getValue());
      ab.i(this.TAG, this.fbh.getValue());
      ab.i(this.TAG, this.fbi.getValue());
      ab.i(this.TAG, this.fbj.getValue());
      if (this.erH != null)
      {
        long l = bo.yz();
        ab.i(this.TAG, "release camera beg, %s", new Object[] { Looper.myLooper() });
        this.fba.removeCallbacksAndMessages(null);
        this.fba.faJ = true;
        t localt = this.erH;
        if (localt != null)
          localt.setPreviewCallback(null);
        localt = this.erH;
        if (localt != null)
          localt.stopPreview();
        localt = this.erH;
        if (localt != null)
          localt.release();
        this.erH = null;
        ab.i(this.TAG, "release camera end, use %dms, %s", new Object[] { Long.valueOf(bo.az(l)), Looper.myLooper() });
      }
      this.fba.faH = false;
      this.fba.faO = true;
      this.fbc = null;
      this.fbl = null;
      this.fbm = false;
      AppMethodBeat.o(13221);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "cameraRelease error", new Object[0]);
        AppMethodBeat.o(13221);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.d
 * JD-Core Version:    0.6.2
 */