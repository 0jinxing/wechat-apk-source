package com.tencent.mm.e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cache.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.d;
import com.tencent.mm.y.d.a;
import com.tencent.mm.y.d.b;
import java.util.LinkedList;

public final class f extends b<g>
{
  private float ati;
  private float atj;
  private boolean cjF;
  private float cjG;
  private float cjH;
  private boolean ckd;
  private Bitmap ckr;
  private LinkedList<d.b> cks;
  public d.a ckt;
  private Path vr;

  public f()
  {
    AppMethodBeat.i(116198);
    this.ckd = true;
    this.cjF = false;
    this.vr = new Path();
    this.cks = new LinkedList();
    this.ckt = d.a.eHy;
    AppMethodBeat.o(116198);
  }

  public final a CG()
  {
    return a.ciX;
  }

  public final void CH()
  {
    AppMethodBeat.i(116204);
    if ((CM() != null) && (!CM().isRecycled()))
      CM().recycle();
    o(((g)CI()).Jl());
    AppMethodBeat.o(116204);
  }

  public final void bk(boolean paramBoolean)
  {
    AppMethodBeat.i(116203);
    super.bk(paramBoolean);
    ((g)CI()).p(CM());
    AppMethodBeat.o(116203);
  }

  public final boolean o(MotionEvent paramMotionEvent)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(116202);
    if (!CN())
    {
      AppMethodBeat.o(116202);
      return bool;
    }
    Object localObject = A(paramMotionEvent.getX(), paramMotionEvent.getY());
    switch (paramMotionEvent.getActionMasked())
    {
    case 3:
    case 4:
    default:
    case 0:
    case 1:
    case 5:
    case 2:
    }
    while (true)
    {
      bool = this.ckd;
      AppMethodBeat.o(116202);
      break;
      float f1;
      if (this.cje.contains((int)localObject[0], (int)localObject[1]))
      {
        f1 = localObject[0];
        this.cjG = f1;
        this.ati = f1;
        f1 = localObject[1];
        this.cjH = f1;
        this.atj = f1;
      }
      for (this.ckd = true; ; this.ckd = false)
      {
        this.cjF = false;
        break;
      }
      if ((this.ckd) && (this.cjF))
      {
        if (this.ckt != d.a.eHy)
          break label272;
        ((g)CI()).a(new d(this.ckt, new Path(this.vr), 1.0F / getScale(), this.ckr));
        bk(false);
      }
      while (true)
      {
        CQ();
        this.cks.clear();
        this.vr.reset();
        this.cjF = false;
        this.ckd = false;
        break;
        label272: if (this.ckt == d.a.eHz)
        {
          ((g)CI()).a(new d(this.ckt, new LinkedList(this.cks), 1.0F / getScale()));
          bk(false);
        }
      }
      if ((this.ckd) && (this.cjF))
      {
        this.cjG = this.ati;
        this.cjH = this.atj;
        this.ati = localObject[0];
        this.atj = localObject[1];
        if (this.ckt == d.a.eHy)
          this.vr.quadTo(this.cjG, this.cjH, (this.ati + this.cjG) / 2.0F, (this.atj + this.cjH) / 2.0F);
        while (this.ckt != d.a.eHz)
        {
          CP();
          break;
        }
        double d = Math.toDegrees(Math.atan((this.ati - this.cjG) / (this.atj - this.cjH)));
        label481: float f2;
        float f3;
        float f4;
        if (getRotation() == 180.0F)
        {
          j = 180;
          f2 = (float)(j + d);
          paramMotionEvent = this.cks;
          f1 = 1.0F / getScale();
          f3 = this.ati;
          f4 = this.atj;
          localObject = this.cjc.dlV();
          if ((localObject != null) && (f3 < ((Bitmap)localObject).getWidth()) && (f4 < ((Bitmap)localObject).getHeight()) && (f3 > 0.0F) && (f4 > 0.0F))
            break label637;
          ab.w("MicroMsg.MosaicArtist", "[getPosColor] X:%s,Y:%s", new Object[] { Float.valueOf(f3), Float.valueOf(f4) });
        }
        label637: for (int j = i; ; j = ((Bitmap)localObject).getPixel((int)f3, (int)f4))
        {
          paramMotionEvent.add(new d.b(f1, j, f2 % 360.0F, this.ati, this.atj));
          break;
          j = 0;
          break label481;
        }
      }
      if ((this.ckd) && (!this.cjF))
      {
        if (this.ckt == d.a.eHy)
          this.vr.moveTo(localObject[0], localObject[1]);
        this.cjF = true;
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116200);
    super.onDestroy();
    if ((this.ckr != null) && (!this.ckr.isRecycled()))
      this.ckr.recycle();
    AppMethodBeat.o(116200);
  }

  public final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116201);
    paramCanvas.save();
    paramCanvas.clipRect(this.cje);
    if (this.ckt == d.a.eHy)
    {
      a(paramCanvas);
      new d(this.ckt, this.vr, 1.0F / getScale(), this.ckr).draw(paramCanvas);
    }
    while (true)
    {
      paramCanvas.restore();
      AppMethodBeat.o(116201);
      return;
      if (this.ckt == d.a.eHz)
      {
        new d(this.ckt, new LinkedList(this.cks), 1.0F / getScale()).draw(new Canvas(CM()));
        a(paramCanvas);
      }
    }
  }

  public final void zC()
  {
    AppMethodBeat.i(116199);
    super.zC();
    o(((g)CI()).Jl());
    Bitmap localBitmap1 = this.cjc.dlV();
    if (localBitmap1 == null)
    {
      ab.e("MicroMsg.MosaicArtist", "[generateMosaicImage] bitmap is null");
      localBitmap2 = null;
      this.ckr = localBitmap2;
      AppMethodBeat.o(116199);
      return;
    }
    int i = localBitmap1.getWidth();
    int j = localBitmap1.getHeight();
    int k = com.tencent.mm.ch.a.bu(6.0F);
    Bitmap localBitmap2 = Bitmap.createBitmap(i, j, Bitmap.Config.RGB_565);
    Canvas localCanvas = new Canvas(localBitmap2);
    int m = (int)Math.ceil(i / k);
    int n = (int)Math.ceil(j / k);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    int i1 = 0;
    label144: int i2;
    label154: int i3;
    int i4;
    int i5;
    if (i1 < m)
    {
      i2 = 0;
      if (i2 < n)
      {
        i3 = k * i1;
        i4 = k * i2;
        i5 = i3 + k;
        if (i5 <= i)
          break label271;
        i5 = i;
      }
    }
    label271: 
    while (true)
    {
      int i6 = i4 + k;
      int i7 = i6;
      if (i6 > j)
        i7 = j;
      i6 = localBitmap1.getPixel(i3, i4);
      Rect localRect = new Rect(i3, i4, i5, i7);
      localPaint.setColor(i6);
      localCanvas.drawRect(localRect, localPaint);
      i2++;
      break label154;
      i1++;
      break label144;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.f
 * JD-Core Version:    0.6.2
 */