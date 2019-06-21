package com.tencent.mm.pluginsdk.i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.h;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class g
  implements SensorEventListener
{
  private static int otM = 0;
  private SensorManager bCW;
  public t erH;
  d.a.a fbb;
  private Camera.PreviewCallback mPreviewCallback;
  private boolean otL;
  private Sensor otO;
  private float otP;
  private float otQ;
  private float otR;
  private SurfaceHolder szR;
  private a vge;
  public List<Integer> vgf;
  private boolean vgg;
  private boolean vgh;
  private Camera.AutoFocusCallback vgi;

  public g()
  {
    AppMethodBeat.i(27484);
    this.erH = null;
    this.otL = false;
    this.szR = null;
    this.vgf = new ArrayList();
    this.vgg = true;
    this.otP = 0.0F;
    this.otQ = 0.0F;
    this.otR = 0.0F;
    this.mPreviewCallback = null;
    this.vgh = true;
    this.vgi = new g.1(this);
    AppMethodBeat.o(27484);
  }

  @TargetApi(9)
  private static void g(Camera.Parameters paramParameters)
  {
    AppMethodBeat.i(27486);
    if (q.etc.eri > 0)
      AppMethodBeat.o(27486);
    List localList;
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 9)
      {
        AppMethodBeat.o(27486);
      }
      else
      {
        localList = paramParameters.getSupportedPreviewFpsRange();
        if ((localList != null) && (localList.size() != 0))
          break;
        AppMethodBeat.o(27486);
      }
    }
    int i = localList.size();
    int j = 0;
    int k = -2147483648;
    int m = -2147483648;
    label83: if (j < i)
    {
      int[] arrayOfInt = (int[])localList.get(j);
      if ((arrayOfInt == null) || (arrayOfInt.length <= 1))
        break label280;
      int n = arrayOfInt[0];
      int i1 = arrayOfInt[1];
      ab.d("MicroMsg.YuvReocrder", "dkfps %d:[%d %d]", new Object[] { Integer.valueOf(j), Integer.valueOf(n), Integer.valueOf(i1) });
      if ((n < 0) || (i1 < n) || (i1 < k))
        break label280;
      m = n;
      k = i1;
    }
    label280: 
    while (true)
    {
      while (true)
      {
        j++;
        break label83;
        ab.d("MicroMsg.YuvReocrder", "dkfps get fit  [%d %d]", new Object[] { Integer.valueOf(m), Integer.valueOf(k) });
        if ((m == 2147483647) || (k == 2147483647))
        {
          AppMethodBeat.o(27486);
          break;
        }
        try
        {
          paramParameters.setPreviewFpsRange(m, k);
          AppMethodBeat.o(27486);
        }
        catch (Exception paramParameters)
        {
          ab.printErrStackTrace("MicroMsg.YuvReocrder", paramParameters, "", new Object[0]);
          AppMethodBeat.o(27486);
        }
      }
      break;
    }
  }

  public static int getCameraId()
  {
    return otM;
  }

  public final int a(Activity paramActivity, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(27488);
    int i;
    if (parama == null)
    {
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(27488);
    }
    while (true)
    {
      return i;
      this.vge = parama;
      if ((this.bCW == null) && (this.otO == null))
      {
        this.bCW = ((SensorManager)ah.getContext().getSystemService("sensor"));
        this.otO = this.bCW.getDefaultSensor(1);
      }
      if ((paramBoolean) || (this.erH == null))
      {
        bPl();
        if (paramBoolean)
          otM = (otM ^ 0xFFFFFFFF) & 0x1;
        this.fbb = com.tencent.mm.compatible.e.d.a(paramActivity, otM, null);
        if (this.fbb == null)
        {
          ab.e("MicroMsg.YuvReocrder", "start camera FAILED!");
          i = 0 - com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(27488);
        }
        else
        {
          this.erH = this.fbb.erH;
          this.vge.rotate = this.fbb.rotate;
          if (this.erH == null)
          {
            ab.e("MicroMsg.YuvReocrder", "start camera FAILED!");
            i = 0 - com.tencent.mm.compatible.util.g.getLine();
            AppMethodBeat.o(27488);
          }
        }
      }
      else
      {
        i = 0;
        AppMethodBeat.o(27488);
      }
    }
  }

  public final int b(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(27487);
    int i;
    if (this.otL)
    {
      AppMethodBeat.o(27487);
      i = 0;
    }
    while (true)
    {
      return i;
      if (paramSurfaceHolder != null)
        break;
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(27487);
    }
    label689: label718: label721: 
    while (true)
    {
      Object localObject;
      try
      {
        this.szR = paramSurfaceHolder;
        Camera.Parameters localParameters = this.erH.getParameters();
        a locala = this.vge;
        ab.d("MicroMsg.YuvReocrder", "getFitRecordSize");
        i = 2147483647;
        int k;
        if (Build.VERSION.SDK_INT >= 11)
        {
          new h();
          localObject = localParameters.getSupportedVideoSizes();
          if (localObject != null)
            break label721;
          ab.d("MicroMsg.YuvReocrder", "getFitRecordSize getSupportedVideoSizes null, use getSupportedPreviewSizes instead");
          new com.tencent.mm.compatible.e.g();
          localObject = localParameters.getSupportedPreviewSizes();
          if (localObject == null)
            continue;
          int j = 0;
          k = 0;
          if (j < ((List)localObject).size())
          {
            int m = ((Camera.Size)((List)localObject).get(j)).height;
            int n = ((Camera.Size)((List)localObject).get(j)).width;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("supp w:");
            ab.d("MicroMsg.YuvReocrder", n + " h:" + m);
            int i1 = m * n;
            if (((locala.rotate == 0) || (locala.rotate == 180)) && (((m < locala.ouT) || (n < locala.ouU)) && (((locala.rotate != 90) && (locala.rotate != 270)) || (n < locala.ouT) || (m < locala.ouU) || (i1 >= i))))
              break label718;
            locala.lZe = n;
            locala.lZf = m;
            k = 1;
            i = i1;
            j++;
            continue;
          }
        }
        else
        {
          localObject = null;
          continue;
        }
        if (k == 0)
        {
          localObject = localParameters.getPreviewSize();
          locala.lZf = ((Camera.Size)localObject).height;
          locala.lZe = ((Camera.Size)localObject).width;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(" rotate:");
        ab.d("MicroMsg.YuvReocrder", locala.rotate + " w:" + locala.lZe + " h:" + locala.lZf);
        localParameters.setPreviewSize(this.vge.lZe, this.vge.lZf);
        g(localParameters);
        localObject = localParameters.getSupportedPreviewFrameRates();
        this.vgf.clear();
        this.vgf.addAll((Collection)localObject);
        localParameters.setPreviewFormat(17);
        localObject = localParameters.getSupportedFocusModes();
        if (localObject != null)
        {
          if ((!com.tencent.mm.compatible.util.d.iX(9)) || (true != ((List)localObject).contains("continuous-video")))
            break label689;
          ab.i("MicroMsg.YuvReocrder", "support continous-video");
          this.vgg = false;
          localParameters.setFocusMode("continuous-video");
        }
        this.erH.setParameters(localParameters);
        this.erH.setPreviewDisplay(paramSurfaceHolder);
        this.erH.startPreview();
        if ((this.bCW != null) && (this.otO != null) && (this.vgg))
          this.bCW.registerListener(this, this.otO, 2);
        this.otL = true;
        AppMethodBeat.o(27487);
        i = 0;
        break;
        localObject = localParameters.getPreviewSize();
        locala.lZf = ((Camera.Size)localObject).height;
        locala.lZe = ((Camera.Size)localObject).width;
        continue;
      }
      catch (Exception paramSurfaceHolder)
      {
        ab.printErrStackTrace("MicroMsg.YuvReocrder", paramSurfaceHolder, "", new Object[0]);
        ab.e("MicroMsg.YuvReocrder", "Start preview FAILED :" + paramSurfaceHolder.getMessage());
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(27487);
      }
      break;
      if (!((List)localObject).contains("auto"))
      {
        ab.i("MicroMsg.YuvReocrder", "don't support auto");
        this.vgg = false;
        continue;
      }
    }
  }

  public final void bPl()
  {
    AppMethodBeat.i(27485);
    if ((this.bCW != null) && (this.otO != null))
      this.bCW.unregisterListener(this);
    if (this.erH != null)
    {
      ab.d("MicroMsg.YuvReocrder", "release camera");
      this.erH.setPreviewCallback(null);
      this.erH.stopPreview();
      this.erH.release();
      this.erH = null;
      this.otL = false;
    }
    AppMethodBeat.o(27485);
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(27489);
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if (((Math.abs(this.otP - f1) > 2.0F) || (Math.abs(this.otQ - f2) > 2.0F) || (Math.abs(this.otR - f3) > 2.0F)) && (this.erH != null) && (this.vgh) && (true == this.vgg));
    try
    {
      ab.d("MicroMsg.YuvReocrder", "auto focus");
      this.erH.autoFocus(this.vgi);
      this.vgh = false;
      this.otP = f1;
      this.otQ = f2;
      this.otR = f3;
      AppMethodBeat.o(27489);
      return;
    }
    catch (Exception paramSensorEvent)
    {
      while (true)
        ab.d("MicroMsg.YuvReocrder", "auto focus failed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.g
 * JD-Core Version:    0.6.2
 */