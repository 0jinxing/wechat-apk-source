package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ak;

final class m$1
  implements Runnable
{
  m$1(View paramView1, Context paramContext, View paramView2, View paramView3, ScrollView paramScrollView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107751);
    Object localObject1 = (ViewGroup.MarginLayoutParams)this.zGJ.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
    int j = a.fromDPToPix(this.val$context, this.zGK);
    int k;
    Object localObject2;
    if (this.zGL.getMeasuredHeight() > 0)
    {
      k = ((WindowManager)this.val$context.getSystemService("window")).getDefaultDisplay().getHeight();
      localObject2 = new int[2];
      if (this.zGM.getTag(this.zGM.getId()) == null)
      {
        this.zGM.getLocationOnScreen((int[])localObject2);
        this.zGM.setTag(this.zGM.getId(), localObject2);
        if (k < localObject2[1] + this.zGM.getMeasuredHeight() + this.zGK + this.zGJ.getMeasuredHeight())
          break label409;
        k = k - ak.hF(this.val$context) - f.de(this.val$context) - this.zGJ.getMeasuredHeight();
        if (!bo.gW(i, k))
          break label207;
        AppMethodBeat.o(107751);
      }
    }
    while (true)
    {
      return;
      localObject2 = (int[])this.zGM.getTag(this.zGM.getId());
      break;
      label207: localObject1 = (ViewGroup)this.zGN.getChildAt(0);
      if (bo.C(this.zGJ.getTag(), "no_first"))
      {
        ((ViewGroup)this.zGJ.getParent()).removeView(this.zGJ);
        ((ViewGroup)localObject1).addView(this.zGJ);
      }
      while (true)
      {
        localObject2 = (ViewGroup.MarginLayoutParams)this.zGJ.getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject2).topMargin = k;
        ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin = 0;
        this.zGJ.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        this.zGJ.setVisibility(0);
        this.zGJ.setTag("no_first");
        this.zGN.requestLayout();
        AppMethodBeat.o(107751);
        break;
        this.zGN.removeView((View)localObject1);
        ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
        localObject2 = new RelativeLayout(this.val$context);
        ((RelativeLayout)localObject2).addView((View)localObject1);
        ((RelativeLayout)localObject2).setLayoutParams(localLayoutParams);
        this.zGN.addView((View)localObject2);
        ((ViewGroup)this.zGJ.getParent()).removeView(this.zGJ);
        ((RelativeLayout)localObject2).addView(this.zGJ);
      }
      label409: if (bo.gW(i, j))
      {
        AppMethodBeat.o(107751);
      }
      else
      {
        ((ViewGroup)this.zGJ.getParent()).removeView(this.zGJ);
        ((ViewGroup)this.zGM.getParent()).addView(this.zGJ);
        do
        {
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = j;
          this.zGJ.setVisibility(0);
          this.zGJ.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          this.zGJ.requestLayout();
          AppMethodBeat.o(107751);
          break;
        }
        while (!bo.gW(i, j));
        AppMethodBeat.o(107751);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.m.1
 * JD-Core Version:    0.6.2
 */