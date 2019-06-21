package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class k
{
  public static boolean ahT()
  {
    AppMethodBeat.i(58394);
    g.RQ();
    if (bo.nullAsNil((String)g.RP().Ry().get(8195, null)).length() > 0)
    {
      g.RQ();
      if (bo.h((Integer)g.RP().Ry().get(15, null)) != 0)
        break label86;
    }
    label86: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(58394);
      return bool;
    }
  }

  public static void b(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    AppMethodBeat.i(58395);
    t.b localb = new t.b();
    PByteArray localPByteArray1 = new PByteArray();
    PByteArray localPByteArray2 = new PByteArray();
    PInt localPInt1 = new PInt();
    Object localObject = new PInt();
    PInt localPInt2 = new PInt(0);
    PInt localPInt3 = new PInt(255);
    try
    {
      boolean bool1 = MMProtocalJni.unpack(localPByteArray2, paramArrayOfByte1, paramArrayOfByte2, localPByteArray1, localPInt1, (PInt)localObject, localPInt2, localPInt3);
      paramArrayOfByte2 = new java/lang/StringBuilder;
      paramArrayOfByte2.<init>("summerdiz dealWithPushResp unpack ret:");
      ab.i("MicroMsg.NewSyncMgr", bool1 + ", noticeid:" + bool1, new Object[] { Integer.valueOf(localPInt2.value) });
      boolean bool2;
      if (localPInt2.value != 0)
      {
        paramArrayOfByte2 = new com/tencent/mm/g/a/hm;
        paramArrayOfByte2.<init>();
        paramArrayOfByte2.cCo.cCp = localPInt2.value;
        bool2 = com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte2);
        ab.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt2.value), Boolean.valueOf(bool2) });
        localPInt2.value = 0;
      }
      int i;
      if (((PInt)localObject).value == 13)
      {
        g.RQ();
        localObject = g.RO().jQ(3);
        localPByteArray2.value = UtilsJni.AesGcmDecryptWithUncompress((byte[])localObject, localPByteArray2.value);
        paramArrayOfByte2 = new java/lang/StringBuilder;
        paramArrayOfByte2.<init>("summerdiz dealWithPushResp unpack AES_GCM_ENCRYPT serverSession");
        if (localObject == null)
        {
          i = -1;
          paramArrayOfByte2 = paramArrayOfByte2.append(i).append(" new pr[").append(localPByteArray2.value).append(": ");
          if (localPByteArray2.value != null)
            break label350;
          i = -1;
          label305: ab.i("MicroMsg.NewSyncMgr", i + "]");
        }
      }
      else
      {
        if (bool1)
          break label361;
        ab.e("MicroMsg.NewSyncMgr", "unpack push resp failed");
        AppMethodBeat.o(58395);
      }
      while (true)
      {
        return;
        i = localObject.length;
        break;
        label350: i = localPByteArray2.value.length;
        break label305;
        label361: localb.vym = localPInt3.value;
        if (localPInt1.value == -13)
        {
          localb.vyl = localPInt1.value;
          ab.e("MicroMsg.NewSyncMgr", "unpack push resp failed session timeout");
          AppMethodBeat.o(58395);
        }
        else
        {
          i = localb.P(localPByteArray2.value);
          ab.d("MicroMsg.NewSyncMgr", "bufToResp using protobuf ok");
          localb.vyl = i;
          localb.bufferSize = paramArrayOfByte1.length;
          g.RQ();
          paramArrayOfByte2 = bo.anf(bo.nullAsNil((String)g.RP().Ry().get(8195, null)));
          paramArrayOfByte1 = com.tencent.mm.platformtools.aa.a(localb.vyH.vTO);
          g.RQ();
          g.RN().cd(localb.vyH.jBT, localb.vyH.wIy);
          com.tencent.mm.kernel.a.jO(localb.vyH.jBT);
          if ((bo.cb(paramArrayOfByte1)) || (!com.tencent.mm.protocal.aa.k(paramArrayOfByte2, paramArrayOfByte1)))
          {
            ab.e("MicroMsg.NewSyncMgr", "compareKeybuf syncKey failed");
            AppMethodBeat.o(58395);
          }
          else
          {
            ((com.tencent.mm.plugin.zero.b.b)g.K(com.tencent.mm.plugin.zero.b.b.class)).ahW().a(localb, paramInt, paramLong);
            if (localPInt2.value != 0)
            {
              paramArrayOfByte1 = new hm();
              paramArrayOfByte1.cCo.cCp = localPInt2.value;
              bool2 = com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte1);
              ab.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt2.value), Boolean.valueOf(bool2) });
              localPInt2.value = 0;
            }
            AppMethodBeat.o(58395);
          }
        }
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        ab.e("MicroMsg.NewSyncMgr", "unpack push resp failed: %s", new Object[] { paramArrayOfByte1 });
        ab.printErrStackTrace("MicroMsg.NewSyncMgr", paramArrayOfByte1, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.k
 * JD-Core Version:    0.6.2
 */