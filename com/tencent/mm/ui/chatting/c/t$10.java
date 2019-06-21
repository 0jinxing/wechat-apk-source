package com.tencent.mm.ui.chatting.c;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.LinkedList;

final class t$10
  implements View.OnClickListener
{
  t$10(t paramt, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31491);
    if (((com.tencent.mm.ui.chatting.c.b.t)this.yQA.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).dEF())
    {
      ((com.tencent.mm.ui.chatting.c.b.t)this.yQA.cgL.aF(com.tencent.mm.ui.chatting.c.b.t.class)).OC(t.j(this.yQA));
      AppMethodBeat.o(31491);
      return;
    }
    if ((int)this.yQA.cgL.sRl.ewQ == 0)
    {
      aw.ZK();
      if (c.XM().aa(this.yQA.cgL.sRl) != -1)
        ab.e("MicroMsg.ChattingUI.HeaderComponent", "[insertRetId] successfully! username:%s", new Object[] { this.yQA.cgL.sRl });
    }
    label163: String str;
    if (com.tencent.mm.model.t.kH(this.yQA.cgL.sRl.field_username))
    {
      paramView = this.yQA.cgL.sRl.field_username;
      aw.ZK();
      Object localObject = c.XM().aoO(t.e(this.yQA));
      if (localObject == null)
        break label362;
      str = bo.bc(((ap)localObject).dus, "");
      label197: ab.i("MicroMsg.ChattingUI.HeaderComponent", "dkverify banner add:%s chat:%s ticket", new Object[] { t.e(this.yQA), paramView, str });
      if (((!TextUtils.isEmpty(paramView)) && (TextUtils.isEmpty(str))) || (ad.aox(((ap)localObject).field_username)))
        break label368;
      localObject = new com.tencent.mm.pluginsdk.ui.applet.a(this.yQA.cgL.yTx.getContext(), new t.10.1(this));
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(Integer.valueOf(3));
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject).ajw(str);
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject).c(t.e(this.yQA), paramView, localLinkedList);
    }
    while (true)
    {
      h.pYm.e(11004, new Object[] { t.e(this.yQA), Integer.valueOf(3) });
      AppMethodBeat.o(31491);
      break;
      paramView = "";
      break label163;
      label362: str = "";
      break label197;
      label368: ao.a.flu.a(t.e(this.yQA), paramView, new t.10.2(this, paramView));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.t.10
 * JD-Core Version:    0.6.2
 */