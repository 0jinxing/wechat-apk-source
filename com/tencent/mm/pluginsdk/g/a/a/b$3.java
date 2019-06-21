package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.pluginsdk.g.a.b.c;
import com.tencent.mm.pluginsdk.g.a.c.d;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.n;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class b$3
  implements d
{
  b$3(b paramb)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(79469);
    ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener.onComplete, urlkey = ".concat(String.valueOf(paramString)));
    paramm = q.a.diy().ajg(paramString);
    if (paramm == null)
      AppMethodBeat.o(79469);
    while (true)
    {
      return;
      j.z(paramm.field_reportId, 10L);
      j.z(paramm.field_reportId, 15L);
      if (((!paramm.field_fileCompress) || (paramm.field_fileEncrypt)) && (paramm.field_fileUpdated))
        if (paramm.field_maxRetryTimes <= paramm.field_retryTimes)
          break label252;
      label252: for (paramString = j.a.veE; ; paramString = j.a.veC)
      {
        j.a(paramm.field_resType, paramm.field_subType, paramm.field_url, bo.getInt(paramm.field_fileVersion, 0), paramString, true, bo.nullAsNil(paramm.field_groupId2).equals("NewXml"), false, paramm.field_sampleId);
        if ((paramm.field_fileCompress) || (paramm.field_fileEncrypt))
          break label259;
        paramString = new bf();
        paramString.cus.filePath = paramm.field_filePath;
        paramString.cus.cuw = paramm.field_fileUpdated;
        paramString.cus.cuv = bo.getInt(paramm.field_fileVersion, 0);
        paramString.cus.cut = paramm.field_resType;
        paramString.cus.cuu = paramm.field_subType;
        com.tencent.mm.sdk.b.a.xxA.a(paramString, q.a.diy().handler.getLooper());
        paramm.field_fileUpdated = false;
        q.a.diy().h(paramm);
        AppMethodBeat.o(79469);
        break;
      }
      label259: ab.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener, addDecryptRequest");
      this.vdR.b(paramm);
      AppMethodBeat.o(79469);
    }
  }

  public final void aeQ(String paramString)
  {
    AppMethodBeat.i(79471);
    q localq = q.a.diy();
    if (localq.hrm);
    for (boolean bool = localq.vfy.ajc(paramString); ; bool = false)
    {
      if (!bool)
        i.aiY(paramString);
      AppMethodBeat.o(79471);
      return;
    }
  }

  public final String awa()
  {
    return "CheckResUpdate";
  }

  public final void b(String paramString, m paramm)
  {
    AppMethodBeat.i(79470);
    i.aiY(paramString);
    paramString = q.a.diy().ajg(paramString);
    if (paramString == null)
    {
      AppMethodBeat.o(79470);
      return;
    }
    int i = 1;
    int j = i;
    if (paramm != null)
    {
      j = i;
      if (paramm.vfo != null)
      {
        if (!(paramm.vfo instanceof com.tencent.mm.pluginsdk.g.a.b.a))
          break label144;
        j.z(paramString.field_reportId, 7L);
        j = 0;
      }
    }
    while (true)
    {
      if (j != 0)
        j.z(paramString.field_reportId, 11L);
      j.z(paramString.field_reportId, 44L);
      j.a(paramString.field_resType, paramString.field_subType, paramString.field_url, bo.getInt(paramString.field_fileVersion, 0), j.a.veD, false, "NewXml".equalsIgnoreCase(paramString.field_groupId2), false, paramString.field_sampleId);
      AppMethodBeat.o(79470);
      break;
      label144: j = i;
      if ((paramm.vfo instanceof c))
      {
        j.z(paramString.field_reportId, 16L);
        j = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b.3
 * JD-Core Version:    0.6.2
 */