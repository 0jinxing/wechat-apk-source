package com.tencent.mm.plugin.report.service;

import android.content.Context;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
{
  private static String filePath;
  private static Byte pYa;

  static
  {
    AppMethodBeat.i(72739);
    filePath = getAppFilePath() + "/kvcomm/exception/";
    pYa = Byte.valueOf((byte)0);
    if (!com.tencent.mm.a.e.ct(filePath))
      com.tencent.mm.a.e.cw(filePath);
    AppMethodBeat.o(72739);
  }

  public static void a(int paramInt1, int paramInt2, String arg2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(72735);
    if (!com.tencent.mm.a.e.ct(filePath))
    {
      ab.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, filepath:" + filePath + " not exist , logId:" + paramInt1 + ", type:" + paramInt2 + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1 + ", ignoreFreqLimit:" + paramBoolean3);
      AppMethodBeat.o(72735);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ReportManagerKvCheck", "saveKVcommData, logId:" + paramInt1 + ", type:" + paramInt2 + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1 + "," + paramBoolean3);
      String str = cgr();
      if ("MM".equals(str))
      {
        ab.e("MicroMsg.ReportManagerKvCheck", "error path, invalid processname:" + str + ", logId:" + paramInt1 + ", type:" + paramInt2 + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1 + ", ignoreFreqLimit:" + paramBoolean3);
        AppMethodBeat.o(72735);
        continue;
      }
      str = filePath + str + ".statictis_new2";
      Object localObject2 = new c();
      ((c)localObject2).pXL = paramInt1;
      ((c)localObject2).jCt = paramInt2;
      ((c)localObject2).pXM = ???;
      ((c)localObject2).pXE = paramBoolean2;
      ((c)localObject2).pXN = paramBoolean1;
      ((c)localObject2).pXO = paramBoolean3;
      try
      {
        localObject2 = ((c)localObject2).toByteArray();
        if (localObject2 != null)
          break label403;
        ab.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, null == temp.");
        AppMethodBeat.o(72735);
      }
      catch (IOException )
      {
        ab.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + ???.getMessage());
        AppMethodBeat.o(72735);
      }
      continue;
      synchronized (pYa)
      {
        label403: if (com.tencent.mm.a.e.e(str, intToByteArray(localObject2.length)) != 0)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("saveKVcommData, write obj_len to file:");
          ab.e("MicroMsg.ReportManagerKvCheck", str + " fail.");
          AppMethodBeat.o(72735);
          continue;
        }
        if (com.tencent.mm.a.e.e(str, (byte[])localObject2) != 0)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("saveKVcommData, write object to file:");
          ab.e("MicroMsg.ReportManagerKvCheck", str + " fail.");
        }
        AppMethodBeat.o(72735);
      }
    }
  }

  private static int bf(byte[] paramArrayOfByte)
  {
    int i = 0;
    int k;
    int m;
    for (int j = 0; ; j = ((m & 0xFF) << (3 - k) * 8) + j)
    {
      k = i;
      if (k >= 4)
        break;
      m = paramArrayOfByte[k];
      i = k + 1;
    }
    return j;
  }

  public static void cgq()
  {
    AppMethodBeat.i(72734);
    if (!com.tencent.mm.a.e.ct(filePath))
    {
      ab.w("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, filepath:" + filePath + " not exist.");
      AppMethodBeat.o(72734);
    }
    while (true)
    {
      return;
      File[] arrayOfFile = new File(filePath).listFiles();
      if (arrayOfFile == null)
      {
        ab.e("MicroMsg.ReportManagerKvCheck", "list file fail, filePath:" + filePath);
        AppMethodBeat.o(72734);
      }
      else
      {
        while (true)
        {
          String str;
          int k;
          Object localObject3;
          synchronized (pYa)
          {
            int i = arrayOfFile.length;
            int j = 0;
            if (j >= i)
              break;
            localObject2 = arrayOfFile[j];
            if (localObject2 == null)
            {
              ab.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, file is null");
              j++;
              continue;
            }
            str = ((File)localObject2).getAbsolutePath();
            k = 0;
            int m = com.tencent.mm.a.e.cs(str);
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("loadFilesToReport, filename:");
            ab.d("MicroMsg.ReportManagerKvCheck", ((File)localObject2).getAbsolutePath() + ", filelenth:" + m);
            if (k >= m)
            {
              ab.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, read to end, deletefile:".concat(String.valueOf(str)));
              com.tencent.mm.a.e.deleteFile(str);
            }
          }
          Object localObject2 = com.tencent.mm.a.e.e(str, k, 4);
          if (localObject2 == null)
          {
            ab.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, get obj_len fail. delete file:".concat(String.valueOf(str)));
          }
          else
          {
            int n = k + 4;
            k = bf((byte[])localObject2);
            localObject2 = com.tencent.mm.a.e.e(str, n, k);
            if (localObject2 == null)
            {
              ab.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, get obj_data fail. delete file:".concat(String.valueOf(str)));
            }
            else
            {
              k = n + k;
              if (str.contains(".statictis_new2"))
              {
                localObject3 = new com/tencent/mm/plugin/report/service/c;
                ((c)localObject3).<init>();
              }
              while (true)
              {
                int i1;
                boolean bool2;
                boolean bool3;
                long l1;
                long l2;
                try
                {
                  ((c)localObject3).parseFrom((byte[])localObject2);
                  n = ((c)localObject3).pXL;
                  i1 = ((c)localObject3).jCt;
                  localObject2 = ((c)localObject3).pXM;
                  boolean bool1 = ((c)localObject3).pXE;
                  bool2 = ((c)localObject3).pXN;
                  bool3 = ((c)localObject3).pXO;
                  localObject3 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject3).<init>("loadFilesToReport, reportkvcomm, logid:");
                  ab.i("MicroMsg.ReportManagerKvCheck", n + ", type:" + i1 + ", value:" + (String)localObject2 + ", isReportNow:" + bool2 + ", isImportant" + bool1);
                  localObject3 = h.pYm;
                  if (!ah.bqo())
                    break label587;
                  if (com.tencent.mm.plugin.report.a.c.pXd)
                  {
                    l1 = n;
                    l2 = i1;
                    bool2 = com.tencent.mm.plugin.report.a.c.pXe;
                    e.a(l1, l2, (String)localObject2, bool2, bool2, bool3);
                    ab.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, curLen:".concat(String.valueOf(k)));
                    break;
                  }
                  l2 = n;
                  l1 = i1;
                  e.a(l2, l1, (String)localObject2, bool2, false, bool3);
                  continue;
                }
                catch (IOException localIOException1)
                {
                  localObject3 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject3).<init>("loadFilesToReport(kvcomm), IOException:");
                  ab.e("MicroMsg.ReportManagerKvCheck", localIOException1.getMessage());
                }
                break;
                label587: h.a(n, i1, localIOException1, bool2, bool3);
                continue;
                if (str.contains(".monitor"))
                {
                  localObject3 = new com/tencent/mm/plugin/report/service/b;
                  ((b)localObject3).<init>();
                  try
                  {
                    ((b)localObject3).parseFrom(localIOException1);
                    long l3 = ((b)localObject3).ID;
                    l2 = ((b)localObject3).pXC;
                    l1 = ((b)localObject3).pXD;
                    bool3 = ((b)localObject3).pXE;
                    StringBuilder localStringBuilder = new java/lang/StringBuilder;
                    localStringBuilder.<init>("loadFilesToReport, reportidkey, id:");
                    ab.i("MicroMsg.ReportManagerKvCheck", l3 + ", key:" + l2 + ", value:" + l1 + ", isImportant" + bool3);
                    h.pYm.a(l3, l2, l1, bool3);
                  }
                  catch (IOException localIOException2)
                  {
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>("loadFilesToReport(idkey), IOException:");
                    ab.e("MicroMsg.ReportManagerKvCheck", localIOException2.getMessage());
                  }
                  break;
                }
                if (!str.contains(".group_monitor"))
                  break label1009;
                localObject3 = new com/tencent/mm/plugin/report/service/a;
                ((a)localObject3).<init>();
                try
                {
                  ((a)localObject3).parseFrom(localIOException2);
                  ArrayList localArrayList = new java/util/ArrayList;
                  localArrayList.<init>();
                  bool3 = false;
                  Iterator localIterator = ((a)localObject3).pXB.iterator();
                  while (localIterator.hasNext())
                  {
                    localObject3 = (b)localIterator.next();
                    Object localObject4 = new com/tencent/mars/smc/IDKey;
                    ((IDKey)localObject4).<init>(((b)localObject3).ID, ((b)localObject3).pXC, ((b)localObject3).pXD);
                    bool3 = ((b)localObject3).pXE;
                    localArrayList.add(localObject4);
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>("loadFilesToReport, idkeyGroupStat, id:");
                    ab.i("MicroMsg.ReportManagerKvCheck", ((b)localObject3).ID + ", key:" + ((b)localObject3).pXC + ", value:" + ((b)localObject3).pXD + ", isImportant" + bool3);
                  }
                  h.pYm.b(localArrayList, bool3);
                }
                catch (IOException localIOException3)
                {
                  localObject3 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject3).<init>("loadFilesToReport(idkey), IOException:");
                  ab.e("MicroMsg.ReportManagerKvCheck", localIOException3.getMessage());
                }
              }
              continue;
              label1009: ab.e("MicroMsg.ReportManagerKvCheck", "invalid filename:".concat(String.valueOf(str)));
            }
          }
        }
        AppMethodBeat.o(72734);
      }
    }
  }

  private static String cgr()
  {
    AppMethodBeat.i(72738);
    Object localObject = ah.getProcessName();
    if ((localObject == null) || (((String)localObject).length() == 0))
    {
      localObject = "MM";
      AppMethodBeat.o(72738);
    }
    while (true)
    {
      return localObject;
      localObject = ((String)localObject).split(":");
      if (localObject.length <= 1)
      {
        localObject = "MM";
        AppMethodBeat.o(72738);
      }
      else
      {
        localObject = localObject[1];
        AppMethodBeat.o(72738);
      }
    }
  }

  public static void d(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(72736);
    ab.i("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, id:" + paramInt1 + ", key:" + paramInt2 + ", value:" + paramInt3 + ", isImportant:" + paramBoolean);
    if (!com.tencent.mm.a.e.ct(filePath))
    {
      ab.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, filepath:" + filePath + " not exist , Id:" + paramInt1 + ", key:" + paramInt2 + ", value:" + paramInt3 + ", isImportant:" + paramBoolean);
      AppMethodBeat.o(72736);
    }
    while (true)
    {
      return;
      String str = cgr();
      if ("MM".equals(str))
      {
        ab.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + str + ", id:" + paramInt1 + ", key:" + paramInt2 + ", val:" + paramInt3 + ", isImportant:" + paramBoolean);
        AppMethodBeat.o(72736);
        continue;
      }
      str = filePath + str + ".monitor";
      ??? = new b();
      ((b)???).ID = paramInt1;
      ((b)???).pXC = paramInt2;
      ((b)???).pXD = paramInt3;
      ((b)???).pXE = paramBoolean;
      Object localObject3;
      try
      {
        localObject3 = ((b)???).toByteArray();
        if (localObject3 != null)
          break label346;
        ab.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, null == temp.");
        AppMethodBeat.o(72736);
      }
      catch (IOException localIOException)
      {
        ab.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + localIOException.getMessage());
        AppMethodBeat.o(72736);
      }
      continue;
      synchronized (pYa)
      {
        label346: if (com.tencent.mm.a.e.e(localIOException, intToByteArray(localObject3.length)) != 0)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("saveIDKeyData, write obj_len to file:");
          ab.e("MicroMsg.ReportManagerKvCheck", localIOException + " fail.");
          AppMethodBeat.o(72736);
          continue;
        }
        if (com.tencent.mm.a.e.e(localIOException, (byte[])localObject3) != 0)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("saveIDKeyData, write object to file:");
          ab.e("MicroMsg.ReportManagerKvCheck", localIOException + " fail.");
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("saveIDKeyData, fileLength:");
        ab.d("MicroMsg.ReportManagerKvCheck", com.tencent.mm.a.e.cs(localIOException));
        AppMethodBeat.o(72736);
      }
    }
  }

  public static void e(ArrayList<IDKey> arg0, boolean paramBoolean)
  {
    AppMethodBeat.i(72737);
    Object localObject1 = ???.iterator();
    Object localObject3;
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (IDKey)((Iterator)localObject1).next();
      ab.i("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, id:" + ((IDKey)localObject3).GetID() + ", key:" + ((IDKey)localObject3).GetKey() + ", value:" + ((IDKey)localObject3).GetValue() + ", isImportant:" + paramBoolean);
    }
    if (!com.tencent.mm.a.e.ct(filePath))
    {
      ab.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, filepath:" + filePath + " not exist ");
      AppMethodBeat.o(72737);
    }
    while (true)
    {
      return;
      localObject1 = cgr();
      if ("MM".equals(localObject1))
      {
        ab.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:".concat(String.valueOf(localObject1)));
        AppMethodBeat.o(72737);
        continue;
      }
      localObject1 = filePath + (String)localObject1 + ".group_monitor";
      localObject3 = new a();
      ((a)localObject3).jBv = ???.size();
      ??? = ???.iterator();
      while (???.hasNext())
      {
        IDKey localIDKey = (IDKey)???.next();
        b localb = new b();
        localb.ID = ((int)localIDKey.GetID());
        localb.pXC = ((int)localIDKey.GetKey());
        localb.pXD = ((int)localIDKey.GetValue());
        localb.pXE = paramBoolean;
        ((a)localObject3).pXB.add(localb);
      }
      try
      {
        localObject3 = ((a)localObject3).toByteArray();
        if (localObject3 != null)
          break label365;
        ab.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, null == temp.");
        AppMethodBeat.o(72737);
      }
      catch (IOException )
      {
        ab.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, IOException, detail:" + ???.getMessage());
        AppMethodBeat.o(72737);
      }
      continue;
      synchronized (pYa)
      {
        label365: if (com.tencent.mm.a.e.e((String)localObject1, intToByteArray(localObject3.length)) != 0)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("saveGroupIDKeyData, write obj_len to file:");
          ab.e("MicroMsg.ReportManagerKvCheck", (String)localObject1 + " fail.");
          AppMethodBeat.o(72737);
          continue;
        }
        if (com.tencent.mm.a.e.e((String)localObject1, (byte[])localObject3) != 0)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("saveGroupIDKeyData, write object to file:");
          ab.e("MicroMsg.ReportManagerKvCheck", (String)localObject1 + " fail.");
        }
        AppMethodBeat.o(72737);
      }
    }
  }

  private static String getAppFilePath()
  {
    Object localObject1 = null;
    AppMethodBeat.i(72733);
    Object localObject2 = ah.getContext();
    if (localObject2 == null)
      AppMethodBeat.o(72733);
    while (true)
    {
      return localObject1;
      try
      {
        localObject2 = ((Context)localObject2).getFilesDir();
        if (!((File)localObject2).exists())
          ((File)localObject2).createNewFile();
        localObject2 = ((File)localObject2).toString();
        localObject1 = localObject2;
        AppMethodBeat.o(72733);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ReportManagerKvCheck", localException.getMessage());
        AppMethodBeat.o(72733);
      }
    }
  }

  private static byte[] intToByteArray(int paramInt)
  {
    return new byte[] { (byte)(paramInt >> 24 & 0xFF), (byte)(paramInt >> 16 & 0xFF), (byte)(paramInt >> 8 & 0xFF), (byte)(paramInt & 0xFF) };
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.f
 * JD-Core Version:    0.6.2
 */