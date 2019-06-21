package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.x;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.protocal.protobuf.cwg;
import com.tencent.mm.protocal.protobuf.qv;
import com.tencent.mm.protocal.protobuf.qw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class am
{
  private final String appId;
  private final String cvZ;
  private final String hoo;
  private final boolean hop;

  public am(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    this.appId = paramString1;
    this.cvZ = paramString2;
    this.hoo = paramString3;
    this.hop = paramBoolean;
  }

  private void o(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(131998);
    if ((f.auV().a(this.appId, paramInt, paramString1, paramString2, 0L, 0L)) && (this.hop))
      h.bt(this.appId, 2);
    AppMethodBeat.o(131998);
  }

  public final int aAa()
  {
    AppMethodBeat.i(131999);
    String str1 = this.appId;
    String str2 = this.cvZ;
    String str3 = this.hoo;
    Object localObject = new b.a();
    qv localqv = new qv();
    localqv.csB = str1;
    localqv.vXR = str2;
    localqv.vXS = str3;
    ((b.a)localObject).fsJ = localqv;
    ((b.a)localObject).fsK = new qw();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
    ((b.a)localObject).fsI = 1124;
    localObject = x.c(((b.a)localObject).acD());
    int i;
    if ((((a.a)localObject).errType != 0) || (((a.a)localObject).errCode != 0))
    {
      ab.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, errType %d, errCode %d, errMsg %s", new Object[] { this.appId, Integer.valueOf(((a.a)localObject).errType), Integer.valueOf(((a.a)localObject).errCode), ((a.a)localObject).aIm });
      i = am.a.iiN.ordinal();
      AppMethodBeat.o(131999);
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
          i = am.a.iiO.ordinal();
          AppMethodBeat.o(131999);
        }
        else
        {
          ab.i("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s", new Object[] { this.appId, Integer.valueOf(((qw)localObject).vXT.luT), Boolean.valueOf(((qw)localObject).vXU), ((qw)localObject).vXV, ((qw)localObject).vXW });
          if (((qw)localObject).vXT.luT != 0)
          {
            i = ((qw)localObject).vXT.luT;
            AppMethodBeat.o(131999);
          }
          else
          {
            if ((((qw)localObject).vXU) && (!bo.isNullOrNil(((qw)localObject).vXW)) && (!bo.isNullOrNil(((qw)localObject).vXV)))
              o(2, ((qw)localObject).vXV, ((qw)localObject).vXW);
            if ((((qw)localObject).vXX) && (!bo.isNullOrNil(((qw)localObject).vXZ)) && (!bo.isNullOrNil(((qw)localObject).vXY)))
              o(10001, ((qw)localObject).vXY, ((qw)localObject).vXZ);
            if (!bo.isNullOrNil(((qw)localObject).vYa))
              ((l)f.E(l.class)).n(this.appId, 2, ((qw)localObject).vYa);
            i = am.a.iiK.ordinal();
            AppMethodBeat.o(131999);
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", localException, "CgiCheckDemoInfo, appId %s, cast response failed", new Object[] { this.appId });
        i = am.a.iiO.ordinal();
        AppMethodBeat.o(131999);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.am
 * JD-Core Version:    0.6.2
 */