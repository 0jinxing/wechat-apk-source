package com.tencent.mm.ui.chatting;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.d.a;

final class m$6
  implements d.a
{
  m$6(a parama)
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30605);
    if (paramIntent == null)
    {
      ab.w("MicroMsg.ChattingEditModeSendToBrand", "[onActivityResult] data is null!");
      AppMethodBeat.o(30605);
    }
    while (true)
    {
      return;
      if (paramInt1 == 225)
      {
        String str = paramIntent.getStringExtra("enterprise_biz_name");
        long l = paramIntent.getLongExtra("key_biz_chat_id", -1L);
        m.a(this.yIT, str, l);
      }
      AppMethodBeat.o(30605);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.6
 * JD-Core Version:    0.6.2
 */