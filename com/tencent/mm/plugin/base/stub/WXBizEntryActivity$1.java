package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;

final class WXBizEntryActivity$1
  implements d.a
{
  WXBizEntryActivity$1(WXBizEntryActivity paramWXBizEntryActivity)
  {
  }

  public final void ft(boolean paramBoolean)
  {
    AppMethodBeat.i(18135);
    if (paramBoolean)
      d.c(this.jDz, "game", ".ui.CreateOrJoinChatroomUI", this.jDz.getIntent());
    while (true)
    {
      this.jDz.finish();
      AppMethodBeat.o(18135);
      return;
      ab.e("MicroMsg.WXBizEntryActivity", "openIdCheck false");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXBizEntryActivity.1
 * JD-Core Version:    0.6.2
 */