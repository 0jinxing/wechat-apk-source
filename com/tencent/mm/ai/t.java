package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.f;
import com.tencent.mm.protocal.h.a;
import com.tencent.mm.protocal.j.a;
import com.tencent.mm.protocal.j.c;
import com.tencent.mm.protocal.j.c.a;
import com.tencent.mm.protocal.j.d;
import com.tencent.mm.protocal.l.a;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.agx;
import com.tencent.mm.protocal.protobuf.bag;
import com.tencent.mm.protocal.protobuf.bah;
import com.tencent.mm.protocal.protobuf.beg;
import com.tencent.mm.protocal.protobuf.gg;
import com.tencent.mm.protocal.protobuf.gh;
import com.tencent.mm.protocal.r.a;
import com.tencent.mm.protocal.v.a;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class t extends h.a
{
  private static com.tencent.mm.plugin.zero.a.e fue;
  private l.d fta;
  private byte[] fuf;
  private int type;

  public t(l.d paramd, int paramInt)
  {
    this.fta = paramd;
    this.type = paramInt;
  }

  public static void a(com.tencent.mm.plugin.zero.a.e parame)
  {
    fue = parame;
  }

  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, l.d paramd, ByteArrayOutputStream paramByteArrayOutputStream, boolean paramBoolean)
  {
    AppMethodBeat.i(58264);
    int i;
    if (bo.cb(paramArrayOfByte1))
      if (paramArrayOfByte1 == null)
      {
        i = -1;
        ab.e("MicroMsg.RemoteReq", "reqToBufNoRSA session is null :%d", new Object[] { Integer.valueOf(i) });
        paramBoolean = false;
        AppMethodBeat.o(58264);
      }
    while (true)
    {
      return paramBoolean;
      i = paramArrayOfByte1.length;
      break;
      PByteArray localPByteArray = new PByteArray();
      try
      {
        l.b localb = (l.b)paramd;
        byte[] arrayOfByte = localb.ZT();
        if (arrayOfByte == null)
        {
          paramBoolean = false;
          AppMethodBeat.o(58264);
        }
        else if (localb.dms())
        {
          paramByteArrayOutputStream.write(arrayOfByte);
          paramBoolean = true;
          AppMethodBeat.o(58264);
        }
        else
        {
          z localz = z.dmv();
          i = 6;
          if (paramBoolean)
            i = 7;
          int j = 0;
          int k = j;
          if (!bo.cb(paramArrayOfByte3))
          {
            k = j;
            if (!bo.cb(arrayOfByte))
              k = MMProtocalJni.genSignature(paramd.vyb, paramArrayOfByte3, arrayOfByte);
          }
          if (MMProtocalJni.pack(arrayOfByte, localPByteArray, paramArrayOfByte1, 0, paramArrayOfByte2, paramd.vye, paramd.vyb, localb.ZU(), localz.ver, localz.vyO.getBytes(), localz.vyP.getBytes(), k, i, localb.dmr()))
          {
            ab.d("MicroMsg.RemoteReq", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(i) });
            paramByteArrayOutputStream.write(localPByteArray.value);
            paramBoolean = true;
            AppMethodBeat.o(58264);
          }
          else
          {
            paramBoolean = false;
            AppMethodBeat.o(58264);
          }
        }
      }
      catch (Exception paramArrayOfByte1)
      {
        ab.e("MicroMsg.RemoteReq", "protobuf build exception, check now! :" + paramArrayOfByte1.getMessage());
        ab.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
        paramBoolean = false;
        AppMethodBeat.o(58264);
      }
    }
  }

  public static byte[][] a(long paramLong, com.tencent.mm.bt.a parama1, com.tencent.mm.bt.a parama2)
  {
    byte[][] arrayOfByte = null;
    AppMethodBeat.i(58266);
    if (paramLong == 0L)
      ab.w("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray autoauth uin is invalid!");
    try
    {
      parama1 = parama1.toByteArray();
      if (bo.cb(parama1))
      {
        ab.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqDataBuf is null and ret false");
        AppMethodBeat.o(58266);
        parama1 = arrayOfByte;
        return parama1;
      }
    }
    catch (IOException parama1)
    {
      while (true)
      {
        ab.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqData toProtoBuf exception:%s", new Object[] { bo.l(parama1) });
        parama1 = null;
        continue;
        try
        {
          parama2 = parama2.toByteArray();
          if (bo.cb(parama2))
          {
            ab.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqDataBuf is null and ret false");
            AppMethodBeat.o(58266);
            parama1 = arrayOfByte;
          }
        }
        catch (IOException parama2)
        {
          while (true)
          {
            ab.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqData toProtoBuf exception:%s", new Object[] { bo.l(parama2) });
            parama2 = null;
          }
          arrayOfByte = new byte[2][];
          arrayOfByte[0] = parama1;
          arrayOfByte[1] = parama2;
          AppMethodBeat.o(58266);
          parama1 = arrayOfByte;
        }
      }
    }
  }

  public final int QF()
  {
    return this.fta.vyb;
  }

  public final void T(byte[] paramArrayOfByte)
  {
    l.d locald = this.fta;
    if (paramArrayOfByte != null);
    while (true)
    {
      locald.bFT = paramArrayOfByte;
      return;
      paramArrayOfByte = new byte[0];
    }
  }

  public final void U(byte[] paramArrayOfByte)
  {
    this.fta.vyi = paramArrayOfByte;
  }

  public final boolean a(int paramInt1, byte[] paramArrayOfByte1, int paramInt2, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(58265);
    PByteArray localPByteArray = new PByteArray();
    ab.d("MicroMsg.RemoteReq", "reqToBuf jType: %d, stack: %s", new Object[] { Integer.valueOf(paramInt1), bo.dpG() });
    if (paramInt1 == 268369922);
    while (true)
    {
      try
      {
        this.fuf = ((l.b)this.fta).ZT();
        this.fta.bufferSize = this.fuf.length;
        paramBoolean = true;
        AppMethodBeat.o(58265);
        return paramBoolean;
      }
      catch (Exception paramArrayOfByte1)
      {
        ab.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
        paramBoolean = false;
        AppMethodBeat.o(58265);
        continue;
      }
      if ((this.fta instanceof l.b))
        break;
      ab.f("MicroMsg.RemoteReq", "all protocal should implemented with protobuf");
      paramBoolean = false;
      AppMethodBeat.o(58265);
    }
    label1644: label2040: label2046: 
    while (true)
    {
      l.b localb;
      byte[] arrayOfByte1;
      long l1;
      int i;
      z localz;
      try
      {
        localb = (l.b)this.fta;
        arrayOfByte1 = localb.ZT();
        if (arrayOfByte1 == null)
        {
          ab.f("MicroMsg.RemoteReq", "protobuf is null");
          paramBoolean = false;
          AppMethodBeat.o(58265);
          break;
        }
        if (localb.dms())
        {
          this.fuf = arrayOfByte1;
          this.fta.bufferSize = this.fuf.length;
          paramBoolean = true;
          AppMethodBeat.o(58265);
          break;
        }
        l1 = this.fta.vyb;
        if ((!com.tencent.mm.sdk.a.b.dnO()) || (l1 != 0L))
          break label2046;
        l1 = d.vxn;
        i = 6;
        if (paramInt1 == 775)
          i = 0;
        paramInt3 = i;
        if (paramBoolean)
          paramInt3 = i | 0x1;
        localz = this.fta.vyj;
        if ((paramInt1 != 775) && (this.fta.vyh == null) && (localz.dmy()) && (bo.cb(paramArrayOfByte1)))
        {
          ab.e("MicroMsg.RemoteReq", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramInt1) });
          paramBoolean = false;
          AppMethodBeat.o(58265);
          break;
        }
        if (localz.dmy())
          break label2040;
        arrayOfByte2 = new byte[0];
        if ((this.type != 381) && (f.vxx))
        {
          if (!localz.dmy())
          {
            ab.i("MicroMsg.RemoteReq", "summerauths rsaInfo[%s] EcdhMgr.USE_ECDH[%s] engine[%s]", new Object[] { Integer.valueOf(localz.ver), Boolean.valueOf(f.vxx), Long.valueOf(((l.b)this.fta).ads()) });
            ((l.b)this.fta).ZU();
            if (paramInt1 == 763)
            {
              paramArrayOfByte1 = ((j.a)this.fta).vxQ.vIo.vIq.getBufferToBytes();
              long l2 = f.bK(paramArrayOfByte1);
              this.fta.vyk = l2;
              paramArrayOfByte1 = UtilsJni.HybridEcdhEncrypt(l2, arrayOfByte1);
              paramBoolean = MMProtocalJni.packHybridEcdh(localPByteArray, paramArrayOfByte2, this.fta.vye, (int)l1, localb.ZU(), f.vxC, paramArrayOfByte1, paramInt3, localb.dmr());
              ab.d("MicroMsg.RemoteReq", "summerauths reqToBuf packHybridEcdh using protobuf ok, jType:%d, cert:%d len:%d, flag:%d ret:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(f.vxC), Integer.valueOf(localPByteArray.value.length), Integer.valueOf(paramInt3), Boolean.valueOf(paramBoolean) });
              this.fuf = localPByteArray.value;
              this.fta.bufferSize = this.fuf.length;
              AppMethodBeat.o(58265);
              break;
            }
            paramArrayOfByte1 = null;
            continue;
          }
          if (this.fta.vyh != null)
          {
            paramInt2 = 6;
            if (paramBoolean)
              paramInt2 = 7;
            if (this.fta.vyh.a(localPByteArray, paramInt1, paramArrayOfByte2, paramArrayOfByte3, paramInt2))
            {
              this.fuf = localPByteArray.value;
              this.fta.bufferSize = this.fuf.length;
              ab.d("MicroMsg.RemoteReq", "reqToBuf using req.getReqPackControl() ok, len:%d", new Object[] { Integer.valueOf(localPByteArray.value.length) });
            }
            paramBoolean = true;
            AppMethodBeat.o(58265);
            break;
          }
          int j = 0;
          i = j;
          if (!bo.cb(paramArrayOfByte3))
          {
            i = j;
            if (!bo.cb(arrayOfByte1))
              i = MMProtocalJni.genSignature((int)l1, paramArrayOfByte3, arrayOfByte1);
          }
          if (paramArrayOfByte3 == null)
          {
            j = -1;
            ab.i("MicroMsg.RemoteReq", "summerauths dkrsa use session :%s  type:%d, flag:%d, ecdh:[%s] signature[%d]", new Object[] { arrayOfByte2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(j), Integer.valueOf(i) });
            paramArrayOfByte1 = arrayOfByte1;
            if (paramInt2 == 13)
            {
              paramArrayOfByte1 = UtilsJni.AesGcmEncryptWithCompress(arrayOfByte2, arrayOfByte1);
              if (arrayOfByte2 != null)
                continue;
              j = -1;
              if (arrayOfByte1 != null)
                continue;
              k = -1;
              if (paramArrayOfByte1 != null)
                continue;
              m = -1;
              ab.i("MicroMsg.RemoteReq", "summerauths AesGcmEncryptWithCompress jType[%s] key[%s] message[%s] buf[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
            }
            if (MMProtocalJni.pack(paramArrayOfByte1, localPByteArray, arrayOfByte2, paramInt2, paramArrayOfByte2, this.fta.vye, (int)l1, localb.ZU(), localz.ver, localz.vyO.getBytes(), localz.vyP.getBytes(), i, paramInt3, localb.dmr()))
            {
              ab.d("MicroMsg.RemoteReq", "summerauths reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(paramInt3) });
              this.fuf = localPByteArray.value;
            }
            this.fta.bufferSize = this.fuf.length;
            paramBoolean = true;
            AppMethodBeat.o(58265);
            break;
          }
          j = paramArrayOfByte3.length;
          continue;
          j = arrayOfByte2.length;
          continue;
          int k = arrayOfByte1.length;
          continue;
          int m = paramArrayOfByte1.length;
          continue;
        }
        paramArrayOfByte1 = null;
        switch (paramInt1)
        {
        default:
          paramInt2 = 0;
          if (paramInt2 == 0)
            break label1644;
          if (localz.dmy())
          {
            paramBoolean = bo.cb(arrayOfByte2);
            if (paramBoolean)
            {
              paramBoolean = false;
              AppMethodBeat.o(58265);
            }
          }
          break;
        case 701:
          paramArrayOfByte1 = ((j.d)this.fta).vxS;
          paramArrayOfByte1 = a(l1, paramArrayOfByte1.wEb, paramArrayOfByte1.wEc);
          paramInt2 = 1;
          break;
        case 702:
          ab.d("MicroMsg.RemoteReq", "summerauth reqToBuf rsaReqData uin[%d]", new Object[] { Long.valueOf(l1) });
          if (l1 == 0L)
          {
            if (j.c.a.vxR != null)
              continue;
            paramInt2 = -1;
            g.RQ();
            g.RN();
            i = com.tencent.mm.kernel.a.QF();
            ab.w("MicroMsg.RemoteReq", "summerauth autoauth uin[%d] is invalid! uinForProtocal[%d] accountUin[%d]", new Object[] { Long.valueOf(l1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
            com.tencent.mm.plugin.report.e.pXa.a(148L, 54L, 1L, true);
            if (paramInt2 != 0)
              com.tencent.mm.plugin.report.e.pXa.a(148L, 55L, 1L, true);
            if (i != 0)
              com.tencent.mm.plugin.report.e.pXa.a(148L, 56L, 1L, true);
          }
          paramArrayOfByte1 = ((j.a)this.fta).vxQ;
          paramArrayOfByte1 = a(l1, paramArrayOfByte1.vIo, paramArrayOfByte1.vIp);
          paramInt2 = 1;
          continue;
          paramInt2 = j.c.a.vxR.ZP();
          continue;
          if (paramArrayOfByte1 == null)
          {
            paramBoolean = false;
            AppMethodBeat.o(58265);
            break;
          }
          if (paramInt1 != 702)
            continue;
          if (MMProtocalJni.packDoubleHybrid(localPByteArray, paramArrayOfByte2, this.fta.vye, (int)l1, localb.ZU(), localz.ver, paramArrayOfByte1[0], paramArrayOfByte1[1], localz.vyO.getBytes(), localz.vyP.getBytes(), adp(), paramInt3, localb.dmr()))
          {
            ab.d("MicroMsg.RemoteReq", "summer reqToBuf packDoubleHybrid AutoAuth using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(paramInt3) });
            this.fuf = localPByteArray.value;
          }
          break;
        }
        this.fta.bufferSize = this.fuf.length;
        paramBoolean = true;
        AppMethodBeat.o(58265);
        break;
        if (!MMProtocalJni.packHybrid(localPByteArray, paramArrayOfByte2, this.fta.vye, (int)l1, localb.ZU(), localz.ver, paramArrayOfByte1[0], paramArrayOfByte1[1], localz.vyO.getBytes(), localz.vyP.getBytes(), adp(), paramInt3, localb.dmr()))
          continue;
        ab.d("MicroMsg.RemoteReq", "summer reqToBuf packHybrid using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(paramInt3) });
        this.fuf = localPByteArray.value;
        continue;
      }
      catch (Exception paramArrayOfByte1)
      {
        ab.e("MicroMsg.RemoteReq", "protobuf build exception, check now! :" + paramArrayOfByte1.getMessage());
        ab.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
        paramBoolean = false;
        AppMethodBeat.o(58265);
      }
      break;
      if (this.fta.vyh != null)
      {
        paramInt2 = 6;
        if (paramBoolean)
          paramInt2 = 7;
        if (this.fta.vyh.a(localPByteArray, paramInt1, paramArrayOfByte2, paramArrayOfByte3, paramInt2))
        {
          this.fuf = localPByteArray.value;
          this.fta.bufferSize = this.fuf.length;
          ab.d("MicroMsg.RemoteReq", "reqToBuf using req.getReqPackControl() ok, len:%d", new Object[] { Integer.valueOf(localPByteArray.value.length) });
        }
        paramBoolean = true;
        AppMethodBeat.o(58265);
        break;
      }
      if ((paramInt1 != 775) && (localz.dmy()) && (bo.cb(arrayOfByte2)))
      {
        ab.e("MicroMsg.RemoteReq", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramInt1) });
        paramBoolean = false;
        AppMethodBeat.o(58265);
        break;
      }
      if (paramInt1 == 775);
      for (paramInt2 = paramInt3 & 0xFFFFFFFD & 0xFFFFFFFB; ; paramInt2 = paramInt3)
      {
        i = 0;
        paramInt3 = i;
        if (!bo.cb(paramArrayOfByte3))
        {
          paramInt3 = i;
          if (!bo.cb(arrayOfByte1))
            paramInt3 = MMProtocalJni.genSignature((int)l1, paramArrayOfByte3, arrayOfByte1);
        }
        if (paramArrayOfByte3 == null);
        for (i = -1; ; i = paramArrayOfByte3.length)
        {
          ab.i("MicroMsg.RemoteReq", "summerauths dkrsa use session :%s  type:%d, flag:%d, ecdh:[%s] signature[%s]", new Object[] { arrayOfByte2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(paramInt3) });
          if (MMProtocalJni.pack(arrayOfByte1, localPByteArray, arrayOfByte2, 0, paramArrayOfByte2, this.fta.vye, (int)l1, localb.ZU(), localz.ver, localz.vyO.getBytes(), localz.vyP.getBytes(), paramInt3, paramInt2, localb.dmr()))
          {
            ab.d("MicroMsg.RemoteReq", "summerauths reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(paramInt2) });
            this.fuf = localPByteArray.value;
          }
          this.fta.bufferSize = this.fuf.length;
          break;
        }
      }
      byte[] arrayOfByte2 = paramArrayOfByte1;
    }
  }

  public final byte[] adk()
  {
    return this.fuf;
  }

  public final byte[] adl()
  {
    return this.fta.bFT;
  }

  public final String adm()
  {
    return this.fta.vyd;
  }

  public final String adn()
  {
    return this.fta.vye;
  }

  public final int ado()
  {
    return this.fta.vyf;
  }

  public final byte[] adp()
  {
    AppMethodBeat.i(58268);
    ab.d("MicroMsg.RemoteReq", "dkrsa getpass type:%d", new Object[] { Integer.valueOf(this.type) });
    byte[] arrayOfByte;
    switch (this.type)
    {
    default:
      if (fue != null)
      {
        arrayOfByte = fue.a(this.fta, this.type);
        if (arrayOfByte != null)
          AppMethodBeat.o(58268);
      }
      break;
    case 701:
    case 702:
    case 381:
    case 126:
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = ((j.d)this.fta).vxS.wEb.vLz.getBuffer().toByteArray();
      AppMethodBeat.o(58268);
      continue;
      arrayOfByte = ((j.a)this.fta).vxQ.vIo.vIq.getBuffer().toByteArray();
      AppMethodBeat.o(58268);
      continue;
      arrayOfByte = ((r.a)this.fta).vyC.vLz.getBuffer().toByteArray();
      AppMethodBeat.o(58268);
      continue;
      arrayOfByte = ((v.a)this.fta).vyI.vLz.getBuffer().toByteArray();
      AppMethodBeat.o(58268);
      continue;
      if (this.fta.vyi != null)
      {
        if (this.fta.vyi == null);
        for (int i = -1; ; i = this.fta.vyi.length)
        {
          ab.d("MicroMsg.RemoteReq", "summerauths getPassKey[%s]", new Object[] { Integer.valueOf(i) });
          arrayOfByte = this.fta.vyi;
          AppMethodBeat.o(58268);
          break;
        }
      }
      arrayOfByte = adl();
      AppMethodBeat.o(58268);
    }
  }

  public final String adq()
  {
    switch (this.type)
    {
    default:
    case 252:
    case 701:
    }
    for (String str = ""; ; str = ((j.d)this.fta).vxS.wEb.vLW)
      return str;
  }

  public final boolean adr()
  {
    AppMethodBeat.i(58270);
    boolean bool = this.fta.adr();
    AppMethodBeat.o(58270);
    return bool;
  }

  public final long ads()
  {
    return this.fta.vyk;
  }

  public final int getClientVersion()
  {
    return this.fta.vyc;
  }

  public final int getCmdId()
  {
    AppMethodBeat.i(58269);
    int i = this.fta.getCmdId();
    AppMethodBeat.o(58269);
    return i;
  }

  public final String getPassword()
  {
    String str;
    switch (this.type)
    {
    default:
      str = "";
    case 252:
    case 701:
    case 126:
    case 877:
    }
    while (true)
    {
      return str;
      str = ((j.d)this.fta).vxS.wEb.vLJ;
      continue;
      str = ((v.a)this.fta).vyI.vLJ;
    }
  }

  public final String getUserName()
  {
    String str;
    switch (this.type)
    {
    default:
      str = "";
    case 702:
    case 763:
    case 252:
    case 701:
    case 126:
    case 877:
    }
    while (true)
    {
      return str;
      str = ((j.a)this.fta).username;
      continue;
      str = ((j.d)this.fta).vxS.wEb.jBB;
      continue;
      str = ((v.a)this.fta).vyI.jBB;
    }
  }

  public final void hB(int paramInt)
  {
    AppMethodBeat.i(58267);
    this.fta.hB(paramInt);
    AppMethodBeat.o(58267);
  }

  public final void kY(int paramInt)
  {
    this.fta.vyc = paramInt;
  }

  public final void kZ(int paramInt)
  {
    this.fta.vyf = paramInt;
  }

  public final void qu(String paramString)
  {
    this.fta.vyd = paramString;
  }

  public final void qv(String paramString)
  {
    this.fta.vye = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.t
 * JD-Core Version:    0.6.2
 */