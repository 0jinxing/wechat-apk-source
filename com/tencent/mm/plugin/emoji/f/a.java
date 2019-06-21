package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public class a extends ap
{
  private static int kWe;
  private static a kWf;
  private static q kWg;
  private static f kWh;

  static
  {
    AppMethodBeat.i(53092);
    kWe = 0;
    kWh = new a.1();
    AppMethodBeat.o(53092);
  }

  private a()
  {
    super(new a.a(), true);
    AppMethodBeat.i(53091);
    AppMethodBeat.o(53091);
  }

  public static final a bkq()
  {
    AppMethodBeat.i(53087);
    if (kWf == null);
    while (true)
    {
      try
      {
        if (kWf == null)
        {
          locala = new com/tencent/mm/plugin/emoji/f/a;
          locala.<init>();
          kWf = locala;
        }
        a locala = kWf;
        AppMethodBeat.o(53087);
        return locala;
      }
      finally
      {
        AppMethodBeat.o(53087);
      }
      kWf.stopTimer();
    }
  }

  public static void bkr()
  {
    AppMethodBeat.i(53088);
    kWe = 0;
    kWg = new q("com.tencent.xin.emoticon.tusiji", 1);
    g.RO().eJo.a(kWg, 0);
    g.RO().eJo.a(413, kWh);
    ab.d("MicroMsg.emoji.MockTuziDownloading", "add listener");
    AppMethodBeat.o(53088);
  }

  public static void removeListener()
  {
    AppMethodBeat.i(53090);
    if (kWg != null)
      g.RO().eJo.c(kWg);
    g.RO().eJo.b(413, kWh);
    ab.d("MicroMsg.emoji.MockTuziDownloading", "remove listener");
    AppMethodBeat.o(53090);
  }

  public final void bks()
  {
    AppMethodBeat.i(53089);
    stopTimer();
    j.bkn().g(com.tencent.mm.plugin.emoji.h.a.bmu(), 3, kWe, "");
    removeListener();
    AppMethodBeat.o(53089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.a
 * JD-Core Version:    0.6.2
 */