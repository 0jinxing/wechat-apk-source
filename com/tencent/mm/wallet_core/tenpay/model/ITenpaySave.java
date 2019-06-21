package com.tencent.mm.wallet_core.tenpay.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public abstract interface ITenpaySave
{
  public abstract RetryPayInfo cMC();

  public static class RetryPayInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<RetryPayInfo> CREATOR;
    public int Agu;
    public int Agv;
    public String Agw;

    static
    {
      AppMethodBeat.i(49172);
      CREATOR = new ITenpaySave.RetryPayInfo.1();
      AppMethodBeat.o(49172);
    }

    public RetryPayInfo()
    {
      this.Agu = -1;
      this.Agv = -1;
      this.Agw = "";
    }

    protected RetryPayInfo(Parcel paramParcel)
    {
      AppMethodBeat.i(49169);
      this.Agu = paramParcel.readInt();
      this.Agv = paramParcel.readInt();
      this.Agw = paramParcel.readString();
      AppMethodBeat.o(49169);
    }

    public final void aA(JSONObject paramJSONObject)
    {
      AppMethodBeat.i(49171);
      if (paramJSONObject == null)
        AppMethodBeat.o(49171);
      while (true)
      {
        return;
        paramJSONObject = paramJSONObject.optJSONObject("retry_pay_info");
        if (paramJSONObject == null)
        {
          AppMethodBeat.o(49171);
        }
        else
        {
          this.Agu = paramJSONObject.optInt("retry_interval", -1);
          this.Agv = paramJSONObject.optInt("max_retry_count", -1);
          this.Agw = paramJSONObject.optString("retry_fail_wording", "");
          AppMethodBeat.o(49171);
        }
      }
    }

    public final boolean bVy()
    {
      if ((this.Agu == -1) || (this.Agv == -1));
      for (boolean bool = false; ; bool = true)
        return bool;
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(49170);
      paramParcel.writeInt(this.Agu);
      paramParcel.writeInt(this.Agv);
      paramParcel.writeString(this.Agw);
      AppMethodBeat.o(49170);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.tenpay.model.ITenpaySave
 * JD-Core Version:    0.6.2
 */