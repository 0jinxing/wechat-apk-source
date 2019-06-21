package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.h;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.model.n;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  public static void a(c paramc, h.a parama)
  {
    AppMethodBeat.i(52774);
    if (!r.YL())
      AppMethodBeat.o(52774);
    while (true)
    {
      return;
      if ((paramc == null) || (paramc.size() <= 0))
      {
        AppMethodBeat.o(52774);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramc.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (f)localIterator.next();
          if ((localObject != null) && (((f)localObject).kTa != f.a.kTj))
          {
            localObject = ((f)localObject).kTb;
            boolean bool1 = e.b((EmotionSummary)localObject);
            boolean bool2 = e.a((EmotionSummary)localObject);
            if ((!bool1) && (!bool2))
            {
              localArrayList.add(((EmotionSummary)localObject).ProductID);
              localObject = paramc.IW(((EmotionSummary)localObject).ProductID);
              if (localObject != null)
                ((ar)localObject).xXX = 11;
            }
          }
        }
        paramc = ah.getContext();
        if (localArrayList.size() > 0)
          h.a(paramc, (String[])localArrayList.toArray(new String[localArrayList.size()]), parama);
        AppMethodBeat.o(52774);
      }
    }
  }

  public static void a(ArrayList<n> paramArrayList, c paramc)
  {
    AppMethodBeat.i(52775);
    if (!r.YL())
      AppMethodBeat.o(52775);
    while (true)
    {
      return;
      if ((paramc == null) || (paramArrayList == null) || (paramArrayList.size() <= 0))
      {
        AppMethodBeat.o(52775);
      }
      else
      {
        Iterator localIterator = paramArrayList.iterator();
        label251: 
        while (localIterator.hasNext())
        {
          paramArrayList = (n)localIterator.next();
          if (paramArrayList != null)
          {
            ab.i("MicroMsg.EmojiGoogleMarketTool", "endSeachGoogleMarket: %s", new Object[] { paramArrayList });
            ar localar = paramc.IW(paramArrayList.cwg);
            if (localar != null)
            {
              int i;
              if (paramArrayList.vbt == 10232)
              {
                localar.xYb = paramArrayList.vbq;
                localar.xXZ = paramArrayList.vbr;
                localar.xYa = new BigDecimal(paramArrayList.vbs).divide(new BigDecimal(1000000)).toString();
                localar.xXX = 12;
                i = localar.xXV;
                if ((!tZ(i)) && (!ua(i)))
                  localar.Mo(4);
              }
              else
              {
                localar.xXX = 10;
                localar.xXY = paramArrayList.vbt;
                i = localar.xXV;
                if ((!tZ(i)) && (!ua(i)))
                {
                  if (i == 3);
                  for (i = 1; ; i = 0)
                  {
                    if (i != 0)
                      break label251;
                    localar.Mo(10);
                    break;
                  }
                }
              }
            }
          }
        }
        AppMethodBeat.o(52775);
      }
    }
  }

  private static boolean tZ(int paramInt)
  {
    if (paramInt == 7);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean ua(int paramInt)
  {
    if (paramInt == 6);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.b
 * JD-Core Version:    0.6.2
 */