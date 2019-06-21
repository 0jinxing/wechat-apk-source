package com.tencent.rtmp;

public class TXBitrateItem
  implements Comparable<TXBitrateItem>
{
  public int bitrate;
  public int height;
  public int index;
  public int width;

  public int compareTo(TXBitrateItem paramTXBitrateItem)
  {
    return this.bitrate - paramTXBitrateItem.bitrate;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXBitrateItem
 * JD-Core Version:    0.6.2
 */