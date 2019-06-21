package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.m.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bh;
import java.util.Map;

final class d$2
  implements Runnable
{
  d$2(d paramd, boolean paramBoolean, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50666);
    Object localObject1 = br.z(this.fVp.fVj.alw(), "msg");
    if (localObject1 != null)
    {
      localObject2 = o.all();
      o.all();
      ((t)localObject2).s(t.uh(this.fVp.fileName), (String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl"), (String)((Map)localObject1).get(".msg.videomsg.$aeskey"));
    }
    boolean bool1 = false;
    if (this.fVq)
    {
      boolean bool2 = u.ae(this.fVp.fileName, this.fVr);
      bool1 = bool2;
      if (this.fVp.fVi)
      {
        u.uz(this.fVp.fileName);
        ab.i("MicroMsg.NetSceneDownloadVideo", "sceneEndproc, isHadHevcLocalFile");
        bool1 = bool2;
      }
      ab.i("MicroMsg.NetSceneDownloadVideo", "%s ashutest::cdntra !FIN! file:%s svrid:%d human:%s user:%s updatedbsucc:%b  MediaCheckDuplicationStorage MD5:%s SIZE:%d renameFlag %b needRename %b", new Object[] { this.fVp.alb(), this.fVp.fileName, Long.valueOf(this.fVp.fVj.cKK), this.fVp.fVj.alt(), this.fVp.fVj.getUser(), Boolean.valueOf(bool1), this.fVp.fFh, Integer.valueOf(this.fVp.fFi), Boolean.valueOf(this.fVq), Boolean.valueOf(this.fVp.fVn) });
      if ((!bo.isNullOrNil(this.fVp.fFh)) && (this.fVp.fFi > 0))
      {
        localObject2 = ((a)g.K(a.class)).XT();
        localObject1 = this.fVp.fFh;
        int i = this.fVp.fFi;
        o.all();
        ((bh)localObject2).y((String)localObject1, i, t.uh(this.fVp.fileName));
      }
      if (this.fVp.fVj.fXk != 3)
        break label538;
      h.pYm.a(198L, 38L, this.fVp.fVj.frO, false);
      h.pYm.a(198L, 40L, this.fVp.fVj.fXd, false);
      h.pYm.a(198L, 41L, 1L, false);
      localObject2 = h.pYm;
      if (!com.tencent.mm.model.t.kH(this.fVp.fVj.getUser()))
        break label530;
    }
    label530: for (long l = 43L; ; l = 42L)
    {
      ((h)localObject2).a(198L, l, 1L, false);
      this.fVp.ehi.onSceneEnd(0, 0, "", this.fVp);
      AppMethodBeat.o(50666);
      return;
      if (this.fVp.fVi)
      {
        u.um(this.fVp.fileName);
        h.pYm.a(354L, 138L, 1L, false);
        break;
      }
      bool1 = u.ae(this.fVp.fileName, this.fVr);
      break;
    }
    label538: h.pYm.a(198L, 31L, this.fVp.fVj.frO, false);
    h.pYm.a(198L, 33L, this.fVp.fVj.fXd, false);
    h.pYm.a(198L, 34L, 1L, false);
    Object localObject2 = h.pYm;
    if (com.tencent.mm.model.t.kH(this.fVp.fVj.getUser()));
    for (l = 36L; ; l = 35L)
    {
      ((h)localObject2).a(198L, l, 1L, false);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.d.2
 * JD-Core Version:    0.6.2
 */