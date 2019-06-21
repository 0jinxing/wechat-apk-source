package com.tencent.mm.plugin.appbrand.luggage.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.plugin.gif.MMAnimateView;

public final class l$a extends FrameLayout
  implements a
{
  private ImageView ikh;
  private MMAnimateView iki;
  private boolean ikj;

  public l$a(l paraml, Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(132104);
    this.iki = new MMAnimateView(paramContext);
    addView(this.iki, new ViewGroup.LayoutParams(-1, -1));
    this.iki.setVisibility(8);
    this.ikh = new ImageView(paramContext);
    addView(this.ikh, new ViewGroup.LayoutParams(-1, -1));
    this.ikh.setVisibility(8);
    AppMethodBeat.o(132104);
  }

  public final boolean aCH()
  {
    return this.ikj;
  }

  public final View getView()
  {
    return this;
  }

  public final void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(132107);
    this.iki.setVisibility(8);
    this.ikh.setVisibility(0);
    this.ikh.setImageBitmap(paramBitmap);
    AppMethodBeat.o(132107);
  }

  public final void setImageByteArray(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(132106);
    this.iki.setVisibility(0);
    this.ikh.setVisibility(8);
    this.iki.f(paramArrayOfByte, "");
    AppMethodBeat.o(132106);
  }

  public final void setImageFilePath(String paramString)
  {
    AppMethodBeat.i(132105);
    this.iki.setVisibility(0);
    this.ikh.setVisibility(8);
    this.iki.setImageFilePath(paramString);
    AppMethodBeat.o(132105);
  }

  public final void setInterceptEvent(boolean paramBoolean)
  {
    this.ikj = paramBoolean;
  }

  public final void setScaleType(ImageView.ScaleType paramScaleType)
  {
    AppMethodBeat.i(132108);
    this.ikh.setScaleType(paramScaleType);
    this.iki.setScaleType(paramScaleType);
    AppMethodBeat.o(132108);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.l.a
 * JD-Core Version:    0.6.2
 */