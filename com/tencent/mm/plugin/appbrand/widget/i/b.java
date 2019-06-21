package com.tencent.mm.plugin.appbrand.widget.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends d
{
  public b(String paramString, c paramc)
  {
    super(paramString, paramc);
  }

  public final void aSg()
  {
    AppMethodBeat.i(87562);
    if (this.jpu != null)
    {
      com.tencent.mm.sdk.g.d.h(new b.1(this), "Base64IconLoader").start();
      AppMethodBeat.o(87562);
    }
    while (true)
    {
      return;
      this.jpv.a("Failed to load icon via base64 icon", this);
      AppMethodBeat.o(87562);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.b
 * JD-Core Version:    0.6.2
 */