package com.tencent.mm.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class y
{
  private static final byte[] gdN;
  public m gdO;

  static
  {
    AppMethodBeat.i(58643);
    gdN = o.fZ(7);
    AppMethodBeat.o(58643);
  }

  public final void onPush(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58642);
    StringBuilder localStringBuilder = new StringBuilder("onNotify, datalen=");
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      ab.i("MicroMsg.MMNativeNetNotifyAdapter", i + " cmd= " + paramInt);
      switch (paramInt)
      {
      default:
      case 5:
      case 24:
      case 39:
      case 11:
      case 61:
      case 8:
      case 12:
      case 120:
      case 122:
      case 1000000205:
      case 192:
      case 268369923:
      case 241:
      case 244:
      case 319:
      case 311:
      case 318:
      }
    }
    while (true)
    {
      label192: AppMethodBeat.o(58642);
      while (true)
      {
        return;
        i = paramArrayOfByte.length;
        break;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "old notify");
        this.gdO.e(138, gdN);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush new notify [%s]", new Object[] { bo.ca(paramArrayOfByte) });
        this.gdO.e(138, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do synccheck");
        this.gdO.e(39, null);
        AppMethodBeat.o(58642);
        continue;
        AppMethodBeat.o(58642);
        continue;
        this.gdO.e(174, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        if (paramArrayOfByte.length <= 0)
          break label192;
        this.gdO.e(10, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "MM_PKT_VOIP_REQ");
        if (paramArrayOfByte.length <= 0)
          break label192;
        this.gdO.e(120, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush MM_PKT_PUSH_DATA_REQ");
        if (paramArrayOfByte.length <= 0)
          break label192;
        this.gdO.e(268369921, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        this.gdO.e(1000000205, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        this.gdO.e(192, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do oob do notify");
        this.gdO.e(268369923, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "jacks do voice notify PUSH");
        this.gdO.e(241, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "pandy do gamesync notify");
        this.gdO.e(244, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "hy: on notify new year shake");
        this.gdO.e(319, paramArrayOfByte);
        AppMethodBeat.o(58642);
        continue;
        ab.i("MicroMsg.MMNativeNetNotifyAdapter", "on notify F2F data");
        this.gdO.e(311, paramArrayOfByte);
        AppMethodBeat.o(58642);
      }
      ab.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on silence notify");
      this.gdO.e(318, paramArrayOfByte);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.y
 * JD-Core Version:    0.6.2
 */