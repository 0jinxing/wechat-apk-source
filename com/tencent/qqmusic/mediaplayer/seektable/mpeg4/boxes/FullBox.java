package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public abstract class FullBox extends Box
{
  int flags;
  int version;

  public int getFlags()
  {
    return this.flags;
  }

  public int getVersion()
  {
    return this.version;
  }

  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    paramBox = new byte[4];
    paramParsable.readBytes(paramBox, 0, 4);
    this.version = (paramBox[0] & 0xFF);
    int i = paramBox[1];
    int j = paramBox[2];
    this.flags = (paramBox[3] & 0xFF | ((i & 0xFF) << 16 | (j & 0xFF) << 8));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox
 * JD-Core Version:    0.6.2
 */