package com.tencent.mm.plugin.normsg;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.util.Base64;
import com.tencent.d.a.d.1;
import com.tencent.d.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.soter.d.d;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.CountDownLatch;

@Keep
final class Normsg$C2JBridge
{
  @Keep
  private static String c1()
  {
    AppMethodBeat.i(10255);
    String str1 = "";
    Object localObject = com.tencent.mm.lib.riskscanner.a.a.bN(ah.getContext());
    String str2 = str1;
    if (localObject != null)
    {
      str2 = str1;
      if (((Bundle)localObject).getInt("errCode", -100) == 0)
      {
        localObject = ((Bundle)localObject).getByteArray("reqBufferBase64");
        str2 = str1;
        if (localObject != null)
          str2 = Base64.encodeToString((byte[])localObject, 2);
      }
    }
    AppMethodBeat.o(10255);
    return str2;
  }

  @Keep
  private static long c2()
  {
    AppMethodBeat.i(10256);
    long l = com.tencent.mm.plugin.normsg.b.a.bVT().bVU();
    AppMethodBeat.o(10256);
    return l;
  }

  @Keep
  private static void c3(int paramInt, String paramString)
  {
    AppMethodBeat.i(10257);
    h.pYm.X(paramInt, paramString);
    AppMethodBeat.o(10257);
  }

  @Keep
  private static void c4(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(10258);
    h.pYm.k(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(10258);
  }

  @Keep
  private static void c5(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(10259);
    h.pYm.d(paramInt1, paramInt2, paramInt3, paramInt4, false);
    AppMethodBeat.o(10259);
  }

  @Keep
  private static String c6()
  {
    AppMethodBeat.i(10260);
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    Object localObject = new String[1];
    localObject[0] = "";
    com.tencent.d.e.a.e.dQs().EH();
    Context localContext = ah.getContext();
    String str = q.LK();
    Normsg.C2JBridge.1 local1 = new Normsg.C2JBridge.1((String[])localObject, localCountDownLatch);
    c localc = new c(localContext);
    com.tencent.d.e.a.e.dQs().a(localContext, str, new d.1(local1, localc));
    try
    {
      localCountDownLatch.await();
      label84: localObject = localObject[0];
      AppMethodBeat.o(10260);
      return localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label84;
    }
  }

  @Keep
  private static String c7()
  {
    AppMethodBeat.i(10261);
    String str = d.cvQ().rOh;
    if (str != null)
      AppMethodBeat.o(10261);
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(10261);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.Normsg.C2JBridge
 * JD-Core Version:    0.6.2
 */