package com.tencent.mm.plugin.notification.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.IOException;

public final class b
{
  private static final String oVS;

  static
  {
    AppMethodBeat.i(23128);
    oVS = com.tencent.mm.compatible.util.e.eSn + "FailMsgFileCache";
    AppMethodBeat.o(23128);
  }

  public static b.a Ar(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(23126);
    Object localObject2;
    if (paramInt == 1)
      localObject2 = oVS + File.separator + "normalMsg";
    while (true)
    {
      if (bo.isNullOrNil((String)localObject2))
      {
        ab.e("MicroMsg.FailMsgFileCache", "extractFromDisk error, cannot find filename");
        AppMethodBeat.o(23126);
        localObject2 = localObject1;
      }
      while (true)
      {
        return localObject2;
        if (paramInt != 2)
          break label200;
        localObject2 = oVS + File.separator + "snsMsg";
        break;
        ab.d("MicroMsg.FailMsgFileCache", "extractFromDisk, filename:%s", new Object[] { localObject2 });
        try
        {
          String str = com.tencent.mm.a.e.cy((String)localObject2);
          ab.d("MicroMsg.FailMsgFileCache", "extractFromDisk, cacheContent:%s", new Object[] { str });
          localObject2 = new com/tencent/mm/plugin/notification/d/b$a;
          ((b.a)localObject2).<init>();
          ((b.a)localObject2).TT(str);
          AppMethodBeat.o(23126);
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.FailMsgFileCache", localIOException, "", new Object[0]);
          ab.d("MicroMsg.FailMsgFileCache", "extractFromDisk error:%s", new Object[] { localIOException.toString() });
          AppMethodBeat.o(23126);
          localObject3 = localObject1;
        }
      }
      label200: Object localObject3 = null;
    }
  }

  public static void As(int paramInt)
  {
    AppMethodBeat.i(23127);
    String str = null;
    if (paramInt == 1)
      str = oVS + File.separator + "normalMsg";
    label139: 
    while (true)
    {
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.FailMsgFileCache", "removeFile error, cannot find filename");
        AppMethodBeat.o(23127);
      }
      while (true)
      {
        return;
        if (paramInt != 2)
          break label139;
        str = oVS + File.separator + "snsMsg";
        break;
        ab.d("MicroMsg.FailMsgFileCache", "removeFile, filename:%s", new Object[] { str });
        if (com.tencent.mm.a.e.ct(str))
          new File(str).delete();
        AppMethodBeat.o(23127);
      }
    }
  }

  public static void a(int paramInt, b.a parama)
  {
    AppMethodBeat.i(23125);
    String str = null;
    if (paramInt == 1)
      str = oVS + File.separator + "normalMsg";
    label176: 
    while (true)
    {
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.FailMsgFileCache", "flushToDisk error, cannot find filename");
        AppMethodBeat.o(23125);
      }
      while (true)
      {
        return;
        if (paramInt != 2)
          break label176;
        str = oVS + File.separator + "snsMsg";
        break;
        ab.d("MicroMsg.FailMsgFileCache", "flushToDisk, filename:%s", new Object[] { str });
        parama = parama.bWO();
        ab.d("MicroMsg.FailMsgFileCache", "flushToDisk, cacheContent:%s", new Object[] { parama });
        if (bo.isNullOrNil(parama))
        {
          ab.d("MicroMsg.FailMsgFileCache", "flushToDisk, content is empty");
          AppMethodBeat.o(23125);
        }
        else
        {
          com.tencent.mm.a.e.b(str, parama.getBytes(), parama.length());
          AppMethodBeat.o(23125);
        }
      }
    }
  }

  public static void init()
  {
    AppMethodBeat.i(23124);
    ab.d("MicroMsg.FailMsgFileCache", "init FailMsgFileCache");
    new File(oVS).mkdirs();
    AppMethodBeat.o(23124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.b
 * JD-Core Version:    0.6.2
 */