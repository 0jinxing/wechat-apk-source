package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand
{
  public static final Parcelable.Creator<SpliceInsertCommand> CREATOR;
  public final long bfF;
  public final boolean bfG;
  public final boolean bfH;
  public final boolean bfI;
  public final boolean bfJ;
  public final long bfK;
  public final long bfL;
  public final List<SpliceInsertCommand.a> bfM;
  public final boolean bfN;
  public final long bfO;
  public final int bfP;
  public final int bfQ;
  public final int bfR;

  static
  {
    AppMethodBeat.i(95370);
    CREATOR = new SpliceInsertCommand.1();
    AppMethodBeat.o(95370);
  }

  private SpliceInsertCommand(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong2, long paramLong3, List<SpliceInsertCommand.a> paramList, boolean paramBoolean5, long paramLong4, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(95366);
    this.bfF = paramLong1;
    this.bfG = paramBoolean1;
    this.bfH = paramBoolean2;
    this.bfI = paramBoolean3;
    this.bfJ = paramBoolean4;
    this.bfK = paramLong2;
    this.bfL = paramLong3;
    this.bfM = Collections.unmodifiableList(paramList);
    this.bfN = paramBoolean5;
    this.bfO = paramLong4;
    this.bfP = paramInt1;
    this.bfQ = paramInt2;
    this.bfR = paramInt3;
    AppMethodBeat.o(95366);
  }

  private SpliceInsertCommand(Parcel paramParcel)
  {
    AppMethodBeat.i(95367);
    this.bfF = paramParcel.readLong();
    if (paramParcel.readByte() == 1)
    {
      bool2 = true;
      this.bfG = bool2;
      if (paramParcel.readByte() != 1)
        break label160;
      bool2 = true;
      label44: this.bfH = bool2;
      if (paramParcel.readByte() != 1)
        break label165;
      bool2 = true;
      label59: this.bfI = bool2;
      if (paramParcel.readByte() != 1)
        break label170;
    }
    ArrayList localArrayList;
    label160: label165: label170: for (boolean bool2 = true; ; bool2 = false)
    {
      this.bfJ = bool2;
      this.bfK = paramParcel.readLong();
      this.bfL = paramParcel.readLong();
      int i = paramParcel.readInt();
      localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++)
        localArrayList.add(new SpliceInsertCommand.a(paramParcel.readInt(), paramParcel.readLong(), paramParcel.readLong()));
      bool2 = false;
      break;
      bool2 = false;
      break label44;
      bool2 = false;
      break label59;
    }
    this.bfM = Collections.unmodifiableList(localArrayList);
    if (paramParcel.readByte() == 1);
    for (bool2 = bool1; ; bool2 = false)
    {
      this.bfN = bool2;
      this.bfO = paramParcel.readLong();
      this.bfP = paramParcel.readInt();
      this.bfQ = paramParcel.readInt();
      this.bfR = paramParcel.readInt();
      AppMethodBeat.o(95367);
      return;
    }
  }

  static SpliceInsertCommand a(l paraml, long paramLong, s params)
  {
    AppMethodBeat.i(95368);
    long l1 = paraml.cM();
    boolean bool1;
    boolean bool2;
    boolean bool3;
    long l2;
    Object localObject;
    int i;
    int j;
    int k;
    boolean bool5;
    if ((paraml.readUnsignedByte() & 0x80) != 0)
    {
      bool1 = true;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      l2 = -9223372036854775807L;
      localObject = Collections.emptyList();
      i = 0;
      j = 0;
      k = 0;
      bool5 = false;
      if (bool1)
        break label392;
      k = paraml.readUnsignedByte();
      if ((k & 0x80) == 0)
        break label234;
      bool3 = true;
      label79: if ((k & 0x40) == 0)
        break label240;
      bool5 = true;
      label90: if ((k & 0x20) == 0)
        break label246;
      j = 1;
      label101: if ((k & 0x10) == 0)
        break label252;
    }
    long l3;
    label234: label240: label246: label252: for (boolean bool4 = true; ; bool4 = false)
    {
      l3 = l2;
      if (bool5)
      {
        l3 = l2;
        if (!bool4)
          l3 = TimeSignalCommand.c(paraml, paramLong);
      }
      if (bool5)
        break label258;
      i = paraml.readUnsignedByte();
      ArrayList localArrayList = new ArrayList(i);
      for (k = 0; ; k++)
      {
        localObject = localArrayList;
        if (k >= i)
          break;
        int m = paraml.readUnsignedByte();
        l2 = -9223372036854775807L;
        if (!bool4)
          l2 = TimeSignalCommand.c(paraml, paramLong);
        localArrayList.add(new SpliceInsertCommand.a(m, l2, params.ao(l2), (byte)0));
      }
      bool1 = false;
      break;
      bool3 = false;
      break label79;
      bool5 = false;
      break label90;
      j = 0;
      break label101;
    }
    label258: boolean bool6;
    if (j != 0)
    {
      paramLong = paraml.readUnsignedByte();
      if ((0x80 & paramLong) != 0L)
      {
        bool6 = true;
        paramLong = (paramLong & 1L) << 32 | paraml.cM();
        label294: i = paraml.readUnsignedShort();
        j = paraml.readUnsignedByte();
        k = paraml.readUnsignedByte();
        boolean bool7 = bool6;
        bool6 = bool5;
        bool2 = bool3;
        bool5 = bool7;
        bool3 = bool6;
      }
    }
    while (true)
    {
      paraml = new SpliceInsertCommand(l1, bool1, bool2, bool3, bool4, l3, params.ao(l3), (List)localObject, bool5, paramLong, i, j, k);
      AppMethodBeat.o(95368);
      return paraml;
      bool6 = false;
      break;
      paramLong = -9223372036854775807L;
      bool6 = false;
      break label294;
      label392: paramLong = -9223372036854775807L;
      l3 = l2;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(95369);
    paramParcel.writeLong(this.bfF);
    if (this.bfG)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.bfH)
        break label169;
      paramInt = 1;
      label39: paramParcel.writeByte((byte)paramInt);
      if (!this.bfI)
        break label174;
      paramInt = 1;
      label54: paramParcel.writeByte((byte)paramInt);
      if (!this.bfJ)
        break label179;
    }
    label169: label174: label179: for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.bfK);
      paramParcel.writeLong(this.bfL);
      int j = this.bfM.size();
      paramParcel.writeInt(j);
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        SpliceInsertCommand.a locala = (SpliceInsertCommand.a)this.bfM.get(paramInt);
        paramParcel.writeInt(locala.bfS);
        paramParcel.writeLong(locala.bfT);
        paramParcel.writeLong(locala.bfU);
      }
      paramInt = 0;
      break;
      paramInt = 0;
      break label39;
      paramInt = 0;
      break label54;
    }
    if (this.bfN);
    for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.bfO);
      paramParcel.writeInt(this.bfP);
      paramParcel.writeInt(this.bfQ);
      paramParcel.writeInt(this.bfR);
      AppMethodBeat.o(95369);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand
 * JD-Core Version:    0.6.2
 */