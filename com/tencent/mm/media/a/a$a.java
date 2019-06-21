package com.tencent.mm.media.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/codec/MediaCodecAACCodec$EncoderData;", "", "data", "", "pts", "", "isEnd", "", "([BJZ)V", "getData", "()[B", "()Z", "getPts", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "plugin-mediaeditor_release"})
public final class a$a
{
  final byte[] data;
  final long eTe;
  final boolean eTf;

  public a$a(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(12812);
    this.data = paramArrayOfByte;
    this.eTe = paramLong;
    this.eTf = paramBoolean;
    AppMethodBeat.o(12812);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(12815);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof a))
        break label94;
      paramObject = (a)paramObject;
      if (!j.j(this.data, paramObject.data))
        break label94;
      if (this.eTe == paramObject.eTe)
      {
        i = 1;
        if (i == 0)
          break label94;
        if (this.eTf != paramObject.eTf)
          break label89;
        i = 1;
        label70: if (i == 0)
          break label94;
      }
    }
    else
    {
      AppMethodBeat.o(12815);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label89: i = 0;
      break label70;
      label94: AppMethodBeat.o(12815);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(12814);
    byte[] arrayOfByte = this.data;
    if (arrayOfByte != null);
    for (int i = Arrays.hashCode(arrayOfByte); ; i = 0)
    {
      long l = this.eTe;
      int j = (int)(l ^ l >>> 32);
      int k = this.eTf;
      int m = k;
      if (k != 0)
        m = 1;
      AppMethodBeat.o(12814);
      return m + (i * 31 + j) * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(12813);
    String str = "EncoderData(data=" + Arrays.toString(this.data) + ", pts=" + this.eTe + ", isEnd=" + this.eTf + ")";
    AppMethodBeat.o(12813);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.a.a.a
 * JD-Core Version:    0.6.2
 */