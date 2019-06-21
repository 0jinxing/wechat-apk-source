package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b;
import com.tencent.mm.plugin.backup.bakoldlogic.d.c;
import com.tencent.mm.plugin.backup.bakoldlogic.d.d;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;

public final class f
  implements j
{
  public final int a(gu paramgu, bi parambi, LinkedList<u> paramLinkedList)
  {
    AppMethodBeat.i(17791);
    int i;
    if (parambi.field_content == null)
    {
      i = 0;
      AppMethodBeat.o(17791);
    }
    while (true)
    {
      return i;
      i = parambi.field_content.getBytes().length;
      AppMethodBeat.o(17791);
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17792);
    String str = new String(paramgu.vED.wVI);
    paramString = b.aUY().aUZ().XO();
    parambi.setContent(str);
    switch (paramgu.jCt)
    {
    default:
      if (parambi.field_msgId == 0L)
        d.l(parambi);
      break;
    case 50:
    }
    while (true)
    {
      AppMethodBeat.o(17792);
      return 0;
      parambi.setStatus(6);
      break;
      paramString.b(paramgu.ptF, parambi);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.f
 * JD-Core Version:    0.6.2
 */