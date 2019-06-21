package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class j$6$7
  implements DialogInterface.OnClickListener
{
  j$6$7(j.6 param6, List paramList, cl paramcl)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31322);
    paramDialogInterface = this.yII.iterator();
    while (true)
      if (paramDialogInterface.hasNext())
      {
        bi localbi = (bi)paramDialogInterface.next();
        if ((!localbi.dty()) && (!localbi.dtx()))
          if ((this.yOV.cvA.type == 14) && (this.yOV.cvA.cvC.wiv.size() == 0))
          {
            this.yOU.yOP.dDL();
            AppMethodBeat.o(31322);
          }
      }
    while (true)
    {
      return;
      j.6.a(this.yOU, this.yOV);
      j.6.eZ(j.c(this.yOU.yOP));
      AppMethodBeat.o(31322);
      continue;
      AppMethodBeat.o(31322);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.6.7
 * JD-Core Version:    0.6.2
 */