package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.w;
import android.support.v4.widget.m;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

class ab extends ListView
{
  private final Rect ahV = new Rect();
  private int ahW = 0;
  private int ahX = 0;
  private int ahY = 0;
  private int ahZ = 0;
  private int aia;
  private Field aib;
  private a aic;
  private boolean aid;
  private boolean aie;
  private boolean aif;
  private w aig;
  private m aih;
  private b aii;

  ab(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, 2130772192);
    this.aie = paramBoolean;
    setCacheColorHint(0);
    try
    {
      this.aib = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.aib.setAccessible(true);
      label68: return;
    }
    catch (NoSuchFieldException paramContext)
    {
      break label68;
    }
  }

  private void ia()
  {
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (this.aif) && (isPressed()))
      localDrawable.setState(getDrawableState());
  }

  private void setSelectorEnabled(boolean paramBoolean)
  {
    if (this.aic != null)
      this.aic.OH = paramBoolean;
  }

  public boolean b(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i = 0;
    int j = paramMotionEvent.getActionMasked();
    switch (j)
    {
    default:
      paramInt = i;
      bool1 = bool2;
    case 3:
    case 1:
    case 2:
    }
    while (true)
    {
      View localView;
      if ((!bool1) || (paramInt != 0))
      {
        this.aif = false;
        setPressed(false);
        drawableStateChanged();
        localView = getChildAt(this.aia - getFirstVisiblePosition());
        if (localView != null)
          localView.setPressed(false);
        if (this.aig != null)
        {
          this.aig.cancel();
          this.aig = null;
        }
      }
      label159: int k;
      float f1;
      float f2;
      Object localObject1;
      float f3;
      float f4;
      label414: Object localObject2;
      if (bool1)
      {
        if (this.aih == null)
          this.aih = new m(this);
        this.aih.G(true);
        this.aih.onTouch(this, paramMotionEvent);
        return bool1;
        bool1 = false;
        paramInt = i;
        continue;
        bool1 = false;
        k = paramMotionEvent.findPointerIndex(paramInt);
        if (k < 0)
        {
          bool1 = false;
          paramInt = i;
          continue;
        }
        paramInt = (int)paramMotionEvent.getX(k);
        int m = (int)paramMotionEvent.getY(k);
        k = pointToPosition(paramInt, m);
        if (k == -1)
        {
          paramInt = 1;
          continue;
        }
        localView = getChildAt(k - getFirstVisiblePosition());
        f1 = paramInt;
        f2 = m;
        this.aif = true;
        if (Build.VERSION.SDK_INT >= 21)
          drawableHotspotChanged(f1, f2);
        if (!isPressed())
          setPressed(true);
        layoutChildren();
        if (this.aia != -1)
        {
          localObject1 = getChildAt(this.aia - getFirstVisiblePosition());
          if ((localObject1 != null) && (localObject1 != localView) && (((View)localObject1).isPressed()))
            ((View)localObject1).setPressed(false);
        }
        this.aia = k;
        f3 = localView.getLeft();
        f4 = localView.getTop();
        if (Build.VERSION.SDK_INT >= 21)
          localView.drawableHotspotChanged(f1 - f3, f2 - f4);
        if (!localView.isPressed())
          localView.setPressed(true);
        localObject1 = getSelector();
        if ((localObject1 != null) && (k != -1))
        {
          paramInt = 1;
          if (paramInt != 0)
            ((Drawable)localObject1).setVisible(false, false);
          localObject2 = this.ahV;
          ((Rect)localObject2).set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          ((Rect)localObject2).left -= this.ahW;
          ((Rect)localObject2).top -= this.ahX;
          ((Rect)localObject2).right += this.ahY;
          ((Rect)localObject2).bottom += this.ahZ;
        }
      }
      try
      {
        bool1 = this.aib.getBoolean(this);
        if (localView.isEnabled() != bool1)
        {
          localObject2 = this.aib;
          if (bool1)
            break label696;
          bool1 = true;
          label547: ((Field)localObject2).set(this, Boolean.valueOf(bool1));
          if (k != -1)
            refreshDrawableState();
        }
        label567: if (paramInt != 0)
        {
          localObject2 = this.ahV;
          f4 = ((Rect)localObject2).exactCenterX();
          f3 = ((Rect)localObject2).exactCenterY();
          if (getVisibility() != 0)
            break label701;
        }
        label696: label701: for (bool1 = true; ; bool1 = false)
        {
          ((Drawable)localObject1).setVisible(bool1, false);
          android.support.v4.a.a.a.a((Drawable)localObject1, f4, f3);
          localObject1 = getSelector();
          if ((localObject1 != null) && (k != -1))
            android.support.v4.a.a.a.a((Drawable)localObject1, f1, f2);
          setSelectorEnabled(false);
          refreshDrawableState();
          bool2 = true;
          bool1 = bool2;
          paramInt = i;
          if (j != 1)
            break;
          performItemClick(localView, k, getItemIdAtPosition(k));
          bool1 = bool2;
          paramInt = i;
          break;
          paramInt = 0;
          break label414;
          bool1 = false;
          break label547;
        }
        if (this.aih == null)
          break label159;
        this.aih.G(false);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label567;
      }
    }
  }

  public int d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt3 = getListPaddingTop();
    paramInt2 = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int i = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 = paramInt3 + paramInt2;
      return paramInt2;
    }
    paramInt3 = paramInt2 + paramInt3;
    label63: int j;
    int m;
    label83: int i1;
    View localView;
    if ((i > 0) && (localObject != null))
    {
      paramInt2 = 0;
      localObject = null;
      j = 0;
      int k = localListAdapter.getCount();
      m = 0;
      if (m >= k)
        break label292;
      int n = localListAdapter.getItemViewType(m);
      i1 = j;
      if (n != j)
      {
        localObject = null;
        i1 = n;
      }
      localView = localListAdapter.getView(m, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject = localLayoutParams;
      if (localLayoutParams == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (((ViewGroup.LayoutParams)localObject).height <= 0)
        break label254;
      j = View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams)localObject).height, 1073741824);
      label183: localView.measure(paramInt1, j);
      localView.forceLayout();
      if (m <= 0)
        break label300;
      paramInt3 += i;
    }
    label292: label300: 
    while (true)
    {
      paramInt3 = localView.getMeasuredHeight() + paramInt3;
      if (paramInt3 >= paramInt4)
      {
        if ((paramInt5 >= 0) && (m > paramInt5) && (paramInt2 > 0) && (paramInt3 != paramInt4))
          break;
        paramInt2 = paramInt4;
        break;
        i = 0;
        break label63;
        label254: j = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label183;
      }
      if ((paramInt5 >= 0) && (m >= paramInt5))
        paramInt2 = paramInt3;
      while (true)
      {
        m++;
        j = i1;
        localObject = localView;
        break label83;
        paramInt2 = paramInt3;
        break;
      }
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (!this.ahV.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(this.ahV);
        localDrawable.draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }

  protected void drawableStateChanged()
  {
    if (this.aii != null);
    while (true)
    {
      return;
      super.drawableStateChanged();
      setSelectorEnabled(true);
      ia();
    }
  }

  public boolean hasFocus()
  {
    if ((this.aie) || (super.hasFocus()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean hasWindowFocus()
  {
    if ((this.aie) || (super.hasWindowFocus()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isFocused()
  {
    if ((this.aie) || (super.isFocused()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isInTouchMode()
  {
    if (((this.aie) && (this.aid)) || (super.isInTouchMode()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void onDetachedFromWindow()
  {
    this.aii = null;
    super.onDetachedFromWindow();
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1;
    if (Build.VERSION.SDK_INT < 26)
      bool1 = super.onHoverEvent(paramMotionEvent);
    while (true)
    {
      return bool1;
      int i = paramMotionEvent.getActionMasked();
      if ((i == 10) && (this.aii == null))
      {
        this.aii = new b((byte)0);
        b localb = this.aii;
        localb.aij.post(localb);
      }
      boolean bool2 = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) || (i == 7))
      {
        i = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        bool1 = bool2;
        if (i != -1)
        {
          bool1 = bool2;
          if (i != getSelectedItemPosition())
          {
            paramMotionEvent = getChildAt(i - getFirstVisiblePosition());
            if (paramMotionEvent.isEnabled())
              setSelectionFromTop(i, paramMotionEvent.getTop() - getTop());
            ia();
            bool1 = bool2;
          }
        }
      }
      else
      {
        setSelection(-1);
        bool1 = bool2;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      if (this.aii != null)
      {
        b localb = this.aii;
        localb.aij.aii = null;
        localb.aij.removeCallbacks(localb);
      }
      return super.onTouchEvent(paramMotionEvent);
      this.aia = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
  }

  void setListSelectionHidden(boolean paramBoolean)
  {
    this.aid = paramBoolean;
  }

  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null);
    for (Object localObject = new a(paramDrawable); ; localObject = null)
    {
      this.aic = ((a)localObject);
      super.setSelector(this.aic);
      localObject = new Rect();
      if (paramDrawable != null)
        paramDrawable.getPadding((Rect)localObject);
      this.ahW = ((Rect)localObject).left;
      this.ahX = ((Rect)localObject).top;
      this.ahY = ((Rect)localObject).right;
      this.ahZ = ((Rect)localObject).bottom;
      return;
    }
  }

  static final class a extends android.support.v7.d.a.a
  {
    boolean OH = true;

    a(Drawable paramDrawable)
    {
      super();
    }

    public final void draw(Canvas paramCanvas)
    {
      if (this.OH)
        super.draw(paramCanvas);
    }

    public final void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (this.OH)
        super.setHotspot(paramFloat1, paramFloat2);
    }

    public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (this.OH)
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }

    public final boolean setState(int[] paramArrayOfInt)
    {
      if (this.OH);
      for (boolean bool = super.setState(paramArrayOfInt); ; bool = false)
        return bool;
    }

    public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (this.OH);
      for (paramBoolean1 = super.setVisible(paramBoolean1, paramBoolean2); ; paramBoolean1 = false)
        return paramBoolean1;
    }
  }

  final class b
    implements Runnable
  {
    private b()
    {
    }

    public final void run()
    {
      ab.a(ab.this);
      ab.this.drawableStateChanged();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ab
 * JD-Core Version:    0.6.2
 */