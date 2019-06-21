package com.tencent.mm.plugin.facedetectaction.ui;

import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceActionUI$2$3
  implements Runnable
{
  FaceActionUI$2$3(FaceActionUI.2 param2, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(712);
    FaceActionUI.f(this.mdh.mde).clearAnimation();
    FaceActionUI localFaceActionUI = this.mdh.mde;
    localFaceActionUI.mcN.setVisibility(8);
    localFaceActionUI.lYk.clearAnimation();
    localFaceActionUI.lYg.setVisibility(8);
    localFaceActionUI.mcR.setVisibility(0);
    localFaceActionUI.lYh.setVisibility(0);
    localFaceActionUI.lYl.setScaleX(0.0F);
    localFaceActionUI.lYl.setScaleY(0.0F);
    localFaceActionUI.lYl.animate().scaleX(1.0F).scaleY(1.0F).setDuration(800L);
    localFaceActionUI = this.mdh.mde;
    String str = this.mdi;
    ab.i("MicroMsg.FaceActionUI", "callbackDetectSuccess（）");
    Bundle localBundle = new Bundle();
    localBundle.putString("token", str);
    localFaceActionUI.cvG = 0;
    localFaceActionUI.a("ok", 0, localBundle, Boolean.valueOf(localFaceActionUI.mcY));
    AppMethodBeat.o(712);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.2.3
 * JD-Core Version:    0.6.2
 */