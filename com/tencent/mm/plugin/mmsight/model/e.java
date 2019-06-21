package com.tencent.mm.plugin.mmsight.model;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.g.a.mi;
import com.tencent.mm.g.a.mi.b;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class e
  implements SensorEventListener
{
  protected static int otN = 2147483647;
  static boolean ouf = true;
  protected boolean aJI;
  protected SensorManager bCW;
  protected t erH;
  protected boolean faH;
  Camera.AutoFocusCallback faP;
  protected List<f> faZ;
  protected boolean fas;
  protected p fav;
  protected d.a.a fbb;
  protected Point fbc;
  protected int fbd;
  protected int fbe;
  private b fbf;
  private b fbg;
  private b fbh;
  private b fbi;
  private b fbj;
  public volatile boolean fbk;
  public volatile byte[] fbl;
  protected Context mContext;
  protected boolean otL;
  protected int otM;
  protected Sensor otO;
  protected float otP;
  protected float otQ;
  protected float otR;
  protected Point otS;
  protected Point otT;
  protected int otU;
  protected byte[] otV;
  protected boolean otW;
  protected com.tencent.mm.plugin.base.model.a otX;
  protected boolean otY;
  protected boolean otZ;
  private a oua;
  private b oub;
  protected VideoTransPara ouc;
  public boolean oud;
  private boolean oue;
  public e.c oug;
  private int scene;

  public e(VideoTransPara paramVideoTransPara, int paramInt)
  {
    AppMethodBeat.i(76478);
    this.fbe = -1;
    this.fbd = -1;
    this.faH = false;
    this.aJI = false;
    this.erH = null;
    this.otL = false;
    this.otM = 0;
    this.otP = 0.0F;
    this.otQ = 0.0F;
    this.otR = 0.0F;
    this.mContext = null;
    this.otS = null;
    this.otT = null;
    this.fbc = null;
    this.otU = 0;
    this.otW = false;
    this.otX = new com.tencent.mm.plugin.base.model.a();
    this.otY = false;
    this.faZ = new ArrayList();
    this.otZ = false;
    this.oua = a.oui;
    this.fbf = new b("prevcameraCallback");
    this.fbg = new b("cameraCallback");
    this.fbh = new b("cameraPreviewCallback");
    this.fbi = new b("cameraCropCallback");
    this.oub = new b("mirrorCameraCallback");
    this.fbj = new b("finishCallbackTimeCallback");
    this.scene = 0;
    this.fbl = null;
    this.fbk = false;
    this.oud = false;
    this.oue = false;
    this.faP = new e.2(this);
    this.oug = new e.c(this, Looper.getMainLooper());
    this.fas = true;
    this.fav = p.bPJ();
    this.ouc = paramVideoTransPara;
    this.scene = paramInt;
    AppMethodBeat.o(76478);
  }

  private void Wf()
  {
    AppMethodBeat.i(76495);
    if (true == this.oue)
      AppMethodBeat.o(76495);
    while (true)
    {
      return;
      if (this.mContext == null)
      {
        AppMethodBeat.o(76495);
      }
      else if ((Build.MANUFACTURER.equalsIgnoreCase("meizu")) && (!com.tencent.mm.compatible.f.b.Mj()))
      {
        AppMethodBeat.o(76495);
      }
      else
      {
        Object localObject = new mi();
        ((mi)localObject).cIm.type = 2;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        if (((mi)localObject).cIn.cIl)
        {
          this.oue = true;
          AppMethodBeat.o(76495);
        }
        else
        {
          localObject = h.g(this.mContext, 2131303515, 2131297061);
          if (localObject != null)
          {
            ((com.tencent.mm.ui.widget.a.c)localObject).setCancelable(false);
            ((com.tencent.mm.ui.widget.a.c)localObject).setCanceledOnTouchOutside(false);
            ((com.tencent.mm.ui.widget.a.c)localObject).show();
            this.oue = true;
          }
          AppMethodBeat.o(76495);
        }
      }
    }
  }

  private void Ws()
  {
    AppMethodBeat.i(76491);
    if (this.erH != null);
    while (true)
    {
      try
      {
        Object localObject = this.erH.getParameters();
        ab.i("MicroMsg.MMSightCamera", "setPreviewCallbackImpl");
        int i = this.fav.lZe;
        int j = this.fav.lZf;
        i = ImageFormat.getBitsPerPixel(((Camera.Parameters)localObject).getPreviewFormat()) * (i * j) / 8;
        j = 0;
        if (j < 5)
        {
          localObject = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(i));
          this.erH.addCallbackBuffer((byte[])localObject);
          j++;
          continue;
        }
        this.fbf.reset();
        this.fbg.reset();
        this.fbh.reset();
        this.fbi.reset();
        this.oub.reset();
        this.fbj.reset();
        localObject = new com/tencent/mm/plugin/base/model/a;
        ((com.tencent.mm.plugin.base.model.a)localObject).<init>();
        this.otX = ((com.tencent.mm.plugin.base.model.a)localObject);
        localObject = this.erH;
        e.1 local1 = new com/tencent/mm/plugin/mmsight/model/e$1;
        local1.<init>(this);
        ((t)localObject).setPreviewCallbackWithBuffer(local1);
        AppMethodBeat.o(76491);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMSightCamera", "setPreviewCallbackImpl error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(76491);
    }
  }

  private static boolean a(t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(76488);
    if (paramt == null)
    {
      AppMethodBeat.o(76488);
      return bool;
    }
    while (true)
    {
      Camera.Parameters localParameters;
      List localList;
      try
      {
        localParameters = paramt.getParameters();
        localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("continuous-picture")))
        {
          ab.i("MicroMsg.MMSightCameraSetting", "support continuous picture");
          localParameters.setFocusMode("continuous-picture");
          paramt.setParameters(localParameters);
          AppMethodBeat.o(76488);
          bool = true;
          break;
        }
        if ((localList == null) || (!localList.contains("continuous-video")))
          break label149;
        ab.i("MicroMsg.MMSightCameraSetting", "support continuous video");
        localParameters.setFocusMode("continuous-video");
        continue;
      }
      catch (Exception paramt)
      {
        ab.i("MicroMsg.MMSightCameraSetting", "setFocusMode Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
        AppMethodBeat.o(76488);
      }
      break;
      label149: if ((localList != null) && (localList.contains("auto")))
      {
        ab.i("MicroMsg.MMSightCameraSetting", "support auto focus");
        localParameters.setFocusMode("auto");
      }
      else
      {
        ab.i("MicroMsg.MMSightCameraSetting", "not support continuous video or auto focus");
      }
    }
  }

  private boolean a(t paramt, int paramInt, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(76484);
    if ((paramt == null) || (paramInt <= 0))
    {
      paramBoolean = false;
      AppMethodBeat.o(76484);
      return paramBoolean;
    }
    while (true)
    {
      try
      {
        Camera.Parameters localParameters = paramt.getParameters();
        new Point(paramInt, (int)(paramInt / paramFloat));
        Object localObject1 = ae.hy(ah.getContext());
        Point localPoint = new android/graphics/Point;
        localPoint.<init>(Math.min(((Point)localObject1).x, ((Point)localObject1).y), Math.max(((Point)localObject1).x, ((Point)localObject1).y));
        ab.i("MicroMsg.MMSightCamera", "screenSize: %s, currentScreenSize: %s", new Object[] { localPoint, localObject1 });
        float f1 = Math.min(localPoint.x, localPoint.y) / Math.max(localPoint.x, localPoint.y);
        float f2 = 1.0F / paramFloat;
        if (paramFloat < 1.0F)
        {
          i = paramInt;
          ab.i("MicroMsg.MMSightCamera", "safeSetPreviewSizeWithLimitAndRatio, shortSize: %s, displayRatio: %s, screenRatio: %s", new Object[] { Integer.valueOf(i), Float.valueOf(paramFloat), Float.valueOf(f1) });
          if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
            continue;
          bool = true;
          Object localObject2 = g.a(localParameters, localPoint, i, bool);
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            if (((g.b)localObject2).oum != null);
          }
          else
          {
            ab.e("MicroMsg.MMSightCamera", "fuck, preview size still null!!");
            if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
              continue;
            bool = true;
            localObject1 = g.c(localParameters, localPoint, paramInt, bool);
            this.oud = false;
          }
          if ((localObject1 != null) && (((g.b)localObject1).oum != null))
          {
            paramInt = (int)(((g.b)localObject1).oum.x * paramFloat);
            ab.i("MicroMsg.MMSightCamera", "safeSetPreviewSizeWithLimitAndRatio result preview size: %s, cropHeight: %s", new Object[] { ((g.b)localObject1).oum, Integer.valueOf(paramInt) });
            if (paramInt > ((g.b)localObject1).oum.y)
              continue;
            this.oud = false;
          }
          if ((localObject1 == null) || (((g.b)localObject1).oum == null))
            continue;
          localObject2 = ((g.b)localObject1).oum;
          this.fav.lZe = ((Point)localObject2).x;
          this.fav.lZf = ((Point)localObject2).y;
          this.otT = ((Point)localObject2);
          this.fbc = null;
          if (!paramBoolean)
          {
            if ((j.ouz.etz != 2) || (com.tencent.mm.plugin.mmsight.d.yO(this.otT.y)))
              break label741;
            paramInt = com.tencent.mm.plugin.mmsight.d.yP(this.otT.y);
            if (Math.abs(paramInt - this.otT.y) > 16)
              break label730;
            ab.i("MicroMsg.MMSightCamera", "padding 16 for encode video best size: %s, alignY: %s", new Object[] { this.otT, Integer.valueOf(paramInt) });
            localObject1 = new android/graphics/Point;
            ((Point)localObject1).<init>(this.otT.x, this.otT.y);
            this.otS = ((Point)localObject1);
            this.otT.y = paramInt;
            this.otW = true;
            this.otV = new byte[this.otT.x * this.otT.y * 3 / 2];
          }
          ab.i("MicroMsg.MMSightCameraSetting", "final set camera preview size: %s, encodeVideoBestSize: %s, cropSize: %s, cropWidth: %s", new Object[] { localObject2, this.otT, this.fbc, Boolean.valueOf(this.oud) });
          localParameters.setPreviewSize(this.fav.lZe, this.fav.lZf);
          paramt.setParameters(localParameters);
          paramBoolean = true;
          AppMethodBeat.o(76484);
          break;
        }
        f2 = paramInt / f2;
        int i = Math.round(f2);
        continue;
        boolean bool = false;
        continue;
        bool = false;
        continue;
        this.oud = true;
        continue;
      }
      catch (Exception paramt)
      {
        ab.e("MicroMsg.MMSightCamera", "safeSetPreviewSizeWithLimit error: %s", new Object[] { paramt.getMessage() });
        paramBoolean = false;
        AppMethodBeat.o(76484);
      }
      break;
      label730: j.d(this.otT);
      continue;
      label741: j.d(this.otT);
    }
  }

  private static boolean a(t paramt, boolean paramBoolean)
  {
    AppMethodBeat.i(76486);
    if (paramt == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(76486);
      return paramBoolean;
    }
    Camera.Parameters localParameters;
    label144: label239: List localList2;
    label260: 
    do
    {
      while (true)
      {
        try
        {
          localParameters = paramt.getParameters();
          if (!paramBoolean)
            break label239;
          if (q.etc.eri > 0)
          {
            ab.i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview frame rate");
            ab.i("MicroMsg.MMSightCameraSetting", "use fix mode %B, supported preview frame rates %s", new Object[] { Boolean.valueOf(paramBoolean), localParameters.getSupportedPreviewFrameRates() });
            paramt.setParameters(localParameters);
            paramBoolean = true;
            AppMethodBeat.o(76486);
            break;
          }
          if (localParameters != null)
            break label144;
          ab.e("MicroMsg.MMSightCamera", "trySetPreviewFrameRateParameters error, p is null!");
          continue;
        }
        catch (Exception paramt)
        {
          ab.i("MicroMsg.MMSightCameraSetting", "setPreviewFrameRate Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
          paramBoolean = false;
          AppMethodBeat.o(76486);
        }
        break;
        try
        {
          List localList1 = localParameters.getSupportedPreviewFrameRates();
          if ((localList1 == null) || (localList1.size() <= 0))
            continue;
          i = Math.min(30, ((Integer)Collections.max(localList1)).intValue());
          localParameters.setPreviewFrameRate(i);
          ab.i("MicroMsg.MMSightCameraSetting", "set preview frame rate %d", new Object[] { Integer.valueOf(i) });
        }
        catch (Exception localException1)
        {
          ab.i("MicroMsg.MMSightCameraSetting", "trySetPreviewFrameRateParameters Exception, %s, %s", new Object[] { Looper.myLooper(), localException1.getMessage() });
        }
        continue;
        if (q.etc.eri <= 0)
          break label260;
        ab.i("MicroMsg.MMSightCameraSetting", "set frame rate > 0, do not try set preview fps range");
      }
      localList2 = localParameters.getSupportedPreviewFpsRange();
    }
    while ((localList2 == null) || (localList2.size() == 0));
    int i = -2147483648;
    int j = -2147483648;
    int k = 0;
    int m = localList2.size();
    int n = 0;
    label302: int i1;
    int i2;
    int i6;
    if (n < m)
    {
      int[] arrayOfInt = (int[])localList2.get(n);
      i1 = j;
      i2 = i;
      if (arrayOfInt == null)
        break label625;
      i1 = j;
      i2 = i;
      if (arrayOfInt.length <= 1)
        break label625;
      int i3 = arrayOfInt[0];
      int i4 = arrayOfInt[1];
      ab.i("MicroMsg.MMSightCamera", "dkfps %d:[%d %d]", new Object[] { Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(i4) });
      i1 = j;
      i2 = i;
      if (i3 < 0)
        break label625;
      i1 = j;
      i2 = i;
      if (i4 < i3)
        break label625;
      int i5 = j;
      i6 = i;
      if (i4 >= j)
      {
        i5 = j;
        i6 = i;
        if (k == 0)
        {
          i5 = i4;
          i6 = i3;
        }
      }
      i1 = i5;
      i2 = i6;
      if (i4 < 30000)
        break label625;
      k = 1;
      i = i6;
      j = i5;
      i6 = k;
    }
    while (true)
    {
      while (true)
      {
        n++;
        k = i6;
        break label302;
        ab.i("MicroMsg.MMSightCameraSetting", "dkfps get fit  [%d %d], max target fps %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(30) });
        if ((i == 2147483647) || (j == 2147483647))
          break;
        try
        {
          localParameters.setPreviewFpsRange(i, j);
          ab.i("MicroMsg.MMSightCameraSetting", "set fps range %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        }
        catch (Exception localException2)
        {
          ab.i("MicroMsg.MMSightCameraSetting", "trySetPreviewFpsRangeParameters Exception, %s, %s", new Object[] { Looper.myLooper(), localException2.getMessage() });
        }
      }
      break;
      label625: i6 = k;
      j = i1;
      i = i2;
    }
  }

  private static boolean b(t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(76487);
    if (paramt == null)
      AppMethodBeat.o(76487);
    while (true)
    {
      return bool;
      try
      {
        ab.i("MicroMsg.MMSightCameraSetting", "safeSetPreviewFormat");
        Camera.Parameters localParameters = paramt.getParameters();
        List localList = localParameters.getSupportedPreviewFormats();
        if ((localList == null) || (!localList.contains(Integer.valueOf(17))))
          ab.e("MicroMsg.MMSightCameraSetting", "not support YCbCr_420_SP");
        localParameters.setPreviewFormat(17);
        paramt.setParameters(localParameters);
        AppMethodBeat.o(76487);
        bool = true;
      }
      catch (Exception paramt)
      {
        ab.i("MicroMsg.MMSightCameraSetting", "setPreviewFormat Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
        AppMethodBeat.o(76487);
      }
    }
  }

  private boolean b(t paramt, boolean paramBoolean)
  {
    AppMethodBeat.i(76483);
    if (paramt == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(76483);
      return paramBoolean;
    }
    Camera.Parameters localParameters;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i;
    boolean bool;
    while (true)
    {
      try
      {
        localParameters = paramt.getParameters();
        localObject1 = com.tencent.mm.plugin.mmsight.d.eu(this.mContext);
        if (this.fas)
        {
          localObject2 = a.bPi();
          localObject3 = localParameters.getSupportedPreviewSizes();
          localObject4 = localParameters.getSupportedPictureSizes();
          i = this.fbb.rotate;
          if (bo.isNullOrNil(((a)localObject2).otj))
            ((a)localObject2).otj = com.tencent.mm.plugin.mmsight.d.cp((List)localObject3);
          if (bo.isNullOrNil(((a)localObject2).otk))
            ((a)localObject2).otk = com.tencent.mm.plugin.mmsight.d.cp((List)localObject4);
          ((a)localObject2).rotate = i;
          ((a)localObject2).otE = 1;
          if (paramBoolean)
          {
            if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
              break label470;
            bool = true;
            j.a(localParameters, bool);
          }
          com.tencent.mm.plugin.mmsight.model.a.k.bPR();
          i = com.tencent.mm.plugin.mmsight.model.a.k.bPU();
          if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
            break label476;
          bool = true;
          localObject3 = g.a(localParameters, (Point)localObject1, i, bool);
          if (localObject3 != null)
          {
            localObject2 = localObject3;
            if (((g.b)localObject3).oum != null);
          }
          else
          {
            ab.e("MicroMsg.MMSightCamera", "fuck, preview size still null!!");
            localObject2 = new android/graphics/Point;
            ((Point)localObject2).<init>(Math.min(((Point)localObject1).x, ((Point)localObject1).y), Math.max(((Point)localObject1).x, ((Point)localObject1).y));
            if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
              break label482;
            bool = true;
            localObject2 = g.c(localParameters, (Point)localObject2, 2100, bool);
            this.oud = false;
          }
          j.a((g.b)localObject2);
          localObject3 = ((g.b)localObject2).oum;
          if (localObject3 != null)
            break label488;
          k.bPD();
          paramBoolean = false;
          AppMethodBeat.o(76483);
          break;
        }
        localObject3 = a.bPi();
        localObject2 = localParameters.getSupportedPreviewSizes();
        localObject4 = localParameters.getSupportedPictureSizes();
        i = this.fbb.rotate;
        if (bo.isNullOrNil(((a)localObject3).otl))
          ((a)localObject3).otl = com.tencent.mm.plugin.mmsight.d.cp((List)localObject2);
        if (bo.isNullOrNil(((a)localObject3).otm))
          ((a)localObject3).otm = com.tencent.mm.plugin.mmsight.d.cp((List)localObject4);
        ((a)localObject3).rotate = i;
        ((a)localObject3).otE = 2;
        continue;
      }
      catch (Exception paramt)
      {
        ab.i("MicroMsg.MMSightCameraSetting", "setPreviewSize Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
        paramBoolean = false;
        AppMethodBeat.o(76483);
      }
      break;
      label470: bool = false;
      continue;
      label476: bool = false;
      continue;
      label482: bool = false;
    }
    label488: this.fav.lZe = ((Point)localObject3).x;
    this.fav.lZf = ((Point)localObject3).y;
    this.otT = ((Point)localObject3);
    Object localObject1 = this.mContext;
    if ((this.fbb.rotate == 90) || (this.fbb.rotate == 270))
    {
      bool = true;
      label552: bool = com.tencent.mm.plugin.mmsight.d.a((Context)localObject1, (Point)localObject3, bool);
      i = 1;
      if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
        break label1336;
      if ((((Point)localObject3).y < this.ouc.width) || (((Point)localObject3).x < this.ouc.height))
      {
        i = 0;
        ab.w("MicroMsg.MMSightCamera", "previewSize %s not support real scale", new Object[] { localObject3 });
      }
      label642: ab.i("MicroMsg.MMSightCameraSetting", "checkIfNeedUsePreviewLarge, needCrop: %s", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        break label1422;
      if (j.ouz.etz != 2)
        break label1410;
      this.fbc = ((g.b)localObject2).ouo;
      if ((this.fbc.x < ((Point)localObject3).x) || (this.fbc.y < ((Point)localObject3).y))
      {
        if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
          break label1390;
        this.fbc.y = com.tencent.mm.plugin.mmsight.d.yQ(this.fbc.y);
      }
      label759: localObject2 = new android/graphics/Point;
      ((Point)localObject2).<init>(this.fbc.x, this.fbc.y);
      this.otT = ((Point)localObject2);
      this.otU = (this.fbc.x * this.fbc.y * 3 / 2);
      ab.i("MicroMsg.MMSightCameraSetting", "cropSize: %s", new Object[] { this.fbc });
    }
    label832: label977: label2013: label2530: 
    while (true)
    {
      int j;
      int k;
      if (j.ouz.ouM)
      {
        if ((this.fbb.rotate != 90) && (this.fbb.rotate != 270))
          break label2054;
        if (i != 0)
        {
          if (j.ouz.fay != 1080)
            break label1871;
          if (this.fbc != null)
            break label1819;
          j = ((Point)localObject3).x / 2;
          if (this.fbc != null)
            break label1833;
          i = ((Point)localObject3).y / 2;
          localObject2 = new android/graphics/Point;
          if (this.fbc != null)
            break label1847;
          k = ((Point)localObject3).x;
          k = com.tencent.mm.plugin.mmsight.d.ev(j, k);
          if (this.fbc != null)
            break label1859;
          j = ((Point)localObject3).y;
          ((Point)localObject2).<init>(k, com.tencent.mm.plugin.mmsight.d.ev(i, j));
          this.otT = ((Point)localObject2);
        }
      }
      localObject2 = a.bPi();
      localObject1 = this.fbc;
      localObject4 = this.otT;
      ((a)localObject2).ots = -1;
      ((a)localObject2).otr = -1;
      ((a)localObject2).oto = -1;
      ((a)localObject2).otn = -1;
      ((a)localObject2).otq = -1;
      ((a)localObject2).otp = -1;
      if (localObject3 != null)
      {
        ((a)localObject2).otp = ((Point)localObject3).x;
        ((a)localObject2).otq = ((Point)localObject3).y;
      }
      if (localObject1 != null)
      {
        ((a)localObject2).otn = ((Point)localObject1).x;
        ((a)localObject2).oto = ((Point)localObject1).y;
      }
      if (localObject4 != null)
      {
        ((a)localObject2).otr = ((Point)localObject4).x;
        ((a)localObject2).ots = ((Point)localObject4).y;
      }
      if (paramBoolean)
        if ((!bool) && (j.ouz.etz == 2) && (!com.tencent.mm.plugin.mmsight.d.yO(this.otT.y)))
        {
          i = com.tencent.mm.plugin.mmsight.d.yP(this.otT.y);
          if (Math.abs(i - this.otT.y) <= 16)
          {
            ab.i("MicroMsg.MMSightCamera", "padding 16 for encode video best size: %s, alignY: %s", new Object[] { this.otT, Integer.valueOf(i) });
            localObject2 = new android/graphics/Point;
            ((Point)localObject2).<init>(this.otT.x, this.otT.y);
            this.otS = ((Point)localObject2);
            this.otT.y = i;
            this.otW = true;
            this.otV = new byte[this.otT.x * this.otT.y * 3 / 2];
          }
        }
      while (true)
      {
        ab.i("MicroMsg.MMSightCameraSetting", "final set camera preview size: %s, encodeVideoBestSize: %s, cropSize: %s", new Object[] { localObject3, this.otT, this.fbc });
        localParameters.setPreviewSize(this.fav.lZe, this.fav.lZf);
        paramt.setParameters(localParameters);
        paramBoolean = true;
        AppMethodBeat.o(76483);
        break;
        bool = false;
        break label552;
        if ((((Point)localObject3).x >= this.ouc.width) && (((Point)localObject3).y >= this.ouc.height))
          break label642;
        i = 0;
        ab.w("MicroMsg.MMSightCamera", "previewSize %s not support real scale", new Object[] { localObject3 });
        break label642;
        label1390: this.fbc.x = com.tencent.mm.plugin.mmsight.d.yQ(this.fbc.x);
        break label759;
        this.fbc = ((g.b)localObject2).oun;
        break label759;
        if ((!j.ouz.ouM) || (j.ouz.fay != 1080) || (i == 0))
          break label2530;
        if ((this.fbb.rotate == 90) || (this.fbb.rotate == 270))
        {
          m = ((Point)localObject3).y / 2;
          n = com.tencent.mm.plugin.mmsight.d.yP(m);
          k = ((Point)localObject3).x / 2;
          j = com.tencent.mm.plugin.mmsight.d.yP(k);
          if ((Math.abs(n - m) >= 8) || (Math.abs(j - k) >= 8))
          {
            localObject2 = new android/graphics/Point;
            ((Point)localObject2).<init>(((Point)localObject3).x, ((Point)localObject3).y);
            this.fbc = ((Point)localObject2);
            this.fbc.y = com.tencent.mm.plugin.mmsight.d.yQ(((Point)localObject3).y);
            this.fbc.x = com.tencent.mm.plugin.mmsight.d.yQ(((Point)localObject3).x);
            localObject2 = new android/graphics/Point;
            ((Point)localObject2).<init>(this.fbc.x, this.fbc.y);
            this.otT = ((Point)localObject2);
            this.otU = (this.fbc.x * this.fbc.y * 3 / 2);
            bool = true;
          }
          break label832;
        }
        j = ((Point)localObject3).x / 2;
        int n = com.tencent.mm.plugin.mmsight.d.yP(j);
        int m = ((Point)localObject3).y / 2;
        k = com.tencent.mm.plugin.mmsight.d.yP(m);
        if ((Math.abs(n - j) < 8) && (Math.abs(k - m) < 8))
          break label2530;
        localObject2 = new android/graphics/Point;
        ((Point)localObject2).<init>(((Point)localObject3).x, ((Point)localObject3).y);
        this.fbc = ((Point)localObject2);
        this.fbc.y = com.tencent.mm.plugin.mmsight.d.yQ(((Point)localObject3).x);
        this.fbc.x = com.tencent.mm.plugin.mmsight.d.yQ(((Point)localObject3).y);
        localObject2 = new android/graphics/Point;
        ((Point)localObject2).<init>(this.fbc.x, this.fbc.y);
        this.otT = ((Point)localObject2);
        this.otU = (this.fbc.x * this.fbc.y * 3 / 2);
        bool = true;
        break label832;
        j = this.fbc.x / 2;
        break label899;
        i = this.fbc.y / 2;
        break label915;
        k = this.fbc.x;
        break label934;
        j = this.fbc.y;
        break label957;
        if (j.ouz.fay != 720)
          break label977;
        float f;
        if (this.fbc == null)
        {
          f = ((Point)localObject3).x * 0.75F;
          label1902: k = (int)f;
          if (this.fbc != null)
            break label2013;
          f = ((Point)localObject3).y * 0.75F;
          j = (int)f;
          localObject2 = new android/graphics/Point;
          if (this.fbc != null)
            break label2030;
          i = ((Point)localObject3).x;
          k = com.tencent.mm.plugin.mmsight.d.ev(k, i);
          if (this.fbc != null)
            break label2042;
        }
        label2030: label2042: for (i = ((Point)localObject3).y; ; i = this.fbc.y)
        {
          ((Point)localObject2).<init>(k, com.tencent.mm.plugin.mmsight.d.ev(j, i));
          this.otT = ((Point)localObject2);
          break;
          f = this.fbc.x * 0.75F;
          break label1902;
          f = this.fbc.y * 0.75F;
          break label1926;
          i = this.fbc.x;
          break label1950;
        }
        if (i == 0)
          break label977;
        if (j.ouz.fay == 1080)
        {
          if (this.fbc == null)
          {
            j = ((Point)localObject3).y / 2;
            if (this.fbc != null)
              break label2182;
            i = ((Point)localObject3).x / 2;
            localObject2 = new android/graphics/Point;
            if (this.fbc != null)
              break label2196;
            k = ((Point)localObject3).y;
            k = com.tencent.mm.plugin.mmsight.d.ev(j, k);
            if (this.fbc != null)
              break label2208;
          }
          for (j = ((Point)localObject3).x; ; j = this.fbc.x)
          {
            ((Point)localObject2).<init>(k, com.tencent.mm.plugin.mmsight.d.ev(i, j));
            this.otT = ((Point)localObject2);
            break;
            j = this.fbc.y / 2;
            break label2087;
            i = this.fbc.x / 2;
            break label2103;
            k = this.fbc.y;
            break label2122;
          }
        }
        if (j.ouz.fay != 720)
          break label977;
        if (this.fbc == null)
        {
          f = ((Point)localObject3).y * 0.75F;
          k = (int)f;
          if (this.fbc != null)
            break label2362;
          f = ((Point)localObject3).x * 0.75F;
          label2275: j = (int)f;
          localObject2 = new android/graphics/Point;
          if (this.fbc != null)
            break label2379;
          i = ((Point)localObject3).y;
          label2299: k = com.tencent.mm.plugin.mmsight.d.ev(k, i);
          if (this.fbc != null)
            break label2391;
        }
        for (i = ((Point)localObject3).x; ; i = this.fbc.x)
        {
          ((Point)localObject2).<init>(k, com.tencent.mm.plugin.mmsight.d.ev(j, i));
          this.otT = ((Point)localObject2);
          break;
          f = this.fbc.y * 0.75F;
          break label2251;
          f = this.fbc.x * 0.75F;
          break label2275;
          i = this.fbc.y;
          break label2299;
        }
        j.d(this.otT);
        continue;
        j.d(this.otT);
        continue;
        if ((!bool) && (j.ouz.etz == 2) && (!com.tencent.mm.plugin.mmsight.d.yO(this.otT.y)) && (this.otW) && (this.otV != null) && (this.otS.y == this.otT.y))
        {
          i = com.tencent.mm.plugin.mmsight.d.yP(this.otT.y);
          if (this.otV.length == this.otT.x * i * 3 / 2)
            this.otT.y = i;
        }
      }
    }
  }

  private void bPl()
  {
    AppMethodBeat.i(76482);
    try
    {
      if ((this.bCW != null) && (this.otO != null))
        this.bCW.unregisterListener(this);
      ab.i("MicroMsg.MMSightCamera", this.fbf.getValue());
      ab.i("MicroMsg.MMSightCamera", this.fbg.getValue());
      ab.i("MicroMsg.MMSightCamera", this.fbh.getValue());
      ab.i("MicroMsg.MMSightCamera", this.fbi.getValue());
      ab.i("MicroMsg.MMSightCamera", this.oub.getValue());
      ab.i("MicroMsg.MMSightCamera", this.fbj.getValue());
      if (this.erH != null)
      {
        long l = bo.yz();
        ab.i("MicroMsg.MMSightCamera", "release camera beg, %s", new Object[] { Looper.myLooper() });
        this.oug.removeCallbacksAndMessages(null);
        this.oug.faJ = true;
        this.erH.setPreviewCallback(null);
        this.erH.stopPreview();
        this.erH.release();
        this.erH = null;
        this.otL = false;
        ab.i("MicroMsg.MMSightCamera", "release camera end, use %dms, %s", new Object[] { Long.valueOf(bo.az(l)), Looper.myLooper() });
      }
      this.faH = false;
      this.otP = 0.0F;
      this.otQ = 0.0F;
      this.otR = 0.0F;
      ouf = true;
      this.mContext = null;
      this.oue = false;
      this.otT = null;
      this.fbc = null;
      this.fbl = null;
      this.otZ = false;
      AppMethodBeat.o(76482);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMSightCamera", localException, "cameraRelease error", new Object[0]);
        AppMethodBeat.o(76482);
      }
    }
  }

  @TargetApi(14)
  private static boolean c(t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(76485);
    if (paramt == null)
      AppMethodBeat.o(76485);
    while (true)
    {
      return bool;
      try
      {
        ab.i("MicroMsg.MMSightCameraSetting", "safeSetMetering");
        Camera.Parameters localParameters = paramt.getParameters();
        if (localParameters.getMaxNumMeteringAreas() > 0)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          Rect localRect = new android/graphics/Rect;
          localRect.<init>(-1000, -1000, 1000, 1000);
          Camera.Area localArea = new android/hardware/Camera$Area;
          localArea.<init>(localRect, 600);
          localArrayList.add(localArea);
          localParameters.setMeteringAreas(localArrayList);
        }
        paramt.setParameters(localParameters);
        AppMethodBeat.o(76485);
        bool = true;
      }
      catch (Exception paramt)
      {
        ab.i("MicroMsg.MMSightCameraSetting", "safeSetMetering Exception, %s, %s", new Object[] { Looper.myLooper(), paramt.getMessage() });
        AppMethodBeat.o(76485);
      }
    }
  }

  private static void d(t paramt)
  {
    AppMethodBeat.i(76494);
    try
    {
      Camera.Parameters localParameters = paramt.getParameters();
      if (localParameters.isZoomSupported())
        localParameters.setZoom(0);
      paramt.setParameters(localParameters);
      AppMethodBeat.o(76494);
      return;
    }
    catch (Exception paramt)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightCamera", "safeResetZoom error: %s", new Object[] { paramt.getMessage() });
        AppMethodBeat.o(76494);
      }
    }
  }

  public final int a(SurfaceTexture paramSurfaceTexture, int paramInt, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(76493);
    long l = bo.yz();
    this.otZ = false;
    ab.i("MicroMsg.MMSightCamera", "start preview, previewing %B, %s %s", new Object[] { Boolean.valueOf(this.otL), Looper.myLooper(), paramSurfaceTexture });
    if (this.otL)
    {
      paramInt = 0;
      AppMethodBeat.o(76493);
    }
    while (true)
    {
      return paramInt;
      if (paramSurfaceTexture != null)
        break;
      paramInt = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(76493);
    }
    ab.i("MicroMsg.MMSightCamera", "this texture %s", new Object[] { paramSurfaceTexture });
    while (true)
    {
      try
      {
        a(this.erH, paramInt, paramFloat, paramBoolean);
        if (com.tencent.mm.plugin.mmsight.model.a.k.bPR().owm == null)
          break label693;
        localInteger = Integer.valueOf(com.tencent.mm.plugin.mmsight.model.a.k.bPR().owm.osS);
        if (q.etc.ern == 1)
        {
          str = "Range";
          if (q.etc.ero != 1)
            continue;
          paramBoolean = true;
          if (q.etc.erp != 1)
            continue;
          bool1 = true;
          if (q.etc.erq != 1)
            continue;
          bool2 = true;
          if (q.etc.err != 1)
            continue;
          bool3 = true;
          ab.i("MicroMsg.MMSightCamera", "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", new Object[] { localInteger, str, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          if ((q.etc.ern != 1) || ((localInteger.intValue() != 0) && (localInteger.intValue() != 1)))
            continue;
          a(this.erH, false);
          if ((q.etc.ero == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 2)))
            b(this.erH);
          if ((q.etj.etH != -1) && (q.etj.etH == 1) && (com.tencent.mm.compatible.util.d.iX(14)))
            c(this.erH);
          if ((q.etc.erq == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 4)))
            a(this.erH);
          if ((q.etc.err == 1) && (localInteger.intValue() != 0))
            localInteger.intValue();
          d(this.erH);
          Ws();
          this.erH.setPreviewTexture(paramSurfaceTexture);
          this.erH.startPreview();
          if (!j.ouz.ouN)
            break label676;
          if ((q.etc.erq == 0) && (this.bCW != null) && (this.otO != null))
            this.bCW.registerListener(this, this.otO, 2);
          this.otL = true;
          ab.i("MicroMsg.MMSightCamera", "start preview end, use %dms %s", new Object[] { Long.valueOf(bo.az(l)), Looper.myLooper() });
          paramInt = 0;
          AppMethodBeat.o(76493);
          break;
        }
        if (q.etc.erm == 1)
        {
          str = "Fix";
          continue;
        }
        String str = "Error";
        continue;
        paramBoolean = false;
        continue;
        boolean bool1 = false;
        continue;
        boolean bool2 = false;
        continue;
        boolean bool3 = false;
        continue;
        if ((q.etc.erm != 1) || ((localInteger.intValue() != 0) && (localInteger.intValue() != 5)))
          continue;
        a(this.erH, true);
        continue;
      }
      catch (Exception paramSurfaceTexture)
      {
        ab.e("MicroMsg.MMSightCamera", "start preview FAILED, %s, %s", new Object[] { Looper.myLooper(), paramSurfaceTexture.getMessage() });
        paramInt = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(76493);
      }
      break;
      label676: this.bCW.registerListener(this, this.otO, 2);
      continue;
      label693: Integer localInteger = Integer.valueOf(0);
    }
  }

  @TargetApi(11)
  public final int a(SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(76492);
    long l = bo.yz();
    this.otZ = false;
    ab.i("MicroMsg.MMSightCamera", "start preview, previewing %B, %s %s autoConfig %s", new Object[] { Boolean.valueOf(this.otL), Looper.myLooper(), paramSurfaceTexture, Boolean.valueOf(paramBoolean) });
    if (this.otL)
      AppMethodBeat.o(76492);
    while (true)
    {
      return i;
      if (paramSurfaceTexture != null)
        break;
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(76492);
    }
    ab.i("MicroMsg.MMSightCamera", "this texture %s", new Object[] { paramSurfaceTexture });
    while (true)
    {
      try
      {
        b(this.erH, paramBoolean);
        if (com.tencent.mm.plugin.mmsight.model.a.k.bPR().owm == null)
          break label692;
        localInteger = Integer.valueOf(com.tencent.mm.plugin.mmsight.model.a.k.bPR().owm.osS);
        if (q.etc.ern == 1)
        {
          str = "Range";
          if (q.etc.ero != 1)
            continue;
          paramBoolean = true;
          if (q.etc.erp != 1)
            continue;
          bool1 = true;
          if (q.etc.erq != 1)
            continue;
          bool2 = true;
          if (q.etc.err != 1)
            continue;
          bool3 = true;
          ab.i("MicroMsg.MMSightCamera", "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", new Object[] { localInteger, str, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          if ((q.etc.ern != 1) || ((localInteger.intValue() != 0) && (localInteger.intValue() != 1)))
            continue;
          a(this.erH, false);
          if ((q.etc.ero == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 2)))
            b(this.erH);
          if ((q.etj.etH != -1) && (q.etj.etH == 1) && (com.tencent.mm.compatible.util.d.iX(14)))
            c(this.erH);
          if ((q.etc.erq == 1) && ((localInteger.intValue() == 0) || (localInteger.intValue() == 4)))
            a(this.erH);
          if ((q.etc.err == 1) && (localInteger.intValue() != 0))
            localInteger.intValue();
          d(this.erH);
          Ws();
          this.erH.setPreviewTexture(paramSurfaceTexture);
          this.erH.startPreview();
          if (!j.ouz.ouN)
            break label675;
          if ((q.etc.erq == 0) && (this.bCW != null) && (this.otO != null))
            this.bCW.registerListener(this, this.otO, 2);
          this.otL = true;
          ab.i("MicroMsg.MMSightCamera", "start preview end, use %dms %s", new Object[] { Long.valueOf(bo.az(l)), Looper.myLooper() });
          AppMethodBeat.o(76492);
          break;
        }
        if (q.etc.erm == 1)
        {
          str = "Fix";
          continue;
        }
        String str = "Error";
        continue;
        paramBoolean = false;
        continue;
        boolean bool1 = false;
        continue;
        boolean bool2 = false;
        continue;
        boolean bool3 = false;
        continue;
        if ((q.etc.erm != 1) || ((localInteger.intValue() != 0) && (localInteger.intValue() != 5)))
          continue;
        a(this.erH, true);
        continue;
      }
      catch (Exception paramSurfaceTexture)
      {
        ab.e("MicroMsg.MMSightCamera", "start preview FAILED, %s, %s", new Object[] { Looper.myLooper(), paramSurfaceTexture.getMessage() });
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(76492);
      }
      break;
      label675: this.bCW.registerListener(this, this.otO, 2);
      continue;
      label692: Integer localInteger = Integer.valueOf(0);
    }
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(76481);
    this.oua = parama;
    a locala;
    String str;
    com.tencent.mm.plugin.base.model.a locala1;
    if (parama == a.ouk)
    {
      locala = a.bPi();
      parama = this.fbg.bPk();
      str = this.fbf.bPk();
      locala1 = this.otX;
      if (locala1.jDj != 0)
        break label94;
    }
    label94: for (int i = 0; ; i = locala1.jDi / locala1.jDj)
    {
      locala.ott = ((int)(bo.anm(parama) * 10.0D));
      locala.otu = ((int)(bo.anm(str) * 10.0D));
      locala.otz = i;
      AppMethodBeat.o(76481);
      return;
    }
  }

  public final void a(e.b paramb, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(76497);
    ab.i("MicroMsg.MMSightCamera", "takePicture, callback: %s, currentFrameData: %s, isLandscape: %s, degree: %s", new Object[] { paramb, this.fbl, Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.fbl != null);
    while (true)
    {
      try
      {
        this.fbk = true;
        localPoint = new android/graphics/Point;
        localPoint.<init>();
        if (this.fbc != null)
        {
          localPoint.x = this.fbc.x;
          localPoint.y = this.fbc.y;
          byte[] arrayOfByte = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(this.fbl.length));
          System.arraycopy(this.fbl, 0, arrayOfByte, 0, this.fbl.length);
          int i = this.fbb.rotate;
          paramb.a(arrayOfByte, localPoint.x, localPoint.y, i, paramInt);
          return;
        }
        if ((this.otV != null) && (this.otW))
        {
          localPoint.x = this.otT.x;
          localPoint.y = this.otT.y;
          continue;
        }
      }
      catch (Exception localException)
      {
        Point localPoint;
        ab.e("MicroMsg.MMSightCamera", "takePicture error: %s", new Object[] { localException.getMessage() });
        this.fbk = false;
        paramb.a(null, 0, 0, -1, 0);
        this.fbk = false;
        AppMethodBeat.o(76497);
        continue;
        localPoint.x = this.fav.lZe;
        localPoint.y = this.fav.lZf;
        continue;
      }
      finally
      {
        this.fbk = false;
        AppMethodBeat.o(76497);
      }
      paramb.a(null, 0, 0, -1, 0);
      AppMethodBeat.o(76497);
    }
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(76479);
    if (paramf != null)
      this.faZ.add(paramf);
    AppMethodBeat.o(76479);
  }

  public final boolean a(Context paramContext, SurfaceTexture paramSurfaceTexture, int paramInt, float paramFloat, boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(76505);
    ab.i("MicroMsg.MMSightCamera", "switch camera with limit, current useBack: %s", new Object[] { Boolean.valueOf(this.fas) });
    try
    {
      bPq();
      if (!this.fas);
      for (boolean bool2 = true; ; bool2 = false)
      {
        v(paramContext, bool2);
        a(paramSurfaceTexture, paramInt, paramFloat, paramBoolean);
        AppMethodBeat.o(76505);
        paramBoolean = bool1;
        return paramBoolean;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightCamera", "switchCamera error: %s", new Object[] { paramContext });
        AppMethodBeat.o(76505);
        paramBoolean = false;
      }
    }
  }

  public final boolean a(Context paramContext, SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(76504);
    ab.i("MicroMsg.MMSightCamera", "switch camera, current useBack: %s", new Object[] { Boolean.valueOf(this.fas) });
    try
    {
      bPq();
      if (!this.fas);
      for (boolean bool2 = true; ; bool2 = false)
      {
        v(paramContext, bool2);
        a(paramSurfaceTexture, paramBoolean);
        AppMethodBeat.o(76504);
        paramBoolean = bool1;
        return paramBoolean;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightCamera", "switchCamera error: %s", new Object[] { paramContext });
        AppMethodBeat.o(76504);
        paramBoolean = false;
      }
    }
  }

  public final void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76499);
    if (com.tencent.mm.compatible.util.d.fP(14))
      AppMethodBeat.o(76499);
    while (true)
    {
      return;
      this.oug.removeMessages(4354);
      this.oug.faK = paramFloat1;
      this.oug.faL = paramFloat2;
      this.oug.faM = paramInt1;
      this.oug.faN = paramInt2;
      this.oug.sendMessageDelayed(this.oug.obtainMessage(4354, this.erH), 400L);
      AppMethodBeat.o(76499);
    }
  }

  public final void b(f paramf)
  {
    AppMethodBeat.i(76480);
    if (paramf != null)
      this.faZ.remove(paramf);
    AppMethodBeat.o(76480);
  }

  public final void bPm()
  {
    AppMethodBeat.i(76489);
    ab.i("MicroMsg.MMSightCamera", "switchToVideoFocusMode");
    if ((this.erH != null) && (this.otL));
    while (true)
    {
      try
      {
        Camera.Parameters localParameters = this.erH.getParameters();
        List localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("continuous-video")))
        {
          ab.i("MicroMsg.MMSightCameraSetting", "support continuous video");
          localParameters.setFocusMode("continuous-video");
        }
        this.erH.setParameters(localParameters);
        AppMethodBeat.o(76489);
        return;
      }
      catch (Exception localException)
      {
        ab.i("MicroMsg.MMSightCamera", "switchToVideoFocusMode error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(76489);
    }
  }

  public final void bPn()
  {
    AppMethodBeat.i(76490);
    ab.i("MicroMsg.MMSightCamera", "switchToPictureFocusMode");
    if ((this.erH != null) && (this.otL));
    while (true)
    {
      try
      {
        Camera.Parameters localParameters = this.erH.getParameters();
        List localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("continuous-picture")))
        {
          ab.i("MicroMsg.MMSightCameraSetting", "support continuous picture");
          localParameters.setFocusMode("continuous-picture");
        }
        this.erH.setParameters(localParameters);
        AppMethodBeat.o(76490);
        return;
      }
      catch (Exception localException)
      {
        ab.i("MicroMsg.MMSightCamera", "switchToPictureFocusMode error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(76490);
    }
  }

  public final String bPo()
  {
    AppMethodBeat.i(76496);
    Object localObject1;
    if (this.erH == null)
    {
      localObject1 = "";
      AppMethodBeat.o(76496);
      return localObject1;
    }
    Object localObject3;
    String str;
    while (true)
    {
      Object localObject2;
      try
      {
        localObject1 = new java/lang/StringBuffer;
        ((StringBuffer)localObject1).<init>();
        localObject2 = com.tencent.mm.plugin.mmsight.d.c(this.erH.getParameters());
        localObject3 = com.tencent.mm.plugin.mmsight.d.eu(this.mContext);
        ((StringBuffer)localObject1).append(String.format("Screen size %d %d r:%.4f\n", new Object[] { Integer.valueOf(((Point)localObject3).x), Integer.valueOf(((Point)localObject3).y), Double.valueOf(((Point)localObject3).x * 1.0D / ((Point)localObject3).y) }));
        localObject3 = ((ArrayList)localObject2).iterator();
        if (!((Iterator)localObject3).hasNext())
          break label320;
        localObject2 = (Camera.Size)((Iterator)localObject3).next();
        if (((getPreviewWidth() != ((Camera.Size)localObject2).width) || (getPreviewHeight() != ((Camera.Size)localObject2).height)) && ((getPreviewWidth() != ((Camera.Size)localObject2).height) || (getPreviewHeight() != ((Camera.Size)localObject2).width)))
          break label263;
        ((StringBuffer)localObject1).append(String.format("%s*%s √ r:%.4f\n", new Object[] { Integer.valueOf(((Camera.Size)localObject2).width), Integer.valueOf(((Camera.Size)localObject2).height), Double.valueOf(((Camera.Size)localObject2).height * 1.0D / ((Camera.Size)localObject2).width) }));
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMSightCamera", "getDebugInfo error: %s", new Object[] { localException.getMessage() });
        str = null;
        AppMethodBeat.o(76496);
      }
      break;
      label263: str.append(String.format("%s*%s X r:%.4f\n", new Object[] { Integer.valueOf(((Camera.Size)localObject2).width), Integer.valueOf(((Camera.Size)localObject2).height), Double.valueOf(((Camera.Size)localObject2).height * 1.0D / ((Camera.Size)localObject2).width) }));
    }
    label320: if (this.fbc != null)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("\nSIGHTCROPMODE:  ");
      str.append(this.fbc.x + " " + this.fbc.y + " from " + this.fav.lZe + " " + this.fav.lZf);
    }
    while (true)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("\ngetOrientation:");
      str.append(getOrientation());
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("\nrecorderOption: ");
      str.append(q.etj.etG);
      str = str.toString();
      AppMethodBeat.o(76496);
      break;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("\nFinalPreviewSize: ");
      str.append(getPreviewWidth() + " " + getPreviewHeight());
    }
  }

  public final void bPp()
  {
    AppMethodBeat.i(76500);
    if ((this.erH != null) && (this.otL));
    try
    {
      Camera.Parameters localParameters = this.erH.getParameters();
      List localList = localParameters.getSupportedFocusModes();
      if ((localList != null) && (localList.contains("auto")))
      {
        ab.i("MicroMsg.MMSightCameraSetting", "support auto focus");
        localParameters.setFocusMode("auto");
        this.erH.setParameters(localParameters);
      }
      this.erH.cancelAutoFocus();
      this.erH.autoFocus(new Camera.AutoFocusCallback()
      {
        public final void onAutoFocus(boolean paramAnonymousBoolean, Camera paramAnonymousCamera)
        {
          AppMethodBeat.i(76470);
          if ((paramAnonymousCamera != null) && (e.this.bPu()));
          while (true)
          {
            try
            {
              Camera.Parameters localParameters = paramAnonymousCamera.getParameters();
              List localList = localParameters.getSupportedFocusModes();
              if ((localList != null) && (localList.contains("continuous-picture")))
              {
                ab.i("MicroMsg.MMSightCameraSetting", "support continues picture focus");
                localParameters.setFocusMode("continuous-picture");
                paramAnonymousCamera.setParameters(localParameters);
              }
              AppMethodBeat.o(76470);
              return;
            }
            catch (Exception paramAnonymousCamera)
            {
              ab.printErrStackTrace("MicroMsg.MMSightCamera", paramAnonymousCamera, "simple auto focus resetToPictureFocus error", new Object[0]);
            }
            AppMethodBeat.o(76470);
          }
        }
      });
      AppMethodBeat.o(76500);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMSightCamera", localException, "simple auto focus error", new Object[0]);
    }
  }

  public final int bPq()
  {
    AppMethodBeat.i(76506);
    bPl();
    AppMethodBeat.o(76506);
    return 0;
  }

  public final void bPr()
  {
    AppMethodBeat.i(76507);
    ab.i("MicroMsg.MMSightCamera", "openFlash, camera: %s, isPreviewing: %s", new Object[] { this.erH, Boolean.valueOf(this.otL) });
    if ((this.erH != null) && (this.otL));
    while (true)
    {
      try
      {
        this.otY = true;
        Camera.Parameters localParameters = this.erH.getParameters();
        if ((!bo.ek(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("torch")))
        {
          localParameters.setFlashMode("torch");
          this.erH.setParameters(localParameters);
          ab.i("MicroMsg.MMSightCamera", "open flash");
          AppMethodBeat.o(76507);
          return;
        }
        ab.i("MicroMsg.MMSightCamera", "camera not support flash!!");
        AppMethodBeat.o(76507);
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MMSightCamera", localException, "openFlash error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(76507);
    }
  }

  public final void bPs()
  {
    AppMethodBeat.i(76508);
    ab.i("MicroMsg.MMSightCamera", "closeFlash, camera: %s, isPreviewing: %s", new Object[] { this.erH, Boolean.valueOf(this.otL) });
    if ((this.erH != null) && (this.otL));
    while (true)
    {
      try
      {
        this.otY = false;
        Camera.Parameters localParameters = this.erH.getParameters();
        if ((!bo.ek(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("off")))
        {
          localParameters.setFlashMode("off");
          this.erH.setParameters(localParameters);
          ab.i("MicroMsg.MMSightCamera", "close flash");
          AppMethodBeat.o(76508);
          return;
        }
        ab.i("MicroMsg.MMSightCamera", "camera not support close flash!!");
        AppMethodBeat.o(76508);
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MMSightCamera", localException, "closeFlash error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(76508);
    }
  }

  public final void bPt()
  {
    AppMethodBeat.i(76509);
    ab.i("MicroMsg.MMSightCamera", "autoFlash, camera: %s, isPreviewing: %s", new Object[] { this.erH, Boolean.valueOf(this.otL) });
    if ((this.erH != null) && (this.otL));
    while (true)
    {
      try
      {
        this.otY = true;
        Camera.Parameters localParameters = this.erH.getParameters();
        if ((!bo.ek(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("auto")))
        {
          localParameters.setFlashMode("auto");
          this.erH.setParameters(localParameters);
          ab.i("MicroMsg.MMSightCamera", "auto flash");
          AppMethodBeat.o(76509);
          return;
        }
        ab.i("MicroMsg.MMSightCamera", "camera not support auto flash!!");
        AppMethodBeat.o(76509);
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MMSightCamera", localException, "autoFlash error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(76509);
    }
  }

  public final boolean bPu()
  {
    return this.otL;
  }

  public final boolean bPv()
  {
    return this.fas;
  }

  public final void d(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(76501);
    if ((this.erH != null) && (this.otL));
    label461: 
    while (true)
    {
      try
      {
        ab.d("MicroMsg.MMSightCamera", "triggerSmallZoom, zoom: %s", new Object[] { Boolean.valueOf(paramBoolean1) });
        if (this.aJI)
        {
          ab.d("MicroMsg.MMSightCamera", "triggerSmallZoom, zooming, ignore");
          return;
        }
        Camera.Parameters localParameters = this.erH.getParameters();
        int i;
        int m;
        if (localParameters.isZoomSupported())
        {
          this.aJI = true;
          i = localParameters.getZoom();
          int j = localParameters.getMaxZoom();
          if (!paramBoolean2)
          {
            if (this.fbe <= 0)
            {
              this.fbe = Math.round(j / 15.0F);
              if (this.fbe > 5)
                this.fbe = 5;
            }
            k = this.fbe;
            ab.d("MicroMsg.MMSightCamera", "triggerSmallZoom, currentZoom: %s, maxZoom: %s, smallZoomStep: %s, scrollSmallZoomStep: %s, factor: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.fbe), Integer.valueOf(this.fbd), Integer.valueOf(paramInt) });
            m = k;
            if (paramInt > 0)
              m = k * paramInt;
            if (!paramBoolean1)
              continue;
            if (i < j)
              continue;
            this.aJI = false;
            AppMethodBeat.o(76501);
            continue;
          }
          if (this.fbd <= 0)
          {
            ab.e("MicroMsg.MMSightCamera", "scroll zoom error, scrollSmallZoomStep: %s", new Object[] { Integer.valueOf(this.fbd) });
            this.aJI = false;
            AppMethodBeat.o(76501);
            continue;
          }
          k = this.fbd;
          continue;
          paramInt = m + i;
          if (paramInt < j)
            break label461;
          paramInt = j;
          ab.d("MicroMsg.MMSightCamera", "triggerSmallZoom, nextZoom: %s", new Object[] { Integer.valueOf(paramInt) });
          localParameters.setZoom(paramInt);
          this.erH.setParameters(localParameters);
        }
        this.aJI = false;
        AppMethodBeat.o(76501);
        continue;
        if (i == 0)
        {
          this.aJI = false;
          AppMethodBeat.o(76501);
          continue;
        }
        int k = i - m;
        paramInt = k;
        if (k > 0)
          continue;
        paramInt = 0;
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMSightCamera", "triggerSmallZoom error: %s", new Object[] { localException.getMessage() });
        this.aJI = false;
        AppMethodBeat.o(76501);
        continue;
      }
      finally
      {
        this.aJI = false;
        AppMethodBeat.o(76501);
      }
      AppMethodBeat.o(76501);
    }
  }

  public final Point getEncodeVideoBestSize()
  {
    return this.otT;
  }

  public final int getOrientation()
  {
    if ((this.fbb != null) && (this.otL));
    for (int i = this.fbb.rotate; ; i = -1)
      return i;
  }

  public final int getPreviewHeight()
  {
    int i = 0;
    AppMethodBeat.i(76511);
    if (this.erH == null)
      AppMethodBeat.o(76511);
    while (true)
    {
      return i;
      if (this.fbb != null)
        try
        {
          int j;
          if ((this.otW) && (this.otV != null))
            if ((this.fbb.rotate == 0) || (this.fbb.rotate == 180))
            {
              j = this.otT.y;
              i = j;
            }
          while (true)
          {
            AppMethodBeat.o(76511);
            break;
            j = this.otT.x;
            i = j;
            continue;
            if (this.fbc == null)
            {
              if ((this.fbb.rotate == 0) || (this.fbb.rotate == 180))
              {
                j = this.fav.lZf;
                i = j;
              }
              else
              {
                j = this.fav.lZe;
                i = j;
              }
            }
            else if ((this.fbb.rotate == 0) || (this.fbb.rotate == 180))
            {
              j = this.fbc.y;
              i = j;
            }
            else
            {
              j = this.fbc.x;
              i = j;
            }
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MMSightCamera", "getPreviewHeight: %s", new Object[] { localException.getMessage() });
        }
      else
        AppMethodBeat.o(76511);
    }
  }

  public final int getPreviewWidth()
  {
    int i = 0;
    AppMethodBeat.i(76510);
    if (this.erH == null)
      AppMethodBeat.o(76510);
    while (true)
    {
      return i;
      if (this.fbb != null)
        try
        {
          int j;
          if ((this.otW) && (this.otV != null))
            if ((this.fbb.rotate == 0) || (this.fbb.rotate == 180))
            {
              j = this.otT.x;
              i = j;
            }
          while (true)
          {
            AppMethodBeat.o(76510);
            break;
            j = this.otT.y;
            i = j;
            continue;
            if (this.fbc == null)
            {
              if ((this.fbb.rotate == 0) || (this.fbb.rotate == 180))
              {
                j = this.fav.lZe;
                i = j;
              }
              else
              {
                j = this.fav.lZf;
                i = j;
              }
            }
            else if ((this.fbb.rotate == 0) || (this.fbb.rotate == 180))
            {
              j = this.fbc.x;
              i = j;
            }
            else
            {
              j = this.fbc.y;
              i = j;
            }
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MMSightCamera", "getPreviewWidth: %s", new Object[] { localException.getMessage() });
        }
      else
        AppMethodBeat.o(76510);
    }
  }

  public final void kj(int paramInt)
  {
    AppMethodBeat.i(76502);
    if (this.fbd > 0)
      AppMethodBeat.o(76502);
    while (true)
    {
      return;
      Point localPoint = ae.hy(ah.getContext());
      int i = localPoint.y;
      ab.i("MicroMsg.MMSightCamera", "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", new Object[] { Integer.valueOf(paramInt), localPoint });
      if (i / 2 >= paramInt)
        AppMethodBeat.o(76502);
      else
        try
        {
          if (this.erH != null)
          {
            i = this.erH.getParameters().getMaxZoom();
            this.fbd = ((int)(i / (paramInt / 3.0D / 10.0D)) + 1);
            ab.i("MicroMsg.MMSightCamera", "scrollSmallZoomStep: %s, maxZoom: %s", new Object[] { Integer.valueOf(this.fbd), Integer.valueOf(i) });
          }
          AppMethodBeat.o(76502);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MMSightCamera", "calcScrollZoomStep error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(76502);
        }
    }
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(76498);
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if ((Math.abs(this.otP - f1) > 5.0F) || (Math.abs(this.otQ - f2) > 5.0F) || (Math.abs(this.otR - f3) > 5.0F))
    {
      ab.i("MicroMsg.MMSightCamera", "match accel limit %f, try auto focus x %s y %s z %s", new Object[] { Float.valueOf(5.0F), Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) });
      this.oug.e(this.erH);
      this.otP = f1;
      this.otQ = f2;
      this.otR = f3;
    }
    AppMethodBeat.o(76498);
  }

  public final boolean v(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(76503);
    if ((!j.ouz.ouN) || ((q.etc.erq == 0) && (this.bCW == null) && (this.otO == null)))
    {
      this.bCW = ((SensorManager)ah.getContext().getSystemService("sensor"));
      this.otO = this.bCW.getDefaultSensor(1);
    }
    if (this.erH == null)
    {
      bPl();
      this.fas = paramBoolean;
      if (!paramBoolean);
    }
    while (true)
    {
      try
      {
        this.otM = com.tencent.mm.compatible.e.d.Lr();
        ab.i("MicroMsg.MMSightCamera", "use camera id %d, DeviceInfo id %d", new Object[] { Integer.valueOf(this.otM), Integer.valueOf(q.etc.ert) });
        this.oue = false;
        this.mContext = paramContext;
        this.fbb = new n().R(paramContext, this.otM);
        ab.i("MicroMsg.MMSightCamera", "open camera end, %s", new Object[] { Looper.myLooper() });
        if (this.fbb == null)
        {
          ab.i("MicroMsg.MMSightCamera", "open camera FAILED, %s", new Object[] { Looper.myLooper() });
          Wf();
          AppMethodBeat.o(76503);
          paramBoolean = false;
          return paramBoolean;
          this.otM = com.tencent.mm.compatible.e.d.Ls();
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MMSightCamera", localException, "try to get cameraid error %s, useBackCamera: %s", new Object[] { localException.getMessage(), Boolean.valueOf(this.fas) });
        this.otM = 0;
        continue;
        this.erH = this.fbb.erH;
        this.oug.faJ = false;
        this.fav.rotate = this.fbb.rotate;
        if (this.erH == null)
        {
          ab.e("MicroMsg.MMSightCamera", "start camera FAILED!");
          Wf();
          AppMethodBeat.o(76503);
          paramBoolean = false;
          continue;
        }
      }
      AppMethodBeat.o(76503);
      paramBoolean = true;
    }
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(76473);
      oui = new a("Preview", 0);
      ouj = new a("Recording", 1);
      ouk = new a("Stoping", 2);
      oul = new a[] { oui, ouj, ouk };
      AppMethodBeat.o(76473);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.e
 * JD-Core Version:    0.6.2
 */