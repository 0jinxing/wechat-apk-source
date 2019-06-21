package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class EmojiStoreV2UI$3
  implements Runnable
{
  EmojiStoreV2UI$3(EmojiStoreV2UI paramEmojiStoreV2UI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53818);
    Intent localIntent = aa.cVd();
    if (EmojiStoreV2UI.f(this.lgg) == 17)
    {
      i = 50;
      aa.a(localIntent, i);
      localIntent.putExtra("ftsneedkeyboard", true);
      localIntent.putExtra("key_load_js_without_delay", true);
      localIntent.putExtra("ftsInitToSearch", true);
      d.b(this.lgg.mController.ylL, "webview", ".ui.tools.fts.FTSSOSHomeWebViewUI", localIntent);
      if (EmojiStoreV2UI.b(this.lgg) != 0)
        break label127;
    }
    label127: for (int i = 0; ; i = 1)
    {
      h.pYm.e(13054, new Object[] { Integer.valueOf(i), Integer.valueOf(0), "" });
      AppMethodBeat.o(53818);
      return;
      i = 24;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI.3
 * JD-Core Version:    0.6.2
 */