package com.tencent.mm.plugin.backup.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.bt.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.backup.i.m;
import com.tencent.mm.plugin.backup.i.x;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.btt;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.vfs.FileSystem;
import com.tencent.mm.vfs.FileSystemManager.d;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.conn.util.InetAddressUtils;

public final class g
{
  private static List<String> elZ = null;

  public static LinkedList<String> A(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17144);
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList != null)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
        localLinkedList.add(((f.b)paramLinkedList.next()).jrf);
    }
    AppMethodBeat.o(17144);
    return localLinkedList;
  }

  public static long EY(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(17120);
    paramString = new com.tencent.mm.vfs.b(paramString);
    long l;
    if (!paramString.exists())
    {
      l = -1L;
      AppMethodBeat.o(17120);
    }
    while (true)
    {
      return l;
      if (!paramString.canRead())
      {
        l = -2L;
        AppMethodBeat.o(17120);
      }
      else
      {
        FileSystemManager.d locald = paramString.dMA();
        if (!locald.valid());
        while (true)
        {
          if (bool)
            break label158;
          l = -3L;
          AppMethodBeat.o(17120);
          break;
          FileSystem localFileSystem = locald.zZs;
          if ((localFileSystem.aiR() & 0x1) != 0)
          {
            String str = localFileSystem.O(locald.path, true);
            if (str != null)
              bool = new File(str).canWrite();
            else
              bool = localFileSystem.exists(locald.path);
          }
        }
        label158: l = paramString.length();
        AppMethodBeat.o(17120);
      }
    }
  }

  public static String EZ(String paramString)
  {
    AppMethodBeat.i(17126);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = "";
      AppMethodBeat.o(17126);
    }
    while (true)
    {
      return paramString;
      paramString = aSF() + "backupItem/" + Fb(paramString);
      AppMethodBeat.o(17126);
    }
  }

  public static String Fa(String paramString)
  {
    AppMethodBeat.i(17127);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = "";
      AppMethodBeat.o(17127);
    }
    while (true)
    {
      return paramString;
      paramString = aSF() + "backupMeida/" + Fb(paramString);
      AppMethodBeat.o(17127);
    }
  }

  private static String Fb(String paramString)
  {
    AppMethodBeat.i(17128);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(17128);
    }
    while (true)
    {
      return paramString;
      String str1 = com.tencent.mm.a.g.x(paramString.getBytes());
      paramString = "";
      String str2 = "";
      if (str1.length() > 0)
        paramString = str1.charAt(0) + "/";
      if (str1.length() >= 2)
        str2 = str1.charAt(1) + "/";
      paramString = paramString + str2;
      AppMethodBeat.o(17128);
    }
  }

  // ERROR //
  public static boolean Fc(String paramString)
  {
    // Byte code:
    //   0: sipush 17130
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 171
    //   9: invokevirtual 175	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   12: astore_1
    //   13: iconst_4
    //   14: newarray byte
    //   16: dup
    //   17: iconst_0
    //   18: aload_1
    //   19: iconst_0
    //   20: aaload
    //   21: iconst_0
    //   22: invokestatic 181	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   25: sipush 255
    //   28: iand
    //   29: i2b
    //   30: bastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_1
    //   34: iconst_1
    //   35: aaload
    //   36: iconst_0
    //   37: invokestatic 181	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   40: sipush 255
    //   43: iand
    //   44: i2b
    //   45: bastore
    //   46: dup
    //   47: iconst_2
    //   48: aload_1
    //   49: iconst_2
    //   50: aaload
    //   51: iconst_0
    //   52: invokestatic 181	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   55: sipush 255
    //   58: iand
    //   59: i2b
    //   60: bastore
    //   61: dup
    //   62: iconst_3
    //   63: aload_1
    //   64: iconst_3
    //   65: aaload
    //   66: iconst_0
    //   67: invokestatic 181	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   70: sipush 255
    //   73: iand
    //   74: i2b
    //   75: bastore
    //   76: invokestatic 186	com/tencent/mm/a/o:A	([B)I
    //   79: istore_2
    //   80: iconst_4
    //   81: newarray byte
    //   83: dup
    //   84: iconst_0
    //   85: ldc 187
    //   87: bastore
    //   88: dup
    //   89: iconst_1
    //   90: ldc 187
    //   92: bastore
    //   93: dup
    //   94: iconst_2
    //   95: ldc 187
    //   97: bastore
    //   98: dup
    //   99: iconst_3
    //   100: ldc 188
    //   102: bastore
    //   103: invokestatic 186	com/tencent/mm/a/o:A	([B)I
    //   106: istore_3
    //   107: invokestatic 194	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   110: ldc 196
    //   112: invokevirtual 202	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   115: checkcast 204	android/net/wifi/WifiManager
    //   118: astore_1
    //   119: aload_1
    //   120: invokevirtual 207	android/net/wifi/WifiManager:getWifiState	()I
    //   123: iconst_3
    //   124: if_icmpne +134 -> 258
    //   127: aload_1
    //   128: invokevirtual 211	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   131: invokevirtual 216	android/net/wifi/WifiInfo:getIpAddress	()I
    //   134: istore 4
    //   136: ldc 218
    //   138: ldc 220
    //   140: iconst_2
    //   141: anewarray 4	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_0
    //   147: aastore
    //   148: dup
    //   149: iconst_1
    //   150: new 125	java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   157: iload 4
    //   159: sipush 255
    //   162: iand
    //   163: invokevirtual 223	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   166: ldc 225
    //   168: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: iload 4
    //   173: bipush 8
    //   175: ishr
    //   176: sipush 255
    //   179: iand
    //   180: invokevirtual 223	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   183: ldc 225
    //   185: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: iload 4
    //   190: bipush 16
    //   192: ishr
    //   193: sipush 255
    //   196: iand
    //   197: invokevirtual 223	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   200: ldc 225
    //   202: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: iload 4
    //   207: bipush 24
    //   209: ishr
    //   210: sipush 255
    //   213: iand
    //   214: invokevirtual 223	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   217: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: aastore
    //   221: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: iload_3
    //   225: iload_2
    //   226: iand
    //   227: iload 4
    //   229: iload_3
    //   230: iand
    //   231: if_icmpne +15 -> 246
    //   234: sipush 17130
    //   237: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: iconst_1
    //   241: istore 5
    //   243: iload 5
    //   245: ireturn
    //   246: sipush 17130
    //   249: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: iconst_0
    //   253: istore 5
    //   255: goto -12 -> 243
    //   258: aload_1
    //   259: invokevirtual 234	java/lang/Object:getClass	()Ljava/lang/Class;
    //   262: ldc 236
    //   264: invokevirtual 242	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   267: aload_1
    //   268: invokevirtual 248	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   271: checkcast 250	java/lang/Integer
    //   274: invokevirtual 253	java/lang/Integer:intValue	()I
    //   277: istore 4
    //   279: aload_1
    //   280: invokevirtual 234	java/lang/Object:getClass	()Ljava/lang/Class;
    //   283: ldc 255
    //   285: iconst_0
    //   286: anewarray 238	java/lang/Class
    //   289: invokevirtual 259	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   292: aload_1
    //   293: iconst_0
    //   294: anewarray 4	java/lang/Object
    //   297: invokevirtual 265	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   300: checkcast 250	java/lang/Integer
    //   303: invokevirtual 253	java/lang/Integer:intValue	()I
    //   306: istore 6
    //   308: iload 6
    //   310: iload 4
    //   312: if_icmpne +66 -> 378
    //   315: ldc 218
    //   317: ldc_w 267
    //   320: invokestatic 270	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   323: iload_3
    //   324: iload_2
    //   325: invokestatic 274	com/tencent/mm/plugin/backup/b/g:dz	(II)Z
    //   328: istore 5
    //   330: sipush 17130
    //   333: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   336: goto -93 -> 243
    //   339: astore_0
    //   340: bipush 13
    //   342: istore 4
    //   344: ldc 218
    //   346: ldc_w 276
    //   349: iconst_1
    //   350: anewarray 4	java/lang/Object
    //   353: dup
    //   354: iconst_0
    //   355: aload_0
    //   356: aastore
    //   357: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: ldc 218
    //   362: aload_0
    //   363: ldc 118
    //   365: iconst_0
    //   366: anewarray 4	java/lang/Object
    //   369: invokestatic 283	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   372: iconst_0
    //   373: istore 6
    //   375: goto -67 -> 308
    //   378: ldc 218
    //   380: ldc_w 285
    //   383: iconst_1
    //   384: anewarray 4	java/lang/Object
    //   387: dup
    //   388: iconst_0
    //   389: iload 6
    //   391: invokestatic 289	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   394: aastore
    //   395: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: sipush 17130
    //   401: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   404: iconst_0
    //   405: istore 5
    //   407: goto -164 -> 243
    //   410: astore_0
    //   411: goto -67 -> 344
    //
    // Exception table:
    //   from	to	target	type
    //   258	279	339	java/lang/Exception
    //   279	308	410	java/lang/Exception
  }

  public static boolean Fd(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(17132);
    if (paramString == null)
      AppMethodBeat.o(17132);
    while (true)
    {
      return bool;
      int i = paramString.indexOf('<');
      String str = paramString;
      if (i > 0)
        str = paramString.substring(i);
      if (br.z(str, "msg") != null)
      {
        bool = true;
        AppMethodBeat.o(17132);
      }
      else
      {
        AppMethodBeat.o(17132);
      }
    }
  }

  public static long Fe(String paramString)
  {
    AppMethodBeat.i(17136);
    long l1 = 0L;
    long l2 = l1;
    if (!bo.isNullOrNil(paramString));
    try
    {
      l2 = Long.valueOf(paramString).longValue();
      AppMethodBeat.o(17136);
      return l2;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupUtil", paramString, "", new Object[0]);
        l2 = l1;
      }
    }
  }

  public static long Ff(String paramString)
  {
    AppMethodBeat.i(17143);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    long l1 = bo.anU();
    try
    {
      l2 = localSimpleDateFormat.parse(paramString).getTime();
      AppMethodBeat.o(17143);
      return l2;
    }
    catch (ParseException localParseException)
    {
      while (true)
      {
        ab.e("MicroMsg.BackupUtil", "dateToTimeStamp failed. date:%s, stack:%s", new Object[] { paramString, bo.dpG() });
        long l2 = l1;
      }
    }
  }

  public static List<String> Ko()
  {
    AppMethodBeat.i(17141);
    List localList;
    if (elZ != null)
    {
      localList = elZ;
      AppMethodBeat.o(17141);
    }
    while (true)
    {
      return localList;
      elZ = new LinkedList();
      for (localList : t.fkY)
        elZ.add(localList);
      elZ.add("weixin");
      elZ.add("weibo");
      elZ.add("qqmail");
      elZ.add("fmessage");
      elZ.add("tmessage");
      elZ.add("qmessage");
      elZ.add("qqsync");
      elZ.add("floatbottle");
      elZ.add("lbsapp");
      elZ.add("shakeapp");
      elZ.add("medianote");
      elZ.add("qqfriend");
      elZ.add("readerapp");
      elZ.add("newsapp");
      elZ.add("blogapp");
      elZ.add("facebookapp");
      elZ.add("masssendapp");
      elZ.add("meishiapp");
      elZ.add("feedsapp");
      elZ.add("voipapp");
      elZ.add("officialaccounts");
      elZ.add("helper_entry");
      elZ.add("pc_share");
      elZ.add("cardpackage");
      elZ.add("voicevoipapp");
      elZ.add("voiceinputapp");
      elZ.add("linkedinplugin");
      elZ.add("appbrandcustomerservicemsg");
      localList = elZ;
      AppMethodBeat.o(17141);
    }
  }

  public static <T extends a> T a(T paramT, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17118);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      AppMethodBeat.o(17118);
      paramT = null;
    }
    while (true)
    {
      return paramT;
      try
      {
        paramT.parseFrom(paramArrayOfByte);
        AppMethodBeat.o(17118);
      }
      catch (Exception paramT)
      {
        ab.e("MicroMsg.BackupUtil", "ERROR: parseProBuf [%s] [%s]", new Object[] { paramT.getMessage(), bo.l(paramT) });
        AppMethodBeat.o(17118);
        paramT = null;
      }
    }
  }

  public static String a(gu paramgu, int paramInt)
  {
    AppMethodBeat.i(17133);
    paramgu = a(paramgu, paramInt, null);
    AppMethodBeat.o(17133);
    return paramgu;
  }

  public static String a(gu paramgu, int paramInt, String paramString)
  {
    AppMethodBeat.i(17134);
    if ((paramgu.vJf == paramInt) && (paramgu.vJd != null))
    {
      paramgu = com.tencent.mm.a.g.x(paramgu.vJd.getBuffer().wR);
      AppMethodBeat.o(17134);
    }
    while (true)
    {
      return paramgu;
      if ((paramgu.vJc != null) && (paramgu.vJb != null))
      {
        Iterator localIterator = paramgu.vJc.iterator();
        int i = 0;
        while (true)
        {
          if (!localIterator.hasNext())
            break label195;
          if (((btt)localIterator.next()).wVK == paramInt)
          {
            String str = ((bts)paramgu.vJb.get(i)).wVI;
            if ((!bo.isNullOrNil(paramString)) && (!str.endsWith(paramString)))
            {
              i = i + 1 + 1;
              continue;
            }
            if (e.ct(Fa(str) + str))
            {
              AppMethodBeat.o(17134);
              paramgu = str;
              break;
            }
            AppMethodBeat.o(17134);
            paramgu = null;
            break;
          }
          i++;
        }
      }
      label195: AppMethodBeat.o(17134);
      paramgu = null;
    }
  }

  public static String a(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(17145);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(17145);
    while (true)
    {
      return paramString1;
      int i;
      int k;
      label52: String str;
      if (paramString1.equals(""))
      {
        paramString1 = new StringBuilder(paramArrayOfString[0]);
        i = 1;
        int j = paramArrayOfString.length;
        k = 0;
        if (k >= j)
          break label105;
        str = paramArrayOfString[k];
        if (i == 0)
          break label91;
        i = 0;
      }
      while (true)
      {
        k++;
        break label52;
        paramString1 = new StringBuilder(paramString1);
        i = 0;
        break;
        label91: paramString1.append(paramString2).append(str);
      }
      label105: paramString1 = paramString1.toString();
      AppMethodBeat.o(17145);
    }
  }

  // ERROR //
  public static void a(String paramString, x paramx)
  {
    // Byte code:
    //   0: sipush 17119
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aconst_null
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_2
    //   11: astore 4
    //   13: new 60	com/tencent/mm/vfs/b
    //   16: astore 5
    //   18: aload_2
    //   19: astore 4
    //   21: aload 5
    //   23: aload_0
    //   24: invokespecial 63	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   27: aload_2
    //   28: astore 4
    //   30: aload 5
    //   32: invokevirtual 66	com/tencent/mm/vfs/b:exists	()Z
    //   35: ifne +12 -> 47
    //   38: aload_2
    //   39: astore 4
    //   41: aload 5
    //   43: invokevirtual 492	com/tencent/mm/vfs/b:mkdirs	()Z
    //   46: pop
    //   47: aload_2
    //   48: astore 4
    //   50: new 125	java/lang/StringBuilder
    //   53: astore 5
    //   55: aload_2
    //   56: astore 4
    //   58: aload 5
    //   60: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   63: aload_2
    //   64: astore 4
    //   66: aload 5
    //   68: aload_0
    //   69: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: aload_1
    //   73: getfield 497	com/tencent/mm/plugin/backup/i/x:jCx	Ljava/lang/String;
    //   76: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: astore 5
    //   84: aload_2
    //   85: astore 4
    //   87: new 60	com/tencent/mm/vfs/b
    //   90: astore_0
    //   91: aload_2
    //   92: astore 4
    //   94: aload_0
    //   95: aload 5
    //   97: invokespecial 63	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   100: aload_2
    //   101: astore 4
    //   103: aload_0
    //   104: invokevirtual 66	com/tencent/mm/vfs/b:exists	()Z
    //   107: ifne +11 -> 118
    //   110: aload_2
    //   111: astore 4
    //   113: aload_0
    //   114: invokevirtual 500	com/tencent/mm/vfs/b:createNewFile	()Z
    //   117: pop
    //   118: aload_2
    //   119: astore 4
    //   121: new 502	java/io/RandomAccessFile
    //   124: astore_0
    //   125: aload_2
    //   126: astore 4
    //   128: aload_0
    //   129: aload 5
    //   131: ldc_w 504
    //   134: invokespecial 506	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: aload_0
    //   138: aload_1
    //   139: getfield 509	com/tencent/mm/plugin/backup/i/x:jCz	I
    //   142: i2l
    //   143: invokevirtual 513	java/io/RandomAccessFile:setLength	(J)V
    //   146: aload_0
    //   147: aload_1
    //   148: getfield 516	com/tencent/mm/plugin/backup/i/x:jCA	I
    //   151: i2l
    //   152: invokevirtual 519	java/io/RandomAccessFile:seek	(J)V
    //   155: aload_0
    //   156: aload_1
    //   157: getfield 523	com/tencent/mm/plugin/backup/i/x:jBi	Lcom/tencent/mm/bt/b;
    //   160: getfield 456	com/tencent/mm/bt/b:wR	[B
    //   163: invokevirtual 527	java/io/RandomAccessFile:write	([B)V
    //   166: aload_0
    //   167: invokevirtual 530	java/io/RandomAccessFile:close	()V
    //   170: sipush 17119
    //   173: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: return
    //   177: astore_0
    //   178: sipush 17119
    //   181: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: goto -8 -> 176
    //   187: astore_1
    //   188: aload_3
    //   189: astore_0
    //   190: aload_0
    //   191: astore 4
    //   193: ldc 218
    //   195: aload_1
    //   196: ldc_w 532
    //   199: iconst_0
    //   200: anewarray 4	java/lang/Object
    //   203: invokestatic 283	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload_0
    //   207: ifnull +7 -> 214
    //   210: aload_0
    //   211: invokevirtual 530	java/io/RandomAccessFile:close	()V
    //   214: sipush 17119
    //   217: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: goto -44 -> 176
    //   223: astore_0
    //   224: sipush 17119
    //   227: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: goto -54 -> 176
    //   233: astore_0
    //   234: aload 4
    //   236: ifnull +8 -> 244
    //   239: aload 4
    //   241: invokevirtual 530	java/io/RandomAccessFile:close	()V
    //   244: sipush 17119
    //   247: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: aload_0
    //   251: athrow
    //   252: astore_1
    //   253: goto -9 -> 244
    //   256: astore_1
    //   257: aload_0
    //   258: astore 4
    //   260: aload_1
    //   261: astore_0
    //   262: goto -28 -> 234
    //   265: astore_1
    //   266: goto -76 -> 190
    //
    // Exception table:
    //   from	to	target	type
    //   166	170	177	java/lang/Exception
    //   13	18	187	java/lang/Exception
    //   21	27	187	java/lang/Exception
    //   30	38	187	java/lang/Exception
    //   41	47	187	java/lang/Exception
    //   50	55	187	java/lang/Exception
    //   58	63	187	java/lang/Exception
    //   66	84	187	java/lang/Exception
    //   87	91	187	java/lang/Exception
    //   94	100	187	java/lang/Exception
    //   103	110	187	java/lang/Exception
    //   113	118	187	java/lang/Exception
    //   121	125	187	java/lang/Exception
    //   128	137	187	java/lang/Exception
    //   210	214	223	java/lang/Exception
    //   13	18	233	finally
    //   21	27	233	finally
    //   30	38	233	finally
    //   41	47	233	finally
    //   50	55	233	finally
    //   58	63	233	finally
    //   66	84	233	finally
    //   87	91	233	finally
    //   94	100	233	finally
    //   103	110	233	finally
    //   113	118	233	finally
    //   121	125	233	finally
    //   128	137	233	finally
    //   193	206	233	finally
    //   239	244	252	java/lang/Exception
    //   137	166	256	finally
    //   137	166	265	java/lang/Exception
  }

  public static boolean a(PLong paramPLong1, PLong paramPLong2, String paramString)
  {
    AppMethodBeat.i(17142);
    StatFs localStatFs = new StatFs(h.getExternalStorageDirectory().getPath());
    long l1 = localStatFs.getBlockSize();
    paramPLong1.value = (localStatFs.getAvailableBlocks() * l1);
    File localFile = h.getDataDirectory();
    localStatFs = new StatFs(localFile.getPath());
    long l2 = localStatFs.getBlockCount();
    l1 = localStatFs.getAvailableBlocks();
    paramPLong2.value = (localStatFs.getBlockSize() * localStatFs.getAvailableBlocks());
    ab.i("MicroMsg.BackupUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", new Object[] { Long.valueOf(paramPLong1.value), Long.valueOf(paramPLong2.value), Long.valueOf(0L) });
    boolean bool;
    if (l2 <= 0L)
    {
      bool = false;
      AppMethodBeat.o(17142);
    }
    while (true)
    {
      return bool;
      if (l2 - l1 < 0L)
      {
        bool = false;
        AppMethodBeat.o(17142);
      }
      else
      {
        if ((paramPLong1.value == paramPLong2.value) || (paramString.startsWith(localFile.getPath())))
          paramPLong1.value = 0L;
        if (0L > paramPLong2.value)
        {
          bool = false;
          AppMethodBeat.o(17142);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(17142);
        }
      }
    }
  }

  public static String aSF()
  {
    AppMethodBeat.i(17125);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = c.getAccPath() + "backupRecover/";
    AppMethodBeat.o(17125);
    return localObject;
  }

  public static int aSG()
  {
    int i = 100;
    AppMethodBeat.i(17129);
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = ah.getContext().registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null)
    {
      AppMethodBeat.o(17129);
      return i;
    }
    int j = ((Intent)localObject).getIntExtra("status", -1);
    if ((j == 2) || (j == 5));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery isCharging[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        break label99;
      AppMethodBeat.o(17129);
      break;
    }
    label99: i = ((Intent)localObject).getIntExtra("level", -1);
    j = ((Intent)localObject).getIntExtra("scale", -1);
    if ((i >= 0) && (j > 0));
    for (i = i * 100 / j; ; i = 100)
    {
      ab.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery level remaining[%d]", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(17129);
      break;
    }
  }

  public static int b(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17123);
    try
    {
      Object localObject = new com/tencent/mm/vfs/b;
      ((com.tencent.mm.vfs.b)localObject).<init>(paramString1);
      if (!((com.tencent.mm.vfs.b)localObject).exists())
        ((com.tencent.mm.vfs.b)localObject).mkdirs();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = paramString1 + "/" + paramString2;
      paramString1 = new com/tencent/mm/vfs/b;
      paramString1.<init>(paramString2);
      if (!paramString1.exists())
        paramString1.createNewFile();
      i = e.a(paramString2, paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(17123);
      return i;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupUtil", paramString1, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(17123);
      }
    }
  }

  public static LinkedList<f.a> b(LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    AppMethodBeat.i(17148);
    if ((paramLinkedList == null) || (paramLinkedList1 == null) || (paramLinkedList.isEmpty()) || (paramLinkedList.size() * 2 != paramLinkedList1.size()))
    {
      paramLinkedList = null;
      AppMethodBeat.o(17148);
    }
    while (true)
    {
      return paramLinkedList;
      LinkedList localLinkedList = new LinkedList();
      HashMap localHashMap = new HashMap();
      paramLinkedList1 = paramLinkedList1.iterator();
      paramLinkedList = paramLinkedList.iterator();
      long l1 = 0L;
      long l2 = 0L;
      if (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        long l3 = l1;
        if (paramLinkedList1.hasNext())
        {
          long l4 = ((Long)paramLinkedList1.next()).longValue();
          l2 = l4;
          l3 = l1;
          if (paramLinkedList1.hasNext())
          {
            l3 = ((Long)paramLinkedList1.next()).longValue();
            l2 = l4;
          }
        }
        int i = localHashMap.size();
        if (localHashMap.get(str) != null)
          i = ((Integer)localHashMap.get(str)).intValue();
        while (true)
        {
          localLinkedList.add(new f.a(i, str, l2, l3));
          l1 = l3;
          break;
          localHashMap.put(str, Integer.valueOf(i));
        }
      }
      AppMethodBeat.o(17148);
      paramLinkedList = localLinkedList;
    }
  }

  public static void b(String paramString, x paramx)
  {
    AppMethodBeat.i(17121);
    if ((TextUtils.isEmpty(paramString)) || (paramx == null))
    {
      ab.e("MicroMsg.BackupUtil", "appendFile dir:%s req:%s ", new Object[] { paramString, paramx });
      AppMethodBeat.o(17121);
    }
    while (true)
    {
      return;
      if ((TextUtils.isEmpty(paramx.jCx)) || (paramx.jBi == null) || (bo.cc(paramx.jBi.wR) <= 0))
      {
        String str = paramx.jCx;
        com.tencent.mm.bt.b localb = paramx.jBi;
        if (paramx.jBi == null);
        for (paramString = "null"; ; paramString = Integer.valueOf(bo.cc(paramx.jBi.wR)))
        {
          ab.e("MicroMsg.BackupUtil", "appendFile dataid:%s data:%s  %s", new Object[] { str, localb, paramString });
          AppMethodBeat.o(17121);
          break;
        }
      }
      int j;
      for (int i = 3; ; i = j)
      {
        j = i - 1;
        if (i <= 0)
          break label312;
        long l1 = EY(paramString + paramx.jCx);
        i = c(paramString, paramx);
        long l2 = EY(paramString + paramx.jCx);
        if ((i == 0) && (l2 >= paramx.jBi.wR.length))
        {
          AppMethodBeat.o(17121);
          break;
        }
        ab.e("MicroMsg.BackupUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(paramx.jBi.wR.length) });
      }
      label312: AppMethodBeat.o(17121);
    }
  }

  public static boolean b(gu paramgu, int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(17137);
    if (paramgu.vJf == paramInt)
    {
      paramgu = paramgu.vJd.getBuffer().wR;
      if (paramgu.length <= 0)
        AppMethodBeat.o(17137);
    }
    while (true)
    {
      return bool;
      e.b(paramString, paramgu, paramgu.length);
      AppMethodBeat.o(17137);
      bool = true;
      continue;
      paramgu = a(paramgu, paramInt, null);
      if (!bo.isNullOrNil(paramgu))
      {
        e.y(Fa(paramgu) + paramgu, paramString);
        AppMethodBeat.o(17137);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(17137);
      }
    }
  }

  public static byte[] b(gu paramgu, int paramInt)
  {
    AppMethodBeat.i(17138);
    if ((paramgu.vJf == paramInt) && (paramgu.vJd != null))
    {
      paramgu = paramgu.vJd.getBuffer().wR;
      AppMethodBeat.o(17138);
    }
    while (true)
    {
      return paramgu;
      if ((paramgu.vJc != null) && (paramgu.vJb != null))
      {
        Iterator localIterator = paramgu.vJc.iterator();
        for (int i = 0; ; i++)
        {
          if (!localIterator.hasNext())
            break label184;
          if (((btt)localIterator.next()).wVK == paramInt)
          {
            paramgu = ((bts)paramgu.vJb.get(i)).wVI;
            paramgu = Fa(paramgu) + paramgu;
            paramInt = (int)e.asZ(paramgu);
            if ((paramInt == 0) || (paramInt > 1048576))
            {
              ab.e("MicroMsg.BackupUtil", "thumb not exist or  too big!");
              AppMethodBeat.o(17138);
              paramgu = null;
              break;
            }
            paramgu = e.e(paramgu, 0, -1);
            AppMethodBeat.o(17138);
            break;
          }
        }
      }
      label184: AppMethodBeat.o(17138);
      paramgu = null;
    }
  }

  public static int bC(String paramString, int paramInt)
  {
    AppMethodBeat.i(17135);
    int i = paramInt;
    if (!bo.isNullOrNil(paramString));
    try
    {
      i = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(17135);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupUtil", paramString, "", new Object[0]);
        i = paramInt;
      }
    }
  }

  public static int c(gu paramgu, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(17139);
    if (paramgu.vJf == paramInt)
      if (paramgu.vJd == null)
      {
        AppMethodBeat.o(17139);
        paramInt = i;
      }
    while (true)
    {
      return paramInt;
      paramInt = paramgu.vJd.getBuffer().wR.length;
      AppMethodBeat.o(17139);
      continue;
      if ((paramgu.vJc != null) && (paramgu.vJb != null))
      {
        Iterator localIterator = paramgu.vJc.iterator();
        for (int j = 0; ; j++)
        {
          if (!localIterator.hasNext())
            break label161;
          if (((btt)localIterator.next()).wVK == paramInt)
          {
            paramgu = ((bts)paramgu.vJb.get(j)).wVI;
            paramInt = (int)e.asZ(Fa(paramgu) + paramgu);
            AppMethodBeat.o(17139);
            break;
          }
        }
      }
      label161: AppMethodBeat.o(17139);
      paramInt = i;
    }
  }

  private static int c(String paramString, x paramx)
  {
    AppMethodBeat.i(17122);
    try
    {
      Object localObject = new com/tencent/mm/vfs/b;
      ((com.tencent.mm.vfs.b)localObject).<init>(paramString);
      if (!((com.tencent.mm.vfs.b)localObject).exists())
        ((com.tencent.mm.vfs.b)localObject).mkdirs();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString = paramString + "/" + paramx.jCx;
      localObject = new com/tencent/mm/vfs/b;
      ((com.tencent.mm.vfs.b)localObject).<init>(paramString);
      if (!((com.tencent.mm.vfs.b)localObject).exists())
        ((com.tencent.mm.vfs.b)localObject).createNewFile();
      paramx = paramx.jBi.wR;
      i = e.a(paramString, paramx, paramx.length);
      AppMethodBeat.o(17122);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupUtil", paramString, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(17122);
      }
    }
  }

  public static String[] cX(String paramString1, String paramString2)
  {
    AppMethodBeat.i(17146);
    paramString1 = paramString1.split(paramString2);
    AppMethodBeat.o(17146);
    return paramString1;
  }

  public static boolean d(gu paramgu, int paramInt)
  {
    AppMethodBeat.i(17140);
    boolean bool;
    if ((paramgu.vJf == paramInt) && (paramgu.vJd != null))
    {
      AppMethodBeat.o(17140);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramgu = paramgu.vJc.iterator();
      while (true)
        if (paramgu.hasNext())
          if (((btt)paramgu.next()).wVK == paramInt)
          {
            AppMethodBeat.o(17140);
            bool = true;
            break;
          }
      bool = false;
      AppMethodBeat.o(17140);
    }
  }

  public static String ds(Context paramContext)
  {
    AppMethodBeat.i(17124);
    Object localObject = (WifiManager)paramContext.getSystemService("wifi");
    if (((WifiManager)localObject).getWifiState() == 3);
    while (true)
    {
      try
      {
        localObject = at.gE(paramContext);
        paramContext = (Context)localObject;
        if (bo.isNullOrNil((String)localObject))
          paramContext = "wifi";
        localObject = paramContext;
        if (paramContext.length() >= 2)
        {
          localObject = paramContext;
          if (paramContext.startsWith("\""))
          {
            localObject = paramContext;
            if (paramContext.endsWith("\""))
              localObject = paramContext.substring(1, paramContext.length() - 1);
          }
        }
        AppMethodBeat.o(17124);
        paramContext = (Context)localObject;
        return paramContext;
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.BackupUtil", "getConnectionInfo %s", new Object[] { paramContext });
        ab.printErrStackTrace("MicroMsg.BackupUtil", paramContext, "", new Object[0]);
        paramContext = "";
        AppMethodBeat.o(17124);
        continue;
      }
      int i = 13;
      try
      {
        j = ((Integer)localObject.getClass().getField("WIFI_AP_STATE_ENABLED").get(localObject)).intValue();
        i = j;
        k = ((Integer)localObject.getClass().getMethod("getWifiApState", new Class[0]).invoke(localObject, new Object[0])).intValue();
        i = k;
        k = j;
        j = i;
        if (j == k)
          ab.i("MicroMsg.BackupUtil", "getWifiName apmode");
      }
      catch (Exception paramContext)
      {
        try
        {
          paramContext = ((WifiConfiguration)localObject.getClass().getMethod("getWifiApConfiguration", new Class[0]).invoke(localObject, new Object[0])).SSID;
          AppMethodBeat.o(17124);
          continue;
          paramContext = paramContext;
          ab.e("MicroMsg.BackupUtil", "getWifiApState %s", new Object[] { paramContext });
          ab.printErrStackTrace("MicroMsg.BackupUtil", paramContext, "", new Object[0]);
          int j = 0;
          int k = i;
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.BackupUtil", "getWifiApConfiguration %s", new Object[] { paramContext });
          ab.printErrStackTrace("MicroMsg.BackupUtil", paramContext, "", new Object[0]);
        }
        paramContext = "";
        AppMethodBeat.o(17124);
      }
    }
  }

  private static boolean dz(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(17131);
    try
    {
      label48: int i;
      do
      {
        do
        {
          do
          {
            Iterator localIterator1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            break label48;
            Iterator localIterator2;
            while (!localIterator2.hasNext())
            {
              if (!localIterator1.hasNext())
                break;
              localIterator2 = Collections.list(((NetworkInterface)localIterator1.next()).getInetAddresses()).iterator();
            }
            localObject = (InetAddress)localIterator2.next();
          }
          while (((InetAddress)localObject).isLoopbackAddress());
          localObject = ((InetAddress)localObject).getHostAddress().toUpperCase();
          bool = InetAddressUtils.isIPv4Address((String)localObject);
          ab.i("MicroMsg.BackupUtil", "check ip:%s, isIPv4:%b", new Object[] { localObject, Boolean.valueOf(bool) });
        }
        while (!bool);
        Object localObject = ((String)localObject).split("\\.");
        i = o.A(new byte[] { (byte)(bo.getInt(localObject[0], 0) & 0xFF), (byte)(bo.getInt(localObject[1], 0) & 0xFF), (byte)(bo.getInt(localObject[2], 0) & 0xFF), (byte)(bo.getInt(localObject[3], 0) & 0xFF) });
      }
      while ((paramInt1 & paramInt2) != (i & paramInt1));
      AppMethodBeat.o(17131);
      bool = true;
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(17131);
        boolean bool = false;
      }
    }
  }

  public static m gw(long paramLong)
  {
    AppMethodBeat.i(17147);
    m localm = new m();
    String str1 = q.getDeviceID(ah.getContext());
    String str2 = str1;
    if (str1 == null)
      str2 = q.LM();
    localm.jBE = str2;
    localm.jBF = Build.MANUFACTURER;
    localm.jBG = Build.MODEL;
    localm.jBH = "Android";
    localm.jBI = Build.VERSION.RELEASE;
    localm.jBJ = d.vxo;
    localm.jBK = paramLong;
    ab.i("MicroMsg.BackupUtil", "getBackupStartGeneralInfo WechatVersion[%s], freespace[%d], deviceId[%s]", new Object[] { Integer.valueOf(d.vxo), Long.valueOf(paramLong), localm.jBE });
    AppMethodBeat.o(17147);
    return localm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.b.g
 * JD-Core Version:    0.6.2
 */