package com.google.android.gms.common.data;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShuffleFilteredDataBuffer<T> extends FilteredDataBuffer<T>
{
  private final List<Integer> zzoh;
  private final int zzoi;

  public ShuffleFilteredDataBuffer(DataBuffer<T> paramDataBuffer, int paramInt)
  {
    super(paramDataBuffer);
    AppMethodBeat.i(61169);
    this.zzoi = paramInt;
    int i = this.zzoi;
    int j = this.mDataBuffer.getCount();
    if (i > j)
    {
      paramDataBuffer = new IllegalArgumentException("numIndexes must be smaller or equal to max");
      AppMethodBeat.o(61169);
      throw paramDataBuffer;
    }
    paramDataBuffer = new ArrayList(j);
    for (paramInt = 0; paramInt < j; paramInt++)
      paramDataBuffer.add(Integer.valueOf(paramInt));
    Collections.shuffle(paramDataBuffer);
    this.zzoh = paramDataBuffer.subList(0, i);
    AppMethodBeat.o(61169);
  }

  public final int computeRealPosition(int paramInt)
  {
    AppMethodBeat.i(61171);
    if ((paramInt < 0) || (paramInt >= getCount()))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException(53 + "Position " + paramInt + " is out of bounds for this buffer");
      AppMethodBeat.o(61171);
      throw localIllegalArgumentException;
    }
    paramInt = ((Integer)this.zzoh.get(paramInt)).intValue();
    AppMethodBeat.o(61171);
    return paramInt;
  }

  public final int getCount()
  {
    AppMethodBeat.i(61170);
    int i = Math.min(this.zzoi, this.mDataBuffer.getCount());
    AppMethodBeat.o(61170);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.ShuffleFilteredDataBuffer
 * JD-Core Version:    0.6.2
 */