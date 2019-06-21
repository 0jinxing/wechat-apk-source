package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.c;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class a extends h
{
  public a(Context paramContext, c paramc, ViewGroup paramViewGroup)
  {
    super(paramContext, paramc, paramViewGroup);
  }

  protected final void a(LinearLayout paramLinearLayout)
  {
    Object localObject = (c)this.qZo;
    if (paramLinearLayout == null)
      return;
    int i = Double.compare(((c)localObject).qWa, ((c)localObject).qWb);
    int j = (int)((c)localObject).qWa;
    int k = (int)((c)localObject).qWb;
    int m;
    if (i == 0)
    {
      m = k;
      i = j;
      if (j == 0)
      {
        m = 1;
        i = 1;
      }
    }
    while (true)
    {
      ab.i("AdLandingBorderedComp", "border width top %d,bottom %d", new Object[] { Integer.valueOf(i), Integer.valueOf(m) });
      if (i > 0)
      {
        localLinearLayout = new LinearLayout(paramLinearLayout.getContext());
        localLinearLayout.setBackgroundColor(((c)localObject).borderColor);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, i);
        localLayoutParams.gravity = 48;
        paramLinearLayout.addView(localLinearLayout, 0, localLayoutParams);
      }
      if (m <= 0)
        break;
      LinearLayout localLinearLayout = new LinearLayout(paramLinearLayout.getContext());
      localLinearLayout.setBackgroundColor(((c)localObject).borderColor);
      localObject = new LinearLayout.LayoutParams(-1, m);
      ((LinearLayout.LayoutParams)localObject).gravity = 80;
      paramLinearLayout.addView(localLinearLayout, (ViewGroup.LayoutParams)localObject);
      break;
      int n = j;
      if (j == 0)
      {
        n = j;
        if (((c)localObject).qWa != 0.0D)
          n = 1;
      }
      m = k;
      i = n;
      if (k == 0)
      {
        m = k;
        i = n;
        if (((c)localObject).qWb != 0.0D)
        {
          m = 1;
          i = n;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a
 * JD-Core Version:    0.6.2
 */