package com.tencent.mm.plugin.emoji.ui;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.b.b;
import com.tencent.mm.ui.tools.b.b.a;

final class EmojiCustomUI$2
  implements b.a
{
  EmojiCustomUI$2(EmojiCustomUI paramEmojiCustomUI, int paramInt, String paramString)
  {
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(53300);
    if (EmojiCustomUI.j(this.kZL) == null)
    {
      if (this.kZM != 0)
        break label122;
      EmojiCustomUI.a(this.kZL, j.getEmojiStorageMgr().xYn.d(this.iRf, "", EmojiGroupInfo.yaf, EmojiInfo.yam, paramb.zIt, ""));
    }
    while (true)
    {
      j.bki().a(this.kZL.mController.ylL, EmojiCustomUI.j(this.kZL), 1, r.Yz());
      if (EmojiCustomUI.f(this.kZL) != null)
      {
        EmojiCustomUI.f(this.kZL).bly();
        EmojiCustomUI.f(this.kZL).notifyDataSetChanged();
      }
      AppMethodBeat.o(53300);
      return;
      label122: EmojiCustomUI.a(this.kZL, j.getEmojiStorageMgr().xYn.d(this.iRf, "", EmojiGroupInfo.yaf, EmojiInfo.yan, paramb.zIt, ""));
    }
  }

  public final void bln()
  {
    AppMethodBeat.i(53301);
    com.tencent.mm.ui.base.h.a(this.kZL.mController.ylL, this.kZL.mController.ylL.getString(2131299042), "", this.kZL.mController.ylL.getString(2131300601), false, null);
    AppMethodBeat.o(53301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.2
 * JD-Core Version:    0.6.2
 */