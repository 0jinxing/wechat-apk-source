package com.google.android.exoplayer2.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

@TargetApi(21)
public final class c
{
  public static final c aPD;
  final int[] aPE;
  private final int aPF;

  static
  {
    AppMethodBeat.i(94650);
    aPD = new c(new int[] { 2 }, 2);
    AppMethodBeat.o(94650);
  }

  private c(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(94646);
    if (paramArrayOfInt != null)
    {
      this.aPE = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
      Arrays.sort(this.aPE);
    }
    while (true)
    {
      this.aPF = paramInt;
      AppMethodBeat.o(94646);
      return;
      this.aPE = new int[0];
    }
  }

  public static c ai(Context paramContext)
  {
    AppMethodBeat.i(94645);
    paramContext = paramContext.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    if ((paramContext == null) || (paramContext.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0))
    {
      paramContext = aPD;
      AppMethodBeat.o(94645);
    }
    while (true)
    {
      return paramContext;
      paramContext = new c(paramContext.getIntArrayExtra("android.media.extra.ENCODINGS"), paramContext.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
      AppMethodBeat.o(94645);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(94647);
    if (this == paramObject)
      AppMethodBeat.o(94647);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof c))
      {
        AppMethodBeat.o(94647);
        bool = false;
      }
      else
      {
        paramObject = (c)paramObject;
        if ((Arrays.equals(this.aPE, paramObject.aPE)) && (this.aPF == paramObject.aPF))
        {
          AppMethodBeat.o(94647);
        }
        else
        {
          AppMethodBeat.o(94647);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(94648);
    int i = this.aPF;
    int j = Arrays.hashCode(this.aPE);
    AppMethodBeat.o(94648);
    return i + j * 31;
  }

  public final String toString()
  {
    AppMethodBeat.i(94649);
    String str = "AudioCapabilities[maxChannelCount=" + this.aPF + ", supportedEncodings=" + Arrays.toString(this.aPE) + "]";
    AppMethodBeat.o(94649);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.c
 * JD-Core Version:    0.6.2
 */