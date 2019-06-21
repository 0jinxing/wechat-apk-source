package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class CropImageView$b extends TimerTask
{
  public final void run()
  {
    AppMethodBeat.i(107604);
    Message localMessage = new Message();
    if ((CropImageView.p(this.zBE)) || (CropImageView.q(this.zBE)) || (CropImageView.r(this.zBE)) || (CropImageView.s(this.zBE)));
    for (localMessage.what = 4654; ; localMessage.what = 4653)
    {
      CropImageView.t(this.zBE).sendMessage(localMessage);
      AppMethodBeat.o(107604);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageView.b
 * JD-Core Version:    0.6.2
 */