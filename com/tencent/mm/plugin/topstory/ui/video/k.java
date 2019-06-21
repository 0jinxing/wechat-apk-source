package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.ui.a;

public final class k
{
  int JB;
  float hXK;
  private float iaA;
  int iaB;
  int iaC;
  Runnable iaD;
  View iaw;
  private GestureDetector iay;
  Context mContext;
  k.a sEC;
  c sED;
  boolean sEE;
  boolean sEF;

  public k(Context paramContext, View paramView, c paramc)
  {
    AppMethodBeat.i(1739);
    this.sEC = k.a.sEH;
    this.hXK = 0.0F;
    this.JB = 0;
    this.iaA = 0.0F;
    this.iaB = -1;
    this.iaC = 0;
    this.iaD = new k.1(this);
    this.mContext = paramContext;
    this.sED = paramc;
    this.iaw = paramView;
    this.iay = new GestureDetector(this.mContext, new k.2(this));
    this.hXK = a.cN(paramContext);
    AppMethodBeat.o(1739);
  }

  public final void aFY()
  {
    this.iaB = -1;
    this.iaC = 0;
    this.iaA = 0.0F;
  }

  public final void z(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(1740);
    if (!this.sED.cGl())
    {
      this.sEC = k.a.sEH;
      AppMethodBeat.o(1740);
      return;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
    {
      this.iaA = paramMotionEvent.getRawX();
      this.JB = ((AudioManager)this.mContext.getSystemService("audio")).getStreamVolume(3);
      this.hXK = a.cN(this.mContext);
    }
    this.iay.onTouchEvent(paramMotionEvent);
    if ((i == 1) || (i == 3))
    {
      if (this.sEC != k.a.sEK)
        break label162;
      c localc = this.sED;
      i = this.iaC;
      paramMotionEvent.getRawX();
      localc.FF(i);
      this.iaB = -1;
      this.iaC = 0;
      this.iaA = 0.0F;
    }
    while (true)
    {
      this.sEC = k.a.sEH;
      AppMethodBeat.o(1740);
      break;
      label162: if (this.sEC == k.a.sEI)
        ((AudioManager)this.mContext.getSystemService("audio")).getStreamMaxVolume(3);
      else
        paramMotionEvent = k.a.sEJ;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.k
 * JD-Core Version:    0.6.2
 */