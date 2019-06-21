package com.tencent.mm.plugin.emojicapture.ui;

import a.a.e;
import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.c;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "", "kotlin.jvm.PlatformType", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V"})
final class EmojiCaptureUI$c
  implements c
{
  EmojiCaptureUI$c(EmojiCaptureUI paramEmojiCaptureUI)
  {
  }

  public final void r(int[] paramArrayOfInt)
  {
    int i = 1;
    AppMethodBeat.i(2866);
    j.o(paramArrayOfInt, "grantResults");
    int j = paramArrayOfInt.length;
    int k = 0;
    int m;
    if (k < j)
      if (paramArrayOfInt[k] != 0)
      {
        m = 1;
        label36: if (m == 0)
          break label121;
        k = i;
        label44: if (k != 0)
        {
          k = 2131301920;
          paramArrayOfInt = e.j(paramArrayOfInt, 0);
          if (paramArrayOfInt != null)
            break label133;
        }
      }
    while (true)
    {
      h.a((Context)this.llk.dxU(), k, 2131301936, 2131300878, 2131296868, false, (DialogInterface.OnClickListener)new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(2864);
          j.p(paramAnonymousDialogInterface, "dialog");
          paramAnonymousDialogInterface.dismiss();
          this.lll.llk.dxU().startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          AppMethodBeat.o(2864);
        }
      }
      , (DialogInterface.OnClickListener)new EmojiCaptureUI.c.2(this));
      AppMethodBeat.o(2866);
      return;
      m = 0;
      break label36;
      label121: k++;
      break;
      k = 0;
      break label44;
      label133: if (paramArrayOfInt.intValue() == 0)
        k = 2131301928;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.c
 * JD-Core Version:    0.6.2
 */