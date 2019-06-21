package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

class NativeLog
{
  private static final String TAG = "NativeLog";

  static
  {
    AppMethodBeat.i(128394);
    if (NativeLibs.audioCommon.load())
      Logger.i("NativeLog", "[static initializer] NativeLog load succeed.");
    AppMethodBeat.o(128394);
  }

  static native int init(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.NativeLog
 * JD-Core Version:    0.6.2
 */