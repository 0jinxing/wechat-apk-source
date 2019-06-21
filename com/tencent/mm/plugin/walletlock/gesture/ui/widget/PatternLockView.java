package com.tencent.mm.plugin.walletlock.gesture.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.walletlock.a.a;
import com.tencent.mm.plugin.walletlock.gesture.a.f;
import com.tencent.mm.sdk.platformtools.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatternLockView extends View
{
  private static Bitmap tWw = null;
  private static Bitmap tWx = null;
  private static Bitmap tWy = null;
  private static Bitmap tWz = null;
  private int HB;
  private int HC;
  private int lDV;
  private float tWA;
  private float tWB;
  private boolean tWC;
  private long tWD;
  private float tWE;
  private float tWF;
  private PatternLockView.a tWG;
  private Paint tWg;
  private Paint tWh;
  private Path tWi;
  private Matrix tWj;
  private Rect tWk;
  private Rect tWl;
  private ArrayList<f> tWm;
  private boolean[][] tWn;
  private c tWo;
  private int tWp;
  private int tWq;
  private float tWr;
  private boolean tWs;
  private boolean tWt;
  private boolean tWu;
  private b tWv;

  public PatternLockView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(51660);
    this.tWg = new Paint();
    this.tWh = new Paint();
    this.tWi = new Path();
    this.tWj = new Matrix();
    this.tWk = new Rect();
    this.tWl = new Rect();
    this.tWm = new ArrayList(9);
    this.tWn = new boolean[3][3];
    this.tWo = c.tWO;
    this.tWp = 6;
    this.tWq = 200;
    this.tWr = 0.66F;
    this.tWs = false;
    this.tWt = true;
    this.tWu = false;
    int i;
    if (isInEditMode())
    {
      i = -1;
      this.lDV = i;
      this.tWv = b.tWI;
      this.tWA = -1.0F;
      this.tWB = -1.0F;
      this.tWC = false;
      this.tWD = 0L;
      this.HB = 0;
      this.HC = 0;
      this.tWE = 0.0F;
      this.tWF = 0.0F;
      this.tWG = null;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.mm_patternlock_view);
      this.tWt = paramContext.getBoolean(4, this.tWt);
      this.tWq = paramContext.getInt(1, this.tWq);
      this.tWp = paramContext.getInt(2, this.tWp);
      this.tWs = paramContext.getBoolean(3, this.tWs);
      switch (paramContext.getInt(0, this.tWo.ordinal()))
      {
      default:
        this.tWo = c.tWO;
      case 0:
      case 1:
      }
    }
    while (true)
    {
      paramContext.recycle();
      setClickable(true);
      this.tWh.setStyle(Paint.Style.STROKE);
      this.tWh.setStrokeJoin(Paint.Join.ROUND);
      this.tWh.setStrokeCap(Paint.Cap.ROUND);
      this.tWh.setAntiAlias(true);
      this.tWh.setDither(false);
      this.tWh.setAlpha(this.tWq);
      this.tWg.setAntiAlias(true);
      this.tWg.setDither(true);
      if (isInEditMode())
        break label597;
      if (tWw == null)
      {
        tWw = u(a.g(getContext(), 2130838999));
        paramContext = u(a.g(getContext(), 2130839000));
        tWx = paramContext;
        tWy = paramContext;
        tWz = u(a.g(getContext(), 2130839001));
      }
      this.tWp = ((int)(this.tWp * d.anS().density));
      paramContext = tWw;
      paramAttributeSet = tWx;
      Bitmap localBitmap1 = tWy;
      Bitmap localBitmap2 = tWz;
      for (i = 0; i < 4; i++)
      {
        Bitmap localBitmap3 = new Bitmap[] { paramContext, paramAttributeSet, localBitmap1, localBitmap2 }[i];
        this.HB = Math.max(localBitmap3.getWidth(), this.HB);
        this.HC = Math.max(localBitmap3.getHeight(), this.HC);
      }
      i = getResources().getColor(2131690131);
      break;
      this.tWo = c.tWO;
      continue;
      this.tWo = c.tWP;
    }
    label597: AppMethodBeat.o(51660);
  }

  private float HE(int paramInt)
  {
    AppMethodBeat.i(51675);
    float f1 = getPaddingLeft();
    float f2 = paramInt;
    float f3 = this.tWE;
    float f4 = this.tWE;
    AppMethodBeat.o(51675);
    return f1 + f2 * f3 + f4 * 0.5F;
  }

  private float HF(int paramInt)
  {
    AppMethodBeat.i(51676);
    float f1 = getPaddingTop();
    float f2 = paramInt;
    float f3 = this.tWF;
    float f4 = this.tWF;
    AppMethodBeat.o(51676);
    return f1 + f2 * f3 + f4 * 0.5F;
  }

  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(51671);
    Bitmap localBitmap;
    if ((!paramBoolean) || ((!this.tWt) && (this.tWv != b.tWJ)))
      localBitmap = tWw;
    while (true)
    {
      int i = this.HB;
      int j = this.HC;
      float f1 = this.tWE;
      float f2 = this.tWF;
      i = (int)((f1 - i) * 0.5F);
      j = (int)((f2 - j) * 0.5F);
      f2 = getResources().getDisplayMetrics().density;
      f1 = Math.min((this.tWE - 33.0F * f2) / this.HB, 1.0F);
      f2 = Math.min((this.tWF - f2 * 33.0F) / this.HC, 1.0F);
      this.tWj.setTranslate(i + paramInt1, j + paramInt2);
      this.tWj.preTranslate(this.HB / 2, this.HC / 2);
      this.tWj.preScale(f1, f2);
      this.tWj.preTranslate(-this.HB / 2, -this.HC / 2);
      if (!isInEditMode())
        paramCanvas.drawBitmap(localBitmap, this.tWj, this.tWg);
      AppMethodBeat.o(51671);
      return;
      if (this.tWC)
      {
        localBitmap = tWx;
      }
      else if (this.tWv == b.tWJ)
      {
        localBitmap = tWz;
      }
      else
      {
        if ((this.tWv != b.tWI) && (this.tWv != b.tWK))
          break;
        localBitmap = tWy;
      }
    }
    paramCanvas = new IllegalStateException("unknown display mode " + this.tWv);
    AppMethodBeat.o(51671);
    throw paramCanvas;
  }

  private void a(b paramb, List<f> paramList)
  {
    AppMethodBeat.i(51678);
    this.tWm.clear();
    cTR();
    this.tWm.addAll(paramList);
    paramList = this.tWm.iterator();
    while (paramList.hasNext())
    {
      f localf = (f)paramList.next();
      this.tWn[localf.tVA][localf.tVB] = 1;
    }
    setDisplayMode(paramb);
    AppMethodBeat.o(51678);
  }

  private f ae(float paramFloat1, float paramFloat2)
  {
    int i = 0;
    AppMethodBeat.i(51672);
    Object localObject1 = null;
    float f1 = this.tWF;
    float f2 = f1 * this.tWr;
    float f3 = getPaddingTop();
    float f4 = (f1 - f2) / 2.0F;
    int j = 0;
    int k;
    label86: Object localObject2;
    if (j < 3)
    {
      float f5 = j * f1 + (f4 + f3);
      if ((paramFloat2 >= f5) && (paramFloat2 <= f5 + f2))
      {
        k = j;
        localObject2 = localObject1;
        if (k >= 0)
        {
          f2 = this.tWE;
          paramFloat2 = this.tWr * f2;
          f4 = getPaddingLeft();
          f1 = (f2 - paramFloat2) / 2.0F;
          j = i;
          label127: if (j >= 3)
            break label290;
          f5 = j * f2 + (f4 + f1);
          if ((paramFloat1 < f5) || (paramFloat1 > f5 + paramFloat2))
            break label284;
          label163: localObject2 = localObject1;
          if (j >= 0)
          {
            localObject2 = localObject1;
            if (this.tWn[k][j] == 0)
              localObject2 = f.gk(k, j);
          }
        }
        if (localObject2 == null)
          break label296;
        this.tWn[localObject2.tVA][localObject2.tVB] = 1;
        this.tWm.add(localObject2);
        if (this.tWG != null)
          new ArrayList(this.tWm);
        if (this.tWs)
          performHapticFeedback(1, 3);
        AppMethodBeat.o(51672);
      }
    }
    while (true)
    {
      return localObject2;
      j++;
      break;
      k = -1;
      break label86;
      label284: j++;
      break label127;
      label290: j = -1;
      break label163;
      label296: localObject2 = null;
      AppMethodBeat.o(51672);
    }
  }

  private void cTR()
  {
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        this.tWn[i][j] = 0;
  }

  private void cTS()
  {
    AppMethodBeat.i(51679);
    this.tWm.clear();
    cTR();
    this.tWv = b.tWI;
    invalidate();
    AppMethodBeat.o(51679);
  }

  private static String dY(List<f> paramList)
  {
    AppMethodBeat.i(51662);
    if (paramList == null)
    {
      paramList = new IllegalArgumentException("pattern is null");
      AppMethodBeat.o(51662);
      throw paramList;
    }
    int i = paramList.size();
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++)
    {
      f localf = (f)paramList.get(j);
      int k = localf.tVA;
      arrayOfByte[j] = ((byte)(byte)(localf.tVB + k * 3));
    }
    paramList = new String(arrayOfByte);
    AppMethodBeat.o(51662);
    return paramList;
  }

  private static int gl(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51668);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = paramInt2;
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    default:
    case 0:
    case -2147483648:
    }
    for (j = i; ; j = Math.max(i, paramInt2))
    {
      AppMethodBeat.o(51668);
      return j;
    }
  }

  private static Bitmap u(Drawable paramDrawable)
  {
    AppMethodBeat.i(51661);
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if (paramDrawable.getOpacity() != -1);
    for (Object localObject = Bitmap.Config.ARGB_8888; ; localObject = Bitmap.Config.RGB_565)
    {
      localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
      Canvas localCanvas = new Canvas((Bitmap)localObject);
      paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      paramDrawable.draw(localCanvas);
      AppMethodBeat.o(51661);
      return localObject;
    }
  }

  public final void cTT()
  {
    AppMethodBeat.i(51680);
    cTS();
    if (this.tWG != null)
      this.tWG.a(this);
    AppMethodBeat.o(51680);
  }

  public boolean getDisplayLine()
  {
    return this.tWt;
  }

  public boolean getEnableHapticFeedback()
  {
    return this.tWs;
  }

  public boolean getEnableInput()
  {
    return this.tWu;
  }

  public List<f> getPattern()
  {
    AppMethodBeat.i(51677);
    ArrayList localArrayList = new ArrayList(this.tWm);
    AppMethodBeat.o(51677);
    return localArrayList;
  }

  protected int getSuggestedMinimumHeight()
  {
    AppMethodBeat.i(51666);
    float f = getResources().getDisplayMetrics().density;
    int i = (int)(3.0D * this.HC / f);
    AppMethodBeat.o(51666);
    return i;
  }

  protected int getSuggestedMinimumWidth()
  {
    AppMethodBeat.i(51665);
    float f = getResources().getDisplayMetrics().density;
    int i = (int)(3.0D * this.HB / f);
    AppMethodBeat.o(51665);
    return i;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(51670);
    ArrayList localArrayList = this.tWm;
    int i = localArrayList.size();
    boolean[][] arrayOfBoolean = this.tWn;
    int k;
    Object localObject;
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    label293: int n;
    int i1;
    boolean bool;
    if (this.tWv == b.tWK)
    {
      j = (int)(SystemClock.elapsedRealtime() - this.tWD) % ((i + 1) * 700);
      k = j / 700;
      cTR();
      for (m = 0; m < k; m++)
      {
        localObject = (f)localArrayList.get(m);
        arrayOfBoolean[localObject.tVA][localObject.tVB] = 1;
      }
      if ((k > 0) && (k < i))
      {
        m = 1;
        if (m != 0)
        {
          f1 = j % 700 / 700.0F;
          localObject = (f)localArrayList.get(k - 1);
          f2 = HE(((f)localObject).tVB);
          f3 = HF(((f)localObject).tVA);
          localObject = (f)localArrayList.get(k);
          f4 = HE(((f)localObject).tVB);
          f5 = HF(((f)localObject).tVA);
          this.tWA = (f2 + (f4 - f2) * f1);
          this.tWB = ((f5 - f3) * f1 + f3);
        }
        invalidate();
      }
    }
    else
    {
      this.tWh.setColor(this.lDV);
      this.tWh.setStrokeWidth(this.tWp);
      localObject = this.tWi;
      ((Path)localObject).rewind();
      if ((!this.tWt) && (this.tWv != b.tWJ))
        break label432;
      m = 1;
      n = getPaddingTop();
      i1 = getPaddingLeft();
      f1 = this.tWE;
      f5 = this.tWF;
      if ((this.tWg.getFlags() & 0x2) == 0)
        break label438;
      bool = true;
      label332: this.tWg.setFilterBitmap(true);
    }
    float f6;
    for (int j = 0; ; j++)
    {
      if (j >= 3)
        break label450;
      f6 = n;
      f2 = j;
      k = 0;
      while (true)
        if (k < 3)
        {
          f4 = i1;
          f3 = k;
          if (arrayOfBoolean[j][k] == 0)
            a(paramCanvas, (int)(f4 + f3 * f1), (int)(f2 * f5 + f6), arrayOfBoolean[j][k]);
          k++;
          continue;
          m = 0;
          break;
          label432: m = 0;
          break label293;
          label438: bool = false;
          break label332;
        }
    }
    label450: if (m != 0)
    {
      m = 0;
      j = 0;
      if (j < i)
      {
        f localf = (f)localArrayList.get(j);
        if (arrayOfBoolean[localf.tVA][localf.tVB] != 0)
        {
          m = 1;
          f4 = HE(localf.tVB);
          f3 = HF(localf.tVA);
          if (j == 0)
            ((Path)localObject).moveTo(f4, f3);
          while (true)
          {
            j++;
            break;
            ((Path)localObject).lineTo(f4, f3);
          }
        }
      }
      if (((this.tWC) || (this.tWv == b.tWK)) && (m != 0))
        ((Path)localObject).lineTo(this.tWA, this.tWB);
      paramCanvas.drawPath((Path)localObject, this.tWh);
    }
    for (int m = 0; m < 3; m++)
    {
      f3 = n;
      f6 = m;
      for (j = 0; j < 3; j++)
      {
        f4 = i1;
        f2 = j;
        if (arrayOfBoolean[m][j] != 0)
          a(paramCanvas, (int)(f4 + f2 * f1), (int)(f6 * f5 + f3), arrayOfBoolean[m][j]);
      }
    }
    this.tWg.setFilterBitmap(bool);
    AppMethodBeat.o(51670);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51669);
    int i = getSuggestedMinimumWidth();
    int j = getSuggestedMinimumHeight();
    paramInt1 = gl(paramInt1, i);
    j = gl(paramInt2, j);
    if (this.tWo == c.tWO)
      paramInt2 = Math.min(paramInt1, j);
    for (paramInt1 = paramInt2; ; paramInt1 = j)
    {
      setMeasuredDimension(paramInt2, paramInt1);
      AppMethodBeat.o(51669);
      return;
      paramInt2 = paramInt1;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(51664);
    paramParcelable = (PatternLockView.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    b localb = b.tWI;
    Object localObject = paramParcelable.tWM;
    if (localObject == null)
    {
      paramParcelable = new IllegalArgumentException("Serialized pattern is null");
      AppMethodBeat.o(51664);
      throw paramParcelable;
    }
    ArrayList localArrayList = new ArrayList();
    localObject = ((String)localObject).getBytes();
    for (int i = 0; i < localObject.length; i++)
    {
      int j = localObject[i];
      localArrayList.add(f.gk(j / 3, j % 3));
    }
    a(localb, localArrayList);
    this.tWv = b.values()[paramParcelable.tWN];
    this.tWt = paramParcelable.tWt;
    this.tWu = paramParcelable.tWu;
    this.tWs = paramParcelable.tWs;
    AppMethodBeat.o(51664);
  }

  protected Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(51663);
    PatternLockView.SavedState localSavedState = new PatternLockView.SavedState(super.onSaveInstanceState(), dY(this.tWm), this.tWv.ordinal(), this.tWt, this.tWu, this.tWs);
    AppMethodBeat.o(51663);
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(51667);
    this.tWE = ((paramInt1 - getPaddingLeft() - getPaddingRight()) / 3.0F);
    this.tWF = ((paramInt2 - getPaddingTop() - getPaddingBottom()) / 3.0F);
    AppMethodBeat.o(51667);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(51673);
    boolean bool;
    if ((!this.tWu) || (!isEnabled()))
    {
      bool = false;
      AppMethodBeat.o(51673);
    }
    float f1;
    float f2;
    float f3;
    float f4;
    float f6;
    while (true)
    {
      return bool;
      switch (paramMotionEvent.getAction())
      {
      default:
        bool = false;
        AppMethodBeat.o(51673);
        break;
      case 0:
        cTS();
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        paramMotionEvent = ae(f1, f2);
        if (paramMotionEvent != null)
        {
          this.tWC = true;
          this.tWv = b.tWI;
          if (this.tWG == null);
        }
        while (true)
        {
          if (paramMotionEvent != null)
          {
            f3 = HE(paramMotionEvent.tVB);
            f4 = HF(paramMotionEvent.tVA);
            f5 = this.tWE * 0.5F;
            f6 = this.tWF * 0.5F;
            invalidate((int)(f3 - f5), (int)(f4 - f6), (int)(f3 + f5), (int)(f4 + f6));
          }
          this.tWA = f1;
          this.tWB = f2;
          bool = true;
          AppMethodBeat.o(51673);
          break;
          this.tWC = false;
        }
      case 1:
        if (!this.tWm.isEmpty())
        {
          this.tWC = false;
          if (this.tWG != null)
            this.tWG.a(this, new ArrayList(this.tWm));
          invalidate();
        }
        bool = true;
        AppMethodBeat.o(51673);
      case 2:
      case 3:
      }
    }
    float f5 = this.tWp;
    int i = paramMotionEvent.getHistorySize();
    this.tWk.setEmpty();
    int j = 0;
    int k = 0;
    label307: if (k < i + 1)
      if (k < i)
      {
        f1 = paramMotionEvent.getHistoricalX(k);
        label330: if (k >= i)
          break label647;
        f3 = paramMotionEvent.getHistoricalY(k);
        label345: f localf1 = ae(f1, f3);
        int m = this.tWm.size();
        if ((localf1 != null) && (m == 1))
          this.tWC = true;
        f2 = Math.abs(f1 - this.tWA);
        f4 = Math.abs(f3 - this.tWB);
        if ((f2 > 0.0F) || (f4 > 0.0F))
          j = 1;
        if ((this.tWC) && (m > 0))
        {
          f localf2 = (f)this.tWm.get(m - 1);
          f4 = HE(localf2.tVB);
          f2 = HF(localf2.tVA);
          f6 = Math.min(f4, f1) - f5;
          f4 = Math.max(f4, f1) + f5;
          f1 = Math.min(f2, f3) - f5;
          f2 = Math.max(f2, f3) + f5;
          if (localf1 == null)
            break label936;
          float f7 = this.tWE * 0.5F;
          float f8 = this.tWF * 0.5F;
          float f9 = HE(localf1.tVB);
          float f10 = HF(localf1.tVA);
          f3 = Math.min(f9 - f7, f6);
          f4 = Math.max(f7 + f9, f4);
          f1 = Math.min(f10 - f8, f1);
          f2 = Math.max(f10 + f8, f2);
        }
      }
    while (true)
    {
      this.tWk.union(Math.round(f3), Math.round(f1), Math.round(f4), Math.round(f2));
      k++;
      break label307;
      f1 = paramMotionEvent.getX();
      break label330;
      label647: f3 = paramMotionEvent.getY();
      break label345;
      this.tWA = paramMotionEvent.getX();
      if (this.tWA < getPaddingLeft() + this.tWp)
      {
        this.tWA = (getPaddingLeft() + this.tWp);
        label696: this.tWB = paramMotionEvent.getY();
        if (this.tWB >= getPaddingTop() + this.tWp)
          break label837;
        this.tWB = (getPaddingTop() + this.tWp);
      }
      while (true)
      {
        if (j != 0)
        {
          this.tWl.union(this.tWk);
          invalidate(this.tWl);
          this.tWl.set(this.tWk);
        }
        bool = true;
        AppMethodBeat.o(51673);
        break;
        if (this.tWA <= getPaddingLeft() + getWidth() - getPaddingRight() - this.tWp)
          break label696;
        this.tWA = (getPaddingLeft() + getWidth() - getPaddingRight() - this.tWp);
        break label696;
        label837: if (this.tWB > getPaddingTop() + getHeight() - getPaddingRight() - this.tWp)
          this.tWB = (getPaddingTop() + getHeight() - getPaddingBottom() - this.tWp);
      }
      if (this.tWC)
      {
        this.tWC = false;
        cTS();
        if (this.tWG != null)
          this.tWG.a(this);
      }
      bool = true;
      AppMethodBeat.o(51673);
      break;
      label936: f3 = f6;
    }
  }

  public void setDisplayLine(boolean paramBoolean)
  {
    AppMethodBeat.i(51674);
    this.tWt = paramBoolean;
    invalidate();
    AppMethodBeat.o(51674);
  }

  public void setDisplayMode(b paramb)
  {
    AppMethodBeat.i(51681);
    switch (1.tWH[paramb.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.tWv = paramb;
      invalidate();
      AppMethodBeat.o(51681);
      return;
      this.lDV = getResources().getColor(2131690131);
      continue;
      this.lDV = getResources().getColor(2131690134);
      continue;
      if (this.tWm.size() == 0)
      {
        paramb = new IllegalStateException("You should set a pattern before animating.");
        AppMethodBeat.o(51681);
        throw paramb;
      }
      this.tWu = false;
      this.lDV = getResources().getColor(2131690131);
      f localf = (f)this.tWm.get(0);
      this.tWA = HE(localf.tVB);
      this.tWB = HF(localf.tVA);
      cTR();
      this.tWD = SystemClock.elapsedRealtime();
    }
  }

  public void setEnableHapticFeedback(boolean paramBoolean)
  {
    this.tWs = paramBoolean;
  }

  public void setEnableInput(boolean paramBoolean)
  {
    this.tWu = paramBoolean;
  }

  public void setOnPatternListener(PatternLockView.a parama)
  {
    this.tWG = parama;
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(51652);
      tWI = new b("Correct", 0);
      tWJ = new b("Wrong", 1);
      tWK = new b("Animate", 2);
      tWL = new b[] { tWI, tWJ, tWK };
      AppMethodBeat.o(51652);
    }
  }

  public static enum c
  {
    static
    {
      AppMethodBeat.i(51659);
      tWO = new c("Square", 0);
      tWP = new c("Rectangle", 1);
      tWQ = new c[] { tWO, tWP };
      AppMethodBeat.o(51659);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView
 * JD-Core Version:    0.6.2
 */