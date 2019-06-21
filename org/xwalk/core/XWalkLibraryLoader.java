package org.xwalk.core;

import android.content.Context;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class XWalkLibraryLoader
{
  private static final String DEFAULT_DOWNLOAD_FILE_NAME = "xwalk_download.tmp";
  private static final int DOWNLOAD_TYPE_CDN = 2;
  private static final int DOWNLOAD_TYPE_HTTP = 1;
  private static final String DOWNLOAD_WITHOUT_NOTIFICATION = "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION";
  private static final int ERROR_CODE_DOWNLOADER_TIMEOUT = -100;
  private static final int ERROR_CODE_EXCEPTION = -101;
  private static final int ERROR_CODE_FAILED = -1;
  private static final int ERROR_CODE_SUCCESS = 0;
  private static final int ERROR_TYPE_DOWNLOADER = 1;
  private static final int ERROR_TYPE_NONE = 0;
  private static final int ERROR_TYPE_USER = 2;
  private static final String TAG = "XWalkLib";
  private static AsyncTask<Void, Integer, Integer> sActiveTask;

  public static boolean cancelHttpDownload()
  {
    boolean bool = true;
    AppMethodBeat.i(85701);
    if ((sActiveTask != null) && ((sActiveTask instanceof HttpDownloadTask)) && (sActiveTask.cancel(true)))
      AppMethodBeat.o(85701);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85701);
    }
  }

  public static void finishInit(Context paramContext)
  {
    AppMethodBeat.i(85699);
    XWalkCoreWrapper.handlePostInit(paramContext.getClass().getName());
    AppMethodBeat.o(85699);
  }

  public static int getLibraryStatus()
  {
    AppMethodBeat.i(85697);
    int i = XWalkCoreWrapper.getCoreStatus();
    AppMethodBeat.o(85697);
    return i;
  }

  public static boolean isDownloading()
  {
    if ((sActiveTask != null) && ((sActiveTask instanceof HttpDownloadTask)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isInitializing()
  {
    return false;
  }

  public static boolean isLibraryReady()
  {
    AppMethodBeat.i(85696);
    boolean bool;
    if (XWalkCoreWrapper.getInstance() != null)
    {
      bool = true;
      AppMethodBeat.o(85696);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85696);
    }
  }

  public static boolean isSharedLibrary()
  {
    AppMethodBeat.i(85695);
    boolean bool = XWalkCoreWrapper.getInstance().isSharedMode();
    AppMethodBeat.o(85695);
    return bool;
  }

  public static void prepareToInit(Context paramContext)
  {
    AppMethodBeat.i(85698);
    XWalkEnvironment.init(paramContext);
    XWalkCoreWrapper.handlePreInit(paramContext.getClass().getName());
    AppMethodBeat.o(85698);
  }

  public static void startHttpDownload(DownloadListener paramDownloadListener, Context paramContext, XWalkUpdater.UpdateConfig paramUpdateConfig)
  {
    AppMethodBeat.i(85700);
    paramContext = new XWalkLibraryLoader.WXFileDownloaderTask(true, paramDownloadListener, paramUpdateConfig.downUrl, paramUpdateConfig.getDownloadPath(), paramUpdateConfig.getUpdateBizType());
    if ((paramUpdateConfig.bUseCdn) && (paramContext.isValid()))
    {
      Log.i("XWalkLib", "use wx file downloader");
      paramContext.execute(new Void[0]);
      AppMethodBeat.o(85700);
    }
    while (true)
    {
      return;
      Log.i("XWalkLib", "use default file downloader");
      new HttpDownloadTask(true, paramDownloadListener, paramUpdateConfig.downUrl, paramUpdateConfig.getDownloadPath()).execute(new Void[0]);
      AppMethodBeat.o(85700);
    }
  }

  public static abstract interface DownloadListener
  {
    public abstract void onDownloadCancelled();

    public abstract void onDownloadCompleted(XWalkLibraryLoader.DownloadInfo paramDownloadInfo);

    public abstract void onDownloadFailed(XWalkLibraryLoader.DownloadInfo paramDownloadInfo);

    public abstract void onDownloadStarted(int paramInt);

    public abstract void onDownloadUpdated(int paramInt);
  }

  public static class HttpDownloadTask extends AsyncTask<Void, Integer, Integer>
  {
    private static final int DOWNLOAD_FAILED = -1;
    private static final int DOWNLOAD_SUCCESS = 0;
    private static final int UPDATE_INTERVAL_MS = 500;
    private static final String XWALK_DOWNLOAD_DIR = "xwalk_download";
    private XWalkLibraryLoader.DownloadInfo mDownloadInfo;
    private File mDownloadedFile;
    private XWalkLibraryLoader.DownloadListener mListener;
    private long mProgressUpdateTime;

    public HttpDownloadTask(boolean paramBoolean, XWalkLibraryLoader.DownloadListener paramDownloadListener, String paramString1, String paramString2)
    {
      AppMethodBeat.i(85671);
      this.mListener = paramDownloadListener;
      this.mDownloadInfo = new XWalkLibraryLoader.DownloadInfo();
      this.mDownloadInfo.mErrorType = 0;
      this.mDownloadInfo.mErrorCode = 0;
      this.mDownloadInfo.mDownloadType = 1;
      this.mDownloadInfo.mUrl = paramString1;
      this.mDownloadInfo.mSavePath = paramString2;
      this.mDownloadInfo.mIsRuntime = paramBoolean;
      AppMethodBeat.o(85671);
    }

    // ERROR //
    protected Integer doInBackground(Void[] paramArrayOfVoid)
    {
      // Byte code:
      //   0: ldc 76
      //   2: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_2
      //   7: aconst_null
      //   8: astore_3
      //   9: aconst_null
      //   10: astore 4
      //   12: aconst_null
      //   13: astore_1
      //   14: aload_1
      //   15: astore 5
      //   17: new 78	java/net/URL
      //   20: astore 6
      //   22: aload_1
      //   23: astore 5
      //   25: aload 6
      //   27: aload_0
      //   28: getfield 46	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadInfo	Lorg/xwalk/core/XWalkLibraryLoader$DownloadInfo;
      //   31: getfield 58	org/xwalk/core/XWalkLibraryLoader$DownloadInfo:mUrl	Ljava/lang/String;
      //   34: invokespecial 81	java/net/URL:<init>	(Ljava/lang/String;)V
      //   37: aload_1
      //   38: astore 5
      //   40: aload 6
      //   42: invokevirtual 85	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   45: checkcast 87	java/net/HttpURLConnection
      //   48: astore 7
      //   50: aload 7
      //   52: astore_1
      //   53: aload 7
      //   55: astore 5
      //   57: aload 7
      //   59: sipush 30000
      //   62: invokevirtual 90	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   65: aload 7
      //   67: astore_1
      //   68: aload 7
      //   70: astore 5
      //   72: aload 7
      //   74: sipush 30000
      //   77: invokevirtual 93	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   80: aload 7
      //   82: astore_1
      //   83: aload 7
      //   85: astore 5
      //   87: aload 7
      //   89: invokevirtual 96	java/net/HttpURLConnection:connect	()V
      //   92: aload 7
      //   94: astore_1
      //   95: aload 7
      //   97: astore 5
      //   99: aload 7
      //   101: invokevirtual 100	java/net/HttpURLConnection:getResponseCode	()I
      //   104: sipush 200
      //   107: if_icmpeq +107 -> 214
      //   110: aload 7
      //   112: astore_1
      //   113: aload 7
      //   115: astore 5
      //   117: aload 7
      //   119: invokevirtual 100	java/net/HttpURLConnection:getResponseCode	()I
      //   122: sipush 206
      //   125: if_icmpeq +89 -> 214
      //   128: aload 7
      //   130: astore_1
      //   131: aload 7
      //   133: astore 5
      //   135: new 102	java/lang/StringBuilder
      //   138: astore 6
      //   140: aload 7
      //   142: astore_1
      //   143: aload 7
      //   145: astore 5
      //   147: aload 6
      //   149: ldc 104
      //   151: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   154: aload 7
      //   156: astore_1
      //   157: aload 7
      //   159: astore 5
      //   161: ldc 107
      //   163: aload 6
      //   165: aload 7
      //   167: invokevirtual 100	java/net/HttpURLConnection:getResponseCode	()I
      //   170: invokevirtual 111	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   173: ldc 113
      //   175: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   178: aload 7
      //   180: invokevirtual 120	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
      //   183: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   186: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   189: invokestatic 129	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   192: aload 7
      //   194: ifnull +8 -> 202
      //   197: aload 7
      //   199: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   202: ldc 76
      //   204: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   207: iconst_m1
      //   208: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   211: astore_1
      //   212: aload_1
      //   213: areturn
      //   214: aload 7
      //   216: astore_1
      //   217: aload 7
      //   219: astore 5
      //   221: aload 7
      //   223: invokevirtual 141	java/net/HttpURLConnection:getContentLength	()I
      //   226: istore 8
      //   228: aload 7
      //   230: astore_1
      //   231: aload 7
      //   233: astore 5
      //   235: aload_0
      //   236: getfield 143	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadedFile	Ljava/io/File;
      //   239: invokevirtual 149	java/io/File:exists	()Z
      //   242: ifeq +841 -> 1083
      //   245: aload 7
      //   247: astore_1
      //   248: aload 7
      //   250: astore 5
      //   252: aload_0
      //   253: getfield 143	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadedFile	Ljava/io/File;
      //   256: invokevirtual 153	java/io/File:length	()J
      //   259: lstore 9
      //   261: iload 8
      //   263: i2l
      //   264: lload 9
      //   266: lcmp
      //   267: ifne +40 -> 307
      //   270: aload 7
      //   272: astore_1
      //   273: aload 7
      //   275: astore 5
      //   277: ldc 107
      //   279: ldc 155
      //   281: invokestatic 157	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   284: aload 7
      //   286: ifnull +8 -> 294
      //   289: aload 7
      //   291: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   294: ldc 76
      //   296: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   299: iconst_0
      //   300: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   303: astore_1
      //   304: goto -92 -> 212
      //   307: lload 9
      //   309: lconst_0
      //   310: lcmp
      //   311: ifle +32 -> 343
      //   314: aload 7
      //   316: astore_1
      //   317: aload 7
      //   319: astore 5
      //   321: aload_0
      //   322: getfield 46	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadInfo	Lorg/xwalk/core/XWalkLibraryLoader$DownloadInfo;
      //   325: iconst_1
      //   326: putfield 160	org/xwalk/core/XWalkLibraryLoader$DownloadInfo:mIsDownloadResume	Z
      //   329: aload 7
      //   331: astore_1
      //   332: aload 7
      //   334: astore 5
      //   336: ldc 107
      //   338: ldc 162
      //   340: invokestatic 157	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   343: aload 7
      //   345: astore_1
      //   346: aload 7
      //   348: astore 5
      //   350: aload 7
      //   352: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   355: aload 7
      //   357: astore_1
      //   358: aload 7
      //   360: astore 5
      //   362: aload 6
      //   364: invokevirtual 85	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   367: checkcast 87	java/net/HttpURLConnection
      //   370: astore 7
      //   372: aload 7
      //   374: astore_1
      //   375: aload 7
      //   377: astore 5
      //   379: aload 7
      //   381: sipush 30000
      //   384: invokevirtual 90	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   387: aload 7
      //   389: astore_1
      //   390: aload 7
      //   392: astore 5
      //   394: aload 7
      //   396: sipush 30000
      //   399: invokevirtual 93	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   402: aload 7
      //   404: astore_1
      //   405: aload 7
      //   407: astore 5
      //   409: new 102	java/lang/StringBuilder
      //   412: astore 6
      //   414: aload 7
      //   416: astore_1
      //   417: aload 7
      //   419: astore 5
      //   421: aload 6
      //   423: ldc 164
      //   425: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   428: aload 7
      //   430: astore_1
      //   431: aload 7
      //   433: astore 5
      //   435: aload 7
      //   437: ldc 166
      //   439: aload 6
      //   441: lload 9
      //   443: invokevirtual 169	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   446: ldc 171
      //   448: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   451: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   454: invokevirtual 174	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   457: aload 7
      //   459: astore_1
      //   460: aload 7
      //   462: astore 5
      //   464: ldc 107
      //   466: ldc 176
      //   468: lload 9
      //   470: invokestatic 181	java/lang/String:valueOf	(J)Ljava/lang/String;
      //   473: invokevirtual 185	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
      //   476: invokestatic 157	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   479: aload 7
      //   481: astore_1
      //   482: aload 7
      //   484: astore 5
      //   486: aload 7
      //   488: invokevirtual 96	java/net/HttpURLConnection:connect	()V
      //   491: aload 7
      //   493: astore_1
      //   494: aload 7
      //   496: astore 5
      //   498: aload 7
      //   500: invokevirtual 100	java/net/HttpURLConnection:getResponseCode	()I
      //   503: sipush 200
      //   506: if_icmpeq +108 -> 614
      //   509: aload 7
      //   511: astore_1
      //   512: aload 7
      //   514: astore 5
      //   516: aload 7
      //   518: invokevirtual 100	java/net/HttpURLConnection:getResponseCode	()I
      //   521: sipush 206
      //   524: if_icmpeq +90 -> 614
      //   527: aload 7
      //   529: astore_1
      //   530: aload 7
      //   532: astore 5
      //   534: new 102	java/lang/StringBuilder
      //   537: astore 6
      //   539: aload 7
      //   541: astore_1
      //   542: aload 7
      //   544: astore 5
      //   546: aload 6
      //   548: ldc 104
      //   550: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   553: aload 7
      //   555: astore_1
      //   556: aload 7
      //   558: astore 5
      //   560: ldc 107
      //   562: aload 6
      //   564: aload 7
      //   566: invokevirtual 100	java/net/HttpURLConnection:getResponseCode	()I
      //   569: invokevirtual 111	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   572: ldc 113
      //   574: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   577: aload 7
      //   579: invokevirtual 120	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
      //   582: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   585: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   588: invokestatic 129	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   591: aload 7
      //   593: ifnull +8 -> 601
      //   596: aload 7
      //   598: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   601: ldc 76
      //   603: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   606: iconst_m1
      //   607: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   610: astore_1
      //   611: goto -399 -> 212
      //   614: aload 7
      //   616: astore_1
      //   617: aload 7
      //   619: astore 5
      //   621: aload 7
      //   623: invokevirtual 141	java/net/HttpURLConnection:getContentLength	()I
      //   626: istore 8
      //   628: aload 7
      //   630: astore_1
      //   631: aload_1
      //   632: astore 5
      //   634: aload_1
      //   635: invokevirtual 189	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   638: astore 7
      //   640: aload 7
      //   642: astore 5
      //   644: aload_1
      //   645: astore 11
      //   647: aload_3
      //   648: astore_2
      //   649: aload 5
      //   651: astore 6
      //   653: new 191	java/io/FileOutputStream
      //   656: astore 7
      //   658: aload_1
      //   659: astore 11
      //   661: aload_3
      //   662: astore_2
      //   663: aload 5
      //   665: astore 6
      //   667: aload 7
      //   669: aload_0
      //   670: getfield 143	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadedFile	Ljava/io/File;
      //   673: iconst_1
      //   674: invokespecial 194	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
      //   677: sipush 4096
      //   680: newarray byte
      //   682: astore_2
      //   683: lconst_0
      //   684: lstore 12
      //   686: aload 5
      //   688: aload_2
      //   689: invokevirtual 200	java/io/InputStream:read	([B)I
      //   692: istore 14
      //   694: iload 14
      //   696: iconst_m1
      //   697: if_icmpeq +178 -> 875
      //   700: aload_0
      //   701: invokevirtual 203	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:isCancelled	()Z
      //   704: ifeq +41 -> 745
      //   707: iconst_m1
      //   708: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   711: astore_2
      //   712: aload 7
      //   714: invokevirtual 208	java/io/OutputStream:close	()V
      //   717: aload 5
      //   719: ifnull +8 -> 727
      //   722: aload 5
      //   724: invokevirtual 209	java/io/InputStream:close	()V
      //   727: aload_1
      //   728: ifnull +7 -> 735
      //   731: aload_1
      //   732: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   735: ldc 76
      //   737: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   740: aload_2
      //   741: astore_1
      //   742: goto -530 -> 212
      //   745: lload 12
      //   747: iload 14
      //   749: i2l
      //   750: ladd
      //   751: lstore 15
      //   753: aload 7
      //   755: aload_2
      //   756: iconst_0
      //   757: iload 14
      //   759: invokevirtual 213	java/io/OutputStream:write	([BII)V
      //   762: invokestatic 218	android/os/SystemClock:uptimeMillis	()J
      //   765: lstore 17
      //   767: lload 15
      //   769: lstore 12
      //   771: lload 17
      //   773: aload_0
      //   774: getfield 220	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mProgressUpdateTime	J
      //   777: lsub
      //   778: ldc2_w 221
      //   781: lcmp
      //   782: ifle -96 -> 686
      //   785: aload_0
      //   786: lload 17
      //   788: putfield 220	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mProgressUpdateTime	J
      //   791: aload_0
      //   792: iconst_2
      //   793: anewarray 134	java/lang/Integer
      //   796: dup
      //   797: iconst_0
      //   798: lload 15
      //   800: lload 9
      //   802: ladd
      //   803: l2i
      //   804: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   807: aastore
      //   808: dup
      //   809: iconst_1
      //   810: iload 8
      //   812: i2l
      //   813: lload 9
      //   815: ladd
      //   816: l2i
      //   817: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   820: aastore
      //   821: invokevirtual 226	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:publishProgress	([Ljava/lang/Object;)V
      //   824: lload 15
      //   826: lstore 12
      //   828: goto -142 -> 686
      //   831: astore_2
      //   832: iconst_m1
      //   833: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   836: astore_2
      //   837: aload 7
      //   839: ifnull +8 -> 847
      //   842: aload 7
      //   844: invokevirtual 208	java/io/OutputStream:close	()V
      //   847: aload 5
      //   849: ifnull +8 -> 857
      //   852: aload 5
      //   854: invokevirtual 209	java/io/InputStream:close	()V
      //   857: aload_1
      //   858: ifnull +7 -> 865
      //   861: aload_1
      //   862: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   865: ldc 76
      //   867: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   870: aload_2
      //   871: astore_1
      //   872: goto -660 -> 212
      //   875: aload 7
      //   877: invokevirtual 229	java/io/OutputStream:flush	()V
      //   880: aload 7
      //   882: invokevirtual 208	java/io/OutputStream:close	()V
      //   885: aload 5
      //   887: ifnull +8 -> 895
      //   890: aload 5
      //   892: invokevirtual 209	java/io/InputStream:close	()V
      //   895: aload_1
      //   896: ifnull +7 -> 903
      //   899: aload_1
      //   900: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   903: aload_0
      //   904: getfield 46	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadInfo	Lorg/xwalk/core/XWalkLibraryLoader$DownloadInfo;
      //   907: aload_0
      //   908: getfield 143	org/xwalk/core/XWalkLibraryLoader$HttpDownloadTask:mDownloadedFile	Ljava/io/File;
      //   911: invokevirtual 153	java/io/File:length	()J
      //   914: putfield 232	org/xwalk/core/XWalkLibraryLoader$DownloadInfo:mFileTotalSize	J
      //   917: iconst_0
      //   918: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   921: astore_1
      //   922: ldc 76
      //   924: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   927: goto -715 -> 212
      //   930: astore 5
      //   932: aconst_null
      //   933: astore 7
      //   935: aconst_null
      //   936: astore_1
      //   937: aload_2
      //   938: ifnull +7 -> 945
      //   941: aload_2
      //   942: invokevirtual 208	java/io/OutputStream:close	()V
      //   945: aload_1
      //   946: ifnull +7 -> 953
      //   949: aload_1
      //   950: invokevirtual 209	java/io/InputStream:close	()V
      //   953: aload 7
      //   955: ifnull +8 -> 963
      //   958: aload 7
      //   960: invokevirtual 132	java/net/HttpURLConnection:disconnect	()V
      //   963: ldc 76
      //   965: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   968: aload 5
      //   970: athrow
      //   971: astore_1
      //   972: goto -19 -> 953
      //   975: astore 5
      //   977: aload_1
      //   978: astore 7
      //   980: aconst_null
      //   981: astore_1
      //   982: goto -45 -> 937
      //   985: astore 5
      //   987: aload_1
      //   988: astore 7
      //   990: aconst_null
      //   991: astore_1
      //   992: goto -55 -> 937
      //   995: astore 5
      //   997: aload 11
      //   999: astore 7
      //   1001: aload 6
      //   1003: astore_1
      //   1004: goto -67 -> 937
      //   1007: astore 11
      //   1009: aload_1
      //   1010: astore 6
      //   1012: aload 7
      //   1014: astore_2
      //   1015: aload 5
      //   1017: astore_1
      //   1018: aload 11
      //   1020: astore 5
      //   1022: aload 6
      //   1024: astore 7
      //   1026: goto -89 -> 937
      //   1029: astore 5
      //   1031: goto -174 -> 857
      //   1034: astore_1
      //   1035: aconst_null
      //   1036: astore_2
      //   1037: aload 5
      //   1039: astore_1
      //   1040: aload 4
      //   1042: astore 7
      //   1044: aload_2
      //   1045: astore 5
      //   1047: goto -215 -> 832
      //   1050: astore_1
      //   1051: aload 5
      //   1053: astore_1
      //   1054: aconst_null
      //   1055: astore 5
      //   1057: aload 4
      //   1059: astore 7
      //   1061: goto -229 -> 832
      //   1064: astore 7
      //   1066: aload 4
      //   1068: astore 7
      //   1070: goto -238 -> 832
      //   1073: astore 5
      //   1075: goto -180 -> 895
      //   1078: astore 5
      //   1080: goto -353 -> 727
      //   1083: lconst_0
      //   1084: lstore 9
      //   1086: aload 7
      //   1088: astore_1
      //   1089: goto -458 -> 631
      //
      // Exception table:
      //   from	to	target	type
      //   677	683	831	java/lang/Exception
      //   686	694	831	java/lang/Exception
      //   700	707	831	java/lang/Exception
      //   753	767	831	java/lang/Exception
      //   771	824	831	java/lang/Exception
      //   875	880	831	java/lang/Exception
      //   17	22	930	finally
      //   25	37	930	finally
      //   40	50	930	finally
      //   941	945	971	java/io/IOException
      //   949	953	971	java/io/IOException
      //   57	65	975	finally
      //   72	80	975	finally
      //   87	92	975	finally
      //   99	110	975	finally
      //   117	128	975	finally
      //   135	140	975	finally
      //   147	154	975	finally
      //   161	192	975	finally
      //   221	228	975	finally
      //   235	245	975	finally
      //   252	261	975	finally
      //   277	284	975	finally
      //   321	329	975	finally
      //   336	343	975	finally
      //   350	355	975	finally
      //   362	372	975	finally
      //   379	387	975	finally
      //   394	402	975	finally
      //   409	414	975	finally
      //   421	428	975	finally
      //   435	457	975	finally
      //   464	479	975	finally
      //   486	491	975	finally
      //   498	509	975	finally
      //   516	527	975	finally
      //   534	539	975	finally
      //   546	553	975	finally
      //   560	591	975	finally
      //   621	628	975	finally
      //   634	640	985	finally
      //   653	658	995	finally
      //   667	677	995	finally
      //   677	683	1007	finally
      //   686	694	1007	finally
      //   700	707	1007	finally
      //   753	767	1007	finally
      //   771	824	1007	finally
      //   875	880	1007	finally
      //   842	847	1029	java/io/IOException
      //   852	857	1029	java/io/IOException
      //   17	22	1034	java/lang/Exception
      //   25	37	1034	java/lang/Exception
      //   40	50	1034	java/lang/Exception
      //   634	640	1034	java/lang/Exception
      //   57	65	1050	java/lang/Exception
      //   72	80	1050	java/lang/Exception
      //   87	92	1050	java/lang/Exception
      //   99	110	1050	java/lang/Exception
      //   117	128	1050	java/lang/Exception
      //   135	140	1050	java/lang/Exception
      //   147	154	1050	java/lang/Exception
      //   161	192	1050	java/lang/Exception
      //   221	228	1050	java/lang/Exception
      //   235	245	1050	java/lang/Exception
      //   252	261	1050	java/lang/Exception
      //   277	284	1050	java/lang/Exception
      //   321	329	1050	java/lang/Exception
      //   336	343	1050	java/lang/Exception
      //   350	355	1050	java/lang/Exception
      //   362	372	1050	java/lang/Exception
      //   379	387	1050	java/lang/Exception
      //   394	402	1050	java/lang/Exception
      //   409	414	1050	java/lang/Exception
      //   421	428	1050	java/lang/Exception
      //   435	457	1050	java/lang/Exception
      //   464	479	1050	java/lang/Exception
      //   486	491	1050	java/lang/Exception
      //   498	509	1050	java/lang/Exception
      //   516	527	1050	java/lang/Exception
      //   534	539	1050	java/lang/Exception
      //   546	553	1050	java/lang/Exception
      //   560	591	1050	java/lang/Exception
      //   621	628	1050	java/lang/Exception
      //   653	658	1064	java/lang/Exception
      //   667	677	1064	java/lang/Exception
      //   880	885	1073	java/io/IOException
      //   890	895	1073	java/io/IOException
      //   712	717	1078	java/io/IOException
      //   722	727	1078	java/io/IOException
    }

    protected void onCancelled(Integer paramInteger)
    {
      AppMethodBeat.i(85675);
      if (this.mDownloadInfo.mIsRuntime)
      {
        XWalkLibraryLoader.access$002(null);
        Log.i("XWalkLib", "HttpDownloadTask runtime onCancelled: " + this.mDownloadInfo.mSavePath);
      }
      while (true)
      {
        this.mListener.onDownloadCancelled();
        AppMethodBeat.o(85675);
        return;
        Log.i("XWalkLib", "HttpDownloadTask other onCancelled: " + this.mDownloadInfo.mSavePath);
      }
    }

    protected void onPostExecute(Integer paramInteger)
    {
      AppMethodBeat.i(85676);
      if (this.mDownloadInfo.mIsRuntime)
      {
        XWalkLibraryLoader.access$002(null);
        Log.i("XWalkLib", "HttpDownloadTask runtime onPostExecute result " + paramInteger + " " + this.mDownloadInfo.mSavePath);
        if (paramInteger.intValue() != 0)
          break label133;
        this.mDownloadInfo.mErrorCode = 0;
        this.mListener.onDownloadCompleted(this.mDownloadInfo);
        AppMethodBeat.o(85676);
      }
      while (true)
      {
        return;
        Log.i("XWalkLib", "HttpDownloadTask other onPostExecute result " + paramInteger + " " + this.mDownloadInfo.mSavePath);
        break;
        label133: this.mDownloadInfo.mErrorCode = -1;
        this.mListener.onDownloadFailed(this.mDownloadInfo);
        AppMethodBeat.o(85676);
      }
    }

    protected void onPreExecute()
    {
      AppMethodBeat.i(85672);
      if (this.mDownloadInfo.mIsRuntime)
      {
        XWalkLibraryLoader.access$002(this);
        Log.i("XWalkLib", "HttpDownloadTask runtime onPreExecute: " + this.mDownloadInfo.mSavePath);
      }
      while (true)
      {
        this.mDownloadedFile = new File(this.mDownloadInfo.mSavePath);
        this.mListener.onDownloadStarted(this.mDownloadInfo.mDownloadType);
        this.mDownloadInfo.mStartTimestamp = System.currentTimeMillis();
        Context localContext = XWalkEnvironment.getApplicationContext();
        this.mDownloadInfo.mNetWorkType = NetworkUtil.getCurrentNetWorkStatus(localContext);
        AppMethodBeat.o(85672);
        return;
        Log.i("XWalkLib", "HttpDownloadTask other onPreExecute: " + this.mDownloadInfo.mSavePath);
      }
    }

    protected void onProgressUpdate(Integer[] paramArrayOfInteger)
    {
      int i = 0;
      AppMethodBeat.i(85674);
      Log.d("XWalkLib", "HttpDownloadTask updated: " + paramArrayOfInteger[0] + "/" + paramArrayOfInteger[1]);
      if (paramArrayOfInteger[1].intValue() > 0)
        i = (int)(paramArrayOfInteger[0].intValue() * 100.0D / paramArrayOfInteger[1].intValue());
      this.mListener.onDownloadUpdated(i);
      AppMethodBeat.o(85674);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkLibraryLoader
 * JD-Core Version:    0.6.2
 */