package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class CustomSmileyPreviewUI$7
  implements Runnable
{
  CustomSmileyPreviewUI$7(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53227);
    if (bo.isNullOrNil(this.kUJ))
    {
      ab.w("MicroMsg.emoji.CustomSmileyPreviewUI", "product id is null.");
      AppMethodBeat.o(53227);
    }
    while (true)
    {
      return;
      if ((CustomSmileyPreviewUI.q(this.kYV) != null) && (CustomSmileyPreviewUI.q(this.kYV).kSP != null))
        CustomSmileyPreviewUI.q(this.kYV).bW(this.kUJ, this.fTG);
      AppMethodBeat.o(53227);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.7
 * JD-Core Version:    0.6.2
 */