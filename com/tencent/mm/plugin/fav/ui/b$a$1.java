package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.r;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a$1
  implements Runnable
{
  b$a$1(b.a parama, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73917);
    if (this.mhm)
    {
      ab.i("MicroMsg.Fav.FavAddService", "has data, check cdn now, type %d", new Object[] { Integer.valueOf(this.mhn.mgf.field_type) });
      this.mhn.mgf.field_itemStatus = 1;
      this.mhn.mgf.field_xml = com.tencent.mm.plugin.fav.a.g.s(this.mhn.mgf);
      if (!b.k(this.mhn.mgf))
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().y(this.mhn.mgf);
      while (true)
      {
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getCheckCdnService().run();
        AppMethodBeat.o(73917);
        return;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mhn.mgf, new String[0]);
      }
    }
    ab.i("MicroMsg.Fav.FavAddService", "no data, send item now, type %d", new Object[] { Integer.valueOf(this.mhn.mgf.field_type) });
    this.mhn.mgf.field_itemStatus = 9;
    this.mhn.mgf.field_xml = com.tencent.mm.plugin.fav.a.g.s(this.mhn.mgf);
    if (!b.k(this.mhn.mgf))
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().y(this.mhn.mgf);
    while (true)
    {
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
      AppMethodBeat.o(73917);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mhn.mgf, new String[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b.a.1
 * JD-Core Version:    0.6.2
 */