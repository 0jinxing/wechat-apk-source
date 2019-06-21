package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
  implements Closeable
{
  private final int axA;
  private Writer axB;
  private final LinkedHashMap<String, a.c> axC;
  private int axD;
  private long axE;
  final ThreadPoolExecutor axF;
  private final Callable<Void> axG;
  private final File axv;
  private final File axw;
  private final File axx;
  private final int axy;
  private long axz;
  private final File directory;
  private long size;

  private a(File paramFile, long paramLong)
  {
    AppMethodBeat.i(51777);
    this.size = 0L;
    this.axC = new LinkedHashMap(0, 0.75F, true);
    this.axE = 0L;
    this.axF = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a.a((byte)0));
    this.axG = new a.1(this);
    this.directory = paramFile;
    this.axy = 1;
    this.axv = new File(paramFile, "journal");
    this.axw = new File(paramFile, "journal.tmp");
    this.axx = new File(paramFile, "journal.bkp");
    this.axA = 1;
    this.axz = paramLong;
    AppMethodBeat.o(51777);
  }

  public static a a(File paramFile, long paramLong)
  {
    AppMethodBeat.i(51778);
    if (paramLong <= 0L)
    {
      paramFile = new IllegalArgumentException("maxSize <= 0");
      AppMethodBeat.o(51778);
      throw paramFile;
    }
    File localFile = new File(paramFile, "journal.bkp");
    Object localObject;
    if (localFile.exists())
    {
      localObject = new File(paramFile, "journal");
      if (((File)localObject).exists())
        localFile.delete();
    }
    else
    {
      localObject = new a(paramFile, paramLong);
      if (!((a)localObject).axv.exists())
        break label176;
    }
    while (true)
    {
      try
      {
        ((a)localObject).lK();
        ((a)localObject).lL();
        AppMethodBeat.o(51778);
        paramFile = (File)localObject;
        return paramFile;
        a(localFile, (File)localObject, false);
      }
      catch (IOException localIOException)
      {
        System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
        ((a)localObject).close();
        c.l(((a)localObject).directory);
      }
      label176: paramFile.mkdirs();
      paramFile = new a(paramFile, paramLong);
      paramFile.lM();
      AppMethodBeat.o(51778);
    }
  }

  private void a(a.b paramb, boolean paramBoolean)
  {
    int i = 0;
    a.c localc;
    try
    {
      AppMethodBeat.i(51786);
      localc = paramb.axI;
      if (localc.axP != paramb)
      {
        paramb = new java/lang/IllegalStateException;
        paramb.<init>();
        AppMethodBeat.o(51786);
        throw paramb;
      }
    }
    finally
    {
    }
    int j = i;
    if (paramBoolean)
    {
      j = i;
      if (!localc.axO)
        for (int k = 0; ; k++)
        {
          j = i;
          if (k >= this.axA)
            break;
          if (paramb.axJ[k] == 0)
          {
            paramb.abort();
            paramb = new java/lang/IllegalStateException;
            paramb.<init>("Newly created entry didn't create value for index ".concat(String.valueOf(k)));
            AppMethodBeat.o(51786);
            throw paramb;
          }
          if (!localc.axN[k].exists())
          {
            paramb.abort();
            AppMethodBeat.o(51786);
            return;
          }
        }
    }
    long l2;
    if (j < this.axA)
    {
      File localFile = localc.axN[j];
      if (paramBoolean)
        if (localFile.exists())
        {
          paramb = localc.axM[j];
          localFile.renameTo(paramb);
          long l1 = localc.axL[j];
          l2 = paramb.length();
          localc.axL[j] = l2;
          this.size = (this.size - l1 + l2);
        }
      while (true)
      {
        j++;
        break;
        k(localFile);
      }
    }
    this.axD += 1;
    localc.axP = null;
    if ((localc.axO | paramBoolean))
    {
      localc.axO = true;
      this.axB.append("CLEAN");
      this.axB.append(' ');
      this.axB.append(localc.key);
      this.axB.append(localc.lR());
      this.axB.append('\n');
      if (paramBoolean)
      {
        l2 = this.axE;
        this.axE = (1L + l2);
        localc.axQ = l2;
      }
    }
    while (true)
    {
      this.axB.flush();
      if ((this.size > this.axz) || (lN()))
        this.axF.submit(this.axG);
      AppMethodBeat.o(51786);
      break;
      this.axC.remove(localc.key);
      this.axB.append("REMOVE");
      this.axB.append(' ');
      this.axB.append(localc.key);
      this.axB.append('\n');
    }
  }

  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    AppMethodBeat.i(51783);
    if (paramBoolean)
      k(paramFile2);
    if (!paramFile1.renameTo(paramFile2))
    {
      paramFile1 = new IOException();
      AppMethodBeat.o(51783);
      throw paramFile1;
    }
    AppMethodBeat.o(51783);
  }

  private static void k(File paramFile)
  {
    AppMethodBeat.i(51782);
    if ((paramFile.exists()) && (!paramFile.delete()))
    {
      paramFile = new IOException();
      AppMethodBeat.o(51782);
      throw paramFile;
    }
    AppMethodBeat.o(51782);
  }

  private void lK()
  {
    AppMethodBeat.i(51779);
    b localb = new b(new FileInputStream(this.axv), c.US_ASCII);
    String str1;
    Object localObject3;
    try
    {
      localObject1 = localb.readLine();
      str1 = localb.readLine();
      Object localObject2 = localb.readLine();
      localObject3 = localb.readLine();
      String str2 = localb.readLine();
      if ((!"libcore.io.DiskLruCache".equals(localObject1)) || (!"1".equals(str1)) || (!Integer.toString(this.axy).equals(localObject2)) || (!Integer.toString(this.axA).equals(localObject3)) || (!"".equals(str2)))
      {
        localObject2 = new java/io/IOException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("unexpected journal header: [");
        ((IOException)localObject2).<init>((String)localObject1 + ", " + str1 + ", " + (String)localObject3 + ", " + str2 + "]");
        AppMethodBeat.o(51779);
        throw ((Throwable)localObject2);
      }
    }
    finally
    {
      c.closeQuietly(localb);
      AppMethodBeat.o(51779);
    }
    int j;
    label298: label309: int k;
    int m;
    label364: for (int i = 0; ; i++)
    {
      try
      {
        str1 = localb.readLine();
        j = str1.indexOf(' ');
        if (j != -1)
          break label309;
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("unexpected journal line: ".concat(String.valueOf(str1)));
        AppMethodBeat.o(51779);
        throw localIOException;
      }
      catch (EOFException localEOFException)
      {
        this.axD = (i - this.axC.size());
        if (localb.end != -1)
          break label577;
      }
      i = 1;
      if (i == 0)
        break label583;
      lM();
      c.closeQuietly(localb);
      AppMethodBeat.o(51779);
      return;
      k = j + 1;
      m = str1.indexOf(' ', k);
      if (m != -1)
        break;
      localObject1 = str1.substring(k);
      if ((j != 6) || (!str1.startsWith("REMOVE")))
        break label631;
      this.axC.remove(localObject1);
    }
    Object localObject1 = str1.substring(k, m);
    label577: label583: label631: 
    while (true)
    {
      localObject3 = (a.c)this.axC.get(localObject1);
      Object localObject5 = localObject3;
      if (localObject3 == null)
      {
        localObject5 = new com/bumptech/glide/a/a$c;
        ((a.c)localObject5).<init>(this, (String)localObject1, (byte)0);
        this.axC.put(localObject1, localObject5);
      }
      if ((m != -1) && (j == 5) && (str1.startsWith("CLEAN")))
      {
        localObject1 = str1.substring(m + 1).split(" ");
        ((a.c)localObject5).axO = true;
        ((a.c)localObject5).axP = null;
        ((a.c)localObject5).c((String[])localObject1);
        break label364;
      }
      if ((m == -1) && (j == 5) && (str1.startsWith("DIRTY")))
      {
        localObject1 = new com/bumptech/glide/a/a$b;
        ((a.b)localObject1).<init>(this, (a.c)localObject5, (byte)0);
        ((a.c)localObject5).axP = ((a.b)localObject1);
        break label364;
      }
      if ((m == -1) && (j == 4) && (str1.startsWith("READ")))
        break label364;
      localObject5 = new java/io/IOException;
      ((IOException)localObject5).<init>("unexpected journal line: ".concat(String.valueOf(str1)));
      AppMethodBeat.o(51779);
      throw ((Throwable)localObject5);
      i = 0;
      break;
      localObject1 = new java/io/BufferedWriter;
      localObject5 = new java/io/OutputStreamWriter;
      localObject3 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject3).<init>(this.axv, true);
      ((OutputStreamWriter)localObject5).<init>((OutputStream)localObject3, c.US_ASCII);
      ((BufferedWriter)localObject1).<init>((Writer)localObject5);
      this.axB = ((Writer)localObject1);
      break label298;
    }
  }

  private void lL()
  {
    AppMethodBeat.i(51780);
    k(this.axw);
    Iterator localIterator = this.axC.values().iterator();
    while (localIterator.hasNext())
    {
      a.c localc = (a.c)localIterator.next();
      int i;
      if (localc.axP == null)
      {
        for (i = 0; i < this.axA; i++)
          this.size += localc.axL[i];
      }
      else
      {
        localc.axP = null;
        for (i = 0; i < this.axA; i++)
        {
          k(localc.axM[i]);
          k(localc.axN[i]);
        }
        localIterator.remove();
      }
    }
    AppMethodBeat.o(51780);
  }

  private void lM()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(51781);
        if (this.axB != null)
          this.axB.close();
        BufferedWriter localBufferedWriter = new java/io/BufferedWriter;
        Object localObject2 = new java/io/OutputStreamWriter;
        localObject4 = new java/io/FileOutputStream;
        ((FileOutputStream)localObject4).<init>(this.axw);
        ((OutputStreamWriter)localObject2).<init>((OutputStream)localObject4, c.US_ASCII);
        localBufferedWriter.<init>((Writer)localObject2);
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.axy));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.axA));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          localObject2 = this.axC.values().iterator();
          if (!((Iterator)localObject2).hasNext())
            break;
          localObject4 = (a.c)((Iterator)localObject2).next();
          if (((a.c)localObject4).axP != null)
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("DIRTY ");
            localBufferedWriter.write(((a.c)localObject4).key + '\n');
            continue;
          }
        }
        finally
        {
          localBufferedWriter.close();
          AppMethodBeat.o(51781);
        }
      }
      finally
      {
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("CLEAN ");
      localObject1.write(((a.c)localObject4).key + ((a.c)localObject4).lR() + '\n');
    }
    localObject1.close();
    if (this.axv.exists())
      a(this.axv, this.axx, true);
    a(this.axw, this.axv, false);
    this.axx.delete();
    Object localObject4 = new java/io/BufferedWriter;
    OutputStreamWriter localOutputStreamWriter = new java/io/OutputStreamWriter;
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>(this.axv, true);
    localOutputStreamWriter.<init>(localFileOutputStream, c.US_ASCII);
    ((BufferedWriter)localObject4).<init>(localOutputStreamWriter);
    this.axB = ((Writer)localObject4);
    AppMethodBeat.o(51781);
  }

  private boolean lN()
  {
    AppMethodBeat.i(51787);
    boolean bool;
    if ((this.axD >= 2000) && (this.axD >= this.axC.size()))
    {
      bool = true;
      AppMethodBeat.o(51787);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51787);
    }
  }

  private void lO()
  {
    AppMethodBeat.i(51789);
    if (this.axB == null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("cache is closed");
      AppMethodBeat.o(51789);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(51789);
  }

  private boolean remove(String paramString)
  {
    int i = 0;
    while (true)
    {
      try
      {
        AppMethodBeat.i(51788);
        lO();
        a.c localc = (a.c)this.axC.get(paramString);
        if ((localc == null) || (localc.axP != null))
        {
          AppMethodBeat.o(51788);
          bool = false;
          return bool;
          this.size -= localc.axL[i];
          localc.axL[i] = 0L;
          i++;
        }
        if (i < this.axA)
        {
          File localFile = localc.axM[i];
          if ((!localFile.exists()) || (localFile.delete()))
            continue;
          paramString = new java/io/IOException;
          paramString.<init>("failed to delete ".concat(String.valueOf(localFile)));
          AppMethodBeat.o(51788);
          throw paramString;
        }
      }
      finally
      {
      }
      this.axD += 1;
      this.axB.append("REMOVE");
      this.axB.append(' ');
      this.axB.append(paramString);
      this.axB.append('\n');
      this.axC.remove(paramString);
      if (lN())
        this.axF.submit(this.axG);
      boolean bool = true;
      AppMethodBeat.o(51788);
    }
  }

  private void trimToSize()
  {
    AppMethodBeat.i(51791);
    while (this.size > this.axz)
      remove((String)((Map.Entry)this.axC.entrySet().iterator().next()).getKey());
    AppMethodBeat.o(51791);
  }

  public final a.d X(String paramString)
  {
    int i = 0;
    a.d locald = null;
    while (true)
    {
      a.c localc;
      try
      {
        AppMethodBeat.i(51784);
        lO();
        localc = (a.c)this.axC.get(paramString);
        if (localc == null)
        {
          AppMethodBeat.o(51784);
          paramString = locald;
          return paramString;
        }
        if (!localc.axO)
        {
          AppMethodBeat.o(51784);
          paramString = locald;
          continue;
        }
      }
      finally
      {
      }
      File[] arrayOfFile = localc.axM;
      int j = arrayOfFile.length;
      while (true)
      {
        if (i >= j)
          break label115;
        if (!arrayOfFile[i].exists())
        {
          AppMethodBeat.o(51784);
          paramString = locald;
          break;
        }
        i++;
      }
      label115: this.axD += 1;
      this.axB.append("READ");
      this.axB.append(' ');
      this.axB.append(paramString);
      this.axB.append('\n');
      if (lN())
        this.axF.submit(this.axG);
      locald = new com/bumptech/glide/a/a$d;
      locald.<init>(this, paramString, localc.axQ, localc.axM, localc.axL, (byte)0);
      AppMethodBeat.o(51784);
      paramString = locald;
    }
  }

  public final a.b Y(String paramString)
  {
    while (true)
    {
      a.c localc;
      try
      {
        AppMethodBeat.i(51785);
        lO();
        localc = (a.c)this.axC.get(paramString);
        if ((-1L != -1L) && ((localc == null) || (localc.axQ != -1L)))
        {
          AppMethodBeat.o(51785);
          paramString = null;
          return paramString;
        }
        if (localc == null)
        {
          localc = new com/bumptech/glide/a/a$c;
          localc.<init>(this, paramString, (byte)0);
          this.axC.put(paramString, localc);
          a.b localb = new com/bumptech/glide/a/a$b;
          localb.<init>(this, localc, (byte)0);
          localc.axP = localb;
          this.axB.append("DIRTY");
          this.axB.append(' ');
          this.axB.append(paramString);
          this.axB.append('\n');
          this.axB.flush();
          AppMethodBeat.o(51785);
          paramString = localb;
          continue;
        }
      }
      finally
      {
      }
      if (localc.axP != null)
      {
        AppMethodBeat.o(51785);
        paramString = null;
      }
    }
  }

  public final void close()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(51790);
        if (this.axB == null)
        {
          AppMethodBeat.o(51790);
          return;
        }
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(this.axC.values());
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        if (localIterator.hasNext())
        {
          localObject1 = (a.c)localIterator.next();
          if (((a.c)localObject1).axP == null)
            continue;
          ((a.c)localObject1).axP.abort();
          continue;
        }
      }
      finally
      {
      }
      trimToSize();
      this.axB.close();
      this.axB = null;
      AppMethodBeat.o(51790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.a
 * JD-Core Version:    0.6.2
 */