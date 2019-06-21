package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.gm;
import com.tencent.mm.protocal.protobuf.gn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import java.util.List;

public final class c extends m
  implements k
{
  public final b ehh;
  private f ehi;
  public int gvO;
  private int kWn;
  private List<String> kWo;

  public c(int paramInt1, int paramInt2, List<String> paramList)
  {
    AppMethodBeat.i(53096);
    b.a locala = new b.a();
    locala.fsJ = new gm();
    locala.fsK = new gn();
    locala.uri = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
    locala.fsI = 698;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWn = paramInt1;
    this.gvO = paramInt2;
    this.kWo = paramList;
    AppMethodBeat.o(53096);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53098);
    this.ehi = paramf;
    paramf = (gm)this.ehh.fsG.fsP;
    paramf.vIJ = this.gvO;
    paramf.vII = new LinkedList(this.kWo);
    paramf.vIK = this.kWn;
    if ((paramf.vII != null) && (paramf.vII.size() > 0))
    {
      ab.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5 list size:%s", new Object[] { Integer.valueOf(paramf.vII.size()) });
      i = 0;
    }
    while (i < paramf.vII.size())
    {
      ab.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5:%s", new Object[] { paramf.vII.get(i) });
      i++;
      continue;
      ab.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "empty md5 list.");
    }
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53098);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53097);
    ab.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramInt3 == -434)
    {
      ab.w("MicroMsg.emoji.NetSceneBackupEmojiOperate", "[cpan] batch backup emoji failed. over size.");
      g.RP().Ry().set(ac.a.xJc, Boolean.TRUE);
      h.pYm.a(164L, 7L, 1L, false);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.RP().Ry().set(ac.a.xJc, Boolean.FALSE);
      if ((this.gvO == 1) || (this.gvO == 4))
        h.pYm.a(164L, 5L, 1L, false);
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53097);
      return;
      h.pYm.a(164L, 8L, 1L, false);
      continue;
      if ((this.gvO == 1) || (this.gvO == 4))
        h.pYm.a(164L, 6L, 1L, false);
      else
        h.pYm.a(164L, 9L, 1L, false);
    }
  }

  public final int getType()
  {
    return 698;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.c
 * JD-Core Version:    0.6.2
 */