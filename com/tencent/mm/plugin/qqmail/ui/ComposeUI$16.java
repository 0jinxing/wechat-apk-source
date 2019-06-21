package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.io.File;

final class ComposeUI$16
  implements DialogInterface.OnClickListener
{
  ComposeUI$16(ComposeUI paramComposeUI, int paramInt, File paramFile, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(68194);
    if (ComposeUI.E(this.pwY).cde() + this.ewg > 52428800)
    {
      h.a(this.pwY, 2131302006, 2131297061, null);
      AppMethodBeat.o(68194);
      return;
    }
    EditText localEditText;
    if (ComposeUI.j(this.pwY).getText().toString().trim().length() == 0)
    {
      paramDialogInterface = this.val$file.getName().trim();
      paramInt = paramDialogInterface.lastIndexOf(".");
      localEditText = ComposeUI.j(this.pwY);
      if (paramInt <= 0)
        break label153;
    }
    while (true)
    {
      localEditText.setText(paramDialogInterface.substring(0, paramInt));
      ab.i("MicroMsg.ComposeUI", "in upload file mode = %d", new Object[] { Integer.valueOf(ComposeUI.a(this.pwY)) });
      ComposeUI.E(this.pwY).fG(this.bSt, null);
      AppMethodBeat.o(68194);
      break;
      label153: paramInt = paramDialogInterface.length();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.16
 * JD-Core Version:    0.6.2
 */