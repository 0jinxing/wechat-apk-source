package com.tencent.ttpic.wav;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class WavFileHeader
{
  public static final int WAV_CHUNKSIZE_EXCLUDE_DATA = 36;
  public static final int WAV_CHUNKSIZE_OFFSET = 4;
  public static final int WAV_FILE_HEADER_SIZE = 44;
  public static final int WAV_SUB_CHUNKSIZE1_OFFSET = 16;
  public static final int WAV_SUB_CHUNKSIZE2_OFFSET = 40;
  public short mAudioFormat;
  public short mBitsPerSample;
  public short mBlockAlign;
  public int mByteRate;
  public String mChunkID;
  public int mChunkSize;
  public String mFormat;
  public short mNumChannel;
  public int mSampleRate;
  public String mSubChunk1ID;
  public int mSubChunk1Size;
  public String mSubChunk2ID;
  public int mSubChunk2Size;

  public WavFileHeader()
  {
    this.mChunkID = "RIFF";
    this.mChunkSize = 0;
    this.mFormat = "WAVE";
    this.mSubChunk1ID = "fmt ";
    this.mSubChunk1Size = 16;
    this.mAudioFormat = ((short)1);
    this.mNumChannel = ((short)1);
    this.mSampleRate = 8000;
    this.mByteRate = 0;
    this.mBlockAlign = ((short)0);
    this.mBitsPerSample = ((short)8);
    this.mSubChunk2ID = "data";
    this.mSubChunk2Size = 0;
  }

  public WavFileHeader(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(84497);
    this.mChunkID = "RIFF";
    this.mChunkSize = 0;
    this.mFormat = "WAVE";
    this.mSubChunk1ID = "fmt ";
    this.mSubChunk1Size = 16;
    this.mAudioFormat = ((short)1);
    this.mNumChannel = ((short)1);
    this.mSampleRate = 8000;
    this.mByteRate = 0;
    this.mBlockAlign = ((short)0);
    this.mBitsPerSample = ((short)8);
    this.mSubChunk2ID = "data";
    this.mSubChunk2Size = 0;
    this.mSampleRate = paramInt1;
    this.mBitsPerSample = ((short)(short)paramInt3);
    this.mNumChannel = ((short)(short)paramInt2);
    this.mByteRate = (this.mSampleRate * this.mNumChannel * this.mBitsPerSample / 8);
    this.mBlockAlign = ((short)(short)(this.mNumChannel * this.mBitsPerSample / 8));
    AppMethodBeat.o(84497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.wav.WavFileHeader
 * JD-Core Version:    0.6.2
 */