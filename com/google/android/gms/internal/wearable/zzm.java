package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class zzm extends IOException
{
  zzm(int paramInt1, int paramInt2)
  {
    super(108 + "CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
    AppMethodBeat.i(70749);
    AppMethodBeat.o(70749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzm
 * JD-Core Version:    0.6.2
 */