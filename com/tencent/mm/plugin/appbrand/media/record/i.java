package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class i
{
  public static String ph(int paramInt)
  {
    AppMethodBeat.i(105640);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("errType:" + paramInt + ", err:");
    switch (paramInt)
    {
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    default:
      ((StringBuilder)localObject).append("unknow error");
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    }
    while (true)
    {
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(105640);
      return localObject;
      ((StringBuilder)localObject).append("error PCM record callback");
      continue;
      ((StringBuilder)localObject).append("init encoder fail, occur exception");
      continue;
      ((StringBuilder)localObject).append("encoder un initial occur exception");
      continue;
      ((StringBuilder)localObject).append("start record occur exception");
      continue;
      ((StringBuilder)localObject).append("resume record occur exception");
      continue;
      ((StringBuilder)localObject).append("fail to start record");
      continue;
      ((StringBuilder)localObject).append("fail to resume record");
      continue;
      ((StringBuilder)localObject).append("fail to pause record");
      continue;
      ((StringBuilder)localObject).append("fail to stop record");
      continue;
      ((StringBuilder)localObject).append("check param invalid");
      continue;
      ((StringBuilder)localObject).append("not support format type");
      continue;
      ((StringBuilder)localObject).append("fail to init mp3 encoder");
      continue;
      ((StringBuilder)localObject).append("mp3 file not found exception");
      continue;
      ((StringBuilder)localObject).append("mp3 encode exception");
      continue;
      ((StringBuilder)localObject).append("mp3 write buffer exception");
      continue;
      ((StringBuilder)localObject).append("fail to init aac encoder");
      continue;
      ((StringBuilder)localObject).append("fail to create mp4 file");
      continue;
      ((StringBuilder)localObject).append("aac encode exception");
      continue;
      ((StringBuilder)localObject).append("create cache file fail");
      continue;
      ((StringBuilder)localObject).append("init encoder fail");
      continue;
      ((StringBuilder)localObject).append("not support sample rate");
    }
  }

  public static int pi(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(105641);
    ab.i("MicroMsg.Record.RecordErrorHandler", "getErrIdKey errType:%d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    default:
      AppMethodBeat.o(105641);
      paramInt = i;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    }
    while (true)
    {
      return paramInt;
      paramInt = 3;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 4;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 5;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 6;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 7;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 8;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 9;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 10;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 11;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 15;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 16;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 17;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 18;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 19;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 20;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 21;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 22;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 23;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 24;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 25;
      AppMethodBeat.o(105641);
      continue;
      paramInt = 26;
      AppMethodBeat.o(105641);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.i
 * JD-Core Version:    0.6.2
 */