package com.tencent.mm.plugin.profile.ui.newbizinfo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class b$2$1
  implements n.c
{
  b$2$1(b.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(23803);
    if (a.jh(this.ppP.ppO.ehM.field_type))
    {
      if (!this.ppP.ppO.ehM.Oe())
        break label135;
      if ((!s.aVO()) || (!f.qZ(this.ppP.ppO.ehM.field_username)))
        break label124;
      paraml.hi(5, 2131298473);
    }
    while (true)
    {
      paraml.hi(1, 2131298467);
      if (a.jh(this.ppP.ppO.ehM.field_type))
      {
        paraml.hi(2, 2131298663);
        paraml.hi(3, 2131298484);
      }
      AppMethodBeat.o(23803);
      return;
      label124: paraml.hi(5, 2131301284);
      continue;
      label135: if ((s.aVO()) && (f.qZ(this.ppP.ppO.ehM.field_username)))
        paraml.hi(4, 2131298469);
      else
        paraml.hi(4, 2131298732);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.2.1
 * JD-Core Version:    0.6.2
 */