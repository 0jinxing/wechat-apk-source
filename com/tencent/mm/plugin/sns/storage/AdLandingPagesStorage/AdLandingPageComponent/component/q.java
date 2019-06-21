package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class q extends a
{
  private l qZg;
  LinearLayout raK;

  public q(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37200);
    super.coZ();
    Iterator localIterator = this.qZg.cqa().iterator();
    while (localIterator.hasNext())
      ((h)localIterator.next()).coZ();
    AppMethodBeat.o(37200);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37195);
    Iterator localIterator = this.qZg.cqa().iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.cpx())
        localh.cpa();
    }
    super.cpa();
    AppMethodBeat.o(37195);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37199);
    Iterator localIterator = this.qZg.cqa().iterator();
    while (localIterator.hasNext())
      ((h)localIterator.next()).cpb();
    super.cpb();
    AppMethodBeat.o(37199);
  }

  public final void cpc()
  {
    AppMethodBeat.i(37196);
    Iterator localIterator = this.qZg.cqa().iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if (localh.cpx())
        localh.cpc();
    }
    super.cpc();
    AppMethodBeat.o(37196);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37202);
    this.raK = ((LinearLayout)this.contentView.findViewById(2131827635));
    AppMethodBeat.o(37202);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37201);
    if (((s)this.qZo).qXd == 0)
      this.raK.setOrientation(1);
    label123: 
    while (true)
    {
      if (this.qZg == null)
      {
        this.qZg = new l(((s)this.qZo).qXc, this.context, this.raK);
        this.qZg.aZ();
        AppMethodBeat.o(37201);
      }
      while (true)
      {
        return;
        if (((s)this.qZo).qXd != 1)
          break label123;
        this.raK.setOrientation(0);
        break;
        this.qZg.dl(((s)this.qZo).qXc);
        AppMethodBeat.o(37201);
      }
    }
  }

  protected final void cpq()
  {
    AppMethodBeat.i(37198);
    ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qZo.qWS, (int)this.qZo.qWQ, (int)this.qZo.qWT, (int)this.qZo.qWR);
    this.contentView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(37198);
  }

  public final void cps()
  {
    AppMethodBeat.i(37197);
    Iterator localIterator = this.qZg.cqa().iterator();
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
    AppMethodBeat.o(37197);
  }

  public final List<h> cpt()
  {
    AppMethodBeat.i(37203);
    ArrayList localArrayList = new ArrayList(this.qZg.cqa());
    AppMethodBeat.o(37203);
    return localArrayList;
  }

  protected final int getLayout()
  {
    return 2130970725;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q
 * JD-Core Version:    0.6.2
 */