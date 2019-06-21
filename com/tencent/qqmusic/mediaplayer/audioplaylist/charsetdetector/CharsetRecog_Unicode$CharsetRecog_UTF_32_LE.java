package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

class CharsetRecog_Unicode$CharsetRecog_UTF_32_LE extends CharsetRecog_Unicode.CharsetRecog_UTF_32
{
  int getChar(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 0)] & 0xFF;
  }

  String getName()
  {
    return "UTF-32LE";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_Unicode.CharsetRecog_UTF_32_LE
 * JD-Core Version:    0.6.2
 */