package com.tencent.mm.plugin.hp.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.hp.d.c.a;
import com.tencent.mm.plugin.hp.tinker.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class b$1
  implements c.a
{
  b$1(b paramb)
  {
  }

  public final void a(boolean paramBoolean, com.tencent.mm.plugin.hp.d.b paramb)
  {
    AppMethodBeat.i(90621);
    if ((paramBoolean) && (paramb != null))
    {
      this.ntY.ntX = paramb;
      this.ntY.ntT = this.ntY.ntX.num;
      ab.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "Use last response patchId %s instead of current patchId %s", new Object[] { this.ntY.ntX.num, this.ntY.ntT });
      h.pYm.a(614L, 71L, 1L, false);
      AppMethodBeat.o(90621);
    }
    while (true)
    {
      return;
      Context localContext = ah.getContext();
      paramb = this.ntY.ntS;
      localContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_base_id", paramb).apply();
      g.aB(ah.getContext(), "");
      AppMethodBeat.o(90621);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.c.b.1
 * JD-Core Version:    0.6.2
 */