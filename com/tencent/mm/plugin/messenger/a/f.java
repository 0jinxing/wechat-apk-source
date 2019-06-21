package com.tencent.mm.plugin.messenger.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buu;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.g;
import java.util.Iterator;
import java.util.LinkedList;

public final class f extends m
  implements k
{
  public final b ehh;
  private com.tencent.mm.ai.f ehi;
  public final boolean opS;

  public f(String paramString)
  {
    this(paramString, 0);
  }

  public f(String paramString, int paramInt)
  {
    this(paramString, paramInt, (byte)0);
  }

  private f(String paramString, int paramInt, byte paramByte)
  {
    this(paramString, 1, paramInt, false);
  }

  public f(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(111114);
    this.opS = paramBoolean;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new buu();
    ((b.a)localObject).fsK = new buv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/searchcontact";
    ((b.a)localObject).fsI = 106;
    ((b.a)localObject).fsL = 34;
    ((b.a)localObject).fsM = 1000000034;
    this.ehh = ((b.a)localObject).acD();
    ab.d("MicroMsg.NetSceneSearchContact", "search username [%s]", new Object[] { paramString });
    localObject = (buu)this.ehh.fsG.fsP;
    ((buu)localObject).wcB = new bts().alV(paramString);
    ((buu)localObject).wOo = paramInt1;
    ((buu)localObject).wWi = paramInt2;
    AppMethodBeat.o(111114);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(111115);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(111115);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111116);
    paramq = (buv)this.ehh.fsH.fsP;
    Iterator localIterator;
    if ((paramq != null) && (paramq.wod > 0))
      localIterator = paramq.woe.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (but)localIterator.next();
      ab.d("MicroMsg.NetSceneSearchContact", "search RES username [%s]", new Object[] { ((but)localObject).wcB });
      paramArrayOfByte = new h();
      paramArrayOfByte.username = aa.a(((but)localObject).wcB);
      paramArrayOfByte.frW = ((but)localObject).vXm;
      paramArrayOfByte.frV = ((but)localObject).vXn;
      paramArrayOfByte.bJt = -1;
      ab.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { paramArrayOfByte.getUsername(), paramArrayOfByte.ack(), paramArrayOfByte.acl() });
      paramArrayOfByte.dtR = 3;
      paramArrayOfByte.cB(true);
      o.act().b(paramArrayOfByte);
      continue;
      if ((paramq != null) && (!bo.isNullOrNil(aa.a(paramq.wcB))))
      {
        localObject = aa.a(paramq.wcB);
        paramArrayOfByte = new h();
        paramArrayOfByte.username = ((String)localObject);
        paramArrayOfByte.frW = paramq.vXm;
        paramArrayOfByte.frV = paramq.vXn;
        paramArrayOfByte.bJt = -1;
        ab.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { paramArrayOfByte.getUsername(), paramArrayOfByte.ack(), paramArrayOfByte.acl() });
        paramArrayOfByte.dtR = 3;
        paramArrayOfByte.cB(true);
        o.act().b(paramArrayOfByte);
      }
    }
    if (paramq != null)
    {
      localObject = paramq.wWn.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramArrayOfByte = (bvk)((Iterator)localObject).next();
        paramq = new h();
        paramq.username = paramArrayOfByte.jBB;
        paramq.frW = paramArrayOfByte.vXm;
        paramq.frV = paramArrayOfByte.vXn;
        paramq.bJt = -1;
        ab.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { paramq.getUsername(), paramq.ack(), paramq.acl() });
        paramq.dtR = 3;
        paramq.cB(true);
        o.act().b(paramq);
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(111116);
  }

  public final buv bOj()
  {
    AppMethodBeat.i(111117);
    buv localbuv = (buv)this.ehh.fsH.fsP;
    if (localbuv != null)
    {
      Iterator localIterator = localbuv.woe.iterator();
      while (localIterator.hasNext())
      {
        but localbut = (but)localIterator.next();
        a.ask().Yn().ia(localbut.wcB.wVI, localbut.wlF);
      }
    }
    AppMethodBeat.o(111117);
    return localbuv;
  }

  public final int getType()
  {
    return 106;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.a.f
 * JD-Core Version:    0.6.2
 */