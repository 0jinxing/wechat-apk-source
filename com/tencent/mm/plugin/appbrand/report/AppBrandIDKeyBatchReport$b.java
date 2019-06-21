package com.tencent.mm.plugin.appbrand.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.protocal.protobuf.cwt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

final class AppBrandIDKeyBatchReport$b
{
  private static final ReentrantReadWriteLock izJ;
  private static volatile ap izK;
  private static volatile ap izL;
  private static volatile int izM;

  static
  {
    AppMethodBeat.i(132532);
    izJ = new ReentrantReadWriteLock();
    izK = null;
    izL = null;
    AppMethodBeat.o(132532);
  }

  private static void aKY()
  {
    AppMethodBeat.i(132524);
    if (izK != null)
    {
      izK.stopTimer();
      izK = null;
    }
    AppMethodBeat.o(132524);
  }

  private static LinkedList<cwt> aKZ()
  {
    AppMethodBeat.i(132525);
    izJ.readLock().lock();
    while (true)
      try
      {
        Object localObject1 = new java/io/File;
        ((File)localObject1).<init>(AppBrandIDKeyBatchReport.access$800());
        if (!((File)localObject1).exists())
        {
          ab.d("MicroMsg.AppBrandIDKeyBatchReport", "reportFile not exist!");
          izJ.readLock().unlock();
          aLa();
          AppMethodBeat.o(132525);
          localObject2 = null;
          return localObject2;
        }
        Object localObject2 = new java/util/LinkedList;
        ((LinkedList)localObject2).<init>();
        long l = ((File)localObject1).length();
        int i = 0;
        Object localObject5 = e.e(AppBrandIDKeyBatchReport.access$800(), i, 4);
        if (localObject5 == null)
        {
          ab.e("MicroMsg.AppBrandIDKeyBatchReport", "preData is null!");
          izJ.readLock().unlock();
          aLa();
          AppMethodBeat.o(132525);
          localObject2 = null;
        }
        else
        {
          localObject1 = new java/io/ByteArrayInputStream;
          ((ByteArrayInputStream)localObject1).<init>((byte[])localObject5);
          localObject5 = new java/io/DataInputStream;
          ((DataInputStream)localObject5).<init>((InputStream)localObject1);
          int j = ((DataInputStream)localObject5).readInt();
          localObject5 = e.e(AppBrandIDKeyBatchReport.access$800(), i + 4, j);
          if (!bo.cb((byte[])localObject5))
          {
            localObject1 = new com/tencent/mm/protocal/protobuf/cwt;
            ((cwt)localObject1).<init>();
            ((LinkedList)localObject2).add((cwt)((cwt)localObject1).parseFrom((byte[])localObject5));
            i = j + 4 + i;
            if (i < l);
          }
          else
          {
            izJ.readLock().unlock();
            aLa();
            AppMethodBeat.o(132525);
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrandIDKeyBatchReport", "read file error %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", localException, "readReportData()", new Object[0]);
        izJ.readLock().unlock();
        aLa();
        AppMethodBeat.o(132525);
        Object localObject3 = null;
      }
      finally
      {
        izJ.readLock().unlock();
        aLa();
        AppMethodBeat.o(132525);
      }
  }

  private static void aLa()
  {
    AppMethodBeat.i(132526);
    izJ.writeLock().lock();
    try
    {
      e.deleteFile(AppBrandIDKeyBatchReport.access$800());
      izJ.writeLock().unlock();
      AppMethodBeat.o(132526);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", localException, "removeFile()", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.b
 * JD-Core Version:    0.6.2
 */