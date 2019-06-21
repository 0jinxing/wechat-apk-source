package com.tencent.mm.plugin.websearch.widget.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.g.b.a.ae;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;

public final class c
{
  public static boolean H(long paramLong, int paramInt)
  {
    boolean bool = true;
    if ((1 << paramInt & paramLong) > 0L);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public static void c(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(91462);
    ab.e("WidgetPermissionUtil", "permissionFailed appid %s, api %s, args %s", new Object[] { paramString1, paramString2, Arrays.toString(paramArrayOfString) });
    h.pYm.k(930L, 0L, 1L);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i <= 0; i++)
      localStringBuilder.append(q.encode(paramArrayOfString[0])).append("&");
    new ae().fd(paramString2).fc(paramString1).aS(System.currentTimeMillis()).fe(localStringBuilder.toString()).ajK();
    AppMethodBeat.o(91462);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.c.c
 * JD-Core Version:    0.6.2
 */