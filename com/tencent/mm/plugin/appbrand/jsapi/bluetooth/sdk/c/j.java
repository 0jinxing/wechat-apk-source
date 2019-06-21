package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j
{
  public static final j hEL;
  public static final j hEM;
  public static final j hEN;
  public static final j hEO;
  public static final j hEP;
  public static final j hEQ;
  public static final j hER;
  public static final j hES;
  public static final j hET;
  public static final j hEU;
  public static final j hEV;
  public static final j hEW;
  public static final j hEX;
  public static final j hEY;
  public static final j hEZ;
  public static final j hFa;
  public static final j hFb;
  public static final j hFc;
  public static final j hFd;
  public String aIm;
  public int errCode;

  static
  {
    AppMethodBeat.i(94284);
    hEL = new j(0, "");
    hEM = new j(-1, "fail:internal error");
    hEN = new j(10000, "fail:not init");
    hEO = new j(10001, "fail:not available");
    hEP = new j(10002, "fail:no device");
    hEQ = new j(10003, "fail:connection fail");
    hER = new j(10004, "fail:no service");
    hES = new j(10005, "fail:no characteristic");
    hET = new j(10006, "fail:no connection");
    hEU = new j(10007, "fail:property not support");
    hEV = new j(10008, "fail:system error");
    hEW = new j(10009, "fail:system not support");
    hEX = new j(10008, "fail:no descriptor");
    hEY = new j(10008, "fail:fail to set descriptor");
    hEZ = new j(10008, "fail:fail to write descriptor");
    hFa = new j(10012, "fail:operate time out");
    hFb = new j(-1, "fail:already connect");
    hFc = new j(10013, "fail:invalid data");
    hFd = new j(10008, "fail:not found service");
    AppMethodBeat.o(94284);
  }

  public j(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.aIm = paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(94283);
    String str = "Result{errCode=" + this.errCode + ", errMsg='" + this.aIm + '\'' + '}';
    AppMethodBeat.o(94283);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j
 * JD-Core Version:    0.6.2
 */