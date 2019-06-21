package com.google.firebase.messaging;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public final class b extends Exception
{
  private final int errorCode;

  b(String paramString)
  {
    super(paramString);
    AppMethodBeat.i(77217);
    int j;
    if (paramString != null)
    {
      paramString = paramString.toLowerCase(Locale.US);
      j = -1;
    }
    switch (paramString.hashCode())
    {
    default:
      switch (j)
      {
      default:
        i = 0;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      break;
    case -920906446:
    case -95047692:
    case -617027085:
    case -1743242157:
    case -1290953729:
    }
    while (true)
    {
      this.errorCode = i;
      AppMethodBeat.o(77217);
      return;
      if (!paramString.equals("invalid_parameters"))
        break;
      j = 0;
      break;
      if (!paramString.equals("missing_to"))
        break;
      j = 1;
      break;
      if (!paramString.equals("messagetoobig"))
        break;
      j = 2;
      break;
      if (!paramString.equals("service_not_available"))
        break;
      j = 3;
      break;
      if (!paramString.equals("toomanymessages"))
        break;
      j = 4;
      break;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 4;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.messaging.b
 * JD-Core Version:    0.6.2
 */