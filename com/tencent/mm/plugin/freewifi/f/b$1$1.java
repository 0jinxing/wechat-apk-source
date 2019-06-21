package com.tencent.mm.plugin.freewifi.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.acl;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

final class b$1$1
  implements com.tencent.mm.ai.f
{
  b$1$1(b.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20868);
    try
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiServerReporter", "errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if (com.tencent.mm.plugin.freewifi.m.eg(paramInt1, paramInt2))
      {
        paramm = ((com.tencent.mm.plugin.freewifi.d.e)paramm).bzl();
        if ((paramm != null) && (paramm.size() > 0))
        {
          paramString = j.byY();
          paramm = paramm.iterator();
          while (paramm.hasNext())
          {
            Object localObject = (acl)paramm.next();
            String str = ((acl)localObject).id;
            paramInt1 = ((acl)localObject).cyE;
            ab.i("MicroMsg.FreeWifi.FreeWifiServerReporter", "resp LinkedList<FreeWifiReport>. id=%s, errcode=%d", new Object[] { str, Integer.valueOf(paramInt1) });
            if ((!com.tencent.mm.plugin.freewifi.m.isEmpty(str)) && (paramInt1 == 0))
            {
              ab.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "delete. id=%s", new Object[] { str });
              localObject = new com/tencent/mm/plugin/freewifi/g/e;
              ((com.tencent.mm.plugin.freewifi.g.e)localObject).<init>();
              ((com.tencent.mm.plugin.freewifi.g.e)localObject).field_id = str;
              ab.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "delete ret".concat(String.valueOf(paramString.a((c)localObject, new String[0]))));
            }
          }
        }
      }
    }
    catch (Exception paramString)
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiServerReporter", com.tencent.mm.plugin.freewifi.m.h(paramString));
      while (true)
      {
        return;
        b.access$002(true);
        AppMethodBeat.o(20868);
      }
    }
    finally
    {
      b.access$002(true);
      AppMethodBeat.o(20868);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.f.b.1.1
 * JD-Core Version:    0.6.2
 */