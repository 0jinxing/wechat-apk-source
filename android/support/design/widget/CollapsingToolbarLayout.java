package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.a.a;
import android.support.v4.content.b;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.support.v4.widget.u;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public class CollapsingToolbarLayout extends FrameLayout
{
  aa mp;
  private boolean oK = true;
  private int oL;
  private Toolbar oM;
  private View oN;
  private View oO;
  private int oP;
  private int oQ;
  private int oR;
  private int oS;
  private final Rect oT = new Rect();
  final f oU;
  private boolean oV;
  private boolean oW;
  private Drawable oX;
  Drawable oY;
  private int oZ;
  private boolean pa;
  private ValueAnimator pb;
  private long pc;
  private int pd = -1;
  private AppBarLayout.a pe;
  int pg;

  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    o.G(paramContext);
    this.oU = new f(this);
    this.oU.b(a.mj);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.CollapsingToolbarLayout, paramInt, 2131493824);
    this.oU.P(paramContext.getInt(14, 8388691));
    this.oU.Q(paramContext.getInt(13, 8388627));
    paramInt = paramContext.getDimensionPixelSize(1, 0);
    this.oS = paramInt;
    this.oR = paramInt;
    this.oQ = paramInt;
    this.oP = paramInt;
    if (paramContext.hasValue(2))
      this.oP = paramContext.getDimensionPixelSize(2, 0);
    if (paramContext.hasValue(4))
      this.oR = paramContext.getDimensionPixelSize(4, 0);
    if (paramContext.hasValue(3))
      this.oQ = paramContext.getDimensionPixelSize(3, 0);
    if (paramContext.hasValue(5))
      this.oS = paramContext.getDimensionPixelSize(5, 0);
    this.oV = paramContext.getBoolean(15, true);
    setTitle(paramContext.getText(0));
    this.oU.S(2131493640);
    this.oU.R(2131493622);
    if (paramContext.hasValue(6))
      this.oU.S(paramContext.getResourceId(6, 0));
    if (paramContext.hasValue(7))
      this.oU.R(paramContext.getResourceId(7, 0));
    this.pd = paramContext.getDimensionPixelSize(11, -1);
    this.pc = paramContext.getInt(12, 600);
    setContentScrim(paramContext.getDrawable(8));
    setStatusBarScrim(paramContext.getDrawable(9));
    this.oL = paramContext.getResourceId(10, -1);
    paramContext.recycle();
    setWillNotDraw(false);
    s.a(this, new CollapsingToolbarLayout.1(this));
  }

  private void bV()
  {
    if (!this.oK)
      return;
    this.oM = null;
    this.oN = null;
    if (this.oL != -1)
    {
      this.oM = ((Toolbar)findViewById(this.oL));
      if (this.oM != null)
        this.oN = k(this.oM);
    }
    int j;
    if (this.oM == null)
    {
      int i = getChildCount();
      j = 0;
      label74: if (j >= i)
        break label120;
      localObject = getChildAt(j);
      if (!(localObject instanceof Toolbar))
        break label114;
    }
    label114: label120: for (Object localObject = (Toolbar)localObject; ; localObject = null)
    {
      this.oM = ((Toolbar)localObject);
      bW();
      this.oK = false;
      break;
      j++;
      break label74;
    }
  }

  private void bW()
  {
    if ((!this.oV) && (this.oO != null))
    {
      ViewParent localViewParent = this.oO.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.oO);
    }
    if ((this.oV) && (this.oM != null))
    {
      if (this.oO == null)
        this.oO = new View(getContext());
      if (this.oO.getParent() == null)
        this.oM.addView(this.oO, -1, -1);
    }
  }

  private View k(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    View localView = paramView;
    for (paramView = localViewParent; (paramView != this) && (paramView != null); paramView = paramView.getParent())
      if ((paramView instanceof View))
        localView = (View)paramView;
    return localView;
  }

  private static int l(View paramView)
  {
    Object localObject = paramView.getLayoutParams();
    int i;
    if ((localObject instanceof ViewGroup.MarginLayoutParams))
    {
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      i = paramView.getHeight();
      j = ((ViewGroup.MarginLayoutParams)localObject).topMargin;
    }
    for (int j = ((ViewGroup.MarginLayoutParams)localObject).bottomMargin + (i + j); ; j = paramView.getHeight())
      return j;
  }

  static p m(View paramView)
  {
    p localp1 = (p)paramView.getTag(2131820686);
    p localp2 = localp1;
    if (localp1 == null)
    {
      localp2 = new p(paramView);
      paramView.setTag(2131820686, localp2);
    }
    return localp2;
  }

  final void bX()
  {
    if ((this.oX != null) || (this.oY != null))
      if (getHeight() + this.pg >= getScrimVisibleHeightTrigger())
        break label38;
    label38: for (boolean bool = true; ; bool = false)
    {
      setScrimsShown(bool);
      return;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof CollapsingToolbarLayout.LayoutParams;
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    bV();
    if ((this.oM == null) && (this.oX != null) && (this.oZ > 0))
    {
      this.oX.mutate().setAlpha(this.oZ);
      this.oX.draw(paramCanvas);
    }
    if ((this.oV) && (this.oW))
      this.oU.draw(paramCanvas);
    if ((this.oY != null) && (this.oZ > 0))
      if (this.mp == null)
        break label153;
    label153: for (int i = this.mp.getSystemWindowInsetTop(); ; i = 0)
    {
      if (i > 0)
      {
        this.oY.setBounds(0, -this.pg, getWidth(), i - this.pg);
        this.oY.mutate().setAlpha(this.oZ);
        this.oY.draw(paramCanvas);
      }
      return;
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    boolean bool = false;
    if ((this.oX != null) && (this.oZ > 0))
      if ((this.oN == null) || (this.oN == this))
        if (paramView == this.oM)
        {
          i = 1;
          if (i == 0)
            break label120;
          this.oX.mutate().setAlpha(this.oZ);
          this.oX.draw(paramCanvas);
        }
    label120: for (int i = 1; ; i = 0)
    {
      if ((super.drawChild(paramCanvas, paramView, paramLong)) || (i != 0))
        bool = true;
      return bool;
      i = 0;
      break;
      if (paramView == this.oN)
      {
        i = 1;
        break;
      }
      i = 0;
      break;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool1 = false;
    Drawable localDrawable = this.oY;
    boolean bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful())
        bool2 = localDrawable.setState(arrayOfInt) | false;
    }
    localDrawable = this.oX;
    bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful())
        bool1 = bool2 | localDrawable.setState(arrayOfInt);
    }
    bool2 = bool1;
    if (this.oU != null)
      bool2 = bool1 | this.oU.setState(arrayOfInt);
    if (bool2)
      invalidate();
  }

  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new CollapsingToolbarLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  public int getCollapsedTitleGravity()
  {
    return this.oU.oa;
  }

  public Typeface getCollapsedTitleTypeface()
  {
    return this.oU.bN();
  }

  public Drawable getContentScrim()
  {
    return this.oX;
  }

  public int getExpandedTitleGravity()
  {
    return this.oU.nZ;
  }

  public int getExpandedTitleMarginBottom()
  {
    return this.oS;
  }

  public int getExpandedTitleMarginEnd()
  {
    return this.oR;
  }

  public int getExpandedTitleMarginStart()
  {
    return this.oP;
  }

  public int getExpandedTitleMarginTop()
  {
    return this.oQ;
  }

  public Typeface getExpandedTitleTypeface()
  {
    Object localObject = this.oU;
    if (((f)localObject).om != null);
    for (localObject = ((f)localObject).om; ; localObject = Typeface.DEFAULT)
      return localObject;
  }

  int getScrimAlpha()
  {
    return this.oZ;
  }

  public long getScrimAnimationDuration()
  {
    return this.pc;
  }

  public int getScrimVisibleHeightTrigger()
  {
    int i;
    if (this.pd >= 0)
      i = this.pd;
    while (true)
    {
      return i;
      if (this.mp != null);
      for (i = this.mp.getSystemWindowInsetTop(); ; i = 0)
      {
        int j = s.aa(this);
        if (j <= 0)
          break label59;
        i = Math.min(i + j * 2, getHeight());
        break;
      }
      label59: i = getHeight() / 3;
    }
  }

  public Drawable getStatusBarScrim()
  {
    return this.oY;
  }

  public CharSequence getTitle()
  {
    if (this.oV);
    for (CharSequence localCharSequence = this.oU.mText; ; localCharSequence = null)
      return localCharSequence;
  }

  final int n(View paramView)
  {
    p localp = m(paramView);
    CollapsingToolbarLayout.LayoutParams localLayoutParams = (CollapsingToolbarLayout.LayoutParams)paramView.getLayoutParams();
    return getHeight() - localp.ua - paramView.getHeight() - localLayoutParams.bottomMargin;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = getParent();
    if ((localObject instanceof AppBarLayout))
    {
      s.e(this, s.al((View)localObject));
      if (this.pe == null)
        this.pe = new CollapsingToolbarLayout.a(this);
      localObject = (AppBarLayout)localObject;
      AppBarLayout.a locala = this.pe;
      if (((AppBarLayout)localObject).mq == null)
        ((AppBarLayout)localObject).mq = new ArrayList();
      if ((locala != null) && (!((AppBarLayout)localObject).mq.contains(locala)))
        ((AppBarLayout)localObject).mq.add(locala);
      s.ak(this);
    }
  }

  protected void onDetachedFromWindow()
  {
    Object localObject = getParent();
    if ((this.pe != null) && ((localObject instanceof AppBarLayout)))
    {
      localObject = (AppBarLayout)localObject;
      AppBarLayout.a locala = this.pe;
      if ((((AppBarLayout)localObject).mq != null) && (locala != null))
        ((AppBarLayout)localObject).mq.remove(locala);
    }
    super.onDetachedFromWindow();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    int j = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int k;
    int m;
    Object localObject;
    if (this.mp != null)
    {
      k = this.mp.getSystemWindowInsetTop();
      m = getChildCount();
      for (n = 0; n < m; n++)
      {
        localObject = getChildAt(n);
        if ((!s.al((View)localObject)) && (((View)localObject).getTop() < k))
          s.q((View)localObject, k);
      }
    }
    if ((this.oV) && (this.oO != null))
    {
      if ((!s.av(this.oO)) || (this.oO.getVisibility() != 0))
        break label400;
      paramBoolean = true;
      this.oW = paramBoolean;
      if (this.oW)
      {
        if (s.T(this) != 1)
          break label405;
        n = i;
        label148: if (this.oN == null)
          break label411;
        localObject = this.oN;
        label161: m = n((View)localObject);
        u.a(this, this.oO, this.oT);
        localObject = this.oU;
        int i1 = this.oT.left;
        if (n == 0)
          break label420;
        i = this.oM.getTitleMarginEnd();
        label210: int i2 = this.oT.top;
        int i3 = this.oM.getTitleMarginTop();
        int i4 = this.oT.right;
        if (n == 0)
          break label432;
        k = this.oM.getTitleMarginStart();
        label251: ((f)localObject).d(i1 + i, i3 + (i2 + m), k + i4, m + this.oT.bottom - this.oM.getTitleMarginBottom());
        localObject = this.oU;
        if (n == 0)
          break label444;
        i = this.oR;
        label309: m = this.oT.top;
        k = this.oQ;
        if (n == 0)
          break label453;
      }
    }
    label400: label405: label411: label420: label432: label444: label453: for (int n = this.oP; ; n = this.oR)
    {
      ((f)localObject).c(i, m + k, paramInt3 - paramInt1 - n, paramInt4 - paramInt2 - this.oS);
      this.oU.bT();
      paramInt2 = getChildCount();
      for (paramInt1 = j; paramInt1 < paramInt2; paramInt1++)
        m(getChildAt(paramInt1)).cD();
      paramBoolean = false;
      break;
      n = 0;
      break label148;
      localObject = this.oM;
      break label161;
      i = this.oM.getTitleMarginStart();
      break label210;
      k = this.oM.getTitleMarginEnd();
      break label251;
      i = this.oP;
      break label309;
    }
    if (this.oM != null)
    {
      if ((this.oV) && (TextUtils.isEmpty(this.oU.mText)))
        this.oU.setText(this.oM.getTitle());
      if ((this.oN != null) && (this.oN != this))
        break label534;
      setMinimumHeight(l(this.oM));
    }
    while (true)
    {
      bX();
      return;
      label534: setMinimumHeight(l(this.oN));
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    bV();
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt2);
    if (this.mp != null);
    for (paramInt2 = this.mp.getSystemWindowInsetTop(); ; paramInt2 = 0)
    {
      if ((i == 0) && (paramInt2 > 0))
        super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + getMeasuredHeight(), 1073741824));
      return;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.oX != null)
      this.oX.setBounds(0, 0, paramInt1, paramInt2);
  }

  public void setCollapsedTitleGravity(int paramInt)
  {
    this.oU.Q(paramInt);
  }

  public void setCollapsedTitleTextAppearance(int paramInt)
  {
    this.oU.R(paramInt);
  }

  public void setCollapsedTitleTextColor(int paramInt)
  {
    setCollapsedTitleTextColor(ColorStateList.valueOf(paramInt));
  }

  public void setCollapsedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.oU.b(paramColorStateList);
  }

  public void setCollapsedTitleTypeface(Typeface paramTypeface)
  {
    f localf = this.oU;
    if (f.a(localf.ol, paramTypeface))
    {
      localf.ol = paramTypeface;
      localf.bT();
    }
  }

  public void setContentScrim(Drawable paramDrawable)
  {
    Drawable localDrawable = null;
    if (this.oX != paramDrawable)
    {
      if (this.oX != null)
        this.oX.setCallback(null);
      if (paramDrawable != null)
        localDrawable = paramDrawable.mutate();
      this.oX = localDrawable;
      if (this.oX != null)
      {
        this.oX.setBounds(0, 0, getWidth(), getHeight());
        this.oX.setCallback(this);
        this.oX.setAlpha(this.oZ);
      }
      s.R(this);
    }
  }

  public void setContentScrimColor(int paramInt)
  {
    setContentScrim(new ColorDrawable(paramInt));
  }

  public void setContentScrimResource(int paramInt)
  {
    setContentScrim(b.g(getContext(), paramInt));
  }

  public void setExpandedTitleColor(int paramInt)
  {
    setExpandedTitleTextColor(ColorStateList.valueOf(paramInt));
  }

  public void setExpandedTitleGravity(int paramInt)
  {
    this.oU.P(paramInt);
  }

  public void setExpandedTitleMarginBottom(int paramInt)
  {
    this.oS = paramInt;
    requestLayout();
  }

  public void setExpandedTitleMarginEnd(int paramInt)
  {
    this.oR = paramInt;
    requestLayout();
  }

  public void setExpandedTitleMarginStart(int paramInt)
  {
    this.oP = paramInt;
    requestLayout();
  }

  public void setExpandedTitleMarginTop(int paramInt)
  {
    this.oQ = paramInt;
    requestLayout();
  }

  public void setExpandedTitleTextAppearance(int paramInt)
  {
    this.oU.S(paramInt);
  }

  public void setExpandedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.oU.c(paramColorStateList);
  }

  public void setExpandedTitleTypeface(Typeface paramTypeface)
  {
    f localf = this.oU;
    if (f.a(localf.om, paramTypeface))
    {
      localf.om = paramTypeface;
      localf.bT();
    }
  }

  void setScrimAlpha(int paramInt)
  {
    if (paramInt != this.oZ)
    {
      if ((this.oX != null) && (this.oM != null))
        s.R(this.oM);
      this.oZ = paramInt;
      s.R(this);
    }
  }

  public void setScrimAnimationDuration(long paramLong)
  {
    this.pc = paramLong;
  }

  public void setScrimVisibleHeightTrigger(int paramInt)
  {
    if (this.pd != paramInt)
    {
      this.pd = paramInt;
      bX();
    }
  }

  public void setScrimsShown(boolean paramBoolean)
  {
    int i = 255;
    label40: Interpolator localInterpolator;
    if ((s.as(this)) && (!isInEditMode()))
    {
      j = 1;
      if (this.pa != paramBoolean)
      {
        if (j == 0)
          break label187;
        if (!paramBoolean)
          break label154;
        j = 255;
        bV();
        if (this.pb != null)
          break label167;
        this.pb = new ValueAnimator();
        this.pb.setDuration(this.pc);
        ValueAnimator localValueAnimator = this.pb;
        if (j <= this.oZ)
          break label159;
        localInterpolator = a.mh;
        label93: localValueAnimator.setInterpolator(localInterpolator);
        this.pb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue());
          }
        });
      }
    }
    while (true)
    {
      this.pb.setIntValues(new int[] { this.oZ, j });
      this.pb.start();
      this.pa = paramBoolean;
      return;
      j = 0;
      break;
      label154: j = 0;
      break label40;
      label159: localInterpolator = a.mi;
      break label93;
      label167: if (this.pb.isRunning())
        this.pb.cancel();
    }
    label187: if (paramBoolean);
    for (int j = i; ; j = 0)
    {
      setScrimAlpha(j);
      break;
    }
  }

  public void setStatusBarScrim(Drawable paramDrawable)
  {
    Drawable localDrawable = null;
    if (this.oY != paramDrawable)
    {
      if (this.oY != null)
        this.oY.setCallback(null);
      if (paramDrawable != null)
        localDrawable = paramDrawable.mutate();
      this.oY = localDrawable;
      if (this.oY != null)
      {
        if (this.oY.isStateful())
          this.oY.setState(getDrawableState());
        android.support.v4.a.a.a.b(this.oY, s.T(this));
        paramDrawable = this.oY;
        if (getVisibility() != 0)
          break label125;
      }
    }
    label125: for (boolean bool = true; ; bool = false)
    {
      paramDrawable.setVisible(bool, false);
      this.oY.setCallback(this);
      this.oY.setAlpha(this.oZ);
      s.R(this);
      return;
    }
  }

  public void setStatusBarScrimColor(int paramInt)
  {
    setStatusBarScrim(new ColorDrawable(paramInt));
  }

  public void setStatusBarScrimResource(int paramInt)
  {
    setStatusBarScrim(b.g(getContext(), paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.oU.setText(paramCharSequence);
  }

  public void setTitleEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.oV)
    {
      this.oV = paramBoolean;
      bW();
      requestLayout();
    }
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      if ((this.oY != null) && (this.oY.isVisible() != bool))
        this.oY.setVisible(bool, false);
      if ((this.oX != null) && (this.oX.isVisible() != bool))
        this.oX.setVisible(bool, false);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.oX) || (paramDrawable == this.oY));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CollapsingToolbarLayout
 * JD-Core Version:    0.6.2
 */