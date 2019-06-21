package com.tencent.mm.svg.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.svg.b.d;

public final class c extends b
{
  private a ydc;

  public c(Picture paramPicture, int paramInt)
  {
  }

  public final void draw(Canvas paramCanvas)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(70093);
    long l1 = com.tencent.mm.svg.b.b.dvM();
    while (true)
    {
      Object localObject1;
      long l2;
      try
      {
        if (!paramCanvas.isHardwareAccelerated())
          break label388;
        if (this.ydc.ydd == null)
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "Must not go here! %s", new Object[] { Integer.valueOf(this.ycT) });
          if ((this.ydc.yde != null) && (!this.ydc.yde.isRecycled()))
            break label361;
          i = 0;
          localObject1 = dvH();
          Object localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = a.w(this);
            eC((View)localObject2);
          }
          a.b((View)localObject2, this.ycV);
          if (i != 0)
            break label499;
          if ((!paramCanvas.isHardwareAccelerated()) || (Build.VERSION.SDK_INT >= 16))
            break label462;
          com.tencent.mm.svg.b.c.i("MicroMsg.SVGPictureDrawable", "Skip this draw.", new Object[0]);
          return;
        }
        l2 = System.nanoTime();
        if ((this.ydc.yde != null) && (!this.ydc.yde.isRecycled()))
          continue;
        if ((getIntrinsicWidth() > 2048) || (getIntrinsicHeight() > 2048))
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "This drawable is too big. %s", new Object[] { Integer.valueOf(this.ycT) });
          continue;
        }
      }
      finally
      {
        this.mDuration = com.tencent.mm.svg.b.b.mW(l1);
        d.dvO();
        m(paramCanvas);
        AppMethodBeat.o(70093);
      }
      if ((getIntrinsicWidth() <= 0) || (getIntrinsicHeight() <= 0))
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "width and height must > 0.", new Object[0]);
      }
      else
      {
        localObject1 = Bitmap.createBitmap(getIntrinsicWidth(), getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Object localObject4 = new android/graphics/Canvas;
        ((Canvas)localObject4).<init>((Bitmap)localObject1);
        this.ydc.ydd.draw((Canvas)localObject4);
        this.ydc.yde = ((Bitmap)localObject1);
        com.tencent.mm.svg.b.b.mW(l2);
        d.dvN();
        m((Canvas)localObject4);
        continue;
        label361: dvF();
        paramCanvas.drawBitmap(this.ydc.yde, null, this.Hx, this.ycV);
        continue;
        label388: i = j;
        if (this.ydc.yde != null)
        {
          i = j;
          if (!this.ydc.yde.isRecycled())
          {
            com.tencent.mm.svg.b.c.i("MicroMsg.SVGPictureDrawable", "recycle bitmap:%s", new Object[] { this.ydc.yde.toString() });
            this.ydc.yde.recycle();
            this.ydc.yde = null;
            i = j;
            continue;
            label462: localObject4 = this.ydc.ydd;
            if (localObject4 != null)
            {
              dvF();
              paramCanvas.save();
              paramCanvas.drawPicture((Picture)localObject4, this.Hx);
              paramCanvas.restore();
            }
            label499: this.mDuration = com.tencent.mm.svg.b.b.mW(l1);
            d.dvO();
            m(paramCanvas);
            AppMethodBeat.o(70093);
          }
        }
      }
    }
  }

  public final Drawable.ConstantState getConstantState()
  {
    return this.ydc;
  }

  public static final class a extends Drawable.ConstantState
  {
    protected int sLo;
    protected Picture ydd;
    protected Bitmap yde;

    public a(Picture paramPicture, int paramInt)
    {
      this.ydd = paramPicture;
      this.sLo = paramInt;
    }

    public final int getChangingConfigurations()
    {
      return 0;
    }

    public final Drawable newDrawable()
    {
      AppMethodBeat.i(70089);
      ab.i("MicroMsg.SVGPictureDrawable", "SVGPictureConstantState newDrawable %s", new Object[] { Integer.valueOf(this.sLo) });
      c localc = new c(this.ydd, this.sLo);
      AppMethodBeat.o(70089);
      return localc;
    }

    public final Drawable newDrawable(Resources paramResources)
    {
      AppMethodBeat.i(70090);
      paramResources = newDrawable();
      AppMethodBeat.o(70090);
      return paramResources;
    }

    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      AppMethodBeat.i(70091);
      paramResources = newDrawable(paramResources);
      AppMethodBeat.o(70091);
      return paramResources;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.a.c
 * JD-Core Version:    0.6.2
 */