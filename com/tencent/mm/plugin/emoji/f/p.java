package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.amk;
import com.tencent.mm.protocal.protobuf.aml;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private int gOW;
  public byte[] kWS;
  private int kXd;

  public p(int paramInt, byte[] paramArrayOfByte)
  {
    this(paramInt, paramArrayOfByte, (byte)0);
  }

  private p(int paramInt, byte[] paramArrayOfByte, byte paramByte)
  {
    AppMethodBeat.i(53143);
    this.kWS = null;
    b.a locala = new b.a();
    locala.fsJ = new amk();
    locala.fsK = new aml();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetpersonaldesigner";
    locala.fsI = 720;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kXd = paramInt;
    this.kWS = paramArrayOfByte;
    this.gOW = 0;
    AppMethodBeat.o(53143);
  }

  public static com.tencent.mm.plugin.emoji.model.f a(aml paramaml)
  {
    AppMethodBeat.i(53146);
    ab.d("MicroMsg.emoji.NetSceneGetPersonalDesigner", "getEmotionListModel");
    if (paramaml == null)
    {
      paramaml = null;
      AppMethodBeat.o(53146);
    }
    while (true)
    {
      return paramaml;
      com.tencent.mm.plugin.emoji.model.f localf = new com.tencent.mm.plugin.emoji.model.f();
      if ((paramaml != null) && (paramaml.EmotionList != null))
      {
        localf.kVp = paramaml.EmotionList.size();
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramaml.EmotionList.iterator();
        while (localIterator.hasNext())
        {
          paramaml = (EmotionSummary)localIterator.next();
          if (paramaml.ProductID != null)
            localArrayList.add(new com.tencent.mm.plugin.emoji.a.a.f(paramaml));
        }
        localf.kVq = localArrayList;
      }
      AppMethodBeat.o(53146);
      paramaml = localf;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(53145);
    this.ehi = paramf;
    paramf = (amk)this.ehh.fsG.fsP;
    paramf.DesignerUin = this.kXd;
    if (this.kWS != null)
    {
      paramf.ReqBuf = aa.ad(this.kWS);
      paramf.Scene = this.gOW;
      if (paramf.ReqBuf != null)
        break label106;
    }
    label106: for (paramf = "Buf is NULL"; ; paramf = paramf.ReqBuf.toString())
    {
      ab.d("MicroMsg.emoji.NetSceneGetPersonalDesigner", paramf);
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(53145);
      return i;
      paramf.ReqBuf = new SKBuiltinBuffer_t();
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53144);
    ab.i("MicroMsg.emoji.NetSceneGetPersonalDesigner", "NetSceneGetPersonalDesigner errType:%d,errcode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (aml)((b)paramq).fsH.fsP;
    if (paramq.ReqBuf != null)
      this.kWS = aa.a(paramq.ReqBuf);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(53144);
  }

  public final int acn()
  {
    return 100;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final aml bkE()
  {
    if (this.ehh == null);
    for (aml localaml = null; ; localaml = (aml)this.ehh.fsH.fsP)
      return localaml;
  }

  public final int getType()
  {
    return 720;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.p
 * JD-Core Version:    0.6.2
 */