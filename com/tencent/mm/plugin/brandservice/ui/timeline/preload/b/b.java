package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import a.k.m;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.g;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.g.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.h;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.plugin.webview.preload.TmplParams.a;
import com.tencent.mm.protocal.protobuf.chh;
import com.tencent.mm.protocal.protobuf.chi;
import com.tencent.mm.protocal.protobuf.chj;
import com.tencent.mm.protocal.protobuf.rw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.at;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/resdownload/LocalTmplInfoManager;", "", "()V", "HARDCODE_URL", "", "MIN_CHECK_TIME", "", "PPREFIX_MP", "PREFIX", "TAG", "checkTmplList", "Ljava/util/ArrayList;", "expireTime", "", "expireTime$annotations", "getExpireTime", "()J", "lastCheckTimeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "supportTmplList", "", "[Ljava/lang/Integer;", "keyDownloadTime", "getKeyDownloadTime", "(I)Ljava/lang/String;", "checkTmpl", "", "openScene", "netType", "tmplTypes", "", "checkTmplInner", "typeInfoList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/CheckTmplClientTypeInfo;", "cleanInvalidTmpl", "cleanInvalidTmplInner", "clear", "createTmplParam", "Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "tmplType", "getHARDCODE_URL", "getLatestTmplInfo", "Lcom/tencent/mm/protocal/protobuf/TmplInfo;", "getPrefix", "getSaveDir", "getTmplByte", "Ljava/io/InputStream;", "file", "getTmplInfo", "skipUid", "injectRecord", "tmplParams", "success", "", "isTmplInfoExist", "tmplInfo", "needCheck", "processTmplInfo", "saveCheckTimeColdDown", "coldDown", "updateTmplInfo", "verify", "standard", "verifyVersion", "appendToList", "key", "parseFrom", "type", "uid", "plugin-brandservice_release"})
public final class b
{
  private static final String PREFIX = "https://mp.weixin.qq.com/tmpl/";
  private static final Integer[] jTD;
  private static final int jTE = 60000;
  private static final ConcurrentHashMap<Integer, Long> jTF;
  private static final ArrayList<Integer> jTG;
  public static final b jTH;

