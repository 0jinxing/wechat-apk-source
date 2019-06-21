package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.FileInputStream;
import java.io.LineNumberReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CueItemParser extends AudioPlayListItemParser
{
  public static final String TAG = "CueItemParser";
  private LineNumberReader mReader;
  protected List<TrackInfo> mTrackInfoList;

  public CueItemParser(String paramString)
  {
    AppMethodBeat.i(104772);
    this.mUri = paramString;
    this.mTrackInfoList = new LinkedList();
    AppMethodBeat.o(104772);
  }

  private long convertTimeStrToMs(String paramString)
  {
    AppMethodBeat.i(104773);
    paramString = paramString.split(":");
    long l1 = Long.parseLong(paramString[0]);
    long l2 = Long.parseLong(paramString[1]);
    long l3 = Long.parseLong(paramString[2]);
    AppMethodBeat.o(104773);
    return l3 * 10L + (l1 * 60L + l2) * 1000L;
  }

  private String guessCharsetEncoding(String paramString)
  {
    AppMethodBeat.i(104776);
    Logger.i("CueItemParser", "CueItemParser.guessCharsetEncoding, filePath: ".concat(String.valueOf(paramString)));
    paramString = guessCharsetEncoding(new FileInputStream(paramString));
    AppMethodBeat.o(104776);
    return paramString;
  }

  public boolean isParseSuccess()
  {
    AppMethodBeat.i(104775);
    boolean bool;
    if (!this.mTrackInfoList.isEmpty())
    {
      bool = true;
      AppMethodBeat.o(104775);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104775);
    }
  }

  public Iterator<TrackInfo> iterator()
  {
    AppMethodBeat.i(104774);
    Iterator localIterator = this.mTrackInfoList.iterator();
    AppMethodBeat.o(104774);
    return localIterator;
  }

  // ERROR //
  public void parse()
  {
    // Byte code:
    //   0: ldc 104
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 8
    //   7: new 106	java/lang/StringBuilder
    //   10: dup
    //   11: ldc 108
    //   13: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: getfield 28	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mUri	Ljava/lang/String;
    //   20: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: invokestatic 76	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: new 119	java/io/File
    //   32: dup
    //   33: aload_0
    //   34: getfield 28	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mUri	Ljava/lang/String;
    //   37: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   40: astore_1
    //   41: aconst_null
    //   42: astore_2
    //   43: aconst_null
    //   44: astore_3
    //   45: aconst_null
    //   46: astore 4
    //   48: iconst_0
    //   49: istore 5
    //   51: iconst_0
    //   52: istore 6
    //   54: lconst_0
    //   55: lstore 7
    //   57: iconst_0
    //   58: istore 9
    //   60: aconst_null
    //   61: astore 10
    //   63: aload_0
    //   64: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   67: invokeinterface 123 1 0
    //   72: aload_0
    //   73: aload_0
    //   74: getfield 28	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mUri	Ljava/lang/String;
    //   77: invokespecial 125	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:guessCharsetEncoding	(Ljava/lang/String;)Ljava/lang/String;
    //   80: astore 11
    //   82: new 127	java/io/LineNumberReader
    //   85: astore 12
    //   87: new 129	java/io/InputStreamReader
    //   90: astore 13
    //   92: new 78	java/io/FileInputStream
    //   95: astore 14
    //   97: aload 14
    //   99: aload_1
    //   100: invokespecial 132	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   103: aload 13
    //   105: aload 14
    //   107: aload 11
    //   109: invokespecial 135	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   112: aload 12
    //   114: aload 13
    //   116: invokespecial 138	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   119: aload_0
    //   120: aload 12
    //   122: putfield 140	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mReader	Ljava/io/LineNumberReader;
    //   125: iconst_0
    //   126: istore 9
    //   128: iconst_0
    //   129: istore 15
    //   131: iload 15
    //   133: istore 16
    //   135: aload_0
    //   136: getfield 140	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mReader	Ljava/io/LineNumberReader;
    //   139: invokevirtual 143	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   142: astore 11
    //   144: iload 15
    //   146: istore 16
    //   148: aload_0
    //   149: getfield 140	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mReader	Ljava/io/LineNumberReader;
    //   152: invokevirtual 147	java/io/LineNumberReader:getLineNumber	()I
    //   155: istore 17
    //   157: iload 17
    //   159: istore 16
    //   161: aload 11
    //   163: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   166: ifne +1186 -> 1352
    //   169: aload_3
    //   170: astore 13
    //   172: iload 5
    //   174: ifne +37 -> 211
    //   177: aload_3
    //   178: astore 13
    //   180: iload 17
    //   182: istore 16
    //   184: aload 11
    //   186: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   189: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   192: ldc 160
    //   194: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   197: ifeq +14 -> 211
    //   200: iload 17
    //   202: istore 16
    //   204: aload 11
    //   206: invokestatic 167	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:delSeprator	(Ljava/lang/String;)Ljava/lang/String;
    //   209: astore 13
    //   211: aload_2
    //   212: astore_3
    //   213: iload 5
    //   215: ifne +35 -> 250
    //   218: aload_2
    //   219: astore_3
    //   220: iload 17
    //   222: istore 16
    //   224: aload 11
    //   226: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   229: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   232: ldc 169
    //   234: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   237: ifeq +13 -> 250
    //   240: iload 17
    //   242: istore 16
    //   244: aload 11
    //   246: invokestatic 167	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:delSeprator	(Ljava/lang/String;)Ljava/lang/String;
    //   249: astore_3
    //   250: iload 17
    //   252: istore 16
    //   254: iload 5
    //   256: istore 15
    //   258: lload 7
    //   260: lstore 18
    //   262: aload 11
    //   264: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   267: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   270: ldc 171
    //   272: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   275: ifeq +394 -> 669
    //   278: iload 5
    //   280: istore 15
    //   282: iload 5
    //   284: ifeq +6 -> 290
    //   287: iconst_0
    //   288: istore 15
    //   290: lload 7
    //   292: lconst_0
    //   293: lcmp
    //   294: ifeq +19 -> 313
    //   297: aload 10
    //   299: ifnull +14 -> 313
    //   302: iload 17
    //   304: istore 16
    //   306: aload 10
    //   308: lload 7
    //   310: invokevirtual 177	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setEndPostion	(J)V
    //   313: iload 17
    //   315: istore 16
    //   317: aload 11
    //   319: invokestatic 167	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:delSeprator	(Ljava/lang/String;)Ljava/lang/String;
    //   322: astore 12
    //   324: iload 17
    //   326: istore 16
    //   328: aload_1
    //   329: invokevirtual 180	java/io/File:getParent	()Ljava/lang/String;
    //   332: astore 4
    //   334: aload 4
    //   336: astore_2
    //   337: iload 17
    //   339: istore 16
    //   341: aload 4
    //   343: ldc 182
    //   345: invokevirtual 185	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   348: ifne +38 -> 386
    //   351: iload 17
    //   353: istore 16
    //   355: new 106	java/lang/StringBuilder
    //   358: astore_2
    //   359: iload 17
    //   361: istore 16
    //   363: aload_2
    //   364: invokespecial 186	java/lang/StringBuilder:<init>	()V
    //   367: iload 17
    //   369: istore 16
    //   371: aload_2
    //   372: aload 4
    //   374: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: ldc 182
    //   379: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   385: astore_2
    //   386: aload 12
    //   388: astore 4
    //   390: iload 17
    //   392: istore 16
    //   394: aload 12
    //   396: ldc 182
    //   398: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   401: ifeq +15 -> 416
    //   404: iload 17
    //   406: istore 16
    //   408: aload 12
    //   410: iconst_1
    //   411: invokevirtual 190	java/lang/String:substring	(I)Ljava/lang/String;
    //   414: astore 4
    //   416: iload 17
    //   418: istore 16
    //   420: new 106	java/lang/StringBuilder
    //   423: astore 12
    //   425: iload 17
    //   427: istore 16
    //   429: aload 12
    //   431: invokespecial 186	java/lang/StringBuilder:<init>	()V
    //   434: iload 17
    //   436: istore 16
    //   438: aload 12
    //   440: aload_2
    //   441: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: aload 4
    //   446: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   452: astore 4
    //   454: iload 17
    //   456: istore 16
    //   458: new 119	java/io/File
    //   461: astore_2
    //   462: iload 17
    //   464: istore 16
    //   466: aload_2
    //   467: aload 4
    //   469: invokespecial 120	java/io/File:<init>	(Ljava/lang/String;)V
    //   472: iload 17
    //   474: istore 16
    //   476: aload_2
    //   477: invokevirtual 193	java/io/File:exists	()Z
    //   480: ifne +110 -> 590
    //   483: iload 17
    //   485: istore 16
    //   487: new 101	java/io/IOException
    //   490: astore 10
    //   492: iload 17
    //   494: istore 16
    //   496: new 106	java/lang/StringBuilder
    //   499: astore_2
    //   500: iload 17
    //   502: istore 16
    //   504: aload_2
    //   505: ldc 195
    //   507: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   510: iload 17
    //   512: istore 16
    //   514: aload 10
    //   516: aload_2
    //   517: aload_0
    //   518: getfield 28	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mUri	Ljava/lang/String;
    //   521: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   527: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   530: iload 17
    //   532: istore 16
    //   534: ldc 104
    //   536: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   539: iload 17
    //   541: istore 16
    //   543: aload 10
    //   545: athrow
    //   546: astore 10
    //   548: iload 16
    //   550: istore 9
    //   552: new 198	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/ParseException
    //   555: astore_2
    //   556: aload_2
    //   557: ldc 200
    //   559: aload 10
    //   561: iload 9
    //   563: invokespecial 203	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/ParseException:<init>	(Ljava/lang/String;Ljava/lang/Exception;I)V
    //   566: ldc 104
    //   568: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   571: aload_2
    //   572: athrow
    //   573: astore 10
    //   575: aload_0
    //   576: getfield 140	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mReader	Ljava/io/LineNumberReader;
    //   579: invokevirtual 206	java/io/LineNumberReader:close	()V
    //   582: ldc 104
    //   584: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   587: aload 10
    //   589: athrow
    //   590: iload 17
    //   592: istore 16
    //   594: new 208	com/tencent/qqmusic/mediaplayer/codec/NativeDecoder
    //   597: astore_2
    //   598: iload 17
    //   600: istore 16
    //   602: aload_2
    //   603: invokespecial 209	com/tencent/qqmusic/mediaplayer/codec/NativeDecoder:<init>	()V
    //   606: iload 17
    //   608: istore 16
    //   610: new 211	com/tencent/qqmusic/mediaplayer/upstream/FileDataSource
    //   613: astore 12
    //   615: iload 17
    //   617: istore 16
    //   619: aload 12
    //   621: aload 4
    //   623: invokespecial 212	com/tencent/qqmusic/mediaplayer/upstream/FileDataSource:<init>	(Ljava/lang/String;)V
    //   626: iload 17
    //   628: istore 16
    //   630: aload_2
    //   631: aload 12
    //   633: invokevirtual 216	com/tencent/qqmusic/mediaplayer/codec/NativeDecoder:init	(Lcom/tencent/qqmusic/mediaplayer/upstream/IDataSource;)I
    //   636: istore 5
    //   638: iload 5
    //   640: ifne +245 -> 885
    //   643: iload 17
    //   645: istore 16
    //   647: aload_2
    //   648: invokevirtual 220	com/tencent/qqmusic/mediaplayer/codec/NativeDecoder:getAudioInformation	()Lcom/tencent/qqmusic/mediaplayer/AudioInformation;
    //   651: invokevirtual 226	com/tencent/qqmusic/mediaplayer/AudioInformation:getDuration	()J
    //   654: lstore 7
    //   656: iload 17
    //   658: istore 16
    //   660: aload_2
    //   661: invokevirtual 229	com/tencent/qqmusic/mediaplayer/codec/NativeDecoder:release	()I
    //   664: pop
    //   665: lload 7
    //   667: lstore 18
    //   669: iload 17
    //   671: istore 16
    //   673: aload 11
    //   675: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   678: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   681: ldc 231
    //   683: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   686: ifeq +934 -> 1620
    //   689: iload 17
    //   691: istore 16
    //   693: new 173	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo
    //   696: astore 10
    //   698: iload 17
    //   700: istore 16
    //   702: aload 10
    //   704: getstatic 237	com/tencent/qqmusic/mediaplayer/audioplaylist/AudioPlayListItemInfo:TYPE_CUE	I
    //   707: invokespecial 239	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:<init>	(I)V
    //   710: iload 17
    //   712: istore 16
    //   714: aload 10
    //   716: aload 4
    //   718: invokevirtual 242	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setFilePath	(Ljava/lang/String;)V
    //   721: iconst_1
    //   722: istore 5
    //   724: iinc 6 1
    //   727: iload 5
    //   729: ifeq +37 -> 766
    //   732: iload 17
    //   734: istore 16
    //   736: aload 11
    //   738: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   741: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   744: ldc 169
    //   746: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   749: ifeq +17 -> 766
    //   752: iload 17
    //   754: istore 16
    //   756: aload 10
    //   758: aload 11
    //   760: invokestatic 167	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:delSeprator	(Ljava/lang/String;)Ljava/lang/String;
    //   763: invokevirtual 245	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setTitle	(Ljava/lang/String;)V
    //   766: iload 5
    //   768: ifeq +37 -> 805
    //   771: iload 17
    //   773: istore 16
    //   775: aload 11
    //   777: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   780: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   783: ldc 160
    //   785: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   788: ifeq +17 -> 805
    //   791: iload 17
    //   793: istore 16
    //   795: aload 10
    //   797: aload 11
    //   799: invokestatic 167	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:delSeprator	(Ljava/lang/String;)Ljava/lang/String;
    //   802: invokevirtual 248	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setPerformer	(Ljava/lang/String;)V
    //   805: iload 6
    //   807: iconst_1
    //   808: if_icmpne +159 -> 967
    //   811: iload 17
    //   813: istore 16
    //   815: aload 11
    //   817: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   820: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   823: ldc 250
    //   825: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   828: ifeq +139 -> 967
    //   831: iload 17
    //   833: istore 16
    //   835: aload 11
    //   837: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   840: ldc 252
    //   842: invokevirtual 255	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   845: ifne +94 -> 939
    //   848: iload 17
    //   850: istore 16
    //   852: new 101	java/io/IOException
    //   855: astore 10
    //   857: iload 17
    //   859: istore 16
    //   861: aload 10
    //   863: ldc_w 257
    //   866: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   869: iload 17
    //   871: istore 16
    //   873: ldc 104
    //   875: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   878: iload 17
    //   880: istore 16
    //   882: aload 10
    //   884: athrow
    //   885: iload 17
    //   887: istore 16
    //   889: new 106	java/lang/StringBuilder
    //   892: astore 12
    //   894: iload 17
    //   896: istore 16
    //   898: aload 12
    //   900: ldc_w 259
    //   903: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   906: iload 17
    //   908: istore 16
    //   910: ldc 8
    //   912: aload 12
    //   914: iload 5
    //   916: invokevirtual 262	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   919: ldc_w 264
    //   922: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   925: aload 4
    //   927: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   930: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   933: invokestatic 267	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   936: goto -280 -> 656
    //   939: iload 17
    //   941: istore 16
    //   943: aload 10
    //   945: aload_0
    //   946: aload 11
    //   948: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   951: ldc 252
    //   953: invokevirtual 48	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   956: iconst_1
    //   957: aaload
    //   958: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   961: invokespecial 269	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:convertTimeStrToMs	(Ljava/lang/String;)J
    //   964: invokevirtual 272	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setStartPosition	(J)V
    //   967: iload 6
    //   969: iconst_2
    //   970: if_icmplt +657 -> 1627
    //   973: iload 17
    //   975: istore 16
    //   977: aload 11
    //   979: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   982: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   985: ldc 250
    //   987: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   990: ifeq +637 -> 1627
    //   993: iload 17
    //   995: istore 16
    //   997: aload 11
    //   999: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1002: ldc_w 274
    //   1005: invokevirtual 255	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1008: ifeq +189 -> 1197
    //   1011: iload 17
    //   1013: istore 16
    //   1015: aload 11
    //   1017: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1020: ldc_w 274
    //   1023: invokevirtual 48	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1026: iconst_1
    //   1027: aaload
    //   1028: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1031: astore_2
    //   1032: iload 17
    //   1034: istore 16
    //   1036: aload_0
    //   1037: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1040: iload 6
    //   1042: iconst_2
    //   1043: isub
    //   1044: invokeinterface 278 2 0
    //   1049: checkcast 173	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo
    //   1052: aload_0
    //   1053: aload_2
    //   1054: invokespecial 269	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:convertTimeStrToMs	(Ljava/lang/String;)J
    //   1057: invokevirtual 177	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setEndPostion	(J)V
    //   1060: iconst_1
    //   1061: istore 9
    //   1063: iload 9
    //   1065: istore 15
    //   1067: aload 10
    //   1069: astore_2
    //   1070: iload 6
    //   1072: ifle +102 -> 1174
    //   1075: iload 17
    //   1077: istore 16
    //   1079: iload 9
    //   1081: istore 15
    //   1083: aload 10
    //   1085: astore_2
    //   1086: aload 11
    //   1088: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1091: invokevirtual 158	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   1094: ldc 250
    //   1096: invokevirtual 164	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1099: ifeq +75 -> 1174
    //   1102: iload 17
    //   1104: istore 16
    //   1106: iload 9
    //   1108: istore 15
    //   1110: aload 10
    //   1112: astore_2
    //   1113: aload 11
    //   1115: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1118: ldc 252
    //   1120: invokevirtual 255	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1123: ifeq +51 -> 1174
    //   1126: iload 17
    //   1128: istore 16
    //   1130: aload_0
    //   1131: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1134: aload 10
    //   1136: invokeinterface 282 2 0
    //   1141: pop
    //   1142: iload 17
    //   1144: istore 16
    //   1146: new 173	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo
    //   1149: astore_2
    //   1150: iload 17
    //   1152: istore 16
    //   1154: aload_2
    //   1155: getstatic 237	com/tencent/qqmusic/mediaplayer/audioplaylist/AudioPlayListItemInfo:TYPE_CUE	I
    //   1158: invokespecial 239	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:<init>	(I)V
    //   1161: iload 17
    //   1163: istore 16
    //   1165: aload_2
    //   1166: aload 4
    //   1168: invokevirtual 242	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setFilePath	(Ljava/lang/String;)V
    //   1171: iconst_0
    //   1172: istore 15
    //   1174: iload 15
    //   1176: istore 9
    //   1178: aload_2
    //   1179: astore 10
    //   1181: iload 17
    //   1183: istore 15
    //   1185: lload 18
    //   1187: lstore 7
    //   1189: aload_3
    //   1190: astore_2
    //   1191: aload 13
    //   1193: astore_3
    //   1194: goto -1063 -> 131
    //   1197: iload 17
    //   1199: istore 16
    //   1201: aload 11
    //   1203: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1206: ldc 252
    //   1208: invokevirtual 255	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1211: ifeq +73 -> 1284
    //   1214: iload 17
    //   1216: istore 16
    //   1218: aload 11
    //   1220: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1223: ldc 252
    //   1225: invokevirtual 48	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1228: iconst_1
    //   1229: aaload
    //   1230: invokevirtual 155	java/lang/String:trim	()Ljava/lang/String;
    //   1233: astore_2
    //   1234: iload 17
    //   1236: istore 16
    //   1238: aload 10
    //   1240: aload_0
    //   1241: aload_2
    //   1242: invokespecial 269	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:convertTimeStrToMs	(Ljava/lang/String;)J
    //   1245: invokevirtual 272	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setStartPosition	(J)V
    //   1248: iload 9
    //   1250: ifne +31 -> 1281
    //   1253: iload 17
    //   1255: istore 16
    //   1257: aload_0
    //   1258: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1261: iload 6
    //   1263: iconst_2
    //   1264: isub
    //   1265: invokeinterface 278 2 0
    //   1270: checkcast 173	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo
    //   1273: aload_0
    //   1274: aload_2
    //   1275: invokespecial 269	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:convertTimeStrToMs	(Ljava/lang/String;)J
    //   1278: invokevirtual 177	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setEndPostion	(J)V
    //   1281: goto -218 -> 1063
    //   1284: iload 17
    //   1286: istore 16
    //   1288: new 101	java/io/IOException
    //   1291: astore 10
    //   1293: iload 17
    //   1295: istore 16
    //   1297: new 106	java/lang/StringBuilder
    //   1300: astore_2
    //   1301: iload 17
    //   1303: istore 16
    //   1305: aload_2
    //   1306: ldc_w 284
    //   1309: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1312: iload 17
    //   1314: istore 16
    //   1316: aload 10
    //   1318: aload_2
    //   1319: iload 6
    //   1321: invokevirtual 262	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1324: ldc_w 286
    //   1327: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1330: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1333: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1336: iload 17
    //   1338: istore 16
    //   1340: ldc 104
    //   1342: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1345: iload 17
    //   1347: istore 16
    //   1349: aload 10
    //   1351: athrow
    //   1352: iload 17
    //   1354: istore 16
    //   1356: aload_0
    //   1357: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1360: invokeinterface 91 1 0
    //   1365: ifne +204 -> 1569
    //   1368: iload 17
    //   1370: istore 16
    //   1372: aload_0
    //   1373: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1376: aload_0
    //   1377: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1380: invokeinterface 289 1 0
    //   1385: iconst_1
    //   1386: isub
    //   1387: invokeinterface 278 2 0
    //   1392: checkcast 173	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo
    //   1395: astore 10
    //   1397: lload 7
    //   1399: lconst_0
    //   1400: lcmp
    //   1401: ifeq +49 -> 1450
    //   1404: iload 17
    //   1406: istore 16
    //   1408: aload 10
    //   1410: invokevirtual 293	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:getRange	()Landroid/util/Pair;
    //   1413: ifnull +37 -> 1450
    //   1416: iload 17
    //   1418: istore 16
    //   1420: aload 10
    //   1422: invokevirtual 293	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:getRange	()Landroid/util/Pair;
    //   1425: getfield 299	android/util/Pair:second	Ljava/lang/Object;
    //   1428: checkcast 50	java/lang/Long
    //   1431: invokevirtual 302	java/lang/Long:longValue	()J
    //   1434: lconst_0
    //   1435: lcmp
    //   1436: ifne +14 -> 1450
    //   1439: iload 17
    //   1441: istore 16
    //   1443: aload 10
    //   1445: lload 7
    //   1447: invokevirtual 177	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setEndPostion	(J)V
    //   1450: iconst_0
    //   1451: istore 9
    //   1453: iload 17
    //   1455: istore 16
    //   1457: iload 9
    //   1459: aload_0
    //   1460: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1463: invokeinterface 289 1 0
    //   1468: if_icmpge +101 -> 1569
    //   1471: iload 17
    //   1473: istore 16
    //   1475: aload_0
    //   1476: getfield 33	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mTrackInfoList	Ljava/util/List;
    //   1479: iload 9
    //   1481: invokeinterface 278 2 0
    //   1486: checkcast 173	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo
    //   1489: astore 10
    //   1491: iload 17
    //   1493: istore 16
    //   1495: aload_2
    //   1496: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1499: ifne +28 -> 1527
    //   1502: iload 17
    //   1504: istore 16
    //   1506: aload 10
    //   1508: invokevirtual 305	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:getAlbum	()Ljava/lang/String;
    //   1511: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1514: ifeq +13 -> 1527
    //   1517: iload 17
    //   1519: istore 16
    //   1521: aload 10
    //   1523: aload_2
    //   1524: invokevirtual 308	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setAlbum	(Ljava/lang/String;)V
    //   1527: iload 17
    //   1529: istore 16
    //   1531: aload_3
    //   1532: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1535: ifne +28 -> 1563
    //   1538: iload 17
    //   1540: istore 16
    //   1542: aload 10
    //   1544: invokevirtual 311	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:getPerformer	()Ljava/lang/String;
    //   1547: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1550: ifeq +13 -> 1563
    //   1553: iload 17
    //   1555: istore 16
    //   1557: aload 10
    //   1559: aload_3
    //   1560: invokevirtual 248	com/tencent/qqmusic/mediaplayer/audioplaylist/TrackInfo:setPerformer	(Ljava/lang/String;)V
    //   1563: iinc 9 1
    //   1566: goto -113 -> 1453
    //   1569: aload_0
    //   1570: getfield 140	com/tencent/qqmusic/mediaplayer/audioplaylist/itemparser/CueItemParser:mReader	Ljava/io/LineNumberReader;
    //   1573: invokevirtual 206	java/io/LineNumberReader:close	()V
    //   1576: ldc 104
    //   1578: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1581: return
    //   1582: astore 10
    //   1584: ldc 8
    //   1586: ldc_w 313
    //   1589: aload 10
    //   1591: invokestatic 316	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1594: ldc 104
    //   1596: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1599: goto -18 -> 1581
    //   1602: astore_2
    //   1603: ldc 8
    //   1605: ldc_w 313
    //   1608: aload_2
    //   1609: invokestatic 316	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1612: goto -1030 -> 582
    //   1615: astore 10
    //   1617: goto -1065 -> 552
    //   1620: iload 15
    //   1622: istore 5
    //   1624: goto -897 -> 727
    //   1627: goto -564 -> 1063
    //
    // Exception table:
    //   from	to	target	type
    //   135	144	546	java/io/IOException
    //   148	157	546	java/io/IOException
    //   161	169	546	java/io/IOException
    //   184	200	546	java/io/IOException
    //   204	211	546	java/io/IOException
    //   224	240	546	java/io/IOException
    //   244	250	546	java/io/IOException
    //   262	278	546	java/io/IOException
    //   306	313	546	java/io/IOException
    //   317	324	546	java/io/IOException
    //   328	334	546	java/io/IOException
    //   341	351	546	java/io/IOException
    //   355	359	546	java/io/IOException
    //   363	367	546	java/io/IOException
    //   371	386	546	java/io/IOException
    //   394	404	546	java/io/IOException
    //   408	416	546	java/io/IOException
    //   420	425	546	java/io/IOException
    //   429	434	546	java/io/IOException
    //   438	454	546	java/io/IOException
    //   458	462	546	java/io/IOException
    //   466	472	546	java/io/IOException
    //   476	483	546	java/io/IOException
    //   487	492	546	java/io/IOException
    //   496	500	546	java/io/IOException
    //   504	510	546	java/io/IOException
    //   514	530	546	java/io/IOException
    //   534	539	546	java/io/IOException
    //   543	546	546	java/io/IOException
    //   594	598	546	java/io/IOException
    //   602	606	546	java/io/IOException
    //   610	615	546	java/io/IOException
    //   619	626	546	java/io/IOException
    //   630	638	546	java/io/IOException
    //   647	656	546	java/io/IOException
    //   660	665	546	java/io/IOException
    //   673	689	546	java/io/IOException
    //   693	698	546	java/io/IOException
    //   702	710	546	java/io/IOException
    //   714	721	546	java/io/IOException
    //   736	752	546	java/io/IOException
    //   756	766	546	java/io/IOException
    //   775	791	546	java/io/IOException
    //   795	805	546	java/io/IOException
    //   815	831	546	java/io/IOException
    //   835	848	546	java/io/IOException
    //   852	857	546	java/io/IOException
    //   861	869	546	java/io/IOException
    //   873	878	546	java/io/IOException
    //   882	885	546	java/io/IOException
    //   889	894	546	java/io/IOException
    //   898	906	546	java/io/IOException
    //   910	936	546	java/io/IOException
    //   943	967	546	java/io/IOException
    //   977	993	546	java/io/IOException
    //   997	1011	546	java/io/IOException
    //   1015	1032	546	java/io/IOException
    //   1036	1060	546	java/io/IOException
    //   1086	1102	546	java/io/IOException
    //   1113	1126	546	java/io/IOException
    //   1130	1142	546	java/io/IOException
    //   1146	1150	546	java/io/IOException
    //   1154	1161	546	java/io/IOException
    //   1165	1171	546	java/io/IOException
    //   1201	1214	546	java/io/IOException
    //   1218	1234	546	java/io/IOException
    //   1238	1248	546	java/io/IOException
    //   1257	1281	546	java/io/IOException
    //   1288	1293	546	java/io/IOException
    //   1297	1301	546	java/io/IOException
    //   1305	1312	546	java/io/IOException
    //   1316	1336	546	java/io/IOException
    //   1340	1345	546	java/io/IOException
    //   1349	1352	546	java/io/IOException
    //   1356	1368	546	java/io/IOException
    //   1372	1397	546	java/io/IOException
    //   1408	1416	546	java/io/IOException
    //   1420	1439	546	java/io/IOException
    //   1443	1450	546	java/io/IOException
    //   1457	1471	546	java/io/IOException
    //   1475	1491	546	java/io/IOException
    //   1495	1502	546	java/io/IOException
    //   1506	1517	546	java/io/IOException
    //   1521	1527	546	java/io/IOException
    //   1531	1538	546	java/io/IOException
    //   1542	1553	546	java/io/IOException
    //   1557	1563	546	java/io/IOException
    //   72	125	573	finally
    //   135	144	573	finally
    //   148	157	573	finally
    //   161	169	573	finally
    //   184	200	573	finally
    //   204	211	573	finally
    //   224	240	573	finally
    //   244	250	573	finally
    //   262	278	573	finally
    //   306	313	573	finally
    //   317	324	573	finally
    //   328	334	573	finally
    //   341	351	573	finally
    //   355	359	573	finally
    //   363	367	573	finally
    //   371	386	573	finally
    //   394	404	573	finally
    //   408	416	573	finally
    //   420	425	573	finally
    //   429	434	573	finally
    //   438	454	573	finally
    //   458	462	573	finally
    //   466	472	573	finally
    //   476	483	573	finally
    //   487	492	573	finally
    //   496	500	573	finally
    //   504	510	573	finally
    //   514	530	573	finally
    //   534	539	573	finally
    //   543	546	573	finally
    //   552	573	573	finally
    //   594	598	573	finally
    //   602	606	573	finally
    //   610	615	573	finally
    //   619	626	573	finally
    //   630	638	573	finally
    //   647	656	573	finally
    //   660	665	573	finally
    //   673	689	573	finally
    //   693	698	573	finally
    //   702	710	573	finally
    //   714	721	573	finally
    //   736	752	573	finally
    //   756	766	573	finally
    //   775	791	573	finally
    //   795	805	573	finally
    //   815	831	573	finally
    //   835	848	573	finally
    //   852	857	573	finally
    //   861	869	573	finally
    //   873	878	573	finally
    //   882	885	573	finally
    //   889	894	573	finally
    //   898	906	573	finally
    //   910	936	573	finally
    //   943	967	573	finally
    //   977	993	573	finally
    //   997	1011	573	finally
    //   1015	1032	573	finally
    //   1036	1060	573	finally
    //   1086	1102	573	finally
    //   1113	1126	573	finally
    //   1130	1142	573	finally
    //   1146	1150	573	finally
    //   1154	1161	573	finally
    //   1165	1171	573	finally
    //   1201	1214	573	finally
    //   1218	1234	573	finally
    //   1238	1248	573	finally
    //   1257	1281	573	finally
    //   1288	1293	573	finally
    //   1297	1301	573	finally
    //   1305	1312	573	finally
    //   1316	1336	573	finally
    //   1340	1345	573	finally
    //   1349	1352	573	finally
    //   1356	1368	573	finally
    //   1372	1397	573	finally
    //   1408	1416	573	finally
    //   1420	1439	573	finally
    //   1443	1450	573	finally
    //   1457	1471	573	finally
    //   1475	1491	573	finally
    //   1495	1502	573	finally
    //   1506	1517	573	finally
    //   1521	1527	573	finally
    //   1531	1538	573	finally
    //   1542	1553	573	finally
    //   1557	1563	573	finally
    //   1569	1576	1582	java/lang/Exception
    //   575	582	1602	java/lang/Exception
    //   72	125	1615	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.CueItemParser
 * JD-Core Version:    0.6.2
 */