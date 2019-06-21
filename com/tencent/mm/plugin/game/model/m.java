package com.tencent.mm.plugin.game.model;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;

public final class m
  implements f
{
  private static boolean isRunning;
  private static int mWb;
  private static LinkedList<h> mWc;
  private static al mWd;
  private int offset = 0;

  static
  {
    AppMethodBeat.i(111286);
    mWb = 20;
    isRunning = false;
    mWc = new LinkedList();
    AppMethodBeat.o(111286);
  }

  private void bEk()
  {
    AppMethodBeat.i(111284);
    isRunning = false;
    mWd.oAl.quit();
    g.Rg().b(1215, this);
    AppMethodBeat.o(111284);
  }

  public static void update()
  {
    AppMethodBeat.i(111282);
    if (!e.bDY())
    {
      ab.i("MicroMsg.GameListUpdater", "No need to update");
      AppMethodBeat.o(111282);
    }
    while (true)
    {
      return;
      if (isRunning)
      {
        ab.e("MicroMsg.GameListUpdater", "Already running");
        AppMethodBeat.o(111282);
      }
      else
      {
        mWd = new al("GameListUpdate");
        mWc.clear();
        m localm = new m();
        g.Rg().a(1215, localm);
        g.Rg().a(new au(localm.offset, mWb), 0);
        isRunning = true;
        AppMethodBeat.o(111282);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(111283);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      bEk();
      AppMethodBeat.o(111283);
    }
    while (true)
    {
      return;
      mWd.aa(new m.1(this, paramm));
      AppMethodBeat.o(111283);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.m
 * JD-Core Version:    0.6.2
 */