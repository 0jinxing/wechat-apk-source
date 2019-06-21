package com.tencent.xweb.extension.video;

import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  a ANs;
  boolean ANt;
  float ANu;
  float Yn;
  ImageView hZC;
  ImageView qyl;
  ImageView qym;
  private ImageView qyn;
  float ztc;

  public c(FrameLayout paramFrameLayout, a parama)
  {
    AppMethodBeat.i(84565);
    this.hZC = null;
    this.qyn = null;
    this.ANt = false;
    this.ztc = 0.0F;
    this.ANs = parama;
    this.qyl = ((ImageView)paramFrameLayout.findViewById(2131821425));
    this.hZC = ((ImageView)paramFrameLayout.findViewById(2131821424));
    this.qym = ((ImageView)paramFrameLayout.findViewById(2131821423));
    this.qyn = ((ImageView)paramFrameLayout.findViewById(2131821426));
    this.qyn.setOnTouchListener(new c.1(this));
    AppMethodBeat.o(84565);
  }

  public final void c(float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(84566);
    if ((this.ANt) && (!paramBoolean))
    {
      AppMethodBeat.o(84566);
      return;
    }
    float f;
    if (paramFloat < 0.0F)
      f = 0.0F;
    while (true)
    {
      this.Yn = f;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyn.getLayoutParams();
      localLayoutParams.leftMargin = ((int)(f / 100.0F * this.qym.getWidth() - this.qyn.getWidth() / 2));
      this.qyn.setLayoutParams(localLayoutParams);
      this.qyn.requestLayout();
      localLayoutParams = (FrameLayout.LayoutParams)this.qyl.getLayoutParams();
      localLayoutParams.width = ((int)(f / 100.0F * this.qym.getWidth()));
      this.qyl.setLayoutParams(localLayoutParams);
      this.qyl.requestLayout();
      AppMethodBeat.o(84566);
      break;
      f = paramFloat;
      if (paramFloat > 100.0F)
        f = 100.0F;
    }
  }

  public static abstract interface a
  {
    public abstract void aFw();

    public abstract void bw(float paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.c
 * JD-Core Version:    0.6.2
 */