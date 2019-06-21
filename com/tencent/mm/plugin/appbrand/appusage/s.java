package com.tencent.mm.plugin.appbrand.appusage;

import android.database.Cursor;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.protocal.protobuf.cda;
import com.tencent.mm.protocal.protobuf.cwq;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class s extends k
{
  public static final String[] fjY;
  private static final s.b<cwq> hag;
  private static final s.b<LocalUsageInfo> hah;
  final h hae;
  private final s.c haf;

  static
  {
    AppMethodBeat.i(129656);
    fjY = new String[] { com.tencent.mm.sdk.e.j.a(s.a.fjX, "AppBrandStarApp") };
    hag = new s.1();
    hah = new s.2();
    AppMethodBeat.o(129656);
  }

  public s(h paramh)
  {
    AppMethodBeat.i(129645);
    this.hae = paramh;
    this.haf = new s.c(paramh);
    AppMethodBeat.o(129645);
  }

  private ArrayList<AppBrandRecentTaskInfo> nB(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(129650);
    Object localObject2 = "select AppBrandStarApp.username, AppBrandStarApp.versionType, AppBrandLocalUsageRecord.updateTime from AppBrandStarApp left outer join AppBrandLocalUsageRecord on AppBrandStarApp.username = AppBrandLocalUsageRecord.username and AppBrandStarApp.versionType = AppBrandLocalUsageRecord.versionType order by AppBrandLocalUsageRecord.updateTime desc limit " + Math.max(paramInt, 1) + " offset 0";
    localObject2 = this.hae.a((String)localObject2, null, 0);
    if (localObject2 == null)
      AppMethodBeat.o(129650);
    while (true)
    {
      return localObject1;
      if (!((Cursor)localObject2).moveToFirst())
      {
        ((Cursor)localObject2).close();
        AppMethodBeat.o(129650);
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        do
        {
          localObject1 = ((Cursor)localObject2).getString(0);
          if (!bo.isNullOrNil((String)localObject1))
          {
            paramInt = ((Cursor)localObject2).getInt(1);
            long l = ((Cursor)localObject2).getLong(2);
            localLinkedList.add(p.a(String.format(Locale.US, "$%s$%d@starapp", new Object[] { localObject1, Integer.valueOf(paramInt) }), (String)localObject1, paramInt, l));
          }
        }
        while (((Cursor)localObject2).moveToNext());
        ((Cursor)localObject2).close();
        localObject1 = new ArrayList(localLinkedList.size());
        ((ArrayList)localObject1).addAll(localLinkedList);
        AppMethodBeat.o(129650);
      }
    }
  }

  public final ArrayList<AppBrandRecentTaskInfo> a(af.a parama)
  {
    AppMethodBeat.i(129648);
    parama = b(-1, parama);
    AppMethodBeat.o(129648);
    return parama;
  }

  final <T> void a(Class<T> paramClass, List<T> paramList, Long paramLong)
  {
    AppMethodBeat.i(129652);
    if (paramClass == cwq.class);
    long l;
    for (paramClass = hag; ; paramClass = hah)
    {
      l = this.hae.iV(Thread.currentThread().getId());
      this.hae.delete("AppBrandStarApp", "", null);
      if (bo.ek(paramList))
        break label211;
      if (paramList == null)
        break label206;
      paramList = a.a.j.l((Iterable)paramList);
      s.a locala = new s.a();
      Iterator localIterator = paramList.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        paramList = localIterator.next();
        if (!bo.isNullOrNil(paramClass.bq(paramList)))
        {
          locala.field_username = paramClass.bq(paramList);
          locala.field_versionType = paramClass.bp(paramList);
          locala.field_updateTime = paramClass.bo(paramList);
          i++;
          locala.field_orderSequence = (i * (t.axI() * 2));
          this.hae.insert("AppBrandStarApp", null, locala.Hl());
        }
      }
      if (paramClass != LocalUsageInfo.class)
        break;
    }
    AppMethodBeat.o(129652);
    while (true)
    {
      return;
      label206: paramList = null;
      break;
      label211: this.hae.mB(l);
      b("batch", 3, paramLong);
      AppMethodBeat.o(129652);
    }
  }

  public final boolean aF(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(129651);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      paramString = localObject;
      if (paramString != null)
        break label90;
      AppMethodBeat.o(129651);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString = this.hae.query("AppBrandStarApp", null, String.format(Locale.US, "%s=? and %s=?", new Object[] { "username", "versionType" }), new String[] { paramString, String.valueOf(paramInt) }, null, null, null);
      break;
      label90: bool = paramString.moveToFirst();
      paramString.close();
      AppMethodBeat.o(129651);
    }
  }

  public final int aG(String paramString, int paramInt)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(129653);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129653);
      paramInt = -1;
    }
    long l2;
    label164: long l3;
    while (true)
    {
      return paramInt;
      if (j.a.np(paramInt))
      {
        localObject = f.auO().d(paramString, new String[] { "appInfo" });
        if ((localObject == null) || (TextUtils.isEmpty(((WxaAttributes)localObject).field_appInfo)))
          k = 0;
        while (true)
        {
          if (k == 0)
            break label164;
          paramInt = -3;
          AppMethodBeat.o(129653);
          break;
          l1 = ((WxaAttributes)localObject).ayJ().haR;
          l2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
          ab.i("MicroMsg.AppBrandStarAppStorage", "checkIsAddStarBlocked username[%s] until[%d] now[%d]", new Object[] { paramString, Long.valueOf(l1), Long.valueOf(l2) });
          if (l2 < l1)
            k = 1;
          else
            k = 0;
        }
      }
      l2 = bo.anT();
      localObject = String.format(Locale.US, "select %s from %s order by %s desc limit 1 offset 0", new Object[] { "orderSequence", "AppBrandStarApp", "orderSequence" });
      localObject = this.hae.a((String)localObject, null, 2);
      if ((localObject != null) && (!((Cursor)localObject).isClosed()))
        break;
      l1 = 0L;
      l3 = t.axI() * 2;
      k = i;
      if (aF(paramString, paramInt))
        break label381;
      if (axF() < t.axI())
        break label310;
      paramInt = -2;
      AppMethodBeat.o(129653);
    }
    if (!((Cursor)localObject).moveToFirst());
    for (long l1 = 0L; ; l1 = ((Cursor)localObject).getLong(0))
    {
      ((Cursor)localObject).close();
      break;
    }
    label310: Object localObject = new s.a();
    ((s.a)localObject).field_username = paramString;
    ((s.a)localObject).field_versionType = paramInt;
    ((s.a)localObject).field_updateTime = l2;
    ((s.a)localObject).field_orderSequence = (l1 + l3);
    this.haf.a((com.tencent.mm.sdk.e.c)localObject, false);
    if (aF(paramString, paramInt))
      b("single", 2, localObject);
    for (int k = 1; ; k = 0)
    {
      label381: if (k != 0)
      {
        localObject = new cda();
        ((cda)localObject).username = paramString;
        ((cda)localObject).vOO = paramInt;
        ((c)g.K(c.class)).a(z.a((cda)localObject), z.b.haC);
      }
      if (k != 0)
      {
        AppMethodBeat.o(129653);
        paramInt = j;
        break;
      }
      AppMethodBeat.o(129653);
      paramInt = -1;
      break;
    }
  }

  public final boolean aH(String paramString, int paramInt)
  {
    AppMethodBeat.i(129654);
    boolean bool = j(paramString, paramInt, true);
    AppMethodBeat.o(129654);
    return bool;
  }

  public final int axF()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(129647);
    Cursor localCursor = this.hae.a("select count(*) from AppBrandStarApp", null, 0);
    if ((localCursor == null) || (localCursor.isClosed()))
      AppMethodBeat.o(129647);
    while (true)
    {
      return j;
      j = i;
      if (localCursor.moveToFirst())
        j = localCursor.getInt(0);
      localCursor.close();
      AppMethodBeat.o(129647);
    }
  }

  public final ArrayList<AppBrandRecentTaskInfo> b(int paramInt, af.a parama)
  {
    Object localObject1 = null;
    LinkedList localLinkedList = null;
    AppMethodBeat.i(129649);
    af.a locala = parama;
    if (parama == null)
      locala = af.a.haK;
    if (locala == af.a.haM)
    {
      parama = nB(paramInt);
      AppMethodBeat.o(129649);
      return parama;
    }
    if (paramInt <= 0);
    Object localObject2;
    for (paramInt = t.axI(); ; paramInt = Math.min(t.axI(), paramInt))
    {
      localObject2 = this.hae;
      parama = String.format(Locale.US, "%s desc limit %d offset 0", new Object[] { "orderSequence", Integer.valueOf(paramInt) });
      localObject2 = ((h)localObject2).query("AppBrandStarApp", new String[] { "username", "versionType" }, null, null, null, null, parama);
      if (localObject2 != null)
        break label144;
      AppMethodBeat.o(129649);
      parama = localLinkedList;
      break;
    }
    label144: if (af.a.haL == locala)
    {
      parama = localObject1;
      if (((Cursor)localObject2).moveToLast())
      {
        label164: localLinkedList = new LinkedList();
        parama = new s.a();
        label181: 
        do
        {
          parama.d((Cursor)localObject2);
          localLinkedList.add(p.a(String.format(Locale.US, "$%s$%d@starapp", new Object[] { parama.field_username, Integer.valueOf(parama.field_versionType) }), parama.field_username, parama.field_versionType, -1L));
          if (af.a.haL != locala)
            break;
        }
        while (((Cursor)localObject2).moveToPrevious());
      }
    }
    while (true)
    {
      parama = new ArrayList(localLinkedList.size());
      parama.addAll(localLinkedList);
      do
      {
        ((Cursor)localObject2).close();
        AppMethodBeat.o(129649);
        break;
        parama = localObject1;
      }
      while (!((Cursor)localObject2).moveToFirst());
      break label164;
      if (((Cursor)localObject2).moveToNext())
        break label181;
    }
  }

  public final void c(k.a parama)
  {
    AppMethodBeat.i(129646);
    a(parama, e.aNS().oAl.getLooper());
    AppMethodBeat.o(129646);
  }

  public final boolean j(String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(129655);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129655);
      return bool2;
    }
    Object localObject = new s.a();
    ((s.a)localObject).field_username = paramString;
    ((s.a)localObject).field_versionType = paramInt;
    bool2 = bool1;
    if (this.haf.b((com.tencent.mm.sdk.e.c)localObject, new String[] { "versionType", "username" }))
    {
      this.haf.a((com.tencent.mm.sdk.e.c)localObject, false, s.a.gSr);
      if (aF(paramString, paramInt))
        break label177;
      b("single", 5, localObject);
    }
    label177: for (bool2 = bool1; ; bool2 = false)
    {
      if ((bool2) && (paramBoolean))
      {
        localObject = new cda();
        ((cda)localObject).username = paramString;
        ((cda)localObject).vOO = paramInt;
        ((c)g.K(c.class)).a(z.b((cda)localObject), z.b.haC);
      }
      AppMethodBeat.o(129655);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.s
 * JD-Core Version:    0.6.2
 */