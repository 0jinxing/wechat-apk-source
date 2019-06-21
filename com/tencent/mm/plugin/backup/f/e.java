package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.backup.h.b;
import com.tencent.mm.plugin.backup.h.c;
import com.tencent.mm.plugin.backup.h.d;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.LinkedList;

public final class e
  implements l
{
  public final int a(gu paramgu, boolean paramBoolean1, bi parambi, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(17457);
    int i;
    if (parambi.field_content == null)
    {
      i = 0;
      AppMethodBeat.o(17457);
    }
    while (true)
    {
      return i;
      i = parambi.field_content.getBytes().length;
      AppMethodBeat.o(17457);
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17458);
    paramString = new String(paramgu.vED.wVI);
    h localh = d.aUr().aUs().XO();
    parambi.setContent(paramString);
    switch (paramgu.jCt)
    {
    default:
      if (parambi.field_msgId == 0L)
        c.l(parambi);
      break;
    case 50:
    }
    while (true)
    {
      AppMethodBeat.o(17458);
      return 0;
      parambi.setStatus(6);
      break;
      localh.b(paramgu.ptF, parambi);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.e
 * JD-Core Version:    0.6.2
 */