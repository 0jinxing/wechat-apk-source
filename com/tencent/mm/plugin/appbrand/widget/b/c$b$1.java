package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$b$1
  implements View.OnClickListener
{
  c$b$1(c.b paramb, c.c paramc, ImageView paramImageView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102352);
    if (this.jbO.state == 2)
    {
      this.jbP.setImageResource(2130839209);
      this.jbO.state = 1;
      AppMethodBeat.o(102352);
    }
    while (true)
    {
      return;
      if (this.jbO.state == 1)
      {
        this.jbP.setImageResource(2130839207);
        this.jbO.state = 2;
      }
      AppMethodBeat.o(102352);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.c.b.1
 * JD-Core Version:    0.6.2
 */