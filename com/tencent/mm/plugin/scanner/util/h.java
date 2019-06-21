package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bs;
import com.tencent.mm.ui.ae;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class h
{
  private static final Pattern qhR;
  private Activity czX;
  public t erH;
  private int hGe;
  public Rect lQX;
  public boolean lUE;
  public Point lUF;
  private Point lUG;
  public Point lUH;
  public boolean lUI;
  public int lUJ;
  private boolean lUK;
  public boolean otY;
  public boolean qhS;
  private Rect qhT;
  private Rect qhU;
  public int qhV;
  private String qhW;
  private int qhX;
  private int qhY;
  private int qhZ;

  static
  {
    AppMethodBeat.i(81443);
    qhR = Pattern.compile(",");
    AppMethodBeat.o(81443);
  }

  public h(Activity paramActivity, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(81420);
    this.lUE = false;
    this.hGe = 0;
    this.lUF = null;
    this.lUG = null;
    this.lUH = null;
    this.lUK = false;
    this.otY = false;
    this.qhV = -1;
    this.qhW = "";
    this.czX = paramActivity;
    this.lUG = ae.hy(paramActivity);
    this.qhS = paramBoolean;
    this.hGe = paramInt;
    AppMethodBeat.o(81420);
  }

  private static Point a(Camera.Parameters paramParameters, Point paramPoint1, Point paramPoint2, boolean paramBoolean)
  {
    AppMethodBeat.i(81432);
    String str = paramParameters.get("preview-size-values");
    if (str == null)
      str = paramParameters.get("preview-size-value");
    while (true)
    {
      Point localPoint = null;
      if (str != null)
      {
        ab.d("MicroMsg.scanner.ScanCamera", "preview-size-values parameter: ".concat(String.valueOf(str)));
        localPoint = a(paramParameters, paramPoint1, paramBoolean);
      }
      paramParameters = localPoint;
      if (localPoint == null)
        paramParameters = new Point(paramPoint2.x >> 3 << 3, paramPoint2.y >> 3 << 3);
      AppMethodBeat.o(81432);
      return paramParameters;
    }
  }

  private static Point a(Camera.Parameters paramParameters, Point paramPoint, boolean paramBoolean)
  {
    AppMethodBeat.i(81433);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new a((byte)0));
    ((List)localObject).remove(0);
    Point localPoint = null;
    float f1 = paramPoint.x / paramPoint.y;
    ab.d("MicroMsg.scanner.ScanCamera", "screen.x: %d, screen.y: %d, ratio: %f", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f1) });
    int i = paramPoint.x * paramPoint.y;
    ab.i("MicroMsg.scanner.ScanCamera", "SCREEN_PIXELS: %s, MAX_PREVIEW_PIXELS_USE_BIGGER: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(2073600) });
    float f2 = (1.0F / 1.0F);
    localObject = ((List)localObject).iterator();
    int j;
    int k;
    label270: label359: label367: label374: label381: float f3;
    while (((Iterator)localObject).hasNext())
    {
      Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
      j = localSize.width;
      k = localSize.height;
      ab.i("MicroMsg.scanner.ScanCamera", "realWidth: %d, realHeight: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
      int m = j * k;
      if ((m >= 150400) && (m <= 2073600) && ((m <= i) || (Math.min(paramPoint.x, paramPoint.y) < 720)))
      {
        if (j > k)
        {
          n = 1;
          if ((n == 0) || (paramBoolean))
            break label367;
          m = k;
          if ((n == 0) || (paramBoolean))
            break label374;
        }
        for (int n = j; ; n = k)
        {
          ab.d("MicroMsg.scanner.ScanCamera", "maybeFlippedWidth: %d, maybeFlippedHeight: %d", new Object[] { Integer.valueOf(m), Integer.valueOf(n) });
          if ((m != paramPoint.x) || (n != paramPoint.y))
            break label381;
          paramPoint = new Point(j, k);
          ab.i("MicroMsg.scanner.ScanCamera", "Found preview size exactly matching screen size: ".concat(String.valueOf(paramPoint)));
          AppMethodBeat.o(81433);
          return paramPoint;
          n = 0;
          break;
          m = j;
          break label270;
        }
        f3 = Math.abs(m / n - f1);
        if (f3 >= f2)
          break label532;
        localPoint = new Point(j, k);
        f2 = f3;
      }
    }
    label532: 
    while (true)
    {
      ab.i("MicroMsg.scanner.ScanCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", new Object[] { Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(j), Integer.valueOf(k) });
      break;
      paramPoint = localPoint;
      if (localPoint == null)
      {
        paramParameters = paramParameters.getPreviewSize();
        paramPoint = new Point(paramParameters.width, paramParameters.height);
        ab.i("MicroMsg.scanner.ScanCamera", "No suitable preview sizes, using default: ".concat(String.valueOf(paramPoint)));
      }
      ab.i("MicroMsg.scanner.ScanCamera", "Found best approximate preview size: ".concat(String.valueOf(paramPoint)));
      AppMethodBeat.o(81433);
      break label359;
    }
  }

  private void chZ()
  {
    AppMethodBeat.i(81428);
    if (this.lQX == null)
      AppMethodBeat.o(81428);
    while (true)
    {
      return;
      this.qhT = new Rect();
      float f1 = this.lUF.x;
      float f2 = this.lUF.y;
      float f3 = f2;
      float f4 = f1;
      if (this.lUI)
      {
        f3 = f2;
        f4 = f1;
        if (!this.qhS)
        {
          f4 = this.lUF.y;
          f3 = this.lUF.x;
        }
      }
      int i = (int)(this.lQX.width() / f4 * 2000.0F);
      int j = (int)(this.lQX.height() / f3 * 2000.0F);
      this.qhT.left = (-i / 2);
      this.qhT.right = (i / 2);
      this.qhT.top = (-j / 2);
      this.qhT.bottom = (j / 2);
      ab.i("MicroMsg.scanner.ScanCamera", "set focus area:" + this.qhT);
      AppMethodBeat.o(81428);
    }
  }

  private void cia()
  {
    AppMethodBeat.i(81429);
    if (this.lQX == null)
      AppMethodBeat.o(81429);
    while (true)
    {
      return;
      float f1 = this.lUF.x;
      float f2 = this.lUF.y;
      float f3 = f2;
      float f4 = f1;
      if (this.lUI)
      {
        f3 = f2;
        f4 = f1;
        if (!this.qhS)
        {
          f4 = this.lUF.y;
          f3 = this.lUF.x;
        }
      }
      this.qhU = new Rect();
      int i = (int)(this.lQX.width() / f4 * 2000.0F);
      int j = (int)(this.lQX.height() / f3 * 2000.0F);
      this.qhU.left = (-i / 2);
      this.qhU.right = (i / 2);
      this.qhU.top = (-j / 2);
      this.qhU.bottom = (j / 2);
      ab.i("MicroMsg.scanner.ScanCamera", "set metering area:" + this.qhU);
      AppMethodBeat.o(81429);
    }
  }

  private static void e(Camera.Parameters paramParameters)
  {
    AppMethodBeat.i(81439);
    List localList;
    try
    {
      ab.i("MicroMsg.scanner.ScanCamera", "set scan focus");
      localList = paramParameters.getSupportedFocusModes();
      if (localList != null)
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("supported focus modes size = ");
        ab.i("MicroMsg.scanner.ScanCamera", localList.size());
        localObject = localList.iterator();
        while (((Iterator)localObject).hasNext())
          ab.i("MicroMsg.scanner.ScanCamera", "supported focus modes : ".concat(String.valueOf((String)((Iterator)localObject).next())));
      }
    }
    catch (Exception paramParameters)
    {
      ab.e("MicroMsg.scanner.ScanCamera", "setScanFocus error: %s", new Object[] { paramParameters.getMessage() });
      AppMethodBeat.o(81439);
    }
    while (true)
    {
      return;
      if (localList.contains("continuous-video"))
      {
        ab.d("MicroMsg.scanner.ScanCamera", "camera support continuous video focus");
        paramParameters.setFocusMode("continuous-video");
        AppMethodBeat.o(81439);
      }
      else
      {
        if (localList.contains("auto"))
        {
          ab.d("MicroMsg.scanner.ScanCamera", "camera support auto focus");
          paramParameters.setFocusMode("auto");
        }
        AppMethodBeat.o(81439);
      }
    }
  }

  private static int o(List<Integer> paramList, int paramInt)
  {
    AppMethodBeat.i(81435);
    int i;
    if ((paramList != null) && (paramList.size() > 0))
    {
      ab.i("MicroMsg.scanner.ScanCamera", "zoomRatios: %s,size: %d", new Object[] { paramList, Integer.valueOf(paramList.size()) });
      i = Collections.binarySearch(paramList, Integer.valueOf(paramInt));
      ab.i("MicroMsg.scanner.ScanCamera", "insert index:%d", new Object[] { Integer.valueOf(i) });
      if (i >= 0)
        paramInt = i;
    }
    while (true)
    {
      AppMethodBeat.o(81435);
      return paramInt;
      int j = -(i + 1);
      i = j - 1;
      if ((j >= 0) && (j <= paramList.size() - 1) && (i >= 0) && (i <= paramList.size() - 1))
      {
        if (((Integer)paramList.get(j)).intValue() - paramInt > paramInt - ((Integer)paramList.get(i)).intValue())
          paramInt = i;
        else
          paramInt = j;
      }
      else if ((j >= 0) && (j <= paramList.size() - 1))
        paramInt = j;
      else if ((i >= 0) && (i <= paramList.size() - 1))
        paramInt = i;
      else
        paramInt = 0;
    }
  }

  public final void Cd(int paramInt)
  {
    this.hGe = paramInt;
    this.lQX = null;
  }

  public final void Ce(int paramInt)
  {
    AppMethodBeat.i(81436);
    if ((this.erH != null) && (this.lUE) && (paramInt > 0));
    while (true)
    {
      try
      {
        Camera.Parameters localParameters = this.erH.getParameters();
        List localList = localParameters.getZoomRatios();
        if (localList != null)
        {
          i = localList.size();
          if (i > 0);
        }
        else
        {
          AppMethodBeat.o(81436);
          return;
        }
        double d = paramInt / 100.0D;
        int i = (int)(d * ((Integer)localList.get(this.qhX)).intValue());
        ab.d("MicroMsg.scanner.ScanCamera", "scale:%d,to ratio:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        if ((i >= ((Integer)localList.get(this.qhY)).intValue()) && (i <= ((Integer)localList.get(this.qhZ)).intValue()))
        {
          paramInt = o(localList, i);
          ab.i("MicroMsg.scanner.ScanCamera", "zoom:%d,ratio:%d", new Object[] { Integer.valueOf(paramInt), localList.get(paramInt) });
          this.qhX = paramInt;
          localParameters.setZoom(paramInt);
          this.erH.setParameters(localParameters);
          AppMethodBeat.o(81436);
          continue;
        }
        if (i < ((Integer)localList.get(this.qhY)).intValue())
        {
          paramInt = this.qhY;
          continue;
        }
        ab.i("MicroMsg.scanner.ScanCamera", "exceed max zoom");
        i = this.qhX + (this.qhZ - this.qhX) / 5;
        paramInt = i;
        if (i <= this.qhZ)
          continue;
        paramInt = this.qhZ;
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.scanner.ScanCamera", "zoom scale exception:" + localException.getMessage());
      }
      AppMethodBeat.o(81436);
    }
  }

  public final void Cf(int paramInt)
  {
    AppMethodBeat.i(81437);
    if ((this.erH != null) && (this.lUE));
    while (true)
    {
      int i;
      try
      {
        Camera.Parameters localParameters = this.erH.getParameters();
        List localList = localParameters.getZoomRatios();
        if (localList != null)
        {
          i = localList.size();
          if (i > 0);
        }
        else
        {
          AppMethodBeat.o(81437);
          return;
        }
        ab.i("MicroMsg.scanner.ScanCamera", "zoom action:%d,beforeZoom:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localParameters.getZoom()) });
        switch (paramInt)
        {
        default:
          localParameters.setZoom(this.qhX);
          this.erH.setParameters(localParameters);
          ab.i("MicroMsg.scanner.ScanCamera", "zoom action:%d,afterZoom:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localParameters.getZoom()) });
          AppMethodBeat.o(81437);
          break;
        case 0:
          this.qhX = 0;
          continue;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.scanner.ScanCamera", "zoom action exception:" + localException.getMessage());
      }
      AppMethodBeat.o(81437);
      continue;
      this.qhX = this.qhY;
      continue;
      if (this.qhX < this.qhZ)
      {
        this.qhX += 1;
        if (this.qhX > this.qhZ);
        for (i = this.qhZ; ; i = this.qhX)
        {
          this.qhX = i;
          break;
        }
        if (this.qhX > this.qhY)
        {
          this.qhX -= 1;
          if (this.qhX < this.qhY);
          for (i = this.qhY; ; i = this.qhX)
          {
            this.qhX = i;
            break;
          }
          this.qhX = this.qhZ;
          continue;
          if (this.qhX != this.qhY)
            this.qhX = this.qhY;
          else
            this.qhX = this.qhZ;
        }
      }
    }
  }

  public final void a(Camera.PreviewCallback paramPreviewCallback)
  {
    AppMethodBeat.i(81423);
    if (this.erH != null);
    while (true)
    {
      try
      {
        this.erH.setOneShotPreviewCallback(paramPreviewCallback);
        AppMethodBeat.o(81423);
        return;
      }
      catch (RuntimeException paramPreviewCallback)
      {
        ab.w("MicroMsg.scanner.ScanCamera", "takeOneShot() " + paramPreviewCallback.getMessage());
      }
      AppMethodBeat.o(81423);
    }
  }

  public final void bPs()
  {
    AppMethodBeat.i(81442);
    ab.i("MicroMsg.scanner.ScanCamera", "closeFlash, camera: %s, isPreviewing: %s", new Object[] { this.erH, Boolean.valueOf(this.lUE) });
    if ((this.erH != null) && (this.lUE));
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
          ab.i("MicroMsg.scanner.ScanCamera", "close flash");
          AppMethodBeat.o(81442);
          return;
        }
        ab.i("MicroMsg.scanner.ScanCamera", "camera not support close flash!!");
        AppMethodBeat.o(81442);
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.scanner.ScanCamera", localException, "closeFlash error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(81442);
    }
  }

  public final void cancelAutoFocus()
  {
    AppMethodBeat.i(81425);
    try
    {
      if (this.erH != null)
        this.erH.cancelAutoFocus();
      AppMethodBeat.o(81425);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.scanner.ScanCamera", "cancelAutoFocus %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(81425);
      }
    }
  }

  public final float chX()
  {
    if ((this.lUI) && (!this.qhS));
    for (float f = this.lUF.y / this.lUH.x; ; f = this.lUF.x / this.lUH.x)
      return f;
  }

  public final float chY()
  {
    if ((this.lUI) && (!this.qhS));
    for (float f = this.lUF.x / this.lUH.y; ; f = this.lUF.y / this.lUH.y)
      return f;
  }

  public final void cib()
  {
    AppMethodBeat.i(81430);
    if ((this.erH == null) || (this.lUK))
    {
      AppMethodBeat.o(81430);
      return;
    }
    while (true)
    {
      try
      {
        Camera.Parameters localParameters = this.erH.getParameters();
        chZ();
        cia();
        Object localObject;
        if (this.qhT != null)
        {
          localObject = this.qhU;
          if (localObject != null);
        }
        else
        {
          AppMethodBeat.o(81430);
          break;
        }
        this.lUK = true;
        if (localParameters.getMaxNumMeteringAreas() > 0)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localObject = new android/hardware/Camera$Area;
          ((Camera.Area)localObject).<init>(this.qhU, 1000);
          localArrayList.add(localObject);
          localParameters.setMeteringAreas(localArrayList);
          if (localParameters.getMaxNumFocusAreas() <= 0)
            break label212;
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localObject = new android/hardware/Camera$Area;
          ((Camera.Area)localObject).<init>(this.qhT, 1000);
          localArrayList.add(localObject);
          localParameters.setFocusAreas(localArrayList);
          this.erH.setParameters(localParameters);
          AppMethodBeat.o(81430);
          break;
        }
        ab.i("MicroMsg.scanner.ScanCamera", "setScanFocusAndMeteringArea, camera not support set metering area");
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.scanner.ScanCamera", "setScanFocusAndMeteringArea error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(81430);
      }
      break;
      label212: ab.i("MicroMsg.scanner.ScanCamera", "setScanFocusAndMeteringArea, camera not support area focus");
    }
  }

  public final void cic()
  {
    AppMethodBeat.i(81434);
    try
    {
      Object localObject;
      boolean bool;
      if (this.erH != null)
      {
        localObject = this.erH.getParameters();
        String str = ((Camera.Parameters)localObject).get("zoom-supported");
        if ((bo.isNullOrNil(str)) || (!Boolean.parseBoolean(str)))
        {
          ab.i("MicroMsg.scanner.ScanCamera", "not support zoom");
          AppMethodBeat.o(81434);
        }
        while (true)
        {
          return;
          localObject = ((Camera.Parameters)localObject).getZoomRatios();
          if (localObject != null)
          {
            int i = ((List)localObject).size();
            if (i > 0)
              break;
          }
          AppMethodBeat.o(81434);
        }
        q.ku(g.RP().Rz().dur());
        if (q.etn.esj != 1)
          break label373;
        bool = true;
        label112: ab.i("MicroMsg.scanner.ScanCamera", "needZoom: %s, qrCodeZoom: %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(q.etn.esj) });
        if ((!bool) || (this.lUG.x < 720) || ((this.hGe != 1) && (this.hGe != 8) && (this.hGe != 4)))
          break label379;
        this.qhY = (((List)localObject).size() / 5);
        if (this.qhY <= 150);
      }
      label373: label379: for (this.qhY = 150; ; this.qhY = 0)
      {
        double d = 1.5D;
        if (q.etn.esk != -1.0D)
          d = q.etn.esk;
        this.qhZ = ((int)(((List)localObject).size() / d));
        ab.d("MicroMsg.scanner.ScanCamera", "divideRatio: %f,max zoom: %d", new Object[] { Double.valueOf(d), Integer.valueOf(this.qhZ) });
        if (this.qhZ >= this.qhY)
          break label410;
        this.qhZ = this.qhY;
        ab.i("MicroMsg.scanner.ScanCamera", "default zoom:%d,default ratio:%d,max zoom:%d,max ratio:%d", new Object[] { Integer.valueOf(this.qhY), ((List)localObject).get(this.qhY), Integer.valueOf(this.qhZ), ((List)localObject).get(this.qhZ) });
        AppMethodBeat.o(81434);
        break;
        bool = false;
        break label112;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.scanner.ScanCamera", localException, "init zoom exception!", new Object[0]);
        AppMethodBeat.o(81434);
        continue;
        label410: if (this.qhZ > 400)
          this.qhZ = 400;
      }
    }
  }

  public final int cid()
  {
    AppMethodBeat.i(81438);
    try
    {
      if ((this.erH != null) && (this.erH.getParameters() != null) && (this.erH.getParameters().getZoomRatios() != null) && (this.erH.getParameters().getZoomRatios().size() > 0))
      {
        i = ((Integer)this.erH.getParameters().getZoomRatios().get(this.qhX)).intValue();
        AppMethodBeat.o(81438);
        return i;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.scanner.ScanCamera", "get zoom ratio exception:" + localException.getMessage());
        int i = 100;
        AppMethodBeat.o(81438);
      }
    }
  }

  public final void cie()
  {
    AppMethodBeat.i(81440);
    List localList;
    try
    {
      ab.i("MicroMsg.scanner.ScanCamera", "set picture focus");
      Camera.Parameters localParameters = this.erH.getParameters();
      if (localParameters == null)
      {
        ab.w("MicroMsg.scanner.ScanCamera", "camera parameters is null");
        AppMethodBeat.o(81440);
        return;
      }
      localList = localParameters.getSupportedFocusModes();
      if (localList == null)
        break label185;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("supported focus modes size = ");
      ab.d("MicroMsg.scanner.ScanCamera", localList.size());
      localObject = localList.iterator();
      while (((Iterator)localObject).hasNext())
        ab.d("MicroMsg.scanner.ScanCamera", "supported focus modes : ".concat(String.valueOf((String)((Iterator)localObject).next())));
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.scanner.ScanCamera", "setPictureFocus error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(81440);
      }
    }
    if (localList.contains("continuous-picture"))
    {
      ab.d("MicroMsg.scanner.ScanCamera", "camera support continuous picture focus");
      localException.setFocusMode("continuous-picture");
    }
    while (true)
    {
      this.erH.setParameters(localException);
      label185: AppMethodBeat.o(81440);
      break;
      if (localList.contains("continuous-video"))
      {
        ab.d("MicroMsg.scanner.ScanCamera", "camera support continuous video focus");
        localException.setFocusMode("continuous-video");
      }
      else if (localList.contains("auto"))
      {
        ab.d("MicroMsg.scanner.ScanCamera", "camera support auto focus");
        localException.setFocusMode("auto");
      }
    }
  }

  public final boolean cif()
  {
    boolean bool1 = true;
    AppMethodBeat.i(81441);
    if ((this.erH != null) && (this.lUE));
    try
    {
      Camera.Parameters localParameters = this.erH.getParameters();
      if (!bo.ek(localParameters.getSupportedFlashModes()))
      {
        boolean bool2 = localParameters.getSupportedFlashModes().contains("torch");
        if (bool2)
          AppMethodBeat.o(81441);
      }
      while (true)
      {
        return bool1;
        ab.i("MicroMsg.scanner.ScanCamera", "camera not support flash!!");
        AppMethodBeat.o(81441);
        bool1 = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.scanner.ScanCamera", localException, "isFlashSupported error: %s", new Object[] { localException.getMessage() });
    }
  }

  public final void e(Point paramPoint)
  {
    AppMethodBeat.i(81431);
    this.lUH = new Point(paramPoint);
    ab.d("MicroMsg.scanner.ScanCamera", "set visible resolution:%s", new Object[] { this.lUH });
    AppMethodBeat.o(81431);
  }

  public final String getFocusMode()
  {
    AppMethodBeat.i(81424);
    try
    {
      if ((this.erH != null) && (this.lUE))
      {
        String str1 = this.erH.getParameters().getFocusMode();
        AppMethodBeat.o(81424);
        return str1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.scanner.ScanCamera", "getFocusMode() %s", new Object[] { localException.getMessage() });
        String str2 = "";
        AppMethodBeat.o(81424);
      }
    }
  }

  public final void h(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(81421);
    long l = bo.yz();
    if ((this.erH != null) && (!this.lUE))
    {
      if (paramSurfaceTexture != null)
        this.erH.setPreviewTexture(paramSurfaceTexture);
      this.erH.startPreview();
      this.lUE = true;
      ab.d("MicroMsg.scanner.ScanCamera", "startPreview done costTime=[%s]", new Object[] { Long.valueOf(bo.az(l)) });
    }
    AppMethodBeat.o(81421);
  }

  public final boolean isOpen()
  {
    if (this.erH != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void open()
  {
    AppMethodBeat.i(81426);
    if (this.lUE)
    {
      ab.w("MicroMsg.scanner.ScanCamera", "in open(), previewing");
      release();
    }
    int i = d.Lr();
    long l = bo.yz();
    Object localObject1 = d.a(this.czX, i, null);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.scanner.ScanCamera", "in open(), openCameraRes == null");
      localObject1 = new IOException();
      AppMethodBeat.o(81426);
      throw ((Throwable)localObject1);
    }
    this.otY = false;
    this.qhV = -1;
    ab.d("MicroMsg.scanner.ScanCamera", "openCamera done, cameraId=[%s] costTime=[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(bo.az(l)) });
    this.lUJ = ((d.a.a)localObject1).rotate;
    if (((d.a.a)localObject1).rotate % 180 != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.lUI = bool;
      this.erH = ((d.a.a)localObject1).erH;
      if (this.erH != null)
        break;
      ab.e("MicroMsg.scanner.ScanCamera", "in open(), camera == null, bNeedRotate=[%s]", new Object[] { Boolean.valueOf(this.lUI) });
      localObject1 = new IOException();
      AppMethodBeat.o(81426);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.erH.getParameters();
    Point localPoint = this.lUG;
    Object localObject2 = this.lUH;
    if ((9 == this.hGe) || (10 == this.hGe) || (7 == this.hGe) || (11 == this.hGe))
      bool = true;
    while (true)
    {
      this.lUF = a((Camera.Parameters)localObject1, localPoint, (Point)localObject2, bool);
      ab.d("MicroMsg.scanner.ScanCamera", "getCameraResolution: " + this.lUG + " camera:" + this.lUF);
      ((Camera.Parameters)localObject1).setPreviewSize(this.lUF.x, this.lUF.y);
      cic();
      try
      {
        e((Camera.Parameters)localObject1);
        localObject2 = ((Camera.Parameters)localObject1).getSupportedPreviewFormats();
        ab.i("MicroMsg.scanner.ScanCamera", "supportedPreviewFormat:".concat(String.valueOf(localObject2)));
        if (((List)localObject2).contains(Integer.valueOf(17)))
        {
          i = 0;
          j = 1;
          if (j == 0)
            break label481;
          ab.i("MicroMsg.scanner.ScanCamera", "Preview support NV21");
          ((Camera.Parameters)localObject1).setPreviewFormat(17);
          this.erH.setParameters((Camera.Parameters)localObject1);
          AppMethodBeat.o(81426);
          return;
          bool = false;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          int j;
          ab.e("MicroMsg.scanner.ScanCamera", "set focus mode error: %s", new Object[] { localException.getMessage() });
          continue;
          if (localException.contains(Integer.valueOf(842094169)))
          {
            i = 1;
            j = 0;
            continue;
            label481: if (i != 0)
            {
              ab.i("MicroMsg.scanner.ScanCamera", "Preview not support NV21, but support YV12");
              ((Camera.Parameters)localObject1).setPreviewFormat(842094169);
            }
            else
            {
              ab.i("MicroMsg.scanner.ScanCamera", "Preview not support NV21 and YV12. Use format: %s", new Object[] { localException.get(0) });
              ((Camera.Parameters)localObject1).setPreviewFormat(((Integer)localException.get(0)).intValue());
            }
          }
          else
          {
            i = 0;
            j = 0;
          }
        }
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(81427);
    ab.i("MicroMsg.scanner.ScanCamera", "release(), previewing = [%s]", new Object[] { Boolean.valueOf(this.lUE) });
    if (this.erH != null)
    {
      long l = bo.yz();
      this.erH.setPreviewCallback(null);
      this.erH.stopPreview();
      this.lUE = false;
      ab.i("MicroMsg.scanner.ScanCamera", "stopPreview costTime=[%s]", new Object[] { Long.valueOf(bo.az(l)) });
      l = bo.yz();
      this.erH.release();
      this.erH = null;
      ab.i("MicroMsg.scanner.ScanCamera", "camera.release() costTime=[%s]", new Object[] { Long.valueOf(bo.az(l)) });
    }
    this.otY = false;
    this.lUK = false;
    this.qhV = -1;
    this.hGe = 0;
    AppMethodBeat.o(81427);
  }

  public final void stopPreview()
  {
    AppMethodBeat.i(81422);
    if (this.erH != null)
    {
      this.erH.stopPreview();
      this.lUE = false;
    }
    AppMethodBeat.o(81422);
  }

  static final class a
    implements Comparator<Camera.Size>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.h
 * JD-Core Version:    0.6.2
 */