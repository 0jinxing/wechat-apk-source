package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.card.d.e;
import com.tencent.mm.plugin.card.d.q;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ae;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.g.c;
import com.tencent.mm.plugin.card.model.i;
import com.tencent.mm.plugin.card.model.j;
import com.tencent.mm.plugin.card.model.k;
import com.tencent.mm.protocal.protobuf.bhl;
import com.tencent.mm.protocal.protobuf.bnc;
import com.tencent.mm.protocal.protobuf.bnd;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements f
{
  public int exv;
  public List<WeakReference<g.a>> kaD;
  public com.tencent.mm.plugin.card.d.c kaZ;
  public ap kba;

  public g()
  {
    AppMethodBeat.i(87681);
    this.kaD = new ArrayList();
    this.kba = new ap(new g.1(this), false);
    AppMethodBeat.o(87681);
  }

  private void I(LinkedList<bhl> paramLinkedList)
  {
    AppMethodBeat.i(87692);
    com.tencent.mm.kernel.g.RO().eJo.a(1275, this);
    paramLinkedList = new com.tencent.mm.plugin.card.model.ah(paramLinkedList);
    com.tencent.mm.kernel.g.RO().eJo.a(paramLinkedList, 0);
    AppMethodBeat.o(87692);
  }

  private void a(com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(87698);
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSuccess()");
    if (this.kaD == null)
      AppMethodBeat.o(87698);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (g.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((g.a)localObject).c(paramc);
        }
      }
      AppMethodBeat.o(87698);
    }
  }

  private void a(bnd parambnd)
  {
    AppMethodBeat.i(87694);
    if (parambnd == null)
      AppMethodBeat.o(87694);
    while (true)
    {
      return;
      String str = parambnd.cMC;
      Object localObject;
      if (am.bbl().Gv(str) == null)
      {
        localObject = b(parambnd);
        am.bbl().b((com.tencent.mm.sdk.e.c)localObject);
      }
      while (true)
      {
        localObject = am.bbk().Gw(str);
        if ((!((List)localObject).isEmpty()) && (am.bbk().pI(str)) && (this.kaZ != null))
          a(str, (List)localObject, this.kaZ);
        localObject = parambnd.wQb.iterator();
        while (((Iterator)localObject).hasNext())
        {
          bnc localbnc = (bnc)((Iterator)localObject).next();
          parambnd = new k();
          parambnd.field_card_id = str;
          parambnd.field_code_id = localbnc.kdG;
          parambnd.field_code = e.dt(str, localbnc.data);
          am.bbk().b(parambnd);
        }
        localObject = b(parambnd);
        am.bbl().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
      }
      AppMethodBeat.o(87694);
    }
  }

  private void a(String paramString, q paramq)
  {
    AppMethodBeat.i(87689);
    Object localObject = new StringBuilder("doNetSceneGetDynamicQrcode, cardId:").append(paramString).append(",scene :");
    if (paramq == null)
    {
      i = 0;
      ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", i);
      localObject = new LinkedList();
      ((LinkedList)localObject).add(paramString);
      if (paramq != null)
        break label117;
    }
    label117: for (int i = 0; ; i = paramq.scene)
    {
      paramString = new ae((LinkedList)localObject, i);
      com.tencent.mm.kernel.g.RO().eJo.a(1382, this);
      com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
      AppMethodBeat.o(87689);
      return;
      i = paramq.scene;
      break;
    }
  }

  private void a(String paramString, List<k> paramList, com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(87690);
    if (paramc == null)
    {
      ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport error! CardCodeRefreshAction is null! cannot report!");
      AppMethodBeat.o(87690);
    }
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localLinkedList.add(b(paramString, ((k)paramList.next()).field_code_id, paramc));
      I(localLinkedList);
      AppMethodBeat.o(87690);
    }
  }

  public static boolean a(i parami)
  {
    boolean bool = true;
    AppMethodBeat.i(87686);
    if (System.currentTimeMillis() - parami.field_fetch_time > parami.field_expire_time_interval * 1000)
    {
      ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code  expire time is true! currentTime= %s,codeFetchTime=%s,field_expire_time_interval=%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(parami.field_fetch_time), Integer.valueOf(parami.field_expire_time_interval) });
      AppMethodBeat.o(87686);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(87686);
      bool = false;
    }
  }

  private static i b(bnd parambnd)
  {
    AppMethodBeat.i(87695);
    i locali = new i();
    locali.field_card_id = parambnd.cMC;
    locali.field_lower_bound = parambnd.wPW;
    locali.field_expire_time_interval = parambnd.wPZ;
    locali.field_need_insert_show_timestamp = parambnd.wPX;
    locali.field_show_expire_interval = parambnd.wQa;
    locali.field_show_timestamp_encrypt_key = parambnd.wPY;
    locali.field_fetch_time = System.currentTimeMillis();
    AppMethodBeat.o(87695);
    return locali;
  }

  private static bhl b(String paramString1, String paramString2, com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(87693);
    bhl localbhl = new bhl();
    localbhl.cMC = paramString1;
    localbhl.kdG = paramString2;
    localbhl.wKK = new Long(System.currentTimeMillis() / 1000L).intValue();
    if (paramc == null);
    for (int i = -1; ; i = paramc.action)
    {
      localbhl.wKL = i;
      AppMethodBeat.o(87693);
      return localbhl;
    }
  }

  private void b(com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(87700);
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onReceiveCodeUnavailable()");
    if (this.kaD == null)
      AppMethodBeat.o(87700);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (g.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((g.a)localObject).b(paramc);
        }
      }
      AppMethodBeat.o(87700);
    }
  }

  private static boolean e(com.tencent.mm.plugin.card.base.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(87688);
    if (paramb == null)
      AppMethodBeat.o(87688);
    while (true)
    {
      return bool;
      if ((paramb.aZW() != null) && (paramb.aZW().vSq))
      {
        bool = true;
        AppMethodBeat.o(87688);
      }
      else
      {
        ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get cardInfo is_commom_card is false!");
        AppMethodBeat.o(87688);
      }
    }
  }

  public final void R(int paramInt, String paramString)
  {
    AppMethodBeat.i(87699);
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onFail()");
    if (this.kaD == null)
      AppMethodBeat.o(87699);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (g.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((g.a)localObject).ap(paramInt, paramString);
        }
      }
      AppMethodBeat.o(87699);
    }
  }

  public final void a(g.a parama)
  {
    AppMethodBeat.i(87697);
    if (this.kaD == null)
      this.kaD = new ArrayList();
    this.kaD.add(new WeakReference(parama));
    AppMethodBeat.o(87697);
  }

  public final void a(com.tencent.mm.plugin.card.base.b paramb, q paramq)
  {
    AppMethodBeat.i(87683);
    if (!e(paramb))
    {
      ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode !");
      R(2, "");
      AppMethodBeat.o(87683);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.card.d.l.isNetworkAvailable(com.tencent.mm.sdk.platformtools.ah.getContext()))
      {
        ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "isNetworkAvailable false cannot connet network!");
        R(-1, "");
        AppMethodBeat.o(87683);
      }
      else if (this.exv >= 3)
      {
        ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doRequestNetSceneGetDynamicQrcode is  limit requestcount:" + this.exv + ",cannot request!");
        AppMethodBeat.o(87683);
      }
      else
      {
        a(paramb.aZZ(), paramq);
        this.exv += 1;
        AppMethodBeat.o(87683);
      }
    }
  }

  public final void a(q paramq)
  {
    AppMethodBeat.i(87684);
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard! fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
    Object localObject1 = am.baW().baL();
    if ((localObject1 == null) || (((List)localObject1).isEmpty()))
    {
      ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard do update all offileQrcode is failure! is dynamic cardList is empyt!fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
      AppMethodBeat.o(87684);
    }
    while (true)
    {
      return;
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        CardInfo localCardInfo = (CardInfo)((Iterator)localObject1).next();
        if (localCardInfo == null)
        {
          ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  is failure! cardInfo is null fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
        }
        else if (paramq == null)
        {
          ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  is failure! fromScene is null!");
        }
        else
        {
          ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  get dynamic code! cardId= %s,fromScene=%d", new Object[] { localCardInfo.aZZ(), Integer.valueOf(paramq.scene) });
          if (!e(localCardInfo))
          {
            ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode ! cardId =%s", new Object[] { localCardInfo.aZZ() });
          }
          else
          {
            Object localObject2 = localCardInfo.aZZ();
            i locali = am.bbl().Gv((String)localObject2);
            int i;
            if (locali == null)
              i = 1;
            while (true)
            {
              if (i != 0)
                break label355;
              ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "do not need  get qrCode!  cardId =%s,fromScene=%d", new Object[] { localCardInfo.aZZ(), Integer.valueOf(paramq.scene) });
              break;
              localObject2 = am.bbk().Gw((String)localObject2);
              if (((List)localObject2).isEmpty())
              {
                i = 1;
              }
              else if (((List)localObject2).size() < locali.field_lower_bound)
              {
                this.kaZ = com.tencent.mm.plugin.card.d.c.krH;
                i = 1;
              }
              else if (a(locali))
              {
                this.kaZ = com.tencent.mm.plugin.card.d.c.krB;
                i = 1;
              }
              else
              {
                i = 0;
              }
            }
            label355: ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard doNetSceneGetDynamicQrcode! fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
            a(localCardInfo.aZZ(), paramq);
          }
        }
      }
      AppMethodBeat.o(87684);
    }
  }

  public final void a(String paramString1, String paramString2, com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(87691);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(b(paramString1, paramString2, paramc));
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport, operate_list=%d,refreshAction=%d", new Object[] { Integer.valueOf(localLinkedList.size()), Integer.valueOf(paramc.action) });
    I(localLinkedList);
    AppMethodBeat.o(87691);
  }

  public final void b(com.tencent.mm.plugin.card.model.g paramg)
  {
    AppMethodBeat.i(87685);
    String str = paramg.field_card_id;
    Object localObject1 = am.bbk();
    Object localObject2;
    if (paramg.kdz)
    {
      localObject2 = am.bbk().Gw(str);
      paramg = ((com.tencent.mm.plugin.card.model.l)localObject1).Gy(str);
      ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is true! delete all card code data by card_id=%s", new Object[] { str });
      if (((com.tencent.mm.plugin.card.model.l)localObject1).pI(str))
      {
        if (paramg != null)
        {
          ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code is showing card_id= %s,notify ui to refresh!", new Object[] { str });
          b(com.tencent.mm.plugin.card.d.c.krG);
        }
        a(str, (List)localObject2, com.tencent.mm.plugin.card.d.c.krG);
      }
      AppMethodBeat.o(87685);
    }
    while (true)
    {
      return;
      localObject2 = paramg.kdA;
      if (localObject2 == null)
      {
        ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is false! unavailableQrCodeList is empty, do nothing! card_id=%s", new Object[] { str });
        AppMethodBeat.o(87685);
      }
      else
      {
        ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is false! delete card code data by unavailableQrCodeList, card_id=%s，unavailableQrCodeList size= %d", new Object[] { str, Integer.valueOf(((List)localObject2).size()) });
        localObject1 = ((com.tencent.mm.plugin.card.model.l)localObject1).Gy(str);
        paramg = new LinkedList();
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (g.c)localIterator.next();
          if (am.bbk().dm(str, ((g.c)localObject2).kdG))
            paramg.add(b(str, ((g.c)localObject2).kdG, com.tencent.mm.plugin.card.d.c.krG));
        }
        if (localObject1 != null)
        {
          ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code is showing card_id= %s,code_id= %s, notify ui to refresh!", new Object[] { str, ((k)localObject1).field_code_id });
          b(com.tencent.mm.plugin.card.d.c.krG);
        }
        if (!paramg.isEmpty())
          I(paramg);
        AppMethodBeat.o(87685);
      }
    }
  }

  public final void bao()
  {
    AppMethodBeat.i(87687);
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "stopRefreshCodeTimer!");
    if (!this.kba.doT())
      this.kba.stopTimer();
    AppMethodBeat.o(87687);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87696);
    StringBuilder localStringBuilder = new StringBuilder("onSceneEnd, errType = ").append(paramInt1).append(" errCode = ").append(paramInt2).append(",NetSceneBase=");
    Object localObject;
    if (paramm != null)
    {
      localObject = paramm.getClass();
      ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", localObject);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label174;
      if (!(paramm instanceof ae))
        break label152;
      paramString = ((ae)paramm).kem;
      if (paramString != null)
        break label117;
      ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSceneEnd, resp  qr_code_item_list is null ");
      AppMethodBeat.o(87696);
    }
    while (true)
    {
      return;
      localObject = "";
      break;
      label117: a(paramString);
      a(this.kaZ);
      com.tencent.mm.kernel.g.RO().eJo.b(1382, this);
      AppMethodBeat.o(87696);
      continue;
      label152: com.tencent.mm.kernel.g.RO().eJo.b(1275, this);
      AppMethodBeat.o(87696);
      continue;
      label174: localObject = new StringBuilder("onSceneEnd, errType = ").append(paramInt1).append(" errCode = ").append(paramInt2).append(" cmd:");
      if (paramm != null)
      {
        paramInt1 = paramm.getType();
        label217: localStringBuilder = ((StringBuilder)localObject).append(paramInt1).append("  NetSceneBase=");
        if (paramm == null)
          break label299;
      }
      label299: for (localObject = paramm.getClass(); ; localObject = "")
      {
        ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", localObject);
        if (!(paramm instanceof ae))
          break label307;
        R(paramInt2, paramString);
        com.tencent.mm.kernel.g.RO().eJo.b(1382, this);
        AppMethodBeat.o(87696);
        break;
        paramInt1 = 0;
        break label217;
      }
      label307: com.tencent.mm.kernel.g.RO().eJo.b(1275, this);
      AppMethodBeat.o(87696);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(87682);
    this.exv = 0;
    bao();
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "removeNetSceneListener!");
    com.tencent.mm.kernel.g.RO().eJo.b(1382, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1275, this);
    AppMethodBeat.o(87682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.g
 * JD-Core Version:    0.6.2
 */