package com.tencent.mm.openim.b;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;

final class t$3
  implements g
{
  t$3(t paramt, t.a parama)
  {
  }

  public final Bitmap a(String paramString, View paramView, b paramb)
  {
    return null;
  }

  public final void b(String paramString, View paramView, b paramb)
  {
    AppMethodBeat.i(78892);
    if ((paramb.status == 0) && (paramb.bitmap != null) && (!paramb.bitmap.isRecycled()))
      this.gfo.bitmap = paramb.bitmap;
    AppMethodBeat.o(78892);
  }

  public final void sH(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.t.3
 * JD-Core Version:    0.6.2
 */