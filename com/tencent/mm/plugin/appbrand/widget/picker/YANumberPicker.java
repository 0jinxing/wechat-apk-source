package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v4.view.s;
import android.support.v4.widget.p;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.tencent.luggage.b.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class YANumberPicker extends View
{
  private int aKu;
  private int aKv;
  private int alw;
  private float hkf;
  private int jlA;
  private int jlB;
  private int jlC;
  private int jlD;
  private int jlE;
  private String jlF;
  private String jlG;
  private String jlH;
  private String jlI;
  private float jlJ;
  private float jlK;
  private float jlL;
  private float jlM;
  private boolean jlN;
  private boolean jlO;
  private boolean jlP;
  private boolean jlQ;
  private boolean jlR;
  private boolean jlS;
  private boolean jlT;
  private p jlU;
  private Paint jlV;
  private TextPaint jlW;
  private Paint jlX;
  private String[] jlY;
  private CharSequence[] jlZ;
  private int jlc;
  private int jld;
  private int jle;
  private int jlf;
  private int jlg;
  private int jlh;
  private int jli;
  private int jlj;
  private int jlk;
  private int jll;
  private int jlm;
  private int jln;
  private int jlo;
  private int jlp;
  private int jlq;
  private int jlr;
  private int jls;
  private int jlt;
  private int jlu;
  private int jlv;
  private int jlw;
  private int jlx;
  private int jly;
  private int jlz;
  private CharSequence[] jma;
  private Handler jmb;
  private Handler jmc;
  private YANumberPicker.d jmd;
  private YANumberPicker.b jme;
  private YANumberPicker.a jmf;
  private YANumberPicker.c jmg;
  private int jmh;
  private int jmi;
  private int jmj;
  private int jmk;
  private float jml;
  private float jmm;
  private boolean jmn;
  private float jmo;
  private float jmp;
  private float jmq;
  private int jmr;
  private int jms;
  private int jmt;
  private int jmu;
  private int jmv;
  private int le;
  private HandlerThread mHandlerThread;
  private boolean mHasInit;
  private int mScrollState;
  private VelocityTracker mVelocityTracker;

  public YANumberPicker(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(126759);
    this.jlc = -13421773;
    this.jld = -695533;
    this.jle = -695533;
    this.jlf = 0;
    this.jlg = 0;
    this.jlh = 0;
    this.jli = 0;
    this.jlj = 0;
    this.jlk = 0;
    this.jll = 0;
    this.jlm = 0;
    this.jln = 0;
    this.jlo = -695533;
    this.alw = 2;
    this.jlp = 0;
    this.jlq = 0;
    this.jlr = 3;
    this.jls = 0;
    this.jlt = 0;
    this.jlu = -1;
    this.jlv = -1;
    this.jlw = 0;
    this.jlx = 0;
    this.jly = 0;
    this.jlz = 0;
    this.jlA = 0;
    this.jlB = 0;
    this.jlC = 0;
    this.jlD = 150;
    this.jlE = 8;
    this.jlJ = 1.0F;
    this.jlK = 0.0F;
    this.jlL = 0.0F;
    this.jlM = 0.0F;
    this.jlN = true;
    this.jlO = true;
    this.jlP = false;
    this.mHasInit = false;
    this.jlQ = true;
    this.jlR = false;
    this.jlS = false;
    this.jlT = true;
    this.jlV = new Paint();
    this.jlW = new TextPaint();
    this.jlX = new Paint();
    this.mScrollState = 0;
    this.jml = 0.0F;
    this.hkf = 0.0F;
    this.jmm = 0.0F;
    this.jmn = false;
    this.jmr = 0;
    this.jms = 0;
    this.jmt = 0;
    this.jmu = 0;
    this.jmv = 0;
    init(paramContext);
    AppMethodBeat.o(126759);
  }

  public YANumberPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(126760);
    this.jlc = -13421773;
    this.jld = -695533;
    this.jle = -695533;
    this.jlf = 0;
    this.jlg = 0;
    this.jlh = 0;
    this.jli = 0;
    this.jlj = 0;
    this.jlk = 0;
    this.jll = 0;
    this.jlm = 0;
    this.jln = 0;
    this.jlo = -695533;
    this.alw = 2;
    this.jlp = 0;
    this.jlq = 0;
    this.jlr = 3;
    this.jls = 0;
    this.jlt = 0;
    this.jlu = -1;
    this.jlv = -1;
    this.jlw = 0;
    this.jlx = 0;
    this.jly = 0;
    this.jlz = 0;
    this.jlA = 0;
    this.jlB = 0;
    this.jlC = 0;
    this.jlD = 150;
    this.jlE = 8;
    this.jlJ = 1.0F;
    this.jlK = 0.0F;
    this.jlL = 0.0F;
    this.jlM = 0.0F;
    this.jlN = true;
    this.jlO = true;
    this.jlP = false;
    this.mHasInit = false;
    this.jlQ = true;
    this.jlR = false;
    this.jlS = false;
    this.jlT = true;
    this.jlV = new Paint();
    this.jlW = new TextPaint();
    this.jlX = new Paint();
    this.mScrollState = 0;
    this.jml = 0.0F;
    this.hkf = 0.0F;
    this.jmm = 0.0F;
    this.jmn = false;
    this.jmr = 0;
    this.jms = 0;
    this.jmt = 0;
    this.jmu = 0;
    this.jmv = 0;
    b(paramContext, paramAttributeSet);
    init(paramContext);
    AppMethodBeat.o(126760);
  }

  public YANumberPicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126761);
    this.jlc = -13421773;
    this.jld = -695533;
    this.jle = -695533;
    this.jlf = 0;
    this.jlg = 0;
    this.jlh = 0;
    this.jli = 0;
    this.jlj = 0;
    this.jlk = 0;
    this.jll = 0;
    this.jlm = 0;
    this.jln = 0;
    this.jlo = -695533;
    this.alw = 2;
    this.jlp = 0;
    this.jlq = 0;
    this.jlr = 3;
    this.jls = 0;
    this.jlt = 0;
    this.jlu = -1;
    this.jlv = -1;
    this.jlw = 0;
    this.jlx = 0;
    this.jly = 0;
    this.jlz = 0;
    this.jlA = 0;
    this.jlB = 0;
    this.jlC = 0;
    this.jlD = 150;
    this.jlE = 8;
    this.jlJ = 1.0F;
    this.jlK = 0.0F;
    this.jlL = 0.0F;
    this.jlM = 0.0F;
    this.jlN = true;
    this.jlO = true;
    this.jlP = false;
    this.mHasInit = false;
    this.jlQ = true;
    this.jlR = false;
    this.jlS = false;
    this.jlT = true;
    this.jlV = new Paint();
    this.jlW = new TextPaint();
    this.jlX = new Paint();
    this.mScrollState = 0;
    this.jml = 0.0F;
    this.hkf = 0.0F;
    this.jmm = 0.0F;
    this.jmn = false;
    this.jmr = 0;
    this.jms = 0;
    this.jmt = 0;
    this.jmu = 0;
    this.jmv = 0;
    b(paramContext, paramAttributeSet);
    init(paramContext);
    AppMethodBeat.o(126761);
  }

  private void M(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(126796);
    this.jmr = (paramInt - (this.jlr - 1) / 2);
    this.jmr = k(this.jmr, getOneRecycleSize(), paramBoolean);
    if (this.le == 0)
    {
      this.jlP = true;
      AppMethodBeat.o(126796);
    }
    while (true)
    {
      return;
      this.jmt = (this.jmr * this.le);
      this.jmh = (this.jmr + this.jlr / 2);
      this.jmh %= getOneRecycleSize();
      if (this.jmh < 0)
        this.jmh += getOneRecycleSize();
      this.jmi = this.jmh;
      aRQ();
      AppMethodBeat.o(126796);
    }
  }

  private static float a(Paint.FontMetrics paramFontMetrics)
  {
    AppMethodBeat.i(126795);
    float f;
    if (paramFontMetrics == null)
    {
      f = 0.0F;
      AppMethodBeat.o(126795);
    }
    while (true)
    {
      return f;
      f = Math.abs(paramFontMetrics.top + paramFontMetrics.bottom) / 2.0F;
      AppMethodBeat.o(126795);
    }
  }

  private static int a(float paramFloat, int paramInt1, int paramInt2)
  {
    int i = (paramInt1 & 0xFF000000) >>> 24;
    int j = (paramInt1 & 0xFF0000) >>> 16;
    int k = (paramInt1 & 0xFF00) >>> 8;
    paramInt1 = (paramInt1 & 0xFF) >>> 0;
    float f = i;
    i = (int)((((0xFF000000 & paramInt2) >>> 24) - i) * paramFloat + f);
    f = j;
    j = (int)((((0xFF0000 & paramInt2) >>> 16) - j) * paramFloat + f);
    f = k;
    k = (int)((((0xFF00 & paramInt2) >>> 8) - k) * paramFloat + f);
    f = paramInt1;
    return i << 24 | j << 16 | k << 8 | (int)((((paramInt2 & 0xFF) >>> 0) - paramInt1) * paramFloat + f);
  }

  private static int a(CharSequence paramCharSequence, Paint paramPaint)
  {
    AppMethodBeat.i(126805);
    int i;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      i = (int)(paramPaint.measureText(paramCharSequence.toString()) + 0.5F);
      AppMethodBeat.o(126805);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(126805);
    }
  }

  private static int a(CharSequence[] paramArrayOfCharSequence, Paint paramPaint)
  {
    AppMethodBeat.i(126804);
    int i;
    if (paramArrayOfCharSequence == null)
    {
      AppMethodBeat.o(126804);
      i = 0;
    }
    while (true)
    {
      return i;
      int j = paramArrayOfCharSequence.length;
      int k = 0;
      int m;
      for (i = 0; k < j; i = m)
      {
        CharSequence localCharSequence = paramArrayOfCharSequence[k];
        m = i;
        if (localCharSequence != null)
          m = Math.max(a(localCharSequence, paramPaint), i);
        k++;
      }
      AppMethodBeat.o(126804);
    }
  }

  private void aRN()
  {
    AppMethodBeat.i(126764);
    this.mHandlerThread = new HandlerThread("HandlerThread-For-Refreshing");
    this.mHandlerThread.start();
    this.jmb = new YANumberPicker.1(this, this.mHandlerThread.getLooper());
    this.jmc = new YANumberPicker.2(this);
    AppMethodBeat.o(126764);
  }

  private void aRO()
  {
    AppMethodBeat.i(126792);
    M(getPickedIndexRelativeToRaw() - this.jlu, false);
    this.jlO = false;
    postInvalidate();
    AppMethodBeat.o(126792);
  }

  private void aRP()
  {
    AppMethodBeat.i(126793);
    this.jmj = 0;
    this.jmk = (-this.jlr * this.le);
    if (this.jlY != null)
    {
      this.jmj = ((getOneRecycleSize() - this.jlr / 2 - 1) * this.le);
      this.jmk = (-(this.jlr / 2) * this.le);
    }
    AppMethodBeat.o(126793);
  }

  private void aRQ()
  {
    AppMethodBeat.i(126798);
    this.jmr = ((int)Math.floor(this.jmt / this.le));
    this.jms = (-(this.jmt - this.jmr * this.le));
    if (this.jmg != null)
      if (-this.jms <= this.le / 2)
        break label131;
    label131: for (this.jmi = (this.jmr + 1 + this.jlr / 2); ; this.jmi = (this.jmr + this.jlr / 2))
    {
      this.jmi %= getOneRecycleSize();
      if (this.jmi < 0)
        this.jmi += getOneRecycleSize();
      this.jmh = this.jmi;
      AppMethodBeat.o(126798);
      return;
    }
  }

  private void aRR()
  {
    AppMethodBeat.i(126803);
    float f = this.jlW.getTextSize();
    this.jlW.setTextSize(this.jlg);
    this.jly = a(this.jlY, this.jlW);
    this.jlA = a(this.jlZ, this.jlW);
    this.jlB = a(this.jma, this.jlW);
    this.jlW.setTextSize(this.jlh);
    this.jlj = a(this.jlI, this.jlW);
    this.jlW.setTextSize(f);
    AppMethodBeat.o(126803);
  }

  private void aRS()
  {
    AppMethodBeat.i(126806);
    float f = this.jlW.getTextSize();
    this.jlW.setTextSize(this.jlg);
    this.jlz = ((int)(this.jlW.getFontMetrics().bottom - this.jlW.getFontMetrics().top + 0.5D));
    this.jlW.setTextSize(f);
    AppMethodBeat.o(126806);
  }

  private void aRT()
  {
    AppMethodBeat.i(126807);
    aRU();
    aRV();
    if (this.jlu == -1)
      this.jlu = 0;
    if (this.jlv == -1)
      this.jlv = (this.jlY.length - 1);
    j(this.jlu, this.jlv, false);
    AppMethodBeat.o(126807);
  }

  private void aRU()
  {
    if (this.jlY == null)
    {
      this.jlY = new String[1];
      this.jlY[0] = "0";
    }
  }

  private void aRV()
  {
    if (this.jlY.length <= this.jlr);
    for (boolean bool = false; ; bool = true)
    {
      this.jlQ = bool;
      return;
    }
  }

  private void aRW()
  {
    AppMethodBeat.i(126808);
    if ((this.jlU != null) && (!this.jlU.qN.isFinished()))
    {
      this.jlU.startScroll(0, this.jlU.qN.getCurrY(), 0, 0, 1);
      this.jlU.qN.abortAnimation();
      postInvalidate();
    }
    AppMethodBeat.o(126808);
  }

  private static Message b(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    AppMethodBeat.i(126810);
    Message localMessage = Message.obtain();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramObject;
    AppMethodBeat.o(126810);
    return localMessage;
  }

  private void b(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(126762);
    if (paramAttributeSet == null)
      AppMethodBeat.o(126762);
    while (true)
    {
      return;
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.YANumberPicker);
      int i = localTypedArray.getIndexCount();
      int j = 0;
      if (j < i)
      {
        int k = localTypedArray.getIndex(j);
        if (k == 0)
          this.jlr = localTypedArray.getInt(k, 3);
        while (true)
        {
          j++;
          break;
          if (k == 2)
          {
            this.jlo = localTypedArray.getColor(k, -695533);
          }
          else if (k == 5)
          {
            this.alw = localTypedArray.getDimensionPixelSize(k, 2);
          }
          else if (k == 3)
          {
            this.jlp = localTypedArray.getDimensionPixelSize(k, 0);
          }
          else if (k == 4)
          {
            this.jlq = localTypedArray.getDimensionPixelSize(k, 0);
          }
          else
          {
            if (k == 12)
            {
              CharSequence[] arrayOfCharSequence = localTypedArray.getTextArray(k);
              if (arrayOfCharSequence == null)
                paramAttributeSet = null;
              while (true)
              {
                this.jlY = paramAttributeSet;
                break;
                paramAttributeSet = new String[arrayOfCharSequence.length];
                for (k = 0; k < arrayOfCharSequence.length; k++)
                  paramAttributeSet[k] = arrayOfCharSequence[k].toString();
              }
            }
            if (k == 6)
              this.jlc = localTypedArray.getColor(k, -13421773);
            else if (k == 7)
              this.jld = localTypedArray.getColor(k, -695533);
            else if (k == 8)
              this.jle = localTypedArray.getColor(k, -695533);
            else if (k == 9)
              this.jlf = localTypedArray.getDimensionPixelSize(k, e(paramContext, 13.0F));
            else if (k == 10)
              this.jlg = localTypedArray.getDimensionPixelSize(k, e(paramContext, 15.0F));
            else if (k == 11)
              this.jlh = localTypedArray.getDimensionPixelSize(k, e(paramContext, 14.0F));
            else if (k == 13)
              this.jlu = localTypedArray.getInteger(k, 0);
            else if (k == 14)
              this.jlv = localTypedArray.getInteger(k, 0);
            else if (k == 15)
              this.jlO = localTypedArray.getBoolean(k, true);
            else if (k == 1)
              this.jlN = localTypedArray.getBoolean(k, true);
            else if (k == 17)
              this.jlF = localTypedArray.getString(k);
            else if (k == 27)
              this.jlI = localTypedArray.getString(k);
            else if (k == 18)
              this.jlH = localTypedArray.getString(k);
            else if (k == 19)
              this.jlk = localTypedArray.getDimensionPixelSize(k, f(paramContext, 8.0F));
            else if (k == 20)
              this.jll = localTypedArray.getDimensionPixelSize(k, f(paramContext, 8.0F));
            else if (k == 22)
              this.jlm = localTypedArray.getDimensionPixelSize(k, f(paramContext, 2.0F));
            else if (k == 21)
              this.jln = localTypedArray.getDimensionPixelSize(k, f(paramContext, 5.0F));
            else if (k == 25)
              this.jlZ = localTypedArray.getTextArray(k);
            else if (k == 26)
              this.jma = localTypedArray.getTextArray(k);
            else if (k == 16)
              this.jlS = localTypedArray.getBoolean(k, false);
            else if (k == 23)
              this.jlT = localTypedArray.getBoolean(k, true);
            else if (k == 24)
              this.jlG = localTypedArray.getString(k);
          }
        }
      }
      localTypedArray.recycle();
      AppMethodBeat.o(126762);
    }
  }

  private static int e(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(126811);
    int i = (int)(paramContext.getResources().getDisplayMetrics().scaledDensity * paramFloat + 0.5F);
    AppMethodBeat.o(126811);
    return i;
  }

  private static int f(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(126812);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    AppMethodBeat.o(126812);
    return i;
  }

  private void fg(boolean paramBoolean)
  {
    AppMethodBeat.i(126799);
    aRR();
    aRS();
    if ((paramBoolean) && ((this.jmu == -2147483648) || (this.jmv == -2147483648)))
      this.jmc.sendEmptyMessage(3);
    AppMethodBeat.o(126799);
  }

  private TextUtils.TruncateAt getEllipsizeType()
  {
    AppMethodBeat.i(126802);
    Object localObject = this.jlG;
    int i = -1;
    switch (((String)localObject).hashCode())
    {
    default:
    case 109757538:
    case -1074341483:
    case 100571:
    }
    while (true)
      switch (i)
      {
      default:
        localObject = new IllegalArgumentException("Illegal text ellipsize type.");
        AppMethodBeat.o(126802);
        throw ((Throwable)localObject);
        if (((String)localObject).equals("start"))
        {
          i = 0;
          continue;
          if (((String)localObject).equals("middle"))
          {
            i = 1;
            continue;
            if (((String)localObject).equals("end"))
              i = 2;
          }
        }
        break;
      case 0:
      case 1:
      case 2:
      }
    localObject = TextUtils.TruncateAt.START;
    AppMethodBeat.o(126802);
    while (true)
    {
      return localObject;
      localObject = TextUtils.TruncateAt.MIDDLE;
      AppMethodBeat.o(126802);
      continue;
      localObject = TextUtils.TruncateAt.END;
      AppMethodBeat.o(126802);
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(126763);
    this.jlU = p.a(paramContext, null);
    this.jlD = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
    this.jlE = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    if (this.jlf == 0)
      this.jlf = e(paramContext, 13.0F);
    if (this.jlg == 0)
      this.jlg = e(paramContext, 15.0F);
    if (this.jlh == 0)
      this.jlh = e(paramContext, 14.0F);
    if (this.jlk == 0)
      this.jlk = f(paramContext, 8.0F);
    if (this.jll == 0)
      this.jll = f(paramContext, 8.0F);
    this.jlV.setColor(this.jlo);
    this.jlV.setAntiAlias(true);
    this.jlV.setStyle(Paint.Style.STROKE);
    this.jlV.setStrokeWidth(this.alw);
    this.jlW.setColor(this.jlc);
    this.jlW.setAntiAlias(true);
    this.jlW.setTextAlign(Paint.Align.CENTER);
    this.jlX.setColor(this.jle);
    this.jlX.setAntiAlias(true);
    this.jlX.setTextAlign(Paint.Align.CENTER);
    this.jlX.setTextSize(this.jlh);
    if (this.jlr % 2 == 0)
      this.jlr += 1;
    if ((this.jlu == -1) || (this.jlv == -1))
      aRT();
    aRN();
    AppMethodBeat.o(126763);
  }

  private void j(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(126787);
    IllegalArgumentException localIllegalArgumentException;
    if (paramInt1 > paramInt2)
    {
      localIllegalArgumentException = new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + paramInt1 + ", maxShowIndex is " + paramInt2 + ".");
      AppMethodBeat.o(126787);
      throw localIllegalArgumentException;
    }
    if (this.jlY == null)
    {
      localIllegalArgumentException = new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
      AppMethodBeat.o(126787);
      throw localIllegalArgumentException;
    }
    if (paramInt1 < 0)
    {
      localIllegalArgumentException = new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(126787);
      throw localIllegalArgumentException;
    }
    if (paramInt1 > this.jlY.length - 1)
    {
      localIllegalArgumentException = new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.jlY.length - 1) + " minShowIndex is " + paramInt1);
      AppMethodBeat.o(126787);
      throw localIllegalArgumentException;
    }
    if (paramInt2 < 0)
    {
      localIllegalArgumentException = new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is ".concat(String.valueOf(paramInt2)));
      AppMethodBeat.o(126787);
      throw localIllegalArgumentException;
    }
    if (paramInt2 > this.jlY.length - 1)
    {
      localIllegalArgumentException = new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.jlY.length - 1) + " maxShowIndex is " + paramInt2);
      AppMethodBeat.o(126787);
      throw localIllegalArgumentException;
    }
    this.jlu = paramInt1;
    this.jlv = paramInt2;
    if (paramBoolean)
    {
      this.jlC = (this.jlu + 0);
      if ((!this.jlO) || (!this.jlQ))
        break label335;
    }
    label335: for (paramBoolean = true; ; paramBoolean = false)
    {
      M(0, paramBoolean);
      postInvalidate();
      AppMethodBeat.o(126787);
      return;
    }
  }

  private static int k(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 <= 0)
      paramInt1 = 0;
    while (true)
    {
      return paramInt1;
      if (paramBoolean)
      {
        int i = paramInt1 % paramInt2;
        paramInt1 = i;
        if (i < 0)
          paramInt1 = i + paramInt2;
      }
    }
  }

  private void qT(int paramInt)
  {
    if (this.mScrollState == paramInt);
    while (true)
    {
      return;
      this.mScrollState = paramInt;
    }
  }

  private int qU(int paramInt)
  {
    boolean bool1 = false;
    int i = 0;
    AppMethodBeat.i(126791);
    if (this.le == 0)
    {
      AppMethodBeat.o(126791);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      int j = paramInt / this.le;
      paramInt = this.jlr / 2;
      i = getOneRecycleSize();
      boolean bool2 = bool1;
      if (this.jlO)
      {
        bool2 = bool1;
        if (this.jlQ)
          bool2 = true;
      }
      paramInt = k(j + paramInt, i, bool2);
      if ((paramInt < 0) || (paramInt >= getOneRecycleSize()))
        break;
      paramInt += this.jlu;
      AppMethodBeat.o(126791);
    }
    IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + paramInt + " getOneRecycleSize() : " + getOneRecycleSize() + " mWrapSelectorWheel : " + this.jlO);
    AppMethodBeat.o(126791);
    throw localIllegalArgumentException;
  }

  private int qV(int paramInt)
  {
    int i;
    if ((this.jlO) && (this.jlQ))
      i = paramInt;
    while (true)
    {
      return i;
      if (paramInt < this.jmk)
      {
        i = this.jmk;
      }
      else
      {
        i = paramInt;
        if (paramInt > this.jmj)
          i = this.jmj;
      }
    }
  }

  public final void aRX()
  {
    AppMethodBeat.i(126809);
    aRW();
    if (this.jmb != null)
      this.jmb.sendMessageDelayed(b(1, 0, 0, null), 0L);
    AppMethodBeat.o(126809);
  }

  public void computeScroll()
  {
    AppMethodBeat.i(126797);
    if (this.le == 0)
      AppMethodBeat.o(126797);
    while (true)
    {
      return;
      if (this.jlU.qN.computeScrollOffset())
      {
        this.jmt = this.jlU.qN.getCurrY();
        aRQ();
        postInvalidate();
      }
      AppMethodBeat.o(126797);
    }
  }

  public String getContentByCurrValue()
  {
    AppMethodBeat.i(126776);
    String str = this.jlY[(getValue() - this.jlw)];
    AppMethodBeat.o(126776);
    return str;
  }

  public String[] getDisplayedValues()
  {
    return this.jlY;
  }

  public int getMaxValue()
  {
    return this.jlx;
  }

  public int getMinValue()
  {
    return this.jlw;
  }

  public int getOneRecycleSize()
  {
    return this.jlv - this.jlu + 1;
  }

  public int getPickedIndexRelativeToRaw()
  {
    AppMethodBeat.i(126786);
    int i;
    if (this.jms != 0)
      if (this.jms < -this.le / 2)
        i = qU(this.jmt + this.le + this.jms);
    while (true)
    {
      AppMethodBeat.o(126786);
      return i;
      i = qU(this.jmt + this.jms);
      continue;
      i = qU(this.jmt);
    }
  }

  public int getRawContentSize()
  {
    if (this.jlY != null);
    for (int i = this.jlY.length; ; i = 0)
      return i;
  }

  public int getValue()
  {
    AppMethodBeat.i(126775);
    int i = getPickedIndexRelativeToRaw();
    int j = this.jlw;
    AppMethodBeat.o(126775);
    return i + j;
  }

  public boolean getWrapSelectorWheel()
  {
    return this.jlO;
  }

  public boolean getWrapSelectorWheelAbsolutely()
  {
    if ((this.jlO) && (this.jlQ));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(126768);
    super.onAttachedToWindow();
    if ((this.mHandlerThread == null) || (!this.mHandlerThread.isAlive()))
      aRN();
    AppMethodBeat.o(126768);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(126769);
    super.onDetachedFromWindow();
    this.mHandlerThread.quit();
    if (this.le == 0)
      AppMethodBeat.o(126769);
    while (true)
    {
      return;
      int i;
      if (!this.jlU.qN.isFinished())
      {
        this.jlU.qN.abortAnimation();
        this.jmt = this.jlU.qN.getCurrY();
        aRQ();
        if (this.jms != 0)
        {
          if (this.jms < -this.le / 2)
          {
            this.jmt = (this.jmt + this.le + this.jms);
            aRQ();
          }
        }
        else
          qT(0);
      }
      else
      {
        i = qU(this.jmt);
        if ((i == this.jlC) || (!this.jlS));
      }
      try
      {
        if (this.jme != null)
          this.jme.a(this, this.jlw + i);
        this.jlC = i;
        AppMethodBeat.o(126769);
        continue;
        this.jmt += this.jms;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.YANumberPicker", localException, "", new Object[0]);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(126800);
    super.onDraw(paramCanvas);
    float f1 = 0.0F;
    int i = 0;
    if (i < this.jlr + 1)
    {
      float f2 = this.jms + this.le * i;
      int j = this.jmr;
      int k = getOneRecycleSize();
      boolean bool;
      label68: float f3;
      float f4;
      if ((this.jlO) && (this.jlQ))
      {
        bool = true;
        j = k(j + i, k, bool);
        if (i != this.jlr / 2)
          break label294;
        f3 = (this.le + this.jms) / this.le;
        k = a(f3, this.jlc, this.jld);
        f1 = this.jlf;
        f1 += (this.jlg - f1) * f3;
        f4 = this.jlK;
        f4 += (this.jlL - f4) * f3;
        label164: this.jlW.setColor(k);
        this.jlW.setTextSize(f1);
        if ((j < 0) || (j >= getOneRecycleSize()))
          break label409;
        String str = this.jlY[(this.jlu + j)];
        Object localObject = str;
        if (this.jlG != null)
          localObject = TextUtils.ellipsize(str, this.jlW, getWidth() - this.jln * 2, getEllipsizeType());
        paramCanvas.drawText(((CharSequence)localObject).toString(), this.jmq, f4 + (f2 + this.le / 2), this.jlW);
      }
      while (true)
      {
        i++;
        f1 = f3;
        break;
        bool = false;
        break label68;
        label294: if (i == this.jlr / 2 + 1)
        {
          k = a(1.0F - f1, this.jlc, this.jld);
          f4 = this.jlf;
          f4 = (1.0F - f1) * (this.jlg - f4) + f4;
          f3 = this.jlK;
          f5 = (1.0F - f1) * (this.jlL - f3) + f3;
          f3 = f1;
          f1 = f4;
          f4 = f5;
          break label164;
        }
        k = this.jlc;
        float f5 = this.jlf;
        f4 = this.jlK;
        f3 = f1;
        f1 = f5;
        break label164;
        label409: if (!TextUtils.isEmpty(this.jlH))
          paramCanvas.drawText(this.jlH, this.jmq, f4 + (f2 + this.le / 2), this.jlW);
      }
    }
    if (this.jlN)
    {
      paramCanvas.drawLine(getPaddingLeft() + this.jlp, this.jmo, this.aKu - getPaddingRight() - this.jlq, this.jmo, this.jlV);
      paramCanvas.drawLine(getPaddingLeft() + this.jlp, this.jmp, this.aKu - getPaddingRight() - this.jlq, this.jmp, this.jlV);
    }
    if (!TextUtils.isEmpty(this.jlF))
      paramCanvas.drawText(this.jlF, this.jmq + (this.jly + this.jli) / 2 + this.jlk, (this.jmo + this.jmp) / 2.0F + this.jlM, this.jlX);
    AppMethodBeat.o(126800);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(126765);
    super.onMeasure(paramInt1, paramInt2);
    fg(false);
    int j = View.MeasureSpec.getMode(paramInt1);
    this.jmu = j;
    int k = View.MeasureSpec.getSize(paramInt1);
    if (j == 1073741824)
    {
      paramInt1 = k;
      k = View.MeasureSpec.getMode(paramInt2);
      this.jmv = k;
      i = View.MeasureSpec.getSize(paramInt2);
      if (k != 1073741824)
        break label216;
      paramInt2 = i;
    }
    while (true)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      AppMethodBeat.o(126765);
      return;
      if (Math.max(this.jli, this.jlj) == 0)
      {
        paramInt1 = 0;
        label104: if (Math.max(this.jli, this.jlj) != 0)
          break label208;
      }
      while (true)
      {
        int m = this.jlA;
        int n = Math.max(this.jly, this.jlB);
        i = Math.max(m, (paramInt1 + (i + Math.max(this.jli, this.jlj)) + this.jln * 2) * 2 + n) + (getPaddingLeft() + getPaddingRight());
        paramInt1 = i;
        if (j != -2147483648)
          break;
        paramInt1 = Math.min(i, k);
        break;
        paramInt1 = this.jll;
        break label104;
        label208: i = this.jlk;
      }
      label216: paramInt2 = this.jlr * (this.jlz + this.jlm * 2) + (getPaddingTop() + getPaddingBottom());
      if (k == -2147483648)
        paramInt2 = Math.min(paramInt2, i);
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(126766);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.aKu = paramInt1;
    this.aKv = paramInt2;
    this.le = (this.aKv / this.jlr);
    this.jmq = ((this.aKu + getPaddingLeft() - getPaddingRight()) / 2.0F);
    if (getOneRecycleSize() > 1)
      if (this.mHasInit)
        paramInt1 = getValue() - this.jlw;
    while (true)
    {
      if ((this.jlO) && (this.jlQ));
      IllegalArgumentException localIllegalArgumentException;
      for (boolean bool = true; ; bool = false)
      {
        M(paramInt1, bool);
        if (this.jlf > this.le)
          this.jlf = this.le;
        if (this.jlg > this.le)
          this.jlg = this.le;
        if (this.jlX != null)
          break label209;
        localIllegalArgumentException = new IllegalArgumentException("mPaintHint should not be null.");
        AppMethodBeat.o(126766);
        throw localIllegalArgumentException;
        if (this.jlP)
        {
          paramInt1 = this.jmr + (this.jlr - 1) / 2;
          break;
        }
        paramInt1 = 0;
        break;
      }
      label209: this.jlX.setTextSize(this.jlh);
      this.jlM = a(this.jlX.getFontMetrics());
      this.jli = a(this.jlF, this.jlX);
      if (this.jlW == null)
      {
        localIllegalArgumentException = new IllegalArgumentException("mPaintText should not be null.");
        AppMethodBeat.o(126766);
        throw localIllegalArgumentException;
      }
      this.jlW.setTextSize(this.jlg);
      this.jlL = a(this.jlW.getFontMetrics());
      this.jlW.setTextSize(this.jlf);
      this.jlK = a(this.jlW.getFontMetrics());
      aRP();
      this.jls = (this.jlr / 2);
      this.jlt = (this.jls + 1);
      this.jmo = (this.jls * this.aKv / this.jlr);
      this.jmp = (this.jlt * this.aKv / this.jlr);
      if (this.jlp < 0)
        this.jlp = 0;
      if (this.jlq < 0)
        this.jlq = 0;
      if ((this.jlp + this.jlq != 0) && (getPaddingLeft() + this.jlp >= this.aKu - getPaddingRight() - this.jlq))
      {
        paramInt1 = getPaddingLeft() + this.jlp + getPaddingRight() + this.jlq - this.aKu;
        this.jlp = ((int)(this.jlp - paramInt1 * this.jlp / (this.jlp + this.jlq)));
        this.jlq = ((int)(this.jlq - paramInt1 * this.jlq / (this.jlp + this.jlq)));
      }
      this.mHasInit = true;
      AppMethodBeat.o(126766);
      return;
      paramInt1 = 0;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126794);
    if (this.le == 0)
    {
      AppMethodBeat.o(126794);
      return true;
    }
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    this.jmm = paramMotionEvent.getY();
    int i;
    label233: int j;
    int k;
    label331: int m;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
      do
      {
        float f;
        do
        {
          while (true)
          {
            AppMethodBeat.o(126794);
            break;
            this.jmn = true;
            this.jmb.removeMessages(1);
            aRW();
            this.hkf = this.jmm;
            this.jml = this.jmt;
            qT(0);
            getParent().requestDisallowInterceptTouchEvent(true);
            continue;
            f = this.hkf - this.jmm;
            if ((!this.jmn) || (-this.jlE >= f) || (f >= this.jlE))
            {
              this.jmn = false;
              this.jmt = qV((int)(f + this.jml));
              aRQ();
              invalidate();
            }
            qT(1);
          }
          if (!this.jmn)
            break label572;
          f = paramMotionEvent.getY();
          i = 0;
        }
        while (i >= this.jlr);
        if ((this.le * i > f) || (f >= this.le * (i + 1)))
          break label566;
      }
      while ((i < 0) || (i >= this.jlr));
      i -= this.jlr / 2;
      if (this.jlO)
      {
        j = i;
        if (this.jlQ);
      }
      else
      {
        k = getPickedIndexRelativeToRaw();
        if (k + i <= this.jlv)
          break;
        j = this.jlv - k;
      }
      if (this.jms < -this.le / 2)
      {
        k = this.le + this.jms;
        i = (int)((this.le + this.jms) * 300.0F / this.le);
        if (j < 0)
        {
          i = -i - j * 300;
          label393: m = this.le;
          if (i >= 300)
            break label749;
          i = 300;
        }
      }
      break;
    case 3:
    }
    label566: label572: label749: 
    while (true)
    {
      int n = i;
      if (i > 600)
        n = 600;
      this.jlU.startScroll(0, this.jmt, 0, k + j * m, n);
      this.jmb.sendMessageDelayed(b(1, 0, 0, null), n / 4);
      postInvalidate();
      break;
      j = i;
      if (k + i >= this.jlu)
        break label331;
      j = this.jlu - k;
      break label331;
      i += j * 300;
      break label393;
      k = this.jms;
      i = (int)(-this.jms * 300.0F / this.le);
      if (j < 0)
      {
        i -= j * 300;
        break label393;
      }
      i += j * 300;
      break label393;
      i++;
      break label233;
      paramMotionEvent = this.mVelocityTracker;
      paramMotionEvent.computeCurrentVelocity(1000);
      j = (int)(paramMotionEvent.getYVelocity() * this.jlJ);
      if (Math.abs(j) > this.jlD)
      {
        paramMotionEvent = this.jlU;
        i = this.jmt;
        k = -j;
        n = qV(-2147483648);
        j = qV(2147483647);
        paramMotionEvent.qN.fling(0, i, 0, k, -2147483648, 2147483647, n, j);
        invalidate();
        qT(2);
      }
      this.jmb.sendMessageDelayed(b(1, 0, 0, null), 0L);
      if (this.mVelocityTracker == null)
        break;
      this.mVelocityTracker.clear();
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
      break;
      this.jml = this.jmt;
      aRW();
      this.jmb.sendMessageDelayed(b(1, 0, 0, null), 0L);
      break;
    }
  }

  public void postInvalidate()
  {
    AppMethodBeat.i(126767);
    if (!s.av(this))
      AppMethodBeat.o(126767);
    while (true)
    {
      return;
      super.postInvalidate();
      AppMethodBeat.o(126767);
    }
  }

  public void setContentTextTypeface(Typeface paramTypeface)
  {
    AppMethodBeat.i(126789);
    this.jlW.setTypeface(paramTypeface);
    AppMethodBeat.o(126789);
  }

  public void setDisplayedValues(String[] paramArrayOfString)
  {
    boolean bool = true;
    AppMethodBeat.i(126770);
    if (this.jmb != null)
      this.jmb.removeMessages(1);
    aRW();
    if (paramArrayOfString == null)
    {
      paramArrayOfString = new IllegalArgumentException("newDisplayedValues should not be null.");
      AppMethodBeat.o(126770);
      throw paramArrayOfString;
    }
    if (this.jlx - this.jlw + 1 > paramArrayOfString.length)
    {
      paramArrayOfString = new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + (this.jlx - this.jlw + 1) + " newDisplayedValues.length is " + paramArrayOfString.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
      AppMethodBeat.o(126770);
      throw paramArrayOfString;
    }
    this.jlY = paramArrayOfString;
    aRV();
    fg(true);
    this.jlC = (this.jlu + 0);
    if ((this.jlO) && (this.jlQ));
    while (true)
    {
      M(0, bool);
      postInvalidate();
      this.jmc.sendEmptyMessage(3);
      AppMethodBeat.o(126770);
      return;
      bool = false;
    }
  }

  public void setDividerColor(int paramInt)
  {
    AppMethodBeat.i(126782);
    if (this.jlo == paramInt)
      AppMethodBeat.o(126782);
    while (true)
    {
      return;
      this.jlo = paramInt;
      this.jlV.setColor(this.jlo);
      postInvalidate();
      AppMethodBeat.o(126782);
    }
  }

  public void setDividerHeight(int paramInt)
  {
    AppMethodBeat.i(126783);
    if (paramInt == this.alw)
      AppMethodBeat.o(126783);
    while (true)
    {
      return;
      this.alw = paramInt;
      this.jlV.setStrokeWidth(this.alw);
      postInvalidate();
      AppMethodBeat.o(126783);
    }
  }

  public void setEllipsizeType(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(126801);
    if (i < 3)
      if (new String[] { "end", "middle", "start" }[i].equals(paramString))
      {
        this.jlG = paramString;
        AppMethodBeat.o(126801);
      }
    while (true)
    {
      return;
      i++;
      break;
      this.jlG = "end";
      AppMethodBeat.o(126801);
    }
  }

  public void setFriction(float paramFloat)
  {
    AppMethodBeat.i(126788);
    if (paramFloat <= 0.0F)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("you should set a a positive float friction, now friction is ".concat(String.valueOf(paramFloat)));
      AppMethodBeat.o(126788);
      throw localIllegalArgumentException;
    }
    ViewConfiguration.get(getContext());
    this.jlJ = (ViewConfiguration.getScrollFriction() / paramFloat);
    AppMethodBeat.o(126788);
  }

  public void setHintText(String paramString)
  {
    AppMethodBeat.i(126777);
    String str = this.jlF;
    boolean bool;
    if (str == null)
      if (paramString == null)
      {
        bool = true;
        if (!bool)
          break label46;
        AppMethodBeat.o(126777);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      bool = str.equals(paramString);
      break;
      label46: this.jlF = paramString;
      this.jlM = a(this.jlX.getFontMetrics());
      this.jli = a(this.jlF, this.jlX);
      this.jmc.sendEmptyMessage(3);
      AppMethodBeat.o(126777);
    }
  }

  public void setHintTextColor(int paramInt)
  {
    AppMethodBeat.i(126781);
    if (this.jle == paramInt)
      AppMethodBeat.o(126781);
    while (true)
    {
      return;
      this.jle = paramInt;
      this.jlX.setColor(this.jle);
      postInvalidate();
      AppMethodBeat.o(126781);
    }
  }

  public void setHintTextTypeface(Typeface paramTypeface)
  {
    AppMethodBeat.i(126790);
    this.jlX.setTypeface(paramTypeface);
    AppMethodBeat.o(126790);
  }

  public void setItemPaddingVertical(int paramInt)
  {
    AppMethodBeat.i(126784);
    if (this.jlm == paramInt)
      AppMethodBeat.o(126784);
    while (true)
    {
      return;
      this.jlm = paramInt;
      postInvalidate();
      AppMethodBeat.o(126784);
    }
  }

  public void setMaxValue(int paramInt)
  {
    AppMethodBeat.i(126773);
    Object localObject;
    if (this.jlY == null)
    {
      localObject = new NullPointerException("mDisplayedValues should not be null");
      AppMethodBeat.o(126773);
      throw ((Throwable)localObject);
    }
    if (paramInt - this.jlw + 1 > this.jlY.length)
    {
      localObject = new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + (paramInt - this.jlw + 1) + " and mDisplayedValues.length is " + this.jlY.length);
      AppMethodBeat.o(126773);
      throw ((Throwable)localObject);
    }
    this.jlx = paramInt;
    this.jlv = (this.jlx - this.jlw + this.jlu);
    j(this.jlu, this.jlv, true);
    aRP();
    AppMethodBeat.o(126773);
  }

  public void setMinValue(int paramInt)
  {
    AppMethodBeat.i(126772);
    this.jlw = paramInt;
    this.jlu = 0;
    aRP();
    AppMethodBeat.o(126772);
  }

  public void setNormalTextColor(int paramInt)
  {
    AppMethodBeat.i(126779);
    if (this.jlc == paramInt)
      AppMethodBeat.o(126779);
    while (true)
    {
      return;
      this.jlc = paramInt;
      postInvalidate();
      AppMethodBeat.o(126779);
    }
  }

  public void setOnScrollListener(YANumberPicker.a parama)
  {
    this.jmf = parama;
  }

  public void setOnValueChangeListenerInScrolling(YANumberPicker.c paramc)
  {
    this.jmg = paramc;
  }

  public void setOnValueChangedListener(YANumberPicker.b paramb)
  {
    this.jme = paramb;
  }

  public void setOnValueChangedListenerRelativeToRaw(YANumberPicker.d paramd)
  {
    this.jmd = paramd;
  }

  public void setPickedIndexRelativeToMin(int paramInt)
  {
    AppMethodBeat.i(126778);
    if ((paramInt >= 0) && (paramInt < getOneRecycleSize()))
    {
      this.jlC = (this.jlu + paramInt);
      if ((!this.jlO) || (!this.jlQ))
        break label61;
    }
    label61: for (boolean bool = true; ; bool = false)
    {
      M(paramInt, bool);
      postInvalidate();
      AppMethodBeat.o(126778);
      return;
    }
  }

  public void setPickedIndexRelativeToRaw(int paramInt)
  {
    AppMethodBeat.i(126785);
    int i;
    if ((this.jlu >= 0) && (this.jlu <= paramInt) && (paramInt <= this.jlv))
    {
      this.jlC = paramInt;
      i = this.jlu;
      if ((!this.jlO) || (!this.jlQ))
        break label74;
    }
    label74: for (boolean bool = true; ; bool = false)
    {
      M(paramInt - i, bool);
      postInvalidate();
      AppMethodBeat.o(126785);
      return;
    }
  }

  public void setSelectedTextColor(int paramInt)
  {
    AppMethodBeat.i(126780);
    if (this.jld == paramInt)
      AppMethodBeat.o(126780);
    while (true)
    {
      return;
      this.jld = paramInt;
      postInvalidate();
      AppMethodBeat.o(126780);
    }
  }

  public void setValue(int paramInt)
  {
    AppMethodBeat.i(126774);
    IllegalArgumentException localIllegalArgumentException;
    if (paramInt < this.jlw)
    {
      localIllegalArgumentException = new IllegalArgumentException("should not set a value less than mMinValue, value is ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(126774);
      throw localIllegalArgumentException;
    }
    if (paramInt > this.jlx)
    {
      localIllegalArgumentException = new IllegalArgumentException("should not set a value greater than mMaxValue, value is ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(126774);
      throw localIllegalArgumentException;
    }
    setPickedIndexRelativeToRaw(paramInt - this.jlw);
    AppMethodBeat.o(126774);
  }

  public void setWrapSelectorWheel(boolean paramBoolean)
  {
    AppMethodBeat.i(126771);
    if (this.jlO != paramBoolean)
      if (!paramBoolean)
        if (this.mScrollState == 0)
        {
          aRO();
          AppMethodBeat.o(126771);
        }
    while (true)
    {
      return;
      this.jlR = true;
      AppMethodBeat.o(126771);
      continue;
      this.jlO = paramBoolean;
      aRV();
      postInvalidate();
      AppMethodBeat.o(126771);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker
 * JD-Core Version:    0.6.2
 */