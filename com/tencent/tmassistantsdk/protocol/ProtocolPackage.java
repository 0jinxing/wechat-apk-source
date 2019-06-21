package com.tencent.tmassistantsdk.protocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest;
import com.tencent.tmassistantsdk.protocol.jce.ReqHead;
import com.tencent.tmassistantsdk.protocol.jce.Request;
import com.tencent.tmassistantsdk.protocol.jce.Response;
import com.tencent.tmassistantsdk.protocol.jce.RspHead;
import com.tencent.tmassistantsdk.protocol.jce.Terminal;
import com.tencent.tmassistantsdk.util.Cryptor;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import java.util.List;

public class ProtocolPackage
{
  static final String CRYPT_KEY = "ji*9^&43U0X-~./(";
  static final byte FLAG_CRYPT = 2;
  static final byte FLAG_ZIP = 1;
  public static final String ServerEncoding = "utf-8";
  private static final String TAG = "ProtocolPackage";
  static final int ZIP_TRIGGER = 256;

  public static byte[] buildPostData(Request paramRequest)
  {
    AppMethodBeat.i(76017);
    if (paramRequest == null)
    {
      paramRequest = null;
      AppMethodBeat.o(76017);
    }
    while (true)
    {
      return paramRequest;
      paramRequest.head.encryptWithPack = ((byte)0);
      if (paramRequest.body.length > 256)
      {
        paramRequest.body = ZipUtils.zip(paramRequest.body);
        paramRequest.head.encryptWithPack = ((byte)(byte)(paramRequest.head.encryptWithPack | 0x1));
      }
      paramRequest.body = encrypt(paramRequest.body, "ji*9^&43U0X-~./(".getBytes());
      paramRequest.head.encryptWithPack = ((byte)(byte)(paramRequest.head.encryptWithPack | 0x2));
      paramRequest = jceStructToUTF8Byte(paramRequest);
      AppMethodBeat.o(76017);
    }
  }

  public static JceStruct buildReportRequest(byte paramByte, List<byte[]> paramList, String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(76014);
    ReportLogRequest localReportLogRequest = new ReportLogRequest();
    localReportLogRequest.logType = paramByte;
    localReportLogRequest.logData = formatLogData(paramList);
    localReportLogRequest.hostAppPackageName = paramString1;
    localReportLogRequest.hostAppVersion = paramInt;
    localReportLogRequest.hostUserId = paramString2;
    AppMethodBeat.o(76014);
    return localReportLogRequest;
  }

  public static Request buildRequest(JceStruct paramJceStruct)
  {
    AppMethodBeat.i(76016);
    if (paramJceStruct == null)
    {
      paramJceStruct = null;
      AppMethodBeat.o(76016);
    }
    while (true)
    {
      return paramJceStruct;
      Request localRequest = new Request();
      localRequest.head = getReqHead(paramJceStruct);
      localRequest.body = jceStructToUTF8Byte(paramJceStruct);
      AppMethodBeat.o(76016);
      paramJceStruct = localRequest;
    }
  }

