package com.tencent.mm.media.widget.a;

import a.f.b.j;
import a.l;
import a.v;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
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

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camera/CameraHandler;", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "looper", "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "TAG", "", "bCameraReleased", "", "getBCameraReleased$plugin_mediaeditor_release", "()Z", "setBCameraReleased$plugin_mediaeditor_release", "(Z)V", "curZoomStep", "", "getCurZoomStep$plugin_mediaeditor_release", "()I", "setCurZoomStep$plugin_mediaeditor_release", "(I)V", "displayH", "getDisplayH$plugin_mediaeditor_release", "setDisplayH$plugin_mediaeditor_release", "displayW", "getDisplayW$plugin_mediaeditor_release", "setDisplayW$plugin_mediaeditor_release", "forInitialize", "getForInitialize$plugin_mediaeditor_release", "setForInitialize$plugin_mediaeditor_release", "sAutoFocusBack", "getSAutoFocusBack$plugin_mediaeditor_release", "setSAutoFocusBack$plugin_mediaeditor_release", "sAutoFocusCallback", "Landroid/hardware/Camera$AutoFocusCallback;", "getSAutoFocusCallback$plugin_mediaeditor_release", "()Landroid/hardware/Camera$AutoFocusCallback;", "setSAutoFocusCallback$plugin_mediaeditor_release", "(Landroid/hardware/Camera$AutoFocusCallback;)V", "touchX", "", "getTouchX$plugin_mediaeditor_release", "()F", "setTouchX$plugin_mediaeditor_release", "(F)V", "touchY", "getTouchY$plugin_mediaeditor_release", "setTouchY$plugin_mediaeditor_release", "zoomed", "getZoomed$plugin_mediaeditor_release", "setZoomed$plugin_mediaeditor_release", "calculateTapArea", "Landroid/graphics/Rect;", "x", "y", "coefficient", "surfaceWidth", "surfaceHeight", "calculateTapArea$plugin_mediaeditor_release", "clamp", "min", "max", "clamp$plugin_mediaeditor_release", "getTargetZoomStep", "params", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "getTargetZoomStep$plugin_mediaeditor_release", "getTargetZoomValue", "getTargetZoomValue$plugin_mediaeditor_release", "handleMessage", "", "msg", "Landroid/os/Message;", "trigetAutoFocus", "camera", "Lcom/tencent/mm/compatible/deviceinfo/MCamera;", "trigetAutoFocus$plugin_mediaeditor_release", "triggerAutoFocus", "triggerAutoFocus$plugin_mediaeditor_release", "Companion", "plugin-mediaeditor_release"})
public final class c extends ak
{
  private static final int faQ = 4353;
  private static final int faR = 4354;
  private static final int faS = 10;
  private static final int faT = 20;
  private static final int faU = 6;
  public static final c.a faV;
  private final String TAG;
  private int faG;
  boolean faH;
  private boolean faI;
  boolean faJ;
  float faK;
  float faL;
  int faM;
  int faN;
  boolean faO;
  private Camera.AutoFocusCallback faP;

  static
  {
    AppMethodBeat.i(13194);
    faV = new c.a((byte)0);
    faQ = 4353;
    faR = 4354;
    faS = 10;
    faT = 20;
    faU = 6;
    AppMethodBeat.o(13194);
  }

  public c(Looper paramLooper)
  {
    super(paramLooper);
    AppMethodBeat.i(13193);
    this.TAG = "MicroMsg.CameraHandler";
    this.faO = true;
    this.faP = ((Camera.AutoFocusCallback)new c.b(this));
    AppMethodBeat.o(13193);
  }

  private int a(Camera.Parameters paramParameters)
  {
    int i = 0;
    AppMethodBeat.i(13191);
    if (paramParameters == null)
      AppMethodBeat.o(13191);
    while (true)
    {
      return i;
      try
      {
        int j = paramParameters.getMaxZoom() / 2;
        i = j;
        if (j <= 0)
          i = paramParameters.getMaxZoom();
        AppMethodBeat.o(13191);
      }
      catch (Exception paramParameters)
      {
        while (true)
        {
          ab.e(this.TAG, "get target zoom value error: %s", new Object[] { paramParameters.getMessage() });
          i = 0;
        }
      }
    }
  }

