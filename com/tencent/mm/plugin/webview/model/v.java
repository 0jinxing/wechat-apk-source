package com.tencent.mm.plugin.webview.model;

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
import com.tencent.mm.protocal.protobuf.azk;
import com.tencent.mm.protocal.protobuf.azl;
import com.tencent.mm.sdk.platformtools.ab;

public final class v extends m
  implements k
{
  private f eIc;
  private final b ehh;
  public String kKw;
  public String kKx;
  public String sign;
  public String ulZ;
  public int uma;

  public v(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6628);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new azk();
    ((b.a)localObject).fsK = new azl();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_getuseropenid";
    ((b.a)localObject).fsI = 1177;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (azk)this.ehh.fsG.fsP;
    ((azk)localObject).app_id = paramString1;
    ((azk)localObject).wmb = paramString2;
    ((azk)localObject).kfT = paramString3;
    AppMethodBeat.o(6628);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6630);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6630);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6629);
    ab.i("MicroMsg.NetSceneMMBizGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (azl)this.ehh.fsH.fsP;
      this.ulZ = paramq.ulZ;
      this.sign = paramq.sign;
      this.kKx = paramq.kKx;
      this.kKw = paramq.kKw;
      this.uma = paramq.uma;
      ab.d("MicroMsg.NetSceneMMBizGetUserOpenId", "openid:%s, sign:%s, head_img_url:%s, nick_name:%s, friend_relation:%d", new Object[] { this.ulZ, this.sign, this.kKx, this.kKw, Integer.valueOf(this.uma) });
    }
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6629);
  }

  public final int getType()
  {
    return 1177;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.v
 * JD-Core Version:    0.6.2
 */