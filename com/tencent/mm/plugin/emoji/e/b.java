package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class b
{
  static void IY(String paramString)
  {
    AppMethodBeat.i(52823);
    for (String str : paramString.replace("delete", "").trim().split(","))
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Je(str).duQ();
    AppMethodBeat.o(52823);
  }

  static void IZ(String paramString)
  {
    AppMethodBeat.i(52824);
    paramString = paramString.split(" ");
    if (paramString.length <= 1)
      AppMethodBeat.o(52824);
    while (true)
    {
      return;
      if (paramString[1].equals("custom"))
      {
        paramString = at.dsZ().xYz.OC().iterator();
        while (paramString.hasNext())
          ((EmojiInfo)paramString.next()).duQ();
        AppMethodBeat.o(52824);
      }
      else
      {
        if (paramString[1].equals("customRandom"))
        {
          Random localRandom = new Random();
          paramString = at.dsZ().xYz.OC().iterator();
          while (paramString.hasNext())
          {
            EmojiInfo localEmojiInfo = (EmojiInfo)paramString.next();
            if (localRandom.nextBoolean())
              localEmojiInfo.duQ();
          }
        }
        AppMethodBeat.o(52824);
      }
    }
  }

  static void Ja(String paramString)
  {
    AppMethodBeat.i(52825);
    String[] arrayOfString = paramString.replace("add", "").trim().split(",");
    paramString = new ArrayList();
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      paramString.add(new com.tencent.mm.plugin.emoji.sync.a.a(arrayOfString[j], "", "", "", "", "", "", "", "", ""));
    j.bkj().kXj.bs(paramString);
    j.bkj().kXj.bkG();
    AppMethodBeat.o(52825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.b
 * JD-Core Version:    0.6.2
 */