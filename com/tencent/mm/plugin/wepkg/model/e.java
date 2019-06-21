package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.d.b;
import com.tencent.mm.protocal.protobuf.acc;
import com.tencent.mm.protocal.protobuf.cte;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.o;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
{
  private static int uWR = 4;
  private static ByteOrder uWS = ByteOrder.BIG_ENDIAN;
  private volatile String eeO;
  private File gUc;
  volatile boolean gUe;
  private volatile int uWT;
  private volatile int uWU;
  volatile cte uWV;
  private volatile LinkedList<acc> uWW;
  private volatile String uWX;

  public e(File paramFile)
  {
    AppMethodBeat.i(63525);
    this.gUe = false;
    this.uWU = 0;
    this.uWV = null;
    this.uWW = null;
    this.uWX = "";
    this.eeO = "";
    this.gUc = paramFile;
    if (avX())
      bool = true;
    this.gUe = bool;
    AppMethodBeat.o(63525);
  }

  private boolean a(FileChannel paramFileChannel)
  {
    boolean bool = false;
    AppMethodBeat.i(63528);
    if (this.uWT <= 0)
      AppMethodBeat.o(63528);
    while (true)
    {
      return bool;
      try
      {
        paramFileChannel.position(uWR);
        Object localObject = ByteBuffer.allocate(this.uWT);
        ((ByteBuffer)localObject).order(uWS);
        paramFileChannel.read((ByteBuffer)localObject);
        paramFileChannel = ((ByteBuffer)localObject).array();
        if (paramFileChannel != null)
        {
          int i = paramFileChannel.length;
          if (i != 0);
        }
        else
        {
          AppMethodBeat.o(63528);
          continue;
        }
        localObject = new com/tencent/mm/protocal/protobuf/cte;
        ((cte)localObject).<init>();
        this.uWV = ((cte)localObject);
        this.uWV.parseFrom(paramFileChannel);
        this.uWW = this.uWV.xqk;
        this.uWX = this.uWV.xql;
        this.eeO = this.uWV.Desc;
        this.uWU = (uWR + this.uWT);
        bool = true;
        AppMethodBeat.o(63528);
      }
      catch (Exception paramFileChannel)
      {
        ab.e("MicroMsg.Wepkg.WePkgReader", "dealProtoData error, " + paramFileChannel.getMessage());
        AppMethodBeat.o(63528);
      }
    }
  }

  private boolean avX()
  {
    boolean bool1 = false;
    AppMethodBeat.i(63527);
    Object localObject1 = null;
    try
    {
      Object localObject2 = new java/io/RandomAccessFile;
      ((RandomAccessFile)localObject2).<init>(this.gUc, "r");
      localObject2 = ((RandomAccessFile)localObject2).getChannel();
      localObject1 = localObject2;
      if (localObject1 == null)
      {
        AppMethodBeat.o(63527);
        bool2 = bool1;
        return bool2;
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        boolean bool2;
        ab.e("MicroMsg.Wepkg.WePkgReader", "openfile failed, " + localException1.getMessage());
        continue;
        try
        {
          localObject1.position(0L);
          localObject3 = ByteBuffer.allocate(uWR);
          ((ByteBuffer)localObject3).order(uWS);
          localObject1.read((ByteBuffer)localObject3);
          this.uWT = ((ByteBuffer)localObject3).getInt(0);
          bool2 = a(localObject1);
          b(localObject1);
          AppMethodBeat.o(63527);
        }
        catch (Exception localException2)
        {
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("parseHeader error, ");
          ab.e("MicroMsg.Wepkg.WePkgReader", localException2.getMessage());
          b(localObject1);
          AppMethodBeat.o(63527);
          bool2 = bool1;
        }
        finally
        {
          b(localObject1);
          AppMethodBeat.o(63527);
        }
      }
    }
  }

  private static void b(FileChannel paramFileChannel)
  {
    AppMethodBeat.i(63529);
    if (paramFileChannel != null);
    while (true)
    {
      try
      {
        paramFileChannel.close();
        AppMethodBeat.o(63529);
        return;
      }
      catch (IOException paramFileChannel)
      {
      }
      AppMethodBeat.o(63529);
    }
  }

  public final o hy(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63526);
    if ((bo.ek(this.uWW)) || (this.uWU < uWR) || (bo.isNullOrNil(paramString1)))
    {
      ab.e("MicroMsg.Wepkg.WePkgReader", "mFileIndexList is null");
      paramString1 = null;
      AppMethodBeat.o(63526);
    }
    while (true)
    {
      return paramString1;
      Iterator localIterator = this.uWW.iterator();
      while (true)
      {
        acc localacc;
        while (true)
        {
          if (!localIterator.hasNext())
            break label373;
          localacc = (acc)localIterator.next();
          if (bo.nullAsNil(localacc.wjQ).equals(paramString1))
          {
            Object localObject = localacc.wjS;
            if ((!bo.isNullOrNil((String)localObject)) && ((((String)localObject).startsWith("video/")) || (((String)localObject).startsWith("audio/"))));
            for (int i = 1; ; i = 0)
            {
              if (i == 0)
                break label165;
              ab.i("MicroMsg.Wepkg.WePkgReader", "filename (%s) is media resource", new Object[] { paramString1 });
              paramString1 = null;
              AppMethodBeat.o(63526);
              break;
            }
            label165: if (localacc.jCo > 5242880L)
              break label315;
            try
            {
              ab.i("MicroMsg.Wepkg.WePkgReader", "rid hit big package. rid:%s", new Object[] { paramString1 });
              localObject = localacc.wjS;
              b localb = new com/tencent/mm/plugin/wepkg/d/b;
              localb.<init>(this.gUc, this.uWU + localacc.wjR, localacc.jCo);
              localObject = new o((String)localObject, paramString2, localb);
              AppMethodBeat.o(63526);
              paramString1 = (String)localObject;
            }
            catch (IOException localIOException)
            {
              ab.e("MicroMsg.Wepkg.WePkgReader", "filename = %s, offset = %d, size = %d, mimeType = %s, e = %s", new Object[] { paramString1, Long.valueOf(localacc.wjR), Integer.valueOf(localacc.jCo), localacc.wjS, localIOException.getMessage() });
            }
          }
        }
        continue;
        label315: ab.i("MicroMsg.Wepkg.WePkgReader", "fileSize(%d) > limitSize(%d), filename = %s, offset = %d, mimeType = %s", new Object[] { Integer.valueOf(localacc.jCo), Long.valueOf(5242880L), paramString1, Long.valueOf(localacc.wjR), localacc.wjS });
      }
      label373: paramString1 = null;
      AppMethodBeat.o(63526);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.e
 * JD-Core Version:    0.6.2
 */