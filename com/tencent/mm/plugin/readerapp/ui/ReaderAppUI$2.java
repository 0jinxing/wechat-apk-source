package com.tencent.mm.plugin.readerapp.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.bm;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.readerapp.c.b;
import com.tencent.mm.plugin.readerapp.c.g;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class ReaderAppUI$2
  implements n.d
{
  ReaderAppUI$2(ReaderAppUI paramReaderAppUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(76814);
    paramInt = paramMenuItem.getGroupId();
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(76814);
      Object localObject1;
      Object localObject2;
      while (true)
      {
        return;
        localObject1 = (String)ReaderAppUI.b(this.pFj).getItem(paramInt);
        if (!bo.isNullOrNil((String)localObject1))
        {
          g.cU((String)localObject1, ReaderAppUI.a(this.pFj));
          paramMenuItem = g.cdZ();
          paramInt = ReaderAppUI.a(this.pFj);
          localObject1 = "delete from " + bm.kH(paramInt) + " where reserved3 = " + h.escape((String)localObject1);
          ab.d("MicroMsg.ReaderAppInfoStorage", "deleteGroup:%s", new Object[] { localObject1 });
          if (paramMenuItem.fni.hY(bm.kH(paramInt), (String)localObject1))
          {
            paramMenuItem.kK(paramInt);
            paramMenuItem.doNotify();
          }
        }
        this.pFj.refresh();
        AppMethodBeat.o(76814);
        continue;
        if (ReaderAppUI.a(this.pFj) != 20)
          break;
        paramMenuItem = (String)ReaderAppUI.b(this.pFj).getItem(paramInt);
        paramMenuItem = g.cdZ().Q(paramMenuItem, ReaderAppUI.a(this.pFj));
        if (paramMenuItem.size() > 0)
        {
          paramMenuItem = (bl)paramMenuItem.get(0);
          localObject1 = new j.b();
          ((j.b)localObject1).title = paramMenuItem.getTitle();
          ((j.b)localObject1).description = paramMenuItem.getDigest();
          ((j.b)localObject1).action = "view";
          ((j.b)localObject1).type = 5;
          ((j.b)localObject1).url = paramMenuItem.getUrl();
          localObject2 = j.b.a((j.b)localObject1, null, null);
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("Retr_Msg_content", (String)localObject2);
          ((Intent)localObject1).putExtra("Retr_Msg_Type", 2);
          ((Intent)localObject1).putExtra("Retr_Msg_thumb_path", q.v(paramMenuItem.aan(), paramMenuItem.type, "@T"));
          ((Intent)localObject1).putExtra("Retr_Msg_Id", 7377812);
          localObject2 = v.nW(paramMenuItem.fnf);
          ((Intent)localObject1).putExtra("reportSessionId", (String)localObject2);
          localObject2 = v.Zp().y((String)localObject2, true);
          ((v.b)localObject2).j("prePublishId", "msg_" + paramMenuItem.fnf);
          ((v.b)localObject2).j("preUsername", "newsapp");
          ((v.b)localObject2).j("preChatName", "newsapp");
          ((v.b)localObject2).j("preMsgIndex", Integer.valueOf(0));
          ((v.b)localObject2).j("sendAppMsgScene", Integer.valueOf(1));
          com.tencent.mm.plugin.readerapp.b.a.gkE.k((Intent)localObject1, this.pFj);
        }
        AppMethodBeat.o(76814);
      }
      if (ReaderAppUI.a(this.pFj) == 20)
      {
        paramMenuItem = (String)ReaderAppUI.b(this.pFj).getItem(paramInt);
        localObject1 = g.cdZ().Q(paramMenuItem, ReaderAppUI.a(this.pFj));
        if (!((List)localObject1).isEmpty())
        {
          ab.i("MicroMsg.ReaderAppUI", "fav functionId %s, index %d, size %d", new Object[] { paramMenuItem, Integer.valueOf(ReaderAppUI.c(this.pFj)), Integer.valueOf(((List)localObject1).size()) });
          if (ReaderAppUI.c(this.pFj) >= ((List)localObject1).size())
            ReaderAppUI.a(this.pFj, 0);
          localObject1 = (bl)((List)localObject1).get(ReaderAppUI.c(this.pFj));
          paramMenuItem = new cl();
          localObject2 = v.nW(((bl)localObject1).fnf);
          v.b localb = v.Zp().y((String)localObject2, true);
          localb.j("prePublishId", "msg_" + ((bl)localObject1).fnf);
          localb.j("preUsername", "newsapp");
          localb.j("preChatName", "newsapp");
          localb.j("preMsgIndex", Integer.valueOf(0));
          localb.j("sendAppMsgScene", Integer.valueOf(1));
          paramMenuItem.cvA.cvF = ((String)localObject2);
          b.a(paramMenuItem, (bl)localObject1, ReaderAppUI.c(this.pFj));
          paramMenuItem.cvA.cvH = 7;
          paramMenuItem.cvA.activity = this.pFj;
          com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.2
 * JD-Core Version:    0.6.2
 */