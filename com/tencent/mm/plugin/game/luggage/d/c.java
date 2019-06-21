package com.tencent.mm.plugin.game.luggage.d;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.luggage.d.g;
import com.tencent.luggage.d.h;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.b.l;
import com.tencent.mm.plugin.webview.luggage.k;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.d;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class c extends k
{
  private com.tencent.mm.plugin.game.luggage.c.b mUB;
  private com.tencent.mm.plugin.game.luggage.c.a.c mUC;
  private e mUm;
  private com.tencent.mm.plugin.game.luggage.c.a.b mUz;

  public c(e parame)
  {
    super(parame);
    this.mUm = parame;
  }

  private com.tencent.mm.plugin.game.luggage.c.a.b getH5GameMenuHelp()
  {
    AppMethodBeat.i(135920);
    if (this.mUz == null)
      this.mUz = new com.tencent.mm.plugin.game.luggage.c.a.b(this.mUm.bPP.getString("game_hv_menu_appid"));
    com.tencent.mm.plugin.game.luggage.c.a.b localb = this.mUz;
    AppMethodBeat.o(135920);
    return localb;
  }

  public final void bDx()
  {
    AppMethodBeat.i(135921);
    if (!(this.mUm instanceof a));
    for (boolean bool = true; ; bool = false)
    {
      if (!this.mUm.bPe.xi().aZ(bool))
        ((Activity)this.mContext).finish();
      AppMethodBeat.o(135921);
      return;
    }
  }

  public final void bDy()
  {
    AppMethodBeat.i(135922);
    boolean bool = false;
    if ((getContext() instanceof MMActivity))
      bool = ((MMActivity)getContext()).mController.hideVKB();
    c.1 local1 = new c.1(this);
    if (bool);
    for (long l = 100L; ; l = 0L)
    {
      al.n(local1, l);
      AppMethodBeat.o(135922);
      return;
    }
  }

  public final void bDz()
  {
    AppMethodBeat.i(135923);
    if (this.mUB != null)
      this.mUB.cXg();
    if (this.mUC != null)
    {
      com.tencent.mm.plugin.game.luggage.c.a.c localc = this.mUC;
      if (localc.mUo != null)
        localc.mUo.cpE();
    }
    AppMethodBeat.o(135923);
  }

  public final l getMenuHelp()
  {
    AppMethodBeat.i(135919);
    if (this.ujb == null)
      this.ujb = new com.tencent.mm.plugin.game.luggage.c.a();
    l locall = this.ujb;
    AppMethodBeat.o(135919);
    return locall;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.c
 * JD-Core Version:    0.6.2
 */