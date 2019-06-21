package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.ui.chatting.c.j;
import java.util.Set;

public final class i
{
  public static void a(Context paramContext, Set<Long> paramSet, ah paramah)
  {
    AppMethodBeat.i(30531);
    if (paramContext == null)
    {
      ab.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, context is null");
      AppMethodBeat.o(30531);
    }
    while (true)
    {
      return;
      if ((paramSet == null) || (paramSet.isEmpty()))
      {
        ab.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, select ids is empty");
        AppMethodBeat.o(30531);
      }
      else
      {
        paramContext.getString(2131297061);
        paramContext = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131298871), false, null);
        j.yOM.e(new i.a(paramSet, paramContext, paramah));
        com.tencent.mm.plugin.report.service.h.pYm.e(10811, new Object[] { Integer.valueOf(4), Integer.valueOf(paramSet.size()) });
        AppMethodBeat.o(30531);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i
 * JD-Core Version:    0.6.2
 */