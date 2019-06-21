package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.btc;
import com.tencent.mm.protocal.protobuf.rq;
import com.tencent.mm.protocal.protobuf.rr;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class m extends n
{
  public m()
  {
  }

  public m(int paramInt)
  {
    AppMethodBeat.i(79556);
    ab.i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%d", new Object[] { Integer.valueOf(paramInt) });
    btc localbtc = new btc();
    localbtc.jCt = paramInt;
    this.veO.clear();
    this.veO.add(localbtc);
    AppMethodBeat.o(79556);
  }

  protected final q diq()
  {
    AppMethodBeat.i(79557);
    Object localObject = new b.a();
    rq localrq = new rq();
    localrq.vYX.addAll(this.veO);
    ((b.a)localObject).fsJ = localrq;
    ((b.a)localObject).fsK = new rr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkresupdate";
    ((b.a)localObject).fsI = 721;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    localObject = ((b.a)localObject).acD();
    AppMethodBeat.o(79557);
    return localObject;
  }

  protected final String getTag()
  {
    return "MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate";
  }

  public final int getType()
  {
    return 721;
  }

  protected final rr i(q paramq)
  {
    return (rr)((b)paramq).fsH.fsP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.m
 * JD-Core Version:    0.6.2
 */