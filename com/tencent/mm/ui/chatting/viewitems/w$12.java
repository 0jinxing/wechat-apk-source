package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class w$12
  implements View.OnClickListener
{
  w$12(w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33139);
    ay localay = (ay)paramView.getTag();
    ab.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) name click", new Object[] { localay.userName });
    Object localObject = br.z(localay.cKd.field_content, "msg");
    if ((localObject != null) && (((Map)localObject).size() != 0))
      bo.getInt((String)((Map)localObject).get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), 0);
    localObject = this.zeW;
    paramView.getContext();
    w.a((w)localObject, localay.userName);
    AppMethodBeat.o(33139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.12
 * JD-Core Version:    0.6.2
 */