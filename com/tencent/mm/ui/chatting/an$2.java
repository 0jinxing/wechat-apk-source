package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ad;
import java.util.List;

public final class an$2
  implements DialogInterface.OnClickListener
{
  public an$2(Context paramContext, ad paramad, List paramList, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31034);
    an.a(this.val$context, this.emj, this.yMq, this.yMr);
    AppMethodBeat.o(31034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.an.2
 * JD-Core Version:    0.6.2
 */