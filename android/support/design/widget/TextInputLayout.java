package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.support.design.a.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.Space;
import android.support.v4.widget.u;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.aa;
import android.support.v7.widget.bc;
import android.support.v7.widget.bl;
import android.support.v7.widget.i;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class TextInputLayout extends LinearLayout
  implements bl
{
  private final Rect oT = new Rect();
  final f oU = new f(this);
  private ValueAnimator rD;
  private boolean tA;
  private Drawable tB;
  private CharSequence tC;
  private CheckableImageButton tD;
  private boolean tE;
  private Drawable tF;
  private Drawable tG;
  private ColorStateList tH;
  private boolean tI;
  private PorterDuff.Mode tJ;
  private boolean tK;
  private ColorStateList tL;
  private ColorStateList tM;
  private boolean tN;
  private boolean tO;
  private boolean tP;
  private boolean tQ;
  private boolean tR;
  private final FrameLayout tb;
  EditText tc;
  private CharSequence td;
  private boolean te;
  private CharSequence tf;
  private Paint tg;
  private LinearLayout th;
  private int ti;
  private Typeface tj;
  private boolean tk;
  TextView tm;
  private int tn;
  private boolean to;
  private CharSequence tp;
  boolean tq;
  private TextView tt;
  private int tu;
  private int tv;
  private int tw;
  private boolean tz;

  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    o.G(paramContext);
    setOrientation(1);
    setWillNotDraw(false);
    setAddStatesFromChildren(true);
    this.tb = new FrameLayout(paramContext);
    this.tb.setAddStatesFromChildren(true);
    addView(this.tb);
    this.oU.b(a.mg);
    f localf = this.oU;
    localf.oA = new AccelerateInterpolator();
    localf.bT();
    this.oU.Q(8388659);
    paramContext = bc.a(paramContext, paramAttributeSet, a.a.TextInputLayout, paramInt, 2131493830);
    this.te = paramContext.getBoolean(3, true);
    setHint(paramContext.getText(1));
    this.tO = paramContext.getBoolean(10, true);
    if (paramContext.hasValue(0))
    {
      paramAttributeSet = paramContext.getColorStateList(0);
      this.tM = paramAttributeSet;
      this.tL = paramAttributeSet;
    }
    if (paramContext.getResourceId(2, -1) != -1)
      setHintTextAppearance(paramContext.getResourceId(2, 0));
    this.tn = paramContext.getResourceId(5, 0);
    boolean bool1 = paramContext.getBoolean(4, false);
    boolean bool2 = paramContext.getBoolean(6, false);
    setCounterMaxLength(paramContext.getInt(7, -1));
    this.tv = paramContext.getResourceId(8, 0);
    this.tw = paramContext.getResourceId(9, 0);
    this.tA = paramContext.getBoolean(11, false);
    this.tB = paramContext.getDrawable(12);
    this.tC = paramContext.getText(13);
    if (paramContext.hasValue(14))
    {
      this.tI = true;
      this.tH = paramContext.getColorStateList(14);
    }
    if (paramContext.hasValue(15))
    {
      this.tK = true;
      this.tJ = q.al(paramContext.getInt(15, -1));
    }
    paramContext.atG.recycle();
    setErrorEnabled(bool1);
    setCounterEnabled(bool2);
    cC();
    if (s.S(this) == 0)
      s.o(this, 1);
    s.a(this, new TextInputLayout.a(this));
  }

  private static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramViewGroup.getChildAt(j);
      localView.setEnabled(paramBoolean);
      if ((localView instanceof ViewGroup))
        a((ViewGroup)localView, paramBoolean);
    }
  }

  private void a(TextView paramTextView)
  {
    if (this.th != null)
    {
      this.th.removeView(paramTextView);
      int i = this.ti - 1;
      this.ti = i;
      if (i == 0)
        this.th.setVisibility(8);
    }
  }

  private void a(TextView paramTextView, int paramInt)
  {
    if (this.th == null)
    {
      this.th = new LinearLayout(getContext());
      this.th.setOrientation(0);
      addView(this.th, -1, -2);
      Space localSpace = new Space(getContext());
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, 0, 1.0F);
      this.th.addView(localSpace, localLayoutParams);
      if (this.tc != null)
        cw();
    }
    this.th.setVisibility(0);
    this.th.addView(paramTextView, paramInt);
    this.ti += 1;
  }

  private boolean cA()
  {
    if ((this.tc != null) && ((this.tc.getTransformationMethod() instanceof PasswordTransformationMethod)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean cB()
  {
    if ((this.tA) && ((cA()) || (this.tE)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void cC()
  {
    if ((this.tB != null) && ((this.tI) || (this.tK)))
    {
      this.tB = android.support.v4.a.a.a.f(this.tB).mutate();
      if (this.tI)
        android.support.v4.a.a.a.a(this.tB, this.tH);
      if (this.tK)
        android.support.v4.a.a.a.a(this.tB, this.tJ);
      if ((this.tD != null) && (this.tD.getDrawable() != this.tB))
        this.tD.setImageDrawable(this.tB);
    }
  }

  private void cv()
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.tb.getLayoutParams();
    if (this.te)
    {
      if (this.tg == null)
        this.tg = new Paint();
      this.tg.setTypeface(this.oU.bN());
      this.tg.setTextSize(this.oU.oc);
    }
    for (int i = (int)-this.tg.ascent(); ; i = 0)
    {
      if (i != localLayoutParams.topMargin)
      {
        localLayoutParams.topMargin = i;
        this.tb.requestLayout();
      }
      return;
    }
  }

  private void cw()
  {
    s.d(this.th, s.W(this.tc), 0, s.X(this.tc), this.tc.getPaddingBottom());
  }

  private void cx()
  {
    if (this.tc == null);
    while (true)
    {
      return;
      Drawable localDrawable1 = this.tc.getBackground();
      if (localDrawable1 != null)
      {
        cy();
        Drawable localDrawable2 = localDrawable1;
        if (aa.o(localDrawable1))
          localDrawable2 = localDrawable1.mutate();
        if ((this.to) && (this.tm != null))
        {
          localDrawable2.setColorFilter(i.a(this.tm.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
        else if ((this.tz) && (this.tt != null))
        {
          localDrawable2.setColorFilter(i.a(this.tt.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
        else
        {
          android.support.v4.a.a.a.e(localDrawable2);
          this.tc.refreshDrawableState();
        }
      }
    }
  }

  private void cy()
  {
    int i = Build.VERSION.SDK_INT;
    if ((i != 21) && (i != 22));
    while (true)
    {
      return;
      Drawable localDrawable1 = this.tc.getBackground();
      if ((localDrawable1 != null) && (!this.tP))
      {
        Drawable localDrawable2 = localDrawable1.getConstantState().newDrawable();
        if ((localDrawable1 instanceof DrawableContainer))
          this.tP = g.a((DrawableContainer)localDrawable1, localDrawable2.getConstantState());
        if (!this.tP)
        {
          s.a(this.tc, localDrawable2);
          this.tP = true;
        }
      }
    }
  }

  private void cz()
  {
    if (this.tc == null);
    while (true)
    {
      return;
      Drawable[] arrayOfDrawable;
      if (cB())
      {
        if (this.tD == null)
        {
          this.tD = ((CheckableImageButton)LayoutInflater.from(getContext()).inflate(2130969284, this.tb, false));
          this.tD.setImageDrawable(this.tB);
          this.tD.setContentDescription(this.tC);
          this.tb.addView(this.tD);
          this.tD.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              TextInputLayout.b(TextInputLayout.this);
            }
          });
        }
        if ((this.tc != null) && (s.aa(this.tc) <= 0))
          this.tc.setMinimumHeight(s.aa(this.tD));
        this.tD.setVisibility(0);
        this.tD.setChecked(this.tE);
        if (this.tF == null)
          this.tF = new ColorDrawable();
        this.tF.setBounds(0, 0, this.tD.getMeasuredWidth(), 1);
        arrayOfDrawable = android.support.v4.widget.q.c(this.tc);
        if (arrayOfDrawable[2] != this.tF)
          this.tG = arrayOfDrawable[2];
        android.support.v4.widget.q.a(this.tc, arrayOfDrawable[0], arrayOfDrawable[1], this.tF, arrayOfDrawable[3]);
        this.tD.setPadding(this.tc.getPaddingLeft(), this.tc.getPaddingTop(), this.tc.getPaddingRight(), this.tc.getPaddingBottom());
      }
      else
      {
        if ((this.tD != null) && (this.tD.getVisibility() == 0))
          this.tD.setVisibility(8);
        if (this.tF != null)
        {
          arrayOfDrawable = android.support.v4.widget.q.c(this.tc);
          if (arrayOfDrawable[2] == this.tF)
          {
            android.support.v4.widget.q.a(this.tc, arrayOfDrawable[0], arrayOfDrawable[1], this.tG, arrayOfDrawable[3]);
            this.tF = null;
          }
        }
      }
    }
  }

  private static boolean d(int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramArrayOfInt[j] == 16842908)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  private void q(float paramFloat)
  {
    if (this.oU.nV == paramFloat);
    while (true)
    {
      return;
      if (this.rD == null)
      {
        this.rD = new ValueAnimator();
        this.rD.setInterpolator(a.mf);
        this.rD.setDuration(200L);
        this.rD.addUpdateListener(new TextInputLayout.5(this));
      }
      this.rD.setFloatValues(new float[] { this.oU.nV, paramFloat });
      this.rD.start();
    }
  }

  private void s(boolean paramBoolean)
  {
    int i;
    if (this.tA)
    {
      i = this.tc.getSelectionEnd();
      if (!cA())
        break label66;
      this.tc.setTransformationMethod(null);
    }
    for (this.tE = true; ; this.tE = false)
    {
      this.tD.setChecked(this.tE);
      if (paramBoolean)
        this.tD.jumpDrawablesToCurrentState();
      this.tc.setSelection(i);
      return;
      label66: this.tc.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
  }

  private void setEditText(EditText paramEditText)
  {
    if (this.tc != null)
      throw new IllegalArgumentException("We already have an EditText, can only have one");
    this.tc = paramEditText;
    if (!cA())
      this.oU.a(this.tc.getTypeface());
    paramEditText = this.oU;
    float f = this.tc.getTextSize();
    if (paramEditText.ob != f)
    {
      paramEditText.ob = f;
      paramEditText.bT();
    }
    int i = this.tc.getGravity();
    this.oU.Q(i & 0xFFFFFF8F | 0x30);
    this.oU.P(i);
    this.tc.addTextChangedListener(new TextInputLayout.1(this));
    if (this.tL == null)
      this.tL = this.tc.getHintTextColors();
    if ((this.te) && (TextUtils.isEmpty(this.tf)))
    {
      this.td = this.tc.getHint();
      setHint(this.td);
      this.tc.setHint(null);
    }
    if (this.tt != null)
      ak(this.tc.getText().length());
    if (this.th != null)
      cw();
    cz();
    d(false, true);
  }

  private void setHintInternal(CharSequence paramCharSequence)
  {
    this.tf = paramCharSequence;
    this.oU.setText(paramCharSequence);
  }

  private void t(boolean paramBoolean)
  {
    if ((this.rD != null) && (this.rD.isRunning()))
      this.rD.cancel();
    if ((paramBoolean) && (this.tO))
      q(1.0F);
    while (true)
    {
      this.tN = false;
      return;
      this.oU.i(1.0F);
    }
  }

  private void u(boolean paramBoolean)
  {
    if ((this.rD != null) && (this.rD.isRunning()))
      this.rD.cancel();
    if ((paramBoolean) && (this.tO))
      q(0.0F);
    while (true)
    {
      this.tN = true;
      return;
      this.oU.i(0.0F);
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramView instanceof EditText))
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      localLayoutParams.gravity = (localLayoutParams.gravity & 0xFFFFFF8F | 0x10);
      this.tb.addView(paramView, localLayoutParams);
      this.tb.setLayoutParams(paramLayoutParams);
      cv();
      setEditText((EditText)paramView);
    }
    while (true)
    {
      return;
      super.addView(paramView, paramInt, paramLayoutParams);
    }
  }

  final void ak(int paramInt)
  {
    boolean bool1 = this.tz;
    if (this.tu == -1)
    {
      this.tt.setText(String.valueOf(paramInt));
      this.tz = false;
      if ((this.tc != null) && (bool1 != this.tz))
      {
        d(false, false);
        cx();
      }
      return;
    }
    boolean bool2;
    label65: TextView localTextView;
    if (paramInt > this.tu)
    {
      bool2 = true;
      this.tz = bool2;
      if (bool1 != this.tz)
      {
        localTextView = this.tt;
        if (!this.tz)
          break label150;
      }
    }
    label150: for (int i = this.tw; ; i = this.tv)
    {
      android.support.v4.widget.q.b(localTextView, i);
      this.tt.setText(getContext().getString(2131305854, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.tu) }));
      break;
      bool2 = false;
      break label65;
    }
  }

  final void d(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    boolean bool1 = isEnabled();
    int j;
    boolean bool2;
    if ((this.tc != null) && (!TextUtils.isEmpty(this.tc.getText())))
    {
      j = 1;
      bool2 = d(getDrawableState());
      if (TextUtils.isEmpty(getError()))
        break label145;
      label50: if (this.tL != null)
        this.oU.c(this.tL);
      if ((!bool1) || (!this.tz) || (this.tt == null))
        break label150;
      this.oU.b(this.tt.getTextColors());
      label101: if ((j == 0) && ((!isEnabled()) || ((!bool2) && (i == 0))))
        break label202;
      if ((paramBoolean2) || (this.tN))
        t(paramBoolean1);
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label145: i = 0;
      break label50;
      label150: if ((bool1) && (bool2) && (this.tM != null))
      {
        this.oU.b(this.tM);
        break label101;
      }
      if (this.tL == null)
        break label101;
      this.oU.b(this.tL);
      break label101;
      label202: if ((paramBoolean2) || (!this.tN))
        u(paramBoolean1);
    }
  }

  public void dispatchProvideAutofillStructure(ViewStructure paramViewStructure, int paramInt)
  {
    if ((this.td == null) || (this.tc == null))
      super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
    while (true)
    {
      return;
      CharSequence localCharSequence = this.tc.getHint();
      this.tc.setHint(this.td);
      try
      {
        super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
        this.tc.setHint(localCharSequence);
      }
      finally
      {
        this.tc.setHint(localCharSequence);
      }
    }
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    this.tR = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.tR = false;
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.te)
      this.oU.draw(paramCanvas);
  }

  protected void drawableStateChanged()
  {
    boolean bool1 = true;
    if (this.tQ)
      return;
    this.tQ = true;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if ((s.as(this)) && (isEnabled()))
    {
      label38: d(bool1, false);
      cx();
      if (this.oU == null)
        break label87;
    }
    label87: for (boolean bool2 = this.oU.setState(arrayOfInt) | false; ; bool2 = false)
    {
      if (bool2)
        invalidate();
      this.tQ = false;
      break;
      bool1 = false;
      break label38;
    }
  }

  public int getCounterMaxLength()
  {
    return this.tu;
  }

  public EditText getEditText()
  {
    return this.tc;
  }

  public CharSequence getError()
  {
    if (this.tk);
    for (CharSequence localCharSequence = this.tp; ; localCharSequence = null)
      return localCharSequence;
  }

  public CharSequence getHint()
  {
    if (this.te);
    for (CharSequence localCharSequence = this.tf; ; localCharSequence = null)
      return localCharSequence;
  }

  public CharSequence getPasswordVisibilityToggleContentDescription()
  {
    return this.tC;
  }

  public Drawable getPasswordVisibilityToggleDrawable()
  {
    return this.tB;
  }

  public Typeface getTypeface()
  {
    return this.tj;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.te) && (this.tc != null))
    {
      Rect localRect = this.oT;
      u.a(this, this.tc, localRect);
      paramInt3 = localRect.left + this.tc.getCompoundPaddingLeft();
      paramInt1 = localRect.right - this.tc.getCompoundPaddingRight();
      this.oU.c(paramInt3, localRect.top + this.tc.getCompoundPaddingTop(), paramInt1, localRect.bottom - this.tc.getCompoundPaddingBottom());
      this.oU.d(paramInt3, getPaddingTop(), paramInt1, paramInt4 - paramInt2 - getPaddingBottom());
      this.oU.bT();
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    cz();
    super.onMeasure(paramInt1, paramInt2);
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof TextInputLayout.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (TextInputLayout.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.LC);
      setError(paramParcelable.tU);
      if (paramParcelable.tV)
        s(true);
      requestLayout();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    TextInputLayout.SavedState localSavedState = new TextInputLayout.SavedState(super.onSaveInstanceState());
    if (this.to)
      localSavedState.tU = getError();
    localSavedState.tV = this.tE;
    return localSavedState;
  }

  public void setCounterEnabled(boolean paramBoolean)
  {
    if (this.tq != paramBoolean)
    {
      if (!paramBoolean)
        break label151;
      this.tt = new AppCompatTextView(getContext());
      this.tt.setId(2131820676);
      if (this.tj != null)
        this.tt.setTypeface(this.tj);
      this.tt.setMaxLines(1);
    }
    while (true)
    {
      try
      {
        android.support.v4.widget.q.b(this.tt, this.tv);
        a(this.tt, -1);
        if (this.tc == null)
        {
          ak(0);
          this.tq = paramBoolean;
          return;
        }
      }
      catch (Exception localException)
      {
        android.support.v4.widget.q.b(this.tt, 2131493595);
        this.tt.setTextColor(android.support.v4.content.b.i(getContext(), 2131689986));
        continue;
        ak(this.tc.getText().length());
        continue;
      }
      label151: a(this.tt);
      this.tt = null;
    }
  }

  public void setCounterMaxLength(int paramInt)
  {
    if (this.tu != paramInt)
    {
      if (paramInt <= 0)
        break label39;
      this.tu = paramInt;
      if (this.tq)
        if (this.tc != null)
          break label47;
    }
    label39: label47: for (paramInt = 0; ; paramInt = this.tc.getText().length())
    {
      ak(paramInt);
      return;
      this.tu = -1;
      break;
    }
  }

  public void setEnabled(boolean paramBoolean)
  {
    a(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }

  public void setError(CharSequence paramCharSequence)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((s.as(this)) && (isEnabled()) && ((this.tm == null) || (!TextUtils.equals(this.tm.getText(), paramCharSequence))))
    {
      bool2 = true;
      this.tp = paramCharSequence;
      if (!this.tk)
      {
        if (!TextUtils.isEmpty(paramCharSequence))
          setErrorEnabled(true);
      }
      else
      {
        if (TextUtils.isEmpty(paramCharSequence))
          break label185;
        label70: this.to = bool1;
        this.tm.animate().cancel();
        if (!this.to)
          break label201;
        this.tm.setText(paramCharSequence);
        this.tm.setVisibility(0);
        if (!bool2)
          break label190;
        if (this.tm.getAlpha() == 1.0F)
          this.tm.setAlpha(0.0F);
        this.tm.animate().alpha(1.0F).setDuration(200L).setInterpolator(a.mi).setListener(new TextInputLayout.2(this)).start();
      }
    }
    while (true)
    {
      cx();
      d(bool2, false);
      return;
      bool2 = false;
      break;
      label185: bool1 = false;
      break label70;
      label190: this.tm.setAlpha(1.0F);
      continue;
      label201: if (this.tm.getVisibility() == 0)
        if (bool2)
        {
          this.tm.animate().alpha(0.0F).setDuration(200L).setInterpolator(a.mh).setListener(new TextInputLayout.3(this, paramCharSequence)).start();
        }
        else
        {
          this.tm.setText(paramCharSequence);
          this.tm.setVisibility(4);
        }
    }
  }

  public void setErrorEnabled(boolean paramBoolean)
  {
    int i = 1;
    if (this.tk != paramBoolean)
    {
      if (this.tm != null)
        this.tm.animate().cancel();
      if (!paramBoolean)
        break label172;
      this.tm = new AppCompatTextView(getContext());
      this.tm.setId(2131820677);
      if (this.tj != null)
        this.tm.setTypeface(this.tj);
    }
    try
    {
      android.support.v4.widget.q.b(this.tm, this.tn);
      if (Build.VERSION.SDK_INT >= 23)
      {
        int j = this.tm.getTextColors().getDefaultColor();
        if (j == -65281)
        {
          if (i != 0)
          {
            android.support.v4.widget.q.b(this.tm, 2131493595);
            this.tm.setTextColor(android.support.v4.content.b.i(getContext(), 2131689986));
          }
          this.tm.setVisibility(4);
          s.V(this.tm);
          a(this.tm, 0);
          while (true)
          {
            this.tk = paramBoolean;
            return;
            label172: this.to = false;
            cx();
            a(this.tm);
            this.tm = null;
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        continue;
        i = 0;
      }
    }
  }

  public void setErrorTextAppearance(int paramInt)
  {
    this.tn = paramInt;
    if (this.tm != null)
      android.support.v4.widget.q.b(this.tm, paramInt);
  }

  public void setHint(CharSequence paramCharSequence)
  {
    if (this.te)
    {
      setHintInternal(paramCharSequence);
      sendAccessibilityEvent(2048);
    }
  }

  public void setHintAnimationEnabled(boolean paramBoolean)
  {
    this.tO = paramBoolean;
  }

  public void setHintEnabled(boolean paramBoolean)
  {
    CharSequence localCharSequence;
    if (paramBoolean != this.te)
    {
      this.te = paramBoolean;
      localCharSequence = this.tc.getHint();
      if (this.te)
        break label73;
      if ((!TextUtils.isEmpty(this.tf)) && (TextUtils.isEmpty(localCharSequence)))
        this.tc.setHint(this.tf);
      setHintInternal(null);
    }
    while (true)
    {
      if (this.tc != null)
        cv();
      return;
      label73: if (!TextUtils.isEmpty(localCharSequence))
      {
        if (TextUtils.isEmpty(this.tf))
          setHint(localCharSequence);
        this.tc.setHint(null);
      }
    }
  }

  public void setHintTextAppearance(int paramInt)
  {
    this.oU.R(paramInt);
    this.tM = this.oU.oe;
    if (this.tc != null)
    {
      d(false, false);
      cv();
    }
  }

  public void setPasswordVisibilityToggleContentDescription(int paramInt)
  {
    if (paramInt != 0);
    for (CharSequence localCharSequence = getResources().getText(paramInt); ; localCharSequence = null)
    {
      setPasswordVisibilityToggleContentDescription(localCharSequence);
      return;
    }
  }

  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence)
  {
    this.tC = paramCharSequence;
    if (this.tD != null)
      this.tD.setContentDescription(paramCharSequence);
  }

  public void setPasswordVisibilityToggleDrawable(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = android.support.v7.c.a.b.g(getContext(), paramInt); ; localDrawable = null)
    {
      setPasswordVisibilityToggleDrawable(localDrawable);
      return;
    }
  }

  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable)
  {
    this.tB = paramDrawable;
    if (this.tD != null)
      this.tD.setImageDrawable(paramDrawable);
  }

  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean)
  {
    if (this.tA != paramBoolean)
    {
      this.tA = paramBoolean;
      if ((!paramBoolean) && (this.tE) && (this.tc != null))
        this.tc.setTransformationMethod(PasswordTransformationMethod.getInstance());
      this.tE = false;
      cz();
    }
  }

  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList)
  {
    this.tH = paramColorStateList;
    this.tI = true;
    cC();
  }

  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode)
  {
    this.tJ = paramMode;
    this.tK = true;
    cC();
  }

  public void setTypeface(Typeface paramTypeface)
  {
    if (((this.tj != null) && (!this.tj.equals(paramTypeface))) || ((this.tj == null) && (paramTypeface != null)))
    {
      this.tj = paramTypeface;
      this.oU.a(paramTypeface);
      if (this.tt != null)
        this.tt.setTypeface(paramTypeface);
      if (this.tm != null)
        this.tm.setTypeface(paramTypeface);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputLayout
 * JD-Core Version:    0.6.2
 */