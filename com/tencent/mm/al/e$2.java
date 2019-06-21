package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.i.h.a;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class e$2
  implements Runnable
{
  e$2(e parame, String paramString, c paramc, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50559);
    Object localObject = (com.tencent.mm.i.h)this.fzs.fyM.get(this.IN);
    if (localObject == null)
      AppMethodBeat.o(50559);
    s locals;
    while (true)
    {
      return;
      if (((com.tencent.mm.i.h)localObject).egK != null)
      {
        ab.i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback", new Object[] { this.IN });
        if (this.fyU != null)
        {
          ((com.tencent.mm.i.h)localObject).egK.h(this.IN, this.fyU.field_finishedLength, this.fyU.field_toltalLength);
          AppMethodBeat.o(50559);
        }
        else if (this.fyV != null)
        {
          ab.i("MicroMsg.OnlineVideoService", "cdn callback %s route to videoCallback, sceneResult.retCode:%s", new Object[] { this.IN, Integer.valueOf(this.fyV.field_retCode) });
          ((com.tencent.mm.i.h)localObject).egK.a(this.IN, this.fyV.field_retCode, this.fyV);
          this.fzs.fyM.remove(this.IN);
          if (this.fyV.field_retCode == 0)
          {
            this.fzs.fzq.put(((com.tencent.mm.i.h)localObject).field_mediaId, localObject);
            this.fzs.fzr.put(((com.tencent.mm.i.h)localObject).field_mediaId, this.fyV);
          }
          AppMethodBeat.o(50559);
        }
        else
        {
          AppMethodBeat.o(50559);
        }
      }
      else
      {
        locals = u.ut(((com.tencent.mm.i.h)localObject).filename);
        if (locals == null)
        {
          ab.w("MicroMsg.OnlineVideoService", "stream download video callback, but video info is null.[%s]", new Object[] { ((com.tencent.mm.i.h)localObject).filename });
          AppMethodBeat.o(50559);
        }
        else if (((com.tencent.mm.i.h)localObject).egl != null)
        {
          ((com.tencent.mm.i.h)localObject).egl.a(this.IN, 0, this.fyU, this.fyV, ((com.tencent.mm.i.h)localObject).field_onlycheckexist);
          if (this.fyV != null)
            this.fzs.fyM.remove(this.IN);
          AppMethodBeat.o(50559);
        }
        else
        {
          if (this.fyU == null)
            break;
          if (this.fyU.field_finishedLength == locals.frO)
          {
            ab.i("MicroMsg.OnlineVideoService", "stream download finish.");
            AppMethodBeat.o(50559);
          }
          else if ((locals.status != 130) && (locals.fWY > this.fyU.field_finishedLength))
          {
            ab.w("MicroMsg.OnlineVideoService", "set video error. db now size %d, cdn callback %d.", new Object[] { Integer.valueOf(locals.fWY), Integer.valueOf(this.fyU.field_finishedLength) });
            AppMethodBeat.o(50559);
          }
          else
          {
            ab.i("MicroMsg.OnlineVideoService", "callback progress info " + this.fyU.field_finishedLength);
            locals.fXb = bo.anT();
            locals.fWY = this.fyU.field_finishedLength;
            locals.bJt = 1040;
            u.f(locals);
            localObject = new lp();
            ((lp)localObject).cHq.cAd = 5;
            ((lp)localObject).cHq.cHr = this.IN;
            ((lp)localObject).cHq.offset = this.fyU.field_finishedLength;
            ((lp)localObject).cHq.length = this.fyU.field_toltalLength;
            a.xxA.m((b)localObject);
            AppMethodBeat.o(50559);
          }
        }
      }
    }
    int i;
    int j;
    if (this.fyV != null)
    {
      ab.i("MicroMsg.OnlineVideoService", "callback result info " + this.fyV.field_retCode + ", filesize:" + this.fyV.field_fileLength + ",recved:" + this.fyV.field_recvedBytes);
      if (this.fyV.field_retCode == 0)
        break label1111;
      if (this.fyV.field_retCode != -10012)
        u.um(locals.getFileName());
      boolean bool = ((com.tencent.mm.i.h)localObject).Jr();
      i = this.fyV.field_retCode;
      j = ((com.tencent.mm.i.h)localObject).egD;
      if (!bool)
        break label1018;
      if (j != 1)
        break label927;
      if (i != -5103059)
        break label860;
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 111L, 1L, false);
      label726: com.tencent.mm.plugin.report.service.h.pYm.e(13836, new Object[] { Integer.valueOf(101), Long.valueOf(bo.anT()), Integer.valueOf(i) });
    }
    while (true)
    {
      localObject = new lp();
      ((lp)localObject).cHq.cAd = 4;
      ((lp)localObject).cHq.cHr = this.IN;
      ((lp)localObject).cHq.offset = 0;
      ((lp)localObject).cHq.retCode = this.fyV.field_retCode;
      ((lp)localObject).cHq.length = this.fyV.field_fileLength;
      a.xxA.m((b)localObject);
      this.fzs.fyM.remove(this.IN);
      AppMethodBeat.o(50559);
      break;
      label860: if (i == -5103087)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 112L, 1L, false);
        break label726;
      }
      if (i == -10012)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 113L, 1L, false);
        break label726;
      }
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 114L, 1L, false);
      break label726;
      label927: if (i == -5103059)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 116L, 1L, false);
        break label726;
      }
      if (i == -5103087)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 117L, 1L, false);
        break label726;
      }
      if (i == -10012)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 118L, 1L, false);
        break label726;
      }
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 119L, 1L, false);
      break label726;
      label1018: com.tencent.mm.plugin.report.service.h.pYm.a(354L, 213L, 1L, false);
      if (j == 1)
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 214L, 1L, false);
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13836, new Object[] { Integer.valueOf(201), Long.valueOf(bo.anT()), Integer.valueOf(i) });
        break;
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 215L, 1L, false);
      }
      label1111: e.a(locals, this.fyV.field_fileLength, ((com.tencent.mm.i.h)localObject).egB);
      this.fzs.fzq.put(((com.tencent.mm.i.h)localObject).field_mediaId, localObject);
      this.fzs.fzr.put(((com.tencent.mm.i.h)localObject).field_mediaId, this.fyV);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e.2
 * JD-Core Version:    0.6.2
 */