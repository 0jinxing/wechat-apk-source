package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.util.ArrayList;

final class EmojiCustomUI$9
  implements Runnable
{
  EmojiCustomUI$9(EmojiCustomUI paramEmojiCustomUI, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53308);
    for (int i = 0; i < this.kZN.size(); i++)
    {
      ab.i("MicroMsg.emoji.EmojiCustomUI", "delete md5List md5:%s", new Object[] { this.kZN.get(i) });
      EmojiInfo localEmojiInfo = j.getEmojiStorageMgr().xYn.aqi((String)this.kZN.get(i));
      h.pYm.e(10613, new Object[] { this.kZN.get(i), localEmojiInfo.field_groupId, localEmojiInfo.field_designerID, localEmojiInfo.field_activityid });
    }
    AppMethodBeat.o(53308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.9
 * JD-Core Version:    0.6.2
 */