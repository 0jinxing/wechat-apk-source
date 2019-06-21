package com.tencent.mm.plugin.appbrand.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class f$b
{
  String appId;
  int fmr;
  String hlE;
  LinkedList<Integer> hlF;
  String query;

  public f$b(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(10684);
    this.fmr = 0;
    this.hlE = "";
    this.appId = "";
    this.query = "";
    this.hlF = new LinkedList();
    this.hlE = paramString1;
    this.appId = paramString2;
    this.fmr = paramInt;
    this.query = paramString3;
    AppMethodBeat.o(10684);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.f.b
 * JD-Core Version:    0.6.2
 */