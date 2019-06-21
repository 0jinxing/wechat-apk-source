package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bkv;
import com.tencent.mm.protocal.protobuf.bkw;
import com.tencent.mm.protocal.protobuf.civ;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.i.a;
import org.b.d.i;

public final class g extends m
  implements k
{
  private b ehh;
  private f ehi;
  private int fHT;

  public g(int paramInt, String paramString)
  {
    AppMethodBeat.i(16500);
    this.fHT = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bkv();
    ((b.a)localObject).fsK = new bkw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/postinvitefriendsmsg";
    ((b.a)localObject).fsI = 1804;
    this.ehh = ((b.a)localObject).acD();
    bkv localbkv = (bkv)this.ehh.fsG.fsP;
    localbkv.wpw = paramInt;
    localbkv.wpy = paramString;
    if ((paramInt & 0x10) > 0)
    {
      a locala = new a();
      localObject = new civ();
      if (locala.zKU == null)
        break label185;
      paramString = (String)localObject;
      if (!bo.isNullOrNil(locala.zKU.token))
      {
        ((civ)localObject).xhJ = locala.zKU.token;
        ((civ)localObject).xhK = locala.zKU.wFn;
      }
    }
    label185: for (paramString = (String)localObject; ; paramString = null)
    {
      localbkv.wNQ = paramString;
      this.fHT = paramInt;
      AppMethodBeat.o(16500);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16502);
    ab.d("MicroMsg.NetScenePostInviteFriendsMsg", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16502);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16501);
    ab.d("MicroMsg.NetScenePostInviteFriendsMsg", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(16501);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(16501);
    }
  }

  public final int getType()
  {
    return 1804;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.g
 * JD-Core Version:    0.6.2
 */