  private static Rect a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13190);
    paramFloat3 = 80.0F * paramFloat3;
    paramFloat1 /= paramInt1;
    paramFloat2 /= paramInt2;
    paramFloat1 = paramFloat1 * 2000.0F - 1000.0F - paramFloat3 / 2.0F;
    paramFloat2 = paramFloat2 * 2000.0F - 1000.0F - paramFloat3 / 2.0F;
    Object localObject = new RectF();
    ((RectF)localObject).set(paramFloat1, paramFloat2, paramFloat1 + paramFloat3, paramFloat3 + paramFloat2);
    localObject = new Rect(ki(Math.round(((RectF)localObject).left)), ki(Math.round(((RectF)localObject).top)), ki(Math.round(((RectF)localObject).right)), ki(Math.round(((RectF)localObject).bottom)));
    AppMethodBeat.o(13190);
    return localObject;
  }

  private static int ki(int paramInt)
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
    AppMethodBeat.i(13192);
    j.p(paramMessage, "msg");
    int j = paramMessage.what;
    Object localObject1;
    if (j == faR)
    {
      paramMessage = paramMessage.obj;
      if (paramMessage == null)
      {
        paramMessage = new v("null cannot be cast to non-null type com.tencent.mm.compatible.deviceinfo.MCamera");
        AppMethodBeat.o(13192);
        throw paramMessage;
      }
      localObject1 = (t)paramMessage;
      if ((this.faM == 0) || (this.faN == 0) || (d.fP(14)))
        if (localObject1 == null)
        {
          ab.w(this.TAG, "want to auto focus, but camera is null, do nothing");
          AppMethodBeat.o(13192);
        }
    }
    while (true)
    {
      return;
      if (!this.faO)
      {
        ab.w(this.TAG, "auto focus not back");
        AppMethodBeat.o(13192);
        continue;
      }
      this.faO = false;
      try
      {
        ab.i(this.TAG, "triggerAutoFocus");
        ((t)localObject1).cancelAutoFocus();
        ((t)localObject1).autoFocus(this.faP);
        AppMethodBeat.o(13192);
      }
      catch (Exception paramMessage)
      {
        ab.w(this.TAG, "autofocus fail, exception %s", new Object[] { paramMessage.getMessage() });
        this.faO = true;
        AppMethodBeat.o(13192);
      }
      continue;
      float f1 = this.faK;
      float f2 = this.faL;
      j = this.faM;
      i = this.faN;
      if (localObject1 == null)
      {
        ab.w(this.TAG, "want to auto focus, but camera is null, do nothing");
        AppMethodBeat.o(13192);
        continue;
      }
      if (!this.faO)
      {
        ab.w(this.TAG, "auto focus not back");
        AppMethodBeat.o(13192);
        continue;
      }
      this.faO = false;
      Object localObject2;
      Object localObject3;
      try
      {
        ((t)localObject1).cancelAutoFocus();
        ab.i(this.TAG, "ashutest:: touch %f %f, display %d %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(j), Integer.valueOf(i) });
        localObject2 = a(f1, f2, 1.0F, j, i);
        paramMessage = a(f1, f2, 1.5F, j, i);
        ab.i(this.TAG, "ashutest:: focus rect %s, meter rect %s", new Object[] { localObject2, paramMessage });
        localObject3 = ((t)localObject1).getParameters();
        j.o(localObject3, "parameters");
        Object localObject4 = ((Camera.Parameters)localObject3).getSupportedFocusModes();
        if ((localObject4 != null) && (((List)localObject4).contains("auto")))
          ((Camera.Parameters)localObject3).setFocusMode("auto");
        if (((Camera.Parameters)localObject3).getMaxNumFocusAreas() > 0)
        {
          localObject4 = new java/util/ArrayList;
          ((ArrayList)localObject4).<init>(1);
          Camera.Area localArea = new android/hardware/Camera$Area;
          localArea.<init>((Rect)localObject2, 1000);
          ((ArrayList)localObject4).add(localArea);
          ((Camera.Parameters)localObject3).setFocusAreas((List)localObject4);
        }
        if (((Camera.Parameters)localObject3).getMaxNumMeteringAreas() > 0)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>(1);
          localObject4 = new android/hardware/Camera$Area;
          ((Camera.Area)localObject4).<init>(paramMessage, 1000);
          ((ArrayList)localObject2).add(localObject4);
          ((Camera.Parameters)localObject3).setMeteringAreas((List)localObject2);
        }
        ((t)localObject1).setParameters((Camera.Parameters)localObject3);
        ((t)localObject1).autoFocus(this.faP);
        AppMethodBeat.o(13192);
      }
      catch (Exception paramMessage)
      {
        ab.w(this.TAG, "autofocus with area fail, exception %s", new Object[] { paramMessage.getMessage() });
        this.faO = true;
        AppMethodBeat.o(13192);
      }
      continue;
      if (j == faQ)
      {
        if (this.faJ)
        {
          AppMethodBeat.o(13192);
          continue;
        }
        localObject1 = paramMessage.obj;
        if (localObject1 == null)
        {
          paramMessage = new v("null cannot be cast to non-null type com.tencent.mm.compatible.deviceinfo.MCamera");
          AppMethodBeat.o(13192);
          throw paramMessage;
        }
        localObject3 = (t)localObject1;
        localObject1 = ((t)localObject3).getParameters();
        localObject2 = this.TAG;
        boolean bool = this.faH;
        j = this.faG;
        j.o(localObject1, "params");
        ab.i((String)localObject2, "zoomed %s curZoomStep %s params.getZoom() %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(j), Integer.valueOf(((Camera.Parameters)localObject1).getZoom()) });
        j = ((Camera.Parameters)localObject1).getZoom();
        j = this.faG + j;
        if (!this.faH)
          break label837;
        int k = a((Camera.Parameters)localObject1);
        if (j < k)
          break label794;
        j = k;
        label755: ((Camera.Parameters)localObject1).setZoom(j);
      }
      try
      {
        ((t)localObject3).setParameters((Camera.Parameters)localObject1);
        label768: if (i != 0)
        {
          this.faM = 0;
          this.faN = this.faM;
        }
        AppMethodBeat.o(13192);
        continue;
        label794: paramMessage = obtainMessage(faQ, paramMessage.obj);
        if (this.faI);
        for (i = faS; ; i = faT)
        {
          sendMessageDelayed(paramMessage, i);
          i = 0;
          break;
        }
        label837: if (j <= 0)
        {
          j = 0;
          break label755;
        }
        paramMessage = obtainMessage(faQ, paramMessage.obj);
        if (this.faI);
        for (i = faS; ; i = faT)
        {
          sendMessageDelayed(paramMessage, i);
          i = 0;
          break;
        }
      }
      catch (Exception paramMessage)
      {
        break label768;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.c
 * JD-Core Version:    0.6.2
 */