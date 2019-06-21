package org.xwalk.core;

import android.content.Context;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.b.a;
import com.tencent.xweb.b.c;
import com.tencent.xweb.b.d;

public class XWalkLibraryLoader$WXFileDownloaderTask extends AsyncTask<Void, Integer, Integer>
  implements c
{
  private static final int DOWNLOAD_FAILED = -1;
  private static final int DOWNLOAD_SUCCESS = 0;
  private static final int UPDATE_INTERVAL_MS = 500;
  private final Object lockObj;
  private XWalkLibraryLoader.DownloadInfo mDownloadInfo;
  private XWalkLibraryLoader.DownloadListener mListener;
  private long mProgressUpdateTime;
  private d mWXFileDownloaderBridge;
  private boolean mWaitTimeout;

  public XWalkLibraryLoader$WXFileDownloaderTask(boolean paramBoolean, XWalkLibraryLoader.DownloadListener paramDownloadListener, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(85682);
    this.mProgressUpdateTime = 0L;
    this.mWXFileDownloaderBridge = null;
    this.lockObj = new Object();
    this.mWaitTimeout = false;
    this.mListener = paramDownloadListener;
    this.mDownloadInfo = new XWalkLibraryLoader.DownloadInfo();
    this.mDownloadInfo.mErrorType = 0;
    this.mDownloadInfo.mErrorCode = 0;
    this.mDownloadInfo.mDownloadType = 2;
    this.mDownloadInfo.mUrl = paramString1;
    this.mDownloadInfo.mSavePath = paramString2;
    this.mDownloadInfo.mIsRuntime = paramBoolean;
    this.mDownloadInfo.mBizType = paramInt;
    this.mWXFileDownloaderBridge = new d();
    this.mWXFileDownloaderBridge.ANq = this;
    AppMethodBeat.o(85682);
  }

  protected Integer doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(85684);
    if ((this.mWXFileDownloaderBridge == null) || (!d.isValid()))
    {
      this.mDownloadInfo.mErrorType = 2;
      this.mDownloadInfo.mErrorCode = -1;
      paramArrayOfVoid = Integer.valueOf(-1);
      AppMethodBeat.o(85684);
      return paramArrayOfVoid;
    }
    paramArrayOfVoid = this.mWXFileDownloaderBridge;
    ??? = this.mDownloadInfo.mUrl;
    String str = this.mDownloadInfo.mSavePath;
    if (d.ANp != null);
    for (int i = d.ANp.a((String)???, str, paramArrayOfVoid); ; i = -1)
    {
      while (true)
      {
        if (i != 0)
        {
          this.mDownloadInfo.mErrorType = 1;
          this.mDownloadInfo.mErrorCode = -1;
          paramArrayOfVoid = Integer.valueOf(-1);
          AppMethodBeat.o(85684);
          break;
        }
        synchronized (this.lockObj)
        {
          try
          {
            this.mWaitTimeout = true;
            this.lockObj.wait(300000L);
            if ((this.mDownloadInfo.mErrorType == 0) && (this.mDownloadInfo.mErrorCode == 0))
            {
              paramArrayOfVoid = Integer.valueOf(0);
              AppMethodBeat.o(85684);
            }
          }
          catch (InterruptedException paramArrayOfVoid)
          {
            while (true)
            {
              this.mWaitTimeout = false;
              this.mDownloadInfo.mErrorType = 2;
              this.mDownloadInfo.mErrorCode = -101;
            }
          }
        }
      }
      paramArrayOfVoid = new java/lang/StringBuilder;
      paramArrayOfVoid.<init>("download errortype:");
      Log.e("XWalkLib", this.mDownloadInfo.mErrorType + ", errorcode:" + this.mDownloadInfo.mErrorCode + ", waitTimeout:" + this.mWaitTimeout);
      if (this.mWaitTimeout)
      {
        this.mDownloadInfo.mErrorType = 1;
        this.mDownloadInfo.mErrorCode = -100;
      }
      paramArrayOfVoid = Integer.valueOf(-1);
      AppMethodBeat.o(85684);
      break;
    }
  }

  public boolean isValid()
  {
    AppMethodBeat.i(85681);
    boolean bool;
    if (this.mWXFileDownloaderBridge == null)
    {
      bool = false;
      AppMethodBeat.o(85681);
    }
    while (true)
    {
      return bool;
      bool = d.isValid();
      AppMethodBeat.o(85681);
    }
  }

  protected void onCancelled(Integer paramInteger)
  {
    AppMethodBeat.i(85686);
    if (this.mDownloadInfo.mIsRuntime)
    {
      XWalkLibraryLoader.access$002(null);
      Log.i("XWalkLib", "WXFileDownloaderTask runtime onCancelled: " + this.mDownloadInfo.mSavePath);
    }
    while (true)
    {
      this.mListener.onDownloadCancelled();
      AppMethodBeat.o(85686);
      return;
      Log.i("XWalkLib", "WXFileDownloaderTask other onCancelled: " + this.mDownloadInfo.mSavePath);
    }
  }

  protected void onPostExecute(Integer paramInteger)
  {
    AppMethodBeat.i(85687);
    if (this.mDownloadInfo.mIsRuntime)
    {
      XWalkLibraryLoader.access$002(null);
      Log.i("XWalkLib", "WXFileDownloaderTask runtime onPostExecute result " + paramInteger + " " + this.mDownloadInfo.mSavePath);
      if (paramInteger.intValue() != 0)
        break label121;
      this.mListener.onDownloadCompleted(this.mDownloadInfo);
      AppMethodBeat.o(85687);
    }
    while (true)
    {
      return;
      Log.i("XWalkLib", "WXFileDownloaderTask other onPostExecute result " + paramInteger + " " + this.mDownloadInfo.mSavePath);
      break;
      label121: this.mListener.onDownloadFailed(this.mDownloadInfo);
      AppMethodBeat.o(85687);
    }
  }

  protected void onPreExecute()
  {
    AppMethodBeat.i(85683);
    if (this.mDownloadInfo.mIsRuntime)
    {
      XWalkLibraryLoader.access$002(this);
      Log.i("XWalkLib", "WXFileDownloaderTask runtime onPreExecute: " + this.mDownloadInfo.mSavePath);
    }
    while (true)
    {
      this.mListener.onDownloadStarted(this.mDownloadInfo.mDownloadType);
      this.mDownloadInfo.mStartTimestamp = System.currentTimeMillis();
      Context localContext = XWalkEnvironment.getApplicationContext();
      this.mDownloadInfo.mNetWorkType = NetworkUtil.getCurrentNetWorkStatus(localContext);
      AppMethodBeat.o(85683);
      return;
      Log.i("XWalkLib", "WXFileDownloaderTask other onPreExecute: " + this.mDownloadInfo.mSavePath);
    }
  }

  public void onProgressChange(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(85688);
    Log.d("XWalkLib", "url:" + paramString + ", cur_size:" + paramLong1 + ", total_size:" + paramLong2);
    if (this.mDownloadInfo.mFileTotalSize != paramLong2)
      this.mDownloadInfo.mFileTotalSize = paramLong2;
    publishProgress(new Integer[] { Integer.valueOf((int)paramLong1), Integer.valueOf((int)paramLong2) });
    AppMethodBeat.o(85688);
  }

  protected void onProgressUpdate(Integer[] paramArrayOfInteger)
  {
    int i = 0;
    AppMethodBeat.i(85685);
    Log.d("XWalkLib", "WXFileDownloaderTask updated: " + paramArrayOfInteger[0] + "/" + paramArrayOfInteger[1]);
    if (paramArrayOfInteger[1].intValue() > 0)
      i = (int)(paramArrayOfInteger[0].intValue() * 100.0D / paramArrayOfInteger[1].intValue());
    this.mListener.onDownloadUpdated(i);
    AppMethodBeat.o(85685);
  }

  public void onTaskFail(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(85690);
    synchronized (this.lockObj)
    {
      this.mDownloadInfo.mErrorType = 1;
      this.mDownloadInfo.mErrorCode = paramInt;
      this.mDownloadInfo.mIsDownloadResume = paramBoolean;
      this.mWaitTimeout = false;
      this.lockObj.notify();
      AppMethodBeat.o(85690);
      return;
    }
  }

  public void onTaskSucc(String arg1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(85689);
    synchronized (this.lockObj)
    {
      this.mDownloadInfo.mIsDownloadResume = paramBoolean;
      this.mWaitTimeout = false;
      this.lockObj.notify();
      AppMethodBeat.o(85689);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkLibraryLoader.WXFileDownloaderTask
 * JD-Core Version:    0.6.2
 */