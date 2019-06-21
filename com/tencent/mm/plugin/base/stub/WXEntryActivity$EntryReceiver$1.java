package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WXEntryActivity$EntryReceiver$1
  implements com.tencent.mm.kernel.api.g
{
  WXEntryActivity$EntryReceiver$1(WXEntryActivity.EntryReceiver paramEntryReceiver, Context paramContext, Intent paramIntent)
  {
  }

  public final void BR()
  {
    AppMethodBeat.i(18194);
    com.tencent.mm.kernel.g.RQ().b(this);
    WXEntryActivity.EntryReceiver.a(this.jEf, this.val$context, this.val$data);
    AppMethodBeat.o(18194);
  }

  public final void bi(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver.1
 * JD-Core Version:    0.6.2
 */