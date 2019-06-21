package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.ui.chatting.d.a;

final class d$d$5
  implements g
{
  d$d$5(d.d paramd, d.c paramc, a parama)
  {
  }

  public final Bitmap a(String paramString, View paramView, b paramb)
  {
    return null;
  }

  public final void b(String paramString, View paramView, b paramb)
  {
    AppMethodBeat.i(32831);
    if (paramb.bitmap != null)
    {
      paramString = paramb.bitmap;
      this.zcS.zcd.getViewTreeObserver().addOnPreDrawListener(new d.d.5.1(this, paramString));
    }
    AppMethodBeat.o(32831);
  }

  public final void sH(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.d.5
 * JD-Core Version:    0.6.2
 */