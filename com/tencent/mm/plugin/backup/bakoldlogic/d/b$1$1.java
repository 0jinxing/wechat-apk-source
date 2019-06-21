package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;

final class b$1$1
  implements al.a
{
  b$1$1(b.1 param1)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(18003);
    b.aVd();
    PLong localPLong1 = new PLong();
    PLong localPLong2 = new PLong();
    PLong localPLong3 = new PLong();
    b.a(this.jAV.jAU, localPLong1, localPLong2, localPLong3, this.jAV.jAT, this.jAV.jxL);
    AppMethodBeat.o(18003);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(18002);
    ab.i("MicroMsg.BakOldTempDbModel", "initTempDB onPostExecute");
    this.jAV.jAT.run();
    b.Fd();
    AppMethodBeat.o(18002);
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(18004);
    String str = super.toString() + "|initTempDB";
    AppMethodBeat.o(18004);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.b.1.1
 * JD-Core Version:    0.6.2
 */