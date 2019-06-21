package com.tencent.mm.plugin.qmessage.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class b$8 extends TimerTask
{
  b$8(ProgressDialog paramProgressDialog, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24109);
    if (this.kHP != null)
    {
      this.kHP.dismiss();
      this.mrz.sendEmptyMessage(0);
    }
    AppMethodBeat.o(24109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.b.8
 * JD-Core Version:    0.6.2
 */