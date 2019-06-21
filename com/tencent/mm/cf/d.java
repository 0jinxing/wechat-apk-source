package com.tencent.mm.cf;

import android.os.Debug;
import android.os.Environment;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public final class d
  implements EventListener
{
  static ak fbD;
  public static a ydB;
  public static d ydG;
  private static int ydH;
  public static final String ydJ;
  private volatile boolean fPO;
  private volatile boolean ydI;
  private LinkedBlockingQueue<d.a> ydK;
  ExecutorService ydL;
  public WeakReference<d.b> ydM;

  static
  {
    AppMethodBeat.i(76920);
    ydH = 5242880;
    ydJ = Environment.getExternalStorageDirectory() + "/tencent/MicroMsg/tracedog/";
    ydB = null;
    fbD = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(76904);
        ab.i("MicroMsg.TraceDebugManager", "TRACE handle msg :%d ", new Object[] { Integer.valueOf(paramAnonymousMessage.what) });
        if (paramAnonymousMessage.what == 0)
          d.ydG.b((d.a)paramAnonymousMessage.obj);
        while (true)
        {
          super.handleMessage(paramAnonymousMessage);
          AppMethodBeat.o(76904);
          return;
          if (paramAnonymousMessage.what == 1)
          {
            if (d.c(d.ydG) != null)
            {
              d.b localb = (d.b)d.c(d.ydG).get();
              if (localb != null)
                localb.dvX();
            }
          }
          else
            d.a(d.ydG, (d.a)paramAnonymousMessage.obj);
        }
      }
    };
    AppMethodBeat.o(76920);
  }

  private void ML(int paramInt)
  {
    AppMethodBeat.i(76916);
    this.ydL.execute(new d.3(this, paramInt));
    AppMethodBeat.o(76916);
  }

  private void a(d.a parama)
  {
    AppMethodBeat.i(76908);
    if (this.ydI)
      AppMethodBeat.o(76908);
    while (true)
    {
      return;
      if (!c.Mn())
      {
        ab.i("MicroMsg.TraceDebugManager", "TRACE sdcard is invalid");
        AppMethodBeat.o(76908);
      }
      else
      {
        dvW();
        try
        {
          Object localObject = new java/io/File;
          ((File)localObject).<init>(ydJ);
          if ((parama.cPw != 6) && (((File)localObject).exists()))
          {
            ab.i("MicroMsg.TraceDebugManager", "TRACE delete all file ");
            aa((File)localObject);
          }
          ((File)localObject).mkdirs();
          localObject = parama.savePath;
          if (parama.ydP <= 0);
          for (int i = ydH; ; i = i * 1024 * 1024)
          {
            Debug.startMethodTracing((String)localObject, i);
            this.ydI = true;
            if (parama.cPw != 6)
              break label211;
            ab.i("MicroMsg.TraceDebugManager", "TRACE startTrace uploadType is CLIENT ");
            AppMethodBeat.o(76908);
            break;
            i = parama.ydP;
          }
        }
        catch (IncompatibleClassChangeError parama)
        {
          ab.printErrStackTrace("MicroMsg.Crash", parama, "May cause dvmFindCatchBlock crash!", new Object[0]);
          parama = (IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(parama);
          AppMethodBeat.o(76908);
          throw parama;
        }
        catch (Throwable localThrowable)
        {
          while (true)
          {
            this.ydI = false;
            ab.printErrStackTrace("MicroMsg.TraceDebugManager", localThrowable, "TRACE startMethodTracing ERROR", new Object[0]);
          }
          label211: if (!this.ydI)
          {
            AppMethodBeat.o(76908);
          }
          else
          {
            Message localMessage = Message.obtain();
            localMessage.what = 0;
            localMessage.obj = parama;
            if ((bo.isNullOrNil(parama.className)) || (parama.cPw == 5))
            {
              fbD.sendMessageDelayed(localMessage, 15000L);
              AppMethodBeat.o(76908);
            }
            else
            {
              fbD.sendMessageDelayed(localMessage, 10000L);
              AppMethodBeat.o(76908);
            }
          }
        }
      }
    }
  }

  private static void aa(File paramFile)
  {
    AppMethodBeat.i(76910);
    if (paramFile.isFile())
    {
      paramFile.delete();
      AppMethodBeat.o(76910);
    }
    while (true)
    {
      return;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if ((arrayOfFile == null) || (arrayOfFile.length == 0))
        {
          paramFile.delete();
          AppMethodBeat.o(76910);
        }
        else
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
            aa(arrayOfFile[j]);
          paramFile.delete();
        }
      }
      else
      {
        AppMethodBeat.o(76910);
      }
    }
  }

  private static String ab(File paramFile)
  {
    AppMethodBeat.i(76912);
    ArrayList localArrayList = new ArrayList();
    if (paramFile.isDirectory())
    {
      ab.i("MicroMsg.TraceDebugManager", "TRACE currentPath is dir");
      paramFile = paramFile.listFiles();
      if (paramFile == null)
      {
        ab.e("MicroMsg.TraceDebugManager", " get file list failed");
        AppMethodBeat.o(76912);
        paramFile = null;
      }
    }
    while (true)
    {
      return paramFile;
      int i = 0;
      while (i < paramFile.length)
      {
        localArrayList.add(paramFile[i]);
        i++;
        continue;
        localArrayList.add(paramFile);
      }
      paramFile = new File(ydJ + bo.anU() + ".zip");
      try
      {
        q.a(localArrayList, paramFile);
        for (i = 0; i < localArrayList.size(); i++)
          ((File)localArrayList.get(i)).delete();
      }
      catch (Exception paramFile)
      {
        ab.e("MicroMsg.TraceDebugManager", "exception:%s", new Object[] { bo.l(paramFile) });
        ab.e("MicroMsg.TraceDebugManager", "zip file failed msg:%s ", new Object[] { paramFile.getMessage() });
        AppMethodBeat.o(76912);
        paramFile = null;
      }
      continue;
      if (paramFile.length() > 3145728L)
      {
        ab.e("MicroMsg.TraceDebugManager", "trace file is too large:%d ", new Object[] { Long.valueOf(paramFile.length()) });
        AppMethodBeat.o(76912);
        paramFile = null;
      }
      else
      {
        paramFile = paramFile.getAbsolutePath();
        AppMethodBeat.o(76912);
      }
    }
  }

  public static d dvV()
  {
    AppMethodBeat.i(76907);
    if (ydG == null)
      ydG = new d();
    d locald = ydG;
    AppMethodBeat.o(76907);
    return locald;
  }

  private static void dvW()
  {
    AppMethodBeat.i(76909);
    fbD.removeMessages(0);
    fbD.removeMessages(2);
    fbD.removeMessages(1);
    AppMethodBeat.o(76909);
  }

  final void aqA(String paramString)
  {
    AppMethodBeat.i(76914);
    if (paramString == null)
    {
      AppMethodBeat.o(76914);
      return;
    }
    this.fPO = true;
    if (bo.isNullOrNil(paramString))
      ab.e("MicroMsg.TraceDebugManager", "TRACE error uploadPath %s ", new Object[] { paramString });
    while (true)
    {
      this.fPO = false;
      AppMethodBeat.o(76914);
      break;
      if (!c.Mn())
      {
        ab.e("MicroMsg.TraceDebugManager", "TRACE sdcard invalid.");
      }
      else
      {
        File localFile = new File(paramString);
        if (!localFile.exists())
        {
          ab.e("MicroMsg.TraceDebugManager", "TRACE upload file is not exist");
        }
        else
        {
          if (localFile.isDirectory())
            paramString = ab(localFile);
          if ((paramString != null) && (new File(paramString).length() >= 131072L))
            if (ydB == null)
            {
              ab.e("MicroMsg.TraceDebugManager", "TRACE upload : no file upload impl set!");
            }
            else
            {
              boolean bool = ydB.UC(paramString);
              ab.i("MicroMsg.TraceDebugManager", "TRACE upload : %b", new Object[] { Boolean.valueOf(bool) });
              if (bool)
                e.t(new File(ydJ));
            }
        }
      }
    }
  }

  public final boolean b(d.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(76911);
    dvW();
    if ((!this.ydI) || (this.fPO))
    {
      ab.i("MicroMsg.TraceDebugManager", "TRACE stopTrace hasStartTrace : %b ,isUploading :%b  ", new Object[] { Boolean.valueOf(this.ydI), Boolean.valueOf(this.fPO) });
      AppMethodBeat.o(76911);
    }
    while (true)
    {
      return bool;
      if (!c.Mn())
      {
        ab.i("MicroMsg.TraceDebugManager", "TRACE stopTrace sdcard invalid");
        AppMethodBeat.o(76911);
      }
      else
      {
        this.ydL.execute(new d.1(this, parama));
        AppMethodBeat.o(76911);
        bool = true;
      }
    }
  }

  public final void c(d.a parama)
  {
    AppMethodBeat.i(76915);
    if (parama.cPw <= 0)
      AppMethodBeat.o(76915);
    while (true)
    {
      return;
      if (this.ydL == null)
        this.ydL = Executors.newSingleThreadExecutor();
      if ((!this.fPO) && (!this.ydI))
        break;
      ab.i("MicroMsg.TraceDebugManager", "TRACE isUloading or hasStartTrace %b %b", new Object[] { Boolean.valueOf(this.fPO), Boolean.valueOf(this.ydI) });
      AppMethodBeat.o(76915);
    }
    fbD.removeMessages(0);
    if ((parama.ydQ == 4) || (parama.ydQ == 5))
      ML(parama.ydQ);
    while (true)
    {
      ab.i("MicroMsg.TraceDebugManager", "TRACE PUSH : class : %s  code :%s type :%s", new Object[] { parama.className, Integer.valueOf(parama.cPw), Integer.valueOf(parama.ydQ) });
      AppMethodBeat.o(76915);
      break;
      if ((parama.cPw == 6) || (parama.cPw == 5))
      {
        Message localMessage = Message.obtain();
        localMessage.what = 2;
        localMessage.obj = parama;
        if (parama.cPw == 5)
          fbD.sendMessage(localMessage);
        else
          fbD.sendMessageDelayed(localMessage, 500L);
      }
      else
      {
        if (this.ydK == null)
          this.ydK = new LinkedBlockingQueue();
        this.ydK.clear();
        this.ydK.add(parama);
      }
    }
  }

  public final void ev(String paramString, int paramInt)
  {
    AppMethodBeat.i(76913);
    d.a locala;
    if ((this.ydK != null) && (this.ydK.size() > 0))
    {
      ab.i("MicroMsg.TraceDebugManager", "TRACE gatherData : isUploading : %b  hasStart :%b currentClass : %s currentCode %d ", new Object[] { Boolean.valueOf(this.fPO), Boolean.valueOf(this.ydI), paramString, Integer.valueOf(paramInt) });
      if ((!this.fPO) && (!this.ydI))
      {
        Iterator localIterator = this.ydK.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            locala = (d.a)localIterator.next();
            if (locala.className != null)
            {
              if ((!locala.className.equals(paramString)) || (locala.cPw != paramInt))
                continue;
              a(locala);
              this.ydK.remove(locala);
              AppMethodBeat.o(76913);
            }
          }
      }
    }
    while (true)
    {
      return;
      a(null);
      this.ydK.remove(locala);
      AppMethodBeat.o(76913);
      continue;
      AppMethodBeat.o(76913);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.d
 * JD-Core Version:    0.6.2
 */