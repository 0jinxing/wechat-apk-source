package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsMsgUI$8
  implements k.a
{
  SnsMsgUI$8(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(39073);
    af.bCo().post(new SnsMsgUI.8.1(this));
    AppMethodBeat.o(39073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.8
 * JD-Core Version:    0.6.2
 */