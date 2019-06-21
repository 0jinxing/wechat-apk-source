package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.bo;

class JsApiChooseWeChatContact$GetUserDataTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetUserDataTask> CREATOR;
  String bCu;
  String bCv;
  String gEl;
  public String hIl;
  public String userName;

  static
  {
    AppMethodBeat.i(130997);
    CREATOR = new JsApiChooseWeChatContact.GetUserDataTask.1();
    AppMethodBeat.o(130997);
  }

  public JsApiChooseWeChatContact$GetUserDataTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130993);
    this.gEl = "";
    g(paramParcel);
    AppMethodBeat.o(130993);
  }

  public JsApiChooseWeChatContact$GetUserDataTask(String paramString)
  {
    this.gEl = "";
    this.userName = paramString;
  }

  public final void asP()
  {
    AppMethodBeat.i(130994);
    this.hIl = r.Yz();
    if (!TextUtils.isEmpty(this.userName))
    {
      this.bCu = s.mI(this.userName);
      this.bCv = s.mK(this.userName);
      h localh = o.act().qo(this.userName);
      if (localh != null)
      {
        this.gEl = localh.ack();
        if (bo.isNullOrNil(this.gEl))
          this.gEl = localh.acl();
      }
    }
    AppMethodBeat.o(130994);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130995);
    this.hIl = paramParcel.readString();
    this.userName = paramParcel.readString();
    this.bCu = paramParcel.readString();
    this.bCv = paramParcel.readString();
    this.gEl = paramParcel.readString();
    AppMethodBeat.o(130995);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130996);
    paramParcel.writeString(this.hIl);
    paramParcel.writeString(this.userName);
    paramParcel.writeString(this.bCu);
    paramParcel.writeString(this.bCv);
    paramParcel.writeString(this.gEl);
    AppMethodBeat.o(130996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact.GetUserDataTask
 * JD-Core Version:    0.6.2
 */