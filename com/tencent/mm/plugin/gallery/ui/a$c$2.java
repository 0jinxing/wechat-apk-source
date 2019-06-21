package com.tencent.mm.plugin.gallery.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.HashMap;

final class a$c$2
  implements a.c.a
{
  public final void a(a.c paramc, int paramInt)
  {
    AppMethodBeat.i(21362);
    if ((paramc == null) || (a.c.c(paramc) == null))
      AppMethodBeat.o(21362);
    while (true)
    {
      return;
      paramc = (TextView)a.c.c(paramc).get();
      if (paramc == null)
      {
        AppMethodBeat.o(21362);
      }
      else
      {
        a.c.e(paramc, paramInt);
        a.c.bCy().remove(paramc);
        AppMethodBeat.o(21362);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.a.c.2
 * JD-Core Version:    0.6.2
 */