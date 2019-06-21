package com.tencent.mm.plugin.appbrand.ui.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.l;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.sdk.platformtools.d;

public final class a
  implements b.f
{
  private final int eop;
  private final int eor;
  private final int eos;

  public a(int paramInt1, int paramInt2)
  {
    this.eop = paramInt1;
    this.eor = paramInt2;
    this.eos = -1;
  }

  public final String wP()
  {
    return "WxaNearbyShowcaseIcon";
  }

  public final Bitmap y(Bitmap paramBitmap)
  {
    AppMethodBeat.i(93769);
    paramBitmap = d.a(paramBitmap, false, paramBitmap.getWidth() / 2, false);
    Object localObject = Bitmap.createScaledBitmap(paramBitmap, this.eop, this.eop, false);
    if (paramBitmap != localObject)
      l.Xf().v(paramBitmap);
    Bitmap localBitmap = Bitmap.createBitmap(this.eop + this.eor * 2, this.eop + this.eor * 2, Bitmap.Config.ARGB_8888);
    paramBitmap = new Canvas(localBitmap);
    paramBitmap.drawBitmap((Bitmap)localObject, this.eor, this.eor, new Paint());
    l.Xf().v((Bitmap)localObject);
    localObject = new Paint();
    ((Paint)localObject).setColor(this.eos);
    ((Paint)localObject).setAntiAlias(true);
    ((Paint)localObject).setStyle(Paint.Style.STROKE);
    ((Paint)localObject).setStrokeWidth(this.eor);
    paramBitmap.drawCircle(this.eop / 2 + this.eor, this.eop / 2 + this.eor, this.eop / 2, (Paint)localObject);
    AppMethodBeat.o(93769);
    return localBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.widget.a
 * JD-Core Version:    0.6.2
 */