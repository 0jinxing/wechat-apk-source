package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "i", "", "onClick"})
final class g$b$1
  implements DialogInterface.OnClickListener
{
  g$b$1(g.b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(15338);
    if (paramDialogInterface == null)
    {
      paramDialogInterface = "";
      if (!bo.isNullOrNil(paramDialogInterface))
        break label55;
    }
    label55: for (paramInt = 1; ; paramInt = 5)
    {
      g.b(this.jYW.jYV).ao(paramInt, paramDialogInterface);
      AppMethodBeat.o(15338);
      return;
      paramDialogInterface = ((c)paramDialogInterface).dKV();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g.b.1
 * JD-Core Version:    0.6.2
 */