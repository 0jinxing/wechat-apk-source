package com.tencent.mm.plugin.exdevice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.exdevice.e.f;
import com.tencent.mm.plugin.exdevice.e.g;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;
import java.util.zip.CRC32;

public final class e extends d
{
  public e(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    AppMethodBeat.i(19042);
    ab.i("MicroMsg.exdevice.ExDeviceCmdInit", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    AppMethodBeat.o(19042);
  }

  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(19044);
    ab.i("MicroMsg.exdevice.ExDeviceCmdInit", "------initResponse------ errorCode = %d, errMsg = %s, filter = %s, challenge = %s, initScene = %d, second = %d", new Object[] { Integer.valueOf(paramInt1), paramString, b.aN(paramArrayOfByte1), b.aN(paramArrayOfByte2), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    g localg = new g();
    localg.lvk = as(0, "ok");
    paramString = r.Yz();
    long l;
    label159: label196: int i;
    if (!bo.isNullOrNil(paramString))
    {
      paramString = ag.ck(paramString).toLowerCase();
      ab.i("MicroMsg.exdevice.Util", "user md5 : [%s]", new Object[] { paramString });
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.exdevice.Util", "get hash code failed, value is null or nill");
        l = 0L;
        paramString = new int[] { (int)(l >> 32 & 0xFFFFFFFF), (int)(l & 0xFFFFFFFF) };
        localg.luX = paramString[0];
        localg.luY = paramString[1];
        if (!bo.cb(paramArrayOfByte2))
        {
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0))
            break label530;
          paramInt1 = 0;
          localg.luZ = paramInt1;
        }
        if (!bo.cb(paramArrayOfByte1))
        {
          if ((paramArrayOfByte1[0] & 0x4) != 0)
            localg.jBG = com.tencent.mm.protocal.d.vxj;
          if ((paramArrayOfByte1[0] & 0x8) != 0)
            localg.lve = com.tencent.mm.protocal.d.vxm;
          if ((paramArrayOfByte1[0] & 0x2) != 0)
            localg.lvd = 2;
          if ((paramArrayOfByte1[0] & 0x10) != 0)
            localg.lvf = ((int)bo.anT());
          if ((paramArrayOfByte1[0] & 0x20) != 0)
          {
            paramString = TimeZone.getDefault();
            i = paramString.getRawOffset() / 1000;
            if ((!paramString.useDaylightTime()) || (!paramString.inDaylightTime(new Date(System.currentTimeMillis()))))
              break label553;
          }
        }
      }
    }
    label530: label553: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      int j = i / 3600 + paramInt1;
      ab.i("MicroMsg.exdevice.Util", "getTimeZone, rawSecond = %d, dt = %d, re = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(j) });
      localg.lvg = j;
      if ((paramArrayOfByte1[0] & 0x40) != 0)
        localg.lvh = b.bqh();
      if ((paramArrayOfByte1[0] & 0x1) != 0)
        localg.lvc = r.YB();
      localg.lva = paramInt2;
      localg.lvb = paramInt3;
      this.lqD = localg;
      this.lqB = ((short)20003);
      AppMethodBeat.o(19044);
      return;
      j = 0;
      paramInt1 = 0;
      paramString = paramString.toCharArray();
      if (paramString.length > 0)
        for (i = 0; ; i++)
        {
          j = paramInt1;
          if (i >= paramString.length)
            break;
          paramInt1 = paramInt1 * 31 + paramString[i];
        }
      l = j & 0xFFFFFFFF;
      ab.i("MicroMsg.exdevice.Util", "get int hashcode value = %d, long hashcode = %d", new Object[] { Integer.valueOf(j), Long.valueOf(l) });
      break;
      paramString = null;
      break label159;
      paramString = new CRC32();
      paramString.update(paramArrayOfByte2);
      paramInt1 = (int)paramString.getValue();
      break label196;
    }
  }

  protected final a aL(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19043);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.e("MicroMsg.exdevice.ExDeviceCmdInit", "data is null");
      AppMethodBeat.o(19043);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      f localf = new f();
      try
      {
        localf.parseFrom(paramArrayOfByte);
        ab.i("MicroMsg.exdevice.ExDeviceCmdInit", "------Init Request parse is ok------ ");
        this.lqE = localf;
        AppMethodBeat.o(19043);
        paramArrayOfByte = localf;
      }
      catch (IOException paramArrayOfByte)
      {
        ab.e("MicroMsg.exdevice.ExDeviceCmdInit", "pase error : " + paramArrayOfByte.getMessage());
        ab.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdInit", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(19043);
        paramArrayOfByte = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.e
 * JD-Core Version:    0.6.2
 */