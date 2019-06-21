package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum HttpMethod
{
  static
  {
    AppMethodBeat.i(71773);
    GET = new HttpMethod("GET", 0);
    POST = new HttpMethod("POST", 1);
    DELETE = new HttpMethod("DELETE", 2);
    $VALUES = new HttpMethod[] { GET, POST, DELETE };
    AppMethodBeat.o(71773);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.HttpMethod
 * JD-Core Version:    0.6.2
 */