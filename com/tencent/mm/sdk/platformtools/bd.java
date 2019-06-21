package com.tencent.mm.sdk.platformtools;

import android.os.Environment;
import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class bd
{
  static String[] xBo = { "sysfs", "rootfs", "binfmt_misc", "anon_inodefs", "bdev", "proc", "cgroup", "tmpfs", "debugfs", "sockfs", "pipefs", "rpc_pipefs", "devpts", "ramfs", "fuseblk", "fusectl", "selinuxfs" };
  static String[] xBp = { "vfat", "exfat", "fuse", "sdcardfs" };
  static String[] xBq = { "/mnt/secure", "/mnt/asec", "/mnt/obb", "/dev/mapper", "/data/" };
  static String[] xBr = { "/dev/block/vold" };

  private static void a(a parama)
  {
    AppMethodBeat.i(52254);
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(parama.xBt);
      parama.xBy = localStatFs.getBlockSize();
      parama.xBx = localStatFs.getAvailableBlocks();
      parama.xBv = localStatFs.getBlockCount();
      parama.xBw = localStatFs.getFreeBlocks();
      AppMethodBeat.o(52254);
      return;
    }
    catch (IllegalArgumentException parama)
    {
      while (true)
      {
        ab.e("MicroMsg.SdcardUtil", "statFsForStatMountParse", new Object[] { parama });
        AppMethodBeat.o(52254);
      }
    }
  }

  public static String amQ(String paramString)
  {
    AppMethodBeat.i(52262);
    Object localObject1 = "";
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(52262);
    while (true)
    {
      return localObject1;
      Object localObject2 = dpl();
      Object localObject3 = ((ArrayList)localObject2).iterator();
      do
      {
        localObject4 = localObject1;
        if (!((Iterator)localObject3).hasNext())
          break;
        localObject4 = (a)((Iterator)localObject3).next();
      }
      while (!paramString.equals(((a)localObject4).xBt));
      Object localObject4 = ((a)localObject4).xBu;
      ab.i("MicroMsg.SdcardUtil", "getFileSystem[%s] is [%s]", new Object[] { paramString, localObject4 });
      localObject1 = localObject4;
      if (bo.isNullOrNil((String)localObject4))
      {
        localObject1 = localObject4;
        if (paramString.contains("emulated"))
        {
          localObject3 = paramString.substring(paramString.lastIndexOf('/') + 1);
          int i = bo.getInt((String)localObject3, -1);
          ab.i("MicroMsg.SdcardUtil", "getFileSystem multiuser uid[%s][%d]", new Object[] { localObject3, Integer.valueOf(i) });
          localObject1 = localObject4;
          if (i != -1)
          {
            localObject3 = paramString.substring(0, paramString.length() - ((String)localObject3).length() - 1);
            localObject1 = localObject4;
            if (!bo.isNullOrNil((String)localObject3))
            {
              localObject2 = ((ArrayList)localObject2).iterator();
              do
              {
                localObject1 = localObject4;
                if (!((Iterator)localObject2).hasNext())
                  break;
                localObject1 = (a)((Iterator)localObject2).next();
              }
              while (!((String)localObject3).equals(((a)localObject1).xBt));
              localObject1 = ((a)localObject1).xBu;
              ab.i("MicroMsg.SdcardUtil", "getFileSystem[%s] fix[%s] is [%s]", new Object[] { paramString, localObject3, localObject1 });
            }
          }
        }
      }
      AppMethodBeat.o(52262);
    }
  }

  // ERROR //
  private static boolean b(a parama)
  {
    // Byte code:
    //   0: ldc 219
    //   2: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 221	java/io/File
    //   8: dup
    //   9: aload_0
    //   10: getfield 95	com/tencent/mm/sdk/platformtools/bd$a:xBt	Ljava/lang/String;
    //   13: ldc 223
    //   15: invokespecial 226	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: astore_1
    //   19: aload_1
    //   20: invokevirtual 229	java/io/File:createNewFile	()Z
    //   23: pop
    //   24: new 231	java/io/FileOutputStream
    //   27: astore_2
    //   28: aload_2
    //   29: aload_1
    //   30: invokespecial 234	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   33: aload_2
    //   34: astore_3
    //   35: aload_2
    //   36: ldc 236
    //   38: invokevirtual 240	java/lang/String:getBytes	()[B
    //   41: invokevirtual 244	java/io/FileOutputStream:write	([B)V
    //   44: aload_2
    //   45: astore_3
    //   46: aload_2
    //   47: invokevirtual 247	java/io/FileOutputStream:flush	()V
    //   50: aload_2
    //   51: astore_3
    //   52: aload_2
    //   53: invokevirtual 250	java/io/FileOutputStream:close	()V
    //   56: aload_2
    //   57: astore_3
    //   58: aload_1
    //   59: invokevirtual 253	java/io/File:delete	()Z
    //   62: istore 4
    //   64: aload_2
    //   65: invokevirtual 250	java/io/FileOutputStream:close	()V
    //   68: aload_0
    //   69: iload 4
    //   71: putfield 257	com/tencent/mm/sdk/platformtools/bd$a:cbI	Z
    //   74: ldc 219
    //   76: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: iload 4
    //   81: ireturn
    //   82: astore_3
    //   83: ldc 130
    //   85: aload_3
    //   86: ldc 143
    //   88: iconst_0
    //   89: anewarray 4	java/lang/Object
    //   92: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: goto -27 -> 68
    //   98: astore_1
    //   99: aconst_null
    //   100: astore_2
    //   101: aload_2
    //   102: astore_3
    //   103: new 263	java/lang/StringBuilder
    //   106: astore 5
    //   108: aload_2
    //   109: astore_3
    //   110: aload 5
    //   112: ldc_w 265
    //   115: invokespecial 266	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload_2
    //   119: astore_3
    //   120: ldc 130
    //   122: aload 5
    //   124: aload_1
    //   125: invokevirtual 270	java/io/IOException:getMessage	()Ljava/lang/String;
    //   128: invokevirtual 274	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: ldc_w 276
    //   134: invokevirtual 274	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload_0
    //   138: getfield 95	com/tencent/mm/sdk/platformtools/bd$a:xBt	Ljava/lang/String;
    //   141: invokevirtual 274	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: aload_2
    //   151: ifnull +74 -> 225
    //   154: aload_2
    //   155: invokevirtual 250	java/io/FileOutputStream:close	()V
    //   158: iconst_0
    //   159: istore 4
    //   161: goto -93 -> 68
    //   164: astore_3
    //   165: ldc 130
    //   167: aload_3
    //   168: ldc 143
    //   170: iconst_0
    //   171: anewarray 4	java/lang/Object
    //   174: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: iconst_0
    //   178: istore 4
    //   180: goto -112 -> 68
    //   183: astore_0
    //   184: aconst_null
    //   185: astore_3
    //   186: aload_3
    //   187: ifnull +7 -> 194
    //   190: aload_3
    //   191: invokevirtual 250	java/io/FileOutputStream:close	()V
    //   194: ldc 219
    //   196: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: aload_0
    //   200: athrow
    //   201: astore_3
    //   202: ldc 130
    //   204: aload_3
    //   205: ldc 143
    //   207: iconst_0
    //   208: anewarray 4	java/lang/Object
    //   211: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: goto -20 -> 194
    //   217: astore_0
    //   218: goto -32 -> 186
    //   221: astore_1
    //   222: goto -121 -> 101
    //   225: iconst_0
    //   226: istore 4
    //   228: goto -160 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   64	68	82	java/io/IOException
    //   19	33	98	java/io/IOException
    //   154	158	164	java/io/IOException
    //   19	33	183	finally
    //   190	194	201	java/io/IOException
    //   35	44	217	finally
    //   46	50	217	finally
    //   52	56	217	finally
    //   58	64	217	finally
    //   103	108	217	finally
    //   110	118	217	finally
    //   120	150	217	finally
    //   35	44	221	java/io/IOException
    //   46	50	221	java/io/IOException
    //   52	56	221	java/io/IOException
    //   58	64	221	java/io/IOException
  }

  // ERROR //
  private static ArrayList<a> dpl()
  {
    // Byte code:
    //   0: ldc_w 284
    //   3: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 155	java/util/ArrayList
    //   9: dup
    //   10: invokespecial 286	java/util/ArrayList:<init>	()V
    //   13: astore_0
    //   14: new 288	java/io/BufferedReader
    //   17: astore_1
    //   18: new 290	java/io/FileReader
    //   21: astore_2
    //   22: aload_2
    //   23: ldc_w 292
    //   26: invokespecial 293	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   29: aload_1
    //   30: aload_2
    //   31: invokespecial 296	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   34: aload_1
    //   35: astore_2
    //   36: aload_1
    //   37: invokevirtual 299	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   40: astore_3
    //   41: aload_3
    //   42: ifnull +162 -> 204
    //   45: aload_1
    //   46: astore_2
    //   47: aload_3
    //   48: ldc_w 301
    //   51: invokevirtual 305	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   54: astore 4
    //   56: aload 4
    //   58: ifnull +12 -> 70
    //   61: aload_1
    //   62: astore_2
    //   63: aload 4
    //   65: arraylength
    //   66: iconst_3
    //   67: if_icmpge +60 -> 127
    //   70: aload_1
    //   71: astore_2
    //   72: ldc 130
    //   74: ldc_w 307
    //   77: aload_3
    //   78: invokestatic 310	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   81: invokevirtual 313	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: goto -53 -> 34
    //   90: astore 4
    //   92: aload_1
    //   93: astore_2
    //   94: ldc 130
    //   96: ldc_w 315
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload 4
    //   107: aastore
    //   108: invokestatic 138	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   111: aload_1
    //   112: ifnull +7 -> 119
    //   115: aload_1
    //   116: invokevirtual 316	java/io/BufferedReader:close	()V
    //   119: ldc_w 284
    //   122: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: aload_0
    //   126: areturn
    //   127: aload_1
    //   128: astore_2
    //   129: new 6	com/tencent/mm/sdk/platformtools/bd$a
    //   132: astore_3
    //   133: aload_1
    //   134: astore_2
    //   135: aload_3
    //   136: invokespecial 317	com/tencent/mm/sdk/platformtools/bd$a:<init>	()V
    //   139: aload_1
    //   140: astore_2
    //   141: aload_3
    //   142: aload 4
    //   144: iconst_0
    //   145: aaload
    //   146: putfield 320	com/tencent/mm/sdk/platformtools/bd$a:xBs	Ljava/lang/String;
    //   149: aload_1
    //   150: astore_2
    //   151: aload_3
    //   152: aload 4
    //   154: iconst_1
    //   155: aaload
    //   156: putfield 95	com/tencent/mm/sdk/platformtools/bd$a:xBt	Ljava/lang/String;
    //   159: aload_1
    //   160: astore_2
    //   161: aload_3
    //   162: aload 4
    //   164: iconst_2
    //   165: aaload
    //   166: putfield 176	com/tencent/mm/sdk/platformtools/bd$a:xBu	Ljava/lang/String;
    //   169: aload_1
    //   170: astore_2
    //   171: aload_0
    //   172: aload_3
    //   173: invokevirtual 323	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   176: pop
    //   177: goto -143 -> 34
    //   180: astore_1
    //   181: aload_2
    //   182: astore 4
    //   184: aload_1
    //   185: astore_2
    //   186: aload 4
    //   188: ifnull +8 -> 196
    //   191: aload 4
    //   193: invokevirtual 316	java/io/BufferedReader:close	()V
    //   196: ldc_w 284
    //   199: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: aload_2
    //   203: athrow
    //   204: aload_1
    //   205: invokevirtual 316	java/io/BufferedReader:close	()V
    //   208: goto -89 -> 119
    //   211: astore_2
    //   212: ldc 130
    //   214: aload_2
    //   215: ldc 143
    //   217: iconst_0
    //   218: anewarray 4	java/lang/Object
    //   221: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: goto -105 -> 119
    //   227: astore_2
    //   228: ldc 130
    //   230: aload_2
    //   231: ldc 143
    //   233: iconst_0
    //   234: anewarray 4	java/lang/Object
    //   237: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: goto -121 -> 119
    //   243: astore_1
    //   244: ldc 130
    //   246: aload_1
    //   247: ldc 143
    //   249: iconst_0
    //   250: anewarray 4	java/lang/Object
    //   253: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: goto -60 -> 196
    //   259: astore_2
    //   260: aconst_null
    //   261: astore 4
    //   263: goto -77 -> 186
    //   266: astore 4
    //   268: aconst_null
    //   269: astore_1
    //   270: goto -178 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   36	41	90	java/lang/Exception
    //   47	56	90	java/lang/Exception
    //   63	70	90	java/lang/Exception
    //   72	87	90	java/lang/Exception
    //   129	133	90	java/lang/Exception
    //   135	139	90	java/lang/Exception
    //   141	149	90	java/lang/Exception
    //   151	159	90	java/lang/Exception
    //   161	169	90	java/lang/Exception
    //   171	177	90	java/lang/Exception
    //   36	41	180	finally
    //   47	56	180	finally
    //   63	70	180	finally
    //   72	87	180	finally
    //   94	111	180	finally
    //   129	133	180	finally
    //   135	139	180	finally
    //   141	149	180	finally
    //   151	159	180	finally
    //   161	169	180	finally
    //   171	177	180	finally
    //   204	208	211	java/io/IOException
    //   115	119	227	java/io/IOException
    //   191	196	243	java/io/IOException
    //   14	34	259	finally
    //   14	34	266	java/lang/Exception
  }

  private static a dpm()
  {
    AppMethodBeat.i(52256);
    Object localObject1 = dpl();
    String str = Environment.getDataDirectory().getAbsolutePath();
    Object localObject2 = ((ArrayList)localObject1).iterator();
    do
    {
      if (!((Iterator)localObject2).hasNext())
        break;
      localObject1 = (a)((Iterator)localObject2).next();
    }
    while (!((a)localObject1).xBt.equals(str));
    while (true)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new a();
        ((a)localObject2).xBt = str;
        ((a)localObject2).xBs = "Unknown";
        ((a)localObject2).xBu = "Unknown";
      }
      a((a)localObject2);
      AppMethodBeat.o(52256);
      return localObject2;
      localObject1 = null;
    }
  }

  private static a dpn()
  {
    AppMethodBeat.i(52257);
    Object localObject1 = dpl();
    String str = Environment.getExternalStorageDirectory().getAbsolutePath();
    Object localObject2 = ((ArrayList)localObject1).iterator();
    do
    {
      if (!((Iterator)localObject2).hasNext())
        break;
      localObject1 = (a)((Iterator)localObject2).next();
    }
    while (!((a)localObject1).xBt.equals(str));
    while (true)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new a();
        ((a)localObject2).xBt = str;
        ((a)localObject2).xBs = "Unknown";
        ((a)localObject2).xBu = "Unknown";
      }
      a((a)localObject2);
      AppMethodBeat.o(52257);
      return localObject2;
      localObject1 = null;
    }
  }

  public static ArrayList<a> dpo()
  {
    AppMethodBeat.i(52258);
    ArrayList localArrayList = dpl();
    int i = localArrayList.size();
    List localList = Arrays.asList(xBp);
    Object localObject1 = Arrays.asList(xBq);
    Object localObject2 = Arrays.asList(xBr);
    i--;
    Object localObject3;
    if (i >= 0)
    {
      localObject3 = (a)localArrayList.get(i);
      if (!localList.contains(((a)localObject3).xBu))
      {
        localArrayList.remove(i);
        ab.d("MicroMsg.SdcardUtil", "Remove with filesystem mismatch: " + ((a)localObject3).xBu);
      }
      while (true)
      {
        i--;
        break;
        Iterator localIterator = ((List)localObject1).iterator();
        String str;
        for (boolean bool = false; localIterator.hasNext(); bool = ((a)localObject3).xBt.startsWith(str) | bool)
          str = (String)localIterator.next();
        if (bool)
        {
          localArrayList.remove(i);
          ab.d("MicroMsg.SdcardUtil", "Remove with bad mount dir1: " + ((a)localObject3).xBt);
        }
        else if ((((a)localObject3).xBu.equals("fuse")) || (((a)localObject3).xBu.equals("sdcardfs")))
        {
          if (((a)localObject3).xBs.startsWith("/data/"))
          {
            localArrayList.remove(i);
            ab.d("MicroMsg.SdcardUtil", "Remove with bad mount dir2: " + ((a)localObject3).xBs);
          }
        }
        else if ((!((a)localObject3).xBu.equals("fuse")) && (!((a)localObject3).xBu.equals("sdcardfs")))
        {
          localIterator = ((List)localObject2).iterator();
          for (bool = false; localIterator.hasNext(); bool = ((a)localObject3).xBs.startsWith(str) | bool)
            str = (String)localIterator.next();
          if (!bool)
          {
            localArrayList.remove(i);
            ab.d("MicroMsg.SdcardUtil", "Remove with bad device name: " + ((a)localObject3).xBs);
          }
        }
      }
    }
    localObject2 = Environment.getExternalStorageDirectory().getPath();
    i = localArrayList.size() - 1;
    if (i >= 0)
    {
      localObject1 = (a)localArrayList.get(i);
      if (((a)localObject1).xBt.equals(localObject2))
      {
        localArrayList.remove(i);
        localArrayList.add(0, localObject1);
      }
    }
    for (i = 1; ; i = 0)
    {
      if (i == 0)
      {
        localObject1 = new a();
        ((a)localObject1).xBt = ((String)localObject2);
        ((a)localObject1).xBu = "unknown";
        ((a)localObject1).xBs = "unknown";
        localArrayList.add(0, localObject1);
      }
      i = localArrayList.size() - 1;
      while (true)
        if (i >= 0)
        {
          localObject1 = (a)localArrayList.get(i);
          localObject2 = new File(((a)localObject1).xBt);
          if ((!((File)localObject2).exists()) || (!((File)localObject2).isDirectory()))
          {
            ab.d("MicroMsg.SdcardUtil", "Directory verify failed: ".concat(String.valueOf(localObject1)));
            localArrayList.remove(i);
          }
          i--;
          continue;
          i--;
          break;
        }
      for (i = localArrayList.size() - 1; i >= 0; i--)
      {
        localObject2 = (a)localArrayList.get(i);
        if (!b((a)localObject2))
        {
          ab.d("MicroMsg.SdcardUtil", "Directory testPermissionForStatMountParse failed: ".concat(String.valueOf(localObject2)));
          localArrayList.remove(i);
        }
      }
      localObject3 = new ArrayList();
      if (!localArrayList.isEmpty())
      {
        localObject2 = (a)localArrayList.remove(0);
        i = localArrayList.size() - 1;
        label653: if (i >= 0)
        {
          localObject1 = (a)localArrayList.get(i);
          if (!((a)localObject2).xBs.equals(((a)localObject1).xBs))
            break label910;
          localArrayList.remove(i);
          ab.d("MicroMsg.SdcardUtil", "Duplicate with same DevName:" + ((a)localObject2).xBs);
          if ((((a)localObject2).cbI) || (!((a)localObject1).cbI))
            break label910;
          ab.d("MicroMsg.SdcardUtil", "Keep the writable one, discard the unwritable one");
          localObject2 = localObject1;
        }
      }
      label910: 
      while (true)
      {
        i--;
        break label653;
        ((ArrayList)localObject3).add(localObject2);
        break;
        localObject2 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject2).hasNext())
          a((a)((Iterator)localObject2).next());
        localArrayList.clear();
        while (!((ArrayList)localObject3).isEmpty())
        {
          localObject2 = (a)((ArrayList)localObject3).remove(0);
          localArrayList.add(localObject2);
          for (i = ((ArrayList)localObject3).size() - 1; i >= 0; i--)
          {
            localObject1 = (a)((ArrayList)localObject3).get(i);
            if (((a)localObject2).equals(localObject1))
            {
              ab.d("MicroMsg.SdcardUtil", "Duplicate:" + ((a)localObject2).toString() + "---" + ((a)localObject1).toString());
              ((ArrayList)localObject3).remove(i);
            }
          }
        }
        AppMethodBeat.o(52258);
        return localArrayList;
      }
    }
  }

  public static long dpp()
  {
    AppMethodBeat.i(52259);
    a locala = dpm();
    long l1 = locala.xBx;
    long l2 = locala.xBy;
    AppMethodBeat.o(52259);
    return l2 * l1;
  }

  public static long dpq()
  {
    AppMethodBeat.i(52260);
    a locala = dpn();
    long l1 = locala.xBx;
    long l2 = locala.xBy;
    AppMethodBeat.o(52260);
    return l2 * l1;
  }

  public static boolean dpr()
  {
    AppMethodBeat.i(52261);
    long l = System.currentTimeMillis();
    Object localObject1 = dpl();
    String str1 = Environment.getDataDirectory().getAbsolutePath();
    String str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
    Object localObject2 = null;
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    Object localObject3 = null;
    Object localObject4;
    while (true)
    {
      localObject4 = localObject2;
      localObject5 = localObject3;
      if (!localIterator.hasNext())
        break label134;
      localObject4 = (a)localIterator.next();
      if ((localObject3 == null) && (((a)localObject4).xBt.equals(str1)))
      {
        if (localObject2 != null)
          break label491;
        localObject3 = localObject4;
      }
      else
      {
        if ((localObject2 != null) || (!((a)localObject4).xBt.equals(str2)))
          break label484;
        if (localObject3 != null)
          break;
        localObject2 = localObject4;
      }
    }
    Object localObject5 = localObject3;
    while (true)
    {
      label134: if ((localObject5 != null) && (localObject4 == null) && (!bo.isNullOrNil(str2)) && (str2.contains("emulated")))
      {
        localObject2 = str2.substring(str2.lastIndexOf('/') + 1);
        int i = bo.getInt((String)localObject2, -1);
        ab.i("MicroMsg.SdcardUtil", "hasUnRemovableStorage multiuser uid[%s][%d]", new Object[] { localObject2, Integer.valueOf(i) });
        if (i != -1)
        {
          localObject3 = str2.substring(0, str2.length() - ((String)localObject2).length() - 1);
          if (!bo.isNullOrNil((String)localObject3))
          {
            localObject1 = ((ArrayList)localObject1).iterator();
            do
            {
              if (!((Iterator)localObject1).hasNext())
                break;
              localObject2 = (a)((Iterator)localObject1).next();
            }
            while (!((a)localObject2).xBt.equals(localObject3));
          }
        }
      }
      while (true)
      {
        if ((localObject5 != null) && (localObject2 != null))
        {
          a(localObject5);
          a((a)localObject2);
          ab.d("MicroMsg.SdcardUtil", "hasUnRemovableStorage stats dataStatMountParse[%s] storageStatMountParse[%s]", new Object[] { localObject5, localObject2 });
          if (((!((a)localObject2).xBu.equals("fuse")) && (!((a)localObject2).xBu.equals("sdcardfs")) && (!((a)localObject2).xBu.equals("esdfs"))) || (localObject5.xBv < ((a)localObject2).xBv) || (((a)localObject2).xBv <= 0L) || (localObject5.xBy < ((a)localObject2).xBy) || (((a)localObject2).xBy <= 0L) || (localObject5.xBx < ((a)localObject2).xBx));
        }
        for (boolean bool = true; ; bool = false)
        {
          ab.i("MicroMsg.SdcardUtil", "hasUnRemovableStorage ret[%b], take[%d]ms", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(52261);
          return bool;
        }
        localObject2 = localObject4;
      }
      label484: localObject4 = localObject2;
      break;
      label491: localObject5 = localObject4;
      localObject4 = localObject2;
    }
  }

  public static final class a
  {
    public boolean cbI;
    public String xBs;
    public String xBt;
    public String xBu;
    public long xBv;
    public long xBw;
    public long xBx;
    public long xBy;
    a xBz;

    public final boolean equals(Object paramObject)
    {
      boolean bool = false;
      AppMethodBeat.i(52252);
      paramObject = (a)paramObject;
      if (this.xBy != paramObject.xBy)
        AppMethodBeat.o(52252);
      while (true)
      {
        return bool;
        long l1 = this.xBv - paramObject.xBv;
        long l2 = this.xBw - paramObject.xBw;
        long l3 = this.xBx - paramObject.xBx;
        if ((Math.abs(l1 - l2) <= 4L) && (Math.abs(l1 - l3) <= 4L) && (Math.abs(l2 - l3) <= 4L))
        {
          bool = true;
          AppMethodBeat.o(52252);
        }
        else
        {
          AppMethodBeat.o(52252);
        }
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(52251);
      Object localObject = new StringBuilder("{DevName=").append(this.xBs).append(", MountDir=").append(this.xBt).append(", FileSystem=").append(this.xBu).append(", TotalBlocks=").append(this.xBv).append(", FreeBlocks=").append(this.xBw).append(", AvailableBlocks=").append(this.xBx).append(", BlockSize=").append(this.xBy).append(", Shared=");
      if (this.xBz != null);
      for (boolean bool = true; ; bool = false)
      {
        localObject = bool + "}";
        AppMethodBeat.o(52251);
        return localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bd
 * JD-Core Version:    0.6.2
 */