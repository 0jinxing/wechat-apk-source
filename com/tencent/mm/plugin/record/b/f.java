package com.tencent.mm.plugin.record.b;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.cig;
import com.tencent.mm.protocal.protobuf.iv;
import com.tencent.mm.protocal.protobuf.iw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class f extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private int mga;
  private int mge;
  String pJt;
  j pJu;
  private SparseArray<aar> pJv;
  private SparseBooleanArray pJw;

  public f(j paramj)
  {
    AppMethodBeat.i(135662);
    this.ehi = null;
    this.pJt = "";
    this.pJu = null;
    this.pJv = new SparseArray();
    this.pJw = new SparseBooleanArray();
    this.mge = 0;
    this.mga = 0;
    b.a locala = new b.a();
    locala.fsJ = new iv();
    locala.fsK = new iw();
    locala.uri = "/cgi-bin/micromsg-bin/batchtranscdnitem";
    locala.fsI = 632;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.pJu = paramj;
    AppMethodBeat.o(135662);
  }

  private void ceE()
  {
    AppMethodBeat.i(135663);
    this.pJt = j.b.a(n.a(this.pJu.field_title, this.pJu.field_desc, this.pJu.field_dataProto), null, null);
    AppMethodBeat.o(135663);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(135665);
    this.ehi = paramf;
    iv localiv = (iv)this.ehh.fsG.fsP;
    this.pJv.clear();
    this.pJw.clear();
    if (this.pJu.field_dataProto.wiv.size() == 0)
    {
      ab.e("MicroMsg.NetSceneTransCDN", "doScene data list null");
      this.mge = -100;
      i = -100;
      AppMethodBeat.o(135665);
      return i;
    }
    paramf = new LinkedList();
    int i = this.mga;
    label93: aar localaar;
    if (i < this.pJu.field_dataProto.wiv.size())
    {
      localaar = (aar)this.pJu.field_dataProto.wiv.get(i);
      if ((!localaar.wgr) || (!bo.isNullOrNil(localaar.wfZ)));
    }
    for (int j = 0; ; j = 1)
    {
      this.mga = (i + 1);
      localiv.jBv = paramf.size();
      localiv.jBw.clear();
      localiv.jBw.addAll(paramf);
      ab.i("MicroMsg.NetSceneTransCDN", "ashutest::data list size %d, need check size %d, nextIndex %d", new Object[] { Integer.valueOf(this.pJu.field_dataProto.wiv.size()), Integer.valueOf(this.pJv.size()), Integer.valueOf(this.mga) });
      if ((localiv.jBv <= 0) || (j == 0))
      {
        ceE();
        ab.w("MicroMsg.NetSceneTransCDN", "doScene no more data");
        this.mge = -100;
        i = -100;
        AppMethodBeat.o(135665);
        break;
        cig localcig;
        if (!bo.isNullOrNil(localaar.wfZ))
        {
          localcig = new cig();
          localcig.vRA = localaar.wfZ;
          localcig.AesKey = localaar.wgb;
          localcig.xho = localaar.dataType;
          localcig.xhp = ((int)localaar.wgu);
          localcig.xhn = bo.bc(localaar.mnd, "").hashCode();
          ab.d("MicroMsg.NetSceneTransCDN", "add cdnitem, clientID[%d] dataID[%s] datatype[%d] dataurl[%s] size[%d]", new Object[] { Integer.valueOf(localcig.xhn), localaar.mnd, Integer.valueOf(localcig.xho), localaar.wfZ, Long.valueOf(localaar.wgu) });
          paramf.add(localcig);
          this.pJv.put(localcig.xhn, localaar);
          this.pJw.put(localcig.xhn, false);
        }
        if (!bo.isNullOrNil(localaar.fgE))
        {
          localcig = new cig();
          localcig.vRA = localaar.fgE;
          localcig.AesKey = localaar.wfV;
          localcig.xho = 2;
          localcig.xhp = ((int)localaar.wgF);
          localcig.xhn = (bo.bc(localaar.mnd, "") + "@thumb").hashCode();
          ab.d("MicroMsg.NetSceneTransCDN", "add cdnitem, clientID[%d] thumbID[%s_t] datatype[%d] thumburl[%s] size[%d]", new Object[] { Integer.valueOf(localcig.xhn), localaar.mnd, Integer.valueOf(localcig.xho), localaar.fgE, Long.valueOf(localaar.wgF) });
          paramf.add(localcig);
          this.pJv.put(localcig.xhn, localaar);
          this.pJw.put(localcig.xhn, true);
        }
        if (paramf.size() >= 20)
          continue;
        i++;
        break label93;
      }
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(135665);
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135664);
    ab.i("MicroMsg.NetSceneTransCDN", "netId %d errType %d errCode %d localErrCode %d begIndex %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.mge), Integer.valueOf(this.mga), paramString });
    if ((paramInt2 == 3) && (this.mge == -100))
    {
      ceE();
      this.ehi.onSceneEnd(0, 0, paramString, this);
      AppMethodBeat.o(135664);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 0) && (paramInt3 == 0))
        break;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(135664);
    }
    paramq = ((iw)((b)paramq).fsH.fsP).jBw.iterator();
    while (paramq.hasNext())
    {
      paramArrayOfByte = (cig)paramq.next();
      aar localaar = (aar)this.pJv.get(paramArrayOfByte.xhn);
      if (localaar != null)
        if (this.pJw.get(paramArrayOfByte.xhn))
        {
          ab.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[true], old thumb url[%s], new thumb url[%s], old size[%d], new size[%d]", new Object[] { Integer.valueOf(paramArrayOfByte.xhn), localaar.mnd, localaar.fgE, paramArrayOfByte.vRA, Long.valueOf(localaar.wgF), Long.valueOf(paramArrayOfByte.xhp) });
          localaar.akJ(paramArrayOfByte.vRA);
          localaar.akK(paramArrayOfByte.AesKey);
          if ((!bo.isNullOrNil(paramArrayOfByte.vRA)) && (!bo.isNullOrNil(paramArrayOfByte.AesKey)) && (paramArrayOfByte.xhp > 0L))
          {
            localaar.mg(paramArrayOfByte.xhp);
          }
          else
          {
            ab.w("MicroMsg.NetSceneTransCDN", "match error server return");
            paramInt2 = 3;
          }
        }
        else
        {
          ab.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[false], old url[%s], new url[%s], old size[%d], new size[%d]", new Object[] { Integer.valueOf(paramArrayOfByte.xhn), localaar.mnd, localaar.wfZ, paramArrayOfByte.vRA, Long.valueOf(localaar.wgu), Long.valueOf(paramArrayOfByte.xhp) });
          localaar.akL(paramArrayOfByte.vRA);
          localaar.akM(paramArrayOfByte.AesKey);
          if ((!bo.isNullOrNil(paramArrayOfByte.vRA)) && (!bo.isNullOrNil(paramArrayOfByte.AesKey)) && (paramArrayOfByte.xhp > 0L))
          {
            localaar.mf(paramArrayOfByte.xhp);
          }
          else
          {
            ab.w("MicroMsg.NetSceneTransCDN", "match error server return");
            paramInt2 = 3;
          }
        }
    }
    boolean bool;
    if (this.mga < this.pJu.field_dataProto.wiv.size())
    {
      bool = true;
      label541: ab.i("MicroMsg.NetSceneTransCDN", "check need continue, indexOK %B", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        break label635;
      if (a(this.ftf, this.ehi) != -100)
        break label630;
      paramInt1 = 1;
    }
    while (true)
    {
      if (paramInt1 != 0)
      {
        ab.i("MicroMsg.NetSceneTransCDN", "do callback");
        ceE();
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      }
      AppMethodBeat.o(135664);
      break;
      bool = false;
      break label541;
      label630: paramInt1 = 0;
      continue;
      label635: paramInt1 = 1;
    }
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 632;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.f
 * JD-Core Version:    0.6.2
 */