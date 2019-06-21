package com.tencent.mm.ui.widget.progress;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;

class MMProgressWheel$WheelSavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<WheelSavedState> CREATOR;
  float Yn;
  int dL;
  int zTf;
  int zTg;
  boolean zTh;
  int zTn;
  int zTo;
  float zTs;
  boolean zTu;
  float zTv;
  boolean zTw;

  static
  {
    AppMethodBeat.i(112939);
    CREATOR = new MMProgressWheel.WheelSavedState.1();
    AppMethodBeat.o(112939);
  }

  private MMProgressWheel$WheelSavedState(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(112937);
    this.Yn = paramParcel.readFloat();
    this.zTv = paramParcel.readFloat();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.zTw = bool2;
      this.zTs = paramParcel.readFloat();
      this.zTf = paramParcel.readInt();
      this.zTn = paramParcel.readInt();
      this.zTg = paramParcel.readInt();
      this.zTo = paramParcel.readInt();
      this.dL = paramParcel.readInt();
      if (paramParcel.readByte() == 0)
        break label129;
      bool2 = true;
      label99: this.zTu = bool2;
      if (paramParcel.readByte() == 0)
        break label134;
    }
    label129: label134: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.zTh = bool2;
      AppMethodBeat.o(112937);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label99;
    }
  }

  MMProgressWheel$WheelSavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(112938);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.Yn);
    paramParcel.writeFloat(this.zTv);
    if (this.zTw)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeFloat(this.zTs);
      paramParcel.writeInt(this.zTf);
      paramParcel.writeInt(this.zTn);
      paramParcel.writeInt(this.zTg);
      paramParcel.writeInt(this.zTo);
      paramParcel.writeInt(this.dL);
      if (!this.zTu)
        break label133;
      paramInt = 1;
      label101: paramParcel.writeByte((byte)paramInt);
      if (!this.zTh)
        break label138;
    }
    label133: label138: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(112938);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label101;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState
 * JD-Core Version:    0.6.2
 */