  public static JceStruct bytes2JceObj(byte[] paramArrayOfByte, Class<? extends JceStruct> paramClass)
  {
    AppMethodBeat.i(76022);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(76022);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      try
      {
        JceInputStream localJceInputStream = new com/qq/taf/jce/JceInputStream;
        localJceInputStream.<init>(paramArrayOfByte);
        localJceInputStream.setServerEncoding("utf-8");
        paramArrayOfByte = (JceStruct)paramClass.newInstance();
        paramArrayOfByte.readFrom(localJceInputStream);
        AppMethodBeat.o(76022);
      }
      catch (Exception paramArrayOfByte)
      {
        AppMethodBeat.o(76022);
        paramArrayOfByte = null;
      }
    }
  }

  private static JceStruct createFromRequest(JceStruct paramJceStruct)
  {
    Object localObject = null;
    AppMethodBeat.i(76020);
    if (paramJceStruct == null)
    {
      AppMethodBeat.o(76020);
      paramJceStruct = localObject;
    }
    while (true)
    {
      return paramJceStruct;
      paramJceStruct = paramJceStruct.getClass().getName();
      paramJceStruct = paramJceStruct.substring(0, paramJceStruct.length() - 7) + "Response";
      try
      {
        paramJceStruct = (JceStruct)Class.forName(paramJceStruct).newInstance();
        AppMethodBeat.o(76020);
      }
      catch (ClassNotFoundException paramJceStruct)
      {
        while (true)
        {
          ab.printErrStackTrace("ProtocolPackage", paramJceStruct, "", new Object[0]);
          paramJceStruct = null;
        }
      }
      catch (IllegalAccessException paramJceStruct)
      {
        while (true)
        {
          ab.printErrStackTrace("ProtocolPackage", paramJceStruct, "", new Object[0]);
          paramJceStruct = null;
        }
      }
      catch (InstantiationException paramJceStruct)
      {
        while (true)
        {
          ab.printErrStackTrace("ProtocolPackage", paramJceStruct, "", new Object[0]);
          paramJceStruct = null;
        }
      }
    }
  }

  public static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(76025);
    paramArrayOfByte1 = new Cryptor().decrypt(paramArrayOfByte1, paramArrayOfByte2);
    AppMethodBeat.o(76025);
    return paramArrayOfByte1;
  }

  public static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(76024);
    paramArrayOfByte1 = new Cryptor().encrypt(paramArrayOfByte1, paramArrayOfByte2);
    AppMethodBeat.o(76024);
    return paramArrayOfByte1;
  }

  // ERROR //
  public static byte[] formatLogData(List<byte[]> paramList)
  {
    // Byte code:
    //   0: ldc 197
    //   2: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 199	java/io/ByteArrayOutputStream
    //   8: astore_1
    //   9: aload_1
    //   10: invokespecial 200	java/io/ByteArrayOutputStream:<init>	()V
    //   13: new 202	java/io/DataOutputStream
    //   16: astore_2
    //   17: aload_2
    //   18: aload_1
    //   19: invokespecial 205	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   22: aload_2
    //   23: astore_3
    //   24: aload_1
    //   25: astore 4
    //   27: aload_0
    //   28: invokeinterface 211 1 0
    //   33: astore_0
    //   34: aload_2
    //   35: astore_3
    //   36: aload_1
    //   37: astore 4
    //   39: aload_0
    //   40: invokeinterface 217 1 0
    //   45: ifeq +94 -> 139
    //   48: aload_2
    //   49: astore_3
    //   50: aload_1
    //   51: astore 4
    //   53: aload_0
    //   54: invokeinterface 220 1 0
    //   59: checkcast 221	[B
    //   62: astore 5
    //   64: aload_2
    //   65: astore_3
    //   66: aload_1
    //   67: astore 4
    //   69: aload_2
    //   70: aload 5
    //   72: arraylength
    //   73: invokevirtual 224	java/io/DataOutputStream:writeInt	(I)V
    //   76: aload_2
    //   77: astore_3
    //   78: aload_1
    //   79: astore 4
    //   81: aload_2
    //   82: aload 5
    //   84: invokevirtual 227	java/io/DataOutputStream:write	([B)V
    //   87: goto -53 -> 34
    //   90: astore 4
    //   92: aload_2
    //   93: astore_0
    //   94: aload 4
    //   96: astore_2
    //   97: aload_0
    //   98: astore_3
    //   99: aload_1
    //   100: astore 4
    //   102: ldc 19
    //   104: aload_2
    //   105: ldc 179
    //   107: iconst_0
    //   108: anewarray 4	java/lang/Object
    //   111: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: aload_1
    //   115: ifnull +7 -> 122
    //   118: aload_1
    //   119: invokevirtual 230	java/io/ByteArrayOutputStream:close	()V
    //   122: aload_0
    //   123: ifnull +7 -> 130
    //   126: aload_0
    //   127: invokevirtual 231	java/io/DataOutputStream:close	()V
    //   130: ldc 197
    //   132: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: aconst_null
    //   136: astore_0
    //   137: aload_0
    //   138: areturn
    //   139: aload_2
    //   140: astore_3
    //   141: aload_1
    //   142: astore 4
    //   144: aload_1
    //   145: invokevirtual 234	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   148: astore_0
    //   149: aload_1
    //   150: invokevirtual 230	java/io/ByteArrayOutputStream:close	()V
    //   153: aload_2
    //   154: invokevirtual 231	java/io/DataOutputStream:close	()V
    //   157: ldc 197
    //   159: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -25 -> 137
    //   165: astore_1
    //   166: ldc 19
    //   168: aload_1
    //   169: ldc 179
    //   171: iconst_0
    //   172: anewarray 4	java/lang/Object
    //   175: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: goto -25 -> 153
    //   181: astore_1
    //   182: ldc 19
    //   184: aload_1
    //   185: ldc 179
    //   187: iconst_0
    //   188: anewarray 4	java/lang/Object
    //   191: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: goto -37 -> 157
    //   197: astore_1
    //   198: ldc 19
    //   200: aload_1
    //   201: ldc 179
    //   203: iconst_0
    //   204: anewarray 4	java/lang/Object
    //   207: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   210: goto -88 -> 122
    //   213: astore_0
    //   214: ldc 19
    //   216: aload_0
    //   217: ldc 179
    //   219: iconst_0
    //   220: anewarray 4	java/lang/Object
    //   223: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: goto -96 -> 130
    //   229: astore_0
    //   230: aconst_null
    //   231: astore_3
    //   232: aconst_null
    //   233: astore_1
    //   234: aload_1
    //   235: ifnull +7 -> 242
    //   238: aload_1
    //   239: invokevirtual 230	java/io/ByteArrayOutputStream:close	()V
    //   242: aload_3
    //   243: ifnull +7 -> 250
    //   246: aload_3
    //   247: invokevirtual 231	java/io/DataOutputStream:close	()V
    //   250: ldc 197
    //   252: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: aload_0
    //   256: athrow
    //   257: astore_1
    //   258: ldc 19
    //   260: aload_1
    //   261: ldc 179
    //   263: iconst_0
    //   264: anewarray 4	java/lang/Object
    //   267: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: goto -28 -> 242
    //   273: astore_1
    //   274: ldc 19
    //   276: aload_1
    //   277: ldc 179
    //   279: iconst_0
    //   280: anewarray 4	java/lang/Object
    //   283: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: goto -36 -> 250
    //   289: astore_0
    //   290: aconst_null
    //   291: astore_3
    //   292: goto -58 -> 234
    //   295: astore_0
    //   296: aload 4
    //   298: astore_1
    //   299: goto -65 -> 234
    //   302: astore_2
    //   303: aconst_null
    //   304: astore_0
    //   305: aconst_null
    //   306: astore_1
    //   307: goto -210 -> 97
    //   310: astore_2
    //   311: aconst_null
    //   312: astore_0
    //   313: goto -216 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   27	34	90	java/lang/Exception
    //   39	48	90	java/lang/Exception
    //   53	64	90	java/lang/Exception
    //   69	76	90	java/lang/Exception
    //   81	87	90	java/lang/Exception
    //   144	149	90	java/lang/Exception
    //   149	153	165	java/io/IOException
    //   153	157	181	java/io/IOException
    //   118	122	197	java/io/IOException
    //   126	130	213	java/io/IOException
    //   5	13	229	finally
    //   238	242	257	java/io/IOException
    //   246	250	273	java/io/IOException
    //   13	22	289	finally
    //   27	34	295	finally
    //   39	48	295	finally
    //   53	64	295	finally
    //   69	76	295	finally
    //   81	87	295	finally
    //   102	114	295	finally
    //   144	149	295	finally
    //   5	13	302	java/lang/Exception
    //   13	22	310	java/lang/Exception
  }

  public static ReqHead getReqHead(JceStruct paramJceStruct)
  {
    AppMethodBeat.i(76015);
    if (paramJceStruct == null)
    {
      paramJceStruct = null;
      AppMethodBeat.o(76015);
    }
    while (true)
    {
      return paramJceStruct;
      ReqHead localReqHead = new ReqHead();
      localReqHead.requestId = GlobalUtil.getMemUUID();
      paramJceStruct = paramJceStruct.getClass().getSimpleName();
      paramJceStruct = paramJceStruct.substring(0, paramJceStruct.length() - 7);
      localReqHead.cmdId = GlobalUtil.getInstance().getJceCmdIdByClassName(paramJceStruct);
      localReqHead.qua = GlobalUtil.getInstance().mQUA;
      localReqHead.phoneGuid = GlobalUtil.getInstance().getPhoneGuid();
      localReqHead.terminal = new Terminal();
      localReqHead.assistantAPILevel = GlobalUtil.getInstance().getQQDownloaderAPILevel();
      localReqHead.assistantVersionCode = GlobalUtil.getInstance().getQQDownloaderVersionCode();
      AppMethodBeat.o(76015);
      paramJceStruct = localReqHead;
    }
  }

  public static byte[] jceStructToUTF8Byte(JceStruct paramJceStruct)
  {
    AppMethodBeat.i(76021);
    if (paramJceStruct == null)
    {
      paramJceStruct = null;
      AppMethodBeat.o(76021);
    }
    while (true)
    {
      return paramJceStruct;
      JceOutputStream localJceOutputStream = new JceOutputStream();
      localJceOutputStream.setServerEncoding("utf-8");
      paramJceStruct.writeTo(localJceOutputStream);
      paramJceStruct = localJceOutputStream.toByteArray();
      AppMethodBeat.o(76021);
    }
  }

  public static Response unpackPackage(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76018);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4))
    {
      AppMethodBeat.o(76018);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      Response localResponse = new Response();
      try
      {
        JceInputStream localJceInputStream = new com/qq/taf/jce/JceInputStream;
        localJceInputStream.<init>(paramArrayOfByte);
        localJceInputStream.setServerEncoding("utf-8");
        localResponse.readFrom(localJceInputStream);
        if (localResponse.head.ret == 0)
        {
          if ((localResponse.head.encryptWithPack & 0x2) == 2)
            localResponse.body = decrypt(localResponse.body, "ji*9^&43U0X-~./(".getBytes());
          if ((localResponse.head.encryptWithPack & 0x1) == 1)
            localResponse.body = ZipUtils.unzip(localResponse.body);
          GlobalUtil.getInstance().setPhoneGuid(localResponse.head.phoneGuid);
        }
        AppMethodBeat.o(76018);
        paramArrayOfByte = localResponse;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("ProtocolPackage", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(76018);
        paramArrayOfByte = null;
      }
    }
  }

  public static JceStruct unpageageJceResponse(JceStruct paramJceStruct, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76019);
    if ((paramJceStruct != null) && (paramArrayOfByte != null))
    {
      paramJceStruct = createFromRequest(paramJceStruct);
      if (paramJceStruct == null);
    }
    while (true)
    {
      try
      {
        JceInputStream localJceInputStream = new com/qq/taf/jce/JceInputStream;
        localJceInputStream.<init>(paramArrayOfByte);
        localJceInputStream.setServerEncoding("utf-8");
        paramJceStruct.readFrom(localJceInputStream);
        AppMethodBeat.o(76019);
        return paramJceStruct;
      }
      catch (Exception paramJceStruct)
      {
        ab.printErrStackTrace("ProtocolPackage", paramJceStruct, "", new Object[0]);
        AppMethodBeat.o(76019);
        paramJceStruct = null;
        continue;
      }
      AppMethodBeat.o(76019);
      paramJceStruct = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.protocol.ProtocolPackage
 * JD-Core Version:    0.6.2
 */