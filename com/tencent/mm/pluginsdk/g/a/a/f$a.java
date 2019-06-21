package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class f$a
{
  static void a(boolean paramBoolean1, boolean paramBoolean2, s params, g paramg)
  {
    AppMethodBeat.i(79513);
    ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "sendIORequest, fileAppend = %b, fileUpdate = %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if ((params.field_maxRetryTimes > 0) && (params.field_retryTimes <= 0) && (!paramBoolean2))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip", new Object[] { Integer.valueOf(params.field_maxRetryTimes), Integer.valueOf(params.field_retryTimes) });
      AppMethodBeat.o(79513);
    }
    while (true)
    {
      return;
      params.field_reportId = paramg.vdK;
      params.field_status = 0;
      if (paramBoolean2)
      {
        params.field_maxRetryTimes = paramg.vdM;
        params.field_retryTimes = paramg.vdM;
        params.field_fileUpdated = true;
        params.field_priority = paramg.priority;
        if (paramg.fileSize > 0L)
          params.field_fileSize = paramg.fileSize;
        q.a.diy().h(params);
      }
      while (true)
      {
        if (!q.a.diy().ajh(paramg.vdC))
          break label259;
        ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s is already downloading", new Object[] { paramg.vdC });
        if (paramg.cuA)
        {
          j.z(paramg.vdK, 9L);
          j.z(paramg.vdK, 44L);
        }
        AppMethodBeat.o(79513);
        break;
        params.field_retryTimes -= 1;
        params.field_priority = paramg.priority;
        q.a.diy().h(params);
        j.z(params.field_reportId, 12L);
      }
      label259: ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s, post network task", new Object[] { paramg.vdC });
      if ((paramBoolean2) && (!paramBoolean1))
        b.c.dif().g(params.field_resType, params.field_subType, 0, bo.nullAsNil(params.field_groupId2).equals("NewXml"));
      params = c.d(params);
      params.ufy = paramBoolean1;
      params.veh = paramg.veh;
      if (!paramBoolean1)
      {
        com.tencent.mm.pluginsdk.g.a.d.a.ajj(i.aiX(params.vdC));
        com.tencent.mm.pluginsdk.g.a.d.a.ajj(i.aiX(params.vdC) + ".decompressed");
        com.tencent.mm.pluginsdk.g.a.d.a.ajj(i.aiX(params.vdC) + ".decrypted");
      }
      q.a.diy().d(params);
      AppMethodBeat.o(79513);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.f.a
 * JD-Core Version:    0.6.2
 */