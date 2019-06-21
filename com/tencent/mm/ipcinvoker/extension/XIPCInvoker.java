package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.ipcinvoker.i;

public final class XIPCInvoker
{
  public static <T extends i<InputType, ResultType>, InputType, ResultType> ResultType a(String paramString, InputType paramInputType, Class<T> paramClass)
  {
    AppMethodBeat.i(114100);
    paramString = (WrapperParcelable)f.a(paramString, new WrapperParcelable(paramClass.getName(), paramInputType), XIPCInvoker.c.class);
    if (paramString == null)
    {
      b.w("IPC.XIPCInvoker", "sync invoke error, wrapper parcelable data is null!", new Object[0]);
      paramString = null;
      AppMethodBeat.o(114100);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.eGy;
      AppMethodBeat.o(114100);
    }
  }

  public static <T extends com.tencent.mm.ipcinvoker.a<InputType, ResultType>, InputType, ResultType> void a(String paramString, InputType paramInputType, Class<T> paramClass, com.tencent.mm.ipcinvoker.c<ResultType> paramc)
  {
    AppMethodBeat.i(114099);
    f.a(paramString, new WrapperParcelable(paramClass.getName(), paramInputType), XIPCInvoker.a.class, new XIPCInvoker.1(paramc));
    AppMethodBeat.o(114099);
  }

  static class WrapperParcelable
    implements Parcelable
  {
    public static final Parcelable.Creator<WrapperParcelable> CREATOR;
    String eGB;
    Object eGy;

    static
    {
      AppMethodBeat.i(114098);
      CREATOR = new XIPCInvoker.WrapperParcelable.1();
      AppMethodBeat.o(114098);
    }

    private WrapperParcelable()
    {
    }

    public WrapperParcelable(String paramString, Object paramObject)
    {
      this.eGB = paramString;
      this.eGy = paramObject;
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(114097);
      paramParcel.writeString(this.eGB);
      if (this.eGy != null)
      {
        a locala = c.ar(this.eGy);
        if (locala != null)
        {
          paramParcel.writeInt(1);
          paramParcel.writeString(locala.getClass().getName());
          locala.a(this.eGy, paramParcel);
          AppMethodBeat.o(114097);
        }
      }
      while (true)
      {
        return;
        paramParcel.writeInt(0);
        AppMethodBeat.o(114097);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.XIPCInvoker
 * JD-Core Version:    0.6.2
 */