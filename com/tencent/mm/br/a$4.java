package com.tencent.mm.br;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.r;

final class a$4
  implements Animation.AnimationListener
{
  a$4(a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(116309);
    ((EditText)this.vwV.vwM.getTextEditView().findViewById(2131823386)).setText("");
    this.vwV.vwM.getTextEditView().setVisibility(8);
    AppMethodBeat.o(116309);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(116308);
    this.vwV.vwM.getSelectedFeatureListener().bd(false);
    AppMethodBeat.o(116308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.br.a.4
 * JD-Core Version:    0.6.2
 */