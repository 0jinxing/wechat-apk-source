package com.tencent.mm.plugin.appbrand.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.d.d.a;
import com.tencent.mm.plugin.appbrand.t.e.h;
import com.tencent.mm.plugin.appbrand.t.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class c
  implements a
{
  public static boolean DEBUG;
  public static int iSu;
  public static final List<com.tencent.mm.plugin.appbrand.t.b.a> iSv;
  private volatile boolean iSA;
  private a.a iSB;
  public final d iSC;
  private List<com.tencent.mm.plugin.appbrand.t.b.a> iSD;
  public com.tencent.mm.plugin.appbrand.t.b.a iSE;
  public a.b iSF;
  private d.a iSG;
  private ByteBuffer iSH;
  public com.tencent.mm.plugin.appbrand.t.e.a iSI;
  private String iSJ;
  private Integer iSK;
  private Boolean iSL;
  public String iSM;
  public SelectionKey iSw;
  public ByteChannel iSx;
  public final BlockingQueue<ByteBuffer> iSy;
  public final BlockingQueue<ByteBuffer> iSz;

  static
  {
    AppMethodBeat.i(73225);
    iSu = 16384;
    DEBUG = false;
    ArrayList localArrayList = new ArrayList(4);
    iSv = localArrayList;
    localArrayList.add(new com.tencent.mm.plugin.appbrand.t.b.c());
    iSv.add(new com.tencent.mm.plugin.appbrand.t.b.b());
    iSv.add(new com.tencent.mm.plugin.appbrand.t.b.d());
    AppMethodBeat.o(73225);
  }

  public c(d paramd, com.tencent.mm.plugin.appbrand.t.b.a parama)
  {
    AppMethodBeat.i(73207);
    this.iSA = false;
    this.iSB = a.a.iSk;
    this.iSE = null;
    this.iSG = null;
    this.iSH = ByteBuffer.allocate(0);
    this.iSI = null;
    this.iSJ = null;
    this.iSK = null;
    this.iSL = null;
    this.iSM = null;
    if ((parama == null) && (this.iSF == a.b.iSr))
    {
      paramd = new IllegalArgumentException("parameters must not be null");
      AppMethodBeat.o(73207);
      throw paramd;
    }
    this.iSy = new LinkedBlockingQueue();
    this.iSz = new LinkedBlockingQueue();
    this.iSC = paramd;
    this.iSF = a.b.iSq;
    if (parama != null)
      this.iSE = parama.aOm();
    AppMethodBeat.o(73207);
  }

  private void a(com.tencent.mm.plugin.appbrand.t.c.b paramb)
  {
    AppMethodBeat.i(73215);
    d(paramb.iTp, paramb.getMessage(), false);
    AppMethodBeat.o(73215);
  }

  private void c(com.tencent.mm.plugin.appbrand.t.e.f paramf)
  {
    AppMethodBeat.i(73222);
    if (DEBUG)
      ab.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "open using draft: " + this.iSE.getClass().getSimpleName());
    this.iSB = a.a.iSm;
    try
    {
      this.iSC.d(paramf);
      AppMethodBeat.o(73222);
      return;
    }
    catch (RuntimeException paramf)
    {
      while (true)
      {
        this.iSC.f(paramf);
        AppMethodBeat.o(73222);
      }
    }
  }

  private void e(int paramInt, String paramString, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(73213);
      if (this.iSA)
        AppMethodBeat.o(73213);
      while (true)
      {
        return;
        this.iSK = Integer.valueOf(paramInt);
        this.iSJ = paramString;
        this.iSL = Boolean.valueOf(paramBoolean);
        this.iSA = true;
        if (this.iSE != null)
          this.iSE.reset();
        this.iSI = null;
        AppMethodBeat.o(73213);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  private void f(Collection<com.tencent.mm.plugin.appbrand.t.d.d> paramCollection)
  {
    AppMethodBeat.i(73218);
    if (!isOpen())
    {
      paramCollection = new com.tencent.mm.plugin.appbrand.t.c.f();
      AppMethodBeat.o(73218);
      throw paramCollection;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
      b((com.tencent.mm.plugin.appbrand.t.d.d)paramCollection.next());
    AppMethodBeat.o(73218);
  }

  private boolean s(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73209);
    ByteBuffer localByteBuffer;
    if (this.iSH.capacity() == 0)
      localByteBuffer = paramByteBuffer;
    while (true)
    {
      localByteBuffer.mark();
      try
      {
        if (this.iSF == a.b.iSr)
          if (this.iSE == null)
          {
            localObject1 = this.iSD.iterator();
            while (true)
              while (true)
              {
                label50: if (!((Iterator)localObject1).hasNext())
                  break label434;
                com.tencent.mm.plugin.appbrand.t.b.a locala1 = ((com.tencent.mm.plugin.appbrand.t.b.a)((Iterator)localObject1).next()).aOm();
                try
                {
                  locala1.a(this.iSF);
                  localByteBuffer.reset();
                  localObject2 = locala1.y(localByteBuffer);
                  if (!(localObject2 instanceof com.tencent.mm.plugin.appbrand.t.e.a))
                  {
                    e(1002, "wrong http function", false);
                    AppMethodBeat.o(73209);
                    bool = false;
                  }
                  while (true)
                  {
                    return bool;
                    if (this.iSH.remaining() < paramByteBuffer.remaining())
                    {
                      localByteBuffer = ByteBuffer.allocate(this.iSH.capacity() + paramByteBuffer.remaining());
                      this.iSH.flip();
                      localByteBuffer.put(this.iSH);
                      this.iSH = localByteBuffer;
                    }
                    this.iSH.put(paramByteBuffer);
                    this.iSH.flip();
                    localByteBuffer = this.iSH;
                    break;
                    localObject2 = (com.tencent.mm.plugin.appbrand.t.e.a)localObject2;
                    if (locala1.c((com.tencent.mm.plugin.appbrand.t.e.a)localObject2) != com.tencent.mm.plugin.appbrand.t.b.a.b.iTg)
                      break label50;
                    this.iSM = ((com.tencent.mm.plugin.appbrand.t.e.a)localObject2).aOu();
                    try
                    {
                      i locali = this.iSC.aOh();
                      aQ(com.tencent.mm.plugin.appbrand.t.b.a.f(locala1.a((com.tencent.mm.plugin.appbrand.t.e.a)localObject2, locali)));
                      this.iSE = locala1;
                      c((com.tencent.mm.plugin.appbrand.t.e.f)localObject2);
                      AppMethodBeat.o(73209);
                      bool = true;
                    }
                    catch (com.tencent.mm.plugin.appbrand.t.c.b localb)
                    {
                      e(localb.iTp, localb.getMessage(), false);
                      AppMethodBeat.o(73209);
                      bool = false;
                    }
                    catch (RuntimeException localRuntimeException)
                    {
                      this.iSC.f(localRuntimeException);
                      e(-1, localRuntimeException.getMessage(), false);
                      AppMethodBeat.o(73209);
                      bool = false;
                    }
                  }
                }
                catch (com.tencent.mm.plugin.appbrand.t.c.d locald1)
                {
                  Object localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>("InvalidHandshakeException e: ");
                  ab.e("MicroMsg.AppBrandNetWork.WebSocketImpl", locald1.toString());
                }
              }
          }
      }
      catch (com.tencent.mm.plugin.appbrand.t.c.d locald2)
      {
        boolean bool;
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("decodeHandshake: ");
        ab.e("MicroMsg.AppBrandNetWork.WebSocketImpl", locald2.toString());
        a(locald2);
        while (true)
        {
          AppMethodBeat.o(73209);
          bool = false;
          break;
          if (this.iSE == null)
            d(1002, "no draft matches", false);
          AppMethodBeat.o(73209);
          bool = false;
          break;
          localObject1 = this.iSE.y(localByteBuffer);
          if (!(localObject1 instanceof com.tencent.mm.plugin.appbrand.t.e.a))
          {
            e(1002, "wrong http function", false);
            AppMethodBeat.o(73209);
            bool = false;
            break;
          }
          localObject1 = (com.tencent.mm.plugin.appbrand.t.e.a)localObject1;
          if (this.iSE.c((com.tencent.mm.plugin.appbrand.t.e.a)localObject1) == com.tencent.mm.plugin.appbrand.t.b.a.b.iTg)
          {
            c((com.tencent.mm.plugin.appbrand.t.e.f)localObject1);
            AppMethodBeat.o(73209);
            bool = true;
            break;
          }
          d(1002, "the handshake did finaly not match", false);
          AppMethodBeat.o(73209);
          bool = false;
          break;
          if (this.iSF == a.b.iSq)
          {
            this.iSE.a(this.iSF);
            localObject1 = this.iSE.y(localByteBuffer);
            if (!(localObject1 instanceof h))
            {
              e(1002, "wrong http function", false);
              AppMethodBeat.o(73209);
              bool = false;
              break;
            }
            h localh = (h)localObject1;
            if (this.iSE.a(this.iSI, localh) == com.tencent.mm.plugin.appbrand.t.b.a.b.iTg)
            {
              c(localh);
              AppMethodBeat.o(73209);
              bool = true;
              break;
            }
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("draft refuses handshake ");
            d(1002, localh.aOw() + " " + localh.aOv(), false);
          }
        }
      }
      catch (com.tencent.mm.plugin.appbrand.t.c.a locala)
      {
        while (true)
        {
          label434: ab.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeHandshake: " + locala.toString());
          if (this.iSH.capacity() == 0)
          {
            localByteBuffer.reset();
            int i = locala.iTo;
            int j = i;
            if (i == 0)
              j = localByteBuffer.capacity() + 16;
            this.iSH = ByteBuffer.allocate(j);
            this.iSH.put(paramByteBuffer);
          }
          else
          {
            this.iSH.position(this.iSH.limit());
            this.iSH.limit(this.iSH.capacity());
          }
        }
      }
    }
  }

  private void t(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73210);
    while (true)
    {
      d.a locala1;
      boolean bool;
      int i;
      try
      {
        Iterator localIterator = this.iSE.x(paramByteBuffer).iterator();
        if (!localIterator.hasNext())
          break label521;
        paramByteBuffer = (com.tencent.mm.plugin.appbrand.t.d.d)localIterator.next();
        if (DEBUG)
          ab.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "matched frame: ".concat(String.valueOf(paramByteBuffer)));
        locala1 = paramByteBuffer.aOt();
        bool = paramByteBuffer.aOr();
        if (locala1 != d.a.iTw)
          break label217;
        i = 1005;
        if (!(paramByteBuffer instanceof com.tencent.mm.plugin.appbrand.t.d.a))
          break label530;
        paramByteBuffer = (com.tencent.mm.plugin.appbrand.t.d.a)paramByteBuffer;
        i = paramByteBuffer.aOn();
        paramByteBuffer = paramByteBuffer.getMessage();
        if (this.iSB == a.a.iSn)
        {
          af(i, paramByteBuffer);
          continue;
        }
      }
      catch (com.tencent.mm.plugin.appbrand.t.c.b paramByteBuffer)
      {
        ab.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeFrames: " + paramByteBuffer.toString());
        this.iSC.f(paramByteBuffer);
        a(paramByteBuffer);
        AppMethodBeat.o(73210);
        return;
      }
      label521: label530: if (this.iSE.aOl() == com.tencent.mm.plugin.appbrand.t.b.a.a.iTe)
      {
        d(i, paramByteBuffer, true);
      }
      else
      {
        e(i, paramByteBuffer, false);
        continue;
        label217: if (locala1 == d.a.iTu)
        {
          this.iSC.a(this, paramByteBuffer);
        }
        else if (locala1 != d.a.iTv)
        {
          if ((!bool) || (locala1 == d.a.iTr))
          {
            if (locala1 != d.a.iTr)
            {
              if (this.iSG != null)
              {
                paramByteBuffer = new com/tencent/mm/plugin/appbrand/t/c/b;
                paramByteBuffer.<init>("Previous continuous frame sequence not completed.");
                AppMethodBeat.o(73210);
                throw paramByteBuffer;
              }
              this.iSG = locala1;
            }
            label361: 
            do
              while (true)
              {
                try
                {
                  this.iSC.c(paramByteBuffer);
                }
                catch (RuntimeException paramByteBuffer)
                {
                  this.iSC.f(paramByteBuffer);
                }
                break;
                if (!bool)
                  break label361;
                if (this.iSG == null)
                {
                  paramByteBuffer = new com/tencent/mm/plugin/appbrand/t/c/b;
                  paramByteBuffer.<init>("Continuous frame sequence was not started.");
                  AppMethodBeat.o(73210);
                  throw paramByteBuffer;
                }
                this.iSG = null;
              }
            while (this.iSG != null);
            paramByteBuffer = new com/tencent/mm/plugin/appbrand/t/c/b;
            paramByteBuffer.<init>("Continuous frame sequence was not started.");
            AppMethodBeat.o(73210);
            throw paramByteBuffer;
          }
          if (this.iSG != null)
          {
            paramByteBuffer = new com/tencent/mm/plugin/appbrand/t/c/b;
            paramByteBuffer.<init>("Continuous frame sequence not completed.");
            AppMethodBeat.o(73210);
            throw paramByteBuffer;
          }
          d.a locala2 = d.a.iTs;
          if (locala1 == locala2)
          {
            try
            {
              this.iSC.Em(com.tencent.mm.plugin.appbrand.t.f.b.B(paramByteBuffer.aOq()));
            }
            catch (RuntimeException paramByteBuffer)
            {
              this.iSC.f(paramByteBuffer);
            }
          }
          else
          {
            locala2 = d.a.iTt;
            if (locala1 == locala2)
            {
              try
              {
                this.iSC.v(paramByteBuffer.aOq());
              }
              catch (RuntimeException paramByteBuffer)
              {
                this.iSC.f(paramByteBuffer);
              }
            }
            else
            {
              paramByteBuffer = new com/tencent/mm/plugin/appbrand/t/c/b;
              paramByteBuffer.<init>("non control or continious frame expected");
              AppMethodBeat.o(73210);
              throw paramByteBuffer;
              AppMethodBeat.o(73210);
              continue;
              paramByteBuffer = "";
            }
          }
        }
      }
    }
  }

  private void u(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73220);
    if (DEBUG)
      ab.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "write(\" + buf.remaining() + \"): {\" + ( buf.remaining() > 1000 ? \"too big to display\" : new String( buf.array() ) ) + \"}");
    this.iSy.add(paramByteBuffer);
    AppMethodBeat.o(73220);
  }

  public final void BU(String paramString)
  {
    AppMethodBeat.i(73216);
    if (paramString == null)
    {
      ab.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
      AppMethodBeat.o(73216);
      return;
    }
    com.tencent.mm.plugin.appbrand.t.b.a locala = this.iSE;
    if (this.iSF == a.b.iSq);
    for (boolean bool = true; ; bool = false)
    {
      f(locala.ar(paramString, bool));
      AppMethodBeat.o(73216);
      break;
    }
  }

  public final void aOi()
  {
    AppMethodBeat.i(73214);
    if (this.iSB == a.a.iSk)
    {
      af(-1, "");
      AppMethodBeat.o(73214);
    }
    while (true)
    {
      return;
      if (this.iSA)
      {
        int i = this.iSK.intValue();
        String str = this.iSJ;
        this.iSL.booleanValue();
        af(i, str);
        AppMethodBeat.o(73214);
      }
      else if (this.iSE.aOl() == com.tencent.mm.plugin.appbrand.t.b.a.a.iTc)
      {
        af(1000, "");
        AppMethodBeat.o(73214);
      }
      else if ((this.iSE.aOl() == com.tencent.mm.plugin.appbrand.t.b.a.a.iTd) && (this.iSF != a.b.iSr))
      {
        af(1000, "");
        AppMethodBeat.o(73214);
      }
      else
      {
        af(1006, "");
        AppMethodBeat.o(73214);
      }
    }
  }

  public final boolean aOj()
  {
    if (this.iSB == a.a.iSn);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void aQ(List<ByteBuffer> paramList)
  {
    AppMethodBeat.i(73221);
    paramList = paramList.iterator();
    while (paramList.hasNext())
      u((ByteBuffer)paramList.next());
    AppMethodBeat.o(73221);
  }

  // ERROR //
  public final void af(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 517
    //   5: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 96	com/tencent/mm/plugin/appbrand/t/c:iSB	Lcom/tencent/mm/plugin/appbrand/t/a$a;
    //   12: getstatic 520	com/tencent/mm/plugin/appbrand/t/a$a:iSo	Lcom/tencent/mm/plugin/appbrand/t/a$a;
    //   15: if_acmpne +12 -> 27
    //   18: ldc_w 517
    //   21: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: getfield 522	com/tencent/mm/plugin/appbrand/t/c:iSw	Ljava/nio/channels/SelectionKey;
    //   31: ifnull +10 -> 41
    //   34: aload_0
    //   35: getfield 522	com/tencent/mm/plugin/appbrand/t/c:iSw	Ljava/nio/channels/SelectionKey;
    //   38: invokevirtual 527	java/nio/channels/SelectionKey:cancel	()V
    //   41: aload_0
    //   42: getfield 529	com/tencent/mm/plugin/appbrand/t/c:iSx	Ljava/nio/channels/ByteChannel;
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull +12 -> 59
    //   50: aload_0
    //   51: getfield 529	com/tencent/mm/plugin/appbrand/t/c:iSx	Ljava/nio/channels/ByteChannel;
    //   54: invokeinterface 534 1 0
    //   59: aload_0
    //   60: getfield 141	com/tencent/mm/plugin/appbrand/t/c:iSC	Lcom/tencent/mm/plugin/appbrand/t/d;
    //   63: iload_1
    //   64: aload_2
    //   65: invokeinterface 537 3 0
    //   70: aload_0
    //   71: getfield 98	com/tencent/mm/plugin/appbrand/t/c:iSE	Lcom/tencent/mm/plugin/appbrand/t/b/a;
    //   74: ifnull +10 -> 84
    //   77: aload_0
    //   78: getfield 98	com/tencent/mm/plugin/appbrand/t/c:iSE	Lcom/tencent/mm/plugin/appbrand/t/b/a;
    //   81: invokevirtual 226	com/tencent/mm/plugin/appbrand/t/b/a:reset	()V
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 110	com/tencent/mm/plugin/appbrand/t/c:iSI	Lcom/tencent/mm/plugin/appbrand/t/e/a;
    //   89: aload_0
    //   90: getstatic 520	com/tencent/mm/plugin/appbrand/t/a$a:iSo	Lcom/tencent/mm/plugin/appbrand/t/a$a;
    //   93: putfield 96	com/tencent/mm/plugin/appbrand/t/c:iSB	Lcom/tencent/mm/plugin/appbrand/t/a$a;
    //   96: aload_0
    //   97: getfield 137	com/tencent/mm/plugin/appbrand/t/c:iSy	Ljava/util/concurrent/BlockingQueue;
    //   100: invokeinterface 540 1 0
    //   105: ldc_w 517
    //   108: invokestatic 83	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: goto -87 -> 24
    //   114: astore_2
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_2
    //   118: athrow
    //   119: astore_3
    //   120: aload_0
    //   121: getfield 141	com/tencent/mm/plugin/appbrand/t/c:iSC	Lcom/tencent/mm/plugin/appbrand/t/d;
    //   124: aload_3
    //   125: invokeinterface 210 2 0
    //   130: goto -71 -> 59
    //   133: astore_2
    //   134: aload_0
    //   135: getfield 141	com/tencent/mm/plugin/appbrand/t/c:iSC	Lcom/tencent/mm/plugin/appbrand/t/d;
    //   138: aload_2
    //   139: invokeinterface 210 2 0
    //   144: goto -74 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   2	24	114	finally
    //   27	41	114	finally
    //   41	46	114	finally
    //   50	59	114	finally
    //   59	70	114	finally
    //   70	84	114	finally
    //   84	111	114	finally
    //   120	130	114	finally
    //   134	144	114	finally
    //   50	59	119	java/io/IOException
    //   59	70	133	java/lang/RuntimeException
  }

  public final void b(com.tencent.mm.plugin.appbrand.t.d.d paramd)
  {
    AppMethodBeat.i(73219);
    if (DEBUG)
      ab.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "\"send frame: \" + framedata ");
    u(this.iSE.d(paramd));
    AppMethodBeat.o(73219);
  }

  public final void d(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(73211);
    if ((this.iSB != a.a.iSn) && (this.iSB != a.a.iSo))
      if (this.iSB == a.a.iSm)
        if (paramInt == 1006)
        {
          this.iSB = a.a.iSn;
          e(paramInt, paramString, false);
          AppMethodBeat.o(73211);
        }
    while (true)
    {
      return;
      if (this.iSE.aOl() != com.tencent.mm.plugin.appbrand.t.b.a.a.iTc);
      while (true)
      {
        try
        {
          com.tencent.mm.plugin.appbrand.t.d.b localb = new com/tencent/mm/plugin/appbrand/t/d/b;
          localb.<init>(paramInt, paramString);
          b(localb);
          e(paramInt, paramString, paramBoolean);
          if (paramInt == 1002)
            e(paramInt, paramString, paramBoolean);
          this.iSB = a.a.iSn;
          this.iSH = null;
          AppMethodBeat.o(73211);
        }
        catch (com.tencent.mm.plugin.appbrand.t.c.b localb1)
        {
          ab.e("MicroMsg.AppBrandNetWork.WebSocketImpl", "close: " + localb1.toString());
          this.iSC.f(localb1);
          e(1006, "generated frame is invalid", false);
          continue;
        }
        if (paramInt == -3)
          e(-3, paramString, true);
        else
          e(-1, paramString, false);
      }
      AppMethodBeat.o(73211);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(73223);
    int i = super.hashCode();
    AppMethodBeat.o(73223);
    return i;
  }

  public final boolean isClosed()
  {
    if (this.iSB == a.a.iSo);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isOpen()
  {
    if (this.iSB == a.a.iSm);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void p(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73217);
    if (paramByteBuffer == null)
    {
      ab.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
      AppMethodBeat.o(73217);
      return;
    }
    com.tencent.mm.plugin.appbrand.t.b.a locala = this.iSE;
    if (this.iSF == a.b.iSq);
    for (boolean bool = true; ; bool = false)
    {
      f(locala.a(paramByteBuffer, bool));
      AppMethodBeat.o(73217);
      break;
    }
  }

  public final void r(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73208);
    if (DEBUG)
      ab.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "\"process(\" + socketBuffer.remaining() + \"): {\" + ( socketBuffer.remaining() > 1000 ? \"too big to display\" : new String( socketBuffer.array(), socketBuffer.position(), socketBuffer.remaining() ) ) + \"}\"");
    if (this.iSB != a.a.iSk)
    {
      if (this.iSB != a.a.iSm)
        break label113;
      t(paramByteBuffer);
      AppMethodBeat.o(73208);
    }
    while (true)
    {
      return;
      if ((s(paramByteBuffer)) && (!aOj()) && (!isClosed()))
      {
        if (paramByteBuffer.hasRemaining())
        {
          t(paramByteBuffer);
          AppMethodBeat.o(73208);
        }
        else if (this.iSH.hasRemaining())
        {
          t(this.iSH);
        }
      }
      else
        label113: AppMethodBeat.o(73208);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(73224);
    String str = super.toString();
    AppMethodBeat.o(73224);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.c
 * JD-Core Version:    0.6.2
 */