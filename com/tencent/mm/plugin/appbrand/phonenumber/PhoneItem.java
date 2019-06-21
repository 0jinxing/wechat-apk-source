package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "mobile", "", "showMobile", "encryptedData", "iv", "needAuth", "", "allowSendSms", "isWechat", "isCheck", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getAllowSendSms", "()Z", "getEncryptedData", "()Ljava/lang/String;", "setCheck", "(Z)V", "setWechat", "getIv", "getMobile", "getNeedAuth", "getShowMobile", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toJSONStr", "toString", "writeToParcel", "", "dest", "flags", "Companion", "plugin-appbrand-integration_release"})
public final class PhoneItem
  implements Parcelable
{
  public static final Parcelable.Creator<PhoneItem> CREATOR;
  public static final PhoneItem.a ixO;
  final String biC;
  final String cFl;
  final String ixI;
  final String ixJ;
  final boolean ixK;
  final boolean ixL;
  boolean ixM;
  boolean ixN;

  static
  {
    AppMethodBeat.i(134804);
    ixO = new PhoneItem.a((byte)0);
    CREATOR = (Parcelable.Creator)new PhoneItem.b();
    AppMethodBeat.o(134804);
  }

  public PhoneItem(Parcel paramParcel)
  {
  }

  public PhoneItem(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    AppMethodBeat.i(134802);
    this.cFl = paramString1;
    this.ixI = paramString2;
    this.ixJ = paramString3;
    this.biC = paramString4;
    this.ixK = paramBoolean1;
    this.ixL = paramBoolean2;
    this.ixM = paramBoolean3;
    this.ixN = paramBoolean4;
    AppMethodBeat.o(134802);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(134800);
    boolean bool;
    if ((paramObject instanceof PhoneItem))
      if ((j.j(((PhoneItem)paramObject).cFl, this.cFl)) && (((PhoneItem)paramObject).ixM == this.ixM))
      {
        bool = true;
        AppMethodBeat.o(134800);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134800);
      continue;
      bool = super.equals(paramObject);
      AppMethodBeat.o(134800);
    }
  }

  public final int hashCode()
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(134806);
    String str = this.cFl;
    int k;
    int m;
    label39: int n;
    label54: int i1;
    int i3;
    int i4;
    int i5;
    if (str != null)
    {
      k = str.hashCode();
      str = this.ixI;
      if (str == null)
        break label187;
      m = str.hashCode();
      str = this.ixJ;
      if (str == null)
        break label193;
      n = str.hashCode();
      str = this.biC;
      if (str != null)
        j = str.hashCode();
      i1 = this.ixK;
      int i2 = i1;
      if (i1 != 0)
        i3 = 1;
      i4 = this.ixL;
      i1 = i4;
      if (i4 != 0)
        i1 = 1;
      i5 = this.ixM;
      i4 = i5;
      if (i5 != 0)
        i4 = 1;
      i5 = this.ixN;
      if (i5 == 0)
        break label199;
    }
    while (true)
    {
      AppMethodBeat.o(134806);
      return (i4 + (i1 + (i3 + ((n + (m + k * 31) * 31) * 31 + j) * 31) * 31) * 31) * 31 + i;
      k = 0;
      break;
      label187: m = 0;
      break label39;
      label193: n = 0;
      break label54;
      label199: i = i5;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(134805);
    String str = "PhoneItem(mobile=" + this.cFl + ", showMobile=" + this.ixI + ", encryptedData=" + this.ixJ + ", iv=" + this.biC + ", needAuth=" + this.ixK + ", allowSendSms=" + this.ixL + ", isWechat=" + this.ixM + ", isCheck=" + this.ixN + ")";
    AppMethodBeat.o(134805);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(134801);
    j.p(paramParcel, "dest");
    paramParcel.writeString(this.cFl);
    paramParcel.writeString(this.ixI);
    paramParcel.writeString(this.ixJ);
    paramParcel.writeString(this.biC);
    if (this.ixK)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.ixL)
        break label112;
      paramInt = 1;
      label68: paramParcel.writeInt(paramInt);
      if (!this.ixM)
        break label117;
      paramInt = 1;
      label82: paramParcel.writeInt(paramInt);
      if (!this.ixN)
        break label122;
    }
    label112: label117: label122: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(134801);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label68;
      paramInt = 0;
      break label82;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem
 * JD-Core Version:    0.6.2
 */