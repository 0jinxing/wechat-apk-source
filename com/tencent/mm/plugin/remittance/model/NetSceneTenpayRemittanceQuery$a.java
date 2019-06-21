package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class NetSceneTenpayRemittanceQuery$a
{
  public String fBg;
  public String gyD;
  public String pQs;

  public final String toString()
  {
    AppMethodBeat.i(44776);
    String str = "AddressInfo{addressName='" + this.pQs + '\'' + ", phoneNum='" + this.gyD + '\'' + ", address='" + this.fBg + '\'' + '}';
    AppMethodBeat.o(44776);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.a
 * JD-Core Version:    0.6.2
 */