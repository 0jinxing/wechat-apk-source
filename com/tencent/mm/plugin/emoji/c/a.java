package com.tencent.mm.plugin.emoji.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.f.s;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public final class a extends c<mp>
{
  public a()
  {
    AppMethodBeat.i(52807);
    this.xxI = mp.class.getName().hashCode();
    AppMethodBeat.o(52807);
  }

  public static void bjE()
  {
    AppMethodBeat.i(52810);
    boolean bool = bo.a((Boolean)g.RP().Ry().get(348162, null), false);
    Object localObject;
    if ((!bo.a((Boolean)g.RP().Ry().get(ac.a.xJc, null), false)) && (bool))
    {
      localObject = g.RP().Ry().get(348163, null);
      if ((localObject == null) || (!(localObject instanceof Long)))
        break label401;
    }
    label393: label401: for (long l = ((Long)localObject).longValue(); ; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 3600000L)
      {
        i = 1;
        if (i == 0)
          break label393;
        ab.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] start do backup emoji.");
        localObject = (ArrayList)j.getEmojiStorageMgr().xYn.Mz(0);
        if (((ArrayList)localObject).size() > 0)
          break label171;
        ab.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] no local emoji need not to backup ");
        g.RP().Ry().set(348162, Boolean.FALSE);
        AppMethodBeat.o(52810);
      }
      while (true)
      {
        return;
        i = 0;
        break;
        i = 0;
        break;
        label171: g.RP().Ry().set(348163, Long.valueOf(System.currentTimeMillis()));
        ab.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] start backup local emoji ");
        if (((ArrayList)localObject).size() > 50)
        {
          int j = ((ArrayList)localObject).size();
          int k = j / 50;
          ab.i("MicroMsg.emoji.EmojiPostTaskListener", "count:%d", new Object[] { Integer.valueOf(k) });
          i = 0;
          if (i <= k)
          {
            ArrayList localArrayList = new ArrayList();
            int m = i * 50;
            if ((i + 1) * 50 - 1 >= j);
            for (int n = j; ; n = (i + 1) * 50)
            {
              ab.i("MicroMsg.emoji.EmojiPostTaskListener", "start index:%d to index:%d", new Object[] { Integer.valueOf(m), Integer.valueOf(n) });
              if (n > m)
              {
                localArrayList.addAll(((ArrayList)localObject).subList(m, n));
                g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.d(localArrayList), 0);
              }
              i++;
              break;
            }
          }
          AppMethodBeat.o(52810);
        }
        else
        {
          g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.d((ArrayList)localObject), 0);
          AppMethodBeat.o(52810);
        }
      }
    }
  }

  public static void gm(boolean paramBoolean)
  {
    AppMethodBeat.i(52808);
    Object localObject = g.RP().Ry().get(ac.a.xJd, null);
    if ((localObject != null) && ((localObject instanceof Long)));
    for (long l = ((Long)localObject).longValue(); ; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 86400000L)
      {
        i = 1;
        if ((i == 0) && (!paramBoolean))
          break label158;
        boolean bool = j.getEmojiStorageMgr().xYo.duJ();
        ab.i("MicroMsg.emoji.EmojiPostTaskListener", "uploadStoreEmoji need upload:%b", new Object[] { Boolean.valueOf(bool) });
        if ((!bool) && (!paramBoolean))
          break label143;
        localObject = new s(j.getEmojiStorageMgr().xYo.duL(), 1);
        g.RO().eJo.a((m)localObject, 0);
        AppMethodBeat.o(52808);
      }
      while (true)
      {
        return;
        i = 0;
        break;
        label143: g.RP().Ry().set(ac.a.xJg, Boolean.TRUE);
        label158: AppMethodBeat.o(52808);
      }
    }
  }

  public static void gn(boolean paramBoolean)
  {
    AppMethodBeat.i(52809);
    Object localObject;
    if (bo.a((Boolean)g.RP().Ry().get(348165, null), false))
    {
      localObject = g.RP().Ry().get(348166, null);
      if ((localObject == null) || (!(localObject instanceof Long)))
        break label277;
    }
    label277: for (long l = ((Long)localObject).longValue(); ; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 3600000L)
        i = 1;
      while ((i != 0) || (paramBoolean))
      {
        ArrayList localArrayList = j.getEmojiStorageMgr().xYn.dvh();
        if (localArrayList.size() <= 0)
          break label252;
        ab.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji uploadEmojiList:%d", new Object[] { Integer.valueOf(localArrayList.size()) });
        localObject = new ArrayList();
        int j = localArrayList.size();
        i = 0;
        while (true)
          if (i < j)
          {
            ((ArrayList)localObject).add(new com.tencent.mm.plugin.emoji.sync.a.d((String)localArrayList.get(i)));
            ab.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji upload Emoji:%s", new Object[] { localArrayList.get(i) });
            i++;
            continue;
            i = 0;
            break;
            i = 0;
            break;
          }
        j.bkj().kXj.bt((List)localObject);
        j.bkj().kXj.bkG();
      }
      while (true)
      {
        g.RP().Ry().set(348166, Long.valueOf(System.currentTimeMillis()));
        AppMethodBeat.o(52809);
        return;
        label252: ab.i("MicroMsg.emoji.EmojiPostTaskListener", "no things need to upload.");
        g.RP().Ry().set(348165, Boolean.FALSE);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.c.a
 * JD-Core Version:    0.6.2
 */