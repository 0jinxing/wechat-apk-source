package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.a;

public final class l
{
  int JB;
  float hXK;
  private float iaA;
  int iaB;
  int iaC;
  Runnable iaD;
  View iaw;
  l.a iax;
  private GestureDetector iay;
  l.b iaz;
  Context mContext;

  public l(Context paramContext, View paramView, l.b paramb)
  {
    AppMethodBeat.i(126587);
    this.iax = l.a.iaF;
    this.hXK = 0.0F;
    this.JB = 0;
    this.iaA = 0.0F;
    this.iaB = -1;
    this.iaC = 0;
    this.iaD = new l.1(this);
    this.mContext = paramContext;
    this.iaz = paramb;
    this.iaw = paramView;
    this.iay = new GestureDetector(this.mContext, new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(126582);
        l.this.iaw.removeCallbacks(l.this.iaD);
        l.this.iaz.aFj();
        AppMethodBeat.o(126582);
        return true;
      }

      public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        float f1 = 1.0F;
        float f2 = 0.0F;
        boolean bool = true;
        AppMethodBeat.i(126583);
        if ((paramAnonymousMotionEvent1 == null) || (paramAnonymousMotionEvent2 == null))
          AppMethodBeat.o(126583);
        while (true)
        {
          return bool;
          if (l.this.iax == l.a.iaF)
          {
            if (Math.abs(paramAnonymousFloat1) <= Math.abs(paramAnonymousFloat2))
              break label126;
            l.this.iax = l.a.iaI;
          }
          float f3;
          while (true)
          {
            paramAnonymousFloat1 = paramAnonymousMotionEvent2.getX();
            f3 = paramAnonymousMotionEvent1.getX();
            paramAnonymousFloat2 = paramAnonymousMotionEvent2.getY() - paramAnonymousMotionEvent1.getY();
            paramAnonymousMotionEvent1 = l.this;
            if (paramAnonymousMotionEvent1.iax != l.a.iaI)
              break label232;
            if (paramAnonymousMotionEvent1.iaz.aFp())
              break label173;
            AppMethodBeat.o(126583);
            bool = false;
            break;
            label126: if (paramAnonymousMotionEvent1.getX() < l.this.iaw.getMeasuredWidth() / 2)
              l.this.iax = l.a.iaH;
            else
              l.this.iax = l.a.iaG;
          }
          label173: if (paramAnonymousMotionEvent1.iaB == -1)
          {
            paramAnonymousMotionEvent1.iaz.aFk();
            paramAnonymousMotionEvent1.iaB = paramAnonymousMotionEvent1.iaz.getCurrentPosition();
          }
          paramAnonymousMotionEvent1.iaC = paramAnonymousMotionEvent1.iaz.i(paramAnonymousMotionEvent1.iaB, paramAnonymousFloat1 - f3);
          AppMethodBeat.o(126583);
          continue;
          label232: if (paramAnonymousMotionEvent1.iax != l.a.iaH)
            break label395;
          if (paramAnonymousMotionEvent1.iaz.aFn())
            break;
          AppMethodBeat.o(126583);
          bool = false;
        }
        paramAnonymousFloat1 = -1.0F * paramAnonymousFloat2 / paramAnonymousMotionEvent1.iaw.getMeasuredHeight() * 1.2F + paramAnonymousMotionEvent1.hXK;
        if (paramAnonymousFloat1 < 0.0F)
          paramAnonymousFloat1 = f2;
        label297: label595: label598: 
        while (true)
        {
          paramAnonymousMotionEvent2 = paramAnonymousMotionEvent1.mContext;
          if ((paramAnonymousMotionEvent2 instanceof Activity))
          {
            if (paramAnonymousFloat1 >= 0.01F)
              break label379;
            paramAnonymousFloat2 = 0.01F;
          }
          while (true)
          {
            Activity localActivity = (Activity)paramAnonymousMotionEvent2;
            paramAnonymousMotionEvent2 = localActivity.getWindow().getAttributes();
            paramAnonymousMotionEvent2.screenBrightness = paramAnonymousFloat2;
            localActivity.getWindow().setAttributes(paramAnonymousMotionEvent2);
            paramAnonymousMotionEvent1.iaz.ar(paramAnonymousFloat1);
            AppMethodBeat.o(126583);
            break;
            if (paramAnonymousFloat1 <= 1.0F)
              break label598;
            paramAnonymousFloat1 = 1.0F;
            break label297;
            label379: paramAnonymousFloat2 = f1;
            if (paramAnonymousFloat1 <= 1.0F)
              paramAnonymousFloat2 = paramAnonymousFloat1;
          }
          int i;
          int j;
          if (paramAnonymousMotionEvent1.iax == l.a.iaG)
          {
            if (!paramAnonymousMotionEvent1.iaz.aFo())
            {
              AppMethodBeat.o(126583);
              bool = false;
              break;
            }
            paramAnonymousFloat1 = paramAnonymousFloat2 * -1.0F;
            paramAnonymousFloat2 = paramAnonymousFloat1 / paramAnonymousMotionEvent1.iaw.getMeasuredHeight();
            paramAnonymousMotionEvent2 = (AudioManager)paramAnonymousMotionEvent1.mContext.getSystemService("audio");
            i = paramAnonymousMotionEvent2.getStreamMaxVolume(3);
            paramAnonymousFloat2 = 1.2F * (paramAnonymousFloat2 * i);
            j = (int)paramAnonymousFloat2;
            if ((j != 0) || (Math.abs(paramAnonymousFloat2) <= 0.2F))
              break label595;
            if (paramAnonymousFloat1 > 0.0F)
              j = 1;
          }
          while (true)
          {
            label507: int k = j + paramAnonymousMotionEvent1.JB;
            if (k < 0)
              j = 0;
            while (true)
            {
              a.b(paramAnonymousMotionEvent2, 3, j);
              paramAnonymousFloat1 = j / i;
              paramAnonymousMotionEvent1.iaz.aq(paramAnonymousFloat1);
              AppMethodBeat.o(126583);
              break;
              if (paramAnonymousFloat1 >= 0.0F)
                break label595;
              j = -1;
              break label507;
              j = k;
              if (k >= i)
                j = i;
            }
            AppMethodBeat.o(126583);
            break;
          }
        }
      }

