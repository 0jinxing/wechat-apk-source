package com.tencent.mm.plugin.appbrand.appusage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.b.c.a;
import com.tencent.mm.plugin.appbrand.appcache.b.e.b;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.e.j;
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

public final class w extends k
{
  public static final String[] fjY;
  public final h hae;
  final w.b hao;
  public final w.c hap;

  static
  {
    AppMethodBeat.i(129694);
    fjY = new String[] { j.a(w.a.fjX, "AppBrandLauncherLayoutItem") };
    AppMethodBeat.o(129694);
  }

  public w(h paramh)
  {
    AppMethodBeat.i(129675);
    this.hap = new w.c(this, (byte)0);
    this.hae = paramh;
    this.hao = new w.b(paramh);
    AppMethodBeat.o(129675);
  }

  private boolean a(String paramString1, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(129684);
    boolean bool1;
    if ((bo.isNullOrNil(paramString1)) || (999 == paramInt1))
    {
      bool1 = false;
      AppMethodBeat.o(129684);
      return bool1;
    }
    Object localObject = String.format(Locale.US, "select max(%s) from %s where %s=?", new Object[] { "updateTime", "AppBrandLauncherLayoutItem", "scene" });
    localObject = this.hae.a((String)localObject, new String[] { "2" }, 0);
    long l;
    label88: int j;
    label176: boolean bool2;
    if (localObject == null)
    {
      l = 0L;
      l = Math.max(l + 1L, bo.anT());
      int i = z(paramString1, paramInt1, 2);
      localObject = new ContentValues(1);
      ((ContentValues)localObject).put("updateTime", Long.valueOf(l));
      if (this.hae.update("AppBrandLauncherLayoutItem", (ContentValues)localObject, String.format(Locale.US, "%s=?", new Object[] { "recordId" }), new String[] { String.valueOf(i) }) <= 0)
        break label429;
      j = 1;
      if (j != 0)
        b("single", 3, String.valueOf(i));
      if (j != 0)
        break label435;
      localObject = new w.a();
      ((w.a)localObject).field_updateTime = l;
      ((w.a)localObject).field_scene = 2;
      ((w.a)localObject).field_brandId = paramString1;
      ((w.a)localObject).field_versionType = paramInt1;
      bool1 = a((w.a)localObject);
      if (bool1)
        b("single", 2, String.valueOf(i));
      bool2 = bool1;
      label261: if ((bool1) && (paramBoolean1))
      {
        localObject = ((b)f.E(b.class)).x(paramString1, 3, paramInt2);
        if (!((Boolean)((Pair)localObject).first).booleanValue())
          break label444;
        ab.i("MicroMsg.AppBrandUsageStorage", "addRecord, addOk TRUE, cgi blocked by username(%s), scene(%d)", new Object[] { paramString1, Integer.valueOf(paramInt2) });
        paramString2 = a.gWl;
        a.z(((Integer)((Pair)localObject).second).intValue(), 165L);
      }
    }
    while (true)
    {
      if (bool1)
        x.an(paramString1, paramInt1);
      if (bool2)
        axK();
      if (bool1)
        ((n)f.E(n.class)).a(paramString1, paramInt1, n.a.gZv);
      AppMethodBeat.o(129684);
      break;
      l = 0L;
      if (((Cursor)localObject).moveToFirst())
        l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      break label88;
      label429: j = 0;
      break label176;
      label435: bool1 = true;
      bool2 = false;
      break label261;
      label444: new aa(paramInt2, paramBoolean2, paramInt1, 1, paramString1, paramInt3, paramString2).acy();
    }
  }

