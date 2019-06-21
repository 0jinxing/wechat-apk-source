package com.tencent.mm.plugin.appbrand.dynamic.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.x;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.protocal.protobuf.cwg;
import com.tencent.mm.protocal.protobuf.qv;
import com.tencent.mm.protocal.protobuf.qw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  private final String appId;
  private final String cvZ;
  private final String hoo;
  private final boolean hop;

  private c(String paramString1, String paramString2, String paramString3)
  {
    this.appId = paramString1;
    this.cvZ = paramString2;
    this.hoo = paramString3;
    this.hop = false;
  }

  public c(String paramString1, String paramString2, String paramString3, byte paramByte)
  {
    this(paramString1, paramString2, paramString3);
  }

  private void o(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(10927);
    ((d)g.K(d.class)).xF().a(this.appId, paramInt, paramString1, paramString2, 0L, 0L);
    AppMethodBeat.o(10927);
  }

  public final int aAa()
  {
    AppMethodBeat.i(10928);
    String str1 = this.appId;
    String str2 = this.cvZ;
    Object localObject = this.hoo;
    b.a locala = new b.a();
    qv localqv = new qv();
    localqv.csB = str1;
    localqv.vXR = str2;
    localqv.vXS = ((String)localObject);
    locala.fsJ = localqv;
    locala.fsK = new qw();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
    locala.fsI = 1124;
    localObject = x.c(locala.acD());
    int i;
    if ((((a.a)localObject).errType != 0) || (((a.a)localObject).errCode != 0))
    {
      ab.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, errType %d, errCode %d, errMsg %s", new Object[] { this.appId, Integer.valueOf(((a.a)localObject).errType), Integer.valueOf(((a.a)localObject).errCode), ((a.a)localObject).aIm });
      i = c.a.hot.ordinal();
      AppMethodBeat.o(10928);
    }
    while (true)
    {
      return i;
      try
      {
        localObject = (qw)((a.a)localObject).fsy;
        if (((qw)localObject).vXT == null)
        {
          ab.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, null wxaapp resp", new Object[] { this.appId });
          i = c.a.hou.ordinal();
          AppMethodBeat.o(10928);
        }
        else
        {
          ab.i("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s", new Object[] { this.appId, Integer.valueOf(((qw)localObject).vXT.luT), Boolean.valueOf(((qw)localObject).vXU), ((qw)localObject).vXV, ((qw)localObject).vXW });
          if (((qw)localObject).vXT.luT != 0)
          {
            i = ((qw)localObject).vXT.luT;
            AppMethodBeat.o(10928);
          }
          else
          {
            if ((((qw)localObject).vXU) && (!bo.isNullOrNil(((qw)localObject).vXW)) && (!bo.isNullOrNil(((qw)localObject).vXV)))
              o(2, ((qw)localObject).vXV, ((qw)localObject).vXW);
            if ((((qw)localObject).vXX) && (!bo.isNullOrNil(((qw)localObject).vXZ)) && (!bo.isNullOrNil(((qw)localObject).vXY)))
              o(10001, ((qw)localObject).vXY, ((qw)localObject).vXZ);
            i = c.a.hoq.ordinal();
            AppMethodBeat.o(10928);
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", localException, "CgiCheckDemoInfo, appId %s, cast response failed", new Object[] { this.appId });
        i = c.a.hou.ordinal();
        AppMethodBeat.o(10928);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.launching.c
 * JD-Core Version:    0.6.2
 */