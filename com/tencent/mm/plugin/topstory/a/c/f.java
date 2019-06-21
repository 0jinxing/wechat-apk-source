package com.tencent.mm.plugin.topstory.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.chp;
import com.tencent.mm.protocal.protobuf.chq;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class f extends m
  implements k
{
  public b ehh;
  private com.tencent.mm.ai.f ehi;
  private long sAZ;

  public f(f paramf)
  {
    AppMethodBeat.i(65511);
    this.sAZ = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 2906;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
    ((b.a)localObject).fsJ = new chp();
    ((b.a)localObject).fsK = new chq();
    this.ehh = ((b.a)localObject).acD();
    localObject = (chp)this.ehh.fsG.fsP;
    paramf = paramf.cFv();
    ((chp)localObject).xgs = paramf.xgs;
    ((chp)localObject).wUo = paramf.wUo;
    ((chp)localObject).ncM = paramf.ncM;
    ((chp)localObject).xgt = paramf.xgt;
    ((chp)localObject).xgu = paramf.xgu;
    ((chp)localObject).xgv = paramf.xgv;
    ((chp)localObject).Title = paramf.Title;
    ((chp)localObject).wDM = paramf.wDM;
    ((chp)localObject).Scene = paramf.Scene;
    ((chp)localObject).vGB = paramf.vGB;
    ((chp)localObject).wbI = paramf.wbI;
    ((chp)localObject).xgw = paramf.xgw;
    ((chp)localObject).vFH = paramf.vFH;
    ab.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", new Object[] { ((chp)localObject).xgs, ((chp)localObject).wUo, ((chp)localObject).ncM, ((chp)localObject).xgt, ((chp)localObject).xgu, ((chp)localObject).xgv, ((chp)localObject).Title, ((chp)localObject).wDM, Integer.valueOf(((chp)localObject).Scene), Integer.valueOf(((chp)localObject).vGB) });
    AppMethodBeat.o(65511);
  }

  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt1, int paramInt2, String paramString9, String paramString10)
  {
    AppMethodBeat.i(65510);
    this.sAZ = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 2906;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
    ((b.a)localObject).fsJ = new chp();
    ((b.a)localObject).fsK = new chq();
    this.ehh = ((b.a)localObject).acD();
    localObject = (chp)this.ehh.fsG.fsP;
    ((chp)localObject).xgs = paramString1;
    ((chp)localObject).wUo = paramString2;
    ((chp)localObject).ncM = paramString3;
    ((chp)localObject).xgt = paramString4;
    ((chp)localObject).xgu = paramString5;
    ((chp)localObject).xgv = paramString6;
    ((chp)localObject).Title = paramString7;
    ((chp)localObject).wDM = paramString8;
    ((chp)localObject).Scene = paramInt1;
    ((chp)localObject).vGB = paramInt2;
    ((chp)localObject).wbI = paramString9;
    ((chp)localObject).xgw = paramString10;
    ((chp)localObject).vFH = 1;
    ab.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", new Object[] { ((chp)localObject).xgs, ((chp)localObject).wUo, ((chp)localObject).ncM, ((chp)localObject).xgt, ((chp)localObject).xgu, ((chp)localObject).xgv, ((chp)localObject).Title, ((chp)localObject).wDM, Integer.valueOf(((chp)localObject).Scene), Integer.valueOf(((chp)localObject).vGB) });
    AppMethodBeat.o(65510);
  }

  public f(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(65509);
    this.sAZ = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 2906;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
    ((b.a)localObject).fsJ = new chp();
    ((b.a)localObject).fsK = new chq();
    this.ehh = ((b.a)localObject).acD();
    localObject = (chp)this.ehh.fsG.fsP;
    ((chp)localObject).xgs = paramJSONObject.optString("requestId", "");
    ((chp)localObject).wUo = paramJSONObject.optString("docId", "");
    ((chp)localObject).ncM = paramJSONObject.optString("content", "");
    ((chp)localObject).xgt = paramJSONObject.optString("replyId", "");
    ((chp)localObject).xgu = paramJSONObject.optString("subReplyId", "");
    ((chp)localObject).xgv = paramJSONObject.optString("docUrl", "");
    ((chp)localObject).Title = paramJSONObject.optString("title", "");
    ((chp)localObject).wDM = paramJSONObject.optString("searchId", "");
    ((chp)localObject).Scene = paramJSONObject.optInt("scene", 0);
    ((chp)localObject).vGB = paramJSONObject.optInt("subScene", 0);
    ((chp)localObject).wbI = paramJSONObject.optString("vid", "");
    ((chp)localObject).xgw = paramJSONObject.optString("byPass", "");
    ((chp)localObject).vFH = 0;
    ab.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", new Object[] { ((chp)localObject).xgs, ((chp)localObject).wUo, ((chp)localObject).ncM, ((chp)localObject).xgt, ((chp)localObject).xgu, ((chp)localObject).xgv, ((chp)localObject).Title, ((chp)localObject).wDM, Integer.valueOf(((chp)localObject).Scene), Integer.valueOf(((chp)localObject).vGB) });
    AppMethodBeat.o(65509);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(65512);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(65512);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65513);
    ab.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(System.currentTimeMillis() - this.sAZ) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(65513);
  }

  public final chq cFu()
  {
    return (chq)this.ehh.fsH.fsP;
  }

  public final chp cFv()
  {
    return (chp)this.ehh.fsG.fsP;
  }

  public final int getType()
  {
    return 2906;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.f
 * JD-Core Version:    0.6.2
 */