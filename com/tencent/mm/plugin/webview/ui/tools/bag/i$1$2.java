package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;

final class i$1$2
  implements Runnable
{
  i$1$2(i.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8173);
    g localg = this.uyL.uyI;
    Object localObject1 = this.uyL.uyJ;
    float f = this.uyL.uyK;
    Object localObject2 = this.uyL.uyH;
    ab.i("MicroMsg.TransformToBagAniHelper", "doMaskAnimation bogPos x:%d, y:%d lastSwipePosX:%f", new Object[] { Integer.valueOf(((Point)localObject1).x), Integer.valueOf(((Point)localObject1).y), Float.valueOf(f) });
    if (localg.getContentView() == null)
    {
      ab.w("MicroMsg.TransformToBagAniHelper", "doMaskAnimation getSwipeBackLayout null");
      ((e)localObject2).dbb();
      AppMethodBeat.o(8173);
      return;
    }
    ViewGroup localViewGroup = localg.bSl();
    Object localObject3 = d.eA(localg.getContentView());
    localObject3 = new j(localg.getActivity(), (Bitmap)localObject3);
    ((j)localObject3).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    int i = ((Point)localObject1).x;
    int j = ((Point)localObject1).y;
    int k = b.uyh;
    int m = b.uyj / 2;
    ((j)localObject3).uyV = i;
    ((j)localObject3).uyW = (j + k);
    ((j)localObject3).uyU = m;
    ((j)localObject3).setContentStartPosX((int)f);
    ((j)localObject3).setListener(new i.2((j)localObject3, (e)localObject2));
    localViewGroup.addView((View)localObject3, localViewGroup.getChildCount());
    localg.getContentView().setVisibility(8);
    localObject1 = new LinearInterpolator();
    boolean bool;
    if (((j)localObject3).uyX > 0)
    {
      bool = true;
      label270: ((j)localObject3).uyY = bool;
      if (((j)localObject3).uyX >= ((j)localObject3).uyV)
        break label547;
      j = ((j)localObject3).uyX;
      label297: localObject2 = PropertyValuesHolder.ofInt("canvasTranslationX", new int[] { ((j)localObject3).uyX, j });
      j = ((j)localObject3).uyV;
      if (((j)localObject3).uyY)
        if (((j)localObject3).uyX >= ((j)localObject3).uyV)
          break label557;
    }
    label547: label557: for (j = ((j)localObject3).uyV - ((j)localObject3).uyX; ; j = 0)
    {
      localObject2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("translationX", new int[] { 0, j }), PropertyValuesHolder.ofInt("translationY", new int[] { 0, ((j)localObject3).uyW }), PropertyValuesHolder.ofFloat("scaleX", new float[] { 1.0F, 2.0F * ((j)localObject3).uyU / ((j)localObject3).mWidth }), PropertyValuesHolder.ofFloat("scaleY", new float[] { 1.0F, 2.0F * ((j)localObject3).uyU / ((j)localObject3).mHeight }), localObject2 });
      ((ValueAnimator)localObject2).setDuration(300L);
      ((ValueAnimator)localObject2).setInterpolator((TimeInterpolator)localObject1);
      ((ValueAnimator)localObject2).addUpdateListener(new j.1((j)localObject3));
      ((ValueAnimator)localObject2).addListener(new j.2((j)localObject3));
      ((ValueAnimator)localObject2).start();
      AppMethodBeat.o(8173);
      break;
      bool = false;
      break label270;
      j = ((j)localObject3).uyV;
      break label297;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.i.1.2
 * JD-Core Version:    0.6.2
 */