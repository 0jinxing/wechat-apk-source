package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.t;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.yk;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class q$a$1
  implements l.a
{
  q$a$1(q.a parama, l.d paramd)
  {
  }

  public final boolean a(PByteArray paramPByteArray, int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2)
  {
    AppMethodBeat.i(79995);
    paramArrayOfByte2 = (l.b)this.vyz;
    long l1 = this.vyz.vyb;
    if ((b.dnO()) && (l1 == 0L))
      l1 = d.vxn;
    while (true)
    {
      Object localObject1 = this.vyz.vyj;
      yk localyk;
      Object localObject2;
      boolean bool;
      if (paramInt1 == 722)
      {
        ab.e("MicroMsg.MMEncryptCheckResUpdate", "MMEncryptCheckResUpdate reqToBuf rsaReqData");
        localyk = ((q.a)this.vyz).vyy;
        localObject2 = t.a(l1, localyk.wej, localyk.wek);
        if (localObject2 == null)
        {
          bool = false;
          AppMethodBeat.o(79995);
        }
      }
      while (true)
      {
        return bool;
        localyk = localObject2[0];
        localObject2 = localObject2[1];
        if (MMProtocalJni.packHybrid(paramPByteArray, paramArrayOfByte1, this.vyz.vye, (int)l1, paramArrayOfByte2.ZU(), ((z)localObject1).ver, localyk, (byte[])localObject2, ((z)localObject1).vyO.getBytes(), ((z)localObject1).vyP.getBytes(), this.vyz.vyi, paramInt2, ((q.a)this.vyz).fsO))
        {
          ab.d("MicroMsg.MMEncryptCheckResUpdate", "IRemoteReqDelegate reqToBuf packHybrid using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(paramPByteArray.value.length), Integer.valueOf(paramInt2) });
          bool = true;
          AppMethodBeat.o(79995);
          continue;
          if (paramInt1 == 784)
          {
            ab.i("MicroMsg.MMEncryptCheckResUpdate", "summerauths rsaInfo[%s] EcdhMgr.USE_ECDH[%s] engine[%s]", new Object[] { Integer.valueOf(((z)localObject1).ver), Boolean.valueOf(f.vxx), Long.valueOf(((l.b)this.vyz).ads()) });
            ((l.b)this.vyz).ZU();
            paramPByteArray = new PByteArray();
            localObject1 = ((l.b)this.vyz).ZT();
            if (localObject1 == null)
            {
              ab.f("MicroMsg.MMEncryptCheckResUpdate", "protobuf is null");
              bool = false;
              AppMethodBeat.o(79995);
              continue;
            }
            long l2 = f.bK(null);
            this.vyz.vyk = l2;
            localObject1 = UtilsJni.HybridEcdhEncrypt(l2, (byte[])localObject1);
            bool = MMProtocalJni.packHybridEcdh(paramPByteArray, paramArrayOfByte1, this.vyz.vye, (int)l1, paramArrayOfByte2.ZU(), f.vxC, (byte[])localObject1, paramInt2, paramArrayOfByte2.dmr());
            ab.d("MicroMsg.MMEncryptCheckResUpdate", "summerauths MMFunc_SecMMEncryptCheckResUpdate reqToBuf packHybridEcdh using protobuf ok, jType:%d, cert:%d len:%d, flag:%d ret:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(f.vxC), Integer.valueOf(paramPByteArray.value.length), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
            AppMethodBeat.o(79995);
          }
        }
        else
        {
          bool = false;
          AppMethodBeat.o(79995);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.q.a.1
 * JD-Core Version:    0.6.2
 */