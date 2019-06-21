package com.tenpay.android.wechat;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TenpayTTSUtil
{
  private static boolean sEnabled = true;
  private static TextToSpeech sTts;

  public static void destroy()
  {
    AppMethodBeat.i(5499);
    if (sTts != null)
    {
      sTts.stop();
      sTts.shutdown();
      sTts = null;
    }
    AppMethodBeat.o(5499);
  }

  public static void init(Context paramContext)
  {
    AppMethodBeat.i(5495);
    if (sTts == null)
      sTts = new TextToSpeech(paramContext.getApplicationContext(), null);
    AppMethodBeat.o(5495);
  }

  public static void setEnabled(boolean paramBoolean)
  {
    sEnabled = paramBoolean;
  }

  public static void speak(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(5497);
    if ((sEnabled) && (sTts != null) && (!TextUtils.isEmpty(paramCharSequence)))
      sTts.speak(paramCharSequence.toString(), 1, null);
    AppMethodBeat.o(5497);
  }

  public static void speak(String paramString)
  {
    AppMethodBeat.i(5496);
    if ((sEnabled) && (sTts != null) && (!TextUtils.isEmpty(paramString)))
      sTts.speak(paramString, 1, null);
    AppMethodBeat.o(5496);
  }

  public static void stop()
  {
    AppMethodBeat.i(5498);
    if (sTts != null)
      sTts.stop();
    AppMethodBeat.o(5498);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tenpay.android.wechat.TenpayTTSUtil
 * JD-Core Version:    0.6.2
 */