package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;

class CharsetRecog_sbcs$NGramParser
{
  private static final int N_GRAM_MASK = 16777215;
  protected int byteIndex;
  protected byte[] byteMap;
  private int hitCount;
  private int ngram;
  private int ngramCount;
  private int[] ngramList;
  protected byte spaceChar;

  public CharsetRecog_sbcs$NGramParser(int[] paramArrayOfInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(104717);
    this.byteIndex = 0;
    this.ngram = 0;
    this.ngramList = paramArrayOfInt;
    this.byteMap = paramArrayOfByte;
    this.ngram = 0;
    this.hitCount = 0;
    this.ngramCount = 0;
    AppMethodBeat.o(104717);
  }

  private void lookup(int paramInt)
  {
    AppMethodBeat.i(104718);
    this.ngramCount += 1;
    if (search(this.ngramList, paramInt) >= 0)
      this.hitCount += 1;
    AppMethodBeat.o(104718);
  }

  private int nextByte(CharsetDetector paramCharsetDetector)
  {
    if (this.byteIndex >= paramCharsetDetector.fInputLen);
    for (int i = -1; ; i = paramCharsetDetector[i] & 0xFF)
    {
      return i;
      paramCharsetDetector = paramCharsetDetector.fInputBytes;
      i = this.byteIndex;
      this.byteIndex = (i + 1);
    }
  }

  private static int search(int[] paramArrayOfInt, int paramInt)
  {
    int i = 32;
    if (paramArrayOfInt[32] <= paramInt);
    while (true)
    {
      int j = i;
      if (paramArrayOfInt[(i + 16)] <= paramInt)
        j = i + 16;
      i = j;
      if (paramArrayOfInt[(j + 8)] <= paramInt)
        i = j + 8;
      j = i;
      if (paramArrayOfInt[(i + 4)] <= paramInt)
        j = i + 4;
      int k = j;
      if (paramArrayOfInt[(j + 2)] <= paramInt)
        k = j + 2;
      i = k;
      if (paramArrayOfInt[(k + 1)] <= paramInt)
        i = k + 1;
      j = i;
      if (paramArrayOfInt[i] > paramInt)
        j = i - 1;
      if (j >= 0)
      {
        i = j;
        if (paramArrayOfInt[j] == paramInt);
      }
      else
      {
        i = -1;
      }
      return i;
      i = 0;
    }
  }

  protected void addByte(int paramInt)
  {
    AppMethodBeat.i(104719);
    this.ngram = ((this.ngram << 8) + (paramInt & 0xFF) & 0xFFFFFF);
    lookup(this.ngram);
    AppMethodBeat.o(104719);
  }

  public int parse(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104721);
    int i = parse(paramCharsetDetector, (byte)32);
    AppMethodBeat.o(104721);
    return i;
  }

  public int parse(CharsetDetector paramCharsetDetector, byte paramByte)
  {
    AppMethodBeat.i(104722);
    this.spaceChar = ((byte)paramByte);
    parseCharacters(paramCharsetDetector);
    addByte(this.spaceChar);
    double d = this.hitCount / this.ngramCount;
    if (d > 0.33D)
    {
      paramByte = 98;
      AppMethodBeat.o(104722);
    }
    while (true)
    {
      return paramByte;
      paramByte = (int)(d * 300.0D);
      AppMethodBeat.o(104722);
    }
  }

  protected void parseCharacters(CharsetDetector paramCharsetDetector)
  {
    AppMethodBeat.i(104720);
    int i = 0;
    while (true)
    {
      int j = nextByte(paramCharsetDetector);
      if (j < 0)
        break;
      j = this.byteMap[j];
      if (j != 0)
      {
        if ((j != this.spaceChar) || (i == 0))
          addByte(j);
        if (j == this.spaceChar)
          i = 1;
        else
          i = 0;
      }
    }
    AppMethodBeat.o(104720);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_sbcs.NGramParser
 * JD-Core Version:    0.6.2
 */