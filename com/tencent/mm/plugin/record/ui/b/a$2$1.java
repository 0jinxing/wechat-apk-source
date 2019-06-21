package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Map;

final class a$2$1
  implements n.c
{
  a$2$1(a.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(24337);
    nr localnr;
    if (a.2.a(this.pKX).whh == 0)
    {
      if (a.2.b(this.pKX).but())
        paraml.e(2, a.2.c(this.pKX).getString(2131299734));
      if (a.2.b(this.pKX).buu())
        paraml.e(1, a.2.c(this.pKX).getString(2131299688));
      paraml.e(3, a.2.c(this.pKX).getString(2131299727));
      localnr = (nr)this.pKX.pKU.mim.get(a.2.d(this.pKX));
      if (localnr != null)
      {
        if (bo.isNullOrNil(localnr.cJX.result))
          break label324;
        if (com.tencent.mm.plugin.scanner.a.BR(localnr.cJX.cvn))
        {
          paraml.e(4, a.2.c(this.pKX).getString(2131302187));
          AppMethodBeat.o(24337);
        }
      }
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.scanner.a.ba(localnr.cJX.cvn, localnr.cJX.result))
      {
        paraml.e(4, a.2.c(this.pKX).getString(2131302188));
        AppMethodBeat.o(24337);
      }
      else if (com.tencent.mm.plugin.scanner.a.BQ(localnr.cJX.cvn))
      {
        paraml.e(4, a.2.c(this.pKX).getString(2131302186));
        AppMethodBeat.o(24337);
      }
      else
      {
        paraml.e(4, a.2.c(this.pKX).getString(2131302187));
        AppMethodBeat.o(24337);
        continue;
        paraml = new np();
        paraml.cJU.filePath = a.2.d(this.pKX);
        com.tencent.mm.sdk.b.a.xxA.m(paraml);
        label324: AppMethodBeat.o(24337);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.a.2.1
 * JD-Core Version:    0.6.2
 */