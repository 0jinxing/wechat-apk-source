package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bo;

final class EmojiCustomUI$14
  implements k.a
{
  EmojiCustomUI$14(EmojiCustomUI paramEmojiCustomUI)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(53312);
    if ((!bo.isNullOrNil(paramString)) && ((paramString.length() == 32) || (paramString.equals("event_update_emoji"))) && (EmojiCustomUI.f(this.kZL) != null))
    {
      EmojiCustomUI.f(this.kZL).bly();
      EmojiCustomUI.f(this.kZL).notifyDataSetChanged();
    }
    AppMethodBeat.o(53312);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.14
 * JD-Core Version:    0.6.2
 */