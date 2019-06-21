package com.tencent.mm.plugin.forcenotify.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.storage.bi;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/core/ForceNotifyReport;", "Lcom/tencent/mm/plugin/forcenotify/api/IForceNotifyReport;", "()V", "_16505", "", "toUsername", "", "clickType", "", "clickTime", "", "sessionId", "_16506", "_16507", "noticeState", "receiveTime", "plugin-force-notify_release"})
public final class b
  implements com.tencent.mm.plugin.forcenotify.a.a
{
  public static final b mtb;

  static
  {
    AppMethodBeat.i(51035);
    mtb = new b();
    AppMethodBeat.o(51035);
  }

  public final void b(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    AppMethodBeat.i(51031);
    a.f.b.j.p(paramString2, "sessionId");
    Object localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
    bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).bOr().Rb(paramString1);
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
    long l;
    int i;
    if (localbi != null)
    {
      localObject = Long.valueOf(localbi.HD());
      if (localObject == null)
        a.f.b.j.dWJ();
      l = ((Long)localObject).longValue() / 1000L;
      if ((!localbi.isSystem()) && (!localbi.dtv()))
        break label165;
      i = 0;
    }
    while (true)
    {
      localh.e(16505, new Object[] { paramString1, Integer.valueOf(paramInt), Long.valueOf(l), Integer.valueOf(i), paramString2, Long.valueOf(paramLong) });
      AppMethodBeat.o(51031);
      return;
      localObject = null;
      break;
      label165: if ((localbi != null) && (localbi.HC() == 1))
        i = 1;
      else
        i = 2;
    }
  }

  public final void d(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(51034);
    com.tencent.mm.plugin.report.service.h.pYm.e(16507, new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    AppMethodBeat.o(51034);
  }

  public final void e(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(51033);
    com.tencent.mm.plugin.report.service.h.pYm.e(16506, new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    AppMethodBeat.o(51033);
  }

  public final void f(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(51032);
    com.tencent.mm.plugin.forcenotify.c.b localb = new com.tencent.mm.plugin.forcenotify.c.b();
    localb.field_UserName = paramString;
    if (com.tencent.mm.plugin.forcenotify.d.a.mth.b((c)localb, new String[0]))
      b(paramString, String.valueOf(localb.field_CreateTime / 1000L) + localb.field_UserName, paramInt, paramLong);
    AppMethodBeat.o(51032);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.b.b
 * JD-Core Version:    0.6.2
 */