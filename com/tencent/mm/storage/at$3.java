package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class at$3
  implements k.a
{
  at$3(at paramat)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(62711);
    if (paramString == null)
      AppMethodBeat.o(62711);
    while (true)
    {
      return;
      if (paramString.equalsIgnoreCase("delete_emoji_info_notify"))
      {
        at.a(this.xYJ).ca(true);
        at.a(this.xYJ).cb(true);
        at.a(this.xYJ).cd(true);
        AppMethodBeat.o(62711);
      }
      else if (g.RK())
      {
        paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramString);
        if (paramString != null)
        {
          if (paramString.field_catalog == EmojiInfo.yal)
          {
            at.a(this.xYJ).ca(true);
            at.a(this.xYJ).cb(true);
            AppMethodBeat.o(62711);
            continue;
          }
          if (bo.isEqual(paramString.field_groupId, "capture"))
            at.a(this.xYJ).cd(true);
        }
      }
      else
      {
        AppMethodBeat.o(62711);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.at.3
 * JD-Core Version:    0.6.2
 */