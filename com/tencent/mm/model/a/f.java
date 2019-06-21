package com.tencent.mm.model.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class f
{
  public static void a(e parame)
  {
    AppMethodBeat.i(118147);
    if ((parame != null) && (g.aaK().aaI()))
    {
      String str1 = g.aaK().fnW.fnS;
      String str2 = parame.id;
      String str3 = parame.id;
      String str4 = parame.endTime - parame.startTime;
      String str5 = parame.result;
      String str6 = parame.fnY;
      long l = parame.fob;
      ab.i("MicroMsg.abtest.AbTestReportHelper", "TestCaseID:%s TestPointsID:%s TestReportID：%s TetsCheckID:%s TestDurationTime:%s TestActionResult:%s, TestActionScene:%d", new Object[] { str1, str2, str6, str3, str4, str5, Long.valueOf(l) });
      h.pYm.e(11394, new Object[] { str1, str2, str6, str3, str4, str5, Long.valueOf(l) });
    }
    AppMethodBeat.o(118147);
  }

  private static void a(e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(118146);
    if ((parame == null) || (!g.aaK().aaI()))
    {
      ab.w("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast abtest faild. abTestPoint or testcase is null.");
      AppMethodBeat.o(118146);
      return;
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (paramBoolean);
    for (StringBuilder localStringBuilder2 = localStringBuilder1.append("TestPointStart:"); ; localStringBuilder2 = localStringBuilder1.append("TestPointEnd:"))
    {
      localStringBuilder1.append(localStringBuilder2);
      localStringBuilder1.append(g.aaK().fnW.fnS);
      localStringBuilder1.append("_");
      localStringBuilder1.append(parame.id);
      localStringBuilder1.append("_");
      localStringBuilder1.append(parame.fnY);
      localStringBuilder1.append("_");
      localStringBuilder1.append(parame.fnY);
      localStringBuilder1.append("_");
      localStringBuilder1.append(parame.fnZ);
      localStringBuilder1.append("_");
      localStringBuilder1.append(parame.result);
      localStringBuilder1.append("_");
      localStringBuilder1.append(parame.fob);
      oR(localStringBuilder1.toString());
      AppMethodBeat.o(118146);
      break;
    }
  }

  private static void oR(String paramString)
  {
    AppMethodBeat.i(118145);
    ab.i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast:%s", new Object[] { paramString });
    if (g.aaK().aaI())
    {
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.ui.ACTION_ABTEST");
      localIntent.putExtra("content", paramString);
      ah.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
      AppMethodBeat.o(118145);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast abtest faild. no test case.");
      AppMethodBeat.o(118145);
    }
  }

  public static void oS(String paramString)
  {
    AppMethodBeat.i(118148);
    ab.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] startAbTestCase: start abtest click stream");
    oR("TestCaseID:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(118148);
  }

  public static void oT(String paramString)
  {
    AppMethodBeat.i(118149);
    if (g.aaK().oP(paramString) != null)
    {
      ab.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] startAbTestPoint:%s", new Object[] { paramString });
      g.aaK().oP(paramString).fnZ = System.currentTimeMillis();
      g.aaK().oP(paramString).startTime = System.currentTimeMillis();
      g.aaK().oP(paramString).foa = false;
      g.aaK().oP(paramString).result = "0";
      a(g.aaK().oP(paramString), true);
    }
    AppMethodBeat.o(118149);
  }

  public static void oU(String paramString)
  {
    AppMethodBeat.i(118150);
    if ((g.aaK().oP(paramString) != null) && (!g.aaK().oP(paramString).foa))
    {
      ab.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] endAbTestPoint:%s", new Object[] { paramString });
      g.aaK().oP(paramString).fnZ = System.currentTimeMillis();
      g.aaK().oP(paramString).endTime = System.currentTimeMillis();
      g.aaK().oP(paramString).foa = true;
      a(g.aaK().oP(paramString));
      a(g.aaK().oP(paramString), false);
    }
    AppMethodBeat.o(118150);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a.f
 * JD-Core Version:    0.6.2
 */