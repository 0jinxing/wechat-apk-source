package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class StaggeredGridLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new StaggeredGridLayoutManager.SavedState.1();
  boolean alC;
  int alX;
  boolean alZ;
  boolean asa;
  List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> asm;
  int asq;
  int asr;
  int[] ass;
  int ast;
  int[] asu;

  public StaggeredGridLayoutManager$SavedState()
  {
  }

  StaggeredGridLayoutManager$SavedState(Parcel paramParcel)
  {
    this.alX = paramParcel.readInt();
    this.asq = paramParcel.readInt();
    this.asr = paramParcel.readInt();
    if (this.asr > 0)
    {
      this.ass = new int[this.asr];
      paramParcel.readIntArray(this.ass);
    }
    this.ast = paramParcel.readInt();
    if (this.ast > 0)
    {
      this.asu = new int[this.ast];
      paramParcel.readIntArray(this.asu);
    }
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.alC = bool2;
      if (paramParcel.readInt() != 1)
        break label152;
      bool2 = true;
      label113: this.alZ = bool2;
      if (paramParcel.readInt() != 1)
        break label157;
    }
    label152: label157: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.asa = bool2;
      this.asm = paramParcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label113;
    }
  }

  public StaggeredGridLayoutManager$SavedState(SavedState paramSavedState)
  {
    this.asr = paramSavedState.asr;
    this.alX = paramSavedState.alX;
    this.asq = paramSavedState.asq;
    this.ass = paramSavedState.ass;
    this.ast = paramSavedState.ast;
    this.asu = paramSavedState.asu;
    this.alC = paramSavedState.alC;
    this.alZ = paramSavedState.alZ;
    this.asa = paramSavedState.asa;
    this.asm = paramSavedState.asm;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeInt(this.alX);
    paramParcel.writeInt(this.asq);
    paramParcel.writeInt(this.asr);
    if (this.asr > 0)
      paramParcel.writeIntArray(this.ass);
    paramParcel.writeInt(this.ast);
    if (this.ast > 0)
      paramParcel.writeIntArray(this.asu);
    if (this.alC)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.alZ)
        break label120;
      paramInt = 1;
      label87: paramParcel.writeInt(paramInt);
      if (!this.asa)
        break label125;
    }
    label120: label125: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeList(this.asm);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label87;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.SavedState
 * JD-Core Version:    0.6.2
 */