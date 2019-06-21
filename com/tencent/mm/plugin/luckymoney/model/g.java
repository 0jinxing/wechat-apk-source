package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.File;

public final class g
{
  private static String nWB;
  private static c<bf> nWC;

  static
  {
    AppMethodBeat.i(42285);
    nWB = null;
    nWC = new c()
    {
    };
    AppMethodBeat.o(42285);
  }

  public static void aon()
  {
    AppMethodBeat.i(42281);
    ab.i("MicroMsg.LuckMoneyEffectResourceMgr", "unInit");
    a.xxA.d(nWC);
    AppMethodBeat.o(42281);
  }

  public static void bLs()
  {
    AppMethodBeat.i(42282);
    File localFile = new File(b.eSn + "wallet/luckyMoneyEffect/");
    ab.d("MicroMsg.LuckMoneyEffectResourceMgr", "no media");
    if ((localFile.isDirectory()) && (localFile.exists()))
      ab.i("MicroMsg.LuckMoneyEffectResourceMgr", "delete unused files: %s", new Object[] { Boolean.valueOf(e.N(localFile.getPath(), true)) });
    AppMethodBeat.o(42282);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.g
 * JD-Core Version:    0.6.2
 */