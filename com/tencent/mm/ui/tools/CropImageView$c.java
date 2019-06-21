package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class CropImageView$c extends TimerTask
{
  public final void run()
  {
    AppMethodBeat.i(107605);
    ab.d("MicroMsg.CropImageView", "in timer task run");
    Message localMessage = new Message();
    if (CropImageView.j(this.zBE))
      localMessage.what = 4659;
    while (true)
    {
      CropImageView.l(this.zBE).sendMessage(localMessage);
      AppMethodBeat.o(107605);
      return;
      if (CropImageView.k(this.zBE))
        localMessage.what = 4658;
      else
        localMessage.what = 4660;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageView.c
 * JD-Core Version:    0.6.2
 */