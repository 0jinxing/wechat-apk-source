package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.vfs.e;

final class b$2$1
  implements al.a
{
  b$2$1(b.2 param2)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(18007);
    ab.i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb doInBackground start");
    ab.dot();
    b.aVe();
    e.N(com.tencent.mm.plugin.backup.bakoldlogic.a.a.aUy(), true);
    a locala = this.jAX.jAU.aVa();
    locala.handler.post(new a.2(locala));
    ab.i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb doInBackground end");
    ab.dot();
    AppMethodBeat.o(18007);
    return true;
  }

  public final boolean acg()
  {
    AppMethodBeat.i(18006);
    ab.i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb onPostExecute");
    this.jAX.jAW.run();
    com.tencent.mm.sdk.b.a.xxA.m(new qo());
    AppMethodBeat.o(18006);
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(18008);
    String str = super.toString() + "|bakoldRecoverFromTempDb";
    AppMethodBeat.o(18008);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.b.2.1
 * JD-Core Version:    0.6.2
 */