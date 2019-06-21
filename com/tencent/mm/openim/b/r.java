package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bfz;
import com.tencent.mm.protocal.protobuf.bgf;
import com.tencent.mm.protocal.protobuf.bgy;
import com.tencent.mm.protocal.protobuf.bgz;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.protocal.protobuf.vy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class r extends com.tencent.mm.ai.m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public r()
  {
    AppMethodBeat.i(78884);
    b.a locala = new b.a();
    locala.fsJ = new bgy();
    locala.fsK = new bgz();
    locala.uri = "/cgi-bin/micromsg-bin/openimsync";
    locala.fsI = 810;
    this.ehh = locala.acD();
    ((bgy)this.ehh.fsG.fsP).fHJ = 2097152;
    ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "opim sync init:%d", new Object[] { Integer.valueOf(hashCode()) });
    AppMethodBeat.o(78884);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78885);
    g.RQ();
    byte[] arrayOfByte = bo.anf(bo.nullAsNil((String)g.RP().Ry().get(8195, null)));
    SKBuiltinBuffer_t localSKBuiltinBuffer_t = new SKBuiltinBuffer_t();
    localSKBuiltinBuffer_t.setBuffer(arrayOfByte);
    ((bgy)this.ehh.fsG.fsP).wKr = localSKBuiltinBuffer_t;
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78885);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78886);
    ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "netId :%d errType: %d, errCode: %d, errMsg:%s, hashcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(hashCode()) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78886);
    }
    while (true)
    {
      return;
      paramq = (bgy)this.ehh.fsG.fsP;
      paramString = (bgz)this.ehh.fsH.fsP;
      if ((paramString.wKs != null) && (paramString.wKs.jBw.size() > 0))
      {
        ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd, cmd size:%d", new Object[] { Integer.valueOf(paramString.wKs.jBw.size()) });
        paramArrayOfByte = paramString.wKs.jBw.iterator();
        while (paramArrayOfByte.hasNext())
        {
          Object localObject1 = (tb)paramArrayOfByte.next();
          Object localObject2;
          Object localObject3;
          if (((tb)localObject1).wat == 400)
          {
            localObject2 = new bgf();
            try
            {
              ((bgf)localObject2).parseFrom(((tb)localObject1).wau.getBufferToBytes());
              ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact %s", new Object[] { ((bgf)localObject2).geZ });
              localObject1 = s.a((bgf)localObject2);
              ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s", new Object[] { ((ap)localObject1).field_username, ((ap)localObject1).field_nickname, ((ap)localObject1).field_conRemark, Integer.valueOf(((ad)localObject1).getSource()), Integer.valueOf(((ap)localObject1).dtS), ((ap)localObject1).field_openImAppid, ((ap)localObject1).duw, Integer.valueOf(((ap)localObject1).duv), Integer.valueOf(((ap)localObject1).field_type), ((ap)localObject1).field_descWordingId });
              ((j)g.K(j.class)).XM().Y((ad)localObject1);
              if (((ad)localObject1).Oe())
                ((j)g.K(j.class)).XR().apf(((ap)localObject1).field_username);
              ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).aZ(((bgf)localObject2).app_id, ((bgf)localObject2).wKh);
              s.b((bgf)localObject2);
              g.RQ();
              localObject2 = ((j)g.K(j.class)).XN().RB(((ap)localObject1).field_username);
              if ((localObject2 == null) || (bo.isNullOrNil(((bv)localObject2).field_encryptUsername)))
                continue;
              localObject3 = ((bv)localObject2).field_conRemark;
              ((com.tencent.mm.openim.a.a)g.K(com.tencent.mm.openim.a.a.class)).ah(((ap)localObject1).field_username, (String)localObject3);
              g.RQ();
              ((j)g.K(j.class)).XN().RC(((ap)localObject1).field_username);
              ((ad)localObject1).iz(((bv)localObject2).field_conRemark);
              ((j)g.K(j.class)).XM().Y((ad)localObject1);
            }
            catch (IOException localIOException1)
            {
              ab.e("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact error:%s", new Object[] { localIOException1 });
            }
          }
          else if (localIOException1.wat == 402)
          {
            localObject2 = new vy();
            try
            {
              ((vy)localObject2).parseFrom(localIOException1.wau.getBufferToBytes());
              ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "processDelContact user:%s", new Object[] { ((vy)localObject2).geZ });
              ((j)g.K(j.class)).XR().aoX(((vy)localObject2).geZ);
              t.nb(((vy)localObject2).geZ);
            }
            catch (IOException localIOException2)
            {
              ab.e("MicroMsg.Openim.NetsceneOpenIMSync", "processDelContact error:%s", new Object[] { localIOException2 });
            }
          }
          else if (localIOException2.wat == 403)
          {
            try
            {
              localObject2 = new com/tencent/mm/protocal/protobuf/bfz;
              ((bfz)localObject2).<init>();
              ((bfz)localObject2).parseFrom(localIOException2.wau.getBufferToBytes());
              ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "processModChatroomContact %s", new Object[] { ((bfz)localObject2).gfa });
              com.tencent.mm.openim.room.a.a.b((bfz)localObject2);
            }
            catch (IOException localIOException3)
            {
              ab.e("MicroMsg.Openim.NetsceneOpenIMSync", "processModChatroomContact error:%s", new Object[] { localIOException3 });
            }
          }
          else if (localIOException3.wat == 404)
          {
            localObject2 = new bgf();
            try
            {
              ((bgf)localObject2).parseFrom(localIOException3.wau.getBufferToBytes());
              ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "processNeedGetContact %s", new Object[] { ((bgf)localObject2).geZ });
              localObject3 = g.RO().eJo;
              h localh = new com/tencent/mm/openim/b/h;
              localh.<init>(((bgf)localObject2).geZ, "", "");
              ((p)localObject3).a(localh, 0);
            }
            catch (IOException localIOException4)
            {
              ab.e("MicroMsg.Openim.NetsceneOpenIMSync", "processNeedGetContact error:%s", new Object[] { localIOException4 });
            }
          }
        }
      }
      paramArrayOfByte = paramString.wKr.getBuffer().toByteArray();
      g.RQ();
      paramArrayOfByte = aa.j(bo.anf(bo.nullAsNil((String)g.RP().Ry().get(8195, null))), paramArrayOfByte);
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
      {
        g.RQ();
        g.RP().Ry().set(8195, bo.cd(paramArrayOfByte));
      }
      paramInt1 = paramString.wKt;
      if ((paramq.fHJ & paramInt1) == 0)
      {
        ab.i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd end");
        this.ehi.onSceneEnd(0, 0, "", this);
        AppMethodBeat.o(78886);
      }
      else
      {
        a(this.ftf, this.ehi);
        AppMethodBeat.o(78886);
      }
    }
  }

  public final boolean acI()
  {
    return true;
  }

  public final int acn()
  {
    return 20;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 810;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.r
 * JD-Core Version:    0.6.2
 */