package com.tencent.mm.be;

import android.os.HandlerThread;
import android.util.Base64;
import com.tencent.map.swlocation.api.LocationUpdateListener;
import com.tencent.map.swlocation.api.ServerMessageListener;
import com.tencent.map.swlocation.api.SwEngine;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.ba.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private static final byte[] fNj;
  private static b fNk;
  private boolean fNl;
  private al fNm;
  int fNn;
  int fNo;
  int fNp;
  private int fNq;
  private c fNr;
  private List<d> fNs;
  private List<d> fNt;
  private com.tencent.mm.sdk.b.c fNu;
  private ap fNv;
  private LocationUpdateListener fNw;
  private int fNx;
  private ServerMessageListener fNy;
  private long startTime;

  static
  {
    AppMethodBeat.i(78554);
    fNj = "@wechat*weixin!!".getBytes();
    AppMethodBeat.o(78554);
  }

  public b()
  {
    AppMethodBeat.i(78535);
    this.fNl = false;
    this.startTime = 0L;
    this.fNn = 5000;
    this.fNo = 5000;
    this.fNp = 30000;
    this.fNq = 3600;
    this.fNs = new ArrayList();
    this.fNt = new ArrayList();
    this.fNu = new b.3(this);
    com.tencent.mm.kernel.g.RQ();
    this.fNv = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new b.4(this), false);
    this.fNw = new b.5(this);
    this.fNx = 0;
    this.fNy = new b.6(this);
    AppMethodBeat.o(78535);
  }

  public static b aiD()
  {
    AppMethodBeat.i(78534);
    if (fNk == null)
      fNk = new b();
    b localb = fNk;
    AppMethodBeat.o(78534);
    return localb;
  }

  private static String aiE()
  {
    AppMethodBeat.i(78536);
    String str1 = q.LK();
    com.tencent.mm.kernel.g.RN();
    Object localObject = new com.tencent.mm.a.p(com.tencent.mm.kernel.a.QF()).toString();
    str1 = str1 + "_" + (String)localObject;
    try
    {
      localObject = new com/tencent/mm/platformtools/af;
      ((af)localObject).<init>();
      byte[] arrayOfByte1 = str1.getBytes("UTF-8");
      byte[] arrayOfByte2 = fNj;
      arrayOfByte1 = Base64.encode(((af)localObject).a(arrayOfByte1, arrayOfByte1.length, arrayOfByte2), 0);
      localObject = new java/lang/String;
      ((String)localObject).<init>(arrayOfByte1, "UTF-8");
      ab.i("MicroMsg.SenseWhereHelper", "create encrypt imei[%s], original imei[%s]", new Object[] { localObject, bo.anv(str1) });
      AppMethodBeat.o(78536);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SenseWhereHelper", localException, "", new Object[0]);
        ab.e("MicroMsg.SenseWhereHelper", "create imei error: " + localException.toString());
        String str2 = "";
        AppMethodBeat.o(78536);
      }
    }
  }

  private boolean aiG()
  {
    AppMethodBeat.i(78539);
    com.tencent.mm.kernel.g.RN();
    boolean bool;
    if (new com.tencent.mm.a.p(com.tencent.mm.kernel.a.QF()).longValue() < 1000000L)
    {
      ab.i("MicroMsg.SenseWhereHelper", "it boss uin do not start sense where.");
      AppMethodBeat.o(78539);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = com.tencent.mm.m.g.Nu().getValue("AndroidSenseWhereArgs");
      if (bo.isNullOrNil((String)localObject))
      {
        ab.i("MicroMsg.SenseWhereHelper", "it has no config do not start sense where.");
        AppMethodBeat.o(78539);
        bool = false;
      }
      else
      {
        try
        {
          ab.d("MicroMsg.SenseWhereHelper", "sense where config : ".concat(String.valueOf(localObject)));
          localObject = ((String)localObject).split(";");
          int i = bo.getInt(localObject[0], 0);
          com.tencent.mm.kernel.g.RN();
          int j = i.bL(com.tencent.mm.kernel.a.QF() + 5, 100);
          if (j > i)
          {
            ab.d("MicroMsg.SenseWhereHelper", "do not start sense where.uinhash %d, percent %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
            AppMethodBeat.o(78539);
            bool = false;
          }
          else
          {
            this.fNo = bo.getInt(localObject[1], 5000);
            this.fNn = bo.getInt(localObject[2], 5000);
            this.fNp = bo.getInt(localObject[3], 30000);
            this.fNq = bo.getInt(localObject[4], 3600);
            ab.i("MicroMsg.SenseWhereHelper", "check sense where report args[%d, %d, %d, %d]", new Object[] { Integer.valueOf(this.fNo), Integer.valueOf(this.fNn), Integer.valueOf(this.fNp), Integer.valueOf(this.fNq) });
            long l = bo.fp(((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOF, Long.valueOf(0L))).longValue());
            i = this.fNq;
            if (l > i)
            {
              AppMethodBeat.o(78539);
              bool = true;
            }
            else
            {
              ab.i("MicroMsg.SenseWhereHelper", "it is not time out. diff[%d], collection interval[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(this.fNq) });
              AppMethodBeat.o(78539);
              bool = false;
            }
          }
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.SenseWhereHelper", localException, "", new Object[0]);
          ab.e("MicroMsg.SenseWhereHelper", "check sense where config error: " + localException.toString());
          ab.i("MicroMsg.SenseWhereHelper", "it default do not start sense where.");
          AppMethodBeat.o(78539);
          bool = false;
        }
      }
    }
  }

  public static void aiH()
  {
    AppMethodBeat.i(78540);
    if (bo.fp(bo.a((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOE, null), 0L)) * 1000L > 21600000L)
    {
      ab.i("MicroMsg.SenseWhereHelper", "update sense where location package list.");
      k localk = new k(36);
      com.tencent.mm.kernel.g.RO().eJo.a(localk, 0);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOE, Long.valueOf(bo.anT()));
    }
    AppMethodBeat.o(78540);
  }

  public final void a(final float paramFloat1, final float paramFloat2, final int paramInt1, final String paramString1, final String paramString2, final int paramInt2, final int paramInt3)
  {
    AppMethodBeat.i(78537);
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      com.tencent.mm.kernel.g.RN();
      if (!com.tencent.mm.kernel.a.QT());
    }
    else
    {
      AppMethodBeat.o(78537);
    }
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(78527);
          if (b.a(b.this))
          {
            ab.d("MicroMsg.SenseWhereHelper", "it is collection now, do not start sense where sdk.");
            AppMethodBeat.o(78527);
          }
          while (true)
          {
            return;
            if (!b.b(b.this))
            {
              ab.d("MicroMsg.SenseWhereHelper", "it do not start sense where sdk by config.");
              AppMethodBeat.o(78527);
            }
            else
            {
              b.aiH();
              if ((b.c(b.this).size() == 0) && (b.d(b.this).size() == 0))
                b.e(b.this);
              if (!b.a(b.this, paramInt2, paramFloat1, paramFloat2))
              {
                AppMethodBeat.o(78527);
              }
              else
              {
                ab.i("MicroMsg.SenseWhereHelper", "it begin to start sense where sdk to upload location info.[%d, %f, %f, %d]", new Object[] { Integer.valueOf(paramInt2), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt3) });
                b.a(b.this, true);
                com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOF, Long.valueOf(bo.anT()));
                com.tencent.mm.sdk.b.a.xxA.c(b.f(b.this));
                if (b.g(b.this) != null)
                  b.g(b.this).finish();
                b.h(b.this);
                b.a(b.this, bo.yz());
                b.a(b.this, new c(paramFloat1, paramFloat2, paramInt1, this.fND, paramString1, paramString2, paramInt2, paramInt3));
                SwEngine.setImei(b.aiI());
                SwEngine.creatLocationEngine(ah.getContext(), b.g(b.this));
                SwEngine.startContinousLocationUpdate(b.i(b.this), b.this.fNn, b.this.fNo, b.j(b.this), b.k(b.this));
                b.aiJ();
                b.a(b.this, b.this.fNp);
                AppMethodBeat.o(78527);
              }
            }
          }
        }
      });
      AppMethodBeat.o(78537);
    }
  }

  public final void aiF()
  {
    AppMethodBeat.i(78538);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().aa(new b.2(this));
    AppMethodBeat.o(78538);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.b
 * JD-Core Version:    0.6.2
 */