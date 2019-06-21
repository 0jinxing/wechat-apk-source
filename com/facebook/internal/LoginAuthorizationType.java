package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum LoginAuthorizationType
{
  static
  {
    AppMethodBeat.i(96653);
    READ = new LoginAuthorizationType("READ", 0);
    PUBLISH = new LoginAuthorizationType("PUBLISH", 1);
    $VALUES = new LoginAuthorizationType[] { READ, PUBLISH };
    AppMethodBeat.o(96653);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.LoginAuthorizationType
 * JD-Core Version:    0.6.2
 */