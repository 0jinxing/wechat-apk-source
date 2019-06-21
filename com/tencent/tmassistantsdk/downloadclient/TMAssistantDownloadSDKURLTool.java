package com.tencent.tmassistantsdk.downloadclient;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.network.GetAppSimpleDetailEngine;
import com.tencent.tmassistantsdk.protocol.jce.AppDetailParam;
import com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class TMAssistantDownloadSDKURLTool
  implements ITMAssistantExchangeURLListenner
{
  protected static final String TAG = "TMAssistantDownloadSDKExchangeURL";
  protected static TMAssistantDownloadSDKURLTool mInstance = null;
  protected GetAppSimpleDetailEngine engine;
  protected ITMAssistantExchangeURLListenner mListener;

  private TMAssistantDownloadSDKURLTool(ITMAssistantExchangeURLListenner paramITMAssistantExchangeURLListenner)
  {
    AppMethodBeat.i(75671);
    this.mListener = null;
    this.engine = null;
    if (paramITMAssistantExchangeURLListenner != null)
    {
      this.mListener = paramITMAssistantExchangeURLListenner;
      this.engine = new GetAppSimpleDetailEngine(this.mListener);
      AppMethodBeat.o(75671);
    }
    while (true)
    {
      return;
      TMLog.e("TMAssistantDownloadSDKExchangeURL", "ITMAssistantExchangeURLListenner listener shouldn't be null!");
      AppMethodBeat.o(75671);
    }
  }

  public static TMAssistantDownloadSDKURLTool getInstance(ITMAssistantExchangeURLListenner paramITMAssistantExchangeURLListenner)
  {
    try
    {
      AppMethodBeat.i(75672);
      if (mInstance == null)
      {
        TMAssistantDownloadSDKURLTool localTMAssistantDownloadSDKURLTool = new com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKURLTool;
        localTMAssistantDownloadSDKURLTool.<init>(paramITMAssistantExchangeURLListenner);
        mInstance = localTMAssistantDownloadSDKURLTool;
      }
      paramITMAssistantExchangeURLListenner = mInstance;
      AppMethodBeat.o(75672);
      return paramITMAssistantExchangeURLListenner;
    }
    finally
    {
    }
    throw paramITMAssistantExchangeURLListenner;
  }

  public void exchangeUrlsFromPackageNames(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(75673);
    if (paramArrayList != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        paramArrayList = ((String)localIterator.next()).split(";");
        if ((paramArrayList != null) && (paramArrayList.length > 0))
        {
          AppDetailParam localAppDetailParam = new AppDetailParam();
          localAppDetailParam.packageName = paramArrayList[0];
          if (paramArrayList.length > 1)
            localAppDetailParam.channelId = paramArrayList[1];
          localArrayList.add(localAppDetailParam);
        }
      }
      if ((localArrayList.size() > 0) && (this.engine != null))
        this.engine.sendReuqest(localArrayList);
      AppMethodBeat.o(75673);
    }
    while (true)
    {
      return;
      TMLog.w("TMAssistantDownloadSDKExchangeURL", "packageNames is null!");
      AppMethodBeat.o(75673);
    }
  }

  public void onExchangedURLSucceed(ArrayList<AppSimpleDetail> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(75674);
    if (this.mListener != null)
      this.mListener.onExchangedURLSucceed(paramArrayList, paramBoolean);
    AppMethodBeat.o(75674);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKURLTool
 * JD-Core Version:    0.6.2
 */