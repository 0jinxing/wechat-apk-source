package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bc;
import java.io.File;
import java.io.IOException;

final class j$5
  implements DialogInterface.OnClickListener
{
  j$5(j paramj, Intent paramIntent)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7646);
    try
    {
      paramDialogInterface = this.utN.cZv().getDir("expose", 0);
      paramDialogInterface.mkdirs();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramDialogInterface = paramDialogInterface.getAbsolutePath() + "/screenshot.jpg";
      com.tencent.mm.sdk.platformtools.d.a(bc.am(this.utN.cZv()), 75, Bitmap.CompressFormat.JPEG, paramDialogInterface, true);
      this.val$intent.putExtra("k_webview_img", paramDialogInterface);
      com.tencent.mm.bp.d.b(this.utN.cZv(), "webview", ".ui.tools.WebViewUI", this.val$intent);
      AppMethodBeat.o(7646);
      return;
    }
    catch (IOException paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewMenuHelper", "[oneliang]save screen shot to file error, ex = " + paramDialogInterface.getMessage());
        AppMethodBeat.o(7646);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.5
 * JD-Core Version:    0.6.2
 */