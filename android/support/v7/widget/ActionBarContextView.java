package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.view.b;
import android.support.v7.view.menu.h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a
{
  private CharSequence IT;
  private CharSequence IU;
  private TextView TF;
  private View acM;
  private LinearLayout acN;
  private TextView acO;
  private int acP;
  private int acQ;
  public boolean acR;
  private int acS;
  private View sQ;

  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772144);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = bc.a(paramContext, paramAttributeSet, a.a.ActionMode, paramInt, 0);
    s.a(this, paramContext.getDrawable(3));
    this.acP = paramContext.getResourceId(1, 0);
    this.acQ = paramContext.getResourceId(2, 0);
    this.acy = paramContext.getLayoutDimension(0, 0);
    this.acS = paramContext.getResourceId(5, 2130968589);
    paramContext.atG.recycle();
  }

  private void gQ()
  {
    int i = 8;
    int j = 1;
    if (this.acN == null)
    {
      LayoutInflater.from(getContext()).inflate(2130968584, this);
      this.acN = ((LinearLayout)getChildAt(getChildCount() - 1));
      this.TF = ((TextView)this.acN.findViewById(2131820908));
      this.acO = ((TextView)this.acN.findViewById(2131820909));
      if (this.acP != 0)
        this.TF.setTextAppearance(getContext(), this.acP);
      if (this.acQ != 0)
        this.acO.setTextAppearance(getContext(), this.acQ);
    }
    this.TF.setText(this.IT);
    this.acO.setText(this.IU);
    int k;
    label163: Object localObject;
    if (!TextUtils.isEmpty(this.IT))
    {
      k = 1;
      if (TextUtils.isEmpty(this.IU))
        break label231;
      localObject = this.acO;
      if (j == 0)
        break label236;
    }
    label231: label236: for (int m = 0; ; m = 8)
    {
      ((TextView)localObject).setVisibility(m);
      localObject = this.acN;
      if (k == 0)
      {
        k = i;
        if (j == 0);
      }
      else
      {
        k = 0;
      }
      ((LinearLayout)localObject).setVisibility(k);
      if (this.acN.getParent() == null)
        addView(this.acN);
      return;
      k = 0;
      break;
      j = 0;
      break label163;
    }
  }

  public final void c(final b paramb)
  {
    if (this.acM == null)
    {
      this.acM = LayoutInflater.from(getContext()).inflate(this.acS, this, false);
      addView(this.acM);
    }
    while (true)
    {
      this.acM.findViewById(2131820910).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramb.finish();
        }
      });
      h localh = (h)paramb.getMenu();
      if (this.acx != null)
        this.acx.ha();
      this.acx = new ActionMenuPresenter(getContext());
      this.acx.gZ();
      paramb = new ViewGroup.LayoutParams(-2, -1);
      localh.a(this.acx, this.acv);
      this.acw = ((ActionMenuView)this.acx.f(this));
      s.a(this.acw, null);
      addView(this.acw, paramb);
      return;
      if (this.acM.getParent() == null)
        addView(this.acM);
    }
  }

  public final void gR()
  {
    if (this.acM == null)
      gS();
  }

  public final void gS()
  {
    removeAllViews();
    this.sQ = null;
    this.acw = null;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }

  public CharSequence getSubtitle()
  {
    return this.IU;
  }

  public CharSequence getTitle()
  {
    return this.IT;
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.acx != null)
    {
      this.acx.hideOverflowMenu();
      this.acx.hb();
    }
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramAccessibilityEvent.setSource(this);
      paramAccessibilityEvent.setClassName(getClass().getName());
      paramAccessibilityEvent.setPackageName(getContext().getPackageName());
      paramAccessibilityEvent.setContentDescription(this.IT);
    }
    while (true)
    {
      return;
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = bk.bW(this);
    int i;
    int j;
    int k;
    Object localObject;
    if (paramBoolean)
    {
      i = paramInt3 - paramInt1 - getPaddingRight();
      j = getPaddingTop();
      k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = i;
      if (this.acM != null)
      {
        paramInt2 = i;
        if (this.acM.getVisibility() != 8)
        {
          localObject = (ViewGroup.MarginLayoutParams)this.acM.getLayoutParams();
          if (!paramBoolean)
            break label254;
          paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
          label89: if (!paramBoolean)
            break label263;
          paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
          label100: paramInt2 = c(i, paramInt2, paramBoolean);
          paramInt2 = c(paramInt2 + a(this.acM, paramInt2, j, k, paramBoolean), paramInt4, paramBoolean);
        }
      }
      paramInt4 = paramInt2;
      if (this.acN != null)
      {
        paramInt4 = paramInt2;
        if (this.sQ == null)
        {
          paramInt4 = paramInt2;
          if (this.acN.getVisibility() != 8)
            paramInt4 = paramInt2 + a(this.acN, paramInt2, j, k, paramBoolean);
        }
      }
      if (this.sQ != null)
        a(this.sQ, paramInt4, j, k, paramBoolean);
      if (!paramBoolean)
        break label273;
      paramInt1 = getPaddingLeft();
      label213: if (this.acw != null)
      {
        localObject = this.acw;
        if (paramBoolean)
          break label286;
      }
    }
    label263: label273: label286: for (paramBoolean = true; ; paramBoolean = false)
    {
      a((View)localObject, paramInt1, j, k, paramBoolean);
      return;
      i = getPaddingLeft();
      break;
      label254: paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
      break label89;
      paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
      break label100;
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
      break label213;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    int j = View.MeasureSpec.getSize(paramInt1);
    int k;
    int n;
    int i1;
    if (this.acy > 0)
    {
      k = this.acy;
      int m = getPaddingTop() + getPaddingBottom();
      paramInt1 = j - getPaddingLeft() - getPaddingRight();
      n = k - m;
      i1 = View.MeasureSpec.makeMeasureSpec(n, -2147483648);
      paramInt2 = paramInt1;
      Object localObject;
      if (this.acM != null)
      {
        paramInt2 = j(this.acM, paramInt1, i1);
        localObject = (ViewGroup.MarginLayoutParams)this.acM.getLayoutParams();
        paramInt1 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
        paramInt2 -= ((ViewGroup.MarginLayoutParams)localObject).rightMargin + paramInt1;
      }
      paramInt1 = paramInt2;
      if (this.acw != null)
      {
        paramInt1 = paramInt2;
        if (this.acw.getParent() == this)
          paramInt1 = j(this.acw, paramInt2, i1);
      }
      paramInt2 = paramInt1;
      if (this.acN != null)
      {
        paramInt2 = paramInt1;
        if (this.sQ == null)
        {
          if (!this.acR)
            break label493;
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.acN.measure(paramInt2, i1);
          int i2 = this.acN.getMeasuredWidth();
          if (i2 > paramInt1)
            break label481;
          i1 = 1;
          label289: paramInt2 = paramInt1;
          if (i1 != 0)
            paramInt2 = paramInt1 - i2;
          localObject = this.acN;
          if (i1 == 0)
            break label487;
          paramInt1 = 0;
          label314: ((LinearLayout)localObject).setVisibility(paramInt1);
        }
      }
      label320: if (this.sQ != null)
      {
        localObject = this.sQ.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject).width == -2)
          break label507;
        paramInt1 = 1073741824;
        label350: i1 = paramInt2;
        if (((ViewGroup.LayoutParams)localObject).width >= 0)
          i1 = Math.min(((ViewGroup.LayoutParams)localObject).width, paramInt2);
        if (((ViewGroup.LayoutParams)localObject).height == -2)
          break label514;
        paramInt2 = i;
        if (((ViewGroup.LayoutParams)localObject).height < 0)
          break label521;
        i = Math.min(((ViewGroup.LayoutParams)localObject).height, n);
        this.sQ.measure(View.MeasureSpec.makeMeasureSpec(i1, paramInt1), View.MeasureSpec.makeMeasureSpec(i, paramInt2));
      }
      label384: label403: if (this.acy > 0)
        break label535;
      i1 = getChildCount();
      paramInt2 = 0;
      paramInt1 = 0;
      label438: if (paramInt2 >= i1)
        break label527;
      k = getChildAt(paramInt2).getMeasuredHeight() + m;
      if (k <= paramInt1)
        break label546;
      paramInt1 = k;
    }
    label514: label521: label527: label535: label546: 
    while (true)
    {
      paramInt2++;
      break label438;
      k = View.MeasureSpec.getSize(paramInt2);
      break;
      label481: i1 = 0;
      break label289;
      label487: paramInt1 = 8;
      break label314;
      label493: paramInt2 = j(this.acN, paramInt1, i1);
      break label320;
      label507: paramInt1 = -2147483648;
      break label350;
      paramInt2 = -2147483648;
      break label384;
      i = n;
      break label403;
      setMeasuredDimension(j, paramInt1);
      while (true)
      {
        return;
        setMeasuredDimension(j, k);
      }
    }
  }

  public void setContentHeight(int paramInt)
  {
    this.acy = paramInt;
  }

  public void setCustomView(View paramView)
  {
    if (this.sQ != null)
      removeView(this.sQ);
    this.sQ = paramView;
    if ((paramView != null) && (this.acN != null))
    {
      removeView(this.acN);
      this.acN = null;
    }
    if (paramView != null)
      addView(paramView);
    requestLayout();
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.IU = paramCharSequence;
    gQ();
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.IT = paramCharSequence;
    gQ();
  }

  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != this.acR)
      requestLayout();
    this.acR = paramBoolean;
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }

  public final boolean showOverflowMenu()
  {
    if (this.acx != null);
    for (boolean bool = this.acx.showOverflowMenu(); ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActionBarContextView
 * JD-Core Version:    0.6.2
 */