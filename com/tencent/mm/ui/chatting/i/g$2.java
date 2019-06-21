package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.a.c.b;
import com.tencent.mm.ui.chatting.a.c.e;

final class g$2
  implements c.e
{
  g$2(g paramg)
  {
  }

  public final void a(View paramView, int paramInt, c.b paramb)
  {
    AppMethodBeat.i(32628);
    paramView = this.yZw.mContext;
    String str = this.yZw.emo;
    long l = paramb.cvx;
    if (str == null)
    {
      ab.e("MicroMsg.PayHistoryListPresenter", "[gotoChattingUIWithPosition] username is null");
      AppMethodBeat.o(32628);
    }
    while (true)
    {
      return;
      aw.ZK();
      l = c.XO().jf(l).field_msgId;
      ab.i("MicroMsg.PayHistoryListPresenter", "[gotoChattingUIWithPosition] msgLocalId:%s", new Object[] { Long.valueOf(l) });
      if (t.kH(str))
      {
        aw.ZK();
        if (c.XV().oa(str) == null)
        {
          ab.w("MicroMsg.PayHistoryListPresenter", "[gotoChattingUIWithPosition] member is null! username:%s", new Object[] { str });
          com.tencent.mm.ui.base.h.a(paramView, paramView.getString(2131302352), paramView.getString(2131304077), null);
          AppMethodBeat.o(32628);
        }
      }
      else
      {
        aw.ZK();
        paramb = c.XM().aoO(str);
        if ((paramb == null) || (!a.jh(paramb.field_type)))
        {
          if (paramb == null)
            ab.w("MicroMsg.PayHistoryListPresenter", "[gotoChattingUIWithPosition] contact is null! username:%s", new Object[] { str });
          while (true)
          {
            com.tencent.mm.ui.base.h.a(paramView, paramView.getString(2131302352), paramView.getString(2131304077), null);
            AppMethodBeat.o(32628);
            break;
            ab.w("MicroMsg.PayHistoryListPresenter", "[gotoChattingUIWithPosition] isContact not ! username:%s", new Object[] { str });
          }
        }
        paramb = new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", l);
        paramb.setClass(paramView, ChattingUI.class);
        paramView.startActivity(paramb);
        AppMethodBeat.o(32628);
      }
    }
  }

  public final void b(View paramView, int paramInt, c.b paramb)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.g.2
 * JD-Core Version:    0.6.2
 */