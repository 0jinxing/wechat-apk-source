package com.tencent.mm.ui.chatting.c;

import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.chatting.d.a;

final class c$1
  implements c.a
{
  c$1(c paramc)
  {
  }

  public final boolean dDC()
  {
    AppMethodBeat.i(31195);
    if (c.a(this.yOi) == null)
    {
      i.a(this.yOi.cgL.yTx, 2131822379);
      c.a(this.yOi, (RelativeLayout)this.yOi.cgL.findViewById(2131822725));
      c.a(this.yOi, (TextView)this.yOi.cgL.findViewById(2131822726));
      c.b(this.yOi).setText(2131298044);
    }
    c.a(this.yOi).setVisibility(0);
    a.dFz().postDelayed(new c.1.1(this), 5000L);
    AppMethodBeat.o(31195);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.1
 * JD-Core Version:    0.6.2
 */