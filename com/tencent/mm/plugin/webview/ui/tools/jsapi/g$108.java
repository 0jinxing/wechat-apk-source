package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.n;
import com.tencent.mm.aj.z;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.protocal.protobuf.uh;
import com.tencent.mm.sdk.platformtools.bo;

final class g$108
  implements n
{
  g$108(g paramg, i parami)
  {
  }

  public final void a(int paramInt, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(9184);
    if (paramInt != 0)
    {
      g.a(this.uHd, this.uqf, "enterEnterpriseChat:fail", null);
      AppMethodBeat.o(9184);
    }
    while (true)
    {
      return;
      Object localObject = ((com.tencent.mm.aj.a.m)paramm).afl();
      String str = "enterEnterpriseChat:fail";
      if (paramInt < 0)
      {
        paramm = str;
        if (localObject != null)
        {
          paramm = str;
          if (((uh)localObject).vNh != null)
          {
            paramm = str;
            if (bo.isNullOrNil(((uh)localObject).vNh.cyF))
              paramm = "enterEnterpriseChat:fail_" + ((uh)localObject).vNh.cyF;
          }
        }
        g.a(this.uHd, this.uqf, paramm, null);
        AppMethodBeat.o(9184);
      }
      else
      {
        str = ((uh)localObject).vNb;
        paramm = ((com.tencent.mm.aj.a.m)paramm).fye;
        if (paramm == null)
        {
          g.a(this.uHd, this.uqf, "enterEnterpriseChat:fail", null);
          AppMethodBeat.o(9184);
        }
        else
        {
          paramm = z.aeT().rq(paramm);
          if ((paramm != null) && (!bo.isNullOrNil(str)))
          {
            localObject = new Intent();
            ((Intent)localObject).putExtra("Chat_User", str);
            ((Intent)localObject).putExtra("key_biz_chat_id", paramm.field_bizChatLocalId);
            ((Intent)localObject).putExtra("finish_direct", true);
            ((Intent)localObject).putExtra("key_need_send_video", false);
            ((Intent)localObject).putExtra("key_is_biz_chat", true);
            com.tencent.mm.bp.d.f(g.i(this.uHd), ".ui.chatting.ChattingUI", (Intent)localObject);
            g.a(this.uHd, this.uqf, "enterEnterpriseChat:ok", null);
            AppMethodBeat.o(9184);
          }
          else
          {
            g.a(this.uHd, this.uqf, "enterEnterpriseChat:fail", null);
            AppMethodBeat.o(9184);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.108
 * JD-Core Version:    0.6.2
 */