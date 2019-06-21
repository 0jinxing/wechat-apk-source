package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b.4;
import com.tencent.mm.plugin.appbrand.widget.i.d;
import com.tencent.mm.plugin.appbrand.widget.i.e;
import com.tencent.mm.sdk.platformtools.al;

final class w$10 extends e
{
  w$10(w paramw)
  {
  }

  public final void a(Bitmap paramBitmap, d paramd)
  {
    AppMethodBeat.i(132393);
    super.a(paramBitmap, paramd);
    al.d(new b.4(this.itx.getActionBar(), paramBitmap, new w.10.1(this)));
    AppMethodBeat.o(132393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.10
 * JD-Core Version:    0.6.2
 */