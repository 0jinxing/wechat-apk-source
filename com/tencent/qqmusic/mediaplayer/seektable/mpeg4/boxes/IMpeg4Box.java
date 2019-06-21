package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public abstract interface IMpeg4Box
{
  public abstract long getSize();

  public abstract String getType();

  public abstract void parse(Parsable paramParsable, Box paramBox);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
 * JD-Core Version:    0.6.2
 */