package com.tencent.mm.plugin.f.a;

import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  protected static com.tencent.mm.plugin.f.b.a R(bi parambi)
  {
    com.tencent.mm.plugin.f.b.a locala = new com.tencent.mm.plugin.f.b.a();
    locala.field_msgId = parambi.field_msgId;
    locala.field_msgType = parambi.getType();
    locala.field_username = parambi.field_talker;
    locala.field_msgtime = parambi.field_createTime;
    return locala;
  }

  private static int a(List<com.tencent.mm.plugin.f.b.a> paramList1, List<com.tencent.mm.plugin.f.b.a> paramList2, List<com.tencent.mm.plugin.f.b.a> paramList3, List<com.tencent.mm.plugin.f.b.a> paramList4)
  {
    int i;
    if ((paramList2 == null) || (paramList2.isEmpty()))
      i = -1;
    while (true)
    {
      return i;
      if ((paramList1 == null) || (paramList1.isEmpty()))
      {
        paramList1 = paramList2.iterator();
        while (paramList1.hasNext())
          paramList3.add((com.tencent.mm.plugin.f.b.a)paramList1.next());
        i = 0;
      }
      else
      {
        int j = paramList1.size();
        int k = paramList2.size();
        i = 0;
        int m = 0;
        while (i < k)
        {
          com.tencent.mm.plugin.f.b.a locala1 = (com.tencent.mm.plugin.f.b.a)paramList2.get(i);
          if (locala1 == null)
            break;
          com.tencent.mm.plugin.f.b.a locala2;
          if (m < j)
          {
            locala2 = (com.tencent.mm.plugin.f.b.a)paramList1.get(m);
            label140: if (locala2 == null)
              break;
            if (locala1.field_msgSubType != locala2.field_msgSubType)
              break label246;
            if (bo.isEqual(locala1.field_path, locala2.field_path))
              break label208;
            locala1.xDa = locala2.xDa;
            paramList4.add(locala1);
          }
          while (true)
          {
            i++;
            m++;
            break;
            locala2 = null;
            break label140;
            label208: if (!bo.af(locala1.field_size, locala2.field_size))
            {
              locala1.xDa = locala2.xDa;
              paramList4.add(locala1);
            }
          }
          label246: if (locala1.field_msgSubType >= locala2.field_msgSubType)
            break;
          paramList3.add(locala1);
          i++;
        }
        i = 1;
      }
    }
  }

  protected final String Gh(String paramString)
  {
    String str1;
    if (bo.isNullOrNil(paramString))
      str1 = "";
    while (true)
    {
      return str1;
      String str2 = g.RP().eJL;
      int i = paramString.indexOf(str2);
      str1 = paramString;
      if (i >= 0)
      {
        str1 = paramString.substring(i + str2.length());
        ab.d("MicroMsg.AbstractMsgHandler", "%s cut down result[%s] root[%s] path[%s]", new Object[] { aZm(), str1, str2, paramString });
      }
    }
  }

  public final void P(bi parambi)
  {
    int i = 0;
    if (parambi == null)
      return;
    List localList = com.tencent.mm.plugin.f.b.aZc().aZd().S(parambi);
    parambi = Q(parambi);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int j = a(localList, parambi, localArrayList1, localArrayList2);
    String str = aZm();
    if (localList != null);
    for (int k = localList.size(); ; k = 0)
    {
      if (parambi != null)
        i = parambi.size();
      ab.i("MicroMsg.AbstractMsgHandler", "%s handle compare[%d] db[%d] create[%d] insert[%d] update[%d]", new Object[] { str, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(localArrayList1.size()), Integer.valueOf(localArrayList2.size()) });
      if (j < 0)
        break;
      if (!localArrayList1.isEmpty())
        com.tencent.mm.plugin.f.b.aZc().aZd().bd(localArrayList1);
      if (localArrayList2.isEmpty())
        break;
      com.tencent.mm.plugin.f.b.aZc().aZd().be(localArrayList2);
      break;
    }
  }

  protected abstract List<com.tencent.mm.plugin.f.b.a> Q(bi parambi);

  protected abstract String aZm();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.a
 * JD-Core Version:    0.6.2
 */