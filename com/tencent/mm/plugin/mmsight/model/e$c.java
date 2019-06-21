package com.tencent.mm.plugin.mmsight.model;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.List;

public final class e$c extends ak
{
  int faG = 0;
  boolean faH = false;
  boolean faI = false;
  boolean faJ = false;
  float faK;
  float faL;
  int faM;
  int faN;

  public e$c(e parame, Looper paramLooper)
  {
    super(paramLooper);
  }

  private static Rect b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76474);
    paramFloat3 = 80.0F * paramFloat3;
    float f = paramFloat1 / paramInt1;
    paramFloat1 = paramFloat2 / paramInt2;
    paramFloat2 = f * 2000.0F - 1000.0F - paramFloat3 / 2.0F;
    paramFloat1 = paramFloat1 * 2000.0F - 1000.0F - paramFloat3 / 2.0F;
    Object localObject = new RectF();
    ((RectF)localObject).set(paramFloat2, paramFloat1, paramFloat2 + paramFloat3, paramFloat3 + paramFloat1);
    localObject = new Rect(yS(Math.round(((RectF)localObject).left)), yS(Math.round(((RectF)localObject).top)), yS(Math.round(((RectF)localObject).right)), yS(Math.round(((RectF)localObject).bottom)));
    AppMethodBeat.o(76474);
    return localObject;
  }

  private static int d(Camera.Parameters paramParameters)
  {
    int i = 0;
    AppMethodBeat.i(76476);
    if (paramParameters == null)
      AppMethodBeat.o(76476);
    while (true)
    {
      return i;
      try
      {
        int j = paramParameters.getMaxZoom() / 2;
        i = j;
        if (j <= 0)
          i = paramParameters.getMaxZoom();
        AppMethodBeat.o(76476);
      }
      catch (Exception paramParameters)
      {
        while (true)
        {
          ab.e("MicroMsg.MMSightCamera", "get target zoom value error: %s", new Object[] { paramParameters.getMessage() });
          i = 0;
        }
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

  final void e(t paramt)
  {
    AppMethodBeat.i(76475);
    if (paramt == null)
    {
      ab.w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
      AppMethodBeat.o(76475);
    }
    while (true)
    {
      return;
      if (!e.ouf)
      {
        ab.w("MicroMsg.MMSightCamera", "auto focus not back");
        AppMethodBeat.o(76475);
      }
      else
      {
        e.ouf = false;
        try
        {
          ab.i("MicroMsg.MMSightCamera", "triggerAutoFocus");
          paramt.cancelAutoFocus();
          paramt.autoFocus(this.ouh.faP);
          AppMethodBeat.o(76475);
        }
        catch (Exception paramt)
        {
          ab.w("MicroMsg.MMSightCamera", "autofocus fail, exception %s", new Object[] { paramt.getMessage() });
          e.ouf = true;
          AppMethodBeat.o(76475);
        }
      }
    }
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = 1;
    AppMethodBeat.i(76477);
    switch (paramMessage.what)
    {
    default:
    case 4354:
    case 4353:
    }
    while (true)
    {
      AppMethodBeat.o(76477);
      while (true)
      {
        return;
        paramMessage = (t)paramMessage.obj;
        if ((this.faM == 0) || (this.faN == 0) || (d.fP(14)))
        {
          e(paramMessage);
          AppMethodBeat.o(76477);
        }
        else
        {
          float f1 = this.faK;
          float f2 = this.faL;
          i = this.faM;
          j = this.faN;
          if (paramMessage == null)
          {
            ab.w("MicroMsg.MMSightCamera", "want to auto focus, but camera is null, do nothing");
            AppMethodBeat.o(76477);
          }
          else if (!e.ouf)
          {
            ab.w("MicroMsg.MMSightCamera", "auto focus not back");
            AppMethodBeat.o(76477);
          }
          else
          {
            e.ouf = false;
            try
            {
              paramMessage.cancelAutoFocus();
              ab.i("MicroMsg.MMSightCamera", "ashutest:: touch %f %f, display %d %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
              Object localObject1 = b(f1, f2, 1.0F, i, j);
              localObject2 = b(f1, f2, 1.5F, i, j);
              ab.i("MicroMsg.MMSightCamera", "ashutest:: focus rect %s, meter rect %s", new Object[] { localObject1, localObject2 });
              localObject3 = paramMessage.getParameters();
              Object localObject4 = ((Camera.Parameters)localObject3).getSupportedFocusModes();
              if ((localObject4 != null) && (((List)localObject4).contains("auto")))
                ((Camera.Parameters)localObject3).setFocusMode("auto");
              if (((Camera.Parameters)localObject3).getMaxNumFocusAreas() > 0)
              {
                localObject4 = new java/util/ArrayList;
                ((ArrayList)localObject4).<init>(1);
                Camera.Area localArea = new android/hardware/Camera$Area;
                localArea.<init>((Rect)localObject1, 1000);
                ((ArrayList)localObject4).add(localArea);
                ((Camera.Parameters)localObject3).setFocusAreas((List)localObject4);
              }
              if (((Camera.Parameters)localObject3).getMaxNumMeteringAreas() > 0)
              {
                localObject4 = new java/util/ArrayList;
                ((ArrayList)localObject4).<init>(1);
                localObject1 = new android/hardware/Camera$Area;
                ((Camera.Area)localObject1).<init>((Rect)localObject2, 1000);
                ((ArrayList)localObject4).add(localObject1);
                ((Camera.Parameters)localObject3).setMeteringAreas((List)localObject4);
              }
              paramMessage.setParameters((Camera.Parameters)localObject3);
              paramMessage.autoFocus(this.ouh.faP);
              AppMethodBeat.o(76477);
            }
            catch (Exception paramMessage)
            {
              ab.w("MicroMsg.MMSightCamera", "autofocus with area fail, exception %s", new Object[] { paramMessage.getMessage() });
              e.ouf = true;
              AppMethodBeat.o(76477);
            }
            continue;
            if (!this.faJ)
              break;
            AppMethodBeat.o(76477);
          }
        }
      }
      Object localObject3 = (Camera)paramMessage.obj;
      Object localObject2 = ((Camera)localObject3).getParameters();
      ab.i("MicroMsg.MMSightCamera", "zoomed %s curZoomStep %s params.getZoom() %s", new Object[] { Boolean.valueOf(this.faH), Integer.valueOf(this.faG), Integer.valueOf(((Camera.Parameters)localObject2).getZoom()) });
      int j = ((Camera.Parameters)localObject2).getZoom() + this.faG;
      if (this.faH)
      {
        int k = d((Camera.Parameters)localObject2);
        if (j >= k)
        {
          j = k;
          label539: ((Camera.Parameters)localObject2).setZoom(j);
        }
      }
      try
      {
        ((Camera)localObject3).setParameters((Camera.Parameters)localObject2);
        label553: if (i == 0)
          continue;
        this.faM = 0;
        this.faN = 0;
        continue;
        paramMessage = obtainMessage(4353, paramMessage.obj);
        if (this.faI);
        for (long l = 10L; ; l = 20L)
        {
          sendMessageDelayed(paramMessage, l);
          i = 0;
          break;
        }
        if (j <= 0)
        {
          j = 0;
          break label539;
        }
        paramMessage = obtainMessage(4353, paramMessage.obj);
        if (this.faI);
        for (l = 10L; ; l = 20L)
        {
          sendMessageDelayed(paramMessage, l);
          i = 0;
          break;
        }
      }
      catch (Exception paramMessage)
      {
        break label553;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.e.c
 * JD-Core Version:    0.6.2
 */