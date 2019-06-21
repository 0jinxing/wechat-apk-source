package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.view.View.OnClickListener;

class TMOpenSDKToMsdkManager$6
  implements View.OnClickListener
{
  TMOpenSDKToMsdkManager$6(TMOpenSDKToMsdkManager paramTMOpenSDKToMsdkManager)
  {
  }

  // ERROR //
  public void onClick(android.view.View paramView)
  {
    // Byte code:
    //   0: ldc 23
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   9: getfield 33	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:mContext	Landroid/content/Context;
    //   12: ifnonnull +9 -> 21
    //   15: ldc 23
    //   17: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: return
    //   21: aload_1
    //   22: invokevirtual 42	android/view/View:getTag	()Ljava/lang/Object;
    //   25: checkcast 44	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/data/ActionButton
    //   28: astore_1
    //   29: aload_0
    //   30: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   33: getfield 48	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:mOpenSDK	Lcom/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK;
    //   36: aload_0
    //   37: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   40: getfield 52	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:mSupportVersionCode	I
    //   43: invokevirtual 58	com/tencent/tmassistantsdk/openSDK/TMQQDownloaderOpenSDK:checkQQDownloaderInstalled	(I)I
    //   46: istore_2
    //   47: iload_2
    //   48: tableswitch	default:+28 -> 76, 0:+36->84, 1:+123->171, 2:+97->145
    //   77: fload 184
    //   79: nop
    //   80: fload_2
    //   81: goto -61 -> 20
    //   84: aload_0
    //   85: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   88: aload_1
    //   89: getfield 62	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/data/ActionButton:jumpUrl	Ljava/lang/String;
    //   92: invokevirtual 66	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:startToQQDownloaderAuthorized	(Ljava/lang/String;)V
    //   95: ldc 23
    //   97: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: goto -80 -> 20
    //   103: astore_1
    //   104: ldc 68
    //   106: aload_1
    //   107: ldc 70
    //   109: iconst_0
    //   110: anewarray 4	java/lang/Object
    //   113: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: ldc 23
    //   118: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: goto -101 -> 20
    //   124: astore_1
    //   125: ldc 68
    //   127: aload_1
    //   128: ldc 70
    //   130: iconst_0
    //   131: anewarray 4	java/lang/Object
    //   134: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: ldc 23
    //   139: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: goto -122 -> 20
    //   145: aload_0
    //   146: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   149: aload_0
    //   150: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   153: getfield 79	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:mDownloadUrl	Ljava/lang/String;
    //   156: aload_1
    //   157: getfield 62	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/data/ActionButton:jumpUrl	Ljava/lang/String;
    //   160: invokevirtual 83	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:startDownloadTask	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: ldc 23
    //   165: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: goto -148 -> 20
    //   171: aload_0
    //   172: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   175: aload_0
    //   176: getfield 14	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6:this$0	Lcom/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager;
    //   179: getfield 79	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:mDownloadUrl	Ljava/lang/String;
    //   182: aload_1
    //   183: getfield 62	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/data/ActionButton:jumpUrl	Ljava/lang/String;
    //   186: invokevirtual 83	com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager:startDownloadTask	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: goto -113 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   29	47	103	java/lang/Exception
    //   95	100	103	java/lang/Exception
    //   125	142	103	java/lang/Exception
    //   145	168	103	java/lang/Exception
    //   171	189	103	java/lang/Exception
    //   84	95	124	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.6
 * JD-Core Version:    0.6.2
 */