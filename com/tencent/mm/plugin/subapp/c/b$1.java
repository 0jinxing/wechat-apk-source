package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$1
  implements ap.a
{
  b$1(b paramb)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(25250);
    Object localObject = this.ssP.fileName;
    localObject = d.cDE().abp((String)localObject);
    if ((localObject == null) || (!((g)localObject).ame()))
    {
      ab.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + this.ssP.fileName);
      this.ssP.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      this.ssP.ehi.onSceneEnd(3, -1, "doScene failed", this.ssP);
      AppMethodBeat.o(25250);
    }
    while (true)
    {
      return bool;
      if ((3 != ((g)localObject).field_status) && (8 != ((g)localObject).field_status))
      {
        long l = System.currentTimeMillis();
        if (l / 1000L - ((g)localObject).field_lastmodifytime > 30L)
        {
          ab.e("MicroMsg.NetSceneUploadVoiceRemind", "Error ModifyTime in Read file:" + this.ssP.fileName);
          this.ssP.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          this.ssP.ehi.onSceneEnd(3, -1, "doScene failed", this.ssP);
          AppMethodBeat.o(25250);
        }
        else if (l - this.ssP.fZf < 2000L)
        {
          ab.d("MicroMsg.NetSceneUploadVoiceRemind", "TimerExpired :" + this.ssP.fileName + " but last send time:" + (l - this.ssP.fZf));
          AppMethodBeat.o(25250);
          bool = true;
        }
        else
        {
          c.a locala = h.abm(this.ssP.fileName).Fo(((g)localObject).field_offset);
          ab.d("MicroMsg.NetSceneUploadVoiceRemind", "pusher doscene:" + this.ssP.fileName + " readByte:" + locala.cqs + " stat:" + ((g)localObject).field_status);
          if (locala.cqs < 2000)
          {
            AppMethodBeat.o(25250);
            bool = true;
          }
        }
      }
      else
      {
        if (this.ssP.a(this.ssP.ftf, this.ssP.ehi) == -1)
        {
          this.ssP.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          this.ssP.ehi.onSceneEnd(3, -1, "doScene failed", this.ssP);
        }
        AppMethodBeat.o(25250);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.b.1
 * JD-Core Version:    0.6.2
 */