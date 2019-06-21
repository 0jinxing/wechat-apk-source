package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
  implements Parcelable
{
  public static final Parcelable.Creator<FullSpanItem> CREATOR = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1();
  int asn;
  int[] aso;
  boolean asp;
  int mPosition;

  StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()
  {
  }

  StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel paramParcel)
  {
    this.mPosition = paramParcel.readInt();
    this.asn = paramParcel.readInt();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.asp = bool;
      int i = paramParcel.readInt();
      if (i > 0)
      {
        this.aso = new int[i];
        paramParcel.readIntArray(this.aso);
      }
      return;
      bool = false;
    }
  }

  final int cR(int paramInt)
  {
    if (this.aso == null);
    for (paramInt = 0; ; paramInt = this.aso[paramInt])
      return paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.asn + ", mHasUnwantedGapAfter=" + this.asp + ", mGapPerSpan=" + Arrays.toString(this.aso) + '}';
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.mPosition);
    paramParcel.writeInt(this.asn);
    if (this.asp)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if ((this.aso == null) || (this.aso.length <= 0))
        break label68;
      paramParcel.writeInt(this.aso.length);
      paramParcel.writeIntArray(this.aso);
    }
    while (true)
    {
      return;
      paramInt = 0;
      break;
      label68: paramParcel.writeInt(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem
 * JD-Core Version:    0.6.2
 */