package com.tencent.qqmusic.mediaplayer.seektable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

public class NativeSeekTable
  implements SeekTable
{
  private final BaseDecoder nativeDecoder;

  public NativeSeekTable(BaseDecoder paramBaseDecoder)
  {
    this.nativeDecoder = paramBaseDecoder;
  }

  public void parse(IDataSource paramIDataSource)
  {
  }

  public long seek(long paramLong)
  {
    AppMethodBeat.i(128507);
    paramLong = this.nativeDecoder.getBytePositionOfTime(paramLong);
    AppMethodBeat.o(128507);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.NativeSeekTable
 * JD-Core Version:    0.6.2
 */