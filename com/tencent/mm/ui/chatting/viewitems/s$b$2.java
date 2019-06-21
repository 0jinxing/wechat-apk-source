package com.tencent.mm.ui.chatting.viewitems;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.a;
import com.tencent.mm.af.a.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.modelappbrand.k.a;
import com.tencent.mm.protocal.protobuf.cjk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class s$b$2
  implements k.a
{
  s$b$2(s.b paramb, s.d paramd, a parama)
  {
  }

  public final void a(String paramString, cjk paramcjk)
  {
    AppMethodBeat.i(33054);
    ab.d("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "ShareKey:%s UpdatableMsgInfo:%s", new Object[] { paramString, paramcjk.content });
    if (this.zeo.zet == null)
    {
      ab.w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "viewHolder.appbrandUpdateTv is null, return");
      AppMethodBeat.o(33054);
    }
    while (true)
    {
      return;
      String str = (String)this.zeo.zet.getTag();
      if (bo.isNullOrNil(str))
      {
        ab.w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "oriShareKey is null, return");
        AppMethodBeat.o(33054);
      }
      else if (str.equals(paramString))
      {
        this.zeo.zet.setVisibility(0);
        this.zeo.zet.setText(paramcjk.content);
        this.zeo.zet.setTextColor(bo.bS(paramcjk.wYm, this.zeo.zet.getCurrentTextColor()));
        if (paramcjk.state == 1)
        {
          paramString = ((k)g.K(k.class)).pn(paramString);
          if ((paramString != null) && (paramString.field_btnState == 1))
          {
            if (bo.isNullOrNil(this.zeq.ffh))
            {
              this.zeo.zeu.setVisibility(8);
              AppMethodBeat.o(33054);
              continue;
            }
            this.zeo.zeu.setVisibility(0);
            this.zeo.zeu.setText(this.zeq.ffh);
          }
        }
      }
      else
      {
        AppMethodBeat.o(33054);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.s.b.2
 * JD-Core Version:    0.6.2
 */