package com.tencent.mm.plugin.voip_cs.b.a;

import android.content.Context;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class b$2
  implements ap.a
{
  b$2(b paramb)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(135319);
    b.a(this.tet).setText(ah.getContext().getString(2131304406));
    b.b(this.tet).setVisibility(0);
    com.tencent.mm.plugin.voip_cs.c.b localb = b.c(this.tet);
    TextView localTextView = b.b(this.tet);
    Object localObject = b.sWo;
    if ((localObject == null) || (localTextView == null))
      ab.e("MicroMsg.DynamicTextWrap", "textList or tv is null");
    while (true)
    {
      AppMethodBeat.o(135319);
      return true;
      localb.cLc();
      localb.sWE = 0;
      localb.sWC = ((int[])localObject);
      localb.sW = localTextView;
      localb.sWD = 500;
      if (localb.gyS != null)
      {
        localObject = localb.gyS;
        long l = localb.sWD;
        ((ap)localObject).ae(l, l);
      }
      ab.b("MicroMsg.DynamicTextWrap", "start textview:".concat(String.valueOf(localTextView)), new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.2
 * JD-Core Version:    0.6.2
 */