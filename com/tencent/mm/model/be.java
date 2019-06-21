package com.tencent.mm.model;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public class be
{
  private static be fmd;
  public be.b fmc;

  public static be ZV()
  {
    AppMethodBeat.i(16330);
    try
    {
      if (fmd == null)
      {
        localbe = new com/tencent/mm/model/be;
        localbe.<init>();
        fmd = localbe;
      }
      be localbe = fmd;
      AppMethodBeat.o(16330);
      return localbe;
    }
    finally
    {
      AppMethodBeat.o(16330);
    }
  }

  public static bd ZW()
  {
    bd localbd = null;
    AppMethodBeat.i(16332);
    aw.ZK();
    Object localObject = c.lK("banner");
    if (localObject == null)
      AppMethodBeat.o(16332);
    while (true)
    {
      return localbd;
      int i = ((SharedPreferences)localObject).getInt("CurrentType", -1);
      int j = ((SharedPreferences)localObject).getInt("CurrentShowType", -1);
      localObject = ((SharedPreferences)localObject).getString("CurrentData", "");
      if (i != -1)
        switch (i)
        {
        case 4:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        default:
        case 1:
        case 3:
        case 2:
          do
          {
            be.a locala;
            do
            {
              localbd = new bd(i, j, (String)localObject);
              AppMethodBeat.o(16332);
              break;
              locala = ZY();
            }
            while ((locala != be.a.fmg) && (locala != be.a.fmh) && (!g.aaK().aaI()));
            if (g.aaK().aaI())
              ab.i("MicorMsg.MainFrameBannerStorage", "has abtest case. ignore bind bind contacts banner.");
            while (true)
            {
              AppMethodBeat.o(16332);
              break;
              ab.i("MicorMsg.MainFrameBannerStorage", "already Bind the Mobile");
            }
            ab.i("MicorMsg.MainFrameBannerStorage", "avatar already existed");
            AppMethodBeat.o(16332);
            break;
          }
          while ((ZY() != be.a.fmg) && (!g.aaK().aaI()));
          if (g.aaK().aaI())
            ab.i("MicorMsg.MainFrameBannerStorage", "has abtest case. ignore bind upload contacts banner.");
          while (true)
          {
            AppMethodBeat.o(16332);
            break;
            ab.i("MicorMsg.MainFrameBannerStorage", "already upload the contacts");
          }
        case 10000:
        case 57005:
          AppMethodBeat.o(16332);
          break;
        case 11:
          AppMethodBeat.o(16332);
          break;
        }
      else
        AppMethodBeat.o(16332);
    }
  }

  private static boolean ZX()
  {
    AppMethodBeat.i(16334);
    aw.ZK();
    SharedPreferences localSharedPreferences = c.lK("banner");
    boolean bool;
    if ((localSharedPreferences != null) && (localSharedPreferences.edit().clear().commit()))
    {
      bool = true;
      AppMethodBeat.o(16334);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16334);
    }
  }

  public static be.a ZY()
  {
    AppMethodBeat.i(16338);
    try
    {
      aw.ZK();
      Object localObject1 = (String)c.Ry().get(4097, "");
      aw.ZK();
      String str = (String)c.Ry().get(6, "");
      boolean bool = r.Zc();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("isUpload ");
      ab.d("MicorMsg.MainFrameBannerStorage", bool + " stat " + r.YD());
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() > 0);
      }
      else
      {
        localObject2 = null;
      }
      if (str != null)
      {
        localObject1 = str;
        if (str.length() > 0);
      }
      else
      {
        localObject1 = null;
      }
      if ((localObject2 == null) && (localObject1 == null))
      {
        localObject2 = be.a.fme;
        AppMethodBeat.o(16338);
      }
      while (true)
      {
        return localObject2;
        if ((localObject2 != null) && (localObject1 == null))
        {
          localObject2 = be.a.fmf;
          AppMethodBeat.o(16338);
        }
        else if (bool)
        {
          localObject2 = be.a.fmg;
          AppMethodBeat.o(16338);
        }
        else
        {
          localObject2 = be.a.fmh;
          AppMethodBeat.o(16338);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        be.a locala = be.a.fme;
        AppMethodBeat.o(16338);
      }
    }
  }

  private static boolean b(bd parambd)
  {
    AppMethodBeat.i(16335);
    boolean bool = ov("HistoryInfo").contains(Integer.valueOf(parambd.type));
    AppMethodBeat.o(16335);
    return bool;
  }

  private static boolean f(String paramString, List<Integer> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(16336);
    aw.ZK();
    Object localObject = c.lK("banner");
    if (localObject == null)
      AppMethodBeat.o(16336);
    while (true)
    {
      return bool;
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putInt(paramString + "ArraySize", paramList.size());
      for (int i = 0; i < paramList.size(); i++)
        ((SharedPreferences.Editor)localObject).putInt(paramString + i, ((Integer)paramList.get(i)).intValue());
      bool = ((SharedPreferences.Editor)localObject).commit();
      AppMethodBeat.o(16336);
    }
  }

  private static List<Integer> ov(String paramString)
  {
    AppMethodBeat.i(16337);
    aw.ZK();
    SharedPreferences localSharedPreferences = c.lK("banner");
    if (localSharedPreferences == null)
    {
      paramString = null;
      AppMethodBeat.o(16337);
    }
    while (true)
    {
      return paramString;
      int i = localSharedPreferences.getInt(paramString + "ArraySize", 0);
      ArrayList localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++)
        localArrayList.add(Integer.valueOf(localSharedPreferences.getInt(paramString + j, 0)));
      AppMethodBeat.o(16337);
      paramString = localArrayList;
    }
  }

  public final boolean a(bd parambd)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(16331);
    if (parambd.type == 10000)
    {
      ZX();
      if (this.fmc != null)
        this.fmc.ZZ();
      AppMethodBeat.o(16331);
    }
    while (true)
    {
      return bool2;
      if (parambd.type == 57005)
      {
        AppMethodBeat.o(16331);
        bool2 = false;
      }
      else
      {
        aw.ZK();
        localObject = c.lK("banner");
        if (localObject != null)
          break;
        AppMethodBeat.o(16331);
        bool2 = false;
      }
    }
    Object localObject = ((SharedPreferences)localObject).edit();
    bd localbd = ZW();
    if (!b(parambd));
    for (bool2 = bool1; ; bool2 = false)
    {
      if ((localbd != null) && (localbd.showType == 2))
      {
        List localList = ov("HistoryInfo");
        if (!localList.contains(Integer.valueOf(localbd.type)))
          localList.add(Integer.valueOf(localbd.type));
        f("HistoryInfo", localList);
      }
      if (bool2)
        ((SharedPreferences.Editor)localObject).putInt("CurrentType", parambd.type).putInt("CurrentShowType", parambd.showType).putString("CurrentData", parambd.data).commit();
      if (this.fmc != null)
        this.fmc.ZZ();
      AppMethodBeat.o(16331);
      break;
    }
  }

  public final void co(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(16333);
    aw.ZK();
    Object localObject = c.lK("banner");
    if (localObject == null)
    {
      AppMethodBeat.o(16333);
      return;
    }
    localObject = ((SharedPreferences)localObject).edit();
    switch (paramInt2)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if (this.fmc != null)
        this.fmc.ZZ();
      AppMethodBeat.o(16333);
      break;
      ((SharedPreferences.Editor)localObject).remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
      continue;
      ((SharedPreferences.Editor)localObject).remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
      localObject = ov("HistoryInfo");
      if (!((List)localObject).contains(Integer.valueOf(paramInt1)))
        ((List)localObject).add(Integer.valueOf(paramInt1));
      f("HistoryInfo", (List)localObject);
      continue;
      if (paramInt1 == 3)
        ((SharedPreferences.Editor)localObject).remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.be
 * JD-Core Version:    0.6.2
 */