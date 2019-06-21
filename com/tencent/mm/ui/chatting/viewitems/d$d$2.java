package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;

final class d$d$2
  implements b.i
{
  d$d$2(d.d paramd, d.c paramc)
  {
  }

  public final void abU()
  {
  }

  public final void mr()
  {
  }

  public final String wP()
  {
    AppMethodBeat.i(32824);
    String str = "CHAT#" + n.bE(this);
    AppMethodBeat.o(32824);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(32823);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.zcS.zcr.setImageBitmap(paramBitmap);
      this.zcS.zcr.setVisibility(0);
      this.zcS.zcs.setVisibility(4);
      AppMethodBeat.o(32823);
    }
    while (true)
    {
      return;
      this.zcS.zcr.setVisibility(4);
      this.zcS.zcs.setVisibility(0);
      AppMethodBeat.o(32823);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.d.2
 * JD-Core Version:    0.6.2
 */