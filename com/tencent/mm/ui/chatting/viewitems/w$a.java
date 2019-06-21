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

final class w$a
  implements View.OnClickListener
{
  private w$a(w paramw)
  {
  }

  public final void onClick(final View paramView)
  {
    AppMethodBeat.i(33155);
    if (!(paramView.getTag() instanceof bi))
    {
      ab.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, tag not msg.");
      AppMethodBeat.o(33155);
    }
    while (true)
    {
      return;
      final bi localbi = (bi)paramView.getTag();
      if (localbi == null)
      {
        ab.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, msg null.");
        AppMethodBeat.o(33155);
      }
      else
      {
        Object localObject = br.z(localbi.field_content, "msg");
        if ((localObject == null) || (((Map)localObject).size() == 0))
        {
          ab.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, values null.");
          AppMethodBeat.o(33155);
        }
        else
        {
          final String str = bo.nullAsNil((String)((Map)localObject).get(".msg.fromusername"));
          localObject = new d(paramView.getContext(), 1, false);
          ((d)localObject).rBl = new w.a.1(this, paramView);
          ((d)localObject).rBm = new n.d()
          {
            public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
            {
              AppMethodBeat.i(33154);
              ab.d("MicroMsg.ChattingItemDyeingTemplate", "on menu(id : %d, index : %d) item selected.", new Object[] { Integer.valueOf(paramAnonymousMenuItem.getItemId()), Integer.valueOf(paramAnonymousInt) });
              switch (paramAnonymousMenuItem.getItemId())
              {
              default:
              case 1:
              }
              while (true)
              {
                AppMethodBeat.o(33154);
                return;
                aw.Rg().a(1198, new w.a.2.1(this));
                s locals = new s(localbi.field_content);
                paramAnonymousMenuItem = w.a.this.zeW;
                Context localContext = paramView.getContext();
                paramView.getResources().getString(2131297061);
                w.a(paramAnonymousMenuItem, h.b(localContext, paramView.getResources().getString(2131297086), true, new w.a.2.2(this, locals)));
                aw.Rg().a(locals, 0);
              }
            }
          };
          ((d)localObject).cpD();
          AppMethodBeat.o(33155);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.a
 * JD-Core Version:    0.6.2
 */