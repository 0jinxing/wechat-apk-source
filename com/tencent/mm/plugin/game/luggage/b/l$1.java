package com.tencent.mm.plugin.game.luggage.b;

import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;

final class l$1
  implements MMActivity.a
{
  l$1(l paraml, a.a parama, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(135880);
    if (paramInt1 == (this.mUg.hashCode() & 0xFFFF))
    {
      if (paramInt2 != -1)
        break label96;
      if (paramIntent == null)
        break label83;
      paramIntent = bo.bc(paramIntent.getStringExtra("gameRegionName"), "");
      HashMap localHashMap = new HashMap();
      localHashMap.put("gameRegionName", paramIntent);
      this.mUf.c("", localHashMap);
    }
    while (true)
    {
      this.icV.ifE = null;
      AppMethodBeat.o(135880);
      return;
      label83: this.mUf.a("fail", null);
      continue;
      label96: if (paramInt2 == 1)
        this.mUf.a("fail", null);
      else
        this.mUf.a("cancel", null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.l.1
 * JD-Core Version:    0.6.2
 */