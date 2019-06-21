package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.at.e;
import com.tencent.mm.at.f;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class MsgRetransmitUI$10
  implements d.a
{
  MsgRetransmitUI$10(MsgRetransmitUI paramMsgRetransmitUI, String paramString1, int paramInt, String paramString2, String paramString3)
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
    AppMethodBeat.i(35072);
    if ((paramInt3 == 0) && (paramInt4 == 0));
    for (paramInt1 = 1; (paramObject instanceof HashMap); paramInt1 = 0)
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
        this.zJr.fileName = o.ahl().q(f.c(paramm), "", "");
        if (paramInt1 != 0)
        {
          aw.ZK();
          c.XO().jg(paramString.longValue());
          MsgRetransmitUI.a(this.zJr, this.fwC, this.jOj, this.yIy, this.yIz, MsgRetransmitUI.h(this.zJr), paramLong1);
        }
      }
    }
    AppMethodBeat.o(35072);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.10
 * JD-Core Version:    0.6.2
 */