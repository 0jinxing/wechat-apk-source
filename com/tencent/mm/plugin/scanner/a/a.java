package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public int cIZ;
  public int cJa;
  public LinkedList<a.a> fPL;
  public String iconUrl;
  public int pZh;
  public String pZi;
  public boolean pZj;
  public String title;
  public int type;

  public a()
  {
    AppMethodBeat.i(80821);
    this.type = 1;
    this.fPL = new LinkedList();
    AppMethodBeat.o(80821);
  }

  public static LinkedList<a> l(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(80822);
    LinkedList localLinkedList1 = new LinkedList();
    int i = 0;
    int j = 0;
    a locala;
    Object localObject2;
    boolean bool;
    LinkedList localLinkedList2;
    int k;
    if (j < 1000)
    {
      locala = new a();
      Object localObject1 = new StringBuilder().append(paramString).append(".actionlist");
      StringBuilder localStringBuilder;
      if (j > 0)
      {
        localObject2 = Integer.valueOf(j);
        localObject1 = localObject2;
        if (!bo.isNullOrNil((String)paramMap.get((String)localObject1 + ".$type")))
          locala.type = Integer.valueOf((String)paramMap.get((String)localObject1 + ".$type")).intValue();
        locala.title = bo.nullAsNil((String)paramMap.get((String)localObject1 + ".$title"));
        locala.iconUrl = bo.nullAsNil((String)paramMap.get((String)localObject1 + ".$iconurl"));
        locala.cIZ = bo.getInt((String)paramMap.get((String)localObject1 + ".$iconwidth"), 34);
        locala.cJa = bo.getInt((String)paramMap.get((String)localObject1 + ".$iconheight"), 34);
        locala.pZi = bo.nullAsNil((String)paramMap.get((String)localObject1 + ".$referkey"));
        locala.pZh = bo.getInt((String)paramMap.get((String)localObject1 + ".$listshowtype"), 0);
        bool = false;
        localLinkedList2 = new LinkedList();
        k = 0;
        if (k >= 1000)
          break label585;
        localStringBuilder = new StringBuilder().append((String)localObject1).append(".action");
        if (k <= 0)
          break label498;
      }
      label489: label498: for (localObject2 = Integer.valueOf(k); ; localObject2 = "")
      {
        localObject2 = localObject2;
        if (!bo.isNullOrNil((String)paramMap.get((String)localObject2 + ".$type")))
          break label534;
        if (i == 0)
          break label505;
        AppMethodBeat.o(80822);
        return localLinkedList1;
        localObject2 = "";
        break;
      }
      label505: i = 1;
      locala.fPL = localLinkedList2;
    }
    label534: label585: 
    while (true)
    {
      locala.pZj = bool;
      localLinkedList1.add(locala);
      j++;
      break;
      i = 0;
      localObject2 = m(paramMap, (String)localObject2);
      if (localObject2 != null)
      {
        localLinkedList2.add(localObject2);
        if (!l.a((a.a)localObject2))
          bool = true;
      }
      while (true)
      {
        k++;
        break;
        AppMethodBeat.o(80822);
        break label489;
      }
    }
  }

  public static a.a m(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(80823);
    int i = bo.getInt((String)paramMap.get(paramString + ".$type"), 0);
    a.a locala = new a.a(i);
    locala.type = i;
    locala.pZo = bo.nullAsNil((String)paramMap.get(paramString + ".statid"));
    locala.name = bo.nullAsNil((String)paramMap.get(paramString + ".name"));
    locala.desc = bo.nullAsNil((String)paramMap.get(paramString + ".desc"));
    locala.fjz = bo.nullAsNil((String)paramMap.get(paramString + ".digest"));
    locala.showType = bo.getInt((String)paramMap.get(paramString + ".showtype"), 0);
    locala.image = bo.nullAsNil((String)paramMap.get(paramString + ".image"));
    locala.key = bo.nullAsNil((String)paramMap.get(paramString + ".$key"));
    locala.iconUrl = bo.nullAsNil((String)paramMap.get(paramString + ".iconurl"));
    if (i == 1)
    {
      locala.link = bo.nullAsNil((String)paramMap.get(paramString + ".link"));
      paramMap = locala;
    }
    while (true)
    {
      AppMethodBeat.o(80823);
      return paramMap;
      if (i == 2)
      {
        locala.username = bo.nullAsNil((String)paramMap.get(paramString + ".username"));
        locala.nickname = bo.nullAsNil((String)paramMap.get(paramString + ".nickname"));
        locala.pZs = bo.nullAsNil((String)paramMap.get(paramString + ".strbeforefollow"));
        locala.pZt = bo.nullAsNil((String)paramMap.get(paramString + ".strafterfollow"));
        paramMap = locala;
      }
      else if (i == 3)
      {
        locala.thumburl = bo.nullAsNil((String)paramMap.get(paramString + ".thumburl"));
        locala.link = bo.nullAsNil((String)paramMap.get(paramString + ".link"));
        paramMap = locala;
      }
      else if (i == 4)
      {
        locala.thumburl = bo.nullAsNil((String)paramMap.get(paramString + ".thumburl"));
        locala.username = bo.nullAsNil((String)paramMap.get(paramString + ".username"));
        locala.nickname = bo.nullAsNil((String)paramMap.get(paramString + ".nickname"));
        paramMap = locala;
      }
      else if (i == 5)
      {
        locala.pZl = bo.nullAsNil((String)paramMap.get(paramString + ".wifiurl"));
        locala.pZm = bo.nullAsNil((String)paramMap.get(paramString + ".wapurl"));
        locala.pZn = bo.nullAsNil((String)paramMap.get(paramString + ".weburl"));
        if ((bo.isNullOrNil(locala.pZl)) && (bo.isNullOrNil(locala.pZm)) && (bo.isNullOrNil(locala.pZn)))
          paramMap = null;
      }
      else if (i != 6)
      {
        if (i == 7)
        {
          locala.thumburl = bo.nullAsNil((String)paramMap.get(paramString + ".thumburl"));
          locala.pZk = bo.nullAsNil((String)paramMap.get(paramString + ".playurl"));
          paramMap = locala;
        }
        else if (i == 9)
        {
          locala.pZp = bo.nullAsNil((String)paramMap.get(paramString + ".productid"));
          paramMap = locala;
        }
        else if (i == 8)
        {
          locala.pZq = bo.nullAsNil((String)paramMap.get(paramString + ".cardext"));
          locala.pZr = bo.nullAsNil((String)paramMap.get(paramString + ".cardid"));
          paramMap = locala;
        }
        else if (i == 10)
        {
          locala.pZp = bo.nullAsNil((String)paramMap.get(paramString + ".id"));
          paramMap = locala;
        }
        else if (i == 12)
        {
          locala.thumburl = bo.nullAsNil((String)paramMap.get(paramString + ".image"));
          locala.link = bo.nullAsNil((String)paramMap.get(paramString + ".link"));
          paramMap = locala;
        }
        else if (i == 22)
        {
          locala.content = bo.nullAsNil((String)paramMap.get(paramString + ".content"));
          locala.link = bo.nullAsNil((String)paramMap.get(paramString + ".link"));
          locala.nickname = bo.nullAsNil((String)paramMap.get(paramString + ".nickname"));
          locala.thumburl = bo.nullAsNil((String)paramMap.get(paramString + ".image"));
          paramMap = locala;
        }
        else if (i == 21)
        {
          locala.pZi = bo.nullAsNil((String)paramMap.get(paramString + ".referkey"));
          paramMap = locala;
        }
        else
        {
          locala.link = bo.nullAsNil((String)paramMap.get(paramString + ".link"));
        }
      }
      else
      {
        paramMap = locala;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.a
 * JD-Core Version:    0.6.2
 */