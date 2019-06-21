package com.tencent.mm.plugin.voip_cs.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.protocal.protobuf.coy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
{
  public static int MOBILE_NETWORK_DISCONNECT = 2;
  public static int tcM = 0;
  public static int tcN = 1;
  public int channelStrategy;
  public int cpuFlag0;
  public int dataType;
  public String deviceModel;
  public int networkType;
  public long nwv;
  public long nxM;
  public String nxV;
  public String nxW;
  public int sTX;
  public int sUl;
  public int sUq;
  public int sUr;
  public int sUs;
  public int sVG;
  public int tcO;
  public int tcP;
  public int tcQ;
  public int tcR;
  public int tcS;
  public int tcT;
  public int tcU;
  public int tcV;
  public int tcW;
  public int tcX;
  public int tcY;
  public int tcZ;
  public int tdA;
  public int tdB;
  public int tdC;
  public int tdD;
  public int tdE;
  public long tda;
  public String tdb;
  public int tdc;
  public int tdd;
  public int tde;
  public int tdf;
  public int tdg;
  public int tdh;
  public int tdi;
  public int tdj;
  public int tdk;
  public int tdl;
  public int tdm;
  public long tdn;
  public int tdo;
  public long tdp;
  public long tdq;
  public long tdr;
  public int tds;
  public int tdt;
  public int tdu;
  public int tdv;
  public String tdw;
  public String tdx;
  public String tdy;
  public int tdz;
  public int videoFps;

  public d()
  {
    AppMethodBeat.i(135297);
    this.dataType = 0;
    this.tcO = 0;
    this.tcP = 0;
    this.tcQ = 0;
    this.videoFps = 0;
    this.tcR = 0;
    this.tcS = 0;
    this.tcT = 0;
    this.tcU = 0;
    this.tcV = 0;
    this.tcW = 0;
    this.networkType = 0;
    this.tcX = 0;
    this.tcZ = 0;
    this.sUl = 0;
    this.tda = 0L;
    this.nwv = 0L;
    this.tdb = "";
    this.sTX = 0;
    this.tdd = 0;
    this.tde = 0;
    this.tdf = 0;
    this.tdg = 0;
    this.sUr = 0;
    this.sUq = 0;
    this.tdh = 0;
    this.tdi = 1;
    this.tdj = 0;
    this.tdk = 0;
    this.tdl = 0;
    this.tdm = 0;
    this.tdn = 0L;
    this.tdp = 0L;
    this.tdq = 0L;
    this.tdr = 0L;
    this.nxM = 0L;
    this.channelStrategy = 1;
    this.sVG = 0;
    this.sUs = 0;
    this.tdu = -1;
    this.tdv = 0;
    this.tdw = "";
    this.deviceModel = "";
    this.tdx = "";
    this.tdy = "";
    this.tdz = 0;
    this.tdA = 0;
    this.tdB = 0;
    this.tdC = 0;
    this.tdD = 0;
    this.tdE = 0;
    this.cpuFlag0 = m.Lw();
    this.nxW = "";
    this.nxV = "";
    this.tdw = Build.MANUFACTURER;
    if (this.tdw.contains(","))
      this.tdw = this.tdw.replace(',', ' ');
    this.deviceModel = Build.MODEL;
    if (this.deviceModel.contains(","))
      this.deviceModel = this.deviceModel.replace(',', ' ');
    this.tdx = Build.VERSION.SDK;
    if (this.tdx.contains(","))
      this.tdx = this.tdx.replace(',', ' ');
    this.tdy = Build.VERSION.RELEASE;
    if (this.tdy.contains(","))
      this.tdy = this.tdy.replace(',', ' ');
    AppMethodBeat.o(135297);
  }

  public static int cMk()
  {
    AppMethodBeat.i(135302);
    try
    {
      Object localObject = (ConnectivityManager)ah.getContext().getSystemService("connectivity");
      if (localObject != null)
      {
        localObject = ((ConnectivityManager)localObject).getNetworkInfo(0);
        if (localObject == null)
        {
          i = tcM;
          AppMethodBeat.o(135302);
        }
        while (true)
        {
          return i;
          if (((NetworkInfo)localObject).getState() == NetworkInfo.State.CONNECTED)
          {
            i = tcN;
            AppMethodBeat.o(135302);
          }
          else
          {
            i = MOBILE_NETWORK_DISCONNECT;
            AppMethodBeat.o(135302);
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.VoipCSReportHelper", "isMobileNetworkAvailable fail!");
        int i = tcM;
        AppMethodBeat.o(135302);
      }
    }
  }

  public static int getNetType(Context paramContext)
  {
    AppMethodBeat.i(135303);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(135303);
        i = 0;
      }
      while (true)
      {
        return i;
        i = paramContext.getType();
        if (i == 1)
        {
          AppMethodBeat.o(135303);
          i = 1;
        }
        else
        {
          i = paramContext.getType();
          if (i != 0)
          {
            AppMethodBeat.o(135303);
            i = 0;
          }
          else
          {
            i = paramContext.getSubtype();
            if (i == 1)
            {
              AppMethodBeat.o(135303);
              i = 2;
            }
            else
            {
              i = paramContext.getSubtype();
              if (i == 2)
              {
                AppMethodBeat.o(135303);
                i = 2;
              }
              else
              {
                i = paramContext.getSubtype();
                if (i == 13)
                {
                  i = 4;
                  AppMethodBeat.o(135303);
                }
                else
                {
                  if ((paramContext.getSubtype() < 3) || (paramContext.getSubtype() >= 13))
                  {
                    i = paramContext.getSubtype();
                    if (i <= 13);
                  }
                  else
                  {
                    i = 3;
                    AppMethodBeat.o(135303);
                    continue;
                  }
                  AppMethodBeat.o(135303);
                  i = 2;
                }
              }
            }
          }
        }
      }
    }
    catch (NullPointerException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VoipCSReportHelper", paramContext, "", new Object[0]);
        AppMethodBeat.o(135303);
        int i = 0;
      }
    }
  }

  public final void GW(int paramInt)
  {
    AppMethodBeat.i(135298);
    this.sUq = Math.abs(paramInt);
    AppMethodBeat.o(135298);
  }

  public final void cMh()
  {
    AppMethodBeat.i(135299);
    ab.d("MicroMsg.VoipCSReportHelper", "markEndTalk");
    if ((this.tdD == 0) && (this.tdC != 0))
    {
      this.tdD = ((int)(System.currentTimeMillis() / 1000L));
      this.nxM = (this.tdD - this.tdC);
    }
    AppMethodBeat.o(135299);
  }

  public final void cMi()
  {
    AppMethodBeat.i(135300);
    ab.d("MicroMsg.VoipCSReportHelper", "markUserAccept");
    if (this.tdp == 0L)
    {
      this.tdB = ((int)(System.currentTimeMillis() / 1000L));
      this.tdp = (this.tdB - this.tdz);
    }
    AppMethodBeat.o(135300);
  }

  public final coy cMj()
  {
    AppMethodBeat.i(135301);
    coy localcoy = new coy();
    localcoy.jCt = 2;
    localcoy.xmI = this.nxV;
    ab.i("MicroMsg.VoipCSReportHelper", "getVoipCSEngineReportData, result: %s", new Object[] { localcoy.xmI });
    String[] arrayOfString = this.nxV.split(",");
    if ((arrayOfString != null) && (arrayOfString.length > 0));
    try
    {
      this.videoFps = bo.getInt(arrayOfString[8], 0);
      this.tcR = bo.getInt(arrayOfString[10], 0);
      AppMethodBeat.o(135301);
      return localcoy;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.VoipCSReportHelper", "get videoFps and rate fail!!");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.d
 * JD-Core Version:    0.6.2
 */