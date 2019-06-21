package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.model.m;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;

final class s$2$1
  implements ap.a
{
  s$2$1(s.2 param2)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(79789);
    s locals;
    String str;
    if (this.vlp.vlo.gub != null)
    {
      locals = this.vlp.vlo;
      str = this.vlp.vlo.pwu.getText().toString().trim();
      Context localContext = locals.context;
      locals.context.getString(2131297061);
      locals.tipDialog = h.b(localContext, locals.context.getString(2131302962), true, new s.5(locals));
      locals.content = str;
      if ((locals.vll.size() != 1) || (!ad.aox((String)locals.vll.getFirst())))
        break label130;
      locals.djH();
    }
    while (true)
    {
      AppMethodBeat.o(79789);
      return false;
      label130: g.RO().eJo.a(new m(2, locals.vll, locals.pAT, str, ""), 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.s.2.1
 * JD-Core Version:    0.6.2
 */