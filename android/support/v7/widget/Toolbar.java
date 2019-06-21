package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.d;
import android.support.v4.view.f;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.c.a.b;
import android.support.v7.view.c;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup
{
  private int Hu = 8388627;
  private int XT;
  private boolean acA;
  private boolean acB;
  Context acv;
  ActionMenuView acw;
  int adW;
  o.a adY;
  h.a adZ;
  TextView atH;
  TextView atI;
  private ImageButton atJ;
  private ImageView atK;
  Drawable atL;
  CharSequence atM;
  ImageButton atN;
  View atO;
  int atP;
  int atQ;
  int atR;
  private int atS;
  private int atT;
  private int atU;
  private int atV;
  private int atW;
  as atX;
  private int atY;
  private int atZ;
  private CharSequence aua;
  private CharSequence aub;
  private int auc;
  private final ArrayList<View> aud = new ArrayList();
  final ArrayList<View> aue = new ArrayList();
  private final int[] auf = new int[2];
  b aug;
  private final ActionMenuView.d auh = new ActionMenuView.d()
  {
    public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      if (Toolbar.this.aug != null);
      for (boolean bool = Toolbar.this.aug.onMenuItemClick(paramAnonymousMenuItem); ; bool = false)
        return bool;
    }
  };
  private bd aui;
  ActionMenuPresenter auj;
  a auk;
  private final Runnable aul = new Runnable()
  {
    public final void run()
    {
      Toolbar.this.showOverflowMenu();
    }
  };
  private boolean mr;

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772176);
  }

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = bc.a(getContext(), paramAttributeSet, a.a.Toolbar, paramInt, 0);
    this.atP = paramContext.getResourceId(12, 0);
    this.atQ = paramContext.getResourceId(13, 0);
    this.Hu = paramContext.getInteger(0, this.Hu);
    this.atR = paramContext.getInteger(21, 48);
    int i = paramContext.getDimensionPixelOffset(14, 0);
    paramInt = i;
    if (paramContext.hasValue(19))
      paramInt = paramContext.getDimensionPixelOffset(19, i);
    this.atW = paramInt;
    this.atV = paramInt;
    this.atU = paramInt;
    this.atT = paramInt;
    paramInt = paramContext.getDimensionPixelOffset(15, -1);
    if (paramInt >= 0)
      this.atT = paramInt;
    paramInt = paramContext.getDimensionPixelOffset(16, -1);
    if (paramInt >= 0)
      this.atU = paramInt;
    paramInt = paramContext.getDimensionPixelOffset(17, -1);
    if (paramInt >= 0)
      this.atV = paramInt;
    paramInt = paramContext.getDimensionPixelOffset(18, -1);
    if (paramInt >= 0)
      this.atW = paramInt;
    this.atS = paramContext.getDimensionPixelSize(20, -1);
    paramInt = paramContext.getDimensionPixelOffset(5, -2147483648);
    int j = paramContext.getDimensionPixelOffset(6, -2147483648);
    i = paramContext.getDimensionPixelSize(7, 0);
    int k = paramContext.getDimensionPixelSize(8, 0);
    lq();
    paramAttributeSet = this.atX;
    paramAttributeSet.aqp = false;
    if (i != -2147483648)
    {
      paramAttributeSet.aqn = i;
      paramAttributeSet.xJ = i;
    }
    if (k != -2147483648)
    {
      paramAttributeSet.aqo = k;
      paramAttributeSet.xM = k;
    }
    if ((paramInt != -2147483648) || (j != -2147483648))
      this.atX.aI(paramInt, j);
    this.atY = paramContext.getDimensionPixelOffset(9, -2147483648);
    this.atZ = paramContext.getDimensionPixelOffset(10, -2147483648);
    this.atL = paramContext.getDrawable(22);
    this.atM = paramContext.getText(23);
    paramAttributeSet = paramContext.getText(2);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setTitle(paramAttributeSet);
    paramAttributeSet = paramContext.getText(3);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setSubtitle(paramAttributeSet);
    this.acv = getContext();
    setPopupTheme(paramContext.getResourceId(11, 0));
    paramAttributeSet = paramContext.getDrawable(24);
    if (paramAttributeSet != null)
      setNavigationIcon(paramAttributeSet);
    paramAttributeSet = paramContext.getText(25);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setNavigationContentDescription(paramAttributeSet);
    paramAttributeSet = paramContext.getDrawable(4);
    if (paramAttributeSet != null)
      setLogo(paramAttributeSet);
    paramAttributeSet = paramContext.getText(26);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setLogoDescription(paramAttributeSet);
    if (paramContext.hasValue(27))
      setTitleTextColor(paramContext.getColor(27, -1));
    if (paramContext.hasValue(28))
      setSubtitleTextColor(paramContext.getColor(28, -1));
    paramContext.atG.recycle();
  }

  private int B(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j;
    int k;
    int m;
    if (paramInt > 0)
    {
      paramInt = (i - paramInt) / 2;
      switch (cX(localLayoutParams.gravity))
      {
      default:
        j = getPaddingTop();
        k = getPaddingBottom();
        m = getHeight();
        paramInt = (m - j - k - i) / 2;
        if (paramInt < localLayoutParams.topMargin)
          paramInt = localLayoutParams.topMargin;
        break;
      case 48:
      case 80:
      }
    }
    while (true)
    {
      paramInt += j;
      while (true)
      {
        return paramInt;
        paramInt = 0;
        break;
        paramInt = getPaddingTop() - paramInt;
        continue;
        paramInt = getHeight() - getPaddingBottom() - i - localLayoutParams.bottomMargin - paramInt;
      }
      i = m - k - i - paramInt - j;
      if (i < localLayoutParams.bottomMargin)
        paramInt = Math.max(0, paramInt - (localLayoutParams.bottomMargin - i));
    }
  }

  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int j = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int k = Math.max(0, i) + Math.max(0, j);
    paramArrayOfInt[0] = Math.max(0, -i);
    paramArrayOfInt[1] = Math.max(0, -j);
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + k + paramInt2, localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height));
    return paramView.getMeasuredWidth() + k;
  }

  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i);
    i = B(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, i, paramInt1 + paramInt2, paramView.getMeasuredHeight() + i);
    return localLayoutParams.rightMargin + paramInt2 + paramInt1;
  }

  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    paramInt2 = B(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (localLayoutParams.leftMargin + i);
  }

  private void b(List<View> paramList, int paramInt)
  {
    int i = 1;
    int j = 0;
    if (s.T(this) == 1);
    int k;
    int m;
    Object localObject1;
    Object localObject2;
    while (true)
    {
      k = getChildCount();
      m = d.getAbsoluteGravity(paramInt, s.T(this));
      paramList.clear();
      paramInt = j;
      if (i == 0)
        break;
      for (paramInt = k - 1; paramInt >= 0; paramInt--)
      {
        localObject1 = getChildAt(paramInt);
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        if ((((LayoutParams)localObject2).auo == 0) && (bQ((View)localObject1)) && (cY(((LayoutParams)localObject2).gravity) == m))
          paramList.add(localObject1);
      }
      i = 0;
    }
    while (paramInt < k)
    {
      localObject2 = getChildAt(paramInt);
      localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
      if ((((LayoutParams)localObject1).auo == 0) && (bQ((View)localObject2)) && (cY(((LayoutParams)localObject1).gravity) == m))
        paramList.add(localObject2);
      paramInt++;
    }
  }

  private boolean bQ(View paramView)
  {
    if ((paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static int bR(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = f.a(paramView);
    return f.b(paramView) + i;
  }

  private static int bS(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramView.topMargin;
    return paramView.bottomMargin + i;
  }

  private boolean bT(View paramView)
  {
    if ((paramView.getParent() == this) || (this.aue.contains(paramView)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private int cX(int paramInt)
  {
    int i = paramInt & 0x70;
    paramInt = i;
    switch (i)
    {
    default:
      paramInt = this.Hu & 0x70;
    case 16:
    case 48:
    case 80:
    }
    return paramInt;
  }

  private int cY(int paramInt)
  {
    int i = s.T(this);
    int j = d.getAbsoluteGravity(paramInt, i) & 0x7;
    paramInt = j;
    switch (j)
    {
    case 2:
    case 4:
    default:
      if (i != 1)
        break;
    case 1:
    case 3:
    case 5:
    }
    for (paramInt = 5; ; paramInt = 3)
      return paramInt;
  }

  private static LayoutParams e(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams))
      paramLayoutParams = new LayoutParams((LayoutParams)paramLayoutParams);
    while (true)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof ActionBar.LayoutParams))
        paramLayoutParams = new LayoutParams((ActionBar.LayoutParams)paramLayoutParams);
      else if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
        paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
      else
        paramLayoutParams = new LayoutParams(paramLayoutParams);
    }
  }

  private MenuInflater getMenuInflater()
  {
    return new g(getContext());
  }

  private void i(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null)
    {
      localObject = new LayoutParams();
      ((LayoutParams)localObject).auo = 1;
      if ((!paramBoolean) || (this.atO == null))
        break label72;
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.aue.add(paramView);
    }
    while (true)
    {
      return;
      if (!checkLayoutParams((ViewGroup.LayoutParams)localObject))
      {
        localObject = e((ViewGroup.LayoutParams)localObject);
        break;
      }
      localObject = (LayoutParams)localObject;
      break;
      label72: addView(paramView, (ViewGroup.LayoutParams)localObject);
    }
  }

  private void l(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + 0, localMarginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt4 >= 0)
      {
        paramInt1 = paramInt4;
        if (paramInt3 != 0)
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt4);
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i, paramInt1);
  }

  private void lk()
  {
    if (this.atK == null)
      this.atK = new AppCompatImageView(getContext());
  }

  private void ll()
  {
    lm();
    if (this.acw.lo == null)
    {
      h localh = (h)this.acw.getMenu();
      if (this.auk == null)
        this.auk = new a();
      this.acw.setExpandedActionViewsExclusive(true);
      localh.a(this.auk, this.acv);
    }
  }

  private void ln()
  {
    if (this.atJ == null)
    {
      this.atJ = new AppCompatImageButton(getContext(), null, 2130772177);
      LayoutParams localLayoutParams = new LayoutParams();
      localLayoutParams.gravity = (0x800003 | this.atR & 0x70);
      this.atJ.setLayoutParams(localLayoutParams);
    }
  }

  protected static LayoutParams lo()
  {
    return new LayoutParams();
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof LayoutParams)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void collapseActionView()
  {
    if (this.auk == null);
    for (j localj = null; ; localj = this.auk.aun)
    {
      if (localj != null)
        localj.collapseActionView();
      return;
    }
  }

  public int getContentInsetEnd()
  {
    as localas;
    int i;
    if (this.atX != null)
    {
      localas = this.atX;
      if (localas.hq)
        i = localas.xJ;
    }
    while (true)
    {
      return i;
      i = localas.xM;
      continue;
      i = 0;
    }
  }

  public int getContentInsetEndWithActions()
  {
    if (this.atZ != -2147483648);
    for (int i = this.atZ; ; i = getContentInsetEnd())
      return i;
  }

  public int getContentInsetLeft()
  {
    if (this.atX != null);
    for (int i = this.atX.xJ; ; i = 0)
      return i;
  }

  public int getContentInsetRight()
  {
    if (this.atX != null);
    for (int i = this.atX.xM; ; i = 0)
      return i;
  }

  public int getContentInsetStart()
  {
    as localas;
    int i;
    if (this.atX != null)
    {
      localas = this.atX;
      if (localas.hq)
        i = localas.xM;
    }
    while (true)
    {
      return i;
      i = localas.xJ;
      continue;
      i = 0;
    }
  }

  public int getContentInsetStartWithNavigation()
  {
    if (this.atY != -2147483648);
    for (int i = this.atY; ; i = getContentInsetStart())
      return i;
  }

  public int getCurrentContentInsetEnd()
  {
    int i;
    if (this.acw != null)
    {
      h localh = this.acw.lo;
      if ((localh != null) && (localh.hasVisibleItems()))
        i = 1;
    }
    while (true)
    {
      if (i != 0);
      for (i = Math.max(getContentInsetEnd(), Math.max(this.atZ, 0)); ; i = getContentInsetEnd())
      {
        return i;
        i = 0;
        break;
      }
      i = 0;
    }
  }

  public int getCurrentContentInsetLeft()
  {
    if (s.T(this) == 1);
    for (int i = getCurrentContentInsetEnd(); ; i = getCurrentContentInsetStart())
      return i;
  }

  public int getCurrentContentInsetRight()
  {
    if (s.T(this) == 1);
    for (int i = getCurrentContentInsetStart(); ; i = getCurrentContentInsetEnd())
      return i;
  }

  public int getCurrentContentInsetStart()
  {
    if (getNavigationIcon() != null);
    for (int i = Math.max(getContentInsetStart(), Math.max(this.atY, 0)); ; i = getContentInsetStart())
      return i;
  }

  public Drawable getLogo()
  {
    if (this.atK != null);
    for (Drawable localDrawable = this.atK.getDrawable(); ; localDrawable = null)
      return localDrawable;
  }

  public CharSequence getLogoDescription()
  {
    if (this.atK != null);
    for (CharSequence localCharSequence = this.atK.getContentDescription(); ; localCharSequence = null)
      return localCharSequence;
  }

  public Menu getMenu()
  {
    ll();
    return this.acw.getMenu();
  }

  public CharSequence getNavigationContentDescription()
  {
    if (this.atJ != null);
    for (CharSequence localCharSequence = this.atJ.getContentDescription(); ; localCharSequence = null)
      return localCharSequence;
  }

  public Drawable getNavigationIcon()
  {
    if (this.atJ != null);
    for (Drawable localDrawable = this.atJ.getDrawable(); ; localDrawable = null)
      return localDrawable;
  }

  ActionMenuPresenter getOuterActionMenuPresenter()
  {
    return this.auj;
  }

  public Drawable getOverflowIcon()
  {
    ll();
    return this.acw.getOverflowIcon();
  }

  Context getPopupContext()
  {
    return this.acv;
  }

  public int getPopupTheme()
  {
    return this.adW;
  }

  public CharSequence getSubtitle()
  {
    return this.aub;
  }

  public CharSequence getTitle()
  {
    return this.aua;
  }

  public int getTitleMarginBottom()
  {
    return this.atW;
  }

  public int getTitleMarginEnd()
  {
    return this.atU;
  }

  public int getTitleMarginStart()
  {
    return this.atT;
  }

  public int getTitleMarginTop()
  {
    return this.atV;
  }

  public x getWrapper()
  {
    if (this.aui == null)
      this.aui = new bd(this, true);
    return this.aui;
  }

  public final boolean isOverflowMenuShowing()
  {
    boolean bool = true;
    int i;
    if (this.acw != null)
    {
      ActionMenuView localActionMenuView = this.acw;
      if ((localActionMenuView.adX != null) && (localActionMenuView.adX.isOverflowMenuShowing()))
      {
        i = 1;
        if (i == 0)
          break label44;
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label44: bool = false;
    }
  }

  final void lm()
  {
    if (this.acw == null)
    {
      this.acw = new ActionMenuView(getContext());
      this.acw.setPopupTheme(this.adW);
      this.acw.setOnMenuItemClickListener(this.auh);
      this.acw.a(this.adY, this.adZ);
      LayoutParams localLayoutParams = new LayoutParams();
      localLayoutParams.gravity = (0x800005 | this.atR & 0x70);
      this.acw.setLayoutParams(localLayoutParams);
      i(this.acw, false);
    }
  }

  final void lp()
  {
    for (int i = this.aue.size() - 1; i >= 0; i--)
      addView((View)this.aue.get(i));
    this.aue.clear();
  }

  final void lq()
  {
    if (this.atX == null)
      this.atX = new as();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.aul);
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.acB = false;
    if (!this.acB)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool))
        this.acB = true;
    }
    if ((i == 10) || (i == 3))
      this.acB = false;
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int[] arrayOfInt;
    int i3;
    if (s.T(this) == 1)
    {
      i = 1;
      j = getWidth();
      k = getHeight();
      m = getPaddingLeft();
      n = getPaddingRight();
      i1 = getPaddingTop();
      i2 = getPaddingBottom();
      paramInt1 = j - n;
      arrayOfInt = this.auf;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      paramInt3 = s.aa(this);
      if (paramInt3 < 0)
        break label898;
      i3 = Math.min(paramInt3, paramInt4 - paramInt2);
      label91: if (!bQ(this.atJ))
        break label1732;
      if (i == 0)
        break label904;
      paramInt1 = b(this.atJ, paramInt1, arrayOfInt, i3);
      paramInt2 = m;
    }
    while (true)
    {
      label124: paramInt4 = paramInt1;
      paramInt3 = paramInt2;
      if (bQ(this.atN))
      {
        if (i != 0)
        {
          paramInt4 = b(this.atN, paramInt1, arrayOfInt, i3);
          paramInt3 = paramInt2;
        }
      }
      else
      {
        label164: paramInt1 = paramInt4;
        paramInt2 = paramInt3;
        if (bQ(this.acw))
        {
          if (i == 0)
            break label943;
          paramInt2 = a(this.acw, paramInt3, arrayOfInt, i3);
          paramInt1 = paramInt4;
        }
        label204: paramInt3 = getCurrentContentInsetLeft();
        paramInt4 = getCurrentContentInsetRight();
        arrayOfInt[0] = Math.max(0, paramInt3 - paramInt2);
        arrayOfInt[1] = Math.max(0, paramInt4 - (j - n - paramInt1));
        paramInt3 = Math.max(paramInt2, paramInt3);
        paramInt4 = Math.min(paramInt1, j - n - paramInt4);
        paramInt2 = paramInt4;
        paramInt1 = paramInt3;
        if (bQ(this.atO))
        {
          if (i == 0)
            break label964;
          paramInt2 = b(this.atO, paramInt4, arrayOfInt, i3);
          paramInt1 = paramInt3;
        }
        label308: if (!bQ(this.atK))
          break label1724;
        if (i == 0)
          break label985;
        paramInt3 = b(this.atK, paramInt2, arrayOfInt, i3);
        paramInt2 = paramInt1;
      }
      while (true)
      {
        label341: paramBoolean = bQ(this.atH);
        boolean bool = bQ(this.atI);
        paramInt1 = 0;
        Object localObject1;
        if (paramBoolean)
        {
          localObject1 = (LayoutParams)this.atH.getLayoutParams();
          paramInt4 = ((LayoutParams)localObject1).topMargin;
          paramInt1 = this.atH.getMeasuredHeight();
          paramInt1 = ((LayoutParams)localObject1).bottomMargin + (paramInt4 + paramInt1) + 0;
        }
        int i4;
        if (bool)
        {
          localObject1 = (LayoutParams)this.atI.getLayoutParams();
          i4 = ((LayoutParams)localObject1).topMargin;
          paramInt4 = this.atI.getMeasuredHeight();
        }
        label542: label1708: for (int i5 = ((LayoutParams)localObject1).bottomMargin + (i4 + paramInt4) + paramInt1; ; i5 = paramInt1)
        {
          label479: Object localObject2;
          if (!paramBoolean)
          {
            paramInt4 = paramInt3;
            paramInt1 = paramInt2;
            if (!bool);
          }
          else
          {
            if (!paramBoolean)
              break label1007;
            localObject1 = this.atH;
            if (!bool)
              break label1016;
            localObject2 = this.atI;
            label490: localObject1 = (LayoutParams)((View)localObject1).getLayoutParams();
            localObject2 = (LayoutParams)((View)localObject2).getLayoutParams();
            if (((!paramBoolean) || (this.atH.getMeasuredWidth() <= 0)) && ((!bool) || (this.atI.getMeasuredWidth() <= 0)))
              break label1025;
            i4 = 1;
            switch (this.Hu & 0x70)
            {
            default:
              paramInt1 = (k - i1 - i2 - i5) / 2;
              if (paramInt1 < ((LayoutParams)localObject1).topMargin + this.atV)
                paramInt1 = ((LayoutParams)localObject1).topMargin + this.atV;
              break;
            case 48:
            case 80:
            }
          }
          label943: label1715: 
          while (true)
          {
            label615: paramInt1 = i1 + paramInt1;
            label620: if (i != 0)
              if (i4 != 0)
              {
                paramInt4 = this.atT;
                label636: paramInt4 -= arrayOfInt[1];
                paramInt3 -= Math.max(0, paramInt4);
                arrayOfInt[1] = Math.max(0, -paramInt4);
                if (!paramBoolean)
                  break label1708;
                localObject1 = (LayoutParams)this.atH.getLayoutParams();
                paramInt4 = paramInt3 - this.atH.getMeasuredWidth();
                i5 = this.atH.getMeasuredHeight() + paramInt1;
                this.atH.layout(paramInt4, paramInt1, paramInt3, i5);
                i = this.atU;
                paramInt1 = i5 + ((LayoutParams)localObject1).bottomMargin;
                paramInt4 -= i;
              }
            while (true)
            {
              if (bool)
              {
                localObject1 = (LayoutParams)this.atI.getLayoutParams();
                i = ((LayoutParams)localObject1).topMargin + paramInt1;
                i5 = this.atI.getMeasuredWidth();
                paramInt1 = this.atI.getMeasuredHeight();
                this.atI.layout(paramInt3 - i5, i, paramInt3, paramInt1 + i);
                paramInt1 = this.atU;
                i = ((LayoutParams)localObject1).bottomMargin;
              }
              for (paramInt1 = paramInt3 - paramInt1; ; paramInt1 = paramInt3)
              {
                if (i4 != 0);
                for (paramInt1 = Math.min(paramInt4, paramInt1); ; paramInt1 = paramInt3)
                {
                  paramInt4 = paramInt1;
                  paramInt1 = paramInt2;
                  b(this.aud, 3);
                  paramInt3 = this.aud.size();
                  paramInt2 = 0;
                  while (true)
                    if (paramInt2 < paramInt3)
                    {
                      paramInt1 = a((View)this.aud.get(paramInt2), paramInt1, arrayOfInt, i3);
                      paramInt2++;
                      continue;
                      i = 0;
                      break;
                      i3 = 0;
                      break label91;
                      paramInt2 = a(this.atJ, m, arrayOfInt, i3);
                      break label124;
                      paramInt3 = a(this.atN, paramInt2, arrayOfInt, i3);
                      paramInt4 = paramInt1;
                      break label164;
                      paramInt1 = b(this.acw, paramInt4, arrayOfInt, i3);
                      paramInt2 = paramInt3;
                      break label204;
                      label964: paramInt1 = a(this.atO, paramInt3, arrayOfInt, i3);
                      paramInt2 = paramInt4;
                      break label308;
                      label985: paramInt1 = a(this.atK, paramInt1, arrayOfInt, i3);
                      paramInt3 = paramInt2;
                      paramInt2 = paramInt1;
                      break label341;
                      label1007: localObject1 = this.atI;
                      break label479;
                      label1016: localObject2 = this.atH;
                      break label490;
                      i4 = 0;
                      break label542;
                      paramInt1 = getPaddingTop();
                      paramInt1 = ((LayoutParams)localObject1).topMargin + paramInt1 + this.atV;
                      break label620;
                      paramInt4 = k - i2 - i5 - paramInt1 - i1;
                      if (paramInt4 >= ((LayoutParams)localObject1).bottomMargin + this.atW)
                        break label1715;
                      paramInt1 = Math.max(0, paramInt1 - (((LayoutParams)localObject2).bottomMargin + this.atW - paramInt4));
                      break label615;
                      paramInt1 = k - i2 - ((LayoutParams)localObject2).bottomMargin - this.atW - i5;
                      break label620;
                      paramInt4 = 0;
                      break label636;
                      if (i4 != 0)
                      {
                        paramInt4 = this.atT;
                        label1145: paramInt4 -= arrayOfInt[0];
                        paramInt2 += Math.max(0, paramInt4);
                        arrayOfInt[0] = Math.max(0, -paramInt4);
                        if (!paramBoolean)
                          break label1690;
                        localObject1 = (LayoutParams)this.atH.getLayoutParams();
                        i = this.atH.getMeasuredWidth() + paramInt2;
                        paramInt4 = this.atH.getMeasuredHeight() + paramInt1;
                        this.atH.layout(paramInt2, paramInt1, i, paramInt4);
                        i5 = this.atU;
                        paramInt1 = ((LayoutParams)localObject1).bottomMargin;
                        i += i5;
                        paramInt1 += paramInt4;
                      }
                    }
                  while (true)
                  {
                    if (bool)
                    {
                      localObject1 = (LayoutParams)this.atI.getLayoutParams();
                      i5 = ((LayoutParams)localObject1).topMargin + paramInt1;
                      paramInt1 = this.atI.getMeasuredWidth() + paramInt2;
                      paramInt4 = this.atI.getMeasuredHeight();
                      this.atI.layout(paramInt2, i5, paramInt1, paramInt4 + i5);
                      i5 = this.atU;
                      paramInt4 = ((LayoutParams)localObject1).bottomMargin;
                      i5 += paramInt1;
                    }
                    while (true)
                    {
                      paramInt4 = paramInt3;
                      paramInt1 = paramInt2;
                      if (i4 == 0)
                        break;
                      paramInt1 = Math.max(i, i5);
                      paramInt4 = paramInt3;
                      break;
                      paramInt4 = 0;
                      break label1145;
                      b(this.aud, 5);
                      i = this.aud.size();
                      paramInt3 = 0;
                      paramInt2 = paramInt4;
                      while (paramInt3 < i)
                      {
                        paramInt2 = b((View)this.aud.get(paramInt3), paramInt2, arrayOfInt, i3);
                        paramInt3++;
                      }
                      b(this.aud, 1);
                      ArrayList localArrayList = this.aud;
                      i4 = arrayOfInt[0];
                      i = arrayOfInt[1];
                      i5 = localArrayList.size();
                      paramInt4 = 0;
                      paramInt3 = 0;
                      while (paramInt4 < i5)
                      {
                        localObject1 = (View)localArrayList.get(paramInt4);
                        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
                        i4 = ((LayoutParams)localObject2).leftMargin - i4;
                        i = ((LayoutParams)localObject2).rightMargin - i;
                        i1 = Math.max(0, i4);
                        i2 = Math.max(0, i);
                        i4 = Math.max(0, -i4);
                        i = Math.max(0, -i);
                        k = ((View)localObject1).getMeasuredWidth();
                        paramInt4++;
                        paramInt3 += k + i1 + i2;
                      }
                      paramInt4 = (j - m - n) / 2 + m - paramInt3 / 2;
                      paramInt3 = paramInt4 + paramInt3;
                      if (paramInt4 < paramInt1);
                      while (true)
                      {
                        paramInt4 = this.aud.size();
                        paramInt3 = 0;
                        paramInt2 = paramInt1;
                        for (paramInt1 = paramInt3; paramInt1 < paramInt4; paramInt1++)
                          paramInt2 = a((View)this.aud.get(paramInt1), paramInt2, arrayOfInt, i3);
                        paramInt1 = paramInt4;
                        if (paramInt3 > paramInt2)
                          paramInt1 = paramInt4 - (paramInt3 - paramInt2);
                      }
                      this.aud.clear();
                      return;
                      i5 = paramInt2;
                    }
                    i = paramInt2;
                  }
                }
              }
              paramInt4 = paramInt3;
            }
          }
        }
        label898: label904: label1690: label1724: paramInt3 = paramInt2;
        label1025: paramInt2 = paramInt1;
      }
      label1732: paramInt2 = m;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = this.auf;
    int i;
    int j;
    int k;
    int m;
    int n;
    if (bk.bW(this))
    {
      i = 0;
      j = 1;
      k = 0;
      if (!bQ(this.atJ))
        break label1021;
      l(this.atJ, paramInt1, 0, paramInt2, this.atS);
      k = this.atJ.getMeasuredWidth() + bR(this.atJ);
      m = Math.max(0, this.atJ.getMeasuredHeight() + bS(this.atJ));
      n = View.combineMeasuredStates(0, this.atJ.getMeasuredState());
    }
    while (true)
    {
      int i1 = k;
      int i2 = n;
      k = m;
      if (bQ(this.atN))
      {
        l(this.atN, paramInt1, 0, paramInt2, this.atS);
        i1 = this.atN.getMeasuredWidth() + bR(this.atN);
        k = Math.max(m, this.atN.getMeasuredHeight() + bS(this.atN));
        i2 = View.combineMeasuredStates(n, this.atN.getMeasuredState());
      }
      n = getCurrentContentInsetStart();
      int i3 = Math.max(n, i1) + 0;
      localObject[j] = Math.max(0, n - i1);
      j = 0;
      n = i2;
      m = k;
      if (bQ(this.acw))
      {
        l(this.acw, paramInt1, i3, paramInt2, this.atS);
        j = this.acw.getMeasuredWidth() + bR(this.acw);
        m = Math.max(k, this.acw.getMeasuredHeight() + bS(this.acw));
        n = View.combineMeasuredStates(i2, this.acw.getMeasuredState());
      }
      k = getCurrentContentInsetEnd();
      i1 = i3 + Math.max(k, j);
      localObject[i] = Math.max(0, k - j);
      j = i1;
      k = n;
      i2 = m;
      if (bQ(this.atO))
      {
        j = i1 + a(this.atO, paramInt1, i1, paramInt2, 0, (int[])localObject);
        i2 = Math.max(m, this.atO.getMeasuredHeight() + bS(this.atO));
        k = View.combineMeasuredStates(n, this.atO.getMeasuredState());
      }
      n = j;
      i = k;
      m = i2;
      if (bQ(this.atK))
      {
        n = j + a(this.atK, paramInt1, j, paramInt2, 0, (int[])localObject);
        m = Math.max(i2, this.atK.getMeasuredHeight() + bS(this.atK));
        i = View.combineMeasuredStates(k, this.atK.getMeasuredState());
      }
      i1 = getChildCount();
      j = 0;
      k = i;
      i2 = m;
      m = j;
      j = n;
      label522: if (m < i1)
      {
        View localView = getChildAt(m);
        if ((((LayoutParams)localView.getLayoutParams()).auo != 0) || (!bQ(localView)))
          break label1006;
        j += a(localView, paramInt1, j, paramInt2, 0, (int[])localObject);
        n = Math.max(i2, localView.getMeasuredHeight() + bS(localView));
        i2 = View.combineMeasuredStates(k, localView.getMeasuredState());
      }
      for (k = n; ; k = n)
      {
        m++;
        n = i2;
        i2 = k;
        k = n;
        break label522;
        i = 1;
        j = 0;
        break;
        i = 0;
        m = 0;
        int i4 = this.atV + this.atW;
        int i5 = this.atT + this.atU;
        n = k;
        if (bQ(this.atH))
        {
          a(this.atH, paramInt1, j + i5, paramInt2, i4, (int[])localObject);
          n = this.atH.getMeasuredWidth();
          i = bR(this.atH) + n;
          m = this.atH.getMeasuredHeight() + bS(this.atH);
          n = View.combineMeasuredStates(k, this.atH.getMeasuredState());
        }
        i3 = m;
        i1 = i;
        k = n;
        if (bQ(this.atI))
        {
          i1 = Math.max(i, a(this.atI, paramInt1, j + i5, paramInt2, i4 + m, (int[])localObject));
          i3 = m + (this.atI.getMeasuredHeight() + bS(this.atI));
          k = View.combineMeasuredStates(n, this.atI.getMeasuredState());
        }
        m = Math.max(i2, i3);
        i3 = getPaddingLeft();
        i2 = getPaddingRight();
        n = getPaddingTop();
        i = getPaddingBottom();
        i2 = View.resolveSizeAndState(Math.max(i1 + j + (i3 + i2), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & k);
        paramInt2 = View.resolveSizeAndState(Math.max(m + (n + i), getSuggestedMinimumHeight()), paramInt2, k << 16);
        if (!this.mr)
          paramInt1 = 0;
        while (true)
        {
          if (paramInt1 != 0)
            paramInt2 = 0;
          setMeasuredDimension(i2, paramInt2);
          return;
          k = getChildCount();
          for (paramInt1 = 0; ; paramInt1++)
          {
            if (paramInt1 >= k)
              break label1001;
            localObject = getChildAt(paramInt1);
            if ((bQ((View)localObject)) && (((View)localObject).getMeasuredWidth() > 0) && (((View)localObject).getMeasuredHeight() > 0))
            {
              paramInt1 = 0;
              break;
            }
          }
          label1001: paramInt1 = 1;
        }
        label1006: n = i2;
        i2 = k;
      }
      label1021: n = 0;
      m = 0;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.LC);
    if (this.acw != null);
    for (paramParcelable = this.acw.lo; ; paramParcelable = null)
    {
      if ((localSavedState.aup != 0) && (this.auk != null) && (paramParcelable != null))
      {
        paramParcelable = paramParcelable.findItem(localSavedState.aup);
        if (paramParcelable != null)
          paramParcelable.expandActionView();
      }
      if (!localSavedState.auq)
        break;
      removeCallbacks(this.aul);
      post(this.aul);
      break;
    }
  }

  public void onRtlPropertiesChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 17)
      super.onRtlPropertiesChanged(paramInt);
    lq();
    as localas = this.atX;
    if (paramInt == 1)
      if (bool != localas.hq)
      {
        localas.hq = bool;
        if (!localas.aqp)
          break label170;
        if (!bool)
          break label113;
        if (localas.Ls == -2147483648)
          break label97;
        paramInt = localas.Ls;
        label67: localas.xJ = paramInt;
        if (localas.aqm == -2147483648)
          break label105;
        paramInt = localas.aqm;
        label86: localas.xM = paramInt;
      }
    while (true)
    {
      return;
      bool = false;
      break;
      label97: paramInt = localas.aqn;
      break label67;
      label105: paramInt = localas.aqo;
      break label86;
      label113: if (localas.aqm != -2147483648)
      {
        paramInt = localas.aqm;
        label127: localas.xJ = paramInt;
        if (localas.Ls == -2147483648)
          break label162;
      }
      label162: for (paramInt = localas.Ls; ; paramInt = localas.aqo)
      {
        localas.xM = paramInt;
        break;
        paramInt = localas.aqn;
        break label127;
      }
      label170: localas.xJ = localas.aqn;
      localas.xM = localas.aqo;
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if ((this.auk != null) && (this.auk.aun != null))
      localSavedState.aup = this.auk.aun.getItemId();
    localSavedState.auq = isOverflowMenuShowing();
    return localSavedState;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.acA = false;
    if (!this.acA)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool))
        this.acA = true;
    }
    if ((i == 1) || (i == 3))
      this.acA = false;
    return true;
  }

  public void setCollapsible(boolean paramBoolean)
  {
    this.mr = paramBoolean;
    requestLayout();
  }

  public void setContentInsetEndWithActions(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0)
      i = -2147483648;
    if (i != this.atZ)
    {
      this.atZ = i;
      if (getNavigationIcon() != null)
        requestLayout();
    }
  }

  public void setContentInsetStartWithNavigation(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0)
      i = -2147483648;
    if (i != this.atY)
    {
      this.atY = i;
      if (getNavigationIcon() != null)
        requestLayout();
    }
  }

  public void setLogo(int paramInt)
  {
    setLogo(b.g(getContext(), paramInt));
  }

  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      lk();
      if (!bT(this.atK))
        i(this.atK, true);
    }
    while (true)
    {
      if (this.atK != null)
        this.atK.setImageDrawable(paramDrawable);
      return;
      if ((this.atK != null) && (bT(this.atK)))
      {
        removeView(this.atK);
        this.aue.remove(this.atK);
      }
    }
  }

  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }

  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
      lk();
    if (this.atK != null)
      this.atK.setContentDescription(paramCharSequence);
  }

  public void setNavigationContentDescription(int paramInt)
  {
    if (paramInt != 0);
    for (CharSequence localCharSequence = getContext().getText(paramInt); ; localCharSequence = null)
    {
      setNavigationContentDescription(localCharSequence);
      return;
    }
  }

  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
      ln();
    if (this.atJ != null)
      this.atJ.setContentDescription(paramCharSequence);
  }

  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(b.g(getContext(), paramInt));
  }

  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ln();
      if (!bT(this.atJ))
        i(this.atJ, true);
    }
    while (true)
    {
      if (this.atJ != null)
        this.atJ.setImageDrawable(paramDrawable);
      return;
      if ((this.atJ != null) && (bT(this.atJ)))
      {
        removeView(this.atJ);
        this.aue.remove(this.atJ);
      }
    }
  }

  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    ln();
    this.atJ.setOnClickListener(paramOnClickListener);
  }

  public void setOnMenuItemClickListener(b paramb)
  {
    this.aug = paramb;
  }

  public void setOverflowIcon(Drawable paramDrawable)
  {
    ll();
    this.acw.setOverflowIcon(paramDrawable);
  }

  public void setPopupTheme(int paramInt)
  {
    if (this.adW != paramInt)
    {
      this.adW = paramInt;
      if (paramInt != 0)
        break label26;
    }
    label26: for (this.acv = getContext(); ; this.acv = new ContextThemeWrapper(getContext(), paramInt))
      return;
  }

  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.atI == null)
      {
        Context localContext = getContext();
        this.atI = new AppCompatTextView(localContext);
        this.atI.setSingleLine();
        this.atI.setEllipsize(TextUtils.TruncateAt.END);
        if (this.atQ != 0)
          this.atI.setTextAppearance(localContext, this.atQ);
        if (this.auc != 0)
          this.atI.setTextColor(this.auc);
      }
      if (!bT(this.atI))
        i(this.atI, true);
    }
    while (true)
    {
      if (this.atI != null)
        this.atI.setText(paramCharSequence);
      this.aub = paramCharSequence;
      return;
      if ((this.atI != null) && (bT(this.atI)))
      {
        removeView(this.atI);
        this.aue.remove(this.atI);
      }
    }
  }

  public void setSubtitleTextColor(int paramInt)
  {
    this.auc = paramInt;
    if (this.atI != null)
      this.atI.setTextColor(paramInt);
  }

  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.atH == null)
      {
        Context localContext = getContext();
        this.atH = new AppCompatTextView(localContext);
        this.atH.setSingleLine();
        this.atH.setEllipsize(TextUtils.TruncateAt.END);
        if (this.atP != 0)
          this.atH.setTextAppearance(localContext, this.atP);
        if (this.XT != 0)
          this.atH.setTextColor(this.XT);
      }
      if (!bT(this.atH))
        i(this.atH, true);
    }
    while (true)
    {
      if (this.atH != null)
        this.atH.setText(paramCharSequence);
      this.aua = paramCharSequence;
      return;
      if ((this.atH != null) && (bT(this.atH)))
      {
        removeView(this.atH);
        this.aue.remove(this.atH);
      }
    }
  }

  public void setTitleMarginBottom(int paramInt)
  {
    this.atW = paramInt;
    requestLayout();
  }

  public void setTitleMarginEnd(int paramInt)
  {
    this.atU = paramInt;
    requestLayout();
  }

  public void setTitleMarginStart(int paramInt)
  {
    this.atT = paramInt;
    requestLayout();
  }

  public void setTitleMarginTop(int paramInt)
  {
    this.atV = paramInt;
    requestLayout();
  }

  public void setTitleTextColor(int paramInt)
  {
    this.XT = paramInt;
    if (this.atH != null)
      this.atH.setTextColor(paramInt);
  }

  public final boolean showOverflowMenu()
  {
    boolean bool = true;
    int i;
    if (this.acw != null)
    {
      ActionMenuView localActionMenuView = this.acw;
      if ((localActionMenuView.adX != null) && (localActionMenuView.adX.showOverflowMenu()))
      {
        i = 1;
        if (i == 0)
          break label44;
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label44: bool = false;
    }
  }

  public static class LayoutParams extends ActionBar.LayoutParams
  {
    int auo = 0;

    public LayoutParams()
    {
      this.gravity = 8388627;
    }

    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }

    public LayoutParams(ActionBar.LayoutParams paramLayoutParams)
    {
      super();
    }

    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.auo = paramLayoutParams.auo;
    }

    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }

    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
      this.leftMargin = paramMarginLayoutParams.leftMargin;
      this.topMargin = paramMarginLayoutParams.topMargin;
      this.rightMargin = paramMarginLayoutParams.rightMargin;
      this.bottomMargin = paramMarginLayoutParams.bottomMargin;
    }
  }

  public static class SavedState extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
    };
    int aup;
    boolean auq;

    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.aup = paramParcel.readInt();
      if (paramParcel.readInt() != 0);
      for (boolean bool = true; ; bool = false)
      {
        this.auq = bool;
        return;
      }
    }

    public SavedState(Parcelable paramParcelable)
    {
      super();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.aup);
      if (this.auq);
      for (paramInt = 1; ; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }

  final class a
    implements o
  {
    j aun;
    h lo;

    a()
    {
    }

    public final void a(Context paramContext, h paramh)
    {
      if ((this.lo != null) && (this.aun != null))
        this.lo.h(this.aun);
      this.lo = paramh;
    }

    public final void a(h paramh, boolean paramBoolean)
    {
    }

    public final void a(o.a parama)
    {
    }

    public final boolean a(u paramu)
    {
      return false;
    }

    public final boolean b(j paramj)
    {
      Toolbar localToolbar = Toolbar.this;
      if (localToolbar.atN == null)
      {
        localToolbar.atN = new AppCompatImageButton(localToolbar.getContext(), null, 2130772177);
        localToolbar.atN.setImageDrawable(localToolbar.atL);
        localToolbar.atN.setContentDescription(localToolbar.atM);
        localObject = new Toolbar.LayoutParams();
        ((Toolbar.LayoutParams)localObject).gravity = (localToolbar.atR & 0x70 | 0x800003);
        ((Toolbar.LayoutParams)localObject).auo = 2;
        localToolbar.atN.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localToolbar.atN.setOnClickListener(new Toolbar.3(localToolbar));
      }
      Object localObject = Toolbar.this.atN.getParent();
      if (localObject != Toolbar.this)
      {
        if ((localObject instanceof ViewGroup))
          ((ViewGroup)localObject).removeView(Toolbar.this.atN);
        Toolbar.this.addView(Toolbar.this.atN);
      }
      Toolbar.this.atO = paramj.getActionView();
      this.aun = paramj;
      localObject = Toolbar.this.atO.getParent();
      if (localObject != Toolbar.this)
      {
        if ((localObject instanceof ViewGroup))
          ((ViewGroup)localObject).removeView(Toolbar.this.atO);
        localObject = Toolbar.lo();
        ((Toolbar.LayoutParams)localObject).gravity = (Toolbar.this.atR & 0x70 | 0x800003);
        ((Toolbar.LayoutParams)localObject).auo = 2;
        Toolbar.this.atO.setLayoutParams((ViewGroup.LayoutParams)localObject);
        Toolbar.this.addView(Toolbar.this.atO);
      }
      localToolbar = Toolbar.this;
      for (int i = localToolbar.getChildCount() - 1; i >= 0; i--)
      {
        localObject = localToolbar.getChildAt(i);
        if ((((Toolbar.LayoutParams)((View)localObject).getLayoutParams()).auo != 2) && (localObject != localToolbar.acw))
        {
          localToolbar.removeViewAt(i);
          localToolbar.aue.add(localObject);
        }
      }
      Toolbar.this.requestLayout();
      paramj.Z(true);
      if ((Toolbar.this.atO instanceof c))
        ((c)Toolbar.this.atO).onActionViewExpanded();
      return true;
    }

    public final boolean bt()
    {
      return false;
    }

    public final boolean c(j paramj)
    {
      if ((Toolbar.this.atO instanceof c))
        ((c)Toolbar.this.atO).onActionViewCollapsed();
      Toolbar.this.removeView(Toolbar.this.atO);
      Toolbar.this.removeView(Toolbar.this.atN);
      Toolbar.this.atO = null;
      Toolbar.this.lp();
      this.aun = null;
      Toolbar.this.requestLayout();
      paramj.Z(false);
      return true;
    }

    public final int getId()
    {
      return 0;
    }

    public final void n(boolean paramBoolean)
    {
      int i = 0;
      int j;
      int k;
      if (this.aun != null)
      {
        j = i;
        if (this.lo != null)
          k = this.lo.size();
      }
      for (int m = 0; ; m++)
      {
        j = i;
        if (m < k)
        {
          if (this.lo.getItem(m) == this.aun)
            j = 1;
        }
        else
        {
          if (j == 0)
            c(this.aun);
          return;
        }
      }
    }

    public final void onRestoreInstanceState(Parcelable paramParcelable)
    {
    }

    public final Parcelable onSaveInstanceState()
    {
      return null;
    }
  }

  public static abstract interface b
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.Toolbar
 * JD-Core Version:    0.6.2
 */