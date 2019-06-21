package com.tencent.mm.plugin.game.luggage.d;

import android.os.Bundle;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.c.b;
import com.tencent.mm.sdk.platformtools.bo;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135918);
    if (bo.isNullOrNil(c.a(this.mUD).bPP.getString("game_hv_menu_appid")))
    {
      c.a(this.mUD, new b(c.a(this.mUD), this.mUD.getMenuHelp()));
      AppMethodBeat.o(135918);
    }
    while (true)
    {
      return;
      c.a(this.mUD, new com.tencent.mm.plugin.game.luggage.c.a.c(c.a(this.mUD), c.b(this.mUD)));
      AppMethodBeat.o(135918);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.c.1
 * JD-Core Version:    0.6.2
 */