package com.tencent.mm.plugin.voip_cs.b.a;

import android.graphics.Point;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.OpenGlView;

final class b$5
  implements View.OnClickListener
{
  b$5(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(135322);
    paramView = this.tet;
    if (!b.h(this.tet));
    for (boolean bool = true; ; bool = false)
    {
      b.a(paramView, bool);
      paramView = b.b(this.tet, b.h(this.tet));
      b.i(this.tet).gc(paramView.x, paramView.y);
      AppMethodBeat.o(135322);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.5
 * JD-Core Version:    0.6.2
 */