package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class CustomSmileyPreviewUI$6
  implements Runnable
{
  CustomSmileyPreviewUI$6(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138343);
    if (bo.isNullOrNil(this.kUJ))
    {
      ab.w("MicroMsg.emoji.CustomSmileyPreviewUI", "product id is null.");
      AppMethodBeat.o(138343);
    }
    while (true)
    {
      return;
      if ((CustomSmileyPreviewUI.q(this.kYV) != null) && (CustomSmileyPreviewUI.q(this.kYV).kSP != null))
      {
        CustomSmileyPreviewUI.q(this.kYV).bX(this.kUJ, this.gOm);
        CustomSmileyPreviewUI.q(this.kYV).refreshView();
      }
      AppMethodBeat.o(138343);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.6
 * JD-Core Version:    0.6.2
 */