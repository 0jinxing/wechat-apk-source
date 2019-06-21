package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator()
  {
  };
  Fragment Du;
  final Bundle mArguments;
  final String mClassName;
  final int mContainerId;
  final boolean mDetached;
  final int mFragmentId;
  final boolean mFromLayout;
  final boolean mHidden;
  final int mIndex;
  final boolean mRetainInstance;
  Bundle mSavedFragmentState;
  final String mTag;

  FragmentState(Parcel paramParcel)
  {
    this.mClassName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    if (paramParcel.readInt() != 0)
    {
      bool2 = true;
      this.mFromLayout = bool2;
      this.mFragmentId = paramParcel.readInt();
      this.mContainerId = paramParcel.readInt();
      this.mTag = paramParcel.readString();
      if (paramParcel.readInt() == 0)
        break label124;
      bool2 = true;
      label69: this.mRetainInstance = bool2;
      if (paramParcel.readInt() == 0)
        break label129;
      bool2 = true;
      label83: this.mDetached = bool2;
      this.mArguments = paramParcel.readBundle();
      if (paramParcel.readInt() == 0)
        break label134;
    }
    label129: label134: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.mHidden = bool2;
      this.mSavedFragmentState = paramParcel.readBundle();
      return;
      bool2 = false;
      break;
      label124: bool2 = false;
      break label69;
      bool2 = false;
      break label83;
    }
  }

  FragmentState(Fragment paramFragment)
  {
    this.mClassName = paramFragment.getClass().getName();
    this.mIndex = paramFragment.mIndex;
    this.mFromLayout = paramFragment.mFromLayout;
    this.mFragmentId = paramFragment.mFragmentId;
    this.mContainerId = paramFragment.mContainerId;
    this.mTag = paramFragment.mTag;
    this.mRetainInstance = paramFragment.mRetainInstance;
    this.mDetached = paramFragment.mDetached;
    this.mArguments = paramFragment.mArguments;
    this.mHidden = paramFragment.mHidden;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.mClassName);
    paramParcel.writeInt(this.mIndex);
    if (this.mFromLayout)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.mFragmentId);
      paramParcel.writeInt(this.mContainerId);
      paramParcel.writeString(this.mTag);
      if (!this.mRetainInstance)
        break label120;
      paramInt = 1;
      label65: paramParcel.writeInt(paramInt);
      if (!this.mDetached)
        break label125;
      paramInt = 1;
      label79: paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.mArguments);
      if (!this.mHidden)
        break label130;
    }
    label130: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.mSavedFragmentState);
      return;
      paramInt = 0;
      break;
      label120: paramInt = 0;
      break label65;
      label125: paramInt = 0;
      break label79;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentState
 * JD-Core Version:    0.6.2
 */