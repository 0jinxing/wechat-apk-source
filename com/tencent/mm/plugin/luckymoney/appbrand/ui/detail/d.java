package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.a.c;
import com.tencent.mm.protocal.protobuf.ash;
import com.tencent.mm.protocal.protobuf.bhk;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements a
{
  private String appId;
  boolean isLoading;
  b nSW;
  private String nSX;
  int nSY;
  final List<ash> nSZ;

  public d()
  {
    AppMethodBeat.i(42042);
    this.nSY = 0;
    this.isLoading = false;
    this.nSZ = new LinkedList();
    AppMethodBeat.o(42042);
  }

  private static bhk aY(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42043);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.e("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom failed. No data found.");
      AppMethodBeat.o(42043);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      bhk localbhk = new bhk();
      try
      {
        localbhk.parseFrom(paramArrayOfByte);
        ab.i("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom succeed.");
        AppMethodBeat.o(42043);
        paramArrayOfByte = localbhk;
      }
      catch (IOException paramArrayOfByte)
      {
        ab.e("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom failed. IOException: %s", new Object[] { paramArrayOfByte });
        AppMethodBeat.o(42043);
        paramArrayOfByte = null;
      }
    }
  }

  private void xK(int paramInt)
  {
    AppMethodBeat.i(42046);
    new c(this.appId, this.nSX, paramInt).b(new d.1(this, paramInt));
    AppMethodBeat.o(42046);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(42044);
    ab.i("MicroMsg.WxaLuckyMoneyLogicDetail", "onDestroy() called");
    this.nSW = null;
    AppMethodBeat.o(42044);
  }

  public final void xI(int paramInt)
  {
    AppMethodBeat.i(42045);
    if (this.nSW == null)
    {
      ab.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage ui == null");
      AppMethodBeat.o(42045);
    }
    while (true)
    {
      return;
      if (paramInt < this.nSZ.size())
      {
        ab.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage. offset = [%d], list.size() = [%d], skip load", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.nSZ.size()) });
        AppMethodBeat.o(42045);
      }
      else if (this.isLoading)
      {
        ab.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. is loading now...");
        AppMethodBeat.o(42045);
      }
      else if (this.nSY == 0)
      {
        ab.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. do not has more...");
        AppMethodBeat.o(42045);
      }
      else
      {
        ab.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage load");
        this.isLoading = true;
        xK(paramInt);
        AppMethodBeat.o(42045);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.d
 * JD-Core Version:    0.6.2
 */