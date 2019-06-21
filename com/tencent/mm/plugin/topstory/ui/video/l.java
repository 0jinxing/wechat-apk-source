package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.topstory.a.c;
import com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI;
import com.tencent.mm.sdk.platformtools.ah;
import com.tinkerboots.sdk.b.a;

public final class l
{
  private n.a kto;
  public boolean sEM;
  c sEN;
  public int sEO;

  public l()
  {
    AppMethodBeat.i(1743);
    this.kto = new l.1(this);
    this.sEM = false;
    this.sEO = cGO();
    g.RO().a(this.kto);
    AppMethodBeat.o(1743);
  }

  public static int cGO()
  {
    AppMethodBeat.i(1745);
    int i;
    if (!a.isConnected(ah.getContext()))
    {
      i = 0;
      AppMethodBeat.o(1745);
    }
    while (true)
    {
      return i;
      if (a.isWifi(ah.getContext()))
      {
        if (((PluginTopStoryUI)g.M(PluginTopStoryUI.class)).getTopStoryCommand().sBk)
        {
          AppMethodBeat.o(1745);
          i = 2;
        }
        else
        {
          i = 1;
          AppMethodBeat.o(1745);
        }
      }
      else
      {
        AppMethodBeat.o(1745);
        i = 2;
      }
    }
  }

  public final void aEX()
  {
    AppMethodBeat.i(1744);
    g.RO().b(this.kto);
    this.sEN = null;
    this.sEO = 0;
    this.sEM = false;
    AppMethodBeat.o(1744);
  }

  public final boolean bkJ()
  {
    boolean bool = true;
    if (this.sEO == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean cGN()
  {
    if (this.sEO == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isConnected()
  {
    if (this.sEO != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.l
 * JD-Core Version:    0.6.2
 */