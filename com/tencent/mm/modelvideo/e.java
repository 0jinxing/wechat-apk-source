package com.tencent.mm.modelvideo;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bwr;
import com.tencent.mm.protocal.protobuf.bws;
import com.tencent.mm.protocal.protobuf.chk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class e extends m
  implements k
{
  private String clientId;
  private b ehh;
  private f ehi;
  private long fVs;
  private s fVt;
  private com.tencent.mm.i.d fVu;

  public e(long paramLong, s params, com.tencent.mm.i.d paramd, String paramString)
  {
    AppMethodBeat.i(50679);
    this.fVs = -1L;
    this.fVt = null;
    this.fVu = null;
    this.clientId = "";
    ab.i("MicroMsg.NetSceneMassUploadSight", "massSendId %d, clientId %s", new Object[] { Long.valueOf(paramLong), paramString });
    this.fVs = paramLong;
    this.fVt = params;
    this.fVu = paramd;
    this.clientId = paramString;
    AppMethodBeat.o(50679);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = 0;
    AppMethodBeat.i(50680);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new bwr();
    paramf.fsK = new bws();
    paramf.uri = "/cgi-bin/micromsg-bin/sendsight";
    paramf.fsI = 245;
    this.ehh = paramf.acD();
    paramf = (bwr)this.ehh.fsG.fsP;
    paramf.eyr = this.fVu.field_aesKey;
    paramf.qQm = this.clientId;
    paramf.cvZ = this.fVt.cMW;
    paramf.wXd = this.fVt.fXd;
    o.all();
    Object localObject = t.ui(this.fVt.getFileName());
    BitmapFactory.Options localOptions = com.tencent.mm.sdk.platformtools.d.amj((String)localObject);
    String[] arrayOfString;
    if (localOptions != null)
    {
      paramf.fgJ = localOptions.outWidth;
      paramf.fgI = localOptions.outHeight;
      paramf.fVJ = this.fVt.fXa;
      arrayOfString = bo.bc(this.fVt.fXl, "").split(",");
      if ((arrayOfString != null) && (arrayOfString.length > 0))
        break label254;
      ab.e("MicroMsg.NetSceneMassUploadSight", "cdn upload video done, massSendId[%d], split username fail", new Object[] { Long.valueOf(this.fVs) });
      i = -1;
      AppMethodBeat.o(50680);
    }
    while (true)
    {
      return i;
      ab.w("MicroMsg.NetSceneMassUploadSight", "sight send getImageOptions for thumb failed path:%s", new Object[] { localObject });
      break;
      label254: int j = arrayOfString.length;
      while (i < j)
      {
        localOptions = arrayOfString[i];
        localObject = new chk();
        ((chk)localObject).username = localOptions;
        paramf.wXc.add(localObject);
        i++;
      }
      paramf.url = this.fVu.field_fileId;
      paramf.fXd = this.fVt.frO;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(50680);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(50681);
    ab.i("MicroMsg.NetSceneMassUploadSight", "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.clientId + " massSendId " + this.fVs);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(50681);
  }

  public final int getType()
  {
    return 245;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.e
 * JD-Core Version:    0.6.2
 */