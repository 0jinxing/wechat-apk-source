package com.tencent.mm.ui.tools;

import android.os.Message;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class CropImageView$3$1 extends TimerTask
{
  CropImageView$3$1(CropImageView.3 param3, MotionEvent paramMotionEvent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107602);
    if (CropImageView.z(this.zBG.zBE))
    {
      Message localMessage = new Message();
      localMessage.what = 4661;
      localMessage.obj = this.zBF;
      CropImageView.l(this.zBG.zBE).sendMessage(localMessage);
      CropImageView.c(this.zBG.zBE, false);
    }
    AppMethodBeat.o(107602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageView.3.1
 * JD-Core Version:    0.6.2
 */