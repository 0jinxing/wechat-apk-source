package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.car;
import com.tencent.mm.protocal.protobuf.cas;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class n extends m
  implements k
{
  private static Vector<String> qIZ;
  private ArrayList<com.tencent.mm.plugin.sns.storage.n> ckx;
  final int cvp;
  private String desc;
  private boolean eTf;
  private com.tencent.mm.ai.b ehh;
  public f ehi;
  private boolean qIW;
  private long qIX;
  private long qIY;
  public int qJa;
  public int qJb;

  static
  {
    AppMethodBeat.i(36260);
    qIZ = new Vector();
    AppMethodBeat.o(36260);
  }

  public n(String paramString)
  {
    AppMethodBeat.i(36256);
    this.qIX = 0L;
    this.qIY = 0L;
    this.eTf = false;
    this.ckx = new ArrayList();
    this.qJa = 0;
    this.qJb = 0;
    this.desc = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new car();
    ((b.a)localObject).fsK = new cas();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsclassifytimeline";
    ((b.a)localObject).fsI = 601;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.qIX = 0L;
    if (0L == 0L);
    for (boolean bool = true; ; bool = false)
    {
      this.qIW = bool;
      this.cvp = 2;
      localObject = (car)this.ehh.fsG.fsP;
      ((car)localObject).wZT = "";
      ((car)localObject).wZU = 0L;
      ((car)localObject).wZV = paramString;
      ((car)localObject).wZW = 1;
      ab.d("MicroMsg.NetSceneSnsClassifyTimeLine", "maxid %s classifyid %s classifyType %d", new Object[] { i.jV(0L), paramString, Integer.valueOf(0) });
      AppMethodBeat.o(36256);
      return;
    }
  }

  public static boolean XO(String paramString)
  {
    try
    {
      AppMethodBeat.i(36254);
      boolean bool;
      if (qIZ.contains(paramString))
      {
        bool = false;
        AppMethodBeat.o(36254);
      }
      while (true)
      {
        return bool;
        qIZ.add(paramString);
        bool = true;
        AppMethodBeat.o(36254);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static boolean XP(String paramString)
  {
    try
    {
      AppMethodBeat.i(36255);
      qIZ.remove(paramString);
      AppMethodBeat.o(36255);
      return true;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  private com.tencent.mm.plugin.sns.storage.n b(cbf paramcbf)
  {
    AppMethodBeat.i(36257);
    com.tencent.mm.plugin.sns.storage.n localn = new com.tencent.mm.plugin.sns.storage.n();
    Object localObject = new String(paramcbf.xam.getBuffer().toByteArray());
    ab.d("MicroMsg.NetSceneSnsClassifyTimeLine", "from server %d ", new Object[] { Long.valueOf(paramcbf.vQE) });
    if (!localn.YR((String)localObject))
    {
      paramcbf = null;
      AppMethodBeat.o(36257);
    }
    while (true)
    {
      return paramcbf;
      paramcbf.xam.setBuffer(new byte[0]);
      localn.field_userName = paramcbf.vHl;
      localn.ls(paramcbf.pcX);
      localn.field_likeFlag = paramcbf.xan;
      localn.kz(paramcbf.vQE);
      localn.kB(paramcbf.vQE);
      localn.DF(this.cvp);
      try
      {
        localn.bi(paramcbf.toByteArray());
        localObject = localn.cqu();
        ((TimeLineObject)localObject).jBB = paramcbf.vHl;
        localn.field_pravited = ((TimeLineObject)localObject).wEJ;
        ab.d("MicroMsg.NetSceneSnsClassifyTimeLine", "ext flag " + paramcbf.wGz);
        localn.cqR();
        localn.c((TimeLineObject)localObject);
        localn.field_type = ((TimeLineObject)localObject).xfI.wbJ;
        localn.field_subType = ((TimeLineObject)localObject).xfI.wbL;
        AppMethodBeat.o(36257);
        paramcbf = localn;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneSnsClassifyTimeLine", localException, "", new Object[0]);
      }
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(36259);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36259);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36258);
    ab.d("MicroMsg.NetSceneSnsClassifyTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (cas)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramq.ZS().vyl != 207) && (paramq.ZS().vyl != 0) && (paramq.ZS().vyl != 212))
    {
      XP("@__classify_timeline");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36258);
    }
    while (true)
    {
      return;
      if (paramq.ZS().vyl == 212);
      for (boolean bool = true; ; bool = false)
      {
        this.eTf = bool;
        this.qJa = paramArrayOfByte.wZX;
        this.desc = paramArrayOfByte.vEA;
        i.jW(this.qIX);
        ab.d("MicroMsg.NetSceneSnsClassifyTimeLine", "resp objCount %d desc %s", new Object[] { Integer.valueOf(paramArrayOfByte.wGG), this.desc });
        paramq = paramArrayOfByte.vKB.iterator();
        while (paramq.hasNext())
        {
          paramArrayOfByte = b((cbf)paramq.next());
          if (paramArrayOfByte != null)
            this.ckx.add(paramArrayOfByte);
        }
      }
      XP("@__classify_timeline");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36258);
    }
  }

  public final int getType()
  {
    return 601;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.n
 * JD-Core Version:    0.6.2
 */