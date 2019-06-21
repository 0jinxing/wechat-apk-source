package com.google.android.exoplayer2.c.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class v$b
{
  public final String aOt;
  public final List<v.a> bdJ;
  public final byte[] bdK;
  public final int streamType;

  public v$b(int paramInt, String paramString, List<v.a> paramList, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95178);
    this.streamType = paramInt;
    this.aOt = paramString;
    if (paramList == null);
    for (paramString = Collections.emptyList(); ; paramString = Collections.unmodifiableList(paramList))
    {
      this.bdJ = paramString;
      this.bdK = paramArrayOfByte;
      AppMethodBeat.o(95178);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.v.b
 * JD-Core Version:    0.6.2
 */