package com.tencent.mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
  implements com.tencent.mm.ipcinvoker.extension.a
{
  private static final d eGK;

  static
  {
    AppMethodBeat.i(101704);
    eGK = new d();
    AppMethodBeat.o(101704);
  }

  public static void a(com.tencent.mm.bt.a parama, Parcel paramParcel)
  {
    AppMethodBeat.i(101700);
    eGK.a(parama, paramParcel);
    AppMethodBeat.o(101700);
  }

  public static <PB extends com.tencent.mm.bt.a> PB f(Parcel paramParcel)
  {
    AppMethodBeat.i(101701);
    paramParcel = (com.tencent.mm.bt.a)eGK.d(paramParcel);
    AppMethodBeat.o(101701);
    return paramParcel;
  }

  public final void a(Object paramObject, Parcel paramParcel)
  {
    AppMethodBeat.i(101702);
    if (paramObject == null)
    {
      paramParcel.writeString(null);
      AppMethodBeat.o(101702);
    }
    while (true)
    {
      return;
      paramObject = (com.tencent.mm.bt.a)paramObject;
      paramParcel.writeString(paramObject.getClass().getName());
      try
      {
        paramObject = paramObject.toByteArray();
        paramParcel.writeInt(paramObject.length);
        paramParcel.writeByteArray(paramObject);
        AppMethodBeat.o(101702);
      }
      catch (Exception paramObject)
      {
        while (true)
        {
          ab.e("MicroMsg.XIPC.MMProtoBufTransfer", "writeToParcel, e = %s", new Object[] { paramObject });
          paramObject = new byte[0];
        }
      }
    }
  }

  public final boolean aq(Object paramObject)
  {
    return paramObject instanceof com.tencent.mm.bt.a;
  }

  public final Object d(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    AppMethodBeat.i(101703);
    String str = paramParcel.readString();
    if (TextUtils.isEmpty(str))
    {
      AppMethodBeat.o(101703);
      paramParcel = arrayOfByte;
    }
    while (true)
    {
      return paramParcel;
      arrayOfByte = new byte[paramParcel.readInt()];
      paramParcel.readByteArray(arrayOfByte);
      try
      {
        paramParcel = (com.tencent.mm.bt.a)Class.forName(str).newInstance();
        paramParcel.parseFrom(arrayOfByte);
        AppMethodBeat.o(101703);
      }
      catch (Exception paramParcel)
      {
        while (true)
        {
          ab.e("MicroMsg.XIPC.MMProtoBufTransfer", "readFromParcel, e = %s", new Object[] { paramParcel });
          paramParcel = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.d
 * JD-Core Version:    0.6.2
 */