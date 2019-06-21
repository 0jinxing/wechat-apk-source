package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.l;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.x;
import com.tencent.mm.ai.x.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.protocal.protobuf.cwx;
import com.tencent.mm.protocal.protobuf.cwy;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
{
  static <T> Pair<T, a.a> a(String paramString, boolean paramBoolean, a<T> parama)
  {
    a.a locala = null;
    AppMethodBeat.i(129925);
    if ((bo.isNullOrNil(paramString)) || (!com.tencent.mm.kernel.g.RN().eJb))
    {
      paramString = Pair.create(null, null);
      AppMethodBeat.o(129925);
      return paramString;
    }
    Object localObject1;
    if (!paramBoolean)
    {
      localObject1 = parama.zw(paramString);
      localObject2 = localObject1;
      if (localObject1 != null)
        if (!parama.br(localObject1))
          break label504;
    }
    for (Object localObject2 = localObject1; ; localObject2 = null)
    {
      locala = x.c(parama.zv(paramString).ehh);
      if ((locala == null) || ((locala instanceof x.a)) || (locala.errType != 0) || (locala.errCode != 0))
      {
        int i;
        label119: int j;
        if (locala == null)
        {
          i = -1;
          if (locala != null)
            break label220;
          j = -1;
          label126: if (locala != null)
            break label229;
        }
        label220: label229: for (localObject1 = "null resp"; ; localObject1 = locala.aIm)
        {
          ab.e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, errType = %d, errCode = %d, errMsg = %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(j), localObject1 });
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = parama.zw(paramString);
            if (localObject1 == null)
              break label238;
          }
          paramString = Pair.create(localObject1, locala);
          AppMethodBeat.o(129925);
          break;
          i = locala.errType;
          break label119;
          j = locala.errCode;
          break label126;
        }
        label238: paramString = Pair.create(null, locala);
        AppMethodBeat.o(129925);
        break;
      }
      localObject1 = ((cwy)locala.fsy).vMT.iterator();
      while (true)
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (cwx)((Iterator)localObject1).next();
          if ("UserName".equalsIgnoreCase(((cwx)localObject2).vMU))
          {
            localObject1 = ((cwx)localObject2).pXM;
            localObject2 = localObject1;
            if (((String)localObject1).endsWith("@app"))
              break;
          }
        }
      for (localObject2 = (String)localObject1 + "@app"; ; localObject2 = null)
      {
        localObject1 = localObject2;
        if (bo.isNullOrNil((String)localObject2))
        {
          localObject2 = parama.getUsername();
          localObject1 = localObject2;
          if (bo.isNullOrNil((String)localObject2))
          {
            ab.e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, key %s, cgi sync fail username invalid", new Object[] { Boolean.valueOf(paramBoolean), paramString });
            paramString = Pair.create(null, null);
            AppMethodBeat.o(129925);
            break;
          }
        }
        if (com.tencent.mm.plugin.appbrand.app.f.auO().a((String)localObject1, ((cwy)locala.fsy).vMS, ((cwy)locala.fsy).vMT))
          p.ayH().b("single", 3, localObject1);
        localObject1 = parama.zw(paramString);
        ab.i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, cgi sync result %s", new Object[] { Boolean.valueOf(paramBoolean), localObject1 });
        for (paramString = locala; ; paramString = locala)
        {
          paramString = Pair.create(localObject1, paramString);
          AppMethodBeat.o(129925);
          break;
          label504: ab.i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, no need cgi sync, query record %s", new Object[] { Boolean.valueOf(paramBoolean), localObject1 });
        }
      }
    }
  }

  public static void a(String paramString, boolean paramBoolean, r.b<WxaAttributes> paramb)
  {
    AppMethodBeat.i(129927);
    if (zs(paramString))
    {
      AppMethodBeat.o(129927);
      return;
    }
    Looper localLooper;
    if ((al.isMainThread()) || (Looper.myLooper() == null))
      localLooper = new al().oAl.getLooper();
    for (boolean bool = true; ; bool = false)
    {
      new ak(localLooper).post(new r.5(paramString, paramBoolean, paramb, bool));
      AppMethodBeat.o(129927);
      break;
      localLooper = Looper.myLooper();
    }
  }

  public static void a(List<String> paramList, j.a parama)
  {
    AppMethodBeat.i(129929);
    if (bo.ek(paramList))
      AppMethodBeat.o(129929);
    while (true)
    {
      return;
      if (al.isMainThread())
      {
        m.aNS().aa(new r.6(paramList, parama));
        AppMethodBeat.o(129929);
      }
      else
      {
        Object localObject = paramList;
        if (!(paramList instanceof ArrayList))
        {
          if (!(paramList instanceof LinkedList))
            break label106;
          localObject = paramList;
        }
        while (true)
        {
          paramList = ((List)localObject).iterator();
          while (paramList.hasNext())
            if (!zr((String)paramList.next()))
              paramList.remove();
          label106: localObject = new LinkedList();
          ((List)localObject).addAll(paramList);
        }
        if (bo.ek((List)localObject))
        {
          AppMethodBeat.o(129929);
        }
        else
        {
          ab.i("MicroMsg.WxaAttrSyncHelper", "batchSync, list_size %d, scene %s(%d)", new Object[] { Integer.valueOf(((List)localObject).size()), parama.name(), Integer.valueOf(parama.intValue) });
          int i = 0;
          int j = 0;
          while (i < ((List)localObject).size() / 20)
          {
            int k = i * 20;
            j = k + 20;
            b(((List)localObject).subList(k, j), parama);
            i++;
          }
          if (j < ((List)localObject).size())
            b(((List)localObject).subList(j, ((List)localObject).size()), parama);
          AppMethodBeat.o(129929);
        }
      }
    }
  }

  public static Pair<WxaAttributes, a.a> aa(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(129924);
    paramString = a(paramString, paramBoolean, new r.3(paramString));
    AppMethodBeat.o(129924);
    return paramString;
  }

  public static Pair<WxaAttributes, a.a> ab(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(129926);
    if (zs(paramString))
    {
      paramString = new Pair(null, null);
      AppMethodBeat.o(129926);
    }
    while (true)
    {
      return paramString;
      paramString = a(paramString, paramBoolean, new r.4(paramString));
      AppMethodBeat.o(129926);
    }
  }

  private static int ayI()
  {
    AppMethodBeat.i(129920);
    int i = com.tencent.mm.m.g.Nu().getInt("MMBizAttrSyncFreq", 3600);
    AppMethodBeat.o(129920);
    return i;
  }

  private static void b(List<String> paramList, j.a parama)
  {
    AppMethodBeat.i(129930);
    if (bo.ek(paramList))
      AppMethodBeat.o(129930);
    while (true)
    {
      return;
      new j(paramList, parama).acy().i(new r.7());
      AppMethodBeat.o(129930);
    }
  }

  static boolean zr(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(129921);
    if (com.tencent.mm.plugin.appbrand.app.f.auO() == null)
    {
      ab.w("MicroMsg.WxaAttrSyncHelper", "needUpdateAttr, storage NULL");
      AppMethodBeat.o(129921);
    }
    while (true)
    {
      return bool;
      long l1 = bo.anT();
      long l2 = com.tencent.mm.plugin.appbrand.app.f.auO().ze(paramString);
      int i = ayI();
      ab.v("MicroMsg.WxaAttrSyncHelper", "needUpdateAttr, username(%s), currentMS(%d), lastUpdateTime(%d), freq(%d).", new Object[] { paramString, Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i) });
      if (l1 - l2 >= i)
      {
        AppMethodBeat.o(129921);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(129921);
      }
    }
  }

  private static boolean zs(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(129922);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129922);
    while (true)
    {
      return bool;
      if (!l.mg(paramString))
      {
        ab.e("MicroMsg.WxaAttrSyncHelper", "checkLogIfInvalidUsername %s, %s", new Object[] { paramString, an.l(new Throwable()) });
        com.tencent.mm.plugin.report.e.pXa.a(648L, 1L, 1L, false);
        AppMethodBeat.o(129922);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(129922);
      }
    }
  }

  public static void zt(String paramString)
  {
    AppMethodBeat.i(129923);
    if (zs(paramString))
      AppMethodBeat.o(129923);
    while (true)
    {
      return;
      d.post(new r.1(paramString), "WxaAttrSync");
      AppMethodBeat.o(129923);
    }
  }

  public static void zu(String paramString)
  {
    AppMethodBeat.i(129928);
    if (zs(paramString))
      AppMethodBeat.o(129928);
    while (true)
    {
      return;
      if (zr(paramString))
        ab(paramString, true);
      AppMethodBeat.o(129928);
    }
  }

  static abstract interface a<T>
  {
    public abstract boolean br(T paramT);

    public abstract String getUsername();

    public abstract k zv(String paramString);

    public abstract T zw(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.r
 * JD-Core Version:    0.6.2
 */