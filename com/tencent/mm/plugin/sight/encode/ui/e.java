package com.tencent.mm.plugin.sight.encode.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.List;

final class e
  implements SensorEventListener
{
  private static int otN = 2147483647;
  t erH;
  boolean faH;
  private Context mContext;
  Camera.PreviewCallback mPreviewCallback;
  boolean otL;
  private int otM;
  private float otP;
  private float otQ;
  private float otR;
  private boolean oue;
  com.tencent.mm.pluginsdk.i.a qBs;
  a qBt;

  public e()
  {
    AppMethodBeat.i(25106);
    this.faH = false;
    this.erH = null;
    this.otL = false;
    this.otM = 0;
    this.otP = 0.0F;
    this.otQ = 0.0F;
    this.otR = 0.0F;
    this.mPreviewCallback = null;
    this.mContext = null;
    this.oue = false;
    this.qBt = new a(Looper.getMainLooper());
    this.qBs = com.tencent.mm.pluginsdk.i.a.diF();
    AppMethodBeat.o(25106);
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(25107);
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if ((Math.abs(this.otP - f1) > 3.0F) || (Math.abs(this.otQ - f2) > 3.0F) || (Math.abs(this.otR - f3) > 3.0F))
    {
      ab.i("MicroMsg.SightCamera", "match accel limit %f, try auto focus", new Object[] { Float.valueOf(3.0F) });
      a.f(this.erH);
      this.otP = f1;
      this.otQ = f2;
      this.otR = f3;
    }
    AppMethodBeat.o(25107);
  }

  static final class a extends ak
  {
    static Camera.AutoFocusCallback faP;
    static boolean ouf;
    int faG = 0;
    boolean faH = false;
    boolean faI = false;
    boolean faJ = false;
    float faK;
    float faL;
    int faM;
    int faN;

    static
    {
      AppMethodBeat.i(25105);
      ouf = true;
      faP = new e.a.1();
      AppMethodBeat.o(25105);
    }

    public a(Looper paramLooper)
    {
      super();
    }

    private static Rect b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(25100);
      int i = Float.valueOf(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 72) * paramFloat3).intValue();
      Object localObject = new RectF();
      ((RectF)localObject).set((paramFloat1 - i / 2) * 2000.0F / paramInt1 - 1000.0F, (paramFloat2 - i / 2) * 2000.0F / paramInt2 - 1000.0F, (i / 2 + paramFloat1) * 2000.0F / paramInt1 - 1000.0F, (i / 2 + paramFloat2) * 2000.0F / paramInt2 - 1000.0F);
      localObject = new Rect(yS(Math.round(((RectF)localObject).left)), yS(Math.round(((RectF)localObject).top)), yS(Math.round(((RectF)localObject).right)), yS(Math.round(((RectF)localObject).bottom)));
      AppMethodBeat.o(25100);
      return localObject;
    }

    private static int d(Camera.Parameters paramParameters)
    {
      int i = 0;
      AppMethodBeat.i(25102);
      if (paramParameters == null)
        AppMethodBeat.o(25102);
      while (true)
      {
        return i;
        try
        {
          int j = paramParameters.getMaxZoom() / 2;
          i = j;
          if (j <= 0)
            i = paramParameters.getMaxZoom();
          AppMethodBeat.o(25102);
        }
        catch (Exception paramParameters)
        {
          while (true)
          {
            ab.e("MicroMsg.SightCamera", "get target zoom value error: %s", new Object[] { paramParameters.getMessage() });
            i = 0;
          }
        }
      }
    }

    static int f(Camera.Parameters paramParameters)
    {
      AppMethodBeat.i(25103);
      int i = d(paramParameters) / 6;
      int j = i;
      if (i <= 0)
        j = 1;
      AppMethodBeat.o(25103);
      return j;
    }

    static void f(t paramt)
    {
      AppMethodBeat.i(25101);
      if (paramt == null)
        ab.w("MicroMsg.SightCamera", "want to auto focus, but camera is null, do nothing");
      if (!ouf)
      {
        ab.w("MicroMsg.SightCamera", "auto focus not back");
        AppMethodBeat.o(25101);
      }
      while (true)
      {
        return;
        ouf = false;
        try
        {
          paramt.autoFocus(faP);
          AppMethodBeat.o(25101);
        }
        catch (Exception paramt)
        {
          ab.w("MicroMsg.SightCamera", "autofocus fail, exception %s", new Object[] { paramt.getMessage() });
          ouf = true;
          AppMethodBeat.o(25101);
        }
      }
    }

    private static int yS(int paramInt)
    {
      int i;
      if (paramInt > 1000)
        i = 1000;
      while (true)
      {
        return i;
        i = paramInt;
        if (paramInt < -1000)
          i = -1000;
      }
    }

    public final void handleMessage(Message paramMessage)
    {
      int i = 1;
      AppMethodBeat.i(25104);
      switch (paramMessage.what)
      {
      default:
      case 4354:
      case 4353:
      }
      while (true)
      {
        AppMethodBeat.o(25104);
        Object localObject2;
        while (true)
        {
          return;
          localObject1 = (t)paramMessage.obj;
          if ((this.faM == 0) || (this.faM == 0) || (d.fP(14)))
          {
            f((t)localObject1);
            AppMethodBeat.o(25104);
          }
          else
          {
            float f1 = this.faK;
            float f2 = this.faL;
            i = this.faM;
            j = this.faN;
            if (localObject1 == null)
              ab.w("MicroMsg.SightCamera", "want to auto focus, but camera is null, do nothing");
            if (!ouf)
            {
              ab.w("MicroMsg.SightCamera", "auto focus not back");
              AppMethodBeat.o(25104);
            }
            else
            {
              ouf = false;
              try
              {
                ab.i("MicroMsg.SightCamera", "ashutest:: touch %f %f, display %d %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
                localObject2 = b(f1, f2, 1.0F, i, j);
                paramMessage = b(f1, f2, 1.5F, i, j);
                ab.i("MicroMsg.SightCamera", "ashutest:: focus rect %s, meter rect %s", new Object[] { localObject2, paramMessage });
                localObject3 = ((t)localObject1).getParameters();
                Object localObject4 = ((Camera.Parameters)localObject3).getSupportedFocusModes();
                if ((localObject4 != null) && (((List)localObject4).contains("auto")))
                  ((Camera.Parameters)localObject3).setFocusMode("auto");
                if (((Camera.Parameters)localObject3).getMaxNumFocusAreas() > 0)
                {
                  ArrayList localArrayList = new java/util/ArrayList;
                  localArrayList.<init>(1);
                  localObject4 = new android/hardware/Camera$Area;
                  ((Camera.Area)localObject4).<init>((Rect)localObject2, 1000);
                  localArrayList.add(localObject4);
                  ((Camera.Parameters)localObject3).setFocusAreas(localArrayList);
                }
                if (((Camera.Parameters)localObject3).getMaxNumMeteringAreas() > 0)
                {
                  localObject4 = new java/util/ArrayList;
                  ((ArrayList)localObject4).<init>(1);
                  localObject2 = new android/hardware/Camera$Area;
                  ((Camera.Area)localObject2).<init>(paramMessage, 1000);
                  ((ArrayList)localObject4).add(localObject2);
                  ((Camera.Parameters)localObject3).setMeteringAreas((List)localObject4);
                }
                ((t)localObject1).setParameters((Camera.Parameters)localObject3);
                ((t)localObject1).autoFocus(faP);
                AppMethodBeat.o(25104);
              }
              catch (Exception paramMessage)
              {
                ab.w("MicroMsg.SightCamera", "autofocus with area fail, exception %s", new Object[] { paramMessage.getMessage() });
                ouf = true;
                AppMethodBeat.o(25104);
              }
              continue;
              if (!this.faJ)
                break;
              AppMethodBeat.o(25104);
            }
          }
        }
        Object localObject3 = (Camera)paramMessage.obj;
        Object localObject1 = ((Camera)localObject3).getParameters();
        ab.i("MicroMsg.SightCamera", "zoomed %s curZoomStep %s params.getZoom() %s", new Object[] { Boolean.valueOf(this.faH), Integer.valueOf(this.faG), Integer.valueOf(((Camera.Parameters)localObject1).getZoom()) });
        int j = ((Camera.Parameters)localObject1).getZoom() + this.faG;
        if (this.faH)
        {
          int k = d((Camera.Parameters)localObject1);
          if (j >= k)
          {
            j = k;
            label530: ((Camera.Parameters)localObject1).setZoom(j);
          }
        }
        try
        {
          ((Camera)localObject3).setParameters((Camera.Parameters)localObject1);
          if (i == 0)
            continue;
          this.faM = 0;
          this.faN = 0;
          sendMessageDelayed(obtainMessage(4354, paramMessage.obj), 20L);
          continue;
          localObject2 = obtainMessage(4353, paramMessage.obj);
          if (this.faI);
          for (long l = 10L; ; l = 20L)
          {
            sendMessageDelayed((Message)localObject2, l);
            i = 0;
            break;
          }
          if (j <= 0)
          {
            j = 0;
            break label530;
          }
          localObject2 = obtainMessage(4353, paramMessage.obj);
          if (this.faI);
          for (l = 10L; ; l = 20L)
          {
            sendMessageDelayed((Message)localObject2, l);
            i = 0;
            break;
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.SightCamera", localException, "", new Object[0]);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.e
 * JD-Core Version:    0.6.2
 */