  private boolean aJ(String paramString, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(129686);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129686);
      bool1 = bool2;
      return bool1;
    }
    if (this.hae.delete("AppBrandLauncherLayoutItem", String.format(Locale.US, "%s=?", new Object[] { "recordId" }), new String[] { String.valueOf(z(paramString, paramInt, 2)) }) > 0);
    while (true)
    {
      if (bool1)
        ((n)f.E(n.class)).b(paramString, paramInt, n.a.gZv);
      AppMethodBeat.o(129686);
      break;
      bool1 = false;
    }
  }

  private void axK()
  {
    AppMethodBeat.i(129685);
    Object localObject1 = this.hae.a(String.format(Locale.US, "select count(*) from %s where %s=?", new Object[] { "AppBrandLauncherLayoutItem", "scene" }), new String[] { "2" }, 0);
    int i;
    Object localObject2;
    if (localObject1 == null)
    {
      i = 0;
      if (i <= 10000)
        break label474;
      localObject2 = a(new String[] { "recordId", "brandId", "versionType" }, 2147483647, 10000);
      if (localObject2 != null)
        break label131;
      AppMethodBeat.o(129685);
    }
    while (true)
    {
      return;
      i = 0;
      if (((Cursor)localObject1).moveToFirst())
        i = ((Cursor)localObject1).getInt(0);
      ((Cursor)localObject1).close();
      break;
      label131: LinkedList localLinkedList = new LinkedList();
      ArrayList localArrayList = new ArrayList(i - 10000);
      localObject1 = new ArrayList(i - 10000);
      if (((Cursor)localObject2).moveToFirst())
        do
        {
          localLinkedList.add(String.valueOf(((Cursor)localObject2).getInt(0)));
          localArrayList.add(((Cursor)localObject2).getString(1));
          ((List)localObject1).add(Integer.valueOf(((Cursor)localObject2).getInt(2)));
        }
        while (((Cursor)localObject2).moveToNext());
      ((Cursor)localObject2).close();
      if (bo.ek(localLinkedList))
      {
        AppMethodBeat.o(129685);
      }
      else
      {
        long l = this.hae.iV(Thread.currentThread().getId());
        Object localObject3 = localLinkedList.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (String)((Iterator)localObject3).next();
          this.hae.delete("AppBrandLauncherLayoutItem", String.format(Locale.US, "%s=?", new Object[] { "recordId" }), new String[] { localObject2 });
        }
        this.hae.mB(l);
        localObject2 = new ArrayList(localArrayList.size());
        localObject3 = new ArrayList(localArrayList.size());
        for (i = 0; i < localArrayList.size(); i++)
        {
          String str = p.zm((String)localArrayList.get(i));
          if (!bo.isNullOrNil(str))
          {
            ((List)localObject2).add(str);
            ((List)localObject3).add(((List)localObject1).get(i));
          }
        }
        if (f.auV() != null)
          f.auV().d((List)localObject2, (List)localObject3);
        b("batch", 5, localLinkedList);
        label474: AppMethodBeat.o(129685);
      }
    }
  }

  public static ArrayList<AppBrandRecentTaskInfo> f(Cursor paramCursor)
  {
    AppMethodBeat.i(129679);
    Object localObject;
    if (paramCursor == null)
    {
      localObject = new ArrayList();
      AppMethodBeat.o(129679);
      return localObject;
    }
    if (paramCursor.moveToFirst())
    {
      LinkedList localLinkedList = new LinkedList();
      localObject = new w.a();
      do
      {
        ((w.a)localObject).d(paramCursor);
        if (!bo.isNullOrNil(((w.a)localObject).field_brandId))
          localLinkedList.add(p.a(String.valueOf(((w.a)localObject).field_recordId), ((w.a)localObject).field_brandId, ((w.a)localObject).field_versionType, ((w.a)localObject).field_updateTime));
      }
      while (paramCursor.moveToNext());
      localObject = new ArrayList(localLinkedList.size());
      ((ArrayList)localObject).addAll(localLinkedList);
    }
    while (true)
    {
      paramCursor.close();
      AppMethodBeat.o(129679);
      break;
      localObject = new ArrayList();
    }
  }

  private static int z(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129692);
    paramInt1 = String.format(Locale.US, "%s|%d|%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }).hashCode();
    AppMethodBeat.o(129692);
    return paramInt1;
  }

  final Cursor a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129678);
    paramArrayOfString = this.hae.query("AppBrandLauncherLayoutItem", paramArrayOfString, String.format(Locale.US, "%s=? order by %s desc limit %d offset %d", new Object[] { "scene", "updateTime", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), new String[] { "2" }, null, null, null);
    AppMethodBeat.o(129678);
    return paramArrayOfString;
  }

  final boolean a(w.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(129691);
    if (bo.isNullOrNil(parama.field_brandId))
      AppMethodBeat.o(129691);
    while (true)
    {
      return bool;
      long l = this.hae.insert("AppBrandLauncherLayoutItem", "", parama.Hl());
      if ((l > 0L) || (l == parama.field_recordId))
      {
        bool = true;
        AppMethodBeat.o(129691);
      }
      else
      {
        AppMethodBeat.o(129691);
      }
    }
  }

  public final boolean a(String paramString1, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(129687);
    paramBoolean = a(paramString1, paramInt1, true, paramBoolean, paramInt2, paramInt3, paramString2);
    if (paramBoolean)
      i.yt(paramString2);
    AppMethodBeat.o(129687);
    return paramBoolean;
  }

  public final boolean aI(String paramString, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(129677);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129677);
    while (true)
    {
      return bool2;
      paramString = this.hae.a(String.format(Locale.US, "select count(*) from %s where %s=? and %s=? and %s=?", new Object[] { "AppBrandLauncherLayoutItem", "brandId", "versionType", "scene" }), new String[] { paramString, String.valueOf(paramInt), "2" }, 0);
      if (paramString != null)
        break;
      AppMethodBeat.o(129677);
    }
    if (paramString.moveToFirst())
      if (paramString.getInt(0) > 0)
        bool2 = bool1;
    while (true)
    {
      paramString.close();
      AppMethodBeat.o(129677);
      break;
      bool2 = false;
      continue;
      bool2 = false;
    }
  }

  public final void aK(String paramString, int paramInt)
  {
    AppMethodBeat.i(129688);
    a(paramString, paramInt, false, false, 0, 0, null);
    AppMethodBeat.o(129688);
  }

  public final boolean aL(String paramString, int paramInt)
  {
    AppMethodBeat.i(129689);
    boolean bool = aJ(paramString, paramInt);
    if (bool)
    {
      aa.aN(paramString, paramInt).acy();
      b("single", 5, String.valueOf(z(paramString, paramInt, 2)));
    }
    AppMethodBeat.o(129689);
    return bool;
  }

  public final boolean aM(String paramString, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(129690);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(129690);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      String str = String.format("select count(*) from %s where %s=?", new Object[] { "AppBrandLauncherLayoutItem", "recordId" });
      paramString = this.hae.a(str, new String[] { String.valueOf(z(paramString, paramInt, 2)) }, 2);
      if ((paramString == null) || (paramString.isClosed()))
      {
        AppMethodBeat.o(129690);
        bool1 = bool2;
        continue;
      }
      try
      {
        if (paramString.moveToFirst())
        {
          paramInt = paramString.getInt(0);
          if (paramInt > 0);
          while (true)
          {
            paramString.close();
            AppMethodBeat.o(129690);
            break;
            bool1 = false;
          }
        }
        paramString.close();
        AppMethodBeat.o(129690);
        bool1 = bool2;
      }
      finally
      {
        paramString.close();
        AppMethodBeat.o(129690);
      }
    }
  }

  public final ArrayList<AppBrandRecentTaskInfo> axJ()
  {
    AppMethodBeat.i(129681);
    ArrayList localArrayList = nD(10000);
    AppMethodBeat.o(129681);
    return localArrayList;
  }

  public final void c(k.a parama)
  {
    AppMethodBeat.i(129676);
    a(parama, e.aNS().oAl.getLooper());
    AppMethodBeat.o(129676);
  }

  public final ArrayList<AppBrandRecentTaskInfo> nD(int paramInt)
  {
    AppMethodBeat.i(129680);
    ArrayList localArrayList = f(a(null, paramInt, 0));
    AppMethodBeat.o(129680);
    return localArrayList;
  }

  public final AppBrandRecentTaskInfo yw(String paramString)
  {
    Object localObject = null;
    w.a locala = null;
    AppMethodBeat.i(129682);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129682);
      paramString = locala;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.hae.query("AppBrandLauncherLayoutItem", null, String.format(Locale.US, "%s=? and %s=?", new Object[] { "scene", "recordId" }), new String[] { "2", paramString }, null, null, null);
      if (localCursor == null)
      {
        AppMethodBeat.o(129682);
        paramString = locala;
      }
      else
      {
        paramString = localObject;
        if (localCursor.moveToFirst())
        {
          locala = new w.a();
          locala.d(localCursor);
          paramString = localObject;
          if (!bo.isNullOrNil(locala.field_brandId))
            paramString = p.a(String.valueOf(locala.field_recordId), locala.field_brandId, locala.field_versionType, locala.field_updateTime);
        }
        localCursor.close();
        AppMethodBeat.o(129682);
      }
    }
  }

  public final List<String> yx(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(129683);
    LinkedList localLinkedList = new LinkedList();
    if (!bo.isNullOrNil(paramString))
    {
      h localh = this.hae;
      String str = String.format(Locale.US, "%s=? and %s=?", new Object[] { "scene", "brandId" });
      paramString = localh.query("AppBrandLauncherLayoutItem", new String[] { "recordId" }, str, new String[] { "2", paramString }, null, null, null);
      if (paramString == null)
        AppMethodBeat.o(129683);
    }
    for (paramString = localObject; ; paramString = localLinkedList)
    {
      return paramString;
      if (paramString.moveToFirst())
        do
          localLinkedList.add(String.valueOf(paramString.getInt(paramString.getColumnIndex("recordId"))));
        while (paramString.moveToNext());
      paramString.close();
      AppMethodBeat.o(129683);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.w
 * JD-Core Version:    0.6.2
 */