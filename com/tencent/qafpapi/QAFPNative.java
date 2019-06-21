package com.tencent.qafpapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;

public class QAFPNative
{
  static
  {
    AppMethodBeat.i(35387);
    k.a("wechatQAFP", QAFPNative.class.getClassLoader());
    AppMethodBeat.o(35387);
  }

  public static native int QAFPGetAudioFingerPrint(byte[] paramArrayOfByte);

  public static native int QAFPGetAudioFingerPrintTV(byte[] paramArrayOfByte);

  public static native int QAFPGetVersion();

  public static native int QAFPInit();

  public static native int QAFPProcess(byte[] paramArrayOfByte, int paramInt);

  public static native int QAFPProcessTV(byte[] paramArrayOfByte, int paramInt);

  public static native int QAFPRelease();

  public static native int QAFPReset();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qafpapi.QAFPNative
 * JD-Core Version:    0.6.2
 */