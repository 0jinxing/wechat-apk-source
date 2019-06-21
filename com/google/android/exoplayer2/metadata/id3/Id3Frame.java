package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.metadata.Metadata.Entry;

public abstract class Id3Frame
  implements Metadata.Entry
{
  public final String id;

  public Id3Frame(String paramString)
  {
    this.id = ((String)a.checkNotNull(paramString));
  }

  public int describeContents()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.Id3Frame
 * JD-Core Version:    0.6.2
 */