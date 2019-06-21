package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.chatting.d.a;

final class ao$1
  implements View.OnClickListener
{
  ao$1(ao paramao, bi parambi, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33383);
    if (ah.isNullOrNil(this.zhK.field_imgPath))
    {
      ab.d("MicroMsg.ChattingItemVoiceRemindConfirm", "filename is null");
      AppMethodBeat.o(33383);
    }
    while (true)
    {
      return;
      ((aj)ao.a(this.zhM).aF(aj.class)).dFm().b(this.zhL, this.zhK);
      AppMethodBeat.o(33383);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ao.1
 * JD-Core Version:    0.6.2
 */