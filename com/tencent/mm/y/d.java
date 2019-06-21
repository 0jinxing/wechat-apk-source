package com.tencent.mm.y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ch.a;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;

public final class d
  implements Cloneable
{
  private static int eHv;
  private static Paint eHx;
  private LinkedList<b> cks;
  public d.a ckt;
  private Bitmap eHw;
  private float mScale;
  private Path vr;

  static
  {
    AppMethodBeat.i(116296);
    eHv = a.bu(12.0F);
    Paint localPaint = new Paint();
    eHx = localPaint;
    localPaint.setAntiAlias(true);
    eHx.setStyle(Paint.Style.STROKE);
    eHx.setColor(-16776961);
    eHx.setStrokeCap(Paint.Cap.ROUND);
    AppMethodBeat.o(116296);
  }

  public d(d.a parama, Path paramPath, float paramFloat, Bitmap paramBitmap)
  {
    AppMethodBeat.i(116293);
    this.ckt = parama;
    this.eHw = paramBitmap;
    this.vr = paramPath;
    this.mScale = paramFloat;
    eHx.setStrokeWidth(a.bu(24.0F) * paramFloat);
    AppMethodBeat.o(116293);
  }

  public d(d.a parama, LinkedList<b> paramLinkedList, float paramFloat)
  {
    AppMethodBeat.i(116294);
    this.ckt = parama;
    this.cks = paramLinkedList;
    this.mScale = paramFloat;
    eHx.setStrokeWidth(a.bu(24.0F) * paramFloat);
    AppMethodBeat.o(116294);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116295);
    if (this.ckt == d.a.eHy)
    {
      localObject1 = this.eHw;
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        paramCanvas.saveLayer(0.0F, 0.0F, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), null, 31);
        paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        paramCanvas.drawPath(this.vr, eHx);
        eHx.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paramCanvas.drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, eHx);
        eHx.setXfermode(null);
        paramCanvas.restore();
      }
      AppMethodBeat.o(116295);
    }
    while (true)
    {
      return;
      if (this.ckt != d.a.eHz)
        break label419;
      if (this.cks.size() > 0)
        break;
      AppMethodBeat.o(116295);
    }
    Object localObject1 = (b)this.cks.getLast();
    float f1 = ((b)localObject1).scale;
    int i = ((b)localObject1).color;
    int j = (int)(Math.random() * 100.0D);
    float f2 = eHv * f1;
    Object localObject2 = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
    BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839605, (BitmapFactory.Options)localObject2);
    ((BitmapFactory.Options)localObject2).inSampleSize = a.a((BitmapFactory.Options)localObject2, Math.round(((BitmapFactory.Options)localObject2).outWidth * f1 * 0.7F), Math.round(f1 * ((BitmapFactory.Options)localObject2).outHeight * 0.7F));
    ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
    localObject2 = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839605, (BitmapFactory.Options)localObject2);
    eHx.setStyle(Paint.Style.FILL);
    eHx.setColorFilter(new LightingColorFilter(i, 1));
    float f3;
    if (localObject2 != null)
    {
      f3 = ((b)localObject1).centerX - ((Bitmap)localObject2).getWidth() * 1.0F / 2.0F;
      f1 = ((b)localObject1).centerY - ((Bitmap)localObject2).getHeight() * 1.0F / 2.0F;
    }
    while (true)
    {
      if ((j > 0) && (j <= 20))
      {
        f3 += f2;
        f1 += f2;
      }
      while (true)
      {
        paramCanvas.save();
        paramCanvas.rotate(-((b)localObject1).rotation, ((b)localObject1).centerX, ((b)localObject1).centerY);
        if (localObject2 != null)
          paramCanvas.drawBitmap((Bitmap)localObject2, f3, f1, eHx);
        paramCanvas.restore();
        eHx.setStyle(Paint.Style.STROKE);
        eHx.setColorFilter(null);
        label419: AppMethodBeat.o(116295);
        break;
        if (80 < j)
        {
          f3 -= f2;
          f1 -= f2;
        }
      }
      f1 = 0.0F;
      f3 = 0.0F;
    }
  }

  public static final class b
  {
    public float centerX;
    public float centerY;
    public int color = 0;
    public float rotation = 0.0F;
    public float scale = 0.0F;

    public b(float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      this.scale = paramFloat1;
      this.color = paramInt;
      this.rotation = paramFloat2;
      this.centerX = paramFloat3;
      this.centerY = paramFloat4;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.d
 * JD-Core Version:    0.6.2
 */