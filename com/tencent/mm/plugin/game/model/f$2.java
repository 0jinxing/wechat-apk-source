package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.protocal.protobuf.asm;
import com.tencent.mm.sdk.platformtools.ab;

final class f$2
  implements f.a
{
  f$2(String paramString, asm paramasm)
  {
  }

  public final void onComplete()
  {
    AppMethodBeat.i(111237);
    ab.i("MicroMsg.GameCommOpertionProcessor", "menu icon download complete! save menu data. appid:%s", new Object[] { this.hxh });
    ((c)g.K(c.class)).bCZ().b("pb_game_hv_menu_" + this.hxh, this.mVM);
    AppMethodBeat.o(111237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.f.2
 * JD-Core Version:    0.6.2
 */