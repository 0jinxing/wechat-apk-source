package com.tencent.mm.plugin.fav.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.a;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ad.a;
import com.tencent.mm.model.ad.b;
import com.tencent.mm.model.n;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aaw;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.aaz;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.protocal.protobuf.bca;
import com.tencent.mm.protocal.protobuf.bcd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
{
  private static HashMap<Long, ArrayList<String>> meC;
  private static long meD;

  static
  {
    AppMethodBeat.i(102620);
    meC = new HashMap();
    meD = 0L;
    AppMethodBeat.o(102620);
  }

  public static String LA(String paramString)
  {
    AppMethodBeat.i(102549);
    paramString = paramString + "_t";
    AppMethodBeat.o(102549);
    return paramString;
  }

  public static boolean LB(String paramString)
  {
    AppMethodBeat.i(102555);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(102555);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("_t");
      AppMethodBeat.o(102555);
    }
  }

  public static String LC(String paramString)
  {
    AppMethodBeat.i(102567);
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    if (localad != null)
      if (!bo.isNullOrNil(localad.field_conRemark))
      {
        paramString = localad.field_conRemark;
        AppMethodBeat.o(102567);
      }
    while (true)
    {
      return paramString;
      if (!bo.isNullOrNil(localad.field_nickname))
      {
        paramString = localad.field_nickname;
        AppMethodBeat.o(102567);
      }
      else
      {
        paramString = localad.field_username;
        AppMethodBeat.o(102567);
        continue;
        AppMethodBeat.o(102567);
      }
    }
  }

  public static String LD(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(102589);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(102589);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = new com.tencent.mm.vfs.b(bue() + com.tencent.mm.a.g.x(paramString.getBytes()));
      if (paramString.exists())
      {
        paramString = com.tencent.mm.vfs.j.w(paramString.dMD());
        AppMethodBeat.o(102589);
      }
      else
      {
        AppMethodBeat.o(102589);
        paramString = localObject;
      }
    }
  }

  public static int LE(String paramString)
  {
    AppMethodBeat.i(102598);
    int i;
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals("speex")))
    {
      i = 1;
      AppMethodBeat.o(102598);
    }
    while (true)
    {
      return i;
      if ((!bo.isNullOrNil(paramString)) && (paramString.equals("silk")))
      {
        i = 2;
        AppMethodBeat.o(102598);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(102598);
      }
    }
  }

  public static g LF(String paramString)
  {
    AppMethodBeat.i(102600);
    g localg = new g();
    localg.field_localId = -1L;
    localg.field_id = -1;
    localg.field_xml = paramString;
    localg.field_type = 18;
    localg.LH(paramString);
    AppMethodBeat.o(102600);
    return localg;
  }

  private static g LG(String paramString)
  {
    AppMethodBeat.i(102601);
    if ((paramString == null) || (paramString.equals("")))
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml but xml is null");
      AppMethodBeat.o(102601);
      paramString = null;
      return paramString;
    }
    paramString = paramString.replace("cdndataurl", "cdn_dataurl").replace("cdndatakey", "cdn_datakey").replace("cdnthumburl", "cdn_thumburl").replace("cdnthumbkey", "cdn_thumbkey").replace("datasize", "fullsize").replace("thumbsize", "thumbfullsize").replace("sourcename", "datasrcname").replace("sourcetime", "datasrctime").replace("streamlowbandurl", "stream_lowbandurl").replace("streamdataurl", "stream_dataurl").replace("streamweburl", "stream_weburl");
    if (!paramString.startsWith("<noteinfo>"))
      paramString = "<noteinfo>" + paramString + "</noteinfo>";
    while (true)
    {
      while (true)
      {
        Map localMap = br.z(paramString, "noteinfo");
        if (localMap == null)
        {
          ab.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml, FavItemInfo maps null");
          AppMethodBeat.o(102601);
          paramString = null;
          break;
        }
        g localg = new g();
        try
        {
          Object localObject = new com/tencent/mm/protocal/protobuf/abf;
          ((abf)localObject).<init>();
          localg.field_favProto = ((abf)localObject);
          localg.field_type = 18;
          localObject = (String)localMap.get(".noteinfo.edittime");
          localg.field_favProto.mk(bo.getLong((String)localObject, 0L));
          localObject = new com/tencent/mm/protocal/protobuf/aaz;
          ((aaz)localObject).<init>();
          ((aaz)localObject).win = ((String)localMap.get(".noteinfo.noteeditor"));
          ((aaz)localObject).wim = ((String)localMap.get(".noteinfo.noteauthor"));
          localg.field_favProto.a((aaz)localObject);
          localg.field_localId = bo.getLong((String)localMap.get(".noteinfo.favlocalid"), System.currentTimeMillis());
          com.tencent.mm.plugin.fav.a.a.b.a(paramString, localg.field_favProto);
          AppMethodBeat.o(102601);
          paramString = localg;
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.Fav.FavApiLogic", paramString, "", new Object[0]);
          ab.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml , FavItemInfo exception:+%s", new Object[] { paramString.toString() });
          AppMethodBeat.o(102601);
          paramString = null;
        }
      }
      break;
    }
  }

  private static com.tencent.mm.vfs.b Lz(String paramString)
  {
    AppMethodBeat.i(102544);
    int i = paramString.hashCode();
    paramString = new com.tencent.mm.vfs.b(String.format("%s/%s/%d/", new Object[] { com.tencent.mm.kernel.g.RP().eJM, "favorite", Integer.valueOf(i & 0xFF) }));
    if ((!paramString.exists()) || (!paramString.isDirectory()))
      paramString.mkdirs();
    AppMethodBeat.o(102544);
    return paramString;
  }

  public static long a(g paramg)
  {
    AppMethodBeat.i(102526);
    Object localObject = a.meA;
    int i = localObject.length;
    int j = 0;
    long l2;
    if (j < i)
      if (localObject[j] == paramg.field_type)
      {
        if (paramg.field_favProto != null)
        {
          localObject = paramg.field_favProto.wiv.iterator();
          for (long l1 = 0L; ; l1 = ((aar)((Iterator)localObject).next()).wgu + l1)
          {
            l2 = l1;
            if (!((Iterator)localObject).hasNext())
              break;
          }
        }
        l2 = 0L;
        paramg.field_datatotalsize = l2;
        ab.d("MicroMsg.Fav.FavApiLogic", "calFavItemInfoTotalLength id:%d,length:%d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(l2) });
        AppMethodBeat.o(102526);
      }
    while (true)
    {
      return l2;
      j++;
      break;
      AppMethodBeat.o(102526);
      l2 = 0L;
    }
  }

  public static g a(abf paramabf)
  {
    AppMethodBeat.i(102604);
    g localg = new g();
    localg.field_favProto = new abf();
    localg.field_type = 18;
    localg.field_favProto = paramabf;
    AppMethodBeat.o(102604);
    return localg;
  }

  public static aar a(g paramg, String paramString)
  {
    AppMethodBeat.i(102556);
    if ((bo.isNullOrNil(paramString)) || (paramg == null) || (paramg.field_favProto.wiv.size() == 0))
    {
      AppMethodBeat.o(102556);
      paramg = null;
    }
    while (true)
    {
      return paramg;
      Iterator localIterator = paramg.field_favProto.wiv.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramg = (aar)localIterator.next();
          if (paramg.mnd.equals(paramString))
          {
            AppMethodBeat.o(102556);
            break;
          }
        }
      AppMethodBeat.o(102556);
      paramg = null;
    }
  }

  public static aaw a(int paramInt, abf paramabf, abs paramabs)
  {
    Object localObject = null;
    AppMethodBeat.i(102527);
    if (paramabf == null)
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "proto item is null");
      AppMethodBeat.o(102527);
      paramabf = localObject;
    }
    while (true)
    {
      return paramabf;
      aaw localaaw = new aaw();
      abl localabl = paramabf.wit;
      if (localabl != null)
      {
        localaaw.cEV = localabl.cEV;
        localaaw.wif = localabl.whU;
        localaaw.appId = localabl.appId;
        localaaw.csl = localabl.csl;
      }
      if (paramabs != null)
      {
        if (paramabs.wiI != null)
          localaaw.wig.addAll(paramabs.wiI);
        if (paramabs.wiJ != null)
          localaaw.wig.addAll(paramabs.wiJ);
      }
      localaaw.cKb = paramabf;
      localaaw.type = paramInt;
      switch (paramInt)
      {
      case 3:
      case 9:
      case 13:
      case 16:
      case 17:
      default:
        ab.w("MicroMsg.Fav.FavApiLogic", "unknown type %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 1:
        localaaw.title = "";
        localaaw.desc = paramabf.desc;
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 4:
        if ((paramabf.wiv != null) && (!paramabf.wiv.isEmpty()))
          localaaw.title = ((aar)paramabf.wiv.get(0)).title;
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 5:
        if (paramabf.whA != null)
        {
          localaaw.title = paramabf.whA.title;
          localaaw.desc = paramabf.whA.wiY;
        }
        if ((bo.isNullOrNil(localaaw.title)) && (paramabf.wiv != null) && (!paramabf.wiv.isEmpty()))
          localaaw.title = ((aar)paramabf.wiv.get(0)).title;
        if ((bo.isNullOrNil(localaaw.desc)) && (localabl != null))
          localaaw.desc = localabl.link;
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 6:
        localaaw.title = paramabf.hHV;
        if (bo.isNullOrNil(localaaw.title))
          if (paramabf.why != null)
          {
            localaaw.title = paramabf.why.cIK;
            localaaw.desc = paramabf.why.label;
          }
        while (true)
        {
          AppMethodBeat.o(102527);
          paramabf = localaaw;
          break;
          if (paramabf.why != null)
            localaaw.desc = paramabf.why.cIK;
        }
      case 2:
        if ((paramabf.wiv != null) && (paramabf.wiv.size() > 0))
          localaaw.title = ((aar)paramabf.wiv.get(0)).title;
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 7:
        if ((paramabf.wiv != null) && (!paramabf.wiv.isEmpty()))
        {
          localaaw.title = ((aar)paramabf.wiv.get(0)).title;
          localaaw.desc = ((aar)paramabf.wiv.get(0)).desc;
        }
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 8:
        localaaw.title = paramabf.title;
        if ((bo.isNullOrNil(localaaw.title)) && (paramabf.wiv != null) && (!paramabf.wiv.isEmpty()))
          localaaw.title = ((aar)paramabf.wiv.get(0)).title;
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 10:
      case 11:
        if (paramabf.whC != null)
        {
          localaaw.title = paramabf.whC.title;
          localaaw.desc = paramabf.whC.desc;
        }
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 12:
      case 15:
        if (paramabf.whE != null)
        {
          localaaw.title = paramabf.whE.title;
          localaaw.desc = paramabf.whE.desc;
        }
        AppMethodBeat.o(102527);
        paramabf = localaaw;
        break;
      case 14:
      case 18:
        paramabf = paramabf.wiv;
        if (paramabf == null)
        {
          AppMethodBeat.o(102527);
          paramabf = localObject;
        }
        else
        {
          paramabs = paramabf.iterator();
          while (paramabs.hasNext())
          {
            paramabf = (aar)paramabs.next();
            if (1 == paramabf.dataType)
              localaaw.title = paramabf.desc;
          }
          AppMethodBeat.o(102527);
          paramabf = localaaw;
        }
        break;
      }
    }
  }

  public static String a(aar paramaar)
  {
    AppMethodBeat.i(102523);
    aas localaas = paramaar.wgT;
    String str = "";
    switch (paramaar.dataType)
    {
    case 2:
    case 3:
    case 7:
    case 9:
    default:
      paramaar = ek(ek("", localaas.title), localaas.desc);
    case 1:
    case 4:
    case 5:
    case 6:
    case 10:
    case 11:
    case 8:
    }
    while (true)
    {
      AppMethodBeat.o(102523);
      return paramaar;
      paramaar = ek("", paramaar.desc);
      continue;
      paramaar = str;
      if (localaas.whE != null)
      {
        paramaar = ek("", localaas.whE.title);
        continue;
        paramaar = str;
        if (localaas.whA != null)
        {
          paramaar = ek("", localaas.whA.title);
          continue;
          str = ek("", localaas.hHV);
          paramaar = str;
          if (localaas.why != null)
          {
            paramaar = ek(ek(str, localaas.why.cIK), localaas.why.label);
            continue;
            paramaar = str;
            if (localaas.whC != null)
            {
              paramaar = ek(ek("", localaas.whC.title), localaas.whC.desc);
              continue;
              paramaar = ek("", localaas.title);
            }
          }
        }
      }
    }
  }

  public static ArrayList<g> a(List<String> paramList1, List<String> paramList2, List<Integer> paramList, List<g> paramList3, Set<Integer> paramSet, w paramw)
  {
    AppMethodBeat.i(102597);
    paramList2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().b(paramList1, paramList2, paramList);
    paramList1 = new ArrayList();
    if (paramList2.size() == 0)
    {
      AppMethodBeat.o(102597);
      return paramList1;
    }
    int j;
    for (int i = 0; ; i = j)
    {
      Object localObject;
      Iterator localIterator;
      if (i + 20 < paramList2.size())
      {
        j = i + 20;
        ab.v("MicroMsg.Fav.FavApiLogic", "start:%d  end:%d listSize:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramList2.size()) });
        localObject = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramList2.subList(i, j), paramList3, paramSet, paramw);
        if ((localObject == null) || (((ArrayList)localObject).size() <= 0))
          break label335;
        if (paramList.contains(Integer.valueOf(8)))
          localIterator = ((ArrayList)localObject).iterator();
      }
      else
      {
        while (true)
        {
          while (true)
          {
            label188: if (!localIterator.hasNext())
              break label335;
            localObject = (g)localIterator.next();
            if (((g)localObject).field_type == 18)
              try
              {
                LinkedList localLinkedList = ((g)localObject).field_favProto.wiv;
                i = 1;
                label233: if (i < localLinkedList.size())
                {
                  int k = ((aar)localLinkedList.get(i)).dataType;
                  if (k != 8);
                }
                for (i = 1; ; i = 0)
                {
                  if (i == 0)
                    break label188;
                  paramList1.add(localObject);
                  break label188;
                  j = paramList2.size();
                  break;
                  i++;
                  break label233;
                }
              }
              catch (Exception localException)
              {
                while (true)
                  i = 0;
              }
          }
          paramList1.add(localObject);
        }
      }
      paramList1.addAll((Collection)localObject);
      label335: if (j >= paramList2.size())
      {
        AppMethodBeat.o(102597);
        break;
      }
    }
  }

  public static List<g> a(long paramLong, int paramInt, Set<Integer> paramSet, w paramw)
  {
    AppMethodBeat.i(102586);
    if (paramLong == 0L)
    {
      paramSet = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramInt, paramSet, paramw);
      AppMethodBeat.o(102586);
    }
    while (true)
    {
      return paramSet;
      paramSet = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().b(paramLong, paramInt, paramSet, paramw);
      AppMethodBeat.o(102586);
    }
  }

  public static void a(long paramLong, aay paramaay, String paramString1, String paramString2, ArrayList<String> paramArrayList, Context paramContext)
  {
    AppMethodBeat.i(102617);
    if ((paramaay == null) || (paramContext == null))
      AppMethodBeat.o(102617);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("KFavLocSigleView", true);
      localIntent.putExtra("map_view_type", 2);
      localIntent.putExtra("kFavInfoLocalId", paramLong);
      localIntent.putExtra("kwebmap_slat", paramaay.lat);
      localIntent.putExtra("kwebmap_lng", paramaay.lng);
      localIntent.putExtra("kPoiName", paramaay.cIK);
      localIntent.putExtra("Kwebmap_locaion", paramaay.label);
      if (paramaay.cED >= 0)
        localIntent.putExtra("kwebmap_scale", paramaay.cED);
      localIntent.putExtra("kisUsername", paramString1);
      localIntent.putExtra("kwebmap_from_to", true);
      localIntent.putExtra("kRemark", paramString2);
      localIntent.putExtra("kTags", paramArrayList);
      localIntent.putExtra("kFavCanDel", true);
      localIntent.putExtra("kFavCanRemark", true);
      com.tencent.mm.bp.d.b(paramContext, "location", ".ui.RedirectUI", localIntent);
      AppMethodBeat.o(102617);
    }
  }

  public static void a(Context paramContext, String paramString, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(102611);
    a(paramContext, paramString, paramIntent, paramInt, null);
    AppMethodBeat.o(102611);
  }

  public static void a(Context paramContext, String paramString, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(102612);
    Intent localIntent = paramIntent;
    if (paramIntent == null);
    try
    {
      localIntent = new android/content/Intent;
      localIntent.<init>();
      paramIntent = new java/lang/StringBuilder;
      paramIntent.<init>();
      String str = com.tencent.mm.sdk.platformtools.ah.doz() + ".plugin.fav";
      paramIntent = paramString;
      if (paramString.startsWith("."))
      {
        paramIntent = new java/lang/StringBuilder;
        paramIntent.<init>();
        paramIntent = str + paramString;
      }
      localIntent.setClassName(com.tencent.mm.sdk.platformtools.ah.getPackageName(), paramIntent);
      Class.forName(paramIntent, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
        ((Activity)paramContext).startActivityForResult(localIntent, paramInt, paramBundle);
      AppMethodBeat.o(102612);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
        AppMethodBeat.o(102612);
      }
    }
  }

  public static void a(Context paramContext, String paramString, Intent paramIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(102610);
    Intent localIntent = paramIntent;
    if (paramIntent == null);
    try
    {
      localIntent = new android/content/Intent;
      localIntent.<init>();
      paramIntent = new java/lang/StringBuilder;
      paramIntent.<init>();
      String str = com.tencent.mm.sdk.platformtools.ah.doz() + ".plugin.fav";
      paramIntent = paramString;
      if (paramString.startsWith("."))
      {
        paramIntent = new java/lang/StringBuilder;
        paramIntent.<init>();
        paramIntent = str + paramString;
      }
      localIntent.setClassName(com.tencent.mm.sdk.platformtools.ah.getPackageName(), paramIntent);
      Class.forName(paramIntent, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(localIntent, paramBundle);
        AppMethodBeat.o(102610);
      }
      while (true)
      {
        return;
        localIntent.addFlags(268435456);
        paramContext.startActivity(localIntent, paramBundle);
        AppMethodBeat.o(102610);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
        AppMethodBeat.o(102610);
      }
    }
  }

  private static void a(gh paramgh)
  {
    AppMethodBeat.i(102533);
    if (bo.isNullOrNil(paramgh.cAH.desc))
    {
      paramgh.cAI.ret = -1;
      AppMethodBeat.o(102533);
    }
    while (true)
    {
      return;
      Object localObject = LG(paramgh.cAH.desc);
      if ((localObject == null) || (((g)localObject).field_localId <= 0L))
      {
        paramgh.cAI.ret = -1;
        AppMethodBeat.o(102533);
      }
      else
      {
        boolean bool = e((g)localObject);
        String str = paramgh.cAH.cAN;
        if (bool)
        {
          paramgh.cAI.ret = 1;
          paramgh = (ArrayList)meC.get(Long.valueOf(((g)localObject).field_localId));
          if (paramgh != null)
          {
            if (paramgh.contains(str))
              paramgh.remove(str);
            if (paramgh.size() == 0)
              meC.remove(Long.valueOf(((g)localObject).field_localId));
          }
          AppMethodBeat.o(102533);
        }
        else if (bo.isNullOrNil(str))
        {
          paramgh.cAI.ret = -1;
          AppMethodBeat.o(102533);
        }
        else
        {
          long l = ((g)localObject).field_localId;
          if (meC.get(Long.valueOf(l)) == null);
          for (localObject = new ArrayList(); ; localObject = (ArrayList)meC.get(Long.valueOf(l)))
          {
            ((ArrayList)localObject).add(str);
            meC.put(Long.valueOf(l), localObject);
            localObject = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(l);
            if ((localObject != null) && (((g)localObject).field_localId > 0L))
              break label306;
            paramgh.cAI.ret = -1;
            AppMethodBeat.o(102533);
            break;
          }
          label306: if ((e((g)localObject)) || (((g)localObject).field_itemStatus == 10))
          {
            paramgh.cAI.ret = -1;
            com.tencent.mm.kernel.g.RS().m(new b.1((g)localObject), 500L);
            AppMethodBeat.o(102533);
          }
          else
          {
            paramgh.cAI.ret = -1;
            AppMethodBeat.o(102533);
          }
        }
      }
    }
  }

  public static void a(c paramc)
  {
    AppMethodBeat.i(102557);
    int i = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().r(paramc.field_favLocalId, 0);
    ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, upload data status:%d, favlocalId:%d", new Object[] { Integer.valueOf(i), Long.valueOf(paramc.field_favLocalId) });
    g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramc.field_favLocalId);
    if (localg == null)
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
      AppMethodBeat.o(102557);
    }
    while (true)
    {
      return;
      if (localg.buA())
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus waiting server upload skip.");
        AppMethodBeat.o(102557);
      }
      else
      {
        if ((paramc.field_status != 3) || (i == paramc.field_status) || (localg.field_type != 18) || (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramc.field_dataId).field_status != 3))
          break;
        a(paramc, localg);
        AppMethodBeat.o(102557);
      }
    }
    switch (i)
    {
    default:
    case 1:
    case 4:
    case 0:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(102557);
      break;
      if (localg.buz())
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(15, paramc.field_favLocalId);
      while (true)
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, continue upload data, favlocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
        AppMethodBeat.o(102557);
        break;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(4, paramc.field_favLocalId);
      }
      if (localg.buz())
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(16, paramc.field_favLocalId);
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(-5), Long.valueOf(b(localg)), Long.valueOf(h.ix(localg.field_localId)) });
        ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
        AppMethodBeat.o(102557);
        break;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(6, paramc.field_favLocalId);
      }
      AppMethodBeat.o(102557);
      break;
      if (localg.field_type == 18)
      {
        a(paramc, localg);
        AppMethodBeat.o(102557);
        break;
      }
      if (localg.buz())
      {
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(17, paramc.field_favLocalId);
        ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start mod faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getModService().run();
        AppMethodBeat.o(102557);
        break;
      }
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(9, paramc.field_favLocalId);
      ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start send faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
      AppMethodBeat.o(102557);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(6, paramc.field_favLocalId);
      ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
    }
  }

  private static void a(c paramc, g paramg)
  {
    AppMethodBeat.i(102559);
    Iterator localIterator = paramg.field_favProto.wiv.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      label19: aar localaar = (aar)localIterator.next();
      if ((localaar.dataType == 1) || (localaar.dataType == 6))
        break label19;
      if (!bo.isNullOrNil(localaar.wfZ))
        break label190;
    }
    label190: 
    while (true)
    {
      break;
      if (i == 0)
        if (paramg.field_id > 0)
        {
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(17, paramc.field_favLocalId);
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getModService().run();
          AppMethodBeat.o(102559);
        }
      while (true)
      {
        return;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(9, paramc.field_favLocalId);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
        AppMethodBeat.o(102559);
      }
    }
  }

  public static void a(g paramg, int paramInt)
  {
    AppMethodBeat.i(102608);
    if (paramg == null)
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "modeTag, item info is null");
      AppMethodBeat.o(102608);
    }
    while (true)
    {
      return;
      Object localObject1 = new LinkedList();
      Object localObject2 = new bca();
      ((bca)localObject2).wGC = 4;
      ((bca)localObject2).wGD = 0;
      ((LinkedList)localObject1).add(localObject2);
      localObject2 = new LinkedList();
      bcd localbcd = new bcd();
      localbcd.ncF = "favitem.taglist";
      localbcd.jCt = 1;
      StringBuffer localStringBuffer = new StringBuffer();
      int i = paramg.field_tagProto.wiJ.size();
      for (int j = 0; j < i; j++)
        localStringBuffer.append("<tag>").append(bo.ani((String)paramg.field_tagProto.wiJ.get(j))).append("</tag>");
      localbcd.pXM = localStringBuffer.toString();
      ab.v("MicroMsg.Fav.FavApiLogic", "do net scene mod tag, id=%d, tag=%s", new Object[] { Integer.valueOf(paramg.field_id), localbcd.pXM });
      ((LinkedList)localObject2).add(localbcd);
      if (paramg.field_id > 0)
      {
        localObject1 = new al(paramg.field_id, (LinkedList)localObject1, (LinkedList)localObject2);
        com.tencent.mm.kernel.g.Rg().a((m)localObject1, 0);
        h.k(paramg.field_id, i, paramInt);
        AppMethodBeat.o(102608);
      }
      else
      {
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getEditService().a(paramg.field_localId, (LinkedList)localObject1, (LinkedList)localObject2, paramInt);
        AppMethodBeat.o(102608);
      }
    }
  }

  public static void a(g paramg, aar paramaar)
  {
    AppMethodBeat.i(102572);
    if (bo.isNullOrNil(paramaar.mnd))
      AppMethodBeat.o(102572);
    while (true)
    {
      return;
      String str = LA(paramaar.mnd);
      c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(str);
      Object localObject = localc;
      if (localc != null)
      {
        localObject = localc;
        if (localc.field_status == 3)
        {
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(localc, new String[] { "dataId" });
          localObject = null;
        }
      }
      if ((localObject != null) && (((c)localObject).field_type == 1))
      {
        ((c)localObject).field_status = 1;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a((c)localObject, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(str);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
        AppMethodBeat.o(102572);
      }
      else
      {
        localObject = new com.tencent.mm.vfs.b(c(paramaar));
        if ((!bo.isNullOrNil(paramaar.wfV)) && (!bo.isNullOrNil(paramaar.fgE)) && (!((com.tencent.mm.vfs.b)localObject).exists()))
        {
          a(paramaar, paramg, 1);
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(str);
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
        }
        AppMethodBeat.o(102572);
      }
    }
  }

  public static void a(g paramg, aar paramaar, boolean paramBoolean)
  {
    AppMethodBeat.i(102571);
    if ((paramg == null) || (bo.isNullOrNil(paramaar.mnd)))
      AppMethodBeat.o(102571);
    while (true)
    {
      return;
      ab.i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, favId %d, favLocalId %d, dataId %s", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), paramaar.mnd });
      Object localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramaar.mnd);
      Object localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((c)localObject1).field_status == 3)
        {
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b((c)localObject1, new String[] { "dataId" });
          localObject2 = null;
        }
      }
      localObject1 = localObject2;
      if (localObject2 != null)
        if ((!bo.isNullOrNil(((c)localObject2).field_cdnUrl)) && (!bo.isNullOrNil(((c)localObject2).field_cdnKey)) && (!bo.isNullOrNil(((c)localObject2).field_dataId)) && (((c)localObject2).field_cdnUrl.equals(paramaar.wfZ)) && (((c)localObject2).field_cdnKey.equals(paramaar.wgb)))
        {
          localObject1 = localObject2;
          if (((c)localObject2).field_dataId.equals(paramaar.mnd));
        }
        else
        {
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b((c)localObject2, new String[] { "dataId" });
          localObject1 = null;
        }
      if ((localObject1 != null) && (((c)localObject1).field_type == 1))
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
        ((c)localObject1).field_status = 1;
        ((c)localObject1).field_path = b(paramaar);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a((c)localObject1, new String[] { "dataId" });
        if (paramBoolean)
        {
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(paramaar.mnd);
          if ((!bo.isNullOrNil(paramaar.whb)) && (paramaar.whb.equals("WeNoteHtmlFile")))
          {
            paramg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramaar.mnd);
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().c(paramg);
          }
        }
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
        AppMethodBeat.o(102571);
      }
      else
      {
        localObject2 = new com.tencent.mm.vfs.b(b(paramaar));
        if ((!bo.isNullOrNil(paramaar.wgb)) && (!bo.isNullOrNil(paramaar.wfZ)) && (!((com.tencent.mm.vfs.b)localObject2).exists()))
        {
          ab.i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
          long l = System.currentTimeMillis();
          a(paramaar, paramg, 1, true);
          if (paramBoolean)
          {
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(paramaar.mnd);
            if ((!bo.isNullOrNil(paramaar.whb)) && (paramaar.whb.equals("WeNoteHtmlFile")))
            {
              paramg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramaar.mnd);
              ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().c(paramg);
            }
          }
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
          ab.i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        }
        AppMethodBeat.o(102571);
      }
    }
  }

  public static void a(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(102551);
    h(paramg);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().iG(paramg.field_localId);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().z(paramg);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iC(paramg.field_localId);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().v(paramg);
    if (paramBoolean)
    {
      Set localSet = bud();
      localSet.add(paramg.field_id);
      d(localSet);
      buf();
    }
    AppMethodBeat.o(102551);
  }

  public static void a(aar paramaar, int paramInt, long paramLong)
  {
    AppMethodBeat.i(102593);
    if (bo.isNullOrNil(paramaar.mnd))
      AppMethodBeat.o(102593);
    while (true)
    {
      return;
      if ((bo.isNullOrNil(paramaar.wfV)) || (bo.isNullOrNil(paramaar.fgE)))
      {
        AppMethodBeat.o(102593);
      }
      else
      {
        String str = LA(paramaar.mnd);
        c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(str);
        Object localObject = localc;
        if (localc != null)
          if (localc.field_status != 3)
          {
            localObject = localc;
            if (localc.field_status != 4);
          }
          else
          {
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(localc, new String[] { "dataId" });
            localObject = null;
          }
        if ((localObject != null) && (((c)localObject).field_type == 1))
        {
          ((c)localObject).field_status = 1;
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a((c)localObject, new String[] { "dataId" });
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(str);
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
          AppMethodBeat.o(102593);
        }
        else
        {
          localObject = new com.tencent.mm.vfs.b(c(paramaar));
          if ((!bo.isNullOrNil(paramaar.wfV)) && (!bo.isNullOrNil(paramaar.fgE)) && (!((com.tencent.mm.vfs.b)localObject).exists()))
          {
            localObject = new g();
            ((g)localObject).field_localId = paramLong;
            ((g)localObject).field_id = -1;
            ((g)localObject).field_type = paramInt;
            a(paramaar, (g)localObject, 1);
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(str);
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
          }
          AppMethodBeat.o(102593);
        }
      }
    }
  }

  public static void a(aar paramaar, g paramg, int paramInt)
  {
    AppMethodBeat.i(102560);
    if ((paramInt == 1) && ((paramaar.wgF <= 0L) || (bo.isNullOrNil(paramaar.wfV)) || (bo.isNullOrNil(paramaar.fgE))))
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type recv, cdndataurl must not be null!");
      AppMethodBeat.o(102560);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (bo.isNullOrNil(c(paramaar))))
      {
        ab.e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type send, path must not be null!");
        AppMethodBeat.o(102560);
      }
      else
      {
        String str = LA(paramaar.mnd);
        if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(str) != null)
        {
          ab.w("MicroMsg.Fav.FavApiLogic", "cdn info exist, id[%s], return", new Object[] { str });
          AppMethodBeat.o(102560);
        }
        else
        {
          ab.v("MicroMsg.Fav.FavApiLogic", "insert cdn thumb info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
          c localc = new c();
          localc.field_cdnKey = paramaar.wfV;
          localc.field_cdnUrl = paramaar.fgE;
          localc.field_dataId = str;
          localc.field_favLocalId = paramg.field_localId;
          localc.field_totalLen = ((int)paramaar.wgF);
          localc.field_type = paramInt;
          localc.field_status = 1;
          localc.field_path = c(paramaar);
          localc.field_modifyTime = bo.anU();
          localc.field_attrFlag |= 1L;
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().e(localc);
          if (paramInt == 1)
          {
            b(localc);
            AppMethodBeat.o(102560);
          }
          else
          {
            a(localc);
            AppMethodBeat.o(102560);
          }
        }
      }
    }
  }

  public static void a(aar paramaar, g paramg, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(102561);
    if ((paramInt == 1) && ((bo.isNullOrNil(paramaar.wgb)) || (bo.isNullOrNil(paramaar.wfZ))))
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo, type recv, cdndataurl must not be null!");
      AppMethodBeat.o(102561);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (bo.isNullOrNil(b(paramaar))))
      {
        ab.e("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo, type send, path must not be null!");
        AppMethodBeat.o(102561);
      }
      else if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramaar.mnd) != null)
      {
        ab.v("MicroMsg.Fav.FavApiLogic", "cdn info exist, id[%s], return", new Object[] { paramaar.mnd });
        AppMethodBeat.o(102561);
      }
      else
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "insert cdn data info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
        c localc = new c();
        localc.field_dataId = paramaar.mnd;
        localc.field_totalLen = ((int)paramaar.wgu);
        localc.field_type = paramInt;
        localc.field_favLocalId = paramg.field_localId;
        localc.field_cdnKey = paramaar.wgb;
        localc.field_cdnUrl = paramaar.wfZ;
        localc.field_path = b(paramaar);
        int i;
        label266: label273: boolean bool;
        if (paramaar.dataType == 3)
        {
          paramaar = paramaar.wgo;
          label429: if ((!bo.isNullOrNil(paramaar)) && (paramaar.equals("speex")))
          {
            i = -3;
            localc.field_dataType = i;
            localc.field_modifyTime = bo.anU();
            bool = at.isWifi(com.tencent.mm.sdk.platformtools.ah.getContext());
            if (paramInt == 0)
            {
              ab.i("MicroMsg.Fav.FavApiLogic", "can auto upload, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
              if (!paramBoolean)
                break label531;
              i = 1;
              label349: if (i == 0)
                break label658;
              localc.field_status = 1;
              ab.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo upload status traning");
            }
            label368: if (paramInt == 1)
            {
              ab.i("MicroMsg.Fav.FavApiLogic", "can auto download, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
              if (!paramBoolean)
                break label675;
              i = 1;
              if (i == 0)
                break label788;
              localc.field_status = 1;
              ab.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo download status traning");
            }
          }
        }
        while (true)
        {
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().e(localc);
          if (paramInt != 1)
            break label805;
          b(localc);
          AppMethodBeat.o(102561);
          break;
          if ((!bo.isNullOrNil(paramaar)) && (paramaar.equals("silk")))
          {
            i = -4;
            break label266;
          }
          i = -2;
          break label266;
          localc.field_dataType = paramaar.dataType;
          break label273;
          label531: if (bool)
          {
            i = 1;
            break label349;
          }
          if ((localc.field_dataType != 8) && (localc.field_dataType != 4) && (localc.field_dataType != 15))
          {
            i = 1;
            break label349;
          }
          long l1 = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).getLong("fav_mx_auto_upload_size", 0L);
          long l2 = l1;
          if (l1 == 0L)
            l2 = 26214400L;
          if (localc.field_totalLen <= l2)
          {
            ab.i("MicroMsg.Fav.FavApiLogic", "match max auto upload, max size %d", new Object[] { Long.valueOf(l2) });
            i = 1;
            break label349;
          }
          i = 0;
          break label349;
          label658: localc.field_status = 4;
          ab.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo upload status pause");
          break label368;
          label675: if (bool)
          {
            i = 1;
            break label429;
          }
          if ((localc.field_dataType != 8) && (localc.field_dataType != 4) && (localc.field_dataType != 15))
          {
            i = 1;
            break label429;
          }
          l2 = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).getLong("fav_mx_auto_download_size", 26214400L);
          if (localc.field_totalLen <= l2)
          {
            ab.i("MicroMsg.Fav.FavApiLogic", "match max auto download, max size %d", new Object[] { Long.valueOf(l2) });
            i = 1;
            break label429;
          }
          i = 0;
          break label429;
          label788: localc.field_status = 4;
          ab.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo download status pause");
        }
        label805: a(localc);
        AppMethodBeat.o(102561);
      }
    }
  }

  public static boolean a(long paramLong, Runnable paramRunnable)
  {
    AppMethodBeat.i(102595);
    boolean bool = a(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong), true, paramRunnable);
    AppMethodBeat.o(102595);
    return bool;
  }

  public static boolean a(g paramg, boolean paramBoolean, Runnable paramRunnable)
  {
    boolean bool = false;
    AppMethodBeat.i(102552);
    if (paramg == null)
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
      com.tencent.mm.sdk.platformtools.al.d(paramRunnable);
      AppMethodBeat.o(102552);
      paramBoolean = bool;
      return paramBoolean;
    }
    if (Looper.myLooper() == com.tencent.mm.kernel.g.RS().oAl.getLooper())
    {
      ab.i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, do directly", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), Boolean.valueOf(paramBoolean) });
      a(paramg, paramBoolean);
      com.tencent.mm.sdk.platformtools.al.d(paramRunnable);
    }
    while (true)
    {
      AppMethodBeat.o(102552);
      paramBoolean = true;
      break;
      ab.i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, post to worker", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), Boolean.valueOf(paramBoolean) });
      com.tencent.mm.kernel.g.RS().aa(new b.2(paramg, paramBoolean, paramRunnable));
    }
  }

  public static String[] a(g paramg, ak paramak)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(102618);
    if (paramg == null)
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
      AppMethodBeat.o(102618);
      paramg = (g)localObject2;
      return paramg;
    }
    aar localaar = c(paramg);
    String[] arrayOfString = new String[2];
    b.3 local3 = new b.3(paramg, localaar);
    switch (paramg.field_type)
    {
    case 6:
    case 7:
    case 8:
    case 9:
    case 12:
    case 13:
    case 16:
    case 17:
    default:
      if (localaar != null)
      {
        arrayOfString[0] = c(localaar);
        arrayOfString[1] = localaar.cvq;
        paramak.post(local3);
      }
    case 5:
    case 10:
    case 15:
    case 11:
      while (true)
      {
        ab.d("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath thumbPath %s, thumbUrl %s, type %d", new Object[] { arrayOfString[0], arrayOfString[1], Integer.valueOf(paramg.field_type) });
        AppMethodBeat.o(102618);
        paramg = arrayOfString;
        break;
        localObject2 = paramg.field_favProto.whA;
        if (localaar == null)
        {
          if (localObject2 != null)
            arrayOfString[1] = ((abu)localObject2).thumbUrl;
        }
        else
        {
          if (localObject2 == null);
          for (localObject2 = null; ; localObject2 = ((abu)localObject2).thumbUrl)
          {
            localObject1 = localObject2;
            if (bo.isNullOrNil((String)localObject2))
              localObject1 = localaar.cvq;
            arrayOfString[0] = c(localaar);
            arrayOfString[1] = localObject1;
            paramak.post(local3);
            break;
          }
          paramak = paramg.field_favProto.whC;
          if (paramak != null)
          {
            arrayOfString[1] = paramak.thumbUrl;
            continue;
            paramak = paramg.field_favProto.whE;
            if (paramak != null)
            {
              arrayOfString[1] = paramak.thumbUrl;
              continue;
              paramak = paramg.field_favProto.whC;
              if (paramak != null)
                arrayOfString[1] = paramak.thumbUrl;
            }
          }
        }
      }
    case 14:
    case 18:
    }
    if (paramg.field_favProto.wiv != null)
    {
      Iterator localIterator = paramg.field_favProto.wiv.iterator();
      label382: localObject2 = localObject1;
      if (localIterator.hasNext())
      {
        localObject2 = (aar)localIterator.next();
        if (((aar)localObject2).dataType != 2)
          break label442;
        localObject2 = b((aar)localObject2);
        paramak.post(local3);
      }
    }
    while (true)
    {
      arrayOfString[0] = localObject2;
      arrayOfString[1] = localaar.cvq;
      break;
      label442: if (((aar)localObject2).dataType != 15)
        break label382;
      localObject2 = c((aar)localObject2);
      paramak.post(local3);
    }
  }

  public static String aC(float paramFloat)
  {
    AppMethodBeat.i(102579);
    String str;
    if (paramFloat < 1024.0F)
    {
      str = String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
      AppMethodBeat.o(102579);
    }
    while (true)
    {
      return str;
      if (paramFloat < 1048576.0F)
      {
        str = String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
        AppMethodBeat.o(102579);
      }
      else if (paramFloat < 1.073742E+009F)
      {
        str = String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
        AppMethodBeat.o(102579);
      }
      else
      {
        str = String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
        AppMethodBeat.o(102579);
      }
    }
  }

  public static long b(g paramg)
  {
    AppMethodBeat.i(102528);
    long l;
    if (paramg == null)
    {
      l = 0L;
      AppMethodBeat.o(102528);
    }
    while (true)
    {
      return l;
      Iterator localIterator = paramg.field_favProto.wiv.iterator();
      for (int i = 0; localIterator.hasNext(); i = (int)(paramg.wgu + l))
      {
        paramg = (aar)localIterator.next();
        l = i;
      }
      l = i;
      AppMethodBeat.o(102528);
    }
  }

  public static String b(aar paramaar)
  {
    AppMethodBeat.i(102543);
    if (paramaar == null)
    {
      paramaar = "";
      AppMethodBeat.o(102543);
    }
    while (true)
    {
      return paramaar;
      Object localObject1 = paramaar.mnd;
      if ((bo.isNullOrNil((String)localObject1)) || (!com.tencent.mm.kernel.g.RK()))
      {
        paramaar = "";
        AppMethodBeat.o(102543);
      }
      else
      {
        com.tencent.mm.vfs.b localb1 = Lz((String)localObject1);
        int i = 0;
        int j = i;
        com.tencent.mm.vfs.b localb2 = localb1;
        Object localObject2 = localObject1;
        if (paramaar.dataType == 8)
        {
          j = i;
          localb2 = localb1;
          localObject2 = localObject1;
          if (!bo.isNullOrNil(paramaar.title))
          {
            localObject2 = paramaar.title;
            localb2 = Lz(paramaar.mnd);
            j = 1;
          }
        }
        localObject1 = localObject2;
        if (paramaar.wgo != null)
        {
          localObject1 = localObject2;
          if (paramaar.wgo.trim().length() > 0)
          {
            localObject1 = localObject2;
            if (j == 0)
              localObject1 = (String)localObject2 + "." + paramaar.wgo;
          }
        }
        localObject2 = new com.tencent.mm.vfs.b(localb2, (String)localObject1);
        if ((((com.tencent.mm.vfs.b)localObject2).exists()) || (bo.isNullOrNil(paramaar.wgq)))
        {
          paramaar = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject2).dMD());
          AppMethodBeat.o(102543);
        }
        else
        {
          localObject1 = com.tencent.mm.a.g.x((paramaar.wgq + paramaar.mnd).getBytes());
          if (bo.isNullOrNil((String)localObject1))
          {
            paramaar = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject2).dMD());
            AppMethodBeat.o(102543);
          }
          else
          {
            localObject2 = localObject1;
            if (paramaar.wgo != null)
            {
              localObject2 = localObject1;
              if (paramaar.wgo.trim().length() > 0)
                localObject2 = (String)localObject1 + "." + paramaar.wgo;
            }
            localObject2 = new com.tencent.mm.vfs.b(localb2, (String)localObject2);
            if (((com.tencent.mm.vfs.b)localObject2).exists())
            {
              paramaar = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject2).dMD());
              AppMethodBeat.o(102543);
            }
            else
            {
              localObject1 = paramaar.mnd;
              localObject2 = localObject1;
              if (paramaar.wgo != null)
              {
                localObject2 = localObject1;
                if (paramaar.wgo.trim().length() > 0)
                  localObject2 = (String)localObject1 + "." + paramaar.wgo;
              }
              ab.d("MicroMsg.Fav.FavApiLogic", "use dataId.fmt, ".concat(String.valueOf(localObject2)));
              paramaar = com.tencent.mm.vfs.j.w(new com.tencent.mm.vfs.b(localb2, (String)localObject2).dMD());
              AppMethodBeat.o(102543);
            }
          }
        }
      }
    }
  }

  public static void b(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(138727);
    a(paramContext, paramString, paramIntent, null);
    AppMethodBeat.o(138727);
  }

  private static void b(gh paramgh)
  {
    AppMethodBeat.i(102603);
    g localg = LG(paramgh.cAH.desc);
    if (localg == null)
      AppMethodBeat.o(102603);
    while (true)
    {
      return;
      if ((localg.field_favProto != null) && (localg.field_favProto.wiv != null))
      {
        Iterator localIterator = localg.field_favProto.wiv.iterator();
        while (localIterator.hasNext())
        {
          aar localaar = (aar)localIterator.next();
          if (localaar.dataType == 20)
          {
            localaar.oY(true);
            localaar.oX(true);
            localaar.akV("");
            localaar.akL("");
            localaar.akM("");
            localaar.akJ("");
            localaar.akK("");
          }
        }
      }
      paramgh.cAH.cvC = localg.field_favProto;
      AppMethodBeat.o(102603);
    }
  }

  public static void b(c paramc)
  {
    AppMethodBeat.i(102558);
    int i = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().r(paramc.field_favLocalId, 1);
    ab.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, download data status:%d, favlocalId:%d", new Object[] { Integer.valueOf(i), Long.valueOf(paramc.field_favLocalId) });
    g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramc.field_favLocalId);
    if (localg == null)
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
      AppMethodBeat.o(102558);
    }
    while (true)
    {
      return;
      if ((!localg.buA()) && (!localg.buw()) && (!localg.bux()))
        break;
      ab.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, status upload, skip. isWaitServerUpload:%b  isUploadding:%b  isUploadFailed:%b", new Object[] { Boolean.valueOf(localg.buA()), Boolean.valueOf(localg.buw()), Boolean.valueOf(localg.bux()) });
      AppMethodBeat.o(102558);
    }
    switch (i)
    {
    default:
    case 1:
    case 4:
    case 0:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(102558);
      break;
      h.iy(localg.field_localId);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(7, paramc.field_favLocalId);
      AppMethodBeat.o(102558);
      break;
      ab.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
      com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(1), Integer.valueOf(localg.field_type), Integer.valueOf(-5), Long.valueOf(b(localg)), Long.valueOf(h.ix(localg.field_localId)) });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(8, paramc.field_favLocalId);
      AppMethodBeat.o(102558);
      break;
      ab.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus init, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id) });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(10, paramc.field_favLocalId);
      AppMethodBeat.o(102558);
      break;
      ab.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus finish, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id) });
      com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(1), Integer.valueOf(localg.field_type), Integer.valueOf(0), Long.valueOf(b(localg)), Long.valueOf(h.ix(localg.field_localId)) });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(10, paramc.field_favLocalId);
      AppMethodBeat.o(102558);
      break;
      ab.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id) });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(8, paramc.field_favLocalId);
    }
  }

  private static void b(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(102605);
    aaz localaaz = new aaz();
    if (!paramBoolean)
      localaaz.wim = com.tencent.mm.model.r.Yz();
    localaaz.win = com.tencent.mm.model.r.Yz();
    paramg.field_favProto.mk(bo.anT());
    paramg.field_favProto.a(localaaz);
    AppMethodBeat.o(102605);
  }

  public static void b(aar paramaar, int paramInt, long paramLong)
  {
    AppMethodBeat.i(102594);
    if (bo.isNullOrNil(paramaar.mnd))
      AppMethodBeat.o(102594);
    while (true)
    {
      return;
      ab.i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, dataId %s", new Object[] { paramaar.mnd });
      c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramaar.mnd);
      Object localObject = localc;
      if (localc != null)
        if (localc.field_status != 3)
        {
          localObject = localc;
          if (localc.field_status != 4);
        }
        else
        {
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(localc, new String[] { "dataId" });
          localObject = null;
        }
      if ((localObject != null) && (((c)localObject).field_type == 1))
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
        ((c)localObject).field_status = 1;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a((c)localObject, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(paramaar.mnd);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
        AppMethodBeat.o(102594);
      }
      else
      {
        localObject = new com.tencent.mm.vfs.b(b(paramaar));
        if ((!bo.isNullOrNil(paramaar.wgb)) && (!bo.isNullOrNil(paramaar.wfZ)) && (!((com.tencent.mm.vfs.b)localObject).exists()))
        {
          ab.i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
          long l = System.currentTimeMillis();
          localObject = new g();
          ((g)localObject).field_localId = paramLong;
          ((g)localObject).field_id = -1;
          ((g)localObject).field_type = paramInt;
          a(paramaar, (g)localObject, 1, true);
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(paramaar.mnd);
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
          ab.i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        }
        AppMethodBeat.o(102594);
      }
    }
  }

  public static void bI(List<Integer> paramList)
  {
    AppMethodBeat.i(102536);
    if (paramList.size() == 0)
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "setDeleted list null");
      AppMethodBeat.o(102536);
    }
    while (true)
    {
      return;
      Set localSet = bud();
      ab.i("MicroMsg.Fav.FavApiLogic", "setDeleted before del:%s", new Object[] { localSet.toString() });
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Integer localInteger = (Integer)paramList.next();
        ab.i("MicroMsg.Fav.FavApiLogic", "setDeleted id:%d, ret:%b", new Object[] { localInteger, Boolean.valueOf(localSet.remove(localInteger.toString())) });
      }
      ab.i("MicroMsg.Fav.FavApiLogic", "setDeleted after del:%s", new Object[] { localSet.toString() });
      d(localSet);
      AppMethodBeat.o(102536);
    }
  }

  public static boolean bJ(List<g> paramList)
  {
    AppMethodBeat.i(102550);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
      AppMethodBeat.o(102550);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      Set localSet = bud();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        g localg = (g)paramList.next();
        h(localg);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().iG(localg.field_localId);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().z(localg);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iC(localg.field_localId);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().v(localg);
        localSet.add(localg.field_id);
        ab.d("MicroMsg.Fav.FavApiLogic", "delete id %d", new Object[] { Integer.valueOf(localg.field_id) });
      }
      d(localSet);
      buf();
      AppMethodBeat.o(102550);
    }
  }

  private static Set<String> bud()
  {
    AppMethodBeat.i(102538);
    Object localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(225282, "");
    ab.i("MicroMsg.Fav.FavApiLogic", "get need del IDs: %s", new Object[] { localObject });
    HashSet localHashSet = new HashSet();
    if (bo.isNullOrNil((String)localObject))
      AppMethodBeat.o(102538);
    while (true)
    {
      return localHashSet;
      localObject = ((String)localObject).split(",");
      if ((localObject == null) || (localObject.length == 0))
      {
        AppMethodBeat.o(102538);
      }
      else
      {
        int i = localObject.length;
        for (int j = 0; j < i; j++)
          localHashSet.add(localObject[j]);
        AppMethodBeat.o(102538);
      }
    }
  }

  public static String bue()
  {
    AppMethodBeat.i(102542);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "favorite/web/";
    AppMethodBeat.o(102542);
    return localObject;
  }

  public static void buf()
  {
    AppMethodBeat.i(102546);
    Object localObject1 = bud();
    if (((Set)localObject1).size() == 0)
    {
      ab.v("MicroMsg.Fav.FavApiLogic", "doBatchDel no item to delete");
      AppMethodBeat.o(102546);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Fav.FavApiLogic", "doBatchDel idList:%s", new Object[] { localObject1.toString() });
      Object localObject2 = new LinkedList();
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        String str = (String)((Iterator)localObject1).next();
        try
        {
          ((LinkedList)localObject2).add(Integer.valueOf(bo.getInt(str, 0)));
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.Fav.FavApiLogic", localException, "", new Object[0]);
          ab.e("MicroMsg.Fav.FavApiLogic", "doBatchDel parseInt error:%s", new Object[] { localException.getMessage() });
        }
      }
      ab.i("MicroMsg.Fav.FavApiLogic", "doBatchDel after parse, total size %d", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()) });
      if (((LinkedList)localObject2).size() > 0)
      {
        localObject2 = new ag((LinkedList)localObject2);
        com.tencent.mm.kernel.g.Rg().a((m)localObject2, 0);
      }
      AppMethodBeat.o(102546);
    }
  }

  public static void bug()
  {
    AppMethodBeat.i(102563);
    if (0L >= meD)
    {
      ab.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but favLocalId is null, return");
      AppMethodBeat.o(102563);
    }
    while (true)
    {
      return;
      g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(meD);
      meD = 0L;
      if (localg == null)
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but iteminfo is null, return");
        AppMethodBeat.o(102563);
      }
      else
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav ,go on");
        Intent localIntent = new Intent();
        localIntent.putExtra("key_fav_scene", 5);
        localIntent.putExtra("key_fav_item_id", localg.field_localId);
        a(com.tencent.mm.sdk.platformtools.ah.getContext(), ".ui.FavTagEditUI", localIntent, null);
        AppMethodBeat.o(102563);
      }
    }
  }

  public static long buh()
  {
    AppMethodBeat.i(102564);
    long l1 = bui() - buj();
    long l2 = l1;
    if (l1 < 0L)
      l2 = 1024L;
    AppMethodBeat.o(102564);
    return l2;
  }

  public static long bui()
  {
    AppMethodBeat.i(102565);
    long l = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLN, Long.valueOf(0L))).longValue();
    AppMethodBeat.o(102565);
    return l;
  }

  public static long buj()
  {
    AppMethodBeat.i(102566);
    long l = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLM, Long.valueOf(0L))).longValue();
    AppMethodBeat.o(102566);
    return l;
  }

  public static boolean buk()
  {
    boolean bool = false;
    AppMethodBeat.i(102575);
    if (bui() == 0L)
      AppMethodBeat.o(102575);
    while (true)
    {
      return bool;
      if (buh() < 52428800L)
      {
        bool = true;
        AppMethodBeat.o(102575);
      }
      else
      {
        AppMethodBeat.o(102575);
      }
    }
  }

  public static String bul()
  {
    AppMethodBeat.i(102581);
    String str = com.tencent.mm.kernel.g.RP().eJM + "favorite/music/";
    AppMethodBeat.o(102581);
    return str;
  }

  public static String bum()
  {
    AppMethodBeat.i(102584);
    String str = com.tencent.mm.kernel.g.RP().eJM + "favorite/";
    AppMethodBeat.o(102584);
    return str;
  }

  public static String bun()
  {
    AppMethodBeat.i(102585);
    String str = com.tencent.mm.kernel.g.RP().eJM + "favorite/voice/";
    AppMethodBeat.o(102585);
    return str;
  }

  public static boolean buo()
  {
    AppMethodBeat.i(102592);
    boolean bool;
    if (ah.bvf() > 0)
    {
      bool = true;
      AppMethodBeat.o(102592);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102592);
    }
  }

  public static boolean bup()
  {
    boolean bool = false;
    AppMethodBeat.i(102599);
    if (bui() == 0L)
      AppMethodBeat.o(102599);
    while (true)
    {
      return bool;
      if (buh() < 10485760L)
      {
        bool = true;
        AppMethodBeat.o(102599);
      }
      else
      {
        AppMethodBeat.o(102599);
      }
    }
  }

  public static aar c(g paramg)
  {
    AppMethodBeat.i(102529);
    if (paramg == null)
    {
      paramg = new aar();
      AppMethodBeat.o(102529);
    }
    while (true)
    {
      return paramg;
      if (paramg.field_favProto.wiv.size() == 0)
      {
        paramg = new aar();
        AppMethodBeat.o(102529);
      }
      else
      {
        paramg = (aar)paramg.field_favProto.wiv.get(0);
        AppMethodBeat.o(102529);
      }
    }
  }

  public static String c(aar paramaar)
  {
    AppMethodBeat.i(102548);
    if ((paramaar == null) || (bo.isNullOrNil(paramaar.mnd)))
    {
      paramaar = "";
      AppMethodBeat.o(102548);
    }
    while (true)
    {
      return paramaar;
      paramaar = LA(paramaar.mnd);
      paramaar = com.tencent.mm.vfs.j.w(new com.tencent.mm.vfs.b(Lz(paramaar), paramaar).dMD());
      AppMethodBeat.o(102548);
    }
  }

  public static void c(gh paramgh)
  {
    AppMethodBeat.i(102607);
    Object localObject1;
    g localg;
    if (paramgh.cAH.cAO == 1)
    {
      paramgh.cAI.path = ip(paramgh.cAH.cvv);
      localObject1 = paramgh.cAI;
      long l = paramgh.cAH.cvv;
      localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(l);
      if ((localg == null) || (localg.field_favProto == null))
      {
        paramgh = "";
        label85: ((gh.b)localObject1).thumbPath = paramgh;
        AppMethodBeat.o(102607);
      }
    }
    while (true)
    {
      return;
      Object localObject2;
      if ((localg.field_type != 18) || (localg.field_favProto.wiv.size() > 1))
      {
        paramgh = localg.field_favProto.wiv.iterator();
        while (true)
          if (paramgh.hasNext())
          {
            aar localaar = (aar)paramgh.next();
            switch (localaar.dataType)
            {
            default:
              break;
            case 2:
              localObject2 = c(localaar);
              paramgh = (gh)localObject2;
              if (com.tencent.mm.vfs.e.ct((String)localObject2))
                break label85;
              paramgh = b(localaar);
              if (com.tencent.mm.vfs.e.ct(paramgh))
              {
                com.tencent.mm.sdk.platformtools.d.c(paramgh, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject2);
                paramgh = c(localaar);
                break label85;
              }
              if (localaar.wfU)
              {
                a(localg, localaar);
                paramgh = (gh)localObject2;
                break label85;
              }
              if (localaar.wga)
              {
                a(localg, localaar, true);
                break label85;
              }
              paramgh = "";
              break label85;
            }
          }
      }
      paramgh = "";
      break;
      if (paramgh.cAH.cAO == 2)
      {
        localg = new g();
        localg.field_type = 2;
        localObject1 = new aar();
        ((aar)localObject1).akU(cf(localObject1.toString(), 2));
        localObject2 = b((aar)localObject1);
        ((aar)localObject1).akV((String)localObject2);
        ((aar)localObject1).LE(2);
        localg.field_favProto.wiv.add(localObject1);
        paramgh.cAI.path = g.s(localg);
        paramgh.cAI.thumbPath = ((String)localObject2);
        AppMethodBeat.o(102607);
      }
      else if (paramgh.cAH.cAO == 3)
      {
        localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
        if (localObject2 != null)
          paramgh.cAI.path = (com.tencent.mm.model.r.Yz() + ";" + ((g)localObject2).field_fromUser + ";" + ((g)localObject2).field_updateTime);
        AppMethodBeat.o(102607);
      }
      else if (paramgh.cAH.cAO == 4)
      {
        b(paramgh);
        AppMethodBeat.o(102607);
      }
      else if (paramgh.cAH.cAO == 5)
      {
        a(paramgh);
        AppMethodBeat.o(102607);
      }
      else if (paramgh.cAH.cAO == 6)
      {
        localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramgh.cAH.cvv);
        if (localObject2 == null)
        {
          paramgh.cAI.ret = 0;
          AppMethodBeat.o(102607);
        }
        else
        {
          paramgh = paramgh.cAI;
          if (((g)localObject2).field_id > 0);
          for (int i = 1; ; i = 0)
          {
            paramgh.ret = i;
            AppMethodBeat.o(102607);
            break;
          }
        }
      }
      else
      {
        localObject2 = new g();
        ((g)localObject2).field_type = 18;
        ((g)localObject2).field_favProto = paramgh.cAH.cvC;
        paramgh.cAI.path = g.s((g)localObject2);
        AppMethodBeat.o(102607);
      }
    }
  }

  public static void c(String paramString, Context paramContext)
  {
    AppMethodBeat.i(102613);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "share image to friend fail, imgPath is null");
      AppMethodBeat.o(102613);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Retr_File_Name", paramString);
      localIntent.putExtra("Retr_Compress_Type", 0);
      localIntent.putExtra("Retr_Msg_Type", 0);
      com.tencent.mm.bp.d.f(paramContext, ".ui.transmit.MsgRetransmitUI", localIntent);
      AppMethodBeat.o(102613);
    }
  }

  public static String cf(String paramString, int paramInt)
  {
    AppMethodBeat.i(102525);
    paramString = com.tencent.mm.a.g.x((paramString + paramInt + System.currentTimeMillis()).getBytes());
    AppMethodBeat.o(102525);
    return paramString;
  }

  public static void d(g paramg)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(102534);
        if ((paramg == null) || (paramg.field_type != 18))
        {
          AppMethodBeat.o(102534);
          return;
        }
        if (!meC.containsKey(Long.valueOf(paramg.field_localId)))
        {
          AppMethodBeat.o(102534);
          continue;
        }
      }
      finally
      {
      }
      if ((meC.get(Long.valueOf(paramg.field_localId)) == null) || (((ArrayList)meC.get(Long.valueOf(paramg.field_localId))).size() == 0))
      {
        AppMethodBeat.o(102534);
      }
      else
      {
        String str = ip(paramg.field_localId);
        ab.i("MicroMsg.Fav.FavApiLogic", "checkUpdateSnsNotePostXml, resend favlocal id:%d,xml:%s", new Object[] { Long.valueOf(paramg.field_localId), str });
        ow localow = new com/tencent/mm/g/a/ow;
        localow.<init>();
        localow.cLi.cLj = ((ArrayList)meC.get(Long.valueOf(paramg.field_localId)));
        localow.cLi.cLk = str;
        com.tencent.mm.sdk.b.a.xxA.m(localow);
        meC.remove(Long.valueOf(paramg.field_localId));
        AppMethodBeat.o(102534);
      }
    }
  }

  public static void d(aar paramaar)
  {
    AppMethodBeat.i(102573);
    c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramaar.mnd);
    if ((localc != null) && (localc.field_status != 3))
    {
      localc.field_status = 2;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().pauseDownload(paramaar.mnd);
    }
    localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(LA(paramaar.mnd));
    if ((localc != null) && (localc.field_status != 3))
    {
      localc.field_status = 2;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().pauseDownload(LA(paramaar.mnd));
    }
    AppMethodBeat.o(102573);
  }

  public static void d(String paramString, Context paramContext)
  {
    AppMethodBeat.i(102614);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "share image to timeline fail, filePath is null");
      AppMethodBeat.o(102614);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      String str1 = "fav_" + com.tencent.mm.model.r.Yz() + "_0";
      String str2 = v.nW(str1);
      v.Zp().y(str2, true).j("prePublishId", str1);
      localIntent.putExtra("reportSessionId", str2);
      localIntent.putExtra("Ksnsupload_type", 0);
      localIntent.putExtra("sns_kemdia_path", paramString);
      com.tencent.mm.bp.d.b(paramContext, "sns", ".ui.SnsUploadUI", localIntent);
      AppMethodBeat.o(102614);
    }
  }

  private static void d(Set<String> paramSet)
  {
    AppMethodBeat.i(102537);
    StringBuffer localStringBuffer = new StringBuffer();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
      localStringBuffer.append((String)paramSet.next()).append(",");
    paramSet = "";
    if (localStringBuffer.length() > 0)
      paramSet = localStringBuffer.substring(0, localStringBuffer.length() - 1);
    ab.i("MicroMsg.Fav.FavApiLogic", "set need del IDs: %s", new Object[] { paramSet });
    com.tencent.mm.kernel.g.RP().Ry().set(225282, paramSet);
    AppMethodBeat.o(102537);
  }

  public static void e(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(102602);
    g localg = LG(paramString1);
    if (localg == null)
      AppMethodBeat.o(102602);
    while (true)
    {
      return;
      ld localld = new ld();
      localld.cGU.type = 2;
      localld.cGU.field_localId = -1L;
      localld.cGU.context = paramContext;
      localld.cGU.cHa = 4;
      localld.cGU.cHc = true;
      paramContext = new Bundle();
      paramContext.putString("noteauthor", localg.field_favProto.vzK.wim);
      paramContext.putString("noteeditor", localg.field_favProto.vzK.win);
      paramContext.putLong("edittime", localg.field_favProto.lgR);
      paramContext.putString("notexml", g.s(localg));
      paramContext.putString("snslocalid", paramString2);
      paramContext.putString("snsthumbpath", paramString3);
      paramContext.putString("snsnotelinkxml", paramString1);
      localld.cGU.cGZ = paramContext;
      localld.cGU.field_favProto = localg.field_favProto;
      com.tencent.mm.sdk.b.a.xxA.m(localld);
      AppMethodBeat.o(102602);
    }
  }

  public static void e(String paramString, Context paramContext)
  {
    AppMethodBeat.i(102616);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "shareTextToFriend content null");
      AppMethodBeat.o(102616);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Retr_Msg_content", paramString);
      localIntent.putExtra("Retr_Msg_Type", 4);
      localIntent.putExtra("mutil_select_is_ret", true);
      com.tencent.mm.bp.d.f(paramContext, ".ui.transmit.MsgRetransmitUI", localIntent);
      AppMethodBeat.o(102616);
    }
  }

  private static boolean e(g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(102535);
    if (paramg == null)
    {
      AppMethodBeat.o(102535);
      return bool;
    }
    Iterator localIterator = paramg.field_favProto.wiv.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      paramg = (aar)localIterator.next();
    }
    while (((paramg.dataType != 8) && (paramg.dataType != 4) && (paramg.dataType != 2) && (paramg.dataType != 3)) || ((!bo.isNullOrNil(paramg.wfZ)) && (!bo.isNullOrNil(paramg.wgb))));
    for (bool = false; ; bool = true)
    {
      AppMethodBeat.o(102535);
      break;
    }
  }

  public static boolean e(aar paramaar)
  {
    AppMethodBeat.i(102580);
    com.tencent.mm.aw.e locale = com.tencent.mm.aw.a.aih();
    boolean bool;
    if ((locale != null) && (locale.fJS == 6) && (bo.bc(paramaar.mnd, "").equals(locale.fJU)) && (com.tencent.mm.aw.a.aie()))
    {
      bool = true;
      AppMethodBeat.o(102580);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102580);
    }
  }

  private static String ek(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102524);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(102524);
    while (true)
    {
      return paramString2;
      if (bo.isNullOrNil(paramString2))
      {
        AppMethodBeat.o(102524);
        paramString2 = paramString1;
      }
      else
      {
        paramString2 = paramString1 + "​" + paramString2;
        AppMethodBeat.o(102524);
      }
    }
  }

  public static boolean f(g paramg)
  {
    AppMethodBeat.i(102545);
    boolean bool;
    if (paramg.field_favProto == null)
    {
      AppMethodBeat.o(102545);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramg = paramg.field_favProto.wiv.iterator();
      while (true)
        if (paramg.hasNext())
        {
          aar localaar = (aar)paramg.next();
          if (localaar.whh == 2)
          {
            AppMethodBeat.o(102545);
            bool = true;
            break;
          }
          if (localaar.whh == 1)
          {
            AppMethodBeat.o(102545);
            bool = true;
            break;
          }
        }
      AppMethodBeat.o(102545);
      bool = false;
    }
  }

  public static boolean f(aar paramaar)
  {
    AppMethodBeat.i(102590);
    boolean bool = new com.tencent.mm.vfs.b(b(paramaar)).exists();
    AppMethodBeat.o(102590);
    return bool;
  }

  public static float fY(long paramLong)
  {
    float f1 = 60.0F;
    float f2 = 1.0F;
    AppMethodBeat.i(102576);
    float f3 = (float)paramLong / 1000.0F;
    if (f3 < 1.0F)
      f3 = f2;
    while (true)
    {
      if (f3 > 60.0F)
        f3 = f1;
      while (true)
      {
        f3 = Math.round(f3);
        AppMethodBeat.o(102576);
        return f3;
      }
    }
  }

  public static boolean g(g paramg)
  {
    boolean bool = false;
    if (paramg == null);
    while (true)
    {
      return bool;
      if ((paramg.field_itemStatus == 8) || (paramg.field_itemStatus == 10) || (paramg.field_itemStatus == 7))
        bool = true;
    }
  }

  public static boolean g(aar paramaar)
  {
    AppMethodBeat.i(102591);
    boolean bool = com.tencent.mm.sdk.platformtools.r.amo(b(paramaar));
    AppMethodBeat.o(102591);
    return bool;
  }

  public static String getAppName(Context paramContext, String paramString)
  {
    AppMethodBeat.i(102582);
    ad.b localb = ad.a.fls;
    if (localb != null)
    {
      paramContext = localb.t(paramContext, paramString);
      AppMethodBeat.o(102582);
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(102582);
    }
  }

  private static void h(g paramg)
  {
    AppMethodBeat.i(102547);
    Set localSet = an.mgy;
    paramg = paramg.field_favProto.wiv;
    for (int i = 0; i < paramg.size(); i++)
    {
      String str = c((aar)paramg.get(i));
      if ((localSet == null) || (!localSet.contains(str)))
        com.tencent.mm.vfs.e.deleteFile(str);
      str = b((aar)paramg.get(i));
      if ((localSet == null) || (!localSet.contains(str)))
        com.tencent.mm.vfs.e.deleteFile(str);
    }
    AppMethodBeat.o(102547);
  }

  public static boolean i(g paramg)
  {
    AppMethodBeat.i(102553);
    boolean bool = a(paramg, true, null);
    AppMethodBeat.o(102553);
    return bool;
  }

  public static void in(long paramLong)
  {
    AppMethodBeat.i(102530);
    ab.i("MicroMsg.Fav.FavApiLogic", "setUsedCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLM, Long.valueOf(paramLong));
    AppMethodBeat.o(102530);
  }

  public static void io(long paramLong)
  {
    AppMethodBeat.i(102531);
    ab.i("MicroMsg.Fav.FavApiLogic", "setTotalCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLN, Long.valueOf(paramLong));
    AppMethodBeat.o(102531);
  }

  private static String ip(long paramLong)
  {
    AppMethodBeat.i(102532);
    StringBuilder localStringBuilder = new StringBuilder();
    g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
    String str1;
    if ((localg == null) || (localg.field_favProto == null) || (localg.field_favProto.wiv.size() <= 1))
    {
      str1 = "";
      AppMethodBeat.o(102532);
    }
    while (true)
    {
      return str1;
      aaz localaaz = localg.field_favProto.vzK;
      str1 = "";
      String str2 = "";
      if (localaaz != null)
      {
        str1 = localaaz.win;
        str2 = localaaz.wim;
      }
      localStringBuilder.append("<noteinfo>");
      localStringBuilder.append("<noteauthor>").append(str2).append("</noteauthor>");
      localStringBuilder.append("<noteeditor>").append(str1).append("</noteeditor>");
      localStringBuilder.append("<edittime>").append(localg.field_favProto.lgR).append("</edittime>");
      localStringBuilder.append("<favlocalid>").append(localg.field_localId).append("</favlocalid>");
      localStringBuilder.append(com.tencent.mm.plugin.fav.a.a.a.bK(localg.field_favProto.wiv).replace("cdn_dataurl", "cdndataurl").replace("cdn_datakey", "cdndatakey").replace("cdn_thumburl", "cdnthumburl").replace("cdn_thumbkey", "cdnthumbkey").replace("thumbfullsize", "thumbsize").replace("fullsize", "datasize").replace("datasrcname", "sourcename").replace("datasrctime", "sourcetime").replace("stream_lowbandurl", "streamlowbandurl").replace("stream_dataurl", "streamdataurl").replace("stream_weburl", "streamweburl"));
      localStringBuilder.append("</noteinfo>");
      str1 = localStringBuilder.toString();
      AppMethodBeat.o(102532);
    }
  }

  public static void iq(long paramLong)
  {
    AppMethodBeat.i(102539);
    com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).edit().putLong("fav_mx_auto_download_size", paramLong).commit();
    AppMethodBeat.o(102539);
  }

  public static void ir(long paramLong)
  {
    AppMethodBeat.i(102540);
    com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).edit().putLong("fav_mx_auto_upload_size", paramLong).commit();
    AppMethodBeat.o(102540);
  }

  public static void is(long paramLong)
  {
    AppMethodBeat.i(102541);
    com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).edit().putLong("fav_mx_file_size", paramLong).commit();
    AppMethodBeat.o(102541);
  }

  public static void it(long paramLong)
  {
    meD = paramLong;
  }

  public static float iu(long paramLong)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(102577);
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F)
      f2 = f1;
    while (true)
    {
      f2 = Math.round(f2);
      AppMethodBeat.o(102577);
      return f2;
    }
  }

  public static String iv(long paramLong)
  {
    AppMethodBeat.i(102578);
    String str;
    if (paramLong == 0L)
    {
      str = "0KB";
      AppMethodBeat.o(102578);
    }
    while (true)
    {
      return str;
      if (paramLong * 1.0D / 1048576.0D >= 1.0D)
      {
        str = String.format("%dMB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1048576.0D)) });
        AppMethodBeat.o(102578);
      }
      else if (paramLong * 1.0D / 1024.0D >= 1.0D)
      {
        str = String.format("%dKB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1024.0D)) });
        AppMethodBeat.o(102578);
      }
      else
      {
        str = "1KB";
        AppMethodBeat.o(102578);
      }
    }
  }

  public static void j(g paramg)
  {
    AppMethodBeat.i(102554);
    j localj = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().iH(paramg.field_localId);
    if (localj == null)
    {
      localj = new j();
      localj.field_localId = paramg.field_localId;
    }
    for (int i = 1; ; i = 0)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      if (paramg.field_favProto.title != null)
        localStringBuffer.append(paramg.field_favProto.title);
      if (paramg.field_favProto.desc != null)
        localStringBuffer.append(paramg.field_favProto.desc);
      if (paramg.field_favProto.wit != null)
      {
        localObject1 = paramg.field_favProto.wit;
        if (!bo.isNullOrNil(((abl)localObject1).cEV))
        {
          localStringBuffer.append(((abl)localObject1).cEV);
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(((abl)localObject1).cEV);
          if (localObject2 != null)
            localStringBuffer.append(((ap)localObject2).field_nickname).append(((ap)localObject2).field_conRemark);
          localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(((abl)localObject1).toUser);
          if (localObject2 != null)
            localStringBuffer.append(((ap)localObject2).field_nickname).append(((ap)localObject2).field_conRemark);
          localStringBuffer.append(((abl)localObject1).whU);
        }
      }
      Object localObject1 = paramg.field_favProto.wiv;
      localj.field_subtype = 0;
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (aar)((Iterator)localObject1).next();
        if (((aar)localObject2).desc != null)
          localStringBuffer.append(((aar)localObject2).desc);
        if (((aar)localObject2).title != null)
          localStringBuffer.append(((aar)localObject2).title);
        int j = ((aar)localObject2).dataType;
        int k = localj.field_subtype;
        localj.field_subtype = (j.vx(j) | k);
      }
      if (paramg.field_favProto.whA != null)
      {
        if (paramg.field_favProto.whA.desc != null)
          localStringBuffer.append(paramg.field_favProto.whA.desc);
        if (paramg.field_favProto.whA.title != null)
          localStringBuffer.append(paramg.field_favProto.whA.title);
      }
      if (paramg.field_favProto.whC != null)
      {
        if (paramg.field_favProto.whC.desc != null)
          localStringBuffer.append(paramg.field_favProto.whC.desc);
        if (paramg.field_favProto.whC.title != null)
          localStringBuffer.append(paramg.field_favProto.whC.title);
      }
      localj.field_tagContent = "";
      Object localObject2 = paramg.field_tagProto.wiI.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        localj.field_tagContent = (localj.field_tagContent + " " + (String)localObject1);
        localStringBuffer.append((String)localObject1);
      }
      localObject2 = paramg.field_tagProto.wiJ.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        localj.field_tagContent = (localj.field_tagContent + " " + (String)localObject1);
        localStringBuffer.append((String)localObject1);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().LM((String)localObject1);
      }
      localj.field_content = localStringBuffer.toString();
      localj.field_time = paramg.field_updateTime;
      localj.field_type = paramg.field_type;
      if (i != 0)
      {
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().a(localj);
        AppMethodBeat.o(102554);
      }
      while (true)
      {
        return;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().a(localj, new String[] { "localId" });
        AppMethodBeat.o(102554);
      }
    }
  }

  public static boolean k(g paramg)
  {
    AppMethodBeat.i(102562);
    boolean bool;
    if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramg.field_localId) != null)
    {
      bool = true;
      AppMethodBeat.o(102562);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102562);
    }
  }

  public static void l(g paramg)
  {
    AppMethodBeat.i(102569);
    if (!paramg.bux())
    {
      ab.f("MicroMsg.Fav.FavApiLogic", "restartItemUpload status not upload failed!");
      AppMethodBeat.o(102569);
      return;
    }
    switch (paramg.field_itemStatus)
    {
    default:
    case 3:
    case 6:
    case 14:
    case 16:
    case 18:
    case 11:
    }
    while (true)
    {
      AppMethodBeat.o(102569);
      break;
      paramg.field_itemStatus = 1;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getCheckCdnService().run();
      AppMethodBeat.o(102569);
      break;
      if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iz(paramg.field_localId).size() == 0)
      {
        paramg.field_itemStatus = 9;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
        paramg = new af(paramg);
        com.tencent.mm.kernel.g.Rg().a(paramg, 0);
        AppMethodBeat.o(102569);
        break;
      }
      paramg.field_itemStatus = 4;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().x(paramg);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      Iterator localIterator = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iz(paramg.field_localId).iterator();
      c localc;
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        ab.i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), localc.field_dataId, Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(localc.field_dataId);
      }
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
      AppMethodBeat.o(102569);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(12, paramg.field_localId);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
      AppMethodBeat.o(102569);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(15, paramg.field_localId);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().x(paramg);
      localIterator = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iz(paramg.field_localId).iterator();
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        ab.i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last mod failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), localc.field_dataId, Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LP(localc.field_dataId);
      }
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
      AppMethodBeat.o(102569);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(17, paramg.field_localId);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getModService().run();
      AppMethodBeat.o(102569);
      break;
      paramg.field_itemStatus = 9;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
    }
  }

  public static void m(g paramg)
  {
    AppMethodBeat.i(102570);
    if (paramg == null)
      AppMethodBeat.o(102570);
    while (true)
    {
      return;
      if ((paramg.field_itemStatus == 8) || (paramg.field_itemStatus == 10))
      {
        paramg.field_itemStatus = 7;
        Object localObject = paramg.field_favProto.wiv;
        if (((List)localObject).size() == 0)
        {
          AppMethodBeat.o(102570);
        }
        else
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            aar localaar = (aar)((Iterator)localObject).next();
            a(paramg, localaar, true);
            a(paramg, localaar);
          }
          AppMethodBeat.o(102570);
        }
      }
      else
      {
        ab.e("MicroMsg.Fav.FavApiLogic", "status not download failed or done!");
        AppMethodBeat.o(102570);
      }
    }
  }

  public static String mK(String paramString)
  {
    AppMethodBeat.i(102568);
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    if (localObject == null)
    {
      ab.w("MicroMsg.Fav.FavApiLogic", "wtf get contact null, username %s", new Object[] { paramString });
      localObject = "";
      AppMethodBeat.o(102568);
      return localObject;
    }
    String str = ((ad)localObject).Oj();
    localObject = str;
    if (t.kH(str))
    {
      paramString = n.my(paramString);
      localObject = com.tencent.mm.model.r.Yz();
      if ((paramString != null) && (!paramString.isEmpty()))
        break label112;
      ab.w("MicroMsg.Fav.FavApiLogic", "get members from username error, content empty");
    }
    for (localObject = str; ; localObject = n.f(paramString, 3))
    {
      AppMethodBeat.o(102568);
      break;
      label112: paramString.remove(localObject);
      paramString.add(0, localObject);
    }
  }

  public static void n(g paramg)
  {
    AppMethodBeat.i(102574);
    if (!paramg.buw())
    {
      ab.e("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, not uploading");
      AppMethodBeat.o(102574);
      return;
    }
    ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, itemStatu:%d", new Object[] { Integer.valueOf(paramg.field_itemStatus) });
    Iterator localIterator = paramg.field_favProto.wiv.iterator();
    while (localIterator.hasNext())
    {
      aar localaar = (aar)localIterator.next();
      c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(localaar.mnd);
      if ((localc != null) && (localc.field_status != 3))
      {
        localc.field_status = 2;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LQ(localaar.mnd);
      }
      localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(LA(localaar.mnd));
      if ((localc != null) && (localc.field_status != 3))
      {
        localc.field_status = 2;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().LQ(LA(localaar.mnd));
      }
    }
    paramg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramg.field_localId);
    ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, after pause data itemStatu:%d", new Object[] { Integer.valueOf(paramg.field_itemStatus) });
    switch (paramg.field_itemStatus)
    {
    default:
    case 1:
    case 4:
    case 9:
    case 12:
    case 15:
    case 17:
    }
    while (true)
    {
      AppMethodBeat.o(102574);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(3, paramg.field_localId);
      ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(102574);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(6, paramg.field_localId);
      ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(6) });
      AppMethodBeat.o(102574);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(11, paramg.field_localId);
      ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(11) });
      AppMethodBeat.o(102574);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(14, paramg.field_localId);
      ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(14) });
      AppMethodBeat.o(102574);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(16, paramg.field_localId);
      ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(16) });
      AppMethodBeat.o(102574);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(18, paramg.field_localId);
      ab.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(18) });
    }
  }

  public static boolean o(g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(102583);
    if (paramg == null)
      AppMethodBeat.o(102583);
    aar localaar;
    while (true)
    {
      return bool;
      localaar = c(paramg);
      if (localaar != null)
        break;
      AppMethodBeat.o(102583);
    }
    long l = bo.yz();
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.WR(b(localaar));
    int i;
    int j;
    if (locala != null)
    {
      i = locala.ckU();
      j = localaar.duration;
      if ((j <= 0) || (Math.abs(j - i) >= 2))
      {
        localaar.LD(i);
        bool = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      }
    }
    while (true)
    {
      ab.i("MicroMsg.Fav.FavApiLogic", "repair video duration[%d TO %d] %b cost time %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool), Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(102583);
      break;
      bool = false;
      continue;
      bool = false;
      j = 0;
      i = 0;
    }
  }

  public static void p(g paramg)
  {
    AppMethodBeat.i(102596);
    j localj = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().iH(paramg.field_localId);
    if (localj == null)
    {
      localj = new j();
      localj.field_localId = paramg.field_localId;
    }
    for (int i = 1; ; i = 0)
    {
      localj.field_tagContent = "";
      Object localObject1 = paramg.field_tagProto.wiI.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localj.field_tagContent = (localj.field_tagContent + " " + (String)localObject2);
      }
      Object localObject2 = paramg.field_tagProto.wiJ.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        localj.field_tagContent = (localj.field_tagContent + " " + (String)localObject1);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().LM((String)localObject1);
      }
      localj.field_content = "";
      localj.field_time = paramg.field_updateTime;
      localj.field_type = paramg.field_type;
      if (i != 0)
      {
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().a(localj);
        AppMethodBeat.o(102596);
      }
      while (true)
      {
        return;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavSearchStorage().a(localj, new String[] { "localId" });
        AppMethodBeat.o(102596);
      }
    }
  }

  public static long q(long paramLong, int paramInt)
  {
    AppMethodBeat.i(102587);
    ab.i("MicroMsg.Fav.FavApiLogic", "tryStartBatchGet...");
    long l1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().w(paramLong, paramInt);
    long l2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().u(paramLong, paramInt);
    ab.v("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
    if (l1 == 0L)
    {
      AppMethodBeat.o(102587);
      paramLong = l2;
    }
    while (true)
    {
      return paramLong;
      Object localObject = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().v(l1, paramInt);
      if (((LinkedList)localObject).size() > 0)
      {
        ab.i("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
        ab.i("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, need batch get idList size:%d", new Object[] { Integer.valueOf(((LinkedList)localObject).size()) });
        localObject = new ah((LinkedList)localObject);
        if (!com.tencent.mm.kernel.g.Rg().a((m)localObject, 0))
        {
          ab.w("MicroMsg.Fav.FavApiLogic", "do scene BatchGetFav fail");
          ah.bve();
        }
      }
      if (l2 == 0L)
      {
        AppMethodBeat.o(102587);
        paramLong = l1;
      }
      else if (l1 < l2)
      {
        AppMethodBeat.o(102587);
        paramLong = l1;
      }
      else
      {
        AppMethodBeat.o(102587);
        paramLong = l2;
      }
    }
  }

  public static void q(g paramg)
  {
    AppMethodBeat.i(102606);
    if (paramg == null)
      AppMethodBeat.o(102606);
    while (true)
    {
      return;
      aaz localaaz = paramg.field_favProto.vzK;
      if ((localaaz == null) || (bo.isNullOrNil(localaaz.win)))
        break;
      AppMethodBeat.o(102606);
    }
    if (paramg.field_type == 18)
    {
      if (paramg.field_favProto.wit.cvp != 6)
        break label117;
      b(paramg, false);
    }
    while (true)
    {
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      AppMethodBeat.o(102606);
      break;
      label117: b(paramg, true);
    }
  }

  public static final String r(g paramg)
  {
    AppMethodBeat.i(102619);
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject;
    long l;
    switch (paramg.field_type)
    {
    case -2:
    case -1:
    case 0:
    case 6:
    case 7:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 15:
    case 17:
    default:
      paramg = localStringBuffer.toString();
      AppMethodBeat.o(102619);
      return paramg;
    case 2:
    case 8:
      localObject = paramg.field_favProto.wiv.iterator();
      l = 0L;
      label142: if (((Iterator)localObject).hasNext())
      {
        paramg = (aar)((Iterator)localObject).next();
        if (paramg == null)
          break label441;
        l = paramg.wgu + l;
      }
      break;
    case 1:
    case 3:
    case 4:
    case 16:
    case 5:
    case 14:
    case 18:
    }
    label438: label441: 
    while (true)
      while (true)
      {
        break label142;
        localStringBuffer.append(l);
        break;
        if (bo.isNullOrNil(paramg.field_favProto.desc))
          break;
        localStringBuffer.append(paramg.field_favProto.desc.getBytes().length);
        break;
        localStringBuffer.append(c(paramg).duration);
        break;
        localObject = "";
        try
        {
          paramg = paramg.field_favProto.whA.wiY;
          localStringBuffer.append(paramg);
          break;
          if (paramg == null)
            break;
          paramg = paramg.field_favProto.wiv.iterator();
          int i = 0;
          int j = 0;
          int k = 0;
          int m = 0;
          while (paramg.hasNext())
          {
            localObject = (aar)paramg.next();
            switch (((aar)localObject).dataType)
            {
            case 3:
            default:
              i++;
              break;
            case 1:
              if (bo.isNullOrNil(((aar)localObject).desc))
                break label438;
              k = ((aar)localObject).desc.getBytes().length + k;
              break;
            case 2:
              j++;
              break;
            case 4:
              m++;
            }
          }
          paramg = String.format("%d:%d:%d:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i) });
          AppMethodBeat.o(102619);
        }
        catch (Exception paramg)
        {
          while (true)
            paramg = (g)localObject;
        }
      }
  }

  public static void startSync()
  {
    AppMethodBeat.i(102588);
    aj localaj = new aj();
    com.tencent.mm.kernel.g.Rg().a(localaj, 0);
    AppMethodBeat.o(102588);
  }

  public static void v(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(102615);
    if (paramContext != null)
    {
      paramIntent.putExtra("Ksnsupload_type", 1);
      com.tencent.mm.bp.d.b(paramContext, "sns", ".ui.SnsUploadUI", paramIntent);
    }
    AppMethodBeat.o(102615);
  }

  public static boolean vu(int paramInt)
  {
    boolean bool1 = false;
    int[] arrayOfInt = a.meA;
    int i = arrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (arrayOfInt[j] == paramInt)
          bool2 = true;
      }
      else
        return bool2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.b
 * JD-Core Version:    0.6.2
 */