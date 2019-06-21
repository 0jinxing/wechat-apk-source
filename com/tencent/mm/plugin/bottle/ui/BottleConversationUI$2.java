package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.plugin.bottle.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.storage.be;

final class BottleConversationUI$2
  implements DialogInterface.OnClickListener
{
  BottleConversationUI$2(BottleConversationUI paramBottleConversationUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18557);
    aw.ZK();
    paramDialogInterface = com.tencent.mm.model.c.XO().Ra(this.ewn);
    aw.ZK();
    com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.d(this.ewn, paramDialogInterface.field_msgSvrId));
    aw.ZK();
    com.tencent.mm.model.c.XL().c(new f(this.ewn));
    a.gkF.BS();
    BottleConversationUI.a(this.jKb, false);
    paramDialogInterface = this.jKb;
    Object localObject = this.jKb;
    this.jKb.getString(2131297061);
    BottleConversationUI.a(paramDialogInterface, com.tencent.mm.ui.base.h.b((Context)localObject, this.jKb.getString(2131297086), true, new BottleConversationUI.2.1(this)));
    bf.a(this.ewn, new BottleConversationUI.2.2(this));
    aw.ZK();
    com.tencent.mm.model.c.XR().aoX(this.ewn);
    paramDialogInterface = com.tencent.mm.plugin.bottle.a.d.aVM();
    localObject = com.tencent.mm.plugin.bottle.a.c.Fz(this.ewn);
    paramDialogInterface.fni.delete("bottleinfo1", "bottleid= ?", new String[] { String.valueOf(localObject) });
    a.gkF.BS();
    AppMethodBeat.o(18557);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.2
 * JD-Core Version:    0.6.2
 */