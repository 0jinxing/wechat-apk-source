package com.tencent.mm.plugin.label;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.label.b.a;
import com.tencent.mm.plugin.label.b.d;
import com.tencent.mm.protocal.protobuf.cmh;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements com.tencent.mm.plugin.label.a.b
{
  ArrayList<String> nHp;
  ArrayList<String> nHq;
  private f nHr;
  String username;

  public b()
  {
    AppMethodBeat.i(22489);
    this.nHr = new b.1(this);
    AppMethodBeat.o(22489);
  }

  static void i(String paramString, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(22500);
    Object localObject1;
    if (paramArrayList == null)
    {
      localObject1 = "";
      ab.d("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveContact] username:%s,list:%s", new Object[] { paramString, localObject1 });
      if ((!bo.isNullOrNil(paramString)) && (paramArrayList != null) && (paramArrayList.size() > 0))
        break label72;
      ab.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact label faild.");
      AppMethodBeat.o(22500);
    }
    while (true)
    {
      return;
      localObject1 = paramArrayList.toString();
      break;
      label72: Object localObject2 = "";
      localObject1 = localObject2;
      if (paramArrayList != null)
      {
        localObject1 = localObject2;
        if (paramArrayList.size() > 0)
          localObject1 = c.cf(e.bIZ().ai(paramArrayList));
      }
      localObject2 = new LinkedList();
      paramArrayList = new cmh();
      paramArrayList.wcD = ((String)localObject1);
      paramArrayList.jBB = paramString;
      ((LinkedList)localObject2).add(paramArrayList);
      paramString = new d((LinkedList)localObject2);
      aw.Rg().a(paramString, 0);
      AppMethodBeat.o(22500);
    }
  }

  public final String PD(String paramString)
  {
    AppMethodBeat.i(22491);
    paramString = e.bIZ().PD(paramString);
    AppMethodBeat.o(22491);
    return paramString;
  }

  public final String PE(String paramString)
  {
    AppMethodBeat.i(22492);
    paramString = e.bIZ().PE(paramString);
    AppMethodBeat.o(22492);
    return paramString;
  }

  public final List<String> PF(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(22496);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.Label.ContactLabelManagerImpl", "labels is null.");
      AppMethodBeat.o(22496);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String[] arrayOfString = paramString.split(",");
      if ((arrayOfString != null) && (arrayOfString.length > 0))
      {
        paramString = new ArrayList();
        paramString.addAll(Arrays.asList(arrayOfString));
        AppMethodBeat.o(22496);
      }
      else
      {
        AppMethodBeat.o(22496);
        paramString = localObject;
      }
    }
  }

  public final void a(k.a parama)
  {
    AppMethodBeat.i(22493);
    e.bIZ().c(parama);
    AppMethodBeat.o(22493);
  }

  public final void ahw()
  {
    AppMethodBeat.i(22490);
    e.bIZ().ahw();
    AppMethodBeat.o(22490);
  }

  public final void b(k.a parama)
  {
    AppMethodBeat.i(22494);
    e.bIZ().d(parama);
    AppMethodBeat.o(22494);
  }

  public final List<String> bIV()
  {
    AppMethodBeat.i(22495);
    ai localai = e.bIZ();
    long l = bo.anU();
    ArrayList localArrayList1 = localai.dsn();
    Object localObject;
    if (localArrayList1 == null)
    {
      localObject = null;
      AppMethodBeat.o(22495);
    }
    while (true)
    {
      return localObject;
      localai.dso();
      localObject = new ArrayList();
      for (int i = 0; i < localArrayList1.size(); i++)
      {
        ArrayList localArrayList2 = (ArrayList)localai.xXe.get(Integer.valueOf(((af)localArrayList1.get(i)).field_labelID));
        if ((localArrayList2 != null) && (localArrayList2.size() > 0))
          ((ArrayList)localObject).add(((af)localArrayList1.get(i)).field_labelName);
      }
      ab.i("MicroMsg.Label.ContactLabelStorage", "getAllLabelHasContact time:%s all:%s hascontact:%s stack:%s", new Object[] { Long.valueOf(bo.gb(l)), Integer.valueOf(localArrayList1.size()), Integer.valueOf(((ArrayList)localObject).size()), bo.dpG() });
      AppMethodBeat.o(22495);
    }
  }

  final void bIW()
  {
    AppMethodBeat.i(22499);
    this.username = null;
    this.nHp = null;
    this.nHq = null;
    aw.Rg().b(635, this.nHr);
    aw.Rg().b(638, this.nHr);
    AppMethodBeat.o(22499);
  }

  public final String cd(List<String> paramList)
  {
    AppMethodBeat.i(22497);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.w("MicroMsg.Label.ContactLabelManagerImpl", "labelList is empty");
      paramList = null;
      AppMethodBeat.o(22497);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append((String)paramList.get(j));
        if (j < i - 1)
          localStringBuilder.append(",");
      }
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(22497);
    }
  }

  public final void ce(List<String> paramList)
  {
    AppMethodBeat.i(22501);
    paramList = new a(paramList);
    aw.Rg().a(paramList, 0);
    AppMethodBeat.o(22501);
  }

  public final void eQ(String paramString1, String paramString2)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(22498);
        ab.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] user:%s labels:%s", new Object[] { String.valueOf(paramString1), String.valueOf(paramString2) });
        if (bo.isNullOrNil(paramString2))
        {
          ab.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labels is null.");
          AppMethodBeat.o(22498);
          return;
        }
        paramString2 = (ArrayList)PF(paramString2);
        if ((paramString2 == null) || (paramString2.isEmpty()))
        {
          ab.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labelList is null.");
          AppMethodBeat.o(22498);
          continue;
        }
      }
      finally
      {
      }
      this.username = paramString1;
      this.nHp = paramString2;
      int i = paramString2.size();
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.nHq = ((ArrayList)localObject);
      for (int j = 0; j < i; j++)
      {
        localObject = e.bIZ().aoE((String)paramString2.get(j));
        if ((localObject != null) && (((af)localObject).field_isTemporary))
          this.nHq.add(paramString2.get(j));
      }
      aw.Rg().a(635, this.nHr);
      aw.Rg().a(638, this.nHr);
      if ((this.nHq == null) || (this.nHq.isEmpty()))
      {
        i(paramString1, paramString2);
        bIW();
        AppMethodBeat.o(22498);
      }
      else
      {
        ab.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel]addList:%s", new Object[] { this.nHq.toString() });
        paramString1 = new com/tencent/mm/plugin/label/b/a;
        paramString1.<init>(this.nHq);
        aw.Rg().a(paramString1, 0);
        AppMethodBeat.o(22498);
      }
    }
  }

  public final void i(List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(22502);
    Object localObject1 = new HashMap();
    LinkedList localLinkedList = new LinkedList();
    Object localObject2;
    if (paramList1.size() > 0)
    {
      paramList1 = paramList1.iterator();
      localObject2 = paramList2.iterator();
      while (paramList1.hasNext())
      {
        paramList2 = (String)paramList1.next();
        Object localObject3 = bo.P(((String)((Iterator)localObject2).next()).split(","));
        if ((localObject3 != null) && (((List)localObject3).size() > 0))
        {
          localObject3 = ((List)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            String str1 = (String)((Iterator)localObject3).next();
            String str2;
            Object localObject4;
            if (((Map)localObject1).containsKey(str1))
            {
              str2 = (String)((Map)localObject1).get(str1);
              localObject4 = c.eR(str2, paramList2);
              if (!((String)localObject4).equalsIgnoreCase(str2))
                ((Map)localObject1).put(str1, localObject4);
            }
            else
            {
              aw.ZK();
              localObject4 = com.tencent.mm.model.c.XM().aoO(str1);
              if (localObject4 != null)
              {
                localObject4 = ((ap)localObject4).field_contactLabelIds;
                str2 = c.eR((String)localObject4, paramList2);
                if (!str2.equalsIgnoreCase((String)localObject4))
                  ((Map)localObject1).put(str1, str2);
              }
            }
          }
        }
      }
    }
    paramList2 = ((Map)localObject1).entrySet().iterator();
    while (paramList2.hasNext())
    {
      localObject1 = (Map.Entry)paramList2.next();
      paramList1 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (String)((Map.Entry)localObject1).getValue();
      localObject2 = new cmh();
      ((cmh)localObject2).jBB = paramList1;
      ((cmh)localObject2).wcD = ((String)localObject1);
      localLinkedList.add(localObject2);
    }
    if (localLinkedList.size() > 0)
    {
      paramList1 = new d(localLinkedList);
      aw.Rg().a(paramList1, 0);
    }
    AppMethodBeat.o(22502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.b
 * JD-Core Version:    0.6.2
 */