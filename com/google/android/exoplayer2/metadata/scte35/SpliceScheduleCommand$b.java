package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand$b
{
  public final long bfF;
  public final boolean bfG;
  public final boolean bfH;
  public final boolean bfI;
  public final List<SpliceScheduleCommand.a> bfM;
  public final boolean bfN;
  public final long bfO;
  public final int bfP;
  public final int bfQ;
  public final int bfR;
  public final long bfW;

  private SpliceScheduleCommand$b(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List<SpliceScheduleCommand.a> paramList, long paramLong2, boolean paramBoolean4, long paramLong3, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(95374);
    this.bfF = paramLong1;
    this.bfG = paramBoolean1;
    this.bfH = paramBoolean2;
    this.bfI = paramBoolean3;
    this.bfM = Collections.unmodifiableList(paramList);
    this.bfW = paramLong2;
    this.bfN = paramBoolean4;
    this.bfO = paramLong3;
    this.bfP = paramInt1;
    this.bfQ = paramInt2;
    this.bfR = paramInt3;
    AppMethodBeat.o(95374);
  }

  SpliceScheduleCommand$b(Parcel paramParcel)
  {
    AppMethodBeat.i(95375);
    this.bfF = paramParcel.readLong();
    if (paramParcel.readByte() == 1)
    {
      bool2 = true;
      this.bfG = bool2;
      if (paramParcel.readByte() != 1)
        break label123;
      bool2 = true;
      label44: this.bfH = bool2;
      if (paramParcel.readByte() != 1)
        break label128;
    }
    ArrayList localArrayList;
    label128: for (boolean bool2 = true; ; bool2 = false)
    {
      this.bfI = bool2;
      int i = paramParcel.readInt();
      localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++)
        localArrayList.add(new SpliceScheduleCommand.a(paramParcel.readInt(), paramParcel.readLong()));
      bool2 = false;
      break;
      label123: bool2 = false;
      break label44;
    }
    this.bfM = Collections.unmodifiableList(localArrayList);
    this.bfW = paramParcel.readLong();
    if (paramParcel.readByte() == 1);
    for (bool2 = bool1; ; bool2 = false)
    {
      this.bfN = bool2;
      this.bfO = paramParcel.readLong();
      this.bfP = paramParcel.readInt();
      this.bfQ = paramParcel.readInt();
      this.bfR = paramParcel.readInt();
      AppMethodBeat.o(95375);
      return;
    }
  }

  static b z(l paraml)
  {
    AppMethodBeat.i(95376);
    long l1 = paraml.cM();
    boolean bool1;
    boolean bool2;
    boolean bool3;
    long l2;
    Object localObject;
    int i;
    int k;
    boolean bool4;
    boolean bool5;
    if ((paraml.readUnsignedByte() & 0x80) != 0)
    {
      bool1 = true;
      bool2 = false;
      bool3 = false;
      l2 = -9223372036854775807L;
      localObject = new ArrayList();
      i = 0;
      j = 0;
      k = 0;
      bool4 = false;
      bool5 = false;
      if (bool1)
        break label307;
      j = paraml.readUnsignedByte();
      if ((j & 0x80) == 0)
        break label182;
      bool2 = true;
      label80: if ((j & 0x40) == 0)
        break label188;
      bool3 = true;
      label91: if ((j & 0x20) == 0)
        break label194;
    }
    label182: label188: label194: for (int j = 1; ; j = 0)
    {
      if (bool3)
        l2 = paraml.cM();
      if (bool3)
        break label200;
      k = paraml.readUnsignedByte();
      ArrayList localArrayList = new ArrayList(k);
      for (i = 0; ; i++)
      {
        localObject = localArrayList;
        if (i >= k)
          break;
        localArrayList.add(new SpliceScheduleCommand.a(paraml.readUnsignedByte(), paraml.cM(), (byte)0));
      }
      bool1 = false;
      break;
      bool2 = false;
      break label80;
      bool3 = false;
      break label91;
    }
    label200: long l3;
    if (j != 0)
    {
      l3 = paraml.readUnsignedByte();
      if ((0x80 & l3) != 0L)
      {
        bool5 = true;
        l3 = (l3 & 1L) << 32 | paraml.cM();
        label240: i = paraml.readUnsignedShort();
        j = paraml.readUnsignedByte();
        k = paraml.readUnsignedByte();
      }
    }
    while (true)
    {
      paraml = new b(l1, bool1, bool2, bool3, (List)localObject, l2, bool5, l3, i, j, k);
      AppMethodBeat.o(95376);
      return paraml;
      bool5 = false;
      break;
      l3 = -9223372036854775807L;
      break label240;
      label307: l3 = -9223372036854775807L;
      bool5 = bool4;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.b
 * JD-Core Version:    0.6.2
 */