      public final boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(126581);
        l.this.iaw.postDelayed(l.this.iaD, 200L);
        AppMethodBeat.o(126581);
        return true;
      }
    });
    this.hXK = m.cN(paramContext);
    AppMethodBeat.o(126587);
  }

  private void aFZ()
  {
    AppMethodBeat.i(126589);
    this.JB = ((AudioManager)this.mContext.getSystemService("audio")).getStreamVolume(3);
    this.hXK = m.cN(this.mContext);
    AppMethodBeat.o(126589);
  }

  public final void aFY()
  {
    this.iaB = -1;
    this.iaC = 0;
    this.iaA = 0.0F;
  }

  public final void z(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(126588);
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
    {
      this.iaA = paramMotionEvent.getRawX();
      aFZ();
    }
    this.iay.onTouchEvent(paramMotionEvent);
    if ((i == 1) || (i == 3))
    {
      if (this.iax != l.a.iaI)
        break label105;
      this.iaz.j(this.iaC, paramMotionEvent.getRawX() - this.iaA);
      this.iaB = -1;
      this.iaC = 0;
      this.iaA = 0.0F;
    }
    while (true)
    {
      this.iax = l.a.iaF;
      AppMethodBeat.o(126588);
      return;
      label105: if (this.iax == l.a.iaG)
      {
        ((AudioManager)this.mContext.getSystemService("audio")).getStreamMaxVolume(3);
        this.iaz.aFl();
      }
      else if (this.iax == l.a.iaH)
      {
        this.iaz.aFm();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.l
 * JD-Core Version:    0.6.2
 */