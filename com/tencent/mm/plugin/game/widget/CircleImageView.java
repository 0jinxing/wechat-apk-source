package com.tencent.mm.plugin.game.widget;

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
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.a;

public class CircleImageView extends ImageView
{
  private static final Bitmap.Config fdG = Bitmap.Config.ARGB_8888;
  private static final ImageView.ScaleType nof = ImageView.ScaleType.CENTER_CROP;
  private int HB;
  private int HC;
  private BitmapShader Hv;
  private final Matrix Hw;
  private float hIW;
  private int hIX;
  private final Paint hIY;
  private boolean jVl;
  private Bitmap mBitmap;
  private final RectF nog;
  private final RectF noh;
  private final Paint noi;
  private float noj;
  private boolean nok;
  private boolean nol;
  private int qc;
  private ColorFilter uN;

  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112386);
    this.nog = new RectF();
    this.noh = new RectF();
    this.Hw = new Matrix();
    this.noi = new Paint();
    this.hIY = new Paint();
    this.hIX = -16777216;
    this.qc = 0;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.a.CircleImageView, paramInt, 0);
    this.qc = paramContext.getDimensionPixelSize(0, 0);
    this.hIX = paramContext.getColor(1, -16777216);
    this.nol = paramContext.getBoolean(2, false);
    paramContext.recycle();
    super.setScaleType(nof);
    this.jVl = true;
    if (this.nok)
    {
      setup();
      this.nok = false;
    }
    AppMethodBeat.o(112386);
  }

  private void bFL()
  {
    AppMethodBeat.i(112402);
    this.Hw.set(null);
    float f1;
    float f2;
    float f3;
    if (this.HB * this.nog.height() > this.nog.width() * this.HC)
    {
      f1 = this.nog.height() / this.HC;
      f2 = (this.nog.width() - this.HB * f1) * 0.5F;
      f3 = 0.0F;
    }
    while (true)
    {
      this.Hw.setScale(f1, f1);
      this.Hw.postTranslate((int)(f2 + 0.5F) + this.nog.left, (int)(f3 + 0.5F) + this.nog.top);
      this.Hv.setLocalMatrix(this.Hw);
      AppMethodBeat.o(112402);
      return;
      f1 = this.nog.width() / this.HB;
      f3 = (this.nog.height() - this.HC * f1) * 0.5F;
      f2 = 0.0F;
    }
  }

  private static Bitmap s(Drawable paramDrawable)
  {
    Object localObject = null;
    AppMethodBeat.i(112400);
    if (paramDrawable == null)
    {
      AppMethodBeat.o(112400);
      paramDrawable = localObject;
    }
    while (true)
    {
      return paramDrawable;
      if ((paramDrawable instanceof BitmapDrawable))
      {
        paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
        AppMethodBeat.o(112400);
      }
      else
      {
        try
        {
          if ((paramDrawable instanceof ColorDrawable));
          for (Bitmap localBitmap = Bitmap.createBitmap(2, 2, fdG); ; localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), fdG))
          {
            Canvas localCanvas = new android/graphics/Canvas;
            localCanvas.<init>(localBitmap);
            paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
            paramDrawable.draw(localCanvas);
            AppMethodBeat.o(112400);
            paramDrawable = localBitmap;
            break;
          }
        }
        catch (OutOfMemoryError paramDrawable)
        {
          AppMethodBeat.o(112400);
          paramDrawable = localObject;
        }
      }
    }
  }

  private void setup()
  {
    AppMethodBeat.i(112401);
    if (!this.jVl)
    {
      this.nok = true;
      AppMethodBeat.o(112401);
    }
    while (true)
    {
      return;
      if (this.mBitmap == null)
      {
        AppMethodBeat.o(112401);
      }
      else
      {
        Bitmap localBitmap = this.mBitmap;
        Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
        this.Hv = new BitmapShader(localBitmap, localTileMode, localTileMode);
        this.noi.setAntiAlias(true);
        this.noi.setShader(this.Hv);
        this.hIY.setStyle(Paint.Style.STROKE);
        this.hIY.setAntiAlias(true);
        this.hIY.setColor(this.hIX);
        this.hIY.setStrokeWidth(this.qc);
        this.HC = this.mBitmap.getHeight();
        this.HB = this.mBitmap.getWidth();
        this.noh.set(0.0F, 0.0F, getWidth(), getHeight());
        this.hIW = Math.min((this.noh.height() - this.qc) / 2.0F, (this.noh.width() - this.qc) / 2.0F);
        this.nog.set(this.noh);
        if (!this.nol)
          this.nog.inset(this.qc, this.qc);
        this.noj = Math.min(this.nog.height() / 2.0F, this.nog.width() / 2.0F);
        bFL();
        invalidate();
        AppMethodBeat.o(112401);
      }
    }
  }

  public int getBorderColor()
  {
    return this.hIX;
  }

  public int getBorderWidth()
  {
    return this.qc;
  }

  public ImageView.ScaleType getScaleType()
  {
    return nof;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112389);
    if (getDrawable() == null)
      AppMethodBeat.o(112389);
    while (true)
    {
      return;
      paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.noj, this.noi);
      if (this.qc != 0)
        paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.hIW, this.hIY);
      AppMethodBeat.o(112389);
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112390);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    setup();
    AppMethodBeat.o(112390);
  }

  public void setAdjustViewBounds(boolean paramBoolean)
  {
    AppMethodBeat.i(112388);
    if (paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("adjustViewBounds not supported.");
      AppMethodBeat.o(112388);
      throw localIllegalArgumentException;
    }
    AppMethodBeat.o(112388);
  }

  public void setBorderColor(int paramInt)
  {
    AppMethodBeat.i(112391);
    if (paramInt == this.hIX)
      AppMethodBeat.o(112391);
    while (true)
    {
      return;
      this.hIX = paramInt;
      this.hIY.setColor(this.hIX);
      invalidate();
      AppMethodBeat.o(112391);
    }
  }

  public void setBorderColorResource(int paramInt)
  {
    AppMethodBeat.i(112392);
    setBorderColor(getContext().getResources().getColor(paramInt));
    AppMethodBeat.o(112392);
  }

  public void setBorderOverlay(boolean paramBoolean)
  {
    AppMethodBeat.i(112394);
    if (paramBoolean == this.nol)
      AppMethodBeat.o(112394);
    while (true)
    {
      return;
      this.nol = paramBoolean;
      setup();
      AppMethodBeat.o(112394);
    }
  }

  public void setBorderWidth(int paramInt)
  {
    AppMethodBeat.i(112393);
    if (paramInt == this.qc)
      AppMethodBeat.o(112393);
    while (true)
    {
      return;
      this.qc = paramInt;
      setup();
      AppMethodBeat.o(112393);
    }
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(112399);
    if (paramColorFilter == this.uN)
      AppMethodBeat.o(112399);
    while (true)
    {
      return;
      this.uN = paramColorFilter;
      this.noi.setColorFilter(this.uN);
      invalidate();
      AppMethodBeat.o(112399);
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(112395);
    super.setImageBitmap(paramBitmap);
    this.mBitmap = paramBitmap;
    setup();
    AppMethodBeat.o(112395);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(112396);
    super.setImageDrawable(paramDrawable);
    this.mBitmap = s(paramDrawable);
    setup();
    AppMethodBeat.o(112396);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(112397);
    super.setImageResource(paramInt);
    this.mBitmap = s(getDrawable());
    setup();
    AppMethodBeat.o(112397);
  }

  public void setImageURI(Uri paramUri)
  {
    AppMethodBeat.i(112398);
    super.setImageURI(paramUri);
    this.mBitmap = s(getDrawable());
    setup();
    AppMethodBeat.o(112398);
  }

  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    AppMethodBeat.i(112387);
    if (paramScaleType != nof)
    {
      paramScaleType = new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] { paramScaleType }));
      AppMethodBeat.o(112387);
      throw paramScaleType;
    }
    AppMethodBeat.o(112387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.CircleImageView
 * JD-Core Version:    0.6.2
 */