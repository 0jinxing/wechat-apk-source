package com.tencent.matrix.a.b;

import android.os.Environment;
import com.tencent.matrix.c.b;
import com.tencent.matrix.c.c.a;
import com.tencent.matrix.d.d;
import com.tencent.mrs.b.a.a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends com.tencent.matrix.c.c
{
  final Map<String, d> bVD = new HashMap();
  final Map<String, c> bVE = new HashMap();
  final int bVF;
  private final int bVG;
  private final int bVH;
  final a bVI;
  final Runnable bVJ;
  final e bVK;

  public f(c.a parama, com.tencent.matrix.a.a.a parama1, a parama2)
  {
    super(parama);
    this.bVF = parama1.bUG.get(a.a.Ajy.name(), 120000);
    this.bVG = parama1.bUG.get(a.a.AjA.name(), 600000);
    this.bVH = parama1.bUG.get(a.a.Ajz.name(), 20);
    this.bVI = parama2;
    this.bVJ = new Runnable()
    {
      public final void run()
      {
        Iterator localIterator = f.this.bVE.entrySet().iterator();
        while (localIterator.hasNext())
          ((f.c)((Map.Entry)localIterator.next()).getValue()).yX();
        f.a(f.this);
      }
    };
    if (parama1.yN());
    for (this.bVK = new e(); ; this.bVK = null)
      return;
  }

  private static JSONObject a(c paramc, long paramLong)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("wakeLockTag", paramc.tag);
      localJSONObject.put("subTag", "wakeLock");
      localJSONObject.put("timeFrame", paramLong);
      localJSONObject.put("acquireCnt", paramc.bVQ);
      localJSONObject.put("acquireCntWhenScreenOff", paramc.bVR);
      localJSONObject.put("statisticalHoldTime", paramc.bVO);
      localJSONObject.put("stackHistory", paramc.bVS);
      return localJSONObject;
    }
    catch (JSONException paramc)
    {
      while (true)
        com.tencent.matrix.d.c.e("Matrix.WakeLockDetector", "json content error: %s", new Object[] { paramc });
    }
  }

  private void yV()
  {
    Iterator localIterator = this.bVD.entrySet().iterator();
    long l = System.currentTimeMillis();
    while (true)
      if (localIterator.hasNext())
      {
        d locald = (d)((Map.Entry)localIterator.next()).getValue();
        if (l - locald.bVX >= this.bVF)
        {
          String str = String.format("%s:%d", new Object[] { locald.tag, Integer.valueOf(1) });
          if (cg(str))
          {
            com.tencent.matrix.d.c.v("Matrix.WakeLockDetector", "detectWakeLockOnceHoldTime issue already published: %s", new Object[] { str });
          }
          else
          {
            b localb = new b(1);
            localb.key = str;
            JSONObject localJSONObject = new JSONObject();
            try
            {
              localJSONObject.put("subTag", "wakeLock");
              localJSONObject.put("wakeLockTag", locald.tag);
              localJSONObject.put("flags", locald.flags);
              localJSONObject.put("holdTime", l - locald.bVX);
              localJSONObject.put("stackHistory", locald.bVS);
              com.tencent.matrix.d.c.i("Matrix.WakeLockDetector", "detected lock once too long, token:%s, tag:%s", new Object[] { locald.bVW, locald.tag });
              localb.bWv = localJSONObject;
              b(localb);
              cf(str);
            }
            catch (JSONException localJSONException)
            {
              while (true)
                com.tencent.matrix.d.c.e("Matrix.WakeLockDetector", "json content error: %s", new Object[] { localJSONException });
            }
          }
        }
      }
  }

  private void yW()
  {
    Iterator localIterator = this.bVE.entrySet().iterator();
    long l1 = System.currentTimeMillis();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      String str1 = (String)((Map.Entry)localObject).getKey();
      localObject = (c)((Map.Entry)localObject).getValue();
      long l2 = l1 - ((c)localObject).bVN;
      int i = (int)(l2 / 3600000L) + 1;
      int j = ((c)localObject).bVR / i;
      long l3 = ((c)localObject).bVP / i;
      String str2;
      if (j > this.bVH / 2)
      {
        str2 = String.format("%s:%d", new Object[] { str1, Integer.valueOf(2) });
        if (!cg(str2))
          break label227;
        com.tencent.matrix.d.c.v("Matrix.WakeLockDetector", "detectWakeLockAggregation issue already published: %s", new Object[] { str2 });
      }
      while (true)
      {
        if (l3 < this.bVG)
          break label269;
        str1 = String.format("%s:%d", new Object[] { str1, Integer.valueOf(3) });
        if (!cg(str1))
          break label271;
        com.tencent.matrix.d.c.v("Matrix.WakeLockDetector", "detectWakeLockAggregation issue already published: %s", new Object[] { str1 });
        break;
        label227: localb = new b(2);
        localb.key = str2;
        localb.bWv = a((c)localObject, l2);
        b(localb);
        cf(str2);
      }
      label269: continue;
      label271: b localb = new b(3);
      localb.key = str1;
      localb.bWv = a((c)localObject, l2);
      b(localb);
      cf(str1);
    }
  }

  final void yU()
  {
    yV();
    yW();
  }

  public static abstract interface a
  {
    public abstract void e(Runnable paramRunnable, long paramLong);

    public abstract boolean isScreenOn();
  }

  static final class b
  {
    final Vector<String> bVM = new Vector();

    final void cd(String paramString)
    {
      this.bVM.add(paramString);
    }

    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < this.bVM.size(); i++)
        localStringBuilder.append((String)this.bVM.get(i)).append("\t\t");
      return localStringBuilder.toString();
    }
  }

  static final class c
  {
    final long bVN;
    long bVO;
    long bVP;
    int bVQ;
    int bVR;
    f.b bVS;
    final Map<String, Boolean> bVT;
    long bVU;
    boolean bVV;
    final String tag;

    c(String paramString)
    {
      this.tag = paramString;
      this.bVO = 0L;
      this.bVP = 0L;
      this.bVQ = 0;
      this.bVR = 0;
      this.bVU = -1L;
      this.bVS = new f.b();
      this.bVN = System.currentTimeMillis();
      this.bVT = new HashMap();
    }

    final void yX()
    {
      if (this.bVU < 0L);
      while (true)
      {
        return;
        long l = System.currentTimeMillis();
        this.bVO += l - this.bVU;
        if (!this.bVV)
          this.bVP += l - this.bVU;
        this.bVU = l;
      }
    }
  }

  static final class d
  {
    f.b bVS;
    final String bVW;
    final long bVX;
    final int flags;
    final String tag;

    d(String paramString1, String paramString2, int paramInt, long paramLong)
    {
      this.bVW = paramString1;
      this.tag = paramString2;
      this.flags = paramInt;
      this.bVX = paramLong;
      this.bVS = new f.b();
    }
  }

  static final class e
  {
    private final String bUS;
    int bVY;
    final StringBuilder bVZ;

    e()
    {
      String str = d.formatTime("yyyy-MM-dd", System.currentTimeMillis());
      this.bUS = String.format("%s/com.tencent.matrix/wakelock-detector-record/%s/wakelocks-%s", new Object[] { Environment.getExternalStorageDirectory().getAbsolutePath(), com.tencent.matrix.a.c.a.getPackageName(), str });
      this.bVZ = new StringBuilder();
      com.tencent.matrix.d.c.i("Matrix.WakeLockDetector", "WakeLockInfoRecorder path:%s", new Object[] { this.bUS });
    }

    // ERROR //
    private void yZ()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_1
      //   2: aconst_null
      //   3: astore_2
      //   4: aconst_null
      //   5: astore_3
      //   6: aload_2
      //   7: astore 4
      //   9: new 41	java/io/File
      //   12: astore 5
      //   14: aload_2
      //   15: astore 4
      //   17: aload 5
      //   19: aload_0
      //   20: getfield 58	com/tencent/matrix/a/b/f$e:bUS	Ljava/lang/String;
      //   23: invokespecial 82	java/io/File:<init>	(Ljava/lang/String;)V
      //   26: aload_2
      //   27: astore 4
      //   29: aload 5
      //   31: invokevirtual 85	java/io/File:getParentFile	()Ljava/io/File;
      //   34: invokevirtual 89	java/io/File:mkdirs	()Z
      //   37: ifne +32 -> 69
      //   40: aload_2
      //   41: astore 4
      //   43: aload 5
      //   45: invokevirtual 85	java/io/File:getParentFile	()Ljava/io/File;
      //   48: invokevirtual 92	java/io/File:exists	()Z
      //   51: ifne +18 -> 69
      //   54: aload_2
      //   55: astore 4
      //   57: ldc 65
      //   59: ldc 94
      //   61: iconst_0
      //   62: anewarray 4	java/lang/Object
      //   65: invokestatic 96	com/tencent/matrix/d/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   68: return
      //   69: aload_2
      //   70: astore 4
      //   72: new 98	java/io/OutputStreamWriter
      //   75: astore 6
      //   77: aload_2
      //   78: astore 4
      //   80: new 100	java/io/FileOutputStream
      //   83: astore 7
      //   85: aload_2
      //   86: astore 4
      //   88: aload 7
      //   90: aload 5
      //   92: iconst_1
      //   93: invokespecial 103	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
      //   96: aload_2
      //   97: astore 4
      //   99: aload 6
      //   101: aload 7
      //   103: invokespecial 106	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
      //   106: aload_2
      //   107: astore 4
      //   109: new 108	java/io/BufferedWriter
      //   112: dup
      //   113: aload 6
      //   115: invokespecial 111	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
      //   118: astore_2
      //   119: aload_0
      //   120: getfield 63	com/tencent/matrix/a/b/f$e:bVZ	Ljava/lang/StringBuilder;
      //   123: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   126: astore 4
      //   128: aload_2
      //   129: aload 4
      //   131: iconst_0
      //   132: aload 4
      //   134: invokevirtual 118	java/lang/String:length	()I
      //   137: invokevirtual 122	java/io/BufferedWriter:write	(Ljava/lang/String;II)V
      //   140: aload_2
      //   141: invokevirtual 125	java/io/BufferedWriter:flush	()V
      //   144: aload_2
      //   145: invokevirtual 128	java/io/BufferedWriter:close	()V
      //   148: goto -80 -> 68
      //   151: astore 4
      //   153: goto -85 -> 68
      //   156: astore 5
      //   158: aload_3
      //   159: astore_2
      //   160: aload_2
      //   161: astore 4
      //   163: ldc 65
      //   165: ldc 130
      //   167: iconst_1
      //   168: anewarray 4	java/lang/Object
      //   171: dup
      //   172: iconst_0
      //   173: aload 5
      //   175: invokevirtual 133	java/io/FileNotFoundException:getLocalizedMessage	()Ljava/lang/String;
      //   178: aastore
      //   179: invokestatic 136	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   182: aload_2
      //   183: ifnull -115 -> 68
      //   186: aload_2
      //   187: invokevirtual 128	java/io/BufferedWriter:close	()V
      //   190: goto -122 -> 68
      //   193: astore 4
      //   195: goto -127 -> 68
      //   198: astore 5
      //   200: aload_1
      //   201: astore_2
      //   202: aload_2
      //   203: astore 4
      //   205: ldc 65
      //   207: ldc 130
      //   209: iconst_1
      //   210: anewarray 4	java/lang/Object
      //   213: dup
      //   214: iconst_0
      //   215: aload 5
      //   217: invokevirtual 137	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
      //   220: aastore
      //   221: invokestatic 136	com/tencent/matrix/d/c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   224: aload_2
      //   225: ifnull -157 -> 68
      //   228: aload_2
      //   229: invokevirtual 128	java/io/BufferedWriter:close	()V
      //   232: goto -164 -> 68
      //   235: astore 4
      //   237: goto -169 -> 68
      //   240: astore_2
      //   241: aload 4
      //   243: astore 5
      //   245: aload_2
      //   246: astore 4
      //   248: aload 5
      //   250: ifnull +8 -> 258
      //   253: aload 5
      //   255: invokevirtual 128	java/io/BufferedWriter:close	()V
      //   258: aload 4
      //   260: athrow
      //   261: astore_2
      //   262: goto -4 -> 258
      //   265: astore 4
      //   267: aload_2
      //   268: astore 5
      //   270: goto -22 -> 248
      //   273: astore 5
      //   275: goto -73 -> 202
      //   278: astore 5
      //   280: goto -120 -> 160
      //
      // Exception table:
      //   from	to	target	type
      //   144	148	151	java/io/IOException
      //   9	14	156	java/io/FileNotFoundException
      //   17	26	156	java/io/FileNotFoundException
      //   29	40	156	java/io/FileNotFoundException
      //   43	54	156	java/io/FileNotFoundException
      //   57	68	156	java/io/FileNotFoundException
      //   72	77	156	java/io/FileNotFoundException
      //   80	85	156	java/io/FileNotFoundException
      //   88	96	156	java/io/FileNotFoundException
      //   99	106	156	java/io/FileNotFoundException
      //   109	119	156	java/io/FileNotFoundException
      //   186	190	193	java/io/IOException
      //   9	14	198	java/io/IOException
      //   17	26	198	java/io/IOException
      //   29	40	198	java/io/IOException
      //   43	54	198	java/io/IOException
      //   57	68	198	java/io/IOException
      //   72	77	198	java/io/IOException
      //   80	85	198	java/io/IOException
      //   88	96	198	java/io/IOException
      //   99	106	198	java/io/IOException
      //   109	119	198	java/io/IOException
      //   228	232	235	java/io/IOException
      //   9	14	240	finally
      //   17	26	240	finally
      //   29	40	240	finally
      //   43	54	240	finally
      //   57	68	240	finally
      //   72	77	240	finally
      //   80	85	240	finally
      //   88	96	240	finally
      //   99	106	240	finally
      //   109	119	240	finally
      //   163	182	240	finally
      //   205	224	240	finally
      //   253	258	261	java/io/IOException
      //   119	144	265	finally
      //   119	144	273	java/io/IOException
      //   119	144	278	java/io/FileNotFoundException
    }

    final void yY()
    {
      if (this.bVY >= 10)
      {
        yZ();
        this.bVY = 0;
        this.bVZ.delete(0, this.bVZ.length());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.b.f
 * JD-Core Version:    0.6.2
 */