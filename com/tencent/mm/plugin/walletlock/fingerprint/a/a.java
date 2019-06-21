package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  private static long tVb = -1L;

  private static HashSet<String> G(JSONArray paramJSONArray)
  {
    Object localObject = null;
    AppMethodBeat.i(51452);
    if (paramJSONArray == null)
    {
      AppMethodBeat.o(51452);
      paramJSONArray = localObject;
    }
    while (true)
    {
      return paramJSONArray;
      try
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        for (int i = 0; i < paramJSONArray.length(); i++)
          localHashSet.add(paramJSONArray.getJSONObject(i).getString("fid"));
        AppMethodBeat.o(51452);
        paramJSONArray = localHashSet;
      }
      catch (Exception paramJSONArray)
      {
        ab.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramJSONArray, "", new Object[0]);
        AppMethodBeat.o(51452);
        paramJSONArray = localObject;
      }
    }
  }

  public static void ac(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(51462);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null)
    {
      com.tencent.mm.plugin.walletlock.gesture.a.g localg = new com.tencent.mm.plugin.walletlock.gesture.a.g();
      localg.tVD = paramLong1;
      localg.tVE = paramLong2;
      localz.set(ac.a.xTl, com.tencent.mm.plugin.walletlock.gesture.a.e.by(localg.toByteArray()));
      localz.dsb();
    }
    AppMethodBeat.o(51462);
  }

  private static JSONArray adn(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(51451);
    if (paramString == null)
    {
      AppMethodBeat.o(51451);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        AppMethodBeat.o(51451);
        paramString = localJSONArray;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramString, "", new Object[0]);
        AppMethodBeat.o(51451);
        paramString = localObject;
      }
    }
  }

  public static boolean ado(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(51454);
    ab.i("MicroMsg.FingerprintInfoStorage", "alvinluo add fid to local: %s", new Object[] { paramString });
    try
    {
      Object localObject1 = adn(cTl());
      HashSet localHashSet = G((JSONArray)localObject1);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        ab.w("MicroMsg.FingerprintInfoStorage", "alvinluo list is null");
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>();
      }
      localObject1 = localHashSet;
      if (localHashSet == null)
      {
        ab.w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet is null");
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>();
      }
      ab.i("MicroMsg.FingerprintInfoStorage", "alvinluo fidList: %s before add fid", new Object[] { ((JSONArray)localObject2).toString() });
      if (!((HashSet)localObject1).contains(paramString))
      {
        ab.w("MicroMsg.FingerprintInfoStorage", "alvinluo fidSet contains fid %s: %b", new Object[] { paramString, Boolean.FALSE });
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>();
        ((JSONObject)localObject1).put("fid", paramString);
        ((JSONArray)localObject2).put(localObject1);
        ab.i("MicroMsg.FingerprintInfoStorage", "alvinluo list: %s", new Object[] { ((JSONArray)localObject2).toString() });
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTi, ((JSONArray)localObject2).toString());
        com.tencent.mm.kernel.g.RP().Ry().dsb();
        AppMethodBeat.o(51454);
        return bool;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FingerprintInfoStorage", paramString, "", new Object[0]);
        AppMethodBeat.o(51454);
        bool = false;
      }
    }
  }

  public static boolean adp(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(51455);
    Object localObject = cTl();
    ab.i("MicroMsg.FingerprintInfoStorage", "alvinluo fid: %s, fidInfoList: %s", new Object[] { paramString, localObject });
    localObject = G(adn((String)localObject));
    if ((localObject != null) && (((HashSet)localObject).contains(paramString)))
      AppMethodBeat.o(51455);
    while (true)
    {
      return bool;
      AppMethodBeat.o(51455);
      bool = false;
    }
  }

  private static String cTl()
  {
    AppMethodBeat.i(51453);
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTi, null);
    AppMethodBeat.o(51453);
    return str;
  }

  public static void cTm()
  {
    AppMethodBeat.i(51456);
    ab.i("MicroMsg.FingerprintInfoStorage", "alvinluo clear local fids, stack: %s", new Object[] { bo.dpG() });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTi, null);
    com.tencent.mm.kernel.g.RP().Ry().dsb();
    AppMethodBeat.o(51456);
  }

  public static boolean cTn()
  {
    AppMethodBeat.i(51457);
    boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTh, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(51457);
    return bool;
  }

  public static boolean cTo()
  {
    AppMethodBeat.i(51459);
    boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTn, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(51459);
    return bool;
  }

  public static boolean cTp()
  {
    AppMethodBeat.i(51461);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry();
    boolean bool;
    if (localObject == null)
    {
      localObject = new com.tencent.mm.plugin.walletlock.gesture.a.g();
      if (((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).tVD == -1L)
        break label152;
      com.tencent.mm.plugin.walletlock.gesture.a.e.a((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject);
      if (((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).tVE / 1000L >= 30L)
        break label119;
      ac(((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).tVD, ((com.tencent.mm.plugin.walletlock.gesture.a.g)localObject).tVE);
      bool = true;
      AppMethodBeat.o(51461);
    }
    while (true)
    {
      return bool;
      localObject = (String)((z)localObject).get(ac.a.xTl, null);
      if (localObject == null)
      {
        localObject = new com.tencent.mm.plugin.walletlock.gesture.a.g();
        break;
      }
      localObject = new com.tencent.mm.plugin.walletlock.gesture.a.g().bz(com.tencent.mm.plugin.walletlock.gesture.a.e.stringToBytes((String)localObject));
      break;
      label119: localObject = com.tencent.mm.kernel.g.RP().Ry();
      if (localObject != null)
      {
        ((z)localObject).set(ac.a.xTl, null);
        ((z)localObject).dsb();
      }
      AppMethodBeat.o(51461);
      bool = false;
      continue;
      label152: AppMethodBeat.o(51461);
      bool = false;
    }
  }

  public static void cTq()
  {
    tVb = -1L;
  }

  public static long cTr()
  {
    return tVb;
  }

  public static void lK(long paramLong)
  {
    tVb = paramLong;
  }

  public static void nu(boolean paramBoolean)
  {
    AppMethodBeat.i(51458);
    ab.i("MicroMsg.FingerprintInfoStorage", "alvinluo set fingerprint lock status isOpened: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTh, Boolean.valueOf(paramBoolean));
    com.tencent.mm.kernel.g.RP().Ry().dsb();
    AppMethodBeat.o(51458);
  }

  public static void nv(boolean paramBoolean)
  {
    AppMethodBeat.i(51460);
    ab.i("MicroMsg.FingerprintInfoStorage", "set user face id lock: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTn, Boolean.valueOf(paramBoolean));
    com.tencent.mm.kernel.g.RP().Ry().dsb();
    AppMethodBeat.o(51460);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.a
 * JD-Core Version:    0.6.2
 */