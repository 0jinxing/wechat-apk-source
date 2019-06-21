package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.km;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.storage.u;

final class l$1
  implements ao.b.a
{
  l$1(l paraml, u paramu, String paramString)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(18266);
    if ((this.ewm != null) && (this.ewm.drU()))
    {
      paramString = new km();
      paramString.cGi.chatroomName = this.fkv;
      paramString.cGi.cGj = this.ewm.drT();
      a.xxA.m(paramString);
    }
    AppMethodBeat.o(18266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.l.1
 * JD-Core Version:    0.6.2
 */