package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class NetSceneTenpayRemittanceQuery$c
{
  public String pQw;
  public int type;
  public String url;
  public String username;

  public final String toString()
  {
    AppMethodBeat.i(44778);
    String str = "JumpInfo{type=" + this.type + ", url='" + this.url + '\'' + ", username='" + this.username + '\'' + ", pagepath='" + this.pQw + '\'' + '}';
    AppMethodBeat.o(44778);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.c
 * JD-Core Version:    0.6.2
 */