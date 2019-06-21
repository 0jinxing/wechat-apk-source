package com.tencent.mm.plugin.address.b.b;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;

public final class a
  implements f
{
  private HashSet<m> gIG;
  private HashSet<m> gIH;
  private Dialog gII;

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(16721);
    if (this.gIH.contains(paramm))
    {
      this.gIH.remove(paramm);
      ab.d("MicroMsg.InvoiceNetSceneMgr", "has find scene ");
    }
    while (true)
    {
      if ((this.gIH.isEmpty()) && (this.gIG.isEmpty()) && (this.gII != null))
      {
        this.gII.dismiss();
        this.gII = null;
      }
      AppMethodBeat.o(16721);
      return;
      if (this.gIG.contains(paramm))
      {
        this.gIG.remove(paramm);
        ab.d("MicroMsg.InvoiceNetSceneMgr", "has find forcescenes ");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.b.b.a
 * JD-Core Version:    0.6.2
 */