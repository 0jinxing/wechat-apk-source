package com.tencent.mm.audio.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class d
  implements a
{
  private com.tencent.qqpinyin.voicerecoapi.a crB;
  private d.a crC;
  BlockingQueue<g.a> crn;
  boolean cro;
  String crp;
  private OutputStream crw;

  public d()
  {
    AppMethodBeat.i(55775);
    this.crn = new ArrayBlockingQueue(1024);
    this.cro = false;
    AppMethodBeat.o(55775);
  }

  public static boolean G(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(55781);
    long l = System.currentTimeMillis();
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      ab.e("MicroMsg.SpeexWriter", "[voiceControl] decodePCMToSpeex filePath null");
      AppMethodBeat.o(55781);
    }
    while (true)
    {
      return bool;
      Object localObject1 = new b(paramString1);
      if (!((b)localObject1).exists())
      {
        ab.e("MicroMsg.SpeexWriter", "[voiceControl] decodePCMToSpeex filePath null");
        AppMethodBeat.o(55781);
      }
      else
      {
        ab.i("MicroMsg.SpeexWriter", "[voiceControl] decodePCMToSpeex pcmLen = " + ((b)localObject1).length());
        try
        {
          com.tencent.qqpinyin.voicerecoapi.a locala = new com/tencent/qqpinyin/voicerecoapi/a;
          locala.<init>();
          if (locala.dPS() != 0)
          {
            ab.e("MicroMsg.SpeexWriter", "[voiceControl] speexInit fail");
            locala.dPT();
            AppMethodBeat.o(55781);
          }
          else
          {
            e.deleteFile(paramString2);
            localObject1 = new com/tencent/mm/vfs/b;
            ((b)localObject1).<init>(paramString2);
            ((b)localObject1).createNewFile();
            Object localObject2 = null;
            localObject1 = localObject2;
            try
            {
              byte[] arrayOfByte = new byte[4096];
              localObject1 = localObject2;
              paramString1 = e.openRead(paramString1);
              while (true)
              {
                localObject1 = paramString1;
                int i = paramString1.read(arrayOfByte);
                if (i <= 0)
                  break label316;
                localObject1 = paramString1;
                localObject2 = locala.Z(arrayOfByte, i);
                if (localObject2 == null)
                {
                  localObject1 = paramString1;
                  paramString1.close();
                  AppMethodBeat.o(55781);
                  break;
                }
                localObject1 = paramString1;
                int j = e.a(paramString2, (byte[])localObject2, localObject2.length);
                localObject1 = paramString1;
                localObject2 = new java/lang/StringBuilder;
                localObject1 = paramString1;
                ((StringBuilder)localObject2).<init>("[voiceControl] appendToFile ");
                localObject1 = paramString1;
                ab.i("MicroMsg.SpeexWriter", j + ", readLen = " + i);
              }
            }
            catch (Exception paramString1)
            {
              if (localObject1 != null)
                ((InputStream)localObject1).close();
              locala.dPT();
              AppMethodBeat.o(55781);
            }
            continue;
            label316: localObject1 = paramString1;
            paramString1.close();
            localObject1 = paramString1;
            locala.dPT();
            localObject1 = paramString1;
            paramString2 = new java/lang/StringBuilder;
            localObject1 = paramString1;
            paramString2.<init>("[voiceControl] decodePCMToSpeex = ");
            localObject1 = paramString1;
            ab.i("MicroMsg.SpeexWriter", System.currentTimeMillis() - l);
            bool = true;
            AppMethodBeat.o(55781);
          }
        }
        catch (Exception paramString1)
        {
          ab.e("MicroMsg.SpeexWriter", "[voiceControl] Exception in decodePCMToSpeex, " + paramString1.getMessage());
          AppMethodBeat.o(55781);
        }
      }
    }
  }

  // ERROR //
  public final void Fe()
  {
    // Byte code:
    //   0: ldc 160
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 63
    //   7: ldc 162
    //   9: invokestatic 97	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 40	com/tencent/mm/audio/d/d:cro	Z
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_0
    //   22: getfield 164	com/tencent/mm/audio/d/d:crC	Lcom/tencent/mm/audio/d/d$a;
    //   25: ifnull +20 -> 45
    //   28: getstatic 170	com/tencent/mm/sdk/g/d:xDG	Lcom/tencent/mm/sdk/g/a/e;
    //   31: aload_0
    //   32: getfield 164	com/tencent/mm/audio/d/d:crC	Lcom/tencent/mm/audio/d/d$a;
    //   35: invokeinterface 176 2 0
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 164	com/tencent/mm/audio/d/d:crC	Lcom/tencent/mm/audio/d/d$a;
    //   45: aload_0
    //   46: getfield 178	com/tencent/mm/audio/d/d:crB	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   49: ifnull +16 -> 65
    //   52: aload_0
    //   53: getfield 178	com/tencent/mm/audio/d/d:crB	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   56: invokevirtual 108	com/tencent/qqpinyin/voicerecoapi/a:dPT	()I
    //   59: pop
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 178	com/tencent/mm/audio/d/d:crB	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   65: aload_0
    //   66: getfield 180	com/tencent/mm/audio/d/d:crw	Ljava/io/OutputStream;
    //   69: ifnull +15 -> 84
    //   72: aload_0
    //   73: getfield 180	com/tencent/mm/audio/d/d:crw	Ljava/io/OutputStream;
    //   76: invokevirtual 183	java/io/OutputStream:close	()V
    //   79: aload_0
    //   80: aconst_null
    //   81: putfield 180	com/tencent/mm/audio/d/d:crw	Ljava/io/OutputStream;
    //   84: ldc 160
    //   86: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: return
    //   90: astore_1
    //   91: aload_0
    //   92: monitorexit
    //   93: ldc 160
    //   95: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: aload_1
    //   99: athrow
    //   100: astore_1
    //   101: ldc 63
    //   103: ldc 185
    //   105: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   108: goto -63 -> 45
    //   111: astore_1
    //   112: ldc 63
    //   114: ldc 187
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_1
    //   123: invokevirtual 188	java/util/concurrent/ExecutionException:toString	()Ljava/lang/String;
    //   126: aastore
    //   127: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: goto -85 -> 45
    //   133: astore_1
    //   134: ldc 63
    //   136: new 82	java/lang/StringBuilder
    //   139: dup
    //   140: ldc 193
    //   142: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: aload_0
    //   146: getfield 195	com/tencent/mm/audio/d/d:crp	Ljava/lang/String;
    //   149: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: ldc 197
    //   154: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: aload_1
    //   158: invokevirtual 154	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   161: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: goto -91 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   14	21	90	finally
    //   91	93	90	finally
    //   28	45	100	java/lang/InterruptedException
    //   28	45	111	java/util/concurrent/ExecutionException
    //   72	79	133	java/lang/Exception
  }

  public final boolean Ff()
  {
    AppMethodBeat.i(55780);
    if (this.crB != null)
    {
      this.crB.dPT();
      this.crB = null;
    }
    this.crB = new com.tencent.qqpinyin.voicerecoapi.a();
    int i = this.crB.dPS();
    boolean bool;
    if (i != 0)
    {
      ab.e("MicroMsg.SpeexWriter", "resetWriter speexInit failed: ".concat(String.valueOf(i)));
      bool = false;
      AppMethodBeat.o(55780);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(55780);
    }
  }

  public final int a(g.a parama)
  {
    AppMethodBeat.i(55777);
    int i = a(parama, 0, false);
    AppMethodBeat.o(55777);
    return i;
  }

  public final int a(g.a parama, int paramInt, boolean paramBoolean)
  {
    paramInt = -1;
    AppMethodBeat.i(55778);
    if ((this.crB == null) || (parama.buf == null) || (parama.cqs == 0))
    {
      ab.e("MicroMsg.SpeexWriter", "try write invalid data to file");
      AppMethodBeat.o(55778);
    }
    while (true)
    {
      return paramInt;
      try
      {
        parama = this.crB.Z(parama.buf, parama.cqs);
        if ((parama != null) && (parama.length > 0))
        {
          ab.d("MicroMsg.SpeexWriter", "write to file, len: %d", new Object[] { Integer.valueOf(parama.length) });
          this.crw.write(parama);
          this.crw.flush();
          int i = parama.length;
          AppMethodBeat.o(55778);
          paramInt = i;
        }
        else
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("convert failed: ");
          if (parama == null);
          for (parama = "outBuffer is null"; ; parama = "size is zero")
          {
            ab.e("MicroMsg.SpeexWriter", parama);
            AppMethodBeat.o(55778);
            break;
          }
        }
      }
      catch (Exception parama)
      {
        ab.e("MicroMsg.SpeexWriter", "write to file failed", new Object[] { parama });
        AppMethodBeat.o(55778);
      }
    }
  }

  public final boolean eo(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(55776);
    ab.i("MicroMsg.SpeexWriter", "initWriter, path: ".concat(String.valueOf(paramString)));
    if (paramString == null)
      AppMethodBeat.o(55776);
    while (true)
    {
      return bool;
      this.crp = paramString;
      try
      {
        this.crw = e.L(paramString, false);
        this.crB = new com.tencent.qqpinyin.voicerecoapi.a();
        int i = this.crB.dPS();
        if (i != 0)
        {
          ab.e("MicroMsg.SpeexWriter", "speexInit failed: ".concat(String.valueOf(i)));
          AppMethodBeat.o(55776);
        }
      }
      catch (Exception localException)
      {
        if (this.crw == null);
      }
      try
      {
        this.crw.close();
        label112: ab.e("MicroMsg.SpeexWriter", "Error on init file: ", new Object[] { localException });
        AppMethodBeat.o(55776);
        continue;
        AppMethodBeat.o(55776);
        bool = true;
      }
      catch (IOException paramString)
      {
        break label112;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.d.d
 * JD-Core Version:    0.6.2
 */