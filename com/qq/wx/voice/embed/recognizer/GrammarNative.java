package com.qq.wx.voice.embed.recognizer;

public class GrammarNative
{
  public static native int begin();

  public static native int end();

  public static native int getResult(Grammar paramGrammar);

  public static native int init(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);

  public static native int recognize(byte[] paramArrayOfByte, int paramInt);

  public static native int update(byte[] paramArrayOfByte);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.embed.recognizer.GrammarNative
 * JD-Core Version:    0.6.2
 */