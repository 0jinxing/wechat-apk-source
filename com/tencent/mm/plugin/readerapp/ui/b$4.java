package com.tencent.mm.plugin.readerapp.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class b$4 extends TimerTask
{
  b$4(ProgressDialog paramProgressDialog, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76789);
    if (this.kHP != null)
    {
      this.kHP.dismiss();
      this.mrz.sendEmptyMessage(0);
    }
    AppMethodBeat.o(76789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.b.4
 * JD-Core Version:    0.6.2
 */