package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.i;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet.a.t;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class b
{
  public h tDO;
  private Map<String, t> tDP;
  private Map<String, j> tDQ;

  public b(h paramh)
  {
    AppMethodBeat.i(47100);
    this.tDO = null;
    this.tDP = null;
    this.tDQ = null;
    Assert.assertNotNull(paramh);
    this.tDO = paramh;
    Kh();
    AppMethodBeat.o(47100);
  }

  private void Kh()
  {
    int i = 0;
    AppMethodBeat.i(47101);
    this.tDP = new HashMap();
    Object localObject1 = this.tDO.tmV;
    int j;
    Object localObject2;
    if (localObject1 != null)
      for (j = 0; j < ((List)localObject1).size(); j++)
      {
        localObject2 = (t)((List)localObject1).get(j);
        this.tDP.put(((t)localObject2).tmO, localObject2);
      }
    ab.w("MicroMsg.FavorLogicHelper", "func[initData] favorList null");
    this.tDQ = new HashMap();
    if ((this.tDO.tmW != null) && (this.tDO.tmW.tni != null))
    {
      localObject2 = this.tDO.tmW.tni;
      for (j = i; j < ((List)localObject2).size(); j++)
      {
        localObject1 = (j)((List)localObject2).get(j);
        this.tDQ.put(((j)localObject1).tnk, localObject1);
      }
      AppMethodBeat.o(47101);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.FavorLogicHelper", "func[initData] favorComposeList null");
      AppMethodBeat.o(47101);
    }
  }

  public static boolean a(FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    boolean bool = true;
    AppMethodBeat.i(47114);
    if (paramBankcard == null)
    {
      ab.w("MicroMsg.FavorLogicHelper", "curBankcard null");
      AppMethodBeat.o(47114);
    }
    while (true)
    {
      return bool;
      if ((paramFavorPayInfo != null) && (!bo.isNullOrNil(paramFavorPayInfo.tzb)))
      {
        if (paramFavorPayInfo.tzc != 0);
        for (i = 1; ; i = 0)
        {
          if ((i == 0) || (bo.isNullOrNil(paramFavorPayInfo.tzd)) || (paramFavorPayInfo.tzg == null) || (!paramFavorPayInfo.tzg.contains(paramBankcard.field_bindSerial)))
            break label100;
          AppMethodBeat.o(47114);
          bool = false;
          break;
        }
      }
      label100: if (paramFavorPayInfo.tzc != 0);
      for (int i = 1; ; i = 0)
      {
        if ((i == 0) || (((bo.isNullOrNil(paramFavorPayInfo.tzd)) || (paramBankcard.field_bankcardType == null) || (paramBankcard.field_bankcardType.equals(paramFavorPayInfo.tzd))) && ((!bo.isNullOrNil(paramFavorPayInfo.tzd)) || (!paramBankcard.field_bankcardType.equals("CFT")))))
          break label179;
        AppMethodBeat.o(47114);
        break;
      }
      label179: AppMethodBeat.o(47114);
      bool = false;
    }
  }

  public static String[] acV(String paramString)
  {
    AppMethodBeat.i(47110);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(47110);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.split("-");
      AppMethodBeat.o(47110);
    }
  }

  public static List<Bankcard> bt(int paramInt, String paramString)
  {
    AppMethodBeat.i(47115);
    ArrayList localArrayList1 = r.cPI().nf(true);
    if (paramInt != 0);
    for (paramInt = 1; paramInt == 0; paramInt = 0)
    {
      AppMethodBeat.o(47115);
      paramString = localArrayList1;
      return paramString;
    }
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    label48: if (i < localArrayList1.size())
      if (bo.isNullOrNil(paramString))
      {
        if (((Bankcard)localArrayList1.get(i)).field_bankcardType.equals("CFT"))
          break label146;
        paramInt = 1;
      }
    while (true)
    {
      if (paramInt != 0)
        localArrayList2.add((Bankcard)localArrayList1.get(i));
      i++;
      break label48;
      if (((Bankcard)localArrayList1.get(i)).field_bankcardType.equals(paramString))
      {
        paramInt = 1;
        continue;
        AppMethodBeat.o(47115);
        paramString = localArrayList2;
        break;
      }
      label146: paramInt = 0;
    }
  }

  private static String dV(List<String> paramList)
  {
    AppMethodBeat.i(47116);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramList.size(); i++)
    {
      localStringBuilder.append((String)paramList.get(i));
      if (i < paramList.size() - 1)
        localStringBuilder.append("-");
    }
    paramList = localStringBuilder.toString();
    AppMethodBeat.o(47116);
    return paramList;
  }

  public final Map<String, b.a> acR(String paramString)
  {
    AppMethodBeat.i(47102);
    paramString = bB(paramString, false);
    AppMethodBeat.o(47102);
    return paramString;
  }

  public final Map<String, b.a> acS(String paramString)
  {
    AppMethodBeat.i(47104);
    HashMap localHashMap = new HashMap();
    LinkedList localLinkedList;
    if ((this.tDO.tmW != null) && (this.tDO.tmW.tni != null))
    {
      localLinkedList = this.tDO.tmW.tni;
      if (!this.tDQ.containsKey(paramString))
        break label429;
    }
    label402: label408: label429: for (double d = ((j)this.tDQ.get(paramString)).tnl; ; d = 0.0D)
    {
      int i = 0;
      while (i < localLinkedList.size())
      {
        j localj = (j)localLinkedList.get(i);
        Iterator localIterator = null;
        Object localObject;
        t localt;
        if ((paramString.equals("0")) && (!localj.equals("0")))
        {
          localObject = localj.tnk;
          localObject = acV((String)localObject);
          if ((localObject == null) || (localObject.length <= 0))
            break label408;
          localt = (t)this.tDP.get(localObject[0]);
          if (localt == null)
            break label408;
          if (localt.tnR == 0)
            break label402;
        }
        for (int j = 1; ; j = 0)
        {
          if ((j == 0) || (localt.tnU.size() <= 0))
            break label408;
          localIterator = localt.tnU.iterator();
          while (localIterator.hasNext())
          {
            localObject = aa.a((com.tencent.mm.bt.b)localIterator.next());
            b.a locala = (b.a)localHashMap.get(localObject);
            if ((locala == null) || (localj.tnl > locala.tDR.tnl))
            {
              locala = new b.a();
              locala.tDR = localj;
              locala.pcj = localt.pcj;
              locala.tDS = (localj.tnl - d);
              locala.tDT = localt.tnS;
              localHashMap.put(localObject, locala);
            }
          }
          localObject = localIterator;
          if (!localj.tnk.startsWith(paramString))
            break;
          localObject = localIterator;
          if (paramString.equals(localj.tnk))
            break;
          localObject = localj.tnk.replace(paramString + "-", "");
          break;
        }
        i++;
        continue;
        ab.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
      }
      AppMethodBeat.o(47104);
      return localHashMap;
    }
  }

  public final List<t> acT(String paramString)
  {
    AppMethodBeat.i(47106);
    LinkedList localLinkedList = new LinkedList();
    if (this.tDO.tmV != null)
    {
      Map localMap = acR(paramString);
      int i = 0;
      if (i < this.tDO.tmV.size())
      {
        paramString = (t)this.tDO.tmV.get(i);
        if (paramString != null)
          if (paramString.tnR == 0)
            break label110;
        label110: for (int j = 1; ; j = 0)
        {
          if ((j != 0) && (localMap.containsKey(paramString.tnS)))
            localLinkedList.add(paramString);
          i++;
          break;
        }
      }
    }
    else
    {
      ab.w("MicroMsg.FavorLogicHelper", "fucn[getBankFavorListWithSelectedCompId] mFavorInfo.tradeFavList null");
    }
    AppMethodBeat.o(47106);
    return localLinkedList;
  }

  public final j acU(String paramString)
  {
    AppMethodBeat.i(47109);
    paramString = (j)this.tDQ.get(paramString);
    AppMethodBeat.o(47109);
    return paramString;
  }

  public final String acW(String paramString)
  {
    AppMethodBeat.i(47111);
    paramString = bC(paramString, false);
    AppMethodBeat.o(47111);
    return paramString;
  }

  public final FavorPayInfo acX(String paramString)
  {
    AppMethodBeat.i(47113);
    FavorPayInfo localFavorPayInfo = new FavorPayInfo();
    if (this.tDQ.get(paramString) == null)
    {
      localFavorPayInfo.tzb = "0";
      if (this.tDO != null)
        localFavorPayInfo.tze = this.tDO.tmU;
      localFavorPayInfo.tzc = 0;
      AppMethodBeat.o(47113);
    }
    while (true)
    {
      return localFavorPayInfo;
      localFavorPayInfo.tzb = paramString;
      if (this.tDO != null)
        localFavorPayInfo.tze = this.tDO.tmU;
      localFavorPayInfo.tzc = 0;
      paramString = acV(paramString);
      if (paramString != null)
        break;
      AppMethodBeat.o(47113);
    }
    label277: for (int i = paramString.length - 1; ; i--)
      if (i >= 0)
      {
        t localt = (t)this.tDP.get(paramString[i]);
        if (localt != null)
        {
          int j;
          if (localt.tnR != 0)
            j = 1;
          while (j != 0)
          {
            localFavorPayInfo.tzc = 1;
            if ((localt.tnU != null) && (localt.tnU.size() > 0))
            {
              localFavorPayInfo.tzg = new LinkedList();
              Iterator localIterator = localt.tnU.iterator();
              while (true)
                if (localIterator.hasNext())
                {
                  com.tencent.mm.bt.b localb = (com.tencent.mm.bt.b)localIterator.next();
                  localFavorPayInfo.tzg.add(aa.a(localb));
                  continue;
                  j = 0;
                  break;
                }
            }
            if (bo.isNullOrNil(localt.tnS))
              break label277;
            localFavorPayInfo.tzd = localt.tnS;
          }
        }
      }
      else
      {
        AppMethodBeat.o(47113);
        break;
      }
  }

  public final String acY(String paramString)
  {
    AppMethodBeat.i(47117);
    ArrayList localArrayList1 = r.cPI().nf(true);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < localArrayList1.size(); i++)
      localHashMap.put(((Bankcard)localArrayList1.get(i)).field_bankcardType, Integer.valueOf(0));
    String[] arrayOfString = acV(paramString);
    if (arrayOfString != null)
    {
      i = 0;
      if (i < arrayOfString.length)
      {
        localArrayList1 = arrayOfString[i];
        paramString = (t)this.tDP.get(localArrayList1);
        int j;
        if (paramString != null)
          if (paramString.tnR != 0)
          {
            j = 1;
            label128: if (j == 0)
              break label177;
            if ((localHashMap.containsKey(paramString.tnS)) || (bo.isNullOrNil(paramString.tnS)))
              localArrayList2.add(localArrayList1);
          }
        while (true)
        {
          i++;
          break;
          j = 0;
          break label128;
          label177: localArrayList2.add(localArrayList1);
        }
      }
    }
    if (localArrayList2.size() == 0)
    {
      paramString = "0";
      AppMethodBeat.o(47117);
    }
    while (true)
    {
      return paramString;
      paramString = dV(localArrayList2);
      AppMethodBeat.o(47117);
    }
  }

  public final j bA(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(47103);
    if ((!"0".equals(paramString)) && (this.tDQ.containsKey(paramString)))
    {
      paramString = (j)this.tDQ.get(paramString);
      AppMethodBeat.o(47103);
      return paramString;
    }
    Iterator localIterator1 = this.tDQ.keySet().iterator();
    label136: label269: label270: 
    while (true)
    {
      int i;
      int j;
      if (localIterator1.hasNext())
      {
        paramString = (String)localIterator1.next();
        paramString = (j)this.tDQ.get(paramString);
        if ((paramString.tnm != null) && (paramString.tnm.size() != 0))
        {
          i = paramString.tnm.size();
          Iterator localIterator2 = paramString.tnm.iterator();
          j = 0;
          if (localIterator2.hasNext())
          {
            Object localObject = (f)localIterator2.next();
            if (this.tDP.containsKey(((f)localObject).tmO))
            {
              localObject = (t)this.tDP.get(((f)localObject).tmO);
              if ((!((t)localObject).tnS.equals("")) || (((t)localObject).tnU.size() != 0) || ((paramBoolean) && (((t)localObject).tnR != 0)))
                break label269;
              j++;
            }
          }
        }
      }
      else
      {
        while (true)
        {
          break label136;
          if ((j <= 0) || (j != i))
            break label270;
          AppMethodBeat.o(47103);
          break;
          paramString = null;
          AppMethodBeat.o(47103);
          break;
        }
      }
    }
  }

  public final Map<String, b.a> bB(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(47105);
    HashMap localHashMap = new HashMap();
    LinkedList localLinkedList;
    if ((this.tDO.tmW != null) && (this.tDO.tmW.tni != null))
    {
      localLinkedList = this.tDO.tmW.tni;
      if (!this.tDQ.containsKey(paramString))
        break label430;
    }
    label138: label408: label430: for (double d = ((j)this.tDQ.get(paramString)).tnl; ; d = 0.0D)
    {
      int i = 0;
      if (i < localLinkedList.size())
      {
        j localj = (j)localLinkedList.get(i);
        b.a locala = null;
        Object localObject;
        if ((paramString.equals("0")) && (!localj.equals("0")))
        {
          localObject = localj.tnk;
          localObject = acV((String)localObject);
          if ((localObject != null) && (localObject.length > 0))
          {
            localObject = (t)this.tDP.get(localObject[0]);
            if (localObject != null)
              if (((t)localObject).tnR == 0)
                break label408;
          }
        }
        for (int j = 1; ; j = 0)
        {
          if ((j != 0) && (!bo.isNullOrNil(((t)localObject).tnS)) && (((t)localObject).tnU.size() <= 0) && ((paramBoolean) || (!((t)localObject).tnS.equalsIgnoreCase("CFT"))))
          {
            locala = (b.a)localHashMap.get(((t)localObject).tnS);
            if ((locala == null) || (localj.tnl > locala.tDR.tnl))
            {
              locala = new b.a();
              locala.tDR = localj;
              locala.pcj = ((t)localObject).pcj;
              locala.tDS = (localj.tnl - d);
              locala.tDT = ((t)localObject).tnS;
              localHashMap.put(((t)localObject).tnS, locala);
            }
          }
          i++;
          break;
          localObject = locala;
          if (!localj.tnk.startsWith(paramString))
            break label138;
          localObject = locala;
          if (paramString.equals(localj.tnk))
            break label138;
          localObject = localj.tnk.replace(paramString + "-", "");
          break label138;
        }
        ab.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
      }
      AppMethodBeat.o(47105);
      return localHashMap;
    }
  }

  public final String bC(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(47112);
    String[] arrayOfString = acV(paramString);
    if (arrayOfString != null)
    {
      paramString = new StringBuilder();
      int i = 0;
      if (i < arrayOfString.length)
      {
        t localt = (t)this.tDP.get(arrayOfString[i]);
        if (localt != null)
          if (localt.tnR == 0)
            break label122;
        label122: for (int j = 1; ; j = 0)
        {
          if ((j == 0) || ((bo.isNullOrNil(localt.tnS)) && (!paramBoolean)))
          {
            paramString.append(arrayOfString[i]);
            paramString.append("-");
          }
          i++;
          break;
        }
      }
      if (paramString.length() == 0)
      {
        paramString = "0";
        AppMethodBeat.o(47112);
      }
    }
    while (true)
    {
      return paramString;
      paramString = paramString.delete(paramString.length() - 1, paramString.length()).toString();
      AppMethodBeat.o(47112);
      continue;
      paramString = "0";
      AppMethodBeat.o(47112);
    }
  }

  public final boolean cRi()
  {
    AppMethodBeat.i(47099);
    boolean bool;
    if ((this.tDP != null) && (this.tDP.size() > 0))
    {
      bool = true;
      AppMethodBeat.o(47099);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(47099);
    }
  }

  public final int cRj()
  {
    AppMethodBeat.i(47107);
    int i = this.tDQ.size();
    AppMethodBeat.o(47107);
    return i;
  }

  public final j cRk()
  {
    AppMethodBeat.i(47108);
    Object localObject;
    if (!this.tDQ.isEmpty())
    {
      localObject = this.tDQ.entrySet().iterator();
      if (((Iterator)localObject).hasNext())
      {
        localObject = (j)((Map.Entry)((Iterator)localObject).next()).getValue();
        AppMethodBeat.o(47108);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(47108);
    }
  }

  public final List<t> cRl()
  {
    AppMethodBeat.i(47118);
    Object localObject = r.cPI().nf(true);
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < ((ArrayList)localObject).size(); i++)
      localHashMap.put(((Bankcard)((ArrayList)localObject).get(i)).field_bankcardType, Integer.valueOf(0));
    LinkedList localLinkedList = new LinkedList();
    localObject = this.tDO.tmV;
    if (localObject != null)
    {
      i = 0;
      if (i < ((List)localObject).size())
      {
        t localt = (t)((List)localObject).get(i);
        int j;
        if (localt != null)
          if (localt.tnR != 0)
          {
            j = 1;
            label121: if (j == 0)
              break label173;
            if ((localHashMap.containsKey(localt.tnS)) || (bo.isNullOrNil(localt.tnS)))
              localLinkedList.add(localt);
          }
        while (true)
        {
          i++;
          break;
          j = 0;
          break label121;
          label173: localLinkedList.add(localt);
        }
      }
    }
    AppMethodBeat.o(47118);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.b
 * JD-Core Version:    0.6.2
 */