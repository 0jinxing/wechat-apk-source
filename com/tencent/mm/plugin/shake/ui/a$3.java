package com.tencent.mm.plugin.shake.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.TimerTask;

final class a$3 extends TimerTask
{
  a$3(ProgressDialog paramProgressDialog, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24691);
    if (this.kHP != null)
    {
      this.kHP.dismiss();
      this.mrz.sendEmptyMessage(0);
    }
    AppMethodBeat.o(24691);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.a.3
 * JD-Core Version:    0.6.2
 */