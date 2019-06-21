package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.extension.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
  implements com.tencent.mm.ipcinvoker.extension.a
{
  public final void a(Object paramObject, Parcel paramParcel)
  {
    AppMethodBeat.i(126194);
    paramObject = (b)paramObject;
    c.a(paramObject.fsG.fsP, paramParcel);
    if (ah.bqo())
      c.a(paramObject.fsH.fsP, paramParcel);
    while (true)
    {
      paramParcel.writeString(paramObject.uri);
      paramParcel.writeInt(paramObject.fsI);
      paramParcel.writeInt(paramObject.fsG.cmdId);
      paramParcel.writeInt(paramObject.fsH.cmdId);
      paramParcel.writeInt(paramObject.azs);
      AppMethodBeat.o(126194);
      return;
      paramParcel.writeString(paramObject.fsH.fsP.getClass().getName());
    }
  }

  public final boolean aq(Object paramObject)
  {
    return paramObject instanceof b;
  }

  public final Object d(Parcel paramParcel)
  {
    AppMethodBeat.i(126195);
    b.a locala = new b.a();
    locala.fsJ = ((com.tencent.mm.bt.a)c.a(d.class.getName(), paramParcel));
    String str;
    if (ah.bqo())
      str = paramParcel.readString();
    while (true)
    {
      try
      {
        locala.fsK = ((com.tencent.mm.bt.a)Class.forName(str).newInstance());
        locala.uri = paramParcel.readString();
        locala.fsI = paramParcel.readInt();
        locala.fsL = paramParcel.readInt();
        locala.fsM = paramParcel.readInt();
        locala.azs = paramParcel.readInt();
        paramParcel = locala.acD();
        AppMethodBeat.o(126195);
        return paramParcel;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.XIPC.CommReqRespTransfer", "readFromParcel, mm process initiate resp e = %s", new Object[] { localException });
        locala.fsK = new com.tencent.mm.bt.a();
        continue;
      }
      com.tencent.mm.bt.a locala1 = (com.tencent.mm.bt.a)c.a(d.class.getName(), paramParcel);
      Object localObject = locala1;
      if (locala1 == null)
        localObject = new com.tencent.mm.bt.a();
      locala.fsK = ((com.tencent.mm.bt.a)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.a
 * JD-Core Version:    0.6.2
 */