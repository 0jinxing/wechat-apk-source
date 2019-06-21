package com.tencent.ttpic.baseutils;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public class ApiHelper
{
  public static final boolean CAN_START_PREVIEW_IN_JPEG_CALLBACK;
  public static final boolean HAS_AUTO_FOCUS_MOVE_CALLBACK;
  public static final boolean HAS_CAMERA_FOCUS_AREA;
  public static final boolean HAS_CAMERA_HDR;
  public static final boolean HAS_CAMERA_HDR_PLUS;
  public static final boolean HAS_CAMERA_METERING_AREA;
  public static final boolean HAS_DISPLAY_LISTENER;
  public static final boolean HAS_FACE_DETECTION;
  public static final boolean HAS_GET_CAMERA_DISABLED;
  public static final boolean HAS_MEDIA_COLUMNS_WIDTH_AND_HEIGHT;

  static
  {
    boolean bool1 = false;
    AppMethodBeat.i(49581);
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 16)
      bool2 = true;
    while (true)
    {
      HAS_MEDIA_COLUMNS_WIDTH_AND_HEIGHT = bool2;
      if (Build.VERSION.SDK_INT >= 16)
      {
        bool2 = true;
        label31: HAS_AUTO_FOCUS_MOVE_CALLBACK = bool2;
        if (Build.VERSION.SDK_INT < 14)
          break label238;
        bool2 = true;
        label45: HAS_CAMERA_FOCUS_AREA = bool2;
        if (Build.VERSION.SDK_INT < 14)
          break label243;
        bool2 = true;
        label59: HAS_CAMERA_METERING_AREA = bool2;
        if (Build.VERSION.SDK_INT < 17)
          break label248;
        bool2 = true;
        label73: HAS_CAMERA_HDR = bool2;
        if (Build.VERSION.SDK_INT < 19)
          break label253;
        bool2 = true;
        label87: HAS_CAMERA_HDR_PLUS = bool2;
        if (Build.VERSION.SDK_INT < 17)
          break label258;
        bool2 = true;
        label101: HAS_DISPLAY_LISTENER = bool2;
        if (Build.VERSION.SDK_INT < 14)
          break label263;
        bool2 = true;
        label115: CAN_START_PREVIEW_IN_JPEG_CALLBACK = bool2;
      }
      try
      {
        if ((hasMethod(Camera.class, "setFaceDetectionListener", new Class[] { Class.forName("android.hardware.Camera$FaceDetectionListener") })) && (hasMethod(Camera.class, "startFaceDetection", new Class[0])) && (hasMethod(Camera.class, "stopFaceDetection", new Class[0])))
        {
          bool2 = hasMethod(Camera.Parameters.class, "getMaxNumDetectedFaces", new Class[0]);
          if (!bool2);
        }
        for (bool2 = true; ; bool2 = false)
        {
          HAS_FACE_DETECTION = bool2;
          bool2 = bool1;
          if (Build.VERSION.SDK_INT >= 14)
            bool2 = hasMethod(DevicePolicyManager.class, "getCameraDisabled", new Class[] { ComponentName.class });
          HAS_GET_CAMERA_DISABLED = bool2;
          AppMethodBeat.o(49581);
          return;
          bool2 = false;
          break;
          bool2 = false;
          break label31;
          label238: bool2 = false;
          break label45;
          label243: bool2 = false;
          break label59;
          label248: bool2 = false;
          break label73;
          label253: bool2 = false;
          break label87;
          label258: bool2 = false;
          break label101;
          label263: bool2 = false;
          break label115;
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
          bool2 = false;
      }
    }
  }

  public static int getIntFieldIfExists(Class<?> paramClass1, String paramString, Class<?> paramClass2, int paramInt)
  {
    AppMethodBeat.i(49577);
    try
    {
      int i = paramClass1.getDeclaredField(paramString).getInt(paramClass2);
      paramInt = i;
      AppMethodBeat.o(49577);
      return paramInt;
    }
    catch (Exception paramClass1)
    {
      while (true)
        AppMethodBeat.o(49577);
    }
  }

  private static boolean hasField(Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(49578);
    try
    {
      paramClass.getDeclaredField(paramString);
      bool = true;
      AppMethodBeat.o(49578);
      return bool;
    }
    catch (NoSuchFieldException paramClass)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(49578);
      }
    }
  }

  public static boolean hasGingerbread()
  {
    if (Build.VERSION.SDK_INT >= 9);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasHoneycomb()
  {
    if (Build.VERSION.SDK_INT >= 11);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasHoneycombMR1()
  {
    if (Build.VERSION.SDK_INT >= 12);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasIceCreamSandwich()
  {
    if (Build.VERSION.SDK_INT >= 14);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasJellyBean()
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasJellyBeanMR1()
  {
    if (Build.VERSION.SDK_INT >= 17);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasJellyBeanMR2()
  {
    if (Build.VERSION.SDK_INT >= 18);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasKitkat()
  {
    if (Build.VERSION.SDK_INT >= 19);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean hasLollipop()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean hasMethod(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(49580);
    try
    {
      paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
      bool = true;
      AppMethodBeat.o(49580);
      return bool;
    }
    catch (NoSuchMethodException paramClass)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(49580);
      }
    }
  }

  private static boolean hasMethod(String paramString1, String paramString2, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(49579);
    try
    {
      Class.forName(paramString1).getDeclaredMethod(paramString2, paramArrayOfClass);
      bool = true;
      AppMethodBeat.o(49579);
      return bool;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(49579);
      }
    }
  }

  public static boolean hasNougat()
  {
    if (Build.VERSION.SDK_INT >= 24);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isAndroid_8_1()
  {
    if (Build.VERSION.SDK_INT == 27);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isExactlyKitkat()
  {
    if (Build.VERSION.SDK_INT == 19);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.ApiHelper
 * JD-Core Version:    0.6.2
 */