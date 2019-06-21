package com.tencent.mm.plugin.brandservice.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.plugin.websearch.api.ai;

public final class a$b extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public a$b(a parama)
  {
    super(parama);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(14081);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969608, paramViewGroup, false);
    paramViewGroup = (a.a)this.jNc.jNb;
    paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
    paramViewGroup.gnB = ((TextView)paramContext.findViewById(2131821185));
    paramViewGroup.gnC = ((TextView)paramContext.findViewById(2131820991));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(14081);
    return paramContext;
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a.a parama, com.tencent.mm.plugin.fts.a.d.a.a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14082);
    parama1 = (a)parama1;
    parama = (a.a)parama;
    m.p(parama.contentView, this.jNc.mFk);
    m.a(paramContext, parama.ejo, parama1.iconUrl, null, 2130837985);
    if (t.mP(parama1.username))
      m.a(((b)com.tencent.mm.kernel.g.K(b.class)).a(paramContext, parama1.jMY), parama.gnB);
    while (true)
    {
      m.a(parama1.jMZ, parama.gnC);
      AppMethodBeat.o(14082);
      return;
      m.a(parama1.jMY, parama.gnB);
    }
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(14083);
    a locala = (a)parama;
    a(this.jNc.mDz.mDY, locala.hpS);
    if (f.rc(locala.username))
    {
      parama = new Intent();
      parama.putExtra("enterprise_biz_name", locala.username);
      parama.putExtra("enterprise_biz_display_name", s.mJ(locala.username));
      parama.putExtra("enterprise_from_scene", 3);
      com.tencent.mm.bp.d.f(paramContext, ".ui.conversation.EnterpriseConversationUI", parama);
    }
    while (true)
    {
      ai.adO(locala.username);
      AppMethodBeat.o(14083);
      return true;
      if (f.kq(locala.username))
      {
        parama = new Intent();
        parama.putExtra("Contact_User", locala.username);
        parama.addFlags(67108864);
        parama.putExtra("biz_chat_from_scene", 5);
        com.tencent.mm.bp.d.f(paramContext, ".ui.bizchat.BizChatConversationUI", parama);
      }
      else
      {
        if (f.rd(locala.username))
        {
          parama = f.qX(locala.username);
          if (parama == null);
          for (parama = null; ; parama = parama.adT())
          {
            Object localObject = parama;
            if (parama == null)
              localObject = "";
            parama = new Intent();
            parama.putExtra("rawUrl", (String)localObject);
            parama.putExtra("useJs", true);
            parama.putExtra("srcUsername", locala.username);
            parama.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
            parama.addFlags(67108864);
            com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", parama);
            break;
          }
        }
        parama = new Intent();
        parama.putExtra("Chat_User", locala.username);
        parama.putExtra("finish_direct", true);
        parama.putExtra("specific_chat_from_scene", 3);
        parama.putExtra("preChatTYPE", 9);
        com.tencent.mm.bp.d.f(paramContext, ".ui.chatting.ChattingUI", parama);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.a.a.b
 * JD-Core Version:    0.6.2
 */