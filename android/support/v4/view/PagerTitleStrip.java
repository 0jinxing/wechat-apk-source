package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.q;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;

@ViewPager.a
public class PagerTitleStrip extends ViewGroup
{
  private static final int[] MT = { 16842804, 16842901, 16842904, 16842927 };
  private static final int[] MU = { 16843660 };
  private int Hu;
  ViewPager MI;
  TextView MJ;
  TextView MK;
  TextView ML;
  private int MM = -1;
  float MN = -1.0F;
  private int MO;
  private boolean MP;
  private boolean MQ;
  private final a MR = new a();
  private WeakReference<p> MS;
  private int MV;
  int MW;

  public PagerTitleStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TextView localTextView = new TextView(paramContext);
    this.MJ = localTextView;
    addView(localTextView);
    localTextView = new TextView(paramContext);
    this.MK = localTextView;
    addView(localTextView);
    localTextView = new TextView(paramContext);
    this.ML = localTextView;
    addView(localTextView);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, MT);
    int i = paramAttributeSet.getResourceId(0, 0);
    if (i != 0)
    {
      q.b(this.MJ, i);
      q.b(this.MK, i);
      q.b(this.ML, i);
    }
    int j = paramAttributeSet.getDimensionPixelSize(1, 0);
    if (j != 0)
    {
      float f = j;
      this.MJ.setTextSize(0, f);
      this.MK.setTextSize(0, f);
      this.ML.setTextSize(0, f);
    }
    if (paramAttributeSet.hasValue(2))
    {
      j = paramAttributeSet.getColor(2, 0);
      this.MJ.setTextColor(j);
      this.MK.setTextColor(j);
      this.ML.setTextColor(j);
    }
    this.Hu = paramAttributeSet.getInteger(3, 80);
    paramAttributeSet.recycle();
    this.MW = this.MK.getTextColors().getDefaultColor();
    setNonPrimaryAlpha(0.6F);
    this.MJ.setEllipsize(TextUtils.TruncateAt.END);
    this.MK.setEllipsize(TextUtils.TruncateAt.END);
    this.ML.setEllipsize(TextUtils.TruncateAt.END);
    if (i != 0)
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(i, MU);
      bool = paramAttributeSet.getBoolean(0, false);
      paramAttributeSet.recycle();
    }
    if (bool)
    {
      setSingleLineAllCaps(this.MJ);
      setSingleLineAllCaps(this.MK);
      setSingleLineAllCaps(this.ML);
    }
    while (true)
    {
      this.MO = ((int)(paramContext.getResources().getDisplayMetrics().density * 16.0F));
      return;
      this.MJ.setSingleLine();
      this.MK.setSingleLine();
      this.ML.setSingleLine();
    }
  }

  private static void setSingleLineAllCaps(TextView paramTextView)
  {
    paramTextView.setTransformationMethod(new PagerTitleStrip.b(paramTextView.getContext()));
  }

  void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    if (paramInt != this.MM)
    {
      a(paramInt, this.MI.getAdapter());
      this.MQ = true;
      i = this.MJ.getMeasuredWidth();
      j = this.MK.getMeasuredWidth();
      k = this.ML.getMeasuredWidth();
      m = j / 2;
      n = getWidth();
      i1 = getHeight();
      i2 = getPaddingLeft();
      i3 = getPaddingRight();
      paramInt = getPaddingTop();
      i4 = getPaddingBottom();
      i5 = i3 + m;
      float f1 = 0.5F + paramFloat;
      float f2 = f1;
      if (f1 > 1.0F)
        f2 = f1 - 1.0F;
      m = n - i5 - (int)(f2 * (n - (i2 + m) - i5)) - m;
      i5 = m + j;
      i6 = this.MJ.getBaseline();
      j = this.MK.getBaseline();
      i7 = this.ML.getBaseline();
      i8 = Math.max(Math.max(i6, j), i7);
      i6 = i8 - i6;
      j = i8 - j;
      i8 -= i7;
      int i9 = this.MJ.getMeasuredHeight();
      i7 = this.MK.getMeasuredHeight();
      int i10 = this.ML.getMeasuredHeight();
      i7 = Math.max(Math.max(i9 + i6, i7 + j), i10 + i8);
      switch (this.Hu & 0x70)
      {
      default:
        i4 = paramInt + i6;
        j = paramInt + j;
        paramInt += i8;
      case 16:
      case 80:
      }
    }
    while (true)
    {
      this.MK.layout(m, j, i5, this.MK.getMeasuredHeight() + j);
      j = Math.min(i2, m - this.MO - i);
      this.MJ.layout(j, i4, i + j, this.MJ.getMeasuredHeight() + i4);
      j = Math.max(n - i3 - k, this.MO + i5);
      this.ML.layout(j, paramInt, j + k, this.ML.getMeasuredHeight() + paramInt);
      this.MN = paramFloat;
      this.MQ = false;
      while (true)
      {
        return;
        if ((paramBoolean) || (paramFloat != this.MN))
          break;
      }
      paramInt = (i1 - paramInt - i4 - i7) / 2;
      i4 = paramInt + i6;
      j = paramInt + j;
      paramInt += i8;
      continue;
      paramInt = i1 - i4 - i7;
      i4 = paramInt + i6;
      j = paramInt + j;
      paramInt += i8;
    }
  }

  final void a(int paramInt, p paramp)
  {
    Object localObject1 = null;
    int i;
    if (paramp != null)
    {
      i = paramp.getCount();
      this.MP = true;
      if ((paramInt <= 0) || (paramp == null))
        break label240;
    }
    label240: for (Object localObject2 = paramp.getPageTitle(paramInt - 1); ; localObject2 = null)
    {
      this.MJ.setText((CharSequence)localObject2);
      TextView localTextView = this.MK;
      if ((paramp != null) && (paramInt < i));
      for (localObject2 = paramp.getPageTitle(paramInt); ; localObject2 = null)
      {
        localTextView.setText((CharSequence)localObject2);
        localObject2 = localObject1;
        if (paramInt + 1 < i)
        {
          localObject2 = localObject1;
          if (paramp != null)
            localObject2 = paramp.getPageTitle(paramInt + 1);
        }
        this.ML.setText((CharSequence)localObject2);
        i = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), -2147483648);
        int j = View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), -2147483648);
        this.MJ.measure(i, j);
        this.MK.measure(i, j);
        this.ML.measure(i, j);
        this.MM = paramInt;
        if (!this.MQ)
          a(paramInt, this.MN, false);
        this.MP = false;
        return;
        i = 0;
        break;
      }
    }
  }

  final void a(p paramp1, p paramp2)
  {
    if (paramp1 != null)
    {
      paramp1.unregisterDataSetObserver(this.MR);
      this.MS = null;
    }
    if (paramp2 != null)
    {
      paramp2.registerDataSetObserver(this.MR);
      this.MS = new WeakReference(paramp2);
    }
    if (this.MI != null)
    {
      this.MM = -1;
      this.MN = -1.0F;
      a(this.MI.getCurrentItem(), paramp2);
      requestLayout();
    }
  }

  int getMinHeight()
  {
    int i = 0;
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
      i = localDrawable.getIntrinsicHeight();
    return i;
  }

  public int getTextSpacing()
  {
    return this.MO;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = getParent();
    if (!(localObject instanceof ViewPager))
      throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    localObject = (ViewPager)localObject;
    p localp = ((ViewPager)localObject).getAdapter();
    ((ViewPager)localObject).setInternalPageChangeListener(this.MR);
    ((ViewPager)localObject).addOnAdapterChangeListener(this.MR);
    this.MI = ((ViewPager)localObject);
    if (this.MS != null);
    for (localObject = (p)this.MS.get(); ; localObject = null)
    {
      a((p)localObject, localp);
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.MI != null)
    {
      a(this.MI.getAdapter(), null);
      this.MI.setInternalPageChangeListener(null);
      this.MI.removeOnAdapterChangeListener(this.MR);
      this.MI = null;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f = 0.0F;
    if (this.MI != null)
    {
      if (this.MN >= 0.0F)
        f = this.MN;
      a(this.MM, f, true);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      throw new IllegalStateException("Must measure with an exact width");
    int i = getPaddingTop() + getPaddingBottom();
    int j = getChildMeasureSpec(paramInt2, i, -2);
    int k = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = getChildMeasureSpec(paramInt1, (int)(k * 0.2F), -2);
    this.MJ.measure(paramInt1, j);
    this.MK.measure(paramInt1, j);
    this.ML.measure(paramInt1, j);
    if (View.MeasureSpec.getMode(paramInt2) == 1073741824);
    for (paramInt1 = View.MeasureSpec.getSize(paramInt2); ; paramInt1 = Math.max(getMinHeight(), i + paramInt1))
    {
      setMeasuredDimension(k, View.resolveSizeAndState(paramInt1, paramInt2, this.MK.getMeasuredState() << 16));
      return;
      paramInt1 = this.MK.getMeasuredHeight();
    }
  }

  public void requestLayout()
  {
    if (!this.MP)
      super.requestLayout();
  }

  public void setGravity(int paramInt)
  {
    this.Hu = paramInt;
    requestLayout();
  }

  public void setNonPrimaryAlpha(float paramFloat)
  {
    this.MV = ((int)(255.0F * paramFloat) & 0xFF);
    int i = this.MV << 24 | this.MW & 0xFFFFFF;
    this.MJ.setTextColor(i);
    this.ML.setTextColor(i);
  }

  public void setTextColor(int paramInt)
  {
    this.MW = paramInt;
    this.MK.setTextColor(paramInt);
    paramInt = this.MV << 24 | this.MW & 0xFFFFFF;
    this.MJ.setTextColor(paramInt);
    this.ML.setTextColor(paramInt);
  }

  public void setTextSpacing(int paramInt)
  {
    this.MO = paramInt;
    requestLayout();
  }

  final class a extends DataSetObserver
    implements ViewPager.OnPageChangeListener, ViewPager.c
  {
    private int mScrollState;

    a()
    {
    }

    public final void a(ViewPager paramViewPager, p paramp1, p paramp2)
    {
      PagerTitleStrip.this.a(paramp1, paramp2);
    }

    public final void onChanged()
    {
      float f = 0.0F;
      PagerTitleStrip.this.a(PagerTitleStrip.this.MI.getCurrentItem(), PagerTitleStrip.this.MI.getAdapter());
      if (PagerTitleStrip.this.MN >= 0.0F)
        f = PagerTitleStrip.this.MN;
      PagerTitleStrip.this.a(PagerTitleStrip.this.MI.getCurrentItem(), f, true);
    }

    public final void onPageScrollStateChanged(int paramInt)
    {
      this.mScrollState = paramInt;
    }

    public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
    {
      paramInt2 = paramInt1;
      if (paramFloat > 0.5F)
        paramInt2 = paramInt1 + 1;
      PagerTitleStrip.this.a(paramInt2, paramFloat, false);
    }

    public final void onPageSelected(int paramInt)
    {
      float f = 0.0F;
      if (this.mScrollState == 0)
      {
        PagerTitleStrip.this.a(PagerTitleStrip.this.MI.getCurrentItem(), PagerTitleStrip.this.MI.getAdapter());
        if (PagerTitleStrip.this.MN >= 0.0F)
          f = PagerTitleStrip.this.MN;
        PagerTitleStrip.this.a(PagerTitleStrip.this.MI.getCurrentItem(), f, true);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTitleStrip
 * JD-Core Version:    0.6.2
 */