package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum d
{
  String aIm;
  int errCode;

  static
  {
    AppMethodBeat.i(131042);
    hJv = new d("OK", 0, 0, "ok");
    hJw = new d("SYSTEM_ERROR", 1, -1, "fail system error");
    hJx = new d("CGI_ERROR", 2, -2, "fail CGI error");
    hJy = new d("CANCEL", 3, -3, "fail cancel");
    hJz = new d("INVALID_BUSINESS_TYPE", 4, -4, "fail invalid businessType");
    hJA = new d[] { hJv, hJw, hJx, hJy, hJz };
    AppMethodBeat.o(131042);
  }

  private d(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.aIm = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.fakenative.d
 * JD-Core Version:    0.6.2
 */