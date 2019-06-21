package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static a hDK;
  public static boolean hDN;
  public static boolean hDO;
  public static boolean hDQ;
  public static boolean hDS;
  public static int hDT;
  public static boolean hDX;
  public boolean aJe;
  public int eCL;
  public boolean hDL;
  public long hDM;
  public boolean hDP;
  public boolean hDR;
  public String hDU;
  public int hDV;
  public boolean hDW;

  static
  {
    AppMethodBeat.i(94218);
    hDK = new a.a().aCP();
    hDN = false;
    hDO = true;
    hDQ = true;
    hDS = false;
    hDT = 5;
    hDX = true;
    AppMethodBeat.o(94218);
  }

  public a(a.a parama)
  {
    this.eCL = parama.eCL;
    this.hDL = parama.hDL;
    this.hDM = parama.hDM;
    this.aJe = parama.aJe;
    this.hDP = parama.hDP;
    this.hDR = parama.hDR;
    this.hDU = parama.hDU;
    this.hDV = parama.hDV;
    this.hDW = parama.hDW;
  }

  public static void a(a parama)
  {
    hDK = parama;
  }

  public final String toString()
  {
    AppMethodBeat.i(94217);
    String str = "BleConfig{interval=" + this.eCL + ", allowDuplicatesKey=" + this.hDL + ", actionTimeOutTime=" + this.hDM + ", debug=" + this.aJe + ", mainThread=" + this.hDP + ", serial=" + this.hDR + ", mode='" + this.hDU + '\'' + ", actionDelayTime=" + this.hDV + '}';
    AppMethodBeat.o(94217);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a
 * JD-Core Version:    0.6.2
 */