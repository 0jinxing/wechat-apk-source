package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ado;
import com.tencent.mm.protocal.protobuf.adp;
import com.tencent.mm.protocal.protobuf.atp;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.le;
import com.tencent.mm.protocal.protobuf.vc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h extends m
  implements k
{
  public final b ehh;
  private f ehi;
  public Object tag;

  private h()
  {
    AppMethodBeat.i(78571);
    this.ehh = h.a.d(h.a.a(h.a.a.fOy));
    AppMethodBeat.o(78571);
  }

  public h(int paramInt1, int paramInt2)
  {
    this();
    AppMethodBeat.i(78578);
    ado localado = (ado)this.ehh.fsG.fsP;
    localado.OpCode = 3;
    localado.Scene = 5;
    localado.wlp = paramInt1;
    localado.wlt = paramInt2;
    ab.d("MicroMsg.NetSceneGetA8Key", "dkwt geta8key friendQQNum:%d  a2key-len:%d requestId", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(localado.vHP.getILen()), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(78578);
  }

  private h(h.a.a parama)
  {
    AppMethodBeat.i(78573);
    this.ehh = h.a.a(parama);
    AppMethodBeat.o(78573);
  }

  private h(String paramString, int paramInt)
  {
    AppMethodBeat.i(78572);
    h.a.a locala1 = h.a.a.fOx;
    h.a.a locala2 = locala1;
    if (locala1 == h.a.a.fOx)
      locala2 = h.a.aa(paramString, paramInt);
    ab.i("MicroMsg.NetSceneGetA8Key", "getCommReqRespFromReqUrl reqUrl=%s, type=%s, reason=%d", new Object[] { paramString, locala2, Integer.valueOf(paramInt) });
    this.ehh = h.a.d(h.a.a(locala2));
    AppMethodBeat.o(78572);
  }

  public h(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, byte[] paramArrayOfByte)
  {
    this(paramString1, 0);
    AppMethodBeat.i(78576);
    ado localado = (ado)this.ehh.fsG.fsP;
    localado.OpCode = 2;
    localado.wln = new bts().alV(paramString1);
    localado.Scene = paramInt1;
    localado.jBB = null;
    localado.vIw = 0;
    localado.vXI = paramInt2;
    localado.vXJ = paramInt3;
    localado.wlt = paramInt4;
    localado.wlk = new bts().alV(paramString2);
    localado.wlw = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    ab.d("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = " + paramString1 + ", username = " + null + ", scene = " + paramInt1 + ", reason = 0, codeType = " + paramInt2 + ", codeVersion = " + paramInt3 + ", requestId = " + paramInt4);
    ab.d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie = %s", new Object[] { bo.cd(paramArrayOfByte) });
    AppMethodBeat.o(78576);
  }

  public h(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, int paramInt4, String paramString4, String paramString5, int paramInt5, byte[] paramArrayOfByte)
  {
    this(paramString1, paramInt2);
    AppMethodBeat.i(78577);
    ado localado = (ado)this.ehh.fsG.fsP;
    localado.OpCode = 2;
    localado.wln = new bts().alV(paramString1);
    localado.Scene = paramInt1;
    localado.jBB = paramString2;
    localado.vIw = paramInt2;
    localado.vEq = paramInt3;
    localado.vKt = paramString3;
    localado.wlt = paramInt4;
    localado.wlu = paramString5;
    localado.wlv = paramInt5;
    localado.wlk = new bts().alV(paramString4);
    localado.wlw = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    ab.i("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = %s, username = %s, scene = %d, reason = %d, flag = %d, netType = %s, requestId = %d, appId = %s, functionId = %s, wallentRegion = %d, a8KeyCookie = %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString3, Integer.valueOf(paramInt4), paramString4, paramString5, Integer.valueOf(paramInt5), bo.cd(paramArrayOfByte) });
    AppMethodBeat.o(78577);
  }

  public h(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this(paramString1, paramInt2);
    AppMethodBeat.i(78575);
    ado localado = (ado)this.ehh.fsG.fsP;
    localado.OpCode = 2;
    localado.wln = new bts().alV(paramString1);
    localado.Scene = paramInt1;
    localado.jBB = paramString2;
    localado.vIw = paramInt2;
    localado.wlt = paramInt3;
    localado.wlw = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    ab.d("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = " + paramString1 + ", username = " + paramString2 + ", scene = " + paramInt1 + ", reason = " + paramInt2 + ", requestId = " + paramInt3);
    ab.d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie = %s", new Object[] { bo.cd(paramArrayOfByte) });
    AppMethodBeat.o(78575);
  }

  public h(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(h.a.a.fOz);
    AppMethodBeat.i(78574);
    ado localado = (ado)this.ehh.fsG.fsP;
    localado.OpCode = 1;
    localado.wlk = new bts().alV(paramString1);
    localado.wll = new bts().alV(paramString2);
    localado.wlm = new bts().alV(paramString3);
    localado.wlt = paramInt;
    ab.d("MicroMsg.NetSceneGetA8Key", "get a8key appid=%s requestId=%d", new Object[] { paramString1, Integer.valueOf(paramInt) });
    AppMethodBeat.o(78574);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78579);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78579);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78580);
    ab.d("MicroMsg.NetSceneGetA8Key", "dkwt geta8key onGYNetEnd:[%d,%d] url:[%s]  a8key:[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), aiT(), ((adp)this.ehh.fsH.fsP).wlz });
    ab.d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie:%s", new Object[] { bo.cd(ajc()) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78580);
  }

  public final String aiT()
  {
    return ((adp)this.ehh.fsH.fsP).wly;
  }

  public final String aiU()
  {
    Object localObject = ((ado)this.ehh.fsG.fsP).wln;
    if (localObject != null);
    for (localObject = ((bts)localObject).wVI; ; localObject = null)
      return localObject;
  }

  public final int aiV()
  {
    return ((adp)this.ehh.fsH.fsP).vAS;
  }

  public final byte[] aiW()
  {
    AppMethodBeat.i(78581);
    Object localObject1 = (adp)this.ehh.fsH.fsP;
    if (((adp)localObject1).wlH == null)
    {
      AppMethodBeat.o(78581);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      try
      {
        localObject1 = aa.a(((adp)localObject1).wlH);
        AppMethodBeat.o(78581);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(78581);
        Object localObject2 = null;
      }
    }
  }

  public final String aiX()
  {
    return ((adp)this.ehh.fsH.fsP).wlC;
  }

  public final ArrayList<byte[]> aiY()
  {
    AppMethodBeat.i(78582);
    Object localObject = (adp)this.ehh.fsH.fsP;
    ArrayList localArrayList = new ArrayList();
    if ((localObject == null) || (((adp)localObject).wlE == null))
      AppMethodBeat.o(78582);
    while (true)
    {
      return localArrayList;
      localObject = ((adp)localObject).wlE.iterator();
      while (((Iterator)localObject).hasNext())
      {
        le localle = (le)((Iterator)localObject).next();
        try
        {
          localArrayList.add(localle.toByteArray());
        }
        catch (IOException localIOException)
        {
          ab.e("MicroMsg.NetSceneGetA8Key", "exception:%s", new Object[] { bo.l(localIOException) });
        }
      }
      ab.d("MicroMsg.NetSceneGetA8Key", "ScopeList size = %s", new Object[] { Integer.valueOf(localArrayList.size()) });
      AppMethodBeat.o(78582);
    }
  }

  public final long aiZ()
  {
    adp localadp = (adp)this.ehh.fsH.fsP;
    if (localadp.wlG != null);
    for (long l = localadp.wlG.wcz; ; l = -1L)
      return l;
  }

  public final List<atp> aja()
  {
    return ((adp)this.ehh.fsH.fsP).wlJ;
  }

  public final int ajb()
  {
    return ((ado)this.ehh.fsG.fsP).wlt;
  }

  public final byte[] ajc()
  {
    AppMethodBeat.i(78583);
    Object localObject = (adp)this.ehh.fsH.fsP;
    if (((adp)localObject).wlw == null)
    {
      localObject = new byte[0];
      AppMethodBeat.o(78583);
    }
    while (true)
    {
      return localObject;
      try
      {
        localObject = aa.a(((adp)localObject).wlw);
        AppMethodBeat.o(78583);
      }
      catch (Exception localException)
      {
        byte[] arrayOfByte = new byte[0];
        AppMethodBeat.o(78583);
      }
    }
  }

  public final String getContent()
  {
    return ((adp)this.ehh.fsH.fsP).ncM;
  }

  public final String getTitle()
  {
    return ((adp)this.ehh.fsH.fsP).Title;
  }

  public final int getType()
  {
    return 233;
  }

  public final void lV(int paramInt)
  {
    ((ado)this.ehh.fsG.fsP).vGB = paramInt;
  }

  public final void tq(String paramString)
  {
    ((ado)this.ehh.fsG.fsP).wlx = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.h
 * JD-Core Version:    0.6.2
 */