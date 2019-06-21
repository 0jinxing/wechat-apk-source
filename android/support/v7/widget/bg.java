package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

final class bg
{
  private final View WL;
  private final WindowManager.LayoutParams auN = new WindowManager.LayoutParams();
  private final Rect auO = new Rect();
  private final int[] auP = new int[2];
  private final int[] auQ = new int[2];
  private final Context mContext;
  private final TextView ma;

  bg(Context paramContext)
  {
    this.mContext = paramContext;
    this.WL = LayoutInflater.from(this.mContext).inflate(2130968610, null);
    this.ma = ((TextView)this.WL.findViewById(2131820956));
    this.auN.setTitle(getClass().getSimpleName());
    this.auN.packageName = this.mContext.getPackageName();
    this.auN.type = 1002;
    this.auN.width = -2;
    this.auN.height = -2;
    this.auN.format = -3;
    this.auN.windowAnimations = 2131493033;
    this.auN.flags = 24;
  }

  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, WindowManager.LayoutParams paramLayoutParams)
  {
    paramLayoutParams.token = paramView.getApplicationWindowToken();
    int i = this.mContext.getResources().getDimensionPixelOffset(2131428721);
    if (paramView.getWidth() < i)
      paramInt1 = paramView.getWidth() / 2;
    int j;
    Object localObject1;
    label102: int k;
    if (paramView.getHeight() >= i)
    {
      i = this.mContext.getResources().getDimensionPixelOffset(2131428720);
      j = paramInt2 + i;
      i = paramInt2 - i;
      paramInt2 = j;
      paramLayoutParams.gravity = 49;
      localObject1 = this.mContext.getResources();
      if (!paramBoolean)
        break label134;
      j = 2131428724;
      k = ((Resources)localObject1).getDimensionPixelOffset(j);
      localObject1 = bU(paramView);
      if (localObject1 != null)
        break label141;
    }
    label134: label141: label405: 
    while (true)
    {
      return;
      paramInt2 = paramView.getHeight();
      i = 0;
      break;
      j = 2131428723;
      break label102;
      ((View)localObject1).getWindowVisibleDisplayFrame(this.auO);
      Object localObject2;
      if ((this.auO.left < 0) && (this.auO.top < 0))
      {
        localObject2 = this.mContext.getResources();
        j = ((Resources)localObject2).getIdentifier("status_bar_height", "dimen", "android");
        if (j == 0)
          break label377;
      }
      label377: for (j = ((Resources)localObject2).getDimensionPixelSize(j); ; j = 0)
      {
        localObject2 = ((Resources)localObject2).getDisplayMetrics();
        this.auO.set(0, j, ((DisplayMetrics)localObject2).widthPixels, ((DisplayMetrics)localObject2).heightPixels);
        ((View)localObject1).getLocationOnScreen(this.auQ);
        paramView.getLocationOnScreen(this.auP);
        paramView = this.auP;
        paramView[0] -= this.auQ[0];
        paramView = this.auP;
        paramView[1] -= this.auQ[1];
        paramLayoutParams.x = (this.auP[0] + paramInt1 - ((View)localObject1).getWidth() / 2);
        paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.WL.measure(paramInt1, paramInt1);
        paramInt1 = this.WL.getMeasuredHeight();
        i = i + this.auP[1] - k - paramInt1;
        paramInt2 = paramInt2 + this.auP[1] + k;
        if (!paramBoolean)
          break label383;
        if (i >= 0)
          break label405;
        paramLayoutParams.y = paramInt2;
        break;
      }
      label383: if (paramInt1 + paramInt2 <= this.auO.height())
        paramLayoutParams.y = paramInt2;
      else
        paramLayoutParams.y = i;
    }
  }

  private static View bU(View paramView)
  {
    View localView = paramView.getRootView();
    ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
    if (((localLayoutParams instanceof WindowManager.LayoutParams)) && (((WindowManager.LayoutParams)localLayoutParams).type == 2))
      paramView = localView;
    while (true)
    {
      return paramView;
      for (paramView = paramView.getContext(); ; paramView = ((ContextWrapper)paramView).getBaseContext())
      {
        if (!(paramView instanceof ContextWrapper))
          break label76;
        if ((paramView instanceof Activity))
        {
          paramView = ((Activity)paramView).getWindow().getDecorView();
          break;
        }
      }
      label76: paramView = localView;
    }
  }

  private boolean isShowing()
  {
    if (this.WL.getParent() != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, CharSequence paramCharSequence)
  {
    if (isShowing())
      hide();
    this.ma.setText(paramCharSequence);
    a(paramView, paramInt1, paramInt2, paramBoolean, this.auN);
    ((WindowManager)this.mContext.getSystemService("window")).addView(this.WL, this.auN);
  }

  final void hide()
  {
    if (!isShowing());
    while (true)
    {
      return;
      ((WindowManager)this.mContext.getSystemService("window")).removeView(this.WL);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bg
 * JD-Core Version:    0.6.2
 */