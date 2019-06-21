package com.tencent.mm.plugin.fav.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aax;
import com.tencent.mm.protocal.protobuf.abi;
import com.tencent.mm.protocal.protobuf.qx;
import com.tencent.mm.protocal.protobuf.qy;
import com.tencent.mm.protocal.protobuf.qz;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a extends m
  implements k
{
  private f ehi;
  private b fAT;

  public a(abi paramabi)
  {
    AppMethodBeat.i(5322);
    this.ehi = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new qx();
    ((b.a)localObject).fsK = new qy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkfavitem";
    ((b.a)localObject).fsI = 405;
    ((b.a)localObject).fsL = 196;
    ((b.a)localObject).fsM = 1000000196;
    this.fAT = ((b.a)localObject).acD();
    localObject = (qx)this.fAT.fsG.fsP;
    ((qx)localObject).vYc = paramabi;
    ((qx)localObject).Scene = 2;
    ab.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_DATA %s", new Object[] { Integer.valueOf(paramabi.vEp) });
    AppMethodBeat.o(5322);
  }

  public a(List<aax> paramList)
  {
    AppMethodBeat.i(5321);
    this.ehi = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new qx();
    ((b.a)localObject).fsK = new qy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkfavitem";
    ((b.a)localObject).fsI = 405;
    ((b.a)localObject).fsL = 196;
    ((b.a)localObject).fsM = 1000000196;
    this.fAT = ((b.a)localObject).acD();
    localObject = (qx)this.fAT.fsG.fsP;
    ((qx)localObject).vYb = new LinkedList();
    ((qx)localObject).vYb.addAll(paramList);
    ((qx)localObject).Scene = 1;
    ab.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_OBJECT %s", new Object[] { Integer.valueOf(paramList.size()) });
    AppMethodBeat.o(5321);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(5323);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(5323);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(5324);
    ab.i("MicroMsg.Fav.NetSceneCheckFavItem", "netId %d errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (qy)((b)paramq).fsH.fsP;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem,cgi return error,errcode:%d,errType:%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt2) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(5324);
    }
    while (true)
    {
      return;
      paramArrayOfByte = paramq.vYd.iterator();
      while (paramArrayOfByte.hasNext())
      {
        paramq = (qz)paramArrayOfByte.next();
        ab.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem, onGYNetEnd,favid: %d, ret: %d", new Object[] { Integer.valueOf(paramq.vEp), Integer.valueOf(paramq.Ret) });
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(5324);
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
    return 405;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.d.a
 * JD-Core Version:    0.6.2
 */