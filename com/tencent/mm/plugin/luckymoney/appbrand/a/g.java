package com.tencent.mm.plugin.luckymoney.appbrand.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;
import java.util.List;

public enum g
{
  public int nRO;
  public double nRP;
  public double nRQ;
  public double nRR;
  public double nRS;
  public String nRT;
  public String nRU;
  private List<Object> nRV;

  static
  {
    AppMethodBeat.i(41998);
    nRN = new g("GLOBAL");
    nRW = new g[] { nRN };
    AppMethodBeat.o(41998);
  }

  private g()
  {
    AppMethodBeat.i(41996);
    this.nRO = 100;
    this.nRP = 200.0D;
    this.nRQ = 0.01D;
    this.nRR = 2000.0D;
    this.nRS = 200.0D;
    this.nRT = "¥";
    this.nRU = ah.getContext().getString(2131301078);
    this.nRV = new LinkedList();
    AppMethodBeat.o(41996);
  }

  public final String toString()
  {
    AppMethodBeat.i(41997);
    String str = "WxaLuckyMoneyConfig{maxTotalNum=" + this.nRO + ", perPersonMaxValue=" + this.nRP + ", perMinValue=" + this.nRQ + ", maxTotalAmount=" + this.nRR + ", mListener=" + this.nRV + '}';
    AppMethodBeat.o(41997);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.a.g
 * JD-Core Version:    0.6.2
 */