package com.tencent.wecall.talkroom.model;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.d;
import com.tencent.pb.common.c.f;
import com.tencent.pb.common.c.g;
import java.util.ArrayList;
import java.util.List;

public class h
{
  public static h AKQ;
  static final String TAG;
  public int AKR;
  int AKS;
  long AKT;
  long AKU;
  int AKV;
  public int AKW;
  int AKX;
  long AKY;
  private int AKZ;
  private int ALa;
  private String ALb;
  private int ALc;
  private StringBuffer ALd;
  private long ALe;
  long ALf;
  long ALg;
  public String Amx;
  private String deviceModel;
  public String groupId;
  public int kyZ;
  public int netType;
  public int nwu;
  public long nwv;
  long nxK;
  int nxL;
  public int sUl;
  public int sUo;
  public int sUp;
  public int sUs;
  public int sUz;
  int tdf;
  int tdi;
  int tdm;
  long tdn;
  int tds;
  public int tdt;
  private String tdy;

  static
  {
    AppMethodBeat.i(127999);
    AKQ = new h();
    TAG = h.class.getCanonicalName();
    AppMethodBeat.o(127999);
  }

  public h()
  {
    AppMethodBeat.i(127978);
    this.groupId = "";
    this.Amx = "";
    this.sUl = 1;
    this.nwu = 0;
    this.nwv = 0L;
    this.kyZ = -1;
    this.tdf = 0;
    this.tdm = 0;
    this.tdi = 0;
    this.nxL = 0;
    this.AKR = 0;
    this.AKS = 0;
    this.AKT = 0L;
    this.AKU = 0L;
    this.AKV = 0;
    this.AKW = 0;
    this.AKX = 0;
    this.AKY = 0L;
    this.tdn = 0L;
    this.nxK = 0L;
    this.tds = 0;
    this.tdt = 0;
    this.netType = -1;
    this.ALa = -1;
    this.tdy = "";
    this.ALd = new StringBuffer();
    this.sUz = -1;
    this.sUs = 0;
    this.sUo = 0;
    this.sUp = 0;
    this.ALe = 0L;
    this.ALf = 0L;
    this.ALg = 0L;
    AppMethodBeat.o(127978);
  }

  public static void Sq(int paramInt)
  {
    AppMethodBeat.i(127989);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendNetSceneStat", Integer.valueOf(paramInt) });
    f.C(527, 3, String.valueOf(paramInt));
    AppMethodBeat.o(127989);
  }

  public static void Sr(int paramInt)
  {
    AppMethodBeat.i(127990);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendDeviceStat", Integer.valueOf(paramInt) });
    f.C(528, 3, String.valueOf(paramInt));
    AppMethodBeat.o(127990);
  }

  public static void Ss(int paramInt)
  {
    AppMethodBeat.i(127991);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendtalkRoomDialStat", Integer.valueOf(paramInt) });
    f.C(530, 3, String.valueOf(paramInt));
    AppMethodBeat.o(127991);
  }

  public static void St(int paramInt)
  {
    AppMethodBeat.i(127993);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineStat", Integer.valueOf(paramInt) });
    f.C(529, 3, String.valueOf(paramInt));
    AppMethodBeat.o(127993);
  }

  public static void a(int paramInt, long paramLong, String[] paramArrayOfString)
  {
    AppMethodBeat.i(127983);
    h localh = new h();
    localh.groupId = "";
    localh.nwu = paramInt;
    localh.nwv = paramLong;
    localh.Amx = "";
    localh.aa(paramArrayOfString);
    auO(localh.dTB());
    f.dPL();
    AppMethodBeat.o(127983);
  }

