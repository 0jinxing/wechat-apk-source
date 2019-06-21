package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.c.a;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.hs;
import com.tencent.mm.protocal.protobuf.ht;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class d extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private ArrayList<String> kWp;

  public d(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(53099);
    b.a locala = new b.a();
    locala.fsJ = new hs();
    locala.fsK = new ht();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojibackup";
    locala.fsI = 696;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWp = paramArrayList;
    AppMethodBeat.o(53099);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53101);
    this.ehi = paramf;
    ((hs)this.ehh.fsG.fsP).vII = new LinkedList(this.kWp);
    int i;
    if ((this.kWp == null) || (this.kWp.size() <= 0))
    {
      ab.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "need no backup custom emoji, list is null.");
      g.RP().Ry().set(348162, Boolean.FALSE);
      i = -1;
      AppMethodBeat.o(53101);
    }
    while (true)
    {
      return i;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(53101);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53100);
    ab.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "netId:%d, errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramInt3 == -434)
    {
      ab.w("MicroMsg.emoji.NetSceneBatchEmojiBackup", "[cpan] batch backup emoji failed. over size.");
      g.RP().Ry().set(ac.a.xJc, Boolean.TRUE);
      h.pYm.a(164L, 4L, 1L, false);
    }
    com.tencent.mm.storage.emotion.d locald;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.RP().Ry().set(ac.a.xJc, Boolean.FALSE);
      locald = j.getEmojiStorageMgr().xYn;
      paramq = this.kWp;
      if ((paramq == null) || (paramq.size() <= 0))
      {
        ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji failed. list is null");
        h.pYm.a(164L, 2L, 1L, false);
      }
    }
    while (true)
    {
      paramq = (ht)this.ehh.fsH.fsP;
      if ((paramq.vIL != null) && (paramq.vIL.size() > 0))
      {
        ab.i("MicroMsg.emoji.NetSceneBatchEmojiBackup", "[cpan] there are some emoji need to upload.");
        j.getEmojiStorageMgr().xYn.aG(paramq.vIL);
        g.RP().Ry().set(348165, Boolean.TRUE);
        a.gn(true);
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53100);
      return;
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] LocalCustomEmoji list size :%d.", new Object[] { Integer.valueOf(paramq.size()) });
      paramArrayOfByte = new StringBuilder();
      paramArrayOfByte.append("UPDATE");
      paramArrayOfByte.append(" EmojiInfo ");
      paramArrayOfByte.append(" SET ");
      paramArrayOfByte.append("source");
      paramArrayOfByte.append("=");
      paramArrayOfByte.append(EmojiInfo.yay);
      paramArrayOfByte.append(" where ");
      paramArrayOfByte.append("md5");
      paramArrayOfByte.append(" IN (");
      for (paramInt1 = 0; paramInt1 < paramq.size(); paramInt1++)
      {
        paramArrayOfByte.append("'" + (String)paramq.get(paramInt1) + "'");
        if (paramInt1 < paramq.size() - 1)
          paramArrayOfByte.append(",");
      }
      paramArrayOfByte.append(")");
      ab.d("MicroMsg.emoji.EmojiInfoStorage", paramArrayOfByte.toString());
      locald.bSd.hY("EmojiInfo", paramArrayOfByte.toString());
      break;
      h.pYm.a(164L, 3L, 1L, false);
    }
  }

  public final int getType()
  {
    return 696;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.d
 * JD-Core Version:    0.6.2
 */