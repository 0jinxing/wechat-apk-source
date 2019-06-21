package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;

final class CleanChattingUI$6
  implements Runnable
{
  CleanChattingUI$6(CleanChattingUI paramCleanChattingUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18785);
    if (!CleanChattingUI.c(this.kxM))
    {
      ab.i("MicroMsg.CleanChattingUI", "load contact cursor now");
      CleanChattingUI.d(this.kxM);
      al.d(new CleanChattingUI.6.1(this));
      try
      {
        Cursor localCursor = com.tencent.mm.plugin.f.b.aZc().aZd().aZo();
        if (localCursor != null)
          while (localCursor.moveToNext())
          {
            c localc = new com/tencent/mm/plugin/clean/ui/fileindexui/c;
            localc.<init>();
            localc.username = localCursor.getString(0);
            localc.size = localCursor.getLong(1);
            CleanChattingUI.f(this.kxM).add(localc);
          }
      }
      catch (NullPointerException localNullPointerException)
      {
        ab.printErrStackTrace("MicroMsg.CleanChattingUI", localNullPointerException, "", new Object[0]);
        al.d(new CleanChattingUI.6.2(this));
      }
    }
    AppMethodBeat.o(18785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI.6
 * JD-Core Version:    0.6.2
 */