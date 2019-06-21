package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.protocal.protobuf.avy;
import com.tencent.mm.protocal.protobuf.awa;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.a.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class JsApiLogin$LoginTask extends MainProcessTask
{
  public static final Parcelable.Creator<LoginTask> CREATOR;
  public String aIm;
  public String appId;
  public String code;
  public String data;
  public int errCode;
  public int gwX;
  f hBQ;
  h hBR;
  d hBS;
  public ArrayList<String> hBT;
  public String hBU;
  public String hBV;
  public int hBW;
  public String hBX;
  public int hCd;
  public Bundle hCe;
  int hCf;
  public int har;
  public int hwi;
  public int hyE;
  public String hzR;
  public String mAppName;

  static
  {
    AppMethodBeat.i(130871);
    CREATOR = new JsApiLogin.LoginTask.3();
    AppMethodBeat.o(130871);
  }

  public JsApiLogin$LoginTask()
  {
  }

  public JsApiLogin$LoginTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130862);
    g(paramParcel);
    AppMethodBeat.o(130862);
  }

  public final void asP()
  {
    AppMethodBeat.i(130863);
    Object localObject1 = new JsApiLogin.LoginTask.1(this);
    Object localObject2;
    if (this.hBU.equals("login"))
    {
      ab.i("MicroMsg.JsApiLogin", "start login");
      localObject2 = new LinkedList();
      this.gwX = 1;
      this.hzR = "";
      localObject1 = new c(this.appId, (LinkedList)localObject2, this.gwX, "", this.hzR, this.har, this.hyE, new JsApiLogin.LoginTask.4(this, (a)localObject1));
      if (((c)localObject1).Qu().wzG == null)
        ((c)localObject1).Qu().wzG = new cxh();
      ((c)localObject1).Qu().wzG.xsJ = this.hCf;
      g.Rg().a((m)localObject1, 0);
      AppMethodBeat.o(130863);
    }
    while (true)
    {
      return;
      if (this.hBU.equals("loginConfirm"))
      {
        ab.i("MicroMsg.JsApiLogin", "start loginConfirm");
        String str1 = this.appId;
        localObject2 = this.hBT;
        int i = this.gwX;
        String str2 = this.hzR;
        int j = this.har;
        int k = this.hBW;
        localObject1 = new com.tencent.mm.z.a.d(str1, f.k((ArrayList)localObject2), i, str2, j, k, this.hyE, new JsApiLogin.LoginTask.5(this, (a)localObject1, k));
        if (((com.tencent.mm.z.a.d)localObject1).Qw().wzG == null)
          ((com.tencent.mm.z.a.d)localObject1).Qw().wzG = new cxh();
        ((com.tencent.mm.z.a.d)localObject1).Qw().wzG.xsJ = this.hCf;
        g.Rg().a((m)localObject1, 0);
      }
      AppMethodBeat.o(130863);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130864);
    aBW();
    if (!this.hBR.isRunning())
    {
      this.hBS.aCB();
      AppMethodBeat.o(130864);
    }
    while (true)
    {
      return;
      Object localObject;
      if (this.hBV.equals("ok"))
      {
        localObject = new HashMap();
        ((Map)localObject).put("code", this.code);
        localObject = this.hBQ.j("ok", (Map)localObject);
        this.hBR.M(this.hwi, (String)localObject);
        this.hBS.aCB();
        AppMethodBeat.o(130864);
      }
      else
      {
        if (this.hBV.equals("fail"))
        {
          if (bo.isNullOrNil(this.aIm));
          for (localObject = String.format("fail:login error %s", new Object[] { Integer.valueOf(this.errCode) }); ; localObject = String.format("fail:%s", new Object[] { this.aIm }))
          {
            this.hBQ.b(this.hBR, this.hwi, (String)localObject);
            this.hBS.aCB();
            AppMethodBeat.o(130864);
            break;
          }
        }
        if (this.hBV.equals("needConfirm"))
        {
          localObject = new LinkedList();
          int i = 0;
          while (true)
          {
            if (i >= this.hCd)
              break label346;
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
              ab.e("MicroMsg.JsApiLogin", "parse scope info error %s", new Object[] { localIOException.getMessage() });
              ab.printErrStackTrace("MicroMsg.JsApiLogin", localIOException, "", new Object[0]);
              this.hBQ.b(this.hBR, this.hwi, "fail:internal error scope error");
              this.hBS.aCB();
              AppMethodBeat.o(130864);
            }
          }
          continue;
          label346: if (localIOException.size() > 0)
          {
            al.d(new JsApiLogin.LoginTask.2(this, localIOException));
            AppMethodBeat.o(130864);
          }
          else
          {
            this.hBQ.b(this.hBR, this.hwi, "fail:internal error scope empty");
            this.hBS.aCB();
          }
        }
        else
        {
          AppMethodBeat.o(130864);
        }
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130865);
    this.data = paramParcel.readString();
    this.hwi = paramParcel.readInt();
    this.hBU = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.code = paramParcel.readString();
    this.hBV = paramParcel.readString();
    this.hzR = paramParcel.readString();
    this.gwX = paramParcel.readInt();
    this.mAppName = paramParcel.readString();
    this.hBX = paramParcel.readString();
    this.hCd = paramParcel.readInt();
    this.hCe = paramParcel.readBundle(JsApiLogin.class.getClassLoader());
    this.hBT = paramParcel.createStringArrayList();
    this.har = paramParcel.readInt();
    this.hBW = paramParcel.readInt();
    this.hyE = paramParcel.readInt();
    this.hCf = paramParcel.readInt();
    this.errCode = paramParcel.readInt();
    this.aIm = paramParcel.readString();
    AppMethodBeat.o(130865);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130866);
    paramParcel.writeString(this.data);
    paramParcel.writeInt(this.hwi);
    paramParcel.writeString(this.hBU);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.code);
    paramParcel.writeString(this.hBV);
    paramParcel.writeString(this.hzR);
    paramParcel.writeInt(this.gwX);
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
    AppMethodBeat.o(130866);
  }

  static abstract interface a
  {
    public abstract void P(int paramInt, String paramString);

    public abstract void a(LinkedList<buj> paramLinkedList, String paramString1, String paramString2, String paramString3);

    public abstract void onSuccess(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin.LoginTask
 * JD-Core Version:    0.6.2
 */