package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Rect;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

final class ScanTranslationCaptureUI$3
  implements View.OnTouchListener
{
  ScanTranslationCaptureUI$3(ScanTranslationCaptureUI paramScanTranslationCaptureUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(81257);
    float f1;
    float f2;
    ScanTranslationCaptureUI.3.1 local1;
    int i;
    int j;
    if ((ScanTranslationCaptureUI.e(this.qgh) == 0) && (paramView == ScanTranslationCaptureUI.b(this.qgh)))
      if (paramMotionEvent.getAction() == 0)
      {
        ab.i("MicroMsg.ScanTranslationCaptureUI", "event down, (%f, %f)", new Object[] { Float.valueOf(paramMotionEvent.getX()), Float.valueOf(paramMotionEvent.getY()) });
        f1 = paramMotionEvent.getX() / ScanTranslationCaptureUI.b(this.qgh).getWidth();
        f2 = paramMotionEvent.getY() / ScanTranslationCaptureUI.b(this.qgh).getHeight();
        paramView = ScanTranslationCaptureUI.h(this.qgh);
        local1 = new ScanTranslationCaptureUI.3.1(this);
        i = (int)(2000.0F * f1);
        j = (int)(2000.0F * f2);
      }
    while (true)
    {
      try
      {
        ab.i("MicroMsg.scanner.ScanCamera", "fx %f, fy %f, x %d, y %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
        Object localObject1 = new android/graphics/Rect;
        ((Rect)localObject1).<init>();
        if ((paramView.lUI) && (!paramView.qhS))
        {
          ((Rect)localObject1).left = (j - 1000 - 250);
          ((Rect)localObject1).right = (j - 1000 + 250);
          ((Rect)localObject1).top = (2000 - i - 1000 - 250);
          ((Rect)localObject1).bottom = (2000 - i - 1000 + 250);
          paramMotionEvent = paramView.erH.getParameters();
          if (((Rect)localObject1).left < -1000)
            ((Rect)localObject1).left = -1000;
          if (((Rect)localObject1).right > 1000)
            ((Rect)localObject1).right = 1000;
          if (((Rect)localObject1).top < -1000)
            ((Rect)localObject1).top = -1000;
          if (((Rect)localObject1).bottom > 1000)
            ((Rect)localObject1).bottom = 1000;
          ab.i("MicroMsg.scanner.ScanCamera", "focus area, %s", new Object[] { localObject1 });
          Object localObject2 = new android/graphics/Rect;
          ((Rect)localObject2).<init>((Rect)localObject1);
          if (paramMotionEvent.getMaxNumMeteringAreas() > 0)
          {
            Object localObject3 = new java/util/ArrayList;
            ((ArrayList)localObject3).<init>();
            Camera.Area localArea = new android/hardware/Camera$Area;
            localArea.<init>((Rect)localObject2, 1000);
            ((ArrayList)localObject3).add(localArea);
            paramMotionEvent.setMeteringAreas((List)localObject3);
            if (paramMotionEvent.getMaxNumFocusAreas() <= 0)
              continue;
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            localObject3 = new android/hardware/Camera$Area;
            ((Camera.Area)localObject3).<init>((Rect)localObject1, 1000);
            ((ArrayList)localObject2).add(localObject3);
            paramMotionEvent.setFocusAreas((List)localObject2);
            paramView.erH.cancelAutoFocus();
            if ((paramView.erH != null) && (paramView.lUE))
            {
              localObject1 = paramMotionEvent.getSupportedFocusModes();
              if ((localObject1 != null) && (((List)localObject1).contains("auto")) && (!bo.isNullOrNil(paramMotionEvent.getFocusMode())) && (!paramMotionEvent.getFocusMode().equals("auto")))
                paramMotionEvent.setFocusMode("auto");
            }
            paramView.erH.setParameters(paramMotionEvent);
            paramView.erH.autoFocus(local1);
            bool = true;
            AppMethodBeat.o(81257);
            return bool;
          }
        }
        else
        {
          ((Rect)localObject1).left = (i - 1000 - 250);
          ((Rect)localObject1).right = (i - 1000 + 250);
          ((Rect)localObject1).top = (j - 1000 - 250);
          ((Rect)localObject1).bottom = (j - 1000 + 250);
          continue;
        }
      }
      catch (Exception paramView)
      {
        ab.e("MicroMsg.scanner.ScanCamera", "setCaptureFocusAndMeteringArea error: %s", new Object[] { paramView.getMessage() });
        continue;
        ab.i("MicroMsg.scanner.ScanCamera", "setCaptureFocusAndMeteringArea, camera not support set metering area");
        continue;
        ab.i("MicroMsg.scanner.ScanCamera", "setCaptureFocusAndMeteringArea, camera not support area focus");
        continue;
      }
      boolean bool = false;
      AppMethodBeat.o(81257);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.3
 * JD-Core Version:    0.6.2
 */