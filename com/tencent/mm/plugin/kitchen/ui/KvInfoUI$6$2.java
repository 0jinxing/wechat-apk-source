package com.tencent.mm.plugin.kitchen.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class KvInfoUI$6$2
  implements DialogInterface.OnClickListener
{
  KvInfoUI$6$2(KvInfoUI.6 param6, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(114447);
    try
    {
      ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("kv_info", this.nHo));
      Toast.makeText(this.nHn.nHk.mController.ylL, this.nHn.nHk.mController.ylL.getString(2131296876), 0).show();
      AppMethodBeat.o(114447);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.KvInfoUI", "copy error [%s]", new Object[] { paramDialogInterface.toString() });
        Toast.makeText(this.nHn.nHk.mController.ylL, "copy failure", 0).show();
        AppMethodBeat.o(114447);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.ui.KvInfoUI.6.2
 * JD-Core Version:    0.6.2
 */