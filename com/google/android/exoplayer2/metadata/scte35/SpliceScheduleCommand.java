package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand
{
  public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR;
  public final List<SpliceScheduleCommand.b> bfV;

  static
  {
    AppMethodBeat.i(95381);
    CREATOR = new SpliceScheduleCommand.1();
    AppMethodBeat.o(95381);
  }

  private SpliceScheduleCommand(Parcel paramParcel)
  {
    AppMethodBeat.i(95378);
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(new SpliceScheduleCommand.b(paramParcel));
    this.bfV = Collections.unmodifiableList(localArrayList);
    AppMethodBeat.o(95378);
  }

  private SpliceScheduleCommand(List<SpliceScheduleCommand.b> paramList)
  {
    AppMethodBeat.i(95377);
    this.bfV = Collections.unmodifiableList(paramList);
    AppMethodBeat.o(95377);
  }

  static SpliceScheduleCommand y(l paraml)
  {
    AppMethodBeat.i(95379);
    int i = paraml.readUnsignedByte();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(SpliceScheduleCommand.b.z(paraml));
    paraml = new SpliceScheduleCommand(localArrayList);
    AppMethodBeat.o(95379);
    return paraml;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95380);
    int i = this.bfV.size();
    paramParcel.writeInt(i);
    paramInt = 0;
    if (paramInt < i)
    {
      SpliceScheduleCommand.b localb = (SpliceScheduleCommand.b)this.bfV.get(paramInt);
      paramParcel.writeLong(localb.bfF);
      if (localb.bfG)
      {
        j = 1;
        paramParcel.writeByte((byte)j);
        if (!localb.bfH)
          break label180;
        j = 1;
        label80: paramParcel.writeByte((byte)j);
        if (!localb.bfI)
          break label186;
      }
      label180: label186: for (int j = 1; ; j = 0)
      {
        paramParcel.writeByte((byte)j);
        int k = localb.bfM.size();
        paramParcel.writeInt(k);
        for (j = 0; j < k; j++)
        {
          SpliceScheduleCommand.a locala = (SpliceScheduleCommand.a)localb.bfM.get(j);
          paramParcel.writeInt(locala.bfS);
          paramParcel.writeLong(locala.bfW);
        }
        j = 0;
        break;
        j = 0;
        break label80;
      }
      paramParcel.writeLong(localb.bfW);
      if (localb.bfN);
      for (j = 1; ; j = 0)
      {
        paramParcel.writeByte((byte)j);
        paramParcel.writeLong(localb.bfO);
        paramParcel.writeInt(localb.bfP);
        paramParcel.writeInt(localb.bfQ);
        paramParcel.writeInt(localb.bfR);
        paramInt++;
        break;
      }
    }
    AppMethodBeat.o(95380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand
 * JD-Core Version:    0.6.2
 */