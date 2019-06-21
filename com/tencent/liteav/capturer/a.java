package com.tencent.liteav.capturer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import com.tencent.liteav.basic.f.b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class a
  implements Camera.AutoFocusCallback
{
  private static final String c;
  private Matrix a;
  private int b;
  private Camera d;
  private boolean e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private SurfaceTexture m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;

  static
  {
    AppMethodBeat.i(67824);
    c = a.class.getSimpleName();
    AppMethodBeat.o(67824);
  }

  public a()
  {
    AppMethodBeat.i(67810);
    this.a = new Matrix();
    this.b = 0;
    this.e = true;
    this.f = 15;
    this.h = 1;
    this.q = false;
    AppMethodBeat.o(67810);
  }

  private Rect a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    int i1 = 1000;
    AppMethodBeat.i(67813);
    float f1 = 200.0F * paramFloat3;
    paramFloat3 = paramFloat1;
    if (this.e == true)
      paramFloat3 = 1.0F - paramFloat1;
    int i2 = this.k / 90;
    for (int i3 = 0; i3 < i2; i3++)
    {
      paramFloat1 = --(paramFloat2 - 0.5F);
      paramFloat2 = -(paramFloat3 - 0.5F);
      paramFloat3 = paramFloat1 + 0.5F;
      paramFloat2 += 0.5F;
    }
    i3 = (int)(paramFloat3 * 2000.0F - 1000.0F);
    i2 = (int)(paramFloat2 * 2000.0F - 1000.0F);
    if (i3 < -1000)
      i3 = -1000;
    while (true)
    {
      if (i2 < -1000)
        i2 = -1000;
      while (true)
      {
        int i4 = i3 + (int)f1;
        int i5 = (int)f1 + i2;
        int i6 = i4;
        if (i4 > 1000)
          i6 = 1000;
        if (i5 > 1000);
        while (true)
        {
          Rect localRect = new Rect(i3, i2, i6, i1);
          AppMethodBeat.o(67813);
          return localRect;
          i1 = i5;
        }
      }
    }
  }

  private a e(int paramInt)
  {
    AppMethodBeat.i(67819);
    List localList = this.d.getParameters().getSupportedPreviewSizes();
    ArrayList localArrayList = new ArrayList();
    label70: a locala;
    int i1;
    switch (paramInt)
    {
    default:
      paramInt = 0;
      if (paramInt < localArrayList.size())
      {
        locala = (a)localArrayList.get(paramInt);
        i1 = 0;
        label95: if (i1 < localList.size())
        {
          Camera.Size localSize = (Camera.Size)localList.get(i1);
          if ((localSize.width == locala.a) && (localSize.height == locala.b))
          {
            TXCLog.w(c, "wanted:" + locala.a + "*" + locala.b);
            AppMethodBeat.o(67819);
          }
        }
      }
      break;
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    case 3:
    case 7:
    }
    while (true)
    {
      return locala;
      localArrayList.add(new a(640, 360));
      localArrayList.add(new a(768, 432));
      localArrayList.add(new a(960, 544));
      localArrayList.add(new a(960, 540));
      localArrayList.add(new a(800, 480));
      localArrayList.add(new a(640, 480));
      localArrayList.add(new a(960, 720));
      localArrayList.add(new a(1280, 720));
      break;
      localArrayList.add(new a(960, 544));
      localArrayList.add(new a(960, 540));
      localArrayList.add(new a(960, 720));
      localArrayList.add(new a(1280, 720));
      localArrayList.add(new a(800, 480));
      localArrayList.add(new a(640, 360));
      localArrayList.add(new a(640, 480));
      break;
      localArrayList.add(new a(1280, 720));
      localArrayList.add(new a(1920, 1088));
      localArrayList.add(new a(1920, 1080));
      localArrayList.add(new a(960, 544));
      localArrayList.add(new a(960, 540));
      localArrayList.add(new a(960, 720));
      localArrayList.add(new a(800, 480));
      localArrayList.add(new a(640, 360));
      localArrayList.add(new a(640, 480));
      localArrayList.add(new a(480, 320));
      localArrayList.add(new a(640, 360));
      localArrayList.add(new a(640, 480));
      localArrayList.add(new a(768, 432));
      break;
      localArrayList.add(new a(1920, 1088));
      localArrayList.add(new a(1920, 1080));
      localArrayList.add(new a(1280, 720));
      localArrayList.add(new a(960, 544));
      localArrayList.add(new a(960, 540));
      localArrayList.add(new a(960, 720));
      localArrayList.add(new a(800, 480));
      localArrayList.add(new a(768, 432));
      localArrayList.add(new a(640, 360));
      localArrayList.add(new a(640, 480));
      break;
      i1++;
      break label95;
      paramInt++;
      break label70;
      locala = null;
      AppMethodBeat.o(67819);
    }
  }

  private int f(int paramInt)
  {
    int i1 = 0;
    AppMethodBeat.i(67821);
    List localList = this.d.getParameters().getSupportedPreviewFrameRates();
    int i2;
    if (localList == null)
    {
      TXCLog.e(c, "getSupportedFPS error");
      i2 = 1;
      AppMethodBeat.o(67821);
    }
    while (true)
    {
      return i2;
      int i4;
      for (i2 = ((Integer)localList.get(0)).intValue(); i1 < localList.size(); i2 = i4)
      {
        int i3 = ((Integer)localList.get(i1)).intValue();
        i4 = i2;
        if (Math.abs(i3 - paramInt) - Math.abs(i2 - paramInt) < 0)
          i4 = i3;
        i1++;
      }
      TXCLog.i(c, "choose fpts=".concat(String.valueOf(i2)));
      AppMethodBeat.o(67821);
    }
  }

  private int[] g(int paramInt)
  {
    AppMethodBeat.i(67822);
    paramInt *= 1000;
    String str = "camera supported preview fps range: wantFPS = " + paramInt + "\n";
    Object localObject1 = this.d.getParameters().getSupportedPreviewFpsRange();
    Object localObject2;
    if ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      localObject2 = (int[])((List)localObject1).get(0);
      Collections.sort((List)localObject1, new a.1(this));
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        int[] arrayOfInt = (int[])localIterator.next();
        str = str + "camera supported preview fps range: " + arrayOfInt[0] + " - " + arrayOfInt[1] + "\n";
      }
      localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (int[])localIterator.next();
        if ((localObject1[0] <= paramInt) && (paramInt <= localObject1[1]))
          localObject2 = localObject1;
      }
    }
    while (true)
    {
      str = str + "choose preview fps range: " + localObject2[0] + " - " + localObject2[1];
      TXCLog.i(c, str);
      AppMethodBeat.o(67822);
      while (true)
      {
        return localObject2;
        localObject2 = null;
        AppMethodBeat.o(67822);
      }
    }
  }

  private int h(int paramInt)
  {
    AppMethodBeat.i(67823);
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    Camera.getCameraInfo(paramInt, localCameraInfo);
    if (localCameraInfo.facing == 1);
    for (paramInt = (360 - localCameraInfo.orientation) % 360; ; paramInt = (localCameraInfo.orientation + 360) % 360)
    {
      AppMethodBeat.o(67823);
      return paramInt;
    }
  }

  public int a()
  {
    AppMethodBeat.i(67814);
    int i1 = 0;
    int i2 = i1;
    if (this.d != null)
    {
      Camera.Parameters localParameters = this.d.getParameters();
      i2 = i1;
      if (localParameters.getMaxZoom() > 0)
      {
        i2 = i1;
        if (localParameters.isZoomSupported())
          i2 = localParameters.getMaxZoom();
      }
    }
    AppMethodBeat.o(67814);
    return i2;
  }

  public void a(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = -1.0F;
    AppMethodBeat.i(67816);
    if (this.d != null)
    {
      if (paramFloat <= 1.0F)
        break label209;
      paramFloat = f1;
    }
    label209: 
    while (true)
    {
      if (paramFloat < -1.0F)
        paramFloat = f2;
      while (true)
      {
        Camera.Parameters localParameters = this.d.getParameters();
        int i1 = localParameters.getMinExposureCompensation();
        int i2 = localParameters.getMaxExposureCompensation();
        if ((i1 != 0) && (i2 != 0))
        {
          int i3 = b.a().d();
          paramFloat *= i2;
          if ((i3 != 0) && (i3 <= i2) && (i3 >= i1))
          {
            TXCLog.d(c, "camera setExposureCompensation: ".concat(String.valueOf(i3)));
            localParameters.setExposureCompensation(i3);
          }
        }
        while (true)
        {
          try
          {
            this.d.setParameters(localParameters);
            AppMethodBeat.o(67816);
            return;
            if ((paramFloat > i2) || (paramFloat < i1))
              continue;
            TXCLog.d(c, "camera setExposureCompensation: ".concat(String.valueOf(paramFloat)));
            localParameters.setExposureCompensation((int)paramFloat);
            continue;
            TXCLog.e(c, "camera not support setExposureCompensation!");
            continue;
          }
          catch (Exception localException)
          {
          }
          AppMethodBeat.o(67816);
        }
      }
    }
  }

  // ERROR //
  public void a(float paramFloat1, float paramFloat2)
  {
    // Byte code:
    //   0: ldc_w 287
    //   3: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 69	com/tencent/liteav/capturer/a:q	Z
    //   10: ifne +10 -> 20
    //   13: ldc_w 287
    //   16: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: return
    //   20: aload_0
    //   21: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   24: invokevirtual 290	android/hardware/Camera:cancelAutoFocus	()V
    //   27: aload_0
    //   28: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   31: invokevirtual 92	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   34: astore_3
    //   35: aload_0
    //   36: getfield 292	com/tencent/liteav/capturer/a:n	Z
    //   39: ifeq +43 -> 82
    //   42: new 100	java/util/ArrayList
    //   45: dup
    //   46: invokespecial 101	java/util/ArrayList:<init>	()V
    //   49: astore 4
    //   51: aload 4
    //   53: new 294	android/hardware/Camera$Area
    //   56: dup
    //   57: aload_0
    //   58: fload_1
    //   59: fload_2
    //   60: fconst_2
    //   61: invokespecial 296	com/tencent/liteav/capturer/a:a	(FFF)Landroid/graphics/Rect;
    //   64: sipush 1000
    //   67: invokespecial 299	android/hardware/Camera$Area:<init>	(Landroid/graphics/Rect;I)V
    //   70: invokeinterface 154 2 0
    //   75: pop
    //   76: aload_3
    //   77: aload 4
    //   79: invokevirtual 303	android/hardware/Camera$Parameters:setFocusAreas	(Ljava/util/List;)V
    //   82: aload_0
    //   83: getfield 305	com/tencent/liteav/capturer/a:o	Z
    //   86: ifeq +45 -> 131
    //   89: new 100	java/util/ArrayList
    //   92: dup
    //   93: invokespecial 101	java/util/ArrayList:<init>	()V
    //   96: astore 4
    //   98: aload 4
    //   100: new 294	android/hardware/Camera$Area
    //   103: dup
    //   104: aload_0
    //   105: fload_1
    //   106: fload_2
    //   107: ldc_w 306
    //   110: invokespecial 296	com/tencent/liteav/capturer/a:a	(FFF)Landroid/graphics/Rect;
    //   113: sipush 1000
    //   116: invokespecial 299	android/hardware/Camera$Area:<init>	(Landroid/graphics/Rect;I)V
    //   119: invokeinterface 154 2 0
    //   124: pop
    //   125: aload_3
    //   126: aload 4
    //   128: invokevirtual 309	android/hardware/Camera$Parameters:setMeteringAreas	(Ljava/util/List;)V
    //   131: aload_0
    //   132: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   135: aload_3
    //   136: invokevirtual 280	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   139: aload_0
    //   140: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   143: aload_0
    //   144: invokevirtual 313	android/hardware/Camera:autoFocus	(Landroid/hardware/Camera$AutoFocusCallback;)V
    //   147: ldc_w 287
    //   150: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: goto -134 -> 19
    //   156: astore_3
    //   157: ldc_w 287
    //   160: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: goto -144 -> 19
    //   166: astore_3
    //   167: ldc_w 287
    //   170: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -154 -> 19
    //
    // Exception table:
    //   from	to	target	type
    //   20	35	156	java/lang/Exception
    //   131	147	166	java/lang/Exception
  }

  public void a(int paramInt)
  {
    this.g = paramInt;
  }

  public void a(SurfaceTexture paramSurfaceTexture)
  {
    this.m = paramSurfaceTexture;
  }

  public boolean a(boolean paramBoolean)
  {
    AppMethodBeat.i(67811);
    this.p = paramBoolean;
    boolean bool;
    Camera.Parameters localParameters;
    List localList;
    if (this.d != null)
    {
      bool = true;
      localParameters = this.d.getParameters();
      localList = localParameters.getSupportedFlashModes();
      if (paramBoolean)
        if ((localList != null) && (localList.contains("torch")))
        {
          TXCLog.i(c, "set FLASH_MODE_TORCH");
          localParameters.setFlashMode("torch");
        }
    }
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      try
      {
        while (true)
        {
          this.d.setParameters(localParameters);
          AppMethodBeat.o(67811);
          return paramBoolean;
          paramBoolean = false;
          continue;
          if ((localList != null) && (localList.contains("off")))
          {
            TXCLog.i(c, "set FLASH_MODE_OFF");
            localParameters.setFlashMode("off");
            paramBoolean = bool;
          }
          else
          {
            paramBoolean = false;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
          paramBoolean = false;
      }
      AppMethodBeat.o(67811);
    }
  }

  // ERROR //
  public void b()
  {
    // Byte code:
    //   0: ldc_w 340
    //   3: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   10: ifnull +81 -> 91
    //   13: aload_0
    //   14: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   17: aconst_null
    //   18: invokevirtual 344	android/hardware/Camera:setPreviewCallback	(Landroid/hardware/Camera$PreviewCallback;)V
    //   21: aload_0
    //   22: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   25: invokevirtual 347	android/hardware/Camera:stopPreview	()V
    //   28: aload_0
    //   29: getfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   32: invokevirtual 350	android/hardware/Camera:release	()V
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 318	com/tencent/liteav/capturer/a:m	Landroid/graphics/SurfaceTexture;
    //   45: ldc_w 340
    //   48: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   51: return
    //   52: astore_1
    //   53: aload_0
    //   54: aconst_null
    //   55: putfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield 318	com/tencent/liteav/capturer/a:m	Landroid/graphics/SurfaceTexture;
    //   63: ldc_w 340
    //   66: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: goto -18 -> 51
    //   72: astore_1
    //   73: aload_0
    //   74: aconst_null
    //   75: putfield 86	com/tencent/liteav/capturer/a:d	Landroid/hardware/Camera;
    //   78: aload_0
    //   79: aconst_null
    //   80: putfield 318	com/tencent/liteav/capturer/a:m	Landroid/graphics/SurfaceTexture;
    //   83: ldc_w 340
    //   86: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: aload_1
    //   90: athrow
    //   91: ldc_w 340
    //   94: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: goto -46 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   13	35	52	java/lang/Exception
    //   13	35	72	finally
  }

  public void b(int paramInt)
  {
    this.f = paramInt;
  }

  public void b(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }

  public int c()
  {
    return this.k;
  }

  public int c(boolean paramBoolean)
  {
    AppMethodBeat.i(67817);
    try
    {
      Object localObject1 = this.m;
      if (localObject1 == null)
      {
        i1 = -2;
        AppMethodBeat.o(67817);
        return i1;
      }
      if (this.d != null)
        b();
      localObject3 = new android/hardware/Camera$CameraInfo;
      ((Camera.CameraInfo)localObject3).<init>();
      i2 = 0;
      i1 = -1;
      i3 = -1;
      while (i2 < Camera.getNumberOfCameras())
      {
        Camera.getCameraInfo(i2, (Camera.CameraInfo)localObject3);
        localObject4 = c;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("camera index ");
        TXCLog.i((String)localObject4, i2 + ", facing = " + ((Camera.CameraInfo)localObject3).facing);
        if (((Camera.CameraInfo)localObject3).facing == 1)
          i3 = i2;
        if (((Camera.CameraInfo)localObject3).facing == 0)
          i1 = i2;
        i2++;
      }
      TXCLog.i(c, "camera front, id = ".concat(String.valueOf(i3)));
      TXCLog.i(c, "camera back , id = ".concat(String.valueOf(i1)));
      if ((i3 == -1) && (i1 != -1))
      {
        i2 = i1;
        if ((i1 == -1) && (i2 != -1))
        {
          i1 = i2;
          this.e = paramBoolean;
          if (this.e);
          for (this.d = Camera.open(i2); ; this.d = Camera.open(i1))
          {
            localObject3 = this.d.getParameters();
            localObject1 = ((Camera.Parameters)localObject3).getSupportedFocusModes();
            if ((!this.q) || (localObject1 == null) || (!((List)localObject1).contains("auto")))
              break;
            TXCLog.i(c, "support FOCUS_MODE_AUTO");
            ((Camera.Parameters)localObject3).setFocusMode("auto");
            if (Build.VERSION.SDK_INT >= 14)
            {
              if (((Camera.Parameters)localObject3).getMaxNumFocusAreas() > 0)
                this.n = true;
              if (((Camera.Parameters)localObject3).getMaxNumMeteringAreas() > 0)
                this.o = true;
            }
            localObject1 = "";
            localObject4 = ((Camera.Parameters)localObject3).getSupportedPreviewSizes();
            if (localObject4 == null)
              break label496;
            i3 = 0;
            localObject1 = "";
            while (i3 < ((List)localObject4).size())
            {
              Camera.Size localSize = (Camera.Size)((List)localObject4).get(i3);
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localObject1 = (String)localObject1 + String.format("camera supported preview size %d x %d\n", new Object[] { Integer.valueOf(localSize.width), Integer.valueOf(localSize.height) });
              i3++;
            }
          }
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        AppMethodBeat.o(67817);
        i1 = -1;
        continue;
        if ((localIOException != null) && (localIOException.contains("continuous-video")))
        {
          TXCLog.i(c, "support FOCUS_MODE_CONTINUOUS_VIDEO");
          ((Camera.Parameters)localObject3).setFocusMode("continuous-video");
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject3;
        int i2;
        int i3;
        StringBuilder localStringBuilder;
        AppMethodBeat.o(67817);
        int i1 = -1;
        continue;
        label496: Object localObject4 = e(this.g);
        if (localObject4 == null)
        {
          this.d.release();
          this.d = null;
          TXCLog.d(c, "不支持的视频分辨率");
          i1 = -3;
          AppMethodBeat.o(67817);
        }
        else
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          Object localObject2 = localException + String.format("choose preview size %d x %d ", new Object[] { Integer.valueOf(((a)localObject4).a), Integer.valueOf(((a)localObject4).b) });
          TXCLog.i(c, (String)localObject2);
          this.i = ((a)localObject4).a;
          this.j = ((a)localObject4).b;
          ((Camera.Parameters)localObject3).setPreviewSize(((a)localObject4).a, ((a)localObject4).b);
          localObject2 = g(this.f);
          if (localObject2 != null)
          {
            ((Camera.Parameters)localObject3).setPreviewFpsRange(localObject2[0], localObject2[1]);
            label663: if (!this.e)
              break label771;
            i1 = i2;
          }
          label771: 
          while (true)
          {
            this.l = h(i1);
            this.k = ((this.l - 90 + this.h * 90 + 360) % 360);
            this.d.setDisplayOrientation(0);
            this.d.setPreviewTexture(this.m);
            this.d.setParameters((Camera.Parameters)localObject3);
            this.d.startPreview();
            AppMethodBeat.o(67817);
            i1 = 0;
            break;
            ((Camera.Parameters)localObject3).setPreviewFrameRate(f(this.f));
            break label663;
          }
          continue;
          i2 = i3;
        }
      }
    }
  }

  public boolean c(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(67815);
    boolean bool2 = bool1;
    Camera.Parameters localParameters;
    if (this.d != null)
    {
      localParameters = this.d.getParameters();
      if ((localParameters.getMaxZoom() > 0) && (localParameters.isZoomSupported()) && ((paramInt < 0) || (paramInt > localParameters.getMaxZoom())))
        break label80;
    }
    try
    {
      localParameters.setZoom(paramInt);
      this.d.setParameters(localParameters);
      bool2 = true;
      while (true)
      {
        AppMethodBeat.o(67815);
        return bool2;
        label80: TXCLog.e(c, "invalid zoom value : " + paramInt + ", while max zoom is " + localParameters.getMaxZoom());
        bool2 = bool1;
        continue;
        TXCLog.e(c, "camera not support zoom!");
        bool2 = bool1;
      }
    }
    catch (Exception localException)
    {
      while (true)
        bool2 = bool1;
    }
  }

  public void d(int paramInt)
  {
    this.h = paramInt;
    this.k = ((this.l - 90 + this.h * 90 + 360) % 360);
  }

  public boolean d()
  {
    return this.e;
  }

  public int e()
  {
    return this.i;
  }

  public int f()
  {
    return this.j;
  }

  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    AppMethodBeat.i(67820);
    if (paramBoolean)
    {
      TXCLog.i(c, "AUTO focus success");
      AppMethodBeat.o(67820);
    }
    while (true)
    {
      return;
      TXCLog.i(c, "AUTO focus failed");
      AppMethodBeat.o(67820);
    }
  }

  class a
  {
    public int a = 1280;
    public int b = 720;

    a(int paramInt1, int arg3)
    {
      this.a = paramInt1;
      int i;
      this.b = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.capturer.a
 * JD-Core Version:    0.6.2
 */