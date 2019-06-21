package com.tencent.mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$4$1
  implements Runnable
{
  c$4$1(c.4 param4, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18933);
    if (this.kHV.kHP != null)
      this.kHV.kHP.dismiss();
    String str;
    if (this.fLS == 0)
      str = String.format("Database recovery succeeded, elapsed %.2f seconds.", new Object[] { Float.valueOf((float)(System.nanoTime() - this.kHV.fEG) / 1.0E+009F) });
    while (true)
    {
      Toast.makeText(this.kHV.val$context, str, 0).show();
      AppMethodBeat.o(18933);
      return;
      if (this.fLS == 1)
        str = "Database recovery canceled.";
      else
        str = "Database recovery failed.";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c.4.1
 * JD-Core Version:    0.6.2
 */