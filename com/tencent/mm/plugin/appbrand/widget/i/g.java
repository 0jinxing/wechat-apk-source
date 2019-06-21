package com.tencent.mm.plugin.appbrand.widget.i;

import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.l.a;
import com.tencent.mm.plugin.appbrand.l.j;
import com.tencent.mm.plugin.appbrand.q;

public final class g extends d
{
  public g(String paramString, c paramc, q paramq)
  {
    super(paramString, paramc, paramq);
  }

  public final void aSg()
  {
    AppMethodBeat.i(87567);
    String str = this.jpu;
    a locala = (a)this.hwf.aa(a.class);
    int i;
    if ((locala.iof) && ((!j.c(locala.bQF, str)) || (!URLUtil.isHttpsUrl(str))))
    {
      i = 1;
      if (i == 0)
        break label75;
      this.jpv.a("url not in domain list", this);
      AppMethodBeat.o(87567);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label75: if (this.jpu != null)
        b.abR().a(new g.1(this), this.jpu, null);
      AppMethodBeat.o(87567);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.g
 * JD-Core Version:    0.6.2
 */