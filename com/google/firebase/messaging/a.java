package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Pattern;

public class a
{
  private static final Pattern bxa;
  private static a bxb;
  public final FirebaseInstanceId bwi;

  static
  {
    AppMethodBeat.i(77208);
    bxa = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    AppMethodBeat.o(77208);
  }

  private a(FirebaseInstanceId paramFirebaseInstanceId)
  {
    this.bwi = paramFirebaseInstanceId;
  }

  public static a va()
  {
    try
    {
      AppMethodBeat.i(77207);
      if (bxb == null)
      {
        locala = new com/google/firebase/messaging/a;
        locala.<init>(FirebaseInstanceId.uD());
        bxb = locala;
      }
      a locala = bxb;
      AppMethodBeat.o(77207);
      return locala;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.messaging.a
 * JD-Core Version:    0.6.2
 */