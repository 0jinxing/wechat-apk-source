package com.eclipsesource.v8;

import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class V8Inspector
{
  private static JsInspectorChannelServer _server;

  static native int JniNotify(long paramLong1, long paramLong2, String paramString);

  static native void JniReceiveData(long paramLong, String paramString);

  @Keep
  public static int jniCallbackNotify(long paramLong1, long paramLong2, String paramString)
  {
    AppMethodBeat.i(75501);
    int i;
    if (_server == null)
    {
      i = -1;
      AppMethodBeat.o(75501);
    }
    while (true)
    {
      return i;
      i = _server.notify(paramLong1, paramLong2, paramString);
      AppMethodBeat.o(75501);
    }
  }

  @Keep
  public static int jniCallbackSendData(long paramLong, String paramString)
  {
    AppMethodBeat.i(75500);
    int i;
    if (_server == null)
    {
      i = -1;
      AppMethodBeat.o(75500);
    }
    while (true)
    {
      return i;
      i = _server.sendData(paramLong, paramString);
      AppMethodBeat.o(75500);
    }
  }

  public static int notify(long paramLong1, long paramLong2, String paramString)
  {
    AppMethodBeat.i(75499);
    int i = JniNotify(paramLong1, paramLong2, paramString);
    AppMethodBeat.o(75499);
    return i;
  }

  public static void onReceiveData(long paramLong, String paramString)
  {
    AppMethodBeat.i(75498);
    JniReceiveData(paramLong, paramString);
    AppMethodBeat.o(75498);
  }

  public static void setServer(JsInspectorChannelServer paramJsInspectorChannelServer)
  {
    _server = paramJsInspectorChannelServer;
  }

  public static abstract interface JsInspectorChannelServer
  {
    public abstract int notify(long paramLong1, long paramLong2, String paramString);

    public abstract int sendData(long paramLong, String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8Inspector
 * JD-Core Version:    0.6.2
 */