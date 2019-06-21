package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.p;
import com.tencent.mm.ui.statusbar.b;

public final class g extends b
  implements q
{
  private final i gPI;
  private final Bitmap iIr;

  public g(Context paramContext, i parami, Bitmap paramBitmap)
  {
    super(paramContext);
    AppMethodBeat.i(133090);
    this.iIr = paramBitmap;
    this.gPI = parami;
    setupFullscreen(p.k(this.gPI));
    qM(true);
    setBackground(new BitmapDrawable(getResources(), paramBitmap));
    paramContext = LayoutInflater.from(paramContext).inflate(2130968735, this, false);
    addView(paramContext, new FrameLayout.LayoutParams(-2, -2, 17));
    ((TextView)paramContext.findViewById(2131820678)).setText(2131296692);
    paramContext.findViewById(2131821371).setVisibility(8);
    AppMethodBeat.o(133090);
  }

  private void setupFullscreen(boolean paramBoolean)
  {
    AppMethodBeat.i(133091);
    n.q(getContext(), paramBoolean);
    AppMethodBeat.o(133091);
  }

  public final void aHS()
  {
    AppMethodBeat.i(133092);
    post(new g.1(this));
    AppMethodBeat.o(133092);
  }

  public final void aHT()
  {
  }

  public final void cz(String paramString1, String paramString2)
  {
  }

  public final View getView()
  {
    return this;
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(133093);
    super.onDetachedFromWindow();
    this.iIr.recycle();
    AppMethodBeat.o(133093);
  }

  public final void setProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.g
 * JD-Core Version:    0.6.2
 */