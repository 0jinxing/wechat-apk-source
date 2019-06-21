package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;

class FileLruCache$BufferFile
{
  private static final String FILE_NAME_PREFIX = "buffer";
  private static final FilenameFilter filterExcludeBufferFiles;
  private static final FilenameFilter filterExcludeNonBufferFiles;

  static
  {
    AppMethodBeat.i(72330);
    filterExcludeBufferFiles = new FilenameFilter()
    {
      public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        AppMethodBeat.i(72326);
        boolean bool;
        if (!paramAnonymousString.startsWith("buffer"))
        {
          bool = true;
          AppMethodBeat.o(72326);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(72326);
        }
      }
    };
    filterExcludeNonBufferFiles = new FilenameFilter()
    {
      public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        AppMethodBeat.i(72327);
        boolean bool = paramAnonymousString.startsWith("buffer");
        AppMethodBeat.o(72327);
        return bool;
      }
    };
    AppMethodBeat.o(72330);
  }

  static void deleteAll(File paramFile)
  {
    AppMethodBeat.i(72328);
    paramFile = paramFile.listFiles(excludeNonBufferFiles());
    if (paramFile != null)
    {
      int i = paramFile.length;
      for (int j = 0; j < i; j++)
        paramFile[j].delete();
    }
    AppMethodBeat.o(72328);
  }

  static FilenameFilter excludeBufferFiles()
  {
    return filterExcludeBufferFiles;
  }

  static FilenameFilter excludeNonBufferFiles()
  {
    return filterExcludeNonBufferFiles;
  }

  static File newFile(File paramFile)
  {
    AppMethodBeat.i(72329);
    paramFile = new File(paramFile, "buffer" + Long.valueOf(FileLruCache.access$300().incrementAndGet()).toString());
    AppMethodBeat.o(72329);
    return paramFile;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache.BufferFile
 * JD-Core Version:    0.6.2
 */