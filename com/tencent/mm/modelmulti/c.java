package com.tencent.mm.modelmulti;

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
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.afh;
import com.tencent.mm.protocal.protobuf.afi;
import com.tencent.mm.protocal.protobuf.atz;
import com.tencent.mm.protocal.protobuf.aub;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class c extends m
  implements k
{
  private f ehi;
  public final b fAT;

  public c(List<atz> paramList, long paramLong, aub paramaub)
  {
    AppMethodBeat.i(16494);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new afh();
    ((b.a)localObject).fsK = new afi();
    ((b.a)localObject).uri = "/cgi-bin/mmo2o-bin/getbeaconspushmessage";
    ((b.a)localObject).fsI = 1708;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fAT = ((b.a)localObject).acD();
    localObject = (afh)this.fAT.fsG.fsP;
    ((afh)localObject).wmF.addAll(paramList);
    ((afh)localObject).wmI = paramLong;
    ((afh)localObject).wmH = paramaub;
    ab.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma]getBeaconsPushMessageReq.beacons.size:%d", new Object[] { Integer.valueOf(((afh)localObject).wmF.size()) });
    AppMethodBeat.o(16494);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16496);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(16496);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16495);
    ab.i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    Object localObject = (afh)this.fAT.fsG.fsP;
    paramArrayOfByte = ((afh)localObject).wmF;
    paramString = (atz)paramArrayOfByte.get(0);
    localObject = ((afh)localObject).wmH;
    paramq = (afi)((b)paramq).fsH.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      if (paramq.result != 0)
        h.pYm.e(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramArrayOfByte.size()), paramString.eCq, Integer.valueOf(paramString.major), Integer.valueOf(paramString.minor), String.valueOf(((aub)localObject).latitude), String.valueOf(((aub)localObject).longitude), Integer.valueOf(2), Integer.valueOf(paramq.result) });
      ab.d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end ok");
      AppMethodBeat.o(16495);
    }
    while (true)
    {
      return;
      h.pYm.e(12659, new Object[] { Integer.valueOf(1), Integer.valueOf(paramArrayOfByte.size()), paramString.eCq, Integer.valueOf(paramString.major), Integer.valueOf(paramString.minor), String.valueOf(((aub)localObject).latitude), String.valueOf(((aub)localObject).longitude), Integer.valueOf(1), Integer.valueOf(paramq.result) });
      ab.d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end not ok");
      AppMethodBeat.o(16495);
    }
  }

  public final int getType()
  {
    return 1708;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.c
 * JD-Core Version:    0.6.2
 */