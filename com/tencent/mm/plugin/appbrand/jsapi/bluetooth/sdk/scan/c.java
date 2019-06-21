package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.os.ParcelUuid;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

final class c
{
  public static final ParcelUuid hFA;
  public static final ParcelUuid hFB;
  public static final ParcelUuid hFC;
  public static final ParcelUuid hFD;
  public static final ParcelUuid hFE;
  public static final ParcelUuid hFF;
  public static final ParcelUuid hFG;
  public static final ParcelUuid hFH;
  public static final ParcelUuid hFI;
  public static final ParcelUuid[] hFJ;
  public static final ParcelUuid hFp;
  public static final ParcelUuid hFq;
  public static final ParcelUuid hFr;
  public static final ParcelUuid hFs;
  public static final ParcelUuid hFt;
  public static final ParcelUuid hFu;
  public static final ParcelUuid hFv;
  public static final ParcelUuid hFw;
  public static final ParcelUuid hFx;
  public static final ParcelUuid hFy;
  public static final ParcelUuid hFz;

  static
  {
    AppMethodBeat.i(94308);
    hFp = ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
    hFq = ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
    hFr = ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
    hFs = ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
    hFt = ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
    hFu = ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
    hFv = ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
    hFw = ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
    hFx = ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
    hFy = ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
    hFz = ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
    hFA = ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
    hFB = ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
    hFC = ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
    hFD = ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
    hFE = ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
    hFF = ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
    hFG = ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
    hFH = ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
    hFI = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    hFJ = new ParcelUuid[] { hFp, hFq, hFr, hFs, hFu, hFw, hFx, hFy, hFB, hFC, hFF, hFG, hFH };
    AppMethodBeat.o(94308);
  }

  public static ParcelUuid ai(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94307);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new IllegalArgumentException("uuidBytes cannot be null");
      AppMethodBeat.o(94307);
      throw paramArrayOfByte;
    }
    int i = paramArrayOfByte.length;
    if ((i != 2) && (i != 4) && (i != 16))
    {
      paramArrayOfByte = new IllegalArgumentException("uuidBytes length invalid - ".concat(String.valueOf(i)));
      AppMethodBeat.o(94307);
      throw paramArrayOfByte;
    }
    if (i == 16)
    {
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.LITTLE_ENDIAN);
      paramArrayOfByte = new ParcelUuid(new UUID(paramArrayOfByte.getLong(8), paramArrayOfByte.getLong(0)));
      AppMethodBeat.o(94307);
      return paramArrayOfByte;
    }
    if (i == 2);
    for (long l = (paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8); ; l = (paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8) + ((paramArrayOfByte[2] & 0xFF) << 16) + ((paramArrayOfByte[3] & 0xFF) << 24))
    {
      paramArrayOfByte = new ParcelUuid(new UUID(hFI.getUuid().getMostSignificantBits() + (l << 32), hFI.getUuid().getLeastSignificantBits()));
      AppMethodBeat.o(94307);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.c
 * JD-Core Version:    0.6.2
 */