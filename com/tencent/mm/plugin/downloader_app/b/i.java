package com.tencent.mm.plugin.downloader_app.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.c.a.a.f;
import com.tencent.mm.plugin.downloader.c.b.a;
import com.tencent.mm.plugin.downloader.c.b.b;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends e
{
  public String appId = "";
  public String appName;
  public boolean gBF = false;
  public boolean hNO = true;
  public String iconUrl;
  public String jumpUrl;
  public boolean kOZ;
  public String kPa;
  public int kPb = 0;
  public b kPc;
  public f kPd;
  public a kPe;
  public boolean kci = false;
  public String packageName;
  public int position;
  public int type;

  public i()
  {
  }

  public i(int paramInt)
  {
    this.type = paramInt;
  }

  public final int biK()
  {
    return this.type;
  }

  public final boolean biN()
  {
    if ((this.type == 2) || (this.type == 4) || (this.type == 6));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(136146);
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof i)) && (!bo.isNullOrNil(((i)paramObject).appId)) && (!bo.isNullOrNil(this.appId)))
    {
      bool = ((i)paramObject).appId.equals(this.appId);
      AppMethodBeat.o(136146);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136146);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.i
 * JD-Core Version:    0.6.2
 */