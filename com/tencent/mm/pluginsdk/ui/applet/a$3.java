package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.cnh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class a$3
  implements DialogInterface.OnClickListener
{
  a$3(a parama, com.tencent.mm.ai.m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79702);
    ab.d("MicroMsg.AddContact", "dealwith verify relation out of date");
    paramDialogInterface = (com.tencent.mm.pluginsdk.model.m)this.crb;
    if ((paramDialogInterface.ehh != null) && (paramDialogInterface.ehh.acF() != null));
    for (paramDialogInterface = ((cnh)paramDialogInterface.ehh.fsG.fsP).xkP; ; paramDialogInterface = null)
    {
      List localList = ((com.tencent.mm.pluginsdk.model.m)this.crb).vbm;
      if ((localList != null) && (localList.size() > 0))
        this.vjR.e((String)localList.get(0), paramDialogInterface);
      AppMethodBeat.o(79702);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.a.3
 * JD-Core Version:    0.6.2
 */