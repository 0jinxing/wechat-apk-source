package com.tencent.mm.plugin.luckymoney.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.d.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class s
  implements com.tencent.mm.ai.f, e
{
  private String eHT;
  HashSet<m> gIG;
  HashSet<m> gIH;
  private Set<Integer> gIW;
  private Context mContext;
  private com.tencent.mm.wallet_core.d.f nXS;
  com.tencent.mm.ui.base.p tipDialog;

  public s(Context paramContext, com.tencent.mm.wallet_core.d.f paramf)
  {
    AppMethodBeat.i(42341);
    this.nXS = null;
    this.gIG = new HashSet();
    this.gIH = new HashSet();
    this.tipDialog = null;
    this.gIW = new HashSet();
    this.mContext = paramContext;
    this.nXS = paramf;
    AppMethodBeat.o(42341);
  }

  private void l(m paramm)
  {
    if ((paramm != null) && ((paramm instanceof u)))
      ((u)paramm).eHT = this.eHT;
  }

  public final void a(m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(42342);
    l(paramm);
    this.gIG.add(paramm);
    if ((paramBoolean) && ((this.tipDialog == null) || ((this.tipDialog != null) && (!this.tipDialog.isShowing()))))
    {
      if (this.tipDialog != null)
        this.tipDialog.dismiss();
      this.tipDialog = h.b(this.mContext, this.mContext.getString(2131300968), false, new s.1(this));
    }
    g.RQ();
    g.RO().eJo.a(paramm, 0);
    AppMethodBeat.o(42342);
  }

  public final void b(m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(42343);
    ab.d("MicroMsg.WalletNetSceneMgr", "isShowProgress ".concat(String.valueOf(paramBoolean)));
    l(paramm);
    this.gIH.add(paramm);
    if ((paramBoolean) && ((this.tipDialog == null) || ((this.tipDialog != null) && (!this.tipDialog.isShowing()))))
    {
      if (this.tipDialog != null)
        this.tipDialog.dismiss();
      this.tipDialog = h.a(this.mContext, 3, this.mContext.getString(2131300968), true, new s.2(this));
    }
    g.RQ();
    g.RO().eJo.a(paramm, 0);
    AppMethodBeat.o(42343);
  }

  public final boolean bLA()
  {
    AppMethodBeat.i(42348);
    boolean bool;
    if ((this.gIH.isEmpty()) && (this.gIG.isEmpty()))
    {
      bool = false;
      AppMethodBeat.o(42348);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(42348);
    }
  }

  public final void bLB()
  {
    AppMethodBeat.i(42349);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    AppMethodBeat.o(42349);
  }

  public final void bLz()
  {
    AppMethodBeat.i(42344);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    Iterator localIterator = this.gIG.iterator();
    m localm;
    while (localIterator.hasNext())
    {
      localm = (m)localIterator.next();
      g.RQ();
      g.RO().eJo.c(localm);
    }
    localIterator = this.gIH.iterator();
    while (localIterator.hasNext())
    {
      localm = (m)localIterator.next();
      g.RQ();
      g.RO().eJo.c(localm);
    }
    this.gIG.clear();
    this.gIH.clear();
    AppMethodBeat.o(42344);
  }

  public final void nf(int paramInt)
  {
    AppMethodBeat.i(42345);
    this.gIW.add(Integer.valueOf(paramInt));
    g.RQ();
    g.RO().eJo.a(paramInt, this);
    AppMethodBeat.o(42345);
  }

  public final void ng(int paramInt)
  {
    AppMethodBeat.i(42346);
    g.RQ();
    g.RO().eJo.b(paramInt, this);
    this.gIW.remove(Integer.valueOf(paramInt));
    if (this.gIW.isEmpty())
    {
      bLz();
      this.nXS = null;
      this.mContext = null;
    }
    AppMethodBeat.o(42346);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42347);
    int i;
    if (this.gIH.contains(paramm))
    {
      this.gIH.remove(paramm);
      ab.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
      i = 1;
    }
    while (true)
    {
      if ((this.gIH.isEmpty()) && (this.gIG.isEmpty()))
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
      for (boolean bool = true; ; bool = false)
      {
        if ((i != 0) && (this.nXS != null))
          this.nXS.b(paramInt1, paramInt2, paramString, paramm, bool);
        AppMethodBeat.o(42347);
        return;
        if (!this.gIG.contains(paramm))
          break label154;
        this.gIG.remove(paramm);
        ab.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
        i = 1;
        break;
      }
      label154: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.s
 * JD-Core Version:    0.6.2
 */