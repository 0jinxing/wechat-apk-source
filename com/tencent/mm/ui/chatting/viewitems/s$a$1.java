package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;

final class s$a$1
  implements b.i
{
  s$a$1(s.a parama, s.d paramd)
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
    AppMethodBeat.i(33045);
    String str = "CHAT#" + n.bE(this);
    AppMethodBeat.o(33045);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(33044);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.zeo.zcr.setImageBitmap(paramBitmap);
      this.zeo.zcr.setVisibility(0);
      this.zeo.zcs.setVisibility(4);
      AppMethodBeat.o(33044);
    }
    while (true)
    {
      return;
      this.zeo.zcr.setVisibility(4);
      this.zeo.zcs.setVisibility(0);
      AppMethodBeat.o(33044);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.s.a.1
 * JD-Core Version:    0.6.2
 */