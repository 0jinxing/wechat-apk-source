package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.mm.opensdk.diffdev.OAuthErrCode;

final class f$a
{
  public OAuthErrCode n;
  public String v;
  public int w;

  // ERROR //
  public static a b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 23
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 2	com/tencent/mm/opensdk/diffdev/a/f$a
    //   8: dup
    //   9: invokespecial 30	com/tencent/mm/opensdk/diffdev/a/f$a:<init>	()V
    //   12: astore_1
    //   13: aload_0
    //   14: ifnull +8 -> 22
    //   17: aload_0
    //   18: arraylength
    //   19: ifne +24 -> 43
    //   22: ldc 32
    //   24: ldc 34
    //   26: invokestatic 40	com/tencent/mm/opensdk/utils/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: aload_1
    //   30: getstatic 45	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_NetworkErr	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   33: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   36: ldc 23
    //   38: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_1
    //   42: areturn
    //   43: new 52	java/lang/String
    //   46: astore_2
    //   47: aload_2
    //   48: aload_0
    //   49: ldc 54
    //   51: invokespecial 57	java/lang/String:<init>	([BLjava/lang/String;)V
    //   54: new 59	org/json/JSONObject
    //   57: astore_0
    //   58: aload_0
    //   59: aload_2
    //   60: invokespecial 62	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   63: aload_1
    //   64: aload_0
    //   65: ldc 64
    //   67: invokevirtual 68	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   70: putfield 70	com/tencent/mm/opensdk/diffdev/a/f$a:w	I
    //   73: ldc 32
    //   75: ldc 72
    //   77: iconst_1
    //   78: anewarray 4	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: aload_1
    //   84: getfield 70	com/tencent/mm/opensdk/diffdev/a/f$a:w	I
    //   87: invokestatic 78	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   90: aastore
    //   91: invokestatic 82	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   94: invokestatic 85	com/tencent/mm/opensdk/utils/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload_1
    //   98: getfield 70	com/tencent/mm/opensdk/diffdev/a/f$a:w	I
    //   101: lookupswitch	default:+59->160, 402:+188->289, 403:+198->299, 404:+168->269, 405:+111->212, 408:+178->279, 500:+208->309
    //   161: getstatic 88	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_NormalErr	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   164: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   167: ldc 23
    //   169: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: goto -131 -> 41
    //   175: astore_0
    //   176: ldc 32
    //   178: ldc 90
    //   180: iconst_1
    //   181: anewarray 4	java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: aload_0
    //   187: invokevirtual 94	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 82	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   194: invokestatic 40	com/tencent/mm/opensdk/utils/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: aload_1
    //   198: getstatic 88	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_NormalErr	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   201: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   204: ldc 23
    //   206: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -168 -> 41
    //   212: aload_1
    //   213: getstatic 97	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_OK	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   216: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   219: aload_1
    //   220: aload_0
    //   221: ldc 99
    //   223: invokevirtual 103	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   226: putfield 105	com/tencent/mm/opensdk/diffdev/a/f$a:v	Ljava/lang/String;
    //   229: goto -62 -> 167
    //   232: astore_0
    //   233: ldc 32
    //   235: ldc 107
    //   237: iconst_1
    //   238: anewarray 4	java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: aload_0
    //   244: invokevirtual 94	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   247: aastore
    //   248: invokestatic 82	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   251: invokestatic 40	com/tencent/mm/opensdk/utils/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: aload_1
    //   255: getstatic 88	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_NormalErr	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   258: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   261: ldc 23
    //   263: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: goto -225 -> 41
    //   269: aload_1
    //   270: getstatic 97	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_OK	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   273: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   276: goto -109 -> 167
    //   279: aload_1
    //   280: getstatic 97	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_OK	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   283: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   286: goto -119 -> 167
    //   289: aload_1
    //   290: getstatic 110	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_Timeout	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   293: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   296: goto -129 -> 167
    //   299: aload_1
    //   300: getstatic 113	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_Cancel	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   303: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   306: goto -139 -> 167
    //   309: aload_1
    //   310: getstatic 88	com/tencent/mm/opensdk/diffdev/OAuthErrCode:WechatAuth_Err_NormalErr	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   313: putfield 47	com/tencent/mm/opensdk/diffdev/a/f$a:n	Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    //   316: goto -149 -> 167
    //
    // Exception table:
    //   from	to	target	type
    //   43	54	175	java/lang/Exception
    //   54	160	232	java/lang/Exception
    //   160	167	232	java/lang/Exception
    //   212	229	232	java/lang/Exception
    //   269	276	232	java/lang/Exception
    //   279	286	232	java/lang/Exception
    //   289	296	232	java/lang/Exception
    //   299	306	232	java/lang/Exception
    //   309	316	232	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.diffdev.a.f.a
 * JD-Core Version:    0.6.2
 */