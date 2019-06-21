package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class EmojiStoreV2DesignerUI$11
  implements a.a
{
  EmojiStoreV2DesignerUI$11(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI)
  {
  }

  public final void tY(int paramInt)
  {
    AppMethodBeat.i(53589);
    xx localxx;
    if ((EmojiStoreV2DesignerUI.f(this.ldL) != null) && (EmojiStoreV2DesignerUI.g(this.ldL) != null))
    {
      localxx = EmojiStoreV2DesignerUI.g(this.ldL).uo(paramInt);
      if (localxx != null)
        h.pYm.e(12787, new Object[] { Integer.valueOf(1), Integer.valueOf(0), localxx.Md5, Long.valueOf(EmojiStoreV2DesignerUI.h(this.ldL)), localxx.wdC, localxx.ProductID, Integer.valueOf(6) });
    }
    while (true)
    {
      try
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.putExtra("extra_object", localxx.toByteArray());
        localIntent.putExtra("add_source", 5);
        localIntent.putExtra("entrance_scene", 6);
        localIntent.setClass(this.ldL.mController.ylL, EmojiStoreV2SingleProductDialogUI.class);
        this.ldL.startActivityForResult(localIntent, 2004);
        this.ldL.overridePendingTransition(2131034216, 2131034221);
        AppMethodBeat.o(53589);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(53589);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.11
 * JD-Core Version:    0.6.2
 */