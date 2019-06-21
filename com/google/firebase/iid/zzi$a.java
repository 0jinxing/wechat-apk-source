package com.google.firebase.iid;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzi$a extends ClassLoader
{
  protected final Class<?> loadClass(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(108784);
    if ("com.google.android.gms.iid.MessengerCompat".equals(paramString))
    {
      FirebaseInstanceId.uH();
      paramString = zzi.class;
      AppMethodBeat.o(108784);
    }
    while (true)
    {
      return paramString;
      paramString = super.loadClass(paramString, paramBoolean);
      AppMethodBeat.o(108784);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.zzi.a
 * JD-Core Version:    0.6.2
 */