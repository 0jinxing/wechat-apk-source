package com.tencent.mm.plugin.fav.a;

import android.util.SparseArray;
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
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bzg;
import com.tencent.mm.protocal.protobuf.bzh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class am extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private List<Integer> mgv;
  private am.a mgw;
  private SparseArray<String> mgx;
  private int scene;
  private String toUser;

  public am(String paramString, List<Integer> paramList, am.a parama)
  {
    AppMethodBeat.i(102746);
    this.ehi = null;
    this.mgw = null;
    this.mgx = new SparseArray();
    b.a locala = new b.a();
    locala.fsJ = new bzg();
    locala.fsK = new bzh();
    locala.uri = "/cgi-bin/micromsg-bin/sharefav";
    locala.fsI = 608;
    locala.fsL = 246;
    locala.fsM = 1000000246;
    this.ehh = locala.acD();
    this.toUser = paramString;
    this.scene = 2;
    this.mgv = paramList;
    this.mgw = parama;
    AppMethodBeat.o(102746);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(102748);
    bzg localbzg = (bzg)this.ehh.fsG.fsP;
    localbzg.wYk = this.toUser;
    localbzg.Scene = this.scene;
    localbzg.vKh = new LinkedList(this.mgv);
    localbzg.jBv = localbzg.vKh.size();
    ab.d("MicroMsg.NetSceneShareFavItem", "do scene %s %d %s %d", new Object[] { localbzg.wYk, Integer.valueOf(localbzg.Scene), localbzg.vKh, Integer.valueOf(localbzg.jBv) });
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(102748);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102747);
    ab.d("MicroMsg.NetSceneShareFavItem", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.mgx.clear();
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bzh)((b)paramq).fsH.fsP;
      if (paramq.wtm != this.mgv.size())
        ab.w("MicroMsg.NetSceneShareFavItem", "get url error, request count %d, response count %d", new Object[] { Integer.valueOf(this.mgv.size()), Integer.valueOf(paramq.wtm) });
      for (paramInt1 = 0; (paramInt1 < paramq.vKr.size()) && (paramInt1 < this.mgv.size()); paramInt1++)
      {
        ab.d("MicroMsg.NetSceneShareFavItem", "id[%d] url=%s", new Object[] { this.mgv.get(paramInt1), paramq.vKr.get(paramInt1) });
        this.mgx.put(((Integer)this.mgv.get(paramInt1)).intValue(), ((bts)paramq.vKr.get(paramInt1)).wVI);
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.mgw != null)
      this.mgw.d(this.mgx);
    AppMethodBeat.o(102747);
  }

  public final int getType()
  {
    return 608;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.am
 * JD-Core Version:    0.6.2
 */