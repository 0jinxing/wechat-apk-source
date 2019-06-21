package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$a
{
  private static final a iwU;
  private static final a iwV;
  private static final a iwW;
  private static final a iwX;
  private static final a iwY;
  public final String bzH;
  public final int ret;

  static
  {
    AppMethodBeat.i(102284);
    iwU = new a(-1, "fail:auth canceled");
    iwV = new a(-1, "fail:auth denied");
    iwW = new a(-2, "");
    iwX = new a(-1, "fail:access denied");
    iwY = new a(0, "");
    AppMethodBeat.o(102284);
  }

  public e$a(int paramInt, String paramString)
  {
    this.ret = paramInt;
    this.bzH = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.e.a
 * JD-Core Version:    0.6.2
 */