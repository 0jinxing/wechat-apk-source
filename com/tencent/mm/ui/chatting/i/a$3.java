package com.tencent.mm.ui.chatting.i;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;

final class a$3
  implements b.i
{
  a$3(a parama, a.b paramb, a.a parama1)
  {
  }

  public final void abU()
  {
  }

  public final void mr()
  {
    AppMethodBeat.i(32512);
    o.ahp().a(this.yYX.imagePath, this.yYW.iqT, this.yYS.yYR);
    AppMethodBeat.o(32512);
  }

  public final String wP()
  {
    AppMethodBeat.i(32513);
    String str = "SEARCH#" + n.bE(this);
    AppMethodBeat.o(32513);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(32511);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.yYW.iqT.setImageBitmap(paramBitmap);
      AppMethodBeat.o(32511);
    }
    while (true)
    {
      return;
      o.ahp().a(this.yYX.imagePath, this.yYW.iqT, this.yYS.yYR);
      AppMethodBeat.o(32511);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.a.3
 * JD-Core Version:    0.6.2
 */