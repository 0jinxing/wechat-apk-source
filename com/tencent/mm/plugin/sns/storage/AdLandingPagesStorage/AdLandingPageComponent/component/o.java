package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.y;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class o extends a
{
  private static final Map<String, Bitmap> rao;
  ViewPager rap;
  o.a raq;
  AdLandingControlView rar;
  private int ras;
  private int rat;

  static
  {
    AppMethodBeat.i(37191);
    rao = new WeakHashMap();
    AppMethodBeat.o(37191);
  }

  public o(Context paramContext, x paramx, ViewGroup paramViewGroup)
  {
    super(paramContext, paramx, paramViewGroup);
    AppMethodBeat.i(37181);
    this.ras = 0;
    this.rat = 0;
    this.rar = new AdLandingControlView(paramContext);
    AppMethodBeat.o(37181);
  }

  public final void ae(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(37185);
    super.ae(paramMap);
    if (paramMap.containsKey("startIndex"));
    while (true)
    {
      try
      {
        this.ras = ((Integer)paramMap.get("startIndex")).intValue();
        this.rap.setCurrentItem(this.ras, false);
        AppMethodBeat.o(37185);
        return;
      }
      catch (Exception paramMap)
      {
      }
      AppMethodBeat.o(37185);
    }
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(37189);
    boolean bool;
    if (!super.al(paramJSONObject))
    {
      bool = false;
      AppMethodBeat.o(37189);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(37189);
    }
  }

  public final void cpA()
  {
    AppMethodBeat.i(37186);
    super.cpA();
    this.rap.setCurrentItem(this.ras, false);
    AppMethodBeat.o(37186);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37182);
    this.raq.Dn(this.rat);
    this.raq.Do(this.rat);
    super.cpa();
    AppMethodBeat.o(37182);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37183);
    this.raq.Do(-1);
    super.cpb();
    AppMethodBeat.o(37183);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37188);
    View localView = this.contentView;
    this.rap = ((ViewPager)localView.findViewById(2131827651));
    this.rar = ((AdLandingControlView)localView.findViewById(2131827652));
    AppMethodBeat.o(37188);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37187);
    int i = this.ieu - (int)((x)this.qZo).qWS - (int)((x)this.qZo).qWT;
    int j = this.iev;
    Object localObject1 = (LayoutInflater)this.context.getSystemService("layout_inflater");
    o.a locala;
    if (this.rap.getAdapter() == null)
    {
      locala = new o.a(this.context, (LayoutInflater)localObject1, (x)this.qZo, this.backgroundColor);
      this.rap.setOnPageChangeListener(new o.1(this, locala));
      this.rap.setAdapter(locala);
      this.rar.hj(((x)this.qZo).qWB.size(), 0);
      if (!((x)this.qZo).iXr)
        break label207;
      this.rap.setLayoutParams(new RelativeLayout.LayoutParams(i, j));
    }
    label207: 
    while (((x)this.qZo).qWB.size() <= 0)
    {
      this.raq = locala;
      locala.notifyDataSetChanged();
      AppMethodBeat.o(37187);
      return;
      locala = (o.a)this.rap.getAdapter();
      locala.raw = ((x)this.qZo);
      break;
    }
    Object localObject2 = (l)((x)this.qZo).qWB.get(0);
    new LinearLayout(this.context).setOrientation(1);
    int k = 0;
    Iterator localIterator = ((l)localObject2).qWB.iterator();
    label270: Object localObject3;
    if (localIterator.hasNext())
    {
      localObject2 = (r)localIterator.next();
      k = (int)(k + ((r)localObject2).qWQ);
      if ((localObject2 instanceof u))
      {
        localObject3 = (u)localObject2;
        View localView = ((LayoutInflater)localObject1).inflate(2130970730, null);
        localView.setBackgroundColor(this.backgroundColor);
        ((TextView)localView.findViewById(2131827647)).setText(((u)localObject3).qXk);
        int m = View.MeasureSpec.makeMeasureSpec(0, 0);
        int n = View.MeasureSpec.makeMeasureSpec(0, 0);
        ((TextView)localView.findViewById(2131827647)).measure(m, n);
        n = ((TextView)localView.findViewById(2131827647)).getPaddingTop();
        m = ((TextView)localView.findViewById(2131827647)).getHeight();
        k = ((TextView)localView.findViewById(2131827647)).getPaddingBottom() + (k + n + m);
      }
    }
    while (true)
    {
      float f1 = k;
      k = (int)(((r)localObject2).qWR + f1);
      break label270;
      if ((localObject2 instanceof k))
      {
        localObject3 = (Button)((LayoutInflater)localObject1).inflate(2130970720, null).findViewById(2131827628);
        ((Button)localObject3).setText(((k)localObject2).title);
        ((Button)localObject3).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        k = ((Button)localObject3).getPaddingTop() + k;
        if ((((r)localObject2).qWV > 0.0F) && ((int)((r)localObject2).qWV != 2147483647))
          k = (int)(k + ((r)localObject2).qWV);
        while (true)
        {
          k = ((Button)localObject3).getPaddingBottom() + k;
          break;
          if ((((r)localObject2).height > 0.0F) && ((int)((r)localObject2).height != 2147483647))
            k = (int)(k + ((r)localObject2).height);
          else
            k += ((Button)localObject3).getHeight();
        }
      }
      if ((localObject2 instanceof n))
      {
        float f2 = 0.0F;
        f1 = 0.0F;
        float f3 = ((r)localObject2).qWQ;
        float f4 = ((r)localObject2).qWR;
        if ((localObject2 instanceof n))
        {
          localObject3 = (n)localObject2;
          f2 = ((n)localObject3).height;
          f1 = ((n)localObject3).width;
        }
        if (((int)f2 != 0) && ((int)f1 != 0))
        {
          float f5 = k;
          k = (int)(f2 * i / f1 + f5);
        }
        while (true)
        {
          k = (int)((int)(k + f3) + f4);
          break;
          k += j;
        }
      }
      if ((localObject2 instanceof m))
      {
        k += j;
      }
      else if ((localObject2 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o))
      {
        localObject3 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject2;
        if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject3).qWL == 1)
        {
          k += j;
        }
        else if ((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject3).width > 0)
        {
          k = (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject3).height * i / (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject3).width + k;
        }
        else
        {
          f1 = k;
          k = (int)(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o)localObject3).height + f1);
        }
      }
      else if ((localObject2 instanceof z))
      {
        localObject3 = (z)localObject2;
        if (((z)localObject3).qXw == 1)
        {
          if ((int)((z)localObject3).width > 0)
          {
            k = (int)((z)localObject3).height * i / (int)((z)localObject3).width + k;
          }
          else
          {
            f1 = k;
            k = (int)(((z)localObject3).height + f1);
          }
        }
        else
          k += j;
      }
      else if ((localObject2 instanceof y))
      {
        k += j;
        continue;
        localObject1 = new RelativeLayout.LayoutParams(i, k);
        ((RelativeLayout.LayoutParams)localObject1).leftMargin = ((int)((x)this.qZo).qWS);
        ((RelativeLayout.LayoutParams)localObject1).rightMargin = ((int)((x)this.qZo).qWT);
        this.rap.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        break;
      }
    }
  }

  public final void cps()
  {
    AppMethodBeat.i(37184);
    this.raq.Do(this.rat);
    AppMethodBeat.o(37184);
  }

  public final List<h> cpt()
  {
    AppMethodBeat.i(37190);
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(((o.a)this.rap.getAdapter()).cpM());
    AppMethodBeat.o(37190);
    return localArrayList;
  }

  protected final int getLayout()
  {
    return 2130970732;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o
 * JD-Core Version:    0.6.2
 */