package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;

final class d$e$4
  implements b.i
{
  d$e$4(d.e parame, d.c paramc)
  {
  }

  public final void abU()
  {
    AppMethodBeat.i(32844);
    this.zcS.zcz.setVisibility(4);
    this.zcS.zcy.setVisibility(0);
    AppMethodBeat.o(32844);
  }

  public final void mr()
  {
  }

  public final String wP()
  {
    AppMethodBeat.i(32846);
    String str = "CHAT#" + n.bE(this);
    AppMethodBeat.o(32846);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(32845);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.zcS.zcz.setImageBitmap(paramBitmap);
      this.zcS.zcz.setVisibility(0);
      this.zcS.zcy.setVisibility(4);
    }
    AppMethodBeat.o(32845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.e.4
 * JD-Core Version:    0.6.2
 */