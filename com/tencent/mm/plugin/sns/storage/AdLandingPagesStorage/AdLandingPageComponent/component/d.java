package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d extends a
{
  private List<h> bnR;
  private q qZf;
  private l qZg;

  public d(Context paramContext, q paramq, ViewGroup paramViewGroup)
  {
    super(paramContext, paramq, paramViewGroup);
    AppMethodBeat.i(37038);
    this.qZf = paramq;
    this.bnR = new ArrayList();
    AppMethodBeat.o(37038);
  }

  public final void a(r paramr)
  {
    AppMethodBeat.i(37048);
    if ((paramr instanceof q))
      this.qZf = ((q)paramr);
    super.a(paramr);
    AppMethodBeat.o(37048);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37046);
    super.coZ();
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
      ((h)localIterator.next()).coZ();
    AppMethodBeat.o(37046);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37042);
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.cpx())
        localh.cpa();
    }
    super.cpa();
    AppMethodBeat.o(37042);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37043);
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
      ((h)localIterator.next()).cpb();
    super.cpb();
    AppMethodBeat.o(37043);
  }

  public final void cpc()
  {
    AppMethodBeat.i(37044);
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.cpx())
        localh.cpc();
    }
    super.cpc();
    AppMethodBeat.o(37044);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37039);
    if (this.qZg == null)
    {
      this.qZg = new l(this.qZf.bnR, this.context, (FrameLayout)this.contentView);
      this.qZg.aZ();
      this.bnR = cpt();
      AppMethodBeat.o(37039);
    }
    while (true)
    {
      return;
      this.qZg.dl(this.qZf.bnR);
      AppMethodBeat.o(37039);
    }
  }

  protected final void cpq()
  {
    AppMethodBeat.i(37040);
    ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qZo.qWS, (int)this.qZo.qWQ, (int)this.qZo.qWT, (int)this.qZo.qWR);
    this.contentView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(37040);
  }

  protected final View cpr()
  {
    AppMethodBeat.i(37041);
    FrameLayout localFrameLayout = new FrameLayout(this.context);
    AppMethodBeat.o(37041);
    return localFrameLayout;
  }

  public final void cps()
  {
    AppMethodBeat.i(37045);
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.cpx())
      {
        localh.cpa();
        localh.cpc();
      }
      else
      {
        localh.cpb();
      }
    }
    AppMethodBeat.o(37045);
  }

  public final List<h> cpt()
  {
    AppMethodBeat.i(37047);
    ArrayList localArrayList = new ArrayList(this.qZg.cqa());
    AppMethodBeat.o(37047);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d
 * JD-Core Version:    0.6.2
 */