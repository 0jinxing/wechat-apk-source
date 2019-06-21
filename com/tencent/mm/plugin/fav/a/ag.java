package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ho;
import com.tencent.mm.protocal.protobuf.hp;
import com.tencent.mm.protocal.protobuf.vp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ag extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private LinkedList<Integer> mfZ;
  private int mga;

  public ag(LinkedList<Integer> paramLinkedList)
  {
    AppMethodBeat.i(102719);
    this.ehi = null;
    this.mga = 0;
    b.a locala = new b.a();
    locala.fsJ = new ho();
    locala.fsK = new hp();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelfavitem";
    locala.fsI = 403;
    locala.fsL = 194;
    locala.fsM = 1000000194;
    this.ehh = locala.acD();
    this.mfZ = paramLinkedList;
    AppMethodBeat.o(102719);
  }

  private boolean bvc()
  {
    AppMethodBeat.i(102720);
    if ((this.mfZ != null) && (this.mga < this.mfZ.size()));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.NetSceneBatchDelFavItem", "check need continue, indexOK %B", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(102720);
      return bool;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(102721);
    if ((this.mfZ == null) || (this.mfZ.isEmpty()) || (this.mga >= this.mfZ.size()))
    {
      ab.e("MicroMsg.NetSceneBatchDelFavItem", "klem doScene idList null, begIndex %d", new Object[] { Integer.valueOf(this.mga) });
      i = -1;
      AppMethodBeat.o(102721);
      return i;
    }
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.mfZ.size()), Integer.valueOf(this.mga), this.mfZ });
    paramf = (ho)this.ehh.fsG.fsP;
    paramf.vKh.clear();
    int j = this.mga;
    int i = 0;
    label141: if (j < this.mfZ.size())
    {
      int k = ((Integer)this.mfZ.get(j)).intValue();
      if (k <= 0)
        break label269;
      paramf.vKh.add(Integer.valueOf(k));
      i++;
    }
    label269: 
    while (true)
    {
      if (i < 20)
      {
        j++;
        break label141;
      }
      this.mga = (j + 1);
      paramf.jBv = paramf.vKh.size();
      ab.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(paramf.jBv), paramf.vKh });
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(102721);
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102722);
    ab.i("MicroMsg.NetSceneBatchDelFavItem", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.mga), Integer.valueOf(this.mfZ.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
      if (bvc())
      {
        a(this.ftf, this.ehi);
        AppMethodBeat.o(102722);
      }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(102722);
      continue;
      LinkedList localLinkedList = ((hp)((com.tencent.mm.ai.b)paramq).fsH.fsP).jBw;
      if ((localLinkedList == null) || (localLinkedList.size() == 0))
      {
        ab.e("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet resp list null");
        if (bvc())
        {
          a(this.ftf, this.ehi);
          AppMethodBeat.o(102722);
        }
        else
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(102722);
        }
      }
      else
      {
        paramq = new ArrayList();
        ab.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet respList size:%d", new Object[] { Integer.valueOf(localLinkedList.size()) });
        paramInt1 = 0;
        if (paramInt1 < localLinkedList.size())
        {
          paramArrayOfByte = (vp)localLinkedList.get(paramInt1);
          if (paramArrayOfByte.Ret < 0)
            ab.w("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d, delete failed", new Object[] { Integer.valueOf(paramArrayOfByte.vEp) });
          while (true)
          {
            paramInt1++;
            break;
            paramq.add(Integer.valueOf(paramArrayOfByte.vEp));
            ab.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d deleted", new Object[] { Integer.valueOf(paramArrayOfByte.vEp) });
          }
        }
        b.bI(paramq);
        if (bvc())
        {
          a(this.ftf, this.ehi);
          AppMethodBeat.o(102722);
        }
        else
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(102722);
        }
      }
    }
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 403;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.ag
 * JD-Core Version:    0.6.2
 */