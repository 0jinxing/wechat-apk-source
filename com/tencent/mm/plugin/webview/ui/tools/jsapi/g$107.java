package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.t;
import com.tencent.mm.aj.n;
import com.tencent.mm.aj.z;
import com.tencent.mm.protocal.protobuf.auq;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class g$107
  implements n
{
  g$107(g paramg, i parami, String paramString)
  {
  }

  public final void a(int paramInt, m paramm)
  {
    AppMethodBeat.i(9183);
    if (paramInt != 0)
    {
      g.a(this.uHd, this.uqf, "openEnterpriseChat:fail", null);
      AppMethodBeat.o(9183);
    }
    while (true)
    {
      return;
      auq localauq = ((t)paramm).afo();
      Object localObject;
      if ((localauq == null) || (localauq.vNh == null) || (localauq.vNh.ret != 0))
      {
        if ((localauq != null) && (localauq.vNh != null))
        {
          localObject = new HashMap();
          ((Map)localObject).put("err_code", Integer.valueOf(localauq.vNh.ret));
          paramm = "openEnterpriseChat:fail";
          if (localauq.vNh.cyF != null)
            paramm = localauq.vNh.cyF;
          g.a(this.uHd, this.uqf, paramm, (Map)localObject);
          AppMethodBeat.o(9183);
        }
        else
        {
          g.a(this.uHd, this.uqf, "openEnterpriseChat:fail", null);
          AppMethodBeat.o(9183);
        }
      }
      else
      {
        localObject = localauq.vNb;
        paramm = ((t)paramm).fye;
        if (paramm == null)
        {
          g.a(this.uHd, this.uqf, "openEnterpriseChat:fail", null);
          AppMethodBeat.o(9183);
        }
        else
        {
          paramm = z.aeT().rq(paramm);
          if ((paramm != null) && (!bo.isNullOrNil((String)localObject)))
          {
            Intent localIntent;
            if ((!bo.isNullOrNil(this.uIo)) && (this.uIo.equals("long")))
            {
              localIntent = new Intent();
              localIntent.addFlags(67108864);
              localIntent.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
              localIntent.putExtra("Main_User", (String)localObject);
              localIntent.putExtra("biz_chat_chat_id", paramm.field_bizChatLocalId);
              localIntent.putExtra("biz_chat_from_scene", 8);
              com.tencent.mm.bp.d.f(g.i(this.uHd), ".ui.LauncherUI", localIntent);
            }
            while (true)
            {
              paramm = new HashMap();
              if ((!bo.isNullOrNil(localauq.wbP)) && (!bo.isNullOrNil(localauq.wbQ)))
              {
                paramm.put("chat_type", localauq.wbP);
                paramm.put("chat_id", localauq.wbQ);
              }
              g.a(this.uHd, this.uqf, "openEnterpriseChat:ok", paramm);
              AppMethodBeat.o(9183);
              break;
              localIntent = new Intent();
              localIntent.putExtra("Chat_User", (String)localObject);
              localIntent.putExtra("key_biz_chat_id", paramm.field_bizChatLocalId);
              localIntent.putExtra("finish_direct", true);
              localIntent.putExtra("key_need_send_video", false);
              localIntent.putExtra("key_is_biz_chat", true);
              com.tencent.mm.bp.d.f(g.i(this.uHd), ".ui.chatting.ChattingUI", localIntent);
            }
          }
          g.a(this.uHd, this.uqf, "openEnterpriseChat:fail", null);
          AppMethodBeat.o(9183);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.107
 * JD-Core Version:    0.6.2
 */