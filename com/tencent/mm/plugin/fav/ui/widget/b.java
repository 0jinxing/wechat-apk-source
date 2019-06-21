package com.tencent.mm.plugin.fav.ui.widget;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public View mpA;
  public ImageButton mpE;
  public ImageButton mpF;
  public ImageButton mpG;
  public b.a mpH;
  public boolean mpz = false;

  public final void hide()
  {
    AppMethodBeat.i(74675);
    if (!this.mpz)
      AppMethodBeat.o(74675);
    while (true)
    {
      return;
      if (this.mpA.getVisibility() != 8)
      {
        this.mpA.setVisibility(8);
        this.mpA.startAnimation(AnimationUtils.loadAnimation(this.mpA.getContext(), 2131034181));
      }
      AppMethodBeat.o(74675);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.b
 * JD-Core Version:    0.6.2
 */