package com.tencent.qqmusic.mediaplayer.seektable.mpeg4;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Mp4SeekTable
  implements SeekTable
{
  private final Map<String, IMpeg4Box> essentialStblChunkMap;
  private final Mdhd mdhd;

  public Mp4SeekTable()
  {
    AppMethodBeat.i(128467);
    this.essentialStblChunkMap = new HashMap();
    this.essentialStblChunkMap.put("stco", new Stco());
    this.essentialStblChunkMap.put("co64", new Co64());
    this.essentialStblChunkMap.put("stts", new Stts());
    this.essentialStblChunkMap.put("stsc", new Stsc());
    this.essentialStblChunkMap.put("stsz", new Stsz());
    this.mdhd = new Mdhd();
    AppMethodBeat.o(128467);
  }

  private static void chunkOfSample(Stsc paramStsc, int paramInt, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(128471);
    int i = paramStsc.getEntryCount();
    int j = 0;
    int k = 1;
    int m = 0;
    int i4;
    for (int n = 0; ; n = i4)
    {
      int i1 = paramStsc.getFirstChunk()[n];
      int i2 = (i1 - k) * j;
      int i3;
      if (paramInt < m + i2)
      {
        i1 = 1;
        i3 = j;
        if (i3 == 0)
          break label171;
        if (i1 == 0)
          break label165;
        paramInt = (paramInt - m) / i3 + k;
      }
      while (true)
      {
        paramArrayOfInt[0] = paramInt;
        paramArrayOfInt[1] = ((paramInt - k) * i3 + m);
        AppMethodBeat.o(128471);
        return;
        j = paramStsc.getSamplesPerChunk()[n];
        i3 = m;
        i4 = n;
        if (n < i)
        {
          i4 = n + 1;
          i3 = m + i2;
        }
        if (i4 < i)
          break label176;
        n = 0;
        k = i1;
        m = i3;
        i1 = n;
        i3 = j;
        break;
        label165: paramInt = k;
        continue;
        label171: paramInt = 1;
      }
      label176: k = i1;
      m = i3;
    }
  }

  private static boolean needMoreChunks(HashSet<String> paramHashSet)
  {
    boolean bool = true;
    AppMethodBeat.i(128478);
    if (paramHashSet.size() > 2)
      AppMethodBeat.o(128478);
    while (true)
    {
      return bool;
      if ((paramHashSet.contains("stco")) && (paramHashSet.contains("co64")))
      {
        AppMethodBeat.o(128478);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(128478);
      }
    }
  }

  private static long offset64OfChunk(Co64 paramCo64, int paramInt)
  {
    AppMethodBeat.i(128473);
    long l;
    if (paramInt > paramCo64.getEntryCount())
    {
      l = paramCo64.getChunkOffset()[(paramCo64.getEntryCount() - 1)];
      AppMethodBeat.o(128473);
    }
    while (true)
    {
      return l;
      if (paramCo64.getEntryCount() > 0)
      {
        l = paramCo64.getChunkOffset()[(paramInt - 1)];
        AppMethodBeat.o(128473);
      }
      else
      {
        l = 8L;
        AppMethodBeat.o(128473);
      }
    }
  }

  private static int offsetOfChunk(Stco paramStco, int paramInt)
  {
    AppMethodBeat.i(128472);
    if (paramInt > paramStco.getEntryCount())
    {
      paramInt = paramStco.getChunkOffset()[(paramStco.getEntryCount() - 1)];
      AppMethodBeat.o(128472);
    }
    while (true)
    {
      return paramInt;
      if (paramStco.getEntryCount() > 0)
      {
        paramInt = paramStco.getChunkOffset()[(paramInt - 1)];
        AppMethodBeat.o(128472);
      }
      else
      {
        paramInt = 8;
        AppMethodBeat.o(128472);
      }
    }
  }

  private static int offsetOfSampleInChunk(Stsz paramStsz, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(128474);
    if (paramStsz.getSampleSize() != 0)
    {
      paramInt1 = (paramInt1 - paramInt2) * paramStsz.getSampleSize();
      AppMethodBeat.o(128474);
    }
    while (true)
    {
      return paramInt1;
      int i = 0;
      int j = Math.min(paramInt1, paramStsz.getSampleCount());
      paramInt1 = i;
      while (paramInt2 < j)
      {
        paramInt1 += paramStsz.getEntrySize()[paramInt2];
        paramInt2++;
      }
      AppMethodBeat.o(128474);
    }
  }

  private static void parseChunks(Parsable paramParsable, Map<String, IMpeg4Box> paramMap, Mp4SeekTable.Function1<HashSet<String>, Boolean> paramFunction1)
  {
    AppMethodBeat.i(128477);
    GhostBox localGhostBox = new GhostBox();
    HashSet localHashSet = new HashSet(paramMap.keySet());
    while (((paramFunction1 == null) || (((Boolean)paramFunction1.call(localHashSet)).booleanValue())) && (localHashSet.size() != 0) && (paramParsable.available() > 0L))
    {
      localGhostBox.parse(paramParsable, null);
      String str = localGhostBox.getType();
      IMpeg4Box localIMpeg4Box = (IMpeg4Box)paramMap.get(str);
      if (localIMpeg4Box == null)
      {
        paramParsable.skip(localGhostBox.getSize() - 8L);
      }
      else
      {
        localIMpeg4Box.parse(paramParsable, localGhostBox);
        localHashSet.remove(str);
      }
    }
    if ((paramFunction1 != null) && (((Boolean)paramFunction1.call(localHashSet)).booleanValue()))
    {
      paramParsable = new InvalidBoxException("invalid box: critical box not found!");
      AppMethodBeat.o(128477);
      throw paramParsable;
    }
    AppMethodBeat.o(128477);
  }

  private static int sampleOfTime(Stts paramStts, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(128475);
    int j = paramStts.getEntryCount();
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = paramInt;
    paramInt = m;
    m = i;
    int i2;
    if (k < j)
    {
      n = paramStts.getSampleDelta()[k];
      m = paramStts.getSampleCount()[k];
      i2 = m * n;
      if (i1 < i2)
        m = 1;
    }
    else
    {
      if (m == 0)
        break label109;
      paramInt += i1 / n;
      AppMethodBeat.o(128475);
    }
    while (true)
    {
      return paramInt;
      i1 -= i2;
      paramInt += m;
      k++;
      break;
      label109: AppMethodBeat.o(128475);
    }
  }

  private long seekInternal(int paramInt)
  {
    AppMethodBeat.i(128470);
    Object localObject = new int[2];
    paramInt = sampleOfTime((Stts)this.essentialStblChunkMap.get("stts"), paramInt);
    chunkOfSample((Stsc)this.essentialStblChunkMap.get("stsc"), paramInt, (int[])localObject);
    int i = localObject[0];
    int j = localObject[1];
    if (((IMpeg4Box)this.essentialStblChunkMap.get("stco")).getSize() != 0L);
    for (long l1 = offsetOfChunk((Stco)this.essentialStblChunkMap.get("stco"), i); ; l1 = offset64OfChunk((Co64)this.essentialStblChunkMap.get("co64"), i))
    {
      long l2 = offsetOfSampleInChunk((Stsz)this.essentialStblChunkMap.get("stsz"), paramInt, j);
      AppMethodBeat.o(128470);
      return l2 + l1;
      if (((IMpeg4Box)this.essentialStblChunkMap.get("co64")).getSize() == 0L)
        break;
    }
    localObject = new RuntimeException("invalid stbl: both [stco] nor [co64] was found!");
    AppMethodBeat.o(128470);
    throw ((Throwable)localObject);
  }

  private static IMpeg4Box seekTo(Parsable paramParsable, String paramString)
  {
    AppMethodBeat.i(128476);
    GhostBox localGhostBox = new GhostBox();
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ".");
    paramString = null;
    while (true)
    {
      if (!localStringTokenizer.hasMoreTokens())
        break label109;
      String str = localStringTokenizer.nextToken();
      int i = 0;
      while ((i == 0) && (paramParsable.available() > 0L))
      {
        localGhostBox.parse(paramParsable, null);
        if (str.equalsIgnoreCase(localGhostBox.getType()))
          break label94;
        paramParsable.skip(localGhostBox.getSize() - 8L);
      }
      continue;
      label94: i = 1;
      if (localStringTokenizer.hasMoreTokens())
        break;
      paramString = localGhostBox;
    }
    label109: AppMethodBeat.o(128476);
    return paramString;
  }

  public void parse(IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128468);
    ParsableInputStreamWrapper localParsableInputStreamWrapper = new ParsableInputStreamWrapper(paramIDataSource);
    if (seekTo(localParsableInputStreamWrapper, "moov.trak.mdia") == null)
    {
      paramIDataSource = new InvalidBoxException("invalid mp4: no [mdia] was found!");
      AppMethodBeat.o(128468);
      throw paramIDataSource;
    }
    paramIDataSource = new HashMap(2);
    paramIDataSource.put("mdhd", this.mdhd);
    paramIDataSource.put("minf", new GhostBox());
    parseChunks(localParsableInputStreamWrapper, paramIDataSource, null);
    if (seekTo(localParsableInputStreamWrapper, "stbl") == null)
    {
      paramIDataSource = new InvalidBoxException("invalid mp4: no [stbl] was found!");
      AppMethodBeat.o(128468);
      throw paramIDataSource;
    }
    parseChunks(localParsableInputStreamWrapper, this.essentialStblChunkMap, new Mp4SeekTable.1(this));
    AppMethodBeat.o(128468);
  }

  public long seek(long paramLong)
  {
    AppMethodBeat.i(128469);
    paramLong = seekInternal((int)Math.round(this.mdhd.getTimeScale() * paramLong / 1000.0D));
    AppMethodBeat.o(128469);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable
 * JD-Core Version:    0.6.2
 */