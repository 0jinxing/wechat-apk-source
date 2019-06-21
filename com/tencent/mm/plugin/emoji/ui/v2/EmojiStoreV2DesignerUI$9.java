package com.tencent.mm.plugin.emoji.ui.v2;

import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.f;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiStoreV2DesignerUI$9 extends ak
{
  EmojiStoreV2DesignerUI$9(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53587);
    switch (paramMessage.what)
    {
    default:
    case 10003:
    case 10001:
    case 10002:
    case 131075:
    case 131076:
    }
    while (true)
    {
      AppMethodBeat.o(53587);
      String str;
      while (true)
      {
        return;
        EmojiStoreV2DesignerUI.b(this.ldL);
        AppMethodBeat.o(53587);
        continue;
        this.ldL.gv(false);
        AppMethodBeat.o(53587);
        continue;
        EmojiStoreV2DesignerUI.c(this.ldL);
        AppMethodBeat.o(53587);
        continue;
        if ((EmojiStoreV2DesignerUI.d(this.ldL) == null) || (paramMessage.getData() == null))
        {
          AppMethodBeat.o(53587);
        }
        else
        {
          str = paramMessage.getData().getString("product_id");
          if (str == null)
          {
            AppMethodBeat.o(53587);
          }
          else
          {
            i = paramMessage.getData().getInt("progress");
            EmojiStoreV2DesignerUI.d(this.ldL).bX(str, i);
            AppMethodBeat.o(53587);
            continue;
            if ((EmojiStoreV2DesignerUI.d(this.ldL) == null) || (paramMessage.getData() == null))
            {
              AppMethodBeat.o(53587);
            }
            else
            {
              str = paramMessage.getData().getString("product_id");
              if (str != null)
                break;
              AppMethodBeat.o(53587);
            }
          }
        }
      }
      int i = paramMessage.getData().getInt("status");
      EmojiStoreV2DesignerUI.d(this.ldL).bW(str, i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.9
 * JD-Core Version:    0.6.2
 */