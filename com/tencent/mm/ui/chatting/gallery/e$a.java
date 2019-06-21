package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class e$a
{
  private static HashMap<String, a> yVm;
  private long cmn = 0L;
  private int frO;
  private int height;
  private int width;
  private int yVj = 0;
  private String yVk = "";
  private int yVl = 0;

  static
  {
    AppMethodBeat.i(32091);
    yVm = new HashMap();
    AppMethodBeat.o(32091);
  }

  public static void eD(String paramString, int paramInt)
  {
    AppMethodBeat.i(32089);
    try
    {
      boolean bool = bo.isNullOrNil(paramString);
      if ((bool) || (paramInt == 0))
      {
        AppMethodBeat.o(32089);
        return;
      }
      paramString = (a)yVm.get(paramString);
      if (paramString != null)
        paramString.frO = paramInt;
      localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      localObject = yVm.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        paramString = (a)yVm.get(str);
        if (paramString != null)
        {
          long l = bo.gb(paramString.cmn);
          ab.i("MicroMsg.ImageGalleryHolderImage", "dkprog report: diff:%d [%d,%d,%d] succ:%d change:%d str:%s file:%s", new Object[] { Long.valueOf(l), Integer.valueOf(paramString.frO), Integer.valueOf(paramString.width), Integer.valueOf(paramString.height), Integer.valueOf(paramString.yVj), Integer.valueOf(paramString.yVl), paramString.yVk, str });
          if (l >= 60000L)
          {
            if ((paramString.frO > 0) && (!bo.isNullOrNil(paramString.yVk)))
              h.pYm.e(11713, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(41), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramString.frO), Integer.valueOf(paramString.width), Integer.valueOf(paramString.height), Integer.valueOf(paramString.yVj), Integer.valueOf(paramString.yVl), paramString.yVk });
            localHashSet.add(str);
          }
        }
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        HashSet localHashSet;
        Object localObject;
        ab.e("MicroMsg.ImageGalleryHolderImage", "get useopt  setTotalLen :%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(32089);
        continue;
        paramString = localHashSet.iterator();
        while (paramString.hasNext())
        {
          localObject = (String)paramString.next();
          yVm.remove(localObject);
        }
        AppMethodBeat.o(32089);
      }
    }
  }

  public static void p(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(32090);
    try
    {
      boolean bool = bo.isNullOrNil(paramString);
      if ((bool) || (paramInt1 == 0) || (paramInt2 == 0))
      {
        AppMethodBeat.o(32090);
        return;
      }
      Object localObject1 = (a)yVm.get(paramString);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new com/tencent/mm/ui/chatting/gallery/e$a;
        ((a)localObject2).<init>();
        ((a)localObject2).cmn = bo.anU();
        yVm.put(paramString, localObject2);
      }
      ((a)localObject2).height = paramInt2;
      ((a)localObject2).width = paramInt1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((a)localObject2).yVk = (((a)localObject2).yVk + paramInt3 + "|");
      if (paramInt3 > 0)
        if (((a)localObject2).yVj == 0)
          ((a)localObject2).yVj = paramInt3;
      while (true)
      {
        ab.i("MicroMsg.ImageGalleryHolderImage", "dkprog addBit: [%d,%d,%d] succ:%d change:%d str:%s file:%s", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(((a)localObject2).yVj), Integer.valueOf(((a)localObject2).yVl), ((a)localObject2).yVk, paramString });
        AppMethodBeat.o(32090);
        break;
        if (((a)localObject2).yVj != 0)
        {
          ((a)localObject2).yVl += 1;
          ((a)localObject2).yVj = 0;
        }
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.ImageGalleryHolderImage", "get useopt  addBit :%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(32090);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.e.a
 * JD-Core Version:    0.6.2
 */