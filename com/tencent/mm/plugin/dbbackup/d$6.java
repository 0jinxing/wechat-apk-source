package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;

final class d$6
  implements Runnable
{
  d$6(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18975);
    Object localObject = this.kIZ + "corrupted/EnMicroMsg.db";
    if (e.ct((String)localObject + ".corrupt"))
      AppMethodBeat.o(18975);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      b localb = new b(this.kIZ + "corrupted");
      if (!localb.isDirectory())
      {
        AppMethodBeat.o(18975);
      }
      else
      {
        localObject = localb.dMF();
        int i = localObject.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label164;
          if (l - localObject[j].lastModified() < 7776000000L)
          {
            AppMethodBeat.o(18975);
            break;
          }
        }
        label164: if (e.N(j.w(localb.mUri), true))
          ab.i("MicroMsg.SubCoreDBBackup", "Corrupted databases removed.");
        AppMethodBeat.o(18975);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.d.6
 * JD-Core Version:    0.6.2
 */