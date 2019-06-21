package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RemoteViews.RemoteView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@RemoteViews.RemoteView
public class QImageView extends View
{
  private static final QImageView.a[] zNL = { QImageView.a.zNN, QImageView.a.zNO, QImageView.a.zNP, QImageView.a.zNQ, QImageView.a.zNR, QImageView.a.zNS, QImageView.a.zNT, QImageView.a.zNU };
  private static final Matrix.ScaleToFit[] zNM = { Matrix.ScaleToFit.FILL, Matrix.ScaleToFit.START, Matrix.ScaleToFit.CENTER, Matrix.ScaleToFit.END };
  private boolean aln;
  private int di;
  private int dj;
  private int mAlpha;
  private Context mContext;
  private Drawable mDrawable;
  private Matrix mMatrix;
  private Uri mUri;
  private int[] ox;
  private ColorFilter uN;
  private boolean zNA;
  private int zNB;
  private boolean zNC;
  private boolean zND;
  private int zNE;
  private int zNF;
  private int zNG;
  private Matrix zNH;
  private final RectF zNI;
  private final RectF zNJ;
  private boolean zNK;
  private int zNx;
  private QImageView.a zNy;
  private boolean zNz;

  public QImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(115516);
    this.mContext = paramContext;
    dKL();
    AppMethodBeat.o(115516);
  }

  public QImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(115517);
    this.zNx = 0;
    this.zNz = false;
    this.zNA = false;
    this.di = 2147483647;
    this.dj = 2147483647;
    this.mAlpha = 255;
    this.zNB = 256;
    this.zNC = false;
    this.mDrawable = null;
    this.ox = null;
    this.zND = false;
    this.zNE = 0;
    this.zNH = null;
    this.zNI = new RectF();
    this.zNJ = new RectF();
    this.aln = false;
    this.mContext = paramContext;
    dKL();
    this.aln = false;
    setAdjustViewBounds(false);
    setMaxWidth(2147483647);
    setMaxHeight(2147483647);
    this.zNK = false;
    AppMethodBeat.o(115517);
  }

  private static Matrix.ScaleToFit a(QImageView.a parama)
  {
    return zNM[(parama.zNV - 1)];
  }

  private static int az(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(115538);
    int i = View.MeasureSpec.getMode(paramInt3);
    paramInt3 = View.MeasureSpec.getSize(paramInt3);
    switch (i)
    {
    default:
    case 0:
    case -2147483648:
    case 1073741824:
    }
    while (true)
    {
      AppMethodBeat.o(115538);
      return paramInt1;
      paramInt1 = Math.min(paramInt1, paramInt2);
      continue;
      paramInt1 = Math.min(Math.min(paramInt1, paramInt3), paramInt2);
      continue;
      paramInt1 = paramInt3;
    }
  }

  private void dKL()
  {
    AppMethodBeat.i(115518);
    this.mMatrix = new Matrix();
    this.zNy = QImageView.a.zNQ;
    AppMethodBeat.o(115518);
  }

  private void dKM()
  {
    Object localObject1 = null;
    AppMethodBeat.i(115529);
    if (this.mDrawable != null)
      AppMethodBeat.o(115529);
    while (true)
    {
      return;
      Object localObject2 = getResources();
      if (localObject2 == null)
      {
        AppMethodBeat.o(115529);
      }
      else
      {
        if (this.zNx != 0);
        while (this.mUri != null)
          try
          {
            localObject2 = ((Resources)localObject2).getDrawable(this.zNx);
            localObject1 = localObject2;
            y(localObject1);
            AppMethodBeat.o(115529);
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.w("ImageView", "Unable to find resource: " + this.zNx, new Object[] { localException });
              this.mUri = null;
            }
          }
        AppMethodBeat.o(115529);
      }
    }
  }

  private void dKN()
  {
    AppMethodBeat.i(115536);
    Drawable localDrawable = this.mDrawable;
    if (localDrawable != null)
    {
      int i = localDrawable.getIntrinsicWidth();
      int j = i;
      if (i < 0)
        j = this.zNF;
      int k = localDrawable.getIntrinsicHeight();
      i = k;
      if (k < 0)
        i = this.zNG;
      if ((j != this.zNF) || (i != this.zNG))
      {
        this.zNF = j;
        this.zNG = i;
        requestLayout();
      }
    }
    AppMethodBeat.o(115536);
  }

  private void dKO()
  {
    AppMethodBeat.i(115540);
    if ((this.mDrawable == null) || (!this.zNz))
      AppMethodBeat.o(115540);
    while (true)
    {
      return;
      int i = this.zNF;
      int j = this.zNG;
      int k = getWidth() - getPaddingLeft() - getPaddingRight();
      int m = getHeight() - getPaddingTop() - getPaddingBottom();
      if (((i < 0) || (k == i)) && ((j < 0) || (m == j)));
      for (int n = 1; ; n = 0)
      {
        if ((i > 0) && (j > 0) && (QImageView.a.zNO != this.zNy))
          break label140;
        this.mDrawable.setBounds(0, 0, k, m);
        this.zNH = null;
        AppMethodBeat.o(115540);
        break;
      }
      label140: this.mDrawable.setBounds(0, 0, i, j);
      if (QImageView.a.zNN == this.zNy)
      {
        if (this.mMatrix.isIdentity())
        {
          this.zNH = null;
          AppMethodBeat.o(115540);
        }
        else
        {
          this.zNH = this.mMatrix;
          AppMethodBeat.o(115540);
        }
      }
      else if (n != 0)
      {
        this.zNH = null;
        AppMethodBeat.o(115540);
      }
      else if (QImageView.a.zNS == this.zNy)
      {
        this.zNH = this.mMatrix;
        this.zNH.setTranslate((int)((k - i) * 0.5F + 0.5F), (int)((m - j) * 0.5F + 0.5F));
        AppMethodBeat.o(115540);
      }
      else
      {
        float f1;
        float f2;
        float f3;
        if (QImageView.a.zNT == this.zNy)
        {
          this.zNH = this.mMatrix;
          if (i * m > k * j)
          {
            f1 = m / j;
            f2 = (k - i * f1) * 0.5F;
            f3 = 0.0F;
          }
          while (true)
          {
            this.zNH.setScale(f1, f1);
            this.zNH.postTranslate((int)(f2 + 0.5F), (int)(f3 + 0.5F));
            AppMethodBeat.o(115540);
            break;
            f1 = k / i;
            f3 = (m - j * f1) * 0.5F;
            f2 = 0.0F;
          }
        }
        if (QImageView.a.zNU == this.zNy)
        {
          this.zNH = this.mMatrix;
          if ((i <= k) && (j <= m));
          for (f2 = 1.0F; ; f2 = Math.min(k / i, m / j))
          {
            f3 = (int)((k - i * f2) * 0.5F + 0.5F);
            f1 = (int)((m - j * f2) * 0.5F + 0.5F);
            this.zNH.setScale(f2, f2);
            this.zNH.postTranslate(f3, f1);
            AppMethodBeat.o(115540);
            break;
          }
        }
        this.zNI.set(0.0F, 0.0F, i, j);
        this.zNJ.set(0.0F, 0.0F, k, m);
        this.zNH = this.mMatrix;
        this.zNH.setRectToRect(this.zNI, this.zNJ, a(this.zNy));
        AppMethodBeat.o(115540);
      }
    }
  }

  private void dKP()
  {
    AppMethodBeat.i(115547);
    if ((this.mDrawable != null) && (this.zNC))
    {
      this.mDrawable = this.mDrawable.mutate();
      this.mDrawable.setColorFilter(this.uN);
      this.mDrawable.setAlpha(this.mAlpha * this.zNB >> 8);
    }
    AppMethodBeat.o(115547);
  }

  private void y(Drawable paramDrawable)
  {
    AppMethodBeat.i(115535);
    if (this.mDrawable != null)
    {
      this.mDrawable.setCallback(null);
      unscheduleDrawable(this.mDrawable);
    }
    this.mDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (paramDrawable.isStateful())
        paramDrawable.setState(getDrawableState());
      paramDrawable.setLevel(this.zNE);
      this.zNF = paramDrawable.getIntrinsicWidth();
      this.zNG = paramDrawable.getIntrinsicHeight();
      dKP();
      dKO();
    }
    AppMethodBeat.o(115535);
  }

  protected void drawableStateChanged()
  {
    AppMethodBeat.i(115541);
    super.drawableStateChanged();
    Drawable localDrawable = this.mDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
    AppMethodBeat.o(115541);
  }

  public int getBaseline()
  {
    AppMethodBeat.i(115543);
    int i;
    if (this.aln)
    {
      i = getMeasuredHeight();
      AppMethodBeat.o(115543);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(115543);
    }
  }

  public Drawable getDrawable()
  {
    return this.mDrawable;
  }

  public Matrix getImageMatrix()
  {
    return this.mMatrix;
  }

  public QImageView.a getScaleType()
  {
    return this.zNy;
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(115520);
    if (paramDrawable == this.mDrawable)
    {
      invalidate();
      AppMethodBeat.o(115520);
    }
    while (true)
    {
      return;
      super.invalidateDrawable(paramDrawable);
      AppMethodBeat.o(115520);
    }
  }

  public int[] onCreateDrawableState(int paramInt)
  {
    AppMethodBeat.i(115534);
    int[] arrayOfInt;
    if (this.ox == null)
    {
      arrayOfInt = super.onCreateDrawableState(paramInt);
      AppMethodBeat.o(115534);
    }
    while (true)
    {
      return arrayOfInt;
      if (!this.zND)
      {
        arrayOfInt = this.ox;
        AppMethodBeat.o(115534);
      }
      else
      {
        arrayOfInt = mergeDrawableStates(super.onCreateDrawableState(this.ox.length + paramInt), this.ox);
        AppMethodBeat.o(115534);
      }
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(115548);
    super.onDetachedFromWindow();
    AppMethodBeat.o(115548);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(115542);
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    super.onDraw(paramCanvas);
    if (this.mDrawable == null)
      AppMethodBeat.o(115542);
    while (true)
    {
      return;
      if ((this.zNF == 0) || (this.zNG == 0))
      {
        AppMethodBeat.o(115542);
      }
      else if ((this.zNH == null) && (getPaddingTop() == 0) && (getPaddingLeft() == 0))
      {
        this.mDrawable.draw(paramCanvas);
        AppMethodBeat.o(115542);
      }
      else
      {
        int i = paramCanvas.getSaveCount();
        paramCanvas.save();
        if (this.zNK)
        {
          int j = getScrollX();
          int k = getScrollY();
          paramCanvas.clipRect(getPaddingLeft() + j, getPaddingTop() + k, j + getRight() - getLeft() - getPaddingRight(), k + getBottom() - getTop() - getPaddingBottom());
        }
        paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        if (this.zNH != null)
          paramCanvas.concat(this.zNH);
        this.mDrawable.draw(paramCanvas);
        paramCanvas.restoreToCount(i);
        AppMethodBeat.o(115542);
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(115539);
    this.zNz = true;
    dKO();
    AppMethodBeat.o(115539);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115537);
    dKM();
    float f = 0.0F;
    int i = 0;
    int j = 0;
    int k;
    int m;
    if (this.mDrawable == null)
    {
      this.zNF = -1;
      this.zNG = -1;
      k = 0;
      m = 0;
    }
    label392: label403: label406: label417: 
    while (true)
    {
      int n = getPaddingLeft();
      int i1 = getPaddingRight();
      int i2 = getPaddingTop();
      int i3 = getPaddingBottom();
      if ((i != 0) || (j != 0))
      {
        paramInt1 = az(k + n + i1, this.di, paramInt1);
        paramInt2 = az(m + i2 + i3, this.dj, paramInt2);
        if ((f == 0.0F) || (Math.abs((paramInt1 - n - i1) / (paramInt2 - i2 - i3) - f) <= 1.0E-007D))
          break label406;
        m = 0;
        if (i == 0)
          break label403;
        k = (int)((paramInt2 - i2 - i3) * f) + n + i1;
        if (k > paramInt1)
          break label403;
        m = 1;
        paramInt1 = k;
        label184: if ((m != 0) || (j == 0))
          break label392;
        m = (int)((paramInt1 - n - i1) / f) + i2 + i3;
        if (m > paramInt2)
          break label392;
        paramInt2 = paramInt1;
        paramInt1 = m;
      }
      while (true)
      {
        setMeasuredDimension(paramInt2, paramInt1);
        AppMethodBeat.o(115537);
        return;
        m = this.zNF;
        i2 = this.zNG;
        k = m;
        if (m <= 0)
          k = 1;
        m = i2;
        if (i2 <= 0)
          m = 1;
        if (!this.zNA)
          break label417;
        i = View.MeasureSpec.getMode(paramInt1);
        j = View.MeasureSpec.getMode(paramInt2);
        if (i != 1073741824)
        {
          i = 1;
          label303: if (j == 1073741824)
            break label331;
        }
        label331: for (j = 1; ; j = 0)
        {
          f = k / m;
          break;
          i = 0;
          break label303;
        }
        k = Math.max(n + i1 + k, getSuggestedMinimumWidth());
        i = Math.max(i2 + i3 + m, getSuggestedMinimumHeight());
        m = resolveSize(k, paramInt1);
        paramInt1 = resolveSize(i, paramInt2);
        paramInt2 = m;
        continue;
        m = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = m;
        continue;
        break label184;
        m = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = m;
      }
    }
  }

  protected boolean onSetAlpha(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(115521);
    if (getBackground() == null)
    {
      paramInt = (paramInt >> 7) + paramInt;
      if (this.zNB != paramInt)
      {
        this.zNB = paramInt;
        this.zNC = true;
        dKP();
      }
      AppMethodBeat.o(115521);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115521);
    }
  }

  public void setAdjustViewBounds(boolean paramBoolean)
  {
    AppMethodBeat.i(115522);
    this.zNA = paramBoolean;
    if (paramBoolean)
      setScaleType(QImageView.a.zNQ);
    AppMethodBeat.o(115522);
  }

  public void setAlpha(int paramInt)
  {
    AppMethodBeat.i(115546);
    paramInt &= 255;
    if (this.mAlpha != paramInt)
    {
      this.mAlpha = paramInt;
      this.zNC = true;
      dKP();
      invalidate();
    }
    AppMethodBeat.o(115546);
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(115527);
    super.setBackgroundDrawable(paramDrawable);
    AppMethodBeat.o(115527);
  }

  public final void setColorFilter(int paramInt)
  {
    AppMethodBeat.i(115544);
    setColorFilter(new PorterDuffColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP));
    AppMethodBeat.o(115544);
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(115545);
    if (this.uN != paramColorFilter)
    {
      this.uN = paramColorFilter;
      this.zNC = true;
      dKP();
      invalidate();
    }
    AppMethodBeat.o(115545);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115528);
    setImageDrawable(new BitmapDrawable(this.mContext.getResources(), paramBitmap));
    AppMethodBeat.o(115528);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(115526);
    if (this.mDrawable != paramDrawable)
    {
      this.zNx = 0;
      this.mUri = null;
      y(paramDrawable);
      invalidate();
    }
    AppMethodBeat.o(115526);
  }

  public void setImageLevel(int paramInt)
  {
    AppMethodBeat.i(115531);
    this.zNE = paramInt;
    if (this.mDrawable != null)
    {
      this.mDrawable.setLevel(paramInt);
      dKN();
    }
    AppMethodBeat.o(115531);
  }

  public void setImageMatrix(Matrix paramMatrix)
  {
    AppMethodBeat.i(115533);
    Matrix localMatrix = paramMatrix;
    if (paramMatrix != null)
    {
      localMatrix = paramMatrix;
      if (paramMatrix.isIdentity())
        localMatrix = null;
    }
    if (((localMatrix == null) && (!this.mMatrix.isIdentity())) || ((localMatrix != null) && (!this.mMatrix.equals(localMatrix))))
    {
      this.mMatrix.set(localMatrix);
      dKO();
      invalidate();
    }
    AppMethodBeat.o(115533);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(115523);
    if ((this.mUri != null) || (this.zNx != paramInt))
    {
      y(null);
      this.zNx = paramInt;
      this.mUri = null;
      dKM();
      invalidate();
    }
    AppMethodBeat.o(115523);
  }

  public void setImageURI(Uri paramUri)
  {
    AppMethodBeat.i(115525);
    if ((this.zNx != 0) || ((this.mUri != paramUri) && ((paramUri == null) || (this.mUri == null) || (!paramUri.equals(this.mUri)))))
    {
      y(null);
      this.zNx = 0;
      this.mUri = paramUri;
      dKM();
      invalidate();
    }
    AppMethodBeat.o(115525);
  }

  @TargetApi(11)
  public void setLayerType(int paramInt, Paint paramPaint)
  {
    AppMethodBeat.i(115524);
    if (((getDrawable() instanceof PictureDrawable)) && (paramInt != 1))
      AppMethodBeat.o(115524);
    while (true)
    {
      return;
      super.setLayerType(paramInt, paramPaint);
      AppMethodBeat.o(115524);
    }
  }

  public void setMaxHeight(int paramInt)
  {
    this.dj = paramInt;
  }

  public void setMaxWidth(int paramInt)
  {
    this.di = paramInt;
  }

  public void setScaleType(QImageView.a parama)
  {
    AppMethodBeat.i(115532);
    if (parama == null)
    {
      parama = new NullPointerException();
      AppMethodBeat.o(115532);
      throw parama;
    }
    if (this.zNy != parama)
    {
      this.zNy = parama;
      if (this.zNy != QImageView.a.zNS)
        break label71;
    }
    label71: for (boolean bool = true; ; bool = false)
    {
      setWillNotCacheDrawing(bool);
      requestLayout();
      invalidate();
      AppMethodBeat.o(115532);
      return;
    }
  }

  public void setSelected(boolean paramBoolean)
  {
    AppMethodBeat.i(115530);
    super.setSelected(paramBoolean);
    dKN();
    AppMethodBeat.o(115530);
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(115519);
    boolean bool;
    if ((this.mDrawable == paramDrawable) || (super.verifyDrawable(paramDrawable)))
    {
      bool = true;
      AppMethodBeat.o(115519);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115519);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.QImageView
 * JD-Core Version:    0.6.2
 */