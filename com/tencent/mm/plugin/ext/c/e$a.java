package com.tencent.mm.plugin.ext.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$a
{
  public int lRd;
  private boolean lRe = false;
  public int type;
  public String url;

  public e$a()
  {
    this.lRe = true;
  }

  public e$a(int paramInt1, String paramString, int paramInt2)
  {
    this.type = paramInt1;
    this.url = paramString;
    this.lRe = false;
    this.lRd = paramInt2;
  }

  public final String toString()
  {
    AppMethodBeat.i(20423);
    String str = "QrCodeModel{type=" + this.type + ", url='" + this.url + '\'' + ", flagTimeout=" + this.lRe + '}';
    AppMethodBeat.o(20423);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.e.a
 * JD-Core Version:    0.6.2
 */