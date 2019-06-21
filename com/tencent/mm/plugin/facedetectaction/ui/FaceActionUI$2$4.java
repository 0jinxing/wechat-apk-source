package com.tencent.mm.plugin.facedetectaction.ui;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetectaction.b.d;
import com.tencent.mm.sdk.platformtools.bo;

final class FaceActionUI$2$4
  implements Runnable
{
  FaceActionUI$2$4(FaceActionUI.2 param2, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(715);
    if (!bo.isNullOrNil(this.mdj))
    {
      FaceActionUI.g(this.mdh.mde).setText(this.mdj);
      FaceActionUI.h(this.mdh.mde);
      if (this.mdk != 1)
        break label212;
      FaceActionUI.i(this.mdh.mde).setText(2131299513);
      FaceActionUI.i(this.mdh.mde).setOnClickListener(new FaceActionUI.2.4.1(this));
    }
    while (true)
    {
      FaceActionUI.f(this.mdh.mde).clearAnimation();
      FaceActionUI localFaceActionUI = this.mdh.mde;
      localFaceActionUI.mcN.setVisibility(8);
      localFaceActionUI.lYi.setVisibility(0);
      localFaceActionUI.lYk.clearAnimation();
      localFaceActionUI.mcR.setVisibility(0);
      localFaceActionUI.lYg.setVisibility(8);
      d.mcq.mStatus = 3;
      if (bo.isNullOrNil(d.mcq.cKU))
        this.mdh.mde.s("fail", this.mdl, "");
      AppMethodBeat.o(715);
      return;
      FaceActionUI.g(this.mdh.mde).setText(2131299432);
      break;
      label212: FaceActionUI.i(this.mdh.mde).setText(2131299512);
      FaceActionUI.i(this.mdh.mde).setOnClickListener(new FaceActionUI.2.4.2(this));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.2.4
 * JD-Core Version:    0.6.2
 */