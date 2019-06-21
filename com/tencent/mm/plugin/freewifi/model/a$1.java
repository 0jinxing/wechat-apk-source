package com.tencent.mm.plugin.freewifi.model;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.freewifi.d.b;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1
  implements f
{
  a$1(a parama)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20683);
    paramString = ((b)paramm).mac;
    if (com.tencent.mm.plugin.freewifi.m.isEmpty(paramString))
      AppMethodBeat.o(20683);
    while (true)
    {
      return;
      if (paramInt2 == -30011)
      {
        this.mvA.mvy.put(paramString.hashCode(), Long.valueOf(bo.anU()));
        AppMethodBeat.o(20683);
      }
      else
      {
        this.mvA.mvy.remove(paramString.hashCode());
        AppMethodBeat.o(20683);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.a.1
 * JD-Core Version:    0.6.2
 */