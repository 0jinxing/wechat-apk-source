package com.tencent.mm.plugin.topstory.a.c;

import android.os.Build.VERSION;
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
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.cvd;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class j extends m
  implements k
{
  private b ehh;
  private f ehi;
  public chv sBa;

  public j(chv paramchv)
  {
    AppMethodBeat.i(96400);
    a(paramchv, 0, 0, "");
    AppMethodBeat.o(96400);
  }

  public j(chv paramchv, int paramInt, String paramString)
  {
    AppMethodBeat.i(96401);
    a(paramchv, paramInt, 1, paramString);
    AppMethodBeat.o(96401);
  }

  private void a(chv paramchv, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(96402);
    ab.i("MicroMsg.TopStory.NetSceneTopStoryVideo", "Create NetSceneTopStory Video %s", new Object[] { paramchv.xgj, paramchv.hlm });
    this.sBa = paramchv;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsI = 1943;
    ((b.a)localObject1).uri = "/cgi-bin/mmsearch-bin/mmwebrecommend";
    ((b.a)localObject1).fsJ = new cvd();
    ((b.a)localObject1).fsK = new cve();
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (cvd)this.ehh.fsG.fsP;
    ((cvd)localObject1).vOq = paramchv.offset;
    ((cvd)localObject1).wDH = aa.HV(1);
    ((cvd)localObject1).wkD = paramchv.ctj;
    ((cvd)localObject1).wDI = aa.abJ();
    ((cvd)localObject1).Scene = paramchv.scene;
    ((cvd)localObject1).vQg = paramchv.hlm;
    ((cvd)localObject1).xqa.addAll(paramchv.tZG);
    if (!bo.isNullOrNil(paramString))
    {
      Object localObject2 = ((cvd)localObject1).xqa.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        tn localtn = (tn)((Iterator)localObject2).next();
        if (localtn.key.equals("relevant_vid"))
          localtn.waE = paramString;
      }
      localObject2 = new tn();
      ((tn)localObject2).key = "relevant_vid";
      ((tn)localObject2).waE = paramString;
      ((cvd)localObject1).xqa.add(localObject2);
    }
    ((cvd)localObject1).xfr = ((int)paramchv.xgG);
    ((cvd)localObject1).xre = paramInt1;
    ((cvd)localObject1).jCt = paramInt2;
    paramchv = new tn();
    paramchv.key = "client_system_version";
    paramchv.waD = Build.VERSION.SDK_INT;
    ((cvd)localObject1).xqa.add(paramchv);
    paramchv = new tn();
    paramchv.key = "netType";
    paramchv.waE = aa.bVP();
    ((cvd)localObject1).xqa.add(paramchv);
    paramchv = new tn();
    paramchv.key = "client_request_time";
    paramchv.waE = String.valueOf(System.currentTimeMillis());
    ((cvd)localObject1).xqa.add(paramchv);
    paramString = ((cvd)localObject1).xqa.iterator();
    while (paramString.hasNext())
    {
      paramchv = (tn)paramString.next();
      ab.i("MicroMsg.TopStory.NetSceneTopStoryVideo", "key: %s unit_value %s text_value %s", new Object[] { paramchv.key, Long.valueOf(paramchv.waD), paramchv.waE });
    }
    AppMethodBeat.o(96402);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(96403);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(96403);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96404);
    ab.i("MicroMsg.TopStory.NetSceneTopStoryVideo", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(96404);
  }

  public final cve cFt()
  {
    return (cve)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 1943;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.j
 * JD-Core Version:    0.6.2
 */