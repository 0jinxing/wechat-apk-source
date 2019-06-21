package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

public final class f extends j<e>
  implements g.a
{
  public static final String[] fnj;
  private com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(62848);
    fnj = new String[] { j.a(e.ccO, "EmojiSuggestDescInfo") };
    AppMethodBeat.o(62848);
  }

  public f(com.tencent.mm.sdk.e.e parame)
  {
    this(parame, e.ccO, "EmojiSuggestDescInfo");
  }

  private f(com.tencent.mm.sdk.e.e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.bSd = parame;
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final boolean am(ArrayList<ArrayList<String>> paramArrayList)
  {
    AppMethodBeat.i(62847);
    if (paramArrayList.isEmpty())
    {
      ab.i("MicroMsg.emoji.EmojiDescMapStorage", "group list is null.");
      AppMethodBeat.o(62847);
      return false;
    }
    h localh;
    long l;
    if ((this.bSd instanceof h))
    {
      localh = (h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
    }
    while (true)
    {
      this.bSd.delete("EmojiSuggestDescInfo", "", null);
      paramArrayList = paramArrayList.iterator();
      int i = 0;
      label78: if (paramArrayList.hasNext())
      {
        Object localObject = (ArrayList)paramArrayList.next();
        if ((localObject == null) || (((ArrayList)localObject).isEmpty()))
          break label218;
        Iterator localIterator = ((ArrayList)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          if (!bo.isNullOrNil((String)localObject))
          {
            ab.d("MicroMsg.emoji.EmojiDescMapStorage", "insert groupID%s, word:%s", new Object[] { String.valueOf(i), localObject });
            b(new e(String.valueOf(i), (String)localObject));
          }
        }
        i++;
      }
      label218: 
      while (true)
      {
        break label78;
        if (localh != null)
          localh.mB(l);
        AppMethodBeat.o(62847);
        break;
      }
      l = -1L;
      localh = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.f
 * JD-Core Version:    0.6.2
 */