package com.tencent.qqmusic.mediaplayer.perf;

import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Xml;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlSerializer;

public class PrefInfoCollector
  implements PlayerInfoCollector
{
  private static final String ENCODING_UTF_8 = "utf-8";
  private static final String FILE_NAME = "pref_infos.xml";
  private static final String NAMESPACE;
  private static final String ROOT = "root";
  private static final String TAG;
  private static PrefInfoCollector instance;
  private HandlerThread mHandlerThread;
  private Handler mReportHandler;
  private FileOutputStream outputStream;
  private HashMap<String, Long> prefInfos;
  private String reportFilePath;
  private XmlSerializer xmlSerializer;

  static
  {
    AppMethodBeat.i(128418);
    TAG = PrefInfoCollector.class.getSimpleName();
    NAMESPACE = null;
    AppMethodBeat.o(128418);
  }

  private PrefInfoCollector()
  {
    AppMethodBeat.i(128406);
    this.prefInfos = null;
    this.xmlSerializer = null;
    this.prefInfos = new HashMap();
    this.xmlSerializer = Xml.newSerializer();
    AppMethodBeat.o(128406);
  }

  // ERROR //
  private void createOutputs()
  {
    // Byte code:
    //   0: ldc 98
    //   2: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 100	java/io/File
    //   8: astore_1
    //   9: aload_1
    //   10: invokestatic 106	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   13: invokevirtual 109	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   16: ldc 15
    //   18: invokespecial 112	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 116	java/io/File:exists	()Z
    //   25: ifeq +13 -> 38
    //   28: aload_1
    //   29: invokevirtual 119	java/io/File:delete	()Z
    //   32: pop
    //   33: aload_1
    //   34: invokevirtual 122	java/io/File:createNewFile	()Z
    //   37: pop
    //   38: getstatic 51	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:TAG	Ljava/lang/String;
    //   41: ldc 124
    //   43: aload_1
    //   44: invokestatic 130	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   47: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   50: invokestatic 139	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: aload_0
    //   54: aload_1
    //   55: invokevirtual 109	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   58: putfield 141	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:reportFilePath	Ljava/lang/String;
    //   61: new 143	java/io/FileOutputStream
    //   64: astore_2
    //   65: aload_2
    //   66: aload_1
    //   67: invokespecial 146	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   70: aload_0
    //   71: aload_2
    //   72: putfield 148	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:outputStream	Ljava/io/FileOutputStream;
    //   75: getstatic 51	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:TAG	Ljava/lang/String;
    //   78: astore_2
    //   79: new 150	java/lang/StringBuilder
    //   82: astore_1
    //   83: aload_1
    //   84: ldc 152
    //   86: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: aload_2
    //   90: aload_1
    //   91: aload_0
    //   92: getfield 141	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:reportFilePath	Ljava/lang/String;
    //   95: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokestatic 139	com/tencent/qqmusic/mediaplayer/util/Logger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload_0
    //   105: getfield 65	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:xmlSerializer	Lorg/xmlpull/v1/XmlSerializer;
    //   108: ldc 164
    //   110: iconst_1
    //   111: invokeinterface 170 3 0
    //   116: aload_0
    //   117: getfield 65	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:xmlSerializer	Lorg/xmlpull/v1/XmlSerializer;
    //   120: aload_0
    //   121: getfield 148	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:outputStream	Ljava/io/FileOutputStream;
    //   124: ldc 12
    //   126: invokeinterface 174 3 0
    //   131: aload_0
    //   132: getfield 65	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:xmlSerializer	Lorg/xmlpull/v1/XmlSerializer;
    //   135: ldc 12
    //   137: getstatic 180	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   140: invokeinterface 184 3 0
    //   145: ldc 98
    //   147: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: return
    //   151: astore_1
    //   152: getstatic 51	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:TAG	Ljava/lang/String;
    //   155: ldc 186
    //   157: aload_1
    //   158: invokestatic 190	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: new 192	java/lang/RuntimeException
    //   164: dup
    //   165: new 150	java/lang/StringBuilder
    //   168: dup
    //   169: ldc 194
    //   171: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload_1
    //   175: invokevirtual 197	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   178: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: aload_1
    //   185: invokespecial 200	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   188: astore_1
    //   189: ldc 98
    //   191: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: aload_1
    //   195: athrow
    //   196: astore_1
    //   197: getstatic 51	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:TAG	Ljava/lang/String;
    //   200: ldc 202
    //   202: aload_1
    //   203: invokestatic 190	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   206: new 192	java/lang/RuntimeException
    //   209: dup
    //   210: new 150	java/lang/StringBuilder
    //   213: dup
    //   214: ldc 204
    //   216: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   219: aload_1
    //   220: invokevirtual 205	java/io/IOException:getMessage	()Ljava/lang/String;
    //   223: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   229: aload_1
    //   230: invokespecial 200	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   233: astore_1
    //   234: ldc 98
    //   236: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: aload_1
    //   240: athrow
    //   241: astore_1
    //   242: getstatic 51	com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector:TAG	Ljava/lang/String;
    //   245: ldc 207
    //   247: aload_1
    //   248: invokestatic 190	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   251: new 192	java/lang/RuntimeException
    //   254: dup
    //   255: new 150	java/lang/StringBuilder
    //   258: dup
    //   259: ldc 209
    //   261: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   264: aload_1
    //   265: invokevirtual 205	java/io/IOException:getMessage	()Ljava/lang/String;
    //   268: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: aload_1
    //   275: invokespecial 200	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   278: astore_1
    //   279: ldc 98
    //   281: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   284: aload_1
    //   285: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   5	38	151	java/io/FileNotFoundException
    //   38	104	151	java/io/FileNotFoundException
    //   5	38	196	java/io/IOException
    //   38	104	196	java/io/IOException
    //   104	145	241	java/io/IOException
  }

  public static PrefInfoCollector getInstance()
  {
    try
    {
      AppMethodBeat.i(128407);
      if (instance == null)
      {
        localPrefInfoCollector = new com/tencent/qqmusic/mediaplayer/perf/PrefInfoCollector;
        localPrefInfoCollector.<init>();
        instance = localPrefInfoCollector;
      }
      PrefInfoCollector localPrefInfoCollector = instance;
      AppMethodBeat.o(128407);
      return localPrefInfoCollector;
    }
    finally
    {
    }
  }

  private void printPrefInfos(AudioInformation paramAudioInformation)
  {
    AppMethodBeat.i(128412);
    Object localObject = new ArrayList(this.prefInfos.entrySet());
    Collections.sort((List)localObject, new Comparator()
    {
      public int compare(Map.Entry<String, Long> paramAnonymousEntry1, Map.Entry<String, Long> paramAnonymousEntry2)
      {
        AppMethodBeat.i(128436);
        int i;
        if (((String)paramAnonymousEntry1.getKey()).charAt(0) > ((String)paramAnonymousEntry2.getKey()).charAt(0))
        {
          i = 1;
          AppMethodBeat.o(128436);
        }
        while (true)
        {
          return i;
          if (((String)paramAnonymousEntry1.getKey()).charAt(0) == ((String)paramAnonymousEntry2.getKey()).charAt(0))
          {
            AppMethodBeat.o(128436);
            i = 0;
          }
          else
          {
            i = -1;
            AppMethodBeat.o(128436);
          }
        }
      }
    });
    if (!((List)localObject).isEmpty())
    {
      this.xmlSerializer.startTag(NAMESPACE, "root");
      printProperty("device.manufacturer", Build.MANUFACTURER);
      printProperty("device.model", Build.MODEL);
      printProperty("device.apiLevel", String.valueOf(Build.VERSION.SDK_INT));
      printAudioInfomation(paramAudioInformation);
      paramAudioInformation = ((List)localObject).iterator();
      while (paramAudioInformation.hasNext())
      {
        localObject = (Map.Entry)paramAudioInformation.next();
        long l = ((Long)((Map.Entry)localObject).getValue()).longValue();
        printProperty((String)((Map.Entry)localObject).getKey(), String.valueOf(l));
      }
      this.xmlSerializer.endTag(NAMESPACE, "root");
      this.xmlSerializer.endDocument();
      this.xmlSerializer.flush();
    }
    AppMethodBeat.o(128412);
  }

  private void printProperty(String paramString1, String paramString2)
  {
    AppMethodBeat.i(128411);
    this.xmlSerializer.startTag(NAMESPACE, paramString1);
    this.xmlSerializer.text(paramString2);
    this.xmlSerializer.endTag(NAMESPACE, paramString1);
    AppMethodBeat.o(128411);
  }

  private void upLoadByCommonPost()
  {
    AppMethodBeat.i(128413);
    Logger.i(TAG, "upLoadByCommonPost");
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(" http://musict.proxy.music.qq.com/qmtm2/PlayPerformanceReport.fcg").openConnection();
    localHttpURLConnection.setDoInput(true);
    localHttpURLConnection.setDoOutput(true);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setRequestMethod("POST");
    localHttpURLConnection.setRequestProperty("Connection", "Keep-Alive");
    localHttpURLConnection.setRequestProperty("Charset", "UTF-8");
    localHttpURLConnection.setRequestProperty("Content-Type", "text/xml");
    DataOutputStream localDataOutputStream = new DataOutputStream(localHttpURLConnection.getOutputStream());
    Object localObject1 = new FileInputStream(this.reportFilePath);
    Object localObject2 = new byte[8192];
    while (true)
    {
      int i = ((FileInputStream)localObject1).read((byte[])localObject2);
      if (i == -1)
        break;
      localDataOutputStream.write((byte[])localObject2, 0, i);
    }
    ((FileInputStream)localObject1).close();
    localDataOutputStream.writeBytes("\r\n");
    localDataOutputStream.flush();
    localObject2 = localHttpURLConnection.getInputStream();
    localObject1 = new BufferedReader(new InputStreamReader((InputStream)localObject2, "UTF-8")).readLine();
    Logger.i(TAG, "upload result:".concat(String.valueOf(localObject1)));
    localDataOutputStream.close();
    ((InputStream)localObject2).close();
    AppMethodBeat.o(128413);
  }

  public void printAudioInfomation(AudioInformation paramAudioInformation)
  {
    AppMethodBeat.i(128410);
    printProperty("audio.format", paramAudioInformation.getAudioType());
    printProperty("audio.sampleRate", paramAudioInformation.getSampleRate());
    printProperty("audio.PlaySample", paramAudioInformation.getPlaySample());
    printProperty("audio.bitDepth", paramAudioInformation.getBitDept());
    printProperty("audio.channels", paramAudioInformation.getChannels());
    printProperty("audio.duration", paramAudioInformation.getDuration());
    printProperty("audio.bitRate", paramAudioInformation.getBitrate());
    AppMethodBeat.o(128410);
  }

  public void putBoolean(String paramString, boolean paramBoolean)
  {
  }

  public void putInt(String paramString, int paramInt)
  {
  }

  public void putLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(128408);
    this.prefInfos.put(paramString, Long.valueOf(paramLong));
    AppMethodBeat.o(128408);
  }

  public void putString(String paramString1, String paramString2)
  {
  }

  public void putUri(String paramString, Uri paramUri)
  {
  }

  public void upLoadPrefInfos(AudioInformation paramAudioInformation)
  {
    AppMethodBeat.i(128414);
    if ((this.prefInfos == null) || (this.prefInfos.isEmpty()))
      AppMethodBeat.o(128414);
    while (true)
    {
      return;
      if ((this.mHandlerThread == null) || (this.mReportHandler == null))
      {
        this.mHandlerThread = new HandlerThread("PrefInfoCollector");
        this.mHandlerThread.start();
        this.mReportHandler = new Handler(this.mHandlerThread.getLooper());
      }
      this.mReportHandler.post(new PrefInfoCollector.2(this, paramAudioInformation));
      AppMethodBeat.o(128414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector
 * JD-Core Version:    0.6.2
 */