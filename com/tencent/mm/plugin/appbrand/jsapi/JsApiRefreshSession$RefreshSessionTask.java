package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.awe;
import com.tencent.mm.protocal.protobuf.awf;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public class JsApiRefreshSession$RefreshSessionTask extends MainProcessTask
{
  public static final Parcelable.Creator<RefreshSessionTask> CREATOR;
  String appId;
  private String errorMsg;
  private int har;
  int hwi;
  m hwj;
  c hxS;
  private int hyB;
  private int hyC;
  private int hyD;
  int hyE;

  static
  {
    AppMethodBeat.i(130552);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(130552);
  }

  public JsApiRefreshSession$RefreshSessionTask()
  {
  }

  public JsApiRefreshSession$RefreshSessionTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130543);
    g(paramParcel);
    AppMethodBeat.o(130543);
  }

  public final void asP()
  {
    AppMethodBeat.i(130544);
    aBV();
    b.a locala = new b.a();
    locala.fsJ = new awe();
    locala.fsK = new awf();
    locala.uri = "/cgi-bin/mmbiz-bin/js-refreshsession";
    locala.fsI = 1196;
    locala.fsL = 0;
    locala.fsM = 0;
    awe localawe = new awe();
    localawe.fKh = this.appId;
    localawe.wzF = this.har;
    locala.fsJ = localawe;
    if (this.hyE > 0)
    {
      localawe.wzG = new cxh();
      localawe.wzG.scene = this.hyE;
    }
    ab.i("MicroMsg.JsApiRefreshSession", "refreshSession appId %s, versionType, statScene %d", new Object[] { this.appId, Integer.valueOf(this.har), Integer.valueOf(this.hyE) });
    w.a(locala.acD(), new w.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ai.m paramAnonymousm)
      {
        AppMethodBeat.i(130541);
        ab.d("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          JsApiRefreshSession.RefreshSessionTask.b(JsApiRefreshSession.RefreshSessionTask.this, 0);
          JsApiRefreshSession.RefreshSessionTask.a(JsApiRefreshSession.RefreshSessionTask.this, "cgi fail");
          JsApiRefreshSession.RefreshSessionTask.a(JsApiRefreshSession.RefreshSessionTask.this);
          AppMethodBeat.o(130541);
          return 0;
        }
        paramAnonymousb = (awf)paramAnonymousb.fsH.fsP;
        if (paramAnonymousb == null)
        {
          JsApiRefreshSession.RefreshSessionTask.b(JsApiRefreshSession.RefreshSessionTask.this, 0);
          ab.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest failed, response is null!");
          JsApiRefreshSession.RefreshSessionTask.b(JsApiRefreshSession.RefreshSessionTask.this);
        }
        while (true)
        {
          AppMethodBeat.o(130541);
          break;
          JsApiRefreshSession.RefreshSessionTask.c(JsApiRefreshSession.RefreshSessionTask.this, paramAnonymousb.wzH.cyE);
          JsApiRefreshSession.RefreshSessionTask.a(JsApiRefreshSession.RefreshSessionTask.this, paramAnonymousb.wzH.cyF);
          if (JsApiRefreshSession.RefreshSessionTask.c(JsApiRefreshSession.RefreshSessionTask.this) == 0)
          {
            JsApiRefreshSession.RefreshSessionTask.d(JsApiRefreshSession.RefreshSessionTask.this, paramAnonymousb.wzV);
            JsApiRefreshSession.RefreshSessionTask.c(JsApiRefreshSession.RefreshSessionTask.this, paramAnonymousb.wzH.cyE);
            JsApiRefreshSession.RefreshSessionTask.b(JsApiRefreshSession.RefreshSessionTask.this, 1);
            JsApiRefreshSession.RefreshSessionTask.d(JsApiRefreshSession.RefreshSessionTask.this);
          }
          else
          {
            JsApiRefreshSession.RefreshSessionTask.c(JsApiRefreshSession.RefreshSessionTask.this, paramAnonymousb.wzH.cyE);
            JsApiRefreshSession.RefreshSessionTask.b(JsApiRefreshSession.RefreshSessionTask.this, 2);
            ab.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest ERROR %s", new Object[] { paramAnonymousString });
            JsApiRefreshSession.RefreshSessionTask.e(JsApiRefreshSession.RefreshSessionTask.this);
          }
        }
      }
    }
    , true);
    AppMethodBeat.o(130544);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130545);
    HashMap localHashMap = new HashMap();
    switch (this.hyD)
    {
    default:
      if (!bo.isNullOrNil(this.errorMsg))
        break;
    case 1:
    case 2:
    }
    for (String str = "fail"; ; str = String.format("fail:%s", new Object[] { this.errorMsg }))
    {
      localHashMap.put("errCode", "-1");
      this.hxS.M(this.hwi, this.hwj.j(str, localHashMap));
      while (true)
      {
        aBW();
        AppMethodBeat.o(130545);
        return;
        localHashMap.put("expireIn", this.hyB);
        localHashMap.put("errCode", this.hyC);
        this.hxS.M(this.hwi, this.hwj.j("ok", localHashMap));
      }
      if (bo.isNullOrNil(this.errorMsg));
      for (str = "fail"; ; str = String.format("fail:%s", new Object[] { this.errorMsg }))
      {
        localHashMap.put("errCode", this.hyC);
        this.hxS.M(this.hwi, this.hwj.j(str, localHashMap));
        break;
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130546);
    this.hyB = paramParcel.readInt();
    this.hyC = paramParcel.readInt();
    this.hyD = paramParcel.readInt();
    this.hwi = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.har = paramParcel.readInt();
    this.hyE = paramParcel.readInt();
    this.errorMsg = paramParcel.readString();
    AppMethodBeat.o(130546);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130547);
    paramParcel.writeInt(this.hyB);
    paramParcel.writeInt(this.hyC);
    paramParcel.writeInt(this.hyD);
    paramParcel.writeInt(this.hwi);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.har);
    paramParcel.writeInt(this.hyE);
    paramParcel.writeString(this.errorMsg);
    AppMethodBeat.o(130547);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession.RefreshSessionTask
 * JD-Core Version:    0.6.2
 */