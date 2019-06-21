package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.hm;
import com.tencent.mm.protocal.protobuf.hn;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class r extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private int kdW;

  public r(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(87866);
    this.kdW = 0;
    b.a locala = new b.a();
    locala.fsJ = new hm();
    locala.fsK = new hn();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelcarditem";
    locala.fsI = 560;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((hm)this.ehh.fsG.fsP).vKf = paramLinkedList;
    AppMethodBeat.o(87866);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87867);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87867);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87868);
    ab.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((hn)this.ehh.fsH.fsP).vKg;
      if (paramq != null)
        break label121;
      paramInt1 = 0;
      ab.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, resp list count = %d", new Object[] { Integer.valueOf(paramInt1) });
      if ((paramq != null) && (paramq.size() != 0))
        break label130;
      ab.e("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd fail, resp list is null");
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(87868);
      return;
      label121: paramInt1 = paramq.size();
      break;
      label130: this.kdW = 0;
      paramq = paramq.iterator();
      label250: 
      while (paramq.hasNext())
      {
        paramArrayOfByte = (String)paramq.next();
        boolean bool;
        if (TextUtils.isEmpty(paramArrayOfByte))
        {
          ab.e("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem fail, id is null");
          bool = false;
        }
        while (true)
        {
          if (bool)
            break label250;
          this.kdW += 1;
          break;
          CardInfo localCardInfo = new CardInfo();
          localCardInfo.field_card_id = paramArrayOfByte;
          bool = am.baW().a(localCardInfo, new String[0]);
          ab.i("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem, delRet = %b", new Object[] { Boolean.valueOf(bool) });
        }
      }
      ab.d("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, %d fail items", new Object[] { Integer.valueOf(this.kdW) });
    }
  }

  public final int getType()
  {
    return 560;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.r
 * JD-Core Version:    0.6.2
 */