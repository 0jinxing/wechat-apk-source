package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import junit.framework.Assert;

public final class h extends e
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS appbrandmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT ) ", "CREATE INDEX IF NOT EXISTS  appbrandmessageSvrIdIndex ON appbrandmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerIndex ON appbrandmessage ( talker )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalerStatusIndex ON appbrandmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTimeIndex ON appbrandmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTaklerTimeIndex ON appbrandmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageSendCreateTimeIndex ON appbrandmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerTypeIndex ON appbrandmessage ( talker,type )" };

  public h(com.tencent.mm.plugin.messenger.foundation.a.a.h paramh)
  {
    super(paramh);
    AppMethodBeat.i(29000);
    a(bOy(), "appbrandmessage");
    a(new h.b(256, "appbrandmessage", h.b.a(3000001L, 3500000L, 102000001L, 105000000L)));
    AppMethodBeat.o(29000);
  }

  public final String aog(String paramString)
  {
    AppMethodBeat.i(29001);
    boolean bool;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (!ad.mg(paramString))
        break label46;
      paramString = "appbrandmessage";
      AppMethodBeat.o(29001);
    }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label46: paramString = null;
      AppMethodBeat.o(29001);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.h
 * JD-Core Version:    0.6.2
 */