  static
  {
    AppMethodBeat.i(15003);
    jTH = new b();
    PREFIX = "https://mp.weixin.qq.com/tmpl/";
    jTD = new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) };
    jTE = 60000;
    jTF = new ConcurrentHashMap();
    jTG = new ArrayList();
    AppMethodBeat.o(15003);
  }

  private static chi a(chi paramchi, int paramInt, String paramString)
  {
    int i = 1;
    AppMethodBeat.i(14993);
    paramchi.jCt = paramInt;
    paramchi.wld = paramString;
    byte[] arrayOfByte = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().decodeBytes(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.e(paramchi));
    a.f.b.j.o(arrayOfByte, "bytes");
    int j;
    if (arrayOfByte.length == 0)
      j = 1;
    while (true)
    {
      if (j == 0)
      {
        j = i;
        if (j == 0);
      }
      try
      {
        paramchi.parseFrom(arrayOfByte);
        AppMethodBeat.o(14993);
        return paramchi;
        j = 0;
        continue;
        j = 0;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Preload.TmplInfoManager", (Throwable)localException, "decode TmplInfo:" + paramInt + ", " + paramString, new Object[0]);
      }
    }
  }

  public static final void a(int paramInt, String paramString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(14989);
    a.f.b.j.p(paramString, "netType");
    a.f.b.j.p(paramArrayOfInt, "tmplTypes");
    if (at.is2G(ah.getContext()))
    {
      ab.w("MicroMsg.Preload.TmplInfoManager", "[checkTmpl] not check, because network is 2g");
      AppMethodBeat.o(14989);
      return;
    }
    paramArrayOfInt = g.jSD;
    if ((!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && (h.aXn().getInt("preload_type", 1) == 3));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label91;
      com.tencent.mm.plugin.brandservice.ui.timeline.preload.j.de("MicroMsg.Preload.TmplInfoManager", "use local file, ignore");
      AppMethodBeat.o(14989);
      break;
    }
    label91: if (paramInt == -1)
      jTF.clear();
    LinkedList localLinkedList = new LinkedList();
    paramArrayOfInt = jTD;
    Object localObject1 = (Collection)new ArrayList();
    int j = paramArrayOfInt.length;
    i = 0;
    Object localObject2;
    if (i < j)
    {
      int k = paramArrayOfInt[i];
      int m = ((Number)k).intValue();
      long l = 0L;
      if (jTF.containsKey(Integer.valueOf(m)))
      {
        localObject2 = jTF.get(Integer.valueOf(m));
        if (localObject2 == null)
          a.f.b.j.dWJ();
        l = ((Number)localObject2).longValue();
      }
      if (jTG.contains(Integer.valueOf(m)))
        ab.v("MicroMsg.Preload.TmplInfoManager", "[checkTmplVer] %d already check", new Object[] { Integer.valueOf(m) });
      for (boolean bool = false; ; bool = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.C(l, com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getLong("_check_time_colddown", jTE)))
      {
        if (bool)
          ((Collection)localObject1).add(k);
        i++;
        break;
      }
    }
    Iterator localIterator1 = ((Iterable)localObject1).iterator();
    label548: label596: label599: 
    while (localIterator1.hasNext())
    {
      i = ((Number)localIterator1.next()).intValue();
      jTG.add(Integer.valueOf(i));
      ((Map)jTF).put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
      localObject1 = new rw();
      ((rw)localObject1).jCt = i;
      if (PreloadLogic.rW(101))
        ((rw)localObject1).vZj = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXx();
      localLinkedList.add(localObject1);
      paramArrayOfInt = sw(i);
      if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.a(paramArrayOfInt))
      {
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.FS(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.b(paramArrayOfInt)))
          ((rw)localObject1).vZi = paramArrayOfInt.wld;
        localObject2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getStringSet(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.h(paramArrayOfInt), null);
        if (localObject2 != null)
        {
          Object localObject3 = (Iterable)localObject2;
          localObject2 = (Collection)new ArrayList();
          Iterator localIterator2 = ((Iterable)localObject3).iterator();
          while (localIterator2.hasNext())
          {
            Object localObject4 = localIterator2.next();
            localObject3 = (String)localObject4;
            chi localchi = new chi();
            a.f.b.j.o(localObject3, "it");
            if (a(a(localchi, i, (String)localObject3), paramArrayOfInt))
              ((Collection)localObject2).add(localObject4);
          }
          paramArrayOfInt = (List)localObject2;
          localObject2 = (Collection)paramArrayOfInt;
          if ((localObject2 != null) && (!((Collection)localObject2).isEmpty()))
            break label596;
        }
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label599;
          ((rw)localObject1).vZh.addAll((Collection)paramArrayOfInt);
          break;
          paramArrayOfInt = null;
          break label548;
        }
      }
    }
    if (!((Collection)localLinkedList).isEmpty());
    for (i = 1; ; i = 0)
    {
      if (i != 0)
      {
        com.tencent.mm.plugin.webview.preload.a.kT(0);
        new a(localLinkedList, paramInt, paramString).acy().g((com.tencent.mm.vending.c.a)new b.a(paramInt, localLinkedList));
      }
      AppMethodBeat.o(14989);
      break;
    }
  }

  public static void a(TmplParams paramTmplParams, boolean paramBoolean)
  {
    AppMethodBeat.i(14988);
    a.f.b.j.p(paramTmplParams, "tmplParams");
    String str = "_tmpl_info_inject_fail_-" + paramTmplParams.jSV + '-' + paramTmplParams.jSY;
    if (paramBoolean)
    {
      com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().removeValueForKey(str);
      AppMethodBeat.o(14988);
    }
    while (true)
    {
      return;
      int i = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getInt(str, 0) + 1;
      com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().putInt(str, i);
      ab.e("MicroMsg.Preload.TmplInfoManager", "store tmpl inject fail:" + paramTmplParams.jSV + ',' + paramTmplParams.jSY + ',' + i);
      if (i > 2)
      {
        com.tencent.mm.plugin.webview.preload.a.kT(219);
        ab.e("MicroMsg.Preload.TmplInfoManager", "clear tmpl for too many inject fail:" + paramTmplParams.jSV + ',' + paramTmplParams.jSY + ',' + i);
      }
      AppMethodBeat.o(14988);
    }
  }

  private static boolean a(chi paramchi1, chi paramchi2)
  {
    AppMethodBeat.i(14994);
    boolean bool;
    if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.FR(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.b(paramchi1)).exists())
    {
      if (b(paramchi1, paramchi2))
      {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().putString(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.f(paramchi1), paramchi1.wld);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.a(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy(), com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.g(paramchi1));
        bool = true;
        AppMethodBeat.o(14994);
        return bool;
      }
      if (a.f.b.j.j(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.e(paramchi1), com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getString(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.f(paramchi1), null)))
      {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().removeValueForKey(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.f(paramchi1));
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().removeValueForKey(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.g(paramchi1));
      }
      com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().remove(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.e(paramchi1));
      paramchi2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.h(paramchi2);
      Set localSet = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getStringSet(paramchi2, null);
      if (localSet != null)
      {
        localSet.remove(paramchi1.wld);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().putStringSet(paramchi2, localSet);
      }
      ab.e("MicroMsg.Preload.TmplInfoManager", "tmpl " + paramchi1.wld + " is invalid");
    }
    while (true)
    {
      bool = false;
      AppMethodBeat.o(14994);
      break;
      ab.i("MicroMsg.Preload.TmplInfoManager", "no tmpl file:" + paramchi1.wld);
    }
  }

  public static final String aXA()
  {
    AppMethodBeat.i(15002);
    String str = com.tencent.mm.compatible.util.e.eSj + "webview_tmpl/";
    Object localObject = g.jSD;
    if (g.a.aXi())
    {
      str = com.tencent.mm.compatible.util.e.eSn;
      a.f.b.j.o(str, "CConstants.DATAROOT_SDCARD_PATH");
    }
    localObject = str;
    if (!m.jc(str, "/"))
      localObject = str + "/";
    str = (String)localObject + "tmpls/";
    com.tencent.mm.sdk.platformtools.j.aih(str);
    AppMethodBeat.o(15002);
    return str;
  }

  public static final String aXB()
  {
    return "https://mp.weixin.qq.com/tmpl/";
  }

  public static final void aXz()
  {
    AppMethodBeat.i(15000);
    com.tencent.mm.sdk.g.d.xDG.b((Runnable)b.b.jTJ, "tmplPreload");
    AppMethodBeat.o(15000);
  }

  private static chi an(int paramInt, String paramString)
  {
    AppMethodBeat.i(14997);
    chi localchi = sv(paramInt);
    if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.a(localchi))
      if ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.FS(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.b(localchi))) && ((a.f.b.j.j(localchi.wld, paramString) ^ true)))
      {
        AppMethodBeat.o(14997);
        paramString = localchi;
      }
    while (true)
    {
      return paramString;
      Object localObject1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getString(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.f(localchi), null);
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = new chi();
        a.f.b.j.o(localObject1, "it");
        localObject2 = a((chi)localObject2, paramInt, (String)localObject1);
        if ((localObject2 != null) && (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.a((chi)localObject2)) && (!com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.i((chi)localObject2)) && (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.FS(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.b((chi)localObject2))) && ((a.f.b.j.j(((chi)localObject2).wld, paramString) ^ true)))
        {
          AppMethodBeat.o(14997);
          paramString = (String)localObject2;
        }
      }
      else
      {
        localObject2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getStringSet(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.h(localchi), null);
        if (localObject2 != null)
        {
          localObject2 = (Iterable)localObject2;
          a.f.b.j.p(localObject2, "receiver$0");
          localObject1 = a.b.f.AUW;
          if (localObject1 == null)
          {
            paramString = new v("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            AppMethodBeat.o(14997);
            throw paramString;
          }
          localObject1 = (Comparator)localObject1;
          a.f.b.j.p(localObject2, "receiver$0");
          a.f.b.j.p(localObject1, "comparator");
          if ((localObject2 instanceof Collection))
            if (((Collection)localObject2).size() <= 1)
              localObject2 = a.a.j.m((Iterable)localObject2);
          while (true)
          {
            if (localObject2 == null)
              break label450;
            localObject1 = ((Iterable)localObject2).iterator();
            do
            {
              String str;
              do
              {
                if (!((Iterator)localObject1).hasNext())
                  break;
                str = (String)((Iterator)localObject1).next();
              }
              while (!(a.f.b.j.j(str, paramString) ^ true));
              localObject2 = new chi();
              a.f.b.j.o(str, "uid");
              localObject2 = a((chi)localObject2, paramInt, str);
            }
            while (!a((chi)localObject2, localchi));
            AppMethodBeat.o(14997);
            paramString = (String)localObject2;
            break;
            localObject2 = ((Collection)localObject2).toArray(new Object[0]);
            if (localObject2 == null)
            {
              paramString = new v("null cannot be cast to non-null type kotlin.Array<T>");
              AppMethodBeat.o(14997);
              throw paramString;
            }
            if (localObject2 == null)
            {
              paramString = new v("null cannot be cast to non-null type kotlin.Array<T>");
              AppMethodBeat.o(14997);
              throw paramString;
            }
            a.a.e.a((Object[])localObject2, (Comparator)localObject1);
            localObject2 = a.a.e.asList((Object[])localObject2);
            continue;
            localObject2 = a.a.j.n((Iterable)localObject2);
            a.a.j.a((List)localObject2, (Comparator)localObject1);
          }
        }
        label450: paramString = new chi();
        AppMethodBeat.o(14997);
      }
    }
  }

  private static boolean b(chi paramchi1, chi paramchi2)
  {
    AppMethodBeat.i(14995);
    boolean bool;
    if ((a.f.b.j.j(paramchi1, paramchi2)) && (paramchi1.Version != 0))
    {
      AppMethodBeat.o(14995);
      bool = true;
      return bool;
    }
    int i = paramchi2.vZn;
    Object localObject;
    int j;
    if (ab.getLogLevel() == 0)
    {
      localObject = g.jSD;
      j = g.a.aXj();
      if (j <= 0);
    }
    while (true)
    {
      if (paramchi1.Version < j)
      {
        ab.e("MicroMsg.Preload.TmplInfoManager", "tmpl " + paramchi1.wld + " version:" + paramchi1.Version + " < " + j);
        AppMethodBeat.o(14995);
        bool = false;
        break;
      }
      paramchi2 = paramchi2.xge;
      a.f.b.j.o(paramchi2, "standard.VersionControlList");
      localObject = ((Iterable)paramchi2).iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          paramchi2 = (chj)((Iterator)localObject).next();
          if (a.f.b.j.j(paramchi2.wld, paramchi1.wld))
          {
            ab.i("MicroMsg.Preload.TmplInfoManager", "tmpl " + paramchi2.wld + " matchControls in forceH5:" + paramchi2.xgg);
            if (!paramchi2.xgg)
            {
              AppMethodBeat.o(14995);
              bool = true;
              break;
            }
            AppMethodBeat.o(14995);
            bool = false;
            break;
          }
        }
      AppMethodBeat.o(14995);
      bool = true;
      break;
      j = i;
    }
  }

  public static final void clear()
  {
    AppMethodBeat.i(14990);
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().clear();
    com.tencent.mm.a.e.t(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.FR(aXA()));
    com.tencent.mm.a.e.cu(com.tencent.mm.loader.j.b.eSj + "/jscache/");
    AppMethodBeat.o(14990);
  }

  public static final String getPrefix()
  {
    return PREFIX;
  }

  public static final void j(chi paramchi)
  {
    AppMethodBeat.i(14992);
    a.f.b.j.p(paramchi, "tmplInfo");
    Object localObject1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.e(paramchi);
    Object localObject2 = paramchi.wld;
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().putString(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.ss(paramchi.jCt), (String)localObject2);
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().removeValueForKey(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.f(paramchi));
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().removeValueForKey(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.g(paramchi));
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().encode((String)localObject1, paramchi.toByteArray());
    String str = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.h(paramchi);
    as localas = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy();
    localObject2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getStringSet(str, null);
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = (Set)new HashSet();
    ((Set)localObject1).add(paramchi.wld);
    localas.putStringSet(str, (Set)localObject1);
    AppMethodBeat.o(14992);
  }

  private static final boolean k(chi paramchi)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(14999);
        if (paramchi == null)
        {
          ab.e("MicroMsg.Preload.TmplInfoManager", "isTmplInfoExist() tmplInfo is null, return false");
          AppMethodBeat.o(14999);
          return bool;
        }
        if (sv(paramchi.jCt).Version != paramchi.Version)
        {
          AppMethodBeat.o(14999);
          continue;
        }
      }
      finally
      {
      }
      if (!com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.FS(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.b(paramchi)))
      {
        ab.w("MicroMsg.Preload.TmplInfoManager", "[isTmplInfoExist]file isn't exist, may be delete");
        AppMethodBeat.o(14999);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(14999);
      }
    }
  }

  private static String st(int paramInt)
  {
    AppMethodBeat.i(14987);
    String str = "_tmpl_download_time_".concat(String.valueOf(paramInt));
    AppMethodBeat.o(14987);
    return str;
  }

  public static final void su(int paramInt)
  {
    AppMethodBeat.i(14991);
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().putLong("_check_time_colddown", paramInt * 1000);
    AppMethodBeat.o(14991);
  }

  public static final chi sv(int paramInt)
  {
    AppMethodBeat.i(14996);
    chi localchi = new chi();
    String str = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getString(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.ss(paramInt), null);
    if (str != null)
    {
      a.f.b.j.o(str, "uid");
      a(localchi, paramInt, str);
    }
    AppMethodBeat.o(14996);
    return localchi;
  }

  public static final TmplParams sx(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(15001);
    Object localObject2 = sw(paramInt);
    if (!com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.a((chi)localObject2))
    {
      ab.e("MicroMsg.Preload.TmplInfoManager", "[createTmplParams]type:" + paramInt + " localTmplInfo is null");
      com.tencent.mm.plugin.webview.preload.a.kT(100);
      AppMethodBeat.o(15001);
    }
    while (true)
    {
      return localObject1;
      Object localObject3 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.c((chi)localObject2);
      if (!com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.FS((String)localObject3))
      {
        ab.e("MicroMsg.Preload.TmplInfoManager", "[createTmplParams]filePath:" + (String)localObject3 + " is null");
        com.tencent.mm.plugin.webview.preload.a.gu(((chi)localObject2).wUX, 100);
        AppMethodBeat.o(15001);
      }
      else
      {
        localObject3 = new TmplParams.a().IW(paramInt).IX(((chi)localObject2).Version).aeY(((chi)localObject2).Md5).aeX((String)localObject3);
        Object localObject4 = new StringBuilder("https://mp.weixin.qq.com/tmpl/").append(paramInt).append('_').append(((chi)localObject2).wld).append(".html");
        if ((a.f.b.j.j(PREFIX, "https://mp.weixin.qq.com/tmpl/") ^ true));
        for (localObject1 = "?prefix=" + URLEncoder.encode(PREFIX); ; localObject1 = "")
        {
          localObject3 = ((TmplParams.a)localObject3).aeW((String)localObject1).IY(((chi)localObject2).wUX).lR(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy().getLong(st(((chi)localObject2).jCt), 0L)).aeZ(((chi)localObject2).wld);
          localObject1 = ((chi)localObject2).xgc;
          a.f.b.j.o(localObject1, "tmplInfo.HttpHeaderList");
          localObject2 = (Iterable)localObject1;
          localObject1 = new StringBuilder();
          localObject2 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = (chh)((Iterator)localObject2).next();
            localObject1 = ((StringBuilder)localObject1).append("\n" + ((chh)localObject4).vMU + ':' + ((chh)localObject4).pXM);
            a.f.b.j.o(localObject1, "sb.append(\"\\n${header.Key}:${header.Value}\")");
          }
        }
        localObject1 = ((TmplParams.a)localObject3).afa(((StringBuilder)localObject1).toString()).cYS();
        AppMethodBeat.o(15001);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b
 * JD-Core Version:    0.6.2
 */