package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;

final class d$d$4
  implements b.i
{
  d$d$4(d.d paramd, d.c paramc)
  {
  }

  public final void abU()
  {
    AppMethodBeat.i(32827);
    this.zcS.zcz.setVisibility(4);
    this.zcS.zcy.setVisibility(0);
    AppMethodBeat.o(32827);
  }

  public final void mr()
  {
  }

  public final String wP()
  {
    AppMethodBeat.i(32829);
    String str = "CHAT#" + n.bE(this);
    AppMethodBeat.o(32829);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(32828);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.zcS.zcz.setImageBitmap(paramBitmap);
      this.zcS.zcz.setVisibility(0);
      this.zcS.zcy.setVisibility(4);
    }
    AppMethodBeat.o(32828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.d.4
 * JD-Core Version:    0.6.2
 */