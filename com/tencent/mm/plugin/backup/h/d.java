package com.tencent.mm.plugin.backup.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends com.tencent.mm.plugin.backup.b.a
{
  private static String TAG = "MicroMsg.BackupStorageModel";
  private static d jyz;
  private b jyA;
  private a jyB;

  public static d aUr()
  {
    AppMethodBeat.i(17706);
    if (jyz == null)
    {
      locald = new d();
      jyz = locald;
      a(locald);
    }
    d locald = jyz;
    AppMethodBeat.o(17706);
    return locald;
  }

  public final void aSp()
  {
    jyz = null;
  }

  public final b aUs()
  {
    AppMethodBeat.i(17707);
    if (this.jyA == null)
      this.jyA = new b();
    b localb = this.jyA;
    AppMethodBeat.o(17707);
    return localb;
  }

  public final a aUt()
  {
    AppMethodBeat.i(17708);
    if (this.jyB == null)
      this.jyB = new a();
    a locala = this.jyB;
    AppMethodBeat.o(17708);
    return locala;
  }

  public final void aUu()
  {
    AppMethodBeat.i(17709);
    ab.i(TAG, "backupInitStorage");
    b localb = aUs();
    aw.ZK();
    String str = c.getAccPath();
    aw.ZK();
    localb.bF(str, c.QF());
    AppMethodBeat.o(17709);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.h.d
 * JD-Core Version:    0.6.2
 */