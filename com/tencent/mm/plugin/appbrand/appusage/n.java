package com.tencent.mm.plugin.appbrand.appusage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
public final class n extends j<m>
  implements ag
{
  public static final String[] fjY;
  private final e gTC;

  static
  {
    AppMethodBeat.i(129582);
    fjY = new String[] { j.a(m.gSs, "AppBrandLocalUsageRecord") };
    AppMethodBeat.o(129582);
  }

  public n(e parame)
  {
    super(parame, m.gSs, "AppBrandLocalUsageRecord", m.diI);
    this.gTC = parame;
  }

  private boolean a(m paramm, boolean paramBoolean, String[] paramArrayOfString)
  {
    boolean bool = false;
    AppMethodBeat.i(129580);
    if (paramBoolean)
    {
      paramBoolean = super.a(paramm, paramBoolean, paramArrayOfString);
      AppMethodBeat.o(129580);
    }
    while (true)
    {
      return paramBoolean;
      if (!b(paramm, paramArrayOfString))
      {
        AppMethodBeat.o(129580);
        paramBoolean = bool;
      }
      else
      {
        super.a(paramm, paramBoolean, paramArrayOfString);
        if (!b(paramm, paramArrayOfString))
        {
          paramBoolean = true;
          AppMethodBeat.o(129580);
        }
        else
        {
          AppMethodBeat.o(129580);
          paramBoolean = bool;
        }
      }
    }
  }

  private static void aC(List<LocalUsageInfo> paramList)
  {
    AppMethodBeat.i(129576);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100361");
    if ((((com.tencent.mm.storage.c)localObject).isValid()) && (bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("isOpenBatchAttrSync"), 0) > 0))
    {
      localObject = new HashSet(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext())
        ((Set)localObject).add(((LocalUsageInfo)paramList.next()).username);
      paramList = new ArrayList(((Set)localObject).size());
      paramList.addAll((Collection)localObject);
      r.a(paramList, com.tencent.mm.plugin.appbrand.config.j.a.hhm);
    }
    AppMethodBeat.o(129576);
  }

  public final boolean a(String paramString, int paramInt, n.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(129578);
    ab.i("MicroMsg.AppBrandLocalUsageStorage", "addUsage, username %s, type %d, scene %s", new Object[] { paramString, Integer.valueOf(paramInt), parama });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129578);
    while (true)
    {
      return bool;
      parama = new m();
      parama.field_username = paramString;
      parama.field_versionType = paramInt;
      if (super.b(parama, m.gSr))
      {
        parama.field_updateTime = bo.anT();
        bool = super.a(parama.xDa, parama, false);
        if (bool)
          b("single", 3, null);
        AppMethodBeat.o(129578);
      }
      else
      {
        parama.field_updateTime = bo.anT();
        super.a(parama, false);
        bool = super.b(parama, m.gSr);
        if (bool)
        {
          paramInt = AppBrandGlobalSystemConfig.ayC().hfS;
          paramString = "delete from AppBrandLocalUsageRecord where rowid not in ( select rowid from AppBrandLocalUsageRecord order by updateTime desc  limit " + paramInt + " offset 0)";
          this.gTC.hY("AppBrandLocalUsageRecord", paramString);
          b("single", 2, null);
        }
        AppMethodBeat.o(129578);
      }
    }
  }

  public final boolean aE(String paramString, int paramInt)
  {
    AppMethodBeat.i(129577);
    boolean bool = b(paramString, paramInt, n.a.gZu);
    AppMethodBeat.o(129577);
    return bool;
  }

  final boolean b(String paramString, int paramInt, n.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(129579);
    ab.i("MicroMsg.AppBrandLocalUsageStorage", "removeUsage, username %s, type %d, scene %s", new Object[] { paramString, Integer.valueOf(paramInt), parama });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129579);
    while (true)
    {
      return bool;
      m localm = new m();
      localm.field_username = paramString;
      localm.field_versionType = paramInt;
      bool = a(localm, false, m.gSr);
      if (bool)
        b("single", 5, null);
      if ((bool) && (n.a.gZu == parama))
        f.auT().aL(paramString, paramInt);
      if ((bool) && (n.a.gZu == parama))
        h.bt(p.zm(paramString), paramInt);
      AppMethodBeat.o(129579);
    }
  }

  public final List<LocalUsageInfo> nA(int paramInt)
  {
    AppMethodBeat.i(129575);
    Object localObject = "select AppBrandLocalUsageRecord.username,AppBrandLocalUsageRecord.versionType,WxaAttributesTable.nickname,WxaAttributesTable.brandIconURL,WxaAttributesTable.appId,WxaAttributesTable.appInfo,WxaAttributesTable.shortNickname,WxaAttributesTable.versionInfo from AppBrandLocalUsageRecord left outer join WxaAttributesTable on AppBrandLocalUsageRecord.username=WxaAttributesTable.username order by AppBrandLocalUsageRecord.updateTime desc limit " + Math.max(paramInt, 1) + " offset 0";
    Cursor localCursor = this.gTC.rawQuery((String)localObject, null);
    if (localCursor == null)
    {
      localObject = null;
      AppMethodBeat.o(129575);
    }
    while (true)
    {
      return localObject;
      if (localCursor.moveToFirst())
        break;
      localCursor.close();
      localObject = null;
      AppMethodBeat.o(129575);
    }
    LinkedList localLinkedList = new LinkedList();
    label95: String str1 = localCursor.getString(0);
    int i;
    String str2;
    String str3;
    String str4;
    WxaAttributes.a locala;
    String str5;
    long l1;
    label190: long l2;
    if (!bo.isNullOrNil(str1))
    {
      i = localCursor.getInt(1);
      str2 = localCursor.getString(2);
      str3 = localCursor.getString(3);
      str4 = localCursor.getString(4);
      locala = WxaAttributes.a.zx(localCursor.getString(5));
      str5 = localCursor.getString(6);
      localObject = WxaAttributes.e.zz(localCursor.getString(7));
      if (locala != null)
        break label295;
      l1 = 0L;
      if ((!com.tencent.mm.plugin.appbrand.appcache.j.a.np(i)) || (locala == null))
        break label305;
      l2 = locala.haR;
      label210: if (localObject != null)
        break label311;
    }
    label295: label305: label311: for (paramInt = 0; ; paramInt = ((WxaAttributes.e)localObject).axy)
    {
      localLinkedList.add(new LocalUsageInfo(str1, str4, i, paramInt, str2, str5, str3, false, l1, l2));
      if (localCursor.moveToNext())
        break label95;
      localCursor.close();
      localObject = new ArrayList(localLinkedList.size());
      ((ArrayList)localObject).addAll(localLinkedList);
      aC((List)localObject);
      AppMethodBeat.o(129575);
      break;
      l1 = locala.haQ;
      break label190;
      l2 = 0L;
      break label210;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.n
 * JD-Core Version:    0.6.2
 */