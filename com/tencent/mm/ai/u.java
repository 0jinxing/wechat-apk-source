package com.tencent.mm.ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ax;
import com.tencent.mm.network.j;
import com.tencent.mm.network.q;
import com.tencent.mm.network.r;
import com.tencent.mm.network.r.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.f;
import com.tencent.mm.protocal.i;
import com.tencent.mm.protocal.j.c;
import com.tencent.mm.protocal.j.c.a;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.beh;
import com.tencent.mm.protocal.protobuf.bvv;
import com.tencent.mm.protocal.protobuf.xu;
import com.tencent.mm.protocal.v.a;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class u extends r.a
{
  private q ftU;
  com.tencent.mm.protocal.h fug;
  i fuh;
  ak handler;

  public u(q paramq)
  {
  }

  public u(q paramq, ak paramak)
  {
    AppMethodBeat.i(58275);
    this.ftU = paramq;
    this.fug = new t(paramq.acF(), paramq.getType());
    this.fuh = new v(paramq.ZS(), paramq.getType());
    this.handler = paramak;
    AppMethodBeat.o(58275);
  }

  public final void a(com.tencent.mm.network.d paramd, final j paramj, final int paramInt1, final int paramInt2)
  {
    AppMethodBeat.i(58283);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(58273);
        u localu = new u(new l(), u.this.handler);
        try
        {
          paramj.a(localu, paramInt1, paramInt2, "");
          AppMethodBeat.o(58273);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
          {
            ab.e("MicroMsg.RemoteReqResp", "exception:%s", new Object[] { bo.l(localRemoteException) });
            AppMethodBeat.o(58273);
          }
        }
      }
    });
    AppMethodBeat.o(58283);
  }

  public final void a(final j paramj, final int paramInt1, final int paramInt2)
  {
    AppMethodBeat.i(58282);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(58272);
        int i = ax.ZQ().getInt("key_auth_update_version", 0);
        int j;
        Object localObject;
        label75: label96: long l;
        if (i <= 637665332)
          if (f.vxx)
          {
            j = 252;
            if (i != 0)
              break label475;
            localObject = ah.getContext().getSharedPreferences("ticket_prefs", com.tencent.mm.compatible.util.h.Mu());
            if (!bo.isNullOrNil(((SharedPreferences)localObject).getString("_auth_ticket", "")))
              break label434;
            if (!f.vxx)
              break label427;
            j = 763;
            ab.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth revise to autoauth");
            e.pXa.a(148L, 50L, 1L, true);
            ab.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth updateVersion:%d, clientVersion:%d WLOGIN_BUG_VERSION:%d, newAuthType:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.protocal.d.vxo), Integer.valueOf(637665332), Integer.valueOf(j) });
            if ((j != 252) && (j != 701))
              break label494;
            e.pXa.a(148L, 48L, 1L, true);
            localObject = e.pXa;
            if (!f.vxx)
              break label478;
            l = 115L;
            label181: ((e)localObject).a(148L, l, 1L, true);
            localObject = e.pXa;
            if (!f.vxy)
              break label486;
            l = 117L;
            label207: ((e)localObject).a(148L, l, 1L, true);
            if (((u.a(u.this).getType() != 702) && (u.a(u.this).getType() != 701) && (u.a(u.this).getType() != 763) && (u.a(u.this).getType() != 252)) || (((j.g)u.a(u.this).ZS()).eCX != 2))
              break label611;
          }
        label427: label434: label475: label478: label611: for (i = 1; ; i = 0)
          while (true)
          {
            ab.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth old type:%d new auth type:%d, reqFlag:%d", new Object[] { Integer.valueOf(u.a(u.this).getType()), Integer.valueOf(j), Integer.valueOf(i) });
            localObject = j.c.a.vxR.cn(j, i);
            if (localObject == null)
              localObject = null;
            try
            {
              while (true)
              {
                paramj.a((r)localObject, paramInt1, paramInt2, "");
                AppMethodBeat.o(58272);
                return;
                j = 701;
                break;
                if (f.vxx)
                {
                  j = 763;
                  break;
                }
                j = 702;
                break;
                j = 702;
                break label75;
                e.pXa.a(148L, 49L, 1L, true);
                ab.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth keep manual as old [%s]", new Object[] { bo.anv(((SharedPreferences)localObject).getString("_auth_ticket", "")) });
                break label96;
                l = 116L;
                break label181;
                label486: l = 118L;
                break label207;
                label494: localObject = e.pXa;
                if (f.vxx)
                {
                  l = 111L;
                  label509: ((e)localObject).a(148L, l, 1L, true);
                  localObject = e.pXa;
                  if (!f.vxy)
                    break label557;
                }
                for (l = 113L; ; l = 114L)
                {
                  ((e)localObject).a(148L, l, 1L, true);
                  break;
                  l = 112L;
                  break label509;
                }
                localObject = new u((q)localObject, u.this.handler);
              }
            }
            catch (RemoteException localRemoteException)
            {
              while (true)
              {
                ab.e("MicroMsg.RemoteReqResp", "exception:%s", new Object[] { bo.l(localRemoteException) });
                AppMethodBeat.o(58272);
              }
            }
          }
      }
    });
    AppMethodBeat.o(58282);
  }

  public final void a(j paramj, final int paramInt1, final int paramInt2, final String paramString)
  {
    AppMethodBeat.i(58281);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(58271);
        ab.d("MicroMsg.RemoteReqResp", "summerauth doAutoAuthEnd type:%d, stack[%s]", new Object[] { Integer.valueOf(u.a(u.this).getType()), bo.dpG() });
        j.f localf = (j.f)u.a(u.this).acF();
        j.g localg = (j.g)u.a(u.this).ZS();
        if (localg == null)
        {
          ab.f("MicroMsg.RemoteReqResp", "null auth.resp");
          AppMethodBeat.o(58271);
        }
        while (true)
        {
          return;
          j.c.a.vxR.a(localf, localg, paramInt1, paramInt2, paramString);
          AppMethodBeat.o(58271);
        }
      }
    });
    AppMethodBeat.o(58281);
  }

  public final int acB()
  {
    AppMethodBeat.i(58285);
    int i = this.ftU.acB();
    AppMethodBeat.o(58285);
    return i;
  }

  public final int acC()
  {
    AppMethodBeat.i(58278);
    int i = this.ftU.acC();
    AppMethodBeat.o(58278);
    return i;
  }

  public final boolean acG()
  {
    AppMethodBeat.i(58276);
    boolean bool = this.ftU.acG();
    AppMethodBeat.o(58276);
    return bool;
  }

  public final boolean acH()
  {
    AppMethodBeat.i(58286);
    boolean bool = this.ftU.acH();
    AppMethodBeat.o(58286);
    return bool;
  }

  public final int acO()
  {
    AppMethodBeat.i(58277);
    int i = this.ftU.hashCode();
    AppMethodBeat.o(58277);
    return i;
  }

  public final com.tencent.mm.protocal.h adt()
  {
    return this.fug;
  }

  public final i adu()
  {
    return this.fuh;
  }

  public final int adv()
  {
    AppMethodBeat.i(58284);
    int i = getType();
    int j = -1;
    ab.d("MicroMsg.RemoteReqResp", "summerauth decodeAndRetriveAccInfo type:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
    case 252:
    case 701:
    case 702:
    case 763:
      while (true)
      {
        AppMethodBeat.o(58284);
        return j;
        j = ax.a(this.ftU);
      }
    case 126:
    }
    Object localObject1 = this.ftU;
    Object localObject2 = (v.a)((q)localObject1).acF();
    v.b localb = (v.b)((q)localObject1).ZS();
    ab.i("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo type:%d, stack[%s]", new Object[] { Integer.valueOf(126), bo.dpG() });
    if (localb.eCX != 0)
      ab.d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", new Object[] { Integer.valueOf(localb.eCX) });
    while (true)
    {
      j = localb.eCX;
      break;
      Object localObject3 = localb.vyJ.wIp;
      if (localObject3 != null)
      {
        i = ((bvv)localObject3).vHV;
        localObject1 = ((bvv)localObject3).vHF;
        byte[] arrayOfByte1 = aa.a(((bvv)localObject3).vHY);
        byte[] arrayOfByte2 = aa.a(((bvv)localObject3).vHZ);
        localObject3 = aa.a(((bvv)localObject3).vHG);
        int k = ((xu)localObject1).vIn.getILen();
        int m = ((xu)localObject1).wdx;
        label268: byte[] arrayOfByte4;
        if (localObject3 == null)
        {
          j = -1;
          ab.d("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s, clientSession[%s], serverSession[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(j), bo.anv(bo.ca((byte[])localObject3)), bo.anv(bo.ca(arrayOfByte1)), bo.anv(bo.ca(arrayOfByte2)) });
          byte[] arrayOfByte3 = aa.a(((xu)localObject1).vIn);
          arrayOfByte4 = ((v.a)localObject2).vxU;
          localObject2 = null;
          if (bo.cb(arrayOfByte3))
            break label682;
          k = arrayOfByte3.length;
          localObject2 = bo.anv(bo.ca(arrayOfByte3));
          if (arrayOfByte4 != null)
            break label668;
          j = -1;
          label385: ab.d("MicroMsg.MMReqRespReg2", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", new Object[] { Integer.valueOf(k), localObject2, Integer.valueOf(j), bo.anv(bo.ca(arrayOfByte4)) });
          localObject2 = new PByteArray();
          k = MMProtocalJni.computerKeyWithAllStr(((xu)localObject1).wdx, arrayOfByte3, arrayOfByte4, (PByteArray)localObject2, 0);
          localObject2 = ((PByteArray)localObject2).value;
          if (localObject2 != null)
            break label675;
          j = -1;
          label466: ab.i("MicroMsg.MMReqRespReg2", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(j), bo.anv(bo.ca((byte[])localObject2)) });
          label504: if (localObject2 == null)
            break label693;
          localObject1 = localObject2;
          label512: localb.vxW = ((byte[])localObject1);
          if ((i & 0x4) == 0)
            break label772;
          ab.d("MicroMsg.MMReqRespReg2", "summerauth must decode session key");
          if (bo.cb((byte[])localObject2))
            break label743;
          localObject2 = MMProtocalJni.aesDecrypt((byte[])localObject3, (byte[])localObject2);
          if (localObject3 != null)
            break label700;
          j = -1;
          label556: localObject1 = bo.ca((byte[])localObject3);
          if (localObject2 != null)
            break label707;
        }
        label668: label675: label682: label693: label700: label707: for (i = -1; ; i = localObject2.length)
        {
          ab.d("MicroMsg.MMReqRespReg2", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", new Object[] { Integer.valueOf(j), localObject1, Integer.valueOf(i), bo.anv(bo.ca((byte[])localObject2)) });
          if (bo.cb((byte[])localObject2))
            break label714;
          ab.d("MicroMsg.MMReqRespReg2", "summerauth decode session key succ session:%s", new Object[] { bo.anv(bo.ca((byte[])localObject2)) });
          localb.b((byte[])localObject2, arrayOfByte1, arrayOfByte2);
          localb.eCX = 1;
          break;
          j = localObject3.length;
          break label268;
          j = arrayOfByte4.length;
          break label385;
          j = localObject2.length;
          break label466;
          ab.w("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key is null!");
          break label504;
          localObject1 = new byte[0];
          break label512;
          j = localObject3.length;
          break label556;
        }
        label714: ab.d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed ret null!");
        localb.b(new byte[0], arrayOfByte1, arrayOfByte2);
        localb.eCX = 2;
        continue;
        label743: ab.d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed as agreedECDHKey is null!");
        localb.b(new byte[0], arrayOfByte1, arrayOfByte2);
        localb.eCX = 2;
        continue;
        label772: ab.d("MicroMsg.MMReqRespReg2", "summerauth not need decode session key");
        localb.b((byte[])localObject3, arrayOfByte1, arrayOfByte2);
        localb.eCX = 1;
      }
      else
      {
        ab.d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo sect null and decode failed!");
        localb.b(new byte[0], new byte[0], new byte[0]);
        localb.eCX = 2;
      }
    }
  }

  public final int getType()
  {
    AppMethodBeat.i(58279);
    int i = this.ftU.getType();
    AppMethodBeat.o(58279);
    return i;
  }

  public final String getUri()
  {
    AppMethodBeat.i(58280);
    String str = this.ftU.getUri();
    AppMethodBeat.o(58280);
    return str;
  }

  public final void qw(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.u
 * JD-Core Version:    0.6.2
 */