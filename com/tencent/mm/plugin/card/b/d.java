package com.tencent.mm.plugin.card.b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d
  implements f, k.a, com.tencent.mm.plugin.card.base.d
{
  public WeakReference<Context> atF;
  public List<WeakReference<d.a>> kaD;
  public HashMap<d.a, Boolean> kaP;
  public HashMap<String, Boolean> kaQ;
  public HashMap<String, Boolean> kaR;
  public com.tencent.mm.plugin.card.base.b kaS;
  public boolean kaT;
  public String kaU;

  public d()
  {
    AppMethodBeat.i(87654);
    this.kaD = new ArrayList();
    this.kaP = new HashMap();
    this.kaQ = new HashMap();
    this.kaR = new HashMap();
    this.kaS = null;
    this.kaT = false;
    AppMethodBeat.o(87654);
  }

  private void Gl(String paramString)
  {
    AppMethodBeat.i(87665);
    ab.i("MicroMsg.CardConsumedMgr", "startConsumedSuccUI()");
    if (this.kaD == null)
    {
      AppMethodBeat.o(87665);
      return;
    }
    int i = 0;
    int j = 0;
    label29: Object localObject;
    if (i < this.kaD.size())
    {
      localObject = (WeakReference)this.kaD.get(i);
      if (localObject == null)
        break label219;
      d.a locala = (d.a)((WeakReference)localObject).get();
      localObject = (Boolean)this.kaP.get(locala);
      if ((locala == null) || (localObject == null) || (!((Boolean)localObject).booleanValue()))
        break label219;
      locala.Gm(paramString);
      j = 1;
    }
    label219: 
    while (true)
    {
      i++;
      break label29;
      localObject = (Boolean)this.kaQ.get(this.kaS.aZZ());
      if (j != 0)
      {
        ab.i("MicroMsg.CardConsumedMgr", "onStartConsumedSuccUI is handled!");
        this.kaU = "";
        AppMethodBeat.o(87665);
        break;
      }
      if ((localObject != null) && (((Boolean)localObject).booleanValue()))
      {
        ab.i("MicroMsg.CardConsumedMgr", "add to launch pending list!");
        this.kaU = paramString;
        this.kaR.put(this.kaS.aZZ(), Boolean.TRUE);
      }
      AppMethodBeat.o(87665);
      break;
    }
  }

  private void baq()
  {
    AppMethodBeat.i(87667);
    ab.i("MicroMsg.CardConsumedMgr", "doVibrate()");
    if (this.kaD == null)
      AppMethodBeat.o(87667);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (d.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((d.a)localObject).bau();
        }
      }
      AppMethodBeat.o(87667);
    }
  }

  private void bar()
  {
    AppMethodBeat.i(87668);
    ab.i("MicroMsg.CardConsumedMgr", "doFinishUI()");
    if (this.kaD == null)
      AppMethodBeat.o(87668);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (d.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((d.a)localObject).bav();
        }
      }
      AppMethodBeat.o(87668);
    }
  }

  private void bas()
  {
    AppMethodBeat.i(87669);
    ab.i("MicroMsg.CardConsumedMgr", "needDoConsumedInfo(), need to do NetSceneGetShareCardConsumedInfo. ");
    bat();
    AppMethodBeat.o(87669);
  }

  private void bat()
  {
    try
    {
      AppMethodBeat.i(87670);
      if (this.kaT)
      {
        ab.i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is true, is doing NetSceneGetShareCardConsumedInfo. return");
        AppMethodBeat.o(87670);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is false, do NetSceneGetShareCardConsumedInfo. ");
        this.kaT = true;
        com.tencent.mm.plugin.card.sharecard.model.d locald = new com/tencent/mm/plugin/card/sharecard/model/d;
        locald.<init>(this.kaS.aZZ(), "", "");
        com.tencent.mm.kernel.g.RO().eJo.a(locald, 0);
        AppMethodBeat.o(87670);
      }
    }
    finally
    {
    }
  }

  private void c(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(87666);
    ab.i("MicroMsg.CardConsumedMgr", "doUpdateCardInfo()");
    if (this.kaD == null)
      AppMethodBeat.o(87666);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (d.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((d.a)localObject).d(paramb);
        }
      }
      AppMethodBeat.o(87666);
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(87656);
    if (this.kaD == null)
      this.kaD = new ArrayList();
    this.kaD.add(new WeakReference(parama));
    AppMethodBeat.o(87656);
  }

  public final void a(d.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(87659);
    if (this.kaP == null)
      this.kaP = new HashMap();
    this.kaP.put(parama, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(87659);
  }

  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    AppMethodBeat.i(87663);
    ab.i("MicroMsg.CardConsumedMgr", "onChange()");
    ab.i("MicroMsg.CardConsumedMgr", "card msg card id is " + paramg.field_card_id);
    if (this.kaS == null)
    {
      ab.e("MicroMsg.CardConsumedMgr", "onChange(), do nothing, mCardInfo == null");
      bar();
      AppMethodBeat.o(87663);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardConsumedMgr", "card msg card id is " + paramg.field_card_id);
      if ((this.kaS.aZB()) && (paramg.field_card_id != null) && (paramg.field_card_id.equals(this.kaS.aZZ())) && (paramg.kdy == 3))
      {
        ab.i("MicroMsg.CardConsumedMgr", "it is card type, don't do NetSceneGetShareCardConsumedInfo! finish UI");
        bar();
        AppMethodBeat.o(87663);
      }
      else
      {
        if (this.kaS.aZC())
          break;
        ab.i("MicroMsg.CardConsumedMgr", "it is not card type, don't update share card data!");
        bar();
        AppMethodBeat.o(87663);
      }
    }
    int i;
    label374: Object localObject;
    if ((paramg.kdy == 3) || ((paramg.field_card_id != null) && (paramg.field_card_id.equals(this.kaS.aZZ())) && (!TextUtils.isEmpty(paramg.field_consumed_box_id))))
    {
      long l1 = System.currentTimeMillis();
      ab.i("MicroMsg.CardConsumedMgr", "consumed share card msg,  update share card data!");
      if ((paramg.field_card_id == null) || (!paramg.field_card_id.equals(this.kaS.aZZ())))
        break label663;
      paramg = am.bbe().GK(this.kaS.aZZ());
      if ((paramg != null) && (paramg.aZW() != null))
      {
        i = this.kaS.aZW().status;
        ab.d("MicroMsg.CardConsumedMgr", "onChange() current oldState %s, newStatus %s, shareCardStatus %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramg.aZW().status), Integer.valueOf(((ShareCardInfo)this.kaS).field_status) });
        if (paramg.aZW().status == i)
          break label594;
        baq();
      }
      c(this.kaS);
      paramg = (Boolean)this.kaQ.get(this.kaS.aZZ());
      if ((paramg != null) && (paramg.booleanValue()))
        break label780;
      paramg = (Context)this.atF.get();
      ab.i("MicroMsg.CardConsumedMgr", "consume share card, card id is " + this.kaS.aZZ());
      com.tencent.mm.plugin.card.sharecard.a.b.a(paramg, this.kaS);
      this.kaQ.put(this.kaS.aZZ(), Boolean.TRUE);
      long l2 = System.currentTimeMillis();
      paramg = new ArrayList();
      localObject = new IDKey();
      ((IDKey)localObject).SetID(281);
      ((IDKey)localObject).SetKey(30);
      ((IDKey)localObject).SetValue(1L);
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(281);
      localIDKey.SetKey(31);
      localIDKey.SetValue((int)(l2 - l1));
      paramg.add(localObject);
      paramg.add(localIDKey);
      h.pYm.b(paramg, true);
    }
    while (true)
    {
      bas();
      AppMethodBeat.o(87663);
      break;
      label594: if (i == 1)
        break label374;
      ab.i("MicroMsg.CardConsumedMgr", "share card oldState status is ".concat(String.valueOf(i)));
      paramg = this.kaS.aZW();
      paramg.status = 1;
      ((ShareCardInfo)this.kaS).field_status = 1;
      this.kaS.a(paramg);
      l.h(this.kaS);
      break label374;
      label663: if (paramg.field_card_id == null)
        break label374;
      paramg = am.bbe().GK(paramg.field_card_id);
      if ((paramg != null) && (paramg.aZW() != null))
      {
        ab.d("MicroMsg.CardConsumedMgr", "onChange() not current oldState %s,shareCardStatus %s", new Object[] { Integer.valueOf(paramg.aZW().status), Integer.valueOf(paramg.field_status) });
        if (paramg.aZW().status == 1)
          break label374;
        localObject = paramg.aZW();
        ((no)localObject).status = 1;
        paramg.field_status = 1;
        paramg.a((no)localObject);
        l.h(paramg);
        break label374;
      }
      ab.w("MicroMsg.CardConsumedMgr", "tempCard is null");
      break label374;
      label780: ab.i("MicroMsg.CardConsumedMgr", "consumed:" + paramg.booleanValue());
    }
  }

  public final void aVU()
  {
    AppMethodBeat.i(87662);
    baq();
    AppMethodBeat.o(87662);
  }

  public final void b(d.a parama)
  {
    AppMethodBeat.i(87657);
    if (this.kaD == null)
      AppMethodBeat.o(87657);
    while (true)
    {
      return;
      for (int i = 0; ; i++)
      {
        if (i >= this.kaD.size())
          break label102;
        WeakReference localWeakReference = (WeakReference)this.kaD.get(i);
        if (localWeakReference != null)
        {
          d.a locala = (d.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(parama)))
          {
            this.kaD.remove(localWeakReference);
            AppMethodBeat.o(87657);
            break;
          }
        }
      }
      label102: AppMethodBeat.o(87657);
    }
  }

  public final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(87658);
    this.kaS = paramb;
    if ((this.kaT) && (this.kaS != null) && (paramb.aZZ() != null) && (!paramb.aZZ().equals(this.kaS.aZZ())))
      this.kaT = false;
    if (this.kaD == null)
      AppMethodBeat.o(87658);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          d.a locala = (d.a)((WeakReference)localObject).get();
          localObject = (Boolean)this.kaP.get(locala);
          if ((locala != null) && (localObject != null) && (!((Boolean)localObject).booleanValue()))
            locala.d(paramb);
        }
      }
      AppMethodBeat.o(87658);
    }
  }

  public final void bag()
  {
    AppMethodBeat.i(87661);
    ab.i("MicroMsg.CardConsumedMgr", "onDBchange()");
    if (this.kaS == null)
    {
      ab.e("MicroMsg.CardConsumedMgr", "onDBchange(), do nothing, mCardInfo == null");
      AppMethodBeat.o(87661);
      return;
    }
    Object localObject1;
    label64: label218: Object localObject2;
    if (this.kaS.aZC())
    {
      localObject1 = am.bbe().GK(this.kaS.aZZ());
      if ((localObject1 != null) && (((com.tencent.mm.plugin.card.base.b)localObject1).aZW() != null) && (this.kaS != null) && (this.kaS.aZW() != null))
      {
        int i = this.kaS.aZW().status;
        ab.d("MicroMsg.CardConsumedMgr", "onDBchange() oldState %s, newStatus %s, isDoingConsumedInfo %s, isShareCard %s", new Object[] { Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.plugin.card.base.b)localObject1).aZW().status), Boolean.valueOf(this.kaT), Boolean.valueOf(this.kaS.aZC()) });
        if ((!this.kaS.aZC()) || (!(this.kaS instanceof ShareCardInfo)))
          break label541;
        ab.d("MicroMsg.CardConsumedMgr", "onDBchange() shareCardState %s", new Object[] { Integer.valueOf(((ShareCardInfo)this.kaS).field_status) });
        if (((com.tencent.mm.plugin.card.base.b)localObject1).aZW().status != i)
        {
          baq();
          if ((!this.kaS.aZC()) || (this.kaT) || (((com.tencent.mm.plugin.card.base.b)localObject1).aZW().status != 1))
            break label592;
          ab.i("MicroMsg.CardConsumedMgr", "onDBchange(), need to get the consumedinfo , don't finish UI!");
          localObject2 = (Boolean)this.kaQ.get(this.kaS.aZZ());
          if ((localObject2 != null) && (((Boolean)localObject2).booleanValue()))
            break label564;
          ab.i("MicroMsg.CardConsumedMgr", "consumed is null or consumed is false!");
          long l1 = System.currentTimeMillis();
          localObject2 = (Context)this.atF.get();
          ab.i("MicroMsg.CardConsumedMgr", "consume share card, card id is " + this.kaS.aZZ());
          com.tencent.mm.plugin.card.sharecard.a.b.a((Context)localObject2, this.kaS);
          this.kaQ.put(this.kaS.aZZ(), Boolean.TRUE);
          long l2 = System.currentTimeMillis();
          ArrayList localArrayList = new ArrayList();
          IDKey localIDKey = new IDKey();
          localIDKey.SetID(281);
          localIDKey.SetKey(30);
          localIDKey.SetValue(1L);
          localObject2 = new IDKey();
          ((IDKey)localObject2).SetID(281);
          ((IDKey)localObject2).SetKey(31);
          ((IDKey)localObject2).SetValue((int)(l2 - l1));
          localArrayList.add(localIDKey);
          localArrayList.add(localObject2);
          h.pYm.b(localArrayList, true);
          label488: bas();
        }
      }
    }
    while (true)
    {
      ab.i("MicroMsg.CardConsumedMgr", "onDBchange(),card coupon is consumde success!");
      this.kaS = ((com.tencent.mm.plugin.card.base.b)localObject1);
      c(this.kaS);
      AppMethodBeat.o(87661);
      break;
      localObject1 = am.baW().Gu(this.kaS.aZZ());
      break label64;
      label541: if (!this.kaS.aZC())
        break label218;
      ab.e("MicroMsg.CardConsumedMgr", "onDBchange() mCardInfo is ShareCard, but not the ShareCardInfo instance!");
      break label218;
      label564: ab.i("MicroMsg.CardConsumedMgr", "consumed:" + ((Boolean)localObject2).booleanValue());
      break label488;
      label592: if ((this.kaS.aZC()) && (this.kaT))
      {
        ab.i("MicroMsg.CardConsumedMgr", "onDBchange(), is getting the consumedinfo!");
      }
      else
      {
        ab.i("MicroMsg.CardConsumedMgr", "onDBchange(),finish CardConsumeCodeUI!");
        bar();
      }
    }
  }

  public final void c(d.a parama)
  {
    AppMethodBeat.i(87660);
    if (this.kaP == null)
      this.kaP = new HashMap();
    this.kaP.remove(parama);
    AppMethodBeat.o(87660);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87664);
    ab.i("MicroMsg.CardConsumedMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof com.tencent.mm.plugin.card.sharecard.model.d))
        break label147;
      paramString = (com.tencent.mm.plugin.card.sharecard.model.d)paramm;
      if (!TextUtils.isEmpty(paramString.kdS))
      {
        Gl(paramString.kdS);
        this.kaT = false;
        ab.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo ok! finish UI!");
        bar();
        AppMethodBeat.o(87664);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.CardConsumedMgr", "consumed return json is empty!");
      break;
      if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.d))
      {
        this.kaT = false;
        ab.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo failed! finish UI!");
        bar();
        AppMethodBeat.o(87664);
      }
      else
      {
        label147: AppMethodBeat.o(87664);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(87655);
    com.tencent.mm.kernel.g.RO().eJo.b(910, this);
    am.bbd().b(this);
    b localb = am.baV();
    if (localb.kaD != null);
    for (int i = 0; ; i++)
      if (i < localb.kaD.size())
      {
        WeakReference localWeakReference = (WeakReference)localb.kaD.get(i);
        if (localWeakReference != null)
        {
          com.tencent.mm.plugin.card.base.d locald = (com.tencent.mm.plugin.card.base.d)localWeakReference.get();
          if ((locald != null) && (locald.equals(this)))
            localb.kaD.remove(localWeakReference);
        }
      }
      else
      {
        this.kaD.clear();
        this.kaP.clear();
        this.kaR.clear();
        this.kaT = false;
        AppMethodBeat.o(87655);
        return;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.d
 * JD-Core Version:    0.6.2
 */