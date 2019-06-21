package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class CacheBytesManager
{
  private static byte[] mCache1024 = null;
  private static byte[] mCache4096 = null;
  private static byte[] mCache8192 = null;

  private CacheBytesManager(int paramInt)
  {
  }

  public static CacheBytesManager getInstance()
  {
    AppMethodBeat.i(128439);
    CacheBytesManager localCacheBytesManager = CacheBytesManager.SingletonHolder.access$000();
    AppMethodBeat.o(128439);
    return localCacheBytesManager;
  }

  public static byte[] getStatic(int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(128440);
        Logger.d("CBM", "cache get:".concat(String.valueOf(paramInt)));
        byte[] arrayOfByte1;
        if ((paramInt == 1024) && (mCache1024 != null))
        {
          arrayOfByte1 = mCache1024;
          mCache1024 = null;
          AppMethodBeat.o(128440);
          return arrayOfByte1;
        }
        if ((paramInt == 4096) && (mCache4096 != null))
        {
          arrayOfByte1 = mCache4096;
          mCache4096 = null;
          AppMethodBeat.o(128440);
          continue;
        }
      }
      finally
      {
      }
      byte[] arrayOfByte2;
      if ((paramInt == 8192) && (mCache8192 != null))
      {
        arrayOfByte2 = mCache8192;
        mCache8192 = null;
        AppMethodBeat.o(128440);
      }
      else
      {
        arrayOfByte2 = new byte[paramInt];
        AppMethodBeat.o(128440);
      }
    }
  }

  public static byte[] recycle(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    while (true)
    {
      return null;
      try
      {
        if ((paramArrayOfByte.length == 1024) && (mCache1024 == null))
        {
          mCache1024 = paramArrayOfByte;
          continue;
        }
      }
      finally
      {
      }
      if ((paramArrayOfByte.length == 4096) && (mCache4096 == null))
        mCache4096 = paramArrayOfByte;
      else if ((paramArrayOfByte.length == 8192) && (mCache8192 == null))
        mCache8192 = paramArrayOfByte;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.CacheBytesManager
 * JD-Core Version:    0.6.2
 */