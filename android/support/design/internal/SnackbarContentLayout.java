package android.support.design.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.a.a;
import android.support.design.widget.b.b;
import android.support.v4.view.s;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout
  implements b.b
{
  private int di;
  private TextView ma;
  private Button mb;
  private int mc;

  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.SnackbarLayout);
    this.di = paramContext.getDimensionPixelSize(0, -1);
    this.mc = paramContext.getDimensionPixelSize(2, -1);
    paramContext.recycle();
  }

  private static void a(View paramView, int paramInt1, int paramInt2)
  {
    if (s.an(paramView))
      s.d(paramView, s.W(paramView), paramInt1, s.X(paramView), paramInt2);
    while (true)
    {
      return;
      paramView.setPadding(paramView.getPaddingLeft(), paramInt1, paramView.getPaddingRight(), paramInt2);
    }
  }

  private boolean f(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    if (paramInt1 != getOrientation())
    {
      setOrientation(paramInt1);
      bool = true;
    }
    if ((this.ma.getPaddingTop() != paramInt2) || (this.ma.getPaddingBottom() != paramInt3))
    {
      a(this.ma, paramInt2, paramInt3);
      bool = true;
    }
    return bool;
  }

  public final void bw()
  {
    this.ma.setAlpha(0.0F);
    this.ma.animate().alpha(1.0F).setDuration(180L).setStartDelay(70L).start();
    if (this.mb.getVisibility() == 0)
    {
      this.mb.setAlpha(0.0F);
      this.mb.animate().alpha(1.0F).setDuration(180L).setStartDelay(70L).start();
    }
  }

  public final void bx()
  {
    this.ma.setAlpha(1.0F);
    this.ma.animate().alpha(0.0F).setDuration(180L).setStartDelay(0L).start();
    if (this.mb.getVisibility() == 0)
    {
      this.mb.setAlpha(1.0F);
      this.mb.animate().alpha(0.0F).setDuration(180L).setStartDelay(0L).start();
    }
  }

  public Button getActionView()
  {
    return this.mb;
  }

  public TextView getMessageView()
  {
    return this.ma;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.ma = ((TextView)findViewById(2131823265));
    this.mb = ((Button)findViewById(2131823266));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = paramInt1;
    if (this.di > 0)
    {
      i = paramInt1;
      if (getMeasuredWidth() > this.di)
      {
        i = View.MeasureSpec.makeMeasureSpec(this.di, 1073741824);
        super.onMeasure(i, paramInt2);
      }
    }
    int j = getResources().getDimensionPixelSize(2131427393);
    int k = getResources().getDimensionPixelSize(2131428295);
    if (this.ma.getLayout().getLineCount() > 1)
    {
      paramInt1 = 1;
      if ((paramInt1 == 0) || (this.mc <= 0) || (this.mb.getMeasuredWidth() <= this.mc))
        break label140;
      if (!f(1, j, j - k))
        break label168;
      paramInt1 = 1;
    }
    while (true)
    {
      if (paramInt1 != 0)
        super.onMeasure(i, paramInt2);
      return;
      paramInt1 = 0;
      break;
      label140: if (paramInt1 != 0);
      for (paramInt1 = j; ; paramInt1 = k)
      {
        if (!f(0, paramInt1, paramInt1))
          break label168;
        paramInt1 = 1;
        break;
      }
      label168: paramInt1 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.internal.SnackbarContentLayout
 * JD-Core Version:    0.6.2
 */