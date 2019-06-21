package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.m.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class j
  implements com.tencent.mm.ai.f
{
  private List<WeakReference<j.a>> kaD;
  public ArrayList<String> kbA;
  public ak kbB;
  public HashMap<String, Runnable> kbC;
  public ArrayList<String> kbz;

  public j()
  {
    AppMethodBeat.i(87728);
    this.kaD = new ArrayList();
    this.kbz = new ArrayList();
    this.kbA = new ArrayList();
    this.kbB = new ak();
    this.kbC = new LinkedHashMap();
    com.tencent.mm.kernel.g.RO().eJo.a(907, this);
    this.kbz.clear();
    this.kbA.clear();
    this.kbC.clear();
    AppMethodBeat.o(87728);
  }

  private void Gn(String paramString)
  {
    AppMethodBeat.i(87733);
    ab.i("MicroMsg.CardMarkCodeMgr", "removeId()");
    if ((this.kbz.contains(paramString)) && (!this.kbA.contains(paramString)))
    {
      this.kbz.remove(paramString);
      ab.i("MicroMsg.CardMarkCodeMgr", "remove mark card id in mMarkList. card is ".concat(String.valueOf(paramString)));
    }
    if ((!this.kbz.contains(paramString)) && (this.kbA.contains(paramString)))
    {
      this.kbA.remove(paramString);
      Runnable localRunnable = (Runnable)this.kbC.get(paramString);
      this.kbC.remove(paramString);
      this.kbB.removeCallbacks(localRunnable);
      ab.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is ".concat(String.valueOf(paramString)));
      ab.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is ".concat(String.valueOf(paramString)));
    }
    AppMethodBeat.o(87733);
  }

  private void Go(String paramString)
  {
    AppMethodBeat.i(87734);
    ab.i("MicroMsg.CardMarkCodeMgr", "cancelUnmark()");
    if (this.kbA.contains(paramString))
    {
      this.kbA.remove(paramString);
      ab.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is ".concat(String.valueOf(paramString)));
    }
    if (this.kbC.containsKey(paramString))
    {
      ab.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is ".concat(String.valueOf(paramString)));
      Runnable localRunnable = (Runnable)this.kbC.get(paramString);
      this.kbC.remove(paramString);
      this.kbB.removeCallbacks(localRunnable);
    }
    AppMethodBeat.o(87734);
  }

  private void a(String paramString, j.b paramb)
  {
    AppMethodBeat.i(87731);
    ab.i("MicroMsg.CardMarkCodeMgr", "markSuccess()");
    if (this.kaD == null)
      AppMethodBeat.o(87731);
    while (true)
    {
      return;
      if ((!this.kbz.contains(paramString)) && (!this.kbA.contains(paramString)))
      {
        ab.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card id is not in mark list and un mark list.");
        AppMethodBeat.o(87731);
      }
      else
      {
        int i = 0;
        if (i < this.kaD.size())
        {
          Object localObject = (WeakReference)this.kaD.get(i);
          if (localObject != null)
          {
            localObject = (j.a)((WeakReference)localObject).get();
            if (localObject != null)
            {
              if (!this.kbz.contains(paramString))
                break label138;
              ((j.a)localObject).b(paramString, paramb);
            }
          }
          while (true)
          {
            i++;
            break;
            label138: if (this.kbA.contains(paramString))
              ((j.a)localObject).Gp(paramString);
          }
        }
        AppMethodBeat.o(87731);
      }
    }
  }

  private void dk(String paramString1, String paramString2)
  {
    AppMethodBeat.i(87732);
    ab.i("MicroMsg.CardMarkCodeMgr", "onMarkFail()");
    if (this.kaD == null)
      AppMethodBeat.o(87732);
    while (true)
    {
      return;
      if ((!this.kbz.contains(paramString1)) || (this.kbA.contains(paramString1)))
      {
        ab.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card is not in mark list");
        AppMethodBeat.o(87732);
      }
      else
      {
        for (int i = 0; i < this.kaD.size(); i++)
        {
          Object localObject = (WeakReference)this.kaD.get(i);
          if (localObject != null)
          {
            localObject = (j.a)((WeakReference)localObject).get();
            if (localObject != null)
              ((j.a)localObject).dl(paramString1, paramString2);
          }
        }
        AppMethodBeat.o(87732);
      }
    }
  }

  static void i(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(87737);
    if (TextUtils.isEmpty(paramString))
    {
      ab.i("MicroMsg.CardMarkCodeMgr", "card_id is empty, don't call NetSceneMarkShareCard cgi");
      AppMethodBeat.o(87737);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardMarkCodeMgr", "doMarkNetscene()");
      paramString = new com.tencent.mm.plugin.card.sharecard.model.f(paramString, paramInt1, paramInt2, paramInt3);
      com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
      AppMethodBeat.o(87737);
    }
  }

  public final void M(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(87735);
    ab.i("MicroMsg.CardMarkCodeMgr", "doMarkCode()");
    Go(paramString);
    if (!this.kbz.contains(paramString))
      this.kbz.add(paramString);
    i(paramString, paramInt1, 1, paramInt2);
    AppMethodBeat.o(87735);
  }

  public final void a(j.a parama)
  {
    AppMethodBeat.i(87729);
    if (this.kaD == null)
      this.kaD = new ArrayList();
    this.kaD.add(new WeakReference(parama));
    AppMethodBeat.o(87729);
  }

  public final void b(j.a parama)
  {
    AppMethodBeat.i(87730);
    if (this.kaD == null)
      AppMethodBeat.o(87730);
    while (true)
    {
      return;
      for (int i = 0; ; i++)
      {
        if (i >= this.kaD.size())
          break label99;
        WeakReference localWeakReference = (WeakReference)this.kaD.get(i);
        if (localWeakReference != null)
        {
          j.a locala = (j.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(parama)))
          {
            this.kaD.remove(localWeakReference);
            AppMethodBeat.o(87730);
            break;
          }
        }
      }
      label99: AppMethodBeat.o(87730);
    }
  }

  public final void bM(final String paramString, final int paramInt)
  {
    AppMethodBeat.i(87736);
    ab.i("MicroMsg.CardMarkCodeMgr", "doUnmarkCode()");
    Go(paramString);
    this.kbA.add(paramString);
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(87727);
        j.i(paramString, this.kbE, this.kbF, paramInt);
        ab.i("MicroMsg.CardMarkCodeMgr", "run the unmark task, the card is " + paramString + " system.time:" + System.currentTimeMillis());
        AppMethodBeat.o(87727);
      }
    };
    paramInt = bo.getInt(com.tencent.mm.m.g.Nv().O("ShareCard", "UnMarkDelay"), 0);
    this.kbB.postDelayed(local1, paramInt * 1000);
    this.kbC.put(paramString, local1);
    ab.i("MicroMsg.CardMarkCodeMgr", "add unmark card mask id in mId2Runner. card is " + paramString + " system.time:" + System.currentTimeMillis());
    AppMethodBeat.o(87736);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87738);
    ab.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof com.tencent.mm.plugin.card.sharecard.model.f))
        break label303;
      paramm = (com.tencent.mm.plugin.card.sharecard.model.f)paramm;
      paramString = new j.b();
      paramString.kbH = paramm.kbH;
      paramString.kbI = paramm.kbI;
      paramString.kbJ = paramm.kbJ;
      paramString.kbK = paramm.kbK;
      paramString.kbL = paramm.kbL;
      ab.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markSuccess original_card_id = " + paramm.kfB);
      ab.i("MicroMsg.CardMarkCodeMgr", "mark_user:" + paramString.kbH + " mark_succ:" + paramString.kbI + " mark_card_id:" + paramString.kbJ + " expire_time:" + paramString.kbK + " pay_qrcode_wording:" + paramString.kbL);
      a(paramm.kfB, paramString);
      Gn(paramm.kfB);
      AppMethodBeat.o(87738);
    }
    while (true)
    {
      return;
      if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.f))
      {
        paramm = (com.tencent.mm.plugin.card.sharecard.model.f)paramm;
        ab.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markFail original_card_id = " + paramm.kfB);
        dk(paramm.kfB, paramString);
        Gn(paramm.kfB);
      }
      label303: AppMethodBeat.o(87738);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.j
 * JD-Core Version:    0.6.2
 */