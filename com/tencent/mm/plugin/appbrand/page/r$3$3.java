package com.tencent.mm.plugin.appbrand.page;

import a.f.b.j;
import android.content.DialogInterface.OnClickListener;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.ui.MMFragmentActivity.a;

final class r$3$3
  implements Runnable
{
  r$3$3(r.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132346);
    Object localObject1 = r.a(this.isw.iss);
    r.a(this.isw.iss, new f(this.isw.iss.getContext()));
    Object localObject2 = new r.3.3.1(this);
    r.a(this.isw.iss).setPositiveButton((DialogInterface.OnClickListener)localObject2);
    r.a(this.isw.iss).setNegativeButton((DialogInterface.OnClickListener)localObject2);
    f localf = r.a(this.isw.iss);
    localObject2 = this.isw.iss;
    r.3.3.2 local2 = new r.3.3.2(this, (f)localObject1);
    j.p(localObject2, "pageContainer");
    localf.ira = ((q)localObject2);
    ((q)localObject2).addView((View)localf, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    localf.bringToFront();
    i locali = ((q)localObject2).getRuntime();
    if (locali == null)
      j.dWJ();
    Object localObject3 = localf.irc;
    if (localObject3 != null)
    {
      localObject1 = locali.yf();
      if (localObject1 != null)
      {
        localObject2 = ((AppBrandInitConfig)localObject1).cwz;
        localObject1 = localObject2;
        if (localObject2 != null);
      }
      else
      {
        localObject1 = "";
      }
      ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject3).setMainTitle((String)localObject1);
      ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject3).setBackgroundColor(0);
      ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject3).setForegroundStyle(true);
      ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)localObject3).eP(true);
    }
    localObject2 = localf.ird;
    if (localObject2 != null)
    {
      localObject1 = new ColorMatrix();
      ((ColorMatrix)localObject1).setSaturation(0.0F);
      ((ImageView)localObject2).setColorFilter((ColorFilter)new ColorMatrixColorFilter((ColorMatrix)localObject1));
      localObject3 = com.tencent.mm.modelappbrand.a.b.abR();
      localObject1 = locali.yf();
      if (localObject1 == null)
        break label372;
    }
    label372: for (localObject1 = ((AppBrandInitConfig)localObject1).iconUrl; ; localObject1 = null)
    {
      ((com.tencent.mm.modelappbrand.a.b)localObject3).a((ImageView)localObject2, (String)localObject1, a.abQ(), (b.f)com.tencent.mm.modelappbrand.a.f.fqH);
      localObject1 = localf.iqZ;
      if (localObject1 != null)
        ((Animation)localObject1).cancel();
      localf.iqZ = AnimationUtils.loadAnimation(localf.getContext(), MMFragmentActivity.a.ync);
      localObject1 = localf.iqZ;
      if (localObject1 == null)
        j.dWJ();
      ((Animation)localObject1).setAnimationListener((Animation.AnimationListener)new f.d(localf, local2));
      localObject1 = localf.iqZ;
      if (localObject1 == null)
        j.dWJ();
      localf.startAnimation((Animation)localObject1);
      AppMethodBeat.o(132346);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.r.3.3
 * JD-Core Version:    0.6.2
 */