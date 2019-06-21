package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.at.e;
import com.tencent.mm.at.f;
import com.tencent.mm.at.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class j$3
  implements d.a
{
  j$3(Context paramContext, String paramString1, e parame, String paramString2)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, m paramm)
  {
    AppMethodBeat.i(30534);
    if ((paramInt3 == 0) && (paramInt4 == 0));
    for (paramInt2 = 1; (paramObject instanceof HashMap); paramInt2 = 0)
    {
      paramObject = (HashMap)paramObject;
      if (paramObject == null)
        break;
      paramObject = paramObject.entrySet().iterator();
      while (paramObject.hasNext())
      {
        paramm = (Map.Entry)paramObject.next();
        paramString = (Long)paramm.getKey();
        paramm = (e)paramm.getValue();
        paramm = o.ahl().q(f.c(paramm), "", "");
        if (paramInt2 != 0)
        {
          aw.ZK();
          c.XO().jg(paramString.longValue());
          com.tencent.mm.plugin.messenger.a.g.bOk().a(this.val$context, this.fwC, paramm, paramInt1, this.fFp.fDK, this.fED);
        }
      }
    }
    AppMethodBeat.o(30534);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.3
 * JD-Core Version:    0.6.2
 */