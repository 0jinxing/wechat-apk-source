package com.tencent.mm.plugin.dbbackup;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2$1
  implements Runnable
{
  c$2$1(c.2 param2, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18929);
    if (this.kHT.kHP != null)
      this.kHT.kHP.dismiss();
    String str;
    if (this.fLS == 0)
      if (this.kHT.kHS)
      {
        str = "incremental";
        str = String.format("Database (%s) backup succeeded, elapsed %.2f seconds.", new Object[] { str, Float.valueOf((float)(System.nanoTime() - this.kHT.fEG) / 1.0E+009F) });
      }
    while (true)
    {
      Toast.makeText(this.kHT.val$context, str, 0).show();
      AppMethodBeat.o(18929);
      return;
      str = "new";
      break;
      if (this.fLS == 1)
        str = "Database backup canceled.";
      else
        str = "Database backup failed.";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c.2.1
 * JD-Core Version:    0.6.2
 */