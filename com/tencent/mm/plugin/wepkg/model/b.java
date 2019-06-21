package com.tencent.mm.plugin.wepkg.model;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class b
{
  private static b uWJ = null;

  private long U(File paramFile)
  {
    long l1 = 0L;
    AppMethodBeat.i(63511);
    long l2;
    if (paramFile == null)
    {
      AppMethodBeat.o(63511);
      l2 = l1;
    }
    while (true)
    {
      return l2;
      long l3 = l1;
      try
      {
        if (paramFile.isDirectory())
        {
          l3 = l1;
          File[] arrayOfFile = paramFile.listFiles();
          l3 = l1;
          int i = arrayOfFile.length;
          int j = 0;
          l2 = l1;
          if (j < i)
          {
            paramFile = arrayOfFile[j];
            l3 = l1;
            if (paramFile.isFile())
              l3 = l1;
            for (l1 += paramFile.length(); ; l1 += U(paramFile))
            {
              j++;
              break;
              l3 = l1;
            }
          }
        }
        else
        {
          l2 = l1;
          l3 = l1;
          if (paramFile.isFile())
          {
            l3 = l1;
            l2 = paramFile.length();
            l2 = 0L + l2;
          }
        }
        AppMethodBeat.o(63511);
      }
      catch (Exception paramFile)
      {
        while (true)
          l2 = l3;
      }
    }
  }

  private static boolean ahP(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(63512);
    try
    {
      ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "Safe delete dir: %s", new Object[] { paramString });
      File localFile1 = new java/io/File;
      localFile1.<init>(paramString);
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      paramString = localFile1.getName() + "_temp";
      File localFile2 = new java/io/File;
      localFile2.<init>(localFile1.getParent(), paramString);
      if (localFile1.renameTo(localFile2))
      {
        e.t(localFile2);
        AppMethodBeat.o(63512);
        return bool;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "safeDeleteDir err:" + paramString.getMessage());
        AppMethodBeat.o(63512);
        bool = false;
      }
    }
  }

  public static void dQ(String paramString, int paramInt)
  {
    AppMethodBeat.i(63509);
    if (ah.bqo())
    {
      dR(paramString, paramInt);
      AppMethodBeat.o(63509);
    }
    while (true)
    {
      return;
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgSync fail. can not process on Main thread");
        AppMethodBeat.o(63509);
      }
      else
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("ipc_param_pkgid", paramString);
        localBundle.putInt("ipc_param_type", paramInt);
        com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", localBundle, b.class);
        AppMethodBeat.o(63509);
      }
    }
  }

  private static void dR(String paramString, int paramInt)
  {
    AppMethodBeat.i(63510);
    if (!ah.bqo())
    {
      ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync fail. only run on mm process");
      AppMethodBeat.o(63510);
    }
    while (true)
    {
      return;
      if (Looper.getMainLooper() != Looper.myLooper())
        break;
      ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync fail. can not process on Main thread");
      AppMethodBeat.o(63510);
    }
    ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "removeWepkgInMMSync, pkgid:[%s], type:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(63510);
      break;
      com.tencent.mm.plugin.wepkg.b.f.dgp().dgt();
      ahP(c.uWL);
      AppMethodBeat.o(63510);
      break;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(63510);
        break;
      }
      ahP(c.ahQ(paramString));
      com.tencent.mm.plugin.wepkg.b.f.dgp().ahE(paramString);
      com.tencent.mm.plugin.wepkg.b.d.dgo().ahE(paramString);
      AppMethodBeat.o(63510);
      break;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(63510);
        break;
      }
      String str = c.ahQ(paramString);
      Object localObject1 = (Bundle)com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:tools", new IPCString(paramString), b.a.class);
      if (localObject1 == null)
      {
        AppMethodBeat.o(63510);
        break;
      }
      localObject1 = ((Bundle)localObject1).getString("used_wepkg_version");
      Object localObject2 = new ArrayList();
      if (!bo.isNullOrNil((String)localObject1))
        ((List)localObject2).add(localObject1);
      t(str, (List)localObject2);
      com.tencent.mm.plugin.wepkg.b.f.dgp().ahE(paramString);
      com.tencent.mm.plugin.wepkg.b.d.dgo().ahE(paramString);
      AppMethodBeat.o(63510);
      break;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(63510);
        break;
      }
      str = c.ahQ(paramString);
      localObject1 = (Bundle)com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:tools", new IPCString(paramString), b.a.class);
      if (localObject1 == null)
      {
        AppMethodBeat.o(63510);
        break;
      }
      localObject2 = ((Bundle)localObject1).getString("used_wepkg_version");
      localObject1 = new ArrayList();
      if (!bo.isNullOrNil((String)localObject2))
        ((List)localObject1).add(localObject2);
      paramString = h.ahW(paramString);
      if (paramString != null)
        ((List)localObject1).add(paramString.version);
      t(str, (List)localObject1);
    }
  }

  public static b dgz()
  {
    try
    {
      AppMethodBeat.i(63506);
      if (uWJ == null);
      try
      {
        if (uWJ == null)
        {
          localb = new com/tencent/mm/plugin/wepkg/model/b;
          localb.<init>();
          uWJ = localb;
        }
        b localb = uWJ;
        AppMethodBeat.o(63506);
        return localb;
      }
      finally
      {
        AppMethodBeat.o(63506);
      }
    }
    finally
    {
    }
  }

  private static boolean t(String paramString, List paramList)
  {
    boolean bool = true;
    int i = 0;
    AppMethodBeat.i(63513);
    if (bo.ek(paramList))
    {
      ahP(paramString);
      AppMethodBeat.o(63513);
    }
    while (true)
    {
      return bool;
      paramString = new File(paramString);
      if ((!paramString.exists()) || (!paramString.isDirectory()))
      {
        AppMethodBeat.o(63513);
        bool = false;
      }
      else
      {
        paramString = paramString.listFiles();
        if (paramString == null)
        {
          AppMethodBeat.o(63513);
          bool = false;
        }
        else
        {
          int j = paramString.length;
          while (i < j)
          {
            Object localObject = paramString[i];
            if ((localObject != null) && (!paramList.contains(localObject.getName())))
              ahP(localObject.getAbsolutePath());
            i++;
          }
          AppMethodBeat.o(63513);
        }
      }
    }
  }

  public final void dP(String paramString, int paramInt)
  {
    AppMethodBeat.i(63508);
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      com.tencent.mm.plugin.wepkg.utils.d.aNS().aa(new b.3(this, paramString, paramInt));
      AppMethodBeat.o(63508);
    }
    while (true)
    {
      return;
      dQ(paramString, paramInt);
      AppMethodBeat.o(63508);
    }
  }

  public final void dgA()
  {
    try
    {
      AppMethodBeat.i(63507);
      al localal = com.tencent.mm.plugin.wepkg.utils.d.aNS();
      b.1 local1 = new com/tencent/mm/plugin/wepkg/model/b$1;
      local1.<init>(this);
      localal.aa(local1);
      AppMethodBeat.o(63507);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  static class b
    implements i<Bundle, Bundle>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.b
 * JD-Core Version:    0.6.2
 */