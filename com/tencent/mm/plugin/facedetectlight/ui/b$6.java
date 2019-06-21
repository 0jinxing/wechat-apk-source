package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$6
  implements Runnable
{
  b$6(b paramb, double paramDouble)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(765);
    ab.d("MicroMsg.FaceReflectCam", "reset ratio");
    int i = this.mdJ.mdA.getContext().getResources().getDisplayMetrics().widthPixels;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.mdJ.mdA.getLayoutParams();
    localLayoutParams.width = ((int)(i * 0.7D));
    localLayoutParams.height = ((int)(localLayoutParams.width * this.mdN));
    localLayoutParams.addRule(13, -1);
    this.mdJ.mdA.setLayoutParams(localLayoutParams);
    this.mdJ.mdA.setAspectRatio(this.mdN);
    ab.d("MicroMsg.FaceReflectCam", "after reset ratio=" + this.mdJ.mdA.getmAspectRatio());
    AppMethodBeat.o(765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b.6
 * JD-Core Version:    0.6.2
 */