package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.widget.b.h.d;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class JsApiOperateWXData$OperateWXDataTask extends MainProcessTask
{
  public static final Parcelable.Creator<OperateWXDataTask> CREATOR;
  public String appId;
  f hBQ;
  com.tencent.mm.plugin.appbrand.jsapi.h hBR;
  d hBS;
  public String hBU;
  public String hBV;
  public int hBW;
  public String hBX;
  public String hBY;
  public String hBZ;
  public String hCa;
  public String hCb;
  public String hCc;
  public int hCd;
  public Bundle hCe;
  int hCf;
  public String hCo;
  public String hCp;
  public String hCq;
  public int har;
  public int hwi;
  int hyE;
  public String mAppName;

  static
  {
    AppMethodBeat.i(130894);
    CREATOR = new JsApiOperateWXData.OperateWXDataTask.3();
    AppMethodBeat.o(130894);
  }

  public JsApiOperateWXData$OperateWXDataTask()
  {
    this.hCc = "";
    this.hCb = "";
  }

  public JsApiOperateWXData$OperateWXDataTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130883);
    this.hCc = "";
    this.hCb = "";
    g(paramParcel);
    AppMethodBeat.o(130883);
  }

  private void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, JsApiOperateWXData.OperateWXDataTask.a parama)
  {
    AppMethodBeat.i(130888);
    paramString1 = new c(paramString1, paramString2, paramString3, paramInt1, paramInt2, this.hyE, new JsApiOperateWXData.OperateWXDataTask.4(this, parama, paramInt2, paramString2));
    paramString1.pm(this.hCf);
    g.Rg().a(paramString1, 0);
    AppMethodBeat.o(130888);
  }

  public final void asP()
  {
    AppMethodBeat.i(130884);
    JsApiOperateWXData.OperateWXDataTask.1 local1 = new JsApiOperateWXData.OperateWXDataTask.1(this);
    if (this.hBU.equals("operateWXData"))
    {
      a(this.appId, this.hCo, "", this.har, this.hBW, local1);
      AppMethodBeat.o(130884);
    }
    while (true)
    {
      return;
      if (this.hBU.equals("operateWXDataConfirm"))
        a(this.appId, this.hCo, this.hCq, this.har, this.hBW, local1);
      AppMethodBeat.o(130884);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130885);
    aBW();
    if (!this.hBR.isRunning())
    {
      this.hBS.aCB();
      AppMethodBeat.o(130885);
    }
    while (true)
    {
      return;
      Object localObject;
      if (this.hBV.equals("ok"))
      {
        localObject = new HashMap();
        ((Map)localObject).put("data", this.hCp);
        this.hBR.M(this.hwi, this.hBQ.j("ok", (Map)localObject));
        this.hBS.aCB();
        AppMethodBeat.o(130885);
      }
      else if (this.hBV.contains("fail"))
      {
        this.hBQ.b(this.hBR, this.hwi, this.hBV);
        this.hBS.aCB();
        AppMethodBeat.o(130885);
      }
      else if (this.hBV.equals("needConfirm"))
      {
        localObject = new LinkedList();
        int i = 0;
        while (true)
        {
          if (i >= this.hCd)
            break label293;
          byte[] arrayOfByte = this.hCe.getByteArray(String.valueOf(i));
          buj localbuj = new buj();
          try
          {
            localbuj.parseFrom(arrayOfByte);
            ((LinkedList)localObject).add(localbuj);
            i++;
          }
          catch (IOException localIOException)
          {
            ab.e("MicroMsg.JsApiOperateWXData", "IOException %s", new Object[] { localIOException.getMessage() });
            ab.printErrStackTrace("MicroMsg.JsApiOperateWXData", localIOException, "", new Object[0]);
            this.hBQ.b(this.hBR, this.hwi, "fail");
            this.hBS.aCB();
            AppMethodBeat.o(130885);
          }
        }
        continue;
        label293: if (localIOException.size() > 0)
        {
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(130880);
              buj localbuj = (buj)localIOException.getFirst();
              Object localObject = new JsApiOperateWXData.OperateWXDataTask.2.1(this);
              com.tencent.mm.plugin.appbrand.widget.b.h localh = new com.tencent.mm.plugin.appbrand.widget.b.h(f.a(JsApiOperateWXData.OperateWXDataTask.this.hBR), (h.d)localObject);
              localh.Ez(JsApiOperateWXData.OperateWXDataTask.this.mAppName);
              localh.EA(localbuj.Desc);
              localh.EC(JsApiOperateWXData.OperateWXDataTask.this.hBY);
              localh.ED(JsApiOperateWXData.OperateWXDataTask.this.hBZ);
              localh.EE(JsApiOperateWXData.OperateWXDataTask.this.hCa);
              localh.jl(JsApiOperateWXData.OperateWXDataTask.this.hBX);
              if ("scope.userInfo".equals(localbuj.vOF))
              {
                localObject = e.hBN;
                e.a.a(JsApiOperateWXData.OperateWXDataTask.this.hBR.getContext(), com.tencent.mm.ah.d.qi(JsApiOperateWXData.OperateWXDataTask.this.hCb), JsApiOperateWXData.OperateWXDataTask.this.hCc, localbuj.vOF, localh);
              }
              while (true)
              {
                JsApiOperateWXData.OperateWXDataTask.this.hBR.asF().b(localh);
                AppMethodBeat.o(130880);
                return;
                localh.EF(localbuj.vOF);
              }
            }
          });
          AppMethodBeat.o(130885);
        }
        else
        {
          this.hBQ.b(this.hBR, this.hwi, "fail");
          this.hBS.aCB();
        }
      }
      else
      {
        AppMethodBeat.o(130885);
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130886);
    this.appId = paramParcel.readString();
    this.hBV = paramParcel.readString();
    this.mAppName = paramParcel.readString();
    this.hBX = paramParcel.readString();
    this.hCo = paramParcel.readString();
    this.hCp = paramParcel.readString();
    this.hwi = paramParcel.readInt();
    this.hBU = paramParcel.readString();
    this.hCq = paramParcel.readString();
    this.hCd = paramParcel.readInt();
    this.hCe = paramParcel.readBundle(JsApiOperateWXData.class.getClassLoader());
    this.har = paramParcel.readInt();
    this.hBW = paramParcel.readInt();
    this.hyE = paramParcel.readInt();
    this.hCf = paramParcel.readInt();
    this.hCc = paramParcel.readString();
    this.hCb = paramParcel.readString();
    this.hCa = paramParcel.readString();
    this.hBZ = paramParcel.readString();
    this.hBY = paramParcel.readString();
    AppMethodBeat.o(130886);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130887);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hBV);
    paramParcel.writeString(this.mAppName);
    paramParcel.writeString(this.hBX);
    paramParcel.writeString(this.hCo);
    paramParcel.writeString(this.hCp);
    paramParcel.writeInt(this.hwi);
    paramParcel.writeString(this.hBU);
    paramParcel.writeString(this.hCq);
    paramParcel.writeInt(this.hCd);
    paramParcel.writeBundle(this.hCe);
    paramParcel.writeInt(this.har);
    paramParcel.writeInt(this.hBW);
    paramParcel.writeInt(this.hyE);
    paramParcel.writeInt(this.hCf);
    paramParcel.writeString(this.hCc);
    paramParcel.writeString(this.hCb);
    paramParcel.writeString(this.hCa);
    paramParcel.writeString(this.hBZ);
    paramParcel.writeString(this.hBY);
    AppMethodBeat.o(130887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask
 * JD-Core Version:    0.6.2
 */