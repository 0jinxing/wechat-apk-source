package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class EmojiStoreV2SingleProductUI$10
  implements a.a
{
  EmojiStoreV2SingleProductUI$10(EmojiStoreV2SingleProductUI paramEmojiStoreV2SingleProductUI)
  {
  }

  public final void tY(int paramInt)
  {
    AppMethodBeat.i(53754);
    xx localxx;
    if ((EmojiStoreV2SingleProductUI.h(this.lfC) != null) && (EmojiStoreV2SingleProductUI.c(this.lfC) != null))
    {
      localxx = EmojiStoreV2SingleProductUI.c(this.lfC).uo(paramInt);
      if (localxx == null);
    }
    while (true)
    {
      try
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.putExtra("Select_Conv_User", EmojiStoreV2SingleProductUI.i(this.lfC));
        localIntent.putExtra("extra_object", localxx.toByteArray());
        localIntent.putExtra("scene", EmojiStoreV2SingleProductUI.j(this.lfC));
        localIntent.putExtra("searchID", EmojiStoreV2SingleProductUI.k(this.lfC));
        localIntent.putExtra("add_source", 5);
        localIntent.putExtra("entrance_scene", 29);
        localIntent.setClass(this.lfC.mController.ylL, EmojiStoreV2SingleProductDialogUI.class);
        this.lfC.startActivityForResult(localIntent, 5001);
        this.lfC.overridePendingTransition(2131034216, 2131034221);
        h.pYm.e(12787, new Object[] { Integer.valueOf(EmojiStoreV2SingleProductUI.j(this.lfC)), Integer.valueOf(0), localxx.Md5, Long.valueOf(EmojiStoreV2SingleProductUI.k(this.lfC)), localxx.wdC, localxx.ProductID, Integer.valueOf(29) });
        AppMethodBeat.o(53754);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(53754);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.10
 * JD-Core Version:    0.6.2
 */