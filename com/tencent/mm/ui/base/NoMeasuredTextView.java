package com.tencent.mm.ui.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.BoringLayout.Metrics;
import android.text.Editable;
import android.text.Editable.Factory;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.method.KeyListener;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

@SuppressLint({"ResourceAsColor"})
public class NoMeasuredTextView extends View
{
  private static final BoringLayout.Metrics yAd;
  private int Hu;
  private int dg;
  private int di;
  private ColorStateList lP;
  private boolean mSingleLine;
  private CharSequence mText;
  private TextPaint oz;
  private int yAa;
  private int yAb;
  private NoMeasuredTextView.c yAc;
  private String ysq;
  private int ysr;
  private int yss;
  private NoMeasuredTextView.a yzA;
  private KeyListener yzB;
  private Layout yzC;
  private float yzD;
  private float yzE;
  private int yzF;
  private int yzG;
  private int yzH;
  private int yzI;
  private boolean yzJ;
  private boolean yzK;
  private int yzL;
  private boolean yzM;
  private BoringLayout yzN;
  private boolean yzO;
  private int yzP;
  private Paint.FontMetricsInt yzQ;
  private boolean yzR;
  private boolean yzS;
  private NoMeasuredTextView.b yzT;
  private boolean yzU;
  public boolean yzV;
  private boolean yzW;
  private boolean yzX;
  private int yzY;
  private int yzZ;
  private int yzv;
  private Editable.Factory yzw;
  private Spannable.Factory yzx;
  private TextUtils.TruncateAt yzy;
  private CharSequence yzz;

  static
  {
    AppMethodBeat.i(107081);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.measureText("H");
    yAd = new BoringLayout.Metrics();
    AppMethodBeat.o(107081);
  }

