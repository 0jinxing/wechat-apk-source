package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ep;
import com.tencent.mm.protocal.protobuf.kl;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"})
final class MPVideoWriteCommentLayout$a$d$a
  implements DialogInterface.OnClickListener
{
  MPVideoWriteCommentLayout$a$d$a(MPVideoWriteCommentLayout.a.d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(15283);
    paramDialogInterface = new ep();
    paramDialogInterface.vGr = this.jYm.jXm.vGr;
    paramDialogInterface.kdC = 2;
    this.jYm.jYk.jWx.a(paramDialogInterface);
    AppMethodBeat.o(15283);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.a.d.a
 * JD-Core Version:    0.6.2
 */