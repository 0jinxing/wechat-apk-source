package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.a.a;
import android.support.v4.view.s;
import android.support.v4.widget.u;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class FloatingActionButton$Behavior extends CoordinatorLayout.Behavior<FloatingActionButton>
{
  private Rect oT;
  private FloatingActionButton.a qo;
  private boolean qp;

  public FloatingActionButton$Behavior()
  {
    this.qp = true;
  }

  public FloatingActionButton$Behavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.FloatingActionButton_Behavior_Layout);
    this.qp = paramContext.getBoolean(0, true);
    paramContext.recycle();
  }

  private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
  {
    boolean bool;
    if (!a(paramAppBarLayout, paramFloatingActionButton))
    {
      bool = false;
      return bool;
    }
    if (this.oT == null)
      this.oT = new Rect();
    Rect localRect = this.oT;
    u.a(paramCoordinatorLayout, paramAppBarLayout, localRect);
    if (localRect.bottom <= paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent())
      paramFloatingActionButton.b(this.qo);
    while (true)
    {
      bool = true;
      break;
      paramFloatingActionButton.a(this.qo);
    }
  }

  private boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
  {
    int i = 0;
    Object localObject1 = paramCoordinatorLayout.p(paramFloatingActionButton);
    int j = ((List)localObject1).size();
    int k = 0;
    Object localObject2;
    if (k < j)
    {
      localObject2 = (View)((List)localObject1).get(k);
      if ((localObject2 instanceof AppBarLayout))
        if (!a(paramCoordinatorLayout, (AppBarLayout)localObject2, paramFloatingActionButton))
          break label194;
    }
    else
    {
      label65: paramCoordinatorLayout.e(paramFloatingActionButton, paramInt);
      localObject2 = paramFloatingActionButton.qi;
      if ((localObject2 != null) && (((Rect)localObject2).centerX() > 0) && (((Rect)localObject2).centerY() > 0))
      {
        localObject1 = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
        if (paramFloatingActionButton.getRight() < paramCoordinatorLayout.getWidth() - ((CoordinatorLayout.d)localObject1).rightMargin)
          break label200;
        paramInt = ((Rect)localObject2).right;
      }
    }
    while (true)
    {
      label130: if (paramFloatingActionButton.getBottom() >= paramCoordinatorLayout.getHeight() - ((CoordinatorLayout.d)localObject1).bottomMargin)
        k = ((Rect)localObject2).bottom;
      while (true)
      {
        if (k != 0)
          s.q(paramFloatingActionButton, k);
        if (paramInt != 0)
          s.r(paramFloatingActionButton, paramInt);
        return true;
        if ((q((View)localObject2)) && (b((View)localObject2, paramFloatingActionButton)))
          break label65;
        label194: k++;
        break;
        label200: if (paramFloatingActionButton.getLeft() > ((CoordinatorLayout.d)localObject1).leftMargin)
          break label249;
        paramInt = -((Rect)localObject2).left;
        break label130;
        k = i;
        if (paramFloatingActionButton.getTop() <= ((CoordinatorLayout.d)localObject1).topMargin)
          k = -((Rect)localObject2).top;
      }
      label249: paramInt = 0;
    }
  }

  private boolean a(View paramView, FloatingActionButton paramFloatingActionButton)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
    boolean bool;
    if (!this.qp)
      bool = false;
    while (true)
    {
      return bool;
      if (locald.pK != paramView.getId())
        bool = false;
      else if (paramFloatingActionButton.getUserSetVisibility() != 0)
        bool = false;
      else
        bool = true;
    }
  }

  private boolean b(View paramView, FloatingActionButton paramFloatingActionButton)
  {
    boolean bool;
    if (!a(paramView, paramFloatingActionButton))
    {
      bool = false;
      return bool;
    }
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
    int i = paramView.getTop();
    int j = paramFloatingActionButton.getHeight() / 2;
    if (i < locald.topMargin + j)
      paramFloatingActionButton.b(this.qo);
    while (true)
    {
      bool = true;
      break;
      paramFloatingActionButton.a(this.qo);
    }
  }

  private static boolean q(View paramView)
  {
    paramView = paramView.getLayoutParams();
    if ((paramView instanceof CoordinatorLayout.d));
    for (boolean bool = ((CoordinatorLayout.d)paramView).pH instanceof BottomSheetBehavior; ; bool = false)
      return bool;
  }

  public final void a(CoordinatorLayout.d paramd)
  {
    if (paramd.pM == 0)
      paramd.pM = 80;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.FloatingActionButton.Behavior
 * JD-Core Version:    0.6.2
 */