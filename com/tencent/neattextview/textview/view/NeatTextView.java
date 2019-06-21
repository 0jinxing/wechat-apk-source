package com.tencent.neattextview.textview.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.a.a;
import com.tencent.neattextview.textview.layout.NeatLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class NeatTextView extends View
  implements a
{
  private static final LruCache<String, e> AkU;
  private static Handler AkV;
  private static final HandlerThread pfg;
  private com.tencent.neattextview.textview.layout.c AkB;
  public boolean AkW;
  private TextView AkX;
  private a AkY;
  private ColorStateList AkZ;
  private int Akm;
  private ColorStateList Ala;
  private int Alb;
  private TextView.BufferType Alc;
  private b Ald;
  private boolean Ale;
  private b Alf;
  private float Alg;
  private boolean Alh;
  private d Ali;
  private com.tencent.neattextview.textview.layout.a Alj;
  private int dg;
  private int dh;
  private int di;
  private int dj;
  private ColorStateList lP;
  private CharSequence mText;
  private int nnY;
  private TextPaint oz;
  private CharSequence tf;
  private float yzE;
  private int yzv;
  private Spannable.Factory yzx;
  private TextUtils.TruncateAt yzy;

  static
  {
    AppMethodBeat.i(3319);
    AkU = new LruCache(800);
    Object localObject = new HandlerThread("PreMeasuredThread", -8);
    pfg = (HandlerThread)localObject;
    ((HandlerThread)localObject).start();
    localObject = pfg.getLooper();
    if (localObject != null)
      AkV = new Handler((Looper)localObject);
    AppMethodBeat.o(3319);
  }

  public NeatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(3278);
    this.AkY = new a((byte)0);
    this.nnY = 2147483647;
    this.di = 2147483647;
    this.dj = 2147483647;
    this.dg = 0;
    this.dh = 0;
    this.yzE = 0.0F;
    this.mText = "";
    this.Alc = TextView.BufferType.NORMAL;
    this.yzx = Spannable.Factory.getInstance();
    this.Ale = true;
    this.Akm = 8388659;
    this.Alh = true;
    c(paramContext, paramAttributeSet, 0);
    AppMethodBeat.o(3278);
  }

  public NeatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3279);
    this.AkY = new a((byte)0);
    this.nnY = 2147483647;
    this.di = 2147483647;
    this.dj = 2147483647;
    this.dg = 0;
    this.dh = 0;
    this.yzE = 0.0F;
    this.mText = "";
    this.Alc = TextView.BufferType.NORMAL;
    this.yzx = Spannable.Factory.getInstance();
    this.Ale = true;
    this.Akm = 8388659;
    this.Alh = true;
    c(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.o(3279);
  }

  private String atH(String paramString)
  {
    AppMethodBeat.i(3308);
    paramString = paramString + "#" + this.oz.getTextSize();
    AppMethodBeat.o(3308);
    return paramString;
  }

  private void c(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    AppMethodBeat.i(3280);
    this.Ald = new b(getContext(), this);
    Object localObject = new TextView(paramContext);
    ((TextView)localObject).setClickable(true);
    ((TextView)localObject).setFocusable(true);
    this.AkX = ((TextView)localObject);
    this.oz = getWrappedTextView().getPaint();
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.NeatTextView, paramInt, 0);
    int i = 15;
    int j = -16777216;
    int k = -7829368;
    int m = -16776961;
    int n = -1;
    paramContext = null;
    while (true)
    {
      int i2;
      int i3;
      int i4;
      int i5;
      int i6;
      try
      {
        int i1 = ((TypedArray)localObject).getIndexCount();
        paramInt = 0;
        if (paramInt >= i1)
          break;
        i2 = ((TypedArray)localObject).getIndex(paramInt);
        if (i2 == 0)
        {
          i3 = ((TypedArray)localObject).getDimensionPixelSize(i2, 15);
          i4 = j;
          i5 = k;
          i6 = m;
          i7 = n;
          paramAttributeSet = paramContext;
          paramInt++;
          paramContext = paramAttributeSet;
          n = i7;
          m = i6;
          k = i5;
          j = i4;
          i = i3;
          continue;
        }
        if (i2 == 3)
        {
          i4 = ((TypedArray)localObject).getColor(i2, -16777216);
          paramAttributeSet = paramContext;
          i7 = n;
          i6 = m;
          i5 = k;
          i3 = i;
          continue;
        }
        if (i2 != 23)
          break label292;
        if (((TypedArray)localObject).getBoolean(i2, false))
        {
          i7 = 1;
          setMaxLines(i7);
          paramAttributeSet = paramContext;
          i7 = n;
          i6 = m;
          i5 = k;
          i4 = j;
          i3 = i;
          continue;
        }
      }
      finally
      {
        ((TypedArray)localObject).recycle();
        AppMethodBeat.o(3280);
      }
      int i7 = this.nnY;
      continue;
      label292: if (i2 == 20)
      {
        setLines(((TypedArray)localObject).getInt(i2, 2147483647));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 7)
      {
        setTextGravity(((TypedArray)localObject).getInt(i2, 16));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 13)
      {
        setMaxWidth(((TypedArray)localObject).getDimensionPixelSize(i2, this.di));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 24)
      {
        setSpacingAdd(((TypedArray)localObject).getDimensionPixelSize(i2, (int)this.yzE));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 15)
      {
        setMinWidth(((TypedArray)localObject).getDimensionPixelSize(i2, this.dg));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 16)
      {
        setMinHeight(((TypedArray)localObject).getDimensionPixelSize(i2, this.dh));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 14)
      {
        setMaxHeight(((TypedArray)localObject).getDimensionPixelSize(i2, this.dj));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 19)
      {
        setMaxLines(((TypedArray)localObject).getInt(i2, 2147483647));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 17)
      {
        paramAttributeSet = ((TypedArray)localObject).getString(i2);
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 22)
      {
        setWidth(((TypedArray)localObject).getDimensionPixelSize(i2, -1));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 21)
      {
        setHeight(((TypedArray)localObject).getDimensionPixelSize(i2, -1));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 18)
      {
        setHint(((TypedArray)localObject).getText(i2));
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 4)
      {
        i5 = ((TypedArray)localObject).getColor(i2, -7829368);
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 5)
      {
        i6 = ((TypedArray)localObject).getColor(i2, -16776961);
        paramAttributeSet = paramContext;
        i7 = n;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else if (i2 == 6)
      {
        i7 = ((TypedArray)localObject).getInt(i2, n);
        paramAttributeSet = paramContext;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
      }
      else
      {
        paramAttributeSet = paramContext;
        i7 = n;
        i6 = m;
        i5 = k;
        i4 = j;
        i3 = i;
        if (i2 == 26)
        {
          this.Alh = ((TypedArray)localObject).getBoolean(i2, true);
          paramAttributeSet = paramContext;
          i7 = n;
          i6 = m;
          i5 = k;
          i4 = j;
          i3 = i;
        }
      }
    }
    ((TypedArray)localObject).recycle();
    setTextColor(j);
    setRawTextSize(i);
    setLinkTextColor(m);
    setHintTextColor(k);
    switch (n)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if (!TextUtils.isEmpty(paramContext))
        ah(paramContext);
      getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
      AppMethodBeat.o(3280);
      return;
      setEllipsize(TextUtils.TruncateAt.START);
      continue;
      setEllipsize(TextUtils.TruncateAt.MIDDLE);
      continue;
      setEllipsize(TextUtils.TruncateAt.END);
    }
  }

  private void dPs()
  {
    AppMethodBeat.i(3309);
    this.AkB = null;
    Object localObject1;
    Object localObject2;
    if (AkV != null)
    {
      if ((this.mText == null) && (this.tf != null))
      {
        localObject1 = AkV;
        localObject2 = new d(this.tf.toString(), this.oz);
        this.Ali = ((d)localObject2);
        ((Handler)localObject1).post((Runnable)localObject2);
      }
    }
    else
    {
      requestLayout();
      invalidate();
      AppMethodBeat.o(3309);
    }
    while (true)
    {
      return;
      if (this.mText != null)
      {
        localObject2 = AkV;
        localObject1 = new d(this.mText.toString(), this.oz);
        this.Ali = ((d)localObject1);
        ((Handler)localObject2).post((Runnable)localObject1);
        break;
      }
      AppMethodBeat.o(3309);
    }
  }

  private void setRawTextSize(float paramFloat)
  {
    AppMethodBeat.i(3314);
    if (paramFloat != this.oz.getTextSize())
    {
      this.oz.setTextSize(paramFloat);
      if (this.AkB != null)
      {
        dPs();
        requestLayout();
        invalidate();
      }
    }
    AppMethodBeat.o(3314);
  }

  private void updateTextColors()
  {
    AppMethodBeat.i(3310);
    int i = this.lP.getColorForState(getDrawableState(), 0);
    if (i != this.yzv)
      this.yzv = i;
    for (int j = 1; ; j = 0)
    {
      i = j;
      int k;
      if (this.Ala != null)
      {
        k = this.Ala.getColorForState(getDrawableState(), 0);
        i = j;
        if (k != this.oz.linkColor)
        {
          this.oz.linkColor = k;
          i = 1;
        }
      }
      j = i;
      if (this.AkZ != null)
      {
        k = this.AkZ.getColorForState(getDrawableState(), 0);
        j = i;
        if (k != this.Alb)
        {
          this.Alb = k;
          if (this.mText != null)
          {
            j = i;
            if (this.mText.length() != 0);
          }
          else
          {
            j = 1;
          }
        }
      }
      if (j != 0)
        invalidate();
      AppMethodBeat.o(3310);
      return;
    }
  }

  public final com.tencent.neattextview.textview.layout.a QV(int paramInt)
  {
    AppMethodBeat.i(3283);
    NeatLayout localNeatLayout;
    if (!TextUtils.isEmpty(this.mText))
    {
      localNeatLayout = new NeatLayout(this.mText, null);
      localNeatLayout.a(getPaint(), paramInt, 2.147484E+009F, getPaddingLeft(), getPaddingTop(), this.yzE, this.nnY, this.yzy, this.Alg, this.Alh, this.Akm);
    }
    while (true)
    {
      AppMethodBeat.o(3283);
      return localNeatLayout;
      localNeatLayout = null;
    }
  }

  public final void a(TextUtils.TruncateAt paramTruncateAt, float paramFloat)
  {
    AppMethodBeat.i(3290);
    this.Alg = paramFloat;
    setEllipsize(paramTruncateAt);
    AppMethodBeat.o(3290);
  }

  public void a(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    boolean bool1 = true;
    AppMethodBeat.i(3286);
    this.Alc = paramBufferType;
    Object localObject = paramCharSequence;
    if (paramCharSequence == null)
      localObject = "";
    boolean bool2;
    if (paramBufferType == TextView.BufferType.NORMAL)
    {
      paramCharSequence = TextUtils.stringOrSpannedString((CharSequence)localObject);
      this.mText = paramCharSequence;
      bool2 = bool1;
      if (dKA())
      {
        String str = paramCharSequence.toString();
        localObject = (e)AkU.get(atH(str));
        if (localObject != null)
          break label257;
        if (str.matches("^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$"))
          break label251;
        bool2 = true;
        label96: AkU.put(atH(str), new e(bool2, null));
        label119: if (!bool2)
          break label267;
        bool2 = bool1;
      }
      label127: this.AkW = bool2;
      if (!this.AkW)
        break label273;
      if (getLayoutParams() != null)
        getWrappedTextView().setLayoutParams(getLayoutParams());
      getWrappedTextView().setText(paramCharSequence, paramBufferType);
      this.mText = getWrappedTextView().getText();
      requestLayout();
      invalidate();
    }
    while (true)
    {
      if ((this.mText instanceof Spannable))
        ((Spannable)this.mText).setSpan(this.AkY, 0, paramCharSequence.length(), 18);
      AppMethodBeat.o(3286);
      return;
      paramCharSequence = (CharSequence)localObject;
      if (paramBufferType != TextView.BufferType.SPANNABLE)
        break;
      paramCharSequence = this.yzx.newSpannable((CharSequence)localObject);
      break;
      label251: bool2 = false;
      break label96;
      label257: bool2 = ((e)localObject).AkW;
      break label119;
      label267: bool2 = false;
      break label127;
      label273: dPs();
    }
  }

  public void ah(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(3285);
    a(paramCharSequence, TextView.BufferType.NORMAL);
    AppMethodBeat.o(3285);
  }

  public boolean dKA()
  {
    return this.Ale;
  }

  public final boolean dPq()
  {
    return this.AkW;
  }

  public final CharSequence dPr()
  {
    if (this.mText == null);
    for (Object localObject = ""; ; localObject = this.mText)
      return localObject;
  }

  public final int getCurrentHintTextColor()
  {
    if (this.AkZ != null);
    for (int i = this.Alb; ; i = this.yzv)
      return i;
  }

  public final int getCurrentTextColor()
  {
    return this.yzv;
  }

  public CharSequence getHint()
  {
    return this.tf;
  }

  public float getHorizontalOffset()
  {
    AppMethodBeat.i(3288);
    float f;
    if (((this.Akm & 0x7) != 3) && (this.AkB != null))
    {
      f = (getMeasuredWidth() - this.AkB.dPo()[0]) / 2.0F;
      AppMethodBeat.o(3288);
    }
    while (true)
    {
      return f;
      f = getPaddingLeft();
      AppMethodBeat.o(3288);
    }
  }

  public com.tencent.neattextview.textview.layout.a getLayout()
  {
    AppMethodBeat.i(3317);
    Object localObject;
    if (this.Alj != null)
    {
      localObject = this.Alj;
      AppMethodBeat.o(3317);
    }
    while (true)
    {
      return localObject;
      localObject = new com.tencent.neattextview.textview.layout.a()
      {
        public final int dPe()
        {
          AppMethodBeat.i(3269);
          int i;
          if (NeatTextView.a(NeatTextView.this))
          {
            i = NeatTextView.this.getWrappedTextView().getLayout().getLineCount();
            AppMethodBeat.o(3269);
          }
          while (true)
          {
            return i;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              i = -1;
              AppMethodBeat.o(3269);
            }
            else
            {
              i = NeatTextView.b(NeatTextView.this).dPe();
              AppMethodBeat.o(3269);
            }
          }
        }

        public final List<com.tencent.neattextview.textview.b.c> dPf()
        {
          Object localObject = null;
          AppMethodBeat.i(3271);
          if (NeatTextView.a(NeatTextView.this))
            AppMethodBeat.o(3271);
          while (true)
          {
            return localObject;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              AppMethodBeat.o(3271);
            }
            else
            {
              localObject = NeatTextView.b(NeatTextView.this).dPf();
              AppMethodBeat.o(3271);
            }
          }
        }

        public final int getLineBaseline(int paramAnonymousInt)
        {
          AppMethodBeat.i(3259);
          if (NeatTextView.a(NeatTextView.this))
          {
            paramAnonymousInt = NeatTextView.this.getWrappedTextView().getLayout().getLineBaseline(paramAnonymousInt);
            AppMethodBeat.o(3259);
          }
          while (true)
          {
            return paramAnonymousInt;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              paramAnonymousInt = -1;
              AppMethodBeat.o(3259);
            }
            else
            {
              paramAnonymousInt = NeatTextView.b(NeatTextView.this).getLineBaseline(paramAnonymousInt);
              AppMethodBeat.o(3259);
            }
          }
        }

        public final int getLineBottom(int paramAnonymousInt)
        {
          AppMethodBeat.i(3261);
          if (NeatTextView.a(NeatTextView.this))
          {
            paramAnonymousInt = NeatTextView.this.getWrappedTextView().getLayout().getLineBottom(paramAnonymousInt);
            AppMethodBeat.o(3261);
          }
          while (true)
          {
            return paramAnonymousInt;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              paramAnonymousInt = -1;
              AppMethodBeat.o(3261);
            }
            else
            {
              paramAnonymousInt = NeatTextView.b(NeatTextView.this).getLineBottom(paramAnonymousInt);
              AppMethodBeat.o(3261);
            }
          }
        }

        public final int getLineForOffset(int paramAnonymousInt)
        {
          AppMethodBeat.i(3262);
          if (NeatTextView.a(NeatTextView.this))
          {
            paramAnonymousInt = NeatTextView.this.getWrappedTextView().getLayout().getLineForOffset(paramAnonymousInt);
            AppMethodBeat.o(3262);
          }
          while (true)
          {
            return paramAnonymousInt;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              paramAnonymousInt = -1;
              AppMethodBeat.o(3262);
            }
            else
            {
              paramAnonymousInt = NeatTextView.b(NeatTextView.this).getLineForOffset(paramAnonymousInt);
              AppMethodBeat.o(3262);
            }
          }
        }

        public final int getLineForVertical(int paramAnonymousInt)
        {
          AppMethodBeat.i(3267);
          if (NeatTextView.a(NeatTextView.this))
          {
            paramAnonymousInt = NeatTextView.this.getWrappedTextView().getLayout().getLineForVertical(paramAnonymousInt);
            AppMethodBeat.o(3267);
          }
          while (true)
          {
            return paramAnonymousInt;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              paramAnonymousInt = -1;
              AppMethodBeat.o(3267);
            }
            else
            {
              paramAnonymousInt = NeatTextView.b(NeatTextView.this).getLineForVertical(paramAnonymousInt);
              AppMethodBeat.o(3267);
            }
          }
        }

        public final float getLineRight(int paramAnonymousInt)
        {
          AppMethodBeat.i(3268);
          float f;
          if (NeatTextView.a(NeatTextView.this))
          {
            f = NeatTextView.this.getWrappedTextView().getLayout().getLineRight(paramAnonymousInt);
            AppMethodBeat.o(3268);
          }
          while (true)
          {
            return f;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              f = -1.0F;
              AppMethodBeat.o(3268);
            }
            else
            {
              f = NeatTextView.b(NeatTextView.this).getLineRight(paramAnonymousInt);
              AppMethodBeat.o(3268);
            }
          }
        }

        public final int getLineStart(int paramAnonymousInt)
        {
          AppMethodBeat.i(3266);
          if (NeatTextView.a(NeatTextView.this))
          {
            paramAnonymousInt = NeatTextView.this.getWrappedTextView().getLayout().getLineStart(paramAnonymousInt);
            AppMethodBeat.o(3266);
          }
          while (true)
          {
            return paramAnonymousInt;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              paramAnonymousInt = -1;
              AppMethodBeat.o(3266);
            }
            else
            {
              paramAnonymousInt = NeatTextView.b(NeatTextView.this).getLineStart(paramAnonymousInt);
              AppMethodBeat.o(3266);
            }
          }
        }

        public final int getLineTop(int paramAnonymousInt)
        {
          AppMethodBeat.i(3260);
          if (NeatTextView.a(NeatTextView.this))
          {
            paramAnonymousInt = NeatTextView.this.getWrappedTextView().getLayout().getLineTop(paramAnonymousInt);
            AppMethodBeat.o(3260);
          }
          while (true)
          {
            return paramAnonymousInt;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              paramAnonymousInt = -1;
              AppMethodBeat.o(3260);
            }
            else
            {
              paramAnonymousInt = NeatTextView.b(NeatTextView.this).getLineTop(paramAnonymousInt);
              AppMethodBeat.o(3260);
            }
          }
        }

        public final float getLineWidth(int paramAnonymousInt)
        {
          AppMethodBeat.i(3265);
          float f;
          if (NeatTextView.a(NeatTextView.this))
          {
            f = NeatTextView.this.getWrappedTextView().getLayout().getLineWidth(paramAnonymousInt);
            AppMethodBeat.o(3265);
          }
          while (true)
          {
            return f;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              f = -1.0F;
              AppMethodBeat.o(3265);
            }
            else
            {
              f = NeatTextView.b(NeatTextView.this).getLineWidth(paramAnonymousInt);
              AppMethodBeat.o(3265);
            }
          }
        }

        public final int getOffsetForHorizontal(int paramAnonymousInt, float paramAnonymousFloat)
        {
          AppMethodBeat.i(3264);
          if (NeatTextView.a(NeatTextView.this))
          {
            paramAnonymousInt = NeatTextView.this.getWrappedTextView().getLayout().getOffsetForHorizontal(paramAnonymousInt, paramAnonymousFloat);
            AppMethodBeat.o(3264);
          }
          while (true)
          {
            return paramAnonymousInt;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              paramAnonymousInt = -1;
              AppMethodBeat.o(3264);
            }
            else
            {
              paramAnonymousInt = NeatTextView.b(NeatTextView.this).getOffsetForHorizontal(paramAnonymousInt, paramAnonymousFloat);
              AppMethodBeat.o(3264);
            }
          }
        }

        public final float getPrimaryHorizontal(int paramAnonymousInt)
        {
          AppMethodBeat.i(3263);
          float f;
          if (NeatTextView.a(NeatTextView.this))
          {
            TextView localTextView = NeatTextView.this.getWrappedTextView();
            if ((localTextView == null) || (localTextView.getLayout() == null))
              break label83;
            f = localTextView.getLayout().getPrimaryHorizontal(paramAnonymousInt);
            AppMethodBeat.o(3263);
          }
          while (true)
          {
            return f;
            if (NeatTextView.b(NeatTextView.this) != null)
            {
              f = NeatTextView.b(NeatTextView.this).getPrimaryHorizontal(paramAnonymousInt);
              AppMethodBeat.o(3263);
            }
            else
            {
              label83: f = -1.0F;
              AppMethodBeat.o(3263);
            }
          }
        }

        public final int hQ(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          int i = -1;
          AppMethodBeat.i(3270);
          if (NeatTextView.a(NeatTextView.this))
          {
            int j = paramAnonymousInt1 - NeatTextView.this.getPaddingLeft();
            paramAnonymousInt1 = NeatTextView.this.getPaddingTop();
            Layout localLayout = NeatTextView.this.getWrappedTextView().getLayout();
            if (localLayout != null)
            {
              paramAnonymousInt1 = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(paramAnonymousInt2 - paramAnonymousInt1), j);
              if ((int)localLayout.getPrimaryHorizontal(paramAnonymousInt1) > j)
              {
                paramAnonymousInt1 = localLayout.getOffsetToLeftOf(paramAnonymousInt1);
                AppMethodBeat.o(3270);
              }
            }
          }
          while (true)
          {
            return paramAnonymousInt1;
            AppMethodBeat.o(3270);
            continue;
            AppMethodBeat.o(3270);
            paramAnonymousInt1 = i;
            continue;
            if (NeatTextView.b(NeatTextView.this) == null)
            {
              AppMethodBeat.o(3270);
              paramAnonymousInt1 = i;
            }
            else
            {
              paramAnonymousInt1 = NeatTextView.b(NeatTextView.this).hQ(paramAnonymousInt1, paramAnonymousInt2);
              AppMethodBeat.o(3270);
            }
          }
        }
      };
      this.Alj = ((com.tencent.neattextview.textview.layout.a)localObject);
      AppMethodBeat.o(3317);
    }
  }

  public int getLineCount()
  {
    AppMethodBeat.i(3293);
    int i;
    if (this.AkB != null)
    {
      i = this.AkB.Akg.size();
      AppMethodBeat.o(3293);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(3293);
    }
  }

  public int getLineHeight()
  {
    AppMethodBeat.i(3318);
    int i = Math.round(this.oz.getFontMetricsInt(null) + this.yzE);
    AppMethodBeat.o(3318);
    return i;
  }

  public b getOnDoubleClickListener()
  {
    return this.Alf;
  }

  public TextPaint getPaint()
  {
    return this.oz;
  }

  public int getTextGravity()
  {
    return this.Akm;
  }

  public float getTextSize()
  {
    AppMethodBeat.i(3311);
    float f = getPaint().getTextSize();
    AppMethodBeat.o(3311);
    return f;
  }

  public float getVerticalOffset()
  {
    AppMethodBeat.i(3287);
    float f;
    if (((this.Akm & 0x70) != 48) && (this.AkB != null))
    {
      f = (getMeasuredHeight() - this.AkB.dPo()[1]) / 2.0F;
      AppMethodBeat.o(3287);
    }
    while (true)
    {
      return f;
      f = getPaddingTop();
      AppMethodBeat.o(3287);
    }
  }

  public TextView getWrappedTextView()
  {
    return this.AkX;
  }

  public void invalidate()
  {
    AppMethodBeat.i(3315);
    super.invalidate();
    AppMethodBeat.o(3315);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(3284);
    super.onDraw(paramCanvas);
    int i = this.yzv;
    int j = i;
    if (!TextUtils.isEmpty(this.tf))
    {
      j = i;
      if (TextUtils.isEmpty(this.mText))
      {
        j = i;
        if (this.AkZ != null)
          j = this.Alb;
      }
    }
    this.oz.setColor(j);
    this.oz.drawableState = getDrawableState();
    if (this.AkW)
    {
      paramCanvas.save();
      paramCanvas.translate(getPaddingLeft(), getPaddingTop());
      Layout localLayout = getWrappedTextView().getLayout();
      if (localLayout != null)
        localLayout.draw(paramCanvas);
      paramCanvas.restore();
      AppMethodBeat.o(3284);
    }
    while (true)
    {
      return;
      if (this.AkB != null)
      {
        if (this.AkB.getTextPaint() != null)
          this.AkB.getTextPaint().set(this.oz);
        this.AkB.a(paramCanvas, getPaddingLeft(), getVerticalOffset());
      }
      AppMethodBeat.o(3284);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3282);
    if (this.AkW)
    {
      getWrappedTextView().measure(paramInt1, paramInt2);
      setMeasuredDimension(getWrappedTextView().getMeasuredWidth(), getWrappedTextView().getMeasuredHeight());
      AppMethodBeat.o(3282);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = k;
    if (k <= 0)
    {
      paramInt1 = k;
      if (j == 0)
        paramInt1 = getResources().getDisplayMetrics().widthPixels;
    }
    paramInt2 = m;
    if (m <= 0)
    {
      paramInt2 = m;
      if (j == 0)
        paramInt2 = 2147483647;
    }
    if ((this.di > 0) && (this.di < paramInt1))
      paramInt1 = this.di;
    while (true)
    {
      if ((this.dj > 0) && (this.dj < paramInt2))
        paramInt2 = this.dj;
      while (true)
      {
        k = getPaddingLeft();
        m = getPaddingRight();
        int n = getPaddingTop();
        int i1 = getPaddingBottom();
        float f1 = paramInt1 - k - m;
        float f2 = paramInt2 - n - i1;
        Object localObject1;
        if (TextUtils.isEmpty(this.mText))
          localObject1 = this.tf;
        Object localObject2;
        while (true)
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            localObject2 = (e)AkU.get(atH(((CharSequence)localObject1).toString()));
            if (localObject2 != null)
            {
              localObject2 = ((e)localObject2).Alm;
              m = 0;
              this.AkB = new NeatLayout((CharSequence)localObject1, (float[])localObject2);
              this.AkB.a(getPaint(), f1, f2, getPaddingLeft(), getPaddingTop(), this.yzE, this.nnY, this.yzy, this.Alg, this.Alh, this.Akm);
              if (m != 0)
                AkU.put(atH(this.AkB.dPn()), new e(this.AkW, this.AkB.dPg()));
              this.AkY.All = new WeakReference(this.AkB);
              localObject1 = this.AkB.dPo();
              if (i != 1073741824)
                paramInt1 = (int)Math.min(localObject1[0] + getPaddingLeft() + getPaddingRight(), this.di);
              if (j != 1073741824)
                paramInt2 = (int)Math.min(localObject1[1] + getPaddingTop() + getPaddingBottom(), this.dj);
              setMeasuredDimension(Math.max(paramInt1, this.dg), Math.max(paramInt2, this.dh));
              AppMethodBeat.o(3282);
              break;
              localObject1 = this.mText;
              continue;
            }
            if (this.Ali == null)
              break label570;
            localObject2 = this.Ali;
            if ((this.oz.getTextSize() == ((d)localObject2).eNB.getTextSize()) && (((d)localObject2).foa))
              localObject2 = ((d)localObject2).Alm;
          }
        while (true)
        {
          m = 1;
          break;
          localObject2 = null;
          continue;
          localObject2 = null;
          m = 0;
          localObject1 = "";
          break;
          label570: localObject2 = null;
        }
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3281);
    boolean bool;
    if ((this.Ald != null) && (this.Ald.onTouch(this, paramMotionEvent)))
    {
      bool = true;
      AppMethodBeat.o(3281);
    }
    while (true)
    {
      return bool;
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(3281);
    }
  }

  public void postInvalidate()
  {
    AppMethodBeat.i(3316);
    super.postInvalidate();
    AppMethodBeat.o(3316);
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    AppMethodBeat.i(3289);
    if (this.yzy != paramTruncateAt)
    {
      this.yzy = paramTruncateAt;
      if (this.AkB != null)
      {
        this.AkB = null;
        requestLayout();
        invalidate();
      }
    }
    AppMethodBeat.o(3289);
  }

  public void setHeight(int paramInt)
  {
    AppMethodBeat.i(3297);
    this.dj = paramInt;
    getWrappedTextView().setMaxHeight(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3297);
  }

  public final void setHint(int paramInt)
  {
    AppMethodBeat.i(3294);
    setHint(getContext().getResources().getText(paramInt));
    AppMethodBeat.o(3294);
  }

  public final void setHint(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(3295);
    this.tf = TextUtils.stringOrSpannedString(paramCharSequence);
    getWrappedTextView().setHint(this.tf);
    if (TextUtils.isEmpty(this.mText))
      dPs();
    AppMethodBeat.o(3295);
  }

  public final void setHintTextColor(int paramInt)
  {
    AppMethodBeat.i(3307);
    this.AkZ = ColorStateList.valueOf(paramInt);
    getWrappedTextView().setHintTextColor(paramInt);
    updateTextColors();
    AppMethodBeat.o(3307);
  }

  public void setLines(int paramInt)
  {
    AppMethodBeat.i(3304);
    this.nnY = paramInt;
    getWrappedTextView().setLines(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3304);
  }

  public final void setLinkTextColor(int paramInt)
  {
    AppMethodBeat.i(3306);
    this.Ala = ColorStateList.valueOf(paramInt);
    updateTextColors();
    AppMethodBeat.o(3306);
  }

  public void setMaxHeight(int paramInt)
  {
    AppMethodBeat.i(3299);
    this.dj = paramInt;
    getWrappedTextView().setMaxHeight(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3299);
  }

  public void setMaxLines(int paramInt)
  {
    AppMethodBeat.i(3303);
    this.nnY = paramInt;
    getWrappedTextView().setMaxLines(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3303);
  }

  public void setMaxWidth(int paramInt)
  {
    AppMethodBeat.i(3300);
    this.di = paramInt;
    getWrappedTextView().setMaxWidth(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3300);
  }

  public void setMinHeight(int paramInt)
  {
    AppMethodBeat.i(3298);
    this.dh = paramInt;
    getWrappedTextView().setMinHeight(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3298);
  }

  public void setMinWidth(int paramInt)
  {
    AppMethodBeat.i(3302);
    this.dg = paramInt;
    getWrappedTextView().setMinWidth(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3302);
  }

  public void setNeatEnable(boolean paramBoolean)
  {
    this.Ale = paramBoolean;
  }

  public void setOnDoubleClickListener(b paramb)
  {
    this.Alf = paramb;
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(3292);
    if ((paramInt1 != getPaddingLeft()) || (paramInt3 != getPaddingRight()) || (paramInt2 != getPaddingTop()) || (paramInt4 != getPaddingBottom()))
      this.AkB = null;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    getWrappedTextView().setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
    AppMethodBeat.o(3292);
  }

  public void setSmartLetterEnable(boolean paramBoolean)
  {
    this.Alh = paramBoolean;
  }

  public void setSpacingAdd(int paramInt)
  {
    AppMethodBeat.i(3301);
    this.yzE = paramInt;
    getWrappedTextView().setLineSpacing(paramInt, 1.0F);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3301);
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(3305);
    this.lP = ColorStateList.valueOf(paramInt);
    getWrappedTextView().setTextColor(paramInt);
    updateTextColors();
    AppMethodBeat.o(3305);
  }

  public void setTextGravity(int paramInt)
  {
    AppMethodBeat.i(3291);
    getWrappedTextView().setGravity(paramInt);
    if ((0x800007 & paramInt) == 0)
      paramInt = 0x800003 | paramInt;
    while (true)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0)
        i = paramInt | 0x30;
      this.Akm = i;
      if (i != this.Akm)
        invalidate();
      AppMethodBeat.o(3291);
      return;
    }
  }

  public void setTextSize(float paramFloat)
  {
    AppMethodBeat.i(3312);
    setTextSize(2, paramFloat);
    AppMethodBeat.o(3312);
  }

  public final void setTextSize(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(3313);
    Object localObject = getContext();
    if (localObject == null);
    for (localObject = Resources.getSystem(); ; localObject = ((Context)localObject).getResources())
    {
      setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics()));
      AppMethodBeat.o(3313);
      return;
    }
  }

  public void setWidth(int paramInt)
  {
    AppMethodBeat.i(3296);
    this.di = paramInt;
    getWrappedTextView().setMaxWidth(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(3296);
  }

  final class a
    implements SpanWatcher
  {
    WeakReference<com.tencent.neattextview.textview.layout.c> All;

    private a()
    {
    }

    private void g(Spannable paramSpannable)
    {
      AppMethodBeat.i(3275);
      if (NeatTextView.a(NeatTextView.this))
      {
        NeatTextView.this.postInvalidate();
        AppMethodBeat.o(3275);
      }
      while (true)
      {
        return;
        if (this.All == null)
        {
          AppMethodBeat.o(3275);
        }
        else
        {
          com.tencent.neattextview.textview.layout.c localc = (com.tencent.neattextview.textview.layout.c)this.All.get();
          if ((localc != null) && (localc.getText() == paramSpannable))
          {
            localc.an(paramSpannable);
            NeatTextView.this.postInvalidate();
          }
          AppMethodBeat.o(3275);
        }
      }
    }

    public final void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(3272);
      g(paramSpannable);
      AppMethodBeat.o(3272);
    }

    public final void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      AppMethodBeat.i(3274);
      g(paramSpannable);
      AppMethodBeat.o(3274);
    }

    public final void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(3273);
      g(paramSpannable);
      AppMethodBeat.o(3273);
    }
  }

  public static abstract interface b
  {
    public abstract boolean fi(View paramView);
  }

  public static abstract interface c extends View.OnTouchListener
  {
  }

  static final class d
    implements Runnable
  {
    float[] Alm;
    TextPaint eNB;
    volatile boolean foa;
    String text;

    d(String paramString, TextPaint paramTextPaint)
    {
      AppMethodBeat.i(3276);
      this.eNB = new TextPaint();
      this.foa = false;
      this.eNB.set(paramTextPaint);
      this.text = paramString;
      AppMethodBeat.o(3276);
    }

    public final void run()
    {
      AppMethodBeat.i(3277);
      this.Alm = new float[this.text.length()];
      this.eNB.getTextWidths(this.text, this.Alm);
      this.foa = true;
      AppMethodBeat.o(3277);
    }
  }

  static final class e
  {
    public boolean AkW;
    public float[] Alm;

    public e(boolean paramBoolean, float[] paramArrayOfFloat)
    {
      this.AkW = paramBoolean;
      this.Alm = paramArrayOfFloat;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.view.NeatTextView
 * JD-Core Version:    0.6.2
 */