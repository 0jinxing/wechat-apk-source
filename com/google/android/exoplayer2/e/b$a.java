package com.google.android.exoplayer2.e;

import android.media.MediaCodec.CodecException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a extends Exception
{
  public final boolean beJ;
  public final String beK;
  public final String beL;
  public final String mimeType;

  public b$a(Format paramFormat, Throwable paramThrowable, boolean paramBoolean, int paramInt)
  {
    super("Decoder init failed: [" + paramInt + "], " + paramFormat, paramThrowable);
    AppMethodBeat.i(95235);
    this.mimeType = paramFormat.aOd;
    this.beJ = paramBoolean;
    this.beK = null;
    if (paramInt < 0);
    for (paramFormat = "neg_"; ; paramFormat = "")
    {
      this.beL = ("com.google.android.exoplayer.MediaCodecTrackRenderer_" + paramFormat + Math.abs(paramInt));
      AppMethodBeat.o(95235);
      return;
    }
  }

  public b$a(Format paramFormat, Throwable paramThrowable, boolean paramBoolean, String paramString)
  {
    super("Decoder init failed: " + paramString + ", " + paramFormat, paramThrowable);
    AppMethodBeat.i(95236);
    this.mimeType = paramFormat.aOd;
    this.beJ = paramBoolean;
    this.beK = paramString;
    paramFormat = localObject;
    if (v.SDK_INT >= 21)
    {
      paramFormat = localObject;
      if ((paramThrowable instanceof MediaCodec.CodecException))
        paramFormat = ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
    }
    this.beL = paramFormat;
    AppMethodBeat.o(95236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e.b.a
 * JD-Core Version:    0.6.2
 */