package com.tencent.mm.plugin.appbrand.widget.i;

import android.graphics.Bitmap;
import com.tencent.mm.plugin.appbrand.q;

public abstract class d
{
  q hwf;
  int index = -1;
  String jpu;
  c jpv;
  d.a jpw;
  protected volatile e jpx;

  public d(String paramString, c paramc)
  {
    this.jpu = paramString;
    this.jpv = paramc;
  }

  public d(String paramString, c paramc, q paramq)
  {
    this.jpu = paramString;
    this.hwf = paramq;
    this.jpv = paramc;
  }

  protected final void I(Bitmap paramBitmap)
  {
    e locale = this.jpx;
    if (locale != null)
      locale.a(paramBitmap, this);
  }

  public final void a(d.a parama)
  {
    this.jpw = parama;
  }

  public final void a(e parame)
  {
    this.jpx = parame;
  }

  public abstract void aSg();

  public final String aSh()
  {
    if ((this.jpu == null) || (this.jpu.isEmpty()));
    for (String str = null; ; str = this.jpu)
      return str;
  }

  public final void cancel()
  {
    this.jpx = null;
  }

  public final void setIndex(int paramInt)
  {
    this.index = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.d
 * JD-Core Version:    0.6.2
 */