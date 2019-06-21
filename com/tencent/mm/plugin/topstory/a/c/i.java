package com.tencent.mm.plugin.topstory.a.c;

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
import com.tencent.mm.protocal.protobuf.chr;
import com.tencent.mm.protocal.protobuf.chs;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class i extends m
  implements k
{
  public b ehh;
  private f ehi;
  public chw sAX;
  private long sAZ;

  public i(chw paramchw, String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, int paramInt3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(65515);
    this.sAZ = System.currentTimeMillis();
    this.sAX = paramchw;
    paramchw = new b.a();
    paramchw.fsI = 2802;
    paramchw.uri = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
    paramchw.fsJ = new chr();
    paramchw.fsK = new chs();
    this.ehh = paramchw.acD();
    paramchw = (chr)this.ehh.fsG.fsP;
    paramchw.wUo = paramString1;
    paramchw.xgx = "";
    paramchw.nbk = paramInt1;
    paramchw.xgs = paramString2;
    paramchw.ncM = "";
    paramchw.Scene = paramInt2;
    paramchw.wDM = paramString3;
    paramchw.vGB = paramInt3;
    paramchw.wbI = paramString4;
    paramchw.xgw = paramString5;
    paramchw.vFH = 1;
    ab.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", new Object[] { paramchw.wUo, paramchw.xgx, Integer.valueOf(paramchw.nbk), paramchw.xgs, paramchw.ncM, Integer.valueOf(paramchw.Scene), paramchw.wDM, Integer.valueOf(paramchw.vGB), paramchw.wbI, paramchw.xgw });
    AppMethodBeat.o(65515);
  }

  public i(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(65514);
    this.sAZ = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 2802;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
    ((b.a)localObject).fsJ = new chr();
    ((b.a)localObject).fsK = new chs();
    this.ehh = ((b.a)localObject).acD();
    localObject = (chr)this.ehh.fsG.fsP;
    ((chr)localObject).wUo = paramJSONObject.optString("docId", "");
    ((chr)localObject).xgx = paramJSONObject.optString("commentId", "");
    ((chr)localObject).nbk = paramJSONObject.optInt("opType", 0);
    ((chr)localObject).xgs = paramJSONObject.optString("requestId", "");
    ((chr)localObject).ncM = paramJSONObject.optString("content", "");
    ((chr)localObject).Scene = paramJSONObject.optInt("scene", 0);
    ((chr)localObject).wDM = paramJSONObject.optString("searchId", "");
    ((chr)localObject).vGB = paramJSONObject.optInt("subScene", 0);
    ((chr)localObject).wbI = paramJSONObject.optString("vid", "");
    ((chr)localObject).xgw = paramJSONObject.optString("byPass", "");
    ((chr)localObject).vFH = 0;
    ab.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", new Object[] { ((chr)localObject).wUo, ((chr)localObject).xgx, Integer.valueOf(((chr)localObject).nbk), ((chr)localObject).xgs, ((chr)localObject).ncM, Integer.valueOf(((chr)localObject).Scene), ((chr)localObject).wDM, Integer.valueOf(((chr)localObject).vGB), ((chr)localObject).wbI, ((chr)localObject).xgw });
    AppMethodBeat.o(65514);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(65516);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(65516);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65517);
    ab.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(System.currentTimeMillis() - this.sAZ) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(65517);
  }

  public final chs cFw()
  {
    return (chs)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 2802;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.i
 * JD-Core Version:    0.6.2
 */