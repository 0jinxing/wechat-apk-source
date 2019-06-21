package com.tencent.mm.plugin.notification;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.model.aq;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class d$2
  implements Runnable
{
  d$2(d paramd, cm paramcm, aq paramaq, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125800);
    if (this.oVE.nao == 49)
    {
      j.b localb = j.b.me(d.c(this.oVE));
      if ((localb.fhN == 1) && (!bo.isNullOrNil(localb.fhO)) && (!bo.isNullOrNil(localb.fhP)))
      {
        this.oVF.a(39, localb.fhP, "", localb.fhO, null, null);
        AppMethodBeat.o(125800);
      }
    }
    while (true)
    {
      return;
      this.oVF.a(this.fku);
      AppMethodBeat.o(125800);
      continue;
      this.oVF.a(this.fku);
      AppMethodBeat.o(125800);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.2
 * JD-Core Version:    0.6.2
 */