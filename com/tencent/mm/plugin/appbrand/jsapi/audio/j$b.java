package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener;
import com.tencent.mm.plugin.appbrand.media.record.b;
import com.tencent.mm.plugin.appbrand.media.record.g.7;
import com.tencent.mm.plugin.appbrand.media.record.g.8;
import com.tencent.mm.plugin.appbrand.media.record.g.9;
import com.tencent.mm.plugin.appbrand.media.record.h;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.plugin.appbrand.s.q.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

final class j$b extends a
{
  public int action;
  public String appId;
  private boolean cHT;
  private int duration;
  public boolean error;
  private String filePath;
  private int fileSize;
  private byte[] frameBuffer;
  AudioRecordVoIPInterruptListener hAN;
  private j hAO;
  public String hAP;
  private String hAQ;
  private String hAR;
  private int hAS;
  private final com.tencent.mm.sdk.b.c<mb> hAT;
  public String hAa;
  public String hAz;
  g.c huj;
  public com.tencent.mm.plugin.appbrand.q hwf;
  public int hwi;
  public String processName;
  private String state;

  public j$b(j paramj, com.tencent.mm.plugin.appbrand.q paramq, int paramInt)
  {
    AppMethodBeat.i(130747);
    this.processName = "";
    this.error = false;
    this.hAa = "";
    this.filePath = "";
    this.fileSize = 0;
    this.duration = 0;
    this.state = "";
    this.hAQ = "";
    this.hAT = new j.b.1(this);
    this.hAO = paramj;
    this.hwf = paramq;
    this.hwi = paramInt;
    paramj = new com.tencent.mm.plugin.appbrand.r.j();
    if (paramq.asE().a(paramj) == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
    {
      this.hAR = new File((String)paramj.value, "frameBuffer").getAbsolutePath();
      AppMethodBeat.o(130747);
    }
    while (true)
    {
      return;
      this.hAR = new File(paramq.getContext().getCacheDir(), "frameBuffer_" + paramq.getAppId()).getAbsolutePath();
      AppMethodBeat.o(130747);
    }
  }

  // ERROR //
  private void aCw()
  {
    // Byte code:
    //   0: ldc 233
    //   2: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 172	java/lang/System:nanoTime	()J
    //   8: lstore_1
    //   9: new 105	java/io/File
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: getfield 121	com/tencent/mm/plugin/appbrand/jsapi/audio/j$b:hAR	Ljava/lang/String;
    //   18: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   21: aload_3
    //   22: invokevirtual 189	java/io/File:exists	()Z
    //   25: ifeq +105 -> 130
    //   28: new 235	java/io/FileInputStream
    //   31: astore 4
    //   33: aload 4
    //   35: aload_3
    //   36: invokespecial 236	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   39: aload 4
    //   41: astore 5
    //   43: aload_3
    //   44: astore 6
    //   46: aload_0
    //   47: aload_0
    //   48: getfield 158	com/tencent/mm/plugin/appbrand/jsapi/audio/j$b:hAS	I
    //   51: newarray byte
    //   53: putfield 231	com/tencent/mm/plugin/appbrand/jsapi/audio/j$b:frameBuffer	[B
    //   56: aload 4
    //   58: astore 5
    //   60: aload_3
    //   61: astore 6
    //   63: aload 4
    //   65: aload_0
    //   66: getfield 231	com/tencent/mm/plugin/appbrand/jsapi/audio/j$b:frameBuffer	[B
    //   69: invokevirtual 240	java/io/FileInputStream:read	([B)I
    //   72: pop
    //   73: aload 4
    //   75: astore 5
    //   77: aload_3
    //   78: astore 6
    //   80: aload 4
    //   82: invokevirtual 241	java/io/FileInputStream:close	()V
    //   85: aload 4
    //   87: invokevirtual 241	java/io/FileInputStream:close	()V
    //   90: aload_3
    //   91: invokevirtual 189	java/io/File:exists	()Z
    //   94: ifeq +96 -> 190
    //   97: aload_3
    //   98: invokevirtual 244	java/io/File:delete	()Z
    //   101: pop
    //   102: ldc 175
    //   104: ldc 216
    //   106: iconst_1
    //   107: anewarray 179	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: invokestatic 172	java/lang/System:nanoTime	()J
    //   115: lload_1
    //   116: lsub
    //   117: invokestatic 222	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   120: aastore
    //   121: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: ldc 233
    //   126: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: return
    //   130: ldc 175
    //   132: ldc 246
    //   134: invokestatic 249	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: aload_3
    //   138: invokevirtual 189	java/io/File:exists	()Z
    //   141: ifeq +16 -> 157
    //   144: aload_3
    //   145: invokevirtual 244	java/io/File:delete	()Z
    //   148: pop
    //   149: ldc 233
    //   151: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: goto -25 -> 129
    //   157: ldc 175
    //   159: ldc 251
    //   161: invokestatic 249	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: ldc 233
    //   166: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   169: goto -40 -> 129
    //   172: astore 6
    //   174: ldc 175
    //   176: aload 6
    //   178: ldc 53
    //   180: iconst_0
    //   181: anewarray 179	java/lang/Object
    //   184: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: goto -97 -> 90
    //   190: ldc 175
    //   192: ldc 251
    //   194: invokestatic 249	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: goto -95 -> 102
    //   200: astore 7
    //   202: aconst_null
    //   203: astore 4
    //   205: aconst_null
    //   206: astore_3
    //   207: aload 4
    //   209: astore 5
    //   211: aload_3
    //   212: astore 6
    //   214: ldc 175
    //   216: aload 7
    //   218: ldc 53
    //   220: iconst_0
    //   221: anewarray 179	java/lang/Object
    //   224: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: aload 4
    //   229: ifnull +8 -> 237
    //   232: aload 4
    //   234: invokevirtual 241	java/io/FileInputStream:close	()V
    //   237: aload_3
    //   238: ifnull +36 -> 274
    //   241: aload_3
    //   242: invokevirtual 189	java/io/File:exists	()Z
    //   245: ifeq +29 -> 274
    //   248: aload_3
    //   249: invokevirtual 244	java/io/File:delete	()Z
    //   252: pop
    //   253: goto -151 -> 102
    //   256: astore 6
    //   258: ldc 175
    //   260: aload 6
    //   262: ldc 53
    //   264: iconst_0
    //   265: anewarray 179	java/lang/Object
    //   268: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: goto -34 -> 237
    //   274: ldc 175
    //   276: ldc 251
    //   278: invokestatic 249	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: goto -179 -> 102
    //   284: astore 7
    //   286: aconst_null
    //   287: astore 4
    //   289: aconst_null
    //   290: astore_3
    //   291: aload 4
    //   293: astore 5
    //   295: aload_3
    //   296: astore 6
    //   298: ldc 175
    //   300: aload 7
    //   302: ldc 53
    //   304: iconst_0
    //   305: anewarray 179	java/lang/Object
    //   308: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: aload 4
    //   313: ifnull +8 -> 321
    //   316: aload 4
    //   318: invokevirtual 241	java/io/FileInputStream:close	()V
    //   321: aload_3
    //   322: ifnull +36 -> 358
    //   325: aload_3
    //   326: invokevirtual 189	java/io/File:exists	()Z
    //   329: ifeq +29 -> 358
    //   332: aload_3
    //   333: invokevirtual 244	java/io/File:delete	()Z
    //   336: pop
    //   337: goto -235 -> 102
    //   340: astore 6
    //   342: ldc 175
    //   344: aload 6
    //   346: ldc 53
    //   348: iconst_0
    //   349: anewarray 179	java/lang/Object
    //   352: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   355: goto -34 -> 321
    //   358: ldc 175
    //   360: ldc 251
    //   362: invokestatic 249	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   365: goto -263 -> 102
    //   368: astore 4
    //   370: aconst_null
    //   371: astore 5
    //   373: aconst_null
    //   374: astore_3
    //   375: aload 5
    //   377: ifnull +8 -> 385
    //   380: aload 5
    //   382: invokevirtual 241	java/io/FileInputStream:close	()V
    //   385: aload_3
    //   386: ifnull +41 -> 427
    //   389: aload_3
    //   390: invokevirtual 189	java/io/File:exists	()Z
    //   393: ifeq +34 -> 427
    //   396: aload_3
    //   397: invokevirtual 244	java/io/File:delete	()Z
    //   400: pop
    //   401: ldc 233
    //   403: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   406: aload 4
    //   408: athrow
    //   409: astore 6
    //   411: ldc 175
    //   413: aload 6
    //   415: ldc 53
    //   417: iconst_0
    //   418: anewarray 179	java/lang/Object
    //   421: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   424: goto -39 -> 385
    //   427: ldc 175
    //   429: ldc 251
    //   431: invokestatic 249	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   434: goto -33 -> 401
    //   437: astore 4
    //   439: aconst_null
    //   440: astore 5
    //   442: goto -67 -> 375
    //   445: astore 4
    //   447: aload 6
    //   449: astore_3
    //   450: goto -75 -> 375
    //   453: astore 7
    //   455: aconst_null
    //   456: astore 4
    //   458: goto -167 -> 291
    //   461: astore 7
    //   463: goto -172 -> 291
    //   466: astore 7
    //   468: aconst_null
    //   469: astore 4
    //   471: goto -264 -> 207
    //   474: astore 7
    //   476: goto -269 -> 207
    //
    // Exception table:
    //   from	to	target	type
    //   85	90	172	java/io/IOException
    //   9	21	200	java/io/FileNotFoundException
    //   232	237	256	java/io/IOException
    //   9	21	284	java/io/IOException
    //   316	321	340	java/io/IOException
    //   9	21	368	finally
    //   380	385	409	java/io/IOException
    //   21	39	437	finally
    //   130	137	437	finally
    //   46	56	445	finally
    //   63	73	445	finally
    //   80	85	445	finally
    //   214	227	445	finally
    //   298	311	445	finally
    //   21	39	453	java/io/IOException
    //   130	137	453	java/io/IOException
    //   46	56	461	java/io/IOException
    //   63	73	461	java/io/IOException
    //   80	85	461	java/io/IOException
    //   21	39	466	java/io/FileNotFoundException
    //   130	137	466	java/io/FileNotFoundException
    //   46	56	474	java/io/FileNotFoundException
    //   63	73	474	java/io/FileNotFoundException
    //   80	85	474	java/io/FileNotFoundException
  }

  public final void Dp()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(130748);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(this.hAP);
      localObject2 = localJSONObject.optString("operationType");
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        ab.e("MicroMsg.Record.JsApiOperateRecorder", "operationType is null");
        this.error = true;
        this.action = -1;
        this.hAa = "operationType is null";
        wM();
        AppMethodBeat.o(130748);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.Record.JsApiOperateRecorder", "new json exists exception, data is invalid, dataStr:%s", new Object[] { this.hAP });
        this.error = true;
        this.action = -1;
        this.hAa = "parser data fail, data is invalid";
        ab.e("MicroMsg.Record.JsApiOperateRecorder", "exception:%s" + localJSONException.getMessage());
        wM();
        AppMethodBeat.o(130748);
      }
      ab.i("MicroMsg.Record.JsApiOperateRecorder", "operationType;%s", new Object[] { localObject2 });
      this.error = false;
      this.action = -1;
      if (!((String)localObject2).equals("start"))
        break label938;
    }
    int k = localJSONException.optInt("duration", 60000);
    i = localJSONException.optInt("sampleRate", 44100);
    int m = localJSONException.optInt("numberOfChannels", 2);
    int n = localJSONException.optInt("encodeBitRate", 128000);
    Object localObject2 = localJSONException.optString("format");
    double d = localJSONException.optDouble("frameSize", 0.0D);
    b localb = b.a(localJSONException.optString("audioSource").toUpperCase(), b.ila);
    com.tencent.mm.plugin.appbrand.media.record.c.b(this.appId, this.hAT);
    Object localObject1 = new RecordParam();
    ((RecordParam)localObject1).duration = k;
    ((RecordParam)localObject1).sampleRate = i;
    ((RecordParam)localObject1).imk = m;
    ((RecordParam)localObject1).iml = n;
    ((RecordParam)localObject1).hAQ = ((String)localObject2);
    ((RecordParam)localObject1).scene = 8;
    ((RecordParam)localObject1).imm = d;
    ((RecordParam)localObject1).euD = System.currentTimeMillis();
    ((RecordParam)localObject1).processName = this.processName;
    ((RecordParam)localObject1).appId = this.appId;
    ((RecordParam)localObject1).imn = localb;
    if (this.hAN == null)
      this.hAN = new AudioRecordVoIPInterruptListener();
    ((RecordParam)localObject1).imo = this.hAN;
    this.hAQ = ((String)localObject2);
    com.tencent.mm.plugin.appbrand.media.record.c.aIe();
    localObject2 = com.tencent.mm.plugin.appbrand.media.record.g.aIm();
    ab.i("MicroMsg.Record.AudioRecordMgr", "startRecord");
    if ((((com.tencent.mm.plugin.appbrand.media.record.g)localObject2).ilo != null) && (((RecordParam)localObject1).appId != null) && (!((RecordParam)localObject1).appId.equalsIgnoreCase(((com.tencent.mm.plugin.appbrand.media.record.g)localObject2).ilo.appId)))
    {
      ab.e("MicroMsg.Record.AudioRecordMgr", "appId is diff, must stop record first");
      ((com.tencent.mm.plugin.appbrand.media.record.g)localObject2).EB();
      label469: if ((!TextUtils.isEmpty(((RecordParam)localObject1).hAQ)) && (((RecordParam)localObject1).duration >= 0) && (((RecordParam)localObject1).iml > 0) && (((RecordParam)localObject1).sampleRate > 0) && (((RecordParam)localObject1).imk > 0))
        break label619;
      i = 0;
      label509: if (i != 0)
        break label624;
      ab.e("MicroMsg.Record.AudioRecordMgr", "startRecord fail, param is invalid");
      com.tencent.mm.plugin.appbrand.media.record.j.pk(15);
      i = j;
      label529: if (i == 0)
        break label899;
      ab.i("MicroMsg.Record.JsApiOperateRecorder", "star record ok");
      this.action = -1;
    }
    while (true)
    {
      if (this.error)
        ab.e("MicroMsg.Record.JsApiOperateRecorder", this.hAa);
      wM();
      AppMethodBeat.o(130748);
      break;
      if (((com.tencent.mm.plugin.appbrand.media.record.g)localObject2).mIsRecording)
      {
        ab.e("MicroMsg.Record.AudioRecordMgr", "startRecord fail, is recording");
        i = j;
        break label529;
      }
      if (!((com.tencent.mm.plugin.appbrand.media.record.g)localObject2).DA())
        break label469;
      ab.e("MicroMsg.Record.AudioRecordMgr", "startRecord fail, is pause");
      i = j;
      break label529;
      label619: i = 1;
      break label509;
      label624: if (!h.Cz(((RecordParam)localObject1).hAQ))
      {
        ab.e("MicroMsg.Record.AudioRecordMgr", "startRecord fail, encode format %s is not support!", new Object[] { ((RecordParam)localObject1).hAQ });
        com.tencent.mm.plugin.appbrand.media.record.j.pk(16);
        i = j;
        break label529;
      }
      if (TextUtils.isEmpty(((RecordParam)localObject1).euD))
        ((RecordParam)localObject1).euD = System.currentTimeMillis();
      com.tencent.mm.plugin.appbrand.media.record.j.aIt();
      ab.i("MicroMsg.Record.RecordParamCompatibility", "recordParam duration:%d, numberOfChannels:%d, sampleRate:%d, encodeBitRate:%d", new Object[] { Integer.valueOf(((RecordParam)localObject1).duration), Integer.valueOf(((RecordParam)localObject1).imk), Integer.valueOf(((RecordParam)localObject1).sampleRate), Integer.valueOf(((RecordParam)localObject1).iml) });
      if (((RecordParam)localObject1).duration <= 0)
      {
        ((RecordParam)localObject1).duration = 60000;
        label764: if ((((RecordParam)localObject1).imk <= 0) && (((RecordParam)localObject1).imk > 2))
          ((RecordParam)localObject1).imk = 2;
        if (((RecordParam)localObject1).sampleRate <= 48000)
          break label859;
        ((RecordParam)localObject1).sampleRate = 48000;
        label801: if (((RecordParam)localObject1).iml <= 320000)
          break label879;
        ((RecordParam)localObject1).iml = 320000;
      }
      while (true)
      {
        d.post(new g.7((com.tencent.mm.plugin.appbrand.media.record.g)localObject2, (RecordParam)localObject1), "app_brand_start_record");
        i = 1;
        break;
        if (((RecordParam)localObject1).duration < 600000)
          break label764;
        ((RecordParam)localObject1).duration = 600000;
        break label764;
        label859: if (((RecordParam)localObject1).sampleRate >= 8000)
          break label801;
        ((RecordParam)localObject1).sampleRate = 8000;
        break label801;
        label879: if (((RecordParam)localObject1).iml < 16000)
          ((RecordParam)localObject1).iml = 16000;
      }
      label899: label1030: label1171: if (com.tencent.mm.plugin.appbrand.media.record.g.aIm().mIsRecording)
      {
        this.error = true;
        this.hAa = "audio is recording, don't start record again";
      }
      else
      {
        this.error = true;
        this.hAa = "start record fail";
        continue;
        label938: if (((String)localObject2).equals("resume"))
        {
          localObject1 = com.tencent.mm.plugin.appbrand.media.record.g.aIm();
          if (((com.tencent.mm.plugin.appbrand.media.record.g)localObject1).mIsRecording)
            ab.e("MicroMsg.Record.AudioRecordMgr", "resumeRecord fail, is recording");
          while (true)
          {
            if (i == 0)
              break label1030;
            this.action = -1;
            ab.i("MicroMsg.Record.JsApiOperateRecorder", "resume record ok");
            break;
            if (((com.tencent.mm.plugin.appbrand.media.record.g)localObject1).ilo == null)
            {
              ab.e("MicroMsg.Record.AudioRecordMgr", "resumeRecord fail, mRecordParam is null");
            }
            else
            {
              com.tencent.mm.plugin.appbrand.media.record.j.aIt();
              d.post(new g.8((com.tencent.mm.plugin.appbrand.media.record.g)localObject1), "app_brand_resume_record");
              i = 1;
            }
          }
          if (com.tencent.mm.plugin.appbrand.media.record.g.aIm().mIsRecording)
          {
            this.error = true;
            this.hAa = "audio is recording, don't resume record again";
          }
          else
          {
            this.error = true;
            this.hAa = "resume record fail";
          }
        }
        else if (((String)localObject2).equals("pause"))
        {
          localObject1 = com.tencent.mm.plugin.appbrand.media.record.g.aIm();
          ab.i("MicroMsg.Record.AudioRecordMgr", "pauseRecord");
          if (((com.tencent.mm.plugin.appbrand.media.record.g)localObject1).ilm == null)
          {
            ab.e("MicroMsg.Record.AudioRecordMgr", "mRecord is null");
            i = 0;
          }
          while (true)
          {
            if (i == 0)
              break label1171;
            this.action = -1;
            ab.i("MicroMsg.Record.JsApiOperateRecorder", "pause record ok");
            break;
            if (((com.tencent.mm.plugin.appbrand.media.record.g)localObject1).DA())
            {
              ab.e("MicroMsg.Record.AudioRecordMgr", "is paused, don't pause again");
              i = 1;
            }
            else
            {
              d.post(new g.9((com.tencent.mm.plugin.appbrand.media.record.g)localObject1), "app_brand_pause_record");
              i = 1;
            }
          }
          if (com.tencent.mm.plugin.appbrand.media.record.g.aIm().DA())
          {
            this.error = true;
            this.hAa = "audio is pause, don't pause record again";
          }
          else
          {
            this.error = true;
            this.hAa = "pause record fail";
          }
        }
        else if (((String)localObject2).equals("stop"))
        {
          if (com.tencent.mm.plugin.appbrand.media.record.g.aIm().EB())
          {
            this.action = -1;
            ab.i("MicroMsg.Record.JsApiOperateRecorder", "stop record ok");
          }
          else if (com.tencent.mm.plugin.appbrand.media.record.g.aIm().DB())
          {
            this.error = true;
            this.hAa = "audio is stop, don't stop record again";
          }
          else
          {
            this.error = true;
            this.hAa = "stop record fail";
          }
        }
        else
        {
          ab.e("MicroMsg.Record.JsApiOperateRecorder", "operationType is invalid");
          this.error = true;
          this.hAa = "operationType is invalid";
        }
      }
    }
  }

  public final void wM()
  {
    AppMethodBeat.i(130749);
    super.wM();
    if (this.hwf == null)
    {
      ab.e("MicroMsg.Record.JsApiOperateRecorder", "service is null, don't callback");
      AppMethodBeat.o(130749);
    }
    while (true)
    {
      return;
      if (this.action == -1)
      {
        if (!this.error)
        {
          ab.i("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder ok");
          this.hwf.M(this.hwi, this.hAO.j("ok", null));
          AppMethodBeat.o(130749);
        }
        else
        {
          ab.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder fail:%s", new Object[] { this.hAa });
          this.hwf.M(this.hwi, this.hAO.j("fail:" + this.hAa, null));
          AppMethodBeat.o(130749);
        }
      }
      else
      {
        j.a locala = new j.a();
        label200: HashMap localHashMap;
        Object localObject;
        switch (this.action)
        {
        default:
          if (this.action == 2)
          {
            localHashMap = new HashMap();
            localHashMap.put("state", this.state);
            ab.i("MicroMsg.Record.JsApiOperateRecorder", "filePath:%s, encodeFormat:%s", new Object[] { this.filePath, this.hAQ });
            localObject = new com.tencent.mm.plugin.appbrand.r.j();
            if (this.hwf.asE().a(new File(this.filePath), h.Cy(this.hAQ), true, (com.tencent.mm.plugin.appbrand.r.j)localObject) == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
            {
              localHashMap.put("tempFilePath", ((com.tencent.mm.plugin.appbrand.r.j)localObject).value);
              label316: localHashMap.put("duration", Integer.valueOf(this.duration));
              localHashMap.put("fileSize", Integer.valueOf(this.fileSize));
              this.hAz = new JSONObject(localHashMap).toString();
            }
          }
          else if (this.action == 5)
          {
            localHashMap = new HashMap();
            localHashMap.put("state", this.state);
            localHashMap.put("isLastFrame", Boolean.valueOf(this.cHT));
            if (this.hAS > 819200)
              aCw();
            if (this.frameBuffer == null)
              break label670;
            localHashMap.put("frameBuffer", com.tencent.mm.plugin.appbrand.s.q.al(this.frameBuffer));
            label449: localObject = com.tencent.mm.plugin.appbrand.s.q.a(this.hwf.aBx(), localHashMap, (q.a)this.hwf.aa(q.a.class));
            if (localObject != q.b.iRI)
              break label681;
            this.hAz = new JSONObject(localHashMap).toString();
          }
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        }
        label670: label681: 
        while (localObject != q.b.iRJ)
        {
          ab.i("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder onRecorderStateChange callback action:%d, jsonResult:%s", new Object[] { Integer.valueOf(this.action), this.hAz });
          locala.i(this.hwf).AL(this.hAz).aCj();
          AppMethodBeat.o(130749);
          break;
          j.a(this.hAO, true);
          if (j.aCv().contains(this.appId))
            break label200;
          com.tencent.mm.plugin.appbrand.g.a(this.appId, this.huj);
          j.aCv().add(this.appId);
          break label200;
          j.a(this.hAO, false);
          if ((this.action != 2) && (this.action != 4))
            break label200;
          com.tencent.mm.plugin.appbrand.g.b(this.appId, this.huj);
          j.aCv().remove(this.appId);
          break label200;
          ab.e("MicroMsg.Record.JsApiOperateRecorder", "AppBrandLocalMediaObject obj is null");
          localHashMap.put("tempFilePath", "");
          break label316;
          ab.e("MicroMsg.Record.JsApiOperateRecorder", "framBuffer is null, error");
          break label449;
        }
        com.tencent.mm.plugin.appbrand.s.q.m(this.hwf, "onRecorderStateChange");
        AppMethodBeat.o(130749);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.j.b
 * JD-Core Version:    0.6.2
 */