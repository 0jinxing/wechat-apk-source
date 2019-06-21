package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 510;
  public static final String NAME = "updatePositioningContainer";

  public final boolean c(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126286);
    boolean bool;
    if (!(paramView instanceof WrapperNativeContainerView))
    {
      bool = false;
      AppMethodBeat.o(126286);
    }
    while (true)
    {
      return bool;
      int i = g.a(paramJSONObject, "contentOffsetLeft", 0);
      int j = g.a(paramJSONObject, "contentOffsetTop", 0);
      int k = paramJSONObject.optInt("animate", 0);
      parame = (WrapperNativeContainerView)paramView;
      try
      {
        if (paramJSONObject.getBoolean("visible"))
        {
          paramInt = 0;
          label70: parame.setVisibility(paramInt);
          label75: parame = (AppBrandNativeContainerView)parame.ah(AppBrandNativeContainerView.class);
          ab.i("MicroMsg.JsApiUpdatePositioningContainer", "scrollLeft:%d, scrollTop:%d, animation:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
          if (k != 1)
            break label350;
          paramView = ObjectAnimator.ofFloat(parame, "x", new float[] { parame.getX(), -i });
          ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(parame, "y", new float[] { parame.getY(), -j });
          paramView.addUpdateListener(new c.1(this, parame));
          localObjectAnimator.addUpdateListener(new c.2(this, parame));
          AnimatorSet localAnimatorSet = new AnimatorSet();
          localAnimatorSet.setDuration(1000L);
          localAnimatorSet.setInterpolator(new c.a(this));
          localAnimatorSet.setTarget(parame);
          localAnimatorSet.playTogether(new Animator[] { paramView, localObjectAnimator });
          localAnimatorSet.start();
        }
        while (true)
        {
          paramInt = g.a(paramJSONObject, "innerHeight", parame.getHeight());
          i = g.a(paramJSONObject, "innerWidth", parame.getWidth());
          ab.i("MicroMsg.JsApiUpdatePositioningContainer", "innerHeight:%d, innerWidth:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
          paramView = parame.getLayoutParams();
          paramView.height = paramInt;
          paramView.width = i;
          parame.setLayoutParams(paramView);
          bool = true;
          AppMethodBeat.o(126286);
          break;
          paramInt = 4;
          break label70;
          label350: parame.setX(-i);
          parame.setY(-j);
        }
      }
      catch (JSONException paramView)
      {
        break label75;
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126287);
    int i = paramJSONObject.getInt("containerId");
    AppMethodBeat.o(126287);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.container.c
 * JD-Core Version:    0.6.2
 */