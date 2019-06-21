package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;

final class c$2
  implements View.OnClickListener
{
  c$2(c paramc, LinkedList paramLinkedList, c.a parama, b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102350);
    paramView = new ArrayList();
    for (int i = 0; i < this.hCi.size(); i++)
      if ((((c.c)this.hCi.get(i)).state == 2) || (((c.c)this.hCi.get(i)).state == 3))
        paramView.add(((c.c)this.hCi.get(i)).scope);
    ab.i("MicroMsg.AppBrandAuthorizeDialog", "stev rejectButton click!");
    this.jbK.b(2, paramView);
    this.jbL.dismiss();
    AppMethodBeat.o(102350);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.c.2
 * JD-Core Version:    0.6.2
 */