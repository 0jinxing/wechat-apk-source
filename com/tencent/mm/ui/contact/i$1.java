package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e.a.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.util.List;
import java.util.Map;

final class i$1
  implements Runnable
{
  i$1(i parami, e.a.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(33703);
    aw.ZK();
    Object localObject = c.XM().aoO(this.yOl.fuO);
    if ((i.a(this.zmv) != null) && (i.a(this.zmv).size() > 0) && (i.a(this.zmv).contains(this.yOl.fuO)))
    {
      if ((localObject != null) && ((int)((a)localObject).ewQ > 0) && (a.jh(((ap)localObject).field_type)))
        break label437;
      ab.i("MicroMsg.EnterpriseBizView", "remove enterprise biz view item, %s", new Object[] { this.yOl.fuO });
      i.a(this.zmv).remove(this.yOl.fuO);
      if (i.a(this.zmv).size() > 0)
      {
        localObject = (View)i.b(this.zmv).get(this.yOl.fuO);
        if ((localObject != null) && (i.c(this.zmv) != null))
        {
          i.c(this.zmv).removeView((View)localObject);
          i.b(this.zmv).remove(localObject);
        }
        AppMethodBeat.o(33703);
      }
    }
    while (true)
    {
      return;
      if (i.d(this.zmv) != null)
      {
        if (i.b(this.zmv) != null)
          i.b(this.zmv).clear();
        if (i.c(this.zmv) != null)
          i.c(this.zmv).removeAllViews();
        i.d(this.zmv).Pl(i.a(this.zmv).size());
        AppMethodBeat.o(33703);
        continue;
        if ((localObject == null) || ((int)((a)localObject).ewQ <= 0) || (!a.jh(((ap)localObject).field_type)))
        {
          AppMethodBeat.o(33703);
        }
        else
        {
          if (i.a(this.zmv) != null)
            i.a(this.zmv).clear();
          if (i.b(this.zmv) != null)
            i.b(this.zmv).clear();
          if (i.c(this.zmv) != null)
            i.c(this.zmv).removeAllViews();
          i.e(this.zmv);
          if (i.d(this.zmv) != null)
            i.d(this.zmv).Pl(i.a(this.zmv).size());
        }
      }
      else
      {
        label437: AppMethodBeat.o(33703);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.i.1
 * JD-Core Version:    0.6.2
 */