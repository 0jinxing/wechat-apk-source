package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class k$4
  implements e.a
{
  k$4(k paramk)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(32389);
    al.d(new k.4.1(this));
    AppMethodBeat.o(32389);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32390);
    ab.i("MicroMsg.ImageGalleryViewHolder", "dkvideo onplaytime:%d total:%d,%d size:%d cnt:%d user:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.yXH.rbG), Integer.valueOf(paramInt2), Integer.valueOf(this.yXH.yXF), Integer.valueOf(this.yXH.yXG), this.yXH.cEV });
    aw.RS().aa(new k.4.2(this, paramInt2, paramInt1));
    AppMethodBeat.o(32390);
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32388);
    ab.w("MicroMsg.ImageGalleryViewHolder", "play video error what : " + paramInt1 + " extra: " + paramInt2);
    if (this.yXH.yUe != null)
      this.yXH.yUe.yTO.hp(paramInt1, paramInt2);
    h.pYm.e(12084, new Object[] { Integer.valueOf(this.yXH.yXF), Integer.valueOf(this.yXH.rbG * 1000), Integer.valueOf(0), Integer.valueOf(4), this.yXH.cEV, Integer.valueOf(this.yXH.yXG), this.yXH.fileId, Long.valueOf(this.yXH.createTime) });
    AppMethodBeat.o(32388);
  }

  public final void pL()
  {
    AppMethodBeat.i(32387);
    if (this.yXH.yUe != null)
      this.yXH.yUe.yTO.dGz();
    AppMethodBeat.o(32387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.k.4
 * JD-Core Version:    0.6.2
 */