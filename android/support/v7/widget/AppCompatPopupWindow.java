package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.widget.n;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

class AppCompatPopupWindow extends PopupWindow
{
  private static final boolean afO;
  private boolean afP;

  static
  {
    if (Build.VERSION.SDK_INT < 21);
    for (boolean bool = true; ; bool = false)
    {
      afO = bool;
      return;
    }
  }

  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt, 0);
  }

  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = bc.a(paramContext, paramAttributeSet, a.a.PopupWindow, paramInt1, paramInt2);
    if (paramContext.hasValue(2))
      aa(paramContext.getBoolean(2, false));
    setBackgroundDrawable(paramContext.getDrawable(0));
    paramContext.atG.recycle();
  }

  private void aa(boolean paramBoolean)
  {
    if (afO)
      this.afP = paramBoolean;
    while (true)
    {
      return;
      n.a(this, paramBoolean);
    }
  }

  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (afO)
    {
      i = paramInt2;
      if (this.afP)
        i = paramInt2 - paramView.getHeight();
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }

  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (afO)
    {
      i = paramInt2;
      if (this.afP)
        i = paramInt2 - paramView.getHeight();
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }

  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((afO) && (this.afP))
      paramInt2 -= paramView.getHeight();
    while (true)
    {
      super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatPopupWindow
 * JD-Core Version:    0.6.2
 */