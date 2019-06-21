package com.tencent.mm.plugin.address.c;

import android.app.Dialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements f
{
  HashSet<m> gIG;
  HashSet<m> gIH;
  Dialog gII;
  private a gIV;
  private Set<Integer> gIW;
  private Context mContext;

  public b(Context paramContext, a parama)
  {
    AppMethodBeat.i(16779);
    this.gIV = null;
    this.gIG = new HashSet();
    this.gIH = new HashSet();
    this.gII = null;
    this.gIW = new HashSet();
    this.mContext = paramContext;
    this.gIV = parama;
    AppMethodBeat.o(16779);
  }

  public final void g(m paramm)
  {
    AppMethodBeat.i(16780);
    ab.d("MicroMsg.WalletNetSceneMgr", "isShowProgress true");
    this.gIH.add(paramm);
    if ((this.gII == null) || ((this.gII != null) && (!this.gII.isShowing())))
    {
      if (this.gII != null)
        this.gII.dismiss();
      this.gII = h.b(this.mContext, "", true, new b.1(this));
    }
    aw.Rg().a(paramm, 0);
    AppMethodBeat.o(16780);
  }

  public final void nf(int paramInt)
  {
    AppMethodBeat.i(16781);
    this.gIW.add(Integer.valueOf(paramInt));
    aw.Rg().a(paramInt, this);
    AppMethodBeat.o(16781);
  }

  public final void ng(int paramInt)
  {
    AppMethodBeat.i(16782);
    aw.Rg().b(paramInt, this);
    this.gIW.remove(Integer.valueOf(paramInt));
    if (this.gIW.isEmpty())
    {
      if (this.gII != null)
      {
        this.gII.dismiss();
        this.gII = null;
      }
      Object localObject1 = this.gIG.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (m)((Iterator)localObject1).next();
        aw.Rg().c((m)localObject2);
      }
      Object localObject2 = this.gIH.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (m)((Iterator)localObject2).next();
        aw.Rg().c((m)localObject1);
      }
      this.gIG.clear();
      this.gIH.clear();
      this.gIV = null;
      this.mContext = null;
    }
    AppMethodBeat.o(16782);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 1;
    AppMethodBeat.i(16783);
    if (this.gIH.contains(paramm))
    {
      this.gIH.remove(paramm);
      ab.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
    }
    while (true)
    {
      if ((this.gIH.isEmpty()) && (this.gIG.isEmpty()) && (this.gII != null))
      {
        this.gII.dismiss();
        this.gII = null;
      }
      if ((i != 0) && (this.gIV != null))
        this.gIV.d(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(16783);
      return;
      if (this.gIG.contains(paramm))
      {
        this.gIG.remove(paramm);
        ab.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
      }
      else
      {
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.c.b
 * JD-Core Version:    0.6.2
 */