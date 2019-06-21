package com.tencent.mm.plugin.story.model.a;

import a.f.b.j;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cem;
import com.tencent.mm.protocal.protobuf.cen;
import com.tencent.mm.protocal.protobuf.ceo;
import com.tencent.mm.protocal.protobuf.cep;
import com.tencent.mm.protocal.protobuf.ces;
import com.tencent.mm.protocal.protobuf.cet;
import com.tencent.mm.protocal.protobuf.ceu;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryObjectOp;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "opList", "", "Lcom/tencent/mm/plugin/story/model/cgi/BaseStoryOpItem;", "localId", "", "(Ljava/util/List;I)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "getCallback", "()Lcom/tencent/mm/modelbase/IOnSceneEnd;", "setCallback", "(Lcom/tencent/mm/modelbase/IOnSceneEnd;)V", "getLocalId", "()I", "getOpList", "()Ljava/util/List;", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "doScene", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getOp", "getType", "onGYNetEnd", "", "netId", "errType", "errCode", "errMsg", "", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-story_release"})
public final class g extends com.tencent.mm.ai.m
  implements com.tencent.mm.network.k
{
  private static final String TAG = "MicroMsg.StoryCgi.NetSceneStoryObjectOp";
  public static final g.a rUT;
  public final int cNE;
  private final b ehh;
  public f ehi;
  private final List<a> rUS;

  static
  {
    AppMethodBeat.i(109234);
    rUT = new g.a((byte)0);
    TAG = "MicroMsg.StoryCgi.NetSceneStoryObjectOp";
    AppMethodBeat.o(109234);
  }

  public g(List<? extends a> paramList, int paramInt)
  {
    AppMethodBeat.i(109233);
    this.rUS = paramList;
    this.cNE = paramInt;
    paramList = new b.a();
    paramList.a((com.tencent.mm.bt.a)new cet());
    paramList.b((com.tencent.mm.bt.a)new ceu());
    paramList.qq("/cgi-bin/micromsg-bin/mmstoryobjectop");
    paramList.kU(764);
    paramList.kV(0);
    paramList.kW(0);
    paramList = paramList.acD();
    j.o(paramList, "builder.buildInstance()");
    this.ehh = paramList;
    paramList = this.ehh.acz();
    if (paramList == null)
    {
      paramList = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpRequest");
      AppMethodBeat.o(109233);
      throw paramList;
    }
    cet localcet = (cet)paramList;
    localcet.xaL = this.rUS.size();
    Iterator localIterator = this.rUS.iterator();
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      paramList = new ces();
      paramList.xdq = locala.rUJ;
      paramList.nbk = locala.type;
      ab.i(TAG, "op.id:" + locala.rUJ + " op.type:" + locala.type);
      Object localObject;
      if ((locala instanceof m))
      {
        localObject = new ceo();
        ((ceo)localObject).xdq = locala.rUJ;
        paramList.xet = new SKBuiltinBuffer_t().setBuffer(((ceo)localObject).toByteArray());
      }
      while (true)
      {
        localcet.xaM.add(paramList);
        break;
        if ((locala instanceof k))
        {
          localObject = new cem();
          ((cem)localObject).wZG = ((k)locala).rVd;
          paramList.xet = new SKBuiltinBuffer_t().setBuffer(((cem)localObject).toByteArray());
        }
        else if ((locala instanceof n))
        {
          localObject = new cep();
          ((cep)localObject).xel = ((n)locala).rVf;
          ((cep)localObject).xdq = locala.rUJ;
          paramList.xet = new SKBuiltinBuffer_t().setBuffer(((cep)localObject).toByteArray());
        }
        else if ((locala instanceof l))
        {
          localObject = new cen();
          ((cen)localObject).xek = ((l)locala).rVe;
          ((cen)localObject).xdq = locala.rUJ;
          paramList.xet = new SKBuiltinBuffer_t().setBuffer(((cen)localObject).toByteArray());
        }
      }
    }
    AppMethodBeat.o(109233);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(109230);
    j.p(parame, "dispatcher");
    j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (com.tencent.mm.network.k)this);
    AppMethodBeat.o(109230);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109231);
    ab.i(TAG, "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = this.ehh.acA();
    if (paramq == null)
    {
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryOpResponse");
      AppMethodBeat.o(109231);
      throw paramString;
    }
    paramInt1 = ((ceu)paramq).xeu;
    ab.i(TAG, "respCount=".concat(String.valueOf(paramInt1)));
    paramq = this.ehi;
    if (paramq == null)
      j.avw("callback");
    paramq.onSceneEnd(paramInt2, paramInt3, paramString, (com.tencent.mm.ai.m)this);
    AppMethodBeat.o(109231);
  }

  public final a cyX()
  {
    AppMethodBeat.i(109232);
    int i;
    a locala;
    if (this.rUS != null)
      if (!((Collection)this.rUS).isEmpty())
      {
        i = 1;
        if (i == 0)
          break label61;
        locala = (a)this.rUS.get(0);
        AppMethodBeat.o(109232);
      }
    while (true)
    {
      return locala;
      i = 0;
      break;
      label61: locala = null;
      AppMethodBeat.o(109232);
    }
  }

  public final int getType()
  {
    return 764;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.g
 * JD-Core Version:    0.6.2
 */