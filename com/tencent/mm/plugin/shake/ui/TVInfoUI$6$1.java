package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.g.a.cg.a;
import com.tencent.mm.g.a.cg.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.d;

final class TVInfoUI$6$1
  implements h.d
{
  TVInfoUI$6$1(TVInfoUI.6 param6)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24915);
    switch (paramInt2)
    {
    default:
      ab.d("MicroMsg.TVInfoUI", "do del cancel");
      AppMethodBeat.o(24915);
    case -1:
    }
    while (true)
    {
      return;
      cg localcg = new cg();
      localcg.cvt.cvv = this.qwH.qwG.getIntent().getLongExtra("key_favorite_local_id", -1L);
      a.xxA.m(localcg);
      ab.d("MicroMsg.TVInfoUI", "do del fav tv, local id %d, result %B", new Object[] { Long.valueOf(localcg.cvt.cvv), Boolean.valueOf(localcg.cvu.cvi) });
      if (!localcg.cvu.cvi)
        break;
      this.qwH.qwG.finish();
      AppMethodBeat.o(24915);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.TVInfoUI.6.1
 * JD-Core Version:    0.6.2
 */