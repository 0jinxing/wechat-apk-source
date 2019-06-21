package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V>
{
  private p tX;
  private int tY = 0;
  private int tZ = 0;

  public ViewOffsetBehavior()
  {
  }

  public ViewOffsetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean G(int paramInt)
  {
    if (this.tX != null);
    for (boolean bool = this.tX.G(paramInt); ; bool = false)
    {
      return bool;
      this.tY = paramInt;
    }
  }

  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    d(paramCoordinatorLayout, paramV, paramInt);
    if (this.tX == null)
      this.tX = new p(paramV);
    this.tX.cD();
    if (this.tY != 0)
    {
      this.tX.G(this.tY);
      this.tY = 0;
    }
    if (this.tZ != 0)
    {
      paramCoordinatorLayout = this.tX;
      paramInt = this.tZ;
      if (paramCoordinatorLayout.ud != paramInt)
      {
        paramCoordinatorLayout.ud = paramInt;
        paramCoordinatorLayout.cE();
      }
      this.tZ = 0;
    }
    return true;
  }

  public int bB()
  {
    if (this.tX != null);
    for (int i = this.tX.uc; ; i = 0)
      return i;
  }

  protected void d(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    paramCoordinatorLayout.e(paramV, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.ViewOffsetBehavior
 * JD-Core Version:    0.6.2
 */