package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.text.TextUtils;

class TextInputLayout$SavedState extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new TextInputLayout.SavedState.1();
  CharSequence tU;
  boolean tV;

  TextInputLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    this.tU = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    if (paramParcel.readInt() == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.tV = bool;
      return;
    }
  }

  TextInputLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.tU + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    TextUtils.writeToParcel(this.tU, paramParcel, paramInt);
    if (this.tV);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputLayout.SavedState
 * JD-Core Version:    0.6.2
 */