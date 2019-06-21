package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.io.File;

final class RecordMsgFileUI$12$1
  implements Runnable
{
  RecordMsgFileUI$12$1(RecordMsgFileUI.12 param12, Bitmap paramBitmap, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24266);
    Object localObject = (ImageView)this.pKN.pKI.findViewById(2131823993);
    ((ImageView)localObject).setImageBitmap(this.pKM);
    ((ImageView)localObject).setVisibility(0);
    localObject = new Intent();
    ((Intent)localObject).setAction("android.intent.action.VIEW");
    k.a(this.pKN.pKI.mController.ylL, (Intent)localObject, new File(this.hPW), "video/*");
    try
    {
      this.pKN.pKI.startActivity(Intent.createChooser((Intent)localObject, this.pKN.pKI.getString(2131299761)));
      AppMethodBeat.o(24266);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RecordMsgFileUI", "startActivity fail, activity not found");
        h.g(this.pKN.pKI.mController.ylL, 2131299668, 2131299669);
        AppMethodBeat.o(24266);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.12.1
 * JD-Core Version:    0.6.2
 */