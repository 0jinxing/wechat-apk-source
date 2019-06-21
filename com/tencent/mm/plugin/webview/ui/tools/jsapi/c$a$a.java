package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c$a$a
{
  private int code;

  static
  {
    AppMethodBeat.i(8856);
    uFg = new a("RET_OK", 0, 0);
    uFh = new a("RET_FAIL", 1, -1);
    uFi = new a("RET_REJECT", 2, -2);
    uFj = new a("RET_ACCESS_DENIED", 3, -3);
    uFk = new a[] { uFg, uFh, uFi, uFj };
    AppMethodBeat.o(8856);
  }

  private c$a$a(int paramInt)
  {
    this.code = paramInt;
  }

  public final int getCode()
  {
    return this.code;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a.a
 * JD-Core Version:    0.6.2
 */