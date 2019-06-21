package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.support.v4.view.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x;
import com.tencent.mm.plugin.sns.ui.al;
import com.tencent.mm.sdk.platformtools.ab;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

final class o$a extends p
{
  int backgroundColor;
  int ieu;
  int iev;
  Context mContext;
  LayoutInflater mLayoutInflater;
  HashMap<Integer, View> raA;
  HashMap<Integer, o.a.a> raB;
  Set<String> raC;
  x raw;
  private int rax;
  int ray;
  int raz;

  public o$a(Context paramContext, LayoutInflater paramLayoutInflater, x paramx, int paramInt)
  {
    AppMethodBeat.i(37170);
    this.rax = 600;
    this.ray = 700;
    this.raz = 250;
    this.raA = new HashMap();
    this.raB = new HashMap();
    this.raC = new HashSet();
    this.mContext = paramContext;
    this.mLayoutInflater = paramLayoutInflater;
    this.raw = paramx;
    this.backgroundColor = paramInt;
    paramContext = ad.eP(paramContext);
    this.ieu = paramContext[0];
    this.iev = paramContext[1];
    AppMethodBeat.o(37170);
  }

  private void i(ImageView paramImageView)
  {
    AppMethodBeat.i(37176);
    if ((paramImageView.getTag() != null) && ((paramImageView.getTag() instanceof String)) && (new BigInteger((String)paramImageView.getTag()).longValue() >= 1L))
      AppMethodBeat.o(37176);
    while (true)
    {
      return;
      paramImageView.setTag("1");
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 0.8F);
      localAlphaAnimation.setDuration(this.rax);
      localAlphaAnimation.setInterpolator(new DecelerateInterpolator(1.2F));
      localAlphaAnimation.setAnimationListener(new o.a.2(this, paramImageView));
      paramImageView.startAnimation(localAlphaAnimation);
      AppMethodBeat.o(37176);
    }
  }

  public final void Dn(int paramInt)
  {
    AppMethodBeat.i(37177);
    Object localObject = (View)this.raA.get(String.valueOf(paramInt));
    if (localObject == null)
      AppMethodBeat.o(37177);
    while (true)
    {
      return;
      localObject = (ImageView)((View)localObject).findViewById(2131827649);
      if ((localObject != null) && (((ImageView)localObject).getVisibility() == 0))
        i((ImageView)localObject);
      AppMethodBeat.o(37177);
    }
  }

  public final void Do(int paramInt)
  {
    AppMethodBeat.i(37178);
    Iterator localIterator = this.raB.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Integer)localIterator.next();
      o.a.a locala = (o.a.a)this.raB.get(localObject);
      if ((locala != null) && (locala.raI.size() != 0))
      {
        if (((Integer)localObject).intValue() == paramInt)
        {
          i = 0;
          label77: if (i < locala.raI.size())
          {
            localObject = (h)locala.raI.get(i);
            if (!((h)localObject).cpx())
              break label139;
            ((h)localObject).cpa();
            ((h)localObject).cpc();
            this.raC.add(((h)localObject).cpy());
          }
          while (true)
          {
            i++;
            break label77;
            break;
            label139: if (this.raC.contains(((h)localObject).cpy()))
            {
              ((h)localObject).cpb();
              this.raC.remove(((h)localObject).cpy());
            }
          }
        }
        for (int i = 0; i < locala.raI.size(); i++)
        {
          localObject = (h)locala.raI.get(i);
          if (this.raC.contains(((h)localObject).cpy()))
          {
            ((h)localObject).cpb();
            this.raC.remove(((h)localObject).cpy());
          }
        }
      }
    }
    AppMethodBeat.o(37178);
  }

  public final List<h> cpM()
  {
    AppMethodBeat.i(37179);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.raB.values().iterator();
    while (localIterator.hasNext())
      localArrayList.addAll(((o.a.a)localIterator.next()).raI);
    AppMethodBeat.o(37179);
    return localArrayList;
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(37174);
    paramViewGroup.removeView((View)paramObject);
    this.raA.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(37174);
  }

  public final int getCount()
  {
    AppMethodBeat.i(37171);
    int i = this.raw.qWB.size();
    AppMethodBeat.o(37171);
    return i;
  }

  public final int getItemPosition(Object paramObject)
  {
    AppMethodBeat.i(37175);
    Iterator localIterator = this.raA.keySet().iterator();
    int i;
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if (this.raA.get(Integer.valueOf(i)) == paramObject)
        AppMethodBeat.o(37175);
    }
    while (true)
    {
      return i;
      i = -2;
      AppMethodBeat.o(37175);
    }
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(37173);
    ab.d("MicroMsg.Sns.AdLandingPageGroupListComponent", "instantiateItem %d", new Object[] { Integer.valueOf(paramInt) });
    if (this.raA.containsKey(Integer.valueOf(paramInt)))
    {
      paramViewGroup = this.raA.get(Integer.valueOf(paramInt));
      AppMethodBeat.o(37173);
      return paramViewGroup;
    }
    ab.d("MicroMsg.Sns.AdLandingPageGroupListComponent", "inflate Item %d", new Object[] { Integer.valueOf(paramInt) });
    View localView = this.mLayoutInflater.inflate(2130970731, paramViewGroup, false);
    LinearLayout localLinearLayout = (LinearLayout)localView.findViewById(2131827648);
    localLinearLayout.setBackgroundColor(this.backgroundColor);
    Object localObject1 = (o.a.a)this.raB.get(Integer.valueOf(paramInt));
    LinkedList localLinkedList = ((l)this.raw.qWB.get(paramInt)).qWB;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (((o.a.a)localObject1).raI.size() != 0);
    }
    else
    {
      localObject2 = new o.a.a(this);
      if (localLinkedList != null)
        for (int i = 0; i < localLinkedList.size(); i++)
        {
          localObject1 = (r)localLinkedList.get(i);
          ab.i("MicroMsg.Sns.AdLandingPageGroupListComponent", "gen component %s", new Object[] { ((r)localObject1).qWO });
          localObject1 = al.a(this.mContext, (r)localObject1, localLinearLayout, this.backgroundColor);
          ((o.a.a)localObject2).raI.add(localObject1);
        }
      this.raB.put(Integer.valueOf(paramInt), localObject2);
    }
    Object localObject2 = ((o.a.a)localObject2).raI.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = ((h)((Iterator)localObject2).next()).getView();
      if ((((View)localObject1).getParent() != null) && ((((View)localObject1).getParent() instanceof ViewGroup)))
        ((ViewGroup)((View)localObject1).getParent()).removeView((View)localObject1);
      localLinearLayout.addView((View)localObject1);
    }
    localObject2 = (ImageView)localView.findViewById(2131827649);
    localObject1 = (TextView)localView.findViewById(2131827650);
    if (this.backgroundColor + 16777216 <= -1 - this.backgroundColor)
      ((ImageView)localObject2).setImageDrawable(a.g(this.mContext, 2130839768));
    while (true)
    {
      if (this.raw.qXu != 1)
        break label522;
      ((ImageView)localObject2).setVisibility(8);
      ((TextView)localObject1).setVisibility(8);
      localView.setLayoutParams(new RelativeLayout.LayoutParams(this.ieu, localLinearLayout.getMeasuredHeight()));
      localView.setBackgroundColor(this.backgroundColor);
      paramViewGroup.addView(localView);
      paramViewGroup.setBackgroundColor(this.backgroundColor);
      this.raA.put(Integer.valueOf(paramInt), localView);
      AppMethodBeat.o(37173);
      paramViewGroup = localView;
      break;
      ((ImageView)localObject2).setImageDrawable(a.g(this.mContext, 2130839771));
    }
    label522: if (paramInt == this.raw.qWB.size() - 1)
      ((ImageView)localObject2).setVisibility(8);
    while (true)
    {
      ((TextView)localObject1).setText(paramInt + 1 + "/" + this.raw.qWB.size());
      break;
      ((ImageView)localObject2).setVisibility(0);
    }
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == (View)paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setPrimaryItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(37172);
    super.setPrimaryItem(paramViewGroup, paramInt, paramObject);
    AppMethodBeat.o(37172);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o.a
 * JD-Core Version:    0.6.2
 */