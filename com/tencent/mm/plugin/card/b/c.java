package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.model.ac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements f
{
  List<WeakReference<c.a>> kaD;
  String kaE;
  public LinkedList<String> kaF;
  public int kaG;
  private int kaH;
  private int kaI;
  private int kaJ;
  private int kaK;
  private boolean kaL;
  private ap kaM;
  private ap kaN;

  public c()
  {
    AppMethodBeat.i(87639);
    this.kaD = new ArrayList();
    this.kaE = "";
    this.kaF = new LinkedList();
    this.kaK = 60;
    this.kaL = false;
    this.kaM = new ap(new c.1(this), false);
    this.kaN = new ap(new c.2(this), false);
    AppMethodBeat.o(87639);
  }

  private void Gj(String paramString)
  {
    AppMethodBeat.i(87644);
    ab.i("MicroMsg.CardCodeMgr", "onFail()");
    if (this.kaD == null)
      AppMethodBeat.o(87644);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (c.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((c.a)localObject).Gj(paramString);
        }
      }
      AppMethodBeat.o(87644);
    }
  }

  private void bak()
  {
    AppMethodBeat.i(87648);
    ac localac = new ac(this.kaE);
    g.RO().eJo.a(localac, 0);
    AppMethodBeat.o(87648);
  }

  private void bam()
  {
    AppMethodBeat.i(87651);
    ab.i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
    if (!this.kaM.doT())
      this.kaM.stopTimer();
    AppMethodBeat.o(87651);
  }

  private void onSuccess()
  {
    AppMethodBeat.i(87643);
    ab.i("MicroMsg.CardCodeMgr", "onSuccess()");
    if (this.kaD == null)
      AppMethodBeat.o(87643);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (c.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((c.a)localObject).onSuccess();
        }
      }
      AppMethodBeat.o(87643);
    }
  }

  public final void Gk(String paramString)
  {
    AppMethodBeat.i(87647);
    if (this.kaL)
    {
      ab.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), is doing get codes");
      AppMethodBeat.o(87647);
    }
    while (true)
    {
      return;
      if (TextUtils.isEmpty(paramString))
      {
        ab.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), mCardId is empty!");
        AppMethodBeat.o(87647);
      }
      else
      {
        ab.i("MicroMsg.CardCodeMgr", "doGetCardCodes() do get codes, card id ".concat(String.valueOf(paramString)));
        this.kaL = true;
        this.kaE = paramString;
        bak();
        AppMethodBeat.o(87647);
      }
    }
  }

  public final void a(c.a parama)
  {
    AppMethodBeat.i(87641);
    if (this.kaD == null)
      this.kaD = new ArrayList();
    this.kaD.add(new WeakReference(parama));
    AppMethodBeat.o(87641);
  }

  public final void b(c.a parama)
  {
    AppMethodBeat.i(87642);
    if (this.kaD == null)
      AppMethodBeat.o(87642);
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
          c.a locala = (c.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(parama)))
          {
            this.kaD.remove(localWeakReference);
            AppMethodBeat.o(87642);
            break;
          }
        }
      }
      label99: AppMethodBeat.o(87642);
    }
  }

  public final void bal()
  {
    AppMethodBeat.i(87650);
    bam();
    ab.i("MicroMsg.CardCodeMgr", "startRequestCodeTimer() request_time:" + this.kaH);
    if ((this.kaH > 0) && (!TextUtils.isEmpty(this.kaE)))
    {
      ap localap = this.kaM;
      long l = this.kaH * 1000;
      localap.ae(l, l);
      ab.i("MicroMsg.CardCodeMgr", "start request code timer!");
      AppMethodBeat.o(87650);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.CardCodeMgr", "not to start request code timer!");
      AppMethodBeat.o(87650);
    }
  }

  public final void ban()
  {
    AppMethodBeat.i(87652);
    bao();
    ab.i("MicroMsg.CardCodeMgr", "startRefreshCodeTimer() refresh_interval:" + this.kaJ);
    ap localap;
    long l;
    if (this.kaJ > 0)
    {
      localap = this.kaN;
      l = this.kaJ * 1000;
      localap.ae(l, l);
      ab.i("MicroMsg.CardCodeMgr", "start refresh code timer!");
      AppMethodBeat.o(87652);
    }
    while (true)
    {
      return;
      localap = this.kaN;
      l = this.kaK * 1000;
      localap.ae(l, l);
      ab.e("MicroMsg.CardCodeMgr", "not to start refresh code timer!");
      AppMethodBeat.o(87652);
    }
  }

  public final void bao()
  {
    AppMethodBeat.i(87653);
    ab.i("MicroMsg.CardCodeMgr", "stopRefreshCodeTimer()!");
    if (!this.kaN.doT())
      this.kaN.stopTimer();
    AppMethodBeat.o(87653);
  }

  public final String getCode()
  {
    AppMethodBeat.i(87645);
    Object localObject;
    if ((this.kaF == null) || (this.kaF.size() == 0))
    {
      ab.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
      localObject = "";
      AppMethodBeat.o(87645);
    }
    while (true)
    {
      return localObject;
      if (this.kaG >= this.kaF.size())
      {
        ab.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
        Gk(this.kaE);
        localObject = "";
        AppMethodBeat.o(87645);
      }
      else
      {
        if (this.kaI >= this.kaF.size() - this.kaG)
        {
          ab.i("MicroMsg.CardCodeMgr", "do request code, because the request_count >= than (codes.size() - show_count)");
          Gk(this.kaE);
        }
        ab.i("MicroMsg.CardCodeMgr", "getCode, show_count:" + this.kaG + " request_count:" + this.kaI + " codes size:" + this.kaF.size());
        localObject = this.kaF;
        int i = this.kaG;
        this.kaG = (i + 1);
        localObject = (String)((LinkedList)localObject).get(i);
        AppMethodBeat.o(87645);
      }
    }
  }

  public final boolean isEmpty()
  {
    boolean bool = true;
    AppMethodBeat.i(87646);
    if ((this.kaF == null) || (this.kaF.size() == 0))
    {
      ab.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
      AppMethodBeat.o(87646);
    }
    while (true)
    {
      return bool;
      if (this.kaG >= this.kaF.size())
      {
        ab.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
        AppMethodBeat.o(87646);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(87646);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87649);
    ab.i("MicroMsg.CardCodeMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof ac))
        break label214;
      this.kaL = false;
      ab.e("MicroMsg.CardCodeMgr", "get codes success for card id " + this.kaE);
      paramString = (ac)paramm;
      this.kaH = paramString.kaH;
      this.kaI = paramString.kaI;
      this.kaJ = paramString.kaJ;
      if (paramString.kaF != null)
      {
        this.kaF.clear();
        this.kaF.addAll(paramString.kaF);
        this.kaG = 0;
      }
      onSuccess();
      bal();
      if (this.kaJ != 0)
        ban();
      AppMethodBeat.o(87649);
    }
    while (true)
    {
      return;
      if ((paramm instanceof ac))
      {
        this.kaL = false;
        ab.e("MicroMsg.CardCodeMgr", "get codes failed  for card id " + this.kaE);
        Gj(paramString);
      }
      label214: AppMethodBeat.o(87649);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(87640);
    g.RO().eJo.b(577, this);
    this.kaF.clear();
    this.kaL = false;
    this.kaE = "";
    this.kaG = 0;
    this.kaH = 0;
    this.kaI = 0;
    this.kaJ = 0;
    bam();
    bao();
    AppMethodBeat.o(87640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.c
 * JD-Core Version:    0.6.2
 */