package com.tencent.mm.plugin.wepkg.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.bt.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class WepkgRunCgi
{
  static com.tencent.mm.ai.b n(Parcel paramParcel)
  {
    AppMethodBeat.i(63647);
    b.a locala = new b.a();
    Object localObject1 = paramParcel.readString();
    Object localObject2 = new byte[paramParcel.readInt()];
    paramParcel.readByteArray((byte[])localObject2);
    try
    {
      locala.fsJ = ((a)Class.forName((String)localObject1).newInstance()).parseFrom((byte[])localObject2);
      label48: localObject2 = paramParcel.readString();
      localObject1 = new byte[paramParcel.readInt()];
      paramParcel.readByteArray((byte[])localObject1);
      try
      {
        locala.fsK = ((a)Class.forName((String)localObject2).newInstance()).parseFrom((byte[])localObject1);
        locala.uri = paramParcel.readString();
        locala.fsI = paramParcel.readInt();
        locala.fsL = paramParcel.readInt();
        locala.fsM = paramParcel.readInt();
        paramParcel = locala.acD();
        AppMethodBeat.o(63647);
        return paramParcel;
      }
      catch (Exception localException1)
      {
        while (true)
          if ((localException1 instanceof e.a.a.b))
            try
            {
              locala.fsK = ((a)Class.forName((String)localObject2).newInstance());
            }
            catch (Exception localException2)
            {
              ab.e("MicroMsg.Wepkg.WepkgRunCgi", "readCommReqRespFromParcel, resp fields not ready, re-create one but exp = %s", new Object[] { bo.l(localException2) });
            }
      }
    }
    catch (Exception localException3)
    {
      break label48;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi
 * JD-Core Version:    0.6.2
 */