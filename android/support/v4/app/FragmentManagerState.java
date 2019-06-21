package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator()
  {
  };
  FragmentState[] Dq;
  int[] Dr;
  BackStackState[] Ds;
  int Dt = -1;
  int mNextFragmentIndex;

  public FragmentManagerState()
  {
  }

  public FragmentManagerState(Parcel paramParcel)
  {
    this.Dq = ((FragmentState[])paramParcel.createTypedArray(FragmentState.CREATOR));
    this.Dr = paramParcel.createIntArray();
    this.Ds = ((BackStackState[])paramParcel.createTypedArray(BackStackState.CREATOR));
    this.Dt = paramParcel.readInt();
    this.mNextFragmentIndex = paramParcel.readInt();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.Dq, paramInt);
    paramParcel.writeIntArray(this.Dr);
    paramParcel.writeTypedArray(this.Ds, paramInt);
    paramParcel.writeInt(this.Dt);
    paramParcel.writeInt(this.mNextFragmentIndex);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentManagerState
 * JD-Core Version:    0.6.2
 */