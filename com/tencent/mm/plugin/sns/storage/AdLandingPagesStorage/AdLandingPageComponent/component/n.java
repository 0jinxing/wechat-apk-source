package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.l;
import com.tencent.mm.ui.base.CustomScrollView;
import com.tencent.mm.ui.widget.RoundedCornerRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n extends a
{
  List<h> bnR;
  private l qZg;
  private p ral;
  private CustomScrollView ram;

  public n(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    super(paramContext, paramp, paramViewGroup);
    AppMethodBeat.i(37153);
    this.ral = paramp;
    this.bnR = new ArrayList();
    AppMethodBeat.o(37153);
  }

  public final void a(r paramr)
  {
    AppMethodBeat.i(37162);
    if ((paramr instanceof p))
      this.ral = ((p)paramr);
    super.a(paramr);
    AppMethodBeat.o(37162);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37160);
    super.coZ();
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
      ((h)localIterator.next()).coZ();
    AppMethodBeat.o(37160);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37156);
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.cpx())
        localh.cpa();
    }
    super.cpa();
    AppMethodBeat.o(37156);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37157);
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
      ((h)localIterator.next()).cpb();
    super.cpb();
    AppMethodBeat.o(37157);
  }

  public final void cpc()
  {
    AppMethodBeat.i(37158);
    Iterator localIterator = this.bnR.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.cpx())
        localh.cpc();
    }
    super.cpc();
    AppMethodBeat.o(37158);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37154);
    if (this.qZg == null)
    {
      this.qZg = new l(this.ral.bnR, this.context, this.ram);
      this.qZg.aZ();
      this.bnR = cpt();
    }
    while (true)
    {
      if (getGravity() == 0)
      {
        ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
        if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
          ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qZo.qWS, (int)this.qZo.qWQ, (int)this.qZo.qWT, (int)this.qZo.qWR);
        this.contentView.setLayoutParams(localLayoutParams);
      }
      AppMethodBeat.o(37154);
      return;
      this.qZg.dl(this.ral.bnR);
    }
  }

  protected final View cpr()
  {
    AppMethodBeat.i(37155);
    RoundedCornerRelativeLayout localRoundedCornerRelativeLayout = new RoundedCornerRelativeLayout(this.context);
    this.ram = new CustomScrollView(this.context);
    this.ram.setOverScrollMode(2);
    this.ram.setHorizontalScrollBarEnabled(false);
    this.ram.setVerticalScrollBarEnabled(false);
    this.ram.setOnScrollChangeListener(new n.1(this));
    localRoundedCornerRelativeLayout.setBackgroundColor(this.backgroundColor);
    localRoundedCornerRelativeLayout.addView(this.ram);
    localRoundedCornerRelativeLayout.setRadius(this.ral.qWN);
    AppMethodBeat.o(37155);
    return localRoundedCornerRelativeLayout;
  }

  public final void cps()
  {
    AppMethodBeat.i(37159);
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
    AppMethodBeat.o(37159);
  }

  public final List<h> cpt()
  {
    AppMethodBeat.i(37161);
    ArrayList localArrayList = new ArrayList(this.qZg.cqa());
    AppMethodBeat.o(37161);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n
 * JD-Core Version:    0.6.2
 */