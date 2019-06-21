package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.c.a.b;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat extends CompoundButton
{
  private static final Property<SwitchCompat, Float> asP = new SwitchCompat.1(Float.class, "thumbPos");
  private static final int[] kO = { 16842912 };
  private int anQ;
  private Drawable asQ;
  private ColorStateList asR = null;
  private PorterDuff.Mode asS = null;
  private boolean asT = false;
  private boolean asU = false;
  private Drawable asV;
  private ColorStateList asW = null;
  private PorterDuff.Mode asX = null;
  private boolean asY = false;
  private boolean asZ = false;
  private int ata;
  private int atb;
  private int atc;
  private boolean atd;
  private CharSequence ate;
  private CharSequence atf;
  private boolean atg;
  private int ath;
  private float ati;
  private float atj;
  private float atk;
  private int atl;
  private int atm;
  private int atn;
  private int ato;
  private int atp;
  private int atq;
  private int atr;
  private ColorStateList ats;
  private Layout att;
  private Layout atu;
  private TransformationMethod atv;
  ObjectAnimator atw;
  private final Rect mTempRect = new Rect();
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker = VelocityTracker.obtain();
  private final TextPaint oz = new TextPaint(1);

  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772231);
  }

  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = getResources();
    this.oz.density = ((Resources)localObject).getDisplayMetrics().density;
    localObject = bc.a(paramContext, paramAttributeSet, a.a.SwitchCompat, paramInt, 0);
    this.asQ = ((bc)localObject).getDrawable(2);
    if (this.asQ != null)
      this.asQ.setCallback(this);
    this.asV = ((bc)localObject).getDrawable(5);
    if (this.asV != null)
      this.asV.setCallback(this);
    this.ate = ((bc)localObject).getText(0);
    this.atf = ((bc)localObject).getText(1);
    this.atg = ((bc)localObject).getBoolean(13, true);
    this.ata = ((bc)localObject).getDimensionPixelSize(8, 0);
    this.atb = ((bc)localObject).getDimensionPixelSize(10, 0);
    this.atc = ((bc)localObject).getDimensionPixelSize(11, 0);
    this.atd = ((bc)localObject).getBoolean(12, false);
    paramAttributeSet = ((bc)localObject).getColorStateList(3);
    if (paramAttributeSet != null)
    {
      this.asR = paramAttributeSet;
      this.asT = true;
    }
    paramAttributeSet = aa.d(((bc)localObject).getInt(4, -1), null);
    if (this.asS != paramAttributeSet)
    {
      this.asS = paramAttributeSet;
      this.asU = true;
    }
    if ((this.asT) || (this.asU))
      lj();
    paramAttributeSet = ((bc)localObject).getColorStateList(6);
    if (paramAttributeSet != null)
    {
      this.asW = paramAttributeSet;
      this.asY = true;
    }
    paramAttributeSet = aa.d(((bc)localObject).getInt(7, -1), null);
    if (this.asX != paramAttributeSet)
    {
      this.asX = paramAttributeSet;
      this.asZ = true;
    }
    if ((this.asY) || (this.asZ))
      li();
    paramInt = ((bc)localObject).getResourceId(9, 0);
    bc localbc;
    int i;
    label502: boolean bool;
    label517: label531: label552: float f;
    if (paramInt != 0)
    {
      localbc = bc.a(paramContext, paramInt, a.a.TextAppearance);
      paramAttributeSet = localbc.getColorStateList(3);
      if (paramAttributeSet == null)
        break label655;
      this.ats = paramAttributeSet;
      paramInt = localbc.getDimensionPixelSize(0, 0);
      if ((paramInt != 0) && (paramInt != this.oz.getTextSize()))
      {
        this.oz.setTextSize(paramInt);
        requestLayout();
      }
      paramInt = localbc.getInt(1, -1);
      i = localbc.getInt(2, -1);
      switch (paramInt)
      {
      default:
        paramAttributeSet = null;
        if (i > 0)
          if (paramAttributeSet == null)
          {
            paramAttributeSet = Typeface.defaultFromStyle(i);
            setSwitchTypeface(paramAttributeSet);
            if (paramAttributeSet == null)
              break label697;
            paramInt = paramAttributeSet.getStyle();
            paramInt = i & (paramInt ^ 0xFFFFFFFF);
            paramAttributeSet = this.oz;
            if ((paramInt & 0x1) == 0)
              break label702;
            bool = true;
            paramAttributeSet.setFakeBoldText(bool);
            paramAttributeSet = this.oz;
            if ((paramInt & 0x2) == 0)
              break label708;
            f = -0.25F;
            label573: paramAttributeSet.setTextSkewX(f);
            label579: if (!localbc.getBoolean(11, false))
              break label738;
          }
        break;
      case 1:
      case 2:
      case 3:
      }
    }
    label655: label697: label702: label708: label738: for (this.atv = new android.support.v7.g.a(getContext()); ; this.atv = null)
    {
      localbc.atG.recycle();
      ((bc)localObject).atG.recycle();
      paramContext = ViewConfiguration.get(paramContext);
      this.mTouchSlop = paramContext.getScaledTouchSlop();
      this.anQ = paramContext.getScaledMinimumFlingVelocity();
      refreshDrawableState();
      setChecked(isChecked());
      return;
      this.ats = getTextColors();
      break;
      paramAttributeSet = Typeface.SANS_SERIF;
      break label502;
      paramAttributeSet = Typeface.SERIF;
      break label502;
      paramAttributeSet = Typeface.MONOSPACE;
      break label502;
      paramAttributeSet = Typeface.create(paramAttributeSet, i);
      break label517;
      paramInt = 0;
      break label531;
      bool = false;
      break label552;
      f = 0.0F;
      break label573;
      this.oz.setFakeBoldText(false);
      this.oz.setTextSkewX(0.0F);
      setSwitchTypeface(paramAttributeSet);
      break label579;
    }
  }

  private boolean getTargetCheckedState()
  {
    if (this.atk > 0.5F);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private int getThumbOffset()
  {
    if (bk.bW(this));
    for (float f = 1.0F - this.atk; ; f = this.atk)
      return (int)(f * getThumbScrollRange() + 0.5F);
  }

  private int getThumbScrollRange()
  {
    Rect localRect1;
    Rect localRect2;
    if (this.asV != null)
    {
      localRect1 = this.mTempRect;
      this.asV.getPadding(localRect1);
      if (this.asQ != null)
        localRect2 = aa.m(this.asQ);
    }
    for (int i = this.atl - this.atn - localRect1.left - localRect1.right - localRect2.left - localRect2.right; ; i = 0)
    {
      return i;
      localRect2 = aa.ahT;
      break;
    }
  }

  private void li()
  {
    if ((this.asV != null) && ((this.asY) || (this.asZ)))
    {
      this.asV = this.asV.mutate();
      if (this.asY)
        android.support.v4.a.a.a.a(this.asV, this.asW);
      if (this.asZ)
        android.support.v4.a.a.a.a(this.asV, this.asX);
      if (this.asV.isStateful())
        this.asV.setState(getDrawableState());
    }
  }

  private void lj()
  {
    if ((this.asQ != null) && ((this.asT) || (this.asU)))
    {
      this.asQ = this.asQ.mutate();
      if (this.asT)
        android.support.v4.a.a.a.a(this.asQ, this.asR);
      if (this.asU)
        android.support.v4.a.a.a.a(this.asQ, this.asS);
      if (this.asQ.isStateful())
        this.asQ.setState(getDrawableState());
    }
  }

  private Layout n(CharSequence paramCharSequence)
  {
    TextPaint localTextPaint;
    if (this.atv != null)
    {
      paramCharSequence = this.atv.getTransformation(paramCharSequence, this);
      localTextPaint = this.oz;
      if (paramCharSequence == null)
        break label62;
    }
    label62: for (int i = (int)Math.ceil(Layout.getDesiredWidth(paramCharSequence, this.oz)); ; i = 0)
    {
      return new StaticLayout(paramCharSequence, localTextPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      break;
    }
  }

  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.mTempRect;
    int i = this.ato;
    int j = this.atp;
    int k = this.atq;
    int m = this.atr;
    int n = i + getThumbOffset();
    Object localObject;
    int i1;
    label134: int i3;
    int i4;
    if (this.asQ != null)
    {
      localObject = aa.m(this.asQ);
      if (this.asV == null)
        break label339;
      this.asV.getPadding(localRect);
      i1 = localRect.left;
      if (localObject == null)
        break label318;
      i2 = i;
      if (((Rect)localObject).left > localRect.left)
        i2 = i + (((Rect)localObject).left - localRect.left);
      if (((Rect)localObject).top <= localRect.top)
        break label312;
      i = ((Rect)localObject).top - localRect.top + j;
      i3 = k;
      if (((Rect)localObject).right > localRect.right)
        i3 = k - (((Rect)localObject).right - localRect.right);
      if (((Rect)localObject).bottom <= localRect.bottom)
        break label305;
      i4 = m - (((Rect)localObject).bottom - localRect.bottom);
      label192: this.asV.setBounds(i2, i, i3, i4);
    }
    label305: label312: label318: label339: for (int i2 = i1 + n; ; i2 = n)
    {
      if (this.asQ != null)
      {
        this.asQ.getPadding(localRect);
        i4 = i2 - localRect.left;
        i2 = i2 + this.atn + localRect.right;
        this.asQ.setBounds(i4, j, i2, m);
        localObject = getBackground();
        if (localObject != null)
          android.support.v4.a.a.a.a((Drawable)localObject, i4, j, i2, m);
      }
      super.draw(paramCanvas);
      return;
      localObject = aa.ahT;
      break;
      i4 = m;
      break label192;
      i = j;
      break label134;
      i4 = m;
      i3 = j;
      i2 = i;
      i = i3;
      i3 = k;
      break label192;
    }
  }

  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21)
      super.drawableHotspotChanged(paramFloat1, paramFloat2);
    if (this.asQ != null)
      android.support.v4.a.a.a.a(this.asQ, paramFloat1, paramFloat2);
    if (this.asV != null)
      android.support.v4.a.a.a.a(this.asV, paramFloat1, paramFloat2);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool1 = false;
    Drawable localDrawable = this.asQ;
    boolean bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful())
        bool2 = localDrawable.setState(arrayOfInt) | false;
    }
    localDrawable = this.asV;
    bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful())
        bool1 = bool2 | localDrawable.setState(arrayOfInt);
    }
    if (bool1)
      invalidate();
  }

  public int getCompoundPaddingLeft()
  {
    int i;
    if (!bk.bW(this))
      i = super.getCompoundPaddingLeft();
    while (true)
    {
      return i;
      int j = super.getCompoundPaddingLeft() + this.atl;
      i = j;
      if (!TextUtils.isEmpty(getText()))
        i = j + this.atc;
    }
  }

  public int getCompoundPaddingRight()
  {
    int i;
    if (bk.bW(this))
      i = super.getCompoundPaddingRight();
    while (true)
    {
      return i;
      int j = super.getCompoundPaddingRight() + this.atl;
      i = j;
      if (!TextUtils.isEmpty(getText()))
        i = j + this.atc;
    }
  }

  public boolean getShowText()
  {
    return this.atg;
  }

  public boolean getSplitTrack()
  {
    return this.atd;
  }

  public int getSwitchMinWidth()
  {
    return this.atb;
  }

  public int getSwitchPadding()
  {
    return this.atc;
  }

  public CharSequence getTextOff()
  {
    return this.atf;
  }

  public CharSequence getTextOn()
  {
    return this.ate;
  }

  public Drawable getThumbDrawable()
  {
    return this.asQ;
  }

  public int getThumbTextPadding()
  {
    return this.ata;
  }

  public ColorStateList getThumbTintList()
  {
    return this.asR;
  }

  public PorterDuff.Mode getThumbTintMode()
  {
    return this.asS;
  }

  public Drawable getTrackDrawable()
  {
    return this.asV;
  }

  public ColorStateList getTrackTintList()
  {
    return this.asW;
  }

  public PorterDuff.Mode getTrackTintMode()
  {
    return this.asX;
  }

  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.asQ != null)
      this.asQ.jumpToCurrentState();
    if (this.asV != null)
      this.asV.jumpToCurrentState();
    if ((this.atw != null) && (this.atw.isStarted()))
    {
      this.atw.end();
      this.atw = null;
    }
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      mergeDrawableStates(arrayOfInt, kO);
    return arrayOfInt;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Rect localRect = this.mTempRect;
    Object localObject1 = this.asV;
    int i;
    int j;
    int k;
    int m;
    Object localObject2;
    label138: int i1;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).getPadding(localRect);
      i = this.atp;
      j = this.atr;
      k = localRect.top;
      m = localRect.bottom;
      localObject2 = this.asQ;
      Object localObject3;
      if (localObject1 != null)
      {
        if ((!this.atd) || (localObject2 == null))
          break label311;
        localObject3 = aa.m((Drawable)localObject2);
        ((Drawable)localObject2).copyBounds(localRect);
        localRect.left += ((Rect)localObject3).left;
        localRect.right -= ((Rect)localObject3).right;
        n = paramCanvas.save();
        paramCanvas.clipRect(localRect, Region.Op.DIFFERENCE);
        ((Drawable)localObject1).draw(paramCanvas);
        paramCanvas.restoreToCount(n);
      }
      i1 = paramCanvas.save();
      if (localObject2 != null)
        ((Drawable)localObject2).draw(paramCanvas);
      if (!getTargetCheckedState())
        break label319;
      localObject1 = this.att;
      label167: if (localObject1 != null)
      {
        localObject3 = getDrawableState();
        if (this.ats != null)
          this.oz.setColor(this.ats.getColorForState((int[])localObject3, 0));
        this.oz.drawableState = ((int[])localObject3);
        if (localObject2 == null)
          break label327;
        localObject2 = ((Drawable)localObject2).getBounds();
        n = ((Rect)localObject2).left;
      }
    }
    label311: label319: label327: for (int n = ((Rect)localObject2).right + n; ; n = getWidth())
    {
      n /= 2;
      int i2 = ((Layout)localObject1).getWidth() / 2;
      k = (i + k + (j - m)) / 2;
      j = ((Layout)localObject1).getHeight() / 2;
      paramCanvas.translate(n - i2, k - j);
      ((Layout)localObject1).draw(paramCanvas);
      paramCanvas.restoreToCount(i1);
      return;
      localRect.setEmpty();
      break;
      ((Drawable)localObject1).draw(paramCanvas);
      break label138;
      localObject1 = this.atu;
      break label167;
    }
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }

  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
    CharSequence localCharSequence1;
    CharSequence localCharSequence2;
    if (isChecked())
    {
      localCharSequence1 = this.ate;
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (!TextUtils.isEmpty(localCharSequence2))
          break label57;
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
    }
    while (true)
    {
      return;
      localCharSequence1 = this.atf;
      break;
      label57: StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localCharSequence2).append(' ').append(localCharSequence1);
      paramAccessibilityNodeInfo.setText(localStringBuilder);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Rect localRect1;
    if (this.asQ != null)
    {
      localRect1 = this.mTempRect;
      if (this.asV != null)
      {
        this.asV.getPadding(localRect1);
        Rect localRect2 = aa.m(this.asQ);
        paramInt1 = Math.max(0, localRect2.left - localRect1.left);
        paramInt2 = Math.max(0, localRect2.right - localRect1.right);
      }
    }
    while (true)
    {
      if (bk.bW(this))
      {
        paramInt4 = getPaddingLeft() + paramInt1;
        paramInt3 = this.atl + paramInt4 - paramInt1 - paramInt2;
        label110: switch (getGravity() & 0x70)
        {
        default:
          paramInt2 = getPaddingTop();
          paramInt1 = this.atm + paramInt2;
        case 16:
        case 80:
        }
      }
      while (true)
      {
        this.ato = paramInt4;
        this.atp = paramInt2;
        this.atr = paramInt1;
        this.atq = paramInt3;
        return;
        localRect1.setEmpty();
        break;
        paramInt3 = getWidth() - getPaddingRight() - paramInt2;
        paramInt4 = paramInt2 + (paramInt1 + (paramInt3 - this.atl));
        break label110;
        paramInt2 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - this.atm / 2;
        paramInt1 = this.atm + paramInt2;
        continue;
        paramInt1 = getHeight() - getPaddingBottom();
        paramInt2 = paramInt1 - this.atm;
      }
      paramInt2 = 0;
      paramInt1 = 0;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (this.atg)
    {
      if (this.att == null)
        this.att = n(this.ate);
      if (this.atu == null)
        this.atu = n(this.atf);
    }
    Rect localRect = this.mTempRect;
    int k;
    int m;
    if (this.asQ != null)
    {
      this.asQ.getPadding(localRect);
      j = this.asQ.getIntrinsicWidth() - localRect.left - localRect.right;
      k = this.asQ.getIntrinsicHeight();
      if (!this.atg)
        break label306;
      m = Math.max(this.att.getWidth(), this.atu.getWidth()) + this.ata * 2;
      label133: this.atn = Math.max(m, j);
      if (this.asV == null)
        break label312;
      this.asV.getPadding(localRect);
    }
    for (int j = this.asV.getIntrinsicHeight(); ; j = i)
    {
      int n = localRect.left;
      int i1 = localRect.right;
      i = n;
      m = i1;
      if (this.asQ != null)
      {
        localRect = aa.m(this.asQ);
        i = Math.max(n, localRect.left);
        m = Math.max(i1, localRect.right);
      }
      m = Math.max(this.atb, i + this.atn * 2 + m);
      k = Math.max(j, k);
      this.atl = m;
      this.atm = k;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < k)
        setMeasuredDimension(getMeasuredWidthAndState(), k);
      return;
      k = 0;
      j = 0;
      break;
      label306: m = 0;
      break label133;
      label312: localRect.setEmpty();
    }
  }

  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked());
    for (CharSequence localCharSequence = this.ate; ; localCharSequence = this.atf)
    {
      if (localCharSequence != null)
        paramAccessibilityEvent.getText().add(localCharSequence);
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 1.0F;
    int i = 0;
    boolean bool1 = true;
    this.mVelocityTracker.addMovement(paramMotionEvent);
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      float f3;
      for (boolean bool2 = super.onTouchEvent(paramMotionEvent); ; bool2 = bool1)
      {
        return bool2;
        f2 = paramMotionEvent.getX();
        f3 = paramMotionEvent.getY();
        if (!isEnabled())
          break;
        j = i;
        if (this.asQ != null)
        {
          j = getThumbOffset();
          this.asQ.getPadding(this.mTempRect);
          int k = this.atp;
          int m = this.mTouchSlop;
          int n = j + this.ato - this.mTouchSlop;
          int i1 = this.atn;
          int i2 = this.mTempRect.left;
          int i3 = this.mTempRect.right;
          int i4 = this.mTouchSlop;
          int i5 = this.atr;
          int i6 = this.mTouchSlop;
          j = i;
          if (f2 > n)
          {
            j = i;
            if (f2 < i1 + n + i2 + i3 + i4)
            {
              j = i;
              if (f3 > k - m)
              {
                j = i;
                if (f3 < i5 + i6)
                  j = 1;
              }
            }
          }
        }
        if (j == 0)
          break;
        this.ath = 1;
        this.ati = f2;
        this.atj = f3;
        break;
        switch (this.ath)
        {
        case 0:
        default:
          break;
        case 1:
          f2 = paramMotionEvent.getX();
          f3 = paramMotionEvent.getY();
          if ((Math.abs(f2 - this.ati) <= this.mTouchSlop) && (Math.abs(f3 - this.atj) <= this.mTouchSlop))
            break;
          this.ath = 2;
          getParent().requestDisallowInterceptTouchEvent(true);
          this.ati = f2;
          this.atj = f3;
        case 2:
        }
      }
      float f4 = paramMotionEvent.getX();
      int j = getThumbScrollRange();
      float f2 = f4 - this.ati;
      if (j != 0)
      {
        f2 /= j;
        label417: f3 = f2;
        if (bk.bW(this))
          f3 = -f2;
        f3 += this.atk;
        if (f3 >= 0.0F)
          break label506;
        f2 = 0.0F;
      }
      while (true)
      {
        bool2 = bool1;
        if (f2 == this.atk)
          break;
        this.ati = f4;
        setThumbPosition(f2);
        bool2 = bool1;
        break;
        if (f2 > 0.0F)
        {
          f2 = 1.0F;
          break label417;
        }
        f2 = -1.0F;
        break label417;
        label506: f2 = f1;
        if (f3 <= 1.0F)
          f2 = f3;
      }
      if (this.ath == 2)
      {
        this.ath = 0;
        label554: boolean bool3;
        if ((paramMotionEvent.getAction() == 1) && (isEnabled()))
        {
          j = 1;
          bool3 = isChecked();
          if (j == 0)
            break label710;
          this.mVelocityTracker.computeCurrentVelocity(1000);
          f2 = this.mVelocityTracker.getXVelocity();
          if (Math.abs(f2) <= this.anQ)
            break label701;
          if (!bk.bW(this))
            break label682;
          if (f2 >= 0.0F)
            break label676;
          bool2 = true;
        }
        while (true)
        {
          if (bool2 != bool3)
            playSoundEffect(0);
          setChecked(bool2);
          MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent.setAction(3);
          super.onTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
          super.onTouchEvent(paramMotionEvent);
          bool2 = bool1;
          break;
          j = 0;
          break label554;
          label676: bool2 = false;
          continue;
          label682: if (f2 > 0.0F)
          {
            bool2 = true;
          }
          else
          {
            bool2 = false;
            continue;
            label701: bool2 = getTargetCheckedState();
            continue;
            label710: bool2 = bool3;
          }
        }
      }
      this.ath = 0;
      this.mVelocityTracker.clear();
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    float f = 1.0F;
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if ((getWindowToken() != null) && (s.as(this)))
    {
      if (paramBoolean);
      while (true)
      {
        this.atw = ObjectAnimator.ofFloat(this, asP, new float[] { f });
        this.atw.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18)
          this.atw.setAutoCancel(true);
        this.atw.start();
        return;
        f = 0.0F;
      }
    }
    if (this.atw != null)
      this.atw.cancel();
    if (paramBoolean);
    while (true)
    {
      setThumbPosition(f);
      break;
      f = 0.0F;
    }
  }

  public void setShowText(boolean paramBoolean)
  {
    if (this.atg != paramBoolean)
    {
      this.atg = paramBoolean;
      requestLayout();
    }
  }

  public void setSplitTrack(boolean paramBoolean)
  {
    this.atd = paramBoolean;
    invalidate();
  }

  public void setSwitchMinWidth(int paramInt)
  {
    this.atb = paramInt;
    requestLayout();
  }

  public void setSwitchPadding(int paramInt)
  {
    this.atc = paramInt;
    requestLayout();
  }

  public void setSwitchTypeface(Typeface paramTypeface)
  {
    if (((this.oz.getTypeface() != null) && (!this.oz.getTypeface().equals(paramTypeface))) || ((this.oz.getTypeface() == null) && (paramTypeface != null)))
    {
      this.oz.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }

  public void setTextOff(CharSequence paramCharSequence)
  {
    this.atf = paramCharSequence;
    requestLayout();
  }

  public void setTextOn(CharSequence paramCharSequence)
  {
    this.ate = paramCharSequence;
    requestLayout();
  }

  public void setThumbDrawable(Drawable paramDrawable)
  {
    if (this.asQ != null)
      this.asQ.setCallback(null);
    this.asQ = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    requestLayout();
  }

  void setThumbPosition(float paramFloat)
  {
    this.atk = paramFloat;
    invalidate();
  }

  public void setThumbResource(int paramInt)
  {
    setThumbDrawable(b.g(getContext(), paramInt));
  }

  public void setThumbTextPadding(int paramInt)
  {
    this.ata = paramInt;
    requestLayout();
  }

  public void setThumbTintList(ColorStateList paramColorStateList)
  {
    this.asR = paramColorStateList;
    this.asT = true;
    lj();
  }

  public void setThumbTintMode(PorterDuff.Mode paramMode)
  {
    this.asS = paramMode;
    this.asU = true;
    lj();
  }

  public void setTrackDrawable(Drawable paramDrawable)
  {
    if (this.asV != null)
      this.asV.setCallback(null);
    this.asV = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    requestLayout();
  }

  public void setTrackResource(int paramInt)
  {
    setTrackDrawable(b.g(getContext(), paramInt));
  }

  public void setTrackTintList(ColorStateList paramColorStateList)
  {
    this.asW = paramColorStateList;
    this.asY = true;
    li();
  }

  public void setTrackTintMode(PorterDuff.Mode paramMode)
  {
    this.asX = paramMode;
    this.asZ = true;
    li();
  }

  public void toggle()
  {
    if (!isChecked());
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.asQ) || (paramDrawable == this.asV));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SwitchCompat
 * JD-Core Version:    0.6.2
 */