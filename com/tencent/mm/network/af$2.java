package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.protocal.h;
import com.tencent.mm.protocal.i;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class af$2
  implements Runnable
{
  af$2(af paramaf, int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(58697);
    z localz = aa.anp();
    int i = this.gey;
    int j = this.crc;
    int k = this.crd;
    int m;
    label88: int n;
    label166: int i1;
    r localr;
    l locall;
    long l;
    synchronized (localz.gdP)
    {
      m = localz.mD(i);
      if (-1 == m)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MMNativeNetTaskAdapter", "mmcgi onGYNetEnd GET FROM QUEUE failed. native:[%d,%d] taskId:%d ", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i) });
        AppMethodBeat.o(58697);
        return;
      }
      n = 0;
      switch (j)
      {
      default:
        com.tencent.mm.sdk.platformtools.ab.f("MicroMsg.MMNativeNetTaskAdapter", "c2JavaErrorType not exits c_errType:%d", new Object[] { Integer.valueOf(j) });
        if (n == 0)
          k = 0;
        if (n == 3)
          k = -1;
        i1 = n;
        j = k;
        if (!aa.ank().geh)
        {
          i1 = n;
          j = k;
          if (n == 1)
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMNativeNetTaskAdapter", "network not available");
            i1 = 2;
            j = -1;
          }
        }
        localr = localz.gdP[m].gdT;
        locall = localz.gdP[m].gdU;
        l = localz.gdP[m].startTime;
        localz.gdP[m] = null;
        if (i1 == 0)
          n = i1;
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
    }
    while (true)
    {
      try
      {
        if (!z.mB(localr.getType()))
        {
          n = i1;
          if (localr.adu().ady() != 0)
          {
            n = 4;
            i1 = localr.adu().ady();
            j = 4;
            n = i1;
          }
        }
      }
      catch (RemoteException localRemoteException4)
      {
        try
        {
          t localt;
          byte[] arrayOfByte;
          i locali;
          while (true)
          {
            i1 = localr.getType();
            try
            {
              while (true)
              {
                localt = aa.ano();
                arrayOfByte = localr.adu().ada();
                try
                {
                  Object localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>("summerauth onGYNetEnd threadId: 0 errType: ");
                  com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MMAutoAuth", j + " errCode: " + n + " errMsg: " + null + " rr: " + localr + " type: " + localr.getType() + " netIdGetCertBeforeAutoAuth: " + localt.gcY);
                  if (n != 0)
                    localt.gcP += 1;
                  while (true)
                  {
                    while (true)
                    {
                      locali = localr.adu();
                      k = localr.getType();
                      switch (k)
                      {
                      default:
                        k = localr.acO();
                        i2 = n;
                        n = i1;
                        i1 = i2;
                        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi onTaskEnd type:%d time:%d hash[%d,%d] [%d,%d]", new Object[] { Integer.valueOf(n), Long.valueOf(bo.gb(l)), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i1) });
                        if ((4 == j) && ((-1 == i1) || (-2 == i1) || (-24 == i1) || (-34 == i1)))
                          aa.anm().post(new z.1(localz, n, i1));
                        try
                        {
                          localObject1 = localr.adu().adx();
                          if ((localObject1 == null) || (((String)localObject1).length() <= 0))
                            break label2170;
                          locall.a(m, j, i1, (String)localObject1, localr, localr.adu().ada());
                          AppMethodBeat.o(58697);
                        }
                        catch (Exception localException)
                        {
                          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MMNativeNetTaskAdapter", "onGYNetEnd cb %s", new Object[] { localException.getMessage() });
                          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", new Object[] { bo.l(localException), Integer.valueOf(i) });
                          AppMethodBeat.o(58697);
                        }
                      case 126:
                      case 252:
                      case 701:
                      case 702:
                      case 763:
                      case 381:
                      }
                    }
                    break;
                    n = 0;
                    break label166;
                    n = 2;
                    break label166;
                    n = 2;
                    break label166;
                    n = 1;
                    break label166;
                    n = 1;
                    break label166;
                    n = 1;
                    break label166;
                    n = 1;
                    break label166;
                    if ((-3002 == k) || (-3003 == k))
                    {
                      n = 4;
                      break label166;
                    }
                    if (-10001 == k)
                    {
                      n = 6;
                      break label166;
                    }
                    n = 5;
                    break label166;
                    n = 4;
                    break label166;
                    n = 1;
                    break label166;
                    if (localr.getType() != 10)
                      localt.gcP = 0;
                  }
                }
                catch (RemoteException localRemoteException1)
                {
                  while (true)
                    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MMAutoAuth", "exception:%s", new Object[] { bo.l(localRemoteException1) });
                }
              }
            }
            catch (RemoteException localRemoteException2)
            {
              k = i1;
              i1 = j;
              j = n;
              n = k;
            }
          }
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s taskid:%d", new Object[] { bo.l(localRemoteException2), Integer.valueOf(i) });
          k = 0;
          i2 = j;
          j = i1;
          i1 = i2;
          continue;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMAutoAuth", "summerauth end type: %d, ret:[%d,%d][%s]", new Object[] { Integer.valueOf(localr.getType()), Integer.valueOf(j), Integer.valueOf(n), null });
          if ((locali.ady() != 0) || (j != 0) || (n != 0))
            if (localr.getType() == 126)
            {
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("net.end: reg err: type=");
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MMAutoAuth", localr.getType() + " err=" + j + "," + n + " errmsg=" + null);
              continue;
              localObject2 = finally;
              AppMethodBeat.o(58697);
              throw localObject2;
            }
          switch (n)
          {
          default:
            break;
          case -213:
          case -205:
          case -100:
            ah.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
            if (n == -213)
            {
              e.pXa.a(148L, 31L, 1L, false);
              continue;
            }
            if (n == -100)
            {
              e.pXa.a(148L, 32L, 1L, false);
              continue;
            }
            if (n != -205)
              continue;
            e.pXa.a(148L, 33L, 1L, false);
            continue;
            k = localr.adv();
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMAutoAuth", "summerauth accinfo doAuthEnd type:%d, ret:%d loginDecodeFailedTry:%d", new Object[] { Integer.valueOf(localr.getType()), Integer.valueOf(k), Integer.valueOf(localt.fPj) });
            Object localObject3;
            Object localObject4;
            if (k == 2)
            {
              if ((localr.getType() != 702) && (localr.getType() != 763))
                continue;
              e.pXa.a(148L, 34L, 1L, false);
              localt.fPj += 1;
              if (localt.fPj > 1)
              {
                com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MMAutoAuth", "summerauth loginDecodeFailedTry beyond 1 no more try!");
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>("auth_decode_failed_");
                localt.h(j, n, bo.bc(null, ""));
                continue;
              }
              try
              {
                k = locali.QF();
                localObject3 = locali.adz();
                if (bo.cb((byte[])localObject3))
                {
                  localObject3 = "";
                  if (!bo.cb(arrayOfByte))
                    continue;
                  String str = "";
                  if (!localt.g((String)localObject3, str, k))
                    continue;
                  localt.gcU.cPB = arrayOfByte;
                  localr.a(localt.gcV, 0, 0);
                }
              }
              catch (RemoteException localRemoteException6)
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>("summerauth save serverid aak failed 1 cookie:");
                com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MMAutoAuth", localRemoteException6, bo.cd(arrayOfByte), new Object[0]);
                com.tencent.mm.sdk.platformtools.ab.dot();
                AppMethodBeat.o(58697);
                throw localRemoteException6;
              }
              localObject3 = bo.cd((byte[])localObject3);
              continue;
              localObject4 = bo.cd(arrayOfByte);
              continue;
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MMAutoAuth", "summerauth save serverid aak failed 1");
              continue;
            }
            localt.fPj = 0;
            h localh = localr.adt();
            try
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMAutoAuth", "summerauth accinfo %d: username:%s, wxusername:%s, ticket:%s, single session: %s client session:%s, server session:%s uin:%d", new Object[] { Integer.valueOf(localr.getType()), localh.getUserName(), locali.adD(), bo.anv(bo.ca(locali.adz())), bo.anv(bo.ca(locali.jQ(1))), bo.anv(bo.ca(locali.jQ(2))), bo.anv(bo.ca(locali.jQ(3))), Integer.valueOf(locali.QF()) });
              k = locali.QF();
              localObject3 = locali.adz();
              if (bo.cb((byte[])localObject3))
              {
                localObject3 = "";
                if (!bo.cb(arrayOfByte))
                  continue;
                localObject4 = "";
                if (!localt.g((String)localObject3, (String)localObject4, k))
                  continue;
                localt.gcU.cPB = arrayOfByte;
                localt.gcU.username = localh.getUserName();
                localt.gcU.gcF = locali.adD();
                localt.gcU.a(locali.jQ(1), locali.jQ(2), locali.jQ(3), locali.QF());
                localt.gcU.gcE = locali.adc();
                p.getString(locali.QF());
                b.dnL();
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMAutoAuth", "summerauth decode and save ok!");
                continue;
              }
              localObject3 = bo.cd((byte[])localObject3);
              continue;
              localObject4 = bo.cd(arrayOfByte);
              continue;
              e.pXa.a(148L, 35L, 1L, false);
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MMAutoAuth", "summerauth save serverid aak failed 2");
              continue;
            }
            catch (RemoteException localRemoteException3)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>("summerauth save serverid aak failed 2 cookie:");
              com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MMAutoAuth", localRemoteException3, bo.cd(arrayOfByte), new Object[0]);
              com.tencent.mm.sdk.platformtools.ab.dot();
              AppMethodBeat.o(58697);
              throw localRemoteException3;
            }
            if ((j == 0) && (n == 0))
            {
              com.tencent.mm.protocal.z.O(localr.adu().adA(), localr.adu().adB(), localr.adu().adC());
              localt.gcX = SystemClock.elapsedRealtime();
            }
            if ((ae.giz == 10003) && (ae.giA > 0))
            {
              if (ae.giA <= 1)
                ae.giA = 0;
              i2 = 4;
              k = 0;
              com.tencent.mm.protocal.z.O("", "", 0);
              if (localt.gcY == -1)
                continue;
              if ((i2 == 0) && (k == 0))
                localt.a(localr, 0, 0);
              localt.gcY = -1;
              continue;
              label2170: locall.a(m, j, i1, null, localr, localr.adu().ada());
              AppMethodBeat.o(58697);
              break label88;
              localRemoteException4 = localRemoteException4;
              k = -1;
              i1 = n;
              n = k;
              continue;
            }
            break;
          }
        }
        catch (RemoteException localRemoteException5)
        {
          k = -1;
          i1 = j;
          j = n;
          n = k;
          continue;
          int i2 = j;
          k = n;
          continue;
        }
      }
      n = j;
      j = i1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.af.2
 * JD-Core Version:    0.6.2
 */