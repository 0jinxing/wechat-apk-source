package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.lx;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.network.t;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.protocal.x.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;

public final class g
{
  public static String J(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57815);
    if (bo.cb(paramArrayOfByte))
    {
      paramArrayOfByte = "buf is nullOrNil";
      AppMethodBeat.o(57815);
    }
    while (true)
    {
      return paramArrayOfByte;
      if (paramArrayOfByte.length == 1)
      {
        paramArrayOfByte = "buf.len is 1: " + Integer.toHexString(paramArrayOfByte[0]);
        AppMethodBeat.o(57815);
      }
      else
      {
        paramArrayOfByte = "buf last two[len:" + paramArrayOfByte.length + "]: %s, %s" + Integer.toHexString(paramArrayOfByte[(paramArrayOfByte.length - 2)] & 0xFF) + ", " + Integer.toHexString(paramArrayOfByte[(paramArrayOfByte.length - 1)] & 0xFF);
        AppMethodBeat.o(57815);
      }
    }
  }

  public static boolean a(int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    AppMethodBeat.i(57809);
    ab.i("MicroMsg.NotifySyncMgr", "dealWithNotify Here, MM should NOT bOotEd , opType:%d respType:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    boolean bool1;
    if (paramInt1 == 1)
    {
      eQ(2L);
      bool1 = true;
      AppMethodBeat.o(57809);
    }
    while (true)
    {
      return bool1;
      if (paramInt1 == 2)
        break;
      bool1 = false;
      AppMethodBeat.o(57809);
    }
    switch (paramInt2)
    {
    default:
    case 2147480001:
    case 268369921:
    case 138:
    case 1000000205:
    }
    while (true)
    {
      bool1 = true;
      AppMethodBeat.o(57809);
      break;
      eQ(7L);
      continue;
      if ((bo.cb(paramArrayOfByte1)) || (paramArrayOfByte1.length <= 8))
      {
        ab.e("MicroMsg.NotifySyncMgr", "dkpush dealWithNotify respBuf error ");
      }
      else
      {
        int i = o.t(paramArrayOfByte1, 0);
        paramInt1 = o.t(paramArrayOfByte1, 4);
        ab.d("MicroMsg.NotifySyncMgr", "dkpush: flag:" + i + " bufLen:" + paramInt1 + " dump:" + bo.W(paramArrayOfByte1, 8));
        if (paramInt1 != paramArrayOfByte1.length - 8)
        {
          ab.e("MicroMsg.NotifySyncMgr", "dkpush: respBuf length error len:" + paramArrayOfByte1.length);
        }
        else
        {
          Object localObject1 = new byte[paramInt1];
          System.arraycopy(paramArrayOfByte1, 8, localObject1, 0, paramInt1);
          Object localObject2 = new t.b();
          PByteArray localPByteArray1 = new PByteArray();
          PByteArray localPByteArray2 = new PByteArray();
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          paramArrayOfByte1 = new PInt(0);
          PInt localPInt3 = new PInt(255);
          try
          {
            boolean bool2 = MMProtocalJni.unpack(localPByteArray2, (byte[])localObject1, paramArrayOfByte2, localPByteArray1, localPInt1, localPInt2, paramArrayOfByte1, localPInt3);
            if (paramArrayOfByte1.value != 0)
            {
              paramArrayOfByte2 = new com/tencent/mm/g/a/hm;
              paramArrayOfByte2.<init>();
              paramArrayOfByte2.cCo.cCp = paramArrayOfByte1.value;
              bool1 = com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte2);
              ab.i("MicroMsg.NotifySyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(paramArrayOfByte1.value), Boolean.valueOf(bool1) });
              paramArrayOfByte1.value = 0;
            }
            if ((localPInt2.value == 13) && (com.tencent.mm.network.aa.ano() != null) && (com.tencent.mm.network.aa.ano().gcU != null))
            {
              paramArrayOfByte2 = com.tencent.mm.network.aa.ano().gcU.jQ(3);
              localPByteArray2.value = UtilsJni.AesGcmDecryptWithUncompress(paramArrayOfByte2, localPByteArray2.value);
              if (paramArrayOfByte2 == null)
              {
                paramInt1 = -1;
                label473: paramArrayOfByte2 = localPByteArray2.value;
                if (localPByteArray2.value != null)
                  break label639;
                paramInt2 = -1;
                label489: ab.i("MicroMsg.NotifySyncMgr", "summerdiz dealWithPushResp unpack AES_GCM_ENCRYPT serverSession[%s] new pr[%s, %s]", new Object[] { Integer.valueOf(paramInt1), paramArrayOfByte2, Integer.valueOf(paramInt2) });
              }
            }
            else
            {
              if (bool2)
                break label649;
              ab.e("MicroMsg.NotifySyncMgr", "unpack push resp failed");
            }
          }
          catch (Exception paramArrayOfByte2)
          {
            ab.e("MicroMsg.NotifySyncMgr", "unpack push resp failed: %s", new Object[] { paramArrayOfByte2 });
            ab.printErrStackTrace("MicroMsg.NotifySyncMgr", paramArrayOfByte2, "", new Object[0]);
          }
          while (paramArrayOfByte1.value != 0)
          {
            paramArrayOfByte2 = new hm();
            paramArrayOfByte2.cCo.cCp = paramArrayOfByte1.value;
            bool1 = com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte2);
            ab.i("MicroMsg.NotifySyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(paramArrayOfByte1.value), Boolean.valueOf(bool1) });
            paramArrayOfByte1.value = 0;
            break;
            paramInt1 = paramArrayOfByte2.length;
            break label473;
            label639: paramInt2 = localPByteArray2.value.length;
            break label489;
            label649: ((l.e)localObject2).vym = localPInt3.value;
            if (localPInt1.value == -13)
            {
              ((l.e)localObject2).vyl = localPInt1.value;
              ab.e("MicroMsg.NotifySyncMgr", "unpack push resp failed session timeout");
              break;
            }
            paramInt1 = ((l.c)localObject2).P(localPByteArray2.value);
            ab.d("MicroMsg.NotifySyncMgr", "bufToResp using protobuf ok");
            ((l.e)localObject2).vyl = paramInt1;
            ((l.e)localObject2).bufferSize = localObject1.length;
            paramArrayOfByte2 = bo.anf(ah.getContext().getSharedPreferences("notify_sync_pref", h.Mu()).getString("notify_sync_key_keybuf", ""));
            localObject1 = com.tencent.mm.platformtools.aa.a(((t.b)localObject2).vyH.vTO);
            if ((bo.cb((byte[])localObject1)) || (!com.tencent.mm.protocal.aa.k(paramArrayOfByte2, (byte[])localObject1)))
            {
              ab.e("MicroMsg.NotifySyncMgr", "compareKeybuf syncKey failed");
              break;
            }
            paramArrayOfByte2 = new com/tencent/mm/modelmulti/b;
            paramArrayOfByte2.<init>((t.b)localObject2, i, paramLong);
            localObject1 = com.tencent.mm.network.aa.ano();
            localObject2 = new com/tencent/mm/booter/g$1;
            ((g.1)localObject2).<init>();
            paramArrayOfByte2.a((com.tencent.mm.network.e)localObject1, (f)localObject2);
          }
          if (paramArrayOfByte1 == null);
          for (paramLong = 7L; ; paramLong = o.t(paramArrayOfByte1, 0))
          {
            eQ(paramLong);
            break;
          }
          paramArrayOfByte2 = new x.b();
          try
          {
            paramArrayOfByte2.P(paramArrayOfByte1);
            eQ(paramArrayOfByte2.vyM);
          }
          catch (Exception paramArrayOfByte1)
          {
            ab.printErrStackTrace("MicroMsg.NotifySyncMgr", paramArrayOfByte1, "", new Object[0]);
          }
        }
      }
    }
  }

  public static byte[] a(PInt paramPInt, int paramInt)
  {
    AppMethodBeat.i(57811);
    String str1 = ij(paramInt);
    int i = jH(str1);
    int j = 1;
    if (j <= i)
    {
      String str2 = str1 + "/syncResp.bin" + j;
      if (com.tencent.mm.a.e.ct(str2))
      {
        byte[] arrayOfByte1 = com.tencent.mm.a.e.f(str2, 0, -1);
        byte[] arrayOfByte2 = arrayOfByte1;
        if (bo.cb(arrayOfByte1))
        {
          ab.w("MicroMsg.NotifySyncMgr", "readFile getdata null, read again");
          arrayOfByte2 = com.tencent.mm.a.e.f(str2, 0, -1);
        }
        str2 = com.tencent.mm.a.g.x((q.LK() + paramInt).getBytes());
        arrayOfByte1 = l.c(arrayOfByte2, str2.getBytes());
        ab.i("MicroMsg.NotifySyncMgr", "readFile, index:[%d of %d], dump data:%s -> %s, key:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), J(arrayOfByte2), J(arrayOfByte1), J(str2.getBytes()) });
        if (!bo.cb(arrayOfByte1))
        {
          paramPInt.value = j;
          AppMethodBeat.o(57811);
          paramPInt = arrayOfByte1;
        }
      }
    }
    while (true)
    {
      return paramPInt;
      j++;
      break;
      paramPInt = null;
      AppMethodBeat.o(57811);
    }
  }

  public static void bO(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57812);
    String str = ij(paramInt2);
    paramInt2 = jH(str);
    com.tencent.mm.a.e.deleteFile(str + "/syncResp.bin" + paramInt1);
    ab.i("MicroMsg.NotifySyncMgr", "consumeData delIndex:%d, total index:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == paramInt2)
    {
      com.tencent.mm.a.e.deleteFile(str + "/syncResp.ini");
      ab.i("MicroMsg.NotifySyncMgr", "consumeData: has consme all respdata");
    }
    AppMethodBeat.o(57812);
  }

  private static void eQ(long paramLong)
  {
    AppMethodBeat.i(57810);
    ab.i("MicroMsg.NotifySyncMgr", "dealWithSelector, selector = ".concat(String.valueOf(paramLong)));
    Object localObject;
    if ((0x100 & paramLong) != 0L)
    {
      localObject = new rv();
      ((rv)localObject).cNO.cvp = 4;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    if ((0x200000 & paramLong) != 0L)
    {
      localObject = new lx();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    if ((0xFFFFFEFF & paramLong & 0xFFDFFFFF & 0x2) != 0L)
      new com.tencent.mm.modelmulti.b().a(com.tencent.mm.network.aa.ano(), new g.2());
    AppMethodBeat.o(57810);
  }

  public static String ij(int paramInt)
  {
    AppMethodBeat.i(57814);
    String str = com.tencent.mm.a.g.x("mm".concat(String.valueOf(paramInt)).getBytes());
    str = ac.eSj + str + "/pushSyncResp";
    com.tencent.mm.a.e.cw(str);
    AppMethodBeat.o(57814);
    return str;
  }

  public static int jH(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(57813);
    paramString = com.tencent.mm.a.e.f(paramString + "/syncResp.ini", 0, -1);
    if (bo.cb(paramString))
      AppMethodBeat.o(57813);
    while (true)
    {
      return i;
      try
      {
        String str = new java/lang/String;
        str.<init>(paramString);
        int j = Integer.parseInt(str);
        i = j;
        AppMethodBeat.o(57813);
      }
      catch (NumberFormatException paramString)
      {
        AppMethodBeat.o(57813);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.g
 * JD-Core Version:    0.6.2
 */