package com.tencent.tmassistantsdk.downloadservice;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public class DownloadTask
{
  public static final String TAG = "_DownloadTask";
  protected DownloadInfo mDownloadInfo;
  HttpClient mHttpClient;
  HttpGet mHttpGet;
  private boolean mIsRedirect;
  protected final byte[] mRecvBuf;
  private String mRequestUrl;
  TMAssistantFile mSaveFile;
  protected boolean mStopTask;
  protected final int mTaskId;
  private String startDownloadNetType;

  public DownloadTask(DownloadInfo paramDownloadInfo)
  {
    AppMethodBeat.i(75744);
    this.mStopTask = false;
    this.mHttpClient = null;
    this.mHttpGet = null;
    this.mDownloadInfo = null;
    this.mRecvBuf = new byte[4096];
    this.mTaskId = GlobalUtil.getMemUUID();
    this.startDownloadNetType = "wifi";
    this.mIsRedirect = false;
    this.mDownloadInfo = paramDownloadInfo;
    AppMethodBeat.o(75744);
  }

  private void cancelInWorkThread()
  {
    AppMethodBeat.i(75746);
    this.mStopTask = true;
    if ((this.mHttpGet != null) && (!this.mHttpGet.isAborted()))
      this.mHttpGet.abort();
    AppMethodBeat.o(75746);
  }

  private void handleResponseCode(HttpResponse paramHttpResponse, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    AppMethodBeat.i(75750);
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    TMLog.i("_DownloadTask", "httpResponseCode = " + i + " " + Thread.currentThread().getName());
    paramDownloadChunkLogInfo.readHeaderTime = System.currentTimeMillis();
    paramDownloadChunkLogInfo.responseHttpCode = i;
    if ((i == 200) || (i == 206))
      this.mDownloadInfo.mRetryCnt = 0;
    Object localObject;
    switch (i)
    {
    default:
      paramHttpResponse = new StopRequestException(i, "HTTP response code error, code = ".concat(String.valueOf(i)));
      AppMethodBeat.o(75750);
      throw paramHttpResponse;
    case 200:
      localObject = paramHttpResponse.getHeaders("Content-Type");
      if ((localObject != null) && (localObject.length > 0))
      {
        if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown"))
        {
          localObject = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
          this.mDownloadInfo.mFileName = ((String)localObject);
        }
      }
      else
      {
        onReceivedResponseData(paramHttpResponse, paramDownloadChunkLogInfo);
        AppMethodBeat.o(75750);
      }
    case 206:
    case 301:
    case 302:
    case 303:
    case 307:
      while (true)
      {
        return;
        localObject = localObject[0].getValue();
        if ((!TextUtils.isEmpty((CharSequence)localObject)) && (((String)localObject).startsWith("text")))
        {
          paramHttpResponse = new StopRequestException(708, "Return contenttype = text " + Thread.currentThread().getName());
          AppMethodBeat.o(75750);
          throw paramHttpResponse;
        }
        renameApkFileName(paramHttpResponse);
        break;
        if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown"))
        {
          localObject = DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
          this.mDownloadInfo.mFileName = ((String)localObject);
        }
        while (true)
        {
          onReceivedResponseData(paramHttpResponse, paramDownloadChunkLogInfo);
          AppMethodBeat.o(75750);
          break;
          renameApkFileName(paramHttpResponse);
        }
        if (this.mDownloadInfo.mRedirectCnt > 5)
        {
          TMLog.i("_DownloadTask", "mRedirectCnt = " + this.mDownloadInfo.mRedirectCnt + ",MAX_REDIRESTS = 5");
          paramHttpResponse = new StopRequestException(709, "Redirect cnt many times.");
          AppMethodBeat.o(75750);
          throw paramHttpResponse;
        }
        paramHttpResponse = paramHttpResponse.getFirstHeader("location");
        if (paramHttpResponse == null)
          break label579;
        paramHttpResponse = paramHttpResponse.getValue();
        TMLog.i("_DownloadTask", "jumpURL = ".concat(String.valueOf(paramHttpResponse)));
        if (!DownloadHelper.isValidURL(paramHttpResponse))
          break label536;
        this.mRequestUrl = DownloadHelper.correctURL(paramHttpResponse);
        this.mIsRedirect = true;
        paramHttpResponse = this.mDownloadInfo;
        paramHttpResponse.mRedirectCnt += 1;
        AppMethodBeat.o(75750);
      }
      paramHttpResponse = new StopRequestException(700, "Jump url is not valid. httpResponseCode = " + i + " url: " + paramHttpResponse);
      AppMethodBeat.o(75750);
      throw paramHttpResponse;
      TMLog.e("_DownloadTask", "location header is null. httpResponseCode = ".concat(String.valueOf(i)));
      paramHttpResponse = new StopRequestException(702, "location header is null. httpResponseCode = ".concat(String.valueOf(i)));
      AppMethodBeat.o(75750);
      throw paramHttpResponse;
    case 416:
      paramHttpResponse = new StopRequestException(i, "HTTP response code error, code = ".concat(String.valueOf(i)));
      AppMethodBeat.o(75750);
      throw paramHttpResponse;
    case 503:
      label536: label579: paramHttpResponse = new StopRequestException(i, "HTTP response code error, code = ".concat(String.valueOf(i)));
      AppMethodBeat.o(75750);
      throw paramHttpResponse;
    case 500:
    }
    paramHttpResponse = new StopRequestException(i, "HTTP response code error, code = ".concat(String.valueOf(i)));
    AppMethodBeat.o(75750);
    throw paramHttpResponse;
  }

  private void onDownloadError(Throwable paramThrowable)
  {
    AppMethodBeat.i(75749);
    if (paramThrowable != null)
      ab.printErrStackTrace("_DownloadTask", paramThrowable, "", new Object[0]);
    AppMethodBeat.o(75749);
  }

  // ERROR //
  private void onReceivedResponseData(HttpResponse paramHttpResponse, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    // Byte code:
    //   0: ldc_w 268
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokeinterface 272 1 0
    //   12: astore_3
    //   13: aload_0
    //   14: aload_1
    //   15: aload_3
    //   16: invokespecial 276	com/tencent/tmassistantsdk/downloadservice/DownloadTask:verifyTotalLen	(Lorg/apache/http/HttpResponse;Lorg/apache/http/HttpEntity;)Z
    //   19: ifne +33 -> 52
    //   22: ldc 8
    //   24: ldc_w 278
    //   27: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   33: dup
    //   34: sipush 705
    //   37: ldc_w 280
    //   40: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   43: astore_1
    //   44: ldc_w 268
    //   47: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: aload_1
    //   51: athrow
    //   52: aload_0
    //   53: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   56: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   59: lconst_0
    //   60: lcmp
    //   61: ifne +413 -> 474
    //   64: aload_1
    //   65: invokeinterface 90 1 0
    //   70: invokeinterface 95 1 0
    //   75: sipush 200
    //   78: if_icmpne +279 -> 357
    //   81: aload_0
    //   82: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   85: aload_3
    //   86: invokeinterface 288 1 0
    //   91: invokevirtual 292	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   94: ldc 8
    //   96: new 97	java/lang/StringBuilder
    //   99: dup
    //   100: ldc_w 294
    //   103: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   106: aload_0
    //   107: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   110: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   113: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   116: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: ldc 8
    //   124: new 97	java/lang/StringBuilder
    //   127: dup
    //   128: ldc_w 299
    //   131: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: aload_0
    //   135: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   138: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   141: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   144: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokestatic 302	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: aload_1
    //   151: ldc_w 304
    //   154: invokeinterface 230 2 0
    //   159: astore_1
    //   160: aload_1
    //   161: ifnull +36 -> 197
    //   164: aload_1
    //   165: invokeinterface 197 1 0
    //   170: invokestatic 310	com/tencent/tmassistantsdk/downloadservice/ByteRange:parseContentRange	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadservice/ByteRange;
    //   173: astore_1
    //   174: aload_2
    //   175: aload_1
    //   176: invokevirtual 313	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   179: putfield 316	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangePosition	J
    //   182: aload_2
    //   183: aload_1
    //   184: invokevirtual 319	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   187: aload_1
    //   188: invokevirtual 313	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   191: lsub
    //   192: lconst_1
    //   193: ladd
    //   194: putfield 322	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangeLength	J
    //   197: aload_2
    //   198: aload_0
    //   199: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   202: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   205: putfield 325	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseContentLength	J
    //   208: aload_0
    //   209: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   212: ifnonnull +28 -> 240
    //   215: aload_0
    //   216: new 329	com/tencent/tmassistantsdk/storage/TMAssistantFile
    //   219: dup
    //   220: aload_0
    //   221: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   224: getfield 332	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTempFileName	Ljava/lang/String;
    //   227: aload_0
    //   228: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   231: getfield 184	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   234: invokespecial 334	com/tencent/tmassistantsdk/storage/TMAssistantFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   240: lconst_0
    //   241: lstore 4
    //   243: lload 4
    //   245: lstore 6
    //   247: aload_3
    //   248: invokeinterface 338 1 0
    //   253: astore_3
    //   254: lload 4
    //   256: lstore 6
    //   258: new 97	java/lang/StringBuilder
    //   261: astore_1
    //   262: lload 4
    //   264: lstore 6
    //   266: aload_1
    //   267: ldc_w 340
    //   270: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   273: lload 4
    //   275: lstore 6
    //   277: ldc 8
    //   279: aload_1
    //   280: aload_0
    //   281: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   284: getfield 184	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   287: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   293: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: lconst_0
    //   297: lstore 6
    //   299: aload_3
    //   300: aload_0
    //   301: getfield 47	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRecvBuf	[B
    //   304: invokevirtual 346	java/io/InputStream:read	([B)I
    //   307: istore 8
    //   309: iload 8
    //   311: ifle +14 -> 325
    //   314: aload_0
    //   315: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   318: ifeq +515 -> 833
    //   321: aload_3
    //   322: invokevirtual 349	java/io/InputStream:close	()V
    //   325: aload_0
    //   326: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   329: ifnull +15 -> 344
    //   332: aload_0
    //   333: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   336: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   339: aload_0
    //   340: aconst_null
    //   341: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   344: aload_2
    //   345: lload 6
    //   347: putfield 353	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:receiveDataSize	J
    //   350: ldc_w 268
    //   353: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   356: return
    //   357: aload_1
    //   358: invokeinterface 90 1 0
    //   363: invokeinterface 95 1 0
    //   368: sipush 206
    //   371: if_icmpne +62 -> 433
    //   374: aload_1
    //   375: ldc_w 304
    //   378: invokeinterface 230 2 0
    //   383: astore 9
    //   385: aload_0
    //   386: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   389: aload 9
    //   391: invokeinterface 197 1 0
    //   396: invokestatic 356	com/tencent/tmassistantsdk/downloadservice/ByteRange:getTotalSize	(Ljava/lang/String;)J
    //   399: invokevirtual 292	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   402: ldc 8
    //   404: new 97	java/lang/StringBuilder
    //   407: dup
    //   408: ldc_w 358
    //   411: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   414: aload_0
    //   415: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   418: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   421: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   424: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   427: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   430: goto -308 -> 122
    //   433: ldc 8
    //   435: new 97	java/lang/StringBuilder
    //   438: dup
    //   439: ldc_w 360
    //   442: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   445: aload_1
    //   446: invokeinterface 90 1 0
    //   451: invokeinterface 95 1 0
    //   456: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   459: ldc_w 362
    //   462: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   468: invokestatic 302	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   471: goto -349 -> 122
    //   474: aload_1
    //   475: invokeinterface 90 1 0
    //   480: invokeinterface 95 1 0
    //   485: sipush 206
    //   488: if_icmpne -280 -> 208
    //   491: aload_1
    //   492: ldc_w 304
    //   495: invokeinterface 230 2 0
    //   500: astore 9
    //   502: aload 9
    //   504: invokeinterface 197 1 0
    //   509: invokestatic 310	com/tencent/tmassistantsdk/downloadservice/ByteRange:parseContentRange	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadservice/ByteRange;
    //   512: astore_1
    //   513: aload 9
    //   515: invokeinterface 197 1 0
    //   520: invokestatic 356	com/tencent/tmassistantsdk/downloadservice/ByteRange:getTotalSize	(Ljava/lang/String;)J
    //   523: lstore 6
    //   525: aload_2
    //   526: aload_1
    //   527: invokevirtual 313	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   530: putfield 316	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangePosition	J
    //   533: aload_2
    //   534: aload_1
    //   535: invokevirtual 319	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   538: aload_1
    //   539: invokevirtual 313	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   542: lsub
    //   543: lconst_1
    //   544: ladd
    //   545: putfield 322	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseRangeLength	J
    //   548: aload_2
    //   549: lload 6
    //   551: putfield 325	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:responseContentLength	J
    //   554: new 97	java/lang/StringBuilder
    //   557: astore 10
    //   559: aload 10
    //   561: ldc_w 364
    //   564: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   567: ldc 8
    //   569: aload 10
    //   571: lload 6
    //   573: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   576: ldc_w 366
    //   579: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   582: aload_0
    //   583: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   586: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   589: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   592: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   595: invokestatic 302	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   598: new 97	java/lang/StringBuilder
    //   601: astore 10
    //   603: aload 10
    //   605: ldc_w 368
    //   608: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   611: ldc 8
    //   613: aload 10
    //   615: aload_0
    //   616: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   619: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   622: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   625: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   628: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   631: new 97	java/lang/StringBuilder
    //   634: astore 10
    //   636: aload 10
    //   638: ldc_w 373
    //   641: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   644: ldc 8
    //   646: aload 10
    //   648: aload_1
    //   649: invokevirtual 313	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   652: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   655: ldc_w 375
    //   658: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   661: aload_1
    //   662: invokevirtual 319	com/tencent/tmassistantsdk/downloadservice/ByteRange:getEnd	()J
    //   665: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   668: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   671: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   674: aload_1
    //   675: invokevirtual 313	com/tencent/tmassistantsdk/downloadservice/ByteRange:getStart	()J
    //   678: aload_0
    //   679: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   682: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   685: lcmp
    //   686: ifeq +74 -> 760
    //   689: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   692: astore_1
    //   693: aload_1
    //   694: sipush 706
    //   697: ldc_w 377
    //   700: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   703: ldc_w 268
    //   706: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   709: aload_1
    //   710: athrow
    //   711: astore_2
    //   712: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   715: astore_1
    //   716: aload_1
    //   717: sipush 704
    //   720: aload_2
    //   721: invokespecial 380	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/Throwable;)V
    //   724: ldc_w 268
    //   727: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   730: aload_1
    //   731: athrow
    //   732: astore_1
    //   733: aload_0
    //   734: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   737: ifnull +15 -> 752
    //   740: aload_0
    //   741: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   744: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   747: aload_0
    //   748: aconst_null
    //   749: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   752: ldc_w 268
    //   755: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   758: aload_1
    //   759: athrow
    //   760: lload 6
    //   762: aload_0
    //   763: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   766: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   769: lcmp
    //   770: ifeq +25 -> 795
    //   773: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   776: astore_1
    //   777: aload_1
    //   778: sipush 705
    //   781: ldc_w 382
    //   784: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   787: ldc_w 268
    //   790: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   793: aload_1
    //   794: athrow
    //   795: ldc 8
    //   797: ldc_w 384
    //   800: aload 9
    //   802: invokestatic 235	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   805: invokevirtual 163	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   808: invokestatic 387	com/tencent/tmassistantsdk/util/TMLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   811: aload_0
    //   812: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   815: ifnull -607 -> 208
    //   818: aload_0
    //   819: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   822: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   825: aload_0
    //   826: aconst_null
    //   827: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   830: goto -622 -> 208
    //   833: aload_0
    //   834: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   837: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   840: iload 8
    //   842: i2l
    //   843: ladd
    //   844: lstore 4
    //   846: lload 4
    //   848: aload_0
    //   849: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   852: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   855: lcmp
    //   856: ifgt +475 -> 1331
    //   859: lload 4
    //   861: aload_0
    //   862: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   865: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   868: lcmp
    //   869: ifne +241 -> 1110
    //   872: iconst_1
    //   873: istore 11
    //   875: aload_0
    //   876: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   879: aload_0
    //   880: getfield 47	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRecvBuf	[B
    //   883: iconst_0
    //   884: iload 8
    //   886: aload_0
    //   887: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   890: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   893: iload 11
    //   895: invokevirtual 391	com/tencent/tmassistantsdk/storage/TMAssistantFile:write	([BIIJZ)Z
    //   898: ifne +412 -> 1310
    //   901: invokestatic 394	com/tencent/tmassistantsdk/storage/TMAssistantFile:getSavePathRootDir	()Ljava/lang/String;
    //   904: aload_0
    //   905: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   908: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   911: invokestatic 398	com/tencent/tmassistantsdk/downloadservice/DownloadHelper:isSpaceEnough	(Ljava/lang/String;J)Z
    //   914: ifeq +301 -> 1215
    //   917: invokestatic 401	com/tencent/tmassistantsdk/storage/TMAssistantFile:isSDCardExistAndCanWrite	()Z
    //   920: ifeq +196 -> 1116
    //   923: new 97	java/lang/StringBuilder
    //   926: astore_1
    //   927: aload_1
    //   928: ldc_w 403
    //   931: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   934: aload_1
    //   935: aload_0
    //   936: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   939: getfield 184	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   942: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   945: ldc_w 405
    //   948: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   951: aload_0
    //   952: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   955: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   958: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   961: ldc_w 407
    //   964: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   967: iload 8
    //   969: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   972: ldc_w 409
    //   975: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   978: aload_0
    //   979: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   982: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   985: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   988: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   991: astore_1
    //   992: ldc 8
    //   994: aload_1
    //   995: invokestatic 302	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   998: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1001: astore_3
    //   1002: aload_3
    //   1003: sipush 703
    //   1006: aload_1
    //   1007: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1010: ldc_w 268
    //   1013: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1016: aload_3
    //   1017: athrow
    //   1018: astore_1
    //   1019: lload 6
    //   1021: lstore 4
    //   1023: lload 4
    //   1025: lstore 6
    //   1027: ldc 8
    //   1029: aload_1
    //   1030: ldc_w 257
    //   1033: iconst_0
    //   1034: anewarray 4	java/lang/Object
    //   1037: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1040: lload 4
    //   1042: lstore 6
    //   1044: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1047: astore_3
    //   1048: lload 4
    //   1050: lstore 6
    //   1052: aload_3
    //   1053: sipush 605
    //   1056: aload_1
    //   1057: invokespecial 380	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/Throwable;)V
    //   1060: lload 4
    //   1062: lstore 6
    //   1064: ldc_w 268
    //   1067: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1070: lload 4
    //   1072: lstore 6
    //   1074: aload_3
    //   1075: athrow
    //   1076: astore_1
    //   1077: aload_0
    //   1078: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1081: ifnull +15 -> 1096
    //   1084: aload_0
    //   1085: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1088: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1091: aload_0
    //   1092: aconst_null
    //   1093: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1096: aload_2
    //   1097: lload 6
    //   1099: putfield 353	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:receiveDataSize	J
    //   1102: ldc_w 268
    //   1105: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1108: aload_1
    //   1109: athrow
    //   1110: iconst_0
    //   1111: istore 11
    //   1113: goto -238 -> 875
    //   1116: new 97	java/lang/StringBuilder
    //   1119: astore_1
    //   1120: aload_1
    //   1121: ldc_w 411
    //   1124: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1127: aload_1
    //   1128: aload_0
    //   1129: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1132: getfield 184	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1135: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1138: ldc_w 405
    //   1141: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1144: aload_0
    //   1145: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1148: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1151: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1154: ldc_w 407
    //   1157: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1160: iload 8
    //   1162: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1165: ldc_w 409
    //   1168: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1171: aload_0
    //   1172: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1175: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1178: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1181: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1184: astore_3
    //   1185: ldc 8
    //   1187: aload_3
    //   1188: invokestatic 302	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1191: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1194: astore_1
    //   1195: aload_1
    //   1196: sipush 711
    //   1199: aload_3
    //   1200: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1203: ldc_w 268
    //   1206: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1209: aload_1
    //   1210: athrow
    //   1211: astore_1
    //   1212: goto -135 -> 1077
    //   1215: new 97	java/lang/StringBuilder
    //   1218: astore_1
    //   1219: aload_1
    //   1220: ldc_w 413
    //   1223: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1226: aload_1
    //   1227: aload_0
    //   1228: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1231: getfield 184	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1234: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1237: ldc_w 405
    //   1240: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1243: aload_0
    //   1244: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1247: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1250: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1253: ldc_w 407
    //   1256: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1259: iload 8
    //   1261: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1264: ldc_w 409
    //   1267: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1270: aload_0
    //   1271: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1274: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1277: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1280: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1283: astore_1
    //   1284: ldc 8
    //   1286: aload_1
    //   1287: invokestatic 302	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1290: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1293: astore_3
    //   1294: aload_3
    //   1295: sipush 710
    //   1298: aload_1
    //   1299: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1302: ldc_w 268
    //   1305: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1308: aload_3
    //   1309: athrow
    //   1310: aload_0
    //   1311: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1314: iload 8
    //   1316: i2l
    //   1317: invokevirtual 416	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateReceivedSize	(J)V
    //   1320: lload 6
    //   1322: iload 8
    //   1324: i2l
    //   1325: ladd
    //   1326: lstore 6
    //   1328: goto -1029 -> 299
    //   1331: new 97	java/lang/StringBuilder
    //   1334: astore_1
    //   1335: aload_1
    //   1336: ldc_w 418
    //   1339: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1342: ldc 8
    //   1344: aload_1
    //   1345: iload 8
    //   1347: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1350: ldc_w 420
    //   1353: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1356: aload_0
    //   1357: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1360: getfield 371	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mReceivedBytes	J
    //   1363: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1366: ldc_w 422
    //   1369: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1372: aload_0
    //   1373: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1376: invokevirtual 283	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getTotalSize	()J
    //   1379: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1382: ldc_w 424
    //   1385: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1388: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1391: invokestatic 302	com/tencent/tmassistantsdk/util/TMLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1394: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   1397: astore_1
    //   1398: aload_1
    //   1399: sipush 703
    //   1402: ldc_w 426
    //   1405: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   1408: ldc_w 268
    //   1411: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1414: aload_1
    //   1415: athrow
    //   1416: astore_1
    //   1417: goto -394 -> 1023
    //
    // Exception table:
    //   from	to	target	type
    //   491	711	711	java/lang/Throwable
    //   760	795	711	java/lang/Throwable
    //   795	811	711	java/lang/Throwable
    //   491	711	732	finally
    //   712	732	732	finally
    //   760	795	732	finally
    //   795	811	732	finally
    //   299	309	1018	java/net/SocketException
    //   314	325	1018	java/net/SocketException
    //   833	872	1018	java/net/SocketException
    //   875	1018	1018	java/net/SocketException
    //   1116	1211	1018	java/net/SocketException
    //   1215	1310	1018	java/net/SocketException
    //   1310	1320	1018	java/net/SocketException
    //   1331	1416	1018	java/net/SocketException
    //   247	254	1076	finally
    //   258	262	1076	finally
    //   266	273	1076	finally
    //   277	296	1076	finally
    //   1027	1040	1076	finally
    //   1044	1048	1076	finally
    //   1052	1060	1076	finally
    //   1064	1070	1076	finally
    //   1074	1076	1076	finally
    //   299	309	1211	finally
    //   314	325	1211	finally
    //   833	872	1211	finally
    //   875	1018	1211	finally
    //   1116	1211	1211	finally
    //   1215	1310	1211	finally
    //   1310	1320	1211	finally
    //   1331	1416	1211	finally
    //   247	254	1416	java/net/SocketException
    //   258	262	1416	java/net/SocketException
    //   266	273	1416	java/net/SocketException
    //   277	296	1416	java/net/SocketException
  }

  private void renameApkFileName(HttpResponse paramHttpResponse)
  {
    AppMethodBeat.i(75754);
    if (paramHttpResponse == null)
    {
      AppMethodBeat.o(75754);
      return;
    }
    if (this.mDownloadInfo.mContentType.equals("application/vnd.android.package-archive"))
    {
      Object localObject = null;
      paramHttpResponse = paramHttpResponse.getHeaders("Content-Disposition");
      if ((paramHttpResponse == null) || (paramHttpResponse.length <= 0))
        break label193;
      paramHttpResponse = paramHttpResponse[0].getValue();
      TMLog.i("_DownloadTask", "headerFileName = ".concat(String.valueOf(paramHttpResponse)));
      if ((TextUtils.isEmpty(paramHttpResponse)) || (!paramHttpResponse.contains("filename=\"")))
        break label179;
      String str = paramHttpResponse.substring(paramHttpResponse.indexOf("filename=\"") + 10);
      paramHttpResponse = localObject;
      if (!TextUtils.isEmpty(str))
      {
        paramHttpResponse = str.substring(0, str.indexOf("\""));
        TMLog.i("_DownloadTask", "header file Name =".concat(String.valueOf(paramHttpResponse)));
      }
    }
    while (true)
    {
      if (!TextUtils.isEmpty(paramHttpResponse))
      {
        paramHttpResponse = DownloadHelper.correctFileName(DownloadHelper.decodeFileName(paramHttpResponse));
        this.mDownloadInfo.mFileName = paramHttpResponse;
      }
      AppMethodBeat.o(75754);
      break;
      label179: paramHttpResponse = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
      continue;
      label193: paramHttpResponse = DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
    }
  }

  private void setExtraHeaderParam(HttpGet paramHttpGet, Map<String, String> paramMap)
  {
    AppMethodBeat.i(75755);
    if ((paramHttpGet != null) && (paramMap != null) && (paramMap.size() > 0))
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        paramHttpGet.addHeader((String)paramMap.getKey(), (String)paramMap.getValue());
      }
    }
    AppMethodBeat.o(75755);
  }

  private void setRangeHeader(HttpGet paramHttpGet, DownloadChunkLogInfo paramDownloadChunkLogInfo)
  {
    AppMethodBeat.i(75753);
    Object localObject = DownloadHelper.getNetStatus();
    this.mDownloadInfo.mNetType = ((String)localObject);
    if ((!TextUtils.isEmpty((CharSequence)localObject)) && ((((String)localObject).contains("wap")) || ((((String)localObject).contains("net")) && (this.mDownloadInfo.mRetryCnt > 0))));
    while (true)
    {
      try
      {
        int i = DownloadSetting.getSplitSizeInBytes((String)localObject);
        long l1 = this.mDownloadInfo.mReceivedBytes;
        if (this.mDownloadInfo.getTotalSize() > 0L)
        {
          long l2 = this.mDownloadInfo.mReceivedBytes + i - 1L;
          l3 = l2;
          if (l2 >= this.mDownloadInfo.getTotalSize())
            l3 = this.mDownloadInfo.getTotalSize() - 1L;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("bytes=");
          localObject = l1 + "-" + l3;
          paramHttpGet.addHeader("range", (String)localObject);
          TMLog.d("_DownloadTask", "set range header: ".concat(String.valueOf(localObject)));
          paramDownloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
          paramDownloadChunkLogInfo.requestRanagePosition = l1;
          paramDownloadChunkLogInfo.requestRanageSize = i;
          AppMethodBeat.o(75753);
          return;
        }
        long l3 = i - 1;
        continue;
      }
      catch (UnsupportedOperationException paramHttpGet)
      {
        ab.printErrStackTrace("_DownloadTask", paramHttpGet, "", new Object[0]);
        AppMethodBeat.o(75753);
        continue;
      }
      localObject = "bytes=" + this.mDownloadInfo.mReceivedBytes + "-";
      paramHttpGet.addHeader("range", (String)localObject);
      TMLog.d("_DownloadTask", "set range header: ".concat(String.valueOf(localObject)));
      paramDownloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
      paramDownloadChunkLogInfo.requestRanagePosition = this.mDownloadInfo.mReceivedBytes;
      paramDownloadChunkLogInfo.requestRanageSize = 0L;
      AppMethodBeat.o(75753);
    }
  }

  private boolean shouldRetryConnect()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(75748);
    if (this.mStopTask)
    {
      TMLog.i("_DownloadTask", "mStopTask = " + this.mStopTask);
      AppMethodBeat.o(75748);
    }
    while (true)
    {
      return bool2;
      try
      {
        Thread.sleep(5000L);
        label56: if (!DownloadHelper.isNetworkConncted())
        {
          int i = 0;
          while (true)
            if ((!DownloadHelper.isNetworkConncted()) && (i < 5))
            {
              i++;
              try
              {
                Thread.sleep(10000L);
              }
              catch (InterruptedException localInterruptedException1)
              {
                this.mDownloadInfo.mDownloadFailedErrCode = 600;
              }
            }
        }
        if (!DownloadHelper.isNetworkConncted())
        {
          TMLog.i("_DownloadTask", "network unconnected");
          AppMethodBeat.o(75748);
          continue;
        }
        if ((!DownloadHelper.getNetStatus().equalsIgnoreCase("wifi")) && (!DownloadHelper.getNetStatus().equalsIgnoreCase(this.startDownloadNetType)))
        {
          TMLog.i("_DownloadTask", "not equal netType, current: " + DownloadHelper.getNetStatus() + ", startNetType: " + this.startDownloadNetType);
          AppMethodBeat.o(75748);
          continue;
        }
        bool2 = bool1;
        if (this.mDownloadInfo.hasRetryChance())
        {
          DownloadInfo localDownloadInfo = this.mDownloadInfo;
          localDownloadInfo.mRetryCnt += 1;
          this.mDownloadInfo.mRedirectCnt = 0;
        }
        try
        {
          Thread.sleep(5000L);
          bool2 = true;
          TMLog.i("_DownloadTask", "shouldRetryConnect(" + bool2 + "), retryCnt = " + this.mDownloadInfo.mRetryCnt);
          AppMethodBeat.o(75748);
        }
        catch (InterruptedException localInterruptedException2)
        {
          while (true)
          {
            this.mDownloadInfo.mDownloadFailedErrCode = 600;
            bool2 = bool1;
          }
        }
      }
      catch (InterruptedException localInterruptedException3)
      {
        break label56;
      }
    }
  }

  private boolean verifyTotalLen(HttpResponse paramHttpResponse, HttpEntity paramHttpEntity)
  {
    boolean bool = false;
    AppMethodBeat.i(75751);
    long l;
    if (paramHttpResponse.getStatusLine().getStatusCode() == 200)
    {
      l = paramHttpEntity.getContentLength();
      TMLog.i("_DownloadTask", "verifyTotalLen,totalLen = " + l + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
      if ((l != -1L) && ((this.mDownloadInfo.mRequestFileSize.longValue() <= 0L) || (l == this.mDownloadInfo.mRequestFileSize.longValue())))
        break label244;
      AppMethodBeat.o(75751);
    }
    while (true)
    {
      return bool;
      if (paramHttpResponse.getStatusLine().getStatusCode() == 206)
      {
        l = ByteRange.getTotalSize(paramHttpResponse.getFirstHeader("content-range").getValue());
        TMLog.i("_DownloadTask", "verifyTotalLen,totalLen = " + l + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
        if ((l == -1L) || ((this.mDownloadInfo.mRequestFileSize.longValue() > 0L) && (l != this.mDownloadInfo.mRequestFileSize.longValue())))
          AppMethodBeat.o(75751);
      }
      else
      {
        label244: bool = true;
        AppMethodBeat.o(75751);
      }
    }
  }

  public void cancel()
  {
    AppMethodBeat.i(75745);
    TMLog.i("_DownloadTask", "DownloadTask::cancel url: " + this.mDownloadInfo.mURL);
    if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId())
    {
      l.post(new DownloadTask.1(this));
      AppMethodBeat.o(75745);
    }
    while (true)
    {
      return;
      cancelInWorkThread();
      AppMethodBeat.o(75745);
    }
  }

  // ERROR //
  public void exec(String paramString)
  {
    // Byte code:
    //   0: ldc_w 635
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 511	com/tencent/tmassistantsdk/downloadservice/DownloadHelper:getNetStatus	()Ljava/lang/String;
    //   10: putfield 59	com/tencent/tmassistantsdk/downloadservice/DownloadTask:startDownloadNetType	Ljava/lang/String;
    //   13: aload_0
    //   14: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   17: iconst_1
    //   18: putfield 638	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTaskIsRunning	Z
    //   21: aload_0
    //   22: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   25: iconst_2
    //   26: iconst_0
    //   27: invokevirtual 642	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   30: iconst_0
    //   31: istore_2
    //   32: iconst_1
    //   33: istore_3
    //   34: iload_3
    //   35: ifeq +2061 -> 2096
    //   38: invokestatic 648	com/tencent/tmassistantsdk/logreport/DownloadReportManager:getInstance	()Lcom/tencent/tmassistantsdk/logreport/DownloadReportManager;
    //   41: iconst_0
    //   42: invokevirtual 652	com/tencent/tmassistantsdk/logreport/DownloadReportManager:createNewChunkLogInfo	(B)Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;
    //   45: astore 4
    //   47: aload 4
    //   49: aload_0
    //   50: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   53: getfield 655	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mUUID	Ljava/lang/String;
    //   56: putfield 658	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:UUID	Ljava/lang/String;
    //   59: aload 4
    //   61: aload_0
    //   62: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   65: getfield 149	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mRetryCnt	I
    //   68: i2b
    //   69: i2b
    //   70: putfield 662	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:currentRetryCnt	B
    //   73: aload 4
    //   75: aload_0
    //   76: invokevirtual 665	com/tencent/tmassistantsdk/downloadservice/DownloadTask:getDownloadURI	()Ljava/lang/String;
    //   79: putfield 668	com/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo:requestUrl	Ljava/lang/String;
    //   82: aload_0
    //   83: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   86: ifne +2010 -> 2096
    //   89: aload_0
    //   90: getfield 61	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mIsRedirect	Z
    //   93: ifeq +20 -> 113
    //   96: aload_0
    //   97: getfield 243	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   100: ifnull +13 -> 113
    //   103: aload_0
    //   104: getfield 243	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   107: invokevirtual 671	java/lang/String:length	()I
    //   110: ifne +429 -> 539
    //   113: iload_2
    //   114: ifeq +411 -> 525
    //   117: aload_0
    //   118: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   121: getfield 674	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mSecondaryUrl	Ljava/lang/String;
    //   124: invokestatic 679	com/tencent/mm/plugin/downloader/a/c:Ij	(Ljava/lang/String;)Ljava/lang/String;
    //   127: astore_1
    //   128: aload_0
    //   129: aload_1
    //   130: putfield 243	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   133: new 97	java/lang/StringBuilder
    //   136: astore 5
    //   138: aload 5
    //   140: ldc_w 681
    //   143: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   146: ldc 8
    //   148: aload 5
    //   150: aload_0
    //   151: getfield 61	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mIsRedirect	Z
    //   154: invokevirtual 546	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   157: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: ldc 8
    //   165: ldc_w 683
    //   168: iload_2
    //   169: invokestatic 686	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   172: invokevirtual 163	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   175: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: ldc 8
    //   180: ldc_w 688
    //   183: aload_1
    //   184: invokestatic 235	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   187: invokevirtual 163	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   190: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield 61	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mIsRedirect	Z
    //   198: aload_0
    //   199: invokestatic 694	com/tencent/tmassistantsdk/downloadservice/HttpClientUtil:createHttpClient	()Lorg/apache/http/client/HttpClient;
    //   202: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   205: aload_0
    //   206: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   209: invokestatic 698	com/tencent/tmassistantsdk/downloadservice/HttpClientUtil:setProxy	(Lorg/apache/http/client/HttpClient;)V
    //   212: new 74	org/apache/http/client/methods/HttpGet
    //   215: astore 5
    //   217: aload 5
    //   219: invokespecial 699	org/apache/http/client/methods/HttpGet:<init>	()V
    //   222: aload_0
    //   223: aload 5
    //   225: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   228: new 701	java/net/URI
    //   231: astore 5
    //   233: aload 5
    //   235: aload_1
    //   236: invokespecial 702	java/net/URI:<init>	(Ljava/lang/String;)V
    //   239: aload_0
    //   240: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   243: aload 5
    //   245: invokevirtual 706	org/apache/http/client/methods/HttpGet:setURI	(Ljava/net/URI;)V
    //   248: aload_0
    //   249: aload_0
    //   250: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   253: aload_0
    //   254: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   257: invokevirtual 710	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:getHeaderParams	()Ljava/util/HashMap;
    //   260: invokespecial 712	com/tencent/tmassistantsdk/downloadservice/DownloadTask:setExtraHeaderParam	(Lorg/apache/http/client/methods/HttpGet;Ljava/util/Map;)V
    //   263: aload_0
    //   264: aload_0
    //   265: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   268: aload 4
    //   270: invokespecial 714	com/tencent/tmassistantsdk/downloadservice/DownloadTask:setRangeHeader	(Lorg/apache/http/client/methods/HttpGet;Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;)V
    //   273: aload 5
    //   275: invokevirtual 717	java/net/URI:getScheme	()Ljava/lang/String;
    //   278: ldc_w 719
    //   281: invokevirtual 181	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   284: ifeq +51 -> 335
    //   287: invokestatic 725	org/apache/http/conn/ssl/SSLSocketFactory:getSocketFactory	()Lorg/apache/http/conn/ssl/SSLSocketFactory;
    //   290: astore_1
    //   291: aload_1
    //   292: getstatic 729	org/apache/http/conn/ssl/SSLSocketFactory:BROWSER_COMPATIBLE_HOSTNAME_VERIFIER	Lorg/apache/http/conn/ssl/X509HostnameVerifier;
    //   295: invokevirtual 733	org/apache/http/conn/ssl/SSLSocketFactory:setHostnameVerifier	(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    //   298: new 735	org/apache/http/conn/scheme/Scheme
    //   301: astore 5
    //   303: aload 5
    //   305: ldc_w 719
    //   308: aload_1
    //   309: sipush 443
    //   312: invokespecial 738	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   315: aload_0
    //   316: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   319: invokeinterface 744 1 0
    //   324: invokeinterface 750 1 0
    //   329: aload 5
    //   331: invokevirtual 756	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   334: pop
    //   335: new 97	java/lang/StringBuilder
    //   338: astore_1
    //   339: aload_1
    //   340: ldc_w 758
    //   343: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   346: ldc 8
    //   348: aload_1
    //   349: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   352: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   355: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   364: aload_0
    //   365: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   368: aload_0
    //   369: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   372: invokeinterface 762 2 0
    //   377: astore_1
    //   378: aload_1
    //   379: ifnonnull +168 -> 547
    //   382: new 151	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   385: astore 4
    //   387: new 97	java/lang/StringBuilder
    //   390: astore_1
    //   391: aload_1
    //   392: ldc_w 764
    //   395: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   398: aload 4
    //   400: sipush 701
    //   403: aload_1
    //   404: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   407: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   410: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   416: invokespecial 166	com/tencent/tmassistantsdk/downloadservice/StopRequestException:<init>	(ILjava/lang/String;)V
    //   419: ldc_w 635
    //   422: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   425: aload 4
    //   427: athrow
    //   428: astore 4
    //   430: aload_0
    //   431: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   434: istore_3
    //   435: iload_3
    //   436: ifeq +222 -> 658
    //   439: iconst_0
    //   440: istore 6
    //   442: aload_0
    //   443: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   446: ifnull +25 -> 471
    //   449: aload_0
    //   450: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   453: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   456: ifne +10 -> 466
    //   459: aload_0
    //   460: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   463: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   466: aload_0
    //   467: aconst_null
    //   468: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   471: aload_0
    //   472: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   475: ifnull +22 -> 497
    //   478: aload_0
    //   479: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   482: invokeinterface 744 1 0
    //   487: invokeinterface 767 1 0
    //   492: aload_0
    //   493: aconst_null
    //   494: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   497: iload 6
    //   499: istore_3
    //   500: aload_0
    //   501: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   504: ifnull +1754 -> 2258
    //   507: aload_0
    //   508: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   511: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   514: aload_0
    //   515: aconst_null
    //   516: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   519: iload 6
    //   521: istore_3
    //   522: goto -488 -> 34
    //   525: aload_0
    //   526: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   529: getfield 461	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mRequestURL	Ljava/lang/String;
    //   532: invokestatic 679	com/tencent/mm/plugin/downloader/a/c:Ij	(Ljava/lang/String;)Ljava/lang/String;
    //   535: astore_1
    //   536: goto -408 -> 128
    //   539: aload_0
    //   540: getfield 243	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mRequestUrl	Ljava/lang/String;
    //   543: astore_1
    //   544: goto -411 -> 133
    //   547: aload_0
    //   548: aload_1
    //   549: aload 4
    //   551: invokespecial 769	com/tencent/tmassistantsdk/downloadservice/DownloadTask:handleResponseCode	(Lorg/apache/http/HttpResponse;Lcom/tencent/tmassistantsdk/protocol/jce/DownloadChunkLogInfo;)V
    //   554: aload_0
    //   555: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   558: invokevirtual 772	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasReceivedAllDataBytes	()Z
    //   561: istore_3
    //   562: iload_3
    //   563: ifne +89 -> 652
    //   566: iconst_1
    //   567: istore 6
    //   569: aload_0
    //   570: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   573: ifnull +25 -> 598
    //   576: aload_0
    //   577: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   580: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   583: ifne +10 -> 593
    //   586: aload_0
    //   587: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   590: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   593: aload_0
    //   594: aconst_null
    //   595: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   598: aload_0
    //   599: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   602: ifnull +22 -> 624
    //   605: aload_0
    //   606: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   609: invokeinterface 744 1 0
    //   614: invokeinterface 767 1 0
    //   619: aload_0
    //   620: aconst_null
    //   621: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   624: iload 6
    //   626: istore_3
    //   627: aload_0
    //   628: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   631: ifnull +1627 -> 2258
    //   634: aload_0
    //   635: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   638: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   641: aload_0
    //   642: aconst_null
    //   643: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   646: iload 6
    //   648: istore_3
    //   649: goto -615 -> 34
    //   652: iconst_0
    //   653: istore 6
    //   655: goto -86 -> 569
    //   658: new 97	java/lang/StringBuilder
    //   661: astore_1
    //   662: aload_1
    //   663: ldc_w 774
    //   666: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   669: ldc 8
    //   671: aload_1
    //   672: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   675: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   678: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   681: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   684: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   687: ldc 8
    //   689: aload 4
    //   691: ldc_w 257
    //   694: iconst_0
    //   695: anewarray 4	java/lang/Object
    //   698: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   701: aload_0
    //   702: invokespecial 776	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   705: istore_3
    //   706: iload_3
    //   707: istore 6
    //   709: iload_3
    //   710: ifne -268 -> 442
    //   713: aload_0
    //   714: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   717: sipush 601
    //   720: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   723: iload_3
    //   724: istore 6
    //   726: goto -284 -> 442
    //   729: astore_1
    //   730: aload_0
    //   731: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   734: ifnull +25 -> 759
    //   737: aload_0
    //   738: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   741: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   744: ifne +10 -> 754
    //   747: aload_0
    //   748: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   751: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   754: aload_0
    //   755: aconst_null
    //   756: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   759: aload_0
    //   760: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   763: ifnull +22 -> 785
    //   766: aload_0
    //   767: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   770: invokeinterface 744 1 0
    //   775: invokeinterface 767 1 0
    //   780: aload_0
    //   781: aconst_null
    //   782: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   785: aload_0
    //   786: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   789: ifnull +15 -> 804
    //   792: aload_0
    //   793: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   796: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   799: aload_0
    //   800: aconst_null
    //   801: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   804: ldc_w 635
    //   807: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   810: aload_1
    //   811: athrow
    //   812: astore 4
    //   814: aload_0
    //   815: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   818: istore_3
    //   819: iload_3
    //   820: ifeq +89 -> 909
    //   823: iconst_0
    //   824: istore 6
    //   826: aload_0
    //   827: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   830: ifnull +25 -> 855
    //   833: aload_0
    //   834: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   837: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   840: ifne +10 -> 850
    //   843: aload_0
    //   844: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   847: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   850: aload_0
    //   851: aconst_null
    //   852: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   855: aload_0
    //   856: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   859: ifnull +22 -> 881
    //   862: aload_0
    //   863: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   866: invokeinterface 744 1 0
    //   871: invokeinterface 767 1 0
    //   876: aload_0
    //   877: aconst_null
    //   878: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   881: iload 6
    //   883: istore_3
    //   884: aload_0
    //   885: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   888: ifnull +1370 -> 2258
    //   891: aload_0
    //   892: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   895: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   898: aload_0
    //   899: aconst_null
    //   900: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   903: iload 6
    //   905: istore_3
    //   906: goto -872 -> 34
    //   909: new 97	java/lang/StringBuilder
    //   912: astore_1
    //   913: aload_1
    //   914: ldc_w 778
    //   917: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   920: ldc 8
    //   922: aload_1
    //   923: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   926: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   929: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   932: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   935: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   938: ldc 8
    //   940: aload 4
    //   942: ldc_w 257
    //   945: iconst_0
    //   946: anewarray 4	java/lang/Object
    //   949: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   952: aload_0
    //   953: invokespecial 776	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   956: istore_3
    //   957: iload_3
    //   958: istore 6
    //   960: iload_3
    //   961: ifne -135 -> 826
    //   964: aload_0
    //   965: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   968: sipush 602
    //   971: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   974: iload_3
    //   975: istore 6
    //   977: goto -151 -> 826
    //   980: astore 4
    //   982: aload_0
    //   983: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   986: istore_3
    //   987: iload_3
    //   988: ifeq +89 -> 1077
    //   991: iconst_0
    //   992: istore 6
    //   994: aload_0
    //   995: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   998: ifnull +25 -> 1023
    //   1001: aload_0
    //   1002: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1005: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1008: ifne +10 -> 1018
    //   1011: aload_0
    //   1012: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1015: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   1018: aload_0
    //   1019: aconst_null
    //   1020: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1023: aload_0
    //   1024: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1027: ifnull +22 -> 1049
    //   1030: aload_0
    //   1031: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1034: invokeinterface 744 1 0
    //   1039: invokeinterface 767 1 0
    //   1044: aload_0
    //   1045: aconst_null
    //   1046: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1049: iload 6
    //   1051: istore_3
    //   1052: aload_0
    //   1053: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1056: ifnull +1202 -> 2258
    //   1059: aload_0
    //   1060: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1063: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1066: aload_0
    //   1067: aconst_null
    //   1068: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1071: iload 6
    //   1073: istore_3
    //   1074: goto -1040 -> 34
    //   1077: new 97	java/lang/StringBuilder
    //   1080: astore_1
    //   1081: aload_1
    //   1082: ldc_w 780
    //   1085: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1088: ldc 8
    //   1090: aload_1
    //   1091: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1094: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   1097: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1100: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1103: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1106: ldc 8
    //   1108: aload 4
    //   1110: ldc_w 257
    //   1113: iconst_0
    //   1114: anewarray 4	java/lang/Object
    //   1117: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1120: aload_0
    //   1121: invokespecial 776	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1124: istore_3
    //   1125: iload_3
    //   1126: istore 6
    //   1128: iload_3
    //   1129: ifne -135 -> 994
    //   1132: aload_0
    //   1133: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1136: sipush 603
    //   1139: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1142: iload_3
    //   1143: istore 6
    //   1145: goto -151 -> 994
    //   1148: astore 4
    //   1150: aload_0
    //   1151: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1154: istore_3
    //   1155: iload_3
    //   1156: ifeq +82 -> 1238
    //   1159: aload_0
    //   1160: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1163: ifnull +25 -> 1188
    //   1166: aload_0
    //   1167: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1170: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1173: ifne +10 -> 1183
    //   1176: aload_0
    //   1177: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1180: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   1183: aload_0
    //   1184: aconst_null
    //   1185: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1188: aload_0
    //   1189: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1192: ifnull +22 -> 1214
    //   1195: aload_0
    //   1196: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1199: invokeinterface 744 1 0
    //   1204: invokeinterface 767 1 0
    //   1209: aload_0
    //   1210: aconst_null
    //   1211: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1214: aload_0
    //   1215: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1218: ifnull +1051 -> 2269
    //   1221: aload_0
    //   1222: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1225: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1228: aload_0
    //   1229: aconst_null
    //   1230: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1233: iconst_0
    //   1234: istore_3
    //   1235: goto -1201 -> 34
    //   1238: new 97	java/lang/StringBuilder
    //   1241: astore_1
    //   1242: aload_1
    //   1243: ldc_w 782
    //   1246: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1249: ldc 8
    //   1251: aload_1
    //   1252: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1255: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   1258: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1261: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1264: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1267: ldc 8
    //   1269: aload 4
    //   1271: ldc_w 257
    //   1274: iconst_0
    //   1275: anewarray 4	java/lang/Object
    //   1278: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1281: aload_0
    //   1282: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1285: sipush 600
    //   1288: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1291: goto -132 -> 1159
    //   1294: astore 4
    //   1296: aload_0
    //   1297: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1300: istore_3
    //   1301: iload_3
    //   1302: ifeq +82 -> 1384
    //   1305: aload_0
    //   1306: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1309: ifnull +25 -> 1334
    //   1312: aload_0
    //   1313: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1316: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1319: ifne +10 -> 1329
    //   1322: aload_0
    //   1323: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1326: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   1329: aload_0
    //   1330: aconst_null
    //   1331: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1334: aload_0
    //   1335: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1338: ifnull +22 -> 1360
    //   1341: aload_0
    //   1342: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1345: invokeinterface 744 1 0
    //   1350: invokeinterface 767 1 0
    //   1355: aload_0
    //   1356: aconst_null
    //   1357: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1360: aload_0
    //   1361: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1364: ifnull +905 -> 2269
    //   1367: aload_0
    //   1368: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1371: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1374: aload_0
    //   1375: aconst_null
    //   1376: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1379: iconst_0
    //   1380: istore_3
    //   1381: goto -1347 -> 34
    //   1384: new 97	java/lang/StringBuilder
    //   1387: astore_1
    //   1388: aload_1
    //   1389: ldc_w 784
    //   1392: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1395: ldc 8
    //   1397: aload_1
    //   1398: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1401: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   1404: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1407: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1410: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1413: ldc 8
    //   1415: aload 4
    //   1417: ldc_w 257
    //   1420: iconst_0
    //   1421: anewarray 4	java/lang/Object
    //   1424: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1427: aload_0
    //   1428: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1431: sipush 607
    //   1434: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1437: goto -132 -> 1305
    //   1440: astore 4
    //   1442: aload_0
    //   1443: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1446: istore_3
    //   1447: iload_3
    //   1448: ifeq +89 -> 1537
    //   1451: iconst_0
    //   1452: istore 6
    //   1454: aload_0
    //   1455: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1458: ifnull +25 -> 1483
    //   1461: aload_0
    //   1462: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1465: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1468: ifne +10 -> 1478
    //   1471: aload_0
    //   1472: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1475: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   1478: aload_0
    //   1479: aconst_null
    //   1480: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1483: aload_0
    //   1484: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1487: ifnull +22 -> 1509
    //   1490: aload_0
    //   1491: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1494: invokeinterface 744 1 0
    //   1499: invokeinterface 767 1 0
    //   1504: aload_0
    //   1505: aconst_null
    //   1506: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1509: iload 6
    //   1511: istore_3
    //   1512: aload_0
    //   1513: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1516: ifnull +742 -> 2258
    //   1519: aload_0
    //   1520: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1523: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1526: aload_0
    //   1527: aconst_null
    //   1528: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1531: iload 6
    //   1533: istore_3
    //   1534: goto -1500 -> 34
    //   1537: new 97	java/lang/StringBuilder
    //   1540: astore_1
    //   1541: aload_1
    //   1542: ldc_w 786
    //   1545: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1548: ldc 8
    //   1550: aload_1
    //   1551: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1554: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   1557: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1560: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1563: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1566: ldc 8
    //   1568: aload 4
    //   1570: ldc_w 257
    //   1573: iconst_0
    //   1574: anewarray 4	java/lang/Object
    //   1577: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1580: aload_0
    //   1581: invokespecial 776	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1584: istore_3
    //   1585: iload_3
    //   1586: istore 6
    //   1588: iload_3
    //   1589: ifne -135 -> 1454
    //   1592: aload_0
    //   1593: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1596: sipush 606
    //   1599: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1602: iload_3
    //   1603: istore 6
    //   1605: goto -151 -> 1454
    //   1608: astore_1
    //   1609: aload_0
    //   1610: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1613: istore_3
    //   1614: iload_3
    //   1615: ifeq +90 -> 1705
    //   1618: iload_2
    //   1619: istore_3
    //   1620: iconst_0
    //   1621: istore 6
    //   1623: aload_0
    //   1624: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1627: ifnull +25 -> 1652
    //   1630: aload_0
    //   1631: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1634: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1637: ifne +10 -> 1647
    //   1640: aload_0
    //   1641: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1644: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   1647: aload_0
    //   1648: aconst_null
    //   1649: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1652: aload_0
    //   1653: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1656: ifnull +22 -> 1678
    //   1659: aload_0
    //   1660: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1663: invokeinterface 744 1 0
    //   1668: invokeinterface 767 1 0
    //   1673: aload_0
    //   1674: aconst_null
    //   1675: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1678: aload_0
    //   1679: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1682: ifnull +579 -> 2261
    //   1685: aload_0
    //   1686: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1689: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   1692: aload_0
    //   1693: aconst_null
    //   1694: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   1697: iload_3
    //   1698: istore_2
    //   1699: iload 6
    //   1701: istore_3
    //   1702: goto -1668 -> 34
    //   1705: new 97	java/lang/StringBuilder
    //   1708: astore 4
    //   1710: aload 4
    //   1712: ldc_w 788
    //   1715: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1718: ldc 8
    //   1720: aload 4
    //   1722: aload_1
    //   1723: getfield 791	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1726: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1729: ldc 108
    //   1731: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1734: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1737: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   1740: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1743: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1746: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1749: ldc 8
    //   1751: aload_1
    //   1752: ldc_w 257
    //   1755: iconst_0
    //   1756: anewarray 4	java/lang/Object
    //   1759: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1762: aload_0
    //   1763: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1766: aload_1
    //   1767: getfield 791	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1770: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   1773: aload_1
    //   1774: getfield 791	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1777: sipush 703
    //   1780: if_icmpeq +23 -> 1803
    //   1783: aload_1
    //   1784: getfield 791	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1787: sipush 710
    //   1790: if_icmpeq +13 -> 1803
    //   1793: aload_1
    //   1794: getfield 791	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1797: sipush 711
    //   1800: if_icmpne +11 -> 1811
    //   1803: iload_2
    //   1804: istore_3
    //   1805: iconst_0
    //   1806: istore 6
    //   1808: goto -185 -> 1623
    //   1811: sipush 704
    //   1814: aload_1
    //   1815: getfield 791	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1818: if_icmpne +45 -> 1863
    //   1821: aload_0
    //   1822: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1825: lconst_0
    //   1826: invokevirtual 292	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:setTotalSize	(J)V
    //   1829: new 329	com/tencent/tmassistantsdk/storage/TMAssistantFile
    //   1832: astore_1
    //   1833: aload_1
    //   1834: aload_0
    //   1835: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1838: getfield 332	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTempFileName	Ljava/lang/String;
    //   1841: aload_0
    //   1842: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1845: getfield 184	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mFileName	Ljava/lang/String;
    //   1848: invokespecial 334	com/tencent/tmassistantsdk/storage/TMAssistantFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1851: aload_1
    //   1852: invokevirtual 794	com/tencent/tmassistantsdk/storage/TMAssistantFile:deleteTempFile	()V
    //   1855: iload_2
    //   1856: istore_3
    //   1857: iconst_0
    //   1858: istore 6
    //   1860: goto -237 -> 1623
    //   1863: sipush 705
    //   1866: aload_1
    //   1867: getfield 791	com/tencent/tmassistantsdk/downloadservice/StopRequestException:mFinalErrCode	I
    //   1870: if_icmpne +46 -> 1916
    //   1873: iload_2
    //   1874: ifne +34 -> 1908
    //   1877: aload_0
    //   1878: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1881: invokevirtual 571	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasRetryChance	()Z
    //   1884: ifeq +24 -> 1908
    //   1887: aload_0
    //   1888: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   1891: getfield 674	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mSecondaryUrl	Ljava/lang/String;
    //   1894: invokestatic 203	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1897: ifne +11 -> 1908
    //   1900: iconst_1
    //   1901: istore_3
    //   1902: iconst_1
    //   1903: istore 6
    //   1905: goto -282 -> 1623
    //   1908: iload_2
    //   1909: istore_3
    //   1910: iconst_0
    //   1911: istore 6
    //   1913: goto -290 -> 1623
    //   1916: aload_0
    //   1917: invokespecial 776	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   1920: istore 6
    //   1922: iload_2
    //   1923: istore_3
    //   1924: goto -301 -> 1623
    //   1927: astore_1
    //   1928: aload_0
    //   1929: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   1932: istore_3
    //   1933: iload_3
    //   1934: ifeq +89 -> 2023
    //   1937: iconst_0
    //   1938: istore 6
    //   1940: aload_0
    //   1941: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1944: ifnull +25 -> 1969
    //   1947: aload_0
    //   1948: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1951: invokevirtual 78	org/apache/http/client/methods/HttpGet:isAborted	()Z
    //   1954: ifne +10 -> 1964
    //   1957: aload_0
    //   1958: getfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1961: invokevirtual 81	org/apache/http/client/methods/HttpGet:abort	()V
    //   1964: aload_0
    //   1965: aconst_null
    //   1966: putfield 43	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpGet	Lorg/apache/http/client/methods/HttpGet;
    //   1969: aload_0
    //   1970: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1973: ifnull +22 -> 1995
    //   1976: aload_0
    //   1977: getfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1980: invokeinterface 744 1 0
    //   1985: invokeinterface 767 1 0
    //   1990: aload_0
    //   1991: aconst_null
    //   1992: putfield 41	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mHttpClient	Lorg/apache/http/client/HttpClient;
    //   1995: iload 6
    //   1997: istore_3
    //   1998: aload_0
    //   1999: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   2002: ifnull +256 -> 2258
    //   2005: aload_0
    //   2006: getfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   2009: invokevirtual 350	com/tencent/tmassistantsdk/storage/TMAssistantFile:close	()V
    //   2012: aload_0
    //   2013: aconst_null
    //   2014: putfield 327	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mSaveFile	Lcom/tencent/tmassistantsdk/storage/TMAssistantFile;
    //   2017: iload 6
    //   2019: istore_3
    //   2020: goto -1986 -> 34
    //   2023: new 97	java/lang/StringBuilder
    //   2026: astore 4
    //   2028: aload 4
    //   2030: ldc_w 796
    //   2033: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2036: ldc 8
    //   2038: aload 4
    //   2040: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   2043: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   2046: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2049: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2052: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2055: ldc 8
    //   2057: aload_1
    //   2058: ldc_w 257
    //   2061: iconst_0
    //   2062: anewarray 4	java/lang/Object
    //   2065: invokestatic 263	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2068: aload_0
    //   2069: invokespecial 776	com/tencent/tmassistantsdk/downloadservice/DownloadTask:shouldRetryConnect	()Z
    //   2072: istore_3
    //   2073: iload_3
    //   2074: istore 6
    //   2076: iload_3
    //   2077: ifne -137 -> 1940
    //   2080: aload_0
    //   2081: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2084: sipush 604
    //   2087: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   2090: iload_3
    //   2091: istore 6
    //   2093: goto -153 -> 1940
    //   2096: ldc 8
    //   2098: new 97	java/lang/StringBuilder
    //   2101: dup
    //   2102: ldc_w 543
    //   2105: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2108: aload_0
    //   2109: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   2112: invokevirtual 546	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   2115: ldc 108
    //   2117: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2120: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   2123: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   2126: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2129: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2132: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2135: aload_0
    //   2136: getfield 39	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mStopTask	Z
    //   2139: ifne +108 -> 2247
    //   2142: ldc 8
    //   2144: new 97	java/lang/StringBuilder
    //   2147: dup
    //   2148: ldc_w 798
    //   2151: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2154: invokestatic 117	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   2157: invokevirtual 121	java/lang/Thread:getName	()Ljava/lang/String;
    //   2160: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2163: ldc_w 800
    //   2166: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2169: aload_0
    //   2170: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2173: getfield 803	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mStatus	I
    //   2176: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2179: ldc_w 805
    //   2182: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2185: aload_0
    //   2186: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2189: getfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   2192: invokevirtual 106	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2195: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2198: invokestatic 129	com/tencent/tmassistantsdk/util/TMLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2201: aload_0
    //   2202: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2205: invokevirtual 772	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:hasReceivedAllDataBytes	()Z
    //   2208: ifeq +27 -> 2235
    //   2211: aload_0
    //   2212: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2215: iconst_4
    //   2216: iload_2
    //   2217: invokevirtual 642	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   2220: aload_0
    //   2221: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2224: iconst_0
    //   2225: putfield 638	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mTaskIsRunning	Z
    //   2228: ldc_w 635
    //   2231: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2234: return
    //   2235: aload_0
    //   2236: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2239: iconst_5
    //   2240: iload_2
    //   2241: invokevirtual 642	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:updateStatus	(IZ)V
    //   2244: goto -24 -> 2220
    //   2247: aload_0
    //   2248: getfield 45	com/tencent/tmassistantsdk/downloadservice/DownloadTask:mDownloadInfo	Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   2251: iconst_0
    //   2252: putfield 559	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:mDownloadFailedErrCode	I
    //   2255: goto -35 -> 2220
    //   2258: goto -2224 -> 34
    //   2261: iload_3
    //   2262: istore_2
    //   2263: iload 6
    //   2265: istore_3
    //   2266: goto -2232 -> 34
    //   2269: iconst_0
    //   2270: istore_3
    //   2271: goto -2237 -> 34
    //
    // Exception table:
    //   from	to	target	type
    //   89	113	428	org/apache/http/conn/ConnectTimeoutException
    //   117	128	428	org/apache/http/conn/ConnectTimeoutException
    //   128	133	428	org/apache/http/conn/ConnectTimeoutException
    //   133	335	428	org/apache/http/conn/ConnectTimeoutException
    //   335	378	428	org/apache/http/conn/ConnectTimeoutException
    //   382	428	428	org/apache/http/conn/ConnectTimeoutException
    //   525	536	428	org/apache/http/conn/ConnectTimeoutException
    //   539	544	428	org/apache/http/conn/ConnectTimeoutException
    //   547	562	428	org/apache/http/conn/ConnectTimeoutException
    //   89	113	729	finally
    //   117	128	729	finally
    //   128	133	729	finally
    //   133	335	729	finally
    //   335	378	729	finally
    //   382	428	729	finally
    //   430	435	729	finally
    //   525	536	729	finally
    //   539	544	729	finally
    //   547	562	729	finally
    //   658	706	729	finally
    //   713	723	729	finally
    //   814	819	729	finally
    //   909	957	729	finally
    //   964	974	729	finally
    //   982	987	729	finally
    //   1077	1125	729	finally
    //   1132	1142	729	finally
    //   1150	1155	729	finally
    //   1238	1291	729	finally
    //   1296	1301	729	finally
    //   1384	1437	729	finally
    //   1442	1447	729	finally
    //   1537	1585	729	finally
    //   1592	1602	729	finally
    //   1609	1614	729	finally
    //   1705	1803	729	finally
    //   1811	1855	729	finally
    //   1863	1873	729	finally
    //   1877	1900	729	finally
    //   1916	1922	729	finally
    //   1928	1933	729	finally
    //   2023	2073	729	finally
    //   2080	2090	729	finally
    //   89	113	812	java/net/SocketTimeoutException
    //   117	128	812	java/net/SocketTimeoutException
    //   128	133	812	java/net/SocketTimeoutException
    //   133	335	812	java/net/SocketTimeoutException
    //   335	378	812	java/net/SocketTimeoutException
    //   382	428	812	java/net/SocketTimeoutException
    //   525	536	812	java/net/SocketTimeoutException
    //   539	544	812	java/net/SocketTimeoutException
    //   547	562	812	java/net/SocketTimeoutException
    //   89	113	980	java/net/UnknownHostException
    //   117	128	980	java/net/UnknownHostException
    //   128	133	980	java/net/UnknownHostException
    //   133	335	980	java/net/UnknownHostException
    //   335	378	980	java/net/UnknownHostException
    //   382	428	980	java/net/UnknownHostException
    //   525	536	980	java/net/UnknownHostException
    //   539	544	980	java/net/UnknownHostException
    //   547	562	980	java/net/UnknownHostException
    //   89	113	1148	java/lang/InterruptedException
    //   117	128	1148	java/lang/InterruptedException
    //   128	133	1148	java/lang/InterruptedException
    //   133	335	1148	java/lang/InterruptedException
    //   335	378	1148	java/lang/InterruptedException
    //   382	428	1148	java/lang/InterruptedException
    //   525	536	1148	java/lang/InterruptedException
    //   539	544	1148	java/lang/InterruptedException
    //   547	562	1148	java/lang/InterruptedException
    //   89	113	1294	javax/net/ssl/SSLHandshakeException
    //   117	128	1294	javax/net/ssl/SSLHandshakeException
    //   128	133	1294	javax/net/ssl/SSLHandshakeException
    //   133	335	1294	javax/net/ssl/SSLHandshakeException
    //   335	378	1294	javax/net/ssl/SSLHandshakeException
    //   382	428	1294	javax/net/ssl/SSLHandshakeException
    //   525	536	1294	javax/net/ssl/SSLHandshakeException
    //   539	544	1294	javax/net/ssl/SSLHandshakeException
    //   547	562	1294	javax/net/ssl/SSLHandshakeException
    //   89	113	1440	java/io/IOException
    //   117	128	1440	java/io/IOException
    //   128	133	1440	java/io/IOException
    //   133	335	1440	java/io/IOException
    //   335	378	1440	java/io/IOException
    //   382	428	1440	java/io/IOException
    //   525	536	1440	java/io/IOException
    //   539	544	1440	java/io/IOException
    //   547	562	1440	java/io/IOException
    //   89	113	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   117	128	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   128	133	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   133	335	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   335	378	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   382	428	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   525	536	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   539	544	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   547	562	1608	com/tencent/tmassistantsdk/downloadservice/StopRequestException
    //   89	113	1927	java/lang/Throwable
    //   117	128	1927	java/lang/Throwable
    //   128	133	1927	java/lang/Throwable
    //   133	335	1927	java/lang/Throwable
    //   335	378	1927	java/lang/Throwable
    //   382	428	1927	java/lang/Throwable
    //   525	536	1927	java/lang/Throwable
    //   539	544	1927	java/lang/Throwable
    //   547	562	1927	java/lang/Throwable
  }

  public String getDownloadURI()
  {
    return this.mDownloadInfo.mURL;
  }

  public int getPriority()
  {
    return this.mDownloadInfo.mPriority;
  }

  public int getTaskId()
  {
    return this.mTaskId;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.DownloadTask
 * JD-Core Version:    0.6.2
 */