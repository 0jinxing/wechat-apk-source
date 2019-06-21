package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.e.b;
import com.tencent.mm.sdk.platformtools.bo;

final class SnsMsgUI$10 extends b
{
  SnsMsgUI$10(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final void a(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(39075);
    super.a(paramString, paramLong, paramInt);
    if ((paramInt > 0) && (!bo.isNullOrNil(paramString)) && (paramString.endsWith(this.rub.getClass().getSimpleName())))
      SnsMsgUI.a(this.rub, SnsMsgUI.b(this.rub) + paramInt);
    AppMethodBeat.o(39075);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.10
 * JD-Core Version:    0.6.2
 */