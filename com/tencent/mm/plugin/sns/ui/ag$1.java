package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class ag$1 extends v.a
{
  ag$1(ag paramag)
  {
  }

  public final void DO(int paramInt)
  {
    AppMethodBeat.i(38476);
    ab.d("MicroMsg.PicWidget", "I click");
    if (paramInt < 0)
    {
      this.rlW.cst();
      AppMethodBeat.o(38476);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setClass(this.rlW.crP, SnsUploadBrowseUI.class);
      localIntent.putExtra("sns_gallery_position", paramInt);
      localIntent.putExtra("sns_gallery_temp_paths", this.rlW.rlP.rma);
      this.rlW.crP.startActivityForResult(localIntent, 7);
      AppMethodBeat.o(38476);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag.1
 * JD-Core Version:    0.6.2
 */