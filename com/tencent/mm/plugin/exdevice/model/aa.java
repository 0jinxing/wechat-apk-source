package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.service.j.a;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.ip;
import com.tencent.mm.protocal.protobuf.iq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class aa extends j.a
  implements f
{
  static Object cli;
  private static final byte[] ltL;
  private static aa ltM;
  static LinkedList<String> ltQ;
  private static HashMap<String, iq> ltR;
  final ap gGo;
  boolean lsZ;
  volatile String lst;
  aa.a ltN;
  HashMap<String, byte[]> ltO;
  LinkedList<m> ltP;

  static
  {
    AppMethodBeat.i(19366);
    ltL = new byte[] { -2, 1, 1 };
    cli = new Object();
    ltQ = new LinkedList();
    ltR = new HashMap(32);
    AppMethodBeat.o(19366);
  }

  private aa()
  {
    AppMethodBeat.i(19360);
    this.ltO = new HashMap();
    this.ltP = new LinkedList();
    this.gGo = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(19358);
        ab.i("MicroMsg.exdevice.ScanDeviceLogic", "Restart scanning...");
        ad.bpd().a(0, aa.this);
        AppMethodBeat.o(19358);
        return true;
      }
    }
    , true);
    this.lsZ = false;
    AppMethodBeat.o(19360);
  }

  private void a(iq paramiq)
  {
    AppMethodBeat.i(19364);
    if (paramiq == null)
    {
      ab.e("MicroMsg.exdevice.ScanDeviceLogic", "item null..");
      AppMethodBeat.o(19364);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramiq.vKF))
      {
        ab.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
        AppMethodBeat.o(19364);
      }
      else if (paramiq.Ret != 0)
      {
        ab.e("MicroMsg.exdevice.ScanDeviceLogic", "device(%s) is invalid", new Object[] { paramiq.vKF });
        AppMethodBeat.o(19364);
      }
      else if ((paramiq.vKM == null) || (bo.isNullOrNil(paramiq.vKM.jBE)))
      {
        ab.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid device id(mac=%s)", new Object[] { paramiq.vKF });
        AppMethodBeat.o(19364);
      }
      else
      {
        if ((!bo.isNullOrNil(paramiq.vKM.vIk)) && (paramiq.vKM.vIk.equals(this.lst)))
          break;
        ab.e("MicroMsg.exdevice.ScanDeviceLogic", "device type (%s) is not equal to brand name (%s)", new Object[] { paramiq.jBF, this.lst });
        AppMethodBeat.o(19364);
      }
    }
    byte[] arrayOfByte = (byte[])this.ltO.get(paramiq.vKF);
    String str1 = paramiq.vKF;
    String str2 = paramiq.vKM.vIk;
    Object localObject = paramiq.vKM.jBE;
    String str3 = paramiq.jBF;
    int i;
    if (arrayOfByte == null)
    {
      i = 0;
      label246: ab.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, BatchSearch find mac=%s, deviceType=%s, deviceId=%s, %s, %s", new Object[] { str1, str2, localObject, str3, Integer.valueOf(i) });
      if (this.ltN == null)
        break label336;
      if (arrayOfByte == null)
        break label352;
    }
    label336: label352: for (localObject = aM(arrayOfByte); ; localObject = null)
    {
      this.ltN.a(paramiq.vKM.jBE, (byte[])localObject, false);
      AppMethodBeat.o(19364);
      break;
      i = arrayOfByte.length;
      break label246;
      ab.e("MicroMsg.exdevice.ScanDeviceLogic", "mCallback null");
      AppMethodBeat.o(19364);
      break;
    }
  }

  private static byte[] aM(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19365);
    byte[] arrayOfByte = null;
    int i = 0;
    int j = 0;
    try
    {
      while (i < paramArrayOfByte.length - 2)
      {
        k = i + 1;
        int m = paramArrayOfByte[i];
        if (m == 0)
          break;
        i = k + 1;
        switch (paramArrayOfByte[k])
        {
        default:
          i += m - 1;
          break;
        case -1:
          ab.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data size = %s", new Object[] { Integer.valueOf(m) });
          arrayOfByte = new byte[m - 1];
          while (m > 1)
          {
            if ((j >= 32) || (j >= arrayOfByte.length))
              break label244;
            int n = j + 1;
            k = i + 1;
            arrayOfByte[j] = ((byte)paramArrayOfByte[i]);
            i = n;
            j = k;
            k = m - 1;
            m = i;
            i = j;
            j = m;
            m = k;
          }
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("hakon, Manufacturer Specific Data %s");
          ab.i("MicroMsg.exdevice.ScanDeviceLogic", b.aN(arrayOfByte));
        }
      }
      AppMethodBeat.o(19365);
      return arrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.ScanDeviceLogic", paramArrayOfByte, "", new Object[0]);
        ab.e("MicroMsg.exdevice.ScanDeviceLogic", "EX in parseBroadcastPacket %s", new Object[] { paramArrayOfByte.getMessage() });
        AppMethodBeat.o(19365);
        arrayOfByte = null;
        continue;
        label244: int k = j;
        j = i;
        i = k;
      }
    }
  }

  public static aa boT()
  {
    AppMethodBeat.i(19359);
    aa localaa;
    if (ltM != null)
    {
      localaa = ltM;
      AppMethodBeat.o(19359);
    }
    while (true)
    {
      return localaa;
      localaa = new aa();
      ltM = localaa;
      AppMethodBeat.o(19359);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String arg5, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19362);
    if (this.ltO.containsKey(paramString2))
      AppMethodBeat.o(19362);
    while (true)
    {
      return;
      if (paramString2 == null)
      {
        ab.w("MicroMsg.exdevice.ScanDeviceLogic", "deviceMac is null");
        AppMethodBeat.o(19362);
      }
      else
      {
        paramString1 = paramString2.replaceAll(":", "");
        ??? = ltL;
        if ((bo.cb(paramArrayOfByte)) || (bo.cb(???)) || (???.length > paramArrayOfByte.length))
        {
          paramInt1 = -1;
          label88: if (paramInt1 == -1)
            break label278;
          if (paramInt1 + 9 > paramArrayOfByte.length)
            break label265;
          ??? = new byte[paramInt1 + 9];
          System.arraycopy(paramArrayOfByte, 0, ???, 0, ???.length);
          ab.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, scanFound mac:%s, realAd:%s", new Object[] { paramString1, b.aN(???) });
          this.ltO.put(paramString1, ???);
          label157: paramString1 = this.lst + "_" + paramString2;
          if (ltR.containsKey(paramString1))
            break label396;
        }
        synchronized (cli)
        {
          if (ltQ.contains(paramString1))
          {
            ab.d("MicroMsg.exdevice.ScanDeviceLogic", "hakon, already doing");
            AppMethodBeat.o(19362);
            continue;
            for (paramInt2 = 0; ; paramInt2++)
            {
              if (paramInt2 >= paramArrayOfByte.length)
                break label260;
              paramInt1 = paramInt2;
              if (b.c(paramArrayOfByte, paramInt2, ???))
                break;
            }
            label260: paramInt1 = -1;
            break label88;
            label265: this.ltO.put(paramString1, null);
            break label157;
            label278: this.ltO.put(paramString1, null);
            break label157;
          }
          ltQ.add(paramString1);
          ??? = this.lst;
          paramString2 = new k(new String[] { paramString2 }, ???);
          if (aw.Rg().a(paramString2, 0))
          {
            this.ltP.add(paramString2);
            AppMethodBeat.o(19362);
          }
        }
        ltQ.remove(paramString1);
        ab.e("MicroMsg.exdevice.ScanDeviceLogic", "MMCore.getNetSceneQueue().doScene failed!!!");
        AppMethodBeat.o(19362);
        continue;
        label396: ab.d("MicroMsg.exdevice.ScanDeviceLogic", "hakon, hit cache %s, %s", new Object[] { this.lst, paramString2 });
        a((iq)ltR.get(paramString1));
        AppMethodBeat.o(19362);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String arg3, m paramm)
  {
    AppMethodBeat.i(19363);
    Object localObject;
    if (paramm == null)
    {
      localObject = "";
      ab.i("MicroMsg.exdevice.ScanDeviceLogic", "onSceneEnd, %s, errType=%d, errCode=%d, errMsg=%s", new Object[] { localObject, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ??? });
      this.ltP.remove(paramm);
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramm != null))
        break label101;
      ab.e("MicroMsg.exdevice.ScanDeviceLogic", "do scene failed!!!");
      AppMethodBeat.o(19363);
    }
    while (true)
    {
      return;
      localObject = Integer.valueOf(paramm.getType());
      break;
      label101: if (542 == paramm.getType())
      {
        paramm = ((k)paramm).boO().vKJ.iterator();
        while (paramm.hasNext())
        {
          localObject = (iq)paramm.next();
          if (bo.isNullOrNil(((iq)localObject).vKF))
          {
            ab.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
          }
          else
          {
            String str = this.lst + "_" + ((iq)localObject).vKF;
            synchronized (cli)
            {
              if (ltQ.contains(str))
                ltQ.remove(str);
              if (!ltR.containsKey(str))
              {
                ab.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, put into cache, %s", new Object[] { str });
                ltR.put(str, localObject);
              }
              a((iq)localObject);
            }
          }
        }
      }
      AppMethodBeat.o(19363);
    }
  }

  public final void uK(int paramInt)
  {
    AppMethodBeat.i(19361);
    ab.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice %s, stopTimer", new Object[] { Integer.valueOf(paramInt) });
    this.gGo.stopTimer();
    if (this.lsZ)
    {
      ad.bpd().uJ(paramInt);
      this.lsZ = false;
      this.lst = null;
      this.ltO.clear();
      aw.Rg().b(542, this);
      Iterator localIterator = this.ltP.iterator();
      while (localIterator.hasNext())
      {
        ??? = (m)localIterator.next();
        if (??? != null)
          aw.Rg().c((m)???);
      }
      this.ltP.clear();
      if (this.ltN != null)
        this.ltN.a(null, null, true);
      this.ltN = null;
    }
    synchronized (cli)
    {
      ltQ.clear();
      AppMethodBeat.o(19361);
      return;
      ab.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice has been stoped");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.aa
 * JD-Core Version:    0.6.2
 */