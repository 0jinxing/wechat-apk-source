package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public class CreExtInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CreExtInfo> CREATOR;
  public int txT;
  public int txU;
  public int txV;
  public int txW;

  static
  {
    AppMethodBeat.i(46733);
    CREATOR = new CreExtInfo.1();
    AppMethodBeat.o(46733);
  }

  public CreExtInfo()
  {
  }

  protected CreExtInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46730);
    this.txT = paramParcel.readInt();
    this.txU = paramParcel.readInt();
    this.txV = paramParcel.readInt();
    this.txW = paramParcel.readInt();
    AppMethodBeat.o(46730);
  }

  public static CreExtInfo au(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46732);
    if (paramJSONObject != null)
    {
      CreExtInfo localCreExtInfo = new CreExtInfo();
      localCreExtInfo.txT = paramJSONObject.optInt("need_creid_renewal", 0);
      localCreExtInfo.txU = paramJSONObject.optInt("need_birth_date", 0);
      localCreExtInfo.txV = paramJSONObject.optInt("need_cre_expire_date", 0);
      localCreExtInfo.txW = paramJSONObject.optInt("need_show_cre_type", 0);
      AppMethodBeat.o(46732);
      paramJSONObject = localCreExtInfo;
    }
    while (true)
    {
      return paramJSONObject;
      paramJSONObject = null;
      AppMethodBeat.o(46732);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46731);
    paramParcel.writeInt(this.txT);
    paramParcel.writeInt(this.txU);
    paramParcel.writeInt(this.txV);
    paramParcel.writeInt(this.txW);
    AppMethodBeat.o(46731);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.CreExtInfo
 * JD-Core Version:    0.6.2
 */