package com.tencent.mm.plugin.appbrand.widget.recentview;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a
{
  String jnp;
  StringBuilder jnq;
  StringBuilder jnr;
  StringBuilder jns;
  StringBuilder jnt;
  StringBuilder jnu;
  StringBuilder jnv;

  public b$a(String paramString)
  {
    AppMethodBeat.i(114933);
    this.jnp = paramString;
    this.jnq = new StringBuilder();
    this.jnr = new StringBuilder();
    this.jns = new StringBuilder();
    this.jnt = new StringBuilder();
    this.jnu = new StringBuilder();
    this.jnv = new StringBuilder();
    AppMethodBeat.o(114933);
  }

  public final String toString()
  {
    AppMethodBeat.i(114934);
    String str = String.format("DuplicateNameInfo: {duplicatedName: %s, appId: %s, \nnameType: %s, \nlistType: %s, \nposition: %s, \nversion: %s, \nversionType: %s", new Object[] { this.jnp, this.jnq.toString(), this.jnr.toString(), this.jns.toString(), this.jnt.toString(), this.jnu.toString(), this.jnv.toString() });
    AppMethodBeat.o(114934);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.b.a
 * JD-Core Version:    0.6.2
 */