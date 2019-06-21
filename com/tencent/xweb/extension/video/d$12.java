package com.tencent.xweb.extension.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;

final class d$12
  implements c.a
{
  d$12(d paramd)
  {
  }

  public final void aFw()
  {
    AppMethodBeat.i(84586);
    this.AOs.dUs();
    this.AOs.dUt();
    AppMethodBeat.o(84586);
  }

  public final void bw(float paramFloat)
  {
    AppMethodBeat.i(84587);
    double d = d.a(this.AOs) * paramFloat / 100.0D;
    this.AOs.f(d, false);
    d.b(this.AOs).evaluateJavascript(String.format("xwebVideoBridge.xwebToJS_Video_Seek(%f);", new Object[] { Double.valueOf(d) }), new d.12.1(this));
    this.AOs.dUr();
    AppMethodBeat.o(84587);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.12
 * JD-Core Version:    0.6.2
 */