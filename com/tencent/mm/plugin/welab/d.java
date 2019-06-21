package com.tencent.mm.plugin.welab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  public static void A(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(80542);
    d.a locala = new d.a();
    locala.csB = paramString1;
    locala.action = 8;
    locala.timeStamp = System.currentTimeMillis();
    locala.uLT = paramString2;
    locala.uLU = paramBoolean;
    a(locala);
    AppMethodBeat.o(80542);
  }

  public static void a(d.a parama)
  {
    AppMethodBeat.i(80540);
    com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
    locald.l("expid", parama.uLT + ",");
    locald.l("appid", parama.csB + ",");
    locald.l("action", parama.action + ",");
    locald.l("timestamp", parama.timeStamp + ",");
    StringBuilder localStringBuilder = new StringBuilder();
    if (parama.uLU);
    for (int i = 1; ; i = 0)
    {
      locald.l("hasRedPoint", i + ",");
      ab.i("WelabReporter", "report " + locald.Fk());
      h.pYm.e(14206, new Object[] { locald });
      AppMethodBeat.o(80540);
      return;
    }
  }

  public static void t(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(80541);
    d.a locala = new d.a();
    locala.csB = paramString;
    locala.action = paramInt;
    locala.timeStamp = System.currentTimeMillis();
    locala.uLT = a.ddj().agI(paramString).field_expId;
    locala.uLU = paramBoolean;
    a(locala);
    AppMethodBeat.o(80541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.d
 * JD-Core Version:    0.6.2
 */