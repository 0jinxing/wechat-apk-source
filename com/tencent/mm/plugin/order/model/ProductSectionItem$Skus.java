package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class ProductSectionItem$Skus
  implements Parcelable
{
  public static final Parcelable.Creator<Skus> CREATER;
  public String key;
  public String value;

  static
  {
    AppMethodBeat.i(43788);
    CREATER = new ProductSectionItem.Skus.1();
    AppMethodBeat.o(43788);
  }

  public ProductSectionItem$Skus()
  {
  }

  public ProductSectionItem$Skus(Parcel paramParcel)
  {
    AppMethodBeat.i(43785);
    this.key = paramParcel.readString();
    this.value = paramParcel.readString();
    AppMethodBeat.o(43785);
  }

  public static String ct(List<Skus> paramList)
  {
    AppMethodBeat.i(43787);
    if ((paramList == null) || (paramList.size() == 0))
    {
      paramList = "";
      AppMethodBeat.o(43787);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramList.size(); i++)
      {
        Skus localSkus = (Skus)paramList.get(i);
        if (i != 0)
          localStringBuilder.append("、");
        localStringBuilder.append(localSkus.value);
      }
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(43787);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(43786);
    paramParcel.writeString(this.key);
    paramParcel.writeString(this.value);
    AppMethodBeat.o(43786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.ProductSectionItem.Skus
 * JD-Core Version:    0.6.2
 */