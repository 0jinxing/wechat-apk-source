package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aba;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.ig;
import com.tencent.mm.protocal.protobuf.ih;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ah extends m
  implements k
{
  private static AtomicInteger mgd;
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private LinkedList<Integer> mfZ;
  private int mga;
  private boolean mgb;
  private boolean mgc;

  static
  {
    AppMethodBeat.i(102730);
    mgd = new AtomicInteger(0);
    AppMethodBeat.o(102730);
  }

  public ah(LinkedList<Integer> paramLinkedList)
  {
    AppMethodBeat.i(102723);
    this.ehi = null;
    this.mgb = false;
    this.mgc = false;
    this.mga = 0;
    b.a locala = new b.a();
    locala.fsJ = new ig();
    locala.fsK = new ih();
    locala.uri = "/cgi-bin/micromsg-bin/batchgetfavitem";
    locala.fsI = 402;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.mfZ = paramLinkedList;
    mgd.incrementAndGet();
    AppMethodBeat.o(102723);
  }

  private boolean bvc()
  {
    boolean bool1 = true;
    AppMethodBeat.i(102728);
    boolean bool3;
    if (bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(8217, null)) == 0)
    {
      bool2 = true;
      if ((this.mfZ == null) || (this.mga >= this.mfZ.size()))
        break label101;
      bool3 = true;
      label54: ab.i("MicroMsg.NetSceneBatchgetFav", "check needContinue, notInit %B indexOK %B", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if ((bool2) || (!bool3))
        break label106;
      AppMethodBeat.o(102728);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label101: bool3 = false;
      break label54;
      label106: AppMethodBeat.o(102728);
    }
  }

  public static void bvd()
  {
    AppMethodBeat.i(102724);
    mgd.set(0);
    AppMethodBeat.o(102724);
  }

  public static void bve()
  {
    AppMethodBeat.i(102725);
    mgd.decrementAndGet();
    AppMethodBeat.o(102725);
  }

  public static int bvf()
  {
    AppMethodBeat.i(102726);
    int i = mgd.get();
    AppMethodBeat.o(102726);
    return i;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(102727);
    ab.i("MicroMsg.NetSceneBatchgetFav", "ashutest::doscene count:%d", new Object[] { Integer.valueOf(mgd.get()) });
    int i;
    if ((this.mfZ == null) || (this.mfZ.isEmpty()) || (this.mga >= this.mfZ.size()))
    {
      ab.e("MicroMsg.NetSceneBatchgetFav", "klem doScene, idlist null, begIndex %d", new Object[] { Integer.valueOf(this.mga) });
      AppMethodBeat.o(102727);
      i = -1;
    }
    while (true)
    {
      return i;
      ab.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.mfZ.size()), Integer.valueOf(this.mga), this.mfZ });
      if (bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(8217, null)) == 0)
      {
        ab.w("MicroMsg.NetSceneBatchgetFav", "klem doScene, init not done, do not batchget");
        AppMethodBeat.o(102727);
        i = -1;
      }
      else
      {
        ig localig = (ig)this.ehh.fsG.fsP;
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.addAll(this.mfZ.subList(this.mga, Math.min(this.mga + 15, this.mfZ.size())));
        localig.vKh = localLinkedList;
        localig.jBv = localLinkedList.size();
        this.mga += 15;
        ab.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList });
        this.ehi = paramf;
        i = a(parame, this.ehh, this);
        AppMethodBeat.o(102727);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102729);
    ab.i("MicroMsg.NetSceneBatchgetFav", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.mga), Integer.valueOf(this.mfZ.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
      if (bvc())
      {
        a(this.ftf, this.ehi);
        AppMethodBeat.o(102729);
      }
    while (true)
    {
      return;
      mgd.decrementAndGet();
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(102729);
      continue;
      ih localih = (ih)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      int i = localih.jBv;
      int j = localih.vKB.size();
      if (i != j)
      {
        if (this.mga > this.mfZ.size());
        for (paramInt1 = this.mfZ.size() % 15; ; paramInt1 = 15)
        {
          ab.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet resp list size:%d, return count %d, request count %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt1) });
          if (!bvc())
            break label262;
          a(this.ftf, this.ehi);
          AppMethodBeat.o(102729);
          break;
        }
        label262: mgd.decrementAndGet();
        this.ehi.onSceneEnd(paramInt2, -1, paramString, this);
        AppMethodBeat.o(102729);
      }
      else
      {
        paramInt1 = 0;
        while (paramInt1 < j)
        {
          aba localaba = (aba)localih.vKB.get(paramInt1);
          ab.i("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d, status:%d", new Object[] { Integer.valueOf(localaba.vEp), Integer.valueOf(localaba.jBT) });
          if (localaba.jBT == 0)
          {
            paramArrayOfByte = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(localaba.vEp);
            if (paramArrayOfByte == null)
            {
              ab.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d not exist!", new Object[] { Integer.valueOf(localaba.vEp) });
              paramInt1++;
            }
            else
            {
              paramArrayOfByte.field_xml = localaba.vEv;
              paramArrayOfByte.LH(localaba.vEv);
              paramArrayOfByte.field_flag = localaba.vEq;
              paramArrayOfByte.field_localSeq = localaba.vEs;
              paramArrayOfByte.field_updateTime = (localaba.vEr * 1000L + paramInt1);
              ab.i("MicroMsg.NetSceneBatchgetFav", "huahuahailang:item field_xml batgch get :\n %s", new Object[] { paramArrayOfByte.field_xml });
              i = paramArrayOfByte.field_favProto.wiv.size();
              if (i == 0)
              {
                ab.v("MicroMsg.NetSceneBatchgetFav", "this item has no data, favId:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id) });
                ab.i("MicroMsg.NetSceneBatchgetFav", "data dealed needUpload:%b  needDownload:%b", new Object[] { Boolean.valueOf(this.mgc), Boolean.valueOf(this.mgb) });
                if (!this.mgc)
                  break label1125;
                paramArrayOfByte.field_itemStatus = 15;
                ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramArrayOfByte, new String[] { "localId" });
                ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
              }
            }
          }
          else
          {
            while (true)
            {
              b.j(paramArrayOfByte);
              paramArrayOfByte.LI("MicroMsg.NetSceneBatchgetFav");
              if ((localaba.vEq & 0x1) == 0)
                break;
              ab.d("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favId: %d status not exist, delete local item", new Object[] { Integer.valueOf(localaba.vEp) });
              b.i(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(localaba.vEp));
              break;
              LinkedList localLinkedList = paramArrayOfByte.field_favProto.wiv;
              i--;
              label723: if (i >= 0)
              {
                paramq = (aar)localLinkedList.get(i);
                if (!bo.isNullOrNil(paramq.wgq))
                {
                  com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(b.b(paramq));
                  ab.i("MicroMsg.NetSceneBatchgetFav", "dataFIle: %s", new Object[] { localb.getName() });
                  if (localb.exists())
                    break label968;
                  if ((!bo.isNullOrNil(paramq.wgb)) && (!bo.isNullOrNil(paramq.wfZ)))
                    break label920;
                  ab.e("MicroMsg.NetSceneBatchgetFav", "data key or url null. favId:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id) });
                }
                if (!bo.isNullOrNil(paramq.wgB))
                {
                  if (new com.tencent.mm.vfs.b(b.c(paramq)).exists())
                    break label1091;
                  if ((!bo.isNullOrNil(paramq.wfV)) && (!bo.isNullOrNil(paramq.fgE)))
                    break label1044;
                  ab.w("MicroMsg.NetSceneBatchgetFav", "thumb key or url null. favId:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id) });
                }
              }
              while (true)
              {
                label840: i--;
                break label723;
                break;
                label920: ab.d("MicroMsg.NetSceneBatchgetFav", "local data not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id), Integer.valueOf(i) });
                b.a(paramq, paramArrayOfByte, 1, false);
                this.mgb = true;
                break label840;
                label968: if (paramq.wgP != 0)
                {
                  ab.v("MicroMsg.NetSceneBatchgetFav", "server upload data failed, client upload, md5%s", new Object[] { paramq.wgq });
                  this.mgc = true;
                  b.a(paramq, paramArrayOfByte, 0, false);
                }
                ab.d("MicroMsg.NetSceneBatchgetFav", "data exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id), Integer.valueOf(i) });
                break label840;
                label1044: ab.d("MicroMsg.NetSceneBatchgetFav", "local thumb not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id), Integer.valueOf(i) });
                b.a(paramq, paramArrayOfByte, 1);
                this.mgb = true;
                continue;
                label1091: ab.d("MicroMsg.NetSceneBatchgetFav", "thumb exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id), Integer.valueOf(i) });
              }
              label1125: if (this.mgb)
              {
                paramArrayOfByte.field_itemStatus = 10;
                ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramArrayOfByte, new String[] { "localId" });
              }
              else
              {
                paramArrayOfByte.field_itemStatus = 10;
                ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramArrayOfByte, new String[] { "localId" });
              }
            }
          }
        }
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
        if (bvc())
        {
          a(this.ftf, this.ehi);
          AppMethodBeat.o(102729);
        }
        else
        {
          mgd.decrementAndGet();
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(102729);
        }
      }
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
    return 402;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.ah
 * JD-Core Version:    0.6.2
 */