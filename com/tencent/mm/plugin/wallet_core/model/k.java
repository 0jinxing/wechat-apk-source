package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
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
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.protocal.protobuf.biv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;

public final class k
{
  private static k.b tzk;
  private static k tzl;
  private static aw tzm = null;
  private static long tzn = 0L;
  public JSONArray tzo;

  private k()
  {
    AppMethodBeat.i(46766);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xNF, "");
    ab.i("MicroMsg.GpsReportHelper", "GpsReportHelper ".concat(String.valueOf(str)));
    if (!bo.isNullOrNil(str));
    while (true)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(str);
        this.tzo = localJSONArray;
        AppMethodBeat.o(46766);
        return;
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.GpsReportHelper", localJSONException, "", new Object[0]);
        ab.e("MicroMsg.GpsReportHelper", "parse lbs config error", new Object[] { localJSONException });
      }
      AppMethodBeat.o(46766);
    }
  }

  public static void Hp(int paramInt)
  {
    AppMethodBeat.i(46773);
    ab.i("MicroMsg.GpsReportHelper", "reflashLocationInfo ".concat(String.valueOf(paramInt)));
    tzn = System.currentTimeMillis() / 1000L;
    if (!cPz())
    {
      tzk = null;
      cPx();
      tzn = System.currentTimeMillis() / 1000L;
    }
    AppMethodBeat.o(46773);
  }

  public static biv bQO()
  {
    AppMethodBeat.i(46776);
    biv localbiv;
    if (tzm == null)
    {
      localbiv = null;
      AppMethodBeat.o(46776);
    }
    while (true)
    {
      return localbiv;
      localbiv = new biv();
      localbiv.dud = tzm.dud;
      localbiv.duc = tzm.duc;
      localbiv.latitude = tzm.latitude;
      localbiv.longitude = tzm.longitude;
      localbiv.vCE = tzm.vCE;
      localbiv.vCI = tzm.vCI;
      localbiv.vCF = tzm.vCF;
      localbiv.vCG = tzm.vCG;
      localbiv.vCH = tzm.vCH;
      AppMethodBeat.o(46776);
    }
  }

  private static boolean cPA()
  {
    AppMethodBeat.i(46778);
    boolean bool = r.cPI().cQo().cQb();
    AppMethodBeat.o(46778);
    return bool;
  }

  public static boolean cPB()
  {
    AppMethodBeat.i(46779);
    boolean bool = r.cPI().cQo().cQc();
    AppMethodBeat.o(46779);
    return bool;
  }

  public static k cPt()
  {
    AppMethodBeat.i(46767);
    if (tzl == null)
      tzl = new k();
    k localk = tzl;
    AppMethodBeat.o(46767);
    return localk;
  }

  private static String cPu()
  {
    AppMethodBeat.i(46768);
    long l = System.currentTimeMillis();
    Object localObject1 = new StringBuffer();
    try
    {
      Object localObject2 = ah.getContext();
      if (localObject2 == null)
      {
        localObject1 = "";
        AppMethodBeat.o(46768);
      }
      while (true)
      {
        return localObject1;
        localObject2 = (WifiManager)((Context)localObject2).getSystemService("wifi");
        ((WifiManager)localObject2).getConnectionInfo();
        new StringBuffer();
        new StringBuffer();
        Iterator localIterator = ((WifiManager)localObject2).getScanResults().iterator();
        int i = 0;
        if (localIterator.hasNext())
        {
          localObject2 = (ScanResult)localIterator.next();
          ((StringBuffer)localObject1).append(String.format("&scan_ssid%d=%s&scan_bssid%d=%s&sm%d=%s", new Object[] { Integer.valueOf(i), kX(((ScanResult)localObject2).SSID), Integer.valueOf(i), kX(((ScanResult)localObject2).BSSID), Integer.valueOf(i), Integer.valueOf(((ScanResult)localObject2).level) }));
          i++;
          if (i < 5)
            break;
        }
        ab.e("MicroMsg.GpsReportHelper", "RecordCostTime: readScanWifi cost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        localObject1 = ((StringBuffer)localObject1).toString();
        AppMethodBeat.o(46768);
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.GpsReportHelper", localException, "", new Object[0]);
    }
  }

  private static String cPv()
  {
    AppMethodBeat.i(46769);
    long l1 = System.currentTimeMillis();
    Object localObject1 = new HashMap();
    if (!cPB())
    {
      localObject1 = "";
      AppMethodBeat.o(46769);
    }
    while (true)
    {
      return localObject1;
      ((HashMap)localObject1).put("is_ci_permitted", "0");
      ((HashMap)localObject1).put("net_type", at.gB(ah.getContext()));
      ab.e("MicroMsg.GpsReportHelper", "RecordCostTime: readCellInfo cost 01- %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      long l2 = System.currentTimeMillis();
      l1 = l2;
      if (cPw())
      {
        ((HashMap)localObject1).put("is_ci_permitted", "1");
        ((HashMap)localObject1).put("uuid", UUID.randomUUID().toString());
        ((HashMap)localObject1).put("sample_time", System.currentTimeMillis() / 1000L);
        ((HashMap)localObject1).put("phone_brand", Build.BRAND);
        ((HashMap)localObject1).put("phone_model", Build.MODEL);
      }
      try
      {
        Object localObject3;
        if (ah.getContext().checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
          localObject2 = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
          if (localObject2 != null)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((HashMap)localObject1).put("net_subtype", ((NetworkInfo)localObject2).getSubtype());
          }
        }
        label235: ab.e("MicroMsg.GpsReportHelper", "RecordCostTime: readCellInfo cost 02- %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
        l1 = System.currentTimeMillis();
        Object localObject2 = et(ah.getContext());
        ab.e("MicroMsg.GpsReportHelper", "RecordCostTime: readCellInfo cost 03- %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        l1 = System.currentTimeMillis();
        int i = ((List)localObject2).size();
        for (int j = 0; j < i; j++)
        {
          localObject3 = (a)((List)localObject2).get(j);
          if (localObject3 != null)
          {
            ((HashMap)localObject1).put("mcc_".concat(String.valueOf(j)), ((a)localObject3).org);
            ((HashMap)localObject1).put("mnc_".concat(String.valueOf(j)), ((a)localObject3).orh);
            ((HashMap)localObject1).put("lac_".concat(String.valueOf(j)), ((a)localObject3).tzp);
            ((HashMap)localObject1).put("cell_id_".concat(String.valueOf(j)), ((a)localObject3).ori);
            ((HashMap)localObject1).put("type_".concat(String.valueOf(j)), ((a)localObject3).type);
            ((HashMap)localObject1).put("sid_".concat(String.valueOf(j)), ((a)localObject3).tzr);
            ((HashMap)localObject1).put("net_id_".concat(String.valueOf(j)), ((a)localObject3).tzs);
            ((HashMap)localObject1).put("sys_id_".concat(String.valueOf(j)), ((a)localObject3).systemId);
            ((HashMap)localObject1).put("dbm_".concat(String.valueOf(j)), ((a)localObject3).tzt);
            ((HashMap)localObject1).put("tac_".concat(String.valueOf(j)), ((a)localObject3).tzq);
            ((HashMap)localObject1).put("arfcn_".concat(String.valueOf(j)), ((a)localObject3).tzw);
            ((HashMap)localObject1).put("earfcn_".concat(String.valueOf(j)), ((a)localObject3).tzu);
            ((HashMap)localObject1).put("uarfcn_".concat(String.valueOf(j)), ((a)localObject3).tzv);
            ((HashMap)localObject1).put("dbm_".concat(String.valueOf(j)), ((a)localObject3).tzt);
          }
        }
        ((HashMap)localObject1).put("count", String.valueOf(i));
        StringBuilder localStringBuilder = new StringBuilder("");
        Iterator localIterator = ((HashMap)localObject1).keySet().iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (String)localIterator.next();
          localObject2 = (String)((HashMap)localObject1).get(localObject3);
          if (!bo.isNullOrNil((String)localObject2))
            localStringBuilder.append(String.format("&%s=%s", new Object[] { localObject3, kX((String)localObject2) }));
        }
        localObject2 = localStringBuilder.toString();
        localObject1 = localObject2;
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject1 = localObject2;
          if (((String)localObject2).indexOf("&") == 0)
            localObject1 = ((String)localObject2).substring(1);
        }
        ab.e("MicroMsg.GpsReportHelper", "RecordCostTime: readCellInfo cost 03- %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        AppMethodBeat.o(46769);
      }
      catch (Exception localException)
      {
        break label235;
      }
    }
  }

  private static boolean cPw()
  {
    boolean bool = true;
    AppMethodBeat.i(46770);
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME)))
      AppMethodBeat.o(46770);
    while (true)
    {
      return bool;
      try
      {
        int i = b.checkSelfPermission(ah.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
        if (i != 0)
          break label85;
        AppMethodBeat.o(46770);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.GpsReportHelper", "check permission exception:%s.", new Object[] { localException });
        AppMethodBeat.o(46770);
      }
      continue;
      label85: AppMethodBeat.o(46770);
      bool = false;
    }
  }

  private static void cPx()
  {
    AppMethodBeat.i(46774);
    long l = System.currentTimeMillis();
    if (cPz())
      AppMethodBeat.o(46774);
    while (true)
    {
      return;
      if ((cPA()) || (cPB()));
      try
      {
        Object localObject1 = (WifiManager)ah.getContext().getApplicationContext().getSystemService("wifi");
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((WifiManager)localObject1).getConnectionInfo().getRssi();
        localObject1 = at.gE(ah.getContext());
        String str2 = System.currentTimeMillis();
        String str3 = at.gF(ah.getContext());
        String str4 = at.gG(ah.getContext());
        localObject1 = String.format("wifissid=%s&wifibssid=%s&wifimac=%s&sm=%s&ssid_timestamp=%s", new Object[] { kX((String)localObject1), kX(str3), kX(str4), localObject2, str2 });
        localObject2 = cPu();
        localObject1 = (String)localObject1 + (String)localObject2;
        if (cPB())
        {
          localObject2 = cPv();
          gM((String)localObject1, (String)localObject2);
          ab.e("MicroMsg.GpsReportHelper", "RecordCostTime: refreshWifiAndCellInfo cost %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(46774);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.GpsReportHelper", localException, "", new Object[0]);
          String str1 = "";
          continue;
          str1 = null;
        }
      }
    }
  }

  public static aw cPy()
  {
    AppMethodBeat.i(46775);
    long l = System.currentTimeMillis() / 1000L;
    if (l - tzn > 300L)
    {
      cPx();
      tzn = l;
    }
    aw localaw = tzm;
    AppMethodBeat.o(46775);
    return localaw;
  }

  private static boolean cPz()
  {
    AppMethodBeat.i(46777);
    boolean bool = r.cPI().cQo().adL();
    AppMethodBeat.o(46777);
    return bool;
  }

  private static List<a> et(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(46780);
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      int i = Build.VERSION.SDK_INT;
      while (true)
      {
        a locala;
        Object localObject2;
        StringBuilder localStringBuilder;
        try
        {
          paramContext = localTelephonyManager.getAllCellInfo();
          if (paramContext != null)
          {
            Iterator localIterator = paramContext.iterator();
            if (localIterator.hasNext())
            {
              paramContext = (CellInfo)localIterator.next();
              locala = new com/tencent/mm/plugin/wallet_core/model/k$a;
              locala.<init>();
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              locala.iBz = localTelephonyManager.getNetworkType();
              if (!(paramContext instanceof CellInfoGsm))
                break label384;
              localObject2 = ((CellInfoGsm)paramContext).getCellSignalStrength();
              localObject1 = ((CellInfoGsm)paramContext).getCellIdentity();
              j = ((CellIdentityGsm)localObject1).getMnc();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              locala.ori = ((CellIdentityGsm)localObject1).getCid();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              locala.org = ((CellIdentityGsm)localObject1).getMcc();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              locala.orh = ((CellIdentityGsm)localObject1).getMnc();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              locala.tzp = ((CellIdentityGsm)localObject1).getLac();
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              locala.tzt = ((CellSignalStrengthGsm)localObject2).getDbm();
              if (!paramContext.isRegistered())
                break label377;
              paramContext = "1";
              locala.tzx = paramContext;
              if (Build.VERSION.SDK_INT >= 24)
              {
                paramContext = new java/lang/StringBuilder;
                paramContext.<init>();
                locala.tzw = ((CellIdentityGsm)localObject1).getArfcn();
              }
              if (j == 2147483647)
                continue;
              localLinkedList.add(locala);
              continue;
            }
          }
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.GpsReportHelper", "loadCellInfo: Unable to obtain cell signal information: ", new Object[] { paramContext });
          AppMethodBeat.o(46780);
          return localLinkedList;
        }
        label377: paramContext = "0";
        continue;
        label384: if ((paramContext instanceof CellInfoCdma))
        {
          localObject1 = ((CellInfoCdma)paramContext).getCellSignalStrength();
          localObject2 = ((CellInfoCdma)paramContext).getCellIdentity();
          j = ((CellIdentityCdma)localObject2).getSystemId();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.ori = ((CellIdentityCdma)localObject2).getBasestationId();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.orh = ((CellIdentityCdma)localObject2).getSystemId();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.tzp = ((CellIdentityCdma)localObject2).getNetworkId();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          locala.tzt = ((CellSignalStrengthCdma)localObject1).getDbm();
          if (paramContext.isRegistered());
          for (paramContext = "1"; ; paramContext = "0")
          {
            locala.tzx = paramContext;
            break;
          }
        }
        if ((paramContext instanceof CellInfoLte))
        {
          localObject2 = ((CellInfoLte)paramContext).getCellSignalStrength();
          localObject1 = ((CellInfoLte)paramContext).getCellIdentity();
          j = ((CellIdentityLte)localObject1).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.ori = ((CellIdentityLte)localObject1).getCi();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.org = ((CellIdentityLte)localObject1).getMcc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.orh = ((CellIdentityLte)localObject1).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.tzq = ((CellIdentityLte)localObject1).getTac();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.tzt = ((CellSignalStrengthLte)localObject2).getDbm();
          if (paramContext.isRegistered());
          for (paramContext = "1"; ; paramContext = "0")
          {
            locala.tzx = paramContext;
            if (Build.VERSION.SDK_INT >= 24)
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>();
              locala.tzu = ((CellIdentityLte)localObject1).getEarfcn();
            }
            break;
          }
        }
        if ((i >= 18) && ((paramContext instanceof CellInfoWcdma)))
        {
          localObject2 = ((CellInfoWcdma)paramContext).getCellSignalStrength();
          localObject1 = ((CellInfoWcdma)paramContext).getCellIdentity();
          j = ((CellIdentityWcdma)localObject1).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.ori = ((CellIdentityWcdma)localObject1).getCid();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.org = ((CellIdentityWcdma)localObject1).getMcc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.orh = ((CellIdentityWcdma)localObject1).getMnc();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.tzp = ((CellIdentityWcdma)localObject1).getLac();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          locala.tzt = ((CellSignalStrengthWcdma)localObject2).getDbm();
          if (paramContext.isRegistered());
          for (paramContext = "1"; ; paramContext = "0")
          {
            locala.tzx = paramContext;
            if (Build.VERSION.SDK_INT >= 24)
            {
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>();
              locala.tzv = ((CellIdentityWcdma)localObject1).getUarfcn();
            }
            break;
          }
        }
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Unknown type of cell signal!\n ClassName: ");
        ab.i("MicroMsg.GpsReportHelper", paramContext.getClass().getSimpleName() + "\n ToString: " + paramContext.toString());
        int j = 0;
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  private static void gM(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46772);
    if (tzm == null)
      tzm = new aw();
    ab.d("MicroMsg.GpsReportHelper", "encrypt data userInfo:%s, cellInfo:%s", new Object[] { paramString1, paramString2 });
    byte[] arrayOfByte1 = new byte[16];
    byte[] arrayOfByte2 = w.dNR().getBytes();
    if (arrayOfByte2 != null)
    {
      localObject = arrayOfByte2;
      if (arrayOfByte2.length > 0);
    }
    else
    {
      localObject = System.currentTimeMillis().getBytes();
    }
    int i = 0;
    int j = 0;
    int k;
    do
    {
      arrayOfByte1[j] = ((byte)localObject[i]);
      k = j + 1;
      i++;
      j = i;
      if (i >= localObject.length)
        j = 0;
      i = j;
      j = k;
    }
    while (k < 16);
    arrayOfByte2 = Base64.encode(arrayOfByte1, 0);
    Object localObject = tzm;
    if (o.tzz == null)
      o.tzz = new o();
    ((aw)localObject).vCI = o.tzz.bw(arrayOfByte2);
    ab.d("MicroMsg.GpsReportHelper", "encryptReportData mLocationInfo.encrypt_key %s", new Object[] { tzm.vCI });
    if (!bo.isNullOrNil(paramString1))
    {
      paramString1 = Base64.encode(AesEcb.aesCryptEcb(paramString1.getBytes(), arrayOfByte1, true, true), 0);
      tzm.vCH = new String(paramString1);
      ab.d("MicroMsg.GpsReportHelper", "encryptReportData mLocationInfo.encrypt_userinfo %s", new Object[] { new String(paramString1) });
    }
    if (!bo.isNullOrNil(paramString2))
    {
      paramString1 = Base64.encode(AesEcb.aesCryptEcb(paramString2.getBytes(), arrayOfByte1, true, true), 0);
      tzm.vCJ = new String(paramString1);
      ab.d("MicroMsg.GpsReportHelper", "encryptReportData mLocationInfo.encrypt_cellinfo %s", new Object[] { new String(paramString1) });
    }
    AppMethodBeat.o(46772);
  }

  private static String kX(String paramString)
  {
    AppMethodBeat.i(46771);
    try
    {
      String str = q.encode(paramString, "UTF-8");
      paramString = str;
      AppMethodBeat.o(46771);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.GpsReportHelper", localException, "", new Object[0]);
    }
  }

  public static final class a
  {
    public String iBz;
    public String org;
    public String orh;
    public String ori;
    public String systemId;
    public String type;
    public String tzp;
    public String tzq;
    public String tzr;
    public String tzs;
    public String tzt;
    public String tzu;
    public String tzv;
    public String tzw;
    public String tzx;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.k
 * JD-Core Version:    0.6.2
 */