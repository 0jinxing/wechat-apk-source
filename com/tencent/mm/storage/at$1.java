package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class at$1
  implements k.a
{
  at$1(at paramat)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(62709);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals("event_update_group")))
    {
      ab.d("MicroMsg.emoji.EmojiStorageMgr", "onNotifyChange event:%s", new Object[] { (String)paramm.obj });
      if (!g.RN().QY())
        AppMethodBeat.o(62709);
    }
    while (true)
    {
      return;
      ((d)g.M(d.class)).getEmojiDescMgr().dsY();
      if ((!bo.isNullOrNil(paramString)) && ((paramString.equals("event_update_group")) || (paramString.equalsIgnoreCase("productID"))))
      {
        ab.d("MicroMsg.emoji.EmojiStorageMgr", "modify emoji gorup .");
        at.xYA = true;
        at.a(this.xYJ).cc(true);
      }
      AppMethodBeat.o(62709);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.at.1
 * JD-Core Version:    0.6.2
 */