package com.tencent.mm.plugin.downloader.d;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public final class a
{
  public long kLT;
  public Pair<ByteBuffer, Long> kLU;
  public Pair<ByteBuffer, Long> kLV;
  public Pair<ByteBuffer, Long> kLW;
  public Pair<ByteBuffer, Long> kLX;
  public boolean lowMemory = false;

  public final String toString()
  {
    AppMethodBeat.i(2301);
    String str = "lowMemory : " + this.lowMemory + "\n apkSize : " + this.kLT + "\n contentEntry : " + this.kLU + "\n schemeV2Block : " + this.kLV + "\n centralDir : " + this.kLW + "\n eocd : " + this.kLX;
    AppMethodBeat.o(2301);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.d.a
 * JD-Core Version:    0.6.2
 */