package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.a.m.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;

public final class bw extends j<bv>
  implements m
{
  public static final String[] fnj;
  private e bSd;
  private final l<m.a, bv> xHV;

  static
  {
    AppMethodBeat.i(1482);
    fnj = new String[] { j.a(bv.ccO, "Stranger") };
    AppMethodBeat.o(1482);
  }

  public bw(e parame)
  {
    super(parame, bv.ccO, "Stranger", null);
    AppMethodBeat.i(1477);
    this.xHV = new l()
    {
    };
    this.bSd = parame;
    AppMethodBeat.o(1477);
  }

  private void b(bv parambv)
  {
    AppMethodBeat.i(1474);
    if (this.xHV.cF(parambv))
      this.xHV.doNotify();
    AppMethodBeat.o(1474);
  }

  public final bv RB(String paramString)
  {
    bv localbv = null;
    AppMethodBeat.i(1478);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(1478);
    for (paramString = localbv; ; paramString = localbv)
    {
      return paramString;
      localbv = new bv();
      paramString = this.bSd.a("Stranger", null, "encryptUsername = ?", new String[] { paramString }, null, null, null, 2);
      if (paramString.moveToFirst())
        localbv.d(paramString);
      paramString.close();
      AppMethodBeat.o(1478);
    }
  }

  public final int RC(String paramString)
  {
    AppMethodBeat.i(1479);
    int i = this.bSd.delete("Stranger", "(encryptUsername=?)", new String[] { String.valueOf(paramString) });
    if (i > 0)
      doNotify();
    ab.i("MicroMsg.StrangerStorage", "delByEncryptUsername:" + paramString + " result:" + i);
    AppMethodBeat.o(1479);
    return i;
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(1475);
    this.xHV.a(parama, null);
    AppMethodBeat.o(1475);
  }

  public final void b(m.a parama)
  {
    AppMethodBeat.i(1476);
    this.xHV.remove(parama);
    AppMethodBeat.o(1476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bw
 * JD-Core Version:    0.6.2
 */