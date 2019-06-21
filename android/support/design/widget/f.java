package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.e.b;
import android.support.v4.e.c;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.widget.bc;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

final class f
{
  private static final boolean nS;
  private static final Paint nT;
  private boolean hq;
  private float mScale;
  CharSequence mText;
  private final View mView;
  private boolean nU;
  float nV;
  private final Rect nW;
  private final Rect nX;
  private final RectF nY;
  int nZ = 16;
  Interpolator oA;
  private Interpolator oB;
  private float oC;
  private float oD;
  private float oE;
  private int oF;
  private float oG;
  private float oH;
  private float oI;
  private int oJ;
  int oa = 16;
  float ob = 15.0F;
  float oc = 15.0F;
  private ColorStateList od;
  ColorStateList oe;
  private float of;
  private float og;
  private float oh;
  private float oi;
  private float oj;
  private float ok;
  Typeface ol;
  Typeface om;
  private Typeface oo;
  private CharSequence oq;
  private boolean or;
  private Bitmap os;
  private Paint ot;
  private float ou;
  private float ov;
  private float ow;
  private int[] ox;
  private boolean oy;
  private final TextPaint oz;

  static
  {
    if (Build.VERSION.SDK_INT < 18);
    for (boolean bool = true; ; bool = false)
    {
      nS = bool;
      nT = null;
      return;
    }
  }

  public f(View paramView)
  {
    this.mView = paramView;
    this.oz = new TextPaint(129);
    this.nX = new Rect();
    this.nW = new Rect();
    this.nY = new RectF();
  }

