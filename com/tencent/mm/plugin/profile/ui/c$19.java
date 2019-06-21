package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class c$19
  implements n.c
{
  c$19(c paramc)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(23474);
    if ((this.pmK.pkW != null) && (this.pmK.pkW.adP()))
    {
      paraml.hi(1, 2131298663);
      paraml.hi(3, 2131297652);
      paraml.hi(4, 2131298481);
      paraml.hi(5, 2131298439);
      AppMethodBeat.o(23474);
    }
    while (true)
    {
      return;
      if ((this.pmK.pkW != null) && (this.pmK.pkW.adQ()))
      {
        paraml.hi(5, 2131298439);
        AppMethodBeat.o(23474);
      }
      else
      {
        paraml.hi(1, 2131298663);
        paraml.hi(2, 2131298458);
        if (!t.nQ(this.pmK.ehM.field_username))
        {
          paraml.hi(3, 2131297652);
          paraml.hi(4, 2131298481);
        }
        paraml.hi(5, 2131298439);
        AppMethodBeat.o(23474);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.19
 * JD-Core Version:    0.6.2
 */