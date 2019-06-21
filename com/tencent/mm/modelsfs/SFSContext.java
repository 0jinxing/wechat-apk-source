package com.tencent.mm.modelsfs;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SFSContext
{
  long mNativePtr;

  private SFSContext(SFSContext.Builder paramBuilder)
  {
    AppMethodBeat.i(93231);
    Iterator localIterator = paramBuilder.mConf.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject instanceof Integer))
        nativeSetIntConf(i, ((Integer)localObject).intValue());
      else if ((localObject instanceof String))
        nativeSetStringConf(i, (String)localObject);
      else if ((localObject instanceof int[]))
        nativeSetIntArrayConf(i, (int[])localObject);
    }
    long l = nativeInit(paramBuilder.mName);
    if (l == 0L)
    {
      paramBuilder = new RuntimeException(nativeErrorMessage());
      AppMethodBeat.o(93231);
      throw paramBuilder;
    }
    this.mNativePtr = l;
    AppMethodBeat.o(93231);
  }

  static native int nativeClear(long paramLong);

  static native String nativeErrorMessage();

  private static native boolean nativeExists(long paramLong, String paramString);

  private static native long nativeInit(String paramString);

  private static native int nativeList(long paramLong, String paramString, List<SFSContext.FileEntry> paramList);

  private static native long nativeOpenRead(long paramLong, String paramString);

  private static native long nativeOpenWrite(long paramLong, String paramString);

  private static native void nativeRelease(long paramLong);

  private static native void nativeSetIntArrayConf(int paramInt, int[] paramArrayOfInt);

  private static native void nativeSetIntConf(int paramInt1, int paramInt2);

  private static native void nativeSetStringConf(int paramInt, String paramString);

  private static native SFSContext.FileEntry nativeStat(long paramLong, String paramString);

  static native Statistics nativeStatistics(long paramLong);

  private static native boolean nativeUnlink(long paramLong, String paramString);

  public final OutputStream aR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93235);
    if (this.mNativePtr == 0L)
    {
      paramString1 = new IllegalArgumentException("Reuse already released SFSContext.");
      AppMethodBeat.o(93235);
      throw paramString1;
    }
    long l = nativeOpenWrite(this.mNativePtr, paramString1);
    if (l == 0L)
    {
      paramString1 = new IOException(paramString1 + ": " + nativeErrorMessage());
      AppMethodBeat.o(93235);
      throw paramString1;
    }
    if (!TextUtils.isEmpty(paramString2))
    {
      paramString1 = new e(l, paramString2);
      AppMethodBeat.o(93235);
    }
    while (true)
    {
      return paramString1;
      paramString1 = new SFSOutputStream(l);
      AppMethodBeat.o(93235);
    }
  }

  public final boolean exists(String paramString)
  {
    AppMethodBeat.i(93237);
    if (this.mNativePtr == 0L)
    {
      paramString = new IllegalArgumentException("Reuse already released SFSContext.");
      AppMethodBeat.o(93237);
      throw paramString;
    }
    String str = paramString;
    if (f.th(paramString))
    {
      f.tj(paramString);
      str = f.ti(paramString);
    }
    boolean bool = nativeExists(this.mNativePtr, str);
    AppMethodBeat.o(93237);
    return bool;
  }

  protected void finalize()
  {
    AppMethodBeat.i(93240);
    if (this.mNativePtr != 0L)
      release();
    super.finalize();
    AppMethodBeat.o(93240);
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(93233);
    if (this.mNativePtr == 0L)
    {
      paramString = new IllegalArgumentException("Reuse already released SFSContext.");
      AppMethodBeat.o(93233);
      throw paramString;
    }
    long l1;
    if (f.th(paramString))
    {
      l1 = f.tj(paramString);
      paramString = f.ti(paramString);
    }
    while (true)
    {
      long l2 = nativeOpenRead(this.mNativePtr, paramString);
      if (l2 == 0L)
      {
        paramString = new FileNotFoundException(paramString + ": " + nativeErrorMessage());
        AppMethodBeat.o(93233);
        throw paramString;
      }
      if (l1 != 0L)
      {
        paramString = new d(l2, l1);
        AppMethodBeat.o(93233);
      }
      while (true)
      {
        return paramString;
        paramString = new SFSInputStream(l2);
        AppMethodBeat.o(93233);
      }
      l1 = 0L;
    }
  }

  public final OutputStream pH(String paramString)
  {
    AppMethodBeat.i(93234);
    if (this.mNativePtr == 0L)
    {
      paramString = new IllegalArgumentException("Reuse already released SFSContext.");
      AppMethodBeat.o(93234);
      throw paramString;
    }
    String str1 = "";
    String str2 = paramString;
    if (f.th(paramString))
    {
      str1 = f.tk(paramString);
      str2 = f.ti(paramString);
    }
    paramString = aR(str2, str1);
    AppMethodBeat.o(93234);
    return paramString;
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(93239);
    if (this.mNativePtr == 0L)
    {
      paramString = new IllegalArgumentException("Reuse already released SFSContext.");
      AppMethodBeat.o(93239);
      throw paramString;
    }
    String str = paramString;
    if (f.th(paramString))
    {
      f.tj(paramString);
      str = f.ti(paramString);
    }
    boolean bool = nativeUnlink(this.mNativePtr, str);
    AppMethodBeat.o(93239);
    return bool;
  }

  public final void release()
  {
    AppMethodBeat.i(93232);
    nativeRelease(this.mNativePtr);
    this.mNativePtr = 0L;
    AppMethodBeat.o(93232);
  }

  public final List<SFSContext.FileEntry> tl(String paramString)
  {
    AppMethodBeat.i(93236);
    if (this.mNativePtr == 0L)
    {
      paramString = new IllegalArgumentException("Reuse already released SFSContext.");
      AppMethodBeat.o(93236);
      throw paramString;
    }
    ArrayList localArrayList = new ArrayList();
    if (nativeList(this.mNativePtr, paramString, localArrayList) != 0)
    {
      paramString = new IOException(nativeErrorMessage());
      AppMethodBeat.o(93236);
      throw paramString;
    }
    AppMethodBeat.o(93236);
    return localArrayList;
  }

  public final SFSContext.FileEntry tm(String paramString)
  {
    AppMethodBeat.i(93238);
    if (this.mNativePtr == 0L)
    {
      paramString = new IllegalArgumentException("Reuse already released SFSContext.");
      AppMethodBeat.o(93238);
      throw paramString;
    }
    String str = paramString;
    if (f.th(paramString))
    {
      f.tj(paramString);
      str = f.ti(paramString);
    }
    paramString = nativeStat(this.mNativePtr, str);
    AppMethodBeat.o(93238);
    return paramString;
  }

  public static class Statistics
    implements Serializable
  {
    private static final long serialVersionUID = 1L;
    public SFSContext.Statistics.BlockFile[] blockFiles;
    public long blockSizeEmpty;
    public long blockSizeUsed;
    public SFSContext.Statistics.BlockType[] blockTypes;
    public long overflowActualSize;
    public long totalActualSize;

    public String toString()
    {
      int i = 0;
      AppMethodBeat.i(93230);
      Object localObject1 = new StringBuilder(4096);
      ((StringBuilder)localObject1).append("Total:\n\tActualSize: ").append(this.totalActualSize).append('\n').append("\tUsedBlockSize: ").append(this.blockSizeUsed).append('\n').append("\tEmptyBlockSize: ").append(this.blockSizeEmpty).append('\n').append("\tOverflowSize: ").append(this.overflowActualSize).append('\n');
      int k;
      Object localObject2;
      for (int j = 0; ; j++)
      {
        k = i;
        if (j >= this.blockTypes.length)
          break;
        localObject2 = this.blockTypes[j];
        ((StringBuilder)localObject1).append("BlockType: ").append(((SFSContext.Statistics.BlockType)localObject2).blockSize).append('\n').append("\tUsedCount: ").append(((SFSContext.Statistics.BlockType)localObject2).usedCount).append('\n').append("\tEmptyCount: ").append(((SFSContext.Statistics.BlockType)localObject2).emptyCount).append('\n').append("\tActualSize: ").append(((SFSContext.Statistics.BlockType)localObject2).actualSize).append('\n');
      }
      while (k < this.blockFiles.length)
      {
        localObject2 = this.blockFiles[k];
        ((StringBuilder)localObject1).append("BlockFile: ").append(k).append('\n').append("\tFileSize: ").append(((SFSContext.Statistics.BlockFile)localObject2).fileSize).append('\n').append("\tUsedBlockCount: ").append(((SFSContext.Statistics.BlockFile)localObject2).blockCount).append('\n').append("\tEmptyBlockCount: ").append(((SFSContext.Statistics.BlockFile)localObject2).emptyCount).append('\n').append("\tTimestamp: ").append(((SFSContext.Statistics.BlockFile)localObject2).timestamp).append('\n').append("\tDeleted: ").append(((SFSContext.Statistics.BlockFile)localObject2).deleted).append('\n');
        k++;
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      AppMethodBeat.o(93230);
      return localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.SFSContext
 * JD-Core Version:    0.6.2
 */