package com.tencent.mm.plugin.sns.a.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.cbd;
import com.tencent.mm.sdk.g.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class i
  implements f
{
  public static int qEA = 1800;
  public static int qEB = 43200;
  public static int qEw = 20480;
  public static int qEx = 30720;
  public static int qEy = 51200;
  public static int qEz = 60;
  private long qEC;
  private cbd qED;
  private boolean qEE;
  private long qEF;
  private int qEG;
  private int qEv;
  private Random random;

  public i()
  {
    AppMethodBeat.i(35755);
    this.qEv = 0;
    this.qEC = 0L;
    this.random = new Random(System.currentTimeMillis());
    this.qED = new cbd();
    this.qEE = false;
    this.qEF = 0L;
    this.qEG = 0;
    AppMethodBeat.o(35755);
  }

  private void cmi()
  {
    AppMethodBeat.i(35759);
    af.cns().execute(new i.3(this));
    AppMethodBeat.o(35759);
  }

  private void cmj()
  {
    AppMethodBeat.i(35760);
    af.cns().execute(new i.4(this));
    AppMethodBeat.o(35760);
  }

  public static String s(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35761);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
      ab.w("MicroMsg.SnsLogMgr", "vals is null, use '' as value");
    StringBuilder localStringBuilder;
    for (paramArrayOfObject = ""; ; paramArrayOfObject = localStringBuilder.toString())
    {
      AppMethodBeat.o(35761);
      return paramArrayOfObject;
      localStringBuilder = new StringBuilder();
      int i = paramArrayOfObject.length - 1;
      for (int j = 0; j < i; j++)
        localStringBuilder.append(String.valueOf(paramArrayOfObject[j])).append(',');
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i]));
    }
  }

  public final void cmh()
  {
    AppMethodBeat.i(35758);
    if (!af.qKD)
    {
      AppMethodBeat.o(35758);
      return;
    }
    com.tencent.mm.kernel.g.RQ();
    int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLe, Integer.valueOf(0))).intValue();
    com.tencent.mm.kernel.g.RQ();
    int j = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLd, Integer.valueOf(-1))).intValue();
    if (j <= qEB)
    {
      k = j;
      if (j >= 0);
    }
    else
    {
      k = qEA;
      j = qEz;
      k = this.random.nextInt(k - j + 1) + qEz;
    }
    if (System.currentTimeMillis() / 1000L - i > k);
    for (int k = 1; ; k = 0)
    {
      if (k != 0)
        break label159;
      cmi();
      ab.d("MicroMsg.SnsLogMgr", "pass report ");
      AppMethodBeat.o(35758);
      break;
    }
    label159: Object localObject = af.cny();
    ab.i("MicroMsg.SnsKvReportStg", " getLast ".concat(String.valueOf("select rowid from SnsReportKv order by rowid desc  limit 1")));
    localObject = ((q)localObject).fni.a("select rowid from SnsReportKv order by rowid desc  limit 1", null, 2);
    if (((Cursor)localObject).moveToFirst());
    for (k = ((Cursor)localObject).getInt(0); ; k = 0)
    {
      ((Cursor)localObject).close();
      this.qEv = k;
      cmj();
      cmi();
      AppMethodBeat.o(35758);
      break;
    }
  }

  public final void e(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35757);
    af.cns().execute(new i.1(this, paramInt, paramArrayOfObject));
    if (this.qEE)
      AppMethodBeat.o(35757);
    while (true)
    {
      return;
      this.qEE = true;
      af.cns().p(new i.2(this), 2000L);
      AppMethodBeat.o(35757);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(35762);
    if ((paramm.getType() == 1802) && ((paramm instanceof e)))
    {
      paramString = (e)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLe, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
        cmj();
        AppMethodBeat.o(35762);
      }
    }
    while (true)
    {
      return;
      Object localObject = paramString.iKa;
      paramm = af.cny();
      paramString = new cbd();
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (axc)localIterator.next();
        paramString.vDW.add(localObject);
      }
      paramm.a(paramString);
      AppMethodBeat.o(35762);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(35756);
    qEw = com.tencent.mm.m.g.Nu().getInt("MMUxAdLog2GSendSize", 20480);
    qEx = com.tencent.mm.m.g.Nu().getInt("MMUxAdLog3GSendSize", 30720);
    qEy = com.tencent.mm.m.g.Nu().getInt("MMUxAdLogWifiSendSize", 51200);
    qEz = com.tencent.mm.m.g.Nu().getInt("MMUxAdLogMinRandTime", 60);
    qEA = com.tencent.mm.m.g.Nu().getInt("MMUxAdLogMaxRandTime", 1800);
    qEB = com.tencent.mm.m.g.Nu().getInt("MMUxAdLogMaxExceptionTime", 43200);
    ab.i("MicroMsg.SnsLogMgr", "init " + qEw + ";" + qEx + ";" + qEy + ";" + qEz + ";" + qEA + ";" + qEB);
    if (qEA - qEz < 0)
      qEA = qEz;
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1802, this);
    AppMethodBeat.o(35756);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.i
 * JD-Core Version:    0.6.2
 */