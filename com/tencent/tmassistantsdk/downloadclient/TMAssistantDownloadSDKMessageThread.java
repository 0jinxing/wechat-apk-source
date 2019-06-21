package com.tencent.tmassistantsdk.downloadclient;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.util.ParamPair;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class TMAssistantDownloadSDKMessageThread extends Handler
{
  private static TMAssistantDownloadSDKMessageThread mInstance = null;
  private static HandlerThread mMessagehandlerThread = null;
  private static final int postActionResult = 4;
  private static final int postSDKServiceInvalidMessage = 3;
  private static final int postTaskProgressChangedMessage = 2;
  private static final int postTaskStateChangedMessage = 1;

  private TMAssistantDownloadSDKMessageThread(Looper paramLooper)
  {
    super(paramLooper);
  }

  public static TMAssistantDownloadSDKMessageThread getInstance()
  {
    try
    {
      AppMethodBeat.i(75657);
      if (mInstance == null)
      {
        localObject1 = new android/os/HandlerThread;
        ((HandlerThread)localObject1).<init>("TMAssistantDownloadSDKMessageThread");
        mMessagehandlerThread = (HandlerThread)localObject1;
        ((HandlerThread)localObject1).start();
        localObject1 = new com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKMessageThread;
        ((TMAssistantDownloadSDKMessageThread)localObject1).<init>(mMessagehandlerThread.getLooper());
        mInstance = (TMAssistantDownloadSDKMessageThread)localObject1;
      }
      Object localObject1 = mInstance;
      AppMethodBeat.o(75657);
      return localObject1;
    }
    finally
    {
    }
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(75658);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(75658);
      Object localObject1;
      while (true)
      {
        return;
        localObject1 = (ParamPair)paramMessage.obj;
        localObject2 = (TMAssistantDownloadSDKClient)((ParamPair)localObject1).mFirstParam;
        localObject1 = (ITMAssistantDownloadSDKClientListener)((ParamPair)localObject1).mSecondParam;
        Bundle localBundle = paramMessage.getData();
        String str = localBundle.getString("url");
        int i = localBundle.getInt("state");
        int j = localBundle.getInt("errorCode");
        paramMessage = localBundle.getString("errorMsg");
        boolean bool1 = localBundle.getBoolean("hasChangeUrl");
        boolean bool2 = localBundle.getBoolean("autoRetry");
        if (localObject1 == null)
          break;
        ((ITMAssistantDownloadSDKClientListener)localObject1).OnDownloadSDKTaskStateChanged((TMAssistantDownloadSDKClient)localObject2, str, i, j, paramMessage, bool1, bool2);
        AppMethodBeat.o(75658);
        continue;
        localObject1 = (ParamPair)paramMessage.obj;
        localObject2 = (TMAssistantDownloadSDKClient)((ParamPair)localObject1).mFirstParam;
        localObject1 = (ITMAssistantDownloadSDKClientListener)((ParamPair)localObject1).mSecondParam;
        paramMessage = paramMessage.getData();
        str = paramMessage.getString("url");
        long l1 = paramMessage.getLong("receiveDataLen");
        long l2 = paramMessage.getLong("totalDataLen");
        if (localObject1 == null)
          break;
        ((ITMAssistantDownloadSDKClientListener)localObject1).OnDownloadSDKTaskProgressChanged((TMAssistantDownloadSDKClient)localObject2, str, l1, l2);
        AppMethodBeat.o(75658);
        continue;
        localObject2 = (ParamPair)paramMessage.obj;
        paramMessage = (TMAssistantDownloadSDKClient)((ParamPair)localObject2).mFirstParam;
        localObject2 = (ITMAssistantDownloadSDKClientListener)((ParamPair)localObject2).mSecondParam;
        if (localObject2 == null)
          break;
        ((ITMAssistantDownloadSDKClientListener)localObject2).OnDwonloadSDKServiceInvalid(paramMessage);
        AppMethodBeat.o(75658);
      }
      Object localObject2 = (ParamPair)paramMessage.obj;
      paramMessage = (byte[])((ParamPair)localObject2).mFirstParam;
      localObject2 = (ArrayList)((ParamPair)localObject2).mSecondParam;
      if (localObject2 != null)
      {
        localObject1 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (IAssistantOnActionListener)((Iterator)localObject1).next();
          if (localObject2 != null)
            ((IAssistantOnActionListener)localObject2).onActionResult(paramMessage);
        }
      }
    }
  }

  public void postActionResult(byte[] paramArrayOfByte, ArrayList<IAssistantOnActionListener> paramArrayList)
  {
    AppMethodBeat.i(75662);
    if ((paramArrayOfByte != null) && (paramArrayList != null))
    {
      Message localMessage = getInstance().obtainMessage();
      localMessage.what = 4;
      localMessage.obj = new ParamPair(paramArrayOfByte, paramArrayList);
      localMessage.sendToTarget();
    }
    AppMethodBeat.o(75662);
  }

  public void postSDKServiceInvalidMessage(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, ITMAssistantDownloadSDKClientListener paramITMAssistantDownloadSDKClientListener)
  {
    AppMethodBeat.i(75661);
    if ((paramITMAssistantDownloadSDKClientListener == null) || (paramTMAssistantDownloadSDKClient == null))
      AppMethodBeat.o(75661);
    while (true)
    {
      return;
      Message localMessage = getInstance().obtainMessage();
      localMessage.what = 3;
      localMessage.obj = new ParamPair(paramTMAssistantDownloadSDKClient, paramITMAssistantDownloadSDKClientListener);
      localMessage.sendToTarget();
      AppMethodBeat.o(75661);
    }
  }

  public void postTaskProgressChangedMessage(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, ITMAssistantDownloadSDKClientListener paramITMAssistantDownloadSDKClientListener, String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(75660);
    if ((paramITMAssistantDownloadSDKClientListener == null) || (paramTMAssistantDownloadSDKClient == null))
    {
      TMLog.i("TMAssistantDownloadSDKMessageThread", "listenr:" + paramITMAssistantDownloadSDKClientListener + " === sdkClient" + paramTMAssistantDownloadSDKClient);
      AppMethodBeat.o(75660);
    }
    while (true)
    {
      return;
      Message localMessage = getInstance().obtainMessage();
      localMessage.what = 2;
      localMessage.obj = new ParamPair(paramTMAssistantDownloadSDKClient, paramITMAssistantDownloadSDKClientListener);
      paramTMAssistantDownloadSDKClient = new Bundle();
      paramTMAssistantDownloadSDKClient.putString("url", paramString);
      paramTMAssistantDownloadSDKClient.putLong("receiveDataLen", paramLong1);
      paramTMAssistantDownloadSDKClient.putLong("totalDataLen", paramLong2);
      localMessage.setData(paramTMAssistantDownloadSDKClient);
      localMessage.sendToTarget();
      AppMethodBeat.o(75660);
    }
  }

  public void postTaskStateChangedMessage(TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, ITMAssistantDownloadSDKClientListener paramITMAssistantDownloadSDKClientListener, String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(75659);
    if ((paramITMAssistantDownloadSDKClientListener == null) || (paramTMAssistantDownloadSDKClient == null))
      AppMethodBeat.o(75659);
    while (true)
    {
      return;
      Message localMessage = getInstance().obtainMessage();
      localMessage.what = 1;
      localMessage.obj = new ParamPair(paramTMAssistantDownloadSDKClient, paramITMAssistantDownloadSDKClientListener);
      paramTMAssistantDownloadSDKClient = new Bundle();
      paramTMAssistantDownloadSDKClient.putString("url", paramString1);
      paramTMAssistantDownloadSDKClient.putInt("state", paramInt1);
      paramTMAssistantDownloadSDKClient.putInt("errorCode", paramInt2);
      paramTMAssistantDownloadSDKClient.putString("errorMsg", paramString2);
      paramTMAssistantDownloadSDKClient.putBoolean("hasChangeUrl", paramBoolean1);
      paramTMAssistantDownloadSDKClient.putBoolean("autoRetry", paramBoolean2);
      localMessage.setData(paramTMAssistantDownloadSDKClient);
      localMessage.sendToTarget();
      AppMethodBeat.o(75659);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread
 * JD-Core Version:    0.6.2
 */