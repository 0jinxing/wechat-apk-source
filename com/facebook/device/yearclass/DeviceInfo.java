package com.facebook.device.yearclass;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public class DeviceInfo
{
  private static final FileFilter CPU_FILTER;
  public static final int DEVICEINFO_UNKNOWN = -1;

  static
  {
    AppMethodBeat.i(114634);
    CPU_FILTER = new FileFilter()
    {
      public final boolean accept(File paramAnonymousFile)
      {
        AppMethodBeat.i(114625);
        paramAnonymousFile = paramAnonymousFile.getName();
        int i;
        boolean bool;
        if (paramAnonymousFile.startsWith("cpu"))
        {
          i = 3;
          if (i < paramAnonymousFile.length())
            if (!Character.isDigit(paramAnonymousFile.charAt(i)))
            {
              AppMethodBeat.o(114625);
              bool = false;
            }
        }
        while (true)
        {
          return bool;
          i++;
          break;
          bool = true;
          AppMethodBeat.o(114625);
          continue;
          AppMethodBeat.o(114625);
          bool = false;
        }
      }
    };
    AppMethodBeat.o(114634);
  }

  private static int extractValue(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(114633);
    if ((paramInt < paramArrayOfByte.length) && (paramArrayOfByte[paramInt] != 10))
      if (Character.isDigit(paramArrayOfByte[paramInt]))
      {
        for (int i = paramInt + 1; (i < paramArrayOfByte.length) && (Character.isDigit(paramArrayOfByte[i])); i++);
        paramInt = bo.ank(new String(paramArrayOfByte, 0, paramInt, i - paramInt));
        AppMethodBeat.o(114633);
      }
    while (true)
    {
      return paramInt;
      paramInt++;
      break;
      paramInt = -1;
      AppMethodBeat.o(114633);
    }
  }

  // ERROR //
  public static int getCPUMaxFreqKHz()
  {
    // Byte code:
    //   0: ldc 57
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_0
    //   6: istore_0
    //   7: iconst_m1
    //   8: istore_1
    //   9: iload_0
    //   10: invokestatic 60	com/facebook/device/yearclass/DeviceInfo:getNumberOfCPUCores	()I
    //   13: if_icmpge +193 -> 206
    //   16: new 62	java/lang/StringBuilder
    //   19: astore_2
    //   20: aload_2
    //   21: ldc 64
    //   23: invokespecial 67	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_2
    //   27: iload_0
    //   28: invokevirtual 71	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   31: ldc 73
    //   33: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: astore_2
    //   40: new 82	java/io/File
    //   43: astore_3
    //   44: aload_3
    //   45: aload_2
    //   46: invokespecial 83	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: iload_1
    //   50: istore 4
    //   52: aload_3
    //   53: invokevirtual 87	java/io/File:exists	()Z
    //   56: ifeq +106 -> 162
    //   59: iload_1
    //   60: istore 4
    //   62: aload_3
    //   63: invokevirtual 90	java/io/File:canRead	()Z
    //   66: ifeq +96 -> 162
    //   69: sipush 128
    //   72: newarray byte
    //   74: astore 5
    //   76: new 92	java/io/FileInputStream
    //   79: astore_2
    //   80: aload_2
    //   81: aload_3
    //   82: invokespecial 95	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   85: aload_2
    //   86: aload 5
    //   88: invokevirtual 99	java/io/FileInputStream:read	([B)I
    //   91: pop
    //   92: iconst_0
    //   93: istore 4
    //   95: aload 5
    //   97: iload 4
    //   99: baload
    //   100: invokestatic 39	java/lang/Character:isDigit	(I)Z
    //   103: ifeq +17 -> 120
    //   106: iload 4
    //   108: sipush 128
    //   111: if_icmpge +9 -> 120
    //   114: iinc 4 1
    //   117: goto -22 -> 95
    //   120: new 41	java/lang/String
    //   123: astore_3
    //   124: aload_3
    //   125: aload 5
    //   127: iconst_0
    //   128: iload 4
    //   130: invokespecial 102	java/lang/String:<init>	([BII)V
    //   133: aload_3
    //   134: invokestatic 50	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   137: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   140: astore_3
    //   141: iload_1
    //   142: istore 4
    //   144: aload_3
    //   145: invokevirtual 111	java/lang/Integer:intValue	()I
    //   148: iload_1
    //   149: if_icmple +9 -> 158
    //   152: aload_3
    //   153: invokevirtual 111	java/lang/Integer:intValue	()I
    //   156: istore 4
    //   158: aload_2
    //   159: invokevirtual 114	java/io/FileInputStream:close	()V
    //   162: iinc 0 1
    //   165: iload 4
    //   167: istore_1
    //   168: goto -159 -> 9
    //   171: astore_3
    //   172: aload_2
    //   173: invokevirtual 114	java/io/FileInputStream:close	()V
    //   176: iload_1
    //   177: istore 4
    //   179: goto -17 -> 162
    //   182: astore_2
    //   183: iconst_m1
    //   184: istore 4
    //   186: ldc 57
    //   188: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: iload 4
    //   193: ireturn
    //   194: astore_3
    //   195: aload_2
    //   196: invokevirtual 114	java/io/FileInputStream:close	()V
    //   199: ldc 57
    //   201: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: aload_3
    //   205: athrow
    //   206: iload_1
    //   207: istore 4
    //   209: iload_1
    //   210: iconst_m1
    //   211: if_icmpne -25 -> 186
    //   214: new 92	java/io/FileInputStream
    //   217: astore_3
    //   218: aload_3
    //   219: ldc 116
    //   221: invokespecial 117	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   224: ldc 119
    //   226: aload_3
    //   227: invokestatic 123	com/facebook/device/yearclass/DeviceInfo:parseFileForValue	(Ljava/lang/String;Ljava/io/FileInputStream;)I
    //   230: istore 4
    //   232: iload 4
    //   234: sipush 1000
    //   237: imul
    //   238: istore_0
    //   239: iload_1
    //   240: istore 4
    //   242: iload_0
    //   243: iload_1
    //   244: if_icmple +6 -> 250
    //   247: iload_0
    //   248: istore 4
    //   250: aload_3
    //   251: invokevirtual 114	java/io/FileInputStream:close	()V
    //   254: goto -68 -> 186
    //   257: astore_2
    //   258: aload_3
    //   259: invokevirtual 114	java/io/FileInputStream:close	()V
    //   262: ldc 57
    //   264: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   267: aload_2
    //   268: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   85	92	171	java/lang/NumberFormatException
    //   95	106	171	java/lang/NumberFormatException
    //   120	141	171	java/lang/NumberFormatException
    //   144	158	171	java/lang/NumberFormatException
    //   9	49	182	java/io/IOException
    //   52	59	182	java/io/IOException
    //   62	85	182	java/io/IOException
    //   158	162	182	java/io/IOException
    //   172	176	182	java/io/IOException
    //   195	206	182	java/io/IOException
    //   214	224	182	java/io/IOException
    //   250	254	182	java/io/IOException
    //   258	269	182	java/io/IOException
    //   85	92	194	finally
    //   95	106	194	finally
    //   120	141	194	finally
    //   144	158	194	finally
    //   224	232	257	finally
  }

  private static int getCoresFromCPUFileList()
  {
    AppMethodBeat.i(114629);
    int i = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
    AppMethodBeat.o(114629);
    return i;
  }

  // ERROR //
  private static int getCoresFromFileInfo(String paramString)
  {
    // Byte code:
    //   0: ldc 133
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: new 92	java/io/FileInputStream
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 117	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   16: new 135	java/io/BufferedReader
    //   19: astore_0
    //   20: new 137	java/io/InputStreamReader
    //   23: astore_1
    //   24: aload_1
    //   25: aload_2
    //   26: invokespecial 140	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   29: aload_0
    //   30: aload_1
    //   31: invokespecial 143	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   34: aload_0
    //   35: invokevirtual 146	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   38: astore_1
    //   39: aload_0
    //   40: invokevirtual 147	java/io/BufferedReader:close	()V
    //   43: aload_1
    //   44: invokestatic 150	com/facebook/device/yearclass/DeviceInfo:getCoresFromFileString	(Ljava/lang/String;)I
    //   47: istore_3
    //   48: aload_2
    //   49: invokevirtual 153	java/io/InputStream:close	()V
    //   52: ldc 133
    //   54: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: iload_3
    //   58: ireturn
    //   59: astore_0
    //   60: aload_1
    //   61: astore_0
    //   62: aload_0
    //   63: ifnull +7 -> 70
    //   66: aload_0
    //   67: invokevirtual 153	java/io/InputStream:close	()V
    //   70: iconst_m1
    //   71: istore_3
    //   72: ldc 133
    //   74: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: goto -20 -> 57
    //   80: astore_0
    //   81: aconst_null
    //   82: astore_2
    //   83: aload_2
    //   84: ifnull +7 -> 91
    //   87: aload_2
    //   88: invokevirtual 153	java/io/InputStream:close	()V
    //   91: ldc 133
    //   93: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_0
    //   97: athrow
    //   98: astore_0
    //   99: goto -47 -> 52
    //   102: astore_0
    //   103: goto -33 -> 70
    //   106: astore_2
    //   107: goto -16 -> 91
    //   110: astore_0
    //   111: goto -28 -> 83
    //   114: astore_0
    //   115: aload_2
    //   116: astore_0
    //   117: goto -55 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   7	16	59	java/io/IOException
    //   7	16	80	finally
    //   48	52	98	java/io/IOException
    //   66	70	102	java/io/IOException
    //   87	91	106	java/io/IOException
    //   16	48	110	finally
    //   16	48	114	java/io/IOException
  }

  static int getCoresFromFileString(String paramString)
  {
    AppMethodBeat.i(114628);
    int i;
    if ((paramString == null) || (!paramString.matches("0-[\\d]+$")))
    {
      i = -1;
      AppMethodBeat.o(114628);
    }
    while (true)
    {
      return i;
      i = Integer.valueOf(paramString.substring(2)).intValue() + 1;
      AppMethodBeat.o(114628);
    }
  }

  public static int getNumberOfCPUCores()
  {
    AppMethodBeat.i(114626);
    int i;
    if (Build.VERSION.SDK_INT <= 10)
    {
      i = 1;
      AppMethodBeat.o(114626);
    }
    while (true)
    {
      return i;
      try
      {
        i = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
        int j = i;
        if (i == -1)
          j = getCoresFromFileInfo("/sys/devices/system/cpu/present");
        i = j;
        if (j == -1)
          i = getCoresFromCPUFileList();
        AppMethodBeat.o(114626);
      }
      catch (SecurityException localSecurityException)
      {
        while (true)
          i = -1;
      }
      catch (NullPointerException localNullPointerException)
      {
        while (true)
          i = -1;
      }
    }
  }

  // ERROR //
  @android.annotation.TargetApi(16)
  public static long getTotalMemory(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc 191
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 177	android/os/Build$VERSION:SDK_INT	I
    //   8: bipush 16
    //   10: if_icmplt +36 -> 46
    //   13: new 193	android/app/ActivityManager$MemoryInfo
    //   16: dup
    //   17: invokespecial 194	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   20: astore_1
    //   21: aload_0
    //   22: ldc 196
    //   24: invokevirtual 202	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   27: checkcast 204	android/app/ActivityManager
    //   30: aload_1
    //   31: invokevirtual 208	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   34: aload_1
    //   35: getfield 212	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   38: lstore_2
    //   39: ldc 191
    //   41: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: lload_2
    //   45: lreturn
    //   46: new 92	java/io/FileInputStream
    //   49: astore_0
    //   50: aload_0
    //   51: ldc 214
    //   53: invokespecial 117	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   56: ldc 216
    //   58: aload_0
    //   59: invokestatic 123	com/facebook/device/yearclass/DeviceInfo:parseFileForValue	(Ljava/lang/String;Ljava/io/FileInputStream;)I
    //   62: istore 4
    //   64: iload 4
    //   66: i2l
    //   67: ldc2_w 217
    //   70: lmul
    //   71: lstore_2
    //   72: aload_0
    //   73: invokevirtual 114	java/io/FileInputStream:close	()V
    //   76: ldc 191
    //   78: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: goto -37 -> 44
    //   84: astore_1
    //   85: aload_0
    //   86: invokevirtual 114	java/io/FileInputStream:close	()V
    //   89: ldc 191
    //   91: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_1
    //   95: athrow
    //   96: astore_0
    //   97: ldc2_w 219
    //   100: lstore_2
    //   101: goto -25 -> 76
    //   104: astore_0
    //   105: goto -29 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   56	64	84	finally
    //   46	56	96	java/io/IOException
    //   85	96	96	java/io/IOException
    //   72	76	104	java/io/IOException
  }

  private static int parseFileForValue(String paramString, FileInputStream paramFileInputStream)
  {
    AppMethodBeat.i(114632);
    byte[] arrayOfByte = new byte[1024];
    try
    {
      int i = paramFileInputStream.read(arrayOfByte);
      int k;
      for (int j = 0; j < i; j = k + 1)
        if (arrayOfByte[j] != 10)
        {
          k = j;
          if (j != 0);
        }
        else
        {
          m = j;
          if (arrayOfByte[j] == 10)
            m = j + 1;
          for (j = m; ; j++)
          {
            k = m;
            if (j >= i)
              break;
            int n = j - m;
            k = m;
            if (arrayOfByte[j] != paramString.charAt(n))
              break;
            if (n == paramString.length() - 1)
            {
              m = extractValue(arrayOfByte, j);
              AppMethodBeat.o(114632);
              return m;
            }
          }
        }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        int m = -1;
        AppMethodBeat.o(114632);
      }
    }
    catch (IOException paramString)
    {
      label144: break label144;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.device.yearclass.DeviceInfo
 * JD-Core Version:    0.6.2
 */