  public NoMeasuredTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107009);
    this.yzw = Editable.Factory.getInstance();
    this.yzx = Spannable.Factory.getInstance();
    this.yzy = null;
    this.yzA = NoMeasuredTextView.a.yAe;
    this.Hu = 51;
    this.yzD = 1.0F;
    this.yzE = 0.0F;
    this.yzF = 2147483647;
    this.yzG = 1;
    this.yzH = 0;
    this.yzI = 1;
    this.di = 2147483647;
    this.yzJ = false;
    this.dg = 0;
    this.yzK = false;
    this.yzL = -1;
    this.yzM = true;
    this.yzO = false;
    this.yzR = false;
    this.yzS = false;
    this.yzU = false;
    this.yzV = false;
    this.yzW = false;
    this.yzX = false;
    this.yzY = -1;
    this.yzZ = -1;
    this.yAa = -1;
    this.yAb = -1;
    this.mText = "";
    this.yzz = "";
    this.oz = new TextPaint(1);
    this.oz.density = getResources().getDisplayMetrics().density;
    setDrawingCacheEnabled(false);
    this.yzQ = this.oz.getFontMetricsInt();
    dAs();
    setSingleLine(true);
    setEllipsize(null);
    AppMethodBeat.o(107009);
  }

  private void NK(int paramInt)
  {
    AppMethodBeat.i(107072);
    if (this.yzO)
    {
      dAs();
      invalidate();
      AppMethodBeat.o(107072);
    }
    while (true)
    {
      return;
      if (getWidth() == 0)
      {
        requestLayout();
        invalidate();
        AppMethodBeat.o(107072);
      }
      else if (this.yzC == null)
      {
        dAr();
        if (this.yzC.getHeight() != getHeight())
          requestLayout();
        invalidate();
        AppMethodBeat.o(107072);
      }
      else
      {
        int i = this.yzC.getHeight();
        int j = this.yzC.getWidth();
        hl(j, j - paramInt);
        if (this.yzy != TextUtils.TruncateAt.MARQUEE)
        {
          if ((getLayoutParams().height != -2) && (getLayoutParams().height != -1))
          {
            invalidate();
            AppMethodBeat.o(107072);
          }
          else
          {
            paramInt = this.yzC.getHeight();
            if ((paramInt == i) && (paramInt == getHeight()))
            {
              invalidate();
              AppMethodBeat.o(107072);
            }
          }
        }
        else
        {
          requestLayout();
          invalidate();
          AppMethodBeat.o(107072);
        }
      }
    }
  }

  private void a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    AppMethodBeat.i(107011);
    Object localObject1 = this.yzT;
    int i;
    if ((paramDrawable1 != null) || (paramDrawable2 != null))
    {
      i = 1;
      if (i != 0)
        break label185;
      if (localObject1 != null)
      {
        if (((NoMeasuredTextView.b)localObject1).yAv != 0)
          break label60;
        this.yzT = null;
      }
    }
    while (true)
    {
      invalidate();
      AppMethodBeat.o(107011);
      return;
      i = 0;
      break;
      label60: if (((NoMeasuredTextView.b)localObject1).yAl != null)
        ((NoMeasuredTextView.b)localObject1).yAl.setCallback(null);
      ((NoMeasuredTextView.b)localObject1).yAl = null;
      if (((NoMeasuredTextView.b)localObject1).yAj != null)
        ((NoMeasuredTextView.b)localObject1).yAj.setCallback(null);
      ((NoMeasuredTextView.b)localObject1).yAj = null;
      if (((NoMeasuredTextView.b)localObject1).yAm != null)
        ((NoMeasuredTextView.b)localObject1).yAm.setCallback(null);
      ((NoMeasuredTextView.b)localObject1).yAm = null;
      if (((NoMeasuredTextView.b)localObject1).yAk != null)
        ((NoMeasuredTextView.b)localObject1).yAk.setCallback(null);
      ((NoMeasuredTextView.b)localObject1).yAk = null;
      ((NoMeasuredTextView.b)localObject1).yAt = 0;
      ((NoMeasuredTextView.b)localObject1).yAp = 0;
      paramDrawable1 = (Drawable)localObject1;
      paramDrawable1.yAu = 0;
      paramDrawable1.yAq = 0;
      label162: paramDrawable1.yAr = 0;
      paramDrawable1.yAn = 0;
      paramDrawable1.yAs = 0;
      paramDrawable1.yAo = 0;
    }
    label185: Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new NoMeasuredTextView.b(this);
      this.yzT = ((NoMeasuredTextView.b)localObject2);
    }
    if ((((NoMeasuredTextView.b)localObject2).yAl != paramDrawable1) && (((NoMeasuredTextView.b)localObject2).yAl != null))
      ((NoMeasuredTextView.b)localObject2).yAl.setCallback(null);
    ((NoMeasuredTextView.b)localObject2).yAl = paramDrawable1;
    if ((((NoMeasuredTextView.b)localObject2).yAj != null) && (((NoMeasuredTextView.b)localObject2).yAj != null))
      ((NoMeasuredTextView.b)localObject2).yAj.setCallback(null);
    ((NoMeasuredTextView.b)localObject2).yAj = null;
    if ((((NoMeasuredTextView.b)localObject2).yAm != paramDrawable2) && (((NoMeasuredTextView.b)localObject2).yAm != null))
      ((NoMeasuredTextView.b)localObject2).yAm.setCallback(null);
    ((NoMeasuredTextView.b)localObject2).yAm = paramDrawable2;
    if ((((NoMeasuredTextView.b)localObject2).yAk != null) && (((NoMeasuredTextView.b)localObject2).yAk != null))
      ((NoMeasuredTextView.b)localObject2).yAk.setCallback(null);
    ((NoMeasuredTextView.b)localObject2).yAk = null;
    localObject1 = ((NoMeasuredTextView.b)localObject2).yAi;
    int[] arrayOfInt = getDrawableState();
    if (paramDrawable1 != null)
    {
      paramDrawable1.setState(arrayOfInt);
      paramDrawable1.copyBounds((Rect)localObject1);
      paramDrawable1.setCallback(this);
      ((NoMeasuredTextView.b)localObject2).yAp = ((Rect)localObject1).width();
      ((NoMeasuredTextView.b)localObject2).yAt = ((Rect)localObject1).height();
    }
    while (true)
    {
      paramDrawable1 = (Drawable)localObject2;
      if (paramDrawable2 == null)
        break;
      paramDrawable2.setState(arrayOfInt);
      paramDrawable2.copyBounds((Rect)localObject1);
      paramDrawable2.setCallback(this);
      ((NoMeasuredTextView.b)localObject2).yAq = ((Rect)localObject1).width();
      ((NoMeasuredTextView.b)localObject2).yAu = ((Rect)localObject1).height();
      paramDrawable1 = (Drawable)localObject2;
      break label162;
      ((NoMeasuredTextView.b)localObject2).yAt = 0;
      ((NoMeasuredTextView.b)localObject2).yAp = 0;
    }
  }

  private void a(CharSequence paramCharSequence, NoMeasuredTextView.a parama)
  {
    AppMethodBeat.i(107057);
    if (paramCharSequence == null)
      paramCharSequence = "";
    while (true)
    {
      if (paramCharSequence.equals(this.mText))
      {
        AppMethodBeat.o(107057);
        return;
      }
      CharSequence localCharSequence = paramCharSequence;
      if (getMeasuredWidth() > 0)
      {
        localCharSequence = paramCharSequence;
        if (this.yAc != null)
        {
          localCharSequence = paramCharSequence;
          if (!bo.isNullOrNil(this.ysq))
          {
            localCharSequence = this.yAc.a(this, paramCharSequence, this.ysq, this.ysr, this.yss);
            this.ysq = null;
          }
        }
      }
      label102: label125: int j;
      if ((localCharSequence instanceof Spanned))
      {
        this.yzO = false;
        if ((parama != NoMeasuredTextView.a.yAg) && (this.yzB == null))
          break label238;
        paramCharSequence = this.yzw.newEditable(localCharSequence);
        int i = getCompoundPaddingRight();
        j = getCompoundPaddingLeft() + i;
        localCharSequence = paramCharSequence;
        if (this.yzS)
        {
          if (!this.yzJ)
            break label259;
          i = this.di;
          if (getMeasuredWidth() > 0)
            i = Math.min(this.di, getMeasuredWidth());
          localCharSequence = TextUtils.ellipsize(paramCharSequence, this.oz, i - j, TextUtils.TruncateAt.END);
        }
      }
      while (true)
      {
        this.yzA = parama;
        this.mText = localCharSequence;
        this.yzz = localCharSequence;
        NK(j);
        AppMethodBeat.o(107057);
        break;
        this.yzO = true;
        break label102;
        label238: paramCharSequence = localCharSequence;
        if (parama != NoMeasuredTextView.a.yAf)
          break label125;
        paramCharSequence = this.yzx.newSpannable(localCharSequence);
        break label125;
        label259: if (getMeasuredWidth() > 0)
        {
          localCharSequence = TextUtils.ellipsize(paramCharSequence, this.oz, getMeasuredWidth() - j, TextUtils.TruncateAt.END);
        }
        else
        {
          this.yzR = true;
          localCharSequence = paramCharSequence;
        }
      }
    }
  }

  private void dAq()
  {
    if (((this.yzC instanceof BoringLayout)) && (this.yzN == null))
      this.yzN = ((BoringLayout)this.yzC);
    this.yzC = null;
  }

  private void dAr()
  {
    AppMethodBeat.i(107066);
    if (this.yzJ);
    for (int i = this.di - getCompoundPaddingLeft() - getCompoundPaddingRight(); ; i = getRight() - getLeft() - getCompoundPaddingLeft() - getCompoundPaddingRight())
    {
      int j = i;
      if (i <= 0)
        j = 0;
      hl(j, j);
      AppMethodBeat.o(107066);
      return;
    }
  }

  private void dAs()
  {
    AppMethodBeat.i(107071);
    if (this.yzP == 0)
      this.yzP = ((int)(Math.ceil(this.yzQ.descent - this.yzQ.ascent) + 2.0D));
    AppMethodBeat.o(107071);
  }

  private int getBottomVerticalOffset$1385f2()
  {
    AppMethodBeat.i(138365);
    int i = 0;
    int j = this.Hu & 0x70;
    Layout localLayout = this.yzC;
    int k = i;
    int m;
    int n;
    if (j != 80)
    {
      m = getMeasuredHeight() - getExtendedPaddingTop() - getExtendedPaddingBottom();
      n = localLayout.getHeight();
      k = i;
      if (n < m)
        if (j != 48)
          break label84;
    }
    label84: for (k = m - n; ; k = m - n >> 1)
    {
      AppMethodBeat.o(138365);
      return k;
    }
  }

  private int getDesiredHeight()
  {
    AppMethodBeat.i(107070);
    Layout localLayout = this.yzC;
    if (localLayout == null)
    {
      i = 0;
      AppMethodBeat.o(107070);
      return i;
    }
    int j = localLayout.getLineCount();
    int i = getCompoundPaddingTop();
    int k = getCompoundPaddingBottom() + i;
    i = localLayout.getLineTop(j) + k;
    int m;
    if (this.yzG == 1)
    {
      m = j;
      if (j > this.yzF)
      {
        i = localLayout.getLineTop(this.yzF) + localLayout.getBottomPadding() + k;
        m = this.yzF;
      }
      label94: if (this.yzI != 1)
        break label163;
      j = i;
      if (m < this.yzH)
        j = getLineHeight();
    }
    label163: for (j = i + (this.yzH - m) * j; ; j = Math.max(i, this.yzH))
    {
      i = Math.max(j, getSuggestedMinimumHeight());
      AppMethodBeat.o(107070);
      break;
      i = Math.min(i, this.yzF);
      m = j;
      break label94;
    }
  }

  private int getVerticalOffset$1385f2()
  {
    AppMethodBeat.i(107060);
    int i = 0;
    int j = this.Hu & 0x70;
    Layout localLayout = this.yzC;
    int k = i;
    int m;
    int n;
    if (j != 48)
    {
      m = getMeasuredHeight() - getExtendedPaddingTop() - getExtendedPaddingBottom();
      n = localLayout.getHeight();
      k = i;
      if (n < m)
        if (j != 80)
          break label84;
    }
    label84: for (k = m - n; ; k = m - n >> 1)
    {
      AppMethodBeat.o(107060);
      return k;
    }
  }

  private void hl(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107067);
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      Layout.Alignment localAlignment;
      int i;
      switch (this.Hu & 0x7)
      {
      default:
        localAlignment = Layout.Alignment.ALIGN_NORMAL;
        if ((this.yzy != null) && (this.yzB == null))
        {
          i = 1;
          label65: if (i == 0)
            break label145;
          this.yzC = new StaticLayout(this.yzz, 0, this.yzz.length(), this.oz, paramInt1, localAlignment, this.yzD, this.yzE, this.yzM, this.yzy, paramInt2);
          AppMethodBeat.o(107067);
        }
        break;
      case 1:
      case 5:
      }
      while (true)
      {
        return;
        localAlignment = Layout.Alignment.ALIGN_CENTER;
        break;
        localAlignment = Layout.Alignment.ALIGN_OPPOSITE;
        break;
        i = 0;
        break label65;
        label145: this.yzC = new StaticLayout(this.yzz, this.oz, paramInt1, localAlignment, this.yzD, this.yzE, this.yzM);
        AppMethodBeat.o(107067);
      }
    }
  }

  private void setRawTextSize(float paramFloat)
  {
    AppMethodBeat.i(107034);
    if (paramFloat != this.oz.getTextSize())
    {
      this.oz.setTextSize(paramFloat);
      this.yzQ = this.oz.getFontMetricsInt();
      this.yzP = ((int)(Math.ceil(this.yzQ.descent - this.yzQ.ascent) + 2.0D));
      if (this.yzC != null)
      {
        dAq();
        requestLayout();
        invalidate();
      }
    }
    AppMethodBeat.o(107034);
  }

  private void updateTextColors()
  {
    int i = 0;
    AppMethodBeat.i(107052);
    int j = this.lP.getColorForState(getDrawableState(), 0);
    if (j != this.yzv)
    {
      this.yzv = j;
      i = 1;
    }
    if (i != 0)
      invalidate();
    AppMethodBeat.o(107052);
  }

  public final void au(String paramString, int paramInt1, int paramInt2)
  {
    this.ysq = paramString;
    this.ysr = paramInt1;
    this.yss = paramInt2;
  }

  protected int computeHorizontalScrollRange()
  {
    AppMethodBeat.i(107077);
    int i;
    if (this.yzC != null)
    {
      i = this.yzC.getWidth();
      AppMethodBeat.o(107077);
    }
    while (true)
    {
      return i;
      i = super.computeHorizontalScrollRange();
      AppMethodBeat.o(107077);
    }
  }

  protected int computeVerticalScrollExtent()
  {
    AppMethodBeat.i(107079);
    int i = getHeight();
    int j = getCompoundPaddingTop();
    int k = getCompoundPaddingBottom();
    AppMethodBeat.o(107079);
    return i - j - k;
  }

  protected int computeVerticalScrollRange()
  {
    AppMethodBeat.i(107078);
    int i;
    if (this.yzC != null)
    {
      i = this.yzC.getHeight();
      AppMethodBeat.o(107078);
    }
    while (true)
    {
      return i;
      i = super.computeVerticalScrollRange();
      AppMethodBeat.o(107078);
    }
  }

  protected void drawableStateChanged()
  {
    AppMethodBeat.i(107016);
    super.drawableStateChanged();
    if ((this.lP != null) && (this.lP.isStateful()))
      updateTextColors();
    NoMeasuredTextView.b localb = this.yzT;
    if (localb != null)
    {
      int[] arrayOfInt = getDrawableState();
      if ((localb.yAj != null) && (localb.yAj.isStateful()))
        localb.yAj.setState(arrayOfInt);
      if ((localb.yAk != null) && (localb.yAk.isStateful()))
        localb.yAk.setState(arrayOfInt);
      if ((localb.yAl != null) && (localb.yAl.isStateful()))
        localb.yAl.setState(arrayOfInt);
      if ((localb.yAm != null) && (localb.yAm.isStateful()))
        localb.yAm.setState(arrayOfInt);
    }
    AppMethodBeat.o(107016);
  }

  public int getBaseline()
  {
    AppMethodBeat.i(107065);
    if (this.yzC == null)
    {
      i = super.getBaseline();
      AppMethodBeat.o(107065);
      return i;
    }
    if ((this.Hu & 0x70) != 48);
    for (int i = getVerticalOffset$1385f2(); ; i = 0)
    {
      i = i + getExtendedPaddingTop() + this.yzC.getLineBaseline(0);
      AppMethodBeat.o(107065);
      break;
    }
  }

  public int getCompoundDrawablePadding()
  {
    NoMeasuredTextView.b localb = this.yzT;
    if (localb != null);
    for (int i = localb.yAv; ; i = 0)
      return i;
  }

  public Drawable[] getCompoundDrawables()
  {
    NoMeasuredTextView.b localb = this.yzT;
    Drawable[] arrayOfDrawable;
    if (localb != null)
    {
      arrayOfDrawable = new Drawable[4];
      arrayOfDrawable[0] = localb.yAl;
      arrayOfDrawable[1] = localb.yAj;
      arrayOfDrawable[2] = localb.yAm;
      arrayOfDrawable[3] = localb.yAk;
    }
    while (true)
    {
      return arrayOfDrawable;
      arrayOfDrawable = new Drawable[4];
      arrayOfDrawable[0] = null;
      arrayOfDrawable[1] = null;
      arrayOfDrawable[2] = null;
      arrayOfDrawable[3] = null;
    }
  }

  public int getCompoundPaddingBottom()
  {
    AppMethodBeat.i(107021);
    NoMeasuredTextView.b localb = this.yzT;
    int i;
    if ((localb == null) || (localb.yAk == null) || (!this.yzX))
    {
      i = getPaddingBottom();
      AppMethodBeat.o(107021);
    }
    while (true)
    {
      return i;
      int j = getPaddingBottom();
      i = localb.yAv;
      i = localb.yAo + (j + i);
      AppMethodBeat.o(107021);
    }
  }

  public int getCompoundPaddingLeft()
  {
    AppMethodBeat.i(107022);
    NoMeasuredTextView.b localb = this.yzT;
    int i;
    if ((localb == null) || (localb.yAl == null) || (!this.yzU))
    {
      i = getPaddingLeft();
      AppMethodBeat.o(107022);
    }
    while (true)
    {
      return i;
      i = getPaddingLeft();
      int j = localb.yAv;
      i = localb.yAp + (i + j);
      AppMethodBeat.o(107022);
    }
  }

  public int getCompoundPaddingRight()
  {
    AppMethodBeat.i(107023);
    NoMeasuredTextView.b localb = this.yzT;
    int i;
    if ((localb == null) || (localb.yAm == null) || (!this.yzV))
    {
      i = getPaddingRight();
      AppMethodBeat.o(107023);
    }
    while (true)
    {
      return i;
      int j = getPaddingRight();
      i = localb.yAv;
      i = localb.yAq + (j + i);
      AppMethodBeat.o(107023);
    }
  }

  public int getCompoundPaddingTop()
  {
    AppMethodBeat.i(107020);
    NoMeasuredTextView.b localb = this.yzT;
    int i;
    if ((localb == null) || (localb.yAj == null) || (!this.yzW))
    {
      i = getPaddingTop();
      AppMethodBeat.o(107020);
    }
    while (true)
    {
      return i;
      int j = getPaddingTop();
      i = localb.yAv;
      i = localb.yAn + (j + i);
      AppMethodBeat.o(107020);
    }
  }

  public final int getCurrentTextColor()
  {
    return this.yzv;
  }

  protected boolean getDefaultEditable()
  {
    return false;
  }

  protected MovementMethod getDefaultMovementMethod()
  {
    return null;
  }

  public Editable getEditableText()
  {
    if ((this.mText instanceof Editable));
    for (Editable localEditable = (Editable)this.mText; ; localEditable = null)
      return localEditable;
  }

  @ViewDebug.ExportedProperty
  public TextUtils.TruncateAt getEllipsize()
  {
    return this.yzy;
  }

  public int getExtendedPaddingBottom()
  {
    AppMethodBeat.i(107025);
    int i;
    if ((this.yzC == null) || (this.yzG != 1))
    {
      i = getCompoundPaddingBottom();
      AppMethodBeat.o(107025);
    }
    while (true)
    {
      return i;
      if (this.yzC.getLineCount() <= this.yzF)
      {
        i = getCompoundPaddingBottom();
        AppMethodBeat.o(107025);
      }
      else
      {
        int j = getCompoundPaddingTop();
        i = getCompoundPaddingBottom();
        int k = getHeight() - j - i;
        int m = this.yzC.getLineTop(this.yzF);
        if (m >= k)
        {
          AppMethodBeat.o(107025);
        }
        else
        {
          j = this.Hu & 0x70;
          if (j == 48)
          {
            i = i + k - m;
            AppMethodBeat.o(107025);
          }
          else if (j == 80)
          {
            AppMethodBeat.o(107025);
          }
          else
          {
            i += (k - m) / 2;
            AppMethodBeat.o(107025);
          }
        }
      }
    }
  }

  public int getExtendedPaddingTop()
  {
    AppMethodBeat.i(107024);
    int i;
    if ((this.yzC == null) || (this.yzG != 1))
    {
      i = getCompoundPaddingTop();
      AppMethodBeat.o(107024);
    }
    while (true)
    {
      return i;
      if (this.yzC.getLineCount() <= this.yzF)
      {
        i = getCompoundPaddingTop();
        AppMethodBeat.o(107024);
      }
      else
      {
        i = getCompoundPaddingTop();
        int j = getCompoundPaddingBottom();
        j = getHeight() - i - j;
        int k = this.yzC.getLineTop(this.yzF);
        if (k >= j)
        {
          AppMethodBeat.o(107024);
        }
        else
        {
          int m = this.Hu & 0x70;
          if (m == 48)
          {
            AppMethodBeat.o(107024);
          }
          else if (m == 80)
          {
            i = i + j - k;
            AppMethodBeat.o(107024);
          }
          else
          {
            i += (j - k) / 2;
            AppMethodBeat.o(107024);
          }
        }
      }
    }
  }

  public void getFocusedRect(Rect paramRect)
  {
    AppMethodBeat.i(107063);
    if (this.yzC == null)
    {
      super.getFocusedRect(paramRect);
      AppMethodBeat.o(107063);
    }
    while (true)
    {
      return;
      int i = getSelectionEnd();
      if (i < 0)
      {
        super.getFocusedRect(paramRect);
        AppMethodBeat.o(107063);
      }
      else
      {
        int j = this.yzC.getLineForOffset(i);
        paramRect.top = this.yzC.getLineTop(j);
        paramRect.bottom = this.yzC.getLineBottom(j);
        paramRect.left = ((int)this.yzC.getPrimaryHorizontal(i));
        paramRect.right = (paramRect.left + 1);
        int k = getCompoundPaddingLeft();
        i = getExtendedPaddingTop();
        j = i;
        if ((this.Hu & 0x70) != 48)
          j = i + getVerticalOffset$1385f2();
        paramRect.offset(k, j);
        AppMethodBeat.o(107063);
      }
    }
  }

  public int getGravity()
  {
    return this.Hu;
  }

  public final Layout getLayout()
  {
    return this.yzC;
  }

  public int getLineCount()
  {
    AppMethodBeat.i(107064);
    int i;
    if (this.yzC != null)
    {
      i = this.yzC.getLineCount();
      AppMethodBeat.o(107064);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(107064);
    }
  }

  public int getLineHeight()
  {
    AppMethodBeat.i(107010);
    int i = Math.round(this.oz.getFontMetricsInt(null) * this.yzD + this.yzE);
    AppMethodBeat.o(107010);
    return i;
  }

  public TextPaint getPaint()
  {
    return this.oz;
  }

  public int getPaintFlags()
  {
    AppMethodBeat.i(107041);
    int i = this.oz.getFlags();
    AppMethodBeat.o(107041);
    return i;
  }

  @ViewDebug.ExportedProperty
  public int getSelectionEnd()
  {
    AppMethodBeat.i(107074);
    int i = Selection.getSelectionEnd(getText());
    AppMethodBeat.o(107074);
    return i;
  }

  @ViewDebug.ExportedProperty
  public int getSelectionStart()
  {
    AppMethodBeat.i(107073);
    int i = Selection.getSelectionStart(getText());
    AppMethodBeat.o(107073);
    return i;
  }

  @ViewDebug.CapturedViewProperty
  public CharSequence getText()
  {
    return this.mText;
  }

  public final ColorStateList getTextColors()
  {
    return this.lP;
  }

  public float getTextScaleX()
  {
    AppMethodBeat.i(107035);
    float f = this.oz.getTextScaleX();
    AppMethodBeat.o(107035);
    return f;
  }

  public float getTextSize()
  {
    AppMethodBeat.i(107031);
    float f = this.oz.getTextSize();
    AppMethodBeat.o(107031);
    return f;
  }

  public int getTotalPaddingBottom()
  {
    AppMethodBeat.i(107029);
    int i = getExtendedPaddingBottom();
    int j = 0;
    int k = this.Hu & 0x70;
    Layout localLayout = this.yzC;
    int m = j;
    int n;
    int i1;
    if (k != 80)
    {
      n = getMeasuredHeight() - getExtendedPaddingTop() - getExtendedPaddingBottom();
      i1 = localLayout.getHeight();
      m = j;
      if (i1 < n)
        if (k != 48)
          break label93;
    }
    label93: for (m = n - i1; ; m = n - i1 >> 1)
    {
      AppMethodBeat.o(107029);
      return m + i;
    }
  }

  public int getTotalPaddingLeft()
  {
    AppMethodBeat.i(107026);
    int i = getCompoundPaddingLeft();
    AppMethodBeat.o(107026);
    return i;
  }

  public int getTotalPaddingRight()
  {
    AppMethodBeat.i(107027);
    int i = getCompoundPaddingRight();
    AppMethodBeat.o(107027);
    return i;
  }

  public int getTotalPaddingTop()
  {
    AppMethodBeat.i(107028);
    int i = getExtendedPaddingTop();
    int j = getVerticalOffset$1385f2();
    AppMethodBeat.o(107028);
    return i + j;
  }

  public Typeface getTypeface()
  {
    AppMethodBeat.i(107037);
    Typeface localTypeface = this.oz.getTypeface();
    AppMethodBeat.o(107037);
    return localTypeface;
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(107018);
    Rect localRect;
    int i;
    int j;
    NoMeasuredTextView.b localb;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    if (verifyDrawable(paramDrawable))
    {
      localRect = paramDrawable.getBounds();
      i = getScrollX();
      j = getScrollY();
      localb = this.yzT;
      k = j;
      m = i;
      if (localb != null)
      {
        if (paramDrawable != localb.yAl)
          break label155;
        k = getCompoundPaddingTop();
        n = getCompoundPaddingBottom();
        i1 = getBottom();
        i2 = getTop();
        m = i + getPaddingLeft();
        k = j + ((i1 - i2 - n - k - localb.yAt) / 2 + k);
      }
    }
    while (true)
    {
      invalidate(localRect.left + m, localRect.top + k, m + localRect.right, k + localRect.bottom);
      AppMethodBeat.o(107018);
      return;
      label155: if (paramDrawable == localb.yAm)
      {
        i1 = getCompoundPaddingTop();
        i2 = getCompoundPaddingBottom();
        n = getBottom();
        k = getTop();
        m = i + (getRight() - getLeft() - getPaddingRight() - localb.yAq);
        k = j + ((n - k - i2 - i1 - localb.yAu) / 2 + i1);
      }
      else if (paramDrawable == localb.yAj)
      {
        k = getCompoundPaddingLeft();
        m = getCompoundPaddingRight();
        m = i + ((getRight() - getLeft() - m - k - localb.yAr) / 2 + k);
        k = j + getPaddingTop();
      }
      else
      {
        k = j;
        m = i;
        if (paramDrawable == localb.yAk)
        {
          k = getCompoundPaddingLeft();
          m = getCompoundPaddingRight();
          m = i + (k + (getRight() - getLeft() - m - k - localb.yAs) / 2);
          k = j + (getBottom() - getTop() - getPaddingBottom() - localb.yAo);
        }
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107062);
    super.onDraw(paramCanvas);
    int i = getCompoundPaddingLeft();
    int j = getCompoundPaddingTop();
    int k = getCompoundPaddingRight();
    int m = getCompoundPaddingBottom();
    int n = getScrollX();
    int i1 = getScrollY();
    int i2 = getRight();
    int i3 = getLeft();
    int i4 = getBottom();
    int i5 = getTop();
    int i6 = getWidth();
    int i7 = getHeight();
    NoMeasuredTextView.b localb = this.yzT;
    float f1 = -1.0F;
    float f2 = f1;
    float f3;
    if (localb != null)
    {
      m = i4 - i5 - m - j;
      int i8 = i2 - i3 - k - i;
      if ((this.yzU) && (localb.yAl != null))
      {
        paramCanvas.save();
        paramCanvas.translate(getPaddingLeft() + n, i1 + j + (m - localb.yAt) / 2);
        localb.yAl.draw(paramCanvas);
        paramCanvas.restore();
      }
      f3 = f1;
      if (this.yzV)
      {
        f3 = f1;
        if (localb.yAm != null)
        {
          paramCanvas.save();
          if (!this.yzO)
            break label694;
          f2 = this.oz.measureText(this.mText, 0, this.mText.length());
          f3 = f2;
          paramCanvas.translate(f3 + n - getPaddingRight(), i1 + j + (m - localb.yAu) / 2);
          localb.yAm.draw(paramCanvas);
          paramCanvas.restore();
          f3 = f2;
        }
      }
      if ((this.yzW) && (localb.yAj != null))
      {
        paramCanvas.save();
        paramCanvas.translate(n + i + (i8 - localb.yAr) / 2, getPaddingTop() + i1);
        localb.yAj.draw(paramCanvas);
        paramCanvas.restore();
      }
      f2 = f3;
      if (this.yzX)
      {
        f2 = f3;
        if (localb.yAk != null)
        {
          paramCanvas.save();
          paramCanvas.translate(n + i + (i8 - localb.yAs) / 2, i1 + i4 - i5 - getPaddingBottom() - localb.yAo);
          localb.yAk.draw(paramCanvas);
          paramCanvas.restore();
          f2 = f3;
        }
      }
    }
    j = this.yzv;
    this.oz.setColor(j);
    this.oz.drawableState = getDrawableState();
    paramCanvas.save();
    j = getExtendedPaddingTop();
    m = getExtendedPaddingBottom();
    paramCanvas.clipRect(i + n, j + i1, i2 - i3 - k + n, i4 - i5 - m + i1);
    n = 0;
    i1 = 0;
    if ((this.Hu & 0x70) != 48)
    {
      n = getVerticalOffset$1385f2();
      i1 = getVerticalOffset$1385f2();
    }
    paramCanvas.translate(i, j + n);
    if (this.yzO)
    {
      f1 = (i7 - (this.yzQ.bottom - this.yzQ.top)) / 2 - this.yzQ.top;
      i1 = 0;
      n = i1;
      if ((this.Hu & 0x7) != 3);
      switch (this.Hu & 0x7)
      {
      default:
        n = i1;
        label656: paramCanvas.drawText(this.mText, 0, this.mText.length(), n, f1, this.oz);
      case 5:
      case 1:
      }
    }
    while (true)
    {
      paramCanvas.restore();
      AppMethodBeat.o(107062);
      return;
      label694: f3 = (float)Math.ceil(Layout.getDesiredWidth(this.yzz, this.oz));
      f2 = -1.0F;
      break;
      f3 = f2;
      if (f2 == -1.0F)
        f3 = this.oz.measureText(this.mText, 0, this.mText.length());
      n = (int)(i6 - getPaddingRight() - f3);
      break label656;
      f3 = f2;
      if (f2 == -1.0F)
        f3 = this.oz.measureText(this.mText, 0, this.mText.length());
      n = (int)(i6 - getPaddingRight() - f3) / 2;
      break label656;
      if (this.yzC == null)
        dAr();
      this.yzC.draw(paramCanvas, null, null, i1 - n);
    }
  }

  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AppMethodBeat.i(107080);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    CharSequence localCharSequence1 = getContentDescription();
    CharSequence localCharSequence2 = localCharSequence1;
    if (bo.isNullOrNil((String)localCharSequence1))
      localCharSequence2 = getText();
    paramAccessibilityNodeInfo.setText(localCharSequence2);
    AppMethodBeat.o(107080);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107058);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.yzR) && (getMeasuredWidth() > 0))
    {
      if ((bo.isNullOrNil(this.ysq)) || (this.yAc == null))
        break label99;
      CharSequence localCharSequence = this.yAc.a(this, this.mText, this.ysq, this.ysr, this.yss);
      this.ysq = null;
      setText(localCharSequence);
    }
    while (true)
    {
      this.yzR = false;
      AppMethodBeat.o(107058);
      return;
      label99: setText(TextUtils.ellipsize(this.mText, getPaint(), getMeasuredWidth() - getCompoundPaddingRight() - getCompoundPaddingLeft(), TextUtils.TruncateAt.END));
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107069);
    View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt2);
    if (j == 0)
    {
      setMeasuredDimension(j, this.yzP);
      AppMethodBeat.o(107069);
    }
    while (true)
    {
      return;
      if (!this.yzO)
        break;
      if (this.yzP == 0)
        dAs();
      setMeasuredDimension(j, this.yzP);
      AppMethodBeat.o(107069);
    }
    paramInt1 = getCompoundPaddingLeft() + getCompoundPaddingRight();
    if (this.yzJ)
    {
      paramInt1 = this.di - paramInt1;
      label111: if (this.yzC != null)
        break label169;
      hl(paramInt1, paramInt1);
      label124: if (i != 1073741824)
        break label200;
      this.yzL = -1;
      paramInt1 = k;
    }
    while (true)
    {
      scrollTo(0, 0);
      setMeasuredDimension(j, paramInt1);
      AppMethodBeat.o(107069);
      break;
      paramInt1 = j - paramInt1;
      break label111;
      label169: if (this.yzC.getWidth() != paramInt1);
      for (paramInt2 = 1; ; paramInt2 = 0)
      {
        if (paramInt2 == 0)
          break label198;
        hl(paramInt1, paramInt1);
        break;
      }
      label198: break label124;
      label200: paramInt2 = getDesiredHeight();
      this.yzL = paramInt2;
      paramInt1 = paramInt2;
      if (i == -2147483648)
        paramInt1 = Math.min(paramInt2, k);
    }
  }

  public void setCompoundDrawablePadding(int paramInt)
  {
    AppMethodBeat.i(107019);
    NoMeasuredTextView.b localb1 = this.yzT;
    NoMeasuredTextView.b localb2;
    if (paramInt == 0)
      if (localb1 != null)
        localb2 = localb1;
    while (true)
    {
      localb2.yAv = paramInt;
      invalidate();
      requestLayout();
      AppMethodBeat.o(107019);
      return;
      localb2 = localb1;
      if (localb1 == null)
      {
        localb2 = new NoMeasuredTextView.b(this);
        this.yzT = localb2;
      }
    }
  }

  public void setCompoundLeftDrawablesWithIntrinsicBounds(int paramInt)
  {
    AppMethodBeat.i(107014);
    if (paramInt != this.yzY)
    {
      this.yzY = paramInt;
      setCompoundLeftDrawablesWithIntrinsicBounds(getResources().getDrawable(paramInt));
    }
    AppMethodBeat.o(107014);
  }

  public void setCompoundLeftDrawablesWithIntrinsicBounds(Drawable paramDrawable)
  {
    AppMethodBeat.i(107012);
    if (paramDrawable == null)
      AppMethodBeat.o(107012);
    while (true)
    {
      return;
      if ((this.yzT != null) && (this.yzT.yAl == paramDrawable))
      {
        AppMethodBeat.o(107012);
      }
      else
      {
        paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
        a(paramDrawable, null);
        AppMethodBeat.o(107012);
      }
    }
  }

  public void setCompoundRightDrawablesWithIntrinsicBounds(int paramInt)
  {
    AppMethodBeat.i(107015);
    if (paramInt != this.yzZ)
    {
      this.yzZ = paramInt;
      setCompoundRightDrawablesWithIntrinsicBounds(getResources().getDrawable(paramInt));
    }
    AppMethodBeat.o(107015);
  }

  public void setCompoundRightDrawablesWithIntrinsicBounds(Drawable paramDrawable)
  {
    AppMethodBeat.i(107013);
    if (paramDrawable == null)
      AppMethodBeat.o(107013);
    while (true)
    {
      return;
      if ((this.yzT != null) && (this.yzT.yAm == paramDrawable))
      {
        AppMethodBeat.o(107013);
      }
      else
      {
        paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
        a(null, paramDrawable);
        AppMethodBeat.o(107013);
      }
    }
  }

  public void setDrawDownDrawable(boolean paramBoolean)
  {
    AppMethodBeat.i(107008);
    if (this.yzX != paramBoolean)
      invalidate();
    this.yzX = paramBoolean;
    AppMethodBeat.o(107008);
  }

  public void setDrawLeftDrawable(boolean paramBoolean)
  {
    AppMethodBeat.i(107005);
    if (this.yzU != paramBoolean)
      invalidate();
    this.yzU = paramBoolean;
    AppMethodBeat.o(107005);
  }

  public void setDrawRightDrawable(boolean paramBoolean)
  {
    AppMethodBeat.i(107006);
    if (this.yzV != paramBoolean)
      invalidate();
    this.yzV = paramBoolean;
    AppMethodBeat.o(107006);
  }

  public void setDrawTopDrawable(boolean paramBoolean)
  {
    AppMethodBeat.i(107007);
    if (this.yzW != paramBoolean)
      invalidate();
    this.yzW = paramBoolean;
    AppMethodBeat.o(107007);
  }

  public final void setEditableFactory(Editable.Factory paramFactory)
  {
    AppMethodBeat.i(107053);
    this.yzw = paramFactory;
    setText(this.mText);
    AppMethodBeat.o(107053);
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    AppMethodBeat.i(107076);
    this.yzy = paramTruncateAt;
    if (this.yzC != null)
    {
      dAq();
      requestLayout();
      invalidate();
    }
    AppMethodBeat.o(107076);
  }

  public void setGravity(int paramInt)
  {
    AppMethodBeat.i(107040);
    if ((paramInt & 0x7) == 0)
      paramInt |= 3;
    while (true)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0)
        i = paramInt | 0x30;
      paramInt = 0;
      if ((i & 0x7) != (this.Hu & 0x7))
        paramInt = 1;
      if (i != this.Hu)
        invalidate();
      this.Hu = i;
      if ((this.yzC != null) && (paramInt != 0))
        hl(this.yzC.getWidth(), getWidth() - getCompoundPaddingLeft() - getCompoundPaddingRight());
      AppMethodBeat.o(107040);
      return;
    }
  }

  public void setHeight(int paramInt)
  {
    AppMethodBeat.i(107048);
    this.yzH = paramInt;
    this.yzF = paramInt;
    this.yzI = 2;
    this.yzG = 2;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107048);
  }

  public void setIncludeFontPadding(boolean paramBoolean)
  {
    AppMethodBeat.i(107068);
    this.yzM = paramBoolean;
    if (this.yzC != null)
    {
      dAq();
      requestLayout();
      invalidate();
    }
    AppMethodBeat.o(107068);
  }

  public void setLayoutCallback(NoMeasuredTextView.c paramc)
  {
    this.yAc = paramc;
  }

  public void setLines(int paramInt)
  {
    AppMethodBeat.i(107047);
    this.yzH = paramInt;
    this.yzF = paramInt;
    this.yzI = 1;
    this.yzG = 1;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107047);
  }

  public void setMaxHeight(int paramInt)
  {
    AppMethodBeat.i(107046);
    this.yzF = paramInt;
    this.yzG = 2;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107046);
  }

  public void setMaxLines(int paramInt)
  {
    AppMethodBeat.i(107045);
    this.yzF = paramInt;
    this.yzG = 1;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107045);
  }

  public void setMaxWidth(int paramInt)
  {
    AppMethodBeat.i(107050);
    this.di = paramInt;
    this.yzJ = true;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107050);
  }

  public void setMinHeight(int paramInt)
  {
    AppMethodBeat.i(107044);
    this.yzH = paramInt;
    this.yzI = 2;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107044);
  }

  public void setMinLines(int paramInt)
  {
    AppMethodBeat.i(107043);
    this.yzH = paramInt;
    this.yzI = 1;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107043);
  }

  public void setMinWidth(int paramInt)
  {
    AppMethodBeat.i(107049);
    this.dg = paramInt;
    this.yzK = true;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107049);
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(107030);
    if ((paramInt1 != getPaddingLeft()) || (paramInt3 != getPaddingRight()) || (paramInt2 != getPaddingTop()) || (paramInt4 != getPaddingBottom()))
      dAq();
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
    AppMethodBeat.o(107030);
  }

  public void setPaintFlags(int paramInt)
  {
    AppMethodBeat.i(107042);
    if (this.oz.getFlags() != paramInt)
    {
      this.oz.setFlags(paramInt);
      if (this.yzC != null)
      {
        dAq();
        requestLayout();
        invalidate();
      }
    }
    AppMethodBeat.o(107042);
  }

  public void setShouldEllipsize(boolean paramBoolean)
  {
    this.yzS = paramBoolean;
  }

  public void setSingleLine(boolean paramBoolean)
  {
    AppMethodBeat.i(107075);
    this.mSingleLine = paramBoolean;
    if (paramBoolean)
    {
      setLines(1);
      AppMethodBeat.o(107075);
    }
    while (true)
    {
      return;
      setMaxLines(2147483647);
      AppMethodBeat.o(107075);
    }
  }

  public final void setSpannableFactory(Spannable.Factory paramFactory)
  {
    AppMethodBeat.i(107054);
    this.yzx = paramFactory;
    setText(this.mText);
    AppMethodBeat.o(107054);
  }

  public final void setText(int paramInt)
  {
    AppMethodBeat.i(107059);
    setText(getContext().getResources().getText(paramInt));
    AppMethodBeat.o(107059);
  }

  public final void setText(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107055);
    a(paramCharSequence, this.yzA);
    AppMethodBeat.o(107055);
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(107038);
    this.lP = ColorStateList.valueOf(paramInt);
    updateTextColors();
    AppMethodBeat.o(107038);
  }

  public void setTextColor(ColorStateList paramColorStateList)
  {
    AppMethodBeat.i(107039);
    if (paramColorStateList == null)
    {
      paramColorStateList = new NullPointerException();
      AppMethodBeat.o(107039);
      throw paramColorStateList;
    }
    if (this.lP == paramColorStateList)
      AppMethodBeat.o(107039);
    while (true)
    {
      return;
      this.lP = paramColorStateList;
      updateTextColors();
      AppMethodBeat.o(107039);
    }
  }

  public final void setTextKeepState(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107056);
    NoMeasuredTextView.a locala = this.yzA;
    int i = getSelectionStart();
    int j = getSelectionEnd();
    int k = paramCharSequence.length();
    a(paramCharSequence, locala);
    if (((i >= 0) || (j >= 0)) && ((this.mText instanceof Spannable)))
      Selection.setSelection((Spannable)this.mText, Math.max(0, Math.min(i, k)), Math.max(0, Math.min(j, k)));
    AppMethodBeat.o(107056);
  }

  public void setTextSize(float paramFloat)
  {
    AppMethodBeat.i(107032);
    setTextSize(2, paramFloat);
    AppMethodBeat.o(107032);
  }

  public final void setTextSize(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(107033);
    Object localObject = getContext();
    if (localObject == null);
    for (localObject = Resources.getSystem(); ; localObject = ((Context)localObject).getResources())
    {
      setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics()));
      AppMethodBeat.o(107033);
      return;
    }
  }

  public void setTypeface(Typeface paramTypeface)
  {
    AppMethodBeat.i(107036);
    if (this.oz.getTypeface() != paramTypeface)
    {
      this.oz.setTypeface(paramTypeface);
      if (this.yzC != null)
      {
        dAq();
        requestLayout();
        invalidate();
      }
    }
    AppMethodBeat.o(107036);
  }

  public void setWidth(int paramInt)
  {
    AppMethodBeat.i(107051);
    this.dg = paramInt;
    this.di = paramInt;
    this.yzK = true;
    this.yzJ = true;
    requestLayout();
    invalidate();
    AppMethodBeat.o(107051);
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(107017);
    boolean bool = super.verifyDrawable(paramDrawable);
    if ((!bool) && (this.yzT != null))
      if ((paramDrawable == this.yzT.yAl) || (paramDrawable == this.yzT.yAj) || (paramDrawable == this.yzT.yAm) || (paramDrawable == this.yzT.yAk))
      {
        bool = true;
        AppMethodBeat.o(107017);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107017);
      continue;
      AppMethodBeat.o(107017);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.NoMeasuredTextView
 * JD-Core Version:    0.6.2
 */