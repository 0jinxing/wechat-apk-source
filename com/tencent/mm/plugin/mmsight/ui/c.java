package com.tencent.mm.plugin.mmsight.ui;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class c
{
  boolean cFy;
  private int duration;
  float end;
  long eyR;
  ap fJs;
  private float oCe;
  float oCf;
  c.a oCg;
  private Runnable oCh;
  private float start;

  public c(float paramFloat1, float paramFloat2, int paramInt)
  {
    AppMethodBeat.i(55178);
    this.fJs = null;
    this.oCe = 0.0F;
    this.oCh = new c.2(this);
    this.start = paramFloat1;
    this.end = paramFloat2;
    this.duration = paramInt;
    if (paramFloat2 > paramFloat1)
      this.oCe = ((paramFloat2 - paramFloat1) / this.duration * 20.0F);
    ab.i("MicroMsg.ProgressHandlerAnimator", "create ProgressHandlerAnimator, start: %s, end: %s, duration: %s, updateStep: %s", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt), Float.valueOf(this.oCe) });
    this.cFy = false;
    this.eyR = 0L;
    this.fJs = new ap(Looper.getMainLooper(), new c.1(this), true);
    AppMethodBeat.o(55178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.c
 * JD-Core Version:    0.6.2
 */