package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.protobuf.avu;
import com.tencent.mm.protocal.protobuf.avw;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.a.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiAuthorize extends f
{
  private static final int CTRL_INDEX = 54;
  private static final String NAME = "authorize";

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.h paramh, JSONObject paramJSONObject, int paramInt, d paramd)
  {
    AppMethodBeat.i(130853);
    ab.d("MicroMsg.JsApiAuthorize", "stev JsApiAuthorize!");
    AuthorizeTask localAuthorizeTask = new AuthorizeTask();
    localAuthorizeTask.appId = paramh.getAppId();
    localAuthorizeTask.hBU = "authorize";
    Object localObject = paramh.getRuntime().ye();
    if (localObject != null)
      localAuthorizeTask.har = ((com.tencent.mm.plugin.appbrand.config.h)localObject).hhd.gVt;
    localObject = com.tencent.mm.plugin.appbrand.a.wK(paramh.getAppId());
    if (localObject != null)
      AuthorizeTask.a(localAuthorizeTask, ((AppBrandStatObject)localObject).scene);
    paramJSONObject = paramJSONObject.toString();
    localAuthorizeTask.hBQ = this;
    localAuthorizeTask.hBR = paramh;
    localAuthorizeTask.data = paramJSONObject;
    localAuthorizeTask.hwi = paramInt;
    localAuthorizeTask.hBS = paramd;
    localAuthorizeTask.hCe = new Bundle();
    if ((paramh instanceof q))
      localAuthorizeTask.hCf = 1;
    while (true)
    {
      localAuthorizeTask.aBV();
      AppBrandMainProcessService.a(localAuthorizeTask);
      AppMethodBeat.o(130853);
      return;
      if ((paramh instanceof u))
        localAuthorizeTask.hCf = 2;
    }
  }

  static class AuthorizeTask extends MainProcessTask
  {
    public static final Parcelable.Creator<AuthorizeTask> CREATOR;
    public String aIm;
    public String appId;
    public String data;
    public int errCode;
    f hBQ;
    com.tencent.mm.plugin.appbrand.jsapi.h hBR;
    d hBS;
    public ArrayList<String> hBT;
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
    public int har;
    public int hwi;
    private int hyE;
    public String mAppName;

    static
    {
      AppMethodBeat.i(130852);
      CREATOR = new JsApiAuthorize.AuthorizeTask.3();
      AppMethodBeat.o(130852);
    }

    public AuthorizeTask()
    {
    }

    public AuthorizeTask(Parcel paramParcel)
    {
      AppMethodBeat.i(130838);
      g(paramParcel);
      AppMethodBeat.o(130838);
    }

    private void AH(String paramString)
    {
      AppMethodBeat.i(130841);
      if (TextUtils.isEmpty(paramString))
        this.hBQ.b(this.hBR, this.hwi, "fail auth cancel");
      while (true)
      {
        this.hBS.aCB();
        AppMethodBeat.o(130841);
        return;
        this.hBQ.b(this.hBR, this.hwi, paramString);
      }
    }

    public final void asP()
    {
      AppMethodBeat.i(130839);
      JsApiAuthorize.AuthorizeTask.1 local1 = new JsApiAuthorize.AuthorizeTask.1(this);
      Object localObject2;
      Object localObject3;
      int i;
      if (this.hBU.equals("authorize"))
        try
        {
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>(this.data);
          localObject3 = new org/json/JSONArray;
          ((JSONArray)localObject3).<init>(((JSONObject)localObject2).optString("scope"));
          localObject2 = new LinkedList();
          for (i = 0; i < ((JSONArray)localObject3).length(); i++)
            ((LinkedList)localObject2).add(((JSONArray)localObject3).optString(i));
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.JsApiAuthorize", "Exception %s", new Object[] { localException.getMessage() });
          this.hBV = "fail";
          aCb();
          AppMethodBeat.o(130839);
        }
      while (true)
      {
        return;
        Object localObject1 = new com.tencent.mm.z.a.a(this.appId, (LinkedList)localObject2, this.har, this.hyE, new JsApiAuthorize.AuthorizeTask.4(this, localException));
        if (((com.tencent.mm.z.a.a)localObject1).Qq().wzG == null)
          ((com.tencent.mm.z.a.a)localObject1).Qq().wzG = new cxh();
        ((com.tencent.mm.z.a.a)localObject1).Qq().wzG.xsJ = this.hCf;
        g.Rg().a((m)localObject1, 0);
        AppMethodBeat.o(130839);
        continue;
        if (this.hBU.equals("authorizeConfirm"))
        {
          localObject3 = this.appId;
          localObject2 = this.hBT;
          int j = this.har;
          i = this.hBW;
          localObject1 = new b((String)localObject3, f.k((ArrayList)localObject2), j, i, this.hyE, new JsApiAuthorize.AuthorizeTask.5(this, (JsApiAuthorize.AuthorizeTask.a)localObject1, i));
          if (((b)localObject1).Qs().wzG == null)
            ((b)localObject1).Qs().wzG = new cxh();
          ((b)localObject1).Qs().wzG.xsJ = this.hCf;
          g.Rg().a((m)localObject1, 0);
        }
        AppMethodBeat.o(130839);
      }
    }

    public final void asQ()
    {
      AppMethodBeat.i(130840);
      aBW();
      if (!this.hBR.isRunning())
      {
        this.hBS.aCB();
        AppMethodBeat.o(130840);
      }
      while (true)
      {
        return;
        if (this.hBV.equals("ok"))
        {
          this.hBQ.b(this.hBR, this.hwi, "ok");
          this.hBS.aCB();
          AppMethodBeat.o(130840);
        }
        else
        {
          Object localObject;
          if (this.hBV.equals("fail"))
          {
            if (bo.isNullOrNil(this.aIm));
            for (localObject = String.format("fail:login error %s", new Object[] { Integer.valueOf(this.errCode) }); ; localObject = String.format("fail:%s", new Object[] { this.aIm }))
            {
              this.hBQ.b(this.hBR, this.hwi, (String)localObject);
              this.hBS.aCB();
              AppMethodBeat.o(130840);
              break;
            }
          }
          if (this.hBV.equals("needConfirm"))
          {
            LinkedList localLinkedList = new LinkedList();
            int i = 0;
            while (true)
            {
              if (i >= this.hCd)
                break label325;
              localObject = this.hCe.getByteArray(String.valueOf(i));
              buj localbuj = new buj();
              try
              {
                localbuj.parseFrom((byte[])localObject);
                localLinkedList.add(localbuj);
                i++;
              }
              catch (IOException localIOException)
              {
                ab.e("MicroMsg.JsApiAuthorize", "IOException %s", new Object[] { localIOException.getMessage() });
                ab.printErrStackTrace("MicroMsg.JsApiAuthorize", localIOException, "", new Object[0]);
                this.hBQ.b(this.hBR, this.hwi, "fail:internal error scope error");
                this.hBS.aCB();
                AppMethodBeat.o(130840);
              }
            }
            continue;
            label325: if (localLinkedList.size() > 0)
            {
              al.d(new JsApiAuthorize.AuthorizeTask.2(this, localLinkedList));
              AppMethodBeat.o(130840);
            }
            else
            {
              this.hBQ.b(this.hBR, this.hwi, "fail:internal error scope empty");
              this.hBS.aCB();
            }
          }
          else
          {
            AppMethodBeat.o(130840);
          }
        }
      }
    }

    public final void g(Parcel paramParcel)
    {
      AppMethodBeat.i(130842);
      this.data = paramParcel.readString();
      this.hwi = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.hBV = paramParcel.readString();
      this.hBU = paramParcel.readString();
      this.mAppName = paramParcel.readString();
      this.hBX = paramParcel.readString();
      this.hCd = paramParcel.readInt();
      this.hCe = paramParcel.readBundle(JsApiAuthorize.class.getClassLoader());
      this.hBT = paramParcel.createStringArrayList();
      this.har = paramParcel.readInt();
      this.hBW = paramParcel.readInt();
      this.hyE = paramParcel.readInt();
      this.hCf = paramParcel.readInt();
      this.errCode = paramParcel.readInt();
      this.aIm = paramParcel.readString();
      this.hCa = paramParcel.readString();
      this.hBZ = paramParcel.readString();
      this.hBY = paramParcel.readString();
      this.hCb = paramParcel.readString();
      this.hCc = paramParcel.readString();
      AppMethodBeat.o(130842);
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(130843);
      paramParcel.writeString(this.data);
      paramParcel.writeInt(this.hwi);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.hBV);
      paramParcel.writeString(this.hBU);
      paramParcel.writeString(this.mAppName);
      paramParcel.writeString(this.hBX);
      paramParcel.writeInt(this.hCd);
      paramParcel.writeBundle(this.hCe);
      paramParcel.writeStringList(this.hBT);
      paramParcel.writeInt(this.har);
      paramParcel.writeInt(this.hBW);
      paramParcel.writeInt(this.hyE);
      paramParcel.writeInt(this.hCf);
      paramParcel.writeInt(this.errCode);
      paramParcel.writeString(this.aIm);
      paramParcel.writeString(this.hCa);
      paramParcel.writeString(this.hBZ);
      paramParcel.writeString(this.hBY);
      paramParcel.writeString(this.hCb);
      paramParcel.writeString(this.hCc);
      AppMethodBeat.o(130843);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize
 * JD-Core Version:    0.6.2
 */