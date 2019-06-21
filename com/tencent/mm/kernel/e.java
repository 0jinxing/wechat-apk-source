package com.tencent.mm.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Environment;
import android.os.HandlerThread;
import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.cd.h.a;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.cd.h.e;
import com.tencent.mm.ci.a.a;
import com.tencent.mm.compatible.e.l;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.aj;
import com.tencent.mm.model.cf;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.bx;
import com.tencent.mm.storage.by;
import com.tencent.mm.storage.y;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.FileSystemManager;
import com.tencent.mm.vfs.FileSystemManager.a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashMap<Ljava.lang.Integer;Lcom.tencent.mm.cd.h.d;>;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public final class e
{
  private static HashMap<Integer, h.d> eaA;
  public String cachePath;
  public final y eJH;
  private com.tencent.mm.kernel.api.e eJI;
  public b eJJ;
  b eJK;
  public String eJL;
  public String eJM;
  public com.tencent.mm.cd.h eJN;
  public com.tencent.mm.cd.h eJO;
  z eJP;
  bs eJQ;
  by eJR;
  ConcurrentHashMap<Integer, String> eJS;
  boolean eJT;
  cf eJU;
  ConcurrentHashMap<String, SharedPreferences> eJV;
  private long eJW;
  private ak eJX;
  private volatile Boolean eJY;
  private a eJZ;
  private long eKa;

  static
  {
    AppMethodBeat.i(57978);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("CONFIG_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return z.fnj;
      }
    });
    eaA.put(Integer.valueOf("TablesVersion".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return by.fnj;
      }
    });
    AppMethodBeat.o(57978);
  }

  public e(com.tencent.mm.kernel.api.e parame)
  {
    AppMethodBeat.i(57953);
    this.eJJ = new b();
    this.eJK = new b();
    this.eJN = null;
    this.eJO = null;
    this.eJT = false;
    this.eJV = new ConcurrentHashMap();
    this.eJW = 0L;
    this.eJX = null;
    this.eJY = null;
    this.eJZ = new a((byte)0);
    this.eKa = 0L;
    this.eJH = Ro();
    a.eIM.a(this.eJH);
    String str1 = ac.eSj + "alphahold.ini";
    ab.i("MMKernel.CoreStorage", "initialize dkalpha client:%x  isapha:%b %s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo), Boolean.valueOf(com.tencent.mm.protocal.d.vxr), str1 });
    String str2;
    int i;
    if (com.tencent.mm.protocal.d.vxr)
    {
      str2 = com.tencent.mm.sdk.e.a.getValue(str1, "noneedhold");
      i = com.tencent.mm.protocal.d.vxo;
    }
    try
    {
      j = Integer.decode(com.tencent.mm.loader.j.a.CLIENT_VERSION).intValue();
      if (!String.valueOf(j).equals(str2))
      {
        ab.w("MMKernel.CoreStorage", "dkalpha version need  reset to DefaultAccount , hold it! client:%x  isapha:%b", new Object[] { Integer.valueOf(j), Boolean.valueOf(com.tencent.mm.protocal.d.vxr) });
        a.QL();
        com.tencent.mm.sdk.e.a.aB(str1, "noneedhold", String.valueOf(j));
      }
      while (true)
      {
        this.eJL = Rx();
        this.eJI = parame;
        AppMethodBeat.o(57953);
        return;
        com.tencent.mm.a.e.deleteFile(str1);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        int j = i;
    }
  }

  static HashMap<Integer, h.d> Jx()
  {
    AppMethodBeat.i(57977);
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(eaA);
    AppMethodBeat.o(57977);
    return localHashMap;
  }

  // ERROR //
  private static boolean RD()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: ldc_w 276
    //   5: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 282	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   11: invokevirtual 287	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   14: astore_1
    //   15: getstatic 292	com/tencent/mm/compatible/util/e:eSl	Ljava/lang/String;
    //   18: aload_1
    //   19: invokevirtual 295	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   22: istore_2
    //   23: invokestatic 298	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   26: ldc_w 300
    //   29: invokevirtual 235	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   32: istore_3
    //   33: new 284	java/io/File
    //   36: astore 4
    //   38: aload 4
    //   40: invokestatic 282	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   43: invokevirtual 287	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   46: invokespecial 303	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: aload 4
    //   51: invokevirtual 306	java/io/File:canWrite	()Z
    //   54: istore 5
    //   56: new 284	java/io/File
    //   59: dup
    //   60: invokestatic 282	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   63: invokevirtual 287	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   66: ldc_w 308
    //   69: invokespecial 311	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: astore 6
    //   74: aload 6
    //   76: invokevirtual 314	java/io/File:createNewFile	()Z
    //   79: pop
    //   80: new 316	java/io/FileOutputStream
    //   83: astore 7
    //   85: aload 7
    //   87: aload 6
    //   89: invokespecial 319	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   92: aload 7
    //   94: astore 4
    //   96: aload 7
    //   98: ldc_w 321
    //   101: invokevirtual 325	java/lang/String:getBytes	()[B
    //   104: invokevirtual 329	java/io/FileOutputStream:write	([B)V
    //   107: aload 7
    //   109: astore 4
    //   111: aload 7
    //   113: invokevirtual 332	java/io/FileOutputStream:flush	()V
    //   116: aload 7
    //   118: astore 4
    //   120: aload 7
    //   122: invokevirtual 335	java/io/FileOutputStream:close	()V
    //   125: aload 7
    //   127: astore 4
    //   129: aload 6
    //   131: invokevirtual 338	java/io/File:delete	()Z
    //   134: istore 8
    //   136: aload 7
    //   138: invokevirtual 335	java/io/FileOutputStream:close	()V
    //   141: ldc 187
    //   143: new 169	java/lang/StringBuilder
    //   146: dup
    //   147: ldc_w 340
    //   150: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   153: aload_1
    //   154: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: ldc_w 343
    //   160: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: getstatic 292	com/tencent/mm/compatible/util/e:eSl	Ljava/lang/String;
    //   166: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: ldc_w 345
    //   172: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: iload_2
    //   176: invokevirtual 348	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   179: ldc_w 350
    //   182: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: iload_3
    //   186: invokevirtual 348	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   189: ldc_w 352
    //   192: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: iload 5
    //   197: invokevirtual 348	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   200: ldc_w 354
    //   203: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: iload 8
    //   208: invokevirtual 348	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   211: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokestatic 356	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: ldc_w 276
    //   220: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: iload 8
    //   225: ireturn
    //   226: astore 4
    //   228: ldc 187
    //   230: new 169	java/lang/StringBuilder
    //   233: dup
    //   234: ldc_w 358
    //   237: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   240: aload 4
    //   242: invokevirtual 361	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   245: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   251: invokestatic 363	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: iconst_0
    //   255: istore 5
    //   257: goto -201 -> 56
    //   260: astore 4
    //   262: ldc 187
    //   264: ldc_w 365
    //   267: iconst_1
    //   268: anewarray 4	java/lang/Object
    //   271: dup
    //   272: iconst_0
    //   273: aload 4
    //   275: invokestatic 371	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   278: aastore
    //   279: invokestatic 374	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: goto -141 -> 141
    //   285: astore 6
    //   287: aconst_null
    //   288: astore 7
    //   290: aload 7
    //   292: astore 4
    //   294: new 169	java/lang/StringBuilder
    //   297: astore 9
    //   299: aload 7
    //   301: astore 4
    //   303: aload 9
    //   305: ldc_w 376
    //   308: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   311: aload 7
    //   313: astore 4
    //   315: ldc 187
    //   317: aload 9
    //   319: aload 6
    //   321: invokevirtual 361	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   324: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   330: invokestatic 363	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: iload_0
    //   334: istore 8
    //   336: aload 7
    //   338: ifnull -197 -> 141
    //   341: aload 7
    //   343: invokevirtual 335	java/io/FileOutputStream:close	()V
    //   346: iload_0
    //   347: istore 8
    //   349: goto -208 -> 141
    //   352: astore 4
    //   354: ldc 187
    //   356: ldc_w 365
    //   359: iconst_1
    //   360: anewarray 4	java/lang/Object
    //   363: dup
    //   364: iconst_0
    //   365: aload 4
    //   367: invokestatic 371	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   370: aastore
    //   371: invokestatic 374	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   374: iload_0
    //   375: istore 8
    //   377: goto -236 -> 141
    //   380: astore 7
    //   382: aconst_null
    //   383: astore 4
    //   385: aload 4
    //   387: ifnull +8 -> 395
    //   390: aload 4
    //   392: invokevirtual 335	java/io/FileOutputStream:close	()V
    //   395: ldc_w 276
    //   398: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   401: aload 7
    //   403: athrow
    //   404: astore 4
    //   406: ldc 187
    //   408: ldc_w 365
    //   411: iconst_1
    //   412: anewarray 4	java/lang/Object
    //   415: dup
    //   416: iconst_0
    //   417: aload 4
    //   419: invokestatic 371	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   422: aastore
    //   423: invokestatic 374	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   426: goto -31 -> 395
    //   429: astore 7
    //   431: goto -46 -> 385
    //   434: astore 6
    //   436: goto -146 -> 290
    //
    // Exception table:
    //   from	to	target	type
    //   33	56	226	java/lang/Exception
    //   136	141	260	java/io/IOException
    //   74	92	285	java/lang/Exception
    //   341	346	352	java/io/IOException
    //   74	92	380	finally
    //   390	395	404	java/io/IOException
    //   96	107	429	finally
    //   111	116	429	finally
    //   120	125	429	finally
    //   129	136	429	finally
    //   294	299	429	finally
    //   303	311	429	finally
    //   315	333	429	finally
    //   96	107	434	java/lang/Exception
    //   111	116	434	java/lang/Exception
    //   120	125	434	java/lang/Exception
    //   129	136	434	java/lang/Exception
  }

  private static boolean RE()
  {
    AppMethodBeat.i(57976);
    String str = Environment.getExternalStorageDirectory().getAbsolutePath();
    boolean bool1 = com.tencent.mm.compatible.util.e.eSl.equalsIgnoreCase(str);
    boolean bool2 = Environment.getExternalStorageState().equals("mounted");
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(Environment.getExternalStorageDirectory().getAbsolutePath());
      bool3 = localFile.canRead();
      localFile = new File(com.tencent.mm.compatible.util.e.eSn);
      boolean bool4 = localFile.exists();
      if (bool4)
        ab.i("MMKernel.CoreStorage", "testSdcardReadable testFile isDirectory:" + localFile.isDirectory() + " isFile:" + localFile.isFile());
      ab.i("MMKernel.CoreStorage", "testSdcardWritable primaryExtStg: " + str + " CConstants.SDCARD_ROOT: " + com.tencent.mm.compatible.util.e.eSl + " CConstants.DATAROOT_SDCARD_PATH: " + com.tencent.mm.compatible.util.e.eSn + " isPrimaryExtStg: " + bool1 + " mounted: " + bool2 + " canRead: " + bool3 + " canTrueRead:" + bool4);
      AppMethodBeat.o(57976);
      return bool4;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool3 = false;
        ab.w("MMKernel.CoreStorage", "testSdcardReadable 1 e: " + localException.getMessage());
      }
    }
  }

  private static y Ro()
  {
    AppMethodBeat.i(57954);
    ab.i("MMKernel.CoreStorage", "initialize packageInfo:%s version:%x", new Object[] { com.tencent.mm.sdk.platformtools.f.aZm(), Integer.valueOf(com.tencent.mm.protocal.d.vxo) });
    Object localObject1 = new File(ac.eSj);
    if (!((File)localObject1).exists())
      ((File)localObject1).mkdirs();
    localObject1 = new y(ac.eSj + "systemInfo.cfg");
    Object localObject2 = (String)((y)localObject1).get(258);
    if (localObject2 != null)
      l.Lu().set(258, localObject2);
    try
    {
      localObject2 = com.tencent.mm.compatible.util.h.getDataDirectory();
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(((File)localObject2).getPath());
      ab.i("MMKernel.CoreStorage", "CheckData path[%s] blocksize:%d blockcount:%d availcount:%d", new Object[] { ((File)localObject2).getAbsolutePath(), Integer.valueOf(localStatFs.getBlockSize()), Integer.valueOf(localStatFs.getBlockCount()), Integer.valueOf(localStatFs.getAvailableBlocks()) });
      AppMethodBeat.o(57954);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MMKernel.CoreStorage", "check data size failed :%s", new Object[] { localException.getMessage() });
    }
  }

  private static String Rx()
  {
    AppMethodBeat.i(57967);
    Object localObject1 = ac.eSj;
    File localFile = new File(com.tencent.mm.compatible.util.e.eSl);
    ab.i("MMKernel.CoreStorage", "summer buildSysPath sysPath[" + (String)localObject1 + "] SDCARD_ROOT[" + com.tencent.mm.compatible.util.e.eSl + "] file.exists:" + localFile.exists() + " CUtil.isSDCardAvail():" + com.tencent.mm.compatible.util.f.Mn());
    Object localObject2 = localObject1;
    if (localFile.exists())
    {
      localObject2 = localObject1;
      if (com.tencent.mm.compatible.util.f.Mn())
      {
        localObject2 = localObject1;
        if (cw(com.tencent.mm.compatible.util.e.eSn))
          localObject2 = com.tencent.mm.compatible.util.e.eSn;
        localObject1 = new File(com.tencent.mm.compatible.util.e.euR);
        if (!((File)localObject1).exists())
          ((File)localObject1).mkdirs();
        localObject1 = new File(com.tencent.mm.compatible.util.e.euS);
        if (!((File)localObject1).exists())
          ((File)localObject1).mkdirs();
        localObject1 = new File(com.tencent.mm.compatible.util.e.euT);
        if (!((File)localObject1).exists())
          ((File)localObject1).mkdirs();
        localObject1 = new File(com.tencent.mm.compatible.util.e.euU);
        if (!((File)localObject1).exists())
          ((File)localObject1).mkdirs();
        localObject1 = new File(com.tencent.mm.compatible.util.e.euS + ".nomedia");
        if (((File)localObject1).exists());
      }
    }
    try
    {
      ((File)localObject1).createNewFile();
      cw(com.tencent.mm.compatible.util.e.euQ);
      localObject1 = new File((String)localObject2);
      if (!((File)localObject1).exists())
        ((File)localObject1).mkdirs();
      ab.i("MMKernel.CoreStorage", "summer buildSysPath ret sysPath: ".concat(String.valueOf(localObject2)));
      AppMethodBeat.o(57967);
      return localObject2;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MMKernel.CoreStorage", "exception:%s", new Object[] { bo.l(localIOException) });
    }
  }

  private static final boolean cw(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(57968);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MMKernel.CoreStorage", "forceMkdirs absolutePath isNullOrNil ret false");
      AppMethodBeat.o(57968);
    }
    while (true)
    {
      return bool;
      Object localObject = new File(paramString);
      ab.i("MMKernel.CoreStorage", "forceMkdirs absolutePath[%s], f.exists[%b], f.isDirectory[%b]", new Object[] { paramString, Boolean.valueOf(((File)localObject).exists()), Boolean.valueOf(((File)localObject).isDirectory()) });
      if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
      {
        ab.i("MMKernel.CoreStorage", "forceMkdirs f is dir and exist ret true");
        AppMethodBeat.o(57968);
        bool = true;
      }
      else
      {
        String[] arrayOfString = paramString.split("/");
        if ((arrayOfString == null) || (arrayOfString.length < 2))
        {
          ab.i("MMKernel.CoreStorage", "forceMkdirs absolutePath arr len illegal ret false");
          AppMethodBeat.o(57968);
        }
        else
        {
          localObject = "/";
          ab.i("MMKernel.CoreStorage", "forceMkdirs absolutePath arr len: " + arrayOfString.length);
          int i = 0;
          while (true)
          {
            if (i >= arrayOfString.length)
              break label360;
            paramString = (String)localObject;
            if (!bo.isNullOrNil(arrayOfString[i]))
            {
              localObject = (String)localObject + "/" + arrayOfString[i];
              File localFile = new File((String)localObject);
              if ((localFile.isFile()) && (!localFile.renameTo(new File((String)localObject + "_mmbak"))))
              {
                ab.i("MMKernel.CoreStorage", "forceMkdirs renameTo false ret false file[%s]", new Object[] { localFile.getName() });
                AppMethodBeat.o(57968);
                break;
              }
              paramString = (String)localObject;
              if (!localFile.exists())
              {
                paramString = (String)localObject;
                if (!localFile.mkdir())
                {
                  ab.i("MMKernel.CoreStorage", "forceMkdirs mkdir false ret false file[%s]", new Object[] { localFile.getName() });
                  AppMethodBeat.o(57968);
                  break;
                }
              }
            }
            i++;
            localObject = paramString;
          }
          label360: ab.i("MMKernel.CoreStorage", "forceMkdirs false ret true");
          AppMethodBeat.o(57968);
          bool = true;
        }
      }
    }
  }

  private void lI(String paramString)
  {
    AppMethodBeat.i(57957);
    ab.i("MMKernel.CoreStorage", "remount resetSysPath sysPath:[%s] newSysPath:[%s] accPath:[%s] cachePath: [%s]", new Object[] { this.eJL, paramString, this.eJM, this.cachePath });
    if (!bo.isNullOrNil(paramString))
    {
      this.eJL = paramString;
      paramString = new StringBuilder("mm");
      g.RQ();
      g.RN();
      String str = com.tencent.mm.a.g.x(a.QF().getBytes());
      this.eJM = (this.eJL + str + "/");
      paramString = FileSystemManager.dMv();
      paramString.dMx().ir("account", str).ri(false);
      paramString.dMy();
      ab.i("VFS.Debug", "SetEnv ${account} = " + str + " and broadcast.");
      Rq();
    }
    AppMethodBeat.o(57957);
  }

  public final void RA()
  {
    AppMethodBeat.i(57971);
    this.eJY = Boolean.valueOf(isSDCardAvailable());
    AppMethodBeat.o(57971);
  }

  public final boolean RB()
  {
    AppMethodBeat.i(57972);
    if (this.eJY == null)
      this.eJY = Boolean.valueOf(isSDCardAvailable());
    while (true)
    {
      boolean bool = this.eJY.booleanValue();
      AppMethodBeat.o(57972);
      return bool;
      long l = System.currentTimeMillis() - this.eKa;
      if ((l <= 0L) || (l >= 1000L))
      {
        com.tencent.mm.sdk.g.d.xDH.al(this.eJZ);
        com.tencent.mm.sdk.g.d.xDH.o(this.eJZ, 1000L);
        this.eKa = System.currentTimeMillis();
      }
    }
  }

  // ERROR //
  public final void RC()
  {
    // Byte code:
    //   0: ldc_w 648
    //   3: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 566	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   9: pop
    //   10: invokestatic 570	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   13: getfield 652	com/tencent/mm/kernel/a:eIL	[B
    //   16: astore_1
    //   17: aload_1
    //   18: monitorenter
    //   19: invokestatic 250	com/tencent/mm/kernel/e:Rx	()Ljava/lang/String;
    //   22: astore_2
    //   23: ldc 187
    //   25: ldc_w 654
    //   28: iconst_4
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: invokestatic 573	com/tencent/mm/kernel/a:QF	()I
    //   37: invokestatic 104	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: aload_0
    //   44: getfield 252	com/tencent/mm/kernel/e:eJL	Ljava/lang/String;
    //   47: aastore
    //   48: dup
    //   49: iconst_2
    //   50: aload_2
    //   51: aastore
    //   52: dup
    //   53: iconst_3
    //   54: invokestatic 570	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   57: invokevirtual 657	com/tencent/mm/kernel/a:QY	()Z
    //   60: invokestatic 203	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   63: aastore
    //   64: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload_2
    //   68: invokestatic 513	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   71: ifne +189 -> 260
    //   74: aload_2
    //   75: aload_0
    //   76: getfield 252	com/tencent/mm/kernel/e:eJL	Ljava/lang/String;
    //   79: invokevirtual 295	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   82: istore_3
    //   83: iload_3
    //   84: ifeq +141 -> 225
    //   87: new 169	java/lang/StringBuilder
    //   90: astore_2
    //   91: aload_2
    //   92: ldc_w 659
    //   95: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   98: ldc 187
    //   100: aload_2
    //   101: invokestatic 661	com/tencent/mm/kernel/e:RD	()Z
    //   104: invokevirtual 348	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   107: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 356	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: new 169	java/lang/StringBuilder
    //   116: astore_2
    //   117: aload_2
    //   118: ldc_w 663
    //   121: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: ldc 187
    //   126: aload_2
    //   127: invokestatic 665	com/tencent/mm/kernel/e:RE	()Z
    //   130: invokevirtual 348	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   133: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokestatic 356	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: aload_1
    //   140: monitorexit
    //   141: ldc_w 648
    //   144: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: return
    //   148: astore 4
    //   150: new 169	java/lang/StringBuilder
    //   153: astore_2
    //   154: aload_2
    //   155: ldc_w 667
    //   158: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: ldc 187
    //   163: aload_2
    //   164: aload 4
    //   166: invokevirtual 361	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   169: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokestatic 363	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: goto -65 -> 113
    //   181: astore_2
    //   182: aload_1
    //   183: monitorexit
    //   184: ldc_w 648
    //   187: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: aload_2
    //   191: athrow
    //   192: astore 4
    //   194: new 169	java/lang/StringBuilder
    //   197: astore_2
    //   198: aload_2
    //   199: ldc_w 669
    //   202: invokespecial 341	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   205: ldc 187
    //   207: aload_2
    //   208: aload 4
    //   210: invokevirtual 361	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   213: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokestatic 363	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: goto -83 -> 139
    //   225: aload_0
    //   226: aload_2
    //   227: invokespecial 671	com/tencent/mm/kernel/e:lI	(Ljava/lang/String;)V
    //   230: invokestatic 677	com/tencent/mm/kernel/a/c:Sa	()Lcom/tencent/mm/kernel/a/c;
    //   233: getfield 681	com/tencent/mm/kernel/a/c:eKY	Lcom/tencent/mm/kernel/a/c$d;
    //   236: invokevirtual 686	com/tencent/mm/kernel/a/c$d:RV	()V
    //   239: ldc 187
    //   241: ldc_w 688
    //   244: iconst_1
    //   245: anewarray 4	java/lang/Object
    //   248: dup
    //   249: iconst_0
    //   250: invokestatic 473	com/tencent/mm/compatible/util/f:Mn	()Z
    //   253: invokestatic 203	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   256: aastore
    //   257: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: aload_1
    //   261: monitorexit
    //   262: ldc_w 648
    //   265: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   268: goto -121 -> 147
    //
    // Exception table:
    //   from	to	target	type
    //   87	113	148	java/lang/Exception
    //   19	83	181	finally
    //   87	113	181	finally
    //   113	139	181	finally
    //   139	141	181	finally
    //   150	178	181	finally
    //   182	184	181	finally
    //   194	222	181	finally
    //   225	260	181	finally
    //   260	262	181	finally
    //   113	139	192	java/lang/Exception
  }

  final void Rp()
  {
    AppMethodBeat.i(57956);
    this.eJP.set(14, Integer.valueOf(com.tencent.mm.protocal.d.vxo));
    AppMethodBeat.o(57956);
  }

  final void Rq()
  {
    AppMethodBeat.i(57958);
    com.tencent.mm.kernel.a.c.Sa().lM(this.eJM);
    File localFile = new File(this.eJM + ".nomedia");
    if (!localFile.exists());
    while (true)
    {
      try
      {
        localFile.createNewFile();
        AppMethodBeat.o(57958);
        return;
      }
      catch (IOException localIOException)
      {
        ab.e("MMKernel.CoreStorage", "exception:%s", new Object[] { bo.l(localIOException) });
      }
      AppMethodBeat.o(57958);
    }
  }

  public final boolean Rr()
  {
    AppMethodBeat.i(57961);
    g.RQ();
    g.RN().QU();
    int i = bo.h((Integer)this.eJP.get(89, null));
    boolean bool;
    if (i != 0)
    {
      ab.i("MMKernel.CoreStorage", "isDBCorrupted: false, recoveryState: ".concat(String.valueOf(i)));
      AppMethodBeat.o(57961);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((bo.nullAsNil((String)this.eJP.get(8195, null)).length() <= 0) || (bo.h((Integer)this.eJP.get(15, null)) == 0));
      for (bool = true; ; bool = false)
      {
        if ((bool) && (Rs() != null))
          break label168;
        this.eJP.set(89, Integer.valueOf(1));
        this.eJP.dsb();
        ab.i("MMKernel.CoreStorage", "isDBCorrupted: false, needInit: ".concat(String.valueOf(bool)));
        AppMethodBeat.o(57961);
        bool = false;
        break;
      }
      label168: ab.i("MMKernel.CoreStorage", "isDBCorrupted: true");
      AppMethodBeat.o(57961);
      bool = true;
    }
  }

  public final String Rs()
  {
    AppMethodBeat.i(57962);
    Object localObject1 = new File(this.cachePath + "/ctest", "EnMicroMsg.db");
    if (((File)localObject1).isFile())
    {
      localObject1 = ((File)localObject1).getAbsolutePath();
      AppMethodBeat.o(57962);
    }
    while (true)
    {
      return localObject1;
      localObject1 = new File(this.cachePath + "/corrupted", "EnMicroMsg.db");
      if (((File)localObject1).isFile())
      {
        localObject1 = ((File)localObject1).getAbsolutePath();
        AppMethodBeat.o(57962);
      }
      else
      {
        String[] arrayOfString = new File(this.cachePath).list(new FilenameFilter()
        {
          public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
          {
            AppMethodBeat.i(57945);
            boolean bool = paramAnonymousString.startsWith("EnMicroMsg.dberr");
            AppMethodBeat.o(57945);
            return bool;
          }
        });
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          localObject1 = arrayOfString[0];
          int i = 1;
          while (i < arrayOfString.length)
          {
            String str = arrayOfString[i];
            Object localObject2 = localObject1;
            if (str.compareTo((String)localObject1) > 0)
              localObject2 = str;
            i++;
            localObject1 = localObject2;
          }
          localObject1 = this.cachePath + '/' + (String)localObject1;
          AppMethodBeat.o(57962);
        }
        else
        {
          localObject1 = null;
          AppMethodBeat.o(57962);
        }
      }
    }
  }

  public final String Rt()
  {
    return this.cachePath;
  }

  public final com.tencent.mm.cd.h Ru()
  {
    return this.eJN;
  }

  public final String Rv()
  {
    AppMethodBeat.i(57964);
    String str = this.cachePath + "MicroMsg.db";
    AppMethodBeat.o(57964);
    return str;
  }

  public final String Rw()
  {
    AppMethodBeat.i(57965);
    String str = this.cachePath + "EnMicroMsg.db";
    AppMethodBeat.o(57965);
    return str;
  }

  public final z Ry()
  {
    AppMethodBeat.i(57969);
    g.RQ();
    g.RN().QU();
    z localz = this.eJP;
    AppMethodBeat.o(57969);
    return localz;
  }

  public final bs Rz()
  {
    AppMethodBeat.i(57970);
    g.RQ();
    g.RN().QU();
    bs localbs = this.eJQ;
    AppMethodBeat.o(57970);
    return localbs;
  }

  public final boolean a(com.tencent.mm.cd.f paramf, HashMap<Integer, h.d> paramHashMap)
  {
    AppMethodBeat.i(57960);
    int i;
    g.a locala;
    Iterator localIterator;
    if (paramHashMap == null)
    {
      i = -1;
      ab.i("MMKernel.CoreStorage", "createtables %d %s", new Object[] { Integer.valueOf(i), Boolean.FALSE });
      locala = new g.a();
      if ((paramHashMap != null) && (paramHashMap.size() > 0))
      {
        localIterator = paramHashMap.entrySet().iterator();
        i = 0;
      }
    }
    else
    {
      Integer localInteger;
      Object localObject1;
      int k;
      label255: Object localObject2;
      while (true)
      {
        if (!localIterator.hasNext())
          break label690;
        paramHashMap = (Map.Entry)localIterator.next();
        localInteger = (Integer)paramHashMap.getKey();
        h.d locald = (h.d)paramHashMap.getValue();
        paramHashMap = null;
        int j;
        if (!this.eJT)
        {
          localObject1 = new StringBuilder();
          paramHashMap = locald.Af();
          j = paramHashMap.length;
          k = 0;
          while (true)
            if (k < j)
            {
              ((StringBuilder)localObject1).append(paramHashMap[k].hashCode());
              k++;
              continue;
              i = paramHashMap.size();
              break;
            }
          localObject1 = com.tencent.mm.a.g.x(((StringBuilder)localObject1).toString().getBytes());
          if (this.eJS != null)
          {
            paramHashMap = (String)this.eJS.get(localInteger);
            ab.d("MMKernel.CoreStorage", "Create tables on %s(%s) compare with %s, using table versions", new Object[] { localInteger, paramHashMap, localObject1 });
            if ((paramHashMap != null) && (((String)localObject1).equals(paramHashMap)))
              continue;
            paramHashMap = (HashMap<Integer, h.d>)localObject1;
          }
        }
        else
        {
          paramf.beginTransaction();
          localObject1 = locald.Af();
          j = localObject1.length;
          k = 0;
          label276: if (k < j)
          {
            localObject2 = localObject1[k];
            try
            {
              paramf.execSQL((String)localObject2);
              i++;
              k++;
              break label276;
              if (this.eJR != null)
              {
                localObject3 = this.eJR;
                k = localInteger.intValue();
                paramHashMap = null;
                localObject2 = null;
                localObject3 = ((by)localObject3).rawQuery("select * from TablesVersion where tableHash = ".concat(String.valueOf(k)), new String[0]);
                if (localObject3 != null)
                {
                  paramHashMap = (HashMap<Integer, h.d>)localObject2;
                  if (((Cursor)localObject3).moveToFirst())
                  {
                    paramHashMap = new bx();
                    paramHashMap.d((Cursor)localObject3);
                  }
                  ((Cursor)localObject3).close();
                }
                if (paramHashMap != null)
                  break label442;
              }
              label442: for (paramHashMap = null; ; paramHashMap = paramHashMap.field_tableSQLMD5)
              {
                ab.d("MMKernel.CoreStorage", "Create tables on %s(%s) compare with %s, using table versions storage", new Object[] { localInteger, paramHashMap, localObject1 });
                if ((paramHashMap != null) && (((String)localObject1).equals(paramHashMap)))
                  break;
                paramHashMap = (HashMap<Integer, h.d>)localObject1;
                break label255;
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                Object localObject3 = com.tencent.mm.cd.a.ybj.matcher((CharSequence)localObject2);
                if ((localObject3 != null) && (((Matcher)localObject3).matches()))
                  Assert.assertTrue("CreateTable failed:[" + (String)localObject2 + "][" + localException.getMessage() + "]", false);
                else
                  ab.w("MMKernel.CoreStorage", "CreateTable failed:[" + (String)localObject2 + "][" + localException.getMessage() + "]");
              }
            }
          }
        }
      }
      paramf.endTransaction();
      if ((!this.eJT) && (this.eJR != null) && (paramHashMap != null))
      {
        localObject1 = this.eJR;
        k = localInteger.intValue();
        if (k == 0)
          break label684;
      }
      label684: for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(bool);
        Assert.assertNotNull(paramHashMap);
        localObject2 = new bx();
        ((bx)localObject2).field_tableHash = k;
        ((bx)localObject2).field_tableSQLMD5 = paramHashMap;
        ((by)localObject1).fni.replace("TablesVersion", "tableHash", ((bx)localObject2).Hl());
        if ((this.eJS != null) && (paramHashMap != null))
          this.eJS.put(localInteger, paramHashMap);
        break;
      }
      label690: ab.i("MMKernel.CoreStorage", "createtables end sql:%d trans:%d sqlCount:%d", new Object[] { Long.valueOf(locala.Mr()), Long.valueOf(locala.Mr()), Integer.valueOf(i) });
    }
    AppMethodBeat.o(57960);
    return true;
  }

  public final boolean a(aj paramaj)
  {
    AppMethodBeat.i(57955);
    boolean bool1;
    if (paramaj == null)
    {
      ab.e("MMKernel.CoreStorage", "tryDataTransfer, dataTransferFactory is null");
      bool1 = false;
      AppMethodBeat.o(57955);
    }
    while (true)
    {
      return bool1;
      int i = bo.h((Integer)this.eJP.get(14, null));
      int j = com.tencent.mm.protocal.d.vxo;
      ab.d("MMKernel.CoreStorage", "tryDataTransfer, sVer = " + i + ", cVer = " + j);
      Object localObject = paramaj.getDataTransferList();
      if (localObject == null)
      {
        ab.e("MMKernel.CoreStorage", "tryDataTransfer, dataTransferList is null");
        bool1 = false;
        AppMethodBeat.o(57955);
      }
      else
      {
        if ((ae.gir > 0) && (ae.gis > 0))
          ab.w("MMKernel.CoreStorage", "tryDataTransfer, force data transfer");
        long l1;
        do
        {
          ab.d("MMKernel.CoreStorage", "tryDataTransfer dataTransferList size = " + ((List)localObject).size());
          ab.d("MMKernel.CoreStorage", "tryDataTransfer, threadId = " + Thread.currentThread().getId() + ", name = " + Thread.currentThread().getName());
          l1 = this.eJN.iV(Thread.currentThread().getId());
          try
          {
            Iterator localIterator = ((List)localObject).iterator();
            while (localIterator.hasNext())
            {
              paramaj = (ai)localIterator.next();
              long l2 = System.currentTimeMillis();
              paramaj.transfer(i);
              paramaj.flt = (System.currentTimeMillis() - l2);
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("doTransfer, timeConsumed = ");
              ab.d("MicroMsg.DataTransferBase", paramaj.flt + ", tag = " + paramaj.getTag());
            }
          }
          catch (Throwable paramaj)
          {
            AppMethodBeat.o(57955);
            throw paramaj;
          }
          finally
          {
            if (l1 > 0L)
              this.eJN.mB(l1);
            AppMethodBeat.o(57955);
          }
          if (i == j)
          {
            ab.i("MMKernel.CoreStorage", "tryDataTransfer, no need to transfer, sVer = " + i + ", cVer = " + j);
            bool1 = false;
            AppMethodBeat.o(57955);
            break;
          }
          bool1 = false;
          paramaj = ((List)localObject).iterator();
          while (paramaj.hasNext())
          {
            boolean bool2 = ((ai)paramaj.next()).kw(i);
            bool1 = bool2;
            if (bool2)
              bool1 = bool2;
          }
          ab.d("MMKernel.CoreStorage", "tryDataTransfer, needTransfer = ".concat(String.valueOf(bool1)));
        }
        while (bool1);
        bool1 = false;
        AppMethodBeat.o(57955);
        continue;
        if ((ae.gir != 0) && (ae.gis != 0))
        {
          j = 0;
          while (true)
          {
            i = ae.gir;
            if (j < i)
              try
              {
                Thread.sleep(ae.gis);
                j++;
              }
              catch (InterruptedException paramaj)
              {
                while (true)
                  ab.e("MMKernel.CoreStorage", "exception:%s", new Object[] { bo.l(paramaj) });
              }
          }
        }
        if (l1 > 0L)
          this.eJN.mB(l1);
        bool1 = true;
        AppMethodBeat.o(57955);
      }
    }
  }

  public final String getAccPath()
  {
    return this.eJM;
  }

  public final boolean isSDCardAvailable()
  {
    boolean bool1 = true;
    AppMethodBeat.i(57973);
    boolean bool2 = this.eJL.startsWith(com.tencent.mm.compatible.util.e.eSl);
    long l1 = bo.anU();
    long l2 = l1 - this.eJW;
    if (bool2)
    {
      g.RQ();
      if ((g.RN().QY()) && (l2 > 0L) && (l2 < 2000L) && (new File(this.eJL).exists()))
        AppMethodBeat.o(57973);
    }
    while (true)
    {
      return bool1;
      this.eJW = l1;
      boolean bool3 = com.tencent.mm.compatible.util.f.Mn();
      g.RQ();
      g.RN();
      ab.i("MMKernel.CoreStorage", "isSDCardAvail:%b uin:%s toNow:%d sysPath:[%s] sdRoot:[%s], acc init:[%b]", new Object[] { Boolean.valueOf(bool3), p.getString(a.QF()), Long.valueOf(l2), this.eJL, com.tencent.mm.compatible.util.e.eSl, Boolean.valueOf(g.RN().QY()) });
      if (!bool3)
      {
        AppMethodBeat.o(57973);
        bool1 = false;
      }
      else if (bool2)
      {
        AppMethodBeat.o(57973);
      }
      else
      {
        g.RQ();
        if (g.RN().QY())
        {
          ab.i("MMKernel.CoreStorage", "summer isSDCardAvailable accHasReady and remount");
          RC();
        }
        AppMethodBeat.o(57973);
      }
    }
  }

  public final void jC(String paramString)
  {
    AppMethodBeat.i(57963);
    if (this.eJO != null)
      this.eJO.closeDB();
    if (this.eJN != null)
      this.eJN.jC(paramString);
    this.eJI.onDataBaseClosed(this.eJN, this.eJO);
    this.eJT = false;
    AppMethodBeat.o(57963);
  }

  final void lJ(final String paramString)
  {
    AppMethodBeat.i(57959);
    File localFile = new File(paramString + "-recovery");
    if (localFile.isFile())
    {
      ab.i("MMKernel.CoreStorage", "Recovery database found, replace original one.");
      new File(paramString + ".ini").delete();
      paramString = new File(paramString);
      paramString.delete();
      if (!localFile.renameTo(paramString))
        ab.e("MMKernel.CoreStorage", "Rename database file failed!");
    }
    paramString = localFile.getName();
    paramString = localFile.getParentFile().listFiles(new FilenameFilter()
    {
      public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        AppMethodBeat.i(57939);
        boolean bool;
        if ((paramAnonymousString.startsWith(paramString)) && (!paramAnonymousString.equals(paramString)))
        {
          bool = true;
          AppMethodBeat.o(57939);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(57939);
        }
      }
    });
    if (paramString != null)
    {
      int i = paramString.length;
      for (int j = 0; j < i; j++)
      {
        localFile = paramString[j];
        ab.i("MMKernel.CoreStorage", "Delete temporary recovery database file: " + localFile.getName());
        localFile.delete();
      }
    }
    AppMethodBeat.o(57959);
  }

  public final SharedPreferences lK(String paramString)
  {
    AppMethodBeat.i(57966);
    g.RQ();
    g.RN();
    int i = a.QF();
    if (i != 0)
      if (this.eJV.containsKey(paramString))
      {
        paramString = (SharedPreferences)this.eJV.get(paramString);
        AppMethodBeat.o(57966);
      }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ah.getContext().getFilesDir().getParent() + "/shared_prefs/";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = ah.doA() + paramString + i + ".xml";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ah.doA() + paramString + i + ".xml.bak";
        File localFile = new java/io/File;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localFile.<init>((String)localObject1 + (String)localObject3);
        if (localFile.exists())
          localFile.delete();
        localFile = new java/io/File;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localFile.<init>((String)localObject1 + (String)localObject2);
        if (localFile.exists())
          localFile.delete();
        label254: localObject1 = ag.ck(String.valueOf(i / 2));
        localObject1 = ah.doA() + paramString + ag.ck(new StringBuilder().append(i).append((String)localObject1).toString());
        localObject1 = ah.getContext().getSharedPreferences((String)localObject1, 0);
        this.eJV.put(paramString, localObject1);
        AppMethodBeat.o(57966);
        paramString = (String)localObject1;
        continue;
        paramString = null;
        AppMethodBeat.o(57966);
      }
      catch (Exception localException)
      {
        break label254;
      }
    }
  }

  final class a
    implements Runnable
  {
    private a()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(57946);
      e.this.RA();
      AppMethodBeat.o(57946);
    }
  }

  public static final class b extends com.tencent.mm.ci.a<h.a>
    implements h.a
  {
    public final void RF()
    {
      AppMethodBeat.i(57950);
      a(new a.a()
      {
      });
      AppMethodBeat.o(57950);
    }

    public final void RG()
    {
      AppMethodBeat.i(57951);
      a(new a.a()
      {
      });
      AppMethodBeat.o(57951);
    }

    public final void RH()
    {
      AppMethodBeat.i(57952);
      a(new a.a()
      {
      });
      AppMethodBeat.o(57952);
    }
  }

  public static final class c
  {
    public boolean eKe = false;
    public int eKf = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.e
 * JD-Core Version:    0.6.2
 */