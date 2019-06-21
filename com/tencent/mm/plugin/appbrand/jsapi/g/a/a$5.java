package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5
  implements View.OnTouchListener
{
  a$5(a parama, boolean paramBoolean, ImageView paramImageView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(138415);
    int i;
    if (this.hNx)
    {
      i = paramMotionEvent.getAction();
      if (i != 0)
        break label40;
      this.hNy.setColorFilter(Color.parseColor("#88888888"));
    }
    while (true)
    {
      AppMethodBeat.o(138415);
      return false;
      label40: if ((i == 3) || (i == 1))
        this.hNy.clearColorFilter();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.5
 * JD-Core Version:    0.6.2
 */