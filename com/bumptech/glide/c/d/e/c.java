package com.bumptech.glide.c.d.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.b.a;
import com.bumptech.glide.c.m;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class c extends Drawable
  implements Animatable, g.b
{
  boolean aBU;
  final c.a aFU;
  private boolean aFV;
  private int aFW;
  private boolean aFX;
  private Paint aFY;
  private Rect aFZ;
  private int ayk;
  private boolean isRunning;
  private boolean isVisible;

  public c(Context paramContext, a parama, m<Bitmap> paramm, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    this(new c.a(new g(com.bumptech.glide.c.ae(paramContext), parama, paramInt1, paramInt2, paramm, paramBitmap)));
    AppMethodBeat.i(92315);
    AppMethodBeat.o(92315);
  }

  c(c.a parama)
  {
    AppMethodBeat.i(92316);
    this.isVisible = true;
    this.aFW = -1;
    this.aFU = ((c.a)i.d(parama, "Argument must not be null"));
    AppMethodBeat.o(92316);
  }

  private Paint getPaint()
  {
    AppMethodBeat.i(92330);
    if (this.aFY == null)
      this.aFY = new Paint(2);
    Paint localPaint = this.aFY;
    AppMethodBeat.o(92330);
    return localPaint;
  }

  private void nA()
  {
    AppMethodBeat.i(92321);
    this.isRunning = false;
    this.aFU.aGa.b(this);
    AppMethodBeat.o(92321);
  }

  private Rect nB()
  {
    AppMethodBeat.i(92329);
    if (this.aFZ == null)
      this.aFZ = new Rect();
    Rect localRect = this.aFZ;
    AppMethodBeat.o(92329);
    return localRect;
  }

  private void nz()
  {
    AppMethodBeat.i(92320);
    boolean bool;
    if (!this.aBU)
    {
      bool = true;
      i.b(bool, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
      if (this.aFU.aGa.getFrameCount() != 1)
        break label49;
      invalidateSelf();
      AppMethodBeat.o(92320);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label49: if (!this.isRunning)
      {
        this.isRunning = true;
        this.aFU.aGa.a(this);
        invalidateSelf();
      }
      AppMethodBeat.o(92320);
    }
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(92326);
    if (this.aBU)
      AppMethodBeat.o(92326);
    while (true)
    {
      return;
      if (this.aFX)
      {
        Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), nB());
        this.aFX = false;
      }
      paramCanvas.drawBitmap(this.aFU.aGa.nD(), null, nB(), getPaint());
      AppMethodBeat.o(92326);
    }
  }

  public final ByteBuffer getBuffer()
  {
    AppMethodBeat.i(92317);
    ByteBuffer localByteBuffer = this.aFU.aGa.aGb.getData().asReadOnlyBuffer();
    AppMethodBeat.o(92317);
    return localByteBuffer;
  }

  public Drawable.ConstantState getConstantState()
  {
    return this.aFU;
  }

  public int getIntrinsicHeight()
  {
    AppMethodBeat.i(92324);
    int i = this.aFU.aGa.nD().getHeight();
    AppMethodBeat.o(92324);
    return i;
  }

  public int getIntrinsicWidth()
  {
    AppMethodBeat.i(92323);
    int i = this.aFU.aGa.nD().getWidth();
    AppMethodBeat.o(92323);
    return i;
  }

  public int getOpacity()
  {
    return -2;
  }

  public boolean isRunning()
  {
    return this.isRunning;
  }

  public final void nC()
  {
    AppMethodBeat.i(92331);
    for (Object localObject = getCallback(); (localObject instanceof Drawable); localObject = ((Drawable)localObject).getCallback());
    if (localObject == null)
    {
      stop();
      invalidateSelf();
      AppMethodBeat.o(92331);
      return;
    }
    invalidateSelf();
    localObject = this.aFU.aGa;
    if (((g)localObject).aGf != null);
    for (int i = ((g)localObject).aGf.index; ; i = -1)
    {
      if (i == this.aFU.aGa.getFrameCount() - 1)
        this.ayk += 1;
      if ((this.aFW != -1) && (this.ayk >= this.aFW))
        stop();
      AppMethodBeat.o(92331);
      break;
    }
  }

  public final Bitmap ny()
  {
    return this.aFU.aGa.aGi;
  }

  protected void onBoundsChange(Rect paramRect)
  {
    AppMethodBeat.i(92325);
    super.onBoundsChange(paramRect);
    this.aFX = true;
    AppMethodBeat.o(92325);
  }

  public void setAlpha(int paramInt)
  {
    AppMethodBeat.i(92327);
    getPaint().setAlpha(paramInt);
    AppMethodBeat.o(92327);
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(92328);
    getPaint().setColorFilter(paramColorFilter);
    AppMethodBeat.o(92328);
  }

  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(92322);
    boolean bool;
    if (!this.aBU)
    {
      bool = true;
      i.b(bool, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
      this.isVisible = paramBoolean1;
      if (paramBoolean1)
        break label52;
      nA();
    }
    while (true)
    {
      paramBoolean1 = super.setVisible(paramBoolean1, paramBoolean2);
      AppMethodBeat.o(92322);
      return paramBoolean1;
      bool = false;
      break;
      label52: if (this.aFV)
        nz();
    }
  }

  public void start()
  {
    AppMethodBeat.i(92318);
    this.aFV = true;
    this.ayk = 0;
    if (this.isVisible)
      nz();
    AppMethodBeat.o(92318);
  }

  public void stop()
  {
    AppMethodBeat.i(92319);
    this.aFV = false;
    nA();
    AppMethodBeat.o(92319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.c
 * JD-Core Version:    0.6.2
 */