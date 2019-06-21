package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class f
{
  public HashMap<Long, f.a> lwJ;

  public f()
  {
    AppMethodBeat.i(19581);
    this.lwJ = new HashMap();
    AppMethodBeat.o(19581);
  }

  private void hY(long paramLong)
  {
    AppMethodBeat.i(19589);
    b localb = ad.boW().Ku(String.valueOf(paramLong));
    if (localb == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "get harddevice info from db failed : %d", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(19589);
    }
    while (true)
    {
      return;
      f.a locala = new f.a();
      locala.lwK = paramLong;
      locala.lwM = localb.field_authBuf;
      locala.bFT = localb.field_sessionKey;
      locala.lwL = localb.field_sessionBuf;
      locala.cwz = localb.field_brandName;
      locala.mURL = localb.field_url;
      locala.cxs = 0;
      locala.lwN = false;
      this.lwJ.put(Long.valueOf(paramLong), locala);
      ab.i("MicroMsg.exdevice.ExdeviceInfoManager", "not contains the device info, device id = %d, load from db", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(19589);
    }
  }

  public final void b(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(19591);
    if ((paramLong < 0L) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      boolean bool;
      if (paramArrayOfByte == null)
      {
        bool = true;
        if (paramArrayOfByte != null)
          break label82;
      }
      label82: for (paramInt = -1; ; paramInt = paramArrayOfByte.length)
      {
        ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "device id low than 0 or authbuf is null, deviceid = %d, buffer == null : %b, buffer length = %d", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bool), Integer.valueOf(paramInt) });
        AppMethodBeat.o(19591);
        return;
        bool = false;
        break;
      }
    }
    f.a locala1 = (f.a)this.lwJ.get(Long.valueOf(paramLong));
    f.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new f.a();
      locala2.lwK = paramLong;
    }
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "unkown buffer type : %d", new Object[] { Integer.valueOf(paramInt) });
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.lwJ.put(Long.valueOf(paramLong), locala2);
      AppMethodBeat.o(19591);
      break;
      locala2.lwM = paramArrayOfByte;
      continue;
      locala2.bFT = paramArrayOfByte;
      continue;
      locala2.lwL = paramArrayOfByte;
    }
  }

  public final boolean hR(long paramLong)
  {
    AppMethodBeat.i(19582);
    boolean bool;
    if (hS(paramLong) == 2)
    {
      bool = true;
      AppMethodBeat.o(19582);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(19582);
    }
  }

  public final int hS(long paramLong)
  {
    AppMethodBeat.i(19583);
    int i;
    if (this.lwJ.containsKey(Long.valueOf(paramLong)))
    {
      i = ((f.a)this.lwJ.get(Long.valueOf(paramLong))).cxs;
      AppMethodBeat.o(19583);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(19583);
    }
  }

  public final f.a hT(long paramLong)
  {
    AppMethodBeat.i(19584);
    if (!this.lwJ.containsKey(Long.valueOf(paramLong)))
      hY(paramLong);
    f.a locala = (f.a)this.lwJ.get(Long.valueOf(paramLong));
    AppMethodBeat.o(19584);
    return locala;
  }

  public final f.a hU(long paramLong)
  {
    AppMethodBeat.i(19585);
    f.a locala;
    if (this.lwJ.containsKey(Long.valueOf(paramLong)))
    {
      locala = (f.a)this.lwJ.get(Long.valueOf(paramLong));
      AppMethodBeat.o(19585);
    }
    while (true)
    {
      return locala;
      locala = new f.a();
      locala.lwK = paramLong;
      locala.lwM = null;
      locala.bFT = null;
      locala.lwL = null;
      locala.cwz = null;
      locala.mURL = null;
      locala.cxs = 0;
      locala.lwN = false;
      locala.jGw = 0L;
      this.lwJ.put(Long.valueOf(paramLong), locala);
      AppMethodBeat.o(19585);
    }
  }

  public final boolean hV(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19586);
    ab.i("MicroMsg.exdevice.ExdeviceInfoManager", "setDeviceAuthFlag, device id = %d", new Object[] { Long.valueOf(paramLong) });
    f.a locala = hT(paramLong);
    if (locala == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
      AppMethodBeat.o(19586);
    }
    while (true)
    {
      return bool;
      locala.lwN = true;
      AppMethodBeat.o(19586);
      bool = true;
    }
  }

  public final boolean hW(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19587);
    ab.i("MicroMsg.exdevice.ExdeviceInfoManager", "delDeviceAuthFlag, device id = %d", new Object[] { Long.valueOf(paramLong) });
    f.a locala = hT(paramLong);
    if (locala == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
      AppMethodBeat.o(19587);
    }
    while (true)
    {
      return bool;
      locala.lwN = false;
      AppMethodBeat.o(19587);
      bool = true;
    }
  }

  public final boolean hX(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19588);
    ab.i("MicroMsg.exdevice.ExdeviceInfoManager", "isDeviceAuthed, device id = %d", new Object[] { Long.valueOf(paramLong) });
    f.a locala = hT(paramLong);
    if (locala == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
      AppMethodBeat.o(19588);
    }
    while (true)
    {
      return bool;
      bool = locala.lwN;
      AppMethodBeat.o(19588);
    }
  }

  public final byte[] o(long paramLong, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(19590);
    if (paramLong < 0L)
    {
      ab.e("MicroMsg.exdevice.ExdeviceInfoManager", "device is lower than 0");
      AppMethodBeat.o(19590);
    }
    for (Object localObject2 = localObject1; ; localObject2 = localObject1)
    {
      return localObject2;
      f.a locala = (f.a)this.lwJ.get(Long.valueOf(paramLong));
      localObject2 = locala;
      if (locala == null)
      {
        hY(paramLong);
        localObject2 = (f.a)this.lwJ.get(Long.valueOf(paramLong));
      }
      if (localObject2 != null)
        break;
      AppMethodBeat.o(19590);
    }
    switch (paramInt)
    {
    default:
      localObject2 = null;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(19590);
      break;
      localObject2 = ((f.a)localObject2).lwM;
      continue;
      localObject2 = ((f.a)localObject2).bFT;
      continue;
      localObject2 = ((f.a)localObject2).lwL;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.f
 * JD-Core Version:    0.6.2
 */