package com.tencent.mm.plugin.zero.tasks;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ab.a;
import com.tencent.wcdb.support.Log.LogCallback;
import java.util.HashSet;

final class a$1
  implements Log.LogCallback
{
  private final HashSet<String> vah;

  a$1(a parama)
  {
    AppMethodBeat.i(58777);
    this.vah = new HashSet();
    AppMethodBeat.o(58777);
  }

  public final void println(int paramInt, String arg2, String paramString2)
  {
    AppMethodBeat.i(58778);
    ab.a locala = ab.dos();
    int i = Process.myPid();
    int j = Process.myTid();
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(58778);
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      return;
      locala.logV(???, "", "", 0, i, j, i, paramString2);
      AppMethodBeat.o(58778);
      continue;
      locala.logD(???, "", "", 0, i, j, i, paramString2);
      AppMethodBeat.o(58778);
      continue;
      locala.logI(???, "", "", 0, i, j, i, paramString2);
      AppMethodBeat.o(58778);
      continue;
      locala.logW(???, "", "", 0, i, j, i, paramString2);
      if ((???.equals("WCDB.SQLite")) && (paramString2.startsWith("[SQLite ErrCode: 284] automatic index on ")))
      {
        paramString2 = paramString2.substring(41);
        synchronized (this.vah)
        {
          boolean bool = this.vah.add(paramString2);
          if (bool)
            break label280;
        }
        try
        {
          e.pXa.g("DBAutoIndex", paramString2, null);
          AppMethodBeat.o(58778);
          continue;
          paramString2 = finally;
          AppMethodBeat.o(58778);
          throw paramString2;
        }
        catch (Exception )
        {
          ab.e("DBLogger", "Cannot report automatic index: " + ???.getMessage());
        }
      }
      else
      {
        label280: AppMethodBeat.o(58778);
        continue;
        locala.logE(???, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58778);
        continue;
        locala.logF(???, "", "", 0, i, j, i, paramString2);
        AppMethodBeat.o(58778);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.tasks.a.1
 * JD-Core Version:    0.6.2
 */