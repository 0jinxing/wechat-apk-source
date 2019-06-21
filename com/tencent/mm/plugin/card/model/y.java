package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.protocal.protobuf.agf;
import com.tencent.mm.protocal.protobuf.agg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class y extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public y()
  {
    AppMethodBeat.i(87889);
    b.a locala = new b.a();
    locala.fsJ = new agf();
    locala.fsK = new agg();
    locala.uri = "/cgi-bin/micromsg-bin/getcardcount";
    locala.fsI = 663;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(87889);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(87890);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87890);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87891);
    ab.i("MicroMsg.NetSceneGetCardCount", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (agg)this.ehh.fsH.fsP;
      ab.i("MicroMsg.NetSceneGetCardCount", "has_card_item:" + paramq.wnc + " has_share_card:" + paramq.wnd);
      if (paramq.wnc > 0)
      {
        l.beB();
        if (TextUtils.isEmpty((String)g.RP().Ry().get(ac.a.xKi, null)))
        {
          am.baV();
          com.tencent.mm.plugin.card.b.b.sO(1);
        }
      }
      if (paramq.wnd > 0)
      {
        l.beD();
        paramq = (Long)g.RP().Ry().get(ac.a.xKs, Long.valueOf(0L));
        if ((paramq != null) && (paramq.longValue() == 0L))
          am.bbd().bbr();
      }
    }
    g.RP().Ry().set(282882, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87891);
  }

  public final int getType()
  {
    return 663;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.y
 * JD-Core Version:    0.6.2
 */