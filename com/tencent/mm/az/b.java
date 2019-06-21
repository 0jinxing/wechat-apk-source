package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b extends m
  implements k
{
  private f ehi;
  public b.a fLr;
  public final List<j.b> fLs;

  public b(List<j.b> paramList)
  {
    AppMethodBeat.i(59991);
    this.fLs = new ArrayList();
    this.fLs.addAll(paramList);
    this.fLr = new b.a();
    ((b.b)this.fLr.acF()).fLv.wIw = ad(paramList);
    AppMethodBeat.o(59991);
  }

  private static tc ad(List<j.b> paramList)
  {
    AppMethodBeat.i(59992);
    tc localtc = new tc();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      j.b localb = (j.b)localIterator.next();
      byte[] arrayOfByte = localb.getBuffer();
      tb localtb = new tb();
      localtb.wat = localb.getCmdId();
      localtb.wau = new SKBuiltinBuffer_t().setBuffer(arrayOfByte);
      localtc.jBw.add(localtb);
    }
    localtc.jBv = paramList.size();
    ab.d("MicroMsg.NetSceneOplog", "summeroplog oplogs size=" + paramList.size());
    AppMethodBeat.o(59992);
    return localtc;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(59993);
    this.ehi = paramf;
    int i = a(parame, this.fLr, this);
    AppMethodBeat.o(59993);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59994);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(59994);
  }

  public final int acn()
  {
    return 5;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 681;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.b
 * JD-Core Version:    0.6.2
 */