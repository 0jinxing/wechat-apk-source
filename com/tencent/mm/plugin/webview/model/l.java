package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aff;
import com.tencent.mm.protocal.protobuf.afg;
import com.tencent.mm.protocal.protobuf.atz;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class l extends m
  implements k
{
  private f ehi;
  public final b fAT;

  public l(List<atz> paramList, String paramString)
  {
    AppMethodBeat.i(6598);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aff();
    ((b.a)localObject).fsK = new afg();
    ((b.a)localObject).uri = "/cgi-bin/mmo2o-bin/getbeaconsingroup";
    ((b.a)localObject).fsI = 1704;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fAT = ((b.a)localObject).acD();
    localObject = (aff)this.fAT.fsG.fsP;
    ((aff)localObject).wmF.addAll(paramList);
    ((aff)localObject).csB = paramString;
    ab.i("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang]getBeaconsInGroupRequest.beacons.size:%d", new Object[] { Integer.valueOf(((aff)localObject).wmF.size()) });
    AppMethodBeat.o(6598);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6599);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(6599);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6600);
    ab.i("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      ab.d("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:net end ok");
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(6600);
      return;
      ab.d("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:net end not ok");
    }
  }

  public final int getType()
  {
    return 1704;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.l
 * JD-Core Version:    0.6.2
 */