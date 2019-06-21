package com.tencent.mm.plugin.fav.ui;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;

final class FavPostVoiceUI$5
  implements View.OnTouchListener
{
  FavPostVoiceUI$5(FavPostVoiceUI paramFavPostVoiceUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(74045);
    if (paramView != FavPostVoiceUI.g(this.miR))
    {
      AppMethodBeat.o(74045);
      return false;
    }
    int i = (int)paramMotionEvent.getRawY();
    paramView = new int[2];
    FavPostVoiceUI.a(this.miR, this.miR.getResources().getDisplayMetrics().heightPixels);
    FavPostVoiceUI.g(this.miR).getLocationOnScreen(paramView);
    int j = paramView[1];
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(74045);
      break;
      if (!FavPostVoiceUI.h(this.miR))
      {
        FavPostVoiceUI.i(this.miR);
        FavPostVoiceUI.j(this.miR);
        continue;
        int k = BackwardSupportUtil.b.b(this.miR, 60.0F);
        if ((i <= FavPostVoiceUI.k(this.miR) - k) && (i < j))
        {
          FavPostVoiceUI.l(this.miR).setVisibility(8);
          FavPostVoiceUI.m(this.miR).setVisibility(0);
        }
        else
        {
          FavPostVoiceUI.l(this.miR).setVisibility(0);
          FavPostVoiceUI.m(this.miR).setVisibility(8);
          continue;
          if (!FavPostVoiceUI.h(this.miR))
          {
            AppMethodBeat.o(74045);
            break;
          }
          if (FavPostVoiceUI.m(this.miR).getVisibility() == 0)
          {
            ab.w("MicroMsg.FavPostVoiceUI", "action up -> cancel");
            FavPostVoiceUI.n(this.miR);
          }
          else if (!FavPostVoiceUI.o(this.miR))
          {
            FavPostVoiceUI.p(this.miR);
            continue;
            ab.w("MicroMsg.FavPostVoiceUI", "action cancel");
            FavPostVoiceUI.n(this.miR);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.5
 * JD-Core Version:    0.6.2
 */