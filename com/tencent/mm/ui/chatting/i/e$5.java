package com.tencent.mm.ui.chatting.i;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.i;
import java.util.List;
import java.util.Set;

final class e$5
  implements DialogInterface.OnClickListener
{
  e$5(e parame, Set paramSet, List paramList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32564);
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "delete message");
    i.a(e.b(this.yZo), this.yUY, new e.5.1(this));
    AppMethodBeat.o(32564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.e.5
 * JD-Core Version:    0.6.2
 */