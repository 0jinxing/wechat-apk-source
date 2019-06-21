package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;

final class e$1
  implements DynamicGridView.e
{
  e$1(e parame, DynamicGridView paramDynamicGridView)
  {
  }

  public final void Ev(int paramInt)
  {
    AppMethodBeat.i(40318);
    ab.i("DynamicGrid", "drag started at position ".concat(String.valueOf(paramInt)));
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.rLd.rKV = this.rLc.getElevation();
      this.rLc.setElevation(100.0F);
    }
    while (true)
    {
      Object localObject = this.rLd;
      ((e)localObject).rKW.setVisibility(0);
      localObject = ObjectAnimator.ofFloat(((e)localObject).rKW, "translationY", new float[] { ((e)localObject).rKW.getHeight(), 0.0F });
      ((ObjectAnimator)localObject).setDuration(200L);
      ((ObjectAnimator)localObject).start();
      e.a(this.rLd);
      AppMethodBeat.o(40318);
      return;
      this.rLc.bringToFront();
    }
  }

  public final void Ew(int paramInt)
  {
    AppMethodBeat.i(40319);
    ab.i("DynamicGrid", "drag to del ".concat(String.valueOf(paramInt)));
    c localc = this.rLd.rKS;
    Object localObject = localc.getItem(paramInt);
    localc.mItems.remove(localObject);
    localc.rKJ.remove(localObject);
    localc.notifyDataSetChanged();
    if (localc.rKO != null)
    {
      int i = localc.rKK;
      localc.rKO.removeItem(paramInt - i);
    }
    AppMethodBeat.o(40319);
  }

  public final void cvc()
  {
    AppMethodBeat.i(40321);
    e locale = this.rLd;
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(locale.rKW, "translationY", new float[] { 0.0F, locale.rKW.getHeight() });
    localObjectAnimator.setDuration(200L);
    localObjectAnimator.addListener(new e.8(locale));
    localObjectAnimator.start();
    this.rLd.rKS.cuZ();
    AppMethodBeat.o(40321);
  }

  public final void l(Rect paramRect)
  {
    AppMethodBeat.i(40320);
    if (m(paramRect))
    {
      paramRect = this.rLd;
      paramRect.rKW.setBackgroundColor(Color.parseColor("#ce3c39"));
      paramRect.rKX.setImageResource(2131231950);
      paramRect.rjj.setText("松手即可删除");
      AppMethodBeat.o(40320);
    }
    while (true)
    {
      return;
      e.b(this.rLd);
      AppMethodBeat.o(40320);
    }
  }

  public final boolean m(Rect paramRect)
  {
    AppMethodBeat.i(40322);
    boolean bool = e.a(this.rLd, paramRect);
    AppMethodBeat.o(40322);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.e.1
 * JD-Core Version:    0.6.2
 */