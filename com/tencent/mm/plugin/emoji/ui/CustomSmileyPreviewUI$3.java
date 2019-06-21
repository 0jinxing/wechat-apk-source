package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class CustomSmileyPreviewUI$3
  implements n.c
{
  CustomSmileyPreviewUI$3(CustomSmileyPreviewUI paramCustomSmileyPreviewUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(138340);
    if ((CustomSmileyPreviewUI.b(this.kYV).field_catalog != EmojiInfo.yal) && (!CustomSmileyPreviewUI.b(this.kYV).duS()))
      paraml.hi(0, 2131296421);
    if ((CustomSmileyPreviewUI.b(this.kYV).field_catalog == EmojiInfo.yal) || (bo.isNullOrNil(CustomSmileyPreviewUI.b(this.kYV).field_groupId)) || ((!bo.isNullOrNil(CustomSmileyPreviewUI.b(this.kYV).field_groupId)) && (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(CustomSmileyPreviewUI.b(this.kYV).field_groupId))))
      paraml.hi(1, 2131302498);
    com.tencent.mm.pluginsdk.a.d locald = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr();
    CustomSmileyPreviewUI.b(this.kYV);
    if (locald.bjR())
      paraml.hi(2, 2131299073);
    paraml.hi(3, 2131299053);
    AppMethodBeat.o(138340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.3
 * JD-Core Version:    0.6.2
 */