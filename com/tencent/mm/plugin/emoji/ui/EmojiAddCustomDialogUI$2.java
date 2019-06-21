package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.tools.b.b.a;

final class EmojiAddCustomDialogUI$2
  implements b.a
{
  EmojiAddCustomDialogUI$2(EmojiAddCustomDialogUI paramEmojiAddCustomDialogUI, EmojiInfo paramEmojiInfo)
  {
  }

  public final void a(com.tencent.mm.ui.tools.b.b paramb)
  {
    AppMethodBeat.i(53270);
    paramb = com.tencent.mm.emoji.a.b.eyD;
    if (com.tencent.mm.emoji.a.b.OE().getBoolean("custom_full", false))
    {
      ab.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. over max size.");
      this.kZj.blb();
      EmojiAddCustomDialogUI.a(this.kZj);
      h.pYm.e(10431, new Object[] { Integer.valueOf(EmojiAddCustomDialogUI.b(this.kZj)), EmojiAddCustomDialogUI.c(this.kZj).Aq(), EmojiAddCustomDialogUI.c(this.kZj).field_designerID, EmojiAddCustomDialogUI.c(this.kZj).field_groupId, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(EmojiAddCustomDialogUI.c(this.kZj).field_size), EmojiAddCustomDialogUI.d(this.kZj), EmojiAddCustomDialogUI.c(this.kZj).field_activityid });
      AppMethodBeat.o(53270);
    }
    while (true)
    {
      return;
      if ((this.kTI.field_catalog == EmojiInfo.yal) || (bo.isNullOrNil(this.kTI.field_groupId)) || (bo.isEqual(this.kTI.field_groupId, "capture")) || ((!bo.isNullOrNil(this.kTI.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(this.kTI.field_groupId))))
      {
        EmojiAddCustomDialogUI.u(this.kTI);
        AppMethodBeat.o(53270);
      }
      else
      {
        EmojiAddCustomDialogUI.v(this.kTI);
        AppMethodBeat.o(53270);
      }
    }
  }

  public final void bln()
  {
    AppMethodBeat.i(53271);
    this.kZj.blb();
    EmojiAddCustomDialogUI.e(this.kZj);
    h.pYm.e(10431, new Object[] { Integer.valueOf(EmojiAddCustomDialogUI.b(this.kZj)), EmojiAddCustomDialogUI.c(this.kZj).Aq(), EmojiAddCustomDialogUI.c(this.kZj).field_designerID, EmojiAddCustomDialogUI.c(this.kZj).field_groupId, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(EmojiAddCustomDialogUI.c(this.kZj).field_size), EmojiAddCustomDialogUI.d(this.kZj), EmojiAddCustomDialogUI.c(this.kZj).field_activityid });
    AppMethodBeat.o(53271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.2
 * JD-Core Version:    0.6.2
 */