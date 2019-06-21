package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class ProductSectionItem
  implements Parcelable
{
  public static final Parcelable.Creator<ProductSectionItem> CREATER;
  public int count;
  public String iconUrl;
  public String jumpUrl;
  public String name;
  public String pdA;
  public List<ProductSectionItem.Skus> pdy;
  public String pdz;
  public int scene;

  static
  {
    AppMethodBeat.i(43791);
    CREATER = new ProductSectionItem.1();
    AppMethodBeat.o(43791);
  }

  public ProductSectionItem()
  {
  }

  public ProductSectionItem(Parcel paramParcel)
  {
    AppMethodBeat.i(43789);
    this.iconUrl = paramParcel.readString();
    this.name = paramParcel.readString();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.pdy = new ArrayList();
      for (int j = 0; j < i; j++)
      {
        ProductSectionItem.Skus localSkus = new ProductSectionItem.Skus();
        localSkus.key = paramParcel.readString();
        localSkus.value = paramParcel.readString();
        this.pdy.add(localSkus);
      }
    }
    this.count = paramParcel.readInt();
    this.pdz = paramParcel.readString();
    this.jumpUrl = paramParcel.readString();
    this.pdA = paramParcel.readString();
    this.scene = paramParcel.readInt();
    AppMethodBeat.o(43789);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(43790);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeString(this.name);
    if (this.pdy != null)
    {
      paramParcel.writeInt(this.pdy.size());
      for (paramInt = 0; paramInt < this.pdy.size(); paramInt++)
      {
        ProductSectionItem.Skus localSkus = (ProductSectionItem.Skus)this.pdy.get(paramInt);
        paramParcel.writeString(localSkus.key);
        paramParcel.writeString(localSkus.value);
      }
    }
    paramParcel.writeInt(0);
    paramParcel.writeInt(this.count);
    paramParcel.writeString(this.pdz);
    paramParcel.writeString(this.jumpUrl);
    paramParcel.writeString(this.pdA);
    paramParcel.writeInt(this.scene);
    AppMethodBeat.o(43790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.ProductSectionItem
 * JD-Core Version:    0.6.2
 */