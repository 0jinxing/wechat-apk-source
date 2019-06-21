package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public class CreTypeRuleInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CreTypeRuleInfo> CREATOR;
  public int txX;
  public CreExtInfo txY;

  static
  {
    AppMethodBeat.i(46738);
    CREATOR = new CreTypeRuleInfo.1();
    AppMethodBeat.o(46738);
  }

  public CreTypeRuleInfo()
  {
  }

  protected CreTypeRuleInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46735);
    this.txX = paramParcel.readInt();
    this.txY = ((CreExtInfo)paramParcel.readParcelable(CreExtInfo.class.getClassLoader()));
    AppMethodBeat.o(46735);
  }

  public static CreTypeRuleInfo av(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46737);
    if (paramJSONObject != null)
    {
      CreTypeRuleInfo localCreTypeRuleInfo = new CreTypeRuleInfo();
      localCreTypeRuleInfo.txX = paramJSONObject.optInt("support_cre_type", 0);
      localCreTypeRuleInfo.txY = CreExtInfo.au(paramJSONObject.optJSONObject("cre_need_info"));
      AppMethodBeat.o(46737);
      paramJSONObject = localCreTypeRuleInfo;
    }
    while (true)
    {
      return paramJSONObject;
      paramJSONObject = null;
      AppMethodBeat.o(46737);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46736);
    paramParcel.writeInt(this.txX);
    paramParcel.writeParcelable(this.txY, paramInt);
    AppMethodBeat.o(46736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo
 * JD-Core Version:    0.6.2
 */