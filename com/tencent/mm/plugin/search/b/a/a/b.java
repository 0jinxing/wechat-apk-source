package com.tencent.mm.plugin.search.b.a.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.ui.FTSConvMessageUI;
import com.tencent.mm.plugin.fts.ui.FTSConvTalkerMessageUI;
import com.tencent.mm.plugin.fts.ui.a.m;
import com.tencent.mm.plugin.fts.ui.a.p;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
  implements com.tencent.mm.plugin.fts.a.d.a.b
{
  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(24406);
    m localm = (m)parama;
    if (localm.mKY < 2)
      if (f.rc(localm.username))
      {
        parama = new Intent().putExtra("Contact_User", localm.username);
        com.tencent.mm.plugin.search.a.gkE.c(parama, paramContext);
      }
    while (true)
    {
      AppMethodBeat.o(24406);
      return true;
      if (f.kq(localm.username))
      {
        parama = new Intent();
        parama.putExtra("Contact_User", localm.username);
        parama.addFlags(67108864);
        parama.putExtra("biz_chat_from_scene", 5);
        com.tencent.mm.bp.d.f(paramContext, ".ui.bizchat.BizChatConversationUI", parama);
      }
      else
      {
        if (f.rd(localm.username))
        {
          parama = f.qX(localm.username);
          if (parama == null);
          for (parama = (com.tencent.mm.plugin.fts.a.d.a.a)localObject2; ; parama = parama.adT())
          {
            localObject2 = parama;
            if (parama == null)
              localObject2 = "";
            parama = new Intent();
            parama.putExtra("rawUrl", (String)localObject2);
            parama.putExtra("useJs", true);
            parama.putExtra("srcUsername", localm.username);
            parama.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
            parama.addFlags(67108864);
            com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", parama);
            break;
          }
        }
        parama = bo.P(localm.mDz.mEa);
        parama = new Intent().putExtra("Chat_User", localm.username).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", localm.hpS.mEB).putExtra("highlight_keyword_list", parama);
        com.tencent.mm.plugin.search.a.gkE.d(parama, paramContext);
        continue;
        if (f.kq(localm.username))
        {
          parama = new Intent();
          parama.putExtra("Contact_User", localm.username);
          parama.addFlags(67108864);
          parama.putExtra("biz_chat_from_scene", 5);
          com.tencent.mm.bp.d.f(paramContext, ".ui.bizchat.BizChatConversationUI", parama);
        }
        else
        {
          if (f.rd(localm.username))
          {
            parama = f.qX(localm.username);
            if (parama == null);
            for (parama = localObject1; ; parama = parama.adT())
            {
              localObject2 = parama;
              if (parama == null)
                localObject2 = "";
              parama = new Intent();
              parama.putExtra("rawUrl", (String)localObject2);
              parama.putExtra("useJs", true);
              parama.putExtra("srcUsername", localm.username);
              parama.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
              parama.addFlags(67108864);
              com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", parama);
              break;
            }
          }
          if ((localm instanceof p))
          {
            parama = (p)localm;
            paramContext.startActivity(new Intent(paramContext, FTSConvTalkerMessageUI.class).putExtra("Search_Scene", parama.mFa).putExtra("key_talker_query", parama.mKp.mDz.mDY).putExtra("key_talker", parama.mKp.mDx).putExtra("key_conv", parama.username).putExtra("key_query", parama.mDz.mDY).putExtra("detail_type", parama.showType));
          }
          else
          {
            paramContext.startActivity(new Intent(paramContext, FTSConvMessageUI.class).putExtra("Search_Scene", localm.mFa).putExtra("key_conv", localm.username).putExtra("key_query", localm.mDz.mDY).putExtra("key_count", localm.mKY));
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.search.b.a.a.b
 * JD-Core Version:    0.6.2
 */