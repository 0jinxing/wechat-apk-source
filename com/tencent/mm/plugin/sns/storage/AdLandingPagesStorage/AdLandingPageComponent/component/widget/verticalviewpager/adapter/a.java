package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.plugin.sns.ui.al;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a extends RecyclerView.a<RecyclerView.v>
  implements c.b
{
  int bgColor;
  private Context context;
  private LinearLayoutManager qYM;
  g rcX;
  private LinkedHashMap<String, h> rcY;
  int rcZ;

  public a(g paramg, int paramInt, Context paramContext, LinearLayoutManager paramLinearLayoutManager)
  {
    AppMethodBeat.i(37600);
    this.qYM = paramLinearLayoutManager;
    this.rcX = paramg;
    this.rcY = new LinkedHashMap();
    this.bgColor = paramInt;
    this.context = paramContext;
    AppMethodBeat.o(37600);
  }

  private h Dy(int paramInt)
  {
    AppMethodBeat.i(37608);
    Object localObject = (r)this.rcX.rej.get(paramInt);
    localObject = (h)this.rcY.get(((r)localObject).qWO);
    AppMethodBeat.o(37608);
    return localObject;
  }

  public final void Dt(int paramInt)
  {
    AppMethodBeat.i(37609);
    if ((paramInt < 0) || (paramInt >= this.rcX.rej.size()))
    {
      ab.w("MicroMsg.ContentAdapter", "endExposure index[%d], size[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.rcX.rej.size()) });
      AppMethodBeat.o(37609);
    }
    while (true)
    {
      return;
      Object localObject = (r)this.rcX.rej.get(paramInt);
      localObject = (h)this.rcY.get(((r)localObject).qWO);
      if (localObject != null)
        ((h)localObject).cpb();
      AppMethodBeat.o(37609);
    }
  }

  public final boolean Du(int paramInt)
  {
    AppMethodBeat.i(37604);
    boolean bool;
    if ((paramInt < this.qYM.iQ()) || (paramInt > this.qYM.iS()))
    {
      ab.v("MicroMsg.ContentAdapter", "index %d not visible");
      AppMethodBeat.o(37604);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = (r)this.rcX.rej.get(paramInt);
      localObject = (h)this.rcY.get(((r)localObject).qWO);
      if (localObject != null)
      {
        ab.d("MicroMsg.ContentAdapter", "comp %s, isExposure %s", new Object[] { localObject, Boolean.valueOf(((h)localObject).cpx()) });
        bool = ((h)localObject).cpx();
        AppMethodBeat.o(37604);
      }
      else
      {
        AppMethodBeat.o(37604);
        bool = false;
      }
    }
  }

  public final boolean Dv(int paramInt)
  {
    AppMethodBeat.i(37605);
    boolean bool = i.Dz(((r)this.rcX.rej.get(paramInt)).type);
    AppMethodBeat.o(37605);
    return bool;
  }

  public final void Dw(int paramInt)
  {
    AppMethodBeat.i(37607);
    h localh = Dy(paramInt);
    if (i.Dz(localh.cpv().type))
      ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a)localh).cps();
    AppMethodBeat.o(37607);
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(37601);
    paramViewGroup = new a.a(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968630, paramViewGroup, false));
    AppMethodBeat.o(37601);
    return paramViewGroup;
  }

  public final void a(int paramInt, c paramc)
  {
    AppMethodBeat.i(37606);
    Object localObject = (r)this.rcX.rej.get(paramInt);
    h localh = (h)this.rcY.get(((r)localObject).qWO);
    if (localh != null)
    {
      localh.cpa();
      localh.cpc();
      if ((((r)localObject).type == 61) || (((r)localObject).type == 62))
      {
        localObject = new ArrayList();
        Iterator localIterator = paramc.qYL.entrySet().iterator();
        while (localIterator.hasNext())
        {
          paramc = (Map.Entry)localIterator.next();
          if (((c.a)paramc.getValue()).qVK)
            ((List)localObject).add(paramc.getKey());
        }
        paramc = ((List)localObject).iterator();
        while (paramc.hasNext())
        {
          int i = ((Integer)paramc.next()).intValue();
          if ((i != paramInt) && (Du(i)))
          {
            localObject = Dy(i);
            if ((localObject instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a))
            {
              localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject;
              if ((((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject).qVI) && (this.rcX.mTL) && (i == 0))
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localh).coY();
              else if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localh).qVI)
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject).coY();
            }
          }
        }
      }
    }
    AppMethodBeat.o(37606);
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(37602);
    ab.i("MicroMsg.ContentAdapter", "display page " + this.rcX.id + ", pos " + paramInt);
    a.a locala = (a.a)paramv;
    a.a.a(locala).removeAllViews();
    r localr = (r)this.rcX.rej.get(paramInt);
    paramv = (h)this.rcY.get(localr.qWO);
    int i = this.bgColor;
    int j = i;
    if (localr.qWX != null)
    {
      j = i;
      if (localr.qWX.length() <= 0);
    }
    try
    {
      j = Color.parseColor(localr.qWX);
      a.a.a(locala).setBackgroundColor(j);
      if (paramv != null)
      {
        paramv.a((r)this.rcX.rej.get(paramInt));
        if (paramv != null)
        {
          paramv = paramv.getView();
          if ((paramv.getParent() != null) && ((paramv.getParent() instanceof ViewGroup)))
            ((ViewGroup)paramv.getParent()).removeView(paramv);
          a.a.a(locala).addView(paramv);
        }
        if (paramInt == 0)
        {
          h localh1 = (h)cqa().iterator().next();
          if ((localh1 != null) && ((localh1 instanceof o)))
          {
            paramv = new HashMap();
            paramv.put("startIndex", Integer.valueOf(this.rcZ));
            localh1.ae(paramv);
          }
        }
        AppMethodBeat.o(37602);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ContentAdapter", "parse cellBackgroundColor error: %s", new Object[] { localr.qWX });
        j = i;
        continue;
        h localh2 = al.a(a.a.a(locala).getContext(), localr, a.a.a(locala), j);
        paramv = localh2;
        if (localh2 != null)
        {
          this.rcY.put(localr.qWO, localh2);
          paramv = localh2;
        }
      }
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(37611);
    if (this.rcX != paramg)
    {
      this.rcX = paramg;
      this.aop.notifyChanged();
    }
    AppMethodBeat.o(37611);
  }

  public final Collection<h> cqa()
  {
    AppMethodBeat.i(37612);
    Object localObject;
    if (this.rcY == null)
    {
      localObject = Collections.EMPTY_LIST;
      AppMethodBeat.o(37612);
    }
    while (true)
    {
      return localObject;
      localObject = this.rcY.values();
      AppMethodBeat.o(37612);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(37603);
    int i = this.rcX.rej.size();
    AppMethodBeat.o(37603);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    return paramInt;
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(37610);
    Iterator localIterator = this.rcY.entrySet().iterator();
    while (localIterator.hasNext())
      ((h)((Map.Entry)localIterator.next()).getValue()).coZ();
    AppMethodBeat.o(37610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.a
 * JD-Core Version:    0.6.2
 */