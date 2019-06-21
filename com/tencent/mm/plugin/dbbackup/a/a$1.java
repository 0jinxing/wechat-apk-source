package com.tencent.mm.plugin.dbbackup.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.repair.RepairKit.Callback;

final class a$1
  implements RepairKit.Callback
{
  private int EV = 0;
  private int kJu = 0;
  private boolean kJv = false;

  a$1(a parama, int[] paramArrayOfInt)
  {
  }

  public final int onProgress(String paramString, int paramInt, Cursor paramCursor)
  {
    AppMethodBeat.i(19002);
    if (this.kJu == 0)
      if (paramString.equalsIgnoreCase("message"))
      {
        this.kJu = paramInt;
        paramInt = this.EV;
        this.EV = (paramInt + 1);
        if (paramInt % 1000 == 0)
          a.b(this.kJx, new Integer[] { Integer.valueOf(2), Integer.valueOf(this.EV - 1), Integer.valueOf(a.a(this.kJx)) });
        paramString = this.kJw;
        paramString[0] += 1;
        AppMethodBeat.o(19002);
      }
    while (true)
    {
      return 0;
      AppMethodBeat.o(19002);
      continue;
      if (this.kJu == paramInt)
        break;
      if (!this.kJv)
      {
        this.kJv = true;
        a.a(this.kJx, new Integer[] { Integer.valueOf(3) });
      }
      AppMethodBeat.o(19002);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.a.a.1
 * JD-Core Version:    0.6.2
 */