package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelappbrand.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.a.d;
import java.util.Map;

final class w$1
  implements View.OnClickListener
{
  w$1(w paramw)
  {
  }

  public final void onClick(final View paramView)
  {
    AppMethodBeat.i(33127);
    final bi localbi = (bi)paramView.getTag(2131822468);
    if (localbi == null)
    {
      ab.w("MicroMsg.ChattingItemDyeingTemplate", "on more view click, but msg is null.");
      AppMethodBeat.o(33127);
    }
    while (true)
    {
      return;
      Object localObject = br.z(localbi.field_content, "msg");
      if ((localObject == null) || (((Map)localObject).size() == 0))
      {
        AppMethodBeat.o(33127);
      }
      else
      {
        final String str = bo.nullAsNil((String)((Map)localObject).get(".msg.fromusername"));
        final int i = bo.g(((Map)localObject).get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), -1);
        final int j = bo.g(((Map)localObject).get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_version"), -1);
        localObject = new d(paramView.getContext(), 1, false);
        ((d)localObject).rBl = new w.1.1(this, paramView);
        ((d)localObject).rBm = new n.d()
        {
          public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
          {
            AppMethodBeat.i(33126);
            ab.d("MicroMsg.ChattingItemDyeingTemplate", "on menu(id : %d, index : %d) item selected.", new Object[] { Integer.valueOf(paramAnonymousMenuItem.getItemId()), Integer.valueOf(paramAnonymousInt) });
            switch (paramAnonymousMenuItem.getItemId())
            {
            default:
            case 2:
            }
            while (true)
            {
              AppMethodBeat.o(33126);
              return;
              aw.Rg().a(1198, new w.1.2.1(this));
              s locals = new s(localbi.field_content);
              paramAnonymousMenuItem = w.1.this.zeW;
              Context localContext = paramView.getContext();
              paramView.getResources().getString(2131297061);
              w.a(paramAnonymousMenuItem, h.b(localContext, paramView.getResources().getString(2131297086), true, new w.1.2.2(this, locals)));
              aw.Rg().a(locals, 0);
              w.M(4, w.c(w.1.this.zeW), w.d(w.1.this.zeW));
            }
          }
        };
        ((d)localObject).cpD();
        AppMethodBeat.o(33127);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.1
 * JD-Core Version:    0.6.2
 */