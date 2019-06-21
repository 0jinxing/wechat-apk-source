package com.tencent.tmassistantsdk.channel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class TMAssistantSDKChannel
{
  public long AddDataItem(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, long paramLong1, long paramLong2, int paramInt3, byte[] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(75616);
      TMAssistantSDKChannelDataItem localTMAssistantSDKChannelDataItem = new com/tencent/tmassistantsdk/channel/TMAssistantSDKChannelDataItem;
      localTMAssistantSDKChannelDataItem.<init>(paramString1, paramInt1, paramString2, paramInt2, paramString3, paramLong1, paramLong2, paramInt3, paramArrayOfByte);
      paramString1 = new com/tencent/tmassistantsdk/channel/DBOption;
      paramString1.<init>();
      paramLong1 = paramString1.insert(localTMAssistantSDKChannelDataItem);
      AppMethodBeat.o(75616);
      return paramLong1;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }

  public boolean delDataItem(long paramLong)
  {
    try
    {
      AppMethodBeat.i(75617);
      boolean bool;
      if (paramLong < 0L)
      {
        bool = false;
        AppMethodBeat.o(75617);
      }
      while (true)
      {
        return bool;
        DBOption localDBOption = new com/tencent/tmassistantsdk/channel/DBOption;
        localDBOption.<init>();
        bool = localDBOption.delete(paramLong);
        AppMethodBeat.o(75617);
      }
    }
    finally
    {
    }
  }

  public ArrayList<TMAssistantSDKChannelDataItem> getChannelDataItemList()
  {
    try
    {
      AppMethodBeat.i(75615);
      Object localObject1 = new com/tencent/tmassistantsdk/channel/DBOption;
      ((DBOption)localObject1).<init>();
      localObject1 = ((DBOption)localObject1).queryAll();
      AppMethodBeat.o(75615);
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel
 * JD-Core Version:    0.6.2
 */