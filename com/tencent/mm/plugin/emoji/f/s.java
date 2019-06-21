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
import com.tencent.mm.protocal.protobuf.clm;
import com.tencent.mm.protocal.protobuf.cln;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private int gvO;
  private List<String> kXe;

  public s(List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(53153);
    this.kXe = new ArrayList();
    b.a locala = new b.a();
    locala.fsJ = new clm();
    locala.fsK = new cln();
    locala.uri = "/cgi-bin/micromsg-bin/mmuploadmypanellist";
    locala.fsI = 717;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kXe = paramList;
    this.gvO = paramInt;
    AppMethodBeat.o(53153);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53155);
    this.ehi = paramf;
    clm localclm = (clm)this.ehh.fsG.fsP;
    localclm.OpCode = this.gvO;
    if (this.kXe != null)
    {
      Iterator localIterator = this.kXe.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramf = str;
        if (!bo.isNullOrNil(str))
        {
          paramf = str;
          if (str.equals(String.valueOf(EmojiGroupInfo.yac)))
            paramf = "com.tencent.xin.emoticon.tusiji";
        }
        localclm.xjj.add(paramf);
        ab.d("MicroMsg.emoji.NetSceneUploadMyPanelList", "product id is:%s", new Object[] { paramf });
      }
      ab.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "opcode is:%d mProductIdList size:%s", new Object[] { Integer.valueOf(this.gvO), Integer.valueOf(this.kXe.size()) });
    }
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53155);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53154);
    ab.i("MicroMsg.emoji.NetSceneUploadMyPanelList", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.RP().Ry().set(ac.a.xJd, Long.valueOf(System.currentTimeMillis()));
      g.RP().Ry().set(ac.a.xJg, Boolean.TRUE);
      h.pYm.a(165L, 0L, 1L, false);
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53154);
      return;
      g.RP().Ry().set(ac.a.xJd, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
      h.pYm.a(165L, 1L, 1L, false);
    }
  }

  public final int getType()
  {
    return 717;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.s
 * JD-Core Version:    0.6.2
 */