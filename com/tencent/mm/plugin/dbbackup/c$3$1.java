package com.tencent.mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$3$1
  implements Runnable
{
  c$3$1(c.3 param3, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18931);
    if (this.kHU.kHP != null)
      this.kHU.kHP.dismiss();
    String str;
    if (this.fLS == 0)
      str = String.format("Database recovery succeeded, elapsed %.2f seconds.", new Object[] { Float.valueOf((float)(System.nanoTime() - this.kHU.fEG) / 1.0E+009F) });
    while (true)
    {
      Toast.makeText(this.kHU.val$context, str, 0).show();
      AppMethodBeat.o(18931);
      return;
      if (this.fLS == 1)
        str = "Database recovery canceled.";
      else
        str = "Database recovery failed.";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c.3.1
 * JD-Core Version:    0.6.2
 */