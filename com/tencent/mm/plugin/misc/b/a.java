package com.tencent.mm.plugin.misc.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.content.b;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements f, com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.b.c
{
  private static volatile a ore;
  private Handler mHandler;

  public a()
  {
    AppMethodBeat.i(50505);
    this.mHandler = new Handler();
    AppMethodBeat.o(50505);
  }

  public static void A(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(50510);
    try
    {
      bool = at.isMobile(ah.getContext());
      if (!bool)
        AppMethodBeat.o(50510);
      while (true)
      {
        return;
        i = b.checkSelfPermission(ah.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
        if (i != 0)
        {
          AppMethodBeat.o(50510);
        }
        else
        {
          if ((paramInt2 != 0) || (paramInt3 != 0))
            break label549;
          bool = true;
          Object localObject1 = et(ah.getContext());
          i = ((List)localObject1).size();
          if (i == 0)
          {
            AppMethodBeat.o(50510);
          }
          else
          {
            Object localObject2 = (a.a)((List)localObject1).get(0);
            Object localObject3 = ((List)localObject1).iterator();
            do
            {
              if (!((Iterator)localObject3).hasNext())
                break;
              localObject1 = (a.a)((Iterator)localObject3).next();
            }
            while (!((a.a)localObject1).bUt);
            localObject2 = localObject1;
            localObject1 = ((a.a)localObject2).org;
            String str1 = ((a.a)localObject2).orh;
            localObject3 = ((a.a)localObject2).orj;
            String str2 = ((a.a)localObject2).ori;
            String str3 = ((a.a)localObject2).type;
            int j = ((a.a)localObject2).ork;
            if (paramInt1 != 1)
              break;
            i = 3;
            ab.i("MicroMsg.NetworkOptReport", "reportCellInfo mcc[%s] mnc[%s] lac[%s] cellid[%s] netType[%s] dbm[%d] type[%d] success[%s] errType[%d] errCode[%d] cmdid[%d] reportType[%d]", new Object[] { localObject1, str1, localObject3, str2, str3, Integer.valueOf(j), Integer.valueOf(paramInt1), Boolean.valueOf(bool), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(i) });
            localObject2 = h.pYm;
            if (!bool)
              break label488;
            k = 0;
            localObject2 = h.s(new Object[] { localObject1, str1, localObject3, str2, str3, Integer.valueOf(paramInt1), Integer.valueOf(k), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(i) });
            if (!ah.bqo())
              break label520;
            if (!com.tencent.mm.plugin.report.a.c.pXd)
              break label494;
            l = i;
            bool = com.tencent.mm.plugin.report.a.c.pXe;
            e.a(15608L, l, (String)localObject2, bool, bool, false);
            AppMethodBeat.o(50510);
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool;
        int i;
        int k;
        long l;
        ab.e("MicroMsg.NetworkOptReport", "getNetType : %s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(50510);
        continue;
        if (!bool)
        {
          i = 2;
          continue;
          label488: k = 1;
          continue;
          label494: l = i;
          e.a(15608L, l, localException, false, false, false);
          AppMethodBeat.o(50510);
          continue;
          label520: h.a(15608, i, localException, false, false);
          AppMethodBeat.o(50510);
        }
        else
        {
          i = 1;
          continue;
          continue;
          label549: bool = false;
        }
      }
    }
  }

  public static a bOM()
  {
    try
    {
      AppMethodBeat.i(50506);
      if (ore == null)
      {
        locala = new com/tencent/mm/plugin/misc/b/a;
        locala.<init>();
        ore = locala;
      }
      a locala = ore;
      AppMethodBeat.o(50506);
      return locala;
    }
    finally
    {
    }
  }

  private static List<a.a> et(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(50511);
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      int i = Build.VERSION.SDK_INT;
      while (true)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        int j;
        StringBuilder localStringBuilder;
        try
        {
          paramContext = paramContext.getAllCellInfo();
          if (paramContext != null)
          {
            Iterator localIterator = paramContext.iterator();
            if (localIterator.hasNext())
            {
              localObject1 = (CellInfo)localIterator.next();
              paramContext = new com/tencent/mm/plugin/misc/b/a$a;
              paramContext.<init>();
              if (!(localObject1 instanceof CellInfoGsm))
                break label327;
              localObject2 = ((CellInfoGsm)localObject1).getCellSignalStrength();
              localObject3 = ((CellInfoGsm)localObject1).getCellIdentity();
              j = ((CellIdentityGsm)localObject3).getMnc();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              paramContext.ori = ((CellIdentityGsm)localObject3).getCid();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              paramContext.org = ((CellIdentityGsm)localObject3).getMcc();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              paramContext.orh = ((CellIdentityGsm)localObject3).getMnc();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              paramContext.orj = ((CellIdentityGsm)localObject3).getLac();
              paramContext.ork = ((CellSignalStrengthGsm)localObject2).getDbm();
              paramContext.bUt = ((CellInfo)localObject1).isRegistered();
              paramContext.type = "gsm";
              if (paramContext.orh.length() == 1)
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("0");
                paramContext.orh = paramContext.orh;
              }
              if (j == 2147483647)
                continue;
              localLinkedList.add(paramContext);
              continue;
            }
          }
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.NetworkOptReport", "loadCellInfo: Unable to obtain cell signal information: ", new Object[] { paramContext });
          AppMethodBeat.o(50511);
          return localLinkedList;
        }
        label327: if ((localObject1 instanceof CellInfoCdma))
        {
          localObject2 = ((CellInfoCdma)localObject1).getCellSignalStrength();
          localObject3 = ((CellInfoCdma)localObject1).getCellIdentity();
          j = ((CellIdentityCdma)localObject3).getSystemId();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.ori = ((CellIdentityCdma)localObject3).getBasestationId();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.orh = ((CellIdentityCdma)localObject3).getSystemId();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.orj = ((CellIdentityCdma)localObject3).getNetworkId();
          paramContext.ork = ((CellSignalStrengthCdma)localObject2).getDbm();
          paramContext.bUt = ((CellInfo)localObject1).isRegistered();
          paramContext.type = "cdma";
        }
        else if ((localObject1 instanceof CellInfoLte))
        {
          localObject3 = ((CellInfoLte)localObject1).getCellSignalStrength();
          localObject2 = ((CellInfoLte)localObject1).getCellIdentity();
          j = ((CellIdentityLte)localObject2).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.ori = ((CellIdentityLte)localObject2).getCi();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.org = ((CellIdentityLte)localObject2).getMcc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.orh = ((CellIdentityLte)localObject2).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.orj = ((CellIdentityLte)localObject2).getTac();
          paramContext.ork = ((CellSignalStrengthLte)localObject3).getDbm();
          paramContext.bUt = ((CellInfo)localObject1).isRegistered();
          paramContext.type = "lte";
        }
        else if ((i >= 18) && ((localObject1 instanceof CellInfoWcdma)))
        {
          localObject3 = ((CellInfoWcdma)localObject1).getCellSignalStrength();
          localObject2 = ((CellInfoWcdma)localObject1).getCellIdentity();
          j = ((CellIdentityWcdma)localObject2).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.ori = ((CellIdentityWcdma)localObject2).getCid();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.org = ((CellIdentityWcdma)localObject2).getMcc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.orh = ((CellIdentityWcdma)localObject2).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext.orj = ((CellIdentityWcdma)localObject2).getLac();
          paramContext.ork = ((CellSignalStrengthWcdma)localObject3).getDbm();
          paramContext.bUt = ((CellInfo)localObject1).isRegistered();
          paramContext.type = "wcdma";
        }
        else
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Unknown type of cell signal!\n ClassName: ");
          ab.i("MicroMsg.NetworkOptReport", localObject1.getClass().getSimpleName() + "\n ToString: " + ((CellInfo)localObject1).toString());
          j = 0;
        }
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(50507);
    g.Rg().a(-1, this);
    AppMethodBeat.o(50507);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(50508);
    g.Rg().b(-1, this);
    AppMethodBeat.o(50508);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(50509);
    if ((paramString != null) && (paramString.startsWith("autoauth_errmsg_")))
      AppMethodBeat.o(50509);
    while (true)
    {
      return;
      this.mHandler.post(new a.1(this, paramm, paramInt1, paramInt2));
      AppMethodBeat.o(50509);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.misc.b.a
 * JD-Core Version:    0.6.2
 */