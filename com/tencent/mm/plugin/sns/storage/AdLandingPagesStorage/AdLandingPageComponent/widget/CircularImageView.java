package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.i.a;

public class CircularImageView extends ImageView
{
  private static final String TAG;
  private Paint aFY;
  private int borderWidth;
  private boolean gBF;
  private boolean rdC;
  private boolean rdD;
  private int rdE;
  private int rdF;
  private boolean rdG;
  private float rdH;
  private BitmapShader rdI;
  private Bitmap rdJ;
  private Paint rdK;
  private Paint rdL;
  private ColorFilter rdM;
  private int shadowColor;
  private float shadowDx;
  private float shadowDy;

  static
  {
    AppMethodBeat.i(37681);
    TAG = CircularImageView.class.getSimpleName();
    AppMethodBeat.o(37681);
  }

  public CircularImageView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(37665);
    this.aFY = new Paint();
    this.aFY.setAntiAlias(true);
    this.rdK = new Paint();
    this.rdK.setAntiAlias(true);
    this.rdK.setStyle(Paint.Style.STROKE);
    this.rdL = new Paint();
    this.rdL.setAntiAlias(true);
    if (Build.VERSION.SDK_INT >= 11)
      setLayerType(1, null);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, i.a.CircularImageView, paramInt, 0);
    this.rdC = paramAttributeSet.getBoolean(0, false);
    this.rdD = paramAttributeSet.getBoolean(3, false);
    this.rdG = paramAttributeSet.getBoolean(7, false);
    if (this.rdC)
    {
      setBorderWidth(paramAttributeSet.getDimensionPixelOffset(2, (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F)));
      setBorderColor(paramAttributeSet.getColor(1, -1));
    }
    if (this.rdD)
    {
      paramInt = (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F);
      setSelectorColor(paramAttributeSet.getColor(4, 0));
      setSelectorStrokeWidth(paramAttributeSet.getDimensionPixelOffset(6, paramInt));
      setSelectorStrokeColor(paramAttributeSet.getColor(5, -16776961));
    }
    if (this.rdG)
    {
      this.rdH = paramAttributeSet.getFloat(8, 4.0F);
      this.shadowDx = paramAttributeSet.getFloat(9, 0.0F);
      this.shadowDy = paramAttributeSet.getFloat(10, 2.0F);
      this.shadowColor = paramAttributeSet.getColor(11, -16777216);
      setShadowEnabled(true);
    }
    paramAttributeSet.recycle();
    AppMethodBeat.o(37665);
  }

  private void cqg()
  {
    AppMethodBeat.i(37680);
    if (this.rdJ == null)
      AppMethodBeat.o(37680);
    while (true)
    {
      return;
      Object localObject = this.rdJ;
      Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
      this.rdI = new BitmapShader((Bitmap)localObject, localTileMode, localTileMode);
      if ((this.rdE != this.rdJ.getWidth()) || (this.rdE != this.rdJ.getHeight()))
      {
        localObject = new Matrix();
        float f = this.rdE / this.rdJ.getWidth();
        ((Matrix)localObject).setScale(f, f);
        this.rdI.setLocalMatrix((Matrix)localObject);
      }
      AppMethodBeat.o(37680);
    }
  }

  private static Bitmap drawableToBitmap(Drawable paramDrawable)
  {
    Object localObject = null;
    AppMethodBeat.i(37679);
    if (paramDrawable == null)
    {
      AppMethodBeat.o(37679);
      paramDrawable = localObject;
    }
    while (true)
    {
      return paramDrawable;
      if ((paramDrawable instanceof BitmapDrawable))
      {
        paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
        AppMethodBeat.o(37679);
      }
      else
      {
        int i = paramDrawable.getIntrinsicWidth();
        int j = paramDrawable.getIntrinsicHeight();
        if ((i <= 0) || (j <= 0))
        {
          AppMethodBeat.o(37679);
          paramDrawable = localObject;
        }
        else
        {
          try
          {
            Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
            Canvas localCanvas = new android/graphics/Canvas;
            localCanvas.<init>(localBitmap);
            paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
            paramDrawable.draw(localCanvas);
            AppMethodBeat.o(37679);
            paramDrawable = localBitmap;
          }
          catch (OutOfMemoryError paramDrawable)
          {
            AppMethodBeat.o(37679);
            paramDrawable = localObject;
          }
        }
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(37673);
    boolean bool;
    if (!isClickable())
    {
      this.gBF = false;
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(37673);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    case 2:
    case 5:
    case 6:
    case 7:
    default:
    case 0:
    case 1:
    case 3:
    case 4:
    case 8:
    }
    while (true)
    {
      invalidate();
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(37673);
      break;
      this.gBF = true;
      continue;
      this.gBF = false;
    }
  }

  public boolean isSelected()
  {
    return this.gBF;
  }

  public void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    AppMethodBeat.i(37672);
    if (this.rdJ == null)
      AppMethodBeat.o(37672);
    while (true)
    {
      return;
      if ((this.rdJ.getHeight() != 0) && (this.rdJ.getWidth() != 0))
        break;
      AppMethodBeat.o(37672);
    }
    int j = this.rdE;
    int k;
    if (getWidth() < getHeight())
    {
      k = getWidth();
      label73: this.rdE = k;
      if (j != this.rdE)
        cqg();
      this.aFY.setShader(this.rdI);
      k = this.rdE / 2;
      if ((!this.rdD) || (!this.gBF))
        break label235;
      i = this.rdF;
      k = (this.rdE - i * 2) / 2;
      this.aFY.setColorFilter(this.rdM);
      paramCanvas.drawCircle(k + i, k + i, (this.rdE - i * 2) / 2 + i - 4.0F, this.rdL);
    }
    while (true)
    {
      paramCanvas.drawCircle(k + i, k + i, (this.rdE - i * 2) / 2, this.aFY);
      AppMethodBeat.o(37672);
      break;
      k = getHeight();
      break label73;
      label235: if (this.rdC)
      {
        i = this.borderWidth;
        k = (this.rdE - i * 2) / 2;
        this.aFY.setColorFilter(null);
        paramCanvas.drawArc(new RectF(i / 2 + 0, i / 2 + 0, this.rdE - i / 2, this.rdE - i / 2), 360.0F, 360.0F, false, this.rdK);
      }
      else
      {
        this.aFY.setColorFilter(null);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37678);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i == 1073741824)
    {
      i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (i != 1073741824)
        break label70;
    }
    while (true)
    {
      setMeasuredDimension(paramInt1, paramInt2 + 2);
      AppMethodBeat.o(37678);
      return;
      if (i == -2147483648)
        break;
      paramInt1 = this.rdE;
      break;
      label70: if (i != -2147483648)
        paramInt2 = this.rdE;
    }
  }

  public void setBorderColor(int paramInt)
  {
    AppMethodBeat.i(37667);
    if (this.rdK != null)
      this.rdK.setColor(paramInt);
    invalidate();
    AppMethodBeat.o(37667);
  }

  public void setBorderWidth(int paramInt)
  {
    AppMethodBeat.i(37666);
    this.borderWidth = paramInt;
    if (this.rdK != null)
      this.rdK.setStrokeWidth(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(37666);
  }

  public void setIconModeEnabled(boolean paramBoolean)
  {
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37677);
    super.setImageBitmap(paramBitmap);
    this.rdJ = paramBitmap;
    if (this.rdE > 0)
      cqg();
    AppMethodBeat.o(37677);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(37676);
    super.setImageDrawable(paramDrawable);
    this.rdJ = drawableToBitmap(getDrawable());
    if (this.rdE > 0)
      cqg();
    AppMethodBeat.o(37676);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(37675);
    super.setImageResource(paramInt);
    this.rdJ = drawableToBitmap(getDrawable());
    if (this.rdE > 0)
      cqg();
    AppMethodBeat.o(37675);
  }

  public void setImageURI(Uri paramUri)
  {
    AppMethodBeat.i(37674);
    super.setImageURI(paramUri);
    this.rdJ = drawableToBitmap(getDrawable());
    if (this.rdE > 0)
      cqg();
    AppMethodBeat.o(37674);
  }

  public void setSelectorColor(int paramInt)
  {
    AppMethodBeat.i(37668);
    this.rdM = new PorterDuffColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    invalidate();
    AppMethodBeat.o(37668);
  }

  public void setSelectorStrokeColor(int paramInt)
  {
    AppMethodBeat.i(37670);
    if (this.rdL != null)
      this.rdL.setColor(paramInt);
    invalidate();
    AppMethodBeat.o(37670);
  }

  public void setSelectorStrokeWidth(int paramInt)
  {
    AppMethodBeat.i(37669);
    this.rdF = paramInt;
    requestLayout();
    invalidate();
    AppMethodBeat.o(37669);
  }

  public void setShadowEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(37671);
    this.rdG = paramBoolean;
    if (this.rdG);
    for (float f = this.rdH; ; f = 0.0F)
    {
      this.rdK.setShadowLayer(f, this.shadowDx, this.shadowDy, this.shadowColor);
      this.rdL.setShadowLayer(f, this.shadowDx, this.shadowDy, this.shadowColor);
      AppMethodBeat.o(37671);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView
 * JD-Core Version:    0.6.2
 */