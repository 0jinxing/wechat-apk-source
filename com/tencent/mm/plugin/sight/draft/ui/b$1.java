package com.tencent.mm.plugin.sight.draft.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.j;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Set;

final class b$1 extends c
{
  b$1(b paramb)
  {
  }

  public final void r(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(24996);
    Iterator localIterator = b.a(this.qzH).iterator();
    while (localIterator.hasNext())
    {
      b.e locale = (b.e)localIterator.next();
      if ((locale.qzO != null) && (bo.bc(paramString, "").equals(locale.qzO.field_fileName)))
        locale.qzM.setThumbBmp(paramBitmap);
    }
    AppMethodBeat.o(24996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.b.1
 * JD-Core Version:    0.6.2
 */