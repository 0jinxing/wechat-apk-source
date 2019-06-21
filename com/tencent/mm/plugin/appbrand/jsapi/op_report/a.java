package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;

final class a extends p
{
  private static final int CTRL_INDEX = 246;
  private static final String NAME = "onStartReportPageData";
  private static final a hSU;

  static
  {
    AppMethodBeat.i(102004);
    hSU = new a();
    AppMethodBeat.o(102004);
  }

  static void k(c paramc)
  {
    try
    {
      AppMethodBeat.i(102003);
      hSU.i(paramc).aCj();
      AppMethodBeat.o(102003);
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.op_report.a
 * JD-Core Version:    0.6.2
 */