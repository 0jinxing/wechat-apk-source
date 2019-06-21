package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.kf;
import com.tencent.mm.protocal.protobuf.kg;
import java.util.LinkedList;

final class c$4
  implements DialogInterface.OnClickListener
{
  c$4(c paramc, LinkedList paramLinkedList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31196);
    paramDialogInterface = new kg();
    for (paramInt = 0; paramInt < this.yOk.size(); paramInt++)
    {
      kf localkf = new kf();
      localkf.vNc = ((String)this.yOk.get(paramInt));
      paramDialogInterface.vNd.add(localkf);
    }
    c.a(this.yOi, paramDialogInterface);
    AppMethodBeat.o(31196);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.4
 * JD-Core Version:    0.6.2
 */