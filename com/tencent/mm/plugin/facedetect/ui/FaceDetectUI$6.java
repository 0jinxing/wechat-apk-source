package com.tencent.mm.plugin.facedetect.ui;

import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.model.h;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView;
import com.tencent.mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectUI$6
  implements Runnable
{
  FaceDetectUI$6(FaceDetectUI paramFaceDetectUI)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(464);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo dismiss cover and start capture");
    FaceDetectUI.h(this.lXO).btu();
    FaceDetectUI.h(this.lXO).btv();
    FaceDetectUI localFaceDetectUI = this.lXO;
    if (h.lTS == null)
      h.lTS = new h();
    localFaceDetectUI.lXz = h.lTS;
    Object localObject2 = localFaceDetectUI.lXz;
    ((h)localObject2).lfO = 0;
    ((h)localObject2).lTQ = null;
    ((h)localObject2).lTR = -1;
    localObject2 = localFaceDetectUI.lXz;
    Object localObject3 = f.lTL.lTM.lVR;
    int i;
    label129: String str;
    if (((g)localObject3).lTP == null)
    {
      ab.e("MicroMsg.FaceDetectNativeManager", "hy: get all motion not init");
      ((h)localObject2).lTQ = ((int[])localObject1);
      if (((h)localObject2).lTQ != null)
        break label310;
      i = 0;
      ((h)localObject2).lTR = i;
      localFaceDetectUI.lsZ = true;
      localObject1 = localFaceDetectUI.lXF;
      localObject2 = new RectF(localFaceDetectUI.lXG.getLeft(), localFaceDetectUI.lXG.getTop(), localFaceDetectUI.lXG.getRight(), localFaceDetectUI.lXG.getBottom());
      localObject3 = ((FaceDetectView)localObject1).maB;
      str = ((RectF)localObject2).toString();
      if (((FaceDetectDecorView)localObject3).may != null)
        break label320;
    }
    label310: label320: for (localObject1 = "null"; ; localObject1 = ((FaceDetectDecorView)localObject3).may.toString())
    {
      ab.i("MicroMsg.FaceDetectDecorView", "hy: trigger showCover cover: %s, old: %s", new Object[] { str, localObject1 });
      ((FaceDetectDecorView)localObject3).mav = true;
      if ((((FaceDetectDecorView)localObject3).may == null) || (!((FaceDetectDecorView)localObject3).may.equals(localObject2)))
      {
        ((FaceDetectDecorView)localObject3).may = ((RectF)localObject2);
        ab.i("MicroMsg.FaceDetectDecorView", "alvinluo invalidate %s", new Object[] { ((FaceDetectDecorView)localObject3).may.toString() });
        ((FaceDetectDecorView)localObject3).invalidate();
      }
      localFaceDetectUI.btq();
      AppMethodBeat.o(464);
      return;
      localObject1 = ((g)localObject3).lTP.engineGetAllMotions();
      break;
      i = ((h)localObject2).lTQ.length;
      break label129;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.6
 * JD-Core Version:    0.6.2
 */