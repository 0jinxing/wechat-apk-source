package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;

final class EmojiStoreV2DesignerUI$8
  implements ao.b.a
{
  EmojiStoreV2DesignerUI$8(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(53586);
    ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "getContactCallBack username:%s,succ:%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      EmojiStoreV2DesignerUI.a(this.ldL, ((j)g.K(j.class)).XM().aoO(paramString));
      EmojiStoreV2DesignerUI.a(this.ldL);
    }
    AppMethodBeat.o(53586);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.8
 * JD-Core Version:    0.6.2
 */