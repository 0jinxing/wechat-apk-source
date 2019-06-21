package com.tencent.mm.media.d;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/MediaCodecAACEncoderAsync$EncoderData;", "", "pcmData", "", "pts", "", "isLast", "", "([BJZ)V", "()Z", "setLast", "(Z)V", "getPcmData", "()[B", "setPcmData", "([B)V", "getPts", "()J", "setPts", "(J)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "plugin-mediaeditor_release"})
public final class d$b
{
  byte[] ckv;
  long eTe;
  boolean eVH;

  public d$b(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    this.ckv = paramArrayOfByte;
    this.eTe = paramLong;
    this.eVH = paramBoolean;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(12937);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof b))
        break label94;
      paramObject = (b)paramObject;
      if (!j.j(this.ckv, paramObject.ckv))
        break label94;
      if (this.eTe == paramObject.eTe)
      {
        i = 1;
        if (i == 0)
          break label94;
        if (this.eVH != paramObject.eVH)
          break label89;
        i = 1;
        label70: if (i == 0)
          break label94;
      }
    }
    else
    {
      AppMethodBeat.o(12937);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label89: i = 0;
      break label70;
      label94: AppMethodBeat.o(12937);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(12936);
    byte[] arrayOfByte = this.ckv;
    if (arrayOfByte != null);
    for (int i = Arrays.hashCode(arrayOfByte); ; i = 0)
    {
      long l = this.eTe;
      int j = (int)(l ^ l >>> 32);
      int k = this.eVH;
      int m = k;
      if (k != 0)
        m = 1;
      AppMethodBeat.o(12936);
      return m + (i * 31 + j) * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(12935);
    String str = "EncoderData(pcmData=" + Arrays.toString(this.ckv) + ", pts=" + this.eTe + ", isLast=" + this.eVH + ")";
    AppMethodBeat.o(12935);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.d.b
 * JD-Core Version:    0.6.2
 */