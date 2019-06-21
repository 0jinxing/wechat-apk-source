package com.tencent.mm.plugin.topstory.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.te;
import com.tencent.mm.protocal.protobuf.ti;
import com.tencent.mm.protocal.protobuf.tj;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends m
  implements k
{
  public b ehh;
  private com.tencent.mm.ai.f ehi;
  private long sAZ;

  public g(long paramLong, String paramString1, String paramString2, String paramString3, com.tencent.mm.pluginsdk.model.app.f paramf, String paramString4)
  {
    AppMethodBeat.i(96392);
    ab.i("MicroMsg.TopStory.NetSceneTopStoryPostVideo", "Create NetSceneTopStoryPostVideo ts:%s, extInfo:%s, comment:%s, requestId:%s, appVersion:%s", new Object[] { Long.valueOf(paramLong), paramString1, paramString2, paramString3, paramString4 });
    this.sAZ = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 2534;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/colikepost";
    ((b.a)localObject).fsJ = new ti();
    ((b.a)localObject).fsK = new tj();
    this.ehh = ((b.a)localObject).acD();
    localObject = (ti)this.ehh.fsG.fsP;
    ((ti)localObject).timestamp = paramLong;
    ((ti)localObject).way = paramString1;
    ((ti)localObject).vGv = paramString2;
    ((ti)localObject).nQB = paramString3;
    ((ti)localObject).waz = new te();
    ((ti)localObject).waz.appName = paramf.field_appName;
    ((ti)localObject).waz.appId = paramf.field_appId;
    ((ti)localObject).waz.version = paramString4;
    AppMethodBeat.o(96392);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(96393);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(96393);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96394);
    ab.i("MicroMsg.TopStory.NetSceneTopStoryPostVideo", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(System.currentTimeMillis() - this.sAZ) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(96394);
  }

  public final int getType()
  {
    return 2534;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.g
 * JD-Core Version:    0.6.2
 */