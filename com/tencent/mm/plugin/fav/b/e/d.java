package com.tencent.mm.plugin.fav.b.e;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.aj;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.a.z;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.bca;
import com.tencent.mm.protocal.protobuf.bcd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class d
  implements f, z
{
  private static Map<Integer, g.a> cqS;
  private static Map<Integer, Integer> mhg;
  private Queue<com.tencent.mm.plugin.fav.a.g> cqQ;
  private boolean cqU;
  public int cqV;
  private long cqW;
  public ap cra;
  private boolean running;

  static
  {
    AppMethodBeat.i(5387);
    cqS = new HashMap();
    mhg = new HashMap();
    AppMethodBeat.o(5387);
  }

  public d()
  {
    AppMethodBeat.i(5378);
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.cqU = false;
    this.cqQ = new LinkedList();
    this.cra = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new d.3(this), false);
    com.tencent.mm.kernel.g.Rg().a(426, this);
    AppMethodBeat.o(5378);
  }

  private static void a(long paramLong, LinkedList<bca> paramLinkedList, LinkedList<bcd> paramLinkedList1)
  {
    AppMethodBeat.i(5383);
    Object localObject1 = new bca();
    ((bca)localObject1).wGC = 4;
    ((bca)localObject1).wGD = 0;
    paramLinkedList.add(localObject1);
    paramLinkedList = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iA(paramLong);
    ab.i("MicroMsg.Fav.FavModService", "setModAfterClientUpload %d modcdnlistsize %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramLinkedList.size()) });
    localObject1 = paramLinkedList.iterator();
    label469: 
    while (((Iterator)localObject1).hasNext())
    {
      paramLinkedList = (c)((Iterator)localObject1).next();
      boolean bool = b.LB(paramLinkedList.field_dataId);
      if ((bo.isNullOrNil(paramLinkedList.field_cdnUrl)) || (bool))
      {
        ab.e("MicroMsg.Fav.FavModService", "setModAfterClientUpload cdnUrl:%s, isThumb:%b,  favLocalId:%d", new Object[] { paramLinkedList.field_cdnUrl, Boolean.valueOf(bool), Long.valueOf(paramLong) });
      }
      else
      {
        Object localObject2 = new bcd();
        ((bcd)localObject2).ncF = ("dataitem." + paramLinkedList.field_dataId + ".cdn_dataurl");
        ((bcd)localObject2).pXM = paramLinkedList.field_cdnUrl;
        paramLinkedList1.add(localObject2);
        localObject2 = new bcd();
        ((bcd)localObject2).ncF = ("dataitem." + paramLinkedList.field_dataId + ".cdn_datakey");
        ((bcd)localObject2).pXM = paramLinkedList.field_cdnKey;
        paramLinkedList1.add(localObject2);
        localObject2 = new bcd();
        ((bcd)localObject2).ncF = ("dataitem." + paramLinkedList.field_dataId);
        ((bcd)localObject2).wGI = "datastatus";
        ((bcd)localObject2).pXM = "0";
        paramLinkedList1.add(localObject2);
        localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLinkedList.field_favLocalId);
        if (localObject2 != null)
        {
          if (((com.tencent.mm.plugin.fav.a.g)localObject2).field_type == 4);
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label469;
            aar localaar = b.a((com.tencent.mm.plugin.fav.a.g)localObject2, paramLinkedList.field_dataId);
            if (localaar == null)
              break;
            localObject2 = new bcd();
            ((bcd)localObject2).ncF = ("dataitem." + paramLinkedList.field_dataId + ".stream_videoid");
            ((bcd)localObject2).pXM = localaar.wgJ;
            paramLinkedList1.add(localObject2);
            break;
          }
        }
      }
    }
    AppMethodBeat.o(5383);
  }

  public static void startSync()
  {
    AppMethodBeat.i(5382);
    aj localaj = new aj();
    com.tencent.mm.kernel.g.Rg().a(localaj, 0);
    AppMethodBeat.o(5382);
  }

  public final void Fb()
  {
    AppMethodBeat.i(5381);
    this.cqQ.clear();
    cqS.clear();
    this.running = false;
    this.cqU = false;
    mhg.clear();
    AppMethodBeat.o(5381);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(5379);
    if (paramm.getType() != 426)
      AppMethodBeat.o(5379);
    while (true)
    {
      return;
      if (!(paramm instanceof com.tencent.mm.plugin.fav.a.al))
      {
        AppMethodBeat.o(5379);
      }
      else
      {
        com.tencent.mm.kernel.g.RS().aa(new d.1(this, paramm, paramInt2, paramInt1));
        AppMethodBeat.o(5379);
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(5380);
    com.tencent.mm.kernel.g.RS().aa(new d.2(this));
    AppMethodBeat.o(5380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.d
 * JD-Core Version:    0.6.2
 */