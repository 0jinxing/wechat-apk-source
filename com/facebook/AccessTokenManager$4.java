package com.facebook;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

class AccessTokenManager$4
  implements GraphRequestBatch.Callback
{
  AccessTokenManager$4(AccessTokenManager paramAccessTokenManager, AccessToken paramAccessToken, AccessToken.AccessTokenRefreshCallback paramAccessTokenRefreshCallback, AtomicBoolean paramAtomicBoolean, AccessTokenManager.RefreshResult paramRefreshResult, Set paramSet1, Set paramSet2)
  {
  }

  // ERROR //
  public void onBatchCompleted(GraphRequestBatch paramGraphRequestBatch)
  {
    // Byte code:
    //   0: ldc 47
    //   2: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 57	com/facebook/AccessTokenManager:getInstance	()Lcom/facebook/AccessTokenManager;
    //   8: invokevirtual 61	com/facebook/AccessTokenManager:getCurrentAccessToken	()Lcom/facebook/AccessToken;
    //   11: ifnull +22 -> 33
    //   14: invokestatic 57	com/facebook/AccessTokenManager:getInstance	()Lcom/facebook/AccessTokenManager;
    //   17: invokevirtual 61	com/facebook/AccessTokenManager:getCurrentAccessToken	()Lcom/facebook/AccessToken;
    //   20: invokevirtual 67	com/facebook/AccessToken:getUserId	()Ljava/lang/String;
    //   23: aload_0
    //   24: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   27: invokevirtual 67	com/facebook/AccessToken:getUserId	()Ljava/lang/String;
    //   30: if_acmpeq +49 -> 79
    //   33: aload_0
    //   34: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   37: ifnull +25 -> 62
    //   40: aload_0
    //   41: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   44: astore_2
    //   45: new 69	com/facebook/FacebookException
    //   48: astore_1
    //   49: aload_1
    //   50: ldc 71
    //   52: invokespecial 74	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   55: aload_2
    //   56: aload_1
    //   57: invokeinterface 80 2 0
    //   62: aload_0
    //   63: getfield 28	com/facebook/AccessTokenManager$4:this$0	Lcom/facebook/AccessTokenManager;
    //   66: invokestatic 84	com/facebook/AccessTokenManager:access$200	(Lcom/facebook/AccessTokenManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   69: iconst_0
    //   70: invokevirtual 90	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   73: ldc 47
    //   75: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: return
    //   79: aload_0
    //   80: getfield 34	com/facebook/AccessTokenManager$4:val$permissionsCallSucceeded	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   83: invokevirtual 97	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   86: ifne +71 -> 157
    //   89: aload_0
    //   90: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   93: getfield 103	com/facebook/AccessTokenManager$RefreshResult:accessToken	Ljava/lang/String;
    //   96: ifnonnull +61 -> 157
    //   99: aload_0
    //   100: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   103: getfield 107	com/facebook/AccessTokenManager$RefreshResult:expiresAt	I
    //   106: ifne +51 -> 157
    //   109: aload_0
    //   110: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   113: ifnull +25 -> 138
    //   116: aload_0
    //   117: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   120: astore_1
    //   121: new 69	com/facebook/FacebookException
    //   124: astore_2
    //   125: aload_2
    //   126: ldc 109
    //   128: invokespecial 74	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   131: aload_1
    //   132: aload_2
    //   133: invokeinterface 80 2 0
    //   138: aload_0
    //   139: getfield 28	com/facebook/AccessTokenManager$4:this$0	Lcom/facebook/AccessTokenManager;
    //   142: invokestatic 84	com/facebook/AccessTokenManager:access$200	(Lcom/facebook/AccessTokenManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   145: iconst_0
    //   146: invokevirtual 90	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   149: ldc 47
    //   151: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: goto -76 -> 78
    //   157: aload_0
    //   158: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   161: getfield 103	com/facebook/AccessTokenManager$RefreshResult:accessToken	Ljava/lang/String;
    //   164: ifnull +210 -> 374
    //   167: aload_0
    //   168: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   171: getfield 103	com/facebook/AccessTokenManager$RefreshResult:accessToken	Ljava/lang/String;
    //   174: astore_1
    //   175: aload_0
    //   176: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   179: invokevirtual 112	com/facebook/AccessToken:getApplicationId	()Ljava/lang/String;
    //   182: astore_3
    //   183: aload_0
    //   184: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   187: invokevirtual 67	com/facebook/AccessToken:getUserId	()Ljava/lang/String;
    //   190: astore 4
    //   192: aload_0
    //   193: getfield 34	com/facebook/AccessTokenManager$4:val$permissionsCallSucceeded	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   196: invokevirtual 97	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   199: ifeq +186 -> 385
    //   202: aload_0
    //   203: getfield 38	com/facebook/AccessTokenManager$4:val$permissions	Ljava/util/Set;
    //   206: astore_2
    //   207: aload_0
    //   208: getfield 34	com/facebook/AccessTokenManager$4:val$permissionsCallSucceeded	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   211: invokevirtual 97	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   214: ifeq +182 -> 396
    //   217: aload_0
    //   218: getfield 40	com/facebook/AccessTokenManager$4:val$declinedPermissions	Ljava/util/Set;
    //   221: astore 5
    //   223: aload_0
    //   224: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   227: invokevirtual 116	com/facebook/AccessToken:getSource	()Lcom/facebook/AccessTokenSource;
    //   230: astore 6
    //   232: aload_0
    //   233: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   236: getfield 107	com/facebook/AccessTokenManager$RefreshResult:expiresAt	I
    //   239: ifeq +169 -> 408
    //   242: new 118	java/util/Date
    //   245: astore 7
    //   247: aload 7
    //   249: aload_0
    //   250: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   253: getfield 107	com/facebook/AccessTokenManager$RefreshResult:expiresAt	I
    //   256: i2l
    //   257: ldc2_w 119
    //   260: lmul
    //   261: invokespecial 123	java/util/Date:<init>	(J)V
    //   264: new 118	java/util/Date
    //   267: astore 8
    //   269: aload 8
    //   271: invokespecial 124	java/util/Date:<init>	()V
    //   274: aload_0
    //   275: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   278: getfield 128	com/facebook/AccessTokenManager$RefreshResult:dataAccessExpirationTime	Ljava/lang/Long;
    //   281: ifnull +139 -> 420
    //   284: new 118	java/util/Date
    //   287: astore 9
    //   289: aload 9
    //   291: aload_0
    //   292: getfield 36	com/facebook/AccessTokenManager$4:val$refreshResult	Lcom/facebook/AccessTokenManager$RefreshResult;
    //   295: getfield 128	com/facebook/AccessTokenManager$RefreshResult:dataAccessExpirationTime	Ljava/lang/Long;
    //   298: invokevirtual 134	java/lang/Long:longValue	()J
    //   301: ldc2_w 119
    //   304: lmul
    //   305: invokespecial 123	java/util/Date:<init>	(J)V
    //   308: new 63	com/facebook/AccessToken
    //   311: dup
    //   312: aload_1
    //   313: aload_3
    //   314: aload 4
    //   316: aload_2
    //   317: aload 5
    //   319: aload 6
    //   321: aload 7
    //   323: aload 8
    //   325: aload 9
    //   327: invokespecial 137	com/facebook/AccessToken:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    //   330: astore_1
    //   331: invokestatic 57	com/facebook/AccessTokenManager:getInstance	()Lcom/facebook/AccessTokenManager;
    //   334: aload_1
    //   335: invokevirtual 141	com/facebook/AccessTokenManager:setCurrentAccessToken	(Lcom/facebook/AccessToken;)V
    //   338: aload_0
    //   339: getfield 28	com/facebook/AccessTokenManager$4:this$0	Lcom/facebook/AccessTokenManager;
    //   342: invokestatic 84	com/facebook/AccessTokenManager:access$200	(Lcom/facebook/AccessTokenManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   345: iconst_0
    //   346: invokevirtual 90	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   349: aload_0
    //   350: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   353: ifnull +121 -> 474
    //   356: aload_0
    //   357: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   360: aload_1
    //   361: invokeinterface 144 2 0
    //   366: ldc 47
    //   368: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   371: goto -293 -> 78
    //   374: aload_0
    //   375: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   378: invokevirtual 147	com/facebook/AccessToken:getToken	()Ljava/lang/String;
    //   381: astore_1
    //   382: goto -207 -> 175
    //   385: aload_0
    //   386: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   389: invokevirtual 151	com/facebook/AccessToken:getPermissions	()Ljava/util/Set;
    //   392: astore_2
    //   393: goto -186 -> 207
    //   396: aload_0
    //   397: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   400: invokevirtual 154	com/facebook/AccessToken:getDeclinedPermissions	()Ljava/util/Set;
    //   403: astore 5
    //   405: goto -182 -> 223
    //   408: aload_0
    //   409: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   412: invokevirtual 158	com/facebook/AccessToken:getExpires	()Ljava/util/Date;
    //   415: astore 7
    //   417: goto -153 -> 264
    //   420: aload_0
    //   421: getfield 30	com/facebook/AccessTokenManager$4:val$accessToken	Lcom/facebook/AccessToken;
    //   424: invokevirtual 161	com/facebook/AccessToken:getDataAccessExpirationTime	()Ljava/util/Date;
    //   427: astore 9
    //   429: goto -121 -> 308
    //   432: astore_2
    //   433: aconst_null
    //   434: astore_1
    //   435: aload_0
    //   436: getfield 28	com/facebook/AccessTokenManager$4:this$0	Lcom/facebook/AccessTokenManager;
    //   439: invokestatic 84	com/facebook/AccessTokenManager:access$200	(Lcom/facebook/AccessTokenManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    //   442: iconst_0
    //   443: invokevirtual 90	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   446: aload_0
    //   447: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   450: ifnull +17 -> 467
    //   453: aload_1
    //   454: ifnull +13 -> 467
    //   457: aload_0
    //   458: getfield 32	com/facebook/AccessTokenManager$4:val$callback	Lcom/facebook/AccessToken$AccessTokenRefreshCallback;
    //   461: aload_1
    //   462: invokeinterface 144 2 0
    //   467: ldc 47
    //   469: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   472: aload_2
    //   473: athrow
    //   474: ldc 47
    //   476: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   479: goto -401 -> 78
    //   482: astore_2
    //   483: goto -48 -> 435
    //
    // Exception table:
    //   from	to	target	type
    //   5	33	432	finally
    //   33	62	432	finally
    //   79	138	432	finally
    //   157	175	432	finally
    //   175	207	432	finally
    //   207	223	432	finally
    //   223	264	432	finally
    //   264	308	432	finally
    //   308	331	432	finally
    //   374	382	432	finally
    //   385	393	432	finally
    //   396	405	432	finally
    //   408	417	432	finally
    //   420	429	432	finally
    //   331	338	482	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.AccessTokenManager.4
 * JD-Core Version:    0.6.2
 */