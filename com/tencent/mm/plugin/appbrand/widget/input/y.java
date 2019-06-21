package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.f.a;
import android.text.Editable;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AlignmentSpan.Standard;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.autofill.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@SuppressLint({"AppCompatCustomView"})
public abstract class y extends EditText
  implements com.tencent.mm.plugin.appbrand.widget.base.c, ab
{
  private volatile int jdU = -1;
  InputConnection jfF;
  boolean jgd = false;
  private final com.tencent.mm.plugin.appbrand.widget.input.autofill.b jge;
  private final Map<ab.a, Object> jgf = new a();
  private final Map<View.OnFocusChangeListener, Object> jgg = new a();
  private final Map<ab.c, Object> jgh = new a();
  private final y.a jgi = new y.a(this, (byte)0);
  private final PasswordTransformationMethod jgj = new m();
  private final z jgk = new z(this);
  private boolean jgl;
  private int jgm = 0;
  private boolean jgn = false;
  private final int[] jgo = new int[2];
  private boolean jgp = false;
  private ab.b jgq;
  char jgr = (char)0;

  public y(Context paramContext)
  {
    super(paramContext);
    setBackgroundDrawable(null);
    setIncludeFontPadding(false);
    qH(3);
    setSingleLine(true);
    setTextCursorDrawable(2130837785);
    setTextIsSelectable(true);
    setFocusable(true);
    setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 16)
      setLineSpacing(0.0F, 1.0F);
    setTypeface(Typeface.SANS_SERIF);
    super.addTextChangedListener(this.jgi);
    super.setPadding(0, 0, 0, 0);
    super.setEditableFactory(new y.1(this));
    if (aQQ());
    for (this.jge = new com.tencent.mm.plugin.appbrand.widget.input.autofill.b(this); ; this.jge = null)
    {
      this.jgl = true;
      return;
    }
  }

  private void A(CharSequence paramCharSequence)
  {
    Editable localEditable = getEditableText();
    if (localEditable == null)
      setText(paramCharSequence, TextView.BufferType.EDITABLE);
    while (true)
    {
      return;
      clearComposingText();
      if (TextUtils.isEmpty(paramCharSequence))
        localEditable.clear();
      else
        localEditable.replace(0, localEditable.length(), paramCharSequence);
    }
  }

  private void qH(int paramInt)
  {
    setGravity(getGravity() & 0xFF7FFFFC & 0xFF7FFFFA | paramInt);
    paramInt = getGravity();
    Object localObject = getHint();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      Spannable localSpannable = aj.C((CharSequence)localObject);
      switch (paramInt & 0x7)
      {
      default:
        localObject = Layout.Alignment.ALIGN_NORMAL;
        localSpannable.setSpan(new AlignmentSpan.Standard((Layout.Alignment)localObject), 0, getHint().length(), 18);
        super.setHint(localSpannable);
        if (Build.VERSION.SDK_INT >= 17)
          switch (y.3.boC[localObject.ordinal()])
          {
          default:
            paramInt = 5;
          case 1:
          case 2:
          }
        break;
      case 5:
      case 1:
      }
    }
    while (true)
    {
      super.setTextAlignment(paramInt);
      return;
      localObject = Layout.Alignment.ALIGN_OPPOSITE;
      break;
      localObject = Layout.Alignment.ALIGN_CENTER;
      break;
      paramInt = 4;
      continue;
      paramInt = 6;
    }
  }

  public final void B(CharSequence paramCharSequence)
  {
    aRm();
    A(paramCharSequence);
    aRn();
  }

  public void N(float paramFloat1, float paramFloat2)
  {
    throw new IllegalStateException("Should implement performClick(float, float) in this class!");
  }

  public final void a(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    if (paramOnFocusChangeListener != null)
      this.jgg.put(paramOnFocusChangeListener, this);
  }

  public final void a(ab.a parama)
  {
    this.jgf.put(parama, this);
  }

  public final void a(ab.c paramc)
  {
    this.jgh.put(paramc, this);
  }

  protected final boolean a(int paramInt, Rect paramRect)
  {
    return super.requestFocus(paramInt, paramRect);
  }

  public boolean aOQ()
  {
    return false;
  }

  public boolean aQQ()
  {
    return true;
  }

  protected abstract void aQR();

  public boolean aQT()
  {
    return this.jgn;
  }

  public final int aRh()
  {
    return qI(getLineCount()) + getPaddingBottom();
  }

  public final void aRi()
  {
    qH(3);
  }

  public final void aRj()
  {
    qH(5);
  }

  public final void aRk()
  {
    qH(1);
  }

  final void aRl()
  {
    aRm();
    setText(getEditableText());
    aRn();
  }

  final void aRm()
  {
    this.jgm += 1;
  }

  final void aRn()
  {
    this.jgm = Math.max(0, this.jgm - 1);
  }

  protected final void aRo()
  {
    super.clearFocus();
  }

  public void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    y.a locala = this.jgi;
    if (paramTextWatcher != null)
      locala.jgt.put(paramTextWatcher, locala);
  }

  public final void b(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    if (paramOnFocusChangeListener != null)
      this.jgg.remove(paramOnFocusChangeListener);
  }

  Editable c(Editable paramEditable)
  {
    return this.jgk.c(paramEditable);
  }

  public void clearFocus()
  {
    if ((getParent() instanceof ViewGroup))
    {
      ((ViewGroup)getParent()).setFocusableInTouchMode(true);
      ((ViewGroup)getParent()).setDescendantFocusability(131072);
    }
    super.clearFocus();
  }

  public final void destroy()
  {
    this.jgf.clear();
    this.jgh.clear();
    this.jgg.clear();
    this.jgi.jgt.clear();
    if (this.jge != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.b localb = this.jge;
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = localb.jhE;
      k.u(localc.jhP).a(localc.jhO);
      localb.jhH = null;
      localb.jhC.dismiss();
    }
    super.setOnFocusChangeListener(null);
  }

  public com.tencent.mm.plugin.appbrand.widget.input.autofill.b getAutoFillController()
  {
    return this.jge;
  }

  public int getAutofillType()
  {
    return 0;
  }

  public int getInputId()
  {
    return this.jdU;
  }

  public char getLastKeyPressed()
  {
    return this.jgr;
  }

  public final View getView()
  {
    return this;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (!this.jgf.isEmpty())
    {
      paramConfiguration = (ab.a[])this.jgf.keySet().toArray(new ab.a[this.jgf.size()]);
      int i = paramConfiguration.length;
      for (int j = 0; j < i; j++)
        paramConfiguration[j].gY();
    }
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    if (localInputConnection == null);
    for (paramEditorInfo = null; ; paramEditorInfo = this.jfF)
    {
      return paramEditorInfo;
      this.jfF = new y.2(this, localInputConnection);
      paramEditorInfo.imeOptions |= 268435456;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (!paramBoolean)
      clearComposingText();
    if (paramBoolean)
      aQR();
    if (!this.jgg.isEmpty())
    {
      paramRect = (View.OnFocusChangeListener[])this.jgg.keySet().toArray(new View.OnFocusChangeListener[this.jgg.size()]);
      int i = paramRect.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        paramRect[paramInt].onFocusChange(this, paramBoolean);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 67)
      this.jgr = ((char)8);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    if ((bool) && (paramInt == 66))
      this.jgr = ((char)10);
    this.jgp = bool;
    return bool;
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((!this.jgp) && (this.jgq != null) && (this.jgq.qy(paramInt)));
    for (boolean bool = true; ; bool = super.onKeyUp(paramInt, paramKeyEvent))
      return bool;
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onLayout");
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onMeasure");
    super.onMeasure(paramInt1, paramInt2);
    if (!this.jgh.isEmpty())
    {
      Object[] arrayOfObject = this.jgh.keySet().toArray();
      paramInt2 = arrayOfObject.length;
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      {
        ab.c localc = (ab.c)arrayOfObject[paramInt1];
        getMeasuredWidth();
        getMeasuredHeight();
        localc.aQS();
      }
    }
  }

  public final int qI(int paramInt)
  {
    int i = getPaddingTop() + (int)(paramInt * (getLineHeight() + getLineSpacingExtra()));
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrand.WebEditText", "calculateLinePosition, lineNumber %d, returnHeight %d, layout %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), getLayout() });
    return i;
  }

  public void removeTextChangedListener(TextWatcher paramTextWatcher)
  {
    y.a locala = this.jgi;
    if (paramTextWatcher != null)
      locala.jgt.remove(paramTextWatcher);
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if ((130 == paramInt) && (paramRect == null) && ((getParent() instanceof ViewGroup)))
    {
      ((ViewGroup)getParent()).setDescendantFocusability(262144);
      ((ViewGroup)getParent()).setFocusableInTouchMode(false);
    }
    return super.requestFocus(paramInt, paramRect);
  }

  public void setFixed(boolean paramBoolean)
  {
    this.jgn = paramBoolean;
  }

  public void setInputId(int paramInt)
  {
    this.jdU = paramInt;
  }

  public void setInputType(int paramInt)
  {
    if (getInputType() == paramInt);
    while (true)
    {
      return;
      super.setInputType(paramInt);
    }
  }

  public void setMaxHeight(int paramInt)
  {
    if (getMaxHeight() == paramInt);
    while (true)
    {
      return;
      super.setMaxHeight(paramInt);
    }
  }

  public void setMinHeight(int paramInt)
  {
    if (getMinHeight() == paramInt);
    while (true)
    {
      return;
      super.setMinHeight(paramInt);
    }
  }

  public void setOnComposingDismissedListener(com.tencent.mm.plugin.appbrand.widget.input.c.b paramb)
  {
    this.jgk.jgz = paramb;
  }

  @Deprecated
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
  }

  public void setOnKeyUpPostImeListener(ab.b paramb)
  {
    this.jgq = paramb;
  }

  public void setPasswordMode(boolean paramBoolean)
  {
    aRm();
    this.jgd = paramBoolean;
    if (paramBoolean);
    for (PasswordTransformationMethod localPasswordTransformationMethod = this.jgj; ; localPasswordTransformationMethod = null)
    {
      setTransformationMethod(localPasswordTransformationMethod);
      aRn();
      return;
    }
  }

  public void setSelection(int paramInt)
  {
    if (getEditableText() == null);
    while (true)
    {
      return;
      super.setSelection(Math.min(paramInt, getEditableText().length()));
    }
  }

  public void setSelection(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 < 0)
      i = 0;
    if (i >= getEditableText().length());
    for (paramInt1 = getEditableText().length(); ; paramInt1 = i)
    {
      i = paramInt2;
      if (paramInt2 < paramInt1)
        i = paramInt1;
      paramInt2 = i;
      if (i >= getEditableText().length())
        paramInt2 = getEditableText().length();
      super.setSelection(paramInt1, paramInt2);
      return;
    }
  }

  public void setSingleLine(boolean paramBoolean)
  {
  }

  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    super.setText(paramCharSequence, paramBufferType);
  }

  public final void setTextCursorDrawable(int paramInt)
  {
    try
    {
      com.tencent.mm.compatible.loader.c localc = new com/tencent/mm/compatible/loader/c;
      localc.<init>(this, "mCursorDrawableRes", TextView.class.getName());
      localc.set(Integer.valueOf(paramInt));
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AppBrand.WebEditText", "setTextCursorDrawable, exp = %s", new Object[] { bo.l(localException) });
    }
  }

  public final void setTextSize(float paramFloat)
  {
    setTextSize(0, paramFloat);
  }

  public void setTextSize(int paramInt, float paramFloat)
  {
    super.setTextSize(paramInt, paramFloat);
  }

  public void setTypeface(Typeface paramTypeface)
  {
    super.setTypeface(paramTypeface);
  }

  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    super.setTypeface(paramTypeface, paramInt);
  }

  public String toString()
  {
    return String.format(Locale.US, "[%s|%s]", new Object[] { getClass().getSimpleName(), Integer.valueOf(getInputId()) });
  }

  public final void y(u paramu)
  {
    Object localObject;
    if (this.jge != null)
    {
      localObject = this.jge.jhE;
      ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).jhP = paramu;
      paramu = k.u(paramu);
      localObject = ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).jhO;
      if (localObject != null)
        break label35;
    }
    while (true)
    {
      return;
      label35: if (!paramu.jes.containsKey(localObject))
        paramu.jes.put(localObject, paramu);
    }
  }

  public final void z(u paramu)
  {
    if (this.jge != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = this.jge.jhE;
      k.u(paramu).a(localc.jhO);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.y
 * JD-Core Version:    0.6.2
 */