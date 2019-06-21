package com.tencent.mm.wallet_core.d;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave.RetryPayInfo;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class i
  implements com.tencent.mm.ai.f, e
{
  private a Ago;
  private b Agp;
  public HashMap<Integer, c> Agq;
  public String eHT;
  public HashSet<com.tencent.mm.ai.m> gIG;
  public HashSet<com.tencent.mm.ai.m> gIH;
  public Dialog gII;
  private Set<Integer> gIW;
  public Bundle mBundle;
  public Context mContext;
  private f nXS;

  public i(Context paramContext, f paramf)
  {
    AppMethodBeat.i(49147);
    this.nXS = null;
    this.gIG = new HashSet();
    this.gIH = new HashSet();
    this.gII = null;
    this.gIW = new HashSet();
    this.mContext = paramContext;
    this.nXS = paramf;
    this.Ago = new a(this);
    this.Agp = new b(this);
    this.Agq = new HashMap();
    AppMethodBeat.o(49147);
  }

  private boolean k(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(49155);
    ab.i("MicroMsg.WalletNetSceneMgr", "onSceneEnd scene is %s %s", new Object[] { this, paramm.toString() });
    ab.d("MicroMsg.WalletNetSceneMgr", "tofutest: %s errType: %d, errCode: %d, errMsg: %s, %s", new Object[] { this, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(ae.gju) });
    boolean bool1;
    if ((ae.gju) && ((paramm instanceof n)) && (!((n)paramm).pOZ) && (!((n)paramm).cNK()))
    {
      paramString = (n)paramm;
      ab.i("MicroMsg.WalletNetSceneMgr", "test do delay query order");
      this.Ago.a(paramString);
      bool1 = true;
      AppMethodBeat.o(49155);
    }
    while (true)
    {
      return bool1;
      if ((paramm instanceof ITenpaySave))
      {
        paramString = (ITenpaySave)paramm;
        if ((paramString instanceof ITenpaySave))
        {
          paramString = paramString.cMC();
          if ((paramString != null) && (paramString.bVy()))
            b.tfe = paramString;
        }
      }
      boolean bool2;
      if ((paramm instanceof n))
      {
        if (((n)paramm).pOZ)
        {
          ab.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass %s", new Object[] { paramm });
          bool1 = false;
          AppMethodBeat.o(49155);
        }
        else if ((((n)paramm).cNK()) && ((paramm instanceof com.tencent.mm.wallet_core.tenpay.model.a)))
        {
          bool2 = ((n)paramm).AgQ;
          if (!((n)paramm).AfM);
          for (bool1 = true; ; bool1 = false)
          {
            ab.i("MicroMsg.WalletNetSceneMgr", "%s save or fetch shouldRetry, network: %B, server: %B", new Object[] { this, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            if ((!bool2) && (!bool1))
              break label354;
            if (!this.Agp.c((n)paramm))
              break label343;
            bool1 = true;
            AppMethodBeat.o(49155);
            break;
          }
          label343: bool1 = false;
          AppMethodBeat.o(49155);
          continue;
          label354: bool1 = false;
          AppMethodBeat.o(49155);
        }
      }
      else
      {
        int i = paramm.getType();
        if (this.Agq != null)
        {
          paramString = (c)this.Agq.get(Integer.valueOf(i));
          if ((paramm instanceof d))
          {
            if (((d)paramm).cfp())
            {
              bool1 = false;
              AppMethodBeat.o(49155);
              continue;
            }
            d locald = (d)paramm;
            ab.i("MicroMsg.IDelayQueryOrder", "startQueryOrder %s ", new Object[] { locald });
            paramString.Agl = locald;
            if (paramString.a(paramInt1, paramInt2, locald))
            {
              bool1 = true;
              AppMethodBeat.o(49155);
            }
          }
        }
        else if (!(paramm instanceof n))
        {
          bool1 = false;
          AppMethodBeat.o(49155);
        }
        else if (((n)paramm).cNK())
        {
          bool1 = false;
          AppMethodBeat.o(49155);
        }
        else if (((n)paramm).pOZ)
        {
          ab.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass");
          bool1 = false;
          AppMethodBeat.o(49155);
        }
        else
        {
          paramString = (n)paramm;
          paramm = this.Ago;
          paramInt1 = r.cPI().mRetryCount;
          ab.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", new Object[] { Boolean.valueOf(paramString.dOs()), Integer.valueOf(paramm.Agj) });
          if ((paramString.dOs()) && (paramm.Agj < paramInt1))
          {
            bool1 = true;
            label618: if (paramString.AfM)
              break label740;
          }
          label740: for (bool2 = true; ; bool2 = false)
          {
            ab.d("MicroMsg.WalletNetSceneMgr", "%s shouldRetry, network: %B, server: %B", new Object[] { this, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
            com.tencent.mm.plugin.report.service.h.pYm.k(965L, 13L, 1L);
            if (bool2)
              com.tencent.mm.plugin.report.service.h.pYm.k(965L, 14L, 1L);
            if ((!bool1) && (!bool2))
              break label746;
            ab.i("MicroMsg.WalletNetSceneMgr", "%s doing delay order query retry", new Object[] { this });
            this.Ago.a(paramString);
            bool1 = true;
            AppMethodBeat.o(49155);
            break;
            bool1 = false;
            break label618;
          }
          label746: bool1 = false;
          AppMethodBeat.o(49155);
        }
      }
    }
  }

  private void onDestroy()
  {
    AppMethodBeat.i(49159);
    bLz();
    this.nXS = null;
    this.mContext = null;
    this.Ago.destory();
    this.Agp.destory();
    Iterator localIterator = this.Agq.values().iterator();
    while (localIterator.hasNext())
      ((c)localIterator.next()).bMO();
    this.Agq.clear();
    AppMethodBeat.o(49159);
  }

  private void s(com.tencent.mm.ai.m paramm)
  {
    if ((paramm != null) && ((paramm instanceof u)))
    {
      ((u)paramm).eHT = this.eHT;
      if (this.mBundle == null)
        break label41;
      ((u)paramm).mBundle = this.mBundle;
    }
    while (true)
    {
      return;
      label41: if ((this.mContext instanceof WalletBaseUI))
        ((u)paramm).mBundle = ((WalletBaseUI)this.mContext).mBundle;
    }
  }

  public final void a(com.tencent.mm.ai.m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(49148);
    s(paramm);
    this.gIG.add(paramm);
    if ((paramBoolean) && ((this.gII == null) || ((this.gII != null) && (!this.gII.isShowing()))))
    {
      if (this.gII != null)
        this.gII.dismiss();
      if (this.mContext == null)
      {
        ab.w("MicroMsg.WalletNetSceneMgr", "%s activity has destroyed!!!", new Object[] { this });
        AppMethodBeat.o(49148);
      }
    }
    while (true)
    {
      return;
      this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new i.1(this));
      if ((ae.gju) && ((paramm instanceof com.tencent.mm.wallet_core.tenpay.model.m)) && ((((com.tencent.mm.wallet_core.tenpay.model.m)paramm).getUri().contains("authen")) || (((com.tencent.mm.wallet_core.tenpay.model.m)paramm).getUri().contains("verify"))))
        ((com.tencent.mm.wallet_core.tenpay.model.m)paramm).dOq();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(paramm, 0);
      AppMethodBeat.o(49148);
    }
  }

  public final void a(com.tencent.mm.ai.m paramm, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(49149);
    a(paramm, paramBoolean, paramInt, 0);
    AppMethodBeat.o(49149);
  }

  public final void a(com.tencent.mm.ai.m paramm, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49150);
    int i = paramm.getType();
    boolean bool1 = paramm instanceof com.tencent.mm.wallet_core.c.i;
    if ((this.gII == null) || ((this.gII != null) && (!this.gII.isShowing())));
    for (boolean bool2 = true; ; bool2 = false)
    {
      ab.i("MicroMsg.WalletNetSceneMgr", "this %s isShowProgress %s scene: %s dialogType %s type %s IWxSafePay %s tipDialog showing? %s", new Object[] { this, Boolean.valueOf(paramBoolean), paramm, Integer.valueOf(paramInt1), Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      s(paramm);
      this.gIH.add(paramm);
      if ((!paramBoolean) || ((this.gII != null) && ((this.gII == null) || (this.gII.isShowing()))))
        break label221;
      if (this.gII != null)
        this.gII.dismiss();
      if (this.mContext != null)
        break;
      ab.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
      AppMethodBeat.o(49150);
      return;
    }
    if (paramInt1 == 1)
      if ((paramm instanceof com.tencent.mm.wallet_core.c.i))
      {
        this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new i.2(this));
        label221: if ((ae.gju) && ((paramm instanceof com.tencent.mm.wallet_core.tenpay.model.m)) && ((((com.tencent.mm.wallet_core.tenpay.model.m)paramm).getUri().contains("authen")) || (((com.tencent.mm.wallet_core.tenpay.model.m)paramm).getUri().contains("verify"))))
          ((com.tencent.mm.wallet_core.tenpay.model.m)paramm).dOq();
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(paramm, paramInt2);
        if (paramm.ftl != null)
          break label562;
      }
    label562: for (Object localObject = ""; ; localObject = paramm.ftl.getUri())
    {
      ab.i("MicroMsg.WalletNetSceneMgr", "this %s scene url %s %s", new Object[] { this, paramm, localObject });
      AppMethodBeat.o(49150);
      break;
      localObject = this.mContext;
      this.mContext.getString(2131296899);
      this.gII = com.tencent.mm.ui.base.h.b((Context)localObject, this.mContext.getString(2131305190), false, new i.3(this));
      break label221;
      if (paramInt1 == 2)
      {
        localObject = this.mContext;
        this.mContext.getString(2131296899);
        this.gII = com.tencent.mm.ui.base.h.b((Context)localObject, this.mContext.getString(2131305190), false, new i.4(this));
        break label221;
      }
      if (paramInt1 == 3)
      {
        this.gII = com.tencent.mm.wallet_core.ui.g.d(this.mContext, "验证中", new i.5(this));
        break label221;
      }
      if (paramInt1 == 4)
      {
        this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new i.6(this));
        break label221;
      }
      ab.i("MicroMsg.WalletNetSceneMgr", "unknown dialog type: %d", new Object[] { Integer.valueOf(paramInt1) });
      localObject = this.mContext;
      this.mContext.getString(2131296899);
      this.gII = com.tencent.mm.ui.base.h.b((Context)localObject, this.mContext.getString(2131305190), false, new i.7(this));
      break label221;
    }
  }

  public final boolean bLA()
  {
    AppMethodBeat.i(49158);
    boolean bool;
    if ((this.gIH.isEmpty()) && (this.gIG.isEmpty()))
    {
      bool = false;
      AppMethodBeat.o(49158);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(49158);
    }
  }

  public final void bLB()
  {
    AppMethodBeat.i(138571);
    cNM();
    AppMethodBeat.o(138571);
  }

  public final void bLz()
  {
    AppMethodBeat.i(49151);
    if (this.gII != null)
    {
      this.gII.dismiss();
      this.gII = null;
    }
    Object localObject1 = this.gIG.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.ai.m)((Iterator)localObject1).next();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.c((com.tencent.mm.ai.m)localObject2);
    }
    Object localObject2 = this.gIH.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (com.tencent.mm.ai.m)((Iterator)localObject2).next();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.c((com.tencent.mm.ai.m)localObject1);
    }
    this.gIG.clear();
    this.gIH.clear();
    AppMethodBeat.o(49151);
  }

  public final void cNM()
  {
    AppMethodBeat.i(49157);
    if (this.gII != null)
    {
      this.gII.dismiss();
      this.gII = null;
    }
    AppMethodBeat.o(49157);
  }

  public final void nf(int paramInt)
  {
    AppMethodBeat.i(49152);
    this.gIW.add(Integer.valueOf(paramInt));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramInt, this);
    AppMethodBeat.o(49152);
  }

  public final void ng(int paramInt)
  {
    AppMethodBeat.i(49153);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(paramInt, this);
    this.gIW.remove(Integer.valueOf(paramInt));
    if (this.gIW.isEmpty())
      onDestroy();
    AppMethodBeat.o(49153);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(49156);
    int i;
    if (this.gIH.contains(paramm))
    {
      ab.d("MicroMsg.WalletNetSceneMgr", "%s has find scene ", new Object[] { this });
      if (!k(paramInt1, paramInt2, paramString, paramm))
      {
        ab.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", new Object[] { this });
        this.gIH.remove(paramm);
        i = 1;
      }
    }
    while (true)
    {
      ab.i("MicroMsg.WalletNetSceneMgr", "%s onSceneEnd scenes %s forcescenes %s", new Object[] { this, Integer.valueOf(this.gIH.size()), Integer.valueOf(this.gIG.size()) });
      if ((this.gIH.isEmpty()) && (this.gIG.isEmpty()))
        cNM();
      for (boolean bool = true; ; bool = false)
      {
        if ((i != 0) && (this.nXS != null))
          this.nXS.b(paramInt1, paramInt2, paramString, paramm, bool);
        AppMethodBeat.o(49156);
        while (true)
        {
          return;
          ab.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", new Object[] { this });
          AppMethodBeat.o(49156);
          continue;
          if (!this.gIG.contains(paramm))
            break label307;
          ab.d("MicroMsg.WalletNetSceneMgr", "%s has find forcescenes ", new Object[] { this });
          if (!k(paramInt1, paramInt2, paramString, paramm))
          {
            this.gIG.remove(paramm);
            ab.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", new Object[] { this });
            i = 1;
            break;
          }
          ab.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", new Object[] { this });
          AppMethodBeat.o(49156);
        }
      }
      label307: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.i
 * JD-Core Version:    0.6.2
 */