  public static void a(String paramString, int paramInt, long paramLong, String[] paramArrayOfString)
  {
    AppMethodBeat.i(127981);
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.w(TAG, new Object[] { "uploadTempReport groupId is null" });
      AppMethodBeat.o(127981);
    }
    while (true)
    {
      return;
      com.tencent.pb.common.c.c.w(TAG, new Object[] { "uploadTempReport: ", paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      h localh = new h();
      String str = paramString;
      if (paramString == null)
        str = "";
      localh.groupId = str;
      localh.nwu = paramInt;
      localh.nwv = paramLong;
      localh.aa(paramArrayOfString);
      auO(localh.dTB());
      AppMethodBeat.o(127981);
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt, long paramLong, String[] paramArrayOfString)
  {
    AppMethodBeat.i(127982);
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      com.tencent.pb.common.c.c.w(TAG, new Object[] { "uploadTempReport groupId and clientGroupId is null" });
      AppMethodBeat.o(127982);
    }
    while (true)
    {
      return;
      com.tencent.pb.common.c.c.w(TAG, new Object[] { "uploadTempReport: ", paramString1, " clientGroupId: ", paramString2, " roomid: ", Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      h localh = new h();
      String str = paramString1;
      if (paramString1 == null)
        str = "";
      localh.groupId = str;
      localh.nwu = paramInt;
      localh.nwv = paramLong;
      paramString1 = paramString2;
      if (paramString2 == null)
        paramString1 = "";
      localh.Amx = paramString1;
      localh.aa(paramArrayOfString);
      auO(localh.dTB());
      f.dPL();
      AppMethodBeat.o(127982);
    }
  }

  public static void auO(String paramString)
  {
    AppMethodBeat.i(127994);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendSummaryNetScene", paramString });
    f.C(532, 3, paramString);
    AppMethodBeat.o(127994);
  }

  public static void auP(String paramString)
  {
    AppMethodBeat.i(127995);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineRecv", paramString });
    f.C(533, 3, paramString);
    AppMethodBeat.o(127995);
  }

  public static void auQ(String paramString)
  {
    AppMethodBeat.i(127996);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendEngineSend", paramString });
    f.C(534, 3, paramString);
    AppMethodBeat.o(127996);
  }

  public static void auR(String paramString)
  {
    AppMethodBeat.i(127997);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendChannelStat", paramString });
    f.C(535, 3, paramString);
    AppMethodBeat.o(127997);
  }

  public static void dTG()
  {
    AppMethodBeat.i(127992);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "sendTalkRoomOnDialStat", Integer.valueOf(-5001) });
    f.C(531, 3, "-5001");
    AppMethodBeat.o(127992);
  }

  public final void Su(int paramInt)
  {
    AppMethodBeat.i(127998);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "stopStatus", Integer.valueOf(paramInt) });
    this.tdf = paramInt;
    AppMethodBeat.o(127998);
  }

  public final void aa(String[] paramArrayOfString)
  {
    int i = 0;
    AppMethodBeat.i(127984);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(127984);
    while (true)
    {
      return;
      if (this.ALd.length() > 900)
      {
        this.ALd.setLength(0);
        this.ALd.append("overmaxsize");
      }
      if (this.ALd.length() != 0)
        this.ALd.append("-");
      int j = paramArrayOfString.length;
      while (i < j)
      {
        String str = paramArrayOfString[i];
        this.ALd.append(str);
        this.ALd.append("|");
        i++;
      }
      AppMethodBeat.o(127984);
    }
  }

  public final String dTB()
  {
    AppMethodBeat.i(127980);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "collectInfo" });
    this.ALb = Build.MANUFACTURER;
    this.deviceModel = Build.MODEL;
    this.ALc = Build.VERSION.SDK_INT;
    this.tdy = Build.VERSION.RELEASE;
    this.netType = k.ju(d.sZj);
    this.AKZ = -1;
    this.ALa = -1;
    Object localObject = new ArrayList();
    ((List)localObject).add(this.groupId);
    ((List)localObject).add(this.Amx);
    ((List)localObject).add(Integer.valueOf(this.sUl));
    ((List)localObject).add(Integer.valueOf(this.nwu));
    ((List)localObject).add(Long.valueOf(this.nwv));
    ((List)localObject).add(Integer.valueOf(this.kyZ));
    ((List)localObject).add(Integer.valueOf(this.tdf));
    ((List)localObject).add(Integer.valueOf(this.tdm));
    ((List)localObject).add(Integer.valueOf(this.tdi));
    ((List)localObject).add(Integer.valueOf(this.nxL));
    ((List)localObject).add(Integer.valueOf(this.AKR));
    ((List)localObject).add(Integer.valueOf(this.AKS));
    ((List)localObject).add(Long.valueOf(this.AKT));
    ((List)localObject).add(Long.valueOf(this.AKU));
    ((List)localObject).add(Integer.valueOf(this.AKV));
    ((List)localObject).add(Integer.valueOf(this.AKW));
    ((List)localObject).add(Integer.valueOf(this.AKX));
    ((List)localObject).add(Long.valueOf(this.AKY));
    ((List)localObject).add(Long.valueOf(this.tdn));
    ((List)localObject).add(Long.valueOf(this.nxK));
    ((List)localObject).add(Integer.valueOf(this.tds));
    ((List)localObject).add(Integer.valueOf(this.tdt));
    ((List)localObject).add(Integer.valueOf(this.netType));
    ((List)localObject).add(Integer.valueOf(this.AKZ));
    ((List)localObject).add(Integer.valueOf(this.ALa));
    ((List)localObject).add(this.ALb);
    ((List)localObject).add(this.deviceModel);
    ((List)localObject).add(Integer.valueOf(this.ALc));
    ((List)localObject).add(this.tdy);
    ((List)localObject).add(Integer.valueOf(c.dTg().auI(this.groupId)));
    ((List)localObject).add(this.ALd.toString());
    ((List)localObject).add(Integer.valueOf(this.sUz));
    ((List)localObject).add(Integer.valueOf(this.sUs));
    ((List)localObject).add(Integer.valueOf(this.sUo));
    ((List)localObject).add(Integer.valueOf(this.sUp));
    localObject = g.a((Iterable)localObject, ",", "_");
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "logBuf: ", this.ALd.toString() });
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "statresult", localObject });
    AppMethodBeat.o(127980);
    return localObject;
  }

  public final void dTC()
  {
    AppMethodBeat.i(127985);
    this.ALe = System.currentTimeMillis();
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "beginCreateOrEnter", Long.valueOf(this.ALe) });
    AppMethodBeat.o(127985);
  }

  public final void dTD()
  {
    AppMethodBeat.i(127986);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "endCancelCreate", Long.valueOf(System.currentTimeMillis() - this.ALe), Long.valueOf(this.AKT) });
    if (this.AKT > 0L)
      AppMethodBeat.o(127986);
    while (true)
    {
      return;
      this.tdm = 1;
      if (this.ALe == 0L)
      {
        this.tdn = 0L;
        AppMethodBeat.o(127986);
      }
      else
      {
        this.tdn = (System.currentTimeMillis() - this.ALe);
        AppMethodBeat.o(127986);
      }
    }
  }

  public final void dTE()
  {
    AppMethodBeat.i(127987);
    com.tencent.pb.common.c.c.w(TAG, new Object[] { "beginCreateOrNotify" });
    this.ALf = System.currentTimeMillis();
    AppMethodBeat.o(127987);
  }

  public final void dTF()
  {
    AppMethodBeat.i(127988);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "endAnswerTime", Long.valueOf(this.ALg) });
    if (this.ALg == 0L)
    {
      this.nxK = 0L;
      AppMethodBeat.o(127988);
    }
    while (true)
    {
      return;
      this.nxK = (System.currentTimeMillis() - this.ALg);
      AppMethodBeat.o(127988);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(127979);
    com.tencent.pb.common.c.c.d(TAG, new Object[] { "reset" });
    this.ALg = 0L;
    this.ALf = 0L;
    this.ALe = 0L;
    this.groupId = "";
    this.Amx = "";
    this.sUl = 1;
    this.nwu = 0;
    this.nwv = 0L;
    this.kyZ = -1;
    this.tdf = 0;
    this.tdm = 0;
    this.tdi = 0;
    this.nxL = 0;
    this.AKR = 0;
    this.AKS = 0;
    this.AKT = 0L;
    this.AKU = 0L;
    this.AKV = 0;
    this.AKW = 0;
    this.AKX = 0;
    this.AKY = 0L;
    this.tdn = 0L;
    this.nxK = 0L;
    this.tds = 0;
    this.tdt = 0;
    this.netType = -1;
    this.AKZ = 0;
    this.ALa = 0;
    this.ALb = "";
    this.deviceModel = "";
    this.ALc = -1;
    this.tdy = "";
    this.ALd.setLength(0);
    this.sUz = -1;
    this.sUs = 0;
    this.sUo = 0;
    this.sUp = 0;
    AppMethodBeat.o(127979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.h
 * JD-Core Version:    0.6.2
 */