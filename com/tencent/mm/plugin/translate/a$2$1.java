package com.tencent.mm.plugin.translate;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.th;
import com.tencent.mm.g.a.th.a;
import com.tencent.mm.plugin.translate.a.c;
import com.tencent.mm.plugin.translate.a.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

final class a$2$1
  implements Runnable
{
  a$2$1(a.2 param2, th paramth)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26050);
    c localc = this.sKu.sKq.sKl;
    String str1 = this.sKt.cPy.cPz;
    Object localObject = this.sKt.cPy.id;
    int i = this.sKt.cPy.type;
    String str2 = this.sKt.cPy.source;
    boolean bool = this.sKt.cPy.cPA;
    byte[] arrayOfByte = this.sKt.cPy.cPB;
    ab.d("MicroMsg.TranslateServiceManager", "doTranslate msgId : %s, type: %d", new Object[] { localObject, Integer.valueOf(i) });
    if (localc.abQ((String)localObject))
    {
      ab.d("MicroMsg.TranslateServiceManager", "doTranslate msgId %s is inQueue", new Object[] { localObject });
      AppMethodBeat.o(26050);
      return;
    }
    localObject = new c.c(str1, (String)localObject, i, str2, arrayOfByte);
    if (bool)
      ((LinkedList)localc.sKx).add(0, localObject);
    while (true)
    {
      localc.sKy.put(((c.c)localObject).id, Integer.valueOf(((c.c)localObject).sKB));
      ab.d("MicroMsg.TranslateServiceManager", "requestCount : %s", new Object[] { Integer.valueOf(localc.exv) });
      localc.cHI();
      AppMethodBeat.o(26050);
      break;
      localc.sKx.add(localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.2.1
 * JD-Core Version:    0.6.2
 */