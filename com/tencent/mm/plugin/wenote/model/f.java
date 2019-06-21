package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.a;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static String K(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(26607);
    gh localgh = new gh();
    localgh.cAH.type = 21;
    localgh.cAH.context = paramContext;
    localgh.cAH.cAP = paramInt;
    a.xxA.m(localgh);
    paramContext = localgh.cAI.path;
    AppMethodBeat.o(26607);
    return paramContext;
  }

  private static void a(abf paramabf, long paramLong, String paramString)
  {
    AppMethodBeat.i(26613);
    Object localObject1 = new ArrayList();
    if ((bo.isNullOrNil(paramString)) || (paramString.length() == 0))
      AppMethodBeat.o(26613);
    while (true)
    {
      return;
      paramString = Pattern.compile("<object[^>]*>", 2).matcher(paramString);
      if (paramString.find())
      {
        localObject2 = paramString.group();
        int i = ((String)localObject2).indexOf("WeNote_");
        if (i != -1)
        {
          j = ((String)localObject2).indexOf("\"", i + 1);
          if (j != -1)
          {
            k = ((String)localObject2).indexOf(" ", i + 1);
            if (k != -1)
            {
              if (j < k);
              while (true)
              {
                ((ArrayList)localObject1).add(((String)localObject2).substring(i, j));
                break;
                j = k;
              }
            }
          }
        }
      }
      paramString = new LinkedList();
      Object localObject2 = paramabf.wiv.iterator();
      int k = 0;
      int j = 0;
      while (((Iterator)localObject2).hasNext())
      {
        aar localaar = (aar)((Iterator)localObject2).next();
        if (j == 0)
        {
          localaar.ale("WeNoteHtmlFile");
          paramString.add(localaar);
          j++;
        }
        else
        {
          if (localaar.dataType == 1)
            localaar.ale("-1");
          while (true)
          {
            paramString.add(localaar);
            break;
            localaar.ale((String)((ArrayList)localObject1).get(k));
            k++;
          }
        }
      }
      localObject1 = new gh();
      ((gh)localObject1).cAH.type = 33;
      ((gh)localObject1).cAH.cvC = paramabf;
      ((gh)localObject1).cAH.cvC.wiv = paramString;
      ((gh)localObject1).cAH.cvv = paramLong;
      a.xxA.m((b)localObject1);
      AppMethodBeat.o(26613);
    }
  }

  public static String aC(float paramFloat)
  {
    AppMethodBeat.i(26605);
    String str;
    if (paramFloat < 1024.0F)
    {
      str = String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
      AppMethodBeat.o(26605);
    }
    while (true)
    {
      return str;
      if (paramFloat < 1048576.0F)
      {
        str = String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
        AppMethodBeat.o(26605);
      }
      else if (paramFloat < 1.073742E+009F)
      {
        str = String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
        AppMethodBeat.o(26605);
      }
      else
      {
        str = String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
        AppMethodBeat.o(26605);
      }
    }
  }

  public static void ad(ArrayList<String> paramArrayList)
  {
    int i = 0;
    AppMethodBeat.i(26614);
    if (c.ddG().uMN == null)
    {
      ab.e("MicroMsg.WNNoteFavLogic", "sortNoteDataList, getWnNoteBase() is null");
      AppMethodBeat.o(26614);
    }
    abf localabf;
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return;
      localabf = c.ddG().uMN.uMZ;
      localObject1 = new ArrayList();
      localObject2 = new HashMap();
      if (localabf != null)
        break;
      ab.e("MicroMsg.WNNoteFavLogic", "sortNoteDataList, protoItem is null");
      AppMethodBeat.o(26614);
    }
    Iterator localIterator = localabf.wiv.iterator();
    aar localaar;
    while (localIterator.hasNext())
    {
      localaar = (aar)localIterator.next();
      if ((!bo.isNullOrNil(localaar.whb)) && (!localaar.whb.contains("WeNoteHtmlFile")) && (!localaar.whb.contains("-1")))
      {
        ((List)localObject1).add(localaar.whb);
        ((HashMap)localObject2).put(localaar.whb, localaar);
      }
    }
    if ((paramArrayList.size() == ((List)localObject1).size()) && (((List)localObject1).containsAll(paramArrayList)) && (paramArrayList.containsAll((Collection)localObject1)))
    {
      j = 0;
      if (j >= ((List)localObject1).size())
        break label471;
      if (((String)((List)localObject1).get(j)).trim().equals(((String)paramArrayList.get(j)).trim()));
    }
    label471: for (int j = 1; ; j = 0)
    {
      if (j != 0)
      {
        localObject1 = new LinkedList();
        j = i;
        while (true)
          if (j < paramArrayList.size())
          {
            ((LinkedList)localObject1).add(((HashMap)localObject2).get(paramArrayList.get(j)));
            j++;
            continue;
            j++;
            break;
          }
        localabf.aE((LinkedList)localObject1);
        ddI();
        ((HashMap)localObject2).clear();
      }
      AppMethodBeat.o(26614);
      break;
      ((List)localObject1).removeAll(paramArrayList);
      if (((List)localObject1).size() == 0)
      {
        AppMethodBeat.o(26614);
        break;
      }
      localObject2 = new ArrayList();
      paramArrayList = localabf.wiv.iterator();
      while (paramArrayList.hasNext())
      {
        localaar = (aar)paramArrayList.next();
        if (((List)localObject1).contains(localaar.whb))
          ((List)localObject2).add(localaar);
      }
      paramArrayList = ((List)localObject2).iterator();
      while (paramArrayList.hasNext())
      {
        localObject1 = (aar)paramArrayList.next();
        localabf.wiv.remove(localObject1);
      }
      ddI();
      AppMethodBeat.o(26614);
      break;
    }
  }

  public static String agW(String paramString)
  {
    AppMethodBeat.i(26608);
    paramString = com.tencent.mm.a.g.x((paramString + 18 + System.currentTimeMillis()).getBytes());
    AppMethodBeat.o(26608);
    return paramString;
  }

  public static String c(aar paramaar)
  {
    AppMethodBeat.i(26609);
    gh localgh = new gh();
    localgh.cAH.type = 27;
    localgh.cAH.cAJ = paramaar;
    a.xxA.m(localgh);
    paramaar = localgh.cAI.thumbPath;
    AppMethodBeat.o(26609);
    return paramaar;
  }

  private static void ddI()
  {
    AppMethodBeat.i(26615);
    gh localgh = new gh();
    localgh.cAH.type = 30;
    if (c.ddG().uMN != null)
    {
      localgh.cAH.cvC = c.ddG().uMN.uMZ;
      a.xxA.m(localgh);
      c.ddG().uMN.agU(localgh.cAI.path);
    }
    AppMethodBeat.o(26615);
  }

  public static float fY(long paramLong)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(26606);
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F);
    while (true)
    {
      f1 = Math.round(f1);
      AppMethodBeat.o(26606);
      return f1;
      f1 = f2;
    }
  }

  public static com.tencent.mm.plugin.fav.a.g jD(long paramLong)
  {
    AppMethodBeat.i(26611);
    com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
    AppMethodBeat.o(26611);
    return localg;
  }

  public static String o(aar paramaar)
  {
    AppMethodBeat.i(26610);
    gh localgh = new gh();
    localgh.cAH.type = 27;
    localgh.cAH.cAJ = paramaar;
    a.xxA.m(localgh);
    paramaar = localgh.cAI.path;
    AppMethodBeat.o(26610);
    return paramaar;
  }

  public static void y(long paramLong, String paramString)
  {
    AppMethodBeat.i(26612);
    if (paramLong <= 0L)
      AppMethodBeat.o(26612);
    while (true)
    {
      return;
      gh localgh = new gh();
      localgh.cAH.type = 34;
      localgh.cAH.cvv = paramLong;
      a.xxA.m(localgh);
      if (localgh.cAH.cvC == null)
      {
        AppMethodBeat.o(26612);
      }
      else if ((localgh.cAH.cvC.wiv == null) || (localgh.cAH.cvC.wiv.size() <= 1))
      {
        AppMethodBeat.o(26612);
      }
      else if (((aar)localgh.cAH.cvC.wiv.get(0)).whb != null)
      {
        AppMethodBeat.o(26612);
      }
      else
      {
        ab.i("MicroMsg.WNNoteFavLogic", "Note: Htmlid is null,  do updateFavItemHtmlIdStorage");
        if ((!bo.isNullOrNil(paramString)) && (e.ct(paramString)))
          try
          {
            paramString = e.cy(paramString);
            a(localgh.cAH.cvC, paramLong, paramString);
            AppMethodBeat.o(26612);
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.WNNoteFavLogic", "Note: FileNotFoundException :%s", new Object[] { paramString.getMessage() });
          }
        else
          AppMethodBeat.o(26612);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.f
 * JD-Core Version:    0.6.2
 */