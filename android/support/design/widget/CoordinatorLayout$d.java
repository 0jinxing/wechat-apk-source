package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.b.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class CoordinatorLayout$d extends ViewGroup.MarginLayoutParams
{
  public int anchorGravity = 0;
  public int gravity = 0;
  CoordinatorLayout.Behavior pH;
  boolean pI = false;
  public int pJ = -1;
  int pK = -1;
  public int pL = 0;
  public int pM = 0;
  int pN;
  int pO;
  View pP;
  View pQ;
  boolean pR;
  private boolean pS;
  private boolean pT;
  boolean pU;
  final Rect pV = new Rect();
  Object pW;

  public CoordinatorLayout$d()
  {
    super(-2, -2);
  }

  CoordinatorLayout$d(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.CoordinatorLayout_Layout);
    this.gravity = localTypedArray.getInteger(0, 0);
    this.pK = localTypedArray.getResourceId(2, -1);
    this.anchorGravity = localTypedArray.getInteger(4, 0);
    this.pJ = localTypedArray.getInteger(3, -1);
    this.pL = localTypedArray.getInt(5, 0);
    this.pM = localTypedArray.getInt(6, 0);
    this.pI = localTypedArray.hasValue(1);
    if (this.pI)
      this.pH = CoordinatorLayout.a(paramContext, paramAttributeSet, localTypedArray.getString(1));
    localTypedArray.recycle();
    if (this.pH != null)
      this.pH.a(this);
  }

  public CoordinatorLayout$d(d paramd)
  {
    super(paramd);
  }

  public CoordinatorLayout$d(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public CoordinatorLayout$d(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }

  final boolean Y(int paramInt)
  {
    boolean bool;
    switch (paramInt)
    {
    default:
      bool = false;
    case 0:
    case 1:
    }
    while (true)
    {
      return bool;
      bool = this.pS;
      continue;
      bool = this.pT;
    }
  }

  public final void a(CoordinatorLayout.Behavior paramBehavior)
  {
    if (this.pH != paramBehavior)
    {
      this.pH = paramBehavior;
      this.pW = null;
      this.pI = true;
      if (paramBehavior != null)
        paramBehavior.a(this);
    }
  }

  final boolean cc()
  {
    if ((this.pP == null) && (this.pK != -1));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void i(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return;
      this.pS = paramBoolean;
      continue;
      this.pT = paramBoolean;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CoordinatorLayout.d
 * JD-Core Version:    0.6.2
 */