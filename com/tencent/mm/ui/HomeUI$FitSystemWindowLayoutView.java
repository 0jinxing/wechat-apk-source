package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.TestTimeForChatting;

public class HomeUI$FitSystemWindowLayoutView extends FrameLayout
{
  private Rect mRect;
  private int yjv;
  private ViewGroup yjw;

  public HomeUI$FitSystemWindowLayoutView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(29389);
    this.mRect = new Rect();
    this.yjw = null;
    AppMethodBeat.o(29389);
  }

  public HomeUI$FitSystemWindowLayoutView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29388);
    this.mRect = new Rect();
    this.yjw = null;
    AppMethodBeat.o(29388);
  }

  @TargetApi(14)
  public boolean fitSystemWindows(Rect paramRect)
  {
    AppMethodBeat.i(29390);
    Object localObject1 = paramRect.toString();
    int i = this.yjv;
    int j = hashCode();
    Object localObject2;
    int k;
    label158: label234: boolean bool;
    if (paramRect.height() == 0)
    {
      localObject2 = ah.anW();
      ab.i("MicroMsg.LauncherUI", "fitSystemWindows beg %s, cacheInsetsTop:%d, hashCode:%d stack:%s", new Object[] { localObject1, Integer.valueOf(i), Integer.valueOf(j), localObject2 });
      if (paramRect.top > 0)
        this.yjv = paramRect.top;
      if ((this.yjw != null) && ((this.yjw.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
      {
        localObject2 = (ViewGroup.MarginLayoutParams)this.yjw.getLayoutParams();
        i = ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin;
        k = ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
        ab.i("MicroMsg.LauncherUI", "try to setFitSystemWindowsBottomRightPadding: %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
        j = 0;
        if (j < getChildCount())
        {
          localObject1 = getChildAt(j);
          if (!(localObject1 instanceof TestTimeForChatting))
            break label490;
          localObject1 = (TestTimeForChatting)localObject1;
          if ((Float.compare(i, a.fromDPToPix(((TestTimeForChatting)localObject1).getContext(), 48) * 1.5F) <= 0) && (i >= 0))
            break label473;
          ab.w("MicroMsg.TestTimeForChatting", "ERROR bottom padding %d", new Object[] { Integer.valueOf(i) });
          ((TestTimeForChatting)localObject1).zHY = 0;
          if ((Float.compare(k, a.fromDPToPix(((TestTimeForChatting)localObject1).getContext(), 48) * 1.5F) <= 0) && (k >= 0))
            break label481;
          ab.w("MicroMsg.TestTimeForChatting", "ERROR right padding %d", new Object[] { Integer.valueOf(i) });
          ((TestTimeForChatting)localObject1).zHZ = 0;
          label284: ab.i("MicroMsg.LauncherUI", "setFitSystemWindowsUseActionBarContainer: %d %d OK", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
        }
        ae.J(((ViewGroup.MarginLayoutParams)localObject2).leftMargin, ((ViewGroup.MarginLayoutParams)localObject2).topMargin, ((ViewGroup.MarginLayoutParams)localObject2).rightMargin, ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin);
      }
      this.mRect.set(paramRect);
      if (!d.iW(14))
        break label502;
      j = 0;
      label352: if (j >= getChildCount())
        break label502;
      localObject2 = getChildAt(j);
      if (!(localObject2 instanceof TestTimeForChatting))
        break label496;
      ((View)localObject2).setFitsSystemWindows(true);
      bool = ((TestTimeForChatting)localObject2).fitSystemWindows(paramRect);
      ((View)localObject2).setFitsSystemWindows(false);
    }
    while (true)
    {
      ab.i("MicroMsg.LauncherUI", "ashu::fitSystemWindows child ret %B, ApiLevel %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(Build.VERSION.SDK_INT) });
      bool = super.fitSystemWindows(this.mRect);
      ab.d("MicroMsg.LauncherUI", "ashu::fitSystemWindows super ret %B", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(29390);
      return bool;
      localObject2 = "pass";
      break;
      label473: ((TestTimeForChatting)localObject1).zHY = i;
      break label234;
      label481: ((TestTimeForChatting)localObject1).zHZ = k;
      break label284;
      label490: j++;
      break label158;
      label496: j++;
      break label352;
      label502: bool = false;
    }
  }

  public int getCacheInsetsTop()
  {
    return this.yjv;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29391);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(29391);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", localClassCastException, "", new Object[0]);
        ab.e("MicroMsg.LauncherUI.HomeUI", "my layout params %s %s", new Object[] { getLayoutParams(), getLayoutParams().getClass() });
        int i = getChildCount();
        View localView;
        for (int j = 0; j < i; j++)
        {
          localView = getChildAt(j);
          ab.e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", new Object[] { Integer.valueOf(j), localView, localView.getLayoutParams(), localView.getLayoutParams().getClass() });
        }
        for (j = 0; j < i; j++)
        {
          localView = getChildAt(j);
          if (((localView instanceof ImageView)) && (localView.getId() == 2131820648) && (localView.getLayoutParams() != null) && ((localView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) && (!(localView.getLayoutParams() instanceof FrameLayout.LayoutParams)))
            localView.setLayoutParams(new FrameLayout.LayoutParams(localView.getLayoutParams()));
          ab.e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", new Object[] { Integer.valueOf(j), localView, localView.getLayoutParams(), localView.getLayoutParams().getClass() });
        }
        super.onMeasure(paramInt1, paramInt2);
        AppMethodBeat.o(29391);
      }
    }
  }

  public void setActionBarContainer(ViewGroup paramViewGroup)
  {
    this.yjw = paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView
 * JD-Core Version:    0.6.2
 */