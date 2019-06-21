package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class EmojiStoreV2DesignerUI$2
  implements Runnable
{
  EmojiStoreV2DesignerUI$2(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI, List paramList)
  {
  }

  public final void run()
  {
    int i = 8;
    AppMethodBeat.i(53581);
    EmojiStoreV2DesignerUI localEmojiStoreV2DesignerUI = this.ldL;
    int j;
    View localView;
    if (this.ldM.size() > 3)
    {
      j = 1;
      if (localEmojiStoreV2DesignerUI.ldv != null)
        localEmojiStoreV2DesignerUI.ldv.setVisibility(0);
      if (localEmojiStoreV2DesignerUI.ldy != null)
        localEmojiStoreV2DesignerUI.ldy.setVisibility(0);
      if (localEmojiStoreV2DesignerUI.ldx != null)
        localEmojiStoreV2DesignerUI.ldx.setVisibility(0);
      if (localEmojiStoreV2DesignerUI.ldz != null)
      {
        localView = localEmojiStoreV2DesignerUI.ldz;
        if (j == 0)
          break label175;
      }
    }
    label175: for (int k = 0; ; k = 8)
    {
      localView.setVisibility(k);
      if (localEmojiStoreV2DesignerUI.ldA != null)
        localEmojiStoreV2DesignerUI.ldA.setText(2131299131);
      if (localEmojiStoreV2DesignerUI.ldB != null)
      {
        localView = localEmojiStoreV2DesignerUI.ldB;
        k = i;
        if (j != 0)
          k = 0;
        localView.setVisibility(k);
      }
      if (localEmojiStoreV2DesignerUI.lds != null)
        localEmojiStoreV2DesignerUI.lds.setPadding(0, 0, 0, 0);
      AppMethodBeat.o(53581);
      return;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.2
 * JD-Core Version:    0.6.2
 */