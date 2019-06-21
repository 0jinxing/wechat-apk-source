package com.tencent.youtu.ytcommon.tools;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.CamcorderProfile;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public class CameraSetting
{
  private static final String TAG = "CameraSetting";
  static int mDesiredPreviewHeight = 720;
  static int mDesiredPreviewWidth = 1280;

  private static int chooseFixedPreviewFps(Camera.Parameters paramParameters, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(118083);
    Object localObject = paramParameters.getSupportedPreviewFpsRange().iterator();
    int j;
    while (((Iterator)localObject).hasNext())
    {
      int[] arrayOfInt = (int[])((Iterator)localObject).next();
      YTLogger.d("CameraSetting", "entry: " + arrayOfInt[0] + " - " + arrayOfInt[1]);
      if ((arrayOfInt[0] == arrayOfInt[1]) && (arrayOfInt[0] == paramInt))
      {
        paramParameters.setPreviewFpsRange(arrayOfInt[0], arrayOfInt[1]);
        YTLogger.d("CameraSetting", "use preview fps range: " + arrayOfInt[0] + " " + arrayOfInt[1]);
        j = arrayOfInt[0];
        AppMethodBeat.o(118083);
      }
    }
    while (true)
    {
      return j;
      localObject = new int[2];
      paramParameters.getPreviewFpsRange((int[])localObject);
      label176: int k;
      if (localObject[0] == localObject[1])
      {
        paramInt = localObject[0];
        localObject = paramParameters.get("preview-frame-rate-values");
        j = paramInt;
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          j = paramInt;
          if (!((String)localObject).contains(paramInt / 1000))
          {
            localObject = ((String)localObject).split(",");
            k = localObject.length;
          }
        }
      }
      else
      {
        for (j = i; ; j++)
        {
          if (j >= k)
            break label318;
          i = Integer.parseInt(localObject[j]) * 1000;
          if (paramInt < i)
          {
            paramParameters.setPreviewFrameRate(i / 1000);
            AppMethodBeat.o(118083);
            j = i;
            break;
            j = paramInt;
            if (paramInt > localObject[1])
              j = localObject[1];
            paramInt = j;
            if (j >= localObject[0])
              break label176;
            paramInt = localObject[0];
            break label176;
          }
        }
        label318: j = paramInt;
        if (localObject.length > 0)
        {
          i = Integer.parseInt(localObject[(localObject.length - 1)]) * 1000;
          j = paramInt;
          if (paramInt > i)
            j = i;
        }
      }
      paramParameters.setPreviewFrameRate(j / 1000);
      AppMethodBeat.o(118083);
    }
  }

  public static int getDesiredPreviewHeight()
  {
    return mDesiredPreviewHeight;
  }

  public static int getDesiredPreviewWidth()
  {
    return mDesiredPreviewWidth;
  }

  private static Camera.Size getOptimalPreviewSize(List<Camera.Size> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118082);
    Object localObject1;
    if (paramList == null)
    {
      localObject1 = null;
      AppMethodBeat.o(118082);
      return localObject1;
    }
    Object localObject2 = null;
    double d1 = 1.7976931348623157E+308D;
    int i = Math.max(paramInt1, paramInt2);
    paramInt1 = Math.min(paramInt1, paramInt2);
    double d2 = i / paramInt1;
    YTLogger.d("CameraSetting", "sizes size=" + paramList.size());
    Iterator localIterator = paramList.iterator();
    label81: 
    while (localIterator.hasNext())
    {
      localObject1 = (Camera.Size)localIterator.next();
      if (Math.abs(((Camera.Size)localObject1).width / ((Camera.Size)localObject1).height - d2) <= 0.001D)
      {
        if (Math.abs(((Camera.Size)localObject1).height - paramInt1) >= d1)
          break label254;
        d1 = Math.abs(((Camera.Size)localObject1).height - paramInt1);
        localObject2 = localObject1;
      }
    }
    label254: 
    while (true)
    {
      break label81;
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        YTLogger.d("CameraSetting", "No preview size match the aspect ratio");
        d1 = 1.7976931348623157E+308D;
        localIterator = paramList.iterator();
        while (true)
        {
          localObject1 = localObject2;
          if (!localIterator.hasNext())
            break;
          paramList = (Camera.Size)localIterator.next();
          if (Math.abs(paramList.height - paramInt1) < d1)
          {
            d1 = Math.abs(paramList.height - paramInt1);
            localObject2 = paramList;
          }
        }
      }
      AppMethodBeat.o(118082);
      break;
    }
  }

  public static int getRotateTag(int paramInt)
  {
    AppMethodBeat.i(118078);
    int i = 1;
    if (paramInt == 90)
      paramInt = 7;
    while (true)
    {
      AppMethodBeat.o(118078);
      return paramInt;
      if (paramInt == 270)
      {
        paramInt = 5;
      }
      else
      {
        YTLogger.w("CameraSetting", "获取摄像头转向结果的时候值不为90或者180");
        paramInt = i;
      }
    }
  }

  public static int getVideoRotate(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(118079);
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    Camera.getCameraInfo(paramInt, localCameraInfo);
    switch (((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getRotation())
    {
    default:
      paramInt = 0;
      if (localCameraInfo.facing != 1)
        break;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    for (int i = (360 - (localCameraInfo.orientation + paramInt) % 360) % 360; ; i = (localCameraInfo.orientation - paramInt + 360) % 360)
    {
      YTLogger.d("CameraSetting", "debug camera orientation is " + localCameraInfo.orientation + " ui degrees is " + paramInt);
      AppMethodBeat.o(118079);
      return i;
      paramInt = 0;
      break;
      paramInt = 90;
      break;
      paramInt = 180;
      break;
      paramInt = 270;
      break;
    }
  }

  // ERROR //
  public static int initCamera(Context paramContext, Camera paramCamera, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 224
    //   4: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokevirtual 228	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   11: astore 4
    //   13: aload 4
    //   15: invokevirtual 231	android/hardware/Camera$Parameters:getSupportedFocusModes	()Ljava/util/List;
    //   18: astore 5
    //   20: iconst_0
    //   21: istore 6
    //   23: iload 6
    //   25: aload 5
    //   27: invokeinterface 150 1 0
    //   32: if_icmpge +72 -> 104
    //   35: ldc 8
    //   37: new 56	java/lang/StringBuilder
    //   40: dup
    //   41: ldc 233
    //   43: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   46: iload 6
    //   48: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   51: ldc 235
    //   53: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload 5
    //   58: iload 6
    //   60: invokeinterface 238 2 0
    //   65: checkcast 110	java/lang/String
    //   68: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 241	com/tencent/youtu/ytcommon/tools/YTLogger:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: iinc 6 1
    //   80: goto -57 -> 23
    //   83: astore_0
    //   84: ldc 8
    //   86: ldc 243
    //   88: invokestatic 178	com/tencent/youtu/ytcommon/tools/YTLogger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_0
    //   92: invokestatic 249	com/tencent/youtu/ytcommon/tools/YTException:report	(Ljava/lang/Exception;)V
    //   95: ldc 224
    //   97: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: iconst_1
    //   101: istore_2
    //   102: iload_2
    //   103: ireturn
    //   104: aload 5
    //   106: ifnull +301 -> 407
    //   109: aload 5
    //   111: ldc 251
    //   113: invokeinterface 255 2 0
    //   118: iflt +289 -> 407
    //   121: aload 4
    //   123: ldc 251
    //   125: invokevirtual 258	android/hardware/Camera$Parameters:setFocusMode	(Ljava/lang/String;)V
    //   128: ldc 8
    //   130: ldc_w 260
    //   133: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: aload_1
    //   137: aload 4
    //   139: invokevirtual 264	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   142: aload_1
    //   143: invokevirtual 228	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   146: astore 4
    //   148: aload_0
    //   149: iload_2
    //   150: invokestatic 266	com/tencent/youtu/ytcommon/tools/CameraSetting:getVideoRotate	(Landroid/content/Context;I)I
    //   153: istore 6
    //   155: aload_1
    //   156: iload 6
    //   158: invokevirtual 269	android/hardware/Camera:setDisplayOrientation	(I)V
    //   161: ldc 8
    //   163: ldc_w 271
    //   166: iload 6
    //   168: invokestatic 275	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   171: invokevirtual 278	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   174: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   177: iload_2
    //   178: iconst_4
    //   179: invokestatic 284	android/media/CamcorderProfile:hasProfile	(II)Z
    //   182: ifeq +333 -> 515
    //   185: iload_2
    //   186: iconst_4
    //   187: invokestatic 287	android/media/CamcorderProfile:get	(II)Landroid/media/CamcorderProfile;
    //   190: astore_0
    //   191: ldc 8
    //   193: new 56	java/lang/StringBuilder
    //   196: dup
    //   197: ldc_w 289
    //   200: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   203: aload_0
    //   204: getfield 292	android/media/CamcorderProfile:videoFrameWidth	I
    //   207: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   210: ldc_w 294
    //   213: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: aload_0
    //   217: getfield 297	android/media/CamcorderProfile:videoFrameHeight	I
    //   220: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   223: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   229: aload 4
    //   231: aload_0
    //   232: invokestatic 301	com/tencent/youtu/ytcommon/tools/CameraSetting:setVideoSize	(Landroid/hardware/Camera$Parameters;Landroid/media/CamcorderProfile;)V
    //   235: aload 4
    //   237: getstatic 15	com/tencent/youtu/ytcommon/tools/CameraSetting:mDesiredPreviewWidth	I
    //   240: getstatic 17	com/tencent/youtu/ytcommon/tools/CameraSetting:mDesiredPreviewHeight	I
    //   243: invokevirtual 304	android/hardware/Camera$Parameters:setPreviewSize	(II)V
    //   246: aload 4
    //   248: bipush 17
    //   250: invokevirtual 307	android/hardware/Camera$Parameters:setPreviewFormat	(I)V
    //   253: aload_1
    //   254: aload 4
    //   256: invokevirtual 264	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   259: aload_1
    //   260: invokevirtual 228	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   263: astore_0
    //   264: ldc 8
    //   266: ldc_w 309
    //   269: aload_0
    //   270: sipush 30000
    //   273: invokestatic 311	com/tencent/youtu/ytcommon/tools/CameraSetting:chooseFixedPreviewFps	(Landroid/hardware/Camera$Parameters;I)I
    //   276: invokestatic 275	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   279: invokevirtual 278	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   282: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   285: aload_1
    //   286: aload_0
    //   287: invokevirtual 264	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   290: aload_1
    //   291: invokevirtual 228	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   294: astore_1
    //   295: iconst_2
    //   296: newarray int
    //   298: astore_0
    //   299: aload_1
    //   300: aload_0
    //   301: invokevirtual 95	android/hardware/Camera$Parameters:getPreviewFpsRange	([I)V
    //   304: aload_1
    //   305: invokevirtual 314	android/hardware/Camera$Parameters:getPreviewFrameRate	()I
    //   308: istore_2
    //   309: ldc 8
    //   311: new 56	java/lang/StringBuilder
    //   314: dup
    //   315: ldc_w 316
    //   318: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   321: aload_0
    //   322: iconst_0
    //   323: iaload
    //   324: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   327: ldc_w 318
    //   330: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: aload_0
    //   334: iconst_1
    //   335: iaload
    //   336: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   339: ldc_w 320
    //   342: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: iload_2
    //   346: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   349: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   352: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   355: aload_1
    //   356: invokevirtual 324	android/hardware/Camera$Parameters:getPreviewSize	()Landroid/hardware/Camera$Size;
    //   359: astore_0
    //   360: ldc 8
    //   362: new 56	java/lang/StringBuilder
    //   365: dup
    //   366: ldc_w 326
    //   369: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   372: aload_0
    //   373: getfield 155	android/hardware/Camera$Size:width	I
    //   376: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   379: ldc 88
    //   381: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: aload_0
    //   385: getfield 158	android/hardware/Camera$Size:height	I
    //   388: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   391: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   394: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   397: ldc 224
    //   399: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   402: iload_3
    //   403: istore_2
    //   404: goto -302 -> 102
    //   407: aload 5
    //   409: ifnull +35 -> 444
    //   412: aload 5
    //   414: ldc_w 328
    //   417: invokeinterface 255 2 0
    //   422: iflt +22 -> 444
    //   425: aload 4
    //   427: ldc_w 328
    //   430: invokevirtual 258	android/hardware/Camera$Parameters:setFocusMode	(Ljava/lang/String;)V
    //   433: ldc 8
    //   435: ldc_w 330
    //   438: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   441: goto -305 -> 136
    //   444: ldc 8
    //   446: ldc_w 332
    //   449: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   452: goto -316 -> 136
    //   455: astore 4
    //   457: new 56	java/lang/StringBuilder
    //   460: astore 5
    //   462: aload 5
    //   464: ldc_w 334
    //   467: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   470: ldc 8
    //   472: aload 5
    //   474: aload 4
    //   476: invokevirtual 337	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   479: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   485: invokestatic 178	com/tencent/youtu/ytcommon/tools/YTLogger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   488: aload 4
    //   490: invokestatic 249	com/tencent/youtu/ytcommon/tools/YTException:report	(Ljava/lang/Exception;)V
    //   493: aload_1
    //   494: invokevirtual 228	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   497: astore 4
    //   499: goto -351 -> 148
    //   502: astore_0
    //   503: aload_1
    //   504: invokevirtual 228	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   507: pop
    //   508: ldc 224
    //   510: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   513: aload_0
    //   514: athrow
    //   515: iload_2
    //   516: iconst_5
    //   517: invokestatic 284	android/media/CamcorderProfile:hasProfile	(II)Z
    //   520: ifeq +50 -> 570
    //   523: iload_2
    //   524: iconst_5
    //   525: invokestatic 287	android/media/CamcorderProfile:get	(II)Landroid/media/CamcorderProfile;
    //   528: astore_0
    //   529: ldc 8
    //   531: new 56	java/lang/StringBuilder
    //   534: dup
    //   535: ldc_w 339
    //   538: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   541: aload_0
    //   542: getfield 292	android/media/CamcorderProfile:videoFrameWidth	I
    //   545: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   548: ldc_w 294
    //   551: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: aload_0
    //   555: getfield 297	android/media/CamcorderProfile:videoFrameHeight	I
    //   558: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   561: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   564: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   567: goto -338 -> 229
    //   570: iload_2
    //   571: iconst_1
    //   572: invokestatic 287	android/media/CamcorderProfile:get	(II)Landroid/media/CamcorderProfile;
    //   575: astore_0
    //   576: ldc 8
    //   578: new 56	java/lang/StringBuilder
    //   581: dup
    //   582: ldc_w 341
    //   585: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   588: aload_0
    //   589: getfield 292	android/media/CamcorderProfile:videoFrameWidth	I
    //   592: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   595: ldc_w 294
    //   598: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: aload_0
    //   602: getfield 297	android/media/CamcorderProfile:videoFrameHeight	I
    //   605: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   608: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   611: invokestatic 80	com/tencent/youtu/ytcommon/tools/YTLogger:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   614: goto -385 -> 229
    //   617: astore_0
    //   618: ldc 8
    //   620: new 56	java/lang/StringBuilder
    //   623: dup
    //   624: ldc_w 334
    //   627: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   630: aload_0
    //   631: invokevirtual 337	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   634: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   640: invokestatic 178	com/tencent/youtu/ytcommon/tools/YTLogger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   643: aload_0
    //   644: invokestatic 249	com/tencent/youtu/ytcommon/tools/YTException:report	(Ljava/lang/Exception;)V
    //   647: goto -388 -> 259
    //   650: astore_0
    //   651: ldc 8
    //   653: new 56	java/lang/StringBuilder
    //   656: dup
    //   657: ldc_w 343
    //   660: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   663: aload_0
    //   664: invokevirtual 337	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   667: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   673: invokestatic 178	com/tencent/youtu/ytcommon/tools/YTLogger:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   676: aload_0
    //   677: invokestatic 249	com/tencent/youtu/ytcommon/tools/YTException:report	(Ljava/lang/Exception;)V
    //   680: goto -390 -> 290
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	83	java/lang/Exception
    //   136	142	455	java/lang/Exception
    //   136	142	502	finally
    //   457	493	502	finally
    //   253	259	617	java/lang/Exception
    //   285	290	650	java/lang/Exception
  }

  public static void setVideoSize(Camera.Parameters paramParameters, CamcorderProfile paramCamcorderProfile)
  {
    AppMethodBeat.i(118081);
    Object localObject = paramParameters.getSupportedPreviewSizes();
    if (paramParameters.getSupportedVideoSizes() == null)
    {
      YTLogger.d("CameraSetting", "video size from profile is : " + paramCamcorderProfile.videoFrameWidth + " " + paramCamcorderProfile.videoFrameHeight);
      if (getOptimalPreviewSize((List)localObject, paramCamcorderProfile.videoFrameWidth, paramCamcorderProfile.videoFrameHeight) == null)
      {
        YTLogger.d("CameraSetting", "do not find proper preview size, use default");
        paramCamcorderProfile.videoFrameWidth = 640;
        paramCamcorderProfile.videoFrameHeight = 480;
      }
    }
    paramParameters = paramParameters.getSupportedVideoSizes();
    if (paramParameters != null)
    {
      int i = 0;
      int k;
      for (int j = 0; i < paramParameters.size(); j = k)
      {
        localObject = (Camera.Size)paramParameters.get(i);
        k = j;
        if (((Camera.Size)localObject).width == paramCamcorderProfile.videoFrameWidth)
        {
          k = j;
          if (((Camera.Size)localObject).height == paramCamcorderProfile.videoFrameHeight)
            k = 1;
        }
        i++;
      }
      if (j == 0)
      {
        paramCamcorderProfile.videoFrameWidth = 640;
        paramCamcorderProfile.videoFrameHeight = 480;
      }
    }
    YTLogger.d("CameraSetting", "select video size camcorderProfile:" + paramCamcorderProfile.videoFrameWidth + "x" + paramCamcorderProfile.videoFrameHeight);
    AppMethodBeat.o(118081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.CameraSetting
 * JD-Core Version:    0.6.2
 */