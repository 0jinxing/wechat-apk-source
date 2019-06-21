package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.normsg.a.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.baf;
import com.tencent.mm.protocal.protobuf.bag;
import com.tencent.mm.protocal.protobuf.bah;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.protobuf.fv;
import com.tencent.mm.protocal.protobuf.ge;
import com.tencent.mm.protocal.protobuf.gg;
import com.tencent.mm.protocal.protobuf.gh;
import com.tencent.mm.protocal.protobuf.hh;
import com.tencent.mm.protocal.protobuf.xu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.y;
import java.io.IOException;

public final class j
{
  public static final class a extends j.f
    implements l.b
  {
    public String username;
    public gg vxQ;

    public a()
    {
      AppMethodBeat.i(58833);
      this.vxQ = new gg();
      AppMethodBeat.o(58833);
    }

    public final byte[] ZT()
    {
      int i = -1;
      AppMethodBeat.i(58834);
      a.lD("");
      int j = this.vyf;
      int k;
      if (j == 12)
        k = 1;
      while (true)
      {
        ab.d("MicroMsg.AutoReq", "summerstatus[%d] clientUpgrade[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
        a(z.dmv());
        if ((10002 == ae.giz) && (ae.giA > 0))
        {
          ae.giA = 0;
          z.O("", "", 0);
        }
        Object localObject1 = this.vxQ.vIp;
        ((ge)localObject1).setBaseRequest(l.a(this));
        ab.i("MicroMsg.AutoReq", "summerauth autoauth toProtoBuf uin[%d]", new Object[] { Integer.valueOf(this.vyb) });
        ((ge)localObject1).nqc = com.tencent.mm.compatible.e.q.LK();
        ((ge)localObject1).vIh = b.oTO.An(k);
        ((ge)localObject1).vIi = 0;
        ((ge)localObject1).vIj = a.Rb();
        ((ge)localObject1).guQ = bo.gS(ah.getContext());
        ((ge)localObject1).jBF = d.DEVICE_NAME;
        ((ge)localObject1).vIk = bs.dut();
        ((ge)localObject1).luQ = com.tencent.mm.sdk.platformtools.aa.dor();
        ((ge)localObject1).luP = bo.dpA();
        ((ge)localObject1).vAM = com.tencent.mm.sdk.platformtools.g.cdf;
        com.tencent.mm.kernel.g.RQ();
        Object localObject3 = (String)com.tencent.mm.kernel.g.RP().eJH.get(18);
        ab.d("MicroMsg.AutoReq", "summerecdh ksid:%s, flag:%d", new Object[] { localObject3, Integer.valueOf(((ge)localObject1).vIg.vJW) });
        ((ge)localObject1).vIg.vJU.vMb = new SKBuiltinBuffer_t().setBuffer(bo.anf((String)localObject3));
        try
        {
          Object localObject4 = b.oTO.bVS();
          if (localObject4 != null)
          {
            k = localObject4.length;
            ab.d("MicroMsg.AutoReq", "[tomys] ccd set on auto auth, len: %s", new Object[] { Integer.valueOf(k) });
            localObject3 = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
            ((SKBuiltinBuffer_t)localObject3).<init>();
            ((ge)localObject1).vIl = ((SKBuiltinBuffer_t)localObject3).setBuffer((byte[])localObject4);
            localObject3 = this.vxQ.vIo;
            localObject4 = new xu();
            ((xu)localObject4).wdx = 713;
            localObject5 = new PByteArray();
            localObject6 = new PByteArray();
            int m = MMProtocalJni.generateECKey(((xu)localObject4).wdx, (PByteArray)localObject5, (PByteArray)localObject6);
            localObject5 = ((PByteArray)localObject5).value;
            localObject6 = ((PByteArray)localObject6).value;
            bL((byte[])localObject6);
            j = ((xu)localObject4).wdx;
            if (localObject5 != null)
              break label706;
            k = -1;
            if (localObject6 != null)
              break label713;
            ab.d("MicroMsg.AutoReq", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i), bo.ca((byte[])localObject5), bo.ca((byte[])localObject6) });
            ((xu)localObject4).vIn = new SKBuiltinBuffer_t().setBuffer((byte[])localObject5);
            ((gh)localObject3).vIr = ((xu)localObject4);
            ab.i("MicroMsg.AutoReq", "summerauth auto IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d,%d]", new Object[] { ((ge)localObject1).nqc, ((ge)localObject1).vIh, ((ge)localObject1).vIj, ((ge)localObject1).guQ, ((ge)localObject1).jBF, ((ge)localObject1).vIk, ((ge)localObject1).luQ, ((ge)localObject1).luP, Integer.valueOf(((ge)localObject1).vAM), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdf), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.xya) });
          }
        }
        catch (Throwable localThrowable)
        {
          try
          {
            Object localObject6;
            while (true)
            {
              Object localObject5;
              localObject1 = this.vxQ.toByteArray();
              AppMethodBeat.o(58834);
              return localObject1;
              com.tencent.mm.kernel.g.RQ();
              k = com.tencent.mm.kernel.g.RP().eJH.Ml(46);
              break;
              k = -1;
              continue;
              localThrowable = localThrowable;
              ab.printErrStackTrace("MicroMsg.AutoReq", localThrowable, "cc throws exception.", new Object[0]);
              continue;
              label706: k = localObject5.length;
            }
            label713: i = localObject6.length;
          }
          catch (IOException localIOException)
          {
            while (true)
            {
              ab.e("MicroMsg.AutoReq", "summerauth toProtoBuf :%s", new Object[] { bo.l(localIOException) });
              Object localObject2 = null;
              AppMethodBeat.o(58834);
            }
          }
        }
      }
    }

    public final int ZU()
    {
      if (f.vxx);
      for (int i = 763; ; i = 702)
        return i;
    }

    public final String getUri()
    {
      if (f.vxx);
      for (String str = "/cgi-bin/micromsg-bin/secautoauth"; ; str = "/cgi-bin/micromsg-bin/autoauth")
        return str;
    }
  }

  public static final class b extends j.g
    implements l.c
  {
    public final int P(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(58835);
      try
      {
        this.vxV = ((cjj)this.vxV.parseFrom(paramArrayOfByte));
        l.a(this, this.vxV.getBaseResponse());
        this.eCX = 0;
        if ((this.vxV.getBaseResponse().Ret == 0) && ((this.vxV.xid == null) || (this.vxV.xid.luF == 0) || (bo.cb(com.tencent.mm.platformtools.aa.a(this.vxV.xid.vHG)))))
        {
          ab.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
          this.vxV.getBaseResponse().Ret = -1;
        }
        paramArrayOfByte = this.vyn;
        ab.i("MicroMsg.MMAuth", "summerauthkick auto errmsg[%s]", new Object[] { paramArrayOfByte });
        a.lD(paramArrayOfByte);
        i = this.vxV.getBaseResponse().Ret;
        AppMethodBeat.o(58835);
        return i;
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
        {
          ab.e("MicroMsg.MMAuth", "toProtoBuf :%s", new Object[] { bo.l(paramArrayOfByte) });
          this.vxV.getBaseResponse().Ret = -1;
          AppMethodBeat.o(58835);
          int i = -1;
        }
      }
    }
  }

  public static abstract interface c
  {
    public abstract int ZP();

    public abstract void a(j.f paramf, j.g paramg, int paramInt1, int paramInt2, String paramString);

    public abstract com.tencent.mm.network.q cn(int paramInt1, int paramInt2);

    public static final class a
    {
      public static j.c vxR;
    }
  }

  public static final class d extends j.f
    implements l.b
  {
    public bag vxS;
    public boolean vxT;

    public d()
    {
      AppMethodBeat.i(58836);
      this.vxS = new bag();
      this.vxT = false;
      AppMethodBeat.o(58836);
    }

    public final byte[] ZT()
    {
      int i = -1;
      AppMethodBeat.i(58837);
      a.lD("");
      int j = this.vyf;
      int k;
      if (j == 16)
        k = 1;
      while (true)
      {
        ab.d("MicroMsg.ManualReq", "summerstatus[%d] clientUpgrade[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
        if ((10002 == ae.giz) && (ae.giA > 0))
        {
          ae.giA = 0;
          z.O("", "", 0);
        }
        a(z.dmv());
        Object localObject1 = this.vxS.wEc;
        ((baf)localObject1).setBaseRequest(l.a(this));
        ((baf)localObject1).nqc = com.tencent.mm.compatible.e.q.LK();
        ((baf)localObject1).vIh = b.oTO.An(k);
        ((baf)localObject1).vIi = 0;
        ((baf)localObject1).vIj = a.Rb();
        ((baf)localObject1).guQ = bo.gS(ah.getContext());
        ((baf)localObject1).jBF = d.DEVICE_NAME;
        ((baf)localObject1).vIk = bs.dut();
        ((baf)localObject1).luQ = com.tencent.mm.sdk.platformtools.aa.dor();
        ((baf)localObject1).luP = bo.dpA();
        ((baf)localObject1).vAM = com.tencent.mm.sdk.platformtools.g.cdf;
        if ((10012 == ae.giz) && (ae.giA > 0))
          ((baf)localObject1).vAM = ae.giA;
        ((baf)localObject1).vOA = d.vxi;
        ((baf)localObject1).vOz = d.vxj;
        ((baf)localObject1).wDX = d.vxk;
        ((baf)localObject1).wdz = com.tencent.mm.compatible.e.q.getSimCountryIso();
        com.tencent.mm.kernel.g.RQ();
        Object localObject3 = (String)com.tencent.mm.kernel.g.RP().eJH.get(18);
        ab.d("MicroMsg.ManualReq", "summerauth ksid:%s authreq flag:%d", new Object[] { localObject3, Integer.valueOf(((baf)localObject1).vIg.vJW) });
        ((baf)localObject1).vIg.vJU.vMb = new SKBuiltinBuffer_t().setBuffer(bo.anf((String)localObject3));
        try
        {
          localObject3 = b.oTO.bVS();
          if (localObject3 != null)
          {
            k = localObject3.length;
            ab.d("MicroMsg.ManualReq", "[tomys] ccd set on manual auth, len: %s", new Object[] { Integer.valueOf(k) });
            Object localObject4 = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
            ((SKBuiltinBuffer_t)localObject4).<init>();
            ((baf)localObject1).vIl = ((SKBuiltinBuffer_t)localObject4).setBuffer((byte[])localObject3);
            localObject4 = this.vxS.wEb;
            ((bah)localObject4).vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
            localObject3 = new xu();
            ((xu)localObject3).wdx = 713;
            localObject5 = new PByteArray();
            localObject6 = new PByteArray();
            j = MMProtocalJni.generateECKey(((xu)localObject3).wdx, (PByteArray)localObject5, (PByteArray)localObject6);
            localObject5 = ((PByteArray)localObject5).value;
            localObject6 = ((PByteArray)localObject6).value;
            bL((byte[])localObject6);
            int m = ((xu)localObject3).wdx;
            if (localObject5 != null)
              break label806;
            k = -1;
            if (localObject6 != null)
              break label813;
            ab.d("MicroMsg.ManualReq", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), bo.ca((byte[])localObject5), bo.ca((byte[])localObject6) });
            ((xu)localObject3).vIn = new SKBuiltinBuffer_t().setBuffer((byte[])localObject5);
            ((bah)localObject4).vIr = ((xu)localObject3);
            ab.i("MicroMsg.ManualReq", "summerauth manual IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d,%d] DeviceBrand:%s DeviceModel:%s OSType:%s RealCountry:%s", new Object[] { ((baf)localObject1).nqc, ((baf)localObject1).vIh, ((baf)localObject1).vIj, ((baf)localObject1).guQ, ((baf)localObject1).jBF, ((baf)localObject1).vIk, ((baf)localObject1).luQ, ((baf)localObject1).luP, Integer.valueOf(((baf)localObject1).vAM), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdf), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.xya), ((baf)localObject1).vOA, ((baf)localObject1).vOz, ((baf)localObject1).wDX, ((baf)localObject1).wdz });
          }
        }
        catch (Throwable localThrowable)
        {
          try
          {
            Object localObject6;
            while (true)
            {
              Object localObject5;
              localObject1 = this.vxS.toByteArray();
              AppMethodBeat.o(58837);
              return localObject1;
              if (this.vxT)
              {
                k = 3;
                break;
              }
              com.tencent.mm.kernel.g.RQ();
              k = com.tencent.mm.kernel.g.RP().eJH.Ml(46);
              break;
              k = -1;
              continue;
              localThrowable = localThrowable;
              ab.printErrStackTrace("MicroMsg.ManualReq", localThrowable, "cc throws exception.", new Object[0]);
              continue;
              label806: k = localObject5.length;
            }
            label813: i = localObject6.length;
          }
          catch (IOException localIOException)
          {
            while (true)
            {
              ab.e("MicroMsg.ManualReq", "summerauth toProtoBuf :%s", new Object[] { bo.l(localIOException) });
              Object localObject2 = null;
              AppMethodBeat.o(58837);
            }
          }
        }
      }
    }

    public final int ZU()
    {
      if (f.vxx);
      for (int i = 252; ; i = 701)
        return i;
    }

    public final String getUri()
    {
      if (f.vxx);
      for (String str = "/cgi-bin/micromsg-bin/secmanualauth"; ; str = "/cgi-bin/micromsg-bin/manualauth")
        return str;
    }
  }

  public static final class e extends j.g
    implements l.c
  {
    public final int P(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(58838);
      try
      {
        this.vxV = ((cjj)this.vxV.parseFrom(paramArrayOfByte));
        l.a(this, this.vxV.getBaseResponse());
        this.eCX = 0;
        if ((this.vxV.getBaseResponse().Ret == 0) && ((this.vxV.xid == null) || (this.vxV.xid.luF == 0) || (bo.cb(com.tencent.mm.platformtools.aa.a(this.vxV.xid.vHG)))))
        {
          ab.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
          this.vxV.getBaseResponse().Ret = -1;
        }
        paramArrayOfByte = this.vyn;
        ab.i("MicroMsg.MMAuth", "summerauthkick manual errmsg[%s]", new Object[] { paramArrayOfByte });
        a.lD(paramArrayOfByte);
        i = this.vxV.getBaseResponse().Ret;
        AppMethodBeat.o(58838);
        return i;
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
        {
          ab.e("MicroMsg.MMAuth", "toProtoBuf :%s", new Object[] { bo.l(paramArrayOfByte) });
          this.vxV.getBaseResponse().Ret = -1;
          AppMethodBeat.o(58838);
          int i = -1;
        }
      }
    }
  }

  public static abstract class f extends l.d
    implements l.b
  {
    public byte[] vxU;

    public final void bL(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte != null);
      while (true)
      {
        this.vxU = paramArrayOfByte;
        return;
        paramArrayOfByte = new byte[0];
      }
    }

    public abstract String getUri();
  }

  public static abstract class g extends l.e
    implements l.c
  {
    public int eCX = 0;
    private byte[] gcB;
    private byte[] gcC;
    public String gcF;
    public cjj vxV = new cjj();
    public byte[] vxW;
    private byte[] vxX;

    public final byte[] LA(int paramInt)
    {
      byte[] arrayOfByte = new byte[0];
      switch (paramInt)
      {
      default:
        if (arrayOfByte != null)
          break;
      case 1:
      case 2:
      case 3:
      }
      for (int i = -1; ; i = arrayOfByte.length)
      {
        ab.i("MicroMsg.MMAuth", "summerauths getSession seesionKeyType[%s] [%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        return arrayOfByte;
        arrayOfByte = this.vxX;
        break;
        arrayOfByte = this.gcB;
        break;
        arrayOfByte = this.gcC;
        break;
      }
    }

    public final void b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
    {
      this.vxX = paramArrayOfByte1;
      this.gcB = paramArrayOfByte2;
      this.gcC = paramArrayOfByte3;
      ab.i("MicroMsg.MMAuth", "summerauths setSession [%s] [%s], [%s]", new Object[] { bo.anv(bo.ca(this.vxX)), bo.anv(bo.ca(this.gcB)), bo.anv(bo.ca(this.gcC)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.j
 * JD-Core Version:    0.6.2
 */