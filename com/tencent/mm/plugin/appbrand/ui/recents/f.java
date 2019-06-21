package com.tencent.mm.plugin.appbrand.ui.recents;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.t;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class f extends a
  implements a.a
{
  private final List<a> iNE;
  private final List<Class<? extends a>> iNF;
  private boolean iNG;
  private final a iNH;
  ViewGroup ius;

  public f(Activity paramActivity, ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(133417);
    this.iNF = new LinkedList();
    if ((paramActivity == null) || (paramViewGroup == null))
    {
      paramActivity = new IllegalStateException("Unexpected parameters");
      AppMethodBeat.o(133417);
      throw paramActivity;
    }
    this.iNH = new a(paramActivity, (byte)0);
    this.iNG = paramBoolean2;
    paramViewGroup = new LinearLayout(paramViewGroup.getContext());
    paramViewGroup.setOrientation(1);
    this.ius = paramViewGroup;
    this.iNE = a(paramActivity, this.ius, paramBoolean1);
    a(this.iNE, this.ius);
    aP(this.iNE);
    AppMethodBeat.o(133417);
  }

  private void a(List<a> paramList, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133424);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(133424);
    while (true)
    {
      return;
      if (paramViewGroup != null)
        break;
      AppMethodBeat.o(133424);
    }
    int i = 0;
    if (i < paramList.size())
    {
      localObject1 = (a)paramList.get(i);
      paramViewGroup.addView(((a)localObject1).aNi());
      Object localObject2;
      if (i != paramList.size() - 1)
      {
        if (i != 0)
          paramList.get(i - 1);
        localObject2 = (a)paramList.get(i + 1);
        if ((!this.iNF.contains(localObject1.getClass())) && (!this.iNF.contains(localObject2.getClass())))
          break label183;
        localObject1 = new LinearLayout(paramViewGroup.getContext());
        ((LinearLayout)localObject1).setOrientation(1);
        j((ViewGroup)localObject1);
        paramViewGroup.addView((View)localObject1, -1, -2);
      }
      while (true)
      {
        i++;
        break;
        label183: if (this.iNG)
        {
          int j = paramViewGroup.getContext().getResources().getDimensionPixelOffset(2131428080);
          int k = paramViewGroup.getContext().getResources().getDimensionPixelOffset(2131428070);
          localObject1 = new LinearLayout(paramViewGroup.getContext());
          ((LinearLayout)localObject1).setOrientation(0);
          paramViewGroup.addView((View)localObject1, -1, -2);
          localObject2 = paramViewGroup.getContext();
          Object localObject3 = new View((Context)localObject2);
          ((View)localObject3).setBackgroundColor(-1);
          Object localObject4 = new LinearLayout.LayoutParams(k, j);
          ((LinearLayout.LayoutParams)localObject4).gravity = 3;
          ((LinearLayout)localObject1).addView((View)localObject3, (ViewGroup.LayoutParams)localObject4);
          localObject4 = new View((Context)localObject2);
          ((View)localObject4).setBackgroundColor(paramViewGroup.getResources().getColor(2131689719));
          localObject3 = new LinearLayout.LayoutParams(0, j, 1.0F);
          ((LinearLayout.LayoutParams)localObject3).gravity = 17;
          ((LinearLayout)localObject1).addView((View)localObject4, (ViewGroup.LayoutParams)localObject3);
          localObject4 = new View((Context)localObject2);
          ((View)localObject4).setBackgroundColor(-1);
          localObject2 = new LinearLayout.LayoutParams(k, j);
          ((LinearLayout.LayoutParams)localObject2).gravity = 5;
          ((LinearLayout)localObject1).addView((View)localObject4, (ViewGroup.LayoutParams)localObject2);
        }
        else
        {
          localObject1 = new View(paramViewGroup.getContext());
          ((View)localObject1).setBackgroundColor(-1);
          localObject2 = new LinearLayout.LayoutParams(this.iNH.iNJ, this.iNH.iNI);
          ((LinearLayout.LayoutParams)localObject2).gravity = 3;
          paramViewGroup.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
        }
      }
    }
    Object localObject1 = paramViewGroup.getContext();
    paramList = new ColorDrawable(this.iNH.iNM);
    localObject1 = new ImageView((Context)localObject1);
    if (this.iNG)
      ((ImageView)localObject1).setBackgroundColor(0);
    while (true)
    {
      paramViewGroup.addView((View)localObject1, 0, new LinearLayout.LayoutParams(-1, this.iNH.iNN));
      j(paramViewGroup);
      AppMethodBeat.o(133424);
      break;
      ((ImageView)localObject1).setImageDrawable(paramList);
      ((ImageView)localObject1).setBackgroundColor(-1);
    }
  }

  protected static void a(List<a> paramList, a parama)
  {
    AppMethodBeat.i(133419);
    if (parama != null)
      paramList.add(parama);
    AppMethodBeat.o(133419);
  }

  private void aNs()
  {
    int i = 0;
    AppMethodBeat.i(133432);
    Iterator localIterator = this.iNE.iterator();
    int j = 0;
    if (localIterator.hasNext())
    {
      if (!((a)localIterator.next()).aNj())
        break label152;
      j++;
    }
    label152: 
    while (true)
    {
      break;
      localIterator = this.iNE.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala.aNj())
        {
          if (i == 0)
            locala.pT(2130837766);
          while (true)
          {
            i++;
            break;
            if ((i == this.iNE.size() - 1) || (i == j - 1))
              locala.pT(2130837764);
            else
              locala.pT(2130837765);
          }
        }
      }
      AppMethodBeat.o(133432);
      return;
    }
  }

  private static void aP(List<a> paramList)
  {
    AppMethodBeat.i(133425);
    if (paramList == null)
      AppMethodBeat.o(133425);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        ((a)paramList.next()).eG(false);
      AppMethodBeat.o(133425);
    }
  }

  private void j(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133426);
    FrameLayout localFrameLayout = new FrameLayout(paramViewGroup.getContext());
    Object localObject = localFrameLayout.getContext();
    ColorDrawable localColorDrawable = new ColorDrawable(this.iNH.iNM);
    ImageView localImageView = new ImageView((Context)localObject);
    if (this.iNG)
    {
      localImageView.setBackgroundColor(0);
      localFrameLayout.addView(localImageView, -1, this.iNH.iNN);
      localFrameLayout.addView(new View((Context)localObject), -1, this.iNH.iNL);
      localObject = new ImageView((Context)localObject);
      if (!this.iNG)
        break label165;
      ((ImageView)localObject).setBackgroundColor(0);
    }
    while (true)
    {
      localFrameLayout.addView((View)localObject, -1, this.iNH.iNN);
      localFrameLayout.setId(2131820562);
      paramViewGroup.addView(localFrameLayout, -1, -2);
      AppMethodBeat.o(133426);
      return;
      localImageView.setImageDrawable(localColorDrawable);
      localImageView.setBackgroundColor(-1);
      break;
      label165: ((ImageView)localObject).setImageDrawable(localColorDrawable);
      ((ImageView)localObject).setBackgroundColor(-1);
    }
  }

  protected a a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133420);
    paramActivity = new j(paramActivity, paramViewGroup);
    paramActivity.iLV = this;
    AppMethodBeat.o(133420);
    return paramActivity;
  }

  protected List<a> a(Activity paramActivity, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    AppMethodBeat.i(133418);
    ArrayList localArrayList = new ArrayList(2);
    a(localArrayList, b(paramActivity, paramViewGroup, paramBoolean));
    a(localArrayList, c(paramActivity, paramViewGroup));
    a(localArrayList, b(paramActivity, paramViewGroup));
    a(localArrayList, a(paramActivity, paramViewGroup));
    AppMethodBeat.o(133418);
    return localArrayList;
  }

  public final void a(a parama, View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(133433);
    if (this.ius == null)
      AppMethodBeat.o(133433);
    Object localObject;
    while (true)
    {
      return;
      ab.i("AppBrandLauncherRecentsListHeaderController", "onViewEnabledChanged [%s] [%s] [%b]", new Object[] { parama, paramView, Boolean.valueOf(paramBoolean) });
      if ((this.ius != null) && (this.iNE != null))
        break;
      paramView = this.iNE.iterator();
      do
      {
        if (!paramView.hasNext())
          break;
        localObject = ((a)paramView.next()).aNi();
      }
      while ((localObject == null) || (((View)localObject).getVisibility() != 0));
      ab.i("AppBrandLauncherRecentsListHeaderController", "hasValidHeader %s", new Object[] { parama });
      i = 1;
      if (i == 0)
        break label339;
      this.ius.setVisibility(0);
      label141: if (this.iNG)
        aNs();
      AppMethodBeat.o(133433);
    }
    int i = 0;
    label164: if (i < this.iNE.size() - 1)
    {
      paramView = (a)this.iNE.get(i);
      if (paramView != null)
      {
        if (paramView.aNj())
          break label243;
        paramView = this.ius.getChildAt(this.ius.indexOfChild(paramView.aNi()) + 1);
        if (paramView != null)
          paramView.setVisibility(8);
      }
    }
    label339: label361: 
    while (true)
    {
      label237: i++;
      break label164;
      break;
      label243: int j = i + 1;
      label249: if (j < this.iNE.size())
      {
        localObject = (a)this.iNE.get(j);
        if ((localObject == null) || (!((a)localObject).aNj()));
      }
      for (j = 1; ; j = 0)
      {
        if (j == 0)
          break label361;
        paramView = this.ius.getChildAt(this.ius.indexOfChild(paramView.aNi()) + 1);
        if (paramView == null)
          break label237;
        paramView.setVisibility(0);
        break label237;
        j++;
        break label249;
        this.ius.setVisibility(8);
        break label141;
        i = 0;
        break;
      }
    }
  }

  public final void aNh()
  {
    AppMethodBeat.i(133427);
    Iterator localIterator = this.iNE.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).aNh();
    AppMethodBeat.o(133427);
  }

  public final View aNi()
  {
    return this.ius;
  }

  protected a b(Activity paramActivity, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133421);
    t.axH();
    paramActivity = new b(paramActivity, paramViewGroup);
    paramActivity.iLV = this;
    AppMethodBeat.o(133421);
    return paramActivity;
  }

  protected a b(Activity paramActivity, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    AppMethodBeat.i(133423);
    if (paramBoolean)
    {
      paramActivity = new c(paramActivity, paramViewGroup);
      paramActivity.iLV = this;
      AppMethodBeat.o(133423);
    }
    while (true)
    {
      return paramActivity;
      paramActivity = null;
      AppMethodBeat.o(133423);
    }
  }

  protected a c(Activity paramActivity, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133422);
    paramActivity = new i(paramActivity, paramViewGroup);
    paramActivity.iLV = this;
    AppMethodBeat.o(133422);
    return paramActivity;
  }

  public final void eH(boolean paramBoolean)
  {
  }

  public final void onDetached()
  {
    AppMethodBeat.i(133428);
    Iterator localIterator = this.iNE.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).onDetached();
    this.iNE.clear();
    AppMethodBeat.o(133428);
  }

  public final void onResume()
  {
    AppMethodBeat.i(133429);
    Iterator localIterator = this.iNE.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).onResume();
    AppMethodBeat.o(133429);
  }

  public final void pS(int paramInt)
  {
    AppMethodBeat.i(133430);
    Iterator localIterator = this.iNE.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).pS(paramInt);
    AppMethodBeat.o(133430);
  }

  public final void pT(int paramInt)
  {
    AppMethodBeat.i(133431);
    aNs();
    AppMethodBeat.o(133431);
  }

  final class a
  {
    final int iNI;
    final int iNJ;
    private final int iNK;
    final int iNL;
    final int iNM;
    final int iNN;

    private a(Context arg2)
    {
      AppMethodBeat.i(133416);
      Context localContext;
      this.iNI = e.c(localContext, 1.0F);
      this.iNJ = com.tencent.mm.bz.a.fromDPToPix(localContext, 20);
      this.iNK = 0;
      this.iNL = com.tencent.mm.bz.a.fromDPToPix(localContext, 12);
      this.iNM = com.tencent.mm.bz.a.i(localContext, 2131689710);
      this.iNN = 2;
      AppMethodBeat.o(133416);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.f
 * JD-Core Version:    0.6.2
 */