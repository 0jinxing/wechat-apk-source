package com.tencent.mm.plugin.emoji.sync;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class a<T extends c>
{
  public BKGLoaderManager kXj;

  public a()
  {
    AppMethodBeat.i(53171);
    b.a locala = new b.a();
    locala.kXk = 1;
    locala.eRC = 10;
    com.tencent.mm.at.a.e.a locala1 = new com.tencent.mm.at.a.e.a();
    locala.kXl = new b.b(locala.kXk, locala.kXk, locala1);
    a(new b(locala));
    AppMethodBeat.o(53171);
  }

  private void a(b paramb)
  {
    try
    {
      AppMethodBeat.i(53172);
      if (this.kXj == null)
      {
        BKGLoaderManager localBKGLoaderManager = new com/tencent/mm/plugin/emoji/sync/BKGLoaderManager;
        localBKGLoaderManager.<init>(paramb);
        this.kXj = localBKGLoaderManager;
        AppMethodBeat.o(53172);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.BKGLoader.BKGLoader", "[cpan] BKGLoader had init.");
        AppMethodBeat.o(53172);
      }
    }
    finally
    {
    }
    throw paramb;
  }

  public final void z(ArrayList<c> paramArrayList)
  {
    AppMethodBeat.i(53173);
    this.kXj.bu(paramArrayList);
    AppMethodBeat.o(53173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.sync.a
 * JD-Core Version:    0.6.2
 */