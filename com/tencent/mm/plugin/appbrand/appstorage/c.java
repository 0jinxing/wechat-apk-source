package com.tencent.mm.plugin.appbrand.appstorage;

import a.f.b.j;
import a.l;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ai;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandKVStorageTransfer;", "Lcom/tencent/mm/model/IDataTransfer;", "appid", "", "(Ljava/lang/String;)V", "mAppId", "clearOldSchemeData", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getTag", "markHadTransferToMMKV", "needTransfer", "", "sVer", "", "transfer", "transferToMMKV", "Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandKVStorageTransfer$Result;", "storageId", "Companion", "Result", "plugin-appbrand-integration_release"})
public final class c extends ai
{
  public static final a gXe;
  private final String mAppId;

  static
  {
    AppMethodBeat.i(134486);
    gXe = new a((byte)0);
    AppMethodBeat.o(134486);
  }

  public c(String paramString)
  {
    AppMethodBeat.i(134485);
    this.mAppId = paramString;
    AppMethodBeat.o(134485);
  }

  private final void b(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(134483);
    if (paramSharedPreferences.getBoolean("keyHadCleanOldScheme" + this.mAppId, false))
    {
      ab.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] had clear old scheme data, return");
      AppMethodBeat.o(134483);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] clear old scheme data");
      com.tencent.mm.plugin.appbrand.app.f.xG().xR(this.mAppId);
      paramSharedPreferences.edit().putBoolean("keyHadCleanOldScheme" + this.mAppId, true).apply();
      AppMethodBeat.o(134483);
    }
  }

  private final c.b nv(int paramInt)
  {
    AppMethodBeat.i(134482);
    Object localObject1 = com.tencent.mm.plugin.appbrand.app.f.xG().G(paramInt, this.mAppId)[0];
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof ArrayList))
      localObject2 = null;
    ArrayList localArrayList = (ArrayList)localObject2;
    if (localArrayList == null)
    {
      localObject2 = new c.b(0L, 0L, 0);
      AppMethodBeat.o(134482);
    }
    while (true)
    {
      return localObject2;
      if (localArrayList.size() != 0)
        break;
      localObject2 = new c.b(0L, 0L, 0);
      AppMethodBeat.o(134482);
    }
    ab.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] key size = " + localArrayList.size());
    long l1 = 0L;
    long l2 = 0L;
    Iterator localIterator = ((Iterable)localArrayList).iterator();
    label129: if (localIterator.hasNext())
    {
      localObject1 = localIterator.next();
      localObject2 = localObject1;
      if (!(localObject1 instanceof String))
        localObject2 = null;
      localObject2 = (String)localObject2;
      if (localObject2 != null)
        break label346;
      localObject2 = "";
    }
    label346: 
    while (true)
    {
      long l3 = System.currentTimeMillis();
      Object localObject3 = com.tencent.mm.plugin.appbrand.app.f.xG().k(paramInt, this.mAppId, (String)localObject2);
      j.o(localObject3, "SubCoreAppBrand.getAppKV…t(storageId, mAppId, key)");
      long l4 = System.currentTimeMillis();
      localObject1 = localObject3[1];
      Object localObject4 = localObject3[2];
      long l5 = l2;
      if ((j.j(localObject2, "") ^ true))
      {
        l5 = l2;
        if (localObject3[0] == n.a.gXV)
        {
          l5 = l2;
          if ((localObject1 instanceof String))
          {
            l5 = l2;
            if ((localObject4 instanceof String))
            {
              l5 = System.currentTimeMillis();
              localObject3 = f.gXv;
              f.b(paramInt, this.mAppId, (String)localObject2, (String)localObject1, (String)localObject4);
              l5 = l2 + (System.currentTimeMillis() - l5);
            }
          }
        }
      }
      l1 = l4 - l3 + l1;
      l2 = l5;
      break label129;
      localObject2 = new c.b(l1, l2, localArrayList.size());
      AppMethodBeat.o(134482);
      break;
    }
  }

  public final String getTag()
  {
    return "MicroMsg.AppBrandKVStorageTransfer";
  }

  public final boolean kw(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(134484);
    if (!ah.doB().getBoolean("keyHadFinishTransfer" + this.mAppId, false))
      bool = true;
    ab.i("MicroMsg.AppBrandKVStorageTransfer", "needTransfer ".concat(String.valueOf(bool)));
    AppMethodBeat.o(134484);
    return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(134481);
    if (!d.gXk.awK())
    {
      ab.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] isNeedTransfer = false");
      AppMethodBeat.o(134481);
    }
    while (true)
    {
      return;
      Object localObject1 = ah.doB();
      if (d.gXk.awI())
      {
        ab.i("MicroMsg.AppBrandKVStorageTransfer", "rollback phases, clear [had transfer to mmkv] flag");
        ((SharedPreferences)localObject1).edit().putBoolean("hadTransferToMMKV" + this.mAppId, false).apply();
        localObject1 = f.gXv;
        f.xR(this.mAppId);
        AppMethodBeat.o(134481);
      }
      else
      {
        boolean bool = ((SharedPreferences)localObject1).getBoolean("hadTransferToMMKV" + this.mAppId, false);
        if ((bool) && (d.gXk.awH()))
        {
          j.o(localObject1, "sharedPreferences");
          b((SharedPreferences)localObject1);
          ((SharedPreferences)localObject1).edit().putBoolean("keyHadFinishTransfer" + this.mAppId, true).apply();
          AppMethodBeat.o(134481);
        }
        else if (bool)
        {
          ab.i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] had transfer to mmkv, return");
          AppMethodBeat.o(134481);
        }
        else
        {
          ab.i("MicroMsg.AppBrandKVStorageTransfer", "start transfer");
          long l1 = 0L;
          long l2 = 0L;
          paramInt = 0;
          long l3 = System.currentTimeMillis();
          ab.i("MicroMsg.AppBrandKVStorageTransfer", "clear MMKV");
          Object localObject2 = f.gXv;
          f.xR(this.mAppId);
          localObject2 = com.tencent.mm.plugin.appbrand.app.f.xG().xS(this.mAppId);
          j.o(localObject2, "SubCoreAppBrand.getAppKV…).getAllStorageId(mAppId)");
          int i = com.tencent.mm.plugin.appbrand.app.f.xG().xT(this.mAppId);
          int j = localObject2.length;
          for (int k = 0; k < j; k++)
          {
            localObject3 = nv(localObject2[k]);
            long l4 = ((c.b)localObject3).gXf;
            l5 = ((c.b)localObject3).gXg;
            int m = ((c.b)localObject3).size;
            l1 += l4;
            l2 += l5;
            paramInt += m;
          }
          long l5 = System.currentTimeMillis();
          ab.i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, cost total time= " + (l5 - l3) + " ms read time = " + l1 + " ms, write time = " + l2 + " ms");
          localObject2 = f.gXv;
          k = f.xT(this.mAppId);
          localObject2 = f.gXv;
          j = f.yc(this.mAppId);
          ab.i("MicroMsg.AppBrandKVStorageTransfer", "newbytes =" + k + " oldbytes =" + i + "  newsize =" + j + "  oldsize =" + paramInt + ' ');
          if (j != paramInt)
          {
            localObject2 = new IllegalStateException("tansfer failed ");
            if ((com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (com.tencent.mm.sdk.platformtools.f.DEBUG))
            {
              localObject1 = (Throwable)localObject2;
              AppMethodBeat.o(134481);
              throw ((Throwable)localObject1);
            }
            ab.printErrStackTrace("MicroMsg.AppBrandKVStorageTransfer", (Throwable)localObject2, "transfer failed", new Object[0]);
          }
          ab.i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, prev ");
          localObject2 = h.pYm;
          Object localObject3 = this.mAppId;
          f localf = f.gXv;
          ((h)localObject2).e(16335, new Object[] { localObject3, Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(k), Integer.valueOf(f.yc(this.mAppId)) });
          j.o(localObject1, "sharedPreferences");
          ((SharedPreferences)localObject1).edit().putBoolean("hadTransferToMMKV" + this.mAppId, true).apply();
          if (d.gXk.awH())
          {
            b((SharedPreferences)localObject1);
            ((SharedPreferences)localObject1).edit().putBoolean("keyHadFinishTransfer" + this.mAppId, true).apply();
          }
          AppMethodBeat.o(134481);
        }
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandKVStorageTransfer$Companion;", "", "()V", "KEY_HAD_CLEAN_OLD_SCHEME", "", "KEY_HAD_FINISH_TRANSFER", "KEY_HAD_TRANSFER_TO_MMKV", "TAG", "getStorageScheme", "", "appId", "plugin-appbrand-integration_release"})
  public static final class a
  {
    public static int xV(String paramString)
    {
      AppMethodBeat.i(134479);
      j.p(paramString, "appId");
      SharedPreferences localSharedPreferences = ah.doB();
      int i;
      if (localSharedPreferences.getBoolean("keyHadFinishTransfer".concat(String.valueOf(paramString)), false))
        i = 2;
      while (true)
      {
        ab.i("MicroMsg.AppBrandKVStorageTransfer", "getStorageScheme:".concat(String.valueOf(i)));
        AppMethodBeat.o(134479);
        return i;
        if ((localSharedPreferences.getBoolean("hadTransferToMMKV".concat(String.valueOf(paramString)), false)) && (!d.gXk.awI()))
          i = 3;
        else
          i = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.c
 * JD-Core Version:    0.6.2
 */