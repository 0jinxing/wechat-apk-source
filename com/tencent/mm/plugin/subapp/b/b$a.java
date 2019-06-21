package com.tencent.mm.plugin.subapp.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.h.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

final class b$a
{
  public String gpA;
  public Queue<String> ssN;

  b$a(String paramString)
  {
    AppMethodBeat.i(25240);
    this.gpA = paramString;
    this.ssN = new LinkedList();
    ab.d("MicroMsg.PushMessageExtension", "DoSceneStruct:".concat(String.valueOf(paramString)));
    paramString = a.bA(ah.getContext(), paramString);
    if ((paramString == null) || (paramString.size() <= 0))
    {
      ab.e("MicroMsg.PushMessageExtension", "Parse Message Failed !");
      AppMethodBeat.o(25240);
    }
    while (true)
    {
      return;
      for (int i = 0; i < paramString.size(); i++)
      {
        Object localObject = ((a)paramString.get(i)).vfN;
        if (localObject != null)
        {
          localObject = ((Map)localObject).entrySet().iterator();
          while (((Iterator)localObject).hasNext())
            this.ssN.offer(((Map.Entry)((Iterator)localObject).next()).getValue());
        }
      }
      AppMethodBeat.o(25240);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.b.b.a
 * JD-Core Version:    0.6.2
 */