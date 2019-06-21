package com.tencent.mm.plugin.appbrand.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.cwp;
import com.tencent.mm.protocal.protobuf.cwt;
import java.util.Iterator;
import java.util.LinkedList;

final class AppBrandIDKeyBatchReport$b$3
  implements w.a
{
  AppBrandIDKeyBatchReport$b$3(LinkedList paramLinkedList)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(132522);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      AppBrandIDKeyBatchReport.b.gg(((cwp)paramb.fsH.fsP).xsm);
      AppBrandIDKeyBatchReport.b.kN(AppBrandIDKeyBatchReport.b.AN());
    }
    while (true)
    {
      AppMethodBeat.o(132522);
      return 0;
      paramString = this.izN.iterator();
      while (paramString.hasNext())
        AppBrandIDKeyBatchReport.b.d((cwt)paramString.next());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.b.3
 * JD-Core Version:    0.6.2
 */