  private Typeface T(int paramInt)
  {
    TypedArray localTypedArray = this.mView.getContext().obtainStyledAttributes(paramInt, new int[] { 16843692 });
    try
    {
      Object localObject1 = localTypedArray.getString(0);
      if (localObject1 != null);
      for (localObject1 = Typeface.create((String)localObject1, 0); ; localObject1 = null)
      {
        return localObject1;
        localTypedArray.recycle();
      }
    }
    finally
    {
      localTypedArray.recycle();
    }
  }

  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, Interpolator paramInterpolator)
  {
    float f = paramFloat3;
    if (paramInterpolator != null)
      f = paramInterpolator.getInterpolation(paramFloat3);
    return a.b(paramFloat1, paramFloat2, f);
  }

  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramRect.left == paramInt1) && (paramRect.top == paramInt2) && (paramRect.right == paramInt3) && (paramRect.bottom == paramInt4));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static boolean a(Typeface paramTypeface1, Typeface paramTypeface2)
  {
    if (((paramTypeface1 != null) && (!paramTypeface1.equals(paramTypeface2))) || ((paramTypeface1 == null) && (paramTypeface2 != null)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean a(CharSequence paramCharSequence)
  {
    int i = 1;
    if (s.T(this.mView) == 1)
      if (i == 0)
        break label40;
    label40: for (b localb = c.KK; ; localb = c.KJ)
    {
      return localb.a(paramCharSequence, paramCharSequence.length());
      i = 0;
      break;
    }
  }

  private void bM()
  {
    if ((this.nX.width() > 0) && (this.nX.height() > 0) && (this.nW.width() > 0) && (this.nW.height() > 0));
    for (boolean bool = true; ; bool = false)
    {
      this.nU = bool;
      return;
    }
  }

  private void bO()
  {
    j(this.nV);
  }

  private int bP()
  {
    if (this.ox != null);
    for (int i = this.od.getColorForState(this.ox, 0); ; i = this.od.getDefaultColor())
      return i;
  }

  private int bQ()
  {
    if (this.ox != null);
    for (int i = this.oe.getColorForState(this.ox, 0); ; i = this.oe.getDefaultColor())
      return i;
  }

  private void bR()
  {
    int i = 1;
    float f1 = 0.0F;
    float f2 = this.ow;
    m(this.oc);
    float f3;
    int k;
    if (this.oq != null)
    {
      f3 = this.oz.measureText(this.oq, 0, this.oq.length());
      int j = this.oa;
      if (!this.hq)
        break label384;
      k = 1;
      label63: k = d.getAbsoluteGravity(j, k);
      switch (k & 0x70)
      {
      default:
        this.og = ((this.oz.descent() - this.oz.ascent()) / 2.0F - this.oz.descent() + this.nX.centerY());
        label142: switch (k & 0x800007)
        {
        default:
          this.oi = this.nX.left;
          label188: m(this.ob);
          f3 = f1;
          if (this.oq != null)
            f3 = this.oz.measureText(this.oq, 0, this.oq.length());
          j = this.nZ;
          if (this.hq)
          {
            k = i;
            label245: k = d.getAbsoluteGravity(j, k);
            switch (k & 0x70)
            {
            default:
              this.of = ((this.oz.descent() - this.oz.ascent()) / 2.0F - this.oz.descent() + this.nW.centerY());
              label322: switch (k & 0x800007)
              {
              default:
                this.oh = this.nW.left;
              case 1:
              case 5:
              }
              break;
            case 80:
            case 48:
            }
          }
          break;
        case 1:
        case 5:
        }
        break;
      case 80:
      case 48:
      }
    }
    while (true)
    {
      bU();
      l(f2);
      return;
      f3 = 0.0F;
      break;
      label384: k = 0;
      break label63;
      this.og = this.nX.bottom;
      break label142;
      this.og = (this.nX.top - this.oz.ascent());
      break label142;
      this.oi = (this.nX.centerX() - f3 / 2.0F);
      break label188;
      this.oi = (this.nX.right - f3);
      break label188;
      k = 0;
      break label245;
      this.of = this.nW.bottom;
      break label322;
      this.of = (this.nW.top - this.oz.ascent());
      break label322;
      this.oh = (this.nW.centerX() - f3 / 2.0F);
      continue;
      this.oh = (this.nW.right - f3);
    }
  }

  private void bS()
  {
    if ((this.os != null) || (this.nW.isEmpty()) || (TextUtils.isEmpty(this.oq)));
    while (true)
    {
      return;
      j(0.0F);
      this.ou = this.oz.ascent();
      this.ov = this.oz.descent();
      int i = Math.round(this.oz.measureText(this.oq, 0, this.oq.length()));
      int j = Math.round(this.ov - this.ou);
      if ((i > 0) && (j > 0))
      {
        this.os = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        new Canvas(this.os).drawText(this.oq, 0, this.oq.length(), 0.0F, j - this.oz.descent(), this.oz);
        if (this.ot == null)
          this.ot = new Paint(3);
      }
    }
  }

  private void bU()
  {
    if (this.os != null)
    {
      this.os.recycle();
      this.os = null;
    }
  }

  private static int c(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1);
    float f3 = Color.alpha(paramInt2);
    float f4 = Color.red(paramInt1);
    float f5 = Color.red(paramInt2);
    float f6 = Color.green(paramInt1);
    float f7 = Color.green(paramInt2);
    float f8 = Color.blue(paramInt1);
    float f9 = Color.blue(paramInt2);
    return Color.argb((int)(f2 * f1 + f3 * paramFloat), (int)(f4 * f1 + f5 * paramFloat), (int)(f6 * f1 + f7 * paramFloat), (int)(f1 * f8 + f9 * paramFloat));
  }

  private void j(float paramFloat)
  {
    k(paramFloat);
    this.oj = a(this.oh, this.oi, paramFloat, this.oA);
    this.ok = a(this.of, this.og, paramFloat, this.oA);
    l(a(this.ob, this.oc, paramFloat, this.oB));
    if (this.oe != this.od)
      this.oz.setColor(c(bP(), bQ(), paramFloat));
    while (true)
    {
      this.oz.setShadowLayer(a(this.oG, this.oC, paramFloat, null), a(this.oH, this.oD, paramFloat, null), a(this.oI, this.oE, paramFloat, null), c(this.oJ, this.oF, paramFloat));
      s.R(this.mView);
      return;
      this.oz.setColor(bQ());
    }
  }

  private void k(float paramFloat)
  {
    this.nY.left = a(this.nW.left, this.nX.left, paramFloat, this.oA);
    this.nY.top = a(this.of, this.og, paramFloat, this.oA);
    this.nY.right = a(this.nW.right, this.nX.right, paramFloat, this.oA);
    this.nY.bottom = a(this.nW.bottom, this.nX.bottom, paramFloat, this.oA);
  }

  private void l(float paramFloat)
  {
    m(paramFloat);
    if ((nS) && (this.mScale != 1.0F));
    for (boolean bool = true; ; bool = false)
    {
      this.or = bool;
      if (this.or)
        bS();
      s.R(this.mView);
      return;
    }
  }

  private void m(float paramFloat)
  {
    boolean bool = true;
    if (this.mText == null)
      return;
    float f1 = this.nX.width();
    float f2 = this.nW.width();
    float f3;
    int i;
    if (n(paramFloat, this.oc))
    {
      f3 = this.oc;
      this.mScale = 1.0F;
      if (!a(this.oo, this.ol))
        break label348;
      this.oo = this.ol;
      i = 1;
      paramFloat = f1;
    }
    while (true)
    {
      int j = i;
      if (paramFloat > 0.0F)
      {
        if ((this.ow != f3) || (this.oy) || (i != 0))
        {
          i = 1;
          label113: this.ow = f3;
          this.oy = false;
          j = i;
        }
      }
      else
      {
        if ((this.oq != null) && (j == 0))
          break;
        this.oz.setTextSize(this.ow);
        this.oz.setTypeface(this.oo);
        Object localObject = this.oz;
        if (this.mScale == 1.0F)
          break label337;
        label178: ((TextPaint)localObject).setLinearText(bool);
        localObject = TextUtils.ellipsize(this.mText, this.oz, paramFloat, TextUtils.TruncateAt.END);
        if (TextUtils.equals((CharSequence)localObject, this.oq))
          break;
        this.oq = ((CharSequence)localObject);
        this.hq = a(this.oq);
        break;
        f3 = this.ob;
        if (!a(this.oo, this.om))
          break label342;
        this.oo = this.om;
      }
      label325: label337: label342: for (i = 1; ; i = 0)
      {
        if (n(paramFloat, this.ob));
        for (this.mScale = 1.0F; ; this.mScale = (paramFloat / this.ob))
        {
          paramFloat = this.oc / this.ob;
          if (f2 * paramFloat <= f1)
            break label325;
          paramFloat = Math.min(f1 / paramFloat, f2);
          break;
        }
        paramFloat = f2;
        break;
        i = 0;
        break label113;
        bool = false;
        break label178;
      }
      label348: i = 0;
      paramFloat = f1;
    }
  }

  private static boolean n(float paramFloat1, float paramFloat2)
  {
    if (Math.abs(paramFloat1 - paramFloat2) < 0.001F);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void P(int paramInt)
  {
    if (this.nZ != paramInt)
    {
      this.nZ = paramInt;
      bT();
    }
  }

  final void Q(int paramInt)
  {
    if (this.oa != paramInt)
    {
      this.oa = paramInt;
      bT();
    }
  }

  final void R(int paramInt)
  {
    bc localbc = bc.a(this.mView.getContext(), paramInt, a.a.TextAppearance);
    if (localbc.hasValue(3))
      this.oe = localbc.getColorStateList(3);
    if (localbc.hasValue(0))
      this.oc = localbc.getDimensionPixelSize(0, (int)this.oc);
    this.oF = localbc.getInt(6, 0);
    this.oD = localbc.getFloat(7, 0.0F);
    this.oE = localbc.getFloat(8, 0.0F);
    this.oC = localbc.getFloat(9, 0.0F);
    localbc.atG.recycle();
    if (Build.VERSION.SDK_INT >= 16)
      this.ol = T(paramInt);
    bT();
  }

  final void S(int paramInt)
  {
    bc localbc = bc.a(this.mView.getContext(), paramInt, a.a.TextAppearance);
    if (localbc.hasValue(3))
      this.od = localbc.getColorStateList(3);
    if (localbc.hasValue(0))
      this.ob = localbc.getDimensionPixelSize(0, (int)this.ob);
    this.oJ = localbc.getInt(6, 0);
    this.oH = localbc.getFloat(7, 0.0F);
    this.oI = localbc.getFloat(8, 0.0F);
    this.oG = localbc.getFloat(9, 0.0F);
    localbc.atG.recycle();
    if (Build.VERSION.SDK_INT >= 16)
      this.om = T(paramInt);
    bT();
  }

  final void a(Typeface paramTypeface)
  {
    this.om = paramTypeface;
    this.ol = paramTypeface;
    bT();
  }

  final void b(ColorStateList paramColorStateList)
  {
    if (this.oe != paramColorStateList)
    {
      this.oe = paramColorStateList;
      bT();
    }
  }

  final void b(Interpolator paramInterpolator)
  {
    this.oB = paramInterpolator;
    bT();
  }

  final Typeface bN()
  {
    if (this.ol != null);
    for (Typeface localTypeface = this.ol; ; localTypeface = Typeface.DEFAULT)
      return localTypeface;
  }

  public final void bT()
  {
    if ((this.mView.getHeight() > 0) && (this.mView.getWidth() > 0))
    {
      bR();
      bO();
    }
  }

  final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.nW, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.nW.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.oy = true;
      bM();
    }
  }

  final void c(ColorStateList paramColorStateList)
  {
    if (this.od != paramColorStateList)
    {
      this.od = paramColorStateList;
      bT();
    }
  }

  final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.nX, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.nX.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.oy = true;
      bM();
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    int i = paramCanvas.save();
    float f1;
    int j;
    float f3;
    label63: float f4;
    if ((this.oq != null) && (this.nU))
    {
      f1 = this.oj;
      float f2 = this.ok;
      if ((!this.or) || (this.os == null))
        break label129;
      j = 1;
      if (j == 0)
        break label135;
      f3 = this.ou * this.mScale;
      f4 = f2;
      if (j != 0)
        f4 = f2 + f3;
      if (this.mScale != 1.0F)
        paramCanvas.scale(this.mScale, this.mScale, f1, f4);
      if (j == 0)
        break label157;
      paramCanvas.drawBitmap(this.os, f1, f4, this.ot);
    }
    while (true)
    {
      paramCanvas.restoreToCount(i);
      return;
      label129: j = 0;
      break;
      label135: this.oz.ascent();
      f3 = 0.0F;
      this.oz.descent();
      break label63;
      label157: paramCanvas.drawText(this.oq, 0, this.oq.length(), f1, f4, this.oz);
    }
  }

  final void i(float paramFloat)
  {
    float f;
    if (paramFloat < 0.0F)
      f = 0.0F;
    while (true)
    {
      if (f != this.nV)
      {
        this.nV = f;
        bO();
      }
      return;
      f = paramFloat;
      if (paramFloat > 1.0F)
        f = 1.0F;
    }
  }

  final boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = true;
    this.ox = paramArrayOfInt;
    int i;
    if (((this.oe != null) && (this.oe.isStateful())) || ((this.od != null) && (this.od.isStateful())))
    {
      i = 1;
      if (i == 0)
        break label58;
      bT();
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label58: bool = false;
    }
  }

  final void setText(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (!paramCharSequence.equals(this.mText)))
    {
      this.mText = paramCharSequence;
      this.oq = null;
      bU();
      bT();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.design.widget.f
 * JD-Core Version:    0.6.2
 */