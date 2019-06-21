package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.graphics.PointF;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class l$3
  implements WebViewBag.a
{
  l$3(l paraml)
  {
  }

  public final void gz(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(8211);
    l.a(this.uzz, 19);
    l.c(this.uzz).uzB = paramInt1;
    l.c(this.uzz).uzA = paramInt2;
    l.c(this.uzz).save();
    AppMethodBeat.o(8211);
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(8212);
    a locala;
    float f1;
    float f2;
    if (l.d(this.uzz) != null)
    {
      locala = l.d(this.uzz);
      f1 = paramMotionEvent.getRawX();
      f2 = paramMotionEvent.getRawY();
    }
    switch (paramMotionEvent.getAction())
    {
    default:
      AppMethodBeat.o(8212);
      return;
    case 0:
      label70: locala.uyc.x = f1;
      locala.uyc.y = f2;
    case 2:
    case 1:
    }
    while (true)
    {
      locala.uyb = false;
      locala.uyd = false;
      break;
      boolean bool;
      label168: Object localObject;
      TranslateAnimation localTranslateAnimation;
      float f3;
      float f4;
      if (locala.uyb)
      {
        bool = true;
        if (!bool)
          break;
        if (!locala.mIsShowing)
        {
          b.fs(ah.getContext());
          locala.mIsShowing = true;
          locala.mScreenWidth = com.tencent.mm.bz.a.gd(ah.getContext());
          locala.mScreenHeight = com.tencent.mm.bz.a.ge(ah.getContext());
          if (locala.mScreenWidth <= locala.mScreenHeight)
            break label466;
          bool = true;
          locala.uye = bool;
          ab.i("MicroMsg.BagCancelController", "updateOrientation mIsLandScape:%b", new Object[] { Boolean.valueOf(locala.uye) });
          localObject = locala.uxZ;
          ((a.a)localObject).setVisibility(0);
          localTranslateAnimation = new TranslateAnimation(b.uyp, 0.0F, b.uyp, 0.0F);
          localTranslateAnimation.setFillAfter(true);
          localTranslateAnimation.setDuration(200L);
          ((a.a)localObject).lBT.startAnimation(localTranslateAnimation);
          ((a.a)localObject).WL.startAnimation(localTranslateAnimation);
        }
        bool = locala.uyd;
        if (!locala.uye)
          break label472;
        f3 = locala.mScreenWidth - paramMotionEvent.getRawX() - b.uyg;
        f4 = locala.mScreenHeight - paramMotionEvent.getRawY();
        label302: if (f3 * f3 + f4 * f4 >= a.uxY)
          break label504;
      }
      label466: label472: label504: for (locala.uyd = true; locala.uyd != bool; locala.uyd = false)
      {
        paramMotionEvent = locala.uxZ;
        if (!locala.uyd)
          break label512;
        paramMotionEvent.af(1.0F, b.uyq);
        if (paramMotionEvent.iVt != null)
          paramMotionEvent.iVt.vibrate(10L);
        AppMethodBeat.o(8212);
        break label70;
        f3 = locala.uyc.x;
        float f5 = locala.uyc.x;
        f4 = locala.uyc.y;
        if ((f1 - f5) * (f1 - f3) + (f2 - locala.uyc.y) * (f2 - f4) - 900.0F > 0.0F);
        for (bool = true; ; bool = false)
        {
          locala.uyb = bool;
          bool = locala.uyb;
          break;
        }
        bool = false;
        break label168;
        f3 = locala.mScreenWidth - paramMotionEvent.getRawX();
        f4 = locala.mScreenHeight - paramMotionEvent.getRawY() - b.uyg;
        break label302;
      }
      label512: paramMotionEvent.af(b.uyq, 1.0F);
      AppMethodBeat.o(8212);
      break label70;
      if (locala.uyd)
      {
        locala.uya.daY();
      }
      else if (locala.mIsShowing)
      {
        locala.mIsShowing = false;
        a.a locala1 = locala.uxZ;
        localTranslateAnimation = new TranslateAnimation(0.0F, b.uyp, 0.0F, b.uyp);
        localObject = new AlphaAnimation(1.0F, 0.0F);
        paramMotionEvent = new AnimationSet(true);
        paramMotionEvent.addAnimation((Animation)localObject);
        paramMotionEvent.addAnimation(localTranslateAnimation);
        paramMotionEvent.setDuration(300L);
        paramMotionEvent.setAnimationListener(new a.a.1(locala1));
        locala1.lBT.startAnimation(paramMotionEvent);
        locala1.WL.startAnimation(paramMotionEvent);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.l.3
 * JD-Core Version:    0.6.2
 */