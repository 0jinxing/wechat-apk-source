package com.tencent.mm.ui.mogic;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.d;
import android.view.View.BaseSavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WxViewPager$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR;
  Parcelable Nt;
  ClassLoader Nu;
  int position;

  static
  {
    AppMethodBeat.i(107465);
    CREATOR = d.a(new WxViewPager.SavedState.1());
    AppMethodBeat.o(107465);
  }

  WxViewPager$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    AppMethodBeat.i(107464);
    ClassLoader localClassLoader = paramClassLoader;
    if (paramClassLoader == null)
      localClassLoader = getClass().getClassLoader();
    this.position = paramParcel.readInt();
    this.Nt = paramParcel.readParcelable(localClassLoader);
    this.Nu = localClassLoader;
    AppMethodBeat.o(107464);
  }

  public WxViewPager$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    AppMethodBeat.i(107463);
    String str = "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
    AppMethodBeat.o(107463);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(107462);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.position);
    paramParcel.writeParcelable(this.Nt, paramInt);
    AppMethodBeat.o(107462);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.mogic.WxViewPager.SavedState
 * JD-Core Version:    0.6.2
 */