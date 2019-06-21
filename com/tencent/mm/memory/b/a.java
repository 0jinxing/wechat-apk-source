package com.tencent.mm.memory.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.i;
import com.tencent.mm.memory.n;
import com.tencent.mm.sdk.platformtools.ak;

public class a extends Drawable
  implements i
{
  boolean DEBUG;
  protected final Paint feO;
  private final ak feP;
  protected n feQ;
  private Runnable feR;
  protected String tag;

  public a(String paramString, n paramn)
  {
    AppMethodBeat.i(115476);
    this.feO = new Paint();
    this.DEBUG = false;
    this.feR = new a.1(this);
    this.tag = paramString;
    this.feQ = paramn;
    this.feO.setAntiAlias(true);
    this.feO.setFilterBitmap(false);
    this.feO.setColor(-1118482);
    this.feP = new ak(Looper.getMainLooper());
    AppMethodBeat.o(115476);
  }

  public final void Xd()
  {
    AppMethodBeat.i(115478);
    if (this.feQ != null)
      this.feQ.Xd();
    AppMethodBeat.o(115478);
  }

  public final void Xe()
  {
    AppMethodBeat.i(115479);
    if (this.feQ != null)
      this.feQ.Xe();
    AppMethodBeat.o(115479);
  }

  public final n Xx()
  {
    if (this.feQ != null);
    for (n localn = this.feQ; ; localn = null)
      return localn;
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(115477);
    Rect localRect = getBounds();
    n localn = this.feQ;
    if ((localn == null) || (localn.isRecycled()))
    {
      paramCanvas.drawColor(-1118482);
      AppMethodBeat.o(115477);
    }
    while (true)
    {
      return;
      Paint localPaint = this.feO;
      paramCanvas.drawBitmap(localn.bitmap, null, localRect, localPaint);
      AppMethodBeat.o(115477);
    }
  }

  public int getIntrinsicHeight()
  {
    int i = 0;
    AppMethodBeat.i(115481);
    if (this.feQ == null)
      AppMethodBeat.o(115481);
    while (true)
    {
      return i;
      n localn = this.feQ;
      if ((localn != null) && (!localn.isRecycled()))
      {
        i = localn.bitmap.getHeight();
        AppMethodBeat.o(115481);
      }
      else
      {
        AppMethodBeat.o(115481);
      }
    }
  }

  public int getIntrinsicWidth()
  {
    int i = 0;
    AppMethodBeat.i(115480);
    if (this.feQ == null)
      AppMethodBeat.o(115480);
    while (true)
    {
      return i;
      n localn = this.feQ;
      if ((localn != null) && (!localn.isRecycled()))
      {
        i = localn.bitmap.getWidth();
        AppMethodBeat.o(115480);
      }
      else
      {
        AppMethodBeat.o(115480);
      }
    }
  }

  public int getOpacity()
  {
    return 0;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }

  public String toString()
  {
    AppMethodBeat.i(115482);
    String str2;
    if (this.DEBUG)
    {
      String str1 = super.toString() + " code: " + hashCode();
      str2 = str1;
      if (this.feQ != null)
        str2 = str1 + this.feQ;
      AppMethodBeat.o(115482);
    }
    while (true)
    {
      return str2;
      str2 = super.toString();
      AppMethodBeat.o(115482);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.b.a
 * JD-Core Version:    0.6.2
 */