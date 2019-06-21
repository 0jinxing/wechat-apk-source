package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.d;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class JsApiAppBrandNFCBase extends a
{
  JsApiAppBrandNFCBase.a hRY = null;

  protected final void a(JsApiAppBrandNFCBase.a parama)
  {
    this.hRY = parama;
    parama = new CheckIsSupportHCETask(this);
    h.bB(parama);
    AppBrandMainProcessService.a(parama);
  }

  static class CheckIsSupportHCETask extends MainProcessTask
  {
    public static final Parcelable.Creator<CheckIsSupportHCETask> CREATOR;
    private String aIm;
    private int errCode;
    private JsApiAppBrandNFCBase hRZ;

    static
    {
      AppMethodBeat.i(137866);
      CREATOR = new JsApiAppBrandNFCBase.CheckIsSupportHCETask.1();
      AppMethodBeat.o(137866);
    }

    public CheckIsSupportHCETask(Parcel paramParcel)
    {
      AppMethodBeat.i(137860);
      this.hRZ = null;
      g(paramParcel);
      AppMethodBeat.o(137860);
    }

    public CheckIsSupportHCETask(JsApiAppBrandNFCBase paramJsApiAppBrandNFCBase)
    {
      this.hRZ = null;
      this.hRZ = paramJsApiAppBrandNFCBase;
    }

    public final void asP()
    {
      AppMethodBeat.i(137861);
      if (!d.aEB())
      {
        this.errCode = 13000;
        this.aIm = "not support NFC";
      }
      while (true)
      {
        aCb();
        AppMethodBeat.o(137861);
        return;
        if (!d.aEA())
        {
          this.errCode = 13002;
          this.aIm = "not support HCE";
        }
        else
        {
          this.errCode = 0;
          this.aIm = "support HCE and system NFC switch is opened";
        }
      }
    }

    public final void asQ()
    {
      AppMethodBeat.i(137862);
      super.asQ();
      h.at(this);
      JsApiAppBrandNFCBase localJsApiAppBrandNFCBase;
      int i;
      String str1;
      if (this.hRZ != null)
      {
        localJsApiAppBrandNFCBase = this.hRZ;
        i = this.errCode;
        str1 = this.aIm;
        ab.i("MicroMsg.JsApiAppBrandNFCBase", "alvinluo checkIsSupport resultCallback errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), str1 });
        if (i == 0)
        {
          if (localJsApiAppBrandNFCBase.hRY == null)
            break label118;
          localJsApiAppBrandNFCBase.hRY.T(i, str1);
          AppMethodBeat.o(137862);
        }
      }
      while (true)
      {
        return;
        String str2 = str1;
        if (bo.isNullOrNil(str1))
          str2 = "unknown error";
        if (localJsApiAppBrandNFCBase.hRY != null)
          localJsApiAppBrandNFCBase.hRY.T(i, str2);
        label118: AppMethodBeat.o(137862);
      }
    }

    public int describeContents()
    {
      AppMethodBeat.i(137863);
      int i = super.describeContents();
      AppMethodBeat.o(137863);
      return i;
    }

    public final void g(Parcel paramParcel)
    {
      AppMethodBeat.i(137865);
      super.g(paramParcel);
      this.errCode = paramParcel.readInt();
      this.aIm = paramParcel.readString();
      AppMethodBeat.o(137865);
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(137864);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.errCode);
      paramParcel.writeString(this.aIm);
      AppMethodBeat.o(137864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase
 * JD-Core Version:    